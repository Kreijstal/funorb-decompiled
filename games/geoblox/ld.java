/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static dm[] field_b;
    static String field_a;
    static java.math.BigInteger field_c;

    public static void a() {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_6_0 = 0;
        var10 = Geoblox.field_C;
        try {
          L0: {
            var1_int = 240 * vb.field_f + 320;
            var2 = var1_int;
            var3 = -(230 * vb.field_f) + var1_int;
            var4 = 230 * vb.field_f + var1_int;
            var5 = 230;
            var6 = 0;
            var7 = 52900;
            var8 = 64 / ((param0 - 32) / 34);
            var9 = var7 - var5;
            if (vb.field_c[-var5 + var1_int] != 0) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (0 == vb.field_c[var1_int - -var5]) {
                if (vb.field_c[var3] != -1) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                } else {
                  if (-1 != vb.field_c[var4]) {
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  } else {
                    L1: while (true) {
                      L2: {
                        int incrementValue$1 = var6;
                        var6++;
                        var9 = var9 + (incrementValue$1 - -var6);
                        var2 = var2 + vb.field_f;
                        var1_int = var1_int - vb.field_f;
                        if (var7 >= var9) {
                          break L2;
                        } else {
                          var3 = var3 + vb.field_f;
                          var4 = var4 - vb.field_f;
                          var5--;
                          var9 = var9 - (var5 + var5);
                          break L2;
                        }
                      }
                      if (var6 > var5) {
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        break L0;
                      } else {
                        if (0 == vb.field_c[-var6 + var3]) {
                          if (vb.field_c[var3 + var6] == 0) {
                            if (vb.field_c[-var5 + var1_int] == 0) {
                              if (vb.field_c[var5 + var1_int] == 0) {
                                if (vb.field_c[var2 - var5] != 0) {
                                  stackOut_33_0 = 1;
                                  stackIn_34_0 = stackOut_33_0;
                                  return stackIn_34_0 != 0;
                                } else {
                                  if (vb.field_c[var5 + var2] == 0) {
                                    if (vb.field_c[var4 - var6] != 0) {
                                      stackOut_40_0 = 1;
                                      stackIn_41_0 = stackOut_40_0;
                                      return stackIn_41_0 != 0;
                                    } else {
                                      if (vb.field_c[var4 - -var6] != 0) {
                                        stackOut_44_0 = 1;
                                        stackIn_45_0 = stackOut_44_0;
                                        return stackIn_45_0 != 0;
                                      } else {
                                        continue L1;
                                      }
                                    }
                                  } else {
                                    stackOut_36_0 = 1;
                                    stackIn_37_0 = stackOut_36_0;
                                    return stackIn_37_0 != 0;
                                  }
                                }
                              } else {
                                stackOut_29_0 = 1;
                                stackIn_30_0 = stackOut_29_0;
                                return stackIn_30_0 != 0;
                              }
                            } else {
                              stackOut_26_0 = 1;
                              stackIn_27_0 = stackOut_26_0;
                              return stackIn_27_0 != 0;
                            }
                          } else {
                            stackOut_23_0 = 1;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0 != 0;
                          }
                        } else {
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        }
                      }
                    }
                  }
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ld.B(" + param0 + ')');
        }
        return stackIn_47_0 != 0;
    }

    final static void b(boolean param0) {
        int stackIn_10_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_228_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        ji.field_h = ji.field_h + 1;
        if (ji.field_h < kd.field_f.length) {
          L0: {
            if ((4 & kd.field_f[ji.field_h]) != 0) {
              L1: {
                og.field_r = og.field_r + 0.055555559694767f;
                if (param0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                }
              }
              sa.b(stackIn_10_0 != 0);
              break L0;
            } else {
              break L0;
            }
          }
          if ((kd.field_f[ji.field_h] & 1) != 0) {
            if (ag.field_k >= 7) {
              if (!param0) {
                L2: {
                  if ((kd.field_f[ji.field_h] & 2) == 0) {
                    break L2;
                  } else {
                    if (f.field_qb < 7) {
                      f.field_qb = f.field_qb + 1;
                      break L2;
                    } else {
                      if (0 == (kd.field_f[ji.field_h] & 16)) {
                        if ((8 & kd.field_f[ji.field_h]) != 0) {
                          L3: {
                            rc.field_h = rc.field_h * 1.100000023841858f;
                            if (0 != (kd.field_f[ji.field_h] & 128)) {
                              L4: {
                                if (0.800000011920929f > ij.field_ab) {
                                  ij.field_ab = ij.field_ab + 0.02857142873108387f;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              L5: {
                                if (param0) {
                                  stackOut_181_0 = 0;
                                  stackIn_182_0 = stackOut_181_0;
                                  break L5;
                                } else {
                                  stackOut_180_0 = 1;
                                  stackIn_182_0 = stackOut_180_0;
                                  break L5;
                                }
                              }
                              sa.b(stackIn_182_0 != 0);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          return;
                        } else {
                          L6: {
                            if (0 != (kd.field_f[ji.field_h] & 128)) {
                              L7: {
                                if (0.800000011920929f > ij.field_ab) {
                                  ij.field_ab = ij.field_ab + 0.02857142873108387f;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                if (param0) {
                                  stackOut_171_0 = 0;
                                  stackIn_172_0 = stackOut_171_0;
                                  break L8;
                                } else {
                                  stackOut_170_0 = 1;
                                  stackIn_172_0 = stackOut_170_0;
                                  break L8;
                                }
                              }
                              sa.b(stackIn_172_0 != 0);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          return;
                        }
                      } else {
                        sa.field_c = sa.field_c + 0.05;
                        if ((8 & kd.field_f[ji.field_h]) == 0) {
                          L9: {
                            if (0 != (kd.field_f[ji.field_h] & 128)) {
                              L10: {
                                if (0.800000011920929f > ij.field_ab) {
                                  ij.field_ab = ij.field_ab + 0.02857142873108387f;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              L11: {
                                if (param0) {
                                  stackOut_159_0 = 0;
                                  stackIn_160_0 = stackOut_159_0;
                                  break L11;
                                } else {
                                  stackOut_158_0 = 1;
                                  stackIn_160_0 = stackOut_158_0;
                                  break L11;
                                }
                              }
                              sa.b(stackIn_160_0 != 0);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          return;
                        } else {
                          L12: {
                            rc.field_h = rc.field_h * 1.100000023841858f;
                            if (0 != (kd.field_f[ji.field_h] & 128)) {
                              L13: {
                                if (0.800000011920929f > ij.field_ab) {
                                  ij.field_ab = ij.field_ab + 0.02857142873108387f;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                if (param0) {
                                  stackOut_149_0 = 0;
                                  stackIn_150_0 = stackOut_149_0;
                                  break L14;
                                } else {
                                  stackOut_148_0 = 1;
                                  stackIn_150_0 = stackOut_148_0;
                                  break L14;
                                }
                              }
                              sa.b(stackIn_150_0 != 0);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                }
                if (0 == (kd.field_f[ji.field_h] & 16)) {
                  if ((8 & kd.field_f[ji.field_h]) != 0) {
                    L15: {
                      rc.field_h = rc.field_h * 1.100000023841858f;
                      if (0 != (kd.field_f[ji.field_h] & 128)) {
                        L16: {
                          if (0.800000011920929f > ij.field_ab) {
                            ij.field_ab = ij.field_ab + 0.02857142873108387f;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          if (param0) {
                            stackOut_227_0 = 0;
                            stackIn_228_0 = stackOut_227_0;
                            break L17;
                          } else {
                            stackOut_226_0 = 1;
                            stackIn_228_0 = stackOut_226_0;
                            break L17;
                          }
                        }
                        sa.b(stackIn_228_0 != 0);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    return;
                  } else {
                    L18: {
                      if (0 != (kd.field_f[ji.field_h] & 128)) {
                        L19: {
                          if (0.800000011920929f > ij.field_ab) {
                            ij.field_ab = ij.field_ab + 0.02857142873108387f;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        L20: {
                          if (param0) {
                            stackOut_217_0 = 0;
                            stackIn_218_0 = stackOut_217_0;
                            break L20;
                          } else {
                            stackOut_216_0 = 1;
                            stackIn_218_0 = stackOut_216_0;
                            break L20;
                          }
                        }
                        sa.b(stackIn_218_0 != 0);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    return;
                  }
                } else {
                  sa.field_c = sa.field_c + 0.05;
                  if ((8 & kd.field_f[ji.field_h]) != 0) {
                    L21: {
                      rc.field_h = rc.field_h * 1.100000023841858f;
                      if (0 != (kd.field_f[ji.field_h] & 128)) {
                        L22: {
                          if (0.800000011920929f > ij.field_ab) {
                            ij.field_ab = ij.field_ab + 0.02857142873108387f;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        L23: {
                          if (param0) {
                            stackOut_205_0 = 0;
                            stackIn_206_0 = stackOut_205_0;
                            break L23;
                          } else {
                            stackOut_204_0 = 1;
                            stackIn_206_0 = stackOut_204_0;
                            break L23;
                          }
                        }
                        sa.b(stackIn_206_0 != 0);
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    return;
                  } else {
                    L24: {
                      if (0 != (kd.field_f[ji.field_h] & 128)) {
                        L25: {
                          if (0.800000011920929f > ij.field_ab) {
                            ij.field_ab = ij.field_ab + 0.02857142873108387f;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if (param0) {
                            stackOut_195_0 = 0;
                            stackIn_196_0 = stackOut_195_0;
                            break L26;
                          } else {
                            stackOut_194_0 = 1;
                            stackIn_196_0 = stackOut_194_0;
                            break L26;
                          }
                        }
                        sa.b(stackIn_196_0 != 0);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    return;
                  }
                }
              } else {
                L27: {
                  ld.b(true);
                  if ((kd.field_f[ji.field_h] & 2) == 0) {
                    break L27;
                  } else {
                    if (f.field_qb < 7) {
                      f.field_qb = f.field_qb + 1;
                      break L27;
                    } else {
                      L28: {
                        if (0 == (kd.field_f[ji.field_h] & 16)) {
                          break L28;
                        } else {
                          sa.field_c = sa.field_c + 0.05;
                          break L28;
                        }
                      }
                      L29: {
                        if ((8 & kd.field_f[ji.field_h]) == 0) {
                          break L29;
                        } else {
                          rc.field_h = rc.field_h * 1.100000023841858f;
                          break L29;
                        }
                      }
                      L30: {
                        if (0 != (kd.field_f[ji.field_h] & 128)) {
                          L31: {
                            if (0.800000011920929f > ij.field_ab) {
                              ij.field_ab = ij.field_ab + 0.02857142873108387f;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L32: {
                            if (param0) {
                              stackOut_99_0 = 0;
                              stackIn_100_0 = stackOut_99_0;
                              break L32;
                            } else {
                              stackOut_98_0 = 1;
                              stackIn_100_0 = stackOut_98_0;
                              break L32;
                            }
                          }
                          sa.b(stackIn_100_0 != 0);
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      return;
                    }
                  }
                }
                if (0 == (kd.field_f[ji.field_h] & 16)) {
                  if ((8 & kd.field_f[ji.field_h]) != 0) {
                    L33: {
                      rc.field_h = rc.field_h * 1.100000023841858f;
                      if (0 != (kd.field_f[ji.field_h] & 128)) {
                        L34: {
                          if (0.800000011920929f > ij.field_ab) {
                            ij.field_ab = ij.field_ab + 0.02857142873108387f;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        L35: {
                          if (param0) {
                            stackOut_134_0 = 0;
                            stackIn_135_0 = stackOut_134_0;
                            break L35;
                          } else {
                            stackOut_133_0 = 1;
                            stackIn_135_0 = stackOut_133_0;
                            break L35;
                          }
                        }
                        sa.b(stackIn_135_0 != 0);
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    return;
                  } else {
                    L36: {
                      if (0 != (kd.field_f[ji.field_h] & 128)) {
                        L37: {
                          if (0.800000011920929f > ij.field_ab) {
                            ij.field_ab = ij.field_ab + 0.02857142873108387f;
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        L38: {
                          if (param0) {
                            stackOut_124_0 = 0;
                            stackIn_125_0 = stackOut_124_0;
                            break L38;
                          } else {
                            stackOut_123_0 = 1;
                            stackIn_125_0 = stackOut_123_0;
                            break L38;
                          }
                        }
                        sa.b(stackIn_125_0 != 0);
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    return;
                  }
                } else {
                  L39: {
                    sa.field_c = sa.field_c + 0.05;
                    if ((8 & kd.field_f[ji.field_h]) == 0) {
                      break L39;
                    } else {
                      rc.field_h = rc.field_h * 1.100000023841858f;
                      break L39;
                    }
                  }
                  L40: {
                    if (0 != (kd.field_f[ji.field_h] & 128)) {
                      L41: {
                        if (0.800000011920929f > ij.field_ab) {
                          ij.field_ab = ij.field_ab + 0.02857142873108387f;
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      L42: {
                        if (param0) {
                          stackOut_113_0 = 0;
                          stackIn_114_0 = stackOut_113_0;
                          break L42;
                        } else {
                          stackOut_112_0 = 1;
                          stackIn_114_0 = stackOut_112_0;
                          break L42;
                        }
                      }
                      sa.b(stackIn_114_0 != 0);
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  return;
                }
              }
            } else {
              L43: {
                ag.field_k = ag.field_k + 1;
                if (!param0) {
                  break L43;
                } else {
                  ld.b(true);
                  break L43;
                }
              }
              L44: {
                if ((kd.field_f[ji.field_h] & 2) == 0) {
                  break L44;
                } else {
                  if (f.field_qb < 7) {
                    f.field_qb = f.field_qb + 1;
                    break L44;
                  } else {
                    break L44;
                  }
                }
              }
              L45: {
                if (0 == (kd.field_f[ji.field_h] & 16)) {
                  break L45;
                } else {
                  sa.field_c = sa.field_c + 0.05;
                  break L45;
                }
              }
              L46: {
                if ((8 & kd.field_f[ji.field_h]) == 0) {
                  break L46;
                } else {
                  rc.field_h = rc.field_h * 1.100000023841858f;
                  break L46;
                }
              }
              L47: {
                if (0 != (kd.field_f[ji.field_h] & 128)) {
                  L48: {
                    if (0.800000011920929f > ij.field_ab) {
                      ij.field_ab = ij.field_ab + 0.02857142873108387f;
                      break L48;
                    } else {
                      break L48;
                    }
                  }
                  L49: {
                    if (param0) {
                      stackOut_82_0 = 0;
                      stackIn_83_0 = stackOut_82_0;
                      break L49;
                    } else {
                      stackOut_81_0 = 1;
                      stackIn_83_0 = stackOut_81_0;
                      break L49;
                    }
                  }
                  sa.b(stackIn_83_0 != 0);
                  break L47;
                } else {
                  break L47;
                }
              }
              return;
            }
          } else {
            if (param0) {
              ld.b(true);
              if ((kd.field_f[ji.field_h] & 2) == 0) {
                L50: {
                  if (0 == (kd.field_f[ji.field_h] & 16)) {
                    break L50;
                  } else {
                    sa.field_c = sa.field_c + 0.05;
                    break L50;
                  }
                }
                L51: {
                  if ((8 & kd.field_f[ji.field_h]) == 0) {
                    break L51;
                  } else {
                    rc.field_h = rc.field_h * 1.100000023841858f;
                    break L51;
                  }
                }
                L52: {
                  if (0 != (kd.field_f[ji.field_h] & 128)) {
                    L53: {
                      if (0.800000011920929f > ij.field_ab) {
                        ij.field_ab = ij.field_ab + 0.02857142873108387f;
                        break L53;
                      } else {
                        break L53;
                      }
                    }
                    L54: {
                      if (param0) {
                        stackOut_60_0 = 0;
                        stackIn_61_0 = stackOut_60_0;
                        break L54;
                      } else {
                        stackOut_59_0 = 1;
                        stackIn_61_0 = stackOut_59_0;
                        break L54;
                      }
                    }
                    sa.b(stackIn_61_0 != 0);
                    break L52;
                  } else {
                    break L52;
                  }
                }
                return;
              } else {
                L55: {
                  if (f.field_qb < 7) {
                    f.field_qb = f.field_qb + 1;
                    break L55;
                  } else {
                    break L55;
                  }
                }
                L56: {
                  if (0 == (kd.field_f[ji.field_h] & 16)) {
                    break L56;
                  } else {
                    sa.field_c = sa.field_c + 0.05;
                    break L56;
                  }
                }
                L57: {
                  if ((8 & kd.field_f[ji.field_h]) == 0) {
                    break L57;
                  } else {
                    rc.field_h = rc.field_h * 1.100000023841858f;
                    break L57;
                  }
                }
                L58: {
                  if (0 != (kd.field_f[ji.field_h] & 128)) {
                    L59: {
                      if (0.800000011920929f > ij.field_ab) {
                        ij.field_ab = ij.field_ab + 0.02857142873108387f;
                        break L59;
                      } else {
                        break L59;
                      }
                    }
                    L60: {
                      if (param0) {
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        break L60;
                      } else {
                        stackOut_45_0 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        break L60;
                      }
                    }
                    sa.b(stackIn_47_0 != 0);
                    break L58;
                  } else {
                    break L58;
                  }
                }
                return;
              }
            } else {
              L61: {
                if ((kd.field_f[ji.field_h] & 2) == 0) {
                  break L61;
                } else {
                  if (f.field_qb < 7) {
                    f.field_qb = f.field_qb + 1;
                    break L61;
                  } else {
                    break L61;
                  }
                }
              }
              L62: {
                if (0 == (kd.field_f[ji.field_h] & 16)) {
                  break L62;
                } else {
                  sa.field_c = sa.field_c + 0.05;
                  break L62;
                }
              }
              L63: {
                if ((8 & kd.field_f[ji.field_h]) == 0) {
                  break L63;
                } else {
                  rc.field_h = rc.field_h * 1.100000023841858f;
                  break L63;
                }
              }
              L64: {
                if (0 != (kd.field_f[ji.field_h] & 128)) {
                  L65: {
                    if (0.800000011920929f > ij.field_ab) {
                      ij.field_ab = ij.field_ab + 0.02857142873108387f;
                      break L65;
                    } else {
                      break L65;
                    }
                  }
                  L66: {
                    if (param0) {
                      stackOut_28_0 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      break L66;
                    } else {
                      stackOut_27_0 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      break L66;
                    }
                  }
                  sa.b(stackIn_29_0 != 0);
                  break L64;
                } else {
                  break L64;
                }
              }
              return;
            }
          }
        } else {
          L67: {
            if (sa.field_c > 0.15000000000000002) {
              sa.field_c = sa.field_c - 0.05;
              break L67;
            } else {
              break L67;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        ug.a(param3, true, param0, 1, param1);
        if (param2 > 39) {
            return;
        }
        boolean discarded$0 = ld.a(118);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "+2,000 for being great!";
        field_c = new java.math.BigInteger("65537");
    }
}
