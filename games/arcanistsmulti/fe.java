/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends pg {
    int[] field_i;
    boolean field_l;
    static qb field_o;
    static ch field_n;
    static qb field_g;
    static String field_m;
    static String field_p;
    static ll[] field_h;
    static String field_k;
    static int field_j;

    final static byte a(byte param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 >= 16) {
          L4: {
            if ((0 >= param1 ||
              param1 >= 128) &&
              (160 > param1 ||
              param1 > 255)) {
              if (8364 == param1) {
                var2 = -128;
                return (byte) var2;
              }
              if (param1 == 8218) {
                var2 = -126;
              } else {
                if (param1 == 402) {
                  var2 = -125;
                  return (byte) var2;
                }
                if (param1 == 8222) {
                  var2 = -124;
                } else {
                  if (param1 == 8230) {
                    var2 = -123;
                  } else {
                    if (param1 == 8224) {
                      var2 = -122;
                      return (byte) var2;
                    }
                    if (param1 == 8225) {
                      var2 = -121;
                      return (byte) var2;
                    }
                    if (param1 == 710) {
                      var2 = -120;
                    } else {
                      if (param1 == 8240) {
                        var2 = -119;
                        return (byte) var2;
                      }
                      if (param1 == 352) {
                        var2 = -118;
                      } else {
                        if (param1 == 8249) {
                          var2 = -117;
                          return (byte) var2;
                        }
                        if (param1 == 338) {
                          var2 = -116;
                          return (byte) var2;
                        }
                        if (param1 == 381) {
                          var2 = -114;
                        } else {
                          if (param1 == 8216) {
                            var2 = -111;
                          } else {
                            if (8217 == param1) {
                              var2 = -110;
                            } else {
                              if (param1 == 8220) {
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
                                      if (param1 == 8212) {
                                        var2 = -105;
                                      } else {
                                        if (param1 == 732) {
                                          var2 = -104;
                                        } else {
                                          if (param1 == 8482) {
                                            var2 = -103;
                                          } else {
                                            if (param1 == 353) {
                                              var2 = -102;
                                            } else {
                                              if (param1 == 8250) {
                                                var2 = -101;
                                              } else {
                                                if (param1 == 339) {
                                                  var2 = -100;
                                                } else {
                                                  if (382 == param1) {
                                                    var2 = -98;
                                                  } else {
                                                    if (376 != param1) {
                                                      var2 = 63;
                                                    } else {
                                                      var2 = -97;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              break L4;
            }
            var2 = (byte)param1;
          }
          return (byte) var2;
        }
        fe.a(true, -66, 87, 84, 125, false, 83, true, false, true, -66, true);
        if (0 >= param1) {
          if (160 > param1) {
            if (8364 == param1) {
              var2Lifetime1 = -128;
            } else {
              if (param1 != 8218) {
                if (param1 == 402) {
                  var2Lifetime1 = -125;
                } else {
                  if (param1 != 8222) {
                    if (param1 != 8230) {
                      if (param1 == 8224) {
                        var2Lifetime1 = -122;
                      } else {
                        if (param1 == 8225) {
                          var2Lifetime1 = -121;
                        } else {
                          if (param1 != 710) {
                            if (param1 == 8240) {
                              var2Lifetime1 = -119;
                            } else {
                              if (param1 != 352) {
                                if (param1 == 8249) {
                                  var2Lifetime1 = -117;
                                } else {
                                  if (param1 == 338) {
                                    var2Lifetime1 = -116;
                                  } else {
                                    if (param1 == 381) {
                                      var2Lifetime1 = -114;
                                    } else {
                                      if (param1 != 8216) {
                                        if (8217 != param1) {
                                          if (param1 != 8220) {
                                            if (param1 == 8221) {
                                              var2Lifetime1 = -108;
                                            } else {
                                              if (param1 == 8226) {
                                                var2Lifetime1 = -107;
                                              } else {
                                                if (param1 != 8211) {
                                                  if (param1 != 8212) {
                                                    if (param1 == 732) {
                                                      var2Lifetime1 = -104;
                                                    } else {
                                                      if (param1 == 8482) {
                                                        var2Lifetime1 = -103;
                                                      } else {
                                                        if (param1 != 353) {
                                                          if (param1 == 8250) {
                                                            var2Lifetime1 = -101;
                                                          } else {
                                                            if (param1 != 339) {
                                                              if (382 == param1) {
                                                                var2Lifetime1 = -98;
                                                              } else {
                                                                var2Lifetime1 = (376 != param1) ? 63 : -97;
                                                              }
                                                            } else {
                                                              var2Lifetime1 = -100;
                                                            }
                                                          }
                                                        } else {
                                                          var2Lifetime1 = -102;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2Lifetime1 = -105;
                                                  }
                                                } else {
                                                  var2Lifetime1 = -106;
                                                }
                                              }
                                            }
                                          } else {
                                            var2Lifetime1 = -109;
                                          }
                                        } else {
                                          var2Lifetime1 = -110;
                                        }
                                      } else {
                                        var2Lifetime1 = -111;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var2Lifetime1 = -118;
                              }
                            }
                          } else {
                            var2Lifetime1 = -120;
                          }
                        }
                      }
                    } else {
                      var2Lifetime1 = -123;
                    }
                  } else {
                    var2Lifetime1 = -124;
                  }
                }
              } else {
                var2Lifetime1 = -126;
              }
            }
          } else {
            if (param1 <= 255) {
              var2Lifetime1 = (byte)param1;
            } else {
              if (8364 == param1) {
                var2Lifetime1 = -128;
              } else {
                if (param1 != 8218) {
                  if (param1 == 402) {
                    var2Lifetime1 = -125;
                  } else {
                    if (param1 != 8222) {
                      if (param1 != 8230) {
                        if (param1 == 8224) {
                          var2Lifetime1 = -122;
                        } else {
                          if (param1 == 8225) {
                            var2Lifetime1 = -121;
                          } else {
                            if (param1 != 710) {
                              if (param1 == 8240) {
                                var2Lifetime1 = -119;
                              } else {
                                if (param1 != 352) {
                                  if (param1 == 8249) {
                                    var2Lifetime1 = -117;
                                  } else {
                                    if (param1 == 338) {
                                      var2Lifetime1 = -116;
                                    } else {
                                      if (param1 == 381) {
                                        var2Lifetime1 = -114;
                                      } else {
                                        if (param1 != 8216) {
                                          if (8217 != param1) {
                                            if (param1 != 8220) {
                                              if (param1 == 8221) {
                                                var2Lifetime1 = -108;
                                              } else {
                                                if (param1 == 8226) {
                                                  var2Lifetime1 = -107;
                                                } else {
                                                  if (param1 != 8211) {
                                                    if (param1 != 8212) {
                                                      if (param1 == 732) {
                                                        var2Lifetime1 = -104;
                                                      } else {
                                                        if (param1 == 8482) {
                                                          var2Lifetime1 = -103;
                                                        } else {
                                                          if (param1 != 353) {
                                                            if (param1 == 8250) {
                                                              var2Lifetime1 = -101;
                                                            } else {
                                                              if (param1 != 339) {
                                                                if (382 == param1) {
                                                                  var2Lifetime1 = -98;
                                                                } else {
                                                                  var2Lifetime1 = (376 != param1) ? 63 : -97;
                                                                }
                                                              } else {
                                                                var2Lifetime1 = -100;
                                                              }
                                                            }
                                                          } else {
                                                            var2Lifetime1 = -102;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2Lifetime1 = -105;
                                                    }
                                                  } else {
                                                    var2Lifetime1 = -106;
                                                  }
                                                }
                                              }
                                            } else {
                                              var2Lifetime1 = -109;
                                            }
                                          } else {
                                            var2Lifetime1 = -110;
                                          }
                                        } else {
                                          var2Lifetime1 = -111;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var2Lifetime1 = -118;
                                }
                              }
                            } else {
                              var2Lifetime1 = -120;
                            }
                          }
                        }
                      } else {
                        var2Lifetime1 = -123;
                      }
                    } else {
                      var2Lifetime1 = -124;
                    }
                  }
                } else {
                  var2Lifetime1 = -126;
                }
              }
            }
          }
          return (byte) var2Lifetime1;
        }
        if (param1 < 128) {
          var2Lifetime2 = (byte)param1;
          return (byte) var2Lifetime2;
        }
        if (160 > param1) {
          if (8364 == param1) {
            var2Lifetime3 = -128;
          } else {
            if (param1 != 8218) {
              if (param1 == 402) {
                var2Lifetime3 = -125;
              } else {
                if (param1 != 8222) {
                  if (param1 != 8230) {
                    if (param1 == 8224) {
                      var2Lifetime3 = -122;
                    } else {
                      if (param1 == 8225) {
                        var2Lifetime3 = -121;
                      } else {
                        if (param1 != 710) {
                          if (param1 == 8240) {
                            var2Lifetime3 = -119;
                          } else {
                            if (param1 != 352) {
                              if (param1 == 8249) {
                                var2Lifetime3 = -117;
                              } else {
                                if (param1 == 338) {
                                  var2Lifetime3 = -116;
                                } else {
                                  if (param1 == 381) {
                                    var2Lifetime3 = -114;
                                  } else {
                                    if (param1 != 8216) {
                                      if (8217 != param1) {
                                        if (param1 != 8220) {
                                          if (param1 == 8221) {
                                            var2Lifetime3 = -108;
                                          } else {
                                            if (param1 == 8226) {
                                              var2Lifetime3 = -107;
                                            } else {
                                              if (param1 != 8211) {
                                                if (param1 == 8212) {
                                                  var2Lifetime3 = -105;
                                                } else {
                                                  if (param1 == 732) {
                                                    var2Lifetime3 = -104;
                                                  } else {
                                                    if (param1 == 8482) {
                                                      var2Lifetime3 = -103;
                                                    } else {
                                                      if (param1 == 353) {
                                                        var2Lifetime3 = -102;
                                                      } else {
                                                        if (param1 == 8250) {
                                                          var2Lifetime3 = -101;
                                                        } else {
                                                          if (param1 == 339) {
                                                            var2Lifetime3 = -100;
                                                          } else {
                                                            if (382 == param1) {
                                                              var2Lifetime3 = -98;
                                                            } else {
                                                              if (376 != param1) {
                                                                var2Lifetime3 = 63;
                                                              } else {
                                                                var2Lifetime3 = -97;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var2Lifetime3 = -106;
                                              }
                                            }
                                          }
                                        } else {
                                          var2Lifetime3 = -109;
                                        }
                                      } else {
                                        var2Lifetime3 = -110;
                                      }
                                    } else {
                                      var2Lifetime3 = -111;
                                    }
                                  }
                                }
                              }
                            } else {
                              var2Lifetime3 = -118;
                            }
                          }
                        } else {
                          var2Lifetime3 = -120;
                        }
                      }
                    }
                  } else {
                    var2Lifetime3 = -123;
                  }
                } else {
                  var2Lifetime3 = -124;
                }
              }
            } else {
              var2Lifetime3 = -126;
            }
          }
          return (byte) var2Lifetime3;
        }
        if (param1 > 255) {
          if (8364 == param1) {
            var2Lifetime4 = -128;
          } else {
            if (param1 != 8218) {
              if (param1 == 402) {
                var2Lifetime4 = -125;
                return (byte) var2Lifetime4;
              }
              if (param1 != 8222) {
                if (param1 != 8230) {
                  if (param1 == 8224) {
                    var2Lifetime4 = -122;
                    return (byte) var2Lifetime4;
                  }
                  if (param1 == 8225) {
                    var2Lifetime4 = -121;
                    return (byte) var2Lifetime4;
                  }
                  if (param1 != 710) {
                    if (param1 == 8240) {
                      var2Lifetime4 = -119;
                      return (byte) var2Lifetime4;
                    }
                    if (param1 != 352) {
                      if (param1 == 8249) {
                        var2Lifetime4 = -117;
                        return (byte) var2Lifetime4;
                      }
                      if (param1 == 338) {
                        var2Lifetime4 = -116;
                        return (byte) var2Lifetime4;
                      }
                      if (param1 == 381) {
                        var2Lifetime4 = -114;
                        return (byte) var2Lifetime4;
                      }
                      if (param1 != 8216) {
                        if (8217 != param1) {
                          if (param1 != 8220) {
                            if (param1 == 8221) {
                              var2Lifetime4 = -108;
                              return (byte) var2Lifetime4;
                            }
                            if (param1 == 8226) {
                              var2Lifetime4 = -107;
                              return (byte) var2Lifetime4;
                            }
                            if (param1 != 8211) {
                              if (param1 == 8212) {
                                var2Lifetime4 = -105;
                              } else {
                                if (param1 == 732) {
                                  var2Lifetime4 = -104;
                                } else {
                                  if (param1 == 8482) {
                                    var2Lifetime4 = -103;
                                  } else {
                                    if (param1 == 353) {
                                      var2Lifetime4 = -102;
                                    } else {
                                      if (param1 == 8250) {
                                        var2Lifetime4 = -101;
                                      } else {
                                        if (param1 == 339) {
                                          var2Lifetime4 = -100;
                                        } else {
                                          if (382 == param1) {
                                            var2Lifetime4 = -98;
                                          } else {
                                            if (376 != param1) {
                                              var2Lifetime4 = 63;
                                            } else {
                                              var2Lifetime4 = -97;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              return (byte) var2Lifetime4;
                            }
                            var2Lifetime4 = -106;
                          } else {
                            var2Lifetime4 = -109;
                          }
                        } else {
                          var2Lifetime4 = -110;
                        }
                      } else {
                        var2Lifetime4 = -111;
                      }
                    } else {
                      var2Lifetime4 = -118;
                    }
                  } else {
                    var2Lifetime4 = -120;
                  }
                } else {
                  var2Lifetime4 = -123;
                }
              } else {
                var2Lifetime4 = -124;
              }
            } else {
              var2Lifetime4 = -126;
            }
          }
        } else {
          var2Lifetime4 = (byte)param1;
        }
        return (byte) var2Lifetime4;
    }

    fe() {
        this.field_l = false;
    }

    public static void a(int param0) {
        field_k = null;
        field_h = null;
        field_o = null;
        field_m = null;
        field_g = null;
        if (param0 == 32369) {
          field_p = null;
          field_n = null;
          return;
        }
        fe.a((byte) -127, 'ﾎ');
        field_p = null;
        field_n = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, int param6, boolean param7, boolean param8, boolean param9, int param10, boolean param11) {
        f.a(param8, param3, param2, param11, (byte) -38, 16777215, param9, param4, param10, param7, param5, param6, 16777215, param1);
        if (!param0) {
          field_h = (ll[]) null;
        }
    }

    static {
        field_n = new ch(0);
        field_m = "Reading Book of Stone";
        field_j = 4;
        field_k = "TAB - hide chat temporarily";
    }
}
