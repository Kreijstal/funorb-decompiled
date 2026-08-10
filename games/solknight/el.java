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
        oe var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                        stackIn_5_0 = ii.field_c;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_7_0 = var3.c(-116);
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
                this.a((String) null, false);
                break L3;
              }
            }
            if (!param0.equals(this.field_l.field_i)) {
              stackIn_13_0 = ii.field_c;
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
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("el.K(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_l instanceof wj) {
                var3 = ((wj) ((Object) this.field_l)).a(125);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.b(-9362) != ph.field_g) {
                    stackIn_6_0 = rg.field_f;
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
                stackIn_12_0 = rg.field_f;
                break L3;
              } else {
                stackIn_12_0 = ph.field_g;
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
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("el.J(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
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
        int var2;
        int var3;
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
