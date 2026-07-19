/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static int field_d;
    static ld field_a;
    static String field_b;
    static eg field_c;

    final static void a(int param0) {
        tm dupTemp$0 = null;
        tm var4 = null;
        tm dupTemp$1 = null;
        tm var5 = null;
        int var2 = 0;
        tm var1 = null;
        int var3 = MinerDisturbance.field_ab;
        while (true) {
            dupTemp$0 = (tm) ((Object) ok.field_b.e(63854));
            var4 = dupTemp$0;
            var1 = var4;
            if (null == dupTemp$0) {
                break;
            }
            ke.field_X[var4.field_s] = false;
        }
        while (true) {
            dupTemp$1 = (tm) ((Object) ec.field_c.e(63854));
            var5 = dupTemp$1;
            var1 = var5;
            if (null == dupTemp$1) {
                break;
            }
            ke.field_X[var5.field_s] = false;
        }
        if (param0 > -16) {
            return;
        }
        try {
            for (var2 = 0; -36 < (var2 ^ -1); var2++) {
                ke.field_X[var2] = false;
            }
            jn.a(0);
            ja.field_u = 150;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "kj.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != -22156) {
            field_b = (String) null;
            pj.field_b = param0 ^ -1422590333;
            return;
        }
        pj.field_b = param0 ^ -1422590333;
    }

    final static void a(byte param0) {
        if (param0 != -123) {
            return;
        }
        mk.a(false, aa.field_e, 0);
    }

    final static boolean b(int param0) {
        L0: {
          if (-1 != rj.field_d) {
            break L0;
          } else {
            if (!ta.a(0, 1)) {
              return false;
            } else {
              rj.field_d = field_a.d((byte) -54);
              field_a.field_o = 0;
              break L0;
            }
          }
        }
        if (param0 == -9319) {
          if (-2 == rj.field_d) {
            if (!ta.a(0, 2)) {
              return false;
            } else {
              rj.field_d = field_a.e(-81);
              field_a.field_o = 0;
              return ta.a(0, rj.field_d);
            }
          } else {
            return ta.a(0, rj.field_d);
          }
        } else {
          field_b = (String) null;
          if (-2 == rj.field_d) {
            if (!ta.a(0, 2)) {
              return false;
            } else {
              rj.field_d = field_a.e(-81);
              field_a.field_o = 0;
              return ta.a(0, rj.field_d);
            }
          } else {
            return ta.a(0, rj.field_d);
          }
        }
    }

    public static void b(boolean param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (!param0) {
            return;
        }
        byte discarded$0 = kj.a('[', 105);
    }

    final static boolean a(boolean param0) {
        if (param0) {
            kj.a(-55);
            return qc.field_b;
        }
        return qc.field_b;
    }

    final static byte a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        if (param1 == -8251) {
          if (0 < param0) {
            if (128 <= param0) {
              if (160 <= param0) {
                if (param0 <= 255) {
                  var2 = (byte)param0;
                  return (byte) var2;
                } else {
                  if (param0 != 8364) {
                    L0: {
                      if (param0 != 8218) {
                        if (param0 != 402) {
                          if (param0 != 8222) {
                            if (param0 != 8230) {
                              if (param0 != 8224) {
                                if (param0 != 8225) {
                                  if (710 != param0) {
                                    if (8240 != param0) {
                                      if (352 == param0) {
                                        var2 = -118;
                                        return (byte) var2;
                                      } else {
                                        if (8249 != param0) {
                                          if (338 == param0) {
                                            var2 = -116;
                                            return (byte) var2;
                                          } else {
                                            if (param0 == 381) {
                                              var2 = -114;
                                              return (byte) var2;
                                            } else {
                                              if (8216 != param0) {
                                                if (8217 != param0) {
                                                  if (8220 != param0) {
                                                    if (param0 == 8221) {
                                                      var2 = -108;
                                                      return (byte) var2;
                                                    } else {
                                                      if (param0 == 8226) {
                                                        var2 = -107;
                                                        return (byte) var2;
                                                      } else {
                                                        if (param0 != 8211) {
                                                          if (param0 == 8212) {
                                                            var2 = -105;
                                                            return (byte) var2;
                                                          } else {
                                                            if (param0 != 732) {
                                                              if (param0 == 8482) {
                                                                var2 = -103;
                                                                return (byte) var2;
                                                              } else {
                                                                if (param0 != 353) {
                                                                  if (param0 == 8250) {
                                                                    var2 = -101;
                                                                    break L0;
                                                                  } else {
                                                                    if (param0 == 339) {
                                                                      var2 = -100;
                                                                      break L0;
                                                                    } else {
                                                                      if (param0 != 382) {
                                                                        if (376 != param0) {
                                                                          var2 = 63;
                                                                          break L0;
                                                                        } else {
                                                                          var2 = -97;
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
                                              } else {
                                                var2 = -111;
                                                break L0;
                                              }
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
                              return (byte) var2;
                            }
                          } else {
                            var2 = -124;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -125;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -126;
                        break L0;
                      }
                    }
                    return (byte) var2;
                  } else {
                    var2 = -128;
                    return (byte) var2;
                  }
                }
              } else {
                if (param0 != 8364) {
                  L1: {
                    if (param0 != 8218) {
                      if (param0 != 402) {
                        if (param0 != 8222) {
                          if (param0 != 8230) {
                            if (param0 != 8224) {
                              if (param0 != 8225) {
                                if (710 != param0) {
                                  if (8240 != param0) {
                                    if (352 != param0) {
                                      if (8249 != param0) {
                                        if (338 != param0) {
                                          if (param0 != 381) {
                                            if (8216 != param0) {
                                              if (8217 != param0) {
                                                if (8220 != param0) {
                                                  if (param0 != 8221) {
                                                    if (param0 != 8226) {
                                                      if (param0 != 8211) {
                                                        if (param0 != 8212) {
                                                          if (param0 != 732) {
                                                            if (param0 == 8482) {
                                                              var2 = -103;
                                                              return (byte) var2;
                                                            } else {
                                                              if (param0 != 353) {
                                                                if (param0 == 8250) {
                                                                  var2 = -101;
                                                                  break L1;
                                                                } else {
                                                                  if (param0 == 339) {
                                                                    var2 = -100;
                                                                    break L1;
                                                                  } else {
                                                                    if (param0 != 382) {
                                                                      if (376 != param0) {
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
                                                                  }
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
                                                        } else {
                                                          var2 = -105;
                                                          return (byte) var2;
                                                        }
                                                      } else {
                                                        var2 = -106;
                                                        break L1;
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
                                          return (byte) var2;
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
                            return (byte) var2;
                          }
                        } else {
                          var2 = -124;
                          return (byte) var2;
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
              var2 = (byte)param0;
              return (byte) var2;
            }
          } else {
            L2: {
              L3: {
                if (160 > param0) {
                  break L3;
                } else {
                  if (param0 > 255) {
                    break L3;
                  } else {
                    var2 = (byte)param0;
                    break L2;
                  }
                }
              }
              if (param0 != 8364) {
                if (param0 != 8218) {
                  if (param0 != 402) {
                    if (param0 != 8222) {
                      if (param0 != 8230) {
                        if (param0 != 8224) {
                          if (param0 != 8225) {
                            if (710 != param0) {
                              if (8240 != param0) {
                                if (352 == param0) {
                                  var2 = -118;
                                  return (byte) var2;
                                } else {
                                  if (8249 != param0) {
                                    if (338 == param0) {
                                      var2 = -116;
                                      break L2;
                                    } else {
                                      if (param0 == 381) {
                                        var2 = -114;
                                        break L2;
                                      } else {
                                        if (8216 != param0) {
                                          if (8217 != param0) {
                                            if (8220 != param0) {
                                              if (param0 == 8221) {
                                                var2 = -108;
                                                break L2;
                                              } else {
                                                if (param0 == 8226) {
                                                  var2 = -107;
                                                  break L2;
                                                } else {
                                                  if (param0 != 8211) {
                                                    if (param0 == 8212) {
                                                      var2 = -105;
                                                      break L2;
                                                    } else {
                                                      if (param0 != 732) {
                                                        if (param0 == 8482) {
                                                          var2 = -103;
                                                          break L2;
                                                        } else {
                                                          if (param0 != 353) {
                                                            if (param0 == 8250) {
                                                              var2 = -101;
                                                              break L2;
                                                            } else {
                                                              if (param0 == 339) {
                                                                var2 = -100;
                                                                break L2;
                                                              } else {
                                                                if (param0 != 382) {
                                                                  if (376 != param0) {
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
                                                              }
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
                                                  } else {
                                                    var2 = -106;
                                                    break L2;
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
                            var2 = -121;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -122;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -123;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -124;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -125;
                    return (byte) var2;
                  }
                } else {
                  var2 = -126;
                  break L2;
                }
              } else {
                var2 = -128;
                return (byte) var2;
              }
            }
            return (byte) var2;
          }
        } else {
          return (byte) -81;
        }
    }

    static {
        field_b = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
