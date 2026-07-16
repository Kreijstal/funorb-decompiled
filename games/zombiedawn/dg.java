/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dg extends IOException {
    static boolean field_a;
    static boolean field_b;

    dg(String param0) {
        super(param0);
    }

    final static boolean a(byte param0, int param1) {
        int var2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_136_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var2 = -126 % ((param0 - -41) / 46);
        if (!bo.field_p[82]) {
          if (!bo.field_p[86]) {
            if (16 > param1) {
              if (32 > param1) {
                L0: {
                  L1: {
                    if (-49 < (param1 ^ -1)) {
                      if (-65 < (param1 ^ -1)) {
                        if (param1 == 80) {
                          break L1;
                        } else {
                          if (83 == param1) {
                            break L1;
                          } else {
                            if ((param1 ^ -1) == -85) {
                              break L1;
                            } else {
                              if (-86 == (param1 ^ -1)) {
                                break L1;
                              } else {
                                if (59 == param1) {
                                  break L1;
                                } else {
                                  if (74 == param1) {
                                    break L1;
                                  } else {
                                    if (28 != param1) {
                                      stackOut_135_0 = 0;
                                      stackIn_136_0 = stackOut_135_0;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (-74 <= (param1 ^ -1)) {
                          break L1;
                        } else {
                          L2: {
                            L3: {
                              if (param1 == 80) {
                                break L3;
                              } else {
                                if (83 == param1) {
                                  break L3;
                                } else {
                                  if ((param1 ^ -1) == -85) {
                                    break L3;
                                  } else {
                                    if (-86 == (param1 ^ -1)) {
                                      break L3;
                                    } else {
                                      if (59 == param1) {
                                        break L3;
                                      } else {
                                        if (74 == param1) {
                                          break L3;
                                        } else {
                                          if (28 != param1) {
                                            stackOut_124_0 = 0;
                                            stackIn_125_0 = stackOut_124_0;
                                            break L2;
                                          } else {
                                            return true;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_123_0 = 1;
                            stackIn_125_0 = stackOut_123_0;
                            break L2;
                          }
                          return stackIn_125_0 != 0;
                        }
                      }
                    } else {
                      if ((param1 ^ -1) >= -59) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (-65 < (param1 ^ -1)) {
                              if (param1 == 80) {
                                break L5;
                              } else {
                                if (83 == param1) {
                                  break L5;
                                } else {
                                  if ((param1 ^ -1) == -85) {
                                    break L5;
                                  } else {
                                    if (-86 == (param1 ^ -1)) {
                                      break L5;
                                    } else {
                                      if (59 == param1) {
                                        break L5;
                                      } else {
                                        if (74 == param1) {
                                          break L5;
                                        } else {
                                          if (28 != param1) {
                                            stackOut_111_0 = 0;
                                            stackIn_112_0 = stackOut_111_0;
                                            break L4;
                                          } else {
                                            return true;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (-74 <= (param1 ^ -1)) {
                                break L5;
                              } else {
                                L6: {
                                  L7: {
                                    if (param1 == 80) {
                                      break L7;
                                    } else {
                                      if (83 == param1) {
                                        break L7;
                                      } else {
                                        if ((param1 ^ -1) == -85) {
                                          break L7;
                                        } else {
                                          if (-86 == (param1 ^ -1)) {
                                            break L7;
                                          } else {
                                            if (59 == param1) {
                                              break L7;
                                            } else {
                                              if (74 == param1) {
                                                break L7;
                                              } else {
                                                if (28 != param1) {
                                                  stackOut_100_0 = 0;
                                                  stackIn_101_0 = stackOut_100_0;
                                                  break L6;
                                                } else {
                                                  return true;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_99_0 = 1;
                                  stackIn_101_0 = stackOut_99_0;
                                  break L6;
                                }
                                return stackIn_101_0 != 0;
                              }
                            }
                          }
                          stackOut_110_0 = 1;
                          stackIn_112_0 = stackOut_110_0;
                          break L4;
                        }
                        return stackIn_112_0 != 0;
                      }
                    }
                  }
                  stackOut_134_0 = 1;
                  stackIn_136_0 = stackOut_134_0;
                  break L0;
                }
                return stackIn_136_0 != 0;
              } else {
                if (param1 > 43) {
                  if (-49 < (param1 ^ -1)) {
                    L8: {
                      L9: {
                        if (-65 < (param1 ^ -1)) {
                          if (param1 == 80) {
                            break L9;
                          } else {
                            if (83 == param1) {
                              break L9;
                            } else {
                              if ((param1 ^ -1) == -85) {
                                break L9;
                              } else {
                                if (-86 == (param1 ^ -1)) {
                                  break L9;
                                } else {
                                  if (59 == param1) {
                                    break L9;
                                  } else {
                                    if (74 == param1) {
                                      break L9;
                                    } else {
                                      if (28 != param1) {
                                        stackOut_85_0 = 0;
                                        stackIn_86_0 = stackOut_85_0;
                                        break L8;
                                      } else {
                                        return true;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (-74 <= (param1 ^ -1)) {
                            break L9;
                          } else {
                            L10: {
                              L11: {
                                if (param1 == 80) {
                                  break L11;
                                } else {
                                  if (83 == param1) {
                                    break L11;
                                  } else {
                                    if ((param1 ^ -1) == -85) {
                                      break L11;
                                    } else {
                                      if (-86 == (param1 ^ -1)) {
                                        break L11;
                                      } else {
                                        if (59 == param1) {
                                          break L11;
                                        } else {
                                          if (74 == param1) {
                                            break L11;
                                          } else {
                                            if (28 != param1) {
                                              stackOut_74_0 = 0;
                                              stackIn_75_0 = stackOut_74_0;
                                              break L10;
                                            } else {
                                              return true;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_73_0 = 1;
                              stackIn_75_0 = stackOut_73_0;
                              break L10;
                            }
                            return stackIn_75_0 != 0;
                          }
                        }
                      }
                      stackOut_84_0 = 1;
                      stackIn_86_0 = stackOut_84_0;
                      break L8;
                    }
                    return stackIn_86_0 != 0;
                  } else {
                    if ((param1 ^ -1) < -59) {
                      L12: {
                        L13: {
                          L14: {
                            if (-65 < (param1 ^ -1)) {
                              break L14;
                            } else {
                              if (-74 <= (param1 ^ -1)) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (param1 == 80) {
                            break L13;
                          } else {
                            if (83 == param1) {
                              break L13;
                            } else {
                              if ((param1 ^ -1) == -85) {
                                break L13;
                              } else {
                                if (-86 == (param1 ^ -1)) {
                                  break L13;
                                } else {
                                  if (59 == param1) {
                                    break L13;
                                  } else {
                                    if (74 == param1) {
                                      break L13;
                                    } else {
                                      if (28 != param1) {
                                        stackOut_61_0 = 0;
                                        stackIn_62_0 = stackOut_61_0;
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_60_0 = 1;
                        stackIn_62_0 = stackOut_60_0;
                        break L12;
                      }
                      return stackIn_62_0 != 0;
                    } else {
                      return true;
                    }
                  }
                } else {
                  return true;
                }
              }
            } else {
              if (27 < param1) {
                if (32 <= param1) {
                  L15: {
                    L16: {
                      if (param1 <= 43) {
                        break L16;
                      } else {
                        L17: {
                          if (-49 < (param1 ^ -1)) {
                            break L17;
                          } else {
                            if ((param1 ^ -1) >= -59) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (-65 < (param1 ^ -1)) {
                            break L18;
                          } else {
                            if (-74 <= (param1 ^ -1)) {
                              break L16;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (param1 == 80) {
                          break L16;
                        } else {
                          if (83 == param1) {
                            break L16;
                          } else {
                            if ((param1 ^ -1) == -85) {
                              break L16;
                            } else {
                              if (-86 == (param1 ^ -1)) {
                                break L16;
                              } else {
                                if (59 == param1) {
                                  break L16;
                                } else {
                                  if (74 == param1) {
                                    break L16;
                                  } else {
                                    if (28 != param1) {
                                      stackOut_41_0 = 0;
                                      stackIn_42_0 = stackOut_41_0;
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_40_0 = 1;
                    stackIn_42_0 = stackOut_40_0;
                    break L15;
                  }
                  return stackIn_42_0 != 0;
                } else {
                  L19: {
                    L20: {
                      L21: {
                        if (-49 < (param1 ^ -1)) {
                          break L21;
                        } else {
                          if ((param1 ^ -1) >= -59) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      L22: {
                        if (-65 < (param1 ^ -1)) {
                          break L22;
                        } else {
                          if (-74 <= (param1 ^ -1)) {
                            break L20;
                          } else {
                            break L22;
                          }
                        }
                      }
                      if (param1 == 80) {
                        break L20;
                      } else {
                        if (83 == param1) {
                          break L20;
                        } else {
                          if ((param1 ^ -1) == -85) {
                            break L20;
                          } else {
                            if (-86 == (param1 ^ -1)) {
                              break L20;
                            } else {
                              if (59 == param1) {
                                break L20;
                              } else {
                                if (74 == param1) {
                                  break L20;
                                } else {
                                  if (28 != param1) {
                                    stackOut_23_0 = 0;
                                    stackIn_24_0 = stackOut_23_0;
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_22_0 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    break L19;
                  }
                  return stackIn_24_0 != 0;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static boolean a(am param0, boolean param1) {
        if (param1) {
            return true;
        }
        return param0.k(111, 1) == 1 ? true : false;
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if ((ld.field_j ^ -1) > -11) {
          L0: {
            var3 = 0;
            if (nd.field_b) {
              nd.field_b = false;
              var3 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          ja.a(jb.a((byte) -58), ud.field_c, var3 != 0, dp.a(param1 + -103), (byte) -90);
          if (param1 != 0) {
            field_b = false;
            return;
          } else {
            return;
          }
        } else {
          if (!kk.a(param1 ^ -251)) {
            bi.d();
            dp.a(320, -12138, 240);
            uh.a(40, 0, 0, param0);
            if (param1 != 0) {
              field_b = false;
              return;
            } else {
              return;
            }
          } else {
            if (fl.field_a == 0) {
              uo.a(false, -28518, param2);
              uh.a(param1 ^ -120, 0, 0, param0);
              if (param1 == 0) {
                return;
              } else {
                field_b = false;
                return;
              }
            } else {
              am.a(param0, (byte) -94);
              if (param1 == 0) {
                return;
              } else {
                field_b = false;
                return;
              }
            }
          }
        }
    }

    final static int a(byte param0) {
        if (param0 != -120) {
            field_a = false;
            return nl.field_s;
        }
        return nl.field_s;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
