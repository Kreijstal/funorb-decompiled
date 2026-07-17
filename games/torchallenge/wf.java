/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static sl field_g;
    static ka field_b;
    static String[] field_e;
    static String field_a;
    static int[] field_d;
    static int[][] field_h;
    static String field_f;
    static oa field_i;
    static int[][] field_c;

    public static void a() {
        field_i = null;
        field_a = null;
        field_b = null;
        field_f = null;
        field_e = null;
        field_c = null;
        field_g = null;
        field_d = null;
        field_h = null;
    }

    final static qk a(byte param0, String param1) {
        Object var2 = null;
        qk var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        qk stackIn_15_0 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        qk stackOut_14_0 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          if (null != mh.field_e) {
            L0: {
              var7 = (CharSequence) (Object) param1;
              int discarded$6 = 21;
              var2 = (Object) (Object) il.a(var7);
              if (var2 != null) {
                break L0;
              } else {
                var2 = (Object) (Object) var7;
                break L0;
              }
            }
            L1: {
              var3 = (qk) (Object) mh.field_e.a(true, (long)((String) var2).hashCode());
              if (param0 == -123) {
                break L1;
              } else {
                var6 = null;
                qk discarded$7 = wf.a((byte) -81, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              if (var3 != null) {
                L3: {
                  var8 = (CharSequence) (Object) var3.field_F;
                  int discarded$8 = 21;
                  var4 = il.a(var8);
                  if (var4 != null) {
                    break L3;
                  } else {
                    var4 = var3.field_F;
                    break L3;
                  }
                }
                if (var4.equals(var2)) {
                  stackOut_14_0 = (qk) var3;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  var3 = (qk) (Object) mh.field_e.a((byte) 126);
                  continue L2;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_18_0 = var2;
            stackOut_18_1 = new StringBuilder().append("wf.C(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final static byte a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (param1 > 0) {
          if (param1 >= 128) {
            if (param1 >= 160) {
              L0: {
                if (param1 <= 255) {
                  var2 = (byte)param1;
                  break L0;
                } else {
                  if (param1 == 8364) {
                    var2 = -128;
                    return (byte) var2;
                  } else {
                    if (param1 != 8218) {
                      if (402 == param1) {
                        var2 = -125;
                        return (byte) var2;
                      } else {
                        if (param1 != 8222) {
                          if (param1 == 8230) {
                            var2 = -123;
                            return (byte) var2;
                          } else {
                            if (param1 != 8224) {
                              if (8225 != param1) {
                                if (param1 == 710) {
                                  var2 = -120;
                                  return (byte) var2;
                                } else {
                                  if (param1 == 8240) {
                                    var2 = -119;
                                    return (byte) var2;
                                  } else {
                                    if (param1 == 352) {
                                      var2 = -118;
                                      return (byte) var2;
                                    } else {
                                      if (param1 == 8249) {
                                        var2 = -117;
                                        return (byte) var2;
                                      } else {
                                        if (param1 != 338) {
                                          if (param1 == 381) {
                                            var2 = -114;
                                            return (byte) var2;
                                          } else {
                                            if (param1 != 8216) {
                                              if (param1 != 8217) {
                                                if (param1 != 8220) {
                                                  if (param1 != 8221) {
                                                    if (8226 == param1) {
                                                      var2 = -107;
                                                      return (byte) var2;
                                                    } else {
                                                      if (param1 == 8211) {
                                                        var2 = -106;
                                                        return (byte) var2;
                                                      } else {
                                                        if (param1 == 8212) {
                                                          var2 = -105;
                                                          return (byte) var2;
                                                        } else {
                                                          if (param1 != 732) {
                                                            if (param1 == 8482) {
                                                              var2 = -103;
                                                              return (byte) var2;
                                                            } else {
                                                              if (353 != param1) {
                                                                if (8250 != param1) {
                                                                  if (param1 == 339) {
                                                                    var2 = -100;
                                                                    return (byte) var2;
                                                                  } else {
                                                                    if (382 == param1) {
                                                                      var2 = -98;
                                                                      return (byte) var2;
                                                                    } else {
                                                                      if (param1 == 376) {
                                                                        var2 = -97;
                                                                        return (byte) var2;
                                                                      } else {
                                                                        var2 = 63;
                                                                        return (byte) var2;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var2 = -101;
                                                                  return (byte) var2;
                                                                }
                                                              } else {
                                                                var2 = -102;
                                                                return (byte) var2;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -104;
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    break L0;
                                                  }
                                                } else {
                                                  var2 = -109;
                                                  break L0;
                                                }
                                              } else {
                                                var2 = -110;
                                                break L0;
                                              }
                                            } else {
                                              var2 = -111;
                                              break L0;
                                            }
                                          }
                                        } else {
                                          var2 = -116;
                                          break L0;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var2 = -121;
                                break L0;
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
                    } else {
                      var2 = -126;
                      break L0;
                    }
                  }
                }
              }
              return (byte) var2;
            } else {
              if (param1 != 8364) {
                L1: {
                  if (param1 != 8218) {
                    if (402 != param1) {
                      if (param1 != 8222) {
                        if (param1 != 8230) {
                          if (param1 != 8224) {
                            if (8225 != param1) {
                              if (param1 != 710) {
                                if (param1 != 8240) {
                                  if (param1 != 352) {
                                    if (param1 != 8249) {
                                      if (param1 != 338) {
                                        if (param1 != 381) {
                                          if (param1 != 8216) {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (param1 != 8221) {
                                                  if (8226 != param1) {
                                                    if (param1 != 8211) {
                                                      if (param1 == 8212) {
                                                        var2 = -105;
                                                        return (byte) var2;
                                                      } else {
                                                        if (param1 != 732) {
                                                          if (param1 == 8482) {
                                                            var2 = -103;
                                                            return (byte) var2;
                                                          } else {
                                                            if (353 != param1) {
                                                              if (8250 != param1) {
                                                                if (param1 == 339) {
                                                                  var2 = -100;
                                                                  break L1;
                                                                } else {
                                                                  if (382 == param1) {
                                                                    var2 = -98;
                                                                    break L1;
                                                                  } else {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                      break L1;
                                                                    } else {
                                                                      var2 = 63;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -101;
                                                                break L1;
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L1;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L1;
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
                                                  break L1;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L1;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L1;
                                            }
                                          } else {
                                            var2 = -111;
                                            break L1;
                                          }
                                        } else {
                                          var2 = -114;
                                          return (byte) var2;
                                        }
                                      } else {
                                        var2 = -116;
                                        break L1;
                                      }
                                    } else {
                                      var2 = -117;
                                      return (byte) var2;
                                    }
                                  } else {
                                    var2 = -118;
                                    return (byte) var2;
                                  }
                                } else {
                                  var2 = -119;
                                  return (byte) var2;
                                }
                              } else {
                                var2 = -120;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -121;
                              break L1;
                            }
                          } else {
                            var2 = -122;
                            break L1;
                          }
                        } else {
                          var2 = -123;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -124;
                        break L1;
                      }
                    } else {
                      var2 = -125;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -126;
                    break L1;
                  }
                }
                return (byte) var2;
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
                L2: {
                  if (param1 != 8218) {
                    if (402 != param1) {
                      if (param1 != 8222) {
                        if (param1 != 8230) {
                          if (param1 != 8224) {
                            if (8225 != param1) {
                              if (param1 != 710) {
                                if (param1 != 8240) {
                                  if (param1 == 352) {
                                    var2 = -118;
                                    return (byte) var2;
                                  } else {
                                    if (param1 == 8249) {
                                      var2 = -117;
                                      break L2;
                                    } else {
                                      if (param1 != 338) {
                                        if (param1 == 381) {
                                          var2 = -114;
                                          break L2;
                                        } else {
                                          if (param1 != 8216) {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (param1 != 8221) {
                                                  if (8226 == param1) {
                                                    var2 = -107;
                                                    break L2;
                                                  } else {
                                                    if (param1 == 8211) {
                                                      var2 = -106;
                                                      break L2;
                                                    } else {
                                                      if (param1 == 8212) {
                                                        var2 = -105;
                                                        break L2;
                                                      } else {
                                                        if (param1 != 732) {
                                                          if (param1 == 8482) {
                                                            var2 = -103;
                                                            break L2;
                                                          } else {
                                                            if (353 != param1) {
                                                              if (8250 != param1) {
                                                                if (param1 == 339) {
                                                                  var2 = -100;
                                                                  break L2;
                                                                } else {
                                                                  if (382 == param1) {
                                                                    var2 = -98;
                                                                    break L2;
                                                                  } else {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                      break L2;
                                                                    } else {
                                                                      var2 = 63;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -101;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L2;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L2;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L2;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L2;
                                            }
                                          } else {
                                            var2 = -111;
                                            break L2;
                                          }
                                        }
                                      } else {
                                        var2 = -116;
                                        break L2;
                                      }
                                    }
                                  }
                                } else {
                                  var2 = -119;
                                  return (byte) var2;
                                }
                              } else {
                                var2 = -120;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -121;
                              break L2;
                            }
                          } else {
                            var2 = -122;
                            break L2;
                          }
                        } else {
                          var2 = -123;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -124;
                        break L2;
                      }
                    } else {
                      var2 = -125;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -126;
                    break L2;
                  }
                }
                return (byte) var2;
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
              L3: {
                if (param1 != 8218) {
                  if (402 != param1) {
                    if (param1 != 8222) {
                      if (param1 != 8230) {
                        if (param1 != 8224) {
                          if (8225 != param1) {
                            if (param1 != 710) {
                              if (param1 != 8240) {
                                if (param1 == 352) {
                                  var2 = -118;
                                  return (byte) var2;
                                } else {
                                  if (param1 == 8249) {
                                    var2 = -117;
                                    break L3;
                                  } else {
                                    if (param1 != 338) {
                                      if (param1 == 381) {
                                        var2 = -114;
                                        break L3;
                                      } else {
                                        if (param1 != 8216) {
                                          if (param1 != 8217) {
                                            if (param1 != 8220) {
                                              if (param1 != 8221) {
                                                if (8226 == param1) {
                                                  var2 = -107;
                                                  break L3;
                                                } else {
                                                  if (param1 == 8211) {
                                                    var2 = -106;
                                                    break L3;
                                                  } else {
                                                    if (param1 == 8212) {
                                                      var2 = -105;
                                                      break L3;
                                                    } else {
                                                      if (param1 != 732) {
                                                        if (param1 == 8482) {
                                                          var2 = -103;
                                                          break L3;
                                                        } else {
                                                          if (353 != param1) {
                                                            if (8250 != param1) {
                                                              if (param1 == 339) {
                                                                var2 = -100;
                                                                break L3;
                                                              } else {
                                                                if (382 == param1) {
                                                                  var2 = -98;
                                                                  break L3;
                                                                } else {
                                                                  if (param1 == 376) {
                                                                    var2 = -97;
                                                                    break L3;
                                                                  } else {
                                                                    var2 = 63;
                                                                    break L3;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -101;
                                                              break L3;
                                                            }
                                                          } else {
                                                            var2 = -102;
                                                            break L3;
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -104;
                                                        break L3;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var2 = -108;
                                                break L3;
                                              }
                                            } else {
                                              var2 = -109;
                                              break L3;
                                            }
                                          } else {
                                            var2 = -110;
                                            break L3;
                                          }
                                        } else {
                                          var2 = -111;
                                          break L3;
                                        }
                                      }
                                    } else {
                                      var2 = -116;
                                      break L3;
                                    }
                                  }
                                }
                              } else {
                                var2 = -119;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -120;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -121;
                            break L3;
                          }
                        } else {
                          var2 = -122;
                          break L3;
                        }
                      } else {
                        var2 = -123;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -124;
                      break L3;
                    }
                  } else {
                    var2 = -125;
                    return (byte) var2;
                  }
                } else {
                  var2 = -126;
                  break L3;
                }
              }
              return (byte) var2;
            } else {
              var2 = -128;
              return (byte) var2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[16];
        field_d = new int[]{0, 350};
        field_a = "Waiting for fonts";
        field_g = new sl();
        field_h = new int[][]{new int[2], new int[2]};
        field_f = "New Game";
        field_c = new int[][]{new int[2], new int[2]};
    }
}
