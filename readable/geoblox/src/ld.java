/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static Sprite[] field_b;
    static String field_a;
    static java.math.BigInteger field_c;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            field_b = (Sprite[]) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static boolean hasPixelsAtPlayfieldBoundary(int param0) {
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
        int circleHorizontalOffset = 0;
        int circleVerticalOffset = 0;
        int playfieldRadiusSquared = 0;
        int var8 = 0;
        int circleError = 0;
        int var10 = 0;
        var10 = Geoblox.field_C;
        try {
          L0: {
            var1_int = 240 * SoftwareRasterizer.stride + 320;
            var2 = var1_int;
            var3 = -(230 * SoftwareRasterizer.stride) + var1_int;
            var4 = 230 * SoftwareRasterizer.stride + var1_int;
            circleHorizontalOffset = 230;
            circleVerticalOffset = 0;
            playfieldRadiusSquared = 52900;
            var8 = 64 / ((param0 - 32) / 34);
            circleError = playfieldRadiusSquared - circleHorizontalOffset;
            if (SoftwareRasterizer.framebuffer[-circleHorizontalOffset + var1_int] != 0) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
            } else {
              if (0 == SoftwareRasterizer.framebuffer[var1_int - -circleHorizontalOffset]) {
                if (SoftwareRasterizer.framebuffer[var3] != 0) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                } else {
                  if (SoftwareRasterizer.framebuffer[var4] != 0) {
                    stackIn_15_0 = 1;
                    decompiledRegionSelector0 = 3;
                  } else {
                    L1: while (true) {
                      incrementValue$0 = circleVerticalOffset;
                      circleVerticalOffset++;
                      circleError = circleError + (incrementValue$0 - -circleVerticalOffset);
                      var2 = var2 + SoftwareRasterizer.stride;
                      var1_int = var1_int - SoftwareRasterizer.stride;
                      if (playfieldRadiusSquared < circleError) {
                        var3 = var3 + SoftwareRasterizer.stride;
                        var4 = var4 - SoftwareRasterizer.stride;
                        circleHorizontalOffset--;
                        circleError = circleError - (circleHorizontalOffset + circleHorizontalOffset);
                      }
                      if (circleVerticalOffset > circleHorizontalOffset) {
                        stackIn_47_0 = 0;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      } else {
                        if (0 == SoftwareRasterizer.framebuffer[-circleVerticalOffset + var3]) {
                          if (SoftwareRasterizer.framebuffer[var3 + circleVerticalOffset] == 0) {
                            if (SoftwareRasterizer.framebuffer[-circleHorizontalOffset + var1_int] == 0) {
                              if (SoftwareRasterizer.framebuffer[circleHorizontalOffset + var1_int] == 0) {
                                if (SoftwareRasterizer.framebuffer[var2 - circleHorizontalOffset] != 0) {
                                  stackIn_34_0 = 1;
                                  decompiledRegionSelector0 = 8;
                                  break L0;
                                } else {
                                  if (SoftwareRasterizer.framebuffer[circleHorizontalOffset + var2] == 0) {
                                    if (SoftwareRasterizer.framebuffer[var4 - circleVerticalOffset] != 0) {
                                      stackIn_41_0 = 1;
                                      decompiledRegionSelector0 = 10;
                                      break L0;
                                    } else {
                                      if (SoftwareRasterizer.framebuffer[var4 - -circleVerticalOffset] != 0) {
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

    final static void advanceDifficulty(boolean param0) {
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
        ji.difficultyStep = ji.difficultyStep + 1;
        if (ji.difficultyStep < kd.field_f.length) {
          if ((4 & kd.field_f[ji.difficultyStep]) != 0) {
            og.entityMotionSpeed = og.entityMotionSpeed + 0.055555559694767f;
            if (param0) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = 1;
            }
            sa.b(stackIn_10_0 != 0);
          }
          if ((kd.field_f[ji.difficultyStep] & 1) != 0) {
            if (ag.field_k >= 7) {
              if (!param0) {
                if ((kd.field_f[ji.difficultyStep] & 2) != 0) {
                  if (f.field_qb < 7) {
                    f.field_qb = f.field_qb + 1;
                  } else {
                    if (0 == (kd.field_f[ji.difficultyStep] & 16)) {
                      if ((8 & kd.field_f[ji.difficultyStep]) != 0) {
                        DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
                        if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                        if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                      if ((8 & kd.field_f[ji.difficultyStep]) == 0) {
                        if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                        DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
                        if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                if (0 == (kd.field_f[ji.difficultyStep] & 16)) {
                  if ((8 & kd.field_f[ji.difficultyStep]) != 0) {
                    DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
                    if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                    if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                  if ((8 & kd.field_f[ji.difficultyStep]) != 0) {
                    DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
                    if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                    if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                ld.advanceDifficulty(true);
                if ((kd.field_f[ji.difficultyStep] & 2) != 0) {
                  if (f.field_qb < 7) {
                    f.field_qb = f.field_qb + 1;
                  } else {
                    if (0 != (kd.field_f[ji.difficultyStep] & 16)) {
                      sa.field_c = sa.field_c + 0.05;
                    }
                    if ((8 & kd.field_f[ji.difficultyStep]) != 0) {
                      DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
                    }
                    if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                if (0 == (kd.field_f[ji.difficultyStep] & 16)) {
                  if ((8 & kd.field_f[ji.difficultyStep]) != 0) {
                    DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
                    if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                    if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                  if ((8 & kd.field_f[ji.difficultyStep]) != 0) {
                    DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
                  }
                  if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                ld.advanceDifficulty(true);
              }
              if ((kd.field_f[ji.difficultyStep] & 2) != 0) {
                if (f.field_qb < 7) {
                  f.field_qb = f.field_qb + 1;
                }
              }
              if (0 != (kd.field_f[ji.difficultyStep] & 16)) {
                sa.field_c = sa.field_c + 0.05;
              }
              if ((8 & kd.field_f[ji.difficultyStep]) != 0) {
                DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
              }
              if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
              ld.advanceDifficulty(true);
              if ((kd.field_f[ji.difficultyStep] & 2) == 0) {
                if (0 != (kd.field_f[ji.difficultyStep] & 16)) {
                  sa.field_c = sa.field_c + 0.05;
                }
                if ((8 & kd.field_f[ji.difficultyStep]) != 0) {
                  DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
                }
                if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
                if (0 != (kd.field_f[ji.difficultyStep] & 16)) {
                  sa.field_c = sa.field_c + 0.05;
                }
                if ((8 & kd.field_f[ji.difficultyStep]) != 0) {
                  DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
                }
                if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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
              if ((kd.field_f[ji.difficultyStep] & 2) != 0) {
                if (f.field_qb < 7) {
                  f.field_qb = f.field_qb + 1;
                }
              }
              if (0 != (kd.field_f[ji.difficultyStep] & 16)) {
                sa.field_c = sa.field_c + 0.05;
              }
              if ((8 & kd.field_f[ji.difficultyStep]) != 0) {
                DualLinkNode.rotationStepRadians = DualLinkNode.rotationStepRadians * 1.100000023841858f;
              }
              if (0 != (kd.field_f[ji.difficultyStep] & 128)) {
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

    final static void spawnPointsPopup(int originY, int originX, int methodGuard, int points) {
        ug.spawnScorePopup(points, true, originY, 1, originX);
        if (methodGuard > 39) {
            return;
        }
        ld.hasPixelsAtPlayfieldBoundary(118);
    }

    static {
        field_a = "+2,000 for being great!";
        field_c = new java.math.BigInteger("65537");
    }
}
