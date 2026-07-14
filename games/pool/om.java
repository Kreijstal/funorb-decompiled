/*
 * Decompiled by CFR-JS 0.4.0.
 */
class om extends am {
    static dd field_u;
    static String field_y;
    static int field_w;
    static int field_x;
    static int field_v;
    static String field_t;
    static int[] field_s;
    static int[] field_r;

    om(lr param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_C, -1, 2147483647, false);
    }

    final static double[] a(int param0, double[] param1) {
        param1[5] = param1[5] * 512.0;
        param1[1] = param1[1] * 288.0;
        param1[0] = param1[0] * 576.0;
        param1[4] = param1[4] * 288.0;
        param1[2] = param1[2] * 512.0;
        param1[3] = param1[3] * 576.0;
        if (param0 > -19) {
            om.a(-59, false);
            param1[5] = param1[5] - 8.0;
            return param1;
        }
        param1[5] = param1[5] - 8.0;
        return param1;
    }

    om(int param0) {
        this(lc.field_O, param0);
    }

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        if (!(!param0)) {
            mh.a(param4.field_C + param1, param4.field_D + param3, param4.field_y, param4.field_l, false);
        }
        int var6 = 5 / ((2 - param2) / 41);
        super.a(param0, param1, (byte) -73, param3, param4);
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        int var4 = 0;
        L0: {
          if ((param1 ^ -1) != -1) {
            break L0;
          } else {
            if ((param0 ^ -1) != (ec.field_i ^ -1)) {
              lf.field_c = true;
              ec.field_i = param0;
              mj.a(param2, 27712);
              break L0;
            } else {
              var4 = 101 % ((59 - param3) / 59);
              if (param1 == 1) {
                L1: {
                  if (param0 != ol.field_e) {
                    ol.field_e = param0;
                    lf.field_c = true;
                    mj.a(param2, 27712);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (2 == param1) {
                  L2: {
                    if ((di.field_e ^ -1) != (param0 ^ -1)) {
                      lf.field_c = true;
                      di.field_e = param0;
                      mj.a(param2, 27712);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                L3: {
                  if (2 != param1) {
                    break L3;
                  } else {
                    if ((di.field_e ^ -1) != (param0 ^ -1)) {
                      lf.field_c = true;
                      di.field_e = param0;
                      mj.a(param2, 27712);
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
        }
        L4: {
          var4 = 101 % ((59 - param3) / 59);
          if (param1 != 1) {
            break L4;
          } else {
            if (param0 != ol.field_e) {
              ol.field_e = param0;
              lf.field_c = true;
              mj.a(param2, 27712);
              break L4;
            } else {
              L5: {
                if (2 != param1) {
                  break L5;
                } else {
                  if ((di.field_e ^ -1) != (param0 ^ -1)) {
                    lf.field_c = true;
                    di.field_e = param0;
                    mj.a(param2, 27712);
                    break L5;
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          }
        }
        L6: {
          if (2 != param1) {
            break L6;
          } else {
            if ((di.field_e ^ -1) != (param0 ^ -1)) {
              lf.field_c = true;
              di.field_e = param0;
              mj.a(param2, 27712);
              break L6;
            } else {
              return;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_t = null;
        int var1 = 111 / ((param0 - 40) / 61);
        field_y = null;
        field_u = null;
        field_s = null;
        field_r = null;
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_158_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          if (null != ba.field_ub) {
            ba.field_ub.a(param1, -29423);
            break L0;
          } else {
            break L0;
          }
        }
        var2 = 36 / ((param0 - 1) / 45);
        if (am.field_e == null) {
          L1: {
            if (!nk.field_d) {
              break L1;
            } else {
              if (!jc.field_c) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (!ib.field_v) {
                      break L3;
                    } else {
                      if (!rg.field_p) {
                        break L3;
                      } else {
                        stackOut_139_0 = 1;
                        stackIn_141_0 = stackOut_139_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_140_0 = 0;
                  stackIn_141_0 = stackOut_140_0;
                  break L2;
                }
                L4: {
                  L5: {
                    var3 = stackIn_141_0;
                    if (!param1) {
                      break L5;
                    } else {
                      if (!cp.a((byte) 82)) {
                        break L5;
                      } else {
                        if (var3 != 0) {
                          break L5;
                        } else {
                          stackOut_144_0 = 1;
                          stackIn_146_0 = stackOut_144_0;
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_145_0 = 0;
                  stackIn_146_0 = stackOut_145_0;
                  break L4;
                }
                hr.a(stackIn_146_0 != 0, (byte) 50);
                if (var3 != 0) {
                  L6: {
                    L7: {
                      if (!param1) {
                        break L7;
                      } else {
                        if (!cp.a((byte) 98)) {
                          break L7;
                        } else {
                          stackOut_156_0 = 1;
                          stackIn_158_0 = stackOut_156_0;
                          break L6;
                        }
                      }
                    }
                    stackOut_157_0 = 0;
                    stackIn_158_0 = stackOut_157_0;
                    break L6;
                  }
                  oe.a(stackIn_158_0 != 0, 1);
                  break L1;
                } else {
                  if (null == ba.field_ub) {
                    if (null == am.field_e) {
                      return;
                    } else {
                      am.field_e.d(300, param1);
                      return;
                    }
                  } else {
                    ba.field_ub.d(300, param1);
                    if (null == am.field_e) {
                      return;
                    } else {
                      am.field_e.d(300, param1);
                      return;
                    }
                  }
                }
              }
            }
          }
          if (null == ba.field_ub) {
            if (null == am.field_e) {
              return;
            } else {
              am.field_e.d(300, param1);
              return;
            }
          } else {
            ba.field_ub.d(300, param1);
            if (null == am.field_e) {
              return;
            } else {
              am.field_e.d(300, param1);
              return;
            }
          }
        } else {
          am.field_e.a(param1, -29423);
          if (nk.field_d) {
            if (jc.field_c) {
              if (ib.field_v) {
                if (rg.field_p) {
                  var3 = 1;
                  if (param1) {
                    if (cp.a((byte) 82)) {
                      L8: {
                        if (var3 != 0) {
                          stackOut_111_0 = 0;
                          stackIn_112_0 = stackOut_111_0;
                          break L8;
                        } else {
                          stackOut_110_0 = 1;
                          stackIn_112_0 = stackOut_110_0;
                          break L8;
                        }
                      }
                      hr.a(stackIn_112_0 != 0, (byte) 50);
                      if (var3 != 0) {
                        L9: {
                          L10: {
                            if (!param1) {
                              break L10;
                            } else {
                              if (!cp.a((byte) 98)) {
                                break L10;
                              } else {
                                stackOut_125_0 = 1;
                                stackIn_127_0 = stackOut_125_0;
                                break L9;
                              }
                            }
                          }
                          stackOut_126_0 = 0;
                          stackIn_127_0 = stackOut_126_0;
                          break L9;
                        }
                        oe.a(stackIn_127_0 != 0, 1);
                        if (null == ba.field_ub) {
                          if (null == am.field_e) {
                            return;
                          } else {
                            am.field_e.d(300, param1);
                            return;
                          }
                        } else {
                          ba.field_ub.d(300, param1);
                          if (null == am.field_e) {
                            return;
                          } else {
                            am.field_e.d(300, param1);
                            return;
                          }
                        }
                      } else {
                        if (null == ba.field_ub) {
                          if (null == am.field_e) {
                            return;
                          } else {
                            am.field_e.d(300, param1);
                            return;
                          }
                        } else {
                          ba.field_ub.d(300, param1);
                          if (null == am.field_e) {
                            return;
                          } else {
                            am.field_e.d(300, param1);
                            return;
                          }
                        }
                      }
                    } else {
                      hr.a(false, (byte) 50);
                      if (var3 != 0) {
                        L11: {
                          L12: {
                            if (!param1) {
                              break L12;
                            } else {
                              if (!cp.a((byte) 98)) {
                                break L12;
                              } else {
                                stackOut_98_0 = 1;
                                stackIn_100_0 = stackOut_98_0;
                                break L11;
                              }
                            }
                          }
                          stackOut_99_0 = 0;
                          stackIn_100_0 = stackOut_99_0;
                          break L11;
                        }
                        oe.a(stackIn_100_0 != 0, 1);
                        if (null == ba.field_ub) {
                          if (null == am.field_e) {
                            return;
                          } else {
                            am.field_e.d(300, param1);
                            return;
                          }
                        } else {
                          ba.field_ub.d(300, param1);
                          if (null == am.field_e) {
                            return;
                          } else {
                            am.field_e.d(300, param1);
                            return;
                          }
                        }
                      } else {
                        if (null == ba.field_ub) {
                          if (null == am.field_e) {
                            return;
                          } else {
                            am.field_e.d(300, param1);
                            return;
                          }
                        } else {
                          L13: {
                            ba.field_ub.d(300, param1);
                            if (null == am.field_e) {
                              break L13;
                            } else {
                              am.field_e.d(300, param1);
                              break L13;
                            }
                          }
                          return;
                        }
                      }
                    }
                  } else {
                    hr.a(false, (byte) 50);
                    if (var3 != 0) {
                      L14: {
                        L15: {
                          if (!param1) {
                            break L15;
                          } else {
                            if (!cp.a((byte) 98)) {
                              break L15;
                            } else {
                              stackOut_74_0 = 1;
                              stackIn_76_0 = stackOut_74_0;
                              break L14;
                            }
                          }
                        }
                        stackOut_75_0 = 0;
                        stackIn_76_0 = stackOut_75_0;
                        break L14;
                      }
                      oe.a(stackIn_76_0 != 0, 1);
                      if (null == ba.field_ub) {
                        if (null == am.field_e) {
                          return;
                        } else {
                          am.field_e.d(300, param1);
                          return;
                        }
                      } else {
                        ba.field_ub.d(300, param1);
                        if (null == am.field_e) {
                          return;
                        } else {
                          am.field_e.d(300, param1);
                          return;
                        }
                      }
                    } else {
                      if (null == ba.field_ub) {
                        if (null == am.field_e) {
                          return;
                        } else {
                          am.field_e.d(300, param1);
                          return;
                        }
                      } else {
                        L16: {
                          ba.field_ub.d(300, param1);
                          if (null == am.field_e) {
                            break L16;
                          } else {
                            am.field_e.d(300, param1);
                            break L16;
                          }
                        }
                        return;
                      }
                    }
                  }
                } else {
                  L17: {
                    L18: {
                      var3 = 0;
                      if (!param1) {
                        break L18;
                      } else {
                        if (!cp.a((byte) 82)) {
                          break L18;
                        } else {
                          if (var3 != 0) {
                            break L18;
                          } else {
                            stackOut_43_0 = 1;
                            stackIn_45_0 = stackOut_43_0;
                            break L17;
                          }
                        }
                      }
                    }
                    stackOut_44_0 = 0;
                    stackIn_45_0 = stackOut_44_0;
                    break L17;
                  }
                  L19: {
                    hr.a(stackIn_45_0 != 0, (byte) 50);
                    if (var3 != 0) {
                      L20: {
                        L21: {
                          if (!param1) {
                            break L21;
                          } else {
                            if (!cp.a((byte) 98)) {
                              break L21;
                            } else {
                              stackOut_49_0 = 1;
                              stackIn_51_0 = stackOut_49_0;
                              break L20;
                            }
                          }
                        }
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        break L20;
                      }
                      oe.a(stackIn_51_0 != 0, 1);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  if (null == ba.field_ub) {
                    if (null == am.field_e) {
                      return;
                    } else {
                      am.field_e.d(300, param1);
                      return;
                    }
                  } else {
                    L22: {
                      ba.field_ub.d(300, param1);
                      if (null == am.field_e) {
                        break L22;
                      } else {
                        am.field_e.d(300, param1);
                        break L22;
                      }
                    }
                    return;
                  }
                }
              } else {
                L23: {
                  L24: {
                    var3 = 0;
                    if (!param1) {
                      break L24;
                    } else {
                      if (!cp.a((byte) 82)) {
                        break L24;
                      } else {
                        if (var3 != 0) {
                          break L24;
                        } else {
                          stackOut_24_0 = 1;
                          stackIn_26_0 = stackOut_24_0;
                          break L23;
                        }
                      }
                    }
                  }
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  break L23;
                }
                L25: {
                  hr.a(stackIn_26_0 != 0, (byte) 50);
                  if (var3 != 0) {
                    L26: {
                      L27: {
                        if (!param1) {
                          break L27;
                        } else {
                          if (!cp.a((byte) 98)) {
                            break L27;
                          } else {
                            stackOut_30_0 = 1;
                            stackIn_32_0 = stackOut_30_0;
                            break L26;
                          }
                        }
                      }
                      stackOut_31_0 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      break L26;
                    }
                    oe.a(stackIn_32_0 != 0, 1);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L28: {
                  if (null == ba.field_ub) {
                    break L28;
                  } else {
                    ba.field_ub.d(300, param1);
                    break L28;
                  }
                }
                if (null == am.field_e) {
                  return;
                } else {
                  am.field_e.d(300, param1);
                  return;
                }
              }
            } else {
              if (null == ba.field_ub) {
                if (null == am.field_e) {
                  return;
                } else {
                  am.field_e.d(300, param1);
                  return;
                }
              } else {
                L29: {
                  ba.field_ub.d(300, param1);
                  if (null == am.field_e) {
                    break L29;
                  } else {
                    am.field_e.d(300, param1);
                    break L29;
                  }
                }
                return;
              }
            }
          } else {
            if (null == ba.field_ub) {
              if (null == am.field_e) {
                return;
              } else {
                am.field_e.d(300, param1);
                return;
              }
            } else {
              L30: {
                ba.field_ub.d(300, param1);
                if (null == am.field_e) {
                  break L30;
                } else {
                  am.field_e.d(300, param1);
                  break L30;
                }
              }
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "To <u=ffffff>leave shot mode</u>, press <img=4> <col=99ff99>'SPACE'</col>, or <img=0> click away from the cue ball.";
    }
}
