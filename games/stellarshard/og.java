/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static fe field_c;
    static int[] field_b;
    static int field_a;
    static int[][] field_d;

    public static void a(byte param0) {
        if (param0 < 60) {
          field_d = null;
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static nl a(byte param0, String param1, int param2) {
        bc var3 = null;
        var3 = new bc();
        if (param0 >= -119) {
          field_c = null;
          ((nl) (Object) var3).field_g = param2;
          ((nl) (Object) var3).field_c = param1;
          return (nl) (Object) var3;
        } else {
          ((nl) (Object) var3).field_g = param2;
          ((nl) (Object) var3).field_c = param1;
          return (nl) (Object) var3;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var13 = stellarshard.field_B;
        if (param1 == 105) {
          L0: {
            var5 = param2 + param0;
            var6 = param4 + param3;
            if (ti.field_e >= param0) {
              stackOut_4_0 = ti.field_e;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_5_0;
            if (param4 > ti.field_f) {
              stackOut_7_0 = param4;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = ti.field_f;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_8_0;
            if (var5 >= ti.field_c) {
              stackOut_10_0 = ti.field_c;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = var5;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_11_0;
            if (ti.field_l > var6) {
              stackOut_13_0 = var6;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = ti.field_l;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          var10 = stackIn_14_0;
          if (ti.field_e <= param0) {
            if (param0 < ti.field_c) {
              var11 = param0 + var8 * ti.field_i;
              var12 = var10 + (1 + -var8) >> -1576356607;
              L4: while (true) {
                var12--;
                if (0 > var12) {
                  L5: {
                    if (ti.field_f > param4) {
                      break L5;
                    } else {
                      if (ti.field_l <= var6) {
                        break L5;
                      } else {
                        var11 = param4 * ti.field_i - -var7;
                        var12 = -var7 + 1 - -var9 >> 1801245729;
                        L6: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L5;
                          } else {
                            ti.field_a[var11] = 16777215;
                            var11 += 2;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (ti.field_e > var5) {
                      break L7;
                    } else {
                      if (ti.field_c > var5) {
                        var11 = var5 + ti.field_i * (var8 + (1 & var5 + -param0));
                        var12 = var10 + 1 - var8 >> -1895664767;
                        L8: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L7;
                          } else {
                            ti.field_a[var11] = 16777215;
                            var11 = var11 + 2 * ti.field_i;
                            continue L8;
                          }
                        }
                      } else {
                        L9: {
                          if (param4 < ti.field_f) {
                            break L9;
                          } else {
                            if (var6 < ti.field_l) {
                              var11 = var7 + (var6 * ti.field_i + (1 & -param4 + var6));
                              var12 = var9 + (1 + -var7) >> -176056575;
                              L10: while (true) {
                                var12--;
                                if (0 > var12) {
                                  break L9;
                                } else {
                                  ti.field_a[var11] = 16777215;
                                  var11 += 2;
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
                    if (param4 < ti.field_f) {
                      break L11;
                    } else {
                      if (var6 < ti.field_l) {
                        var11 = var7 + (var6 * ti.field_i + (1 & -param4 + var6));
                        var12 = var9 + (1 + -var7) >> -176056575;
                        L12: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L11;
                          } else {
                            ti.field_a[var11] = 16777215;
                            var11 += 2;
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
                  ti.field_a[var11] = 16777215;
                  var11 = var11 + 2 * ti.field_i;
                  continue L4;
                }
              }
            } else {
              if (ti.field_f <= param4) {
                L13: {
                  if (ti.field_l <= var6) {
                    break L13;
                  } else {
                    var11 = param4 * ti.field_i - -var7;
                    var12 = -var7 + 1 - -var9 >> 1801245729;
                    L14: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L13;
                      } else {
                        ti.field_a[var11] = 16777215;
                        var11 += 2;
                        continue L14;
                      }
                    }
                  }
                }
                L15: {
                  if (ti.field_e > var5) {
                    break L15;
                  } else {
                    if (ti.field_c > var5) {
                      var11 = var5 + ti.field_i * (var8 + (1 & var5 + -param0));
                      var12 = var10 + 1 - var8 >> -1895664767;
                      L16: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L15;
                        } else {
                          ti.field_a[var11] = 16777215;
                          var11 = var11 + 2 * ti.field_i;
                          continue L16;
                        }
                      }
                    } else {
                      L17: {
                        if (param4 < ti.field_f) {
                          break L17;
                        } else {
                          if (var6 < ti.field_l) {
                            var11 = var7 + (var6 * ti.field_i + (1 & -param4 + var6));
                            var12 = var9 + (1 + -var7) >> -176056575;
                            L18: while (true) {
                              var12--;
                              if (0 > var12) {
                                break L17;
                              } else {
                                ti.field_a[var11] = 16777215;
                                var11 += 2;
                                continue L18;
                              }
                            }
                          } else {
                            break L17;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (param4 >= ti.field_f) {
                  if (var6 < ti.field_l) {
                    var11 = var7 + (var6 * ti.field_i + (1 & -param4 + var6));
                    var12 = var9 + (1 + -var7) >> -176056575;
                    L19: while (true) {
                      var12--;
                      if (0 > var12) {
                        return;
                      } else {
                        ti.field_a[var11] = 16777215;
                        var11 += 2;
                        continue L19;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L20: {
                  if (ti.field_e > var5) {
                    break L20;
                  } else {
                    if (ti.field_c > var5) {
                      var11 = var5 + ti.field_i * (var8 + (1 & var5 + -param0));
                      var12 = var10 + 1 - var8 >> -1895664767;
                      L21: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L20;
                        } else {
                          ti.field_a[var11] = 16777215;
                          var11 = var11 + 2 * ti.field_i;
                          continue L21;
                        }
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                L22: {
                  if (param4 < ti.field_f) {
                    break L22;
                  } else {
                    if (var6 < ti.field_l) {
                      var11 = var7 + (var6 * ti.field_i + (1 & -param4 + var6));
                      var12 = var9 + (1 + -var7) >> -176056575;
                      L23: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L22;
                        } else {
                          ti.field_a[var11] = 16777215;
                          var11 += 2;
                          continue L23;
                        }
                      }
                    } else {
                      break L22;
                    }
                  }
                }
                return;
              }
            }
          } else {
            L24: {
              if (ti.field_f > param4) {
                break L24;
              } else {
                if (ti.field_l <= var6) {
                  break L24;
                } else {
                  var11 = param4 * ti.field_i - -var7;
                  var12 = -var7 + 1 - -var9 >> 1801245729;
                  L25: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L24;
                    } else {
                      ti.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L25;
                    }
                  }
                }
              }
            }
            L26: {
              if (ti.field_e > var5) {
                break L26;
              } else {
                if (ti.field_c > var5) {
                  var11 = var5 + ti.field_i * (var8 + (1 & var5 + -param0));
                  var12 = var10 + 1 - var8 >> -1895664767;
                  L27: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L26;
                    } else {
                      ti.field_a[var11] = 16777215;
                      var11 = var11 + 2 * ti.field_i;
                      continue L27;
                    }
                  }
                } else {
                  L28: {
                    if (param4 < ti.field_f) {
                      break L28;
                    } else {
                      if (var6 < ti.field_l) {
                        var11 = var7 + (var6 * ti.field_i + (1 & -param4 + var6));
                        var12 = var9 + (1 + -var7) >> -176056575;
                        L29: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L28;
                          } else {
                            ti.field_a[var11] = 16777215;
                            var11 += 2;
                            continue L29;
                          }
                        }
                      } else {
                        break L28;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (param4 >= ti.field_f) {
              if (var6 >= ti.field_l) {
                return;
              } else {
                var11 = var7 + (var6 * ti.field_i + (1 & -param4 + var6));
                var12 = var9 + (1 + -var7) >> -176056575;
                L30: while (true) {
                  var12--;
                  if (0 > var12) {
                    return;
                  } else {
                    ti.field_a[var11] = 16777215;
                    var11 += 2;
                    continue L30;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[4];
        field_d = new int[][]{new int[8], new int[8], new int[8], new int[8], new int[8], new int[8]};
    }
}
