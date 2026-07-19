/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
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
              if (param1 < -119) {
                break L1;
              } else {
                field_o = 26;
                break L1;
              }
            }
            si.a(66, 62, param0[0].a(36));
            stackOut_2_0 = new nc("void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ek.A(");
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    ek(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param2 >= param7) {
          if (param3 <= param1) {
            if (param6 >= param2) {
              if (param1 <= param8) {
                L0: {
                  if (param2 < param7) {
                    break L0;
                  } else {
                    if (param2 > param6) {
                      break L0;
                    } else {
                      if (param1 < param3) {
                        break L0;
                      } else {
                        if (param1 > param8) {
                          break L0;
                        } else {
                          if (param7 > param9) {
                            break L0;
                          } else {
                            if (param6 < param9) {
                              break L0;
                            } else {
                              if (param4 < param3) {
                                break L0;
                              } else {
                                if (param4 <= param8) {
                                  return 1 + (1 << param5);
                                } else {
                                  L1: {
                                    param1 = param1 - param3;
                                    param8 = param8 - param3;
                                    param2 = param2 - param7;
                                    param4 = param4 - param3;
                                    param6 = param6 - param7;
                                    param9 = param9 - param7;
                                    var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                                    if (var10 > param0) {
                                      param2 = param2 >> var10;
                                      param6 = param6 >> var10;
                                      param9 = param9 >> var10;
                                      break L1;
                                    } else {
                                      break L1;
                                    }
                                  }
                                  L2: {
                                    var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                                    if (0 >= var10) {
                                      break L2;
                                    } else {
                                      param4 = param4 >> var10;
                                      param1 = param1 >> var10;
                                      param8 = param8 >> var10;
                                      break L2;
                                    }
                                  }
                                  L3: {
                                    var10 = -param1 + param4;
                                    var11 = param9 - param2;
                                    var12 = -1;
                                    if (-1 == (var11 ^ -1)) {
                                      break L3;
                                    } else {
                                      var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                                      break L3;
                                    }
                                  }
                                  L4: {
                                    if (-1 == (var10 ^ -1)) {
                                      break L4;
                                    } else {
                                      var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    param9 = param9 - param6;
                                    param2 = param2 - param6;
                                    param1 = param1 - param8;
                                    param4 = param4 - param8;
                                    if (-1 != (var11 ^ -1)) {
                                      var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var10 != 0) {
                                      var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  return var12;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L7: {
                  param1 = param1 - param3;
                  param8 = param8 - param3;
                  param2 = param2 - param7;
                  param4 = param4 - param3;
                  param6 = param6 - param7;
                  param9 = param9 - param7;
                  var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                  if (var10 > param0) {
                    param2 = param2 >> var10;
                    param6 = param6 >> var10;
                    param9 = param9 >> var10;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                  if (0 >= var10) {
                    break L8;
                  } else {
                    param4 = param4 >> var10;
                    param1 = param1 >> var10;
                    param8 = param8 >> var10;
                    break L8;
                  }
                }
                L9: {
                  var10 = -param1 + param4;
                  var11 = param9 - param2;
                  var12 = -1;
                  if (-1 == (var11 ^ -1)) {
                    break L9;
                  } else {
                    var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                    break L9;
                  }
                }
                L10: {
                  if (-1 == (var10 ^ -1)) {
                    break L10;
                  } else {
                    var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                    break L10;
                  }
                }
                L11: {
                  param9 = param9 - param6;
                  param2 = param2 - param6;
                  param1 = param1 - param8;
                  param4 = param4 - param8;
                  if (-1 != (var11 ^ -1)) {
                    var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var10 != 0) {
                    var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return var12;
              } else {
                if (param4 <= param8) {
                  if (param2 >= param7) {
                    if (param2 <= param6) {
                      if (param1 >= param3) {
                        L13: {
                          if (param1 > param8) {
                            break L13;
                          } else {
                            if (param7 > param9) {
                              break L13;
                            } else {
                              if (param6 < param9) {
                                break L13;
                              } else {
                                if (param4 < param3) {
                                  break L13;
                                } else {
                                  if (param4 <= param8) {
                                    return 1 + (1 << param5);
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L14: {
                          param1 = param1 - param3;
                          param8 = param8 - param3;
                          param2 = param2 - param7;
                          param4 = param4 - param3;
                          param6 = param6 - param7;
                          param9 = param9 - param7;
                          var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                          if (var10 > param0) {
                            param2 = param2 >> var10;
                            param6 = param6 >> var10;
                            param9 = param9 >> var10;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                          if (0 >= var10) {
                            break L15;
                          } else {
                            param4 = param4 >> var10;
                            param1 = param1 >> var10;
                            param8 = param8 >> var10;
                            break L15;
                          }
                        }
                        L16: {
                          var10 = -param1 + param4;
                          var11 = param9 - param2;
                          var12 = -1;
                          if (-1 == (var11 ^ -1)) {
                            break L16;
                          } else {
                            var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                            break L16;
                          }
                        }
                        L17: {
                          if (-1 == (var10 ^ -1)) {
                            break L17;
                          } else {
                            var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                            break L17;
                          }
                        }
                        L18: {
                          param9 = param9 - param6;
                          param2 = param2 - param6;
                          param1 = param1 - param8;
                          param4 = param4 - param8;
                          if (-1 != (var11 ^ -1)) {
                            var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          if (var10 != 0) {
                            var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        return var12;
                      } else {
                        L20: {
                          param1 = param1 - param3;
                          param8 = param8 - param3;
                          param2 = param2 - param7;
                          param4 = param4 - param3;
                          param6 = param6 - param7;
                          param9 = param9 - param7;
                          var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                          if (var10 > param0) {
                            param2 = param2 >> var10;
                            param6 = param6 >> var10;
                            param9 = param9 >> var10;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                          if (0 >= var10) {
                            break L21;
                          } else {
                            param4 = param4 >> var10;
                            param1 = param1 >> var10;
                            param8 = param8 >> var10;
                            break L21;
                          }
                        }
                        L22: {
                          var10 = -param1 + param4;
                          var11 = param9 - param2;
                          var12 = -1;
                          if (-1 == (var11 ^ -1)) {
                            break L22;
                          } else {
                            var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                            break L22;
                          }
                        }
                        L23: {
                          if (-1 == (var10 ^ -1)) {
                            break L23;
                          } else {
                            var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                            break L23;
                          }
                        }
                        L24: {
                          param9 = param9 - param6;
                          param2 = param2 - param6;
                          param1 = param1 - param8;
                          param4 = param4 - param8;
                          if (-1 != (var11 ^ -1)) {
                            var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        L25: {
                          if (var10 != 0) {
                            var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        return var12;
                      }
                    } else {
                      L26: {
                        param1 = param1 - param3;
                        param8 = param8 - param3;
                        param2 = param2 - param7;
                        param4 = param4 - param3;
                        param6 = param6 - param7;
                        param9 = param9 - param7;
                        var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                        if (var10 > param0) {
                          param2 = param2 >> var10;
                          param6 = param6 >> var10;
                          param9 = param9 >> var10;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L27: {
                        var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                        if (0 >= var10) {
                          break L27;
                        } else {
                          param4 = param4 >> var10;
                          param1 = param1 >> var10;
                          param8 = param8 >> var10;
                          break L27;
                        }
                      }
                      L28: {
                        var10 = -param1 + param4;
                        var11 = param9 - param2;
                        var12 = -1;
                        if (-1 == (var11 ^ -1)) {
                          break L28;
                        } else {
                          var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                          break L28;
                        }
                      }
                      L29: {
                        if (-1 == (var10 ^ -1)) {
                          break L29;
                        } else {
                          var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                          break L29;
                        }
                      }
                      L30: {
                        param9 = param9 - param6;
                        param2 = param2 - param6;
                        param1 = param1 - param8;
                        param4 = param4 - param8;
                        if (-1 != (var11 ^ -1)) {
                          var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      L31: {
                        if (var10 != 0) {
                          var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      return var12;
                    }
                  } else {
                    L32: {
                      param1 = param1 - param3;
                      param8 = param8 - param3;
                      param2 = param2 - param7;
                      param4 = param4 - param3;
                      param6 = param6 - param7;
                      param9 = param9 - param7;
                      var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                      if (var10 > param0) {
                        param2 = param2 >> var10;
                        param6 = param6 >> var10;
                        param9 = param9 >> var10;
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    L33: {
                      var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                      if (0 >= var10) {
                        break L33;
                      } else {
                        param4 = param4 >> var10;
                        param1 = param1 >> var10;
                        param8 = param8 >> var10;
                        break L33;
                      }
                    }
                    L34: {
                      var10 = -param1 + param4;
                      var11 = param9 - param2;
                      var12 = -1;
                      if (-1 == (var11 ^ -1)) {
                        break L34;
                      } else {
                        var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                        break L34;
                      }
                    }
                    L35: {
                      if (-1 == (var10 ^ -1)) {
                        break L35;
                      } else {
                        var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                        break L35;
                      }
                    }
                    L36: {
                      param9 = param9 - param6;
                      param2 = param2 - param6;
                      param1 = param1 - param8;
                      param4 = param4 - param8;
                      if (-1 != (var11 ^ -1)) {
                        var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    L37: {
                      if (var10 != 0) {
                        var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    return var12;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              if (param6 >= param9) {
                L38: {
                  if (param1 <= param8) {
                    break L38;
                  } else {
                    if (param4 > param8) {
                      return -1;
                    } else {
                      break L38;
                    }
                  }
                }
                if (param2 >= param7) {
                  if (param2 <= param6) {
                    if (param1 >= param3) {
                      if (param1 <= param8) {
                        if (param7 <= param9) {
                          if (param6 >= param9) {
                            if (param4 >= param3) {
                              if (param4 <= param8) {
                                return 1 + (1 << param5);
                              } else {
                                L39: {
                                  param1 = param1 - param3;
                                  param8 = param8 - param3;
                                  param2 = param2 - param7;
                                  param4 = param4 - param3;
                                  param6 = param6 - param7;
                                  param9 = param9 - param7;
                                  var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                                  if (var10 > param0) {
                                    param2 = param2 >> var10;
                                    param6 = param6 >> var10;
                                    param9 = param9 >> var10;
                                    break L39;
                                  } else {
                                    break L39;
                                  }
                                }
                                L40: {
                                  var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                                  if (0 >= var10) {
                                    break L40;
                                  } else {
                                    param4 = param4 >> var10;
                                    param1 = param1 >> var10;
                                    param8 = param8 >> var10;
                                    break L40;
                                  }
                                }
                                L41: {
                                  var10 = -param1 + param4;
                                  var11 = param9 - param2;
                                  var12 = -1;
                                  if (-1 == (var11 ^ -1)) {
                                    break L41;
                                  } else {
                                    var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                                    break L41;
                                  }
                                }
                                L42: {
                                  if (-1 == (var10 ^ -1)) {
                                    break L42;
                                  } else {
                                    var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                                    break L42;
                                  }
                                }
                                L43: {
                                  param9 = param9 - param6;
                                  param2 = param2 - param6;
                                  param1 = param1 - param8;
                                  param4 = param4 - param8;
                                  if (-1 != (var11 ^ -1)) {
                                    var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                                    break L43;
                                  } else {
                                    break L43;
                                  }
                                }
                                L44: {
                                  if (var10 != 0) {
                                    var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                                return var12;
                              }
                            } else {
                              L45: {
                                param1 = param1 - param3;
                                param8 = param8 - param3;
                                param2 = param2 - param7;
                                param4 = param4 - param3;
                                param6 = param6 - param7;
                                param9 = param9 - param7;
                                var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                                if (var10 > param0) {
                                  param2 = param2 >> var10;
                                  param6 = param6 >> var10;
                                  param9 = param9 >> var10;
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              L46: {
                                var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                                if (0 >= var10) {
                                  break L46;
                                } else {
                                  param4 = param4 >> var10;
                                  param1 = param1 >> var10;
                                  param8 = param8 >> var10;
                                  break L46;
                                }
                              }
                              L47: {
                                var10 = -param1 + param4;
                                var11 = param9 - param2;
                                var12 = -1;
                                if (-1 == (var11 ^ -1)) {
                                  break L47;
                                } else {
                                  var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                                  break L47;
                                }
                              }
                              L48: {
                                if (-1 == (var10 ^ -1)) {
                                  break L48;
                                } else {
                                  var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                                  break L48;
                                }
                              }
                              L49: {
                                param9 = param9 - param6;
                                param2 = param2 - param6;
                                param1 = param1 - param8;
                                param4 = param4 - param8;
                                if (-1 != (var11 ^ -1)) {
                                  var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                                  break L49;
                                } else {
                                  break L49;
                                }
                              }
                              L50: {
                                if (var10 != 0) {
                                  var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                                  break L50;
                                } else {
                                  break L50;
                                }
                              }
                              return var12;
                            }
                          } else {
                            L51: {
                              param1 = param1 - param3;
                              param8 = param8 - param3;
                              param2 = param2 - param7;
                              param4 = param4 - param3;
                              param6 = param6 - param7;
                              param9 = param9 - param7;
                              var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                              if (var10 > param0) {
                                param2 = param2 >> var10;
                                param6 = param6 >> var10;
                                param9 = param9 >> var10;
                                break L51;
                              } else {
                                break L51;
                              }
                            }
                            L52: {
                              var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                              if (0 >= var10) {
                                break L52;
                              } else {
                                param4 = param4 >> var10;
                                param1 = param1 >> var10;
                                param8 = param8 >> var10;
                                break L52;
                              }
                            }
                            L53: {
                              var10 = -param1 + param4;
                              var11 = param9 - param2;
                              var12 = -1;
                              if (-1 == (var11 ^ -1)) {
                                break L53;
                              } else {
                                var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                                break L53;
                              }
                            }
                            L54: {
                              if (-1 == (var10 ^ -1)) {
                                break L54;
                              } else {
                                var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                                break L54;
                              }
                            }
                            L55: {
                              param9 = param9 - param6;
                              param2 = param2 - param6;
                              param1 = param1 - param8;
                              param4 = param4 - param8;
                              if (-1 != (var11 ^ -1)) {
                                var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                                break L55;
                              } else {
                                break L55;
                              }
                            }
                            L56: {
                              if (var10 != 0) {
                                var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                                break L56;
                              } else {
                                break L56;
                              }
                            }
                            return var12;
                          }
                        } else {
                          L57: {
                            param1 = param1 - param3;
                            param8 = param8 - param3;
                            param2 = param2 - param7;
                            param4 = param4 - param3;
                            param6 = param6 - param7;
                            param9 = param9 - param7;
                            var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                            if (var10 > param0) {
                              param2 = param2 >> var10;
                              param6 = param6 >> var10;
                              param9 = param9 >> var10;
                              break L57;
                            } else {
                              break L57;
                            }
                          }
                          L58: {
                            var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                            if (0 >= var10) {
                              break L58;
                            } else {
                              param4 = param4 >> var10;
                              param1 = param1 >> var10;
                              param8 = param8 >> var10;
                              break L58;
                            }
                          }
                          L59: {
                            var10 = -param1 + param4;
                            var11 = param9 - param2;
                            var12 = -1;
                            if (-1 == (var11 ^ -1)) {
                              break L59;
                            } else {
                              var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                              break L59;
                            }
                          }
                          L60: {
                            if (-1 == (var10 ^ -1)) {
                              break L60;
                            } else {
                              var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                              break L60;
                            }
                          }
                          L61: {
                            param9 = param9 - param6;
                            param2 = param2 - param6;
                            param1 = param1 - param8;
                            param4 = param4 - param8;
                            if (-1 != (var11 ^ -1)) {
                              var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                              break L61;
                            } else {
                              break L61;
                            }
                          }
                          L62: {
                            if (var10 != 0) {
                              var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                              break L62;
                            } else {
                              break L62;
                            }
                          }
                          return var12;
                        }
                      } else {
                        L63: {
                          param1 = param1 - param3;
                          param8 = param8 - param3;
                          param2 = param2 - param7;
                          param4 = param4 - param3;
                          param6 = param6 - param7;
                          param9 = param9 - param7;
                          var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                          if (var10 > param0) {
                            param2 = param2 >> var10;
                            param6 = param6 >> var10;
                            param9 = param9 >> var10;
                            break L63;
                          } else {
                            break L63;
                          }
                        }
                        L64: {
                          var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                          if (0 >= var10) {
                            break L64;
                          } else {
                            param4 = param4 >> var10;
                            param1 = param1 >> var10;
                            param8 = param8 >> var10;
                            break L64;
                          }
                        }
                        L65: {
                          var10 = -param1 + param4;
                          var11 = param9 - param2;
                          var12 = -1;
                          if (-1 == (var11 ^ -1)) {
                            break L65;
                          } else {
                            var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                            break L65;
                          }
                        }
                        L66: {
                          if (-1 == (var10 ^ -1)) {
                            break L66;
                          } else {
                            var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                            break L66;
                          }
                        }
                        L67: {
                          param9 = param9 - param6;
                          param2 = param2 - param6;
                          param1 = param1 - param8;
                          param4 = param4 - param8;
                          if (-1 != (var11 ^ -1)) {
                            var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                            break L67;
                          } else {
                            break L67;
                          }
                        }
                        L68: {
                          if (var10 != 0) {
                            var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                            break L68;
                          } else {
                            break L68;
                          }
                        }
                        return var12;
                      }
                    } else {
                      L69: {
                        param1 = param1 - param3;
                        param8 = param8 - param3;
                        param2 = param2 - param7;
                        param4 = param4 - param3;
                        param6 = param6 - param7;
                        param9 = param9 - param7;
                        var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                        if (var10 > param0) {
                          param2 = param2 >> var10;
                          param6 = param6 >> var10;
                          param9 = param9 >> var10;
                          break L69;
                        } else {
                          break L69;
                        }
                      }
                      L70: {
                        var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                        if (0 >= var10) {
                          break L70;
                        } else {
                          param4 = param4 >> var10;
                          param1 = param1 >> var10;
                          param8 = param8 >> var10;
                          break L70;
                        }
                      }
                      L71: {
                        var10 = -param1 + param4;
                        var11 = param9 - param2;
                        var12 = -1;
                        if (-1 == (var11 ^ -1)) {
                          break L71;
                        } else {
                          var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                          break L71;
                        }
                      }
                      L72: {
                        if (-1 == (var10 ^ -1)) {
                          break L72;
                        } else {
                          var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                          break L72;
                        }
                      }
                      L73: {
                        param9 = param9 - param6;
                        param2 = param2 - param6;
                        param1 = param1 - param8;
                        param4 = param4 - param8;
                        if (-1 != (var11 ^ -1)) {
                          var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                          break L73;
                        } else {
                          break L73;
                        }
                      }
                      L74: {
                        if (var10 != 0) {
                          var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                          break L74;
                        } else {
                          break L74;
                        }
                      }
                      return var12;
                    }
                  } else {
                    L75: {
                      param1 = param1 - param3;
                      param8 = param8 - param3;
                      param2 = param2 - param7;
                      param4 = param4 - param3;
                      param6 = param6 - param7;
                      param9 = param9 - param7;
                      var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                      if (var10 > param0) {
                        param2 = param2 >> var10;
                        param6 = param6 >> var10;
                        param9 = param9 >> var10;
                        break L75;
                      } else {
                        break L75;
                      }
                    }
                    L76: {
                      var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                      if (0 >= var10) {
                        break L76;
                      } else {
                        param4 = param4 >> var10;
                        param1 = param1 >> var10;
                        param8 = param8 >> var10;
                        break L76;
                      }
                    }
                    L77: {
                      var10 = -param1 + param4;
                      var11 = param9 - param2;
                      var12 = -1;
                      if (-1 == (var11 ^ -1)) {
                        break L77;
                      } else {
                        var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                        break L77;
                      }
                    }
                    L78: {
                      if (-1 == (var10 ^ -1)) {
                        break L78;
                      } else {
                        var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                        break L78;
                      }
                    }
                    L79: {
                      param9 = param9 - param6;
                      param2 = param2 - param6;
                      param1 = param1 - param8;
                      param4 = param4 - param8;
                      if (-1 != (var11 ^ -1)) {
                        var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                        break L79;
                      } else {
                        break L79;
                      }
                    }
                    L80: {
                      if (var10 != 0) {
                        var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                        break L80;
                      } else {
                        break L80;
                      }
                    }
                    return var12;
                  }
                } else {
                  L81: {
                    param1 = param1 - param3;
                    param8 = param8 - param3;
                    param2 = param2 - param7;
                    param4 = param4 - param3;
                    param6 = param6 - param7;
                    param9 = param9 - param7;
                    var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                    if (var10 > param0) {
                      param2 = param2 >> var10;
                      param6 = param6 >> var10;
                      param9 = param9 >> var10;
                      break L81;
                    } else {
                      break L81;
                    }
                  }
                  L82: {
                    var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                    if (0 >= var10) {
                      break L82;
                    } else {
                      param4 = param4 >> var10;
                      param1 = param1 >> var10;
                      param8 = param8 >> var10;
                      break L82;
                    }
                  }
                  L83: {
                    var10 = -param1 + param4;
                    var11 = param9 - param2;
                    var12 = -1;
                    if (-1 == (var11 ^ -1)) {
                      break L83;
                    } else {
                      var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                      break L83;
                    }
                  }
                  L84: {
                    if (-1 == (var10 ^ -1)) {
                      break L84;
                    } else {
                      var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                      break L84;
                    }
                  }
                  L85: {
                    param9 = param9 - param6;
                    param2 = param2 - param6;
                    param1 = param1 - param8;
                    param4 = param4 - param8;
                    if (-1 != (var11 ^ -1)) {
                      var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                      break L85;
                    } else {
                      break L85;
                    }
                  }
                  L86: {
                    if (var10 != 0) {
                      var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                      break L86;
                    } else {
                      break L86;
                    }
                  }
                  return var12;
                }
              } else {
                return -1;
              }
            }
          } else {
            if (param4 >= param3) {
              L87: {
                L88: {
                  if (param6 >= param2) {
                    break L88;
                  } else {
                    if (param6 < param9) {
                      break L87;
                    } else {
                      break L88;
                    }
                  }
                }
                L89: {
                  if (param1 <= param8) {
                    break L89;
                  } else {
                    if (param4 > param8) {
                      break L87;
                    } else {
                      break L89;
                    }
                  }
                }
                if (param2 >= param7) {
                  if (param2 <= param6) {
                    if (param1 >= param3) {
                      if (param1 <= param8) {
                        if (param7 <= param9) {
                          if (param6 >= param9) {
                            if (param4 >= param3) {
                              if (param4 <= param8) {
                                return 1 + (1 << param5);
                              } else {
                                L90: {
                                  param1 = param1 - param3;
                                  param8 = param8 - param3;
                                  param2 = param2 - param7;
                                  param4 = param4 - param3;
                                  param6 = param6 - param7;
                                  param9 = param9 - param7;
                                  var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                                  if (var10 > param0) {
                                    param2 = param2 >> var10;
                                    param6 = param6 >> var10;
                                    param9 = param9 >> var10;
                                    break L90;
                                  } else {
                                    break L90;
                                  }
                                }
                                L91: {
                                  var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                                  if (0 >= var10) {
                                    break L91;
                                  } else {
                                    param4 = param4 >> var10;
                                    param1 = param1 >> var10;
                                    param8 = param8 >> var10;
                                    break L91;
                                  }
                                }
                                L92: {
                                  var10 = -param1 + param4;
                                  var11 = param9 - param2;
                                  var12 = -1;
                                  if (-1 == (var11 ^ -1)) {
                                    break L92;
                                  } else {
                                    var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                                    break L92;
                                  }
                                }
                                L93: {
                                  if (-1 == (var10 ^ -1)) {
                                    break L93;
                                  } else {
                                    var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                                    break L93;
                                  }
                                }
                                L94: {
                                  param9 = param9 - param6;
                                  param2 = param2 - param6;
                                  param1 = param1 - param8;
                                  param4 = param4 - param8;
                                  if (-1 != (var11 ^ -1)) {
                                    var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                                    break L94;
                                  } else {
                                    break L94;
                                  }
                                }
                                L95: {
                                  if (var10 != 0) {
                                    var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                                    break L95;
                                  } else {
                                    break L95;
                                  }
                                }
                                return var12;
                              }
                            } else {
                              L96: {
                                param1 = param1 - param3;
                                param8 = param8 - param3;
                                param2 = param2 - param7;
                                param4 = param4 - param3;
                                param6 = param6 - param7;
                                param9 = param9 - param7;
                                var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                                if (var10 > param0) {
                                  param2 = param2 >> var10;
                                  param6 = param6 >> var10;
                                  param9 = param9 >> var10;
                                  break L96;
                                } else {
                                  break L96;
                                }
                              }
                              L97: {
                                var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                                if (0 >= var10) {
                                  break L97;
                                } else {
                                  param4 = param4 >> var10;
                                  param1 = param1 >> var10;
                                  param8 = param8 >> var10;
                                  break L97;
                                }
                              }
                              L98: {
                                var10 = -param1 + param4;
                                var11 = param9 - param2;
                                var12 = -1;
                                if (-1 == (var11 ^ -1)) {
                                  break L98;
                                } else {
                                  var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                                  break L98;
                                }
                              }
                              L99: {
                                if (-1 == (var10 ^ -1)) {
                                  break L99;
                                } else {
                                  var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                                  break L99;
                                }
                              }
                              L100: {
                                param9 = param9 - param6;
                                param2 = param2 - param6;
                                param1 = param1 - param8;
                                param4 = param4 - param8;
                                if (-1 != (var11 ^ -1)) {
                                  var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                                  break L100;
                                } else {
                                  break L100;
                                }
                              }
                              L101: {
                                if (var10 != 0) {
                                  var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                                  break L101;
                                } else {
                                  break L101;
                                }
                              }
                              return var12;
                            }
                          } else {
                            L102: {
                              param1 = param1 - param3;
                              param8 = param8 - param3;
                              param2 = param2 - param7;
                              param4 = param4 - param3;
                              param6 = param6 - param7;
                              param9 = param9 - param7;
                              var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                              if (var10 > param0) {
                                param2 = param2 >> var10;
                                param6 = param6 >> var10;
                                param9 = param9 >> var10;
                                break L102;
                              } else {
                                break L102;
                              }
                            }
                            L103: {
                              var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                              if (0 >= var10) {
                                break L103;
                              } else {
                                param4 = param4 >> var10;
                                param1 = param1 >> var10;
                                param8 = param8 >> var10;
                                break L103;
                              }
                            }
                            L104: {
                              var10 = -param1 + param4;
                              var11 = param9 - param2;
                              var12 = -1;
                              if (-1 == (var11 ^ -1)) {
                                break L104;
                              } else {
                                var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                                break L104;
                              }
                            }
                            L105: {
                              if (-1 == (var10 ^ -1)) {
                                break L105;
                              } else {
                                var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                                break L105;
                              }
                            }
                            L106: {
                              param9 = param9 - param6;
                              param2 = param2 - param6;
                              param1 = param1 - param8;
                              param4 = param4 - param8;
                              if (-1 != (var11 ^ -1)) {
                                var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                                break L106;
                              } else {
                                break L106;
                              }
                            }
                            L107: {
                              if (var10 != 0) {
                                var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                                break L107;
                              } else {
                                break L107;
                              }
                            }
                            return var12;
                          }
                        } else {
                          L108: {
                            param1 = param1 - param3;
                            param8 = param8 - param3;
                            param2 = param2 - param7;
                            param4 = param4 - param3;
                            param6 = param6 - param7;
                            param9 = param9 - param7;
                            var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                            if (var10 > param0) {
                              param2 = param2 >> var10;
                              param6 = param6 >> var10;
                              param9 = param9 >> var10;
                              break L108;
                            } else {
                              break L108;
                            }
                          }
                          L109: {
                            var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                            if (0 >= var10) {
                              break L109;
                            } else {
                              param4 = param4 >> var10;
                              param1 = param1 >> var10;
                              param8 = param8 >> var10;
                              break L109;
                            }
                          }
                          L110: {
                            var10 = -param1 + param4;
                            var11 = param9 - param2;
                            var12 = -1;
                            if (-1 == (var11 ^ -1)) {
                              break L110;
                            } else {
                              var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                              break L110;
                            }
                          }
                          L111: {
                            if (-1 == (var10 ^ -1)) {
                              break L111;
                            } else {
                              var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                              break L111;
                            }
                          }
                          L112: {
                            param9 = param9 - param6;
                            param2 = param2 - param6;
                            param1 = param1 - param8;
                            param4 = param4 - param8;
                            if (-1 != (var11 ^ -1)) {
                              var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                              break L112;
                            } else {
                              break L112;
                            }
                          }
                          L113: {
                            if (var10 != 0) {
                              var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                              break L113;
                            } else {
                              break L113;
                            }
                          }
                          return var12;
                        }
                      } else {
                        L114: {
                          param1 = param1 - param3;
                          param8 = param8 - param3;
                          param2 = param2 - param7;
                          param4 = param4 - param3;
                          param6 = param6 - param7;
                          param9 = param9 - param7;
                          var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                          if (var10 > param0) {
                            param2 = param2 >> var10;
                            param6 = param6 >> var10;
                            param9 = param9 >> var10;
                            break L114;
                          } else {
                            break L114;
                          }
                        }
                        L115: {
                          var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                          if (0 >= var10) {
                            break L115;
                          } else {
                            param4 = param4 >> var10;
                            param1 = param1 >> var10;
                            param8 = param8 >> var10;
                            break L115;
                          }
                        }
                        L116: {
                          var10 = -param1 + param4;
                          var11 = param9 - param2;
                          var12 = -1;
                          if (-1 == (var11 ^ -1)) {
                            break L116;
                          } else {
                            var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                            break L116;
                          }
                        }
                        L117: {
                          if (-1 == (var10 ^ -1)) {
                            break L117;
                          } else {
                            var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                            break L117;
                          }
                        }
                        L118: {
                          param9 = param9 - param6;
                          param2 = param2 - param6;
                          param1 = param1 - param8;
                          param4 = param4 - param8;
                          if (-1 != (var11 ^ -1)) {
                            var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                            break L118;
                          } else {
                            break L118;
                          }
                        }
                        L119: {
                          if (var10 != 0) {
                            var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                            break L119;
                          } else {
                            break L119;
                          }
                        }
                        return var12;
                      }
                    } else {
                      L120: {
                        param1 = param1 - param3;
                        param8 = param8 - param3;
                        param2 = param2 - param7;
                        param4 = param4 - param3;
                        param6 = param6 - param7;
                        param9 = param9 - param7;
                        var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                        if (var10 > param0) {
                          param2 = param2 >> var10;
                          param6 = param6 >> var10;
                          param9 = param9 >> var10;
                          break L120;
                        } else {
                          break L120;
                        }
                      }
                      L121: {
                        var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                        if (0 >= var10) {
                          break L121;
                        } else {
                          param4 = param4 >> var10;
                          param1 = param1 >> var10;
                          param8 = param8 >> var10;
                          break L121;
                        }
                      }
                      L122: {
                        var10 = -param1 + param4;
                        var11 = param9 - param2;
                        var12 = -1;
                        if (-1 == (var11 ^ -1)) {
                          break L122;
                        } else {
                          var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                          break L122;
                        }
                      }
                      L123: {
                        if (-1 == (var10 ^ -1)) {
                          break L123;
                        } else {
                          var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                          break L123;
                        }
                      }
                      L124: {
                        param9 = param9 - param6;
                        param2 = param2 - param6;
                        param1 = param1 - param8;
                        param4 = param4 - param8;
                        if (-1 != (var11 ^ -1)) {
                          var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                          break L124;
                        } else {
                          break L124;
                        }
                      }
                      L125: {
                        if (var10 != 0) {
                          var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                          break L125;
                        } else {
                          break L125;
                        }
                      }
                      return var12;
                    }
                  } else {
                    L126: {
                      param1 = param1 - param3;
                      param8 = param8 - param3;
                      param2 = param2 - param7;
                      param4 = param4 - param3;
                      param6 = param6 - param7;
                      param9 = param9 - param7;
                      var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                      if (var10 > param0) {
                        param2 = param2 >> var10;
                        param6 = param6 >> var10;
                        param9 = param9 >> var10;
                        break L126;
                      } else {
                        break L126;
                      }
                    }
                    L127: {
                      var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                      if (0 >= var10) {
                        break L127;
                      } else {
                        param4 = param4 >> var10;
                        param1 = param1 >> var10;
                        param8 = param8 >> var10;
                        break L127;
                      }
                    }
                    L128: {
                      var10 = -param1 + param4;
                      var11 = param9 - param2;
                      var12 = -1;
                      if (-1 == (var11 ^ -1)) {
                        break L128;
                      } else {
                        var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                        break L128;
                      }
                    }
                    L129: {
                      if (-1 == (var10 ^ -1)) {
                        break L129;
                      } else {
                        var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                        break L129;
                      }
                    }
                    L130: {
                      param9 = param9 - param6;
                      param2 = param2 - param6;
                      param1 = param1 - param8;
                      param4 = param4 - param8;
                      if (-1 != (var11 ^ -1)) {
                        var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                        break L130;
                      } else {
                        break L130;
                      }
                    }
                    L131: {
                      if (var10 != 0) {
                        var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                        break L131;
                      } else {
                        break L131;
                      }
                    }
                    return var12;
                  }
                } else {
                  L132: {
                    param1 = param1 - param3;
                    param8 = param8 - param3;
                    param2 = param2 - param7;
                    param4 = param4 - param3;
                    param6 = param6 - param7;
                    param9 = param9 - param7;
                    var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                    if (var10 > param0) {
                      param2 = param2 >> var10;
                      param6 = param6 >> var10;
                      param9 = param9 >> var10;
                      break L132;
                    } else {
                      break L132;
                    }
                  }
                  L133: {
                    var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                    if (0 >= var10) {
                      break L133;
                    } else {
                      param4 = param4 >> var10;
                      param1 = param1 >> var10;
                      param8 = param8 >> var10;
                      break L133;
                    }
                  }
                  L134: {
                    var10 = -param1 + param4;
                    var11 = param9 - param2;
                    var12 = -1;
                    if (-1 == (var11 ^ -1)) {
                      break L134;
                    } else {
                      var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                      break L134;
                    }
                  }
                  L135: {
                    if (-1 == (var10 ^ -1)) {
                      break L135;
                    } else {
                      var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                      break L135;
                    }
                  }
                  L136: {
                    param9 = param9 - param6;
                    param2 = param2 - param6;
                    param1 = param1 - param8;
                    param4 = param4 - param8;
                    if (-1 != (var11 ^ -1)) {
                      var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                      break L136;
                    } else {
                      break L136;
                    }
                  }
                  L137: {
                    if (var10 != 0) {
                      var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                      break L137;
                    } else {
                      break L137;
                    }
                  }
                  return var12;
                }
              }
              return -1;
            } else {
              return -1;
            }
          }
        } else {
          if (param7 <= param9) {
            L138: {
              L139: {
                if (param3 <= param1) {
                  break L139;
                } else {
                  if (param4 < param3) {
                    break L138;
                  } else {
                    break L139;
                  }
                }
              }
              L140: {
                if (param6 >= param2) {
                  break L140;
                } else {
                  if (param6 < param9) {
                    break L138;
                  } else {
                    break L140;
                  }
                }
              }
              L141: {
                if (param1 <= param8) {
                  break L141;
                } else {
                  if (param4 > param8) {
                    break L138;
                  } else {
                    break L141;
                  }
                }
              }
              if (param2 >= param7) {
                if (param2 <= param6) {
                  if (param1 >= param3) {
                    if (param1 <= param8) {
                      if (param7 <= param9) {
                        if (param6 >= param9) {
                          if (param4 >= param3) {
                            if (param4 <= param8) {
                              return 1 + (1 << param5);
                            } else {
                              L142: {
                                param1 = param1 - param3;
                                param8 = param8 - param3;
                                param2 = param2 - param7;
                                param4 = param4 - param3;
                                param6 = param6 - param7;
                                param9 = param9 - param7;
                                var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                                if (var10 > param0) {
                                  param2 = param2 >> var10;
                                  param6 = param6 >> var10;
                                  param9 = param9 >> var10;
                                  break L142;
                                } else {
                                  break L142;
                                }
                              }
                              L143: {
                                var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                                if (0 >= var10) {
                                  break L143;
                                } else {
                                  param4 = param4 >> var10;
                                  param1 = param1 >> var10;
                                  param8 = param8 >> var10;
                                  break L143;
                                }
                              }
                              L144: {
                                var10 = -param1 + param4;
                                var11 = param9 - param2;
                                var12 = -1;
                                if (-1 == (var11 ^ -1)) {
                                  break L144;
                                } else {
                                  var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                                  break L144;
                                }
                              }
                              L145: {
                                if (-1 == (var10 ^ -1)) {
                                  break L145;
                                } else {
                                  var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                                  break L145;
                                }
                              }
                              L146: {
                                param9 = param9 - param6;
                                param2 = param2 - param6;
                                param1 = param1 - param8;
                                param4 = param4 - param8;
                                if (-1 != (var11 ^ -1)) {
                                  var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                                  break L146;
                                } else {
                                  break L146;
                                }
                              }
                              L147: {
                                if (var10 != 0) {
                                  var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                                  break L147;
                                } else {
                                  break L147;
                                }
                              }
                              return var12;
                            }
                          } else {
                            L148: {
                              param1 = param1 - param3;
                              param8 = param8 - param3;
                              param2 = param2 - param7;
                              param4 = param4 - param3;
                              param6 = param6 - param7;
                              param9 = param9 - param7;
                              var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                              if (var10 > param0) {
                                param2 = param2 >> var10;
                                param6 = param6 >> var10;
                                param9 = param9 >> var10;
                                break L148;
                              } else {
                                break L148;
                              }
                            }
                            L149: {
                              var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                              if (0 >= var10) {
                                break L149;
                              } else {
                                param4 = param4 >> var10;
                                param1 = param1 >> var10;
                                param8 = param8 >> var10;
                                break L149;
                              }
                            }
                            L150: {
                              var10 = -param1 + param4;
                              var11 = param9 - param2;
                              var12 = -1;
                              if (-1 == (var11 ^ -1)) {
                                break L150;
                              } else {
                                var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                                break L150;
                              }
                            }
                            L151: {
                              if (-1 == (var10 ^ -1)) {
                                break L151;
                              } else {
                                var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                                break L151;
                              }
                            }
                            L152: {
                              param9 = param9 - param6;
                              param2 = param2 - param6;
                              param1 = param1 - param8;
                              param4 = param4 - param8;
                              if (-1 != (var11 ^ -1)) {
                                var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                                break L152;
                              } else {
                                break L152;
                              }
                            }
                            L153: {
                              if (var10 != 0) {
                                var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                                break L153;
                              } else {
                                break L153;
                              }
                            }
                            return var12;
                          }
                        } else {
                          L154: {
                            param1 = param1 - param3;
                            param8 = param8 - param3;
                            param2 = param2 - param7;
                            param4 = param4 - param3;
                            param6 = param6 - param7;
                            param9 = param9 - param7;
                            var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                            if (var10 > param0) {
                              param2 = param2 >> var10;
                              param6 = param6 >> var10;
                              param9 = param9 >> var10;
                              break L154;
                            } else {
                              break L154;
                            }
                          }
                          L155: {
                            var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                            if (0 >= var10) {
                              break L155;
                            } else {
                              param4 = param4 >> var10;
                              param1 = param1 >> var10;
                              param8 = param8 >> var10;
                              break L155;
                            }
                          }
                          L156: {
                            var10 = -param1 + param4;
                            var11 = param9 - param2;
                            var12 = -1;
                            if (-1 == (var11 ^ -1)) {
                              break L156;
                            } else {
                              var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                              break L156;
                            }
                          }
                          L157: {
                            if (-1 == (var10 ^ -1)) {
                              break L157;
                            } else {
                              var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                              break L157;
                            }
                          }
                          L158: {
                            param9 = param9 - param6;
                            param2 = param2 - param6;
                            param1 = param1 - param8;
                            param4 = param4 - param8;
                            if (-1 != (var11 ^ -1)) {
                              var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                              break L158;
                            } else {
                              break L158;
                            }
                          }
                          L159: {
                            if (var10 != 0) {
                              var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                              break L159;
                            } else {
                              break L159;
                            }
                          }
                          return var12;
                        }
                      } else {
                        L160: {
                          param1 = param1 - param3;
                          param8 = param8 - param3;
                          param2 = param2 - param7;
                          param4 = param4 - param3;
                          param6 = param6 - param7;
                          param9 = param9 - param7;
                          var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                          if (var10 > param0) {
                            param2 = param2 >> var10;
                            param6 = param6 >> var10;
                            param9 = param9 >> var10;
                            break L160;
                          } else {
                            break L160;
                          }
                        }
                        L161: {
                          var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                          if (0 >= var10) {
                            break L161;
                          } else {
                            param4 = param4 >> var10;
                            param1 = param1 >> var10;
                            param8 = param8 >> var10;
                            break L161;
                          }
                        }
                        L162: {
                          var10 = -param1 + param4;
                          var11 = param9 - param2;
                          var12 = -1;
                          if (-1 == (var11 ^ -1)) {
                            break L162;
                          } else {
                            var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                            break L162;
                          }
                        }
                        L163: {
                          if (-1 == (var10 ^ -1)) {
                            break L163;
                          } else {
                            var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                            break L163;
                          }
                        }
                        L164: {
                          param9 = param9 - param6;
                          param2 = param2 - param6;
                          param1 = param1 - param8;
                          param4 = param4 - param8;
                          if (-1 != (var11 ^ -1)) {
                            var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                            break L164;
                          } else {
                            break L164;
                          }
                        }
                        L165: {
                          if (var10 != 0) {
                            var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                            break L165;
                          } else {
                            break L165;
                          }
                        }
                        return var12;
                      }
                    } else {
                      L166: {
                        param1 = param1 - param3;
                        param8 = param8 - param3;
                        param2 = param2 - param7;
                        param4 = param4 - param3;
                        param6 = param6 - param7;
                        param9 = param9 - param7;
                        var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                        if (var10 > param0) {
                          param2 = param2 >> var10;
                          param6 = param6 >> var10;
                          param9 = param9 >> var10;
                          break L166;
                        } else {
                          break L166;
                        }
                      }
                      L167: {
                        var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                        if (0 >= var10) {
                          break L167;
                        } else {
                          param4 = param4 >> var10;
                          param1 = param1 >> var10;
                          param8 = param8 >> var10;
                          break L167;
                        }
                      }
                      L168: {
                        var10 = -param1 + param4;
                        var11 = param9 - param2;
                        var12 = -1;
                        if (-1 == (var11 ^ -1)) {
                          break L168;
                        } else {
                          var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                          break L168;
                        }
                      }
                      L169: {
                        if (-1 == (var10 ^ -1)) {
                          break L169;
                        } else {
                          var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                          break L169;
                        }
                      }
                      L170: {
                        param9 = param9 - param6;
                        param2 = param2 - param6;
                        param1 = param1 - param8;
                        param4 = param4 - param8;
                        if (-1 != (var11 ^ -1)) {
                          var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                          break L170;
                        } else {
                          break L170;
                        }
                      }
                      L171: {
                        if (var10 != 0) {
                          var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                          break L171;
                        } else {
                          break L171;
                        }
                      }
                      return var12;
                    }
                  } else {
                    L172: {
                      param1 = param1 - param3;
                      param8 = param8 - param3;
                      param2 = param2 - param7;
                      param4 = param4 - param3;
                      param6 = param6 - param7;
                      param9 = param9 - param7;
                      var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                      if (var10 > param0) {
                        param2 = param2 >> var10;
                        param6 = param6 >> var10;
                        param9 = param9 >> var10;
                        break L172;
                      } else {
                        break L172;
                      }
                    }
                    L173: {
                      var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                      if (0 >= var10) {
                        break L173;
                      } else {
                        param4 = param4 >> var10;
                        param1 = param1 >> var10;
                        param8 = param8 >> var10;
                        break L173;
                      }
                    }
                    L174: {
                      var10 = -param1 + param4;
                      var11 = param9 - param2;
                      var12 = -1;
                      if (-1 == (var11 ^ -1)) {
                        break L174;
                      } else {
                        var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                        break L174;
                      }
                    }
                    L175: {
                      if (-1 == (var10 ^ -1)) {
                        break L175;
                      } else {
                        var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                        break L175;
                      }
                    }
                    L176: {
                      param9 = param9 - param6;
                      param2 = param2 - param6;
                      param1 = param1 - param8;
                      param4 = param4 - param8;
                      if (-1 != (var11 ^ -1)) {
                        var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                        break L176;
                      } else {
                        break L176;
                      }
                    }
                    L177: {
                      if (var10 != 0) {
                        var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                        break L177;
                      } else {
                        break L177;
                      }
                    }
                    return var12;
                  }
                } else {
                  L178: {
                    param1 = param1 - param3;
                    param8 = param8 - param3;
                    param2 = param2 - param7;
                    param4 = param4 - param3;
                    param6 = param6 - param7;
                    param9 = param9 - param7;
                    var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                    if (var10 > param0) {
                      param2 = param2 >> var10;
                      param6 = param6 >> var10;
                      param9 = param9 >> var10;
                      break L178;
                    } else {
                      break L178;
                    }
                  }
                  L179: {
                    var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                    if (0 >= var10) {
                      break L179;
                    } else {
                      param4 = param4 >> var10;
                      param1 = param1 >> var10;
                      param8 = param8 >> var10;
                      break L179;
                    }
                  }
                  L180: {
                    var10 = -param1 + param4;
                    var11 = param9 - param2;
                    var12 = -1;
                    if (-1 == (var11 ^ -1)) {
                      break L180;
                    } else {
                      var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                      break L180;
                    }
                  }
                  L181: {
                    if (-1 == (var10 ^ -1)) {
                      break L181;
                    } else {
                      var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                      break L181;
                    }
                  }
                  L182: {
                    param9 = param9 - param6;
                    param2 = param2 - param6;
                    param1 = param1 - param8;
                    param4 = param4 - param8;
                    if (-1 != (var11 ^ -1)) {
                      var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                      break L182;
                    } else {
                      break L182;
                    }
                  }
                  L183: {
                    if (var10 != 0) {
                      var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                      break L183;
                    } else {
                      break L183;
                    }
                  }
                  return var12;
                }
              } else {
                L184: {
                  param1 = param1 - param3;
                  param8 = param8 - param3;
                  param2 = param2 - param7;
                  param4 = param4 - param3;
                  param6 = param6 - param7;
                  param9 = param9 - param7;
                  var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(param0 ^ 123, param9)), vma.a(115, param6));
                  if (var10 > param0) {
                    param2 = param2 >> var10;
                    param6 = param6 >> var10;
                    param9 = param9 >> var10;
                    break L184;
                  } else {
                    break L184;
                  }
                }
                L185: {
                  var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                  if (0 >= var10) {
                    break L185;
                  } else {
                    param4 = param4 >> var10;
                    param1 = param1 >> var10;
                    param8 = param8 >> var10;
                    break L185;
                  }
                }
                L186: {
                  var10 = -param1 + param4;
                  var11 = param9 - param2;
                  var12 = -1;
                  if (-1 == (var11 ^ -1)) {
                    break L186;
                  } else {
                    var12 = dbb.a(var10, var11, var12, param1, param4, param8, param5, 0, 0, param2);
                    break L186;
                  }
                }
                L187: {
                  if (-1 == (var10 ^ -1)) {
                    break L187;
                  } else {
                    var12 = dbb.a(var11, var10, var12, param2, param9, param6, param5, 0, 0, param1);
                    break L187;
                  }
                }
                L188: {
                  param9 = param9 - param6;
                  param2 = param2 - param6;
                  param1 = param1 - param8;
                  param4 = param4 - param8;
                  if (-1 != (var11 ^ -1)) {
                    var12 = dbb.a(var10, var11, var12, param1, param4, 0, param5, 0, -param8, param2);
                    break L188;
                  } else {
                    break L188;
                  }
                }
                L189: {
                  if (var10 != 0) {
                    var12 = dbb.a(var11, var10, var12, param2, param9, 0, param5, 0, -param6, param1);
                    break L189;
                  } else {
                    break L189;
                  }
                }
                return var12;
              }
            }
            return -1;
          } else {
            return -1;
          }
        }
    }

    final static void b(boolean param0) {
        wia.field_a = param0 ? true : false;
    }

    static {
        field_o = 5;
    }
}
