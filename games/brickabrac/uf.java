/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static int field_c;
    static mf field_a;
    static boolean[] field_d;
    static int field_b;
    static jp field_e;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 85) {
            return;
        }
        field_e = null;
        field_d = null;
    }

    final static boolean b(int param0, int param1) {
        int stackIn_26_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_138_0 = 0;
        int stackOut_137_0;
        int stackOut_126_0;
        int stackOut_125_0;
        int stackOut_113_0;
        int stackOut_102_0;
        int stackOut_101_0;
        int stackOut_112_0;
        int stackOut_136_0;
        int stackOut_87_0;
        int stackOut_76_0;
        int stackOut_75_0;
        int stackOut_86_0;
        int stackOut_63_0;
        int stackOut_62_0;
        int stackOut_43_0;
        int stackOut_42_0;
        int stackOut_25_0;
        int stackOut_24_0;
        if (param0 <= -84) {
          if (!pe.field_l[82]) {
            if (!pe.field_l[86]) {
              if (-17 < (param1 ^ -1)) {
                if (param1 < 32) {
                  L0: {
                    L1: {
                      if ((param1 ^ -1) > -49) {
                        if (param1 > -65) {
                          if (param1 == 80) {
                            break L1;
                          } else {
                            if (-84 == (param1 ^ -1)) {
                              break L1;
                            } else {
                              if ((param1 ^ -1) == -85) {
                                break L1;
                              } else {
                                if (85 == param1) {
                                  break L1;
                                } else {
                                  if (param1 == 59) {
                                    break L1;
                                  } else {
                                    if (74 == param1) {
                                      break L1;
                                    } else {
                                      if (28 != param1) {
                                        stackOut_137_0 = 0;
                                        stackIn_138_0 = stackOut_137_0;
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
                          if (73 >= param1) {
                            break L1;
                          } else {
                            L2: {
                              L3: {
                                if (param1 == 80) {
                                  break L3;
                                } else {
                                  if (-84 == param1) {
                                    break L3;
                                  } else {
                                    if ((param1 ^ -1) == -85) {
                                      break L3;
                                    } else {
                                      if (85 == param1) {
                                        break L3;
                                      } else {
                                        if (param1 == 59) {
                                          break L3;
                                        } else {
                                          if (74 == param1) {
                                            break L3;
                                          } else {
                                            if (28 != param1) {
                                              stackOut_126_0 = 0;
                                              stackIn_127_0 = stackOut_126_0;
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
                              stackOut_125_0 = 1;
                              stackIn_127_0 = stackOut_125_0;
                              break L2;
                            }
                            return stackIn_127_0 != 0;
                          }
                        }
                      } else {
                        if (58 >= param1) {
                          break L1;
                        } else {
                          L4: {
                            L5: {
                              if (param1 > -65) {
                                if (param1 == 80) {
                                  break L5;
                                } else {
                                  if (-84 == (param1 ^ -1)) {
                                    break L5;
                                  } else {
                                    if ((param1 ^ -1) == -85) {
                                      break L5;
                                    } else {
                                      if (85 == param1) {
                                        break L5;
                                      } else {
                                        if (param1 == 59) {
                                          break L5;
                                        } else {
                                          if (74 == param1) {
                                            break L5;
                                          } else {
                                            if (28 != param1) {
                                              stackOut_113_0 = 0;
                                              stackIn_114_0 = stackOut_113_0;
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
                                if (73 >= param1) {
                                  break L5;
                                } else {
                                  L6: {
                                    L7: {
                                      if (param1 == 80) {
                                        break L7;
                                      } else {
                                        if (-84 == param1) {
                                          break L7;
                                        } else {
                                          if ((param1 ^ -1) == -85) {
                                            break L7;
                                          } else {
                                            if (85 == param1) {
                                              break L7;
                                            } else {
                                              if (param1 == 59) {
                                                break L7;
                                              } else {
                                                if (74 == param1) {
                                                  break L7;
                                                } else {
                                                  if (28 != param1) {
                                                    stackOut_102_0 = 0;
                                                    stackIn_103_0 = stackOut_102_0;
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
                                    stackOut_101_0 = 1;
                                    stackIn_103_0 = stackOut_101_0;
                                    break L6;
                                  }
                                  return stackIn_103_0 != 0;
                                }
                              }
                            }
                            stackOut_112_0 = 1;
                            stackIn_114_0 = stackOut_112_0;
                            break L4;
                          }
                          return stackIn_114_0 != 0;
                        }
                      }
                    }
                    stackOut_136_0 = 1;
                    stackIn_138_0 = stackOut_136_0;
                    break L0;
                  }
                  return stackIn_138_0 != 0;
                } else {
                  if (param1 > 43) {
                    if ((param1 ^ -1) > -49) {
                      L8: {
                        L9: {
                          if (param1 > -65) {
                            if (param1 == 80) {
                              break L9;
                            } else {
                              if (-84 == (param1 ^ -1)) {
                                break L9;
                              } else {
                                if ((param1 ^ -1) == -85) {
                                  break L9;
                                } else {
                                  if (85 == param1) {
                                    break L9;
                                  } else {
                                    if (param1 == 59) {
                                      break L9;
                                    } else {
                                      if (74 == param1) {
                                        break L9;
                                      } else {
                                        if (28 != param1) {
                                          stackOut_87_0 = 0;
                                          stackIn_88_0 = stackOut_87_0;
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
                            if (73 >= param1) {
                              break L9;
                            } else {
                              L10: {
                                L11: {
                                  if (param1 == 80) {
                                    break L11;
                                  } else {
                                    if (-84 == param1) {
                                      break L11;
                                    } else {
                                      if ((param1 ^ -1) == -85) {
                                        break L11;
                                      } else {
                                        if (85 == param1) {
                                          break L11;
                                        } else {
                                          if (param1 == 59) {
                                            break L11;
                                          } else {
                                            if (74 == param1) {
                                              break L11;
                                            } else {
                                              if (28 != param1) {
                                                stackOut_76_0 = 0;
                                                stackIn_77_0 = stackOut_76_0;
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
                                stackOut_75_0 = 1;
                                stackIn_77_0 = stackOut_75_0;
                                break L10;
                              }
                              return stackIn_77_0 != 0;
                            }
                          }
                        }
                        stackOut_86_0 = 1;
                        stackIn_88_0 = stackOut_86_0;
                        break L8;
                      }
                      return stackIn_88_0 != 0;
                    } else {
                      if (58 < param1) {
                        L12: {
                          L13: {
                            L14: {
                              if (param1 > -65) {
                                break L14;
                              } else {
                                if (73 >= param1) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (param1 == 80) {
                              break L13;
                            } else {
                              if (-84 == param1) {
                                break L13;
                              } else {
                                if ((param1 ^ -1) == -85) {
                                  break L13;
                                } else {
                                  if (85 == param1) {
                                    break L13;
                                  } else {
                                    if (param1 == 59) {
                                      break L13;
                                    } else {
                                      if (74 == param1) {
                                        break L13;
                                      } else {
                                        if (28 != param1) {
                                          stackOut_63_0 = 0;
                                          stackIn_64_0 = stackOut_63_0;
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
                          stackOut_62_0 = 1;
                          stackIn_64_0 = stackOut_62_0;
                          break L12;
                        }
                        return stackIn_64_0 != 0;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                if ((param1 ^ -1) < -28) {
                  if (param1 >= 32) {
                    L15: {
                      L16: {
                        if (param1 <= 43) {
                          break L16;
                        } else {
                          L17: {
                            if ((param1 ^ -1) > -49) {
                              break L17;
                            } else {
                              if (58 >= param1) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L18: {
                            if (param1 > -65) {
                              break L18;
                            } else {
                              if (73 >= param1) {
                                break L16;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if (param1 == 80) {
                            break L16;
                          } else {
                            if (-84 == param1) {
                              break L16;
                            } else {
                              if ((param1 ^ -1) == -85) {
                                break L16;
                              } else {
                                if (85 == param1) {
                                  break L16;
                                } else {
                                  if (param1 == 59) {
                                    break L16;
                                  } else {
                                    if (74 == param1) {
                                      break L16;
                                    } else {
                                      if (28 != param1) {
                                        stackOut_43_0 = 0;
                                        stackIn_44_0 = stackOut_43_0;
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
                      stackOut_42_0 = 1;
                      stackIn_44_0 = stackOut_42_0;
                      break L15;
                    }
                    return stackIn_44_0 != 0;
                  } else {
                    L19: {
                      L20: {
                        L21: {
                          if ((param1 ^ -1) > -49) {
                            break L21;
                          } else {
                            if (58 >= param1) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        L22: {
                          if (param1 > -65) {
                            break L22;
                          } else {
                            if (73 >= param1) {
                              break L20;
                            } else {
                              break L22;
                            }
                          }
                        }
                        if (param1 == 80) {
                          break L20;
                        } else {
                          if (-84 == param1) {
                            break L20;
                          } else {
                            if ((param1 ^ -1) == -85) {
                              break L20;
                            } else {
                              if (85 == param1) {
                                break L20;
                              } else {
                                if (param1 == 59) {
                                  break L20;
                                } else {
                                  if (74 == param1) {
                                    break L20;
                                  } else {
                                    if (28 != param1) {
                                      stackOut_25_0 = 0;
                                      stackIn_26_0 = stackOut_25_0;
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
                      stackOut_24_0 = 1;
                      stackIn_26_0 = stackOut_24_0;
                      break L19;
                    }
                    return stackIn_26_0 != 0;
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
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        for (var2 = param1; var2 < param0; var2++) {
            vq.a(5 + ip.field_r.a(-37880252, 2), 1273378209, ip.field_r.a(-37880252, 3) + 9);
        }
    }

    final static String a(String param0, int param1, String param2, int param3) {
        CharSequence var9 = (CharSequence) (Object) param0;
        if (!tk.a(var9, false)) {
            return om.field_Xb;
        }
        if (!(2 == wk.field_m)) {
            return hd.field_b;
        }
        mp var8 = jf.a(0, param2);
        int var5 = 42 / ((15 - param3) / 34);
        if (var8 == null) {
            return rd.a(to.field_h, new String[1], (byte) 103);
        }
        var8.b((byte) 111);
        var8.d(3);
        fo.field_h = fo.field_h - 1;
        pi var6 = k.field_h;
        var6.e(-13413, param1);
        var6.field_l = var6.field_l + 1;
        int var7 = var6.field_l;
        var6.a(16, 3);
        var6.a(param0, -1);
        var6.d((byte) 117, -var7 + var6.field_l);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new boolean[64];
    }
}
