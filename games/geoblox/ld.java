/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static dm[] field_b;
    static String field_a;
    static java.math.BigInteger field_c;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            field_b = (dm[]) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static boolean a(int param0) {
        int incrementValue$0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
            } else {
              if (0 == vb.field_c[var1_int + var5]) {
                if (vb.field_c[var3] != 0) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                } else {
                  if (vb.field_c[var4] != 0) {
                    stackIn_15_0 = 1;
                    decompiledRegionSelector0 = 3;
                  } else {
                    L1: while (true) {
                      incrementValue$0 = var6;
                      var6++;
                      var9 = var9 + (incrementValue$0 + var6);
                      var2 = var2 + vb.field_f;
                      var1_int = var1_int - vb.field_f;
                      if (var7 < var9) {
                        var3 = var3 + vb.field_f;
                        var4 = var4 - vb.field_f;
                        var5--;
                        var9 = var9 - (var5 + var5);
                      }
                      if (var6 > var5) {
                        stackIn_47_0 = 0;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      } else {
                        if (0 == vb.field_c[-var6 + var3]) {
                          if (vb.field_c[var3 + var6] == 0) {
                            if (vb.field_c[-var5 + var1_int] == 0) {
                              if (vb.field_c[var5 + var1_int] == 0) {
                                if (vb.field_c[var2 - var5] != 0) {
                                  stackIn_34_0 = 1;
                                  decompiledRegionSelector0 = 8;
                                  break L0;
                                } else {
                                  if (vb.field_c[var5 + var2] == 0) {
                                    if (vb.field_c[var4 - var6] != 0) {
                                      stackIn_41_0 = 1;
                                      decompiledRegionSelector0 = 10;
                                      break L0;
                                    } else {
                                      if (vb.field_c[var4 + var6] != 0) {
                                        stackIn_45_0 = 1;
                                        decompiledRegionSelector0 = 11;
                                        break L0;
                                      } else {
                                        continue L1;
                                      }
                                    }
                                  } else {
                                    stackIn_37_0 = 1;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  }
                                }
                              } else {
                                stackIn_30_0 = 1;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              }
                            } else {
                              stackIn_27_0 = 1;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          } else {
                            stackIn_24_0 = 1;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          stackIn_21_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                  }
                }
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ld.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_24_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_30_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_34_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_37_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_41_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_45_0 != 0;
                              } else {
                                return stackIn_47_0 != 0;
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
        ji.field_h = ji.field_h + 1;
        if (ji.field_h < kd.field_f.length) {
          if ((4 & kd.field_f[ji.field_h]) != 0) {
            og.field_r = og.field_r + 0.055555559694767f;
            if (param0) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = 1;
            }
            sa.b(stackIn_10_0 != 0);
          }
          if ((kd.field_f[ji.field_h] & 1) != 0) {
            if (ag.field_k >= 7) {
              if (!param0) {
                if ((kd.field_f[ji.field_h] & 2) != 0) {
                  if (f.field_qb < 7) {
                    f.field_qb = f.field_qb + 1;
                  } else {
                    if (0 == (kd.field_f[ji.field_h] & 16)) {
                      if ((8 & kd.field_f[ji.field_h]) != 0) {
                        rc.field_h = rc.field_h * 1.100000023841858f;
                        if (0 != (kd.field_f[ji.field_h] & 128)) {
                          if (0.800000011920929f > ij.field_ab) {
                            ij.field_ab = ij.field_ab + 0.02857142873108387f;
                          }
                          if (param0) {
                            stackIn_182_0 = 0;
                          } else {
                            stackIn_182_0 = 1;
                          }
                          sa.b(stackIn_182_0 != 0);
                        }
                        return;
                      } else {
                        if (0 != (kd.field_f[ji.field_h] & 128)) {
                          if (0.800000011920929f > ij.field_ab) {
                            ij.field_ab = ij.field_ab + 0.02857142873108387f;
                          }
                          if (param0) {
                            stackIn_172_0 = 0;
                          } else {
                            stackIn_172_0 = 1;
                          }
                          sa.b(stackIn_172_0 != 0);
                        }
                        return;
                      }
                    } else {
                      sa.field_c = sa.field_c + 0.05;
                      if ((8 & kd.field_f[ji.field_h]) == 0) {
                        if (0 != (kd.field_f[ji.field_h] & 128)) {
                          if (0.800000011920929f > ij.field_ab) {
                            ij.field_ab = ij.field_ab + 0.02857142873108387f;
                          }
                          if (param0) {
                            stackIn_160_0 = 0;
                          } else {
                            stackIn_160_0 = 1;
                          }
                          sa.b(stackIn_160_0 != 0);
                        }
                        return;
                      } else {
                        rc.field_h = rc.field_h * 1.100000023841858f;
                        if (0 != (kd.field_f[ji.field_h] & 128)) {
                          if (0.800000011920929f > ij.field_ab) {
                            ij.field_ab = ij.field_ab + 0.02857142873108387f;
                          }
                          if (param0) {
                            stackIn_150_0 = 0;
                          } else {
                            stackIn_150_0 = 1;
                          }
                          sa.b(stackIn_150_0 != 0);
                        }
                        return;
                      }
                    }
                  }
                }
                if (0 == (kd.field_f[ji.field_h] & 16)) {
                  if ((8 & kd.field_f[ji.field_h]) != 0) {
                    rc.field_h = rc.field_h * 1.100000023841858f;
                    if (0 != (kd.field_f[ji.field_h] & 128)) {
                      if (0.800000011920929f > ij.field_ab) {
                        ij.field_ab = ij.field_ab + 0.02857142873108387f;
                      }
                      if (param0) {
                        stackIn_228_0 = 0;
                      } else {
                        stackIn_228_0 = 1;
                      }
                      sa.b(stackIn_228_0 != 0);
                    }
                    return;
                  } else {
                    if (0 != (kd.field_f[ji.field_h] & 128)) {
                      if (0.800000011920929f > ij.field_ab) {
                        ij.field_ab = ij.field_ab + 0.02857142873108387f;
                      }
                      if (param0) {
                        stackIn_218_0 = 0;
                      } else {
                        stackIn_218_0 = 1;
                      }
                      sa.b(stackIn_218_0 != 0);
                    }
                    return;
                  }
                } else {
                  sa.field_c = sa.field_c + 0.05;
                  if ((8 & kd.field_f[ji.field_h]) != 0) {
                    rc.field_h = rc.field_h * 1.100000023841858f;
                    if (0 != (kd.field_f[ji.field_h] & 128)) {
                      if (0.800000011920929f > ij.field_ab) {
                        ij.field_ab = ij.field_ab + 0.02857142873108387f;
                      }
                      if (param0) {
                        stackIn_206_0 = 0;
                      } else {
                        stackIn_206_0 = 1;
                      }
                      sa.b(stackIn_206_0 != 0);
                    }
                    return;
                  } else {
                    if (0 != (kd.field_f[ji.field_h] & 128)) {
                      if (0.800000011920929f > ij.field_ab) {
                        ij.field_ab = ij.field_ab + 0.02857142873108387f;
                      }
                      if (param0) {
                        stackIn_196_0 = 0;
                      } else {
                        stackIn_196_0 = 1;
                      }
                      sa.b(stackIn_196_0 != 0);
                    }
                    return;
                  }
                }
              } else {
                ld.b(true);
                if ((kd.field_f[ji.field_h] & 2) != 0) {
                  if (f.field_qb < 7) {
                    f.field_qb = f.field_qb + 1;
                  } else {
                    if (0 != (kd.field_f[ji.field_h] & 16)) {
                      sa.field_c = sa.field_c + 0.05;
                    }
                    if ((8 & kd.field_f[ji.field_h]) != 0) {
                      rc.field_h = rc.field_h * 1.100000023841858f;
                    }
                    if (0 != (kd.field_f[ji.field_h] & 128)) {
                      if (0.800000011920929f > ij.field_ab) {
                        ij.field_ab = ij.field_ab + 0.02857142873108387f;
                      }
                      if (param0) {
                        stackIn_100_0 = 0;
                      } else {
                        stackIn_100_0 = 1;
                      }
                      sa.b(stackIn_100_0 != 0);
                    }
                    return;
                  }
                }
                if (0 == (kd.field_f[ji.field_h] & 16)) {
                  if ((8 & kd.field_f[ji.field_h]) != 0) {
                    rc.field_h = rc.field_h * 1.100000023841858f;
                    if (0 != (kd.field_f[ji.field_h] & 128)) {
                      if (0.800000011920929f > ij.field_ab) {
                        ij.field_ab = ij.field_ab + 0.02857142873108387f;
                      }
                      if (param0) {
                        stackIn_135_0 = 0;
                      } else {
                        stackIn_135_0 = 1;
                      }
                      sa.b(stackIn_135_0 != 0);
                    }
                    return;
                  } else {
                    if (0 != (kd.field_f[ji.field_h] & 128)) {
                      if (0.800000011920929f > ij.field_ab) {
                        ij.field_ab = ij.field_ab + 0.02857142873108387f;
                      }
                      if (param0) {
                        stackIn_125_0 = 0;
                      } else {
                        stackIn_125_0 = 1;
                      }
                      sa.b(stackIn_125_0 != 0);
                    }
                    return;
                  }
                } else {
                  sa.field_c = sa.field_c + 0.05;
                  if ((8 & kd.field_f[ji.field_h]) != 0) {
                    rc.field_h = rc.field_h * 1.100000023841858f;
                  }
                  if (0 != (kd.field_f[ji.field_h] & 128)) {
                    if (0.800000011920929f > ij.field_ab) {
                      ij.field_ab = ij.field_ab + 0.02857142873108387f;
                    }
                    if (param0) {
                      stackIn_114_0 = 0;
                    } else {
                      stackIn_114_0 = 1;
                    }
                    sa.b(stackIn_114_0 != 0);
                  }
                  return;
                }
              }
            } else {
              ag.field_k = ag.field_k + 1;
              if (param0) {
                ld.b(true);
              }
              if ((kd.field_f[ji.field_h] & 2) != 0) {
                if (f.field_qb < 7) {
                  f.field_qb = f.field_qb + 1;
                }
              }
              if (0 != (kd.field_f[ji.field_h] & 16)) {
                sa.field_c = sa.field_c + 0.05;
              }
              if ((8 & kd.field_f[ji.field_h]) != 0) {
                rc.field_h = rc.field_h * 1.100000023841858f;
              }
              if (0 != (kd.field_f[ji.field_h] & 128)) {
                if (0.800000011920929f > ij.field_ab) {
                  ij.field_ab = ij.field_ab + 0.02857142873108387f;
                }
                if (param0) {
                  stackIn_83_0 = 0;
                } else {
                  stackIn_83_0 = 1;
                }
                sa.b(stackIn_83_0 != 0);
              }
              return;
            }
          } else {
            if (param0) {
              ld.b(true);
              if ((kd.field_f[ji.field_h] & 2) == 0) {
                if (0 != (kd.field_f[ji.field_h] & 16)) {
                  sa.field_c = sa.field_c + 0.05;
                }
                if ((8 & kd.field_f[ji.field_h]) != 0) {
                  rc.field_h = rc.field_h * 1.100000023841858f;
                }
                if (0 != (kd.field_f[ji.field_h] & 128)) {
                  if (0.800000011920929f > ij.field_ab) {
                    ij.field_ab = ij.field_ab + 0.02857142873108387f;
                  }
                  if (param0) {
                    stackIn_61_0 = 0;
                  } else {
                    stackIn_61_0 = 1;
                  }
                  sa.b(stackIn_61_0 != 0);
                }
                return;
              } else {
                if (f.field_qb < 7) {
                  f.field_qb = f.field_qb + 1;
                }
                if (0 != (kd.field_f[ji.field_h] & 16)) {
                  sa.field_c = sa.field_c + 0.05;
                }
                if ((8 & kd.field_f[ji.field_h]) != 0) {
                  rc.field_h = rc.field_h * 1.100000023841858f;
                }
                if (0 != (kd.field_f[ji.field_h] & 128)) {
                  if (0.800000011920929f > ij.field_ab) {
                    ij.field_ab = ij.field_ab + 0.02857142873108387f;
                  }
                  if (param0) {
                    stackIn_47_0 = 0;
                  } else {
                    stackIn_47_0 = 1;
                  }
                  sa.b(stackIn_47_0 != 0);
                }
                return;
              }
            } else {
              if ((kd.field_f[ji.field_h] & 2) != 0) {
                if (f.field_qb < 7) {
                  f.field_qb = f.field_qb + 1;
                }
              }
              if (0 != (kd.field_f[ji.field_h] & 16)) {
                sa.field_c = sa.field_c + 0.05;
              }
              if ((8 & kd.field_f[ji.field_h]) != 0) {
                rc.field_h = rc.field_h * 1.100000023841858f;
              }
              if (0 != (kd.field_f[ji.field_h] & 128)) {
                if (0.800000011920929f > ij.field_ab) {
                  ij.field_ab = ij.field_ab + 0.02857142873108387f;
                }
                if (param0) {
                  stackIn_29_0 = 0;
                } else {
                  stackIn_29_0 = 1;
                }
                sa.b(stackIn_29_0 != 0);
              }
              return;
            }
          }
        } else {
          if (sa.field_c > 0.15000000000000002) {
            sa.field_c = sa.field_c - 0.05;
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        ug.a(param3, true, param0, 1, param1);
        if (param2 > 39) {
            return;
        }
        ld.a(118);
    }

    static {
        field_a = "+2,000 for being great!";
        field_c = new java.math.BigInteger("65537");
    }
}
