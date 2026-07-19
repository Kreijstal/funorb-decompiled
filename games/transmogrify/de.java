/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static j field_d;
    static int[] field_b;
    static String[] field_c;
    static uj field_a;

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -79) {
          de.a((byte) 73);
          field_d = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static void a(oi param0, int param1, int param2) {
        hj var3 = null;
        try {
            var3 = ff.field_D;
            var3.a(false, param1);
            var3.f(6389, param2);
            var3.f(6389, 0);
            var3.f(param2 + 6387, param0.field_h);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "de.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static uj a(boolean param0, byte param1) {
        uj var2 = null;
        uj stackIn_2_0 = null;
        uj stackIn_3_0 = null;
        uj stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        uj stackIn_6_0 = null;
        uj stackIn_7_0 = null;
        uj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        uj stackOut_5_0 = null;
        uj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        uj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        uj stackOut_1_0 = null;
        uj stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        uj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var2 = new uj(true);
        if (param1 != -116) {
          L0: {
            field_b = (int[]) null;
            stackOut_5_0 = (uj) (var2);
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = (uj) ((Object) stackIn_7_0);
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (uj) ((Object) stackIn_6_0);
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_a = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            stackOut_1_0 = (uj) (var2);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (uj) ((Object) stackIn_3_0);
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (uj) ((Object) stackIn_2_0);
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_a = stackIn_4_1 != 0;
          return var2;
        }
    }

    final static byte a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 >= 0) {
          if (param1 <= 0) {
            if (param1 >= 160) {
              if (param1 > 255) {
                L0: {
                  L1: {
                    if (param1 == 8364) {
                      break L1;
                    } else {
                      L2: {
                        if (8218 != param1) {
                          break L2;
                        } else {
                          var2 = -126;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
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
                        if (param1 != 8225) {
                          break L7;
                        } else {
                          var2 = -121;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      }
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
                        if (param1 != 352) {
                          break L10;
                        } else {
                          var2 = -118;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (8249 != param1) {
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
                                    if (param1 == 8217) {
                                      break L15;
                                    } else {
                                      L16: {
                                        if (8220 == param1) {
                                          break L16;
                                        } else {
                                          L17: {
                                            if (param1 != 8221) {
                                              break L17;
                                            } else {
                                              var2 = -108;
                                              if (var3 == 0) {
                                                break L0;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          L18: {
                                            if (param1 == 8226) {
                                              break L18;
                                            } else {
                                              L19: {
                                                if (param1 == 8211) {
                                                  break L19;
                                                } else {
                                                  L20: {
                                                    if (param1 != 8212) {
                                                      break L20;
                                                    } else {
                                                      var2 = -105;
                                                      if (var3 == 0) {
                                                        break L0;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  L21: {
                                                    if (param1 != 732) {
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
                                                    if (param1 == 8482) {
                                                      break L22;
                                                    } else {
                                                      L23: {
                                                        if (353 == param1) {
                                                          break L23;
                                                        } else {
                                                          L24: {
                                                            if (param1 != 8250) {
                                                              break L24;
                                                            } else {
                                                              var2 = -101;
                                                              if (var3 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L24;
                                                              }
                                                            }
                                                          }
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
                                                            if (param1 == 382) {
                                                              break L26;
                                                            } else {
                                                              L27: {
                                                                if (param1 == 376) {
                                                                  break L27;
                                                                } else {
                                                                  var2 = 63;
                                                                  if (var3 == 0) {
                                                                    break L0;
                                                                  } else {
                                                                    break L27;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -97;
                                                              if (var3 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L26;
                                                              }
                                                            }
                                                          }
                                                          var2 = -98;
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
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  var2 = -103;
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
                                            break L16;
                                          }
                                        }
                                      }
                                      var2 = -109;
                                      if (var3 == 0) {
                                        break L0;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  var2 = -110;
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
                        break L1;
                      }
                    }
                  }
                  var2 = -128;
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
                      if (param1 == 8364) {
                        break L29;
                      } else {
                        L30: {
                          if (8218 != param1) {
                            break L30;
                          } else {
                            var2 = -126;
                            break L30;
                          }
                        }
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
                          if (param1 != 8225) {
                            break L35;
                          } else {
                            var2 = -121;
                            if (var3 == 0) {
                              break L28;
                            } else {
                              break L35;
                            }
                          }
                        }
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
                          if (param1 != 352) {
                            break L38;
                          } else {
                            var2 = -118;
                            if (var3 == 0) {
                              break L28;
                            } else {
                              break L38;
                            }
                          }
                        }
                        L39: {
                          if (8249 != param1) {
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
                                      if (param1 == 8217) {
                                        break L43;
                                      } else {
                                        L44: {
                                          if (8220 == param1) {
                                            break L44;
                                          } else {
                                            L45: {
                                              if (param1 != 8221) {
                                                break L45;
                                              } else {
                                                var2 = -108;
                                                if (var3 == 0) {
                                                  break L28;
                                                } else {
                                                  break L45;
                                                }
                                              }
                                            }
                                            L46: {
                                              if (param1 == 8226) {
                                                break L46;
                                              } else {
                                                L47: {
                                                  if (param1 == 8211) {
                                                    break L47;
                                                  } else {
                                                    L48: {
                                                      if (param1 != 8212) {
                                                        break L48;
                                                      } else {
                                                        var2 = -105;
                                                        if (var3 == 0) {
                                                          break L28;
                                                        } else {
                                                          break L48;
                                                        }
                                                      }
                                                    }
                                                    L49: {
                                                      if (param1 != 732) {
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
                                                      if (param1 == 8482) {
                                                        break L50;
                                                      } else {
                                                        L51: {
                                                          if (353 == param1) {
                                                            break L51;
                                                          } else {
                                                            L52: {
                                                              if (param1 != 8250) {
                                                                break L52;
                                                              } else {
                                                                var2 = -101;
                                                                if (var3 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L52;
                                                                }
                                                              }
                                                            }
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
                                                              if (param1 == 382) {
                                                                break L54;
                                                              } else {
                                                                L55: {
                                                                  if (param1 == 376) {
                                                                    break L55;
                                                                  } else {
                                                                    var2 = 63;
                                                                    if (var3 == 0) {
                                                                      break L28;
                                                                    } else {
                                                                      break L55;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = -97;
                                                                if (var3 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L54;
                                                                }
                                                              }
                                                            }
                                                            var2 = -98;
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
                                                          break L50;
                                                        }
                                                      }
                                                    }
                                                    var2 = -103;
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
                                              break L44;
                                            }
                                          }
                                        }
                                        var2 = -109;
                                        if (var3 == 0) {
                                          break L28;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                    var2 = -110;
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
                          break L29;
                        }
                      }
                    }
                    var2 = -128;
                    break L28;
                  }
                }
                return (byte) var2;
              }
            } else {
              L56: {
                L57: {
                  if (param1 == 8364) {
                    break L57;
                  } else {
                    L58: {
                      if (8218 != param1) {
                        break L58;
                      } else {
                        var2 = -126;
                        if (var3 == 0) {
                          break L56;
                        } else {
                          break L58;
                        }
                      }
                    }
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
                      if (param1 != 8222) {
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
                      if (param1 != 8230) {
                        break L61;
                      } else {
                        var2 = -123;
                        if (var3 == 0) {
                          break L56;
                        } else {
                          break L61;
                        }
                      }
                    }
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
                      if (param1 != 8225) {
                        break L63;
                      } else {
                        var2 = -121;
                        if (var3 == 0) {
                          break L56;
                        } else {
                          break L63;
                        }
                      }
                    }
                    L64: {
                      if (param1 != 710) {
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
                      if (param1 != 352) {
                        break L66;
                      } else {
                        var2 = -118;
                        if (var3 == 0) {
                          break L56;
                        } else {
                          break L66;
                        }
                      }
                    }
                    L67: {
                      if (8249 != param1) {
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
                                  if (param1 == 8217) {
                                    break L71;
                                  } else {
                                    L72: {
                                      if (8220 == param1) {
                                        break L72;
                                      } else {
                                        L73: {
                                          if (param1 != 8221) {
                                            break L73;
                                          } else {
                                            var2 = -108;
                                            if (var3 == 0) {
                                              break L56;
                                            } else {
                                              break L73;
                                            }
                                          }
                                        }
                                        L74: {
                                          if (param1 == 8226) {
                                            break L74;
                                          } else {
                                            L75: {
                                              if (param1 == 8211) {
                                                break L75;
                                              } else {
                                                L76: {
                                                  if (param1 != 8212) {
                                                    break L76;
                                                  } else {
                                                    var2 = -105;
                                                    if (var3 == 0) {
                                                      break L56;
                                                    } else {
                                                      break L76;
                                                    }
                                                  }
                                                }
                                                L77: {
                                                  if (param1 != 732) {
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
                                                  if (param1 == 8482) {
                                                    break L78;
                                                  } else {
                                                    L79: {
                                                      if (353 == param1) {
                                                        break L79;
                                                      } else {
                                                        L80: {
                                                          if (param1 != 8250) {
                                                            break L80;
                                                          } else {
                                                            var2 = -101;
                                                            if (var3 == 0) {
                                                              break L56;
                                                            } else {
                                                              break L80;
                                                            }
                                                          }
                                                        }
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
                                                          if (param1 == 382) {
                                                            break L82;
                                                          } else {
                                                            L83: {
                                                              if (param1 == 376) {
                                                                break L83;
                                                              } else {
                                                                var2 = 63;
                                                                if (var3 == 0) {
                                                                  break L56;
                                                                } else {
                                                                  break L83;
                                                                }
                                                              }
                                                            }
                                                            var2 = -97;
                                                            if (var3 == 0) {
                                                              break L56;
                                                            } else {
                                                              break L82;
                                                            }
                                                          }
                                                        }
                                                        var2 = -98;
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
                                                      break L78;
                                                    }
                                                  }
                                                }
                                                var2 = -103;
                                                if (var3 == 0) {
                                                  break L56;
                                                } else {
                                                  break L75;
                                                }
                                              }
                                            }
                                            var2 = -106;
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
                                          break L72;
                                        }
                                      }
                                    }
                                    var2 = -109;
                                    if (var3 == 0) {
                                      break L56;
                                    } else {
                                      break L71;
                                    }
                                  }
                                }
                                var2 = -110;
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
                      break L57;
                    }
                  }
                }
                var2 = -128;
                break L56;
              }
              return (byte) var2;
            }
          } else {
            if (128 <= param1) {
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
                  if (param1 == 8364) {
                    break L86;
                  } else {
                    L87: {
                      if (8218 != param1) {
                        break L87;
                      } else {
                        var2 = -126;
                        if (var3 == 0) {
                          break L84;
                        } else {
                          break L87;
                        }
                      }
                    }
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
                      if (param1 != 8222) {
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
                      if (param1 != 8230) {
                        break L90;
                      } else {
                        var2 = -123;
                        if (var3 == 0) {
                          break L84;
                        } else {
                          break L90;
                        }
                      }
                    }
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
                      if (param1 != 8225) {
                        break L92;
                      } else {
                        var2 = -121;
                        if (var3 == 0) {
                          break L84;
                        } else {
                          break L92;
                        }
                      }
                    }
                    L93: {
                      if (param1 != 710) {
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
                      if (param1 != 352) {
                        break L95;
                      } else {
                        var2 = -118;
                        if (var3 == 0) {
                          break L84;
                        } else {
                          break L95;
                        }
                      }
                    }
                    L96: {
                      if (8249 != param1) {
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
                                  if (param1 == 8217) {
                                    break L100;
                                  } else {
                                    L101: {
                                      if (8220 == param1) {
                                        break L101;
                                      } else {
                                        L102: {
                                          if (param1 != 8221) {
                                            break L102;
                                          } else {
                                            var2 = -108;
                                            if (var3 == 0) {
                                              break L84;
                                            } else {
                                              break L102;
                                            }
                                          }
                                        }
                                        L103: {
                                          if (param1 == 8226) {
                                            break L103;
                                          } else {
                                            L104: {
                                              if (param1 == 8211) {
                                                break L104;
                                              } else {
                                                L105: {
                                                  if (param1 != 8212) {
                                                    break L105;
                                                  } else {
                                                    var2 = -105;
                                                    if (var3 == 0) {
                                                      break L84;
                                                    } else {
                                                      break L105;
                                                    }
                                                  }
                                                }
                                                L106: {
                                                  if (param1 != 732) {
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
                                                  if (param1 == 8482) {
                                                    break L107;
                                                  } else {
                                                    L108: {
                                                      if (353 == param1) {
                                                        break L108;
                                                      } else {
                                                        L109: {
                                                          if (param1 != 8250) {
                                                            break L109;
                                                          } else {
                                                            var2 = -101;
                                                            if (var3 == 0) {
                                                              break L84;
                                                            } else {
                                                              break L109;
                                                            }
                                                          }
                                                        }
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
                                                          if (param1 == 382) {
                                                            break L111;
                                                          } else {
                                                            L112: {
                                                              if (param1 == 376) {
                                                                break L112;
                                                              } else {
                                                                var2 = 63;
                                                                if (var3 == 0) {
                                                                  break L84;
                                                                } else {
                                                                  break L112;
                                                                }
                                                              }
                                                            }
                                                            var2 = -97;
                                                            if (var3 == 0) {
                                                              break L84;
                                                            } else {
                                                              break L111;
                                                            }
                                                          }
                                                        }
                                                        var2 = -98;
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
                                                      break L107;
                                                    }
                                                  }
                                                }
                                                var2 = -103;
                                                if (var3 == 0) {
                                                  break L84;
                                                } else {
                                                  break L104;
                                                }
                                              }
                                            }
                                            var2 = -106;
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
                                          break L101;
                                        }
                                      }
                                    }
                                    var2 = -109;
                                    if (var3 == 0) {
                                      break L84;
                                    } else {
                                      break L100;
                                    }
                                  }
                                }
                                var2 = -110;
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
                      break L86;
                    }
                  }
                }
                var2 = -128;
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
                    if (param1 == 8364) {
                      break L114;
                    } else {
                      L115: {
                        if (8218 != param1) {
                          break L115;
                        } else {
                          var2 = -126;
                          break L115;
                        }
                      }
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
                        if (param1 != 8222) {
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
                        if (param1 != 8230) {
                          break L118;
                        } else {
                          var2 = -123;
                          if (var3 == 0) {
                            break L113;
                          } else {
                            break L118;
                          }
                        }
                      }
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
                        if (param1 != 8225) {
                          break L120;
                        } else {
                          var2 = -121;
                          if (var3 == 0) {
                            break L113;
                          } else {
                            break L120;
                          }
                        }
                      }
                      L121: {
                        if (param1 != 710) {
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
                        if (param1 != 352) {
                          break L123;
                        } else {
                          var2 = -118;
                          if (var3 == 0) {
                            break L113;
                          } else {
                            break L123;
                          }
                        }
                      }
                      L124: {
                        if (8249 != param1) {
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
                                    if (param1 == 8217) {
                                      break L128;
                                    } else {
                                      L129: {
                                        if (8220 == param1) {
                                          break L129;
                                        } else {
                                          L130: {
                                            if (param1 != 8221) {
                                              break L130;
                                            } else {
                                              var2 = -108;
                                              if (var3 == 0) {
                                                break L113;
                                              } else {
                                                break L130;
                                              }
                                            }
                                          }
                                          L131: {
                                            if (param1 == 8226) {
                                              break L131;
                                            } else {
                                              L132: {
                                                if (param1 == 8211) {
                                                  break L132;
                                                } else {
                                                  L133: {
                                                    if (param1 != 8212) {
                                                      break L133;
                                                    } else {
                                                      var2 = -105;
                                                      if (var3 == 0) {
                                                        break L113;
                                                      } else {
                                                        break L133;
                                                      }
                                                    }
                                                  }
                                                  L134: {
                                                    if (param1 != 732) {
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
                                                    if (param1 == 8482) {
                                                      break L135;
                                                    } else {
                                                      L136: {
                                                        if (353 == param1) {
                                                          break L136;
                                                        } else {
                                                          L137: {
                                                            if (param1 != 8250) {
                                                              break L137;
                                                            } else {
                                                              var2 = -101;
                                                              if (var3 == 0) {
                                                                break L113;
                                                              } else {
                                                                break L137;
                                                              }
                                                            }
                                                          }
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
                                                            if (param1 == 382) {
                                                              break L139;
                                                            } else {
                                                              L140: {
                                                                if (param1 == 376) {
                                                                  break L140;
                                                                } else {
                                                                  var2 = 63;
                                                                  if (var3 == 0) {
                                                                    break L113;
                                                                  } else {
                                                                    break L140;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -97;
                                                              if (var3 == 0) {
                                                                break L113;
                                                              } else {
                                                                break L139;
                                                              }
                                                            }
                                                          }
                                                          var2 = -98;
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
                                                        break L135;
                                                      }
                                                    }
                                                  }
                                                  var2 = -103;
                                                  if (var3 == 0) {
                                                    break L113;
                                                  } else {
                                                    break L132;
                                                  }
                                                }
                                              }
                                              var2 = -106;
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
                                            break L129;
                                          }
                                        }
                                      }
                                      var2 = -109;
                                      if (var3 == 0) {
                                        break L113;
                                      } else {
                                        break L128;
                                      }
                                    }
                                  }
                                  var2 = -110;
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
                        break L114;
                      }
                    }
                  }
                  var2 = -128;
                  break L113;
                }
              }
              return (byte) var2;
            }
          }
        } else {
          L141: {
            L142: {
              L143: {
                L144: {
                  field_b = (int[]) null;
                  if (param1 <= 0) {
                    break L144;
                  } else {
                    if (128 > param1) {
                      break L143;
                    } else {
                      break L144;
                    }
                  }
                }
                if (param1 < 160) {
                  break L142;
                } else {
                  if (param1 > 255) {
                    break L142;
                  } else {
                    break L143;
                  }
                }
              }
              var2 = (byte)param1;
              if (var3 == 0) {
                break L141;
              } else {
                break L142;
              }
            }
            L145: {
              if (param1 == 8364) {
                break L145;
              } else {
                L146: {
                  if (8218 != param1) {
                    break L146;
                  } else {
                    var2 = -126;
                    if (var3 == 0) {
                      break L141;
                    } else {
                      break L146;
                    }
                  }
                }
                L147: {
                  if (param1 != 402) {
                    break L147;
                  } else {
                    var2 = -125;
                    if (var3 == 0) {
                      break L141;
                    } else {
                      break L147;
                    }
                  }
                }
                L148: {
                  if (param1 != 8222) {
                    break L148;
                  } else {
                    var2 = -124;
                    if (var3 == 0) {
                      break L141;
                    } else {
                      break L148;
                    }
                  }
                }
                L149: {
                  if (param1 != 8230) {
                    break L149;
                  } else {
                    var2 = -123;
                    if (var3 == 0) {
                      break L141;
                    } else {
                      break L149;
                    }
                  }
                }
                L150: {
                  if (param1 != 8224) {
                    break L150;
                  } else {
                    var2 = -122;
                    if (var3 == 0) {
                      break L141;
                    } else {
                      break L150;
                    }
                  }
                }
                L151: {
                  if (param1 != 8225) {
                    break L151;
                  } else {
                    var2 = -121;
                    if (var3 == 0) {
                      break L141;
                    } else {
                      break L151;
                    }
                  }
                }
                L152: {
                  if (param1 != 710) {
                    break L152;
                  } else {
                    var2 = -120;
                    if (var3 == 0) {
                      break L141;
                    } else {
                      break L152;
                    }
                  }
                }
                L153: {
                  if (param1 != 8240) {
                    break L153;
                  } else {
                    var2 = -119;
                    if (var3 == 0) {
                      break L141;
                    } else {
                      break L153;
                    }
                  }
                }
                L154: {
                  if (param1 != 352) {
                    break L154;
                  } else {
                    var2 = -118;
                    if (var3 == 0) {
                      break L141;
                    } else {
                      break L154;
                    }
                  }
                }
                L155: {
                  if (8249 != param1) {
                    break L155;
                  } else {
                    var2 = -117;
                    if (var3 == 0) {
                      break L141;
                    } else {
                      break L155;
                    }
                  }
                }
                L156: {
                  if (338 == param1) {
                    break L156;
                  } else {
                    L157: {
                      if (param1 == 381) {
                        break L157;
                      } else {
                        L158: {
                          if (param1 == 8216) {
                            break L158;
                          } else {
                            L159: {
                              if (param1 == 8217) {
                                break L159;
                              } else {
                                L160: {
                                  if (8220 == param1) {
                                    break L160;
                                  } else {
                                    L161: {
                                      if (param1 != 8221) {
                                        break L161;
                                      } else {
                                        var2 = -108;
                                        if (var3 == 0) {
                                          break L141;
                                        } else {
                                          break L161;
                                        }
                                      }
                                    }
                                    L162: {
                                      if (param1 == 8226) {
                                        break L162;
                                      } else {
                                        L163: {
                                          if (param1 == 8211) {
                                            break L163;
                                          } else {
                                            L164: {
                                              if (param1 != 8212) {
                                                break L164;
                                              } else {
                                                var2 = -105;
                                                if (var3 == 0) {
                                                  break L141;
                                                } else {
                                                  break L164;
                                                }
                                              }
                                            }
                                            L165: {
                                              if (param1 != 732) {
                                                break L165;
                                              } else {
                                                var2 = -104;
                                                if (var3 == 0) {
                                                  break L141;
                                                } else {
                                                  break L165;
                                                }
                                              }
                                            }
                                            L166: {
                                              if (param1 == 8482) {
                                                break L166;
                                              } else {
                                                L167: {
                                                  if (353 == param1) {
                                                    break L167;
                                                  } else {
                                                    L168: {
                                                      if (param1 != 8250) {
                                                        break L168;
                                                      } else {
                                                        var2 = -101;
                                                        if (var3 == 0) {
                                                          break L141;
                                                        } else {
                                                          break L168;
                                                        }
                                                      }
                                                    }
                                                    L169: {
                                                      if (param1 != 339) {
                                                        break L169;
                                                      } else {
                                                        var2 = -100;
                                                        if (var3 == 0) {
                                                          break L141;
                                                        } else {
                                                          break L169;
                                                        }
                                                      }
                                                    }
                                                    L170: {
                                                      if (param1 == 382) {
                                                        break L170;
                                                      } else {
                                                        L171: {
                                                          if (param1 == 376) {
                                                            break L171;
                                                          } else {
                                                            var2 = 63;
                                                            if (var3 == 0) {
                                                              break L141;
                                                            } else {
                                                              break L171;
                                                            }
                                                          }
                                                        }
                                                        var2 = -97;
                                                        if (var3 == 0) {
                                                          break L141;
                                                        } else {
                                                          break L170;
                                                        }
                                                      }
                                                    }
                                                    var2 = -98;
                                                    if (var3 == 0) {
                                                      break L141;
                                                    } else {
                                                      break L167;
                                                    }
                                                  }
                                                }
                                                var2 = -102;
                                                if (var3 == 0) {
                                                  break L141;
                                                } else {
                                                  break L166;
                                                }
                                              }
                                            }
                                            var2 = -103;
                                            if (var3 == 0) {
                                              break L141;
                                            } else {
                                              break L163;
                                            }
                                          }
                                        }
                                        var2 = -106;
                                        if (var3 == 0) {
                                          break L141;
                                        } else {
                                          break L162;
                                        }
                                      }
                                    }
                                    var2 = -107;
                                    if (var3 == 0) {
                                      break L141;
                                    } else {
                                      break L160;
                                    }
                                  }
                                }
                                var2 = -109;
                                if (var3 == 0) {
                                  break L141;
                                } else {
                                  break L159;
                                }
                              }
                            }
                            var2 = -110;
                            if (var3 == 0) {
                              break L141;
                            } else {
                              break L158;
                            }
                          }
                        }
                        var2 = -111;
                        if (var3 == 0) {
                          break L141;
                        } else {
                          break L157;
                        }
                      }
                    }
                    var2 = -114;
                    if (var3 == 0) {
                      break L141;
                    } else {
                      break L156;
                    }
                  }
                }
                var2 = -116;
                if (var3 == 0) {
                  break L141;
                } else {
                  break L145;
                }
              }
            }
            var2 = -128;
            break L141;
          }
          return (byte) var2;
        }
    }

    static {
        field_d = new j(2, 1000, 1000);
        field_c = new String[23];
    }
}
