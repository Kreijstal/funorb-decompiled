/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static ok field_c;
    static int field_d;
    static int field_b;
    static String field_a;

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
              if (param0 > 83) {
                break L1;
              } else {
                field_d = 125;
                break L1;
              }
            }
            stackOut_2_0 = bi.a(0, param1.length, param1, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("nf.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, byte param3, o[] param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                if (-1 > (param2 ^ -1)) {
                  L2: {
                    var5_int = param4[0].field_x;
                    var6 = param4[2].field_x;
                    if (param3 <= -31) {
                      break L2;
                    } else {
                      nf.b(38);
                      break L2;
                    }
                  }
                  var7 = param4[1].field_x;
                  param4[0].e(param0, param1);
                  param4[2].e(param2 + param0 + -var6, param1);
                  ed.b(ac.field_q);
                  ed.b(var5_int + param0, param1, param0 - -param2 - var6, param4[1].field_s + param1);
                  var8 = var5_int + param0;
                  var9 = -var6 + param0 - -param2;
                  param0 = var8;
                  L3: while (true) {
                    if (param0 >= var9) {
                      ed.a(ac.field_q);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param4[1].e(param0, param1);
                      param0 = param0 + var7;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("nf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        byte discarded$0 = 0;
        if (param0 >= -120) {
            discarded$0 = nf.a(-101, ' ');
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static byte a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = wizardrun.field_H;
        if (param1 > 0) {
          if (param1 >= 128) {
            if (param1 >= 160) {
              L0: {
                if (255 < param1) {
                  if (param1 == 8364) {
                    var2 = -128;
                    break L0;
                  } else {
                    if (param1 == 8218) {
                      var2 = -126;
                      if (param0 == 26614) {
                        return (byte) var2;
                      } else {
                        nf.b(57);
                        return (byte) var2;
                      }
                    } else {
                      if (param1 == 402) {
                        var2 = -125;
                        if (param0 == 26614) {
                          return (byte) var2;
                        } else {
                          nf.b(57);
                          return (byte) var2;
                        }
                      } else {
                        if (param1 != 8222) {
                          if (8230 == param1) {
                            var2 = -123;
                            if (param0 == 26614) {
                              return (byte) var2;
                            } else {
                              nf.b(57);
                              return (byte) var2;
                            }
                          } else {
                            if (8224 != param1) {
                              if (param1 == 8225) {
                                var2 = -121;
                                if (param0 == 26614) {
                                  return (byte) var2;
                                } else {
                                  nf.b(57);
                                  return (byte) var2;
                                }
                              } else {
                                if (param1 != 710) {
                                  if (8240 != param1) {
                                    if (param1 == 352) {
                                      var2 = -118;
                                      if (param0 == 26614) {
                                        return (byte) var2;
                                      } else {
                                        nf.b(57);
                                        return (byte) var2;
                                      }
                                    } else {
                                      if (8249 != param1) {
                                        if (param1 == 338) {
                                          var2 = -116;
                                          if (param0 == 26614) {
                                            return (byte) var2;
                                          } else {
                                            nf.b(57);
                                            return (byte) var2;
                                          }
                                        } else {
                                          if (param1 != 381) {
                                            if (param1 == 8216) {
                                              var2 = -111;
                                              if (param0 == 26614) {
                                                return (byte) var2;
                                              } else {
                                                nf.b(57);
                                                return (byte) var2;
                                              }
                                            } else {
                                              if (param1 != 8217) {
                                                if (param1 != 8220) {
                                                  if (param1 == 8221) {
                                                    var2 = -108;
                                                    if (param0 == 26614) {
                                                      return (byte) var2;
                                                    } else {
                                                      nf.b(57);
                                                      return (byte) var2;
                                                    }
                                                  } else {
                                                    if (param1 != 8226) {
                                                      if (8211 != param1) {
                                                        if (param1 == 8212) {
                                                          var2 = -105;
                                                          if (param0 == 26614) {
                                                            return (byte) var2;
                                                          } else {
                                                            nf.b(57);
                                                            return (byte) var2;
                                                          }
                                                        } else {
                                                          if (param1 != 732) {
                                                            if (param1 != 8482) {
                                                              if (param1 != 353) {
                                                                if (param1 == 8250) {
                                                                  var2 = -101;
                                                                  if (param0 == 26614) {
                                                                    return (byte) var2;
                                                                  } else {
                                                                    nf.b(57);
                                                                    return (byte) var2;
                                                                  }
                                                                } else {
                                                                  if (param1 == 339) {
                                                                    var2 = -100;
                                                                    if (param0 == 26614) {
                                                                      return (byte) var2;
                                                                    } else {
                                                                      nf.b(57);
                                                                      return (byte) var2;
                                                                    }
                                                                  } else {
                                                                    if (param1 != 382) {
                                                                      if (param1 == 376) {
                                                                        var2 = -97;
                                                                        if (param0 == 26614) {
                                                                          return (byte) var2;
                                                                        } else {
                                                                          nf.b(57);
                                                                          return (byte) var2;
                                                                        }
                                                                      } else {
                                                                        var2 = 63;
                                                                        break L0;
                                                                      }
                                                                    } else {
                                                                      var2 = -98;
                                                                      break L0;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -102;
                                                                break L0;
                                                              }
                                                            } else {
                                                              var2 = -103;
                                                              break L0;
                                                            }
                                                          } else {
                                                            var2 = -104;
                                                            break L0;
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -106;
                                                        break L0;
                                                      }
                                                    } else {
                                                      var2 = -107;
                                                      break L0;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -109;
                                                  break L0;
                                                }
                                              } else {
                                                var2 = -110;
                                                break L0;
                                              }
                                            }
                                          } else {
                                            var2 = -114;
                                            break L0;
                                          }
                                        }
                                      } else {
                                        var2 = -117;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    var2 = -119;
                                    break L0;
                                  }
                                } else {
                                  var2 = -120;
                                  break L0;
                                }
                              }
                            } else {
                              var2 = -122;
                              break L0;
                            }
                          }
                        } else {
                          var2 = -124;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  var2 = (byte)param1;
                  break L0;
                }
              }
              if (param0 == 26614) {
                return (byte) var2;
              } else {
                nf.b(57);
                return (byte) var2;
              }
            } else {
              L1: {
                if (param1 == 8364) {
                  var2 = -128;
                  break L1;
                } else {
                  if (param1 == 8218) {
                    var2 = -126;
                    if (param0 == 26614) {
                      return (byte) var2;
                    } else {
                      nf.b(57);
                      return (byte) var2;
                    }
                  } else {
                    if (param1 == 402) {
                      var2 = -125;
                      if (param0 == 26614) {
                        return (byte) var2;
                      } else {
                        nf.b(57);
                        return (byte) var2;
                      }
                    } else {
                      if (param1 != 8222) {
                        if (8230 == param1) {
                          var2 = -123;
                          if (param0 == 26614) {
                            return (byte) var2;
                          } else {
                            nf.b(57);
                            return (byte) var2;
                          }
                        } else {
                          if (8224 != param1) {
                            if (param1 == 8225) {
                              var2 = -121;
                              if (param0 == 26614) {
                                return (byte) var2;
                              } else {
                                nf.b(57);
                                return (byte) var2;
                              }
                            } else {
                              if (param1 != 710) {
                                if (8240 != param1) {
                                  if (param1 == 352) {
                                    var2 = -118;
                                    if (param0 == 26614) {
                                      return (byte) var2;
                                    } else {
                                      nf.b(57);
                                      return (byte) var2;
                                    }
                                  } else {
                                    if (8249 != param1) {
                                      if (param1 == 338) {
                                        var2 = -116;
                                        if (param0 == 26614) {
                                          return (byte) var2;
                                        } else {
                                          nf.b(57);
                                          return (byte) var2;
                                        }
                                      } else {
                                        if (param1 != 381) {
                                          if (param1 == 8216) {
                                            var2 = -111;
                                            if (param0 == 26614) {
                                              return (byte) var2;
                                            } else {
                                              nf.b(57);
                                              return (byte) var2;
                                            }
                                          } else {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (param1 == 8221) {
                                                  var2 = -108;
                                                  if (param0 == 26614) {
                                                    return (byte) var2;
                                                  } else {
                                                    nf.b(57);
                                                    return (byte) var2;
                                                  }
                                                } else {
                                                  if (param1 != 8226) {
                                                    if (8211 != param1) {
                                                      if (param1 == 8212) {
                                                        var2 = -105;
                                                        if (param0 == 26614) {
                                                          return (byte) var2;
                                                        } else {
                                                          nf.b(57);
                                                          return (byte) var2;
                                                        }
                                                      } else {
                                                        if (param1 != 732) {
                                                          if (param1 != 8482) {
                                                            if (param1 != 353) {
                                                              if (param1 == 8250) {
                                                                var2 = -101;
                                                                if (param0 == 26614) {
                                                                  return (byte) var2;
                                                                } else {
                                                                  nf.b(57);
                                                                  return (byte) var2;
                                                                }
                                                              } else {
                                                                if (param1 == 339) {
                                                                  var2 = -100;
                                                                  if (param0 == 26614) {
                                                                    return (byte) var2;
                                                                  } else {
                                                                    nf.b(57);
                                                                    return (byte) var2;
                                                                  }
                                                                } else {
                                                                  if (param1 != 382) {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                      if (param0 == 26614) {
                                                                        return (byte) var2;
                                                                      } else {
                                                                        nf.b(57);
                                                                        return (byte) var2;
                                                                      }
                                                                    } else {
                                                                      var2 = 63;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    var2 = -98;
                                                                    break L1;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L1;
                                                            }
                                                          } else {
                                                            var2 = -103;
                                                            break L1;
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L1;
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -106;
                                                      break L1;
                                                    }
                                                  } else {
                                                    var2 = -107;
                                                    break L1;
                                                  }
                                                }
                                              } else {
                                                var2 = -109;
                                                break L1;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L1;
                                            }
                                          }
                                        } else {
                                          var2 = -114;
                                          break L1;
                                        }
                                      }
                                    } else {
                                      var2 = -117;
                                      break L1;
                                    }
                                  }
                                } else {
                                  var2 = -119;
                                  break L1;
                                }
                              } else {
                                var2 = -120;
                                break L1;
                              }
                            }
                          } else {
                            var2 = -122;
                            break L1;
                          }
                        }
                      } else {
                        var2 = -124;
                        break L1;
                      }
                    }
                  }
                }
              }
              if (param0 == 26614) {
                return (byte) var2;
              } else {
                nf.b(57);
                return (byte) var2;
              }
            }
          } else {
            var2 = (byte)param1;
            if (param0 == 26614) {
              return (byte) var2;
            } else {
              nf.b(57);
              return (byte) var2;
            }
          }
        } else {
          L2: {
            L3: {
              if (param1 < 160) {
                break L3;
              } else {
                if (255 < param1) {
                  break L3;
                } else {
                  var2 = (byte)param1;
                  break L2;
                }
              }
            }
            if (param1 == 8364) {
              var2 = -128;
              break L2;
            } else {
              if (param1 != 8218) {
                if (param1 != 402) {
                  if (param1 != 8222) {
                    if (8230 != param1) {
                      if (8224 != param1) {
                        if (param1 != 8225) {
                          if (param1 != 710) {
                            if (8240 != param1) {
                              if (param1 == 352) {
                                L4: {
                                  var2 = -118;
                                  if (param0 == 26614) {
                                    break L4;
                                  } else {
                                    nf.b(57);
                                    break L4;
                                  }
                                }
                                return (byte) var2;
                              } else {
                                if (8249 != param1) {
                                  if (param1 == 338) {
                                    var2 = -116;
                                    break L2;
                                  } else {
                                    if (param1 != 381) {
                                      if (param1 == 8216) {
                                        var2 = -111;
                                        break L2;
                                      } else {
                                        if (param1 != 8217) {
                                          if (param1 != 8220) {
                                            if (param1 == 8221) {
                                              var2 = -108;
                                              break L2;
                                            } else {
                                              if (param1 != 8226) {
                                                if (8211 != param1) {
                                                  if (param1 == 8212) {
                                                    var2 = -105;
                                                    break L2;
                                                  } else {
                                                    if (param1 != 732) {
                                                      if (param1 != 8482) {
                                                        if (param1 != 353) {
                                                          if (param1 == 8250) {
                                                            var2 = -101;
                                                            break L2;
                                                          } else {
                                                            if (param1 == 339) {
                                                              var2 = -100;
                                                              break L2;
                                                            } else {
                                                              if (param1 != 382) {
                                                                if (param1 == 376) {
                                                                  var2 = -97;
                                                                  break L2;
                                                                } else {
                                                                  var2 = 63;
                                                                  break L2;
                                                                }
                                                              } else {
                                                                var2 = -98;
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var2 = -103;
                                                        break L2;
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -106;
                                                  break L2;
                                                }
                                              } else {
                                                var2 = -107;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            var2 = -109;
                                            break L2;
                                          }
                                        } else {
                                          var2 = -110;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      var2 = -114;
                                      break L2;
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                  break L2;
                                }
                              }
                            } else {
                              var2 = -119;
                              break L2;
                            }
                          } else {
                            var2 = -120;
                            break L2;
                          }
                        } else {
                          L5: {
                            var2 = -121;
                            if (param0 == 26614) {
                              break L5;
                            } else {
                              nf.b(57);
                              break L5;
                            }
                          }
                          return (byte) var2;
                        }
                      } else {
                        var2 = -122;
                        break L2;
                      }
                    } else {
                      L6: {
                        var2 = -123;
                        if (param0 == 26614) {
                          break L6;
                        } else {
                          nf.b(57);
                          break L6;
                        }
                      }
                      return (byte) var2;
                    }
                  } else {
                    var2 = -124;
                    break L2;
                  }
                } else {
                  L7: {
                    var2 = -125;
                    if (param0 == 26614) {
                      break L7;
                    } else {
                      nf.b(57);
                      break L7;
                    }
                  }
                  return (byte) var2;
                }
              } else {
                L8: {
                  var2 = -126;
                  if (param0 == 26614) {
                    break L8;
                  } else {
                    nf.b(57);
                    break L8;
                  }
                }
                return (byte) var2;
              }
            }
          }
          if (param0 != 26614) {
            nf.b(57);
            return (byte) var2;
          } else {
            return (byte) var2;
          }
        }
    }

    final static void a(int param0) {
        String discarded$1 = null;
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qj var9 = null;
        int var10 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        int stackIn_40_0 = 0;
        qj stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        qj stackOut_43_0 = null;
        qj stackOut_42_0 = null;
        var10 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var1_int = pf.field_f;
              var2 = 0;
              if ((oc.field_d ^ -1) != -3) {
                break L1;
              } else {
                var3_long = -kh.field_g + d.a((byte) 63);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if ((var2 ^ -1) <= -1) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              }
            }
            L2: {
              var3 = 0;
              if (param0 > 83) {
                break L2;
              } else {
                discarded$1 = nf.a((byte) -49);
                break L2;
              }
            }
            L3: while (true) {
              if (a.field_b.length <= var3) {
                break L0;
              } else {
                L4: {
                  var4 = ec.field_g[var3];
                  if (-1 < (var4 ^ -1)) {
                    var5 = ge.field_b;
                    break L4;
                  } else {
                    if (ga.field_d.field_g != var4) {
                      var5 = jl.field_s;
                      break L4;
                    } else {
                      var5 = tc.field_i;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = a.field_b[var3];
                  if (-3 != (oc.field_d ^ -1)) {
                    break L5;
                  } else {
                    if ((var2 ^ -1) != -2) {
                      break L5;
                    } else {
                      L6: {
                        if (ke.field_t.length < lb.field_f.length) {
                          stackOut_16_0 = lb.field_f.length;
                          stackIn_17_0 = stackOut_16_0;
                          break L6;
                        } else {
                          stackOut_15_0 = ke.field_t.length;
                          stackIn_17_0 = stackOut_15_0;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_17_0;
                        if (ec.field_a.length >= f.field_b.length) {
                          stackOut_19_0 = ec.field_a.length;
                          stackIn_20_0 = stackOut_19_0;
                          break L7;
                        } else {
                          stackOut_18_0 = f.field_b.length;
                          stackIn_20_0 = stackOut_18_0;
                          break L7;
                        }
                      }
                      L8: {
                        var8 = stackIn_20_0;
                        if (-7 < (var3 ^ -1)) {
                          break L8;
                        } else {
                          if (var3 < 6 + var7) {
                            L9: {
                              if ((-var7 + ke.field_t.length + var3 - 6 ^ -1) <= -1) {
                                stackOut_25_0 = ke.field_t[-var7 + ke.field_t.length + (var3 - 6)];
                                stackIn_26_0 = stackOut_25_0;
                                break L9;
                              } else {
                                stackOut_24_0 = "";
                                stackIn_26_0 = stackOut_24_0;
                                break L9;
                              }
                            }
                            var6 = stackIn_26_0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (var7 + 7 > var3) {
                        break L5;
                      } else {
                        if (var7 + 7 + var8 > var3) {
                          L10: {
                            if (ec.field_a.length <= var3 + -7 + -var7) {
                              stackOut_32_0 = "";
                              stackIn_33_0 = stackOut_32_0;
                              break L10;
                            } else {
                              stackOut_31_0 = ec.field_a[-7 + var3 - var7];
                              stackIn_33_0 = stackOut_31_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (0 > var4) {
                    stackOut_39_0 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    break L12;
                  } else {
                    stackOut_38_0 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    break L12;
                  }
                }
                L13: {
                  var7 = sf.a(stackIn_40_0 != 0, 110, var6);
                  var8 = id.field_c - (var7 >> -846997311);
                  if (var4 < 0) {
                    break L13;
                  } else {
                    L14: {
                      if (var4 == ga.field_d.field_g) {
                        stackOut_43_0 = og.field_N;
                        stackIn_44_0 = stackOut_43_0;
                        break L14;
                      } else {
                        stackOut_42_0 = og.field_S;
                        stackIn_44_0 = stackOut_42_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_44_0;
                      var1_int = var1_int + na.field_e;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a(var1_int, (e.field_d << -359154047) + ec.field_c, (vl.field_h << -1727646975) + var7, 1, -vl.field_h + var8);
                        break L15;
                      }
                    }
                    var1_int = var1_int + e.field_d;
                    break L13;
                  }
                }
                L16: {
                  if (0 > var4) {
                    le.field_j.c(var6, var8, var1_int - -lc.field_a, var5, -1);
                    var1_int = var1_int + si.field_f;
                    break L16;
                  } else {
                    uf.field_c.c(var6, var8, var1_int - -ki.field_I, var5, -1);
                    var1_int = var1_int + (ec.field_c + na.field_e + e.field_d);
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "nf.C(" + param0 + ')');
        }
    }

    final static String a(byte param0) {
        if (fi.field_y == pl.field_E) {
            return na.field_l;
        }
        if (pl.field_E == wc.field_j) {
            return qc.field_I;
        }
        if (param0 < 121) {
            return (String) null;
        }
        if (!(we.field_c.a(true))) {
            return qc.field_I;
        }
        return rg.field_S;
    }

    static {
        field_c = new ok();
        field_d = 64;
        field_a = "Orb coins: <%0>";
    }
}
