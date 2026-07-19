/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oj extends tc {
    static int field_k;
    static String field_p;
    static String field_u;
    static at field_r;
    static int[] field_n;
    boolean field_o;
    static int field_v;
    jd field_w;
    static String field_x;
    static int[] field_t;
    int field_m;
    static int[] field_q;
    int field_s;
    static String field_l;

    abstract void a(ha param0, int param1);

    final void a(int param0) {
        this.field_o = false;
        if (param0 >= -30) {
            return;
        }
    }

    private final boolean e(int param0) {
        pu discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        bv var4 = null;
        int stackIn_102_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_101_0 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 1023) {
            break L0;
          } else {
            var4 = (bv) null;
            discarded$1 = oj.a(-38, (bv) null);
            break L0;
          }
        }
        L1: {
          var2 = this.field_m;
          if (0 != var2) {
            break L1;
          } else {
            if (var3 != 0) {
              break L1;
            } else {
              return true;
            }
          }
        }
        L2: {
          if (-2 != (var2 ^ -1)) {
            break L2;
          } else {
            if (var3 != 0) {
              break L2;
            } else {
              return true;
            }
          }
        }
        if ((var2 ^ -1) != -3) {
          L3: {
            if (-24 != (var2 ^ -1)) {
              break L3;
            } else {
              if (var3 != 0) {
                break L3;
              } else {
                return false;
              }
            }
          }
          if (var2 != 3) {
            L4: {
              if (4 != var2) {
                break L4;
              } else {
                if (var3 != 0) {
                  break L4;
                } else {
                  return true;
                }
              }
            }
            if (5 != var2) {
              if (6 != var2) {
                if (var2 != 21) {
                  if (var2 != 7) {
                    if (var2 != 8) {
                      L5: {
                        if (9 != var2) {
                          break L5;
                        } else {
                          if (var3 != 0) {
                            break L5;
                          } else {
                            return true;
                          }
                        }
                      }
                      if (10 != var2) {
                        L6: {
                          if (-12 != (var2 ^ -1)) {
                            if (var2 == 12) {
                              break L6;
                            } else {
                              if (13 == var2) {
                                break L6;
                              } else {
                                if (-15 == (var2 ^ -1)) {
                                  return true;
                                } else {
                                  if (var2 == 15) {
                                    return true;
                                  } else {
                                    if (var2 != 16) {
                                      if (-18 != (var2 ^ -1)) {
                                        if ((var2 ^ -1) != -19) {
                                          L7: {
                                            if (var2 == 19) {
                                              break L7;
                                            } else {
                                              if (-21 == (var2 ^ -1)) {
                                                break L7;
                                              } else {
                                                if (22 == var2) {
                                                  return true;
                                                } else {
                                                  if ((var2 ^ -1) != 0) {
                                                    L8: {
                                                      if (25 == var2) {
                                                        break L8;
                                                      } else {
                                                        if (var2 == 24) {
                                                          break L8;
                                                        } else {
                                                          if (27 == var2) {
                                                            break L8;
                                                          } else {
                                                            return false;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    return true;
                                                  } else {
                                                    if (var3 == 0) {
                                                      return false;
                                                    } else {
                                                      L9: {
                                                        if (25 == var2) {
                                                          break L9;
                                                        } else {
                                                          if (var2 == 24) {
                                                            break L9;
                                                          } else {
                                                            if (27 == var2) {
                                                              break L9;
                                                            } else {
                                                              return false;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      return true;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          return false;
                                        } else {
                                          if (var3 == 0) {
                                            return true;
                                          } else {
                                            L10: {
                                              if (var2 == 19) {
                                                break L10;
                                              } else {
                                                if (-21 == (var2 ^ -1)) {
                                                  break L10;
                                                } else {
                                                  if (22 == var2) {
                                                    return true;
                                                  } else {
                                                    if ((var2 ^ -1) != 0) {
                                                      L11: {
                                                        if (25 == var2) {
                                                          break L11;
                                                        } else {
                                                          if (var2 == 24) {
                                                            break L11;
                                                          } else {
                                                            if (27 == var2) {
                                                              break L11;
                                                            } else {
                                                              return false;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      return true;
                                                    } else {
                                                      L12: {
                                                        if (25 == var2) {
                                                          break L12;
                                                        } else {
                                                          if (var2 == 24) {
                                                            break L12;
                                                          } else {
                                                            if (27 == var2) {
                                                              break L12;
                                                            } else {
                                                              return false;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      return true;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            return false;
                                          }
                                        }
                                      } else {
                                        if (var3 == 0) {
                                          return true;
                                        } else {
                                          if ((var2 ^ -1) != -19) {
                                            L13: {
                                              if (var2 == 19) {
                                                break L13;
                                              } else {
                                                if (-21 == (var2 ^ -1)) {
                                                  break L13;
                                                } else {
                                                  if (22 == var2) {
                                                    return true;
                                                  } else {
                                                    if ((var2 ^ -1) != 0) {
                                                      L14: {
                                                        if (25 == var2) {
                                                          break L14;
                                                        } else {
                                                          if (var2 == 24) {
                                                            break L14;
                                                          } else {
                                                            if (27 == var2) {
                                                              break L14;
                                                            } else {
                                                              return false;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      return true;
                                                    } else {
                                                      if (var3 == 0) {
                                                        return false;
                                                      } else {
                                                        L15: {
                                                          if (25 == var2) {
                                                            break L15;
                                                          } else {
                                                            if (var2 == 24) {
                                                              break L15;
                                                            } else {
                                                              if (27 == var2) {
                                                                break L15;
                                                              } else {
                                                                return false;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        return true;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            return false;
                                          } else {
                                            L16: {
                                              if (var2 == 19) {
                                                break L16;
                                              } else {
                                                if (-21 == (var2 ^ -1)) {
                                                  break L16;
                                                } else {
                                                  if (22 == var2) {
                                                    return true;
                                                  } else {
                                                    if ((var2 ^ -1) != 0) {
                                                      L17: {
                                                        if (25 == var2) {
                                                          break L17;
                                                        } else {
                                                          if (var2 == 24) {
                                                            break L17;
                                                          } else {
                                                            if (27 == var2) {
                                                              break L17;
                                                            } else {
                                                              return false;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      return true;
                                                    } else {
                                                      L18: {
                                                        if (25 == var2) {
                                                          break L18;
                                                        } else {
                                                          if (var2 == 24) {
                                                            break L18;
                                                          } else {
                                                            if (27 == var2) {
                                                              break L18;
                                                            } else {
                                                              return false;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      return true;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            return false;
                                          }
                                        }
                                      }
                                    } else {
                                      if (var3 == 0) {
                                        return true;
                                      } else {
                                        if (-18 == (var2 ^ -1)) {
                                          L19: {
                                            if (var3 == 0) {
                                              break L19;
                                            } else {
                                              if ((var2 ^ -1) == -19) {
                                                if (var3 == 0) {
                                                  break L19;
                                                } else {
                                                  L20: {
                                                    if (var2 == 19) {
                                                      break L20;
                                                    } else {
                                                      if (-21 == (var2 ^ -1)) {
                                                        break L20;
                                                      } else {
                                                        if (22 == var2) {
                                                          return true;
                                                        } else {
                                                          if ((var2 ^ -1) != 0) {
                                                            L21: {
                                                              if (25 == var2) {
                                                                break L21;
                                                              } else {
                                                                if (var2 == 24) {
                                                                  break L21;
                                                                } else {
                                                                  if (27 == var2) {
                                                                    break L21;
                                                                  } else {
                                                                    return false;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            return true;
                                                          } else {
                                                            L22: {
                                                              if (25 == var2) {
                                                                break L22;
                                                              } else {
                                                                if (var2 == 24) {
                                                                  break L22;
                                                                } else {
                                                                  if (27 == var2) {
                                                                    break L22;
                                                                  } else {
                                                                    return false;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            return true;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return false;
                                                }
                                              } else {
                                                L23: {
                                                  if (var2 == 19) {
                                                    break L23;
                                                  } else {
                                                    if (-21 == (var2 ^ -1)) {
                                                      break L23;
                                                    } else {
                                                      if (22 == var2) {
                                                        return true;
                                                      } else {
                                                        L24: {
                                                          if ((var2 ^ -1) != 0) {
                                                            break L24;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                        L25: {
                                                          if (25 == var2) {
                                                            break L25;
                                                          } else {
                                                            if (var2 == 24) {
                                                              break L25;
                                                            } else {
                                                              if (27 == var2) {
                                                                break L25;
                                                              } else {
                                                                return false;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        return true;
                                                      }
                                                    }
                                                  }
                                                }
                                                return false;
                                              }
                                            }
                                          }
                                          return true;
                                        } else {
                                          L26: {
                                            if ((var2 ^ -1) != -19) {
                                              break L26;
                                            } else {
                                              break L26;
                                            }
                                          }
                                          L27: {
                                            if (var2 == 19) {
                                              break L27;
                                            } else {
                                              if (-21 == (var2 ^ -1)) {
                                                break L27;
                                              } else {
                                                if (22 == var2) {
                                                  return true;
                                                } else {
                                                  L28: {
                                                    if ((var2 ^ -1) != 0) {
                                                      break L28;
                                                    } else {
                                                      if (var3 == 0) {
                                                        return false;
                                                      } else {
                                                        break L28;
                                                      }
                                                    }
                                                  }
                                                  L29: {
                                                    if (25 == var2) {
                                                      break L29;
                                                    } else {
                                                      if (var2 == 24) {
                                                        break L29;
                                                      } else {
                                                        if (27 == var2) {
                                                          break L29;
                                                        } else {
                                                          return false;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return true;
                                                }
                                              }
                                            }
                                          }
                                          return false;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (var3 == 0) {
                              break L6;
                            } else {
                              L30: {
                                L31: {
                                  if (var2 == 12) {
                                    break L31;
                                  } else {
                                    if (13 == var2) {
                                      break L31;
                                    } else {
                                      if (-15 == (var2 ^ -1)) {
                                        break L31;
                                      } else {
                                        if (var2 == 15) {
                                          return true;
                                        } else {
                                          L32: {
                                            if (var2 != 16) {
                                              break L32;
                                            } else {
                                              break L32;
                                            }
                                          }
                                          L33: {
                                            if (-18 != (var2 ^ -1)) {
                                              break L33;
                                            } else {
                                              if (var3 == 0) {
                                                return true;
                                              } else {
                                                break L33;
                                              }
                                            }
                                          }
                                          L34: {
                                            if ((var2 ^ -1) != -19) {
                                              break L34;
                                            } else {
                                              if (var3 == 0) {
                                                return true;
                                              } else {
                                                break L34;
                                              }
                                            }
                                          }
                                          L35: {
                                            if (var2 == 19) {
                                              break L35;
                                            } else {
                                              if (-21 == (var2 ^ -1)) {
                                                break L35;
                                              } else {
                                                if (22 == var2) {
                                                  return true;
                                                } else {
                                                  L36: {
                                                    if ((var2 ^ -1) != 0) {
                                                      break L36;
                                                    } else {
                                                      if (var3 == 0) {
                                                        return false;
                                                      } else {
                                                        break L36;
                                                      }
                                                    }
                                                  }
                                                  L37: {
                                                    if (25 == var2) {
                                                      break L37;
                                                    } else {
                                                      if (var2 == 24) {
                                                        break L37;
                                                      } else {
                                                        if (27 == var2) {
                                                          break L37;
                                                        } else {
                                                          stackOut_100_0 = 0;
                                                          stackIn_102_0 = stackOut_100_0;
                                                          break L30;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return true;
                                                }
                                              }
                                            }
                                          }
                                          return false;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_101_0 = 1;
                                stackIn_102_0 = stackOut_101_0;
                                break L30;
                              }
                              return stackIn_102_0 != 0;
                            }
                          }
                        }
                        return true;
                      } else {
                        if (var3 != 0) {
                          L38: {
                            if (-12 != (var2 ^ -1)) {
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                          if (var2 != 12) {
                            if (13 != var2) {
                              if (-15 != (var2 ^ -1)) {
                                if (var2 != 15) {
                                  L39: {
                                    if (var2 != 16) {
                                      break L39;
                                    } else {
                                      if (var3 != 0) {
                                        break L39;
                                      } else {
                                        return true;
                                      }
                                    }
                                  }
                                  L40: {
                                    if (-18 != (var2 ^ -1)) {
                                      break L40;
                                    } else {
                                      if (var3 != 0) {
                                        break L40;
                                      } else {
                                        return true;
                                      }
                                    }
                                  }
                                  L41: {
                                    if ((var2 ^ -1) != -19) {
                                      break L41;
                                    } else {
                                      if (var3 != 0) {
                                        break L41;
                                      } else {
                                        return true;
                                      }
                                    }
                                  }
                                  if (var2 != 19) {
                                    if (-21 != (var2 ^ -1)) {
                                      if (22 != var2) {
                                        L42: {
                                          if ((var2 ^ -1) != 0) {
                                            break L42;
                                          } else {
                                            if (var3 != 0) {
                                              break L42;
                                            } else {
                                              return false;
                                            }
                                          }
                                        }
                                        L43: {
                                          if (25 == var2) {
                                            break L43;
                                          } else {
                                            if (var2 == 24) {
                                              break L43;
                                            } else {
                                              if (27 == var2) {
                                                break L43;
                                              } else {
                                                return false;
                                              }
                                            }
                                          }
                                        }
                                        return true;
                                      } else {
                                        return true;
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
                              } else {
                                return true;
                              }
                            } else {
                              return true;
                            }
                          } else {
                            return true;
                          }
                        } else {
                          return false;
                        }
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    abstract String a(byte param0, boolean param1);

    final boolean a(byte param0, ic param1, at param2, boolean param3) {
        vb var5 = null;
        RuntimeException var5_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 == -39) {
              L1: {
                var5 = cp.a(param1, 10120, param1.field_xb, this.e(1023) & param3, (oj) (this), param1.field_gb);
                if (var5 != null) {
                  param2.a((byte) -119, (tc) (var5));
                  break L1;
                } else {
                  break L1;
                }
              }
              if (var5 != null) {
                stackOut_9_0 = var5.field_w;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5_ref);
            stackOut_11_1 = new StringBuilder().append("oj.H(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final void c(byte param0) {
        this.field_s = this.field_s - 1;
        if (this.field_s > 0) {
          return;
        } else {
          this.field_o = true;
          if (null != this.field_w) {
            if (this.field_m == 19) {
              if (param0 > -46) {
                this.c((byte) -28);
                return;
              } else {
                return;
              }
            } else {
              this.field_w.field_u = false;
              this.field_w.field_z = 0;
              if (param0 <= -46) {
                return;
              } else {
                this.c((byte) -28);
                return;
              }
            }
          } else {
            if (param0 <= -46) {
              return;
            } else {
              this.c((byte) -28);
              return;
            }
          }
        }
    }

    final void a(jd param0, int param1) {
        RuntimeException var3 = null;
        jd var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 12) {
                break L1;
              } else {
                var4 = (jd) null;
                this.a((jd) null, -102);
                break L1;
              }
            }
            param0.field_u = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("oj.J(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_r = null;
        field_t = null;
        field_u = null;
        field_q = null;
        field_x = null;
        if (param0 != -103) {
          return;
        } else {
          field_p = null;
          field_l = null;
          field_n = null;
          return;
        }
    }

    final boolean a(int param0, int param1, ic param2, at param3, int param4) {
        vb var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var6 = ub.a((oj) (this), param2.field_xb, this.e(param1 + 1008), param0, param2, 17, param4, param2.field_gb);
              if (var6 == null) {
                break L1;
              } else {
                param3.a((byte) -119, (tc) (var6));
                break L1;
              }
            }
            if (param1 == 15) {
              if (var6 != null) {
                stackOut_8_0 = var6.field_w;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6_ref);
            stackOut_10_1 = new StringBuilder().append("oj.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    abstract boolean a(at param0, byte param1, ic param2);

    final static pu a(int param0, bv param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pu var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        pu stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        pu stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param1.g(-113, 8);
            if (var2_int <= 0) {
              L1: {
                var3 = vq.a(param1, -2) ? 1 : 0;
                var5 = 1 / ((param0 - 61) / 50);
                var4 = vq.a(param1, -2) ? 1 : 0;
                var6 = new pu();
                var6.field_O = (short)param1.g(61, 16);
                var6.field_z = to.a(var6.field_z, 16, param1, 10064);
                var6.field_y = to.a(var6.field_y, 16, param1, 10064);
                var6.field_o = to.a(var6.field_o, 16, param1, 10064);
                var6.field_q = (short)param1.g(107, 16);
                var6.field_c = to.a(var6.field_c, 16, param1, 10064);
                var6.field_j = to.a(var6.field_j, 16, param1, 10064);
                var6.field_e = to.a(var6.field_e, 16, param1, 10064);
                if (var3 != 0) {
                  var6.field_t = (short)param1.g(-100, 16);
                  var6.field_l = to.a(var6.field_l, 16, param1, 10064);
                  var6.field_f = to.a(var6.field_f, 16, param1, 10064);
                  var6.field_x = to.a(var6.field_x, 16, param1, 10064);
                  var6.field_w = to.a(var6.field_w, 16, param1, 10064);
                  var6.field_Q = to.a(var6.field_Q, 16, param1, 10064);
                  var6.field_d = to.a(var6.field_d, 16, param1, 10064);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  discarded$1 = param1.g(-102, 16);
                  var6.field_r = to.a(var6.field_r, 16, param1, 10064);
                  var6.field_s = to.a(var6.field_s, 16, param1, 10064);
                  var6.field_A = to.a(var6.field_A, 16, param1, 10064);
                  var6.field_i = to.a(var6.field_i, 16, param1, 10064);
                  var6.field_b = to.a(var6.field_b, 16, param1, 10064);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (vq.a(param1, -2)) {
                  var6.field_u = to.a(var6.field_u, 16, param1, 10064);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (vq.a(param1, -2)) {
                  var6.field_K = kd.a(16, param1, var6.field_K, (byte) -122);
                  var7 = 0;
                  var8 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var8 >= var6.field_K.length) {
                          break L7;
                        } else {
                          var11 = var7 ^ -1;
                          var10 = var6.field_K[var8] & 255 ^ -1;
                          if (var9 != 0) {
                            if (var10 == var11) {
                              var6.field_K = null;
                              break L4;
                            } else {
                              break L6;
                            }
                          } else {
                            L8: {
                              if (var10 < var11) {
                                var7 = var6.field_K[var8] & 255;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var8++;
                            if (var9 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (-1 == (var7 ^ -1)) {
                        var6.field_K = null;
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                    var6.field_E = (byte)(1 + var7);
                    if (var9 == 0) {
                      break L4;
                    } else {
                      var6.field_K = null;
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_29_0 = (pu) (var6);
              stackIn_30_0 = stackOut_29_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var2);
            stackOut_31_1 = new StringBuilder().append("oj.N(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        return stackIn_30_0;
    }

    final void f(int param0) {
        L0: {
          if (this.field_w != null) {
            this.field_w.field_u = false;
            this.field_w.field_z = 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 6) {
          oj.a((byte) 88);
          this.field_s = 0;
          this.field_o = true;
          return;
        } else {
          this.field_s = 0;
          this.field_o = true;
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] stackIn_16_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_15_0 = null;
        int[] stackOut_14_0 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if ((param3 ^ -1) > -1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_r = (at) null;
                  break L1;
                }
              }
              param4 += 23;
              var5_int = -72;
              L2: while (true) {
                if ((var5_int ^ -1) <= -1) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = var5_int;
                  var7 = var5_int;
                  if (var11 == 0) {
                    L3: {
                      L4: {
                        if ((var6 ^ -1) > -1) {
                          break L4;
                        } else {
                          var6 = -(var6 << 721571140) + 256;
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var6 = (var6 << -1908004511) + 256;
                      break L3;
                    }
                    L5: {
                      var7 = var7 >> 5;
                      var8 = (122 ^ var6) >> -1611392925;
                      var9 = 15 & var6 >> -1098159452;
                      if (0 == (param3 ^ -1)) {
                        stackOut_15_0 = dr.field_z;
                        stackIn_16_0 = stackOut_15_0;
                        break L5;
                      } else {
                        stackOut_14_0 = dr.field_v[param3];
                        stackIn_16_0 = stackOut_14_0;
                        break L5;
                      }
                    }
                    var13 = stackIn_16_0;
                    var12 = var13;
                    var10 = var12;
                    qn.a((-6 + param4 << 1623397028) - -(var7 * ae.b(param2 + var5_int << 505417124, 100) >> -976080308), -4 + (param0 + var5_int) << -1079564700, var8 << -290760700, var9, var13);
                    var5_int++;
                    continue L2;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "oj.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    protected oj() {
        this.field_s = 1;
    }

    static {
        field_u = "Restart Level";
        field_p = "Allow spectators?";
        field_v = 0;
        field_t = new int[]{2, 17, 18, 36, 37, 38, 6, 5, 50, 9};
        field_x = "Quick Chat Help";
        field_k = 4;
        field_n = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_q = new int[56];
        field_r = new at();
        field_l = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
    }
}
