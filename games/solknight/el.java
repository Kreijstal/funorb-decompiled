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
        ((el) this).field_l = param1;
    }

    final String a(String param0, boolean param1) {
        oe var3 = null;
        Object var4 = null;
        if (((el) this).field_l instanceof wj) {
          var3 = ((wj) (Object) ((el) this).field_l).a(85);
          if (var3 != null) {
            if (var3.b(-9362) == ph.field_g) {
              if (param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
                return var3.c(-116);
              } else {
                return ii.field_c;
              }
            } else {
              return var3.c(-116);
            }
          } else {
            if (!param1) {
              if (param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
                return null;
              } else {
                return ii.field_c;
              }
            } else {
              var4 = null;
              String discarded$2 = ((el) this).a((String) null, false);
              if (param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
                return null;
              } else {
                return ii.field_c;
              }
            }
          }
        } else {
          if (!param1) {
            if (param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
              return null;
            } else {
              return ii.field_c;
            }
          } else {
            var4 = null;
            String discarded$3 = ((el) this).a((String) null, false);
            if (param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
              return null;
            } else {
              return ii.field_c;
            }
          }
        }
    }

    final qf a(String param0, byte param1) {
        oe var3 = null;
        qf stackIn_5_0 = null;
        qf stackIn_9_0 = null;
        qf stackIn_18_0 = null;
        qf stackIn_22_0 = null;
        qf stackIn_28_0 = null;
        qf stackIn_32_0 = null;
        qf stackOut_31_0 = null;
        qf stackOut_30_0 = null;
        qf stackOut_27_0 = null;
        qf stackOut_26_0 = null;
        qf stackOut_21_0 = null;
        qf stackOut_20_0 = null;
        qf stackOut_17_0 = null;
        qf stackOut_16_0 = null;
        qf stackOut_8_0 = null;
        qf stackOut_7_0 = null;
        qf stackOut_4_0 = null;
        qf stackOut_3_0 = null;
        if (((el) this).field_l instanceof wj) {
          var3 = ((wj) (Object) ((el) this).field_l).a(125);
          if (var3 == null) {
            if (param1 > -109) {
              L0: {
                field_j = null;
                if (!param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
                  stackOut_31_0 = rg.field_f;
                  stackIn_32_0 = stackOut_31_0;
                  break L0;
                } else {
                  stackOut_30_0 = ph.field_g;
                  stackIn_32_0 = stackOut_30_0;
                  break L0;
                }
              }
              return stackIn_32_0;
            } else {
              L1: {
                if (!param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
                  stackOut_27_0 = rg.field_f;
                  stackIn_28_0 = stackOut_27_0;
                  break L1;
                } else {
                  stackOut_26_0 = ph.field_g;
                  stackIn_28_0 = stackOut_26_0;
                  break L1;
                }
              }
              return stackIn_28_0;
            }
          } else {
            if (var3.b(-9362) == ph.field_g) {
              if (param1 <= -109) {
                L2: {
                  if (!param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
                    stackOut_21_0 = rg.field_f;
                    stackIn_22_0 = stackOut_21_0;
                    break L2;
                  } else {
                    stackOut_20_0 = ph.field_g;
                    stackIn_22_0 = stackOut_20_0;
                    break L2;
                  }
                }
                return stackIn_22_0;
              } else {
                L3: {
                  field_j = null;
                  if (!param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
                    stackOut_17_0 = rg.field_f;
                    stackIn_18_0 = stackOut_17_0;
                    break L3;
                  } else {
                    stackOut_16_0 = ph.field_g;
                    stackIn_18_0 = stackOut_16_0;
                    break L3;
                  }
                }
                return stackIn_18_0;
              }
            } else {
              return rg.field_f;
            }
          }
        } else {
          if (param1 <= -109) {
            L4: {
              if (!param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
                stackOut_8_0 = rg.field_f;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = ph.field_g;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            return stackIn_9_0;
          } else {
            L5: {
              field_j = null;
              if (!param0.equals((Object) (Object) ((el) this).field_l.field_i)) {
                stackOut_4_0 = rg.field_f;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = ph.field_g;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
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
