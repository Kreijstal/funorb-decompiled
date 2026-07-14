/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jba implements wwa {
    private int field_i;
    private int field_a;
    private int field_f;
    private no field_g;
    private int field_d;
    static llb field_b;
    private int field_c;
    static llb field_h;
    private int field_e;

    final static wfb a(int[][] param0, long param1, int param2, Random param3, int param4, long param5) {
        Object var8 = null;
        int[] var8_array = null;
        int var9_int = 0;
        int[][] var9 = null;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        Random var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Random var15 = null;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[][] var21 = null;
        wfb var22 = null;
        int[] var23 = null;
        int[][] var24 = null;
        int[] var25 = null;
        int[][] var26 = null;
        int[] var27 = null;
        int[][] var28 = null;
        int[] var29 = null;
        var19 = VoidHunters.field_G;
        var8 = null;
        if (param0 != null) {
          var20 = param0[0];
          var8_array = var20;
          var9_int = 0;
          L0: while (true) {
            if (var9_int >= var20.length / 2) {
              var9_int = 0;
              L1: while (true) {
                if (var9_int >= var20.length) {
                  var28 = new int[-1 + param0.length][];
                  var26 = var28;
                  var24 = var26;
                  var21 = var24;
                  var9 = var21;
                  var10 = 0;
                  L2: while (true) {
                    if (var28.length <= var10) {
                      L3: {
                        param0 = var9;
                        if (var8_array == null) {
                          var8_array = tka.a(param1, (byte) 55, param5, param2, param3);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var22 = new wfb(var8_array, 0, 0);
                      var22.a(4, 102, false);
                      if (param0 != null) {
                        var22.field_w = param0;
                        var22.field_m = true;
                        var22.field_k = false;
                        var10 = 71 / ((param4 - 45) / 63);
                        var22.a(121, 8);
                        var22.field_B = 16;
                        var22.field_r = true;
                        return var22;
                      } else {
                        var22.field_w = new int[3][];
                        var10_ref_int__ = var8_array;
                        var11 = new Random((long)var8_array[0]);
                        var12 = hob.a(var11, (int)param5, 121) + -((int)param5 >> -767461247) << -181363549;
                        var13 = hob.a(var11, (int)param5, 119) - ((int)param5 >> -1104729887) << 1331144035;
                        var14 = 0;
                        L4: while (true) {
                          L5: {
                            if (3 <= var14) {
                              break L5;
                            } else {
                              var15 = new Random((long)var10_ref_int__[1]);
                              var29 = tka.a(param1, (byte) 55, param5 * 2L / (long)(2 + var14), param2, var15);
                              var27 = var29;
                              var25 = var27;
                              var23 = var25;
                              var16 = var23;
                              var17 = 0;
                              L6: while (true) {
                                L7: {
                                  if (var17 >= var29.length) {
                                    break L7;
                                  } else {
                                    var16[var17] = var16[var17] << 4;
                                    var17++;
                                    if (0 == 0) {
                                      continue L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var17 = 0;
                                L8: while (true) {
                                  L9: {
                                    if (var17 >= var29.length) {
                                      break L9;
                                    } else {
                                      var16[var17] = var16[var17] + var12 * (var14 - -1);
                                      var16[1 + var17] = var16[1 + var17] + var13 * (1 + var14);
                                      var18 = 0;
                                      L10: while (true) {
                                        L11: {
                                          if (var18 >= 100) {
                                            break L11;
                                          } else {
                                            if (fra.a(var10_ref_int__, var16[var17 + 1], 2, var29[var17])) {
                                              break L11;
                                            } else {
                                              var16[var17] = var29[var17] * 200 >> -198628536;
                                              var16[1 + var17] = var16[var17 - -1] * 200 >> -1287533688;
                                              var18++;
                                              if (0 == 0) {
                                                continue L10;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                        var17 += 2;
                                        if (0 == 0) {
                                          continue L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                  var22.field_w[var14] = var29;
                                  var10_ref_int__ = var16;
                                  var14++;
                                  if (0 == 0) {
                                    continue L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          var22.field_m = true;
                          var22.field_k = false;
                          var10 = 71 / ((param4 - 45) / 63);
                          var22.a(121, 8);
                          var22.field_B = 16;
                          var22.field_r = true;
                          return var22;
                        }
                      }
                    } else {
                      var9[var10] = param0[1 + var10];
                      var10++;
                      if (0 == 0) {
                        if (0 == 0) {
                          continue L2;
                        } else {
                          L12: {
                            param0 = var9;
                            if (var8_array == null) {
                              var8_array = tka.a(param1, (byte) 55, param5, param2, param3);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: {
                            L14: {
                              var22 = new wfb(var8_array, 0, 0);
                              var22.a(4, 102, false);
                              if (param0 == null) {
                                break L14;
                              } else {
                                var22.field_w = param0;
                                if (0 == 0) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            var22.field_w = new int[3][];
                            var10_ref_int__ = var8_array;
                            var11 = new Random((long)var8_array[0]);
                            var12 = hob.a(var11, (int)param5, 121) + -((int)param5 >> -767461247) << -181363549;
                            var13 = hob.a(var11, (int)param5, 119) - ((int)param5 >> -1104729887) << 1331144035;
                            var14 = 0;
                            L15: while (true) {
                              if (3 <= var14) {
                                break L13;
                              } else {
                                var15 = new Random((long)var10_ref_int__[1]);
                                var29 = tka.a(param1, (byte) 55, param5 * 2L / (long)(2 + var14), param2, var15);
                                var27 = var29;
                                var25 = var27;
                                var23 = var25;
                                var16 = var23;
                                var17 = 0;
                                L16: while (true) {
                                  L17: {
                                    if (var17 >= var29.length) {
                                      break L17;
                                    } else {
                                      var16[var17] = var16[var17] << 4;
                                      var17++;
                                      if (0 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  var17 = 0;
                                  L18: while (true) {
                                    L19: {
                                      if (var17 >= var29.length) {
                                        break L19;
                                      } else {
                                        var16[var17] = var16[var17] + var12 * (var14 - -1);
                                        var16[1 + var17] = var16[1 + var17] + var13 * (1 + var14);
                                        var18 = 0;
                                        L20: while (true) {
                                          L21: {
                                            if (var18 >= 100) {
                                              break L21;
                                            } else {
                                              if (fra.a(var10_ref_int__, var16[var17 + 1], 2, var29[var17])) {
                                                break L21;
                                              } else {
                                                var16[var17] = var29[var17] * 200 >> -198628536;
                                                var16[1 + var17] = var16[var17 - -1] * 200 >> -1287533688;
                                                var18++;
                                                if (0 == 0) {
                                                  continue L20;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                          }
                                          var17 += 2;
                                          if (0 == 0) {
                                            continue L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                    }
                                    var22.field_w[var14] = var29;
                                    var10_ref_int__ = var16;
                                    var14++;
                                    if (0 == 0) {
                                      continue L15;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var22.field_m = true;
                          var22.field_k = false;
                          var10 = 71 / ((param4 - 45) / 63);
                          var22.a(121, 8);
                          var22.field_B = 16;
                          var22.field_r = true;
                          return var22;
                        }
                      } else {
                        L22: {
                          if (var8_array == null) {
                            var8_array = tka.a(param1, (byte) 55, param5, param2, param3);
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        var22 = new wfb(var8_array, 0, 0);
                        var22.a(4, 102, false);
                        if (param0 != null) {
                          var22.field_w = param0;
                          var22.field_m = true;
                          var22.field_k = false;
                          var10 = 71 / ((param4 - 45) / 63);
                          var22.a(121, 8);
                          var22.field_B = 16;
                          var22.field_r = true;
                          return var22;
                        } else {
                          var22.field_w = new int[3][];
                          var10_ref_int__ = var8_array;
                          var11 = new Random((long)var8_array[0]);
                          var12 = hob.a(var11, (int)param5, 121) + -((int)param5 >> -767461247) << -181363549;
                          var13 = hob.a(var11, (int)param5, 119) - ((int)param5 >> -1104729887) << 1331144035;
                          var14 = 0;
                          L23: while (true) {
                            L24: {
                              if (3 <= var14) {
                                break L24;
                              } else {
                                var15 = new Random((long)var10_ref_int__[1]);
                                var29 = tka.a(param1, (byte) 55, param5 * 2L / (long)(2 + var14), param2, var15);
                                var27 = var29;
                                var25 = var27;
                                var23 = var25;
                                var16 = var23;
                                var17 = 0;
                                L25: while (true) {
                                  L26: {
                                    if (var17 >= var29.length) {
                                      break L26;
                                    } else {
                                      var16[var17] = var16[var17] << 4;
                                      var17++;
                                      if (0 == 0) {
                                        continue L25;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  var17 = 0;
                                  L27: while (true) {
                                    L28: {
                                      if (var17 >= var29.length) {
                                        break L28;
                                      } else {
                                        var16[var17] = var16[var17] + var12 * (var14 - -1);
                                        var16[1 + var17] = var16[1 + var17] + var13 * (1 + var14);
                                        var18 = 0;
                                        L29: while (true) {
                                          L30: {
                                            if (var18 >= 100) {
                                              break L30;
                                            } else {
                                              if (fra.a(var10_ref_int__, var16[var17 + 1], 2, var29[var17])) {
                                                break L30;
                                              } else {
                                                var16[var17] = var29[var17] * 200 >> -198628536;
                                                var16[1 + var17] = var16[var17 - -1] * 200 >> -1287533688;
                                                var18++;
                                                if (0 == 0) {
                                                  continue L29;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                            }
                                          }
                                          var17 += 2;
                                          if (0 == 0) {
                                            continue L27;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                    }
                                    var22.field_w[var14] = var29;
                                    var10_ref_int__ = var16;
                                    var14++;
                                    if (0 == 0) {
                                      continue L23;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                              }
                            }
                            var22.field_m = true;
                            var22.field_k = false;
                            var10 = 71 / ((param4 - 45) / 63);
                            var22.a(121, 8);
                            var22.field_B = 16;
                            var22.field_r = true;
                            return var22;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var8_array[var9_int] = var8_array[var9_int] >> 4;
                  var9_int++;
                  if (0 == 0) {
                    if (0 == 0) {
                      continue L1;
                    } else {
                      var28 = new int[-1 + param0.length][];
                      var26 = var28;
                      var24 = var26;
                      var21 = var24;
                      var9 = var21;
                      var10 = 0;
                      L31: while (true) {
                        L32: {
                          if (var28.length <= var10) {
                            break L32;
                          } else {
                            var9[var10] = param0[1 + var10];
                            var10++;
                            if (0 == 0) {
                              continue L31;
                            } else {
                              break L32;
                            }
                          }
                        }
                        L33: {
                          param0 = var9;
                          if (var8_array == null) {
                            var8_array = tka.a(param1, (byte) 55, param5, param2, param3);
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        L34: {
                          L35: {
                            var22 = new wfb(var8_array, 0, 0);
                            var22.a(4, 102, false);
                            if (param0 == null) {
                              break L35;
                            } else {
                              var22.field_w = param0;
                              if (0 == 0) {
                                break L34;
                              } else {
                                break L35;
                              }
                            }
                          }
                          var22.field_w = new int[3][];
                          var10_ref_int__ = var8_array;
                          var11 = new Random((long)var8_array[0]);
                          var12 = hob.a(var11, (int)param5, 121) + -((int)param5 >> -767461247) << -181363549;
                          var13 = hob.a(var11, (int)param5, 119) - ((int)param5 >> -1104729887) << 1331144035;
                          var14 = 0;
                          L36: while (true) {
                            if (3 <= var14) {
                              break L34;
                            } else {
                              var15 = new Random((long)var10_ref_int__[1]);
                              var29 = tka.a(param1, (byte) 55, param5 * 2L / (long)(2 + var14), param2, var15);
                              var27 = var29;
                              var25 = var27;
                              var23 = var25;
                              var16 = var23;
                              var17 = 0;
                              L37: while (true) {
                                L38: {
                                  if (var17 >= var29.length) {
                                    break L38;
                                  } else {
                                    var16[var17] = var16[var17] << 4;
                                    var17++;
                                    if (0 == 0) {
                                      continue L37;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                                var17 = 0;
                                L39: while (true) {
                                  L40: {
                                    if (var17 >= var29.length) {
                                      break L40;
                                    } else {
                                      var16[var17] = var16[var17] + var12 * (var14 - -1);
                                      var16[1 + var17] = var16[1 + var17] + var13 * (1 + var14);
                                      var18 = 0;
                                      L41: while (true) {
                                        L42: {
                                          if (var18 >= 100) {
                                            break L42;
                                          } else {
                                            if (fra.a(var10_ref_int__, var16[var17 + 1], 2, var29[var17])) {
                                              break L42;
                                            } else {
                                              var16[var17] = var29[var17] * 200 >> -198628536;
                                              var16[1 + var17] = var16[var17 - -1] * 200 >> -1287533688;
                                              var18++;
                                              if (0 == 0) {
                                                continue L41;
                                              } else {
                                                break L42;
                                              }
                                            }
                                          }
                                        }
                                        var17 += 2;
                                        if (0 == 0) {
                                          continue L39;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                  }
                                  var22.field_w[var14] = var29;
                                  var10_ref_int__ = var16;
                                  var14++;
                                  if (0 == 0) {
                                    continue L36;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var22.field_m = true;
                        var22.field_k = false;
                        var10 = 71 / ((param4 - 45) / 63);
                        var22.a(121, 8);
                        var22.field_B = 16;
                        var22.field_r = true;
                        return var22;
                      }
                    }
                  } else {
                    L43: {
                      if (var8_array == null) {
                        var8_array = tka.a(param1, (byte) 55, param5, param2, param3);
                        break L43;
                      } else {
                        break L43;
                      }
                    }
                    var22 = new wfb(var8_array, 0, 0);
                    var22.a(4, 102, false);
                    if (param0 != null) {
                      var22.field_w = param0;
                      var22.field_m = true;
                      var22.field_k = false;
                      var10 = 71 / ((param4 - 45) / 63);
                      var22.a(121, 8);
                      var22.field_B = 16;
                      var22.field_r = true;
                      return var22;
                    } else {
                      var22.field_w = new int[3][];
                      var10_ref_int__ = var8_array;
                      var11 = new Random((long)var8_array[0]);
                      var12 = hob.a(var11, (int)param5, 121) + -((int)param5 >> -767461247) << -181363549;
                      var13 = hob.a(var11, (int)param5, 119) - ((int)param5 >> -1104729887) << 1331144035;
                      var14 = 0;
                      L44: while (true) {
                        L45: {
                          if (3 <= var14) {
                            break L45;
                          } else {
                            var15 = new Random((long)var10_ref_int__[1]);
                            var29 = tka.a(param1, (byte) 55, param5 * 2L / (long)(2 + var14), param2, var15);
                            var27 = var29;
                            var25 = var27;
                            var23 = var25;
                            var16 = var23;
                            var17 = 0;
                            L46: while (true) {
                              L47: {
                                if (var17 >= var29.length) {
                                  break L47;
                                } else {
                                  var16[var17] = var16[var17] << 4;
                                  var17++;
                                  if (0 == 0) {
                                    continue L46;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                              var17 = 0;
                              L48: while (true) {
                                L49: {
                                  if (var17 >= var29.length) {
                                    break L49;
                                  } else {
                                    var16[var17] = var16[var17] + var12 * (var14 - -1);
                                    var16[1 + var17] = var16[1 + var17] + var13 * (1 + var14);
                                    var18 = 0;
                                    L50: while (true) {
                                      L51: {
                                        if (var18 >= 100) {
                                          break L51;
                                        } else {
                                          if (fra.a(var10_ref_int__, var16[var17 + 1], 2, var29[var17])) {
                                            break L51;
                                          } else {
                                            var16[var17] = var29[var17] * 200 >> -198628536;
                                            var16[1 + var17] = var16[var17 - -1] * 200 >> -1287533688;
                                            var18++;
                                            if (0 == 0) {
                                              continue L50;
                                            } else {
                                              break L51;
                                            }
                                          }
                                        }
                                      }
                                      var17 += 2;
                                      if (0 == 0) {
                                        continue L48;
                                      } else {
                                        break L49;
                                      }
                                    }
                                  }
                                }
                                var22.field_w[var14] = var29;
                                var10_ref_int__ = var16;
                                var14++;
                                if (0 == 0) {
                                  continue L44;
                                } else {
                                  break L45;
                                }
                              }
                            }
                          }
                        }
                        var22.field_m = true;
                        var22.field_k = false;
                        var10 = 71 / ((param4 - 45) / 63);
                        var22.a(121, 8);
                        var22.field_B = 16;
                        var22.field_r = true;
                        return var22;
                      }
                    }
                  }
                }
              }
            } else {
              var10 = var20[var9_int];
              var11_int = var8_array[1 + var9_int];
              var12 = var20.length - (2 - -var9_int);
              var13 = var20[var12];
              var14 = var8_array[var12 + 1];
              var20[var9_int] = var13;
              var8_array[1 + var9_int] = var14;
              var20[var12] = var10;
              var8_array[var12 - -1] = var11_int;
              var9_int += 2;
              if (0 == 0) {
                continue L0;
              } else {
                var9_int = 0;
                L52: while (true) {
                  L53: {
                    if (var9_int >= var20.length) {
                      var28 = new int[-1 + param0.length][];
                      var26 = var28;
                      var24 = var26;
                      var21 = var24;
                      var9 = var21;
                      var10 = 0;
                      break L53;
                    } else {
                      var8_array[var9_int] = var8_array[var9_int] >> 4;
                      var9_int++;
                      if (0 == 0) {
                        continue L52;
                      } else {
                        var28 = new int[-1 + param0.length][];
                        var26 = var28;
                        var24 = var26;
                        var21 = var24;
                        var9 = var21;
                        var10 = 0;
                        break L53;
                      }
                    }
                  }
                  L54: while (true) {
                    L55: {
                      if (var28.length <= var10) {
                        break L55;
                      } else {
                        var9[var10] = param0[1 + var10];
                        var10++;
                        if (0 == 0) {
                          continue L54;
                        } else {
                          break L55;
                        }
                      }
                    }
                    L56: {
                      param0 = var9;
                      if (var8_array == null) {
                        var8_array = tka.a(param1, (byte) 55, param5, param2, param3);
                        break L56;
                      } else {
                        break L56;
                      }
                    }
                    L57: {
                      L58: {
                        var22 = new wfb(var8_array, 0, 0);
                        var22.a(4, 102, false);
                        if (param0 == null) {
                          break L58;
                        } else {
                          var22.field_w = param0;
                          if (0 == 0) {
                            break L57;
                          } else {
                            break L58;
                          }
                        }
                      }
                      var22.field_w = new int[3][];
                      var10_ref_int__ = var8_array;
                      var11 = new Random((long)var8_array[0]);
                      var12 = hob.a(var11, (int)param5, 121) + -((int)param5 >> -767461247) << -181363549;
                      var13 = hob.a(var11, (int)param5, 119) - ((int)param5 >> -1104729887) << 1331144035;
                      var14 = 0;
                      L59: while (true) {
                        if (3 <= var14) {
                          break L57;
                        } else {
                          var15 = new Random((long)var10_ref_int__[1]);
                          var29 = tka.a(param1, (byte) 55, param5 * 2L / (long)(2 + var14), param2, var15);
                          var27 = var29;
                          var25 = var27;
                          var23 = var25;
                          var16 = var23;
                          var17 = 0;
                          L60: while (true) {
                            L61: {
                              if (var17 >= var29.length) {
                                break L61;
                              } else {
                                var16[var17] = var16[var17] << 4;
                                var17++;
                                if (0 == 0) {
                                  continue L60;
                                } else {
                                  break L61;
                                }
                              }
                            }
                            var17 = 0;
                            L62: while (true) {
                              L63: {
                                if (var17 >= var29.length) {
                                  break L63;
                                } else {
                                  var16[var17] = var16[var17] + var12 * (var14 - -1);
                                  var16[1 + var17] = var16[1 + var17] + var13 * (1 + var14);
                                  var18 = 0;
                                  L64: while (true) {
                                    L65: {
                                      if (var18 >= 100) {
                                        break L65;
                                      } else {
                                        if (fra.a(var10_ref_int__, var16[var17 + 1], 2, var29[var17])) {
                                          break L65;
                                        } else {
                                          var16[var17] = var29[var17] * 200 >> -198628536;
                                          var16[1 + var17] = var16[var17 - -1] * 200 >> -1287533688;
                                          var18++;
                                          if (0 == 0) {
                                            continue L64;
                                          } else {
                                            break L65;
                                          }
                                        }
                                      }
                                    }
                                    var17 += 2;
                                    if (0 == 0) {
                                      continue L62;
                                    } else {
                                      break L63;
                                    }
                                  }
                                }
                              }
                              var22.field_w[var14] = var29;
                              var10_ref_int__ = var16;
                              var14++;
                              if (0 == 0) {
                                continue L59;
                              } else {
                                break L57;
                              }
                            }
                          }
                        }
                      }
                    }
                    var22.field_m = true;
                    var22.field_k = false;
                    var10 = 71 / ((param4 - 45) / 63);
                    var22.a(121, 8);
                    var22.field_B = 16;
                    var22.field_r = true;
                    return var22;
                  }
                }
              }
            }
          }
        } else {
          L66: {
            if (var8 == null) {
              var8_array = tka.a(param1, (byte) 55, param5, param2, param3);
              break L66;
            } else {
              break L66;
            }
          }
          L67: {
            L68: {
              var22 = new wfb(var8_array, 0, 0);
              var22.a(4, 102, false);
              if (param0 == null) {
                break L68;
              } else {
                var22.field_w = param0;
                if (0 == 0) {
                  break L67;
                } else {
                  break L68;
                }
              }
            }
            var22.field_w = new int[3][];
            var10_ref_int__ = var8_array;
            var11 = new Random((long)var8_array[0]);
            var12 = hob.a(var11, (int)param5, 121) + -((int)param5 >> -767461247) << -181363549;
            var13 = hob.a(var11, (int)param5, 119) - ((int)param5 >> -1104729887) << 1331144035;
            var14 = 0;
            L69: while (true) {
              if (3 <= var14) {
                break L67;
              } else {
                var15 = new Random((long)var10_ref_int__[1]);
                var29 = tka.a(param1, (byte) 55, param5 * 2L / (long)(2 + var14), param2, var15);
                var27 = var29;
                var25 = var27;
                var23 = var25;
                var16 = var23;
                var17 = 0;
                L70: while (true) {
                  L71: {
                    if (var17 >= var29.length) {
                      break L71;
                    } else {
                      var16[var17] = var16[var17] << 4;
                      var17++;
                      if (0 == 0) {
                        continue L70;
                      } else {
                        break L71;
                      }
                    }
                  }
                  var17 = 0;
                  L72: while (true) {
                    L73: {
                      if (var17 >= var29.length) {
                        break L73;
                      } else {
                        var16[var17] = var16[var17] + var12 * (var14 - -1);
                        var16[1 + var17] = var16[1 + var17] + var13 * (1 + var14);
                        var18 = 0;
                        L74: while (true) {
                          L75: {
                            if (var18 >= 100) {
                              break L75;
                            } else {
                              if (fra.a(var10_ref_int__, var16[var17 + 1], 2, var29[var17])) {
                                break L75;
                              } else {
                                var16[var17] = var29[var17] * 200 >> -198628536;
                                var16[1 + var17] = var16[var17 - -1] * 200 >> -1287533688;
                                var18++;
                                if (0 == 0) {
                                  continue L74;
                                } else {
                                  break L75;
                                }
                              }
                            }
                          }
                          var17 += 2;
                          if (0 == 0) {
                            continue L72;
                          } else {
                            break L73;
                          }
                        }
                      }
                    }
                    var22.field_w[var14] = var29;
                    var10_ref_int__ = var16;
                    var14++;
                    if (0 == 0) {
                      continue L69;
                    } else {
                      break L67;
                    }
                  }
                }
              }
            }
          }
          var22.field_m = true;
          var22.field_k = false;
          var10 = 71 / ((param4 - 45) / 63);
          var22.a(121, 8);
          var22.field_B = 16;
          var22.field_r = true;
          return var22;
        }
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        v var13 = null;
        shb stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        shb stackOut_1_0 = null;
        L0: {
          var12 = VoidHunters.field_G;
          if (!(param1 instanceof v)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (shb) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (shb) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var13 = (v) (Object) stackIn_3_0;
          dma.d(param2 + param1.field_g, param1.field_r + param3, param1.field_h, param1.field_f, ((jba) this).field_e);
          if (var13 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = param1.field_h - var13.field_C * 2;
        var8 = var13.field_C + (param1.field_g + param2);
        var9 = var13.field_F + (param1.field_r + param3);
        dma.a(var8, var9, var8 + var7, var9, ((jba) this).field_f);
        var10 = var13.a(0) - 1;
        var11 = 112 / ((-27 - param0) / 35);
        L2: while (true) {
          if (0 > var10) {
            L3: {
              if (null != ((jba) this).field_g) {
                ((jba) this).field_g.a(var13.field_j, var7 / 2 + var8, var13.field_F + (((jba) this).field_g.field_H + var9), ((jba) this).field_a, ((jba) this).field_i);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            dma.f(var8 + var7 * var13.a(-115, var10) / var13.e(-111), var9, ((jba) this).field_c, ((jba) this).field_d);
            var10--;
            continue L2;
          }
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_b = null;
        if (!param0) {
            field_b = null;
            return;
        }
    }

    jba(no param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((jba) this).field_e = param4;
        ((jba) this).field_g = param0;
        ((jba) this).field_c = param5;
        ((jba) this).field_f = param3;
        ((jba) this).field_i = param2;
        ((jba) this).field_d = param6;
        ((jba) this).field_a = param1;
    }

    static {
    }
}
