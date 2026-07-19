/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    int field_a;
    static String field_b;
    boolean field_f;
    boolean field_d;
    String[] field_c;
    String field_e;
    static String[] field_g;

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        if (param0 != -89) {
            e.a((byte) -126);
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        java.applet.Applet var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (!param1) {
                break L1;
              } else {
                var3 = (java.applet.Applet) null;
                e.a((java.applet.Applet) null, true);
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                var4 = (CharSequence) ((Object) var2);
                if (ji.a(-92, var4) == 0L) {
                  break L2;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("e.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    e(boolean param0) {
        this.field_d = param0 ? true : false;
    }

    final static byte a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        if (param1 == 732) {
          if (param0 > 0) {
            if (128 <= param0) {
              if (160 <= param0) {
                L0: {
                  if (param0 <= 255) {
                    var2 = (byte)param0;
                    break L0;
                  } else {
                    if (8364 != param0) {
                      if (param0 == 8218) {
                        var2 = -126;
                        return (byte) var2;
                      } else {
                        if (param0 != 402) {
                          if (param0 != 8222) {
                            if (param0 != 8230) {
                              if (param0 != 8224) {
                                if (8225 != param0) {
                                  if (param0 != 710) {
                                    if (param0 == 8240) {
                                      var2 = -119;
                                      return (byte) var2;
                                    } else {
                                      if (param0 == 352) {
                                        var2 = -118;
                                        return (byte) var2;
                                      } else {
                                        if (param0 == 8249) {
                                          var2 = -117;
                                          return (byte) var2;
                                        } else {
                                          if (param0 == 338) {
                                            var2 = -116;
                                            return (byte) var2;
                                          } else {
                                            if (param0 != 381) {
                                              if (8216 != param0) {
                                                if (param0 != 8217) {
                                                  if (8220 != param0) {
                                                    if (param0 == 8221) {
                                                      var2 = -108;
                                                      return (byte) var2;
                                                    } else {
                                                      if (param0 == 8226) {
                                                        var2 = -107;
                                                        return (byte) var2;
                                                      } else {
                                                        if (8211 == param0) {
                                                          var2 = -106;
                                                          return (byte) var2;
                                                        } else {
                                                          if (param0 == 8212) {
                                                            var2 = -105;
                                                            return (byte) var2;
                                                          } else {
                                                            if (732 != param0) {
                                                              if (param0 != 8482) {
                                                                if (353 != param0) {
                                                                  if (param0 != 8250) {
                                                                    if (param0 == 339) {
                                                                      var2 = -100;
                                                                      return (byte) var2;
                                                                    } else {
                                                                      if (param0 != 382) {
                                                                        if (param0 == 376) {
                                                                          var2 = -97;
                                                                          return (byte) var2;
                                                                        } else {
                                                                          var2 = 63;
                                                                          return (byte) var2;
                                                                        }
                                                                      } else {
                                                                        var2 = -98;
                                                                        return (byte) var2;
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
                                                              } else {
                                                                var2 = -103;
                                                                return (byte) var2;
                                                              }
                                                            } else {
                                                              var2 = -104;
                                                              return (byte) var2;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -109;
                                                    return (byte) var2;
                                                  }
                                                } else {
                                                  var2 = -110;
                                                  break L0;
                                                }
                                              } else {
                                                var2 = -111;
                                                break L0;
                                              }
                                            } else {
                                              var2 = -114;
                                              break L0;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var2 = -120;
                                    break L0;
                                  }
                                } else {
                                  var2 = -121;
                                  break L0;
                                }
                              } else {
                                var2 = -122;
                                break L0;
                              }
                            } else {
                              var2 = -123;
                              break L0;
                            }
                          } else {
                            var2 = -124;
                            break L0;
                          }
                        } else {
                          var2 = -125;
                          break L0;
                        }
                      }
                    } else {
                      var2 = -128;
                      break L0;
                    }
                  }
                }
                return (byte) var2;
              } else {
                L1: {
                  if (8364 != param0) {
                    if (param0 != 8218) {
                      if (param0 != 402) {
                        if (param0 != 8222) {
                          if (param0 != 8230) {
                            if (param0 != 8224) {
                              if (8225 != param0) {
                                if (param0 != 710) {
                                  if (param0 != 8240) {
                                    if (param0 != 352) {
                                      if (param0 != 8249) {
                                        if (param0 != 338) {
                                          if (param0 != 381) {
                                            if (8216 != param0) {
                                              if (param0 != 8217) {
                                                if (8220 != param0) {
                                                  if (param0 != 8221) {
                                                    if (param0 == 8226) {
                                                      var2 = -107;
                                                      return (byte) var2;
                                                    } else {
                                                      if (8211 == param0) {
                                                        var2 = -106;
                                                        return (byte) var2;
                                                      } else {
                                                        if (param0 == 8212) {
                                                          var2 = -105;
                                                          return (byte) var2;
                                                        } else {
                                                          if (732 != param0) {
                                                            if (param0 != 8482) {
                                                              if (353 != param0) {
                                                                if (param0 != 8250) {
                                                                  if (param0 == 339) {
                                                                    var2 = -100;
                                                                    return (byte) var2;
                                                                  } else {
                                                                    if (param0 != 382) {
                                                                      if (param0 == 376) {
                                                                        var2 = -97;
                                                                        return (byte) var2;
                                                                      } else {
                                                                        var2 = 63;
                                                                        return (byte) var2;
                                                                      }
                                                                    } else {
                                                                      var2 = -98;
                                                                      break L1;
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
                                                            } else {
                                                              var2 = -103;
                                                              break L1;
                                                            }
                                                          } else {
                                                            var2 = -104;
                                                            break L1;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    return (byte) var2;
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
                                            break L1;
                                          }
                                        } else {
                                          var2 = -116;
                                          return (byte) var2;
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
                                  break L1;
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
                            break L1;
                          }
                        } else {
                          var2 = -124;
                          break L1;
                        }
                      } else {
                        var2 = -125;
                        break L1;
                      }
                    } else {
                      var2 = -126;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -128;
                    break L1;
                  }
                }
                return (byte) var2;
              }
            } else {
              var2 = (byte)param0;
              return (byte) var2;
            }
          } else {
            if (160 <= param0) {
              if (param0 > 255) {
                L2: {
                  if (8364 != param0) {
                    if (param0 != 8218) {
                      if (param0 != 402) {
                        if (param0 != 8222) {
                          if (param0 != 8230) {
                            if (param0 != 8224) {
                              if (8225 != param0) {
                                if (param0 != 710) {
                                  if (param0 != 8240) {
                                    if (param0 != 352) {
                                      if (param0 != 8249) {
                                        if (param0 != 338) {
                                          if (param0 != 381) {
                                            if (8216 != param0) {
                                              if (param0 != 8217) {
                                                if (8220 != param0) {
                                                  if (param0 == 8221) {
                                                    var2 = -108;
                                                    return (byte) var2;
                                                  } else {
                                                    if (param0 == 8226) {
                                                      var2 = -107;
                                                      break L2;
                                                    } else {
                                                      if (8211 == param0) {
                                                        var2 = -106;
                                                        break L2;
                                                      } else {
                                                        if (param0 == 8212) {
                                                          var2 = -105;
                                                          break L2;
                                                        } else {
                                                          if (732 != param0) {
                                                            if (param0 != 8482) {
                                                              if (353 != param0) {
                                                                if (param0 != 8250) {
                                                                  if (param0 == 339) {
                                                                    var2 = -100;
                                                                    break L2;
                                                                  } else {
                                                                    if (param0 != 382) {
                                                                      if (param0 == 376) {
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
                                                                } else {
                                                                  var2 = -101;
                                                                  break L2;
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
                                                      }
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
                                            } else {
                                              var2 = -111;
                                              break L2;
                                            }
                                          } else {
                                            var2 = -114;
                                            break L2;
                                          }
                                        } else {
                                          var2 = -116;
                                          return (byte) var2;
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
                                  break L2;
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
                            break L2;
                          }
                        } else {
                          var2 = -124;
                          break L2;
                        }
                      } else {
                        var2 = -125;
                        break L2;
                      }
                    } else {
                      var2 = -126;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -128;
                    break L2;
                  }
                }
                return (byte) var2;
              } else {
                var2 = (byte)param0;
                return (byte) var2;
              }
            } else {
              L3: {
                if (8364 != param0) {
                  if (param0 != 8218) {
                    if (param0 != 402) {
                      if (param0 != 8222) {
                        if (param0 != 8230) {
                          if (param0 != 8224) {
                            if (8225 != param0) {
                              if (param0 != 710) {
                                if (param0 != 8240) {
                                  if (param0 != 352) {
                                    if (param0 != 8249) {
                                      if (param0 != 338) {
                                        if (param0 != 381) {
                                          if (8216 != param0) {
                                            if (param0 != 8217) {
                                              if (8220 != param0) {
                                                if (param0 == 8221) {
                                                  var2 = -108;
                                                  return (byte) var2;
                                                } else {
                                                  if (param0 == 8226) {
                                                    var2 = -107;
                                                    break L3;
                                                  } else {
                                                    if (8211 == param0) {
                                                      var2 = -106;
                                                      break L3;
                                                    } else {
                                                      if (param0 == 8212) {
                                                        var2 = -105;
                                                        break L3;
                                                      } else {
                                                        if (732 != param0) {
                                                          if (param0 != 8482) {
                                                            if (353 != param0) {
                                                              if (param0 != 8250) {
                                                                if (param0 == 339) {
                                                                  var2 = -100;
                                                                  break L3;
                                                                } else {
                                                                  if (param0 != 382) {
                                                                    if (param0 == 376) {
                                                                      var2 = -97;
                                                                      break L3;
                                                                    } else {
                                                                      var2 = 63;
                                                                      break L3;
                                                                    }
                                                                  } else {
                                                                    var2 = -98;
                                                                    break L3;
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
                                                          } else {
                                                            var2 = -103;
                                                            break L3;
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L3;
                                                        }
                                                      }
                                                    }
                                                  }
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
                                        } else {
                                          var2 = -114;
                                          break L3;
                                        }
                                      } else {
                                        var2 = -116;
                                        return (byte) var2;
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
                                break L3;
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
                          break L3;
                        }
                      } else {
                        var2 = -124;
                        break L3;
                      }
                    } else {
                      var2 = -125;
                      break L3;
                    }
                  } else {
                    var2 = -126;
                    return (byte) var2;
                  }
                } else {
                  var2 = -128;
                  break L3;
                }
              }
              return (byte) var2;
            }
          }
        } else {
          return (byte) 29;
        }
    }

    static {
    }
}
