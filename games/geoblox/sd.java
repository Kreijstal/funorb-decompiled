/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends pb {
    static int field_w;
    static cb field_B;
    qc field_A;
    byte field_E;
    static byte[][] field_C;
    int field_D;
    static int field_x;
    static dm field_y;
    static String field_z;

    public static void e(byte param0) {
        if (param0 < 88) {
            return;
        }
        field_y = null;
        field_z = null;
        field_B = null;
        field_C = null;
    }

    final byte[] e(int param0) {
        if (!((sd) this).field_u) {
          if (((sd) this).field_A.field_f < ((sd) this).field_A.field_j.length - ((sd) this).field_E) {
            throw new RuntimeException();
          } else {
            L0: {
              if (param0 == 397) {
                break L0;
              } else {
                int discarded$2 = ((sd) this).g(-105);
                break L0;
              }
            }
            return ((sd) this).field_A.field_j;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static na[] a(boolean param0, rh param1, int param2, int param3) {
        if (!param0) {
            return null;
        }
        if (!mf.a(param2, param3, 104, param1)) {
            return null;
        }
        return ji.c(0);
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = Geoblox.field_C;
          if (param5 < 0) {
            break L0;
          } else {
            if (param8 < mh.field_h) {
              L1: {
                if (0 <= param1) {
                  break L1;
                } else {
                  if (param0 >= 0) {
                    break L1;
                  } else {
                    if (param6 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param1 < mh.field_c) {
                  break L2;
                } else {
                  if (param0 < mh.field_c) {
                    break L2;
                  } else {
                    if (mh.field_c <= param6) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var14 = -param8 + param5;
                  if (param7 == param8) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        var10 = param1 << 1281253328;
                        var9 = param1 << 1281253328;
                        var15 = -param8 + param7;
                        var11 = (-param1 + param0 << -410776048) / var15;
                        var12 = (param6 + -param1 << -1794392336) / var14;
                        if (var12 > var11) {
                          break L6;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var13 = 0;
                      break L5;
                    }
                    L7: {
                      L8: {
                        if (0 <= param8) {
                          var16 = mh.field_b[param8];
                          L9: while (true) {
                            if (param8 >= param7) {
                              break L7;
                            } else {
                              L10: {
                                var17 = var9 >> 1475495536;
                                if (mh.field_c > var17) {
                                  L11: {
                                    var18 = (var10 >> 1486250608) - (var9 >> -1222284624);
                                    if (var18 != 0) {
                                      break L11;
                                    } else {
                                      if (var17 < 0) {
                                        break L10;
                                      } else {
                                        if (mh.field_c > var17) {
                                          ib.a(-61, param4, var17 + var16, param2, var18);
                                          if (0 == 0) {
                                            break L10;
                                          } else {
                                            break L11;
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var17 - -var18 < mh.field_c) {
                                      break L12;
                                    } else {
                                      var18 = -1 + (-var17 + mh.field_c);
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (0 <= var17) {
                                      break L13;
                                    } else {
                                      ib.a(57, param4, var16, param2, var17 + var18);
                                      if (0 == 0) {
                                        break L10;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  ib.a(47, param4, var16 + var17, param2, var18);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              param8++;
                              if (param8 < mh.field_h) {
                                var16 = var16 + vb.field_f;
                                var9 = var9 + var11;
                                var10 = var10 + var12;
                                if (0 == 0) {
                                  continue L9;
                                } else {
                                  break L8;
                                }
                              } else {
                                return;
                              }
                            }
                          }
                        } else {
                          L14: {
                            if (param7 >= 0) {
                              break L14;
                            } else {
                              param8 = param7 - param8;
                              var9 = var9 + var11 * param8;
                              var10 = var10 + var12 * param8;
                              param8 = param7;
                              if (0 == 0) {
                                break L7;
                              } else {
                                break L14;
                              }
                            }
                          }
                          param8 = -param8;
                          var10 = var10 + var12 * param8;
                          var9 = var9 + var11 * param8;
                          param8 = 0;
                          break L8;
                        }
                      }
                      var16 = mh.field_b[param8];
                      L15: while (true) {
                        if (param8 >= param7) {
                          break L7;
                        } else {
                          L16: {
                            var17 = var9 >> 1475495536;
                            if (mh.field_c > var17) {
                              L17: {
                                var18 = (var10 >> 1486250608) - (var9 >> -1222284624);
                                if (var18 != 0) {
                                  break L17;
                                } else {
                                  if (var17 < 0) {
                                    break L16;
                                  } else {
                                    if (mh.field_c > var17) {
                                      ib.a(-61, param4, var17 + var16, param2, var18);
                                      if (0 == 0) {
                                        break L16;
                                      } else {
                                        break L17;
                                      }
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              L18: {
                                if (var17 - -var18 < mh.field_c) {
                                  break L18;
                                } else {
                                  var18 = -1 + (-var17 + mh.field_c);
                                  break L18;
                                }
                              }
                              L19: {
                                if (0 <= var17) {
                                  break L19;
                                } else {
                                  ib.a(57, param4, var16, param2, var17 + var18);
                                  if (0 == 0) {
                                    break L16;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              ib.a(47, param4, var16 + var17, param2, var18);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          param8++;
                          if (param8 < mh.field_h) {
                            var16 = var16 + vb.field_f;
                            var9 = var9 + var11;
                            var10 = var10 + var12;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L7;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L20: {
                      L21: {
                        var16 = -param7 + param5;
                        if (var16 == 0) {
                          break L21;
                        } else {
                          L22: {
                            L23: {
                              var17 = param6 << -903778992;
                              if (var13 == 0) {
                                break L23;
                              } else {
                                var10 = param0 << 1370743920;
                                if (0 == 0) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            var9 = param0 << 1096001584;
                            break L22;
                          }
                          var11 = (var17 + -var9) / var16;
                          var12 = (var17 - var10) / var16;
                          if (0 == 0) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var12 = 0;
                      var11 = 0;
                      break L20;
                    }
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L24: {
                  L25: {
                    if (param8 != param5) {
                      break L25;
                    } else {
                      var11 = 0;
                      var10 = param0 << 876887888;
                      var9 = param1 << 56769648;
                      var12 = 0;
                      if (0 == 0) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  L26: {
                    var15 = -param7 + param5;
                    if (param0 > param1) {
                      break L26;
                    } else {
                      var10 = param1 << -1300931760;
                      var11 = (param6 + -param0 << 1611829680) / var15;
                      var9 = param0 << 1690626512;
                      var12 = (-param1 + param6 << 432247536) / var14;
                      if (0 == 0) {
                        break L24;
                      } else {
                        break L26;
                      }
                    }
                  }
                  var10 = param0 << 563576176;
                  var11 = (-param1 + param6 << -1553445200) / var14;
                  var9 = param1 << 2050032944;
                  var12 = (param6 + -param0 << -270184496) / var15;
                  break L24;
                }
                var13 = 0;
                if (param8 >= 0) {
                  break L3;
                } else {
                  param8 = Math.min(-param8, -param8 + param7);
                  var10 = var10 + var12 * param8;
                  var9 = var9 + param8 * var11;
                  param8 = 0;
                  break L3;
                }
              }
              L27: {
                if (0 <= param8) {
                  break L27;
                } else {
                  param8 = -param8;
                  var10 = var10 + var12 * param8;
                  var9 = var9 + param8 * var11;
                  param8 = 0;
                  break L27;
                }
              }
              var16 = -91 % ((param3 - 74) / 33);
              var15 = mh.field_b[param8];
              if (param5 > param8) {
                L28: {
                  var17 = var9 >> -1016334288;
                  if (mh.field_c <= var17) {
                    break L28;
                  } else {
                    L29: {
                      var18 = (var10 >> -963505040) + -(var9 >> -130429392);
                      if (var18 == 0) {
                        break L29;
                      } else {
                        L30: {
                          if (mh.field_c <= var18 + var17) {
                            var18 = -var17 + mh.field_c + -1;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        L31: {
                          if (0 > var17) {
                            break L31;
                          } else {
                            ib.a(115, param4, var17 + var15, param2, var18);
                            if (0 == 0) {
                              break L28;
                            } else {
                              break L31;
                            }
                          }
                        }
                        ib.a(127, param4, var15, param2, var17 + var18);
                        if (0 == 0) {
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                    if (var17 < 0) {
                      break L28;
                    } else {
                      if (mh.field_c > var17) {
                        ib.a(-67, param4, var17 - -var15, param2, var18);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                }
                param8++;
                if (mh.field_h <= param8) {
                  return;
                } else {
                  var9 = var9 + var11;
                  var10 = var10 + var12;
                  var15 = var15 + vb.field_f;
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final int g(int param0) {
        if (param0 == 0) {
          if (null == ((sd) this).field_A) {
            return 0;
          } else {
            return 100 * ((sd) this).field_A.field_f / (-((sd) this).field_E + ((sd) this).field_A.field_j.length);
          }
        } else {
          return 76;
        }
    }

    sd() {
    }

    final static void h(int param0) {
        pc.a(17, false);
        int var1 = -24 / ((param0 - -4) / 34);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new byte[50][];
        uf.a(116, 50);
    }
}
