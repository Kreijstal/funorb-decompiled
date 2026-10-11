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
        return this.field_b != this.field_c.field_a;
    }

    final static byte a(char param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        var3 = fleas.field_A ? 1 : 0;
        if (param1 != 22861) {
          return (byte) -117;
        }
        if (0 >= param0) {
          if (param0 >= 160 &&
            255 >= param0) {
            var2 = (byte)param0;
          } else {
            if (param0 != 8364) {
              if (param0 == 8218) {
                var2 = -126;
                return (byte) var2;
              }
              if (402 != param0) {
                if (param0 != 8222) {
                  if (param0 != 8230) {
                    if (param0 != 8224) {
                      if (8225 == param0) {
                        var2 = -121;
                        return (byte) var2;
                      }
                      if (param0 == 710) {
                        var2 = -120;
                        return (byte) var2;
                      }
                      if (param0 != 8240) {
                        if (param0 != 352) {
                          if (param0 != 8249) {
                            if (param0 == 338) {
                              var2 = -116;
                              return (byte) var2;
                            }
                            if (381 != param0) {
                              if (param0 == 8216) {
                                var2 = -111;
                                return (byte) var2;
                              }
                              if (param0 != 8217) {
                                if (8220 != param0) {
                                  if (param0 == 8221) {
                                    var2 = -108;
                                    return (byte) var2;
                                  }
                                  if (param0 != 8226) {
                                    if (param0 == 8211) {
                                      var2 = -106;
                                      return (byte) var2;
                                    }
                                    if (param0 == 8212) {
                                      var2 = -105;
                                    } else {
                                      if (param0 != 732) {
                                        if (param0 != 8482) {
                                          if (353 != param0) {
                                            if (param0 != 8250) {
                                              if (param0 == 339) {
                                                var2 = -100;
                                              } else {
                                                if (param0 == 382) {
                                                  var2 = -98;
                                                } else {
                                                  var2 = (376 == param0) ? -97 : 63;
                                                }
                                              }
                                            } else {
                                              var2 = -101;
                                            }
                                          } else {
                                            var2 = -102;
                                          }
                                        } else {
                                          var2 = -103;
                                        }
                                      } else {
                                        var2 = -104;
                                      }
                                    }
                                  } else {
                                    var2 = -107;
                                  }
                                } else {
                                  var2 = -109;
                                }
                              } else {
                                var2 = -110;
                              }
                            } else {
                              var2 = -114;
                            }
                          } else {
                            var2 = -117;
                          }
                        } else {
                          var2 = -118;
                        }
                      } else {
                        var2 = -119;
                      }
                    } else {
                      var2 = -122;
                    }
                  } else {
                    var2 = -123;
                  }
                } else {
                  var2 = -124;
                }
              } else {
                var2 = -125;
              }
            } else {
              var2 = -128;
            }
          }
          return (byte) var2;
        }
        if (128 > param0) {
          var2Lifetime1 = (byte)param0;
          return (byte) var2Lifetime1;
        }
        if (param0 < 160) {
          if (param0 != 8364) {
            if (param0 == 8218) {
              var2Lifetime2 = -126;
            } else {
              if (402 != param0) {
                if (param0 != 8222) {
                  if (param0 != 8230) {
                    if (param0 != 8224) {
                      if (8225 == param0) {
                        var2Lifetime2 = -121;
                      } else {
                        if (param0 == 710) {
                          var2Lifetime2 = -120;
                        } else {
                          if (param0 != 8240) {
                            if (param0 != 352) {
                              if (param0 != 8249) {
                                if (param0 == 338) {
                                  var2Lifetime2 = -116;
                                } else {
                                  if (381 != param0) {
                                    if (param0 == 8216) {
                                      var2Lifetime2 = -111;
                                    } else {
                                      if (param0 != 8217) {
                                        if (8220 != param0) {
                                          if (param0 == 8221) {
                                            var2Lifetime2 = -108;
                                          } else {
                                            if (param0 != 8226) {
                                              if (param0 == 8211) {
                                                var2Lifetime2 = -106;
                                              } else {
                                                if (param0 == 8212) {
                                                  var2Lifetime2 = -105;
                                                } else {
                                                  if (param0 != 732) {
                                                    if (param0 != 8482) {
                                                      if (353 != param0) {
                                                        if (param0 == 8250) {
                                                          var2Lifetime2 = -101;
                                                        } else {
                                                          if (param0 == 339) {
                                                            var2Lifetime2 = -100;
                                                          } else {
                                                            if (param0 == 382) {
                                                              var2Lifetime2 = -98;
                                                            } else {
                                                              if (376 != param0) {
                                                                var2Lifetime2 = 63;
                                                              } else {
                                                                var2Lifetime2 = -97;
                                                              }
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
                                              }
                                            } else {
                                              var2Lifetime2 = -107;
                                            }
                                          }
                                        } else {
                                          var2Lifetime2 = -109;
                                        }
                                      } else {
                                        var2Lifetime2 = -110;
                                      }
                                    }
                                  } else {
                                    var2Lifetime2 = -114;
                                  }
                                }
                              } else {
                                var2Lifetime2 = -117;
                              }
                            } else {
                              var2Lifetime2 = -118;
                            }
                          } else {
                            var2Lifetime2 = -119;
                          }
                        }
                      }
                    } else {
                      var2Lifetime2 = -122;
                    }
                  } else {
                    var2Lifetime2 = -123;
                  }
                } else {
                  var2Lifetime2 = -124;
                }
              } else {
                var2Lifetime2 = -125;
              }
            }
          } else {
            var2Lifetime2 = -128;
          }
          return (byte) var2Lifetime2;
        }
        if (255 >= param0) {
          var2Lifetime3 = (byte)param0;
          return (byte) var2Lifetime3;
        }
        if (param0 != 8364) {
          if (param0 == 8218) {
            var2Lifetime4 = -126;
          } else {
            if (402 != param0) {
              if (param0 != 8222) {
                if (param0 != 8230) {
                  if (param0 != 8224) {
                    if (8225 == param0) {
                      var2Lifetime4 = -121;
                    } else {
                      if (param0 == 710) {
                        var2Lifetime4 = -120;
                      } else {
                        if (param0 != 8240) {
                          if (param0 != 352) {
                            if (param0 != 8249) {
                              if (param0 == 338) {
                                var2Lifetime4 = -116;
                              } else {
                                if (381 != param0) {
                                  if (param0 == 8216) {
                                    var2Lifetime4 = -111;
                                  } else {
                                    if (param0 != 8217) {
                                      if (8220 != param0) {
                                        if (param0 == 8221) {
                                          var2Lifetime4 = -108;
                                        } else {
                                          if (param0 != 8226) {
                                            if (param0 == 8211) {
                                              var2Lifetime4 = -106;
                                            } else {
                                              if (param0 == 8212) {
                                                var2Lifetime4 = -105;
                                              } else {
                                                if (param0 != 732) {
                                                  if (param0 != 8482) {
                                                    if (353 != param0) {
                                                      if (param0 == 8250) {
                                                        var2Lifetime4 = -101;
                                                      } else {
                                                        if (param0 == 339) {
                                                          var2Lifetime4 = -100;
                                                        } else {
                                                          if (param0 == 382) {
                                                            var2Lifetime4 = -98;
                                                          } else {
                                                            if (376 == param0) {
                                                              var2Lifetime4 = -97;
                                                            } else {
                                                              var2Lifetime4 = 63;
                                                            }
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
                                            }
                                          } else {
                                            var2Lifetime4 = -107;
                                          }
                                        }
                                      } else {
                                        var2Lifetime4 = -109;
                                      }
                                    } else {
                                      var2Lifetime4 = -110;
                                    }
                                  }
                                } else {
                                  var2Lifetime4 = -114;
                                }
                              }
                            } else {
                              var2Lifetime4 = -117;
                            }
                          } else {
                            var2Lifetime4 = -118;
                          }
                        } else {
                          var2Lifetime4 = -119;
                        }
                      }
                    }
                  } else {
                    var2Lifetime4 = -122;
                  }
                } else {
                  var2Lifetime4 = -123;
                }
              } else {
                var2Lifetime4 = -124;
              }
            } else {
              var2Lifetime4 = -125;
            }
          }
        } else {
          var2Lifetime4 = -128;
        }
        return (byte) var2Lifetime4;
    }

    public final Object next() {
        Object var1 = this.field_b;
        if (var1 != this.field_c.field_a) {
          this.field_b = ((pa) (var1)).field_p;
        } else {
          var1 = null;
          this.field_b = null;
        }
        this.field_d = (pa) (var1);
        return var1;
    }

    public final void remove() {
        if (null == this.field_d) {
          throw new IllegalStateException();
        }
        this.field_d.e(-90);
        this.field_d = null;
    }

    rc(wf param0) {
        this.field_d = null;
        try {
          this.field_c = param0;
          this.field_d = null;
          this.field_b = this.field_c.field_a.field_p;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "rc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_h = null;
        int var1 = -81 % ((-31 - param0) / 63);
        field_g = null;
    }

    static {
        field_f = "Return to game";
        field_i = true;
        field_h = "Cancel";
    }
}
