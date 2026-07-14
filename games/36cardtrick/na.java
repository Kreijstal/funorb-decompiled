/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends la {
    byte field_u;
    static int[] field_q;
    int field_t;
    static String field_p;
    static w field_r;
    pb field_s;

    final byte[] b(boolean param0) {
        if (param0) {
          if (!((na) this).field_n) {
            if (((na) this).field_s.field_i < -((na) this).field_u + ((na) this).field_s.field_g.length) {
              throw new RuntimeException();
            } else {
              return ((na) this).field_s.field_g;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          return (byte[]) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
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
        var13 = Main.field_T;
        var5 = param4 - -param2;
        var6 = param0 - -param3;
        if (param1 > 45) {
          L0: {
            if (vj.field_f >= param4) {
              stackOut_4_0 = vj.field_f;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param4;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_5_0;
            if (vj.field_h >= param0) {
              stackOut_7_0 = vj.field_h;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = param0;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_8_0;
            if (vj.field_a > var5) {
              stackOut_10_0 = var5;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = vj.field_a;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_11_0;
            if (vj.field_b <= var6) {
              stackOut_13_0 = vj.field_b;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = var6;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          var10 = stackIn_14_0;
          if (param4 >= vj.field_f) {
            if (param4 < vj.field_a) {
              var11 = param4 + var8 * vj.field_l;
              var12 = 1 + (var10 - var8) >> 1972588481;
              L4: while (true) {
                var12--;
                if (0 > var12) {
                  L5: {
                    if (vj.field_h > param0) {
                      break L5;
                    } else {
                      if (vj.field_b > var6) {
                        var11 = var7 + param0 * vj.field_l;
                        var12 = var9 + (1 + -var7) >> 1471198849;
                        L6: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L5;
                          } else {
                            vj.field_j[var11] = 16777215;
                            var11 += 2;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (vj.field_f > var5) {
                            break L7;
                          } else {
                            if (var5 >= vj.field_a) {
                              break L7;
                            } else {
                              var11 = var5 + vj.field_l * (var8 + (1 & var5 - param4));
                              var12 = 1 - (-var10 - -var8) >> 1271853441;
                              L8: while (true) {
                                var12--;
                                if ((var12 ^ -1) > -1) {
                                  break L7;
                                } else {
                                  vj.field_j[var11] = 16777215;
                                  var11 = var11 + vj.field_l * 2;
                                  continue L8;
                                }
                              }
                            }
                          }
                        }
                        L9: {
                          if (param0 < vj.field_h) {
                            break L9;
                          } else {
                            if (vj.field_b > var6) {
                              var11 = var7 + (vj.field_l * var6 - -(-param0 + var6 & 1));
                              var12 = 1 + var9 + -var7 >> 1371536097;
                              L10: while (true) {
                                var12--;
                                if (0 > var12) {
                                  break L9;
                                } else {
                                  vj.field_j[var11] = 16777215;
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
                    if (vj.field_f > var5) {
                      break L11;
                    } else {
                      if (var5 >= vj.field_a) {
                        break L11;
                      } else {
                        var11 = var5 + vj.field_l * (var8 + (1 & var5 - param4));
                        var12 = 1 - (-var10 - -var8) >> 1271853441;
                        L12: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L11;
                          } else {
                            vj.field_j[var11] = 16777215;
                            var11 = var11 + vj.field_l * 2;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (param0 < vj.field_h) {
                      break L13;
                    } else {
                      if (vj.field_b > var6) {
                        var11 = var7 + (vj.field_l * var6 - -(-param0 + var6 & 1));
                        var12 = 1 + var9 + -var7 >> 1371536097;
                        L14: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L13;
                          } else {
                            vj.field_j[var11] = 16777215;
                            var11 += 2;
                            continue L14;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  vj.field_j[var11] = 16777215;
                  var11 = var11 + vj.field_l * 2;
                  continue L4;
                }
              }
            } else {
              if (vj.field_h <= param0) {
                if (vj.field_b > var6) {
                  var11 = var7 + param0 * vj.field_l;
                  var12 = var9 + (1 + -var7) >> 1471198849;
                  L15: while (true) {
                    var12--;
                    if (var12 < 0) {
                      L16: {
                        if (vj.field_f > var5) {
                          break L16;
                        } else {
                          if (var5 >= vj.field_a) {
                            break L16;
                          } else {
                            var11 = var5 + vj.field_l * (var8 + (1 & var5 - param4));
                            var12 = 1 - (-var10 - -var8) >> 1271853441;
                            L17: while (true) {
                              var12--;
                              if ((var12 ^ -1) > -1) {
                                break L16;
                              } else {
                                vj.field_j[var11] = 16777215;
                                var11 = var11 + vj.field_l * 2;
                                continue L17;
                              }
                            }
                          }
                        }
                      }
                      L18: {
                        if (param0 < vj.field_h) {
                          break L18;
                        } else {
                          if (vj.field_b > var6) {
                            var11 = var7 + (vj.field_l * var6 - -(-param0 + var6 & 1));
                            var12 = 1 + var9 + -var7 >> 1371536097;
                            L19: while (true) {
                              var12--;
                              if (0 > var12) {
                                break L18;
                              } else {
                                vj.field_j[var11] = 16777215;
                                var11 += 2;
                                continue L19;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      vj.field_j[var11] = 16777215;
                      var11 += 2;
                      continue L15;
                    }
                  }
                } else {
                  L20: {
                    if (vj.field_f > var5) {
                      break L20;
                    } else {
                      if (var5 >= vj.field_a) {
                        break L20;
                      } else {
                        var11 = var5 + vj.field_l * (var8 + (1 & var5 - param4));
                        var12 = 1 - (-var10 - -var8) >> 1271853441;
                        L21: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L20;
                          } else {
                            vj.field_j[var11] = 16777215;
                            var11 = var11 + vj.field_l * 2;
                            continue L21;
                          }
                        }
                      }
                    }
                  }
                  if (param0 >= vj.field_h) {
                    if (vj.field_b > var6) {
                      var11 = var7 + (vj.field_l * var6 - -(-param0 + var6 & 1));
                      var12 = 1 + var9 + -var7 >> 1371536097;
                      L22: while (true) {
                        var12--;
                        if (0 > var12) {
                          return;
                        } else {
                          vj.field_j[var11] = 16777215;
                          var11 += 2;
                          continue L22;
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
                L23: {
                  if (vj.field_f > var5) {
                    break L23;
                  } else {
                    if (var5 >= vj.field_a) {
                      break L23;
                    } else {
                      var11 = var5 + vj.field_l * (var8 + (1 & var5 - param4));
                      var12 = 1 - (-var10 - -var8) >> 1271853441;
                      L24: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L23;
                        } else {
                          vj.field_j[var11] = 16777215;
                          var11 = var11 + vj.field_l * 2;
                          continue L24;
                        }
                      }
                    }
                  }
                }
                if (param0 >= vj.field_h) {
                  if (vj.field_b <= var6) {
                    return;
                  } else {
                    var11 = var7 + (vj.field_l * var6 - -(-param0 + var6 & 1));
                    var12 = 1 + var9 + -var7 >> 1371536097;
                    L25: while (true) {
                      var12--;
                      if (0 > var12) {
                        return;
                      } else {
                        vj.field_j[var11] = 16777215;
                        var11 += 2;
                        continue L25;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            L26: {
              if (vj.field_h > param0) {
                break L26;
              } else {
                if (vj.field_b > var6) {
                  var11 = var7 + param0 * vj.field_l;
                  var12 = var9 + (1 + -var7) >> 1471198849;
                  L27: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L26;
                    } else {
                      vj.field_j[var11] = 16777215;
                      var11 += 2;
                      continue L27;
                    }
                  }
                } else {
                  L28: {
                    if (vj.field_f > var5) {
                      break L28;
                    } else {
                      if (var5 >= vj.field_a) {
                        break L28;
                      } else {
                        var11 = var5 + vj.field_l * (var8 + (1 & var5 - param4));
                        var12 = 1 - (-var10 - -var8) >> 1271853441;
                        L29: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L28;
                          } else {
                            vj.field_j[var11] = 16777215;
                            var11 = var11 + vj.field_l * 2;
                            continue L29;
                          }
                        }
                      }
                    }
                  }
                  L30: {
                    if (param0 < vj.field_h) {
                      break L30;
                    } else {
                      if (vj.field_b > var6) {
                        var11 = var7 + (vj.field_l * var6 - -(-param0 + var6 & 1));
                        var12 = 1 + var9 + -var7 >> 1371536097;
                        L31: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L30;
                          } else {
                            vj.field_j[var11] = 16777215;
                            var11 += 2;
                            continue L31;
                          }
                        }
                      } else {
                        break L30;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L32: {
              if (vj.field_f > var5) {
                break L32;
              } else {
                if (var5 >= vj.field_a) {
                  break L32;
                } else {
                  var11 = var5 + vj.field_l * (var8 + (1 & var5 - param4));
                  var12 = 1 - (-var10 - -var8) >> 1271853441;
                  L33: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L32;
                    } else {
                      vj.field_j[var11] = 16777215;
                      var11 = var11 + vj.field_l * 2;
                      continue L33;
                    }
                  }
                }
              }
            }
            if (param0 >= vj.field_h) {
              if (vj.field_b <= var6) {
                return;
              } else {
                var11 = var7 + (vj.field_l * var6 - -(-param0 + var6 & 1));
                var12 = 1 + var9 + -var7 >> 1371536097;
                L34: while (true) {
                  var12--;
                  if (0 > var12) {
                    return;
                  } else {
                    vj.field_j[var11] = 16777215;
                    var11 += 2;
                    continue L34;
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

    final int a(boolean param0) {
        if (null == ((na) this).field_s) {
          return 0;
        } else {
          if (param0) {
            na.c(true);
            return 100 * ((na) this).field_s.field_i / (((na) this).field_s.field_g.length - ((na) this).field_u);
          } else {
            return 100 * ((na) this).field_s.field_i / (((na) this).field_s.field_g.length - ((na) this).field_u);
          }
        }
    }

    public static void c(boolean param0) {
        field_r = null;
        field_p = null;
        if (param0) {
            field_q = (int[]) null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    na() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Reload game";
    }
}
