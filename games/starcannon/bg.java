/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_e;
    static o field_f;
    static String field_b;
    static int field_a;
    static String field_d;
    static hl field_c;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != hj.field_c) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (65535 != var2) {
              if (ua.a((char) var2, 0)) {
                var3 = 127 & pd.field_b - -1;
                if (wg.field_b == var3) {
                  param0.consume();
                  return;
                } else {
                  pe.field_e[pd.field_b] = -1;
                  ik.field_s[pd.field_b] = (char)var2;
                  pd.field_b = var3;
                  param0.consume();
                  return;
                }
              } else {
                param0.consume();
                return;
              }
            } else {
              param0.consume();
              return;
            }
          } else {
            param0.consume();
            return;
          }
        } else {
          param0.consume();
          return;
        }
    }

    public static void a(int param0) {
        int var1 = 123 % ((-4 - param0) / 33);
        field_f = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != hj.field_c) {
          L0: {
            ie.field_D = 0;
            var2 = param0.getKeyCode();
            if (0 > var2) {
              var2 = -1;
              break L0;
            } else {
              if (cg.field_j.length > var2) {
                var2 = cg.field_j[var2] & -129;
                break L0;
              } else {
                var2 = -1;
                if (-1 < (ah.field_c ^ -1)) {
                  param0.consume();
                  return;
                } else {
                  if ((var2 ^ -1) <= -1) {
                    ab.field_A[ah.field_c] = var2 ^ -1;
                    ah.field_c = 127 & ah.field_c - -1;
                    if (ec.field_a == ah.field_c) {
                      ah.field_c = -1;
                      param0.consume();
                      return;
                    } else {
                      param0.consume();
                      return;
                    }
                  } else {
                    param0.consume();
                    return;
                  }
                }
              }
            }
          }
          if (-1 >= (ah.field_c ^ -1)) {
            if ((var2 ^ -1) <= -1) {
              ab.field_A[ah.field_c] = var2 ^ -1;
              ah.field_c = 127 & ah.field_c - -1;
              if (ec.field_a == ah.field_c) {
                ah.field_c = -1;
                param0.consume();
                return;
              } else {
                param0.consume();
                return;
              }
            } else {
              param0.consume();
              return;
            }
          } else {
            param0.consume();
            return;
          }
        } else {
          param0.consume();
          return;
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (hj.field_c != null) {
          ie.field_D = 0;
          var2 = param0.getKeyCode();
          if ((var2 ^ -1) <= -1) {
            L0: {
              if (var2 >= cg.field_j.length) {
                var2 = -1;
                break L0;
              } else {
                var2 = cg.field_j[var2];
                if (0 != (var2 & 128)) {
                  L1: {
                    var2 = -1;
                    if (ah.field_c < 0) {
                      break L1;
                    } else {
                      if (var2 < 0) {
                        break L1;
                      } else {
                        ab.field_A[ah.field_c] = var2;
                        ah.field_c = 1 + ah.field_c & 127;
                        if (ah.field_c != ec.field_a) {
                          break L1;
                        } else {
                          ah.field_c = -1;
                          break L1;
                        }
                      }
                    }
                  }
                  L2: {
                    if ((var2 ^ -1) > -1) {
                      break L2;
                    } else {
                      var3 = 127 & pd.field_b + 1;
                      if (wg.field_b == var3) {
                        break L2;
                      } else {
                        pe.field_e[pd.field_b] = var2;
                        ik.field_s[pd.field_b] = (char)0;
                        pd.field_b = var3;
                        break L2;
                      }
                    }
                  }
                  var3 = param0.getModifiers();
                  if (-1 == (var3 & 10 ^ -1)) {
                    if (85 != var2) {
                      if ((var2 ^ -1) != -11) {
                        return;
                      } else {
                        param0.consume();
                        return;
                      }
                    } else {
                      param0.consume();
                      return;
                    }
                  } else {
                    param0.consume();
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
            if (ah.field_c >= 0) {
              L3: {
                if (var2 < 0) {
                  break L3;
                } else {
                  ab.field_A[ah.field_c] = var2;
                  ah.field_c = 1 + ah.field_c & 127;
                  if (ah.field_c != ec.field_a) {
                    break L3;
                  } else {
                    L4: {
                      ah.field_c = -1;
                      if ((var2 ^ -1) > -1) {
                        break L4;
                      } else {
                        var3 = 127 & pd.field_b + 1;
                        if (wg.field_b == var3) {
                          break L4;
                        } else {
                          pe.field_e[pd.field_b] = var2;
                          ik.field_s[pd.field_b] = (char)0;
                          pd.field_b = var3;
                          break L4;
                        }
                      }
                    }
                    var3 = param0.getModifiers();
                    if (-1 == (var3 & 10 ^ -1)) {
                      if (85 != var2) {
                        if ((var2 ^ -1) == -11) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      } else {
                        param0.consume();
                        return;
                      }
                    } else {
                      param0.consume();
                      return;
                    }
                  }
                }
              }
              L5: {
                if ((var2 ^ -1) > -1) {
                  break L5;
                } else {
                  var3 = 127 & pd.field_b + 1;
                  if (wg.field_b == var3) {
                    break L5;
                  } else {
                    pe.field_e[pd.field_b] = var2;
                    ik.field_s[pd.field_b] = (char)0;
                    pd.field_b = var3;
                    var3 = param0.getModifiers();
                    if (-1 != (var3 & 10 ^ -1)) {
                      param0.consume();
                      return;
                    } else {
                      if (85 != var2) {
                        if ((var2 ^ -1) == -11) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      } else {
                        param0.consume();
                        return;
                      }
                    }
                  }
                }
              }
              var3 = param0.getModifiers();
              if (-1 != (var3 & 10 ^ -1)) {
                param0.consume();
                return;
              } else {
                if (85 == var2) {
                  param0.consume();
                  return;
                } else {
                  if ((var2 ^ -1) != -11) {
                    return;
                  } else {
                    param0.consume();
                    return;
                  }
                }
              }
            } else {
              L6: {
                if ((var2 ^ -1) > -1) {
                  break L6;
                } else {
                  var3 = 127 & pd.field_b + 1;
                  if (wg.field_b == var3) {
                    break L6;
                  } else {
                    pe.field_e[pd.field_b] = var2;
                    ik.field_s[pd.field_b] = (char)0;
                    pd.field_b = var3;
                    var3 = param0.getModifiers();
                    if (-1 == (var3 & 10 ^ -1)) {
                      if (85 != var2) {
                        if ((var2 ^ -1) == -11) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      } else {
                        param0.consume();
                        return;
                      }
                    } else {
                      param0.consume();
                      return;
                    }
                  }
                }
              }
              var3 = param0.getModifiers();
              if (-1 == (var3 & 10 ^ -1)) {
                if (85 != var2) {
                  if ((var2 ^ -1) != -11) {
                    return;
                  } else {
                    param0.consume();
                    return;
                  }
                } else {
                  param0.consume();
                  return;
                }
              } else {
                param0.consume();
                return;
              }
            }
          } else {
            L7: {
              var2 = -1;
              if (ah.field_c < 0) {
                break L7;
              } else {
                if (var2 < 0) {
                  break L7;
                } else {
                  ab.field_A[ah.field_c] = var2;
                  ah.field_c = 1 + ah.field_c & 127;
                  if (ah.field_c != ec.field_a) {
                    break L7;
                  } else {
                    L8: {
                      ah.field_c = -1;
                      if ((var2 ^ -1) > -1) {
                        break L8;
                      } else {
                        var3 = 127 & pd.field_b + 1;
                        if (wg.field_b == var3) {
                          break L8;
                        } else {
                          pe.field_e[pd.field_b] = var2;
                          ik.field_s[pd.field_b] = (char)0;
                          pd.field_b = var3;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      var3 = param0.getModifiers();
                      if (-1 != (var3 & 10 ^ -1)) {
                        param0.consume();
                        break L9;
                      } else {
                        if (85 == var2) {
                          param0.consume();
                          break L9;
                        } else {
                          if ((var2 ^ -1) != -11) {
                            break L9;
                          } else {
                            param0.consume();
                            break L9;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            L10: {
              if ((var2 ^ -1) > -1) {
                break L10;
              } else {
                var3 = 127 & pd.field_b + 1;
                if (wg.field_b == var3) {
                  break L10;
                } else {
                  L11: {
                    pe.field_e[pd.field_b] = var2;
                    ik.field_s[pd.field_b] = (char)0;
                    pd.field_b = var3;
                    var3 = param0.getModifiers();
                    if (-1 != (var3 & 10 ^ -1)) {
                      param0.consume();
                      break L11;
                    } else {
                      if (85 == var2) {
                        param0.consume();
                        break L11;
                      } else {
                        if ((var2 ^ -1) != -11) {
                          break L11;
                        } else {
                          param0.consume();
                          break L11;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
            var3 = param0.getModifiers();
            if (-1 == (var3 & 10 ^ -1)) {
              if (85 != var2) {
                if ((var2 ^ -1) == -11) {
                  param0.consume();
                  return;
                } else {
                  return;
                }
              } else {
                param0.consume();
                return;
              }
            } else {
              param0.consume();
              return;
            }
          }
        } else {
          return;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != hj.field_c) {
            ah.field_c = -1;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        gi var9 = null;
        int var10 = 0;
        int stackIn_14_0 = 0;
        String stackIn_19_0 = null;
        int stackIn_23_0 = 0;
        String stackIn_29_0 = null;
        String stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        String stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        String stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        gi stackIn_39_0 = null;
        int stackIn_59_0 = 0;
        String stackIn_64_0 = null;
        int stackIn_68_0 = 0;
        String stackIn_74_0 = null;
        String stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        String stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        String stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        gi stackIn_84_0 = null;
        int stackIn_101_0 = 0;
        String stackIn_106_0 = null;
        int stackIn_110_0 = 0;
        String stackIn_116_0 = null;
        String stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        String stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        String stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        int stackIn_122_2 = 0;
        gi stackIn_126_0 = null;
        int stackIn_146_0 = 0;
        String stackIn_151_0 = null;
        int stackIn_155_0 = 0;
        String stackIn_161_0 = null;
        String stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        String stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        String stackIn_167_0 = null;
        int stackIn_167_1 = 0;
        int stackIn_167_2 = 0;
        gi stackIn_171_0 = null;
        String stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        String stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        String stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        int stackIn_188_2 = 0;
        gi stackIn_192_0 = null;
        int stackIn_213_0 = 0;
        String stackIn_218_0 = null;
        int stackIn_222_0 = 0;
        String stackIn_228_0 = null;
        String stackIn_232_0 = null;
        int stackIn_232_1 = 0;
        String stackIn_233_0 = null;
        int stackIn_233_1 = 0;
        String stackIn_234_0 = null;
        int stackIn_234_1 = 0;
        int stackIn_234_2 = 0;
        gi stackIn_238_0 = null;
        int stackIn_250_0 = 0;
        String stackIn_255_0 = null;
        int stackIn_259_0 = 0;
        String stackIn_264_0 = null;
        int stackIn_264_1 = 0;
        String stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        String stackIn_266_0 = null;
        int stackIn_266_1 = 0;
        int stackIn_266_2 = 0;
        gi stackIn_270_0 = null;
        int stackIn_291_0 = 0;
        String stackIn_296_0 = null;
        int stackIn_300_0 = 0;
        String stackIn_306_0 = null;
        String stackIn_310_0 = null;
        int stackIn_310_1 = 0;
        String stackIn_311_0 = null;
        int stackIn_311_1 = 0;
        String stackIn_312_0 = null;
        int stackIn_312_1 = 0;
        int stackIn_312_2 = 0;
        gi stackIn_316_0 = null;
        String stackIn_328_0 = null;
        String stackIn_332_0 = null;
        int stackIn_332_1 = 0;
        String stackIn_333_0 = null;
        int stackIn_333_1 = 0;
        String stackIn_334_0 = null;
        int stackIn_334_1 = 0;
        int stackIn_334_2 = 0;
        gi stackIn_338_0 = null;
        int stackIn_361_0 = 0;
        String stackIn_366_0 = null;
        int stackIn_370_0 = 0;
        String stackIn_376_0 = null;
        String stackIn_380_0 = null;
        int stackIn_380_1 = 0;
        String stackIn_381_0 = null;
        int stackIn_381_1 = 0;
        String stackIn_382_0 = null;
        int stackIn_382_1 = 0;
        int stackIn_382_2 = 0;
        gi stackIn_386_0 = null;
        int stackOut_249_0 = 0;
        int stackOut_248_0 = 0;
        String stackOut_254_0 = null;
        String stackOut_253_0 = null;
        int stackOut_258_0 = 0;
        int stackOut_257_0 = 0;
        String stackOut_327_0 = null;
        String stackOut_326_0 = null;
        String stackOut_263_0 = null;
        int stackOut_263_1 = 0;
        String stackOut_265_0 = null;
        int stackOut_265_1 = 0;
        int stackOut_265_2 = 0;
        String stackOut_264_0 = null;
        int stackOut_264_1 = 0;
        int stackOut_264_2 = 0;
        gi stackOut_269_0 = null;
        gi stackOut_268_0 = null;
        int stackOut_290_0 = 0;
        int stackOut_289_0 = 0;
        String stackOut_295_0 = null;
        String stackOut_294_0 = null;
        int stackOut_299_0 = 0;
        int stackOut_298_0 = 0;
        String stackOut_305_0 = null;
        String stackOut_304_0 = null;
        String stackOut_309_0 = null;
        int stackOut_309_1 = 0;
        String stackOut_311_0 = null;
        int stackOut_311_1 = 0;
        int stackOut_311_2 = 0;
        String stackOut_310_0 = null;
        int stackOut_310_1 = 0;
        int stackOut_310_2 = 0;
        gi stackOut_315_0 = null;
        gi stackOut_314_0 = null;
        String stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        String stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        int stackOut_187_2 = 0;
        String stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        int stackOut_186_2 = 0;
        gi stackOut_191_0 = null;
        gi stackOut_190_0 = null;
        int stackOut_212_0 = 0;
        int stackOut_211_0 = 0;
        String stackOut_217_0 = null;
        String stackOut_216_0 = null;
        int stackOut_221_0 = 0;
        int stackOut_220_0 = 0;
        String stackOut_227_0 = null;
        String stackOut_226_0 = null;
        String stackOut_231_0 = null;
        int stackOut_231_1 = 0;
        String stackOut_233_0 = null;
        int stackOut_233_1 = 0;
        int stackOut_233_2 = 0;
        String stackOut_232_0 = null;
        int stackOut_232_1 = 0;
        int stackOut_232_2 = 0;
        gi stackOut_237_0 = null;
        gi stackOut_236_0 = null;
        String stackOut_331_0 = null;
        int stackOut_331_1 = 0;
        String stackOut_333_0 = null;
        int stackOut_333_1 = 0;
        int stackOut_333_2 = 0;
        String stackOut_332_0 = null;
        int stackOut_332_1 = 0;
        int stackOut_332_2 = 0;
        gi stackOut_337_0 = null;
        gi stackOut_336_0 = null;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        String stackOut_105_0 = null;
        String stackOut_104_0 = null;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        String stackOut_115_0 = null;
        String stackOut_114_0 = null;
        String stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        String stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        String stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        int stackOut_120_2 = 0;
        gi stackOut_125_0 = null;
        gi stackOut_124_0 = null;
        int stackOut_145_0 = 0;
        int stackOut_144_0 = 0;
        String stackOut_150_0 = null;
        String stackOut_149_0 = null;
        int stackOut_154_0 = 0;
        int stackOut_153_0 = 0;
        String stackOut_160_0 = null;
        String stackOut_159_0 = null;
        String stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        String stackOut_166_0 = null;
        int stackOut_166_1 = 0;
        int stackOut_166_2 = 0;
        String stackOut_165_0 = null;
        int stackOut_165_1 = 0;
        int stackOut_165_2 = 0;
        gi stackOut_170_0 = null;
        gi stackOut_169_0 = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        String stackOut_18_0 = null;
        String stackOut_17_0 = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        String stackOut_28_0 = null;
        String stackOut_27_0 = null;
        String stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        String stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        String stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        gi stackOut_38_0 = null;
        gi stackOut_37_0 = null;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        String stackOut_63_0 = null;
        String stackOut_62_0 = null;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        String stackOut_73_0 = null;
        String stackOut_72_0 = null;
        String stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        String stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        String stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        gi stackOut_83_0 = null;
        gi stackOut_82_0 = null;
        int stackOut_360_0 = 0;
        int stackOut_359_0 = 0;
        String stackOut_365_0 = null;
        String stackOut_364_0 = null;
        int stackOut_369_0 = 0;
        int stackOut_368_0 = 0;
        String stackOut_375_0 = null;
        String stackOut_374_0 = null;
        String stackOut_379_0 = null;
        int stackOut_379_1 = 0;
        String stackOut_381_0 = null;
        int stackOut_381_1 = 0;
        int stackOut_381_2 = 0;
        String stackOut_380_0 = null;
        int stackOut_380_1 = 0;
        int stackOut_380_2 = 0;
        gi stackOut_385_0 = null;
        gi stackOut_384_0 = null;
        var10 = StarCannon.field_A;
        if (param0 == 1000) {
          L0: {
            var1 = nd.field_m;
            var2 = 0;
            if (bh.field_a != 2) {
              break L0;
            } else {
              L1: {
                var3_long = dd.b(57) + -af.field_x;
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if ((var2 ^ -1) > -1) {
                  break L1;
                } else {
                  var3 = 0;
                  if (uh.field_h.length > var3) {
                    var4 = eg.field_a[var3];
                    if ((var4 ^ -1) <= -1) {
                      if (ja.field_c.field_k == var4) {
                        L2: {
                          var5 = ig.field_b;
                          var6 = uh.field_h[var3];
                          if (bh.field_a != 2) {
                            break L2;
                          } else {
                            if (1 == var2) {
                              L3: {
                                if (se.field_n.length >= ri.field_b.length) {
                                  stackOut_249_0 = se.field_n.length;
                                  stackIn_250_0 = stackOut_249_0;
                                  break L3;
                                } else {
                                  stackOut_248_0 = ri.field_b.length;
                                  stackIn_250_0 = stackOut_248_0;
                                  break L3;
                                }
                              }
                              L4: {
                                var7 = stackIn_250_0;
                                if (-7 < var3) {
                                  break L4;
                                } else {
                                  if (6 + var7 <= var3) {
                                    break L4;
                                  } else {
                                    L5: {
                                      if (-1 <= -var7 + se.field_n.length + (-6 + var3)) {
                                        stackOut_254_0 = se.field_n[-var7 + var3 + (-6 + se.field_n.length)];
                                        stackIn_255_0 = stackOut_254_0;
                                        break L5;
                                      } else {
                                        stackOut_253_0 = "";
                                        stackIn_255_0 = stackOut_253_0;
                                        break L5;
                                      }
                                    }
                                    var6_ref = stackIn_255_0;
                                    break L4;
                                  }
                                }
                              }
                              L6: {
                                if (fb.field_c.length >= rd.field_q.length) {
                                  stackOut_258_0 = fb.field_c.length;
                                  stackIn_259_0 = stackOut_258_0;
                                  break L6;
                                } else {
                                  stackOut_257_0 = rd.field_q.length;
                                  stackIn_259_0 = stackOut_257_0;
                                  break L6;
                                }
                              }
                              var8 = stackIn_259_0;
                              if (var3 < 7 - -var7) {
                                break L2;
                              } else {
                                if (var3 < 7 + (var7 + var8)) {
                                  L7: {
                                    if (-var7 + (-7 + var3) >= fb.field_c.length) {
                                      stackOut_327_0 = "";
                                      stackIn_328_0 = stackOut_327_0;
                                      break L7;
                                    } else {
                                      stackOut_326_0 = fb.field_c[-7 + (var3 - var7)];
                                      stackIn_328_0 = stackOut_326_0;
                                      break L7;
                                    }
                                  }
                                  var6_ref = stackIn_328_0;
                                  break L2;
                                } else {
                                  L8: {
                                    if ((var4 ^ -1) != 1) {
                                      break L8;
                                    } else {
                                      var6_ref = Integer.toString(var2);
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    stackOut_263_0 = (String) var6_ref;
                                    stackOut_263_1 = 26;
                                    stackIn_265_0 = stackOut_263_0;
                                    stackIn_265_1 = stackOut_263_1;
                                    stackIn_264_0 = stackOut_263_0;
                                    stackIn_264_1 = stackOut_263_1;
                                    if ((var4 ^ -1) > -1) {
                                      stackOut_265_0 = (String) (Object) stackIn_265_0;
                                      stackOut_265_1 = stackIn_265_1;
                                      stackOut_265_2 = 0;
                                      stackIn_266_0 = stackOut_265_0;
                                      stackIn_266_1 = stackOut_265_1;
                                      stackIn_266_2 = stackOut_265_2;
                                      break L9;
                                    } else {
                                      stackOut_264_0 = (String) (Object) stackIn_264_0;
                                      stackOut_264_1 = stackIn_264_1;
                                      stackOut_264_2 = 1;
                                      stackIn_266_0 = stackOut_264_0;
                                      stackIn_266_1 = stackOut_264_1;
                                      stackIn_266_2 = stackOut_264_2;
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    var7 = fb.a(stackIn_266_0, (byte) stackIn_266_1, stackIn_266_2 != 0);
                                    var8 = -(var7 >> 2002371233) + ee.field_b;
                                    if ((var4 ^ -1) > -1) {
                                      break L10;
                                    } else {
                                      L11: {
                                        if (var4 == ja.field_c.field_k) {
                                          stackOut_269_0 = ie.field_y;
                                          stackIn_270_0 = stackOut_269_0;
                                          break L11;
                                        } else {
                                          stackOut_268_0 = wj.field_d;
                                          stackIn_270_0 = stackOut_268_0;
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        var9 = stackIn_270_0;
                                        var1 = var1 + mc.field_h;
                                        if (var9 != null) {
                                          var9.a(-rh.field_i + var8, (rh.field_i << 1681688929) + var7, param0 ^ -947, var1, pk.field_c - -(kc.field_S << 1009772353));
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                      var1 = var1 + kc.field_S;
                                      break L10;
                                    }
                                  }
                                  L13: {
                                    if (-1 >= (var4 ^ -1)) {
                                      ai.field_h.a(var6_ref, var8, var1 - -rg.field_D, var5, -1);
                                      var1 = var1 + (pk.field_c + (kc.field_S - -mc.field_h));
                                      break L13;
                                    } else {
                                      rh.field_h.a(var6_ref, var8, kf.field_v + var1, var5, -1);
                                      var1 = var1 + sg.field_e;
                                      var3++;
                                      break L13;
                                    }
                                  }
                                  var3++;
                                  var3++;
                                  var3++;
                                  var2 = 0;
                                  var3 = 0;
                                  L14: while (true) {
                                    if (uh.field_h.length <= var3) {
                                      return;
                                    } else {
                                      L15: {
                                        var4 = eg.field_a[var3];
                                        if ((var4 ^ -1) <= -1) {
                                          if (ja.field_c.field_k == var4) {
                                            var5 = ig.field_b;
                                            break L15;
                                          } else {
                                            var5 = sd.field_a;
                                            break L15;
                                          }
                                        } else {
                                          var5 = sb.field_m;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        var6 = uh.field_h[var3];
                                        if (bh.field_a != 2) {
                                          break L16;
                                        } else {
                                          if (1 == var2) {
                                            L17: {
                                              if (se.field_n.length >= ri.field_b.length) {
                                                stackOut_290_0 = se.field_n.length;
                                                stackIn_291_0 = stackOut_290_0;
                                                break L17;
                                              } else {
                                                stackOut_289_0 = ri.field_b.length;
                                                stackIn_291_0 = stackOut_289_0;
                                                break L17;
                                              }
                                            }
                                            L18: {
                                              var7 = stackIn_291_0;
                                              if (-7 < var3) {
                                                break L18;
                                              } else {
                                                if (6 + var7 <= var3) {
                                                  break L18;
                                                } else {
                                                  L19: {
                                                    if (-1 <= -var7 + se.field_n.length + (-6 + var3)) {
                                                      stackOut_295_0 = se.field_n[-var7 + var3 + (-6 + se.field_n.length)];
                                                      stackIn_296_0 = stackOut_295_0;
                                                      break L19;
                                                    } else {
                                                      stackOut_294_0 = "";
                                                      stackIn_296_0 = stackOut_294_0;
                                                      break L19;
                                                    }
                                                  }
                                                  var6_ref = stackIn_296_0;
                                                  break L18;
                                                }
                                              }
                                            }
                                            L20: {
                                              if (fb.field_c.length >= rd.field_q.length) {
                                                stackOut_299_0 = fb.field_c.length;
                                                stackIn_300_0 = stackOut_299_0;
                                                break L20;
                                              } else {
                                                stackOut_298_0 = rd.field_q.length;
                                                stackIn_300_0 = stackOut_298_0;
                                                break L20;
                                              }
                                            }
                                            var8 = stackIn_300_0;
                                            if (var3 < 7 - -var7) {
                                              break L16;
                                            } else {
                                              if (var3 < 7 + (var7 + var8)) {
                                                L21: {
                                                  if (-var7 + (-7 + var3) >= fb.field_c.length) {
                                                    stackOut_305_0 = "";
                                                    stackIn_306_0 = stackOut_305_0;
                                                    break L21;
                                                  } else {
                                                    stackOut_304_0 = fb.field_c[-7 + (var3 - var7)];
                                                    stackIn_306_0 = stackOut_304_0;
                                                    break L21;
                                                  }
                                                }
                                                var6_ref = stackIn_306_0;
                                                break L16;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      L22: {
                                        if ((var4 ^ -1) != 1) {
                                          break L22;
                                        } else {
                                          var6_ref = Integer.toString(var2);
                                          break L22;
                                        }
                                      }
                                      L23: {
                                        stackOut_309_0 = (String) var6_ref;
                                        stackOut_309_1 = 26;
                                        stackIn_311_0 = stackOut_309_0;
                                        stackIn_311_1 = stackOut_309_1;
                                        stackIn_310_0 = stackOut_309_0;
                                        stackIn_310_1 = stackOut_309_1;
                                        if ((var4 ^ -1) > -1) {
                                          stackOut_311_0 = (String) (Object) stackIn_311_0;
                                          stackOut_311_1 = stackIn_311_1;
                                          stackOut_311_2 = 0;
                                          stackIn_312_0 = stackOut_311_0;
                                          stackIn_312_1 = stackOut_311_1;
                                          stackIn_312_2 = stackOut_311_2;
                                          break L23;
                                        } else {
                                          stackOut_310_0 = (String) (Object) stackIn_310_0;
                                          stackOut_310_1 = stackIn_310_1;
                                          stackOut_310_2 = 1;
                                          stackIn_312_0 = stackOut_310_0;
                                          stackIn_312_1 = stackOut_310_1;
                                          stackIn_312_2 = stackOut_310_2;
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        var7 = fb.a(stackIn_312_0, (byte) stackIn_312_1, stackIn_312_2 != 0);
                                        var8 = -(var7 >> 2002371233) + ee.field_b;
                                        if ((var4 ^ -1) > -1) {
                                          break L24;
                                        } else {
                                          L25: {
                                            if (var4 == ja.field_c.field_k) {
                                              stackOut_315_0 = ie.field_y;
                                              stackIn_316_0 = stackOut_315_0;
                                              break L25;
                                            } else {
                                              stackOut_314_0 = wj.field_d;
                                              stackIn_316_0 = stackOut_314_0;
                                              break L25;
                                            }
                                          }
                                          L26: {
                                            var9 = stackIn_316_0;
                                            var1 = var1 + mc.field_h;
                                            if (var9 != null) {
                                              var9.a(-rh.field_i + var8, (rh.field_i << 1681688929) + var7, param0 ^ -947, var1, pk.field_c - -(kc.field_S << 1009772353));
                                              break L26;
                                            } else {
                                              break L26;
                                            }
                                          }
                                          var1 = var1 + kc.field_S;
                                          break L24;
                                        }
                                      }
                                      if (-1 >= (var4 ^ -1)) {
                                        ai.field_h.a(var6_ref, var8, var1 - -rg.field_D, var5, -1);
                                        var1 = var1 + (pk.field_c + (kc.field_S - -mc.field_h));
                                        var3++;
                                        continue L14;
                                      } else {
                                        rh.field_h.a(var6_ref, var8, kf.field_v + var1, var5, -1);
                                        var1 = var1 + sg.field_e;
                                        var3++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              L27: {
                                if ((var4 ^ -1) != 1) {
                                  break L27;
                                } else {
                                  var6_ref = Integer.toString(var2);
                                  break L27;
                                }
                              }
                              L28: {
                                stackOut_185_0 = (String) var6_ref;
                                stackOut_185_1 = 26;
                                stackIn_187_0 = stackOut_185_0;
                                stackIn_187_1 = stackOut_185_1;
                                stackIn_186_0 = stackOut_185_0;
                                stackIn_186_1 = stackOut_185_1;
                                if ((var4 ^ -1) > -1) {
                                  stackOut_187_0 = (String) (Object) stackIn_187_0;
                                  stackOut_187_1 = stackIn_187_1;
                                  stackOut_187_2 = 0;
                                  stackIn_188_0 = stackOut_187_0;
                                  stackIn_188_1 = stackOut_187_1;
                                  stackIn_188_2 = stackOut_187_2;
                                  break L28;
                                } else {
                                  stackOut_186_0 = (String) (Object) stackIn_186_0;
                                  stackOut_186_1 = stackIn_186_1;
                                  stackOut_186_2 = 1;
                                  stackIn_188_0 = stackOut_186_0;
                                  stackIn_188_1 = stackOut_186_1;
                                  stackIn_188_2 = stackOut_186_2;
                                  break L28;
                                }
                              }
                              L29: {
                                var7 = fb.a(stackIn_188_0, (byte) stackIn_188_1, stackIn_188_2 != 0);
                                var8 = -(var7 >> 2002371233) + ee.field_b;
                                if ((var4 ^ -1) > -1) {
                                  break L29;
                                } else {
                                  L30: {
                                    if (var4 == ja.field_c.field_k) {
                                      stackOut_191_0 = ie.field_y;
                                      stackIn_192_0 = stackOut_191_0;
                                      break L30;
                                    } else {
                                      stackOut_190_0 = wj.field_d;
                                      stackIn_192_0 = stackOut_190_0;
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    var9 = stackIn_192_0;
                                    var1 = var1 + mc.field_h;
                                    if (var9 != null) {
                                      var9.a(-rh.field_i + var8, (rh.field_i << 1681688929) + var7, param0 ^ -947, var1, pk.field_c - -(kc.field_S << 1009772353));
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  var1 = var1 + kc.field_S;
                                  break L29;
                                }
                              }
                              L32: {
                                if (-1 >= (var4 ^ -1)) {
                                  ai.field_h.a(var6_ref, var8, var1 - -rg.field_D, var5, -1);
                                  var1 = var1 + (pk.field_c + (kc.field_S - -mc.field_h));
                                  break L32;
                                } else {
                                  rh.field_h.a(var6_ref, var8, kf.field_v + var1, var5, -1);
                                  var1 = var1 + sg.field_e;
                                  var3++;
                                  break L32;
                                }
                              }
                              var3++;
                              var3++;
                              var3++;
                              var2 = 0;
                              var3 = 0;
                              L33: while (true) {
                                if (uh.field_h.length <= var3) {
                                  return;
                                } else {
                                  L34: {
                                    var4 = eg.field_a[var3];
                                    if ((var4 ^ -1) <= -1) {
                                      if (ja.field_c.field_k == var4) {
                                        var5 = ig.field_b;
                                        break L34;
                                      } else {
                                        var5 = sd.field_a;
                                        break L34;
                                      }
                                    } else {
                                      var5 = sb.field_m;
                                      break L34;
                                    }
                                  }
                                  L35: {
                                    var6 = uh.field_h[var3];
                                    if (bh.field_a != 2) {
                                      break L35;
                                    } else {
                                      if (1 == var2) {
                                        L36: {
                                          if (se.field_n.length >= ri.field_b.length) {
                                            stackOut_212_0 = se.field_n.length;
                                            stackIn_213_0 = stackOut_212_0;
                                            break L36;
                                          } else {
                                            stackOut_211_0 = ri.field_b.length;
                                            stackIn_213_0 = stackOut_211_0;
                                            break L36;
                                          }
                                        }
                                        L37: {
                                          var7 = stackIn_213_0;
                                          if (-7 < var3) {
                                            break L37;
                                          } else {
                                            if (6 + var7 <= var3) {
                                              break L37;
                                            } else {
                                              L38: {
                                                if (-1 <= -var7 + se.field_n.length + (-6 + var3)) {
                                                  stackOut_217_0 = se.field_n[-var7 + var3 + (-6 + se.field_n.length)];
                                                  stackIn_218_0 = stackOut_217_0;
                                                  break L38;
                                                } else {
                                                  stackOut_216_0 = "";
                                                  stackIn_218_0 = stackOut_216_0;
                                                  break L38;
                                                }
                                              }
                                              var6_ref = stackIn_218_0;
                                              break L37;
                                            }
                                          }
                                        }
                                        L39: {
                                          if (fb.field_c.length >= rd.field_q.length) {
                                            stackOut_221_0 = fb.field_c.length;
                                            stackIn_222_0 = stackOut_221_0;
                                            break L39;
                                          } else {
                                            stackOut_220_0 = rd.field_q.length;
                                            stackIn_222_0 = stackOut_220_0;
                                            break L39;
                                          }
                                        }
                                        var8 = stackIn_222_0;
                                        if (var3 < 7 - -var7) {
                                          break L35;
                                        } else {
                                          if (var3 < 7 + (var7 + var8)) {
                                            L40: {
                                              if (-var7 + (-7 + var3) >= fb.field_c.length) {
                                                stackOut_227_0 = "";
                                                stackIn_228_0 = stackOut_227_0;
                                                break L40;
                                              } else {
                                                stackOut_226_0 = fb.field_c[-7 + (var3 - var7)];
                                                stackIn_228_0 = stackOut_226_0;
                                                break L40;
                                              }
                                            }
                                            var6_ref = stackIn_228_0;
                                            break L35;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                  L41: {
                                    if ((var4 ^ -1) != 1) {
                                      break L41;
                                    } else {
                                      var6_ref = Integer.toString(var2);
                                      break L41;
                                    }
                                  }
                                  L42: {
                                    stackOut_231_0 = (String) var6_ref;
                                    stackOut_231_1 = 26;
                                    stackIn_233_0 = stackOut_231_0;
                                    stackIn_233_1 = stackOut_231_1;
                                    stackIn_232_0 = stackOut_231_0;
                                    stackIn_232_1 = stackOut_231_1;
                                    if ((var4 ^ -1) > -1) {
                                      stackOut_233_0 = (String) (Object) stackIn_233_0;
                                      stackOut_233_1 = stackIn_233_1;
                                      stackOut_233_2 = 0;
                                      stackIn_234_0 = stackOut_233_0;
                                      stackIn_234_1 = stackOut_233_1;
                                      stackIn_234_2 = stackOut_233_2;
                                      break L42;
                                    } else {
                                      stackOut_232_0 = (String) (Object) stackIn_232_0;
                                      stackOut_232_1 = stackIn_232_1;
                                      stackOut_232_2 = 1;
                                      stackIn_234_0 = stackOut_232_0;
                                      stackIn_234_1 = stackOut_232_1;
                                      stackIn_234_2 = stackOut_232_2;
                                      break L42;
                                    }
                                  }
                                  L43: {
                                    var7 = fb.a(stackIn_234_0, (byte) stackIn_234_1, stackIn_234_2 != 0);
                                    var8 = -(var7 >> 2002371233) + ee.field_b;
                                    if ((var4 ^ -1) > -1) {
                                      break L43;
                                    } else {
                                      L44: {
                                        if (var4 == ja.field_c.field_k) {
                                          stackOut_237_0 = ie.field_y;
                                          stackIn_238_0 = stackOut_237_0;
                                          break L44;
                                        } else {
                                          stackOut_236_0 = wj.field_d;
                                          stackIn_238_0 = stackOut_236_0;
                                          break L44;
                                        }
                                      }
                                      L45: {
                                        var9 = stackIn_238_0;
                                        var1 = var1 + mc.field_h;
                                        if (var9 != null) {
                                          var9.a(-rh.field_i + var8, (rh.field_i << 1681688929) + var7, param0 ^ -947, var1, pk.field_c - -(kc.field_S << 1009772353));
                                          break L45;
                                        } else {
                                          break L45;
                                        }
                                      }
                                      var1 = var1 + kc.field_S;
                                      break L43;
                                    }
                                  }
                                  if (-1 >= (var4 ^ -1)) {
                                    ai.field_h.a(var6_ref, var8, var1 - -rg.field_D, var5, -1);
                                    var1 = var1 + (pk.field_c + (kc.field_S - -mc.field_h));
                                    var3++;
                                    continue L33;
                                  } else {
                                    rh.field_h.a(var6_ref, var8, kf.field_v + var1, var5, -1);
                                    var1 = var1 + sg.field_e;
                                    var3++;
                                    continue L33;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L46: {
                          if ((var4 ^ -1) != 1) {
                            break L46;
                          } else {
                            var6_ref = Integer.toString(var2);
                            break L46;
                          }
                        }
                        L47: {
                          stackOut_331_0 = (String) var6_ref;
                          stackOut_331_1 = 26;
                          stackIn_333_0 = stackOut_331_0;
                          stackIn_333_1 = stackOut_331_1;
                          stackIn_332_0 = stackOut_331_0;
                          stackIn_332_1 = stackOut_331_1;
                          if ((var4 ^ -1) > -1) {
                            stackOut_333_0 = (String) (Object) stackIn_333_0;
                            stackOut_333_1 = stackIn_333_1;
                            stackOut_333_2 = 0;
                            stackIn_334_0 = stackOut_333_0;
                            stackIn_334_1 = stackOut_333_1;
                            stackIn_334_2 = stackOut_333_2;
                            break L47;
                          } else {
                            stackOut_332_0 = (String) (Object) stackIn_332_0;
                            stackOut_332_1 = stackIn_332_1;
                            stackOut_332_2 = 1;
                            stackIn_334_0 = stackOut_332_0;
                            stackIn_334_1 = stackOut_332_1;
                            stackIn_334_2 = stackOut_332_2;
                            break L47;
                          }
                        }
                        L48: {
                          var7 = fb.a(stackIn_334_0, (byte) stackIn_334_1, stackIn_334_2 != 0);
                          var8 = -(var7 >> 2002371233) + ee.field_b;
                          if ((var4 ^ -1) > -1) {
                            break L48;
                          } else {
                            L49: {
                              if (var4 == ja.field_c.field_k) {
                                stackOut_337_0 = ie.field_y;
                                stackIn_338_0 = stackOut_337_0;
                                break L49;
                              } else {
                                stackOut_336_0 = wj.field_d;
                                stackIn_338_0 = stackOut_336_0;
                                break L49;
                              }
                            }
                            L50: {
                              var9 = stackIn_338_0;
                              var1 = var1 + mc.field_h;
                              if (var9 != null) {
                                var9.a(-rh.field_i + var8, (rh.field_i << 1681688929) + var7, param0 ^ -947, var1, pk.field_c - -(kc.field_S << 1009772353));
                                break L50;
                              } else {
                                break L50;
                              }
                            }
                            var1 = var1 + kc.field_S;
                            break L48;
                          }
                        }
                        L51: {
                          if (-1 >= (var4 ^ -1)) {
                            ai.field_h.a(var6_ref, var8, var1 - -rg.field_D, var5, -1);
                            var1 = var1 + (pk.field_c + (kc.field_S - -mc.field_h));
                            break L51;
                          } else {
                            rh.field_h.a(var6_ref, var8, kf.field_v + var1, var5, -1);
                            var1 = var1 + sg.field_e;
                            var3++;
                            break L51;
                          }
                        }
                        var3++;
                        var3++;
                        var3++;
                        break L1;
                      } else {
                        L52: {
                          var5 = sd.field_a;
                          var6 = uh.field_h[var3];
                          if (bh.field_a != 2) {
                            break L52;
                          } else {
                            if (1 == var2) {
                              L53: {
                                if (se.field_n.length >= ri.field_b.length) {
                                  stackOut_100_0 = se.field_n.length;
                                  stackIn_101_0 = stackOut_100_0;
                                  break L53;
                                } else {
                                  stackOut_99_0 = ri.field_b.length;
                                  stackIn_101_0 = stackOut_99_0;
                                  break L53;
                                }
                              }
                              L54: {
                                var7 = stackIn_101_0;
                                if (-7 < var3) {
                                  break L54;
                                } else {
                                  if (6 + var7 <= var3) {
                                    break L54;
                                  } else {
                                    L55: {
                                      if (-1 <= -var7 + se.field_n.length + (-6 + var3)) {
                                        stackOut_105_0 = se.field_n[-var7 + var3 + (-6 + se.field_n.length)];
                                        stackIn_106_0 = stackOut_105_0;
                                        break L55;
                                      } else {
                                        stackOut_104_0 = "";
                                        stackIn_106_0 = stackOut_104_0;
                                        break L55;
                                      }
                                    }
                                    var6_ref = stackIn_106_0;
                                    break L54;
                                  }
                                }
                              }
                              L56: {
                                if (fb.field_c.length >= rd.field_q.length) {
                                  stackOut_109_0 = fb.field_c.length;
                                  stackIn_110_0 = stackOut_109_0;
                                  break L56;
                                } else {
                                  stackOut_108_0 = rd.field_q.length;
                                  stackIn_110_0 = stackOut_108_0;
                                  break L56;
                                }
                              }
                              var8 = stackIn_110_0;
                              if (var3 < 7 - -var7) {
                                break L52;
                              } else {
                                if (var3 < 7 + (var7 + var8)) {
                                  L57: {
                                    if (-var7 + (-7 + var3) >= fb.field_c.length) {
                                      stackOut_115_0 = "";
                                      stackIn_116_0 = stackOut_115_0;
                                      break L57;
                                    } else {
                                      stackOut_114_0 = fb.field_c[-7 + (var3 - var7)];
                                      stackIn_116_0 = stackOut_114_0;
                                      break L57;
                                    }
                                  }
                                  var6_ref = stackIn_116_0;
                                  break L52;
                                } else {
                                  break L52;
                                }
                              }
                            } else {
                              break L52;
                            }
                          }
                        }
                        L58: {
                          if ((var4 ^ -1) != 1) {
                            break L58;
                          } else {
                            var6_ref = Integer.toString(var2);
                            break L58;
                          }
                        }
                        L59: {
                          stackOut_119_0 = (String) var6_ref;
                          stackOut_119_1 = 26;
                          stackIn_121_0 = stackOut_119_0;
                          stackIn_121_1 = stackOut_119_1;
                          stackIn_120_0 = stackOut_119_0;
                          stackIn_120_1 = stackOut_119_1;
                          if ((var4 ^ -1) > -1) {
                            stackOut_121_0 = (String) (Object) stackIn_121_0;
                            stackOut_121_1 = stackIn_121_1;
                            stackOut_121_2 = 0;
                            stackIn_122_0 = stackOut_121_0;
                            stackIn_122_1 = stackOut_121_1;
                            stackIn_122_2 = stackOut_121_2;
                            break L59;
                          } else {
                            stackOut_120_0 = (String) (Object) stackIn_120_0;
                            stackOut_120_1 = stackIn_120_1;
                            stackOut_120_2 = 1;
                            stackIn_122_0 = stackOut_120_0;
                            stackIn_122_1 = stackOut_120_1;
                            stackIn_122_2 = stackOut_120_2;
                            break L59;
                          }
                        }
                        L60: {
                          var7 = fb.a(stackIn_122_0, (byte) stackIn_122_1, stackIn_122_2 != 0);
                          var8 = -(var7 >> 2002371233) + ee.field_b;
                          if ((var4 ^ -1) > -1) {
                            break L60;
                          } else {
                            L61: {
                              if (var4 == ja.field_c.field_k) {
                                stackOut_125_0 = ie.field_y;
                                stackIn_126_0 = stackOut_125_0;
                                break L61;
                              } else {
                                stackOut_124_0 = wj.field_d;
                                stackIn_126_0 = stackOut_124_0;
                                break L61;
                              }
                            }
                            L62: {
                              var9 = stackIn_126_0;
                              var1 = var1 + mc.field_h;
                              if (var9 != null) {
                                var9.a(-rh.field_i + var8, (rh.field_i << 1681688929) + var7, param0 ^ -947, var1, pk.field_c - -(kc.field_S << 1009772353));
                                break L62;
                              } else {
                                break L62;
                              }
                            }
                            var1 = var1 + kc.field_S;
                            break L60;
                          }
                        }
                        L63: {
                          if (-1 >= (var4 ^ -1)) {
                            ai.field_h.a(var6_ref, var8, var1 - -rg.field_D, var5, -1);
                            var1 = var1 + (pk.field_c + (kc.field_S - -mc.field_h));
                            break L63;
                          } else {
                            rh.field_h.a(var6_ref, var8, kf.field_v + var1, var5, -1);
                            var1 = var1 + sg.field_e;
                            var3++;
                            break L63;
                          }
                        }
                        L64: {
                          var3++;
                          var3++;
                          var3++;
                          var2 = 0;
                          var3 = 0;
                          if (uh.field_h.length <= var3) {
                            break L64;
                          } else {
                            L65: {
                              var4 = eg.field_a[var3];
                              if ((var4 ^ -1) <= -1) {
                                if (ja.field_c.field_k == var4) {
                                  var5 = ig.field_b;
                                  break L65;
                                } else {
                                  var5 = sd.field_a;
                                  break L65;
                                }
                              } else {
                                var5 = sb.field_m;
                                break L65;
                              }
                            }
                            L66: {
                              var6 = uh.field_h[var3];
                              if (bh.field_a != 2) {
                                break L66;
                              } else {
                                if (1 == var2) {
                                  L67: {
                                    if (se.field_n.length >= ri.field_b.length) {
                                      stackOut_145_0 = se.field_n.length;
                                      stackIn_146_0 = stackOut_145_0;
                                      break L67;
                                    } else {
                                      stackOut_144_0 = ri.field_b.length;
                                      stackIn_146_0 = stackOut_144_0;
                                      break L67;
                                    }
                                  }
                                  L68: {
                                    var7 = stackIn_146_0;
                                    if (-7 < var3) {
                                      break L68;
                                    } else {
                                      if (6 + var7 <= var3) {
                                        break L68;
                                      } else {
                                        L69: {
                                          if (-1 <= -var7 + se.field_n.length + (-6 + var3)) {
                                            stackOut_150_0 = se.field_n[-var7 + var3 + (-6 + se.field_n.length)];
                                            stackIn_151_0 = stackOut_150_0;
                                            break L69;
                                          } else {
                                            stackOut_149_0 = "";
                                            stackIn_151_0 = stackOut_149_0;
                                            break L69;
                                          }
                                        }
                                        var6_ref = stackIn_151_0;
                                        break L68;
                                      }
                                    }
                                  }
                                  L70: {
                                    if (fb.field_c.length >= rd.field_q.length) {
                                      stackOut_154_0 = fb.field_c.length;
                                      stackIn_155_0 = stackOut_154_0;
                                      break L70;
                                    } else {
                                      stackOut_153_0 = rd.field_q.length;
                                      stackIn_155_0 = stackOut_153_0;
                                      break L70;
                                    }
                                  }
                                  var8 = stackIn_155_0;
                                  if (var3 < 7 - -var7) {
                                    break L66;
                                  } else {
                                    if (var3 < 7 + (var7 + var8)) {
                                      L71: {
                                        if (-var7 + (-7 + var3) >= fb.field_c.length) {
                                          stackOut_160_0 = "";
                                          stackIn_161_0 = stackOut_160_0;
                                          break L71;
                                        } else {
                                          stackOut_159_0 = fb.field_c[-7 + (var3 - var7)];
                                          stackIn_161_0 = stackOut_159_0;
                                          break L71;
                                        }
                                      }
                                      var6_ref = stackIn_161_0;
                                      break L66;
                                    } else {
                                      break L66;
                                    }
                                  }
                                } else {
                                  break L66;
                                }
                              }
                            }
                            L72: {
                              if ((var4 ^ -1) != 1) {
                                break L72;
                              } else {
                                var6_ref = Integer.toString(var2);
                                break L72;
                              }
                            }
                            L73: {
                              stackOut_164_0 = (String) var6_ref;
                              stackOut_164_1 = 26;
                              stackIn_166_0 = stackOut_164_0;
                              stackIn_166_1 = stackOut_164_1;
                              stackIn_165_0 = stackOut_164_0;
                              stackIn_165_1 = stackOut_164_1;
                              if ((var4 ^ -1) > -1) {
                                stackOut_166_0 = (String) (Object) stackIn_166_0;
                                stackOut_166_1 = stackIn_166_1;
                                stackOut_166_2 = 0;
                                stackIn_167_0 = stackOut_166_0;
                                stackIn_167_1 = stackOut_166_1;
                                stackIn_167_2 = stackOut_166_2;
                                break L73;
                              } else {
                                stackOut_165_0 = (String) (Object) stackIn_165_0;
                                stackOut_165_1 = stackIn_165_1;
                                stackOut_165_2 = 1;
                                stackIn_167_0 = stackOut_165_0;
                                stackIn_167_1 = stackOut_165_1;
                                stackIn_167_2 = stackOut_165_2;
                                break L73;
                              }
                            }
                            L74: {
                              var7 = fb.a(stackIn_167_0, (byte) stackIn_167_1, stackIn_167_2 != 0);
                              var8 = -(var7 >> 2002371233) + ee.field_b;
                              if ((var4 ^ -1) > -1) {
                                break L74;
                              } else {
                                L75: {
                                  if (var4 == ja.field_c.field_k) {
                                    stackOut_170_0 = ie.field_y;
                                    stackIn_171_0 = stackOut_170_0;
                                    break L75;
                                  } else {
                                    stackOut_169_0 = wj.field_d;
                                    stackIn_171_0 = stackOut_169_0;
                                    break L75;
                                  }
                                }
                                L76: {
                                  var9 = stackIn_171_0;
                                  var1 = var1 + mc.field_h;
                                  if (var9 != null) {
                                    var9.a(-rh.field_i + var8, (rh.field_i << 1681688929) + var7, param0 ^ -947, var1, pk.field_c - -(kc.field_S << 1009772353));
                                    break L76;
                                  } else {
                                    break L76;
                                  }
                                }
                                var1 = var1 + kc.field_S;
                                break L74;
                              }
                            }
                            L77: {
                              if (-1 >= (var4 ^ -1)) {
                                ai.field_h.a(var6_ref, var8, var1 - -rg.field_D, var5, -1);
                                var1 = var1 + (pk.field_c + (kc.field_S - -mc.field_h));
                                break L77;
                              } else {
                                rh.field_h.a(var6_ref, var8, kf.field_v + var1, var5, -1);
                                var1 = var1 + sg.field_e;
                                var3++;
                                break L77;
                              }
                            }
                            var3++;
                            var3++;
                            var3++;
                            break L64;
                          }
                        }
                        return;
                      }
                    } else {
                      L78: {
                        var5 = sb.field_m;
                        var6 = uh.field_h[var3];
                        if (bh.field_a != 2) {
                          break L78;
                        } else {
                          if (1 == var2) {
                            L79: {
                              if (se.field_n.length >= ri.field_b.length) {
                                stackOut_13_0 = se.field_n.length;
                                stackIn_14_0 = stackOut_13_0;
                                break L79;
                              } else {
                                stackOut_12_0 = ri.field_b.length;
                                stackIn_14_0 = stackOut_12_0;
                                break L79;
                              }
                            }
                            L80: {
                              var7 = stackIn_14_0;
                              if (-7 < var3) {
                                break L80;
                              } else {
                                if (6 + var7 <= var3) {
                                  break L80;
                                } else {
                                  L81: {
                                    if (-1 <= -var7 + se.field_n.length + (-6 + var3)) {
                                      stackOut_18_0 = se.field_n[-var7 + var3 + (-6 + se.field_n.length)];
                                      stackIn_19_0 = stackOut_18_0;
                                      break L81;
                                    } else {
                                      stackOut_17_0 = "";
                                      stackIn_19_0 = stackOut_17_0;
                                      break L81;
                                    }
                                  }
                                  var6_ref = stackIn_19_0;
                                  break L80;
                                }
                              }
                            }
                            L82: {
                              if (fb.field_c.length >= rd.field_q.length) {
                                stackOut_22_0 = fb.field_c.length;
                                stackIn_23_0 = stackOut_22_0;
                                break L82;
                              } else {
                                stackOut_21_0 = rd.field_q.length;
                                stackIn_23_0 = stackOut_21_0;
                                break L82;
                              }
                            }
                            var8 = stackIn_23_0;
                            if (var3 < 7 - -var7) {
                              break L78;
                            } else {
                              if (var3 < 7 + (var7 + var8)) {
                                L83: {
                                  if (-var7 + (-7 + var3) >= fb.field_c.length) {
                                    stackOut_28_0 = "";
                                    stackIn_29_0 = stackOut_28_0;
                                    break L83;
                                  } else {
                                    stackOut_27_0 = fb.field_c[-7 + (var3 - var7)];
                                    stackIn_29_0 = stackOut_27_0;
                                    break L83;
                                  }
                                }
                                var6_ref = stackIn_29_0;
                                break L78;
                              } else {
                                break L78;
                              }
                            }
                          } else {
                            break L78;
                          }
                        }
                      }
                      L84: {
                        if ((var4 ^ -1) != 1) {
                          break L84;
                        } else {
                          var6_ref = Integer.toString(var2);
                          break L84;
                        }
                      }
                      L85: {
                        stackOut_32_0 = (String) var6_ref;
                        stackOut_32_1 = 26;
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if ((var4 ^ -1) > -1) {
                          stackOut_34_0 = (String) (Object) stackIn_34_0;
                          stackOut_34_1 = stackIn_34_1;
                          stackOut_34_2 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          stackIn_35_2 = stackOut_34_2;
                          break L85;
                        } else {
                          stackOut_33_0 = (String) (Object) stackIn_33_0;
                          stackOut_33_1 = stackIn_33_1;
                          stackOut_33_2 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_35_2 = stackOut_33_2;
                          break L85;
                        }
                      }
                      L86: {
                        var7 = fb.a(stackIn_35_0, (byte) stackIn_35_1, stackIn_35_2 != 0);
                        var8 = -(var7 >> 2002371233) + ee.field_b;
                        if ((var4 ^ -1) > -1) {
                          break L86;
                        } else {
                          L87: {
                            if (var4 == ja.field_c.field_k) {
                              stackOut_38_0 = ie.field_y;
                              stackIn_39_0 = stackOut_38_0;
                              break L87;
                            } else {
                              stackOut_37_0 = wj.field_d;
                              stackIn_39_0 = stackOut_37_0;
                              break L87;
                            }
                          }
                          L88: {
                            var9 = stackIn_39_0;
                            var1 = var1 + mc.field_h;
                            if (var9 != null) {
                              var9.a(-rh.field_i + var8, (rh.field_i << 1681688929) + var7, param0 ^ -947, var1, pk.field_c - -(kc.field_S << 1009772353));
                              break L88;
                            } else {
                              break L88;
                            }
                          }
                          var1 = var1 + kc.field_S;
                          break L86;
                        }
                      }
                      L89: {
                        if (-1 >= (var4 ^ -1)) {
                          ai.field_h.a(var6_ref, var8, var1 - -rg.field_D, var5, -1);
                          var1 = var1 + (pk.field_c + (kc.field_S - -mc.field_h));
                          break L89;
                        } else {
                          rh.field_h.a(var6_ref, var8, kf.field_v + var1, var5, -1);
                          var1 = var1 + sg.field_e;
                          var3++;
                          break L89;
                        }
                      }
                      L90: {
                        var3++;
                        var3++;
                        var3++;
                        var2 = 0;
                        var3 = 0;
                        if (uh.field_h.length <= var3) {
                          break L90;
                        } else {
                          L91: {
                            var4 = eg.field_a[var3];
                            if ((var4 ^ -1) <= -1) {
                              if (ja.field_c.field_k == var4) {
                                var5 = ig.field_b;
                                break L91;
                              } else {
                                var5 = sd.field_a;
                                break L91;
                              }
                            } else {
                              var5 = sb.field_m;
                              break L91;
                            }
                          }
                          L92: {
                            var6 = uh.field_h[var3];
                            if (bh.field_a != 2) {
                              break L92;
                            } else {
                              if (1 == var2) {
                                L93: {
                                  if (se.field_n.length >= ri.field_b.length) {
                                    stackOut_58_0 = se.field_n.length;
                                    stackIn_59_0 = stackOut_58_0;
                                    break L93;
                                  } else {
                                    stackOut_57_0 = ri.field_b.length;
                                    stackIn_59_0 = stackOut_57_0;
                                    break L93;
                                  }
                                }
                                L94: {
                                  var7 = stackIn_59_0;
                                  if (-7 < var3) {
                                    break L94;
                                  } else {
                                    if (6 + var7 <= var3) {
                                      break L94;
                                    } else {
                                      L95: {
                                        if (-1 <= -var7 + se.field_n.length + (-6 + var3)) {
                                          stackOut_63_0 = se.field_n[-var7 + var3 + (-6 + se.field_n.length)];
                                          stackIn_64_0 = stackOut_63_0;
                                          break L95;
                                        } else {
                                          stackOut_62_0 = "";
                                          stackIn_64_0 = stackOut_62_0;
                                          break L95;
                                        }
                                      }
                                      var6_ref = stackIn_64_0;
                                      break L94;
                                    }
                                  }
                                }
                                L96: {
                                  if (fb.field_c.length >= rd.field_q.length) {
                                    stackOut_67_0 = fb.field_c.length;
                                    stackIn_68_0 = stackOut_67_0;
                                    break L96;
                                  } else {
                                    stackOut_66_0 = rd.field_q.length;
                                    stackIn_68_0 = stackOut_66_0;
                                    break L96;
                                  }
                                }
                                var8 = stackIn_68_0;
                                if (var3 < 7 - -var7) {
                                  break L92;
                                } else {
                                  if (var3 < 7 + (var7 + var8)) {
                                    L97: {
                                      if (-var7 + (-7 + var3) >= fb.field_c.length) {
                                        stackOut_73_0 = "";
                                        stackIn_74_0 = stackOut_73_0;
                                        break L97;
                                      } else {
                                        stackOut_72_0 = fb.field_c[-7 + (var3 - var7)];
                                        stackIn_74_0 = stackOut_72_0;
                                        break L97;
                                      }
                                    }
                                    var6_ref = stackIn_74_0;
                                    break L92;
                                  } else {
                                    break L92;
                                  }
                                }
                              } else {
                                break L92;
                              }
                            }
                          }
                          L98: {
                            if ((var4 ^ -1) != 1) {
                              break L98;
                            } else {
                              var6_ref = Integer.toString(var2);
                              break L98;
                            }
                          }
                          L99: {
                            stackOut_77_0 = (String) var6_ref;
                            stackOut_77_1 = 26;
                            stackIn_79_0 = stackOut_77_0;
                            stackIn_79_1 = stackOut_77_1;
                            stackIn_78_0 = stackOut_77_0;
                            stackIn_78_1 = stackOut_77_1;
                            if ((var4 ^ -1) > -1) {
                              stackOut_79_0 = (String) (Object) stackIn_79_0;
                              stackOut_79_1 = stackIn_79_1;
                              stackOut_79_2 = 0;
                              stackIn_80_0 = stackOut_79_0;
                              stackIn_80_1 = stackOut_79_1;
                              stackIn_80_2 = stackOut_79_2;
                              break L99;
                            } else {
                              stackOut_78_0 = (String) (Object) stackIn_78_0;
                              stackOut_78_1 = stackIn_78_1;
                              stackOut_78_2 = 1;
                              stackIn_80_0 = stackOut_78_0;
                              stackIn_80_1 = stackOut_78_1;
                              stackIn_80_2 = stackOut_78_2;
                              break L99;
                            }
                          }
                          L100: {
                            var7 = fb.a(stackIn_80_0, (byte) stackIn_80_1, stackIn_80_2 != 0);
                            var8 = -(var7 >> 2002371233) + ee.field_b;
                            if ((var4 ^ -1) > -1) {
                              break L100;
                            } else {
                              L101: {
                                if (var4 == ja.field_c.field_k) {
                                  stackOut_83_0 = ie.field_y;
                                  stackIn_84_0 = stackOut_83_0;
                                  break L101;
                                } else {
                                  stackOut_82_0 = wj.field_d;
                                  stackIn_84_0 = stackOut_82_0;
                                  break L101;
                                }
                              }
                              L102: {
                                var9 = stackIn_84_0;
                                var1 = var1 + mc.field_h;
                                if (var9 != null) {
                                  var9.a(-rh.field_i + var8, (rh.field_i << 1681688929) + var7, param0 ^ -947, var1, pk.field_c - -(kc.field_S << 1009772353));
                                  break L102;
                                } else {
                                  break L102;
                                }
                              }
                              var1 = var1 + kc.field_S;
                              break L100;
                            }
                          }
                          L103: {
                            if (-1 >= (var4 ^ -1)) {
                              ai.field_h.a(var6_ref, var8, var1 - -rg.field_D, var5, -1);
                              var1 = var1 + (pk.field_c + (kc.field_S - -mc.field_h));
                              break L103;
                            } else {
                              rh.field_h.a(var6_ref, var8, kf.field_v + var1, var5, -1);
                              var1 = var1 + sg.field_e;
                              var3++;
                              break L103;
                            }
                          }
                          var3++;
                          var3++;
                          var3++;
                          break L90;
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
              var2 = 0;
              break L0;
            }
          }
          var3 = 0;
          L104: while (true) {
            if (uh.field_h.length <= var3) {
              return;
            } else {
              L105: {
                var4 = eg.field_a[var3];
                if ((var4 ^ -1) <= -1) {
                  if (ja.field_c.field_k == var4) {
                    var5 = ig.field_b;
                    break L105;
                  } else {
                    var5 = sd.field_a;
                    break L105;
                  }
                } else {
                  var5 = sb.field_m;
                  break L105;
                }
              }
              L106: {
                var6 = uh.field_h[var3];
                if (bh.field_a != 2) {
                  break L106;
                } else {
                  if (1 == var2) {
                    L107: {
                      if (se.field_n.length >= ri.field_b.length) {
                        stackOut_360_0 = se.field_n.length;
                        stackIn_361_0 = stackOut_360_0;
                        break L107;
                      } else {
                        stackOut_359_0 = ri.field_b.length;
                        stackIn_361_0 = stackOut_359_0;
                        break L107;
                      }
                    }
                    L108: {
                      var7 = stackIn_361_0;
                      if (-7 < var3) {
                        break L108;
                      } else {
                        if (6 + var7 <= var3) {
                          break L108;
                        } else {
                          L109: {
                            if (-1 <= -var7 + se.field_n.length + (-6 + var3)) {
                              stackOut_365_0 = se.field_n[-var7 + var3 + (-6 + se.field_n.length)];
                              stackIn_366_0 = stackOut_365_0;
                              break L109;
                            } else {
                              stackOut_364_0 = "";
                              stackIn_366_0 = stackOut_364_0;
                              break L109;
                            }
                          }
                          var6_ref = stackIn_366_0;
                          break L108;
                        }
                      }
                    }
                    L110: {
                      if (fb.field_c.length >= rd.field_q.length) {
                        stackOut_369_0 = fb.field_c.length;
                        stackIn_370_0 = stackOut_369_0;
                        break L110;
                      } else {
                        stackOut_368_0 = rd.field_q.length;
                        stackIn_370_0 = stackOut_368_0;
                        break L110;
                      }
                    }
                    var8 = stackIn_370_0;
                    if (var3 < 7 - -var7) {
                      break L106;
                    } else {
                      if (var3 < 7 + (var7 + var8)) {
                        L111: {
                          if (-var7 + (-7 + var3) >= fb.field_c.length) {
                            stackOut_375_0 = "";
                            stackIn_376_0 = stackOut_375_0;
                            break L111;
                          } else {
                            stackOut_374_0 = fb.field_c[-7 + (var3 - var7)];
                            stackIn_376_0 = stackOut_374_0;
                            break L111;
                          }
                        }
                        var6_ref = stackIn_376_0;
                        break L106;
                      } else {
                        break L106;
                      }
                    }
                  } else {
                    break L106;
                  }
                }
              }
              L112: {
                if ((var4 ^ -1) != 1) {
                  break L112;
                } else {
                  var6_ref = Integer.toString(var2);
                  break L112;
                }
              }
              L113: {
                stackOut_379_0 = (String) var6_ref;
                stackOut_379_1 = 26;
                stackIn_381_0 = stackOut_379_0;
                stackIn_381_1 = stackOut_379_1;
                stackIn_380_0 = stackOut_379_0;
                stackIn_380_1 = stackOut_379_1;
                if ((var4 ^ -1) > -1) {
                  stackOut_381_0 = (String) (Object) stackIn_381_0;
                  stackOut_381_1 = stackIn_381_1;
                  stackOut_381_2 = 0;
                  stackIn_382_0 = stackOut_381_0;
                  stackIn_382_1 = stackOut_381_1;
                  stackIn_382_2 = stackOut_381_2;
                  break L113;
                } else {
                  stackOut_380_0 = (String) (Object) stackIn_380_0;
                  stackOut_380_1 = stackIn_380_1;
                  stackOut_380_2 = 1;
                  stackIn_382_0 = stackOut_380_0;
                  stackIn_382_1 = stackOut_380_1;
                  stackIn_382_2 = stackOut_380_2;
                  break L113;
                }
              }
              L114: {
                var7 = fb.a(stackIn_382_0, (byte) stackIn_382_1, stackIn_382_2 != 0);
                var8 = -(var7 >> 2002371233) + ee.field_b;
                if ((var4 ^ -1) > -1) {
                  break L114;
                } else {
                  L115: {
                    if (var4 == ja.field_c.field_k) {
                      stackOut_385_0 = ie.field_y;
                      stackIn_386_0 = stackOut_385_0;
                      break L115;
                    } else {
                      stackOut_384_0 = wj.field_d;
                      stackIn_386_0 = stackOut_384_0;
                      break L115;
                    }
                  }
                  L116: {
                    var9 = stackIn_386_0;
                    var1 = var1 + mc.field_h;
                    if (var9 != null) {
                      var9.a(-rh.field_i + var8, (rh.field_i << 1681688929) + var7, param0 ^ -947, var1, pk.field_c - -(kc.field_S << 1009772353));
                      break L116;
                    } else {
                      break L116;
                    }
                  }
                  var1 = var1 + kc.field_S;
                  break L114;
                }
              }
              if (-1 >= (var4 ^ -1)) {
                ai.field_h.a(var6_ref, var8, var1 - -rg.field_D, var5, -1);
                var1 = var1 + (pk.field_c + (kc.field_S - -mc.field_h));
                var3++;
                continue L104;
              } else {
                rh.field_h.a(var6_ref, var8, kf.field_v + var1, var5, -1);
                var1 = var1 + sg.field_e;
                var3++;
                continue L104;
              }
            }
          }
        } else {
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new o(10, 2, 2, 0);
        field_b = "Quit to website";
        field_d = "Unfortunately you are not eligible to create an account.";
    }
}
