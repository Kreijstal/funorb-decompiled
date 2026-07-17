/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rc implements Iterator {
    static int field_e;
    static boolean field_i;
    static int field_a;
    static String[] field_g;
    static String field_h;
    static String field_f;
    private pa field_d;
    private pa field_b;
    private wf field_c;

    public final boolean hasNext() {
        return ((rc) this).field_b != ((rc) this).field_c.field_a;
    }

    final static byte a(char param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        if (0 < param0) {
          if (128 <= param0) {
            if (param0 >= 160) {
              if (255 >= param0) {
                var2 = (byte)param0;
                return (byte) var2;
              } else {
                L0: {
                  if (param0 != 8364) {
                    if (param0 != 8218) {
                      if (402 != param0) {
                        if (param0 != 8222) {
                          if (param0 != 8230) {
                            if (param0 != 8224) {
                              if (8225 != param0) {
                                if (param0 != 710) {
                                  if (param0 != 8240) {
                                    if (param0 != 352) {
                                      if (param0 != 8249) {
                                        if (param0 != 338) {
                                          if (381 != param0) {
                                            if (param0 != 8216) {
                                              if (param0 != 8217) {
                                                if (8220 != param0) {
                                                  if (param0 != 8221) {
                                                    if (param0 != 8226) {
                                                      if (param0 == 8211) {
                                                        var2 = -106;
                                                        return (byte) var2;
                                                      } else {
                                                        if (param0 == 8212) {
                                                          var2 = -105;
                                                          return (byte) var2;
                                                        } else {
                                                          if (param0 != 732) {
                                                            if (param0 != 8482) {
                                                              if (353 != param0) {
                                                                if (param0 != 8250) {
                                                                  if (param0 == 339) {
                                                                    var2 = -100;
                                                                    return (byte) var2;
                                                                  } else {
                                                                    if (param0 == 382) {
                                                                      var2 = -98;
                                                                      return (byte) var2;
                                                                    } else {
                                                                      if (376 == param0) {
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
                                                      }
                                                    } else {
                                                      var2 = -107;
                                                      break L0;
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    return (byte) var2;
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
                                              return (byte) var2;
                                            }
                                          } else {
                                            var2 = -114;
                                            break L0;
                                          }
                                        } else {
                                          var2 = -116;
                                          return (byte) var2;
                                        }
                                      } else {
                                        var2 = -117;
                                        break L0;
                                      }
                                    } else {
                                      var2 = -118;
                                      break L0;
                                    }
                                  } else {
                                    var2 = -119;
                                    break L0;
                                  }
                                } else {
                                  var2 = -120;
                                  return (byte) var2;
                                }
                              } else {
                                var2 = -121;
                                return (byte) var2;
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
                    } else {
                      var2 = -126;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -128;
                    break L0;
                  }
                }
                return (byte) var2;
              }
            } else {
              L1: {
                if (param0 != 8364) {
                  if (param0 != 8218) {
                    if (402 != param0) {
                      if (param0 != 8222) {
                        if (param0 != 8230) {
                          if (param0 != 8224) {
                            if (8225 != param0) {
                              if (param0 != 710) {
                                if (param0 != 8240) {
                                  if (param0 != 352) {
                                    if (param0 != 8249) {
                                      if (param0 != 338) {
                                        if (381 != param0) {
                                          if (param0 != 8216) {
                                            if (param0 != 8217) {
                                              if (8220 != param0) {
                                                if (param0 != 8221) {
                                                  if (param0 != 8226) {
                                                    if (param0 != 8211) {
                                                      if (param0 != 8212) {
                                                        if (param0 != 732) {
                                                          if (param0 != 8482) {
                                                            if (353 != param0) {
                                                              if (param0 != 8250) {
                                                                if (param0 != 339) {
                                                                  if (param0 != 382) {
                                                                    if (376 != param0) {
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
                                                              } else {
                                                                var2 = -101;
                                                                return (byte) var2;
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
                                                      } else {
                                                        var2 = -105;
                                                        return (byte) var2;
                                                      }
                                                    } else {
                                                      var2 = -106;
                                                      return (byte) var2;
                                                    }
                                                  } else {
                                                    var2 = -107;
                                                    break L1;
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
                                            return (byte) var2;
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
                                      break L1;
                                    }
                                  } else {
                                    var2 = -118;
                                    break L1;
                                  }
                                } else {
                                  var2 = -119;
                                  break L1;
                                }
                              } else {
                                var2 = -120;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -121;
                              return (byte) var2;
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
          L2: {
            L3: {
              if (param0 < 160) {
                break L3;
              } else {
                if (255 < param0) {
                  break L3;
                } else {
                  var2 = (byte)param0;
                  break L2;
                }
              }
            }
            if (param0 != 8364) {
              if (param0 != 8218) {
                if (402 != param0) {
                  if (param0 != 8222) {
                    if (param0 != 8230) {
                      if (param0 != 8224) {
                        if (8225 != param0) {
                          if (param0 != 710) {
                            if (param0 != 8240) {
                              if (param0 != 352) {
                                if (param0 != 8249) {
                                  if (param0 != 338) {
                                    if (381 != param0) {
                                      if (param0 != 8216) {
                                        if (param0 != 8217) {
                                          if (8220 != param0) {
                                            if (param0 != 8221) {
                                              if (param0 != 8226) {
                                                if (param0 == 8211) {
                                                  var2 = -106;
                                                  return (byte) var2;
                                                } else {
                                                  if (param0 == 8212) {
                                                    var2 = -105;
                                                    break L2;
                                                  } else {
                                                    if (param0 != 732) {
                                                      if (param0 != 8482) {
                                                        if (353 != param0) {
                                                          if (param0 != 8250) {
                                                            if (param0 == 339) {
                                                              var2 = -100;
                                                              break L2;
                                                            } else {
                                                              if (param0 == 382) {
                                                                var2 = -98;
                                                                break L2;
                                                              } else {
                                                                if (376 == param0) {
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
                                              } else {
                                                var2 = -107;
                                                break L2;
                                              }
                                            } else {
                                              var2 = -108;
                                              return (byte) var2;
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
                                        return (byte) var2;
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
                                  break L2;
                                }
                              } else {
                                var2 = -118;
                                break L2;
                              }
                            } else {
                              var2 = -119;
                              break L2;
                            }
                          } else {
                            var2 = -120;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -121;
                          return (byte) var2;
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
        }
    }

    public final Object next() {
        pa var1 = ((rc) this).field_b;
        if (var1 != ((rc) this).field_c.field_a) {
            ((rc) this).field_b = var1.field_p;
        } else {
            var1 = null;
            ((rc) this).field_b = null;
        }
        ((rc) this).field_d = var1;
        return (Object) (Object) var1;
    }

    public final void remove() {
        if (!(null != ((rc) this).field_d)) {
            throw new IllegalStateException();
        }
        ((rc) this).field_d.e(-90);
        ((rc) this).field_d = null;
    }

    rc(wf param0) {
        ((rc) this).field_d = null;
        try {
            ((rc) this).field_c = param0;
            ((rc) this).field_d = null;
            ((rc) this).field_b = ((rc) this).field_c.field_a.field_p;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "rc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_f = null;
        field_h = null;
        int var1 = 0;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Return to game";
        field_i = true;
        field_h = "Cancel";
    }
}
