/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends jc {
    static int field_N;
    static int field_M;
    static int[] field_O;
    static int field_K;
    static String field_J;
    static String field_L;

    private se(int param0, int param1, int param2, int param3, ad param4, rm param5, fe param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((se) this).field_I = param6;
    }

    public static void n(int param0) {
        if (param0 != -13673) {
          se.n(28);
          field_J = null;
          field_O = null;
          field_L = null;
          return;
        } else {
          field_J = null;
          field_O = null;
          field_L = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        ma var7 = null;
        super.a(param0, param1, param2, param3, param4, param5 + param5);
        var7 = j.field_d;
        if (var7 != null) {
          if (((se) this).b(param1, param0, param3, param2, -88)) {
            if (!(((se) this).field_y instanceof cd)) {
              if (!(var7.field_y instanceof cd)) {
                return;
              } else {
                ((cd) (Object) var7.field_y).a(param5 + 27055, (se) this, var7);
                j.field_d = null;
                return;
              }
            } else {
              ((cd) (Object) ((se) this).field_y).a(27055, (se) this, var7);
              j.field_d = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = MinerDisturbance.field_ab;
        var5 = param0 - -param3;
        var6 = param4 + param2;
        if (param1 == 2) {
          L0: {
            if (param0 > eh.field_a) {
              stackOut_60_0 = param0;
              stackIn_61_0 = stackOut_60_0;
              break L0;
            } else {
              stackOut_59_0 = eh.field_a;
              stackIn_61_0 = stackOut_59_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_61_0;
            if (eh.field_d >= param2) {
              stackOut_63_0 = eh.field_d;
              stackIn_64_0 = stackOut_63_0;
              break L1;
            } else {
              stackOut_62_0 = param2;
              stackIn_64_0 = stackOut_62_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_64_0;
            if (var5 >= eh.field_k) {
              stackOut_66_0 = eh.field_k;
              stackIn_67_0 = stackOut_66_0;
              break L2;
            } else {
              stackOut_65_0 = var5;
              stackIn_67_0 = stackOut_65_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_67_0;
            if (eh.field_e > var6) {
              stackOut_69_0 = var6;
              stackIn_70_0 = stackOut_69_0;
              break L3;
            } else {
              stackOut_68_0 = eh.field_e;
              stackIn_70_0 = stackOut_68_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_70_0;
            if (eh.field_a > param0) {
              break L4;
            } else {
              if (eh.field_k <= param0) {
                break L4;
              } else {
                var11 = param0 + eh.field_g * var8;
                var12 = var10 + (1 - var8) >> 683885665;
                L5: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L4;
                  } else {
                    eh.field_f[var11] = 16777215;
                    var11 = var11 + eh.field_g * 2;
                    continue L5;
                  }
                }
              }
            }
          }
          if (eh.field_d <= param2) {
            if (eh.field_e > var6) {
              var11 = eh.field_g * param2 + var7;
              var12 = var9 + (1 - var7) >> 1076792129;
              L6: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  L7: {
                    if (var5 < eh.field_a) {
                      break L7;
                    } else {
                      if (eh.field_k <= var5) {
                        break L7;
                      } else {
                        var11 = var5 + (var8 - -(1 & var5 + -param0)) * eh.field_g;
                        var12 = var10 + 1 - var8 >> -1445603231;
                        L8: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L7;
                          } else {
                            eh.field_f[var11] = 16777215;
                            var11 = var11 + 2 * eh.field_g;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    if (eh.field_d > param2) {
                      break L9;
                    } else {
                      if (eh.field_e <= var6) {
                        break L9;
                      } else {
                        var11 = var6 * eh.field_g + var7 + (1 & var6 + -param2);
                        var12 = -var7 + (var9 + 1) >> 1261234401;
                        L10: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L9;
                          } else {
                            eh.field_f[var11] = 16777215;
                            var11 += 2;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  eh.field_f[var11] = 16777215;
                  var11 += 2;
                  continue L6;
                }
              }
            } else {
              L11: {
                if (var5 < eh.field_a) {
                  break L11;
                } else {
                  if (eh.field_k <= var5) {
                    break L11;
                  } else {
                    var11 = var5 + (var8 - -(1 & var5 + -param0)) * eh.field_g;
                    var12 = var10 + 1 - var8 >> -1445603231;
                    L12: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L11;
                      } else {
                        eh.field_f[var11] = 16777215;
                        var11 = var11 + 2 * eh.field_g;
                        continue L12;
                      }
                    }
                  }
                }
              }
              L13: {
                if (eh.field_d > param2) {
                  break L13;
                } else {
                  if (eh.field_e <= var6) {
                    break L13;
                  } else {
                    var11 = var6 * eh.field_g + var7 + (1 & var6 + -param2);
                    var12 = -var7 + (var9 + 1) >> 1261234401;
                    L14: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L13;
                      } else {
                        eh.field_f[var11] = 16777215;
                        var11 += 2;
                        continue L14;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L15: {
              if (var5 < eh.field_a) {
                break L15;
              } else {
                if (eh.field_k <= var5) {
                  break L15;
                } else {
                  var11 = var5 + (var8 - -(1 & var5 + -param0)) * eh.field_g;
                  var12 = var10 + 1 - var8 >> -1445603231;
                  L16: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L15;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 = var11 + 2 * eh.field_g;
                      continue L16;
                    }
                  }
                }
              }
            }
            L17: {
              if (eh.field_d > param2) {
                break L17;
              } else {
                if (eh.field_e <= var6) {
                  break L17;
                } else {
                  var11 = var6 * eh.field_g + var7 + (1 & var6 + -param2);
                  var12 = -var7 + (var9 + 1) >> 1261234401;
                  L18: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L17;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 += 2;
                      continue L18;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          L19: {
            field_M = 88;
            if (param0 > eh.field_a) {
              stackOut_3_0 = param0;
              stackIn_4_0 = stackOut_3_0;
              break L19;
            } else {
              stackOut_2_0 = eh.field_a;
              stackIn_4_0 = stackOut_2_0;
              break L19;
            }
          }
          L20: {
            var7 = stackIn_4_0;
            if (eh.field_d >= param2) {
              stackOut_6_0 = eh.field_d;
              stackIn_7_0 = stackOut_6_0;
              break L20;
            } else {
              stackOut_5_0 = param2;
              stackIn_7_0 = stackOut_5_0;
              break L20;
            }
          }
          L21: {
            var8 = stackIn_7_0;
            if (var5 >= eh.field_k) {
              stackOut_9_0 = eh.field_k;
              stackIn_10_0 = stackOut_9_0;
              break L21;
            } else {
              stackOut_8_0 = var5;
              stackIn_10_0 = stackOut_8_0;
              break L21;
            }
          }
          L22: {
            var9 = stackIn_10_0;
            if (eh.field_e > var6) {
              stackOut_12_0 = var6;
              stackIn_13_0 = stackOut_12_0;
              break L22;
            } else {
              stackOut_11_0 = eh.field_e;
              stackIn_13_0 = stackOut_11_0;
              break L22;
            }
          }
          L23: {
            var10 = stackIn_13_0;
            if (eh.field_a > param0) {
              break L23;
            } else {
              if (eh.field_k <= param0) {
                break L23;
              } else {
                var11 = param0 + eh.field_g * var8;
                var12 = var10 + (1 - var8) >> 683885665;
                L24: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L23;
                  } else {
                    eh.field_f[var11] = 16777215;
                    var11 = var11 + eh.field_g * 2;
                    continue L24;
                  }
                }
              }
            }
          }
          if (eh.field_d <= param2) {
            if (eh.field_e <= var6) {
              L25: {
                if (var5 < eh.field_a) {
                  break L25;
                } else {
                  if (eh.field_k <= var5) {
                    break L25;
                  } else {
                    var11 = var5 + (var8 - -(1 & var5 + -param0)) * eh.field_g;
                    var12 = var10 + 1 - var8 >> -1445603231;
                    L26: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L25;
                      } else {
                        eh.field_f[var11] = 16777215;
                        var11 = var11 + 2 * eh.field_g;
                        continue L26;
                      }
                    }
                  }
                }
              }
              L27: {
                if (eh.field_d > param2) {
                  break L27;
                } else {
                  if (eh.field_e <= var6) {
                    break L27;
                  } else {
                    var11 = var6 * eh.field_g + var7 + (1 & var6 + -param2);
                    var12 = -var7 + (var9 + 1) >> 1261234401;
                    L28: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L27;
                      } else {
                        eh.field_f[var11] = 16777215;
                        var11 += 2;
                        continue L28;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              var11 = eh.field_g * param2 + var7;
              var12 = var9 + (1 - var7) >> 1076792129;
              L29: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  L30: {
                    if (var5 < eh.field_a) {
                      break L30;
                    } else {
                      if (eh.field_k <= var5) {
                        break L30;
                      } else {
                        var11 = var5 + (var8 - -(1 & var5 + -param0)) * eh.field_g;
                        var12 = var10 + 1 - var8 >> -1445603231;
                        L31: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L30;
                          } else {
                            eh.field_f[var11] = 16777215;
                            var11 = var11 + 2 * eh.field_g;
                            continue L31;
                          }
                        }
                      }
                    }
                  }
                  L32: {
                    if (eh.field_d > param2) {
                      break L32;
                    } else {
                      if (eh.field_e <= var6) {
                        break L32;
                      } else {
                        var11 = var6 * eh.field_g + var7 + (1 & var6 + -param2);
                        var12 = -var7 + (var9 + 1) >> 1261234401;
                        L33: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L32;
                          } else {
                            eh.field_f[var11] = 16777215;
                            var11 += 2;
                            continue L33;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  eh.field_f[var11] = 16777215;
                  var11 += 2;
                  continue L29;
                }
              }
            }
          } else {
            L34: {
              if (var5 < eh.field_a) {
                break L34;
              } else {
                if (eh.field_k <= var5) {
                  break L34;
                } else {
                  var11 = var5 + (var8 - -(1 & var5 + -param0)) * eh.field_g;
                  var12 = var10 + 1 - var8 >> -1445603231;
                  L35: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L34;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 = var11 + 2 * eh.field_g;
                      continue L35;
                    }
                  }
                }
              }
            }
            L36: {
              if (eh.field_d > param2) {
                break L36;
              } else {
                if (eh.field_e <= var6) {
                  break L36;
                } else {
                  var11 = var6 * eh.field_g + var7 + (1 & var6 + -param2);
                  var12 = -var7 + (var9 + 1) >> 1261234401;
                  L37: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L36;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 += 2;
                      continue L37;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = 50;
        field_K = -1;
        field_J = "Ranking: Puddle Splasher";
        field_L = "Sell<br>Basic Kit";
    }
}
