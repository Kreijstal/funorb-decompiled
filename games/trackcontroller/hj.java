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
        if (param0 == 100) {
          if (hd.field_s <= 2) {
            fj.field_S = 3 & param1;
            if (he.field_d <= 2) {
              if (2 < fj.field_S) {
                fj.field_S = 2;
                return;
              } else {
                return;
              }
            } else {
              he.field_d = 2;
              if (2 < fj.field_S) {
                fj.field_S = 2;
                return;
              } else {
                return;
              }
            }
          } else {
            hd.field_s = 2;
            fj.field_S = 3 & param1;
            if (he.field_d <= 2) {
              if (2 < fj.field_S) {
                fj.field_S = 2;
                return;
              } else {
                return;
              }
            } else {
              he.field_d = 2;
              if (2 < fj.field_S) {
                fj.field_S = 2;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          field_c = null;
          if (hd.field_s > 2) {
            hd.field_s = 2;
            fj.field_S = 3 & param1;
            if (he.field_d > 2) {
              he.field_d = 2;
              if (2 < fj.field_S) {
                fj.field_S = 2;
                return;
              } else {
                return;
              }
            } else {
              L0: {
                if (2 >= fj.field_S) {
                  break L0;
                } else {
                  fj.field_S = 2;
                  break L0;
                }
              }
              return;
            }
          } else {
            fj.field_S = 3 & param1;
            if (he.field_d > 2) {
              he.field_d = 2;
              if (2 >= fj.field_S) {
                return;
              } else {
                fj.field_S = 2;
                return;
              }
            } else {
              L1: {
                if (2 >= fj.field_S) {
                  break L1;
                } else {
                  fj.field_S = 2;
                  break L1;
                }
              }
              return;
            }
          }
        }
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        oa var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        ((hj) this).field_e = true;
        try {
          L0: while (true) {
            if (((hj) this).field_b) {
              ((hj) this).field_e = false;
              return;
            } else {
              var1_int = 0;
              L1: while (true) {
                if (2 <= var1_int) {
                  wl.a(10L, false);
                  f.a((Object) null, (byte) -127, ((hj) this).field_d);
                  continue L0;
                } else {
                  L2: {
                    var2 = ((hj) this).field_a[var1_int];
                    if (var2 == null) {
                      var1_int++;
                      break L2;
                    } else {
                      var2.b();
                      break L2;
                    }
                  }
                  var1_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Exception) (Object) decompiledCaughtException;
          var5 = null;
          hb.a((Throwable) (Object) var1, 0, (String) null);
          ((hj) this).field_e = false;
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((hj) this).field_e = false;
          throw hj.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    final static byte a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        if (param1 > -117) {
          hj.a(118);
          if (param0 > 0) {
            if (param0 >= 128) {
              L0: {
                if (param0 < 160) {
                  break L0;
                } else {
                  if (param0 > 255) {
                    break L0;
                  } else {
                    var2 = (byte)param0;
                    return (byte) var2;
                  }
                }
              }
              if (param0 != 8364) {
                if (param0 != 8218) {
                  if (param0 == 402) {
                    var2 = -125;
                    return (byte) var2;
                  } else {
                    if (param0 == 8222) {
                      var2 = -124;
                      return (byte) var2;
                    } else {
                      L1: {
                        if (8230 != param0) {
                          if (param0 == 8224) {
                            var2 = -122;
                            return (byte) var2;
                          } else {
                            if (param0 != 8225) {
                              if (param0 == 710) {
                                var2 = -120;
                                return (byte) var2;
                              } else {
                                if (param0 == 8240) {
                                  var2 = -119;
                                  return (byte) var2;
                                } else {
                                  if (352 != param0) {
                                    if (param0 == 8249) {
                                      var2 = -117;
                                      return (byte) var2;
                                    } else {
                                      if (338 != param0) {
                                        if (param0 != 381) {
                                          if (param0 == 8216) {
                                            var2 = -111;
                                            return (byte) var2;
                                          } else {
                                            if (param0 != 8217) {
                                              if (8220 == param0) {
                                                var2 = -109;
                                                return (byte) var2;
                                              } else {
                                                if (8221 != param0) {
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
                                                          if (param0 != 8482) {
                                                            if (param0 != 353) {
                                                              if (param0 == 8250) {
                                                                var2 = -101;
                                                                return (byte) var2;
                                                              } else {
                                                                if (param0 == 339) {
                                                                  var2 = -100;
                                                                  return (byte) var2;
                                                                } else {
                                                                  if (382 == param0) {
                                                                    var2 = -98;
                                                                    return (byte) var2;
                                                                  } else {
                                                                    if (param0 == 376) {
                                                                      var2 = -97;
                                                                      return (byte) var2;
                                                                    } else {
                                                                      var2 = 63;
                                                                      return (byte) var2;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              return (byte) var2;
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
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L1;
                                                }
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
                                      } else {
                                        var2 = -116;
                                        break L1;
                                      }
                                    }
                                  } else {
                                    var2 = -118;
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              var2 = -121;
                              break L1;
                            }
                          }
                        } else {
                          var2 = -123;
                          break L1;
                        }
                      }
                      return (byte) var2;
                    }
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
              var2 = (byte)param0;
              return (byte) var2;
            }
          } else {
            if (param0 >= 160) {
              if (param0 > 255) {
                if (param0 != 8364) {
                  if (param0 != 8218) {
                    if (param0 != 402) {
                      if (param0 != 8222) {
                        L2: {
                          if (8230 != param0) {
                            if (param0 != 8224) {
                              if (param0 != 8225) {
                                if (param0 == 710) {
                                  var2 = -120;
                                  return (byte) var2;
                                } else {
                                  if (param0 == 8240) {
                                    var2 = -119;
                                    break L2;
                                  } else {
                                    if (352 != param0) {
                                      if (param0 == 8249) {
                                        var2 = -117;
                                        break L2;
                                      } else {
                                        if (338 != param0) {
                                          if (param0 != 381) {
                                            if (param0 == 8216) {
                                              var2 = -111;
                                              break L2;
                                            } else {
                                              if (param0 != 8217) {
                                                if (8220 == param0) {
                                                  var2 = -109;
                                                  break L2;
                                                } else {
                                                  if (8221 != param0) {
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
                                                            if (param0 != 8482) {
                                                              if (param0 != 353) {
                                                                if (param0 == 8250) {
                                                                  var2 = -101;
                                                                  break L2;
                                                                } else {
                                                                  if (param0 == 339) {
                                                                    var2 = -100;
                                                                    break L2;
                                                                  } else {
                                                                    if (382 == param0) {
                                                                      var2 = -98;
                                                                      break L2;
                                                                    } else {
                                                                      if (param0 == 376) {
                                                                        var2 = -97;
                                                                        break L2;
                                                                      } else {
                                                                        var2 = 63;
                                                                        break L2;
                                                                      }
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
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    break L2;
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
                                      }
                                    } else {
                                      var2 = -118;
                                      break L2;
                                    }
                                  }
                                }
                              } else {
                                var2 = -121;
                                break L2;
                              }
                            } else {
                              var2 = -122;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -123;
                            break L2;
                          }
                        }
                        return (byte) var2;
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
                    return (byte) var2;
                  }
                } else {
                  var2 = -128;
                  return (byte) var2;
                }
              } else {
                var2 = (byte)param0;
                return (byte) var2;
              }
            } else {
              if (param0 != 8364) {
                if (param0 != 8218) {
                  if (param0 != 402) {
                    if (param0 != 8222) {
                      L3: {
                        if (8230 != param0) {
                          if (param0 != 8224) {
                            if (param0 != 8225) {
                              if (param0 == 710) {
                                var2 = -120;
                                return (byte) var2;
                              } else {
                                if (param0 == 8240) {
                                  var2 = -119;
                                  break L3;
                                } else {
                                  if (352 != param0) {
                                    if (param0 == 8249) {
                                      var2 = -117;
                                      break L3;
                                    } else {
                                      if (338 != param0) {
                                        if (param0 != 381) {
                                          if (param0 == 8216) {
                                            var2 = -111;
                                            break L3;
                                          } else {
                                            if (param0 != 8217) {
                                              if (8220 == param0) {
                                                var2 = -109;
                                                break L3;
                                              } else {
                                                if (8221 != param0) {
                                                  if (param0 == 8226) {
                                                    var2 = -107;
                                                    break L3;
                                                  } else {
                                                    if (param0 != 8211) {
                                                      if (param0 == 8212) {
                                                        var2 = -105;
                                                        break L3;
                                                      } else {
                                                        if (param0 != 732) {
                                                          if (param0 != 8482) {
                                                            if (param0 != 353) {
                                                              if (param0 == 8250) {
                                                                var2 = -101;
                                                                break L3;
                                                              } else {
                                                                if (param0 == 339) {
                                                                  var2 = -100;
                                                                  break L3;
                                                                } else {
                                                                  if (382 == param0) {
                                                                    var2 = -98;
                                                                    break L3;
                                                                  } else {
                                                                    if (param0 == 376) {
                                                                      var2 = -97;
                                                                      break L3;
                                                                    } else {
                                                                      var2 = 63;
                                                                      break L3;
                                                                    }
                                                                  }
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
                                                        } else {
                                                          var2 = -104;
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -106;
                                                      break L3;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L3;
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
                                    }
                                  } else {
                                    var2 = -118;
                                    break L3;
                                  }
                                }
                              }
                            } else {
                              var2 = -121;
                              break L3;
                            }
                          } else {
                            var2 = -122;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -123;
                          break L3;
                        }
                      }
                      return (byte) var2;
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
                  return (byte) var2;
                }
              } else {
                var2 = -128;
                return (byte) var2;
              }
            }
          }
        } else {
          L4: {
            if (param0 <= 0) {
              break L4;
            } else {
              if (param0 >= 128) {
                break L4;
              } else {
                var2 = (byte)param0;
                return (byte) var2;
              }
            }
          }
          L5: {
            if (param0 < 160) {
              break L5;
            } else {
              if (param0 > 255) {
                break L5;
              } else {
                var2 = (byte)param0;
                return (byte) var2;
              }
            }
          }
          if (param0 != 8364) {
            if (param0 != 8218) {
              if (param0 != 402) {
                if (param0 != 8222) {
                  L6: {
                    if (8230 != param0) {
                      if (param0 != 8224) {
                        if (param0 != 8225) {
                          if (param0 == 710) {
                            var2 = -120;
                            return (byte) var2;
                          } else {
                            if (param0 == 8240) {
                              var2 = -119;
                              break L6;
                            } else {
                              if (352 != param0) {
                                if (param0 == 8249) {
                                  var2 = -117;
                                  break L6;
                                } else {
                                  if (338 != param0) {
                                    if (param0 != 381) {
                                      if (param0 == 8216) {
                                        var2 = -111;
                                        break L6;
                                      } else {
                                        if (param0 != 8217) {
                                          if (8220 == param0) {
                                            var2 = -109;
                                            break L6;
                                          } else {
                                            if (8221 != param0) {
                                              if (param0 == 8226) {
                                                var2 = -107;
                                                break L6;
                                              } else {
                                                if (param0 != 8211) {
                                                  if (param0 == 8212) {
                                                    var2 = -105;
                                                    break L6;
                                                  } else {
                                                    if (param0 != 732) {
                                                      if (param0 != 8482) {
                                                        if (param0 != 353) {
                                                          if (param0 == 8250) {
                                                            var2 = -101;
                                                            break L6;
                                                          } else {
                                                            if (param0 == 339) {
                                                              var2 = -100;
                                                              break L6;
                                                            } else {
                                                              if (382 == param0) {
                                                                var2 = -98;
                                                                break L6;
                                                              } else {
                                                                if (param0 == 376) {
                                                                  var2 = -97;
                                                                  break L6;
                                                                } else {
                                                                  var2 = 63;
                                                                  break L6;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L6;
                                                        }
                                                      } else {
                                                        var2 = -103;
                                                        break L6;
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                      break L6;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -106;
                                                  break L6;
                                                }
                                              }
                                            } else {
                                              var2 = -108;
                                              break L6;
                                            }
                                          }
                                        } else {
                                          var2 = -110;
                                          break L6;
                                        }
                                      }
                                    } else {
                                      var2 = -114;
                                      break L6;
                                    }
                                  } else {
                                    var2 = -116;
                                    break L6;
                                  }
                                }
                              } else {
                                var2 = -118;
                                break L6;
                              }
                            }
                          }
                        } else {
                          var2 = -121;
                          break L6;
                        }
                      } else {
                        var2 = -122;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -123;
                      break L6;
                    }
                  }
                  return (byte) var2;
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
              return (byte) var2;
            }
          } else {
            var2 = -128;
            return (byte) var2;
          }
        }
    }

    final static ti a(int param0, int param1, int param2, int param3, byte param4) {
        ti var5 = null;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        var5 = (ti) (Object) ea.field_s.b(2);
        L0: while (true) {
          if (var5 == null) {
            var5 = new ti();
            var5.field_l = 10;
            var5.field_k = 1;
            var5.field_i = 10;
            ea.field_s.a((byte) -105, (fc) (Object) var5);
            mc.a(false, 3, var5);
            return var5;
          } else {
            if (var5.field_i != 10) {
              var5 = (ti) (Object) ea.field_s.a(10);
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    hj() {
        ((hj) this).field_a = new oa[2];
        ((hj) this).field_b = false;
        ((hj) this).field_e = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_f = new char[]{'[', ']', '#'};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
