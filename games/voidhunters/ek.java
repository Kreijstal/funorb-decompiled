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
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ek.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
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
        if (~param2 <= ~param7) {
          if (param3 <= param1) {
            if (~param6 <= ~param2) {
              if (param1 <= param8) {
                L0: {
                  if (~param2 > ~param7) {
                    break L0;
                  } else {
                    if (param2 > param6) {
                      break L0;
                    } else {
                      if (~param1 > ~param3) {
                        break L0;
                      } else {
                        if (~param1 < ~param8) {
                          break L0;
                        } else {
                          if (param7 > param9) {
                            break L0;
                          } else {
                            if (param6 < param9) {
                              break L0;
                            } else {
                              if (~param4 > ~param3) {
                                break L0;
                              } else {
                                if (~param4 >= ~param8) {
                                  return 65537;
                                } else {
                                  L1: {
                                    param1 = param1 - param3;
                                    param8 = param8 - param3;
                                    param2 = param2 - param7;
                                    param4 = param4 - param3;
                                    param6 = param6 - param7;
                                    param9 = param9 - param7;
                                    var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(123, param9)), vma.a(115, param6));
                                    if (var10 > 0) {
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
                                    if (var11 == 0) {
                                      break L3;
                                    } else {
                                      var12 = dbb.a(var10, var11, var12, param1, param4, param8, 16, 0, 0, param2);
                                      break L3;
                                    }
                                  }
                                  L4: {
                                    if (var10 == 0) {
                                      break L4;
                                    } else {
                                      var12 = dbb.a(var11, var10, var12, param2, param9, param6, 16, 0, 0, param1);
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    param9 = param9 - param6;
                                    param2 = param2 - param6;
                                    param1 = param1 - param8;
                                    param4 = param4 - param8;
                                    if (var11 != 0) {
                                      var12 = dbb.a(var10, var11, var12, param1, param4, 0, 16, 0, -param8, param2);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var10 != 0) {
                                      var12 = dbb.a(var11, var10, var12, param2, param9, 0, 16, 0, -param6, param1);
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
                  var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(123, param9)), vma.a(115, param6));
                  if (var10 > 0) {
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
                  if (var11 == 0) {
                    break L9;
                  } else {
                    var12 = dbb.a(var10, var11, var12, param1, param4, param8, 16, 0, 0, param2);
                    break L9;
                  }
                }
                L10: {
                  if (var10 == 0) {
                    break L10;
                  } else {
                    var12 = dbb.a(var11, var10, var12, param2, param9, param6, 16, 0, 0, param1);
                    break L10;
                  }
                }
                L11: {
                  param9 = param9 - param6;
                  param2 = param2 - param6;
                  param1 = param1 - param8;
                  param4 = param4 - param8;
                  if (var11 != 0) {
                    var12 = dbb.a(var10, var11, var12, param1, param4, 0, 16, 0, -param8, param2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var10 != 0) {
                    var12 = dbb.a(var11, var10, var12, param2, param9, 0, 16, 0, -param6, param1);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return var12;
              } else {
                if (~param4 >= ~param8) {
                  L13: {
                    if (~param2 > ~param7) {
                      break L13;
                    } else {
                      if (param2 > param6) {
                        break L13;
                      } else {
                        if (~param1 > ~param3) {
                          break L13;
                        } else {
                          if (~param1 < ~param8) {
                            break L13;
                          } else {
                            if (param7 > param9) {
                              break L13;
                            } else {
                              if (param6 < param9) {
                                break L13;
                              } else {
                                if (~param4 > ~param3) {
                                  break L13;
                                } else {
                                  if (~param4 >= ~param8) {
                                    return 65537;
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
                  }
                  L14: {
                    param1 = param1 - param3;
                    param8 = param8 - param3;
                    param2 = param2 - param7;
                    param4 = param4 - param3;
                    param6 = param6 - param7;
                    param9 = param9 - param7;
                    var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(123, param9)), vma.a(115, param6));
                    if (var10 > 0) {
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
                    if (var11 == 0) {
                      break L16;
                    } else {
                      var12 = dbb.a(var10, var11, var12, param1, param4, param8, 16, 0, 0, param2);
                      break L16;
                    }
                  }
                  L17: {
                    if (var10 == 0) {
                      break L17;
                    } else {
                      var12 = dbb.a(var11, var10, var12, param2, param9, param6, 16, 0, 0, param1);
                      break L17;
                    }
                  }
                  L18: {
                    param9 = param9 - param6;
                    param2 = param2 - param6;
                    param1 = param1 - param8;
                    param4 = param4 - param8;
                    if (var11 != 0) {
                      var12 = dbb.a(var10, var11, var12, param1, param4, 0, 16, 0, -param8, param2);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var10 != 0) {
                      var12 = dbb.a(var11, var10, var12, param2, param9, 0, 16, 0, -param6, param1);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  return var12;
                } else {
                  return -1;
                }
              }
            } else {
              if (param6 >= param9) {
                L20: {
                  if (param1 <= param8) {
                    break L20;
                  } else {
                    if (~param4 < ~param8) {
                      return -1;
                    } else {
                      break L20;
                    }
                  }
                }
                L21: {
                  if (~param2 > ~param7) {
                    break L21;
                  } else {
                    if (param2 > param6) {
                      break L21;
                    } else {
                      if (~param1 > ~param3) {
                        break L21;
                      } else {
                        if (~param1 < ~param8) {
                          break L21;
                        } else {
                          if (param7 > param9) {
                            break L21;
                          } else {
                            if (param6 < param9) {
                              break L21;
                            } else {
                              if (~param4 > ~param3) {
                                break L21;
                              } else {
                                if (~param4 >= ~param8) {
                                  return 65537;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L22: {
                  param1 = param1 - param3;
                  param8 = param8 - param3;
                  param2 = param2 - param7;
                  param4 = param4 - param3;
                  param6 = param6 - param7;
                  param9 = param9 - param7;
                  var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(123, param9)), vma.a(115, param6));
                  if (var10 > 0) {
                    param2 = param2 >> var10;
                    param6 = param6 >> var10;
                    param9 = param9 >> var10;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                  if (0 >= var10) {
                    break L23;
                  } else {
                    param4 = param4 >> var10;
                    param1 = param1 >> var10;
                    param8 = param8 >> var10;
                    break L23;
                  }
                }
                L24: {
                  var10 = -param1 + param4;
                  var11 = param9 - param2;
                  var12 = -1;
                  if (var11 == 0) {
                    break L24;
                  } else {
                    var12 = dbb.a(var10, var11, var12, param1, param4, param8, 16, 0, 0, param2);
                    break L24;
                  }
                }
                L25: {
                  if (var10 == 0) {
                    break L25;
                  } else {
                    var12 = dbb.a(var11, var10, var12, param2, param9, param6, 16, 0, 0, param1);
                    break L25;
                  }
                }
                L26: {
                  param9 = param9 - param6;
                  param2 = param2 - param6;
                  param1 = param1 - param8;
                  param4 = param4 - param8;
                  if (var11 != 0) {
                    var12 = dbb.a(var10, var11, var12, param1, param4, 0, 16, 0, -param8, param2);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (var10 != 0) {
                    var12 = dbb.a(var11, var10, var12, param2, param9, 0, 16, 0, -param6, param1);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return var12;
              } else {
                return -1;
              }
            }
          } else {
            if (~param4 <= ~param3) {
              L28: {
                L29: {
                  if (~param6 <= ~param2) {
                    break L29;
                  } else {
                    if (param6 < param9) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                L30: {
                  if (param1 <= param8) {
                    break L30;
                  } else {
                    if (~param4 < ~param8) {
                      break L28;
                    } else {
                      break L30;
                    }
                  }
                }
                L31: {
                  if (~param2 > ~param7) {
                    break L31;
                  } else {
                    if (param2 > param6) {
                      break L31;
                    } else {
                      if (~param1 > ~param3) {
                        break L31;
                      } else {
                        if (~param1 < ~param8) {
                          break L31;
                        } else {
                          if (param7 > param9) {
                            break L31;
                          } else {
                            if (param6 < param9) {
                              break L31;
                            } else {
                              if (~param4 > ~param3) {
                                break L31;
                              } else {
                                if (~param4 >= ~param8) {
                                  return 65537;
                                } else {
                                  break L31;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L32: {
                  param1 = param1 - param3;
                  param8 = param8 - param3;
                  param2 = param2 - param7;
                  param4 = param4 - param3;
                  param6 = param6 - param7;
                  param9 = param9 - param7;
                  var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(123, param9)), vma.a(115, param6));
                  if (var10 > 0) {
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
                  if (var11 == 0) {
                    break L34;
                  } else {
                    var12 = dbb.a(var10, var11, var12, param1, param4, param8, 16, 0, 0, param2);
                    break L34;
                  }
                }
                L35: {
                  if (var10 == 0) {
                    break L35;
                  } else {
                    var12 = dbb.a(var11, var10, var12, param2, param9, param6, 16, 0, 0, param1);
                    break L35;
                  }
                }
                L36: {
                  param9 = param9 - param6;
                  param2 = param2 - param6;
                  param1 = param1 - param8;
                  param4 = param4 - param8;
                  if (var11 != 0) {
                    var12 = dbb.a(var10, var11, var12, param1, param4, 0, 16, 0, -param8, param2);
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (var10 != 0) {
                    var12 = dbb.a(var11, var10, var12, param2, param9, 0, 16, 0, -param6, param1);
                    break L37;
                  } else {
                    break L37;
                  }
                }
                return var12;
              }
              return -1;
            } else {
              return -1;
            }
          }
        } else {
          if (param7 <= param9) {
            L38: {
              L39: {
                if (param3 <= param1) {
                  break L39;
                } else {
                  if (~param4 > ~param3) {
                    break L38;
                  } else {
                    break L39;
                  }
                }
              }
              L40: {
                if (~param6 <= ~param2) {
                  break L40;
                } else {
                  if (param6 < param9) {
                    break L38;
                  } else {
                    break L40;
                  }
                }
              }
              L41: {
                if (param1 <= param8) {
                  break L41;
                } else {
                  if (~param4 < ~param8) {
                    break L38;
                  } else {
                    break L41;
                  }
                }
              }
              L42: {
                if (~param2 > ~param7) {
                  break L42;
                } else {
                  if (param2 > param6) {
                    break L42;
                  } else {
                    if (~param1 > ~param3) {
                      break L42;
                    } else {
                      if (~param1 < ~param8) {
                        break L42;
                      } else {
                        if (param7 > param9) {
                          break L42;
                        } else {
                          if (param6 < param9) {
                            break L42;
                          } else {
                            if (~param4 > ~param3) {
                              break L42;
                            } else {
                              if (~param4 >= ~param8) {
                                return 65537;
                              } else {
                                break L42;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L43: {
                param1 = param1 - param3;
                param8 = param8 - param3;
                param2 = param2 - param7;
                param4 = param4 - param3;
                param6 = param6 - param7;
                param9 = param9 - param7;
                var10 = -14 + Math.max(Math.max(vma.a(120, param2), vma.a(123, param9)), vma.a(115, param6));
                if (var10 > 0) {
                  param2 = param2 >> var10;
                  param6 = param6 >> var10;
                  param9 = param9 >> var10;
                  break L43;
                } else {
                  break L43;
                }
              }
              L44: {
                var10 = Math.max(Math.max(vma.a(123, param1), vma.a(111, param4)), vma.a(124, param8)) - 14;
                if (0 >= var10) {
                  break L44;
                } else {
                  param4 = param4 >> var10;
                  param1 = param1 >> var10;
                  param8 = param8 >> var10;
                  break L44;
                }
              }
              L45: {
                var10 = -param1 + param4;
                var11 = param9 - param2;
                var12 = -1;
                if (var11 == 0) {
                  break L45;
                } else {
                  var12 = dbb.a(var10, var11, var12, param1, param4, param8, 16, 0, 0, param2);
                  break L45;
                }
              }
              L46: {
                if (var10 == 0) {
                  break L46;
                } else {
                  var12 = dbb.a(var11, var10, var12, param2, param9, param6, 16, 0, 0, param1);
                  break L46;
                }
              }
              L47: {
                param9 = param9 - param6;
                param2 = param2 - param6;
                param1 = param1 - param8;
                param4 = param4 - param8;
                if (var11 != 0) {
                  var12 = dbb.a(var10, var11, var12, param1, param4, 0, 16, 0, -param8, param2);
                  break L47;
                } else {
                  break L47;
                }
              }
              L48: {
                if (var10 != 0) {
                  var12 = dbb.a(var11, var10, var12, param2, param9, 0, 16, 0, -param6, param1);
                  break L48;
                } else {
                  break L48;
                }
              }
              return var12;
            }
            return -1;
          } else {
            return -1;
          }
        }
    }

    final static void b() {
        wia.field_a = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 5;
    }
}
