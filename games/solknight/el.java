/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
            ((el) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "el.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final String a(String param0, boolean param1) {
        oe var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
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
              if (!(((el) this).field_l instanceof wj)) {
                break L1;
              } else {
                var3 = ((wj) (Object) ((el) this).field_l).a(85);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.b(-9362) != ph.field_g) {
                      break L2;
                    } else {
                      if (param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
                        break L2;
                      } else {
                        stackOut_4_0 = ii.field_c;
                        stackIn_5_0 = stackOut_4_0;
                        return stackIn_5_0;
                      }
                    }
                  }
                  stackOut_6_0 = var3.c(-116);
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            L3: {
              if (!param1) {
                break L3;
              } else {
                var4 = null;
                String discarded$2 = ((el) this).a((String) null, false);
                break L3;
              }
            }
            if (!param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
              stackOut_12_0 = ii.field_c;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("el.K(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
        return stackIn_13_0;
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
              if (((el) this).field_l instanceof wj) {
                var3 = ((wj) (Object) ((el) this).field_l).a(125);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.b(-9362) != ph.field_g) {
                    stackOut_5_0 = rg.field_f;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
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
                field_j = null;
                break L2;
              }
            }
            L3: {
              if (!param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
                stackOut_11_0 = rg.field_f;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = ph.field_g;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("el.J(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    final static byte a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 >= 29) {
          if (param1 > 0) {
            if (param1 >= 128) {
              if (param1 >= 160) {
                if (param1 > 255) {
                  if (param1 != 8364) {
                    if (param1 == 8218) {
                      var2 = -126;
                      return (byte) var2;
                    } else {
                      if (402 == param1) {
                        var2 = -125;
                        return (byte) var2;
                      } else {
                        L0: {
                          if (param1 != 8222) {
                            if (param1 != 8230) {
                              if (param1 == 8224) {
                                var2 = -122;
                                return (byte) var2;
                              } else {
                                if (param1 == 8225) {
                                  var2 = -121;
                                  return (byte) var2;
                                } else {
                                  if (param1 != 710) {
                                    if (8240 != param1) {
                                      if (param1 == 352) {
                                        var2 = -118;
                                        return (byte) var2;
                                      } else {
                                        if (param1 != 8249) {
                                          if (param1 != 338) {
                                            if (param1 != 381) {
                                              if (param1 == 8216) {
                                                var2 = -111;
                                                return (byte) var2;
                                              } else {
                                                if (param1 != 8217) {
                                                  if (8220 == param1) {
                                                    var2 = -109;
                                                    return (byte) var2;
                                                  } else {
                                                    if (param1 == 8221) {
                                                      var2 = -108;
                                                      return (byte) var2;
                                                    } else {
                                                      if (param1 == 8226) {
                                                        var2 = -107;
                                                        return (byte) var2;
                                                      } else {
                                                        if (param1 == 8211) {
                                                          var2 = -106;
                                                          return (byte) var2;
                                                        } else {
                                                          if (8212 == param1) {
                                                            var2 = -105;
                                                            return (byte) var2;
                                                          } else {
                                                            if (732 == param1) {
                                                              var2 = -104;
                                                              return (byte) var2;
                                                            } else {
                                                              if (param1 != 8482) {
                                                                if (param1 != 353) {
                                                                  if (param1 == 8250) {
                                                                    var2 = -101;
                                                                    return (byte) var2;
                                                                  } else {
                                                                    if (param1 != 339) {
                                                                      if (param1 != 382) {
                                                                        if (param1 != 376) {
                                                                          var2 = 63;
                                                                          return (byte) var2;
                                                                        } else {
                                                                          var2 = -97;
                                                                          return (byte) var2;
                                                                        }
                                                                      } else {
                                                                        var2 = -98;
                                                                        return (byte) var2;
                                                                      }
                                                                    } else {
                                                                      var2 = -100;
                                                                      return (byte) var2;
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
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
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
                                          } else {
                                            var2 = -116;
                                            break L0;
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
                              }
                            } else {
                              var2 = -123;
                              break L0;
                            }
                          } else {
                            var2 = -124;
                            break L0;
                          }
                        }
                        return (byte) var2;
                      }
                    }
                  } else {
                    var2 = -128;
                    return (byte) var2;
                  }
                } else {
                  var2 = (byte)param1;
                  return (byte) var2;
                }
              } else {
                if (param1 != 8364) {
                  if (param1 != 8218) {
                    if (402 != param1) {
                      L1: {
                        if (param1 != 8222) {
                          if (param1 != 8230) {
                            if (param1 != 8224) {
                              if (param1 != 8225) {
                                if (param1 != 710) {
                                  if (8240 != param1) {
                                    if (param1 != 352) {
                                      if (param1 != 8249) {
                                        if (param1 != 338) {
                                          if (param1 != 381) {
                                            if (param1 != 8216) {
                                              if (param1 != 8217) {
                                                if (8220 != param1) {
                                                  if (param1 != 8221) {
                                                    if (param1 != 8226) {
                                                      if (param1 != 8211) {
                                                        if (8212 == param1) {
                                                          var2 = -105;
                                                          return (byte) var2;
                                                        } else {
                                                          if (732 == param1) {
                                                            var2 = -104;
                                                            break L1;
                                                          } else {
                                                            if (param1 != 8482) {
                                                              if (param1 != 353) {
                                                                if (param1 == 8250) {
                                                                  var2 = -101;
                                                                  break L1;
                                                                } else {
                                                                  if (param1 != 339) {
                                                                    if (param1 != 382) {
                                                                      if (param1 != 376) {
                                                                        var2 = 63;
                                                                        break L1;
                                                                      } else {
                                                                        var2 = -97;
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      var2 = -98;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    var2 = -100;
                                                                    break L1;
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
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -106;
                                                        return (byte) var2;
                                                      }
                                                    } else {
                                                      var2 = -107;
                                                      return (byte) var2;
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    return (byte) var2;
                                                  }
                                                } else {
                                                  var2 = -109;
                                                  return (byte) var2;
                                                }
                                              } else {
                                                var2 = -110;
                                                break L1;
                                              }
                                            } else {
                                              var2 = -111;
                                              return (byte) var2;
                                            }
                                          } else {
                                            var2 = -114;
                                            break L1;
                                          }
                                        } else {
                                          var2 = -116;
                                          break L1;
                                        }
                                      } else {
                                        var2 = -117;
                                        break L1;
                                      }
                                    } else {
                                      var2 = -118;
                                      return (byte) var2;
                                    }
                                  } else {
                                    var2 = -119;
                                    break L1;
                                  }
                                } else {
                                  var2 = -120;
                                  break L1;
                                }
                              } else {
                                var2 = -121;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -122;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -123;
                            break L1;
                          }
                        } else {
                          var2 = -124;
                          break L1;
                        }
                      }
                      return (byte) var2;
                    } else {
                      var2 = -125;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -126;
                    return (byte) var2;
                  }
                } else {
                  var2 = -128;
                  return (byte) var2;
                }
              }
            } else {
              var2 = (byte)param1;
              return (byte) var2;
            }
          } else {
            if (param1 >= 160) {
              if (param1 > 255) {
                if (param1 != 8364) {
                  if (param1 != 8218) {
                    if (402 != param1) {
                      L2: {
                        if (param1 != 8222) {
                          if (param1 != 8230) {
                            if (param1 != 8224) {
                              if (param1 != 8225) {
                                if (param1 != 710) {
                                  if (8240 != param1) {
                                    if (param1 == 352) {
                                      var2 = -118;
                                      return (byte) var2;
                                    } else {
                                      if (param1 != 8249) {
                                        if (param1 != 338) {
                                          if (param1 != 381) {
                                            if (param1 == 8216) {
                                              var2 = -111;
                                              break L2;
                                            } else {
                                              if (param1 != 8217) {
                                                if (8220 == param1) {
                                                  var2 = -109;
                                                  break L2;
                                                } else {
                                                  if (param1 == 8221) {
                                                    var2 = -108;
                                                    break L2;
                                                  } else {
                                                    if (param1 == 8226) {
                                                      var2 = -107;
                                                      break L2;
                                                    } else {
                                                      if (param1 == 8211) {
                                                        var2 = -106;
                                                        break L2;
                                                      } else {
                                                        if (8212 == param1) {
                                                          var2 = -105;
                                                          break L2;
                                                        } else {
                                                          if (732 == param1) {
                                                            var2 = -104;
                                                            break L2;
                                                          } else {
                                                            if (param1 != 8482) {
                                                              if (param1 != 353) {
                                                                if (param1 == 8250) {
                                                                  var2 = -101;
                                                                  break L2;
                                                                } else {
                                                                  if (param1 != 339) {
                                                                    if (param1 != 382) {
                                                                      if (param1 != 376) {
                                                                        var2 = 63;
                                                                        break L2;
                                                                      } else {
                                                                        var2 = -97;
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      var2 = -98;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var2 = -100;
                                                                    break L2;
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
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
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
                                        } else {
                                          var2 = -116;
                                          break L2;
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
                                var2 = -121;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -122;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -123;
                            break L2;
                          }
                        } else {
                          var2 = -124;
                          break L2;
                        }
                      }
                      return (byte) var2;
                    } else {
                      var2 = -125;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -126;
                    return (byte) var2;
                  }
                } else {
                  var2 = -128;
                  return (byte) var2;
                }
              } else {
                var2 = (byte)param1;
                return (byte) var2;
              }
            } else {
              if (param1 != 8364) {
                if (param1 != 8218) {
                  if (402 != param1) {
                    L3: {
                      if (param1 != 8222) {
                        if (param1 != 8230) {
                          if (param1 != 8224) {
                            if (param1 != 8225) {
                              if (param1 != 710) {
                                if (8240 != param1) {
                                  if (param1 == 352) {
                                    var2 = -118;
                                    return (byte) var2;
                                  } else {
                                    if (param1 != 8249) {
                                      if (param1 != 338) {
                                        if (param1 != 381) {
                                          if (param1 == 8216) {
                                            var2 = -111;
                                            break L3;
                                          } else {
                                            if (param1 != 8217) {
                                              if (8220 == param1) {
                                                var2 = -109;
                                                break L3;
                                              } else {
                                                if (param1 == 8221) {
                                                  var2 = -108;
                                                  break L3;
                                                } else {
                                                  if (param1 == 8226) {
                                                    var2 = -107;
                                                    break L3;
                                                  } else {
                                                    if (param1 == 8211) {
                                                      var2 = -106;
                                                      break L3;
                                                    } else {
                                                      if (8212 == param1) {
                                                        var2 = -105;
                                                        break L3;
                                                      } else {
                                                        if (732 == param1) {
                                                          var2 = -104;
                                                          break L3;
                                                        } else {
                                                          if (param1 != 8482) {
                                                            if (param1 != 353) {
                                                              if (param1 == 8250) {
                                                                var2 = -101;
                                                                break L3;
                                                              } else {
                                                                if (param1 != 339) {
                                                                  if (param1 != 382) {
                                                                    if (param1 != 376) {
                                                                      var2 = 63;
                                                                      break L3;
                                                                    } else {
                                                                      var2 = -97;
                                                                      break L3;
                                                                    }
                                                                  } else {
                                                                    var2 = -98;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  var2 = -100;
                                                                  break L3;
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L3;
                                                            }
                                                          } else {
                                                            var2 = -103;
                                                            break L3;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var2 = -110;
                                              break L3;
                                            }
                                          }
                                        } else {
                                          var2 = -114;
                                          break L3;
                                        }
                                      } else {
                                        var2 = -116;
                                        break L3;
                                      }
                                    } else {
                                      var2 = -117;
                                      break L3;
                                    }
                                  }
                                } else {
                                  var2 = -119;
                                  break L3;
                                }
                              } else {
                                var2 = -120;
                                break L3;
                              }
                            } else {
                              var2 = -121;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -122;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -123;
                          break L3;
                        }
                      } else {
                        var2 = -124;
                        break L3;
                      }
                    }
                    return (byte) var2;
                  } else {
                    var2 = -125;
                    return (byte) var2;
                  }
                } else {
                  var2 = -126;
                  return (byte) var2;
                }
              } else {
                var2 = -128;
                return (byte) var2;
              }
            }
          }
        } else {
          return (byte) 92;
        }
    }

    public static void h() {
        field_j = null;
        field_k = null;
        field_o = null;
        field_m = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new ef();
        field_o = new pc();
        field_m = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_j = "Email (Login):";
        field_k = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
