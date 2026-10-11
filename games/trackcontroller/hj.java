/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj implements Runnable {
    static String[] field_c;
    volatile boolean field_b;
    uf field_d;
    static char[] field_f;
    volatile boolean field_e;
    volatile oa[] field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != -3968) {
          hj.a((byte) 102, -80);
          field_f = null;
          return;
        }
        field_f = null;
    }

    final static void a(byte param0, int param1) {
        hd.field_s = 3 & param1 >> 4;
        he.field_d = param1 >> 2 & 3;
        if (param0 != 100) {
          field_c = (String[]) null;
          if (hd.field_s > 2) {
            hd.field_s = 2;
          }
          fj.field_S = 3 & param1;
          if (he.field_d <= 2) {
            if (2 < fj.field_S) {
              fj.field_S = 2;
            }
            return;
          }
          he.field_d = 2;
        } else {
          if (hd.field_s > 2) {
            hd.field_s = 2;
          }
          fj.field_S = 3 & param1;
          if (he.field_d > 2) {
            he.field_d = 2;
          }
        }
        if (2 >= fj.field_S) {
          return;
        }
        fj.field_S = 2;
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        oa var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        String var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        this.field_e = true;
        try {
          try {
            while (!this.field_b) {
              for (var1_int = 0; 2 > var1_int; var1_int++) {
                var2 = this.field_a[var1_int];
                if (var2 != null) {
                  var2.b();
                }
              }
              wl.a(10L, false);
              f.a((Object) null, (byte) -127, this.field_d);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var5 = (String) null;
            hb.a((Throwable) ((Object) var1), 0, (String) null);
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_e = false;
          throw hj.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_e = false;
    }

    final static byte a(char param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime1Lifetime1;
        int var2Lifetime1Lifetime2;
        var3 = TrackController.field_F ? 1 : 0;
        if (param1 <= -117) {
          if (param0 > 0 &&
            param0 < 128) {
            var2 = (byte)param0;
            return (byte) var2;
          }
          if (param0 >= 160 &&
            param0 <= 255) {
            var2Lifetime3 = (byte)param0;
            return (byte) var2Lifetime3;
          }
          if (param0 == 8364) {
            var2Lifetime4 = -128;
          } else {
            if (param0 == 8218) {
              var2Lifetime4 = -126;
            } else {
              if (param0 == 402) {
                var2Lifetime4 = -125;
              } else {
                if (param0 == 8222) {
                  var2Lifetime4 = -124;
                } else {
                  if (8230 != param0) {
                    if (param0 == 8224) {
                      var2Lifetime4 = -122;
                    } else {
                      if (param0 != 8225) {
                        if (param0 == 710) {
                          var2Lifetime4 = -120;
                        } else {
                          if (param0 == 8240) {
                            var2Lifetime4 = -119;
                          } else {
                            if (352 != param0) {
                              if (param0 == 8249) {
                                var2Lifetime4 = -117;
                              } else {
                                if (338 != param0) {
                                  if (param0 != 381) {
                                    if (param0 == 8216) {
                                      var2Lifetime4 = -111;
                                    } else {
                                      if (param0 != 8217) {
                                        if (8220 == param0) {
                                          var2Lifetime4 = -109;
                                        } else {
                                          if (8221 != param0) {
                                            if (param0 == 8226) {
                                              var2Lifetime4 = -107;
                                            } else {
                                              if (param0 != 8211) {
                                                if (param0 == 8212) {
                                                  var2Lifetime4 = -105;
                                                } else {
                                                  if (param0 != 732) {
                                                    if (param0 != 8482) {
                                                      if (param0 != 353) {
                                                        if (param0 == 8250) {
                                                          var2Lifetime4 = -101;
                                                        } else {
                                                          if (param0 == 339) {
                                                            var2Lifetime4 = -100;
                                                          } else {
                                                            if (382 == param0) {
                                                              var2Lifetime4 = -98;
                                                            } else {
                                                              var2Lifetime4 = (param0 == 376) ? -97 : 63;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2Lifetime4 = -102;
                                                      }
                                                    } else {
                                                      var2Lifetime4 = -103;
                                                    }
                                                  } else {
                                                    var2Lifetime4 = -104;
                                                  }
                                                }
                                              } else {
                                                var2Lifetime4 = -106;
                                              }
                                            }
                                          } else {
                                            var2Lifetime4 = -108;
                                          }
                                        }
                                      } else {
                                        var2Lifetime4 = -110;
                                      }
                                    }
                                  } else {
                                    var2Lifetime4 = -114;
                                  }
                                } else {
                                  var2Lifetime4 = -116;
                                }
                              }
                            } else {
                              var2Lifetime4 = -118;
                            }
                          }
                        }
                      } else {
                        var2Lifetime4 = -121;
                      }
                    }
                  } else {
                    var2Lifetime4 = -123;
                  }
                }
              }
            }
          }
          return (byte) var2Lifetime4;
        }
        hj.a(118);
        if (param0 > 0) {
          if (param0 < 128) {
            var2Lifetime1 = (byte)param0;
            return (byte) var2Lifetime1;
          }
          if (param0 >= 160 &&
            param0 <= 255) {
            var2Lifetime1Lifetime1 = (byte)param0;
            return (byte) var2Lifetime1Lifetime1;
          }
          if (param0 == 8364) {
            var2Lifetime1Lifetime2 = -128;
          } else {
            if (param0 == 8218) {
              var2Lifetime1Lifetime2 = -126;
            } else {
              if (param0 == 402) {
                var2Lifetime1Lifetime2 = -125;
              } else {
                if (param0 == 8222) {
                  var2Lifetime1Lifetime2 = -124;
                } else {
                  if (8230 != param0) {
                    if (param0 == 8224) {
                      var2Lifetime1Lifetime2 = -122;
                    } else {
                      if (param0 != 8225) {
                        if (param0 == 710) {
                          var2Lifetime1Lifetime2 = -120;
                        } else {
                          if (param0 == 8240) {
                            var2Lifetime1Lifetime2 = -119;
                          } else {
                            if (352 != param0) {
                              if (param0 == 8249) {
                                var2Lifetime1Lifetime2 = -117;
                              } else {
                                if (338 != param0) {
                                  if (param0 != 381) {
                                    if (param0 == 8216) {
                                      var2Lifetime1Lifetime2 = -111;
                                    } else {
                                      if (param0 != 8217) {
                                        if (8220 == param0) {
                                          var2Lifetime1Lifetime2 = -109;
                                        } else {
                                          if (8221 != param0) {
                                            if (param0 == 8226) {
                                              var2Lifetime1Lifetime2 = -107;
                                            } else {
                                              if (param0 != 8211) {
                                                if (param0 == 8212) {
                                                  var2Lifetime1Lifetime2 = -105;
                                                } else {
                                                  if (param0 != 732) {
                                                    if (param0 != 8482) {
                                                      if (param0 == 353) {
                                                        var2Lifetime1Lifetime2 = -102;
                                                      } else {
                                                        if (param0 == 8250) {
                                                          var2Lifetime1Lifetime2 = -101;
                                                        } else {
                                                          if (param0 == 339) {
                                                            var2Lifetime1Lifetime2 = -100;
                                                          } else {
                                                            if (382 == param0) {
                                                              var2Lifetime1Lifetime2 = -98;
                                                            } else {
                                                              if (param0 == 376) {
                                                                var2Lifetime1Lifetime2 = -97;
                                                              } else {
                                                                var2Lifetime1Lifetime2 = 63;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2Lifetime1Lifetime2 = -103;
                                                    }
                                                  } else {
                                                    var2Lifetime1Lifetime2 = -104;
                                                  }
                                                }
                                              } else {
                                                var2Lifetime1Lifetime2 = -106;
                                              }
                                            }
                                          } else {
                                            var2Lifetime1Lifetime2 = -108;
                                          }
                                        }
                                      } else {
                                        var2Lifetime1Lifetime2 = -110;
                                      }
                                    }
                                  } else {
                                    var2Lifetime1Lifetime2 = -114;
                                  }
                                } else {
                                  var2Lifetime1Lifetime2 = -116;
                                }
                              }
                            } else {
                              var2Lifetime1Lifetime2 = -118;
                            }
                          }
                        }
                      } else {
                        var2Lifetime1Lifetime2 = -121;
                      }
                    }
                  } else {
                    var2Lifetime1Lifetime2 = -123;
                  }
                }
              }
            }
          }
          return (byte) var2Lifetime1Lifetime2;
        }
        if (param0 < 160) {
          if (param0 == 8364) {
            var2Lifetime2 = -128;
          } else {
            if (param0 == 8218) {
              var2Lifetime2 = -126;
            } else {
              if (param0 == 402) {
                var2Lifetime2 = -125;
              } else {
                if (param0 == 8222) {
                  var2Lifetime2 = -124;
                } else {
                  if (8230 != param0) {
                    if (param0 == 8224) {
                      var2Lifetime2 = -122;
                    } else {
                      if (param0 != 8225) {
                        if (param0 == 710) {
                          var2Lifetime2 = -120;
                        } else {
                          if (param0 == 8240) {
                            var2Lifetime2 = -119;
                          } else {
                            if (352 != param0) {
                              if (param0 == 8249) {
                                var2Lifetime2 = -117;
                              } else {
                                if (338 != param0) {
                                  if (param0 != 381) {
                                    if (param0 == 8216) {
                                      var2Lifetime2 = -111;
                                    } else {
                                      if (param0 != 8217) {
                                        if (8220 == param0) {
                                          var2Lifetime2 = -109;
                                        } else {
                                          if (8221 != param0) {
                                            if (param0 == 8226) {
                                              var2Lifetime2 = -107;
                                            } else {
                                              if (param0 != 8211) {
                                                if (param0 == 8212) {
                                                  var2Lifetime2 = -105;
                                                } else {
                                                  if (param0 != 732) {
                                                    if (param0 != 8482) {
                                                      if (param0 != 353) {
                                                        if (param0 == 8250) {
                                                          var2Lifetime2 = -101;
                                                        } else {
                                                          if (param0 == 339) {
                                                            var2Lifetime2 = -100;
                                                          } else {
                                                            if (382 == param0) {
                                                              var2Lifetime2 = -98;
                                                            } else {
                                                              var2Lifetime2 = (param0 == 376) ? -97 : 63;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2Lifetime2 = -102;
                                                      }
                                                    } else {
                                                      var2Lifetime2 = -103;
                                                    }
                                                  } else {
                                                    var2Lifetime2 = -104;
                                                  }
                                                }
                                              } else {
                                                var2Lifetime2 = -106;
                                              }
                                            }
                                          } else {
                                            var2Lifetime2 = -108;
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
                              }
                            } else {
                              var2Lifetime2 = -118;
                            }
                          }
                        }
                      } else {
                        var2Lifetime2 = -121;
                      }
                    }
                  } else {
                    var2Lifetime2 = -123;
                  }
                }
              }
            }
          }
        } else {
          if (param0 <= 255) {
            var2Lifetime2 = (byte)param0;
          } else {
            if (param0 == 8364) {
              var2Lifetime2 = -128;
            } else {
              if (param0 == 8218) {
                var2Lifetime2 = -126;
              } else {
                if (param0 == 402) {
                  var2Lifetime2 = -125;
                } else {
                  if (param0 == 8222) {
                    var2Lifetime2 = -124;
                  } else {
                    if (8230 != param0) {
                      if (param0 == 8224) {
                        var2Lifetime2 = -122;
                      } else {
                        if (param0 != 8225) {
                          if (param0 == 710) {
                            var2Lifetime2 = -120;
                          } else {
                            if (param0 == 8240) {
                              var2Lifetime2 = -119;
                            } else {
                              if (352 != param0) {
                                if (param0 == 8249) {
                                  var2Lifetime2 = -117;
                                } else {
                                  if (338 != param0) {
                                    if (param0 != 381) {
                                      if (param0 == 8216) {
                                        var2Lifetime2 = -111;
                                      } else {
                                        if (param0 != 8217) {
                                          if (8220 == param0) {
                                            var2Lifetime2 = -109;
                                          } else {
                                            if (8221 != param0) {
                                              if (param0 == 8226) {
                                                var2Lifetime2 = -107;
                                              } else {
                                                if (param0 != 8211) {
                                                  if (param0 == 8212) {
                                                    var2Lifetime2 = -105;
                                                  } else {
                                                    if (param0 != 732) {
                                                      if (param0 != 8482) {
                                                        if (param0 != 353) {
                                                          if (param0 == 8250) {
                                                            var2Lifetime2 = -101;
                                                          } else {
                                                            if (param0 == 339) {
                                                              var2Lifetime2 = -100;
                                                            } else {
                                                              if (382 == param0) {
                                                                var2Lifetime2 = -98;
                                                              } else {
                                                                var2Lifetime2 = (param0 == 376) ? -97 : 63;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2Lifetime2 = -102;
                                                        }
                                                      } else {
                                                        var2Lifetime2 = -103;
                                                      }
                                                    } else {
                                                      var2Lifetime2 = -104;
                                                    }
                                                  }
                                                } else {
                                                  var2Lifetime2 = -106;
                                                }
                                              }
                                            } else {
                                              var2Lifetime2 = -108;
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
                                }
                              } else {
                                var2Lifetime2 = -118;
                              }
                            }
                          }
                        } else {
                          var2Lifetime2 = -121;
                        }
                      }
                    } else {
                      var2Lifetime2 = -123;
                    }
                  }
                }
              }
            }
          }
        }
        return (byte) var2Lifetime2;
    }

    final static ti a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = TrackController.field_F ? 1 : 0;
        ti var5 = (ti) (ea.field_s.b(2));
        while (var5 != null) {
          if (var5.field_i == param1) {
            return var5;
          }
          var5 = (ti) (ea.field_s.a(param4 + 112));
        }
        if (param4 == -102) {
          var5 = new ti();
          var5.field_l = param3;
          var5.field_k = param2;
          var5.field_i = param1;
          ea.field_s.a((byte) -105, var5);
          mc.a(false, param0, var5);
          return var5;
        }
        return (ti) null;
    }

    hj() {
        this.field_a = new oa[2];
        this.field_b = false;
        this.field_e = false;
    }

    static {
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_f = new char[]{(char)91, (char)93, (char)35};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
