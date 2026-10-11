/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static j field_d;
    static int[] field_b;
    static String[] field_c;
    static uj field_a;

    public static void a(byte param0) {
        field_c = null;
        if (param0 == -79) {
          field_d = null;
          field_a = null;
          field_b = null;
          return;
        }
        de.a((byte) 73);
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final static void a(oi param0, int param1, int param2) {
        hj var3 = null;
        try {
          var3 = ff.field_D;
          var3.a(false, param1);
          var3.f(6389, param2);
          var3.f(6389, 0);
          var3.f(param2 + 6387, param0.field_h);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "de.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static uj a(boolean param0, byte param1) {
        uj var2 = new uj(true);
        if (param1 == -116) {
          var2.field_a = param0 ? true : false;
          return var2;
        }
        field_b = (int[]) null;
        var2.field_a = param0 ? true : false;
        return var2;
    }

    final static byte a(int param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 >= 0) {
          L4: {
            if ((param1 <= 0 ||
              128 <= param1) &&
              (param1 < 160 ||
              param1 > 255)) {
              if (param1 == 8364) {
                var2 = -128;
                return (byte) var2;
              }
              if (8218 == param1) {
                var2 = -126;
              } else {
                if (param1 == 402) {
                  var2 = -125;
                } else {
                  if (param1 == 8222) {
                    var2 = -124;
                  } else {
                    if (param1 == 8230) {
                      var2 = -123;
                    } else {
                      if (param1 == 8224) {
                        var2 = -122;
                      } else {
                        if (param1 == 8225) {
                          var2 = -121;
                        } else {
                          if (param1 == 710) {
                            var2 = -120;
                          } else {
                            if (param1 == 8240) {
                              var2 = -119;
                            } else {
                              if (param1 == 352) {
                                var2 = -118;
                              } else {
                                if (8249 == param1) {
                                  var2 = -117;
                                } else {
                                  if (338 == param1) {
                                    var2 = -116;
                                    return (byte) var2;
                                  }
                                  if (param1 == 381) {
                                    var2 = -114;
                                    return (byte) var2;
                                  }
                                  if (param1 == 8216) {
                                    var2 = -111;
                                    return (byte) var2;
                                  }
                                  if (param1 == 8217) {
                                    var2 = -110;
                                    return (byte) var2;
                                  }
                                  if (8220 == param1) {
                                    var2 = -109;
                                    return (byte) var2;
                                  }
                                  if (param1 == 8221) {
                                    var2 = -108;
                                  } else {
                                    if (param1 == 8226) {
                                      var2 = -107;
                                      return (byte) var2;
                                    }
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
                                            if (353 == param1) {
                                              var2 = -102;
                                            } else {
                                              if (param1 == 8250) {
                                                var2 = -101;
                                              } else {
                                                if (param1 == 339) {
                                                  var2 = -100;
                                                } else {
                                                  if (param1 == 382) {
                                                    var2 = -98;
                                                  } else {
                                                    if (param1 == 376) {
                                                      var2 = -97;
                                                    } else {
                                                      var2 = 63;
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
        field_b = (int[]) null;
        if (param1 <= 0) {
          if (param1 < 160) {
            if (param1 == 8364) {
              var2Lifetime1 = -128;
            } else {
              if (8218 != param1) {
                if (param1 != 402) {
                  if (param1 != 8222) {
                    if (param1 != 8230) {
                      if (param1 != 8224) {
                        if (param1 != 8225) {
                          if (param1 != 710) {
                            if (param1 != 8240) {
                              if (param1 != 352) {
                                if (8249 != param1) {
                                  if (338 == param1) {
                                    var2Lifetime1 = -116;
                                  } else {
                                    if (param1 == 381) {
                                      var2Lifetime1 = -114;
                                    } else {
                                      if (param1 == 8216) {
                                        var2Lifetime1 = -111;
                                      } else {
                                        if (param1 == 8217) {
                                          var2Lifetime1 = -110;
                                        } else {
                                          if (8220 == param1) {
                                            var2Lifetime1 = -109;
                                          } else {
                                            if (param1 != 8221) {
                                              if (param1 == 8226) {
                                                var2Lifetime1 = -107;
                                              } else {
                                                if (param1 == 8211) {
                                                  var2Lifetime1 = -106;
                                                } else {
                                                  if (param1 != 8212) {
                                                    if (param1 != 732) {
                                                      if (param1 == 8482) {
                                                        var2Lifetime1 = -103;
                                                      } else {
                                                        if (353 == param1) {
                                                          var2Lifetime1 = -102;
                                                        } else {
                                                          if (param1 != 8250) {
                                                            if (param1 != 339) {
                                                              if (param1 == 382) {
                                                                var2Lifetime1 = -98;
                                                              } else {
                                                                var2Lifetime1 = (param1 == 376) ? -97 : 63;
                                                              }
                                                            } else {
                                                              var2Lifetime1 = -100;
                                                            }
                                                          } else {
                                                            var2Lifetime1 = -101;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2Lifetime1 = -104;
                                                    }
                                                  } else {
                                                    var2Lifetime1 = -105;
                                                  }
                                                }
                                              }
                                            } else {
                                              var2Lifetime1 = -108;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var2Lifetime1 = -117;
                                }
                              } else {
                                var2Lifetime1 = -118;
                              }
                            } else {
                              var2Lifetime1 = -119;
                            }
                          } else {
                            var2Lifetime1 = -120;
                          }
                        } else {
                          var2Lifetime1 = -121;
                        }
                      } else {
                        var2Lifetime1 = -122;
                      }
                    } else {
                      var2Lifetime1 = -123;
                    }
                  } else {
                    var2Lifetime1 = -124;
                  }
                } else {
                  var2Lifetime1 = -125;
                }
              } else {
                var2Lifetime1 = -126;
              }
            }
          } else {
            if (param1 <= 255) {
              var2Lifetime1 = (byte)param1;
            } else {
              if (param1 == 8364) {
                var2Lifetime1 = -128;
              } else {
                if (8218 != param1) {
                  if (param1 != 402) {
                    if (param1 != 8222) {
                      if (param1 != 8230) {
                        if (param1 != 8224) {
                          if (param1 != 8225) {
                            if (param1 != 710) {
                              if (param1 != 8240) {
                                if (param1 != 352) {
                                  if (8249 != param1) {
                                    if (338 == param1) {
                                      var2Lifetime1 = -116;
                                    } else {
                                      if (param1 == 381) {
                                        var2Lifetime1 = -114;
                                      } else {
                                        if (param1 == 8216) {
                                          var2Lifetime1 = -111;
                                        } else {
                                          if (param1 == 8217) {
                                            var2Lifetime1 = -110;
                                          } else {
                                            if (8220 == param1) {
                                              var2Lifetime1 = -109;
                                            } else {
                                              if (param1 != 8221) {
                                                if (param1 == 8226) {
                                                  var2Lifetime1 = -107;
                                                } else {
                                                  if (param1 == 8211) {
                                                    var2Lifetime1 = -106;
                                                  } else {
                                                    if (param1 != 8212) {
                                                      if (param1 != 732) {
                                                        if (param1 == 8482) {
                                                          var2Lifetime1 = -103;
                                                        } else {
                                                          if (353 == param1) {
                                                            var2Lifetime1 = -102;
                                                          } else {
                                                            if (param1 != 8250) {
                                                              if (param1 != 339) {
                                                                if (param1 == 382) {
                                                                  var2Lifetime1 = -98;
                                                                } else {
                                                                  var2Lifetime1 = (param1 == 376) ? -97 : 63;
                                                                }
                                                              } else {
                                                                var2Lifetime1 = -100;
                                                              }
                                                            } else {
                                                              var2Lifetime1 = -101;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2Lifetime1 = -104;
                                                      }
                                                    } else {
                                                      var2Lifetime1 = -105;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var2Lifetime1 = -108;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var2Lifetime1 = -117;
                                  }
                                } else {
                                  var2Lifetime1 = -118;
                                }
                              } else {
                                var2Lifetime1 = -119;
                              }
                            } else {
                              var2Lifetime1 = -120;
                            }
                          } else {
                            var2Lifetime1 = -121;
                          }
                        } else {
                          var2Lifetime1 = -122;
                        }
                      } else {
                        var2Lifetime1 = -123;
                      }
                    } else {
                      var2Lifetime1 = -124;
                    }
                  } else {
                    var2Lifetime1 = -125;
                  }
                } else {
                  var2Lifetime1 = -126;
                }
              }
            }
          }
          return (byte) var2Lifetime1;
        }
        if (128 > param1) {
          var2Lifetime2 = (byte)param1;
          return (byte) var2Lifetime2;
        }
        if (param1 < 160) {
          if (param1 == 8364) {
            var2Lifetime3 = -128;
          } else {
            if (8218 != param1) {
              if (param1 != 402) {
                if (param1 != 8222) {
                  if (param1 != 8230) {
                    if (param1 != 8224) {
                      if (param1 != 8225) {
                        if (param1 != 710) {
                          if (param1 != 8240) {
                            if (param1 != 352) {
                              if (8249 == param1) {
                                var2Lifetime3 = -117;
                              } else {
                                if (338 == param1) {
                                  var2Lifetime3 = -116;
                                } else {
                                  if (param1 == 381) {
                                    var2Lifetime3 = -114;
                                  } else {
                                    if (param1 == 8216) {
                                      var2Lifetime3 = -111;
                                    } else {
                                      if (param1 == 8217) {
                                        var2Lifetime3 = -110;
                                      } else {
                                        if (8220 == param1) {
                                          var2Lifetime3 = -109;
                                        } else {
                                          if (param1 == 8221) {
                                            var2Lifetime3 = -108;
                                          } else {
                                            if (param1 == 8226) {
                                              var2Lifetime3 = -107;
                                            } else {
                                              if (param1 == 8211) {
                                                var2Lifetime3 = -106;
                                              } else {
                                                if (param1 == 8212) {
                                                  var2Lifetime3 = -105;
                                                } else {
                                                  if (param1 == 732) {
                                                    var2Lifetime3 = -104;
                                                  } else {
                                                    if (param1 == 8482) {
                                                      var2Lifetime3 = -103;
                                                    } else {
                                                      if (353 == param1) {
                                                        var2Lifetime3 = -102;
                                                      } else {
                                                        if (param1 == 8250) {
                                                          var2Lifetime3 = -101;
                                                        } else {
                                                          if (param1 == 339) {
                                                            var2Lifetime3 = -100;
                                                          } else {
                                                            if (param1 == 382) {
                                                              var2Lifetime3 = -98;
                                                            } else {
                                                              if (param1 == 376) {
                                                                var2Lifetime3 = -97;
                                                              } else {
                                                                var2Lifetime3 = 63;
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
                            } else {
                              var2Lifetime3 = -118;
                            }
                          } else {
                            var2Lifetime3 = -119;
                          }
                        } else {
                          var2Lifetime3 = -120;
                        }
                      } else {
                        var2Lifetime3 = -121;
                      }
                    } else {
                      var2Lifetime3 = -122;
                    }
                  } else {
                    var2Lifetime3 = -123;
                  }
                } else {
                  var2Lifetime3 = -124;
                }
              } else {
                var2Lifetime3 = -125;
              }
            } else {
              var2Lifetime3 = -126;
            }
          }
          return (byte) var2Lifetime3;
        }
        if (param1 > 255) {
          if (param1 == 8364) {
            var2Lifetime4 = -128;
          } else {
            if (8218 != param1) {
              if (param1 != 402) {
                if (param1 != 8222) {
                  if (param1 != 8230) {
                    if (param1 != 8224) {
                      if (param1 != 8225) {
                        if (param1 != 710) {
                          if (param1 != 8240) {
                            if (param1 != 352) {
                              if (8249 == param1) {
                                var2Lifetime4 = -117;
                              } else {
                                if (338 == param1) {
                                  var2Lifetime4 = -116;
                                } else {
                                  if (param1 == 381) {
                                    var2Lifetime4 = -114;
                                  } else {
                                    if (param1 == 8216) {
                                      var2Lifetime4 = -111;
                                    } else {
                                      if (param1 == 8217) {
                                        var2Lifetime4 = -110;
                                      } else {
                                        if (8220 == param1) {
                                          var2Lifetime4 = -109;
                                        } else {
                                          if (param1 == 8221) {
                                            var2Lifetime4 = -108;
                                          } else {
                                            if (param1 == 8226) {
                                              var2Lifetime4 = -107;
                                            } else {
                                              if (param1 == 8211) {
                                                var2Lifetime4 = -106;
                                              } else {
                                                if (param1 == 8212) {
                                                  var2Lifetime4 = -105;
                                                } else {
                                                  if (param1 == 732) {
                                                    var2Lifetime4 = -104;
                                                  } else {
                                                    if (param1 == 8482) {
                                                      var2Lifetime4 = -103;
                                                    } else {
                                                      if (353 == param1) {
                                                        var2Lifetime4 = -102;
                                                      } else {
                                                        if (param1 == 8250) {
                                                          var2Lifetime4 = -101;
                                                        } else {
                                                          if (param1 == 339) {
                                                            var2Lifetime4 = -100;
                                                          } else {
                                                            if (param1 == 382) {
                                                              var2Lifetime4 = -98;
                                                            } else {
                                                              if (param1 == 376) {
                                                                var2Lifetime4 = -97;
                                                              } else {
                                                                var2Lifetime4 = 63;
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
                              return (byte) var2Lifetime4;
                            }
                            var2Lifetime4 = -118;
                          } else {
                            var2Lifetime4 = -119;
                          }
                        } else {
                          var2Lifetime4 = -120;
                        }
                      } else {
                        var2Lifetime4 = -121;
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
            } else {
              var2Lifetime4 = -126;
            }
          }
        } else {
          var2Lifetime4 = (byte)param1;
        }
        return (byte) var2Lifetime4;
    }

    static {
        field_d = new j(2, 1000, 1000);
        field_c = new String[23];
    }
}
