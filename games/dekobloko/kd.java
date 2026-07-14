/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends wm {
    static int field_p;
    static int[][] field_s;
    static int field_u;
    static String field_r;
    static String field_q;
    static ck field_t;

    final String a(String param0, byte param1) {
        if (!(((kd) this).b(param0, (byte) -40) != vm.field_u)) {
            return um.field_b;
        }
        if (param1 == -11) {
            return null;
        }
        field_u = 2;
        return null;
    }

    final tb b(String param0, byte param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        var4 = (CharSequence) (Object) param0;
        if (be.a((byte) 98, var4)) {
          if (param1 == -40) {
            var6 = (CharSequence) (Object) param0;
            var3 = cb.a((byte) -106, var6);
            if (var3 > 0) {
              if ((var3 ^ -1) < -131) {
                return vm.field_u;
              } else {
                return dc.field_b;
              }
            } else {
              return vm.field_u;
            }
          } else {
            field_t = null;
            var5 = (CharSequence) (Object) param0;
            var3 = cb.a((byte) -106, var5);
            if (var3 > 0) {
              if ((var3 ^ -1) < -131) {
                return vm.field_u;
              } else {
                return dc.field_b;
              }
            } else {
              return vm.field_u;
            }
          }
        } else {
          return vm.field_u;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var14 = client.field_A ? 1 : 0;
          var5 = param1 + param0;
          var6 = param4 + param3;
          if (param1 > hk.field_c) {
            stackOut_2_0 = param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = hk.field_c;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          var9 = -83 / ((param2 - 29) / 53);
          if (hk.field_h >= param3) {
            stackOut_5_0 = hk.field_h;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param3;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (hk.field_g <= var5) {
            stackOut_8_0 = hk.field_g;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var10 = stackIn_9_0;
          if (var6 < hk.field_b) {
            stackOut_11_0 = var6;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = hk.field_b;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var11 = stackIn_12_0;
        if (param1 >= hk.field_c) {
          if (hk.field_g > param1) {
            var12 = param1 + var8 * hk.field_j;
            var13 = -var8 + var11 + 1 >> -97095103;
            L4: while (true) {
              var13--;
              if ((var13 ^ -1) > -1) {
                L5: {
                  if (param3 < hk.field_h) {
                    break L5;
                  } else {
                    if (hk.field_b <= var6) {
                      break L5;
                    } else {
                      var12 = hk.field_j * param3 + var7;
                      var13 = -var7 + var10 + 1 >> -1989691583;
                      L6: while (true) {
                        var13--;
                        if (-1 < (var13 ^ -1)) {
                          break L5;
                        } else {
                          hk.field_l[var12] = 16777215;
                          var12 += 2;
                          continue L6;
                        }
                      }
                    }
                  }
                }
                L7: {
                  if (var5 < hk.field_c) {
                    break L7;
                  } else {
                    if (var5 < hk.field_g) {
                      var12 = (var8 - -(var5 - param1 & 1)) * hk.field_j - -var5;
                      var13 = -var8 + 1 + var11 >> -2048490399;
                      L8: while (true) {
                        var13--;
                        if ((var13 ^ -1) > -1) {
                          break L7;
                        } else {
                          hk.field_l[var12] = 16777215;
                          var12 = var12 + 2 * hk.field_j;
                          continue L8;
                        }
                      }
                    } else {
                      L9: {
                        if (hk.field_h > param3) {
                          break L9;
                        } else {
                          if (hk.field_b > var6) {
                            var12 = (-param3 + var6 & 1) + var6 * hk.field_j - -var7;
                            var13 = 1 - -var10 - var7 >> -418335423;
                            L10: while (true) {
                              var13--;
                              if (0 > var13) {
                                break L9;
                              } else {
                                hk.field_l[var12] = 16777215;
                                var12 += 2;
                                continue L10;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                L11: {
                  if (hk.field_h > param3) {
                    break L11;
                  } else {
                    if (hk.field_b > var6) {
                      var12 = (-param3 + var6 & 1) + var6 * hk.field_j - -var7;
                      var13 = 1 - -var10 - var7 >> -418335423;
                      L12: while (true) {
                        var13--;
                        if (0 > var13) {
                          break L11;
                        } else {
                          hk.field_l[var12] = 16777215;
                          var12 += 2;
                          continue L12;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                hk.field_l[var12] = 16777215;
                var12 = var12 + hk.field_j * 2;
                continue L4;
              }
            }
          } else {
            L13: {
              if (param3 < hk.field_h) {
                break L13;
              } else {
                if (hk.field_b <= var6) {
                  break L13;
                } else {
                  var12 = hk.field_j * param3 + var7;
                  var13 = -var7 + var10 + 1 >> -1989691583;
                  L14: while (true) {
                    var13--;
                    if (-1 < (var13 ^ -1)) {
                      break L13;
                    } else {
                      hk.field_l[var12] = 16777215;
                      var12 += 2;
                      continue L14;
                    }
                  }
                }
              }
            }
            if (var5 >= hk.field_c) {
              if (var5 < hk.field_g) {
                var12 = (var8 - -(var5 - param1 & 1)) * hk.field_j - -var5;
                var13 = -var8 + 1 + var11 >> -2048490399;
                L15: while (true) {
                  var13--;
                  if ((var13 ^ -1) > -1) {
                    L16: {
                      if (hk.field_h > param3) {
                        break L16;
                      } else {
                        if (hk.field_b > var6) {
                          var12 = (-param3 + var6 & 1) + var6 * hk.field_j - -var7;
                          var13 = 1 - -var10 - var7 >> -418335423;
                          L17: while (true) {
                            var13--;
                            if (0 > var13) {
                              break L16;
                            } else {
                              hk.field_l[var12] = 16777215;
                              var12 += 2;
                              continue L17;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    hk.field_l[var12] = 16777215;
                    var12 = var12 + 2 * hk.field_j;
                    continue L15;
                  }
                }
              } else {
                if (hk.field_h <= param3) {
                  if (hk.field_b > var6) {
                    var12 = (-param3 + var6 & 1) + var6 * hk.field_j - -var7;
                    var13 = 1 - -var10 - var7 >> -418335423;
                    L18: while (true) {
                      var13--;
                      if (0 > var13) {
                        return;
                      } else {
                        hk.field_l[var12] = 16777215;
                        var12 += 2;
                        continue L18;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (hk.field_h <= param3) {
                if (hk.field_b > var6) {
                  var12 = (-param3 + var6 & 1) + var6 * hk.field_j - -var7;
                  var13 = 1 - -var10 - var7 >> -418335423;
                  L19: while (true) {
                    var13--;
                    if (0 > var13) {
                      return;
                    } else {
                      hk.field_l[var12] = 16777215;
                      var12 += 2;
                      continue L19;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          L20: {
            if (param3 < hk.field_h) {
              break L20;
            } else {
              if (hk.field_b <= var6) {
                break L20;
              } else {
                var12 = hk.field_j * param3 + var7;
                var13 = -var7 + var10 + 1 >> -1989691583;
                L21: while (true) {
                  var13--;
                  if (-1 < (var13 ^ -1)) {
                    break L20;
                  } else {
                    hk.field_l[var12] = 16777215;
                    var12 += 2;
                    continue L21;
                  }
                }
              }
            }
          }
          L22: {
            if (var5 < hk.field_c) {
              break L22;
            } else {
              if (var5 < hk.field_g) {
                var12 = (var8 - -(var5 - param1 & 1)) * hk.field_j - -var5;
                var13 = -var8 + 1 + var11 >> -2048490399;
                L23: while (true) {
                  var13--;
                  if ((var13 ^ -1) > -1) {
                    break L22;
                  } else {
                    hk.field_l[var12] = 16777215;
                    var12 = var12 + 2 * hk.field_j;
                    continue L23;
                  }
                }
              } else {
                if (hk.field_h <= param3) {
                  if (hk.field_b <= var6) {
                    return;
                  } else {
                    var12 = (-param3 + var6 & 1) + var6 * hk.field_j - -var7;
                    var13 = 1 - -var10 - var7 >> -418335423;
                    L24: while (true) {
                      var13--;
                      if (0 > var13) {
                        return;
                      } else {
                        hk.field_l[var12] = 16777215;
                        var12 += 2;
                        continue L24;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (hk.field_h <= param3) {
            if (hk.field_b > var6) {
              var12 = (-param3 + var6 & 1) + var6 * hk.field_j - -var7;
              var13 = 1 - -var10 - var7 >> -418335423;
              L25: while (true) {
                var13--;
                if (0 > var13) {
                  return;
                } else {
                  hk.field_l[var12] = 16777215;
                  var12 += 2;
                  continue L25;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    kd(rk param0) {
        super(param0);
    }

    public static void e(int param0) {
        field_t = null;
        field_q = null;
        field_s = null;
        field_r = null;
        int var1 = -6 / ((80 - param0) / 42);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[2][8];
        field_r = "Find opponent";
        field_q = "Loading music";
        vj discarded$0 = new vj();
    }
}
