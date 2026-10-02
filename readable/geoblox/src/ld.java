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

    final static boolean hasPixelsAtPlayfieldBoundary(int methodGuard) {
        int previousCircleVerticalOffset = 0;
        int leftCardinalHit = 0;
        int rightCardinalHit = 0;
        int topCardinalHit = 0;
        int bottomCardinalHit = 0;
        int upperFarLeftHit = 0;
        int upperFarRightHit = 0;
        int upperNearLeftHit = 0;
        int upperNearRightHit = 0;
        int lowerNearLeftHit = 0;
        int lowerNearRightHit = 0;
        int lowerFarLeftHit = 0;
        int lowerFarRightHit = 0;
        int boundaryScanMissResult = 0;
        int boundaryResultArmId = 0;
        RuntimeException caughtBoundaryScanFailure = null;
        int upperNearRowCenterIndex = 0;
        RuntimeException boundaryScanFailureForContext = null;
        int lowerNearRowCenterIndex = 0;
        int upperFarRowCenterIndex = 0;
        int lowerFarRowCenterIndex = 0;
        int circleHorizontalOffset = 0;
        int circleVerticalOffset = 0;
        int playfieldRadiusSquared = 0;
        int guardDivisionResult = 0;
        int circleError = 0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.field_C;
        try {
          L0: {
            upperNearRowCenterIndex = 240 * SoftwareRasterizer.stride + 320;
            lowerNearRowCenterIndex = upperNearRowCenterIndex;
            upperFarRowCenterIndex = -(230 * SoftwareRasterizer.stride) + upperNearRowCenterIndex;
            lowerFarRowCenterIndex = 230 * SoftwareRasterizer.stride + upperNearRowCenterIndex;
            circleHorizontalOffset = 230;
            circleVerticalOffset = 0;
            playfieldRadiusSquared = 52900;
            guardDivisionResult = 64 / ((methodGuard - 32) / 34);
            circleError = playfieldRadiusSquared - circleHorizontalOffset;
            if (SoftwareRasterizer.framebuffer[-circleHorizontalOffset + upperNearRowCenterIndex] != 0) {
              leftCardinalHit = 1;
              boundaryResultArmId = 0;
            } else {
              if (0 == SoftwareRasterizer.framebuffer[upperNearRowCenterIndex + circleHorizontalOffset]) {
                if (SoftwareRasterizer.framebuffer[upperFarRowCenterIndex] != 0) {
                  topCardinalHit = 1;
                  boundaryResultArmId = 2;
                } else {
                  if (SoftwareRasterizer.framebuffer[lowerFarRowCenterIndex] != 0) {
                    bottomCardinalHit = 1;
                    boundaryResultArmId = 3;
                  } else {
                    L1: while (true) {
                      previousCircleVerticalOffset = circleVerticalOffset;
                      circleVerticalOffset++;
                      circleError = circleError + (previousCircleVerticalOffset + circleVerticalOffset);
                      lowerNearRowCenterIndex = lowerNearRowCenterIndex + SoftwareRasterizer.stride;
                      upperNearRowCenterIndex = upperNearRowCenterIndex - SoftwareRasterizer.stride;
                      if (playfieldRadiusSquared < circleError) {
                        upperFarRowCenterIndex = upperFarRowCenterIndex + SoftwareRasterizer.stride;
                        lowerFarRowCenterIndex = lowerFarRowCenterIndex - SoftwareRasterizer.stride;
                        circleHorizontalOffset--;
                        circleError = circleError - (circleHorizontalOffset + circleHorizontalOffset);
                      }
                      if (circleVerticalOffset > circleHorizontalOffset) {
                        boundaryScanMissResult = 0;
                        boundaryResultArmId = 12;
                        break L0;
                      } else {
                        if (0 == SoftwareRasterizer.framebuffer[-circleVerticalOffset + upperFarRowCenterIndex]) {
                          if (SoftwareRasterizer.framebuffer[upperFarRowCenterIndex + circleVerticalOffset] == 0) {
                            if (SoftwareRasterizer.framebuffer[-circleHorizontalOffset + upperNearRowCenterIndex] == 0) {
                              if (SoftwareRasterizer.framebuffer[circleHorizontalOffset + upperNearRowCenterIndex] == 0) {
                                if (SoftwareRasterizer.framebuffer[lowerNearRowCenterIndex - circleHorizontalOffset] != 0) {
                                  lowerNearLeftHit = 1;
                                  boundaryResultArmId = 8;
                                  break L0;
                                } else {
                                  if (SoftwareRasterizer.framebuffer[circleHorizontalOffset + lowerNearRowCenterIndex] == 0) {
                                    if (SoftwareRasterizer.framebuffer[lowerFarRowCenterIndex - circleVerticalOffset] != 0) {
                                      lowerFarLeftHit = 1;
                                      boundaryResultArmId = 10;
                                      break L0;
                                    } else {
                                      if (SoftwareRasterizer.framebuffer[lowerFarRowCenterIndex + circleVerticalOffset] != 0) {
                                        lowerFarRightHit = 1;
                                        boundaryResultArmId = 11;
                                        break L0;
                                      } else {
                                        continue L1;
                                      }
                                    }
                                  } else {
                                    lowerNearRightHit = 1;
                                    boundaryResultArmId = 9;
                                    break L0;
                                  }
                                }
                              } else {
                                upperNearRightHit = 1;
                                boundaryResultArmId = 7;
                                break L0;
                              }
                            } else {
                              upperNearLeftHit = 1;
                              boundaryResultArmId = 6;
                              break L0;
                            }
                          } else {
                            upperFarRightHit = 1;
                            boundaryResultArmId = 5;
                            break L0;
                          }
                        } else {
                          upperFarLeftHit = 1;
                          boundaryResultArmId = 4;
                          break L0;
                        }
                      }
                    }
                  }
                }
              } else {
                rightCardinalHit = 1;
                boundaryResultArmId = 1;
              }
            }
          }
        } catch (java.lang.RuntimeException boundaryScanFailure) {
          caughtBoundaryScanFailure = boundaryScanFailure;
          boundaryScanFailureForContext = caughtBoundaryScanFailure;
          throw t.a((Throwable) ((Object) boundaryScanFailureForContext), "ld.B(" + methodGuard + ')');
        }
        if (boundaryResultArmId == 0) {
          return leftCardinalHit != 0;
        } else {
          if (boundaryResultArmId == 1) {
            return rightCardinalHit != 0;
          } else {
            if (boundaryResultArmId == 2) {
              return topCardinalHit != 0;
            } else {
              if (boundaryResultArmId == 3) {
                return bottomCardinalHit != 0;
              } else {
                if (boundaryResultArmId == 4) {
                  return upperFarLeftHit != 0;
                } else {
                  if (boundaryResultArmId == 5) {
                    return upperFarRightHit != 0;
                  } else {
                    if (boundaryResultArmId == 6) {
                      return upperNearLeftHit != 0;
                    } else {
                      if (boundaryResultArmId == 7) {
                        return upperNearRightHit != 0;
                      } else {
                        if (boundaryResultArmId == 8) {
                          return lowerNearLeftHit != 0;
                        } else {
                          if (boundaryResultArmId == 9) {
                            return lowerNearRightHit != 0;
                          } else {
                            if (boundaryResultArmId == 10) {
                              return lowerFarLeftHit != 0;
                            } else {
                              if (boundaryResultArmId == 11) {
                                return lowerFarRightHit != 0;
                              } else {
                                return boundaryScanMissResult != 0;
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
