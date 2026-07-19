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
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.field_l == null) {
                  break L1;
                } else {
                  if (param2 == null) {
                    break L1;
                  } else {
                    if (param2.field_g != param3.field_o) {
                      break L1;
                    } else {
                      L2: {
                        var4_int = param2.field_o.length;
                        var5 = param3.field_l[param0].length / var4_int;
                        if (param1 == -1) {
                          break L2;
                        } else {
                          discarded$1 = oc.a('o', -125);
                          break L2;
                        }
                      }
                      var6 = 0;
                      L3: while (true) {
                        L4: {
                          if (var6 >= var5) {
                            stackOut_30_0 = -1;
                            stackIn_31_0 = stackOut_30_0;
                            break L4;
                          } else {
                            stackOut_12_0 = ((param3.field_p[param0][var6] ^ -1L) < (param2.field_h ^ -1L) ? -1 : ((param3.field_p[param0][var6] ^ -1L) == (param2.field_h ^ -1L) ? 0 : 1));
                            stackIn_31_0 = stackOut_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            if (var8 != 0) {
                              break L4;
                            } else {
                              L5: {
                                L6: {
                                  if (stackIn_13_0 == 0) {
                                    break L6;
                                  } else {
                                    if (var8 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                L7: {
                                  if (fc.a((byte) -16, param3.field_i[param0][var6])) {
                                    break L7;
                                  } else {
                                    if (var8 == 0) {
                                      break L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var7 = 0;
                                L8: while (true) {
                                  L9: {
                                    if (var7 >= var4_int) {
                                      stackOut_27_0 = var6;
                                      stackIn_28_0 = stackOut_27_0;
                                      break L9;
                                    } else {
                                      stackOut_21_0 = param3.field_l[param0][var6 * var4_int - -var7] ^ -1;
                                      stackIn_28_0 = stackOut_21_0;
                                      stackIn_22_0 = stackOut_21_0;
                                      if (var8 != 0) {
                                        break L9;
                                      } else {
                                        L10: {
                                          if (stackIn_22_0 == (param2.field_o[var7] ^ -1)) {
                                            break L10;
                                          } else {
                                            if (var8 == 0) {
                                              break L5;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        var7++;
                                        continue L8;
                                      }
                                    }
                                  }
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                }
                              }
                              var6++;
                              continue L3;
                            }
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var4);
            stackOut_32_1 = new StringBuilder().append("oc.QA(").append(param0).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0;
          } else {
            return stackIn_28_0;
          }
        }
    }

    final static byte a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
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
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 >= param0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
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
                      stackOut_12_0 = var4 ^ -1;
                      stackIn_18_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        if (stackIn_13_0 != (param0 ^ -1)) {
                          var3++;
                          if (var5 == 0) {
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_15_0 = stackOut_14_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
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
        byte discarded$2 = 0;
        if (param0 > -120) {
          L0: {
            discarded$2 = oc.a(93, '￭');
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
        String discarded$6 = null;
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
          discarded$6 = this.g(83);
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
        int discarded$2 = 0;
        gj var2 = null;
        if (param0 <= 85) {
          var2 = (gj) null;
          discarded$2 = oc.a(-84, -74, (vg) null, (gj) null);
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
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_96_0 = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new byte[var2_int];
            var4 = 0;
            if (param0) {
              L1: while (true) {
                L2: {
                  if (var2_int <= var4) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          L6: {
                            var5 = param1.charAt(var4);
                            if (0 >= var5) {
                              break L6;
                            } else {
                              if (128 > var5) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var5 < 160) {
                            break L4;
                          } else {
                            if (var5 > 255) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var3[var4] = (byte)var5;
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L7: {
                        if (var5 != 8364) {
                          break L7;
                        } else {
                          var3[var4] = (byte)-128;
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (var5 != 8218) {
                          break L8;
                        } else {
                          var3[var4] = (byte)-126;
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (var5 != 402) {
                          break L9;
                        } else {
                          var3[var4] = (byte)-125;
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var5 == 8222) {
                          break L10;
                        } else {
                          L11: {
                            if (var5 != 8230) {
                              break L11;
                            } else {
                              var3[var4] = (byte)-123;
                              if (var6 == 0) {
                                break L3;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (var5 != 8224) {
                              break L12;
                            } else {
                              var3[var4] = (byte)-122;
                              if (var6 == 0) {
                                break L3;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (8225 != var5) {
                              break L13;
                            } else {
                              var3[var4] = (byte)-121;
                              if (var6 == 0) {
                                break L3;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (var5 != 710) {
                              break L14;
                            } else {
                              var3[var4] = (byte)-120;
                              if (var6 == 0) {
                                break L3;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L15: {
                            if (var5 != 8240) {
                              break L15;
                            } else {
                              var3[var4] = (byte)-119;
                              if (var6 == 0) {
                                break L3;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L16: {
                            if (var5 != 352) {
                              break L16;
                            } else {
                              var3[var4] = (byte)-118;
                              if (var6 == 0) {
                                break L3;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L17: {
                            if (var5 != 8249) {
                              break L17;
                            } else {
                              var3[var4] = (byte)-117;
                              if (var6 == 0) {
                                break L3;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L18: {
                            if (var5 != 338) {
                              break L18;
                            } else {
                              var3[var4] = (byte)-116;
                              if (var6 == 0) {
                                break L3;
                              } else {
                                break L18;
                              }
                            }
                          }
                          L19: {
                            if (381 == var5) {
                              break L19;
                            } else {
                              L20: {
                                if (var5 != 8216) {
                                  break L20;
                                } else {
                                  var3[var4] = (byte)-111;
                                  if (var6 == 0) {
                                    break L3;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              L21: {
                                if (var5 != 8217) {
                                  break L21;
                                } else {
                                  var3[var4] = (byte)-110;
                                  if (var6 == 0) {
                                    break L3;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              L22: {
                                if (var5 != 8220) {
                                  break L22;
                                } else {
                                  var3[var4] = (byte)-109;
                                  if (var6 == 0) {
                                    break L3;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                              L23: {
                                if (var5 != 8221) {
                                  break L23;
                                } else {
                                  var3[var4] = (byte)-108;
                                  if (var6 == 0) {
                                    break L3;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              L24: {
                                if (var5 != 8226) {
                                  break L24;
                                } else {
                                  var3[var4] = (byte)-107;
                                  if (var6 == 0) {
                                    break L3;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              L25: {
                                if (var5 != 8211) {
                                  break L25;
                                } else {
                                  var3[var4] = (byte)-106;
                                  if (var6 == 0) {
                                    break L3;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              L26: {
                                if (var5 != 8212) {
                                  break L26;
                                } else {
                                  var3[var4] = (byte)-105;
                                  if (var6 == 0) {
                                    break L3;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              L27: {
                                if (var5 != 732) {
                                  break L27;
                                } else {
                                  var3[var4] = (byte)-104;
                                  if (var6 == 0) {
                                    break L3;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              L28: {
                                if (var5 == 8482) {
                                  break L28;
                                } else {
                                  L29: {
                                    if (var5 != 353) {
                                      break L29;
                                    } else {
                                      var3[var4] = (byte)-102;
                                      if (var6 == 0) {
                                        break L3;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                  L30: {
                                    if (var5 != 8250) {
                                      break L30;
                                    } else {
                                      var3[var4] = (byte)-101;
                                      if (var6 == 0) {
                                        break L3;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  L31: {
                                    if (var5 != 339) {
                                      break L31;
                                    } else {
                                      var3[var4] = (byte)-100;
                                      if (var6 == 0) {
                                        break L3;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                  L32: {
                                    if (var5 == 382) {
                                      break L32;
                                    } else {
                                      L33: {
                                        if (var5 == 376) {
                                          break L33;
                                        } else {
                                          var3[var4] = (byte)63;
                                          if (var6 == 0) {
                                            break L3;
                                          } else {
                                            break L33;
                                          }
                                        }
                                      }
                                      var3[var4] = (byte)-97;
                                      if (var6 == 0) {
                                        break L3;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  var3[var4] = (byte)-98;
                                  if (var6 == 0) {
                                    break L3;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                              var3[var4] = (byte)-103;
                              if (var6 == 0) {
                                break L3;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var3[var4] = (byte)-114;
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var3[var4] = (byte)-124;
                      break L3;
                    }
                    var4++;
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_96_0 = (byte[]) (var3);
                stackIn_97_0 = stackOut_96_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (byte[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var2 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) (var2);
            stackOut_98_1 = new StringBuilder().append("oc.MA(").append(param0).append(',');
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param1 == null) {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L34;
            } else {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L34;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_97_0;
        }
    }

    static {
        field_M = new e();
        field_U = "(Including <%0>)";
    }
}
