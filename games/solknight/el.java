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
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l instanceof wj) {
            var3 = ((wj) ((Object) this.field_l)).a(85);
            if (var3 != null) {
              if (var3.b(-9362) == ph.field_g &&
                !param0.equals(this.field_l.field_i)) {
                stackIn_5_0 = ii.field_c;
                return stackIn_5_0;
              }
              stackIn_7_0 = var3.c(-116);
              return stackIn_7_0;
            }
          }
          if (param1) {
            var4 = (String) null;
            this.a((String) null, false);
          }
          if (param0.equals(this.field_l.field_i)) {
            return null;
          }
          stackIn_13_0 = ii.field_c;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("el.K(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final qf a(String param0, byte param1) {
        oe var3 = null;
        RuntimeException var3_ref = null;
        qf stackIn_6_0 = null;
        qf stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l instanceof wj) {
            var3 = ((wj) ((Object) this.field_l)).a(125);
            if (var3 != null &&
              var3.b(-9362) != ph.field_g) {
              stackIn_6_0 = rg.field_f;
              return stackIn_6_0;
            }
          }
          if (param1 > -109) {
            field_j = (String) null;
          }
          if (!param0.equals(this.field_l.field_i)) {
            stackIn_12_0 = rg.field_f;
          } else {
            stackIn_12_0 = ph.field_g;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("el.J(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static byte a(byte param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 < 29) {
          return (byte) 92;
        }
        if (param1 <= 0) {
          if (param1 < 160) {
            if (param1 == 8364) {
              var2 = -128;
            } else {
              if (param1 == 8218) {
                var2 = -126;
              } else {
                if (402 == param1) {
                  var2 = -125;
                } else {
                  if (param1 != 8222) {
                    if (param1 != 8230) {
                      if (param1 == 8224) {
                        var2 = -122;
                      } else {
                        if (param1 == 8225) {
                          var2 = -121;
                        } else {
                          if (param1 != 710) {
                            if (8240 != param1) {
                              if (param1 == 352) {
                                var2 = -118;
                              } else {
                                if (param1 != 8249) {
                                  if (param1 != 338) {
                                    if (param1 != 381) {
                                      if (param1 == 8216) {
                                        var2 = -111;
                                      } else {
                                        if (param1 != 8217) {
                                          if (8220 == param1) {
                                            var2 = -109;
                                          } else {
                                            if (param1 == 8221) {
                                              var2 = -108;
                                            } else {
                                              if (param1 == 8226) {
                                                var2 = -107;
                                              } else {
                                                if (param1 == 8211) {
                                                  var2 = -106;
                                                } else {
                                                  if (8212 == param1) {
                                                    var2 = -105;
                                                  } else {
                                                    if (732 == param1) {
                                                      var2 = -104;
                                                    } else {
                                                      if (param1 != 8482) {
                                                        if (param1 != 353) {
                                                          if (param1 == 8250) {
                                                            var2 = -101;
                                                          } else {
                                                            if (param1 != 339) {
                                                              if (param1 != 382) {
                                                                var2 = (param1 != 376) ? 63 : -97;
                                                              } else {
                                                                var2 = -98;
                                                              }
                                                            } else {
                                                              var2 = -100;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                        }
                                                      } else {
                                                        var2 = -103;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var2 = -110;
                                        }
                                      }
                                    } else {
                                      var2 = -114;
                                    }
                                  } else {
                                    var2 = -116;
                                  }
                                } else {
                                  var2 = -117;
                                }
                              }
                            } else {
                              var2 = -119;
                            }
                          } else {
                            var2 = -120;
                          }
                        }
                      }
                    } else {
                      var2 = -123;
                    }
                  } else {
                    var2 = -124;
                  }
                }
              }
            }
          } else {
            if (param1 <= 255) {
              var2 = (byte)param1;
            } else {
              if (param1 == 8364) {
                var2 = -128;
              } else {
                if (param1 == 8218) {
                  var2 = -126;
                } else {
                  if (402 == param1) {
                    var2 = -125;
                  } else {
                    if (param1 != 8222) {
                      if (param1 != 8230) {
                        if (param1 == 8224) {
                          var2 = -122;
                        } else {
                          if (param1 == 8225) {
                            var2 = -121;
                          } else {
                            if (param1 != 710) {
                              if (8240 != param1) {
                                if (param1 == 352) {
                                  var2 = -118;
                                } else {
                                  if (param1 != 8249) {
                                    if (param1 != 338) {
                                      if (param1 != 381) {
                                        if (param1 == 8216) {
                                          var2 = -111;
                                        } else {
                                          if (param1 != 8217) {
                                            if (8220 == param1) {
                                              var2 = -109;
                                            } else {
                                              if (param1 == 8221) {
                                                var2 = -108;
                                              } else {
                                                if (param1 == 8226) {
                                                  var2 = -107;
                                                } else {
                                                  if (param1 == 8211) {
                                                    var2 = -106;
                                                  } else {
                                                    if (8212 == param1) {
                                                      var2 = -105;
                                                    } else {
                                                      if (732 == param1) {
                                                        var2 = -104;
                                                      } else {
                                                        if (param1 != 8482) {
                                                          if (param1 != 353) {
                                                            if (param1 == 8250) {
                                                              var2 = -101;
                                                            } else {
                                                              if (param1 != 339) {
                                                                if (param1 != 382) {
                                                                  var2 = (param1 != 376) ? 63 : -97;
                                                                } else {
                                                                  var2 = -98;
                                                                }
                                                              } else {
                                                                var2 = -100;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -102;
                                                          }
                                                        } else {
                                                          var2 = -103;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var2 = -110;
                                          }
                                        }
                                      } else {
                                        var2 = -114;
                                      }
                                    } else {
                                      var2 = -116;
                                    }
                                  } else {
                                    var2 = -117;
                                  }
                                }
                              } else {
                                var2 = -119;
                              }
                            } else {
                              var2 = -120;
                            }
                          }
                        }
                      } else {
                        var2 = -123;
                      }
                    } else {
                      var2 = -124;
                    }
                  }
                }
              }
            }
          }
          return (byte) var2;
        }
        if (param1 < 128) {
          var2Lifetime1 = (byte)param1;
          return (byte) var2Lifetime1;
        }
        if (param1 < 160) {
          if (param1 == 8364) {
            var2Lifetime2 = -128;
          } else {
            if (param1 == 8218) {
              var2Lifetime2 = -126;
            } else {
              if (402 == param1) {
                var2Lifetime2 = -125;
              } else {
                if (param1 != 8222) {
                  if (param1 != 8230) {
                    if (param1 == 8224) {
                      var2Lifetime2 = -122;
                    } else {
                      if (param1 == 8225) {
                        var2Lifetime2 = -121;
                      } else {
                        if (param1 != 710) {
                          if (8240 != param1) {
                            if (param1 == 352) {
                              var2Lifetime2 = -118;
                            } else {
                              if (param1 != 8249) {
                                if (param1 != 338) {
                                  if (param1 != 381) {
                                    if (param1 == 8216) {
                                      var2Lifetime2 = -111;
                                    } else {
                                      if (param1 != 8217) {
                                        if (8220 == param1) {
                                          var2Lifetime2 = -109;
                                        } else {
                                          if (param1 == 8221) {
                                            var2Lifetime2 = -108;
                                          } else {
                                            if (param1 == 8226) {
                                              var2Lifetime2 = -107;
                                            } else {
                                              if (param1 == 8211) {
                                                var2Lifetime2 = -106;
                                              } else {
                                                if (8212 == param1) {
                                                  var2Lifetime2 = -105;
                                                } else {
                                                  if (732 == param1) {
                                                    var2Lifetime2 = -104;
                                                  } else {
                                                    if (param1 != 8482) {
                                                      if (param1 != 353) {
                                                        if (param1 == 8250) {
                                                          var2Lifetime2 = -101;
                                                        } else {
                                                          if (param1 != 339) {
                                                            if (param1 != 382) {
                                                              var2Lifetime2 = (param1 != 376) ? 63 : -97;
                                                            } else {
                                                              var2Lifetime2 = -98;
                                                            }
                                                          } else {
                                                            var2Lifetime2 = -100;
                                                          }
                                                        }
                                                      } else {
                                                        var2Lifetime2 = -102;
                                                      }
                                                    } else {
                                                      var2Lifetime2 = -103;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var2Lifetime2 = -110;
                                      }
                                    }
                                  } else {
                                    var2Lifetime2 = -114;
                                  }
                                } else {
                                  var2Lifetime2 = -116;
                                }
                              } else {
                                var2Lifetime2 = -117;
                              }
                            }
                          } else {
                            var2Lifetime2 = -119;
                          }
                        } else {
                          var2Lifetime2 = -120;
                        }
                      }
                    }
                  } else {
                    var2Lifetime2 = -123;
                  }
                } else {
                  var2Lifetime2 = -124;
                }
              }
            }
          }
          return (byte) var2Lifetime2;
        }
        if (param1 <= 255) {
          var2Lifetime3 = (byte)param1;
          return (byte) var2Lifetime3;
        }
        if (param1 == 8364) {
          var2Lifetime4 = -128;
          return (byte) var2Lifetime4;
        }
        if (param1 == 8218) {
          var2Lifetime5 = -126;
          return (byte) var2Lifetime5;
        }
        if (402 == param1) {
          var2Lifetime6 = -125;
        } else {
          if (param1 != 8222) {
            if (param1 != 8230) {
              if (param1 == 8224) {
                var2Lifetime6 = -122;
              } else {
                if (param1 == 8225) {
                  var2Lifetime6 = -121;
                } else {
                  if (param1 != 710) {
                    if (8240 != param1) {
                      if (param1 == 352) {
                        var2Lifetime6 = -118;
                      } else {
                        if (param1 != 8249) {
                          if (param1 != 338) {
                            if (param1 != 381) {
                              if (param1 == 8216) {
                                var2Lifetime6 = -111;
                              } else {
                                if (param1 != 8217) {
                                  if (8220 == param1) {
                                    var2Lifetime6 = -109;
                                  } else {
                                    if (param1 == 8221) {
                                      var2Lifetime6 = -108;
                                    } else {
                                      if (param1 == 8226) {
                                        var2Lifetime6 = -107;
                                      } else {
                                        if (param1 == 8211) {
                                          var2Lifetime6 = -106;
                                        } else {
                                          if (8212 == param1) {
                                            var2Lifetime6 = -105;
                                          } else {
                                            if (732 == param1) {
                                              var2Lifetime6 = -104;
                                            } else {
                                              if (param1 != 8482) {
                                                if (param1 != 353) {
                                                  if (param1 == 8250) {
                                                    var2Lifetime6 = -101;
                                                  } else {
                                                    if (param1 == 339) {
                                                      var2Lifetime6 = -100;
                                                    } else {
                                                      if (param1 == 382) {
                                                        var2Lifetime6 = -98;
                                                      } else {
                                                        if (param1 != 376) {
                                                          var2Lifetime6 = 63;
                                                        } else {
                                                          var2Lifetime6 = -97;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2Lifetime6 = -102;
                                                }
                                              } else {
                                                var2Lifetime6 = -103;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var2Lifetime6 = -110;
                                }
                              }
                            } else {
                              var2Lifetime6 = -114;
                            }
                          } else {
                            var2Lifetime6 = -116;
                          }
                        } else {
                          var2Lifetime6 = -117;
                        }
                      }
                    } else {
                      var2Lifetime6 = -119;
                    }
                  } else {
                    var2Lifetime6 = -120;
                  }
                }
              }
            } else {
              var2Lifetime6 = -123;
            }
          } else {
            var2Lifetime6 = -124;
          }
        }
        return (byte) var2Lifetime6;
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
