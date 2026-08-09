/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends vi implements ib {
    static int field_V;
    static e field_M;
    private ga field_S;
    private int field_T;
    static String field_U;

    final void a(ga param0, int param1) {
        if (param1 <= 21) {
            return;
        }
        try {
            this.field_S = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "oc.SA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void g(byte param0) {
        vh var1 = (vh) ((Object) le.field_a.a((byte) 38));
        if (param0 != -105) {
            return;
        }
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        ul.a(var1.field_o, var1.field_p, var1.field_f);
        ul.e(var1.field_m, var1.field_l, var1.field_t, var1.field_g);
        var1.field_o = null;
        ml.field_f.a(-128, var1);
    }

    final static int a(int param0, int param1, vg param2, gj param3) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == null) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3.field_l == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param2 == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2.field_g != param3.field_o) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = -1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var4_int = param2.field_o.length;
                        var5 = param3.field_l[param0].length / var4_int;
                        if (param1 == -1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        oc.a('o', -125);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 >= var5) {
                            statePc = 30;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_31_0 = ((param3.field_p[param0][var6] ^ -1L) < (param2.field_h ^ -1L) ? -1 : ((param3.field_p[param0][var6] ^ -1L) == (param2.field_h ^ -1L) ? 0 : 1));
                        stackIn_13_0 = stackIn_31_0;
                        if (var8 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (fc.a((byte) -16, param3.field_i[param0][var6])) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var8 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var7 >= var4_int) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_28_0 = param3.field_l[param0][var6 * var4_int - -var7] ^ -1;
                        stackIn_22_0 = stackIn_28_0;
                        if (var8 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 == (param2.field_o[var7] ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var8 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7++;
                        if (var8 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = var6;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0;
                }
                case 29: {
                    try {
                        var6++;
                        if (var8 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = -1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0;
                }
                case 32: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_34_0 = (RuntimeException) (var4);
                    stackIn_33_0 = stackIn_34_0;
                    stackIn_34_1 = new StringBuilder().append("oc.QA(").append(param0).append(',').append(param1).append(',');
                    stackIn_33_1 = stackIn_34_1;
                    if (param2 == null) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_35_2 = "{...}";
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_35_2 = "null";
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_0 = stackIn_37_0;
                    stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
                    stackIn_36_1 = stackIn_37_1;
                    if (param3 == null) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_38_2 = "{...}";
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_38_2 = "null";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    throw dd.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static byte a(int param0, char param1) {
        int var2;
        int var3;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 < -103) {
          if (param1 <= 0) {
            if (param1 >= 160) {
              if (param1 > 255) {
                L0: {
                  L1: {
                    if (param1 != 8364) {
                      break L1;
                    } else {
                      var2 = -128;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if (param1 == 8218) {
                      break L2;
                    } else {
                      L3: {
                        if (param1 != 402) {
                          break L3;
                        } else {
                          var2 = -125;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (8222 != param1) {
                          break L4;
                        } else {
                          var2 = -124;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (8230 == param1) {
                          break L5;
                        } else {
                          L6: {
                            if (param1 != 8224) {
                              break L6;
                            } else {
                              var2 = -122;
                              if (var3 == 0) {
                                break L0;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (param1 == 8225) {
                              break L7;
                            } else {
                              L8: {
                                if (710 != param1) {
                                  break L8;
                                } else {
                                  var2 = -120;
                                  if (var3 == 0) {
                                    break L0;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (param1 != 8240) {
                                  break L9;
                                } else {
                                  var2 = -119;
                                  if (var3 == 0) {
                                    break L0;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (param1 == 352) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (param1 != 8249) {
                                      break L11;
                                    } else {
                                      var2 = -117;
                                      if (var3 == 0) {
                                        break L0;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (338 == param1) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (param1 == 381) {
                                          break L13;
                                        } else {
                                          L14: {
                                            if (param1 == 8216) {
                                              break L14;
                                            } else {
                                              L15: {
                                                if (8217 != param1) {
                                                  break L15;
                                                } else {
                                                  var2 = -110;
                                                  if (var3 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                              L16: {
                                                if (8220 != param1) {
                                                  break L16;
                                                } else {
                                                  var2 = -109;
                                                  if (var3 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                              L17: {
                                                if (param1 == 8221) {
                                                  break L17;
                                                } else {
                                                  L18: {
                                                    if (param1 == 8226) {
                                                      break L18;
                                                    } else {
                                                      L19: {
                                                        if (param1 != 8211) {
                                                          break L19;
                                                        } else {
                                                          var2 = -106;
                                                          if (var3 == 0) {
                                                            break L0;
                                                          } else {
                                                            break L19;
                                                          }
                                                        }
                                                      }
                                                      L20: {
                                                        if (param1 == 8212) {
                                                          break L20;
                                                        } else {
                                                          L21: {
                                                            if (732 != param1) {
                                                              break L21;
                                                            } else {
                                                              var2 = -104;
                                                              if (var3 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L21;
                                                              }
                                                            }
                                                          }
                                                          L22: {
                                                            if (param1 != 8482) {
                                                              break L22;
                                                            } else {
                                                              var2 = -103;
                                                              if (var3 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L22;
                                                              }
                                                            }
                                                          }
                                                          L23: {
                                                            if (param1 == 353) {
                                                              break L23;
                                                            } else {
                                                              L24: {
                                                                if (8250 == param1) {
                                                                  break L24;
                                                                } else {
                                                                  L25: {
                                                                    if (param1 != 339) {
                                                                      break L25;
                                                                    } else {
                                                                      var2 = -100;
                                                                      if (var3 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L25;
                                                                      }
                                                                    }
                                                                  }
                                                                  L26: {
                                                                    if (param1 != 382) {
                                                                      break L26;
                                                                    } else {
                                                                      var2 = -98;
                                                                      if (var3 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L26;
                                                                      }
                                                                    }
                                                                  }
                                                                  L27: {
                                                                    if (param1 != 376) {
                                                                      break L27;
                                                                    } else {
                                                                      var2 = -97;
                                                                      if (var3 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2 = 63;
                                                                  if (var3 == 0) {
                                                                    break L0;
                                                                  } else {
                                                                    break L24;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -101;
                                                              if (var3 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L23;
                                                              }
                                                            }
                                                          }
                                                          var2 = -102;
                                                          if (var3 == 0) {
                                                            break L0;
                                                          } else {
                                                            break L20;
                                                          }
                                                        }
                                                      }
                                                      var2 = -105;
                                                      if (var3 == 0) {
                                                        break L0;
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                  }
                                                  var2 = -107;
                                                  if (var3 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                              }
                                              var2 = -108;
                                              if (var3 == 0) {
                                                break L0;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          var2 = -111;
                                          if (var3 == 0) {
                                            break L0;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      var2 = -114;
                                      if (var3 == 0) {
                                        break L0;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var2 = -116;
                                  if (var3 == 0) {
                                    break L0;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var2 = -118;
                              if (var3 == 0) {
                                break L0;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var2 = -121;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2 = -123;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2 = -126;
                  break L0;
                }
                return (byte) var2;
              } else {
                L28: {
                  var2 = (byte)param1;
                  if (var3 == 0) {
                    break L28;
                  } else {
                    L29: {
                      if (param1 != 8364) {
                        break L29;
                      } else {
                        var2 = -128;
                        break L29;
                      }
                    }
                    L30: {
                      if (param1 == 8218) {
                        break L30;
                      } else {
                        L31: {
                          if (param1 != 402) {
                            break L31;
                          } else {
                            var2 = -125;
                            if (var3 == 0) {
                              break L28;
                            } else {
                              break L31;
                            }
                          }
                        }
                        L32: {
                          if (8222 != param1) {
                            break L32;
                          } else {
                            var2 = -124;
                            if (var3 == 0) {
                              break L28;
                            } else {
                              break L32;
                            }
                          }
                        }
                        L33: {
                          if (8230 == param1) {
                            break L33;
                          } else {
                            L34: {
                              if (param1 != 8224) {
                                break L34;
                              } else {
                                var2 = -122;
                                if (var3 == 0) {
                                  break L28;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            L35: {
                              if (param1 == 8225) {
                                break L35;
                              } else {
                                L36: {
                                  if (710 != param1) {
                                    break L36;
                                  } else {
                                    var2 = -120;
                                    if (var3 == 0) {
                                      break L28;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                L37: {
                                  if (param1 != 8240) {
                                    break L37;
                                  } else {
                                    var2 = -119;
                                    if (var3 == 0) {
                                      break L28;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                                L38: {
                                  if (param1 == 352) {
                                    break L38;
                                  } else {
                                    L39: {
                                      if (param1 != 8249) {
                                        break L39;
                                      } else {
                                        var2 = -117;
                                        if (var3 == 0) {
                                          break L28;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                    L40: {
                                      if (338 == param1) {
                                        break L40;
                                      } else {
                                        L41: {
                                          if (param1 == 381) {
                                            break L41;
                                          } else {
                                            L42: {
                                              if (param1 == 8216) {
                                                break L42;
                                              } else {
                                                L43: {
                                                  if (8217 != param1) {
                                                    break L43;
                                                  } else {
                                                    var2 = -110;
                                                    if (var3 == 0) {
                                                      break L28;
                                                    } else {
                                                      break L43;
                                                    }
                                                  }
                                                }
                                                L44: {
                                                  if (8220 != param1) {
                                                    break L44;
                                                  } else {
                                                    var2 = -109;
                                                    if (var3 == 0) {
                                                      break L28;
                                                    } else {
                                                      break L44;
                                                    }
                                                  }
                                                }
                                                L45: {
                                                  if (param1 == 8221) {
                                                    break L45;
                                                  } else {
                                                    L46: {
                                                      if (param1 == 8226) {
                                                        break L46;
                                                      } else {
                                                        L47: {
                                                          if (param1 != 8211) {
                                                            break L47;
                                                          } else {
                                                            var2 = -106;
                                                            if (var3 == 0) {
                                                              break L28;
                                                            } else {
                                                              break L47;
                                                            }
                                                          }
                                                        }
                                                        L48: {
                                                          if (param1 == 8212) {
                                                            break L48;
                                                          } else {
                                                            L49: {
                                                              if (732 != param1) {
                                                                break L49;
                                                              } else {
                                                                var2 = -104;
                                                                if (var3 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L49;
                                                                }
                                                              }
                                                            }
                                                            L50: {
                                                              if (param1 != 8482) {
                                                                break L50;
                                                              } else {
                                                                var2 = -103;
                                                                if (var3 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L50;
                                                                }
                                                              }
                                                            }
                                                            L51: {
                                                              if (param1 == 353) {
                                                                break L51;
                                                              } else {
                                                                L52: {
                                                                  if (8250 == param1) {
                                                                    break L52;
                                                                  } else {
                                                                    L53: {
                                                                      if (param1 != 339) {
                                                                        break L53;
                                                                      } else {
                                                                        var2 = -100;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L53;
                                                                        }
                                                                      }
                                                                    }
                                                                    L54: {
                                                                      if (param1 != 382) {
                                                                        break L54;
                                                                      } else {
                                                                        var2 = -98;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L54;
                                                                        }
                                                                      }
                                                                    }
                                                                    L55: {
                                                                      if (param1 != 376) {
                                                                        break L55;
                                                                      } else {
                                                                        var2 = -97;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L55;
                                                                        }
                                                                      }
                                                                    }
                                                                    var2 = 63;
                                                                    if (var3 == 0) {
                                                                      break L28;
                                                                    } else {
                                                                      break L52;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = -101;
                                                                if (var3 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L51;
                                                                }
                                                              }
                                                            }
                                                            var2 = -102;
                                                            if (var3 == 0) {
                                                              break L28;
                                                            } else {
                                                              break L48;
                                                            }
                                                          }
                                                        }
                                                        var2 = -105;
                                                        if (var3 == 0) {
                                                          break L28;
                                                        } else {
                                                          break L46;
                                                        }
                                                      }
                                                    }
                                                    var2 = -107;
                                                    if (var3 == 0) {
                                                      break L28;
                                                    } else {
                                                      break L45;
                                                    }
                                                  }
                                                }
                                                var2 = -108;
                                                if (var3 == 0) {
                                                  break L28;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                            }
                                            var2 = -111;
                                            if (var3 == 0) {
                                              break L28;
                                            } else {
                                              break L41;
                                            }
                                          }
                                        }
                                        var2 = -114;
                                        if (var3 == 0) {
                                          break L28;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                    var2 = -116;
                                    if (var3 == 0) {
                                      break L28;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                                var2 = -118;
                                if (var3 == 0) {
                                  break L28;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var2 = -121;
                            if (var3 == 0) {
                              break L28;
                            } else {
                              break L33;
                            }
                          }
                        }
                        var2 = -123;
                        if (var3 == 0) {
                          break L28;
                        } else {
                          break L30;
                        }
                      }
                    }
                    var2 = -126;
                    break L28;
                  }
                }
                return (byte) var2;
              }
            } else {
              L56: {
                L57: {
                  if (param1 != 8364) {
                    break L57;
                  } else {
                    var2 = -128;
                    if (var3 == 0) {
                      break L56;
                    } else {
                      break L57;
                    }
                  }
                }
                L58: {
                  if (param1 == 8218) {
                    break L58;
                  } else {
                    L59: {
                      if (param1 != 402) {
                        break L59;
                      } else {
                        var2 = -125;
                        if (var3 == 0) {
                          break L56;
                        } else {
                          break L59;
                        }
                      }
                    }
                    L60: {
                      if (8222 != param1) {
                        break L60;
                      } else {
                        var2 = -124;
                        if (var3 == 0) {
                          break L56;
                        } else {
                          break L60;
                        }
                      }
                    }
                    L61: {
                      if (8230 == param1) {
                        break L61;
                      } else {
                        L62: {
                          if (param1 != 8224) {
                            break L62;
                          } else {
                            var2 = -122;
                            if (var3 == 0) {
                              break L56;
                            } else {
                              break L62;
                            }
                          }
                        }
                        L63: {
                          if (param1 == 8225) {
                            break L63;
                          } else {
                            L64: {
                              if (710 != param1) {
                                break L64;
                              } else {
                                var2 = -120;
                                if (var3 == 0) {
                                  break L56;
                                } else {
                                  break L64;
                                }
                              }
                            }
                            L65: {
                              if (param1 != 8240) {
                                break L65;
                              } else {
                                var2 = -119;
                                if (var3 == 0) {
                                  break L56;
                                } else {
                                  break L65;
                                }
                              }
                            }
                            L66: {
                              if (param1 == 352) {
                                break L66;
                              } else {
                                L67: {
                                  if (param1 != 8249) {
                                    break L67;
                                  } else {
                                    var2 = -117;
                                    if (var3 == 0) {
                                      break L56;
                                    } else {
                                      break L67;
                                    }
                                  }
                                }
                                L68: {
                                  if (338 == param1) {
                                    break L68;
                                  } else {
                                    L69: {
                                      if (param1 == 381) {
                                        break L69;
                                      } else {
                                        L70: {
                                          if (param1 == 8216) {
                                            break L70;
                                          } else {
                                            L71: {
                                              if (8217 != param1) {
                                                break L71;
                                              } else {
                                                var2 = -110;
                                                if (var3 == 0) {
                                                  break L56;
                                                } else {
                                                  break L71;
                                                }
                                              }
                                            }
                                            L72: {
                                              if (8220 != param1) {
                                                break L72;
                                              } else {
                                                var2 = -109;
                                                if (var3 == 0) {
                                                  break L56;
                                                } else {
                                                  break L72;
                                                }
                                              }
                                            }
                                            L73: {
                                              if (param1 == 8221) {
                                                break L73;
                                              } else {
                                                L74: {
                                                  if (param1 == 8226) {
                                                    break L74;
                                                  } else {
                                                    L75: {
                                                      if (param1 != 8211) {
                                                        break L75;
                                                      } else {
                                                        var2 = -106;
                                                        if (var3 == 0) {
                                                          break L56;
                                                        } else {
                                                          break L75;
                                                        }
                                                      }
                                                    }
                                                    L76: {
                                                      if (param1 == 8212) {
                                                        break L76;
                                                      } else {
                                                        L77: {
                                                          if (732 != param1) {
                                                            break L77;
                                                          } else {
                                                            var2 = -104;
                                                            if (var3 == 0) {
                                                              break L56;
                                                            } else {
                                                              break L77;
                                                            }
                                                          }
                                                        }
                                                        L78: {
                                                          if (param1 != 8482) {
                                                            break L78;
                                                          } else {
                                                            var2 = -103;
                                                            if (var3 == 0) {
                                                              break L56;
                                                            } else {
                                                              break L78;
                                                            }
                                                          }
                                                        }
                                                        L79: {
                                                          if (param1 == 353) {
                                                            break L79;
                                                          } else {
                                                            L80: {
                                                              if (8250 == param1) {
                                                                break L80;
                                                              } else {
                                                                L81: {
                                                                  if (param1 != 339) {
                                                                    break L81;
                                                                  } else {
                                                                    var2 = -100;
                                                                    if (var3 == 0) {
                                                                      break L56;
                                                                    } else {
                                                                      break L81;
                                                                    }
                                                                  }
                                                                }
                                                                L82: {
                                                                  if (param1 != 382) {
                                                                    break L82;
                                                                  } else {
                                                                    var2 = -98;
                                                                    if (var3 == 0) {
                                                                      break L56;
                                                                    } else {
                                                                      break L82;
                                                                    }
                                                                  }
                                                                }
                                                                L83: {
                                                                  if (param1 != 376) {
                                                                    break L83;
                                                                  } else {
                                                                    var2 = -97;
                                                                    if (var3 == 0) {
                                                                      break L56;
                                                                    } else {
                                                                      break L83;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = 63;
                                                                if (var3 == 0) {
                                                                  break L56;
                                                                } else {
                                                                  break L80;
                                                                }
                                                              }
                                                            }
                                                            var2 = -101;
                                                            if (var3 == 0) {
                                                              break L56;
                                                            } else {
                                                              break L79;
                                                            }
                                                          }
                                                        }
                                                        var2 = -102;
                                                        if (var3 == 0) {
                                                          break L56;
                                                        } else {
                                                          break L76;
                                                        }
                                                      }
                                                    }
                                                    var2 = -105;
                                                    if (var3 == 0) {
                                                      break L56;
                                                    } else {
                                                      break L74;
                                                    }
                                                  }
                                                }
                                                var2 = -107;
                                                if (var3 == 0) {
                                                  break L56;
                                                } else {
                                                  break L73;
                                                }
                                              }
                                            }
                                            var2 = -108;
                                            if (var3 == 0) {
                                              break L56;
                                            } else {
                                              break L70;
                                            }
                                          }
                                        }
                                        var2 = -111;
                                        if (var3 == 0) {
                                          break L56;
                                        } else {
                                          break L69;
                                        }
                                      }
                                    }
                                    var2 = -114;
                                    if (var3 == 0) {
                                      break L56;
                                    } else {
                                      break L68;
                                    }
                                  }
                                }
                                var2 = -116;
                                if (var3 == 0) {
                                  break L56;
                                } else {
                                  break L66;
                                }
                              }
                            }
                            var2 = -118;
                            if (var3 == 0) {
                              break L56;
                            } else {
                              break L63;
                            }
                          }
                        }
                        var2 = -121;
                        if (var3 == 0) {
                          break L56;
                        } else {
                          break L61;
                        }
                      }
                    }
                    var2 = -123;
                    if (var3 == 0) {
                      break L56;
                    } else {
                      break L58;
                    }
                  }
                }
                var2 = -126;
                break L56;
              }
              return (byte) var2;
            }
          } else {
            if (param1 >= 128) {
              L84: {
                L85: {
                  if (param1 < 160) {
                    break L85;
                  } else {
                    if (param1 > 255) {
                      break L85;
                    } else {
                      var2 = (byte)param1;
                      if (var3 == 0) {
                        break L84;
                      } else {
                        break L85;
                      }
                    }
                  }
                }
                L86: {
                  if (param1 != 8364) {
                    break L86;
                  } else {
                    var2 = -128;
                    if (var3 == 0) {
                      break L84;
                    } else {
                      break L86;
                    }
                  }
                }
                L87: {
                  if (param1 == 8218) {
                    break L87;
                  } else {
                    L88: {
                      if (param1 != 402) {
                        break L88;
                      } else {
                        var2 = -125;
                        if (var3 == 0) {
                          break L84;
                        } else {
                          break L88;
                        }
                      }
                    }
                    L89: {
                      if (8222 != param1) {
                        break L89;
                      } else {
                        var2 = -124;
                        if (var3 == 0) {
                          break L84;
                        } else {
                          break L89;
                        }
                      }
                    }
                    L90: {
                      if (8230 == param1) {
                        break L90;
                      } else {
                        L91: {
                          if (param1 != 8224) {
                            break L91;
                          } else {
                            var2 = -122;
                            if (var3 == 0) {
                              break L84;
                            } else {
                              break L91;
                            }
                          }
                        }
                        L92: {
                          if (param1 == 8225) {
                            break L92;
                          } else {
                            L93: {
                              if (710 != param1) {
                                break L93;
                              } else {
                                var2 = -120;
                                if (var3 == 0) {
                                  break L84;
                                } else {
                                  break L93;
                                }
                              }
                            }
                            L94: {
                              if (param1 != 8240) {
                                break L94;
                              } else {
                                var2 = -119;
                                if (var3 == 0) {
                                  break L84;
                                } else {
                                  break L94;
                                }
                              }
                            }
                            L95: {
                              if (param1 == 352) {
                                break L95;
                              } else {
                                L96: {
                                  if (param1 != 8249) {
                                    break L96;
                                  } else {
                                    var2 = -117;
                                    if (var3 == 0) {
                                      break L84;
                                    } else {
                                      break L96;
                                    }
                                  }
                                }
                                L97: {
                                  if (338 == param1) {
                                    break L97;
                                  } else {
                                    L98: {
                                      if (param1 == 381) {
                                        break L98;
                                      } else {
                                        L99: {
                                          if (param1 == 8216) {
                                            break L99;
                                          } else {
                                            L100: {
                                              if (8217 != param1) {
                                                break L100;
                                              } else {
                                                var2 = -110;
                                                if (var3 == 0) {
                                                  break L84;
                                                } else {
                                                  break L100;
                                                }
                                              }
                                            }
                                            L101: {
                                              if (8220 != param1) {
                                                break L101;
                                              } else {
                                                var2 = -109;
                                                if (var3 == 0) {
                                                  break L84;
                                                } else {
                                                  break L101;
                                                }
                                              }
                                            }
                                            L102: {
                                              if (param1 == 8221) {
                                                break L102;
                                              } else {
                                                L103: {
                                                  if (param1 == 8226) {
                                                    break L103;
                                                  } else {
                                                    L104: {
                                                      if (param1 != 8211) {
                                                        break L104;
                                                      } else {
                                                        var2 = -106;
                                                        if (var3 == 0) {
                                                          break L84;
                                                        } else {
                                                          break L104;
                                                        }
                                                      }
                                                    }
                                                    L105: {
                                                      if (param1 == 8212) {
                                                        break L105;
                                                      } else {
                                                        L106: {
                                                          if (732 != param1) {
                                                            break L106;
                                                          } else {
                                                            var2 = -104;
                                                            if (var3 == 0) {
                                                              break L84;
                                                            } else {
                                                              break L106;
                                                            }
                                                          }
                                                        }
                                                        L107: {
                                                          if (param1 != 8482) {
                                                            break L107;
                                                          } else {
                                                            var2 = -103;
                                                            if (var3 == 0) {
                                                              break L84;
                                                            } else {
                                                              break L107;
                                                            }
                                                          }
                                                        }
                                                        L108: {
                                                          if (param1 == 353) {
                                                            break L108;
                                                          } else {
                                                            L109: {
                                                              if (8250 == param1) {
                                                                break L109;
                                                              } else {
                                                                L110: {
                                                                  if (param1 != 339) {
                                                                    break L110;
                                                                  } else {
                                                                    var2 = -100;
                                                                    if (var3 == 0) {
                                                                      break L84;
                                                                    } else {
                                                                      break L110;
                                                                    }
                                                                  }
                                                                }
                                                                L111: {
                                                                  if (param1 != 382) {
                                                                    break L111;
                                                                  } else {
                                                                    var2 = -98;
                                                                    if (var3 == 0) {
                                                                      break L84;
                                                                    } else {
                                                                      break L111;
                                                                    }
                                                                  }
                                                                }
                                                                L112: {
                                                                  if (param1 != 376) {
                                                                    break L112;
                                                                  } else {
                                                                    var2 = -97;
                                                                    if (var3 == 0) {
                                                                      break L84;
                                                                    } else {
                                                                      break L112;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = 63;
                                                                if (var3 == 0) {
                                                                  break L84;
                                                                } else {
                                                                  break L109;
                                                                }
                                                              }
                                                            }
                                                            var2 = -101;
                                                            if (var3 == 0) {
                                                              break L84;
                                                            } else {
                                                              break L108;
                                                            }
                                                          }
                                                        }
                                                        var2 = -102;
                                                        if (var3 == 0) {
                                                          break L84;
                                                        } else {
                                                          break L105;
                                                        }
                                                      }
                                                    }
                                                    var2 = -105;
                                                    if (var3 == 0) {
                                                      break L84;
                                                    } else {
                                                      break L103;
                                                    }
                                                  }
                                                }
                                                var2 = -107;
                                                if (var3 == 0) {
                                                  break L84;
                                                } else {
                                                  break L102;
                                                }
                                              }
                                            }
                                            var2 = -108;
                                            if (var3 == 0) {
                                              break L84;
                                            } else {
                                              break L99;
                                            }
                                          }
                                        }
                                        var2 = -111;
                                        if (var3 == 0) {
                                          break L84;
                                        } else {
                                          break L98;
                                        }
                                      }
                                    }
                                    var2 = -114;
                                    if (var3 == 0) {
                                      break L84;
                                    } else {
                                      break L97;
                                    }
                                  }
                                }
                                var2 = -116;
                                if (var3 == 0) {
                                  break L84;
                                } else {
                                  break L95;
                                }
                              }
                            }
                            var2 = -118;
                            if (var3 == 0) {
                              break L84;
                            } else {
                              break L92;
                            }
                          }
                        }
                        var2 = -121;
                        if (var3 == 0) {
                          break L84;
                        } else {
                          break L90;
                        }
                      }
                    }
                    var2 = -123;
                    if (var3 == 0) {
                      break L84;
                    } else {
                      break L87;
                    }
                  }
                }
                var2 = -126;
                break L84;
              }
              return (byte) var2;
            } else {
              L113: {
                var2 = (byte)param1;
                if (var3 == 0) {
                  break L113;
                } else {
                  L114: {
                    if (param1 != 8364) {
                      break L114;
                    } else {
                      var2 = -128;
                      break L114;
                    }
                  }
                  L115: {
                    if (param1 == 8218) {
                      break L115;
                    } else {
                      L116: {
                        if (param1 != 402) {
                          break L116;
                        } else {
                          var2 = -125;
                          if (var3 == 0) {
                            break L113;
                          } else {
                            break L116;
                          }
                        }
                      }
                      L117: {
                        if (8222 != param1) {
                          break L117;
                        } else {
                          var2 = -124;
                          if (var3 == 0) {
                            break L113;
                          } else {
                            break L117;
                          }
                        }
                      }
                      L118: {
                        if (8230 == param1) {
                          break L118;
                        } else {
                          L119: {
                            if (param1 != 8224) {
                              break L119;
                            } else {
                              var2 = -122;
                              if (var3 == 0) {
                                break L113;
                              } else {
                                break L119;
                              }
                            }
                          }
                          L120: {
                            if (param1 == 8225) {
                              break L120;
                            } else {
                              L121: {
                                if (710 != param1) {
                                  break L121;
                                } else {
                                  var2 = -120;
                                  if (var3 == 0) {
                                    break L113;
                                  } else {
                                    break L121;
                                  }
                                }
                              }
                              L122: {
                                if (param1 != 8240) {
                                  break L122;
                                } else {
                                  var2 = -119;
                                  if (var3 == 0) {
                                    break L113;
                                  } else {
                                    break L122;
                                  }
                                }
                              }
                              L123: {
                                if (param1 == 352) {
                                  break L123;
                                } else {
                                  L124: {
                                    if (param1 != 8249) {
                                      break L124;
                                    } else {
                                      var2 = -117;
                                      if (var3 == 0) {
                                        break L113;
                                      } else {
                                        break L124;
                                      }
                                    }
                                  }
                                  L125: {
                                    if (338 == param1) {
                                      break L125;
                                    } else {
                                      L126: {
                                        if (param1 == 381) {
                                          break L126;
                                        } else {
                                          L127: {
                                            if (param1 == 8216) {
                                              break L127;
                                            } else {
                                              L128: {
                                                if (8217 != param1) {
                                                  break L128;
                                                } else {
                                                  var2 = -110;
                                                  if (var3 == 0) {
                                                    break L113;
                                                  } else {
                                                    break L128;
                                                  }
                                                }
                                              }
                                              L129: {
                                                if (8220 != param1) {
                                                  break L129;
                                                } else {
                                                  var2 = -109;
                                                  if (var3 == 0) {
                                                    break L113;
                                                  } else {
                                                    break L129;
                                                  }
                                                }
                                              }
                                              L130: {
                                                if (param1 == 8221) {
                                                  break L130;
                                                } else {
                                                  L131: {
                                                    if (param1 == 8226) {
                                                      break L131;
                                                    } else {
                                                      L132: {
                                                        if (param1 != 8211) {
                                                          break L132;
                                                        } else {
                                                          var2 = -106;
                                                          if (var3 == 0) {
                                                            break L113;
                                                          } else {
                                                            break L132;
                                                          }
                                                        }
                                                      }
                                                      L133: {
                                                        if (param1 == 8212) {
                                                          break L133;
                                                        } else {
                                                          L134: {
                                                            if (732 != param1) {
                                                              break L134;
                                                            } else {
                                                              var2 = -104;
                                                              if (var3 == 0) {
                                                                break L113;
                                                              } else {
                                                                break L134;
                                                              }
                                                            }
                                                          }
                                                          L135: {
                                                            if (param1 != 8482) {
                                                              break L135;
                                                            } else {
                                                              var2 = -103;
                                                              if (var3 == 0) {
                                                                break L113;
                                                              } else {
                                                                break L135;
                                                              }
                                                            }
                                                          }
                                                          L136: {
                                                            if (param1 == 353) {
                                                              break L136;
                                                            } else {
                                                              L137: {
                                                                if (8250 == param1) {
                                                                  break L137;
                                                                } else {
                                                                  L138: {
                                                                    if (param1 != 339) {
                                                                      break L138;
                                                                    } else {
                                                                      var2 = -100;
                                                                      if (var3 == 0) {
                                                                        break L113;
                                                                      } else {
                                                                        break L138;
                                                                      }
                                                                    }
                                                                  }
                                                                  L139: {
                                                                    if (param1 != 382) {
                                                                      break L139;
                                                                    } else {
                                                                      var2 = -98;
                                                                      if (var3 == 0) {
                                                                        break L113;
                                                                      } else {
                                                                        break L139;
                                                                      }
                                                                    }
                                                                  }
                                                                  L140: {
                                                                    if (param1 != 376) {
                                                                      break L140;
                                                                    } else {
                                                                      var2 = -97;
                                                                      if (var3 == 0) {
                                                                        break L113;
                                                                      } else {
                                                                        break L140;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2 = 63;
                                                                  if (var3 == 0) {
                                                                    break L113;
                                                                  } else {
                                                                    break L137;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -101;
                                                              if (var3 == 0) {
                                                                break L113;
                                                              } else {
                                                                break L136;
                                                              }
                                                            }
                                                          }
                                                          var2 = -102;
                                                          if (var3 == 0) {
                                                            break L113;
                                                          } else {
                                                            break L133;
                                                          }
                                                        }
                                                      }
                                                      var2 = -105;
                                                      if (var3 == 0) {
                                                        break L113;
                                                      } else {
                                                        break L131;
                                                      }
                                                    }
                                                  }
                                                  var2 = -107;
                                                  if (var3 == 0) {
                                                    break L113;
                                                  } else {
                                                    break L130;
                                                  }
                                                }
                                              }
                                              var2 = -108;
                                              if (var3 == 0) {
                                                break L113;
                                              } else {
                                                break L127;
                                              }
                                            }
                                          }
                                          var2 = -111;
                                          if (var3 == 0) {
                                            break L113;
                                          } else {
                                            break L126;
                                          }
                                        }
                                      }
                                      var2 = -114;
                                      if (var3 == 0) {
                                        break L113;
                                      } else {
                                        break L125;
                                      }
                                    }
                                  }
                                  var2 = -116;
                                  if (var3 == 0) {
                                    break L113;
                                  } else {
                                    break L123;
                                  }
                                }
                              }
                              var2 = -118;
                              if (var3 == 0) {
                                break L113;
                              } else {
                                break L120;
                              }
                            }
                          }
                          var2 = -121;
                          if (var3 == 0) {
                            break L113;
                          } else {
                            break L118;
                          }
                        }
                      }
                      var2 = -123;
                      if (var3 == 0) {
                        break L113;
                      } else {
                        break L115;
                      }
                    }
                  }
                  var2 = -126;
                  break L113;
                }
              }
              return (byte) var2;
            }
          }
        } else {
          return (byte) 79;
        }
    }

    public final ga a(byte param0) {
        int var2 = -126 % ((-54 - param0) / 41);
        return this.field_S;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 >= param0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (160 > param0) {
                break L2;
              } else {
                if (param0 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              L4: {
                if (param0 == param1) {
                  break L4;
                } else {
                  var6 = fe.field_a;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var6.length <= var3) {
                      break L4;
                    } else {
                      var4 = var6[var3];
                      stackIn_18_0 = var4 ^ -1;

                      if (var5 != 0) {
                        break L3;
                      } else {
                        if (stackIn_18_0 != (param0 ^ -1)) {
                          var3++;
                          if (var5 == 0) {
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          stackIn_15_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_18_0 = 0;
              break L3;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "oc.KA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final void c(byte param0) {
        if (param0 > -120) {
          L0: {
            oc.a(93, '￭');
            super.c((byte) -127);
            if (this.field_S != null) {
              this.field_S.b(-20959);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            super.c((byte) -127);
            if (this.field_S != null) {
              this.field_S.b(-20959);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final String g(int param0) {
        if (param0 == -8235) {
          if (this.field_t) {
            if (null == this.field_i) {
              return null;
            } else {
              dm.a(1, this.field_m - this.field_T + ua.field_a, vl.field_d);
              return this.field_i;
            }
          } else {
            return null;
          }
        } else {
          this.g(83);
          if (this.field_t) {
            if (null == this.field_i) {
              return null;
            } else {
              dm.a(1, this.field_m - this.field_T + ua.field_a, vl.field_d);
              return this.field_i;
            }
          } else {
            return null;
          }
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_T = ua.field_a - (this.field_s + param2);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "oc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    oc(String param0, ag param1, int param2) {
        super(param0, param1, param2);
    }

    public static void q(int param0) {
        gj var2;
        if (param0 <= 85) {
          var2 = (gj) null;
          oc.a(-84, -74, (vg) null, (gj) null);
          field_U = null;
          field_M = null;
          return;
        } else {
          field_U = null;
          field_M = null;
          return;
        }
    }

    final static byte[] a(boolean param0, CharSequence param1) {
        byte[] stackIn_3_0 = null;
        byte[] stackIn_97_0 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.length();
                        var3 = new byte[var2_int];
                        var4 = 0;
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (byte[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (var2_int <= var4) {
                            statePc = 96;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = param1.charAt(var4);
                        if (0 >= var5) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (128 > var5) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var5 < 160) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 > 255) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3[var4] = (byte)var5;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var5 != 8364) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3[var4] = (byte)-128;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var5 != 8218) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3[var4] = (byte)-126;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var5 != 402) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3[var4] = (byte)-125;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var5 == 8222) {
                            statePc = 94;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var5 != 8230) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var3[var4] = (byte)-123;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var5 != 8224) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var3[var4] = (byte)-122;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (8225 != var5) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var3[var4] = (byte)-121;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var5 != 710) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var3[var4] = (byte)-120;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var5 != 8240) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var3[var4] = (byte)-119;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var5 != 352) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var3[var4] = (byte)-118;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var5 != 8249) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var3[var4] = (byte)-117;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var5 != 338) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var3[var4] = (byte)-116;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (381 == var5) {
                            statePc = 92;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var5 != 8216) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var3[var4] = (byte)-111;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var5 != 8217) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var3[var4] = (byte)-110;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var5 != 8220) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var3[var4] = (byte)-109;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var5 != 8221) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var3[var4] = (byte)-108;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var5 != 8226) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var3[var4] = (byte)-107;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var5 != 8211) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var3[var4] = (byte)-106;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var5 != 8212) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var3[var4] = (byte)-105;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var5 != 732) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var3[var4] = (byte)-104;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var5 == 8482) {
                            statePc = 90;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var5 != 353) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var3[var4] = (byte)-102;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var5 != 8250) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var3[var4] = (byte)-101;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var5 != 339) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var3[var4] = (byte)-100;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var5 == 382) {
                            statePc = 88;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var5 == 376) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var3[var4] = (byte)63;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var3[var4] = (byte)-97;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var3[var4] = (byte)-98;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var3[var4] = (byte)-103;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var3[var4] = (byte)-114;
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var3[var4] = (byte)-124;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackIn_97_0 = (byte[]) (var3);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    return stackIn_97_0;
                }
                case 98: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_100_0 = (RuntimeException) (var2);
                    stackIn_99_0 = stackIn_100_0;
                    stackIn_100_1 = new StringBuilder().append("oc.MA(").append(param0).append(',');
                    stackIn_99_1 = stackIn_100_1;
                    if (param1 == null) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackIn_101_0 = (RuntimeException) ((Object) stackIn_99_0);
                    stackIn_101_1 = (StringBuilder) ((Object) stackIn_99_1);
                    stackIn_101_2 = "{...}";
                    statePc = 101;
                    continue stateLoop;
                }
                case 100: {
                    stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
                    stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
                    stackIn_101_2 = "null";
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    throw dd.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_M = new e();
        field_U = "(Including <%0>)";
    }
}
