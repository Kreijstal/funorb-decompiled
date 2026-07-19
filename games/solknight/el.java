/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends a {
    private vg field_l;
    static ef field_p;
    static pc field_o;
    static String field_j;
    static String field_m;
    static String field_k;
    static int field_n;

    el(vg param0, vg param1) {
        super(param0);
        try {
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, boolean param1) {
        String discarded$2 = null;
        oe var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (!(this.field_l instanceof wj)) {
                break L1;
              } else {
                var3 = ((wj) ((Object) this.field_l)).a(85);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.b(-9362) != ph.field_g) {
                      break L2;
                    } else {
                      if (param0.equals(this.field_l.field_i)) {
                        break L2;
                      } else {
                        stackOut_4_0 = ii.field_c;
                        stackIn_5_0 = stackOut_4_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackOut_6_0 = var3.c(-116);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L3: {
              if (!param1) {
                break L3;
              } else {
                var4 = (String) null;
                discarded$2 = this.a((String) null, false);
                break L3;
              }
            }
            if (!param0.equals(this.field_l.field_i)) {
              stackOut_12_0 = ii.field_c;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("el.K(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final qf a(String param0, byte param1) {
        oe var3 = null;
        RuntimeException var3_ref = null;
        qf stackIn_6_0 = null;
        qf stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qf stackOut_5_0 = null;
        qf stackOut_11_0 = null;
        qf stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_l instanceof wj) {
                var3 = ((wj) ((Object) this.field_l)).a(125);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.b(-9362) != ph.field_g) {
                    stackOut_5_0 = rg.field_f;
                    stackIn_6_0 = stackOut_5_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 <= -109) {
                break L2;
              } else {
                field_j = (String) null;
                break L2;
              }
            }
            L3: {
              if (!param0.equals(this.field_l.field_i)) {
                stackOut_11_0 = rg.field_f;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = ph.field_g;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("el.J(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static byte a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 >= 29) {
          if (param1 <= 0) {
            if (param1 >= 160) {
              if (param1 <= 255) {
                var2 = (byte)param1;
                return (byte) var2;
              } else {
                L0: {
                  L1: {
                    if (param1 == 8364) {
                      break L1;
                    } else {
                      L2: {
                        if (param1 == 8218) {
                          break L2;
                        } else {
                          L3: {
                            if (402 == param1) {
                              break L3;
                            } else {
                              L4: {
                                if (param1 != 8222) {
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
                                if (param1 != 8230) {
                                  break L5;
                                } else {
                                  var2 = -123;
                                  if (var3 == 0) {
                                    break L0;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L6: {
                                if (param1 == 8224) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (param1 == 8225) {
                                      break L7;
                                    } else {
                                      L8: {
                                        if (param1 != 710) {
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
                                        if (8240 != param1) {
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
                                            if (param1 != 338) {
                                              break L12;
                                            } else {
                                              var2 = -116;
                                              if (var3 == 0) {
                                                break L0;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                          L13: {
                                            if (param1 != 381) {
                                              break L13;
                                            } else {
                                              var2 = -114;
                                              if (var3 == 0) {
                                                break L0;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          L14: {
                                            if (param1 == 8216) {
                                              break L14;
                                            } else {
                                              L15: {
                                                if (param1 != 8217) {
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
                                                if (8220 == param1) {
                                                  break L16;
                                                } else {
                                                  L17: {
                                                    if (param1 == 8221) {
                                                      break L17;
                                                    } else {
                                                      L18: {
                                                        if (param1 == 8226) {
                                                          break L18;
                                                        } else {
                                                          L19: {
                                                            if (param1 == 8211) {
                                                              break L19;
                                                            } else {
                                                              L20: {
                                                                if (8212 == param1) {
                                                                  break L20;
                                                                } else {
                                                                  L21: {
                                                                    if (732 == param1) {
                                                                      break L21;
                                                                    } else {
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
                                                                        if (param1 != 353) {
                                                                          break L23;
                                                                        } else {
                                                                          var2 = -102;
                                                                          if (var3 == 0) {
                                                                            break L0;
                                                                          } else {
                                                                            break L23;
                                                                          }
                                                                        }
                                                                      }
                                                                      L24: {
                                                                        if (param1 == 8250) {
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
                                                                        break L21;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2 = -104;
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
                                                                break L19;
                                                              }
                                                            }
                                                          }
                                                          var2 = -106;
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
                                                    break L16;
                                                  }
                                                }
                                              }
                                              var2 = -109;
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
                                    break L6;
                                  }
                                }
                              }
                              var2 = -122;
                              if (var3 == 0) {
                                break L0;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var2 = -125;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var2 = -126;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var2 = -128;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    var2 = (byte)param1;
                    break L0;
                  }
                }
                return (byte) var2;
              }
            } else {
              L28: {
                L29: {
                  if (param1 == 8364) {
                    break L29;
                  } else {
                    L30: {
                      if (param1 == 8218) {
                        break L30;
                      } else {
                        L31: {
                          if (402 == param1) {
                            break L31;
                          } else {
                            L32: {
                              if (param1 != 8222) {
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
                              if (param1 != 8230) {
                                break L33;
                              } else {
                                var2 = -123;
                                if (var3 == 0) {
                                  break L28;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            L34: {
                              if (param1 == 8224) {
                                break L34;
                              } else {
                                L35: {
                                  if (param1 == 8225) {
                                    break L35;
                                  } else {
                                    L36: {
                                      if (param1 != 710) {
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
                                      if (8240 != param1) {
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
                                          if (param1 != 338) {
                                            break L40;
                                          } else {
                                            var2 = -116;
                                            if (var3 == 0) {
                                              break L28;
                                            } else {
                                              break L40;
                                            }
                                          }
                                        }
                                        L41: {
                                          if (param1 != 381) {
                                            break L41;
                                          } else {
                                            var2 = -114;
                                            if (var3 == 0) {
                                              break L28;
                                            } else {
                                              break L41;
                                            }
                                          }
                                        }
                                        L42: {
                                          if (param1 == 8216) {
                                            break L42;
                                          } else {
                                            L43: {
                                              if (param1 != 8217) {
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
                                              if (8220 == param1) {
                                                break L44;
                                              } else {
                                                L45: {
                                                  if (param1 == 8221) {
                                                    break L45;
                                                  } else {
                                                    L46: {
                                                      if (param1 == 8226) {
                                                        break L46;
                                                      } else {
                                                        L47: {
                                                          if (param1 == 8211) {
                                                            break L47;
                                                          } else {
                                                            L48: {
                                                              if (8212 == param1) {
                                                                break L48;
                                                              } else {
                                                                L49: {
                                                                  if (732 == param1) {
                                                                    break L49;
                                                                  } else {
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
                                                                      if (param1 != 353) {
                                                                        break L51;
                                                                      } else {
                                                                        var2 = -102;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L51;
                                                                        }
                                                                      }
                                                                    }
                                                                    L52: {
                                                                      if (param1 == 8250) {
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
                                                                      break L49;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = -104;
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
                                                              break L47;
                                                            }
                                                          }
                                                        }
                                                        var2 = -106;
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
                                                  break L44;
                                                }
                                              }
                                            }
                                            var2 = -109;
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
                                  break L34;
                                }
                              }
                            }
                            var2 = -122;
                            if (var3 == 0) {
                              break L28;
                            } else {
                              break L31;
                            }
                          }
                        }
                        var2 = -125;
                        if (var3 == 0) {
                          break L28;
                        } else {
                          break L30;
                        }
                      }
                    }
                    var2 = -126;
                    if (var3 == 0) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                var2 = -128;
                if (var3 == 0) {
                  break L28;
                } else {
                  var2 = (byte)param1;
                  break L28;
                }
              }
              return (byte) var2;
            }
          } else {
            if (param1 < 128) {
              var2 = (byte)param1;
              return (byte) var2;
            } else {
              L56: {
                L57: {
                  L58: {
                    if (param1 < 160) {
                      break L58;
                    } else {
                      if (param1 <= 255) {
                        break L57;
                      } else {
                        break L58;
                      }
                    }
                  }
                  L59: {
                    if (param1 == 8364) {
                      break L59;
                    } else {
                      L60: {
                        if (param1 == 8218) {
                          break L60;
                        } else {
                          L61: {
                            if (402 == param1) {
                              break L61;
                            } else {
                              L62: {
                                if (param1 != 8222) {
                                  break L62;
                                } else {
                                  var2 = -124;
                                  if (var3 == 0) {
                                    break L56;
                                  } else {
                                    break L62;
                                  }
                                }
                              }
                              L63: {
                                if (param1 != 8230) {
                                  break L63;
                                } else {
                                  var2 = -123;
                                  if (var3 == 0) {
                                    break L56;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              L64: {
                                if (param1 == 8224) {
                                  break L64;
                                } else {
                                  L65: {
                                    if (param1 == 8225) {
                                      break L65;
                                    } else {
                                      L66: {
                                        if (param1 != 710) {
                                          break L66;
                                        } else {
                                          var2 = -120;
                                          if (var3 == 0) {
                                            break L56;
                                          } else {
                                            break L66;
                                          }
                                        }
                                      }
                                      L67: {
                                        if (8240 != param1) {
                                          break L67;
                                        } else {
                                          var2 = -119;
                                          if (var3 == 0) {
                                            break L56;
                                          } else {
                                            break L67;
                                          }
                                        }
                                      }
                                      L68: {
                                        if (param1 == 352) {
                                          break L68;
                                        } else {
                                          L69: {
                                            if (param1 != 8249) {
                                              break L69;
                                            } else {
                                              var2 = -117;
                                              if (var3 == 0) {
                                                break L56;
                                              } else {
                                                break L69;
                                              }
                                            }
                                          }
                                          L70: {
                                            if (param1 != 338) {
                                              break L70;
                                            } else {
                                              var2 = -116;
                                              if (var3 == 0) {
                                                break L56;
                                              } else {
                                                break L70;
                                              }
                                            }
                                          }
                                          L71: {
                                            if (param1 != 381) {
                                              break L71;
                                            } else {
                                              var2 = -114;
                                              if (var3 == 0) {
                                                break L56;
                                              } else {
                                                break L71;
                                              }
                                            }
                                          }
                                          L72: {
                                            if (param1 == 8216) {
                                              break L72;
                                            } else {
                                              L73: {
                                                if (param1 != 8217) {
                                                  break L73;
                                                } else {
                                                  var2 = -110;
                                                  if (var3 == 0) {
                                                    break L56;
                                                  } else {
                                                    break L73;
                                                  }
                                                }
                                              }
                                              L74: {
                                                if (8220 == param1) {
                                                  break L74;
                                                } else {
                                                  L75: {
                                                    if (param1 == 8221) {
                                                      break L75;
                                                    } else {
                                                      L76: {
                                                        if (param1 == 8226) {
                                                          break L76;
                                                        } else {
                                                          L77: {
                                                            if (param1 == 8211) {
                                                              break L77;
                                                            } else {
                                                              L78: {
                                                                if (8212 == param1) {
                                                                  break L78;
                                                                } else {
                                                                  L79: {
                                                                    if (732 == param1) {
                                                                      break L79;
                                                                    } else {
                                                                      L80: {
                                                                        if (param1 != 8482) {
                                                                          break L80;
                                                                        } else {
                                                                          var2 = -103;
                                                                          if (var3 == 0) {
                                                                            break L56;
                                                                          } else {
                                                                            break L80;
                                                                          }
                                                                        }
                                                                      }
                                                                      L81: {
                                                                        if (param1 != 353) {
                                                                          break L81;
                                                                        } else {
                                                                          var2 = -102;
                                                                          if (var3 == 0) {
                                                                            break L56;
                                                                          } else {
                                                                            break L81;
                                                                          }
                                                                        }
                                                                      }
                                                                      L82: {
                                                                        if (param1 == 8250) {
                                                                          break L82;
                                                                        } else {
                                                                          L83: {
                                                                            if (param1 != 339) {
                                                                              break L83;
                                                                            } else {
                                                                              var2 = -100;
                                                                              if (var3 == 0) {
                                                                                break L56;
                                                                              } else {
                                                                                break L83;
                                                                              }
                                                                            }
                                                                          }
                                                                          L84: {
                                                                            if (param1 != 382) {
                                                                              break L84;
                                                                            } else {
                                                                              var2 = -98;
                                                                              if (var3 == 0) {
                                                                                break L56;
                                                                              } else {
                                                                                break L84;
                                                                              }
                                                                            }
                                                                          }
                                                                          L85: {
                                                                            if (param1 != 376) {
                                                                              break L85;
                                                                            } else {
                                                                              var2 = -97;
                                                                              if (var3 == 0) {
                                                                                break L56;
                                                                              } else {
                                                                                break L85;
                                                                              }
                                                                            }
                                                                          }
                                                                          var2 = 63;
                                                                          if (var3 == 0) {
                                                                            break L56;
                                                                          } else {
                                                                            break L82;
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
                                                                  var2 = -104;
                                                                  if (var3 == 0) {
                                                                    break L56;
                                                                  } else {
                                                                    break L78;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -105;
                                                              if (var3 == 0) {
                                                                break L56;
                                                              } else {
                                                                break L77;
                                                              }
                                                            }
                                                          }
                                                          var2 = -106;
                                                          if (var3 == 0) {
                                                            break L56;
                                                          } else {
                                                            break L76;
                                                          }
                                                        }
                                                      }
                                                      var2 = -107;
                                                      if (var3 == 0) {
                                                        break L56;
                                                      } else {
                                                        break L75;
                                                      }
                                                    }
                                                  }
                                                  var2 = -108;
                                                  if (var3 == 0) {
                                                    break L56;
                                                  } else {
                                                    break L74;
                                                  }
                                                }
                                              }
                                              var2 = -109;
                                              if (var3 == 0) {
                                                break L56;
                                              } else {
                                                break L72;
                                              }
                                            }
                                          }
                                          var2 = -111;
                                          if (var3 == 0) {
                                            break L56;
                                          } else {
                                            break L68;
                                          }
                                        }
                                      }
                                      var2 = -118;
                                      if (var3 == 0) {
                                        break L56;
                                      } else {
                                        break L65;
                                      }
                                    }
                                  }
                                  var2 = -121;
                                  if (var3 == 0) {
                                    break L56;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              var2 = -122;
                              if (var3 == 0) {
                                break L56;
                              } else {
                                break L61;
                              }
                            }
                          }
                          var2 = -125;
                          if (var3 == 0) {
                            break L56;
                          } else {
                            break L60;
                          }
                        }
                      }
                      var2 = -126;
                      if (var3 == 0) {
                        break L56;
                      } else {
                        break L59;
                      }
                    }
                  }
                  var2 = -128;
                  if (var3 == 0) {
                    break L56;
                  } else {
                    break L57;
                  }
                }
                var2 = (byte)param1;
                break L56;
              }
              return (byte) var2;
            }
          }
        } else {
          return (byte) 92;
        }
    }

    public static void h(int param0) {
        field_j = null;
        field_k = null;
        field_o = null;
        field_m = null;
        if (param0 != 732) {
            return;
        }
        field_p = null;
    }

    static {
        field_p = new ef();
        field_o = new pc();
        field_m = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_j = "Email (Login):";
        field_k = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
