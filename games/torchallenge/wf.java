/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static sl field_g;
    static ka field_b;
    static String[] field_e;
    static String field_a;
    static int[] field_d;
    static int[][] field_h;
    static String field_f;
    static oa field_i;
    static int[][] field_c;

    public static void a(byte param0) {
        field_i = null;
        field_a = null;
        field_b = null;
        field_f = null;
        field_e = null;
        field_c = (int[][]) null;
        if (param0 == -116) {
          field_g = null;
          field_d = null;
          field_h = (int[][]) null;
          return;
        }
    }

    final static qk a(byte param0, String param1) {
        String var2 = null;
        qk var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        qk stackIn_15_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          if (null == mh.field_e) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var2 = il.a(var7, (byte) 21);
          if (var2 == null) {
            var2 = param1;
          }
          var3 = (qk) (mh.field_e.a(true, (long)var2.hashCode()));
          if (param0 != -123) {
            var6 = (String) null;
            wf.a((byte) -81, (String) null);
          }
          while (var3 != null) {
            var8 = (CharSequence) ((Object) var3.field_F);
            var4 = il.a(var8, (byte) 21);
            if (var4 == null) {
              var4 = var3.field_F;
            }
            if (var4.equals(var2)) {
              stackIn_15_0 = var3;
              return stackIn_15_0;
            }
            var3 = (qk) (mh.field_e.a((byte) 126));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_20_0 = var2_ref;
          stackIn_20_1 = new StringBuilder().append("wf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static byte a(byte param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime1Lifetime1;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (param0 == -126) {
          if (param1 > 0 &&
            param1 < 128) {
            var2 = (byte)param1;
            return (byte) var2;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            var2Lifetime3 = (byte)param1;
            return (byte) var2Lifetime3;
          }
          if (param1 == 8364) {
            var2Lifetime4 = -128;
          } else {
            if (param1 != 8218) {
              if (402 == param1) {
                var2Lifetime4 = -125;
              } else {
                if (param1 != 8222) {
                  if (param1 == 8230) {
                    var2Lifetime4 = -123;
                  } else {
                    if (param1 != 8224) {
                      if (8225 != param1) {
                        if (param1 == 710) {
                          var2Lifetime4 = -120;
                        } else {
                          if (param1 == 8240) {
                            var2Lifetime4 = -119;
                          } else {
                            if (param1 == 352) {
                              var2Lifetime4 = -118;
                            } else {
                              if (param1 == 8249) {
                                var2Lifetime4 = -117;
                              } else {
                                if (param1 != 338) {
                                  if (param1 == 381) {
                                    var2Lifetime4 = -114;
                                  } else {
                                    if (param1 != 8216) {
                                      if (param1 != 8217) {
                                        if (param1 != 8220) {
                                          if (param1 != 8221) {
                                            if (8226 == param1) {
                                              var2Lifetime4 = -107;
                                            } else {
                                              if (param1 == 8211) {
                                                var2Lifetime4 = -106;
                                              } else {
                                                if (param1 == 8212) {
                                                  var2Lifetime4 = -105;
                                                } else {
                                                  if (param1 != 732) {
                                                    if (param1 == 8482) {
                                                      var2Lifetime4 = -103;
                                                    } else {
                                                      if (353 != param1) {
                                                        if (8250 != param1) {
                                                          if (param1 == 339) {
                                                            var2Lifetime4 = -100;
                                                          } else {
                                                            if (382 == param1) {
                                                              var2Lifetime4 = -98;
                                                            } else {
                                                              var2Lifetime4 = (param1 == 376) ? -97 : 63;
                                                            }
                                                          }
                                                        } else {
                                                          var2Lifetime4 = -101;
                                                        }
                                                      } else {
                                                        var2Lifetime4 = -102;
                                                      }
                                                    }
                                                  } else {
                                                    var2Lifetime4 = -104;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var2Lifetime4 = -108;
                                          }
                                        } else {
                                          var2Lifetime4 = -109;
                                        }
                                      } else {
                                        var2Lifetime4 = -110;
                                      }
                                    } else {
                                      var2Lifetime4 = -111;
                                    }
                                  }
                                } else {
                                  var2Lifetime4 = -116;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var2Lifetime4 = -121;
                      }
                    } else {
                      var2Lifetime4 = -122;
                    }
                  }
                } else {
                  var2Lifetime4 = -124;
                }
              }
            } else {
              var2Lifetime4 = -126;
            }
          }
          return (byte) var2Lifetime4;
        }
        field_i = (oa) null;
        if (param1 > 0) {
          if (param1 < 128) {
            var2Lifetime1 = (byte)param1;
            return (byte) var2Lifetime1;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            var2Lifetime1Lifetime1 = (byte)param1;
          } else {
            if (param1 == 8364) {
              var2Lifetime1Lifetime1 = -128;
              return (byte) var2Lifetime1Lifetime1;
            }
            if (param1 != 8218) {
              if (402 == param1) {
                var2Lifetime1Lifetime1 = -125;
                return (byte) var2Lifetime1Lifetime1;
              }
              if (param1 != 8222) {
                if (param1 == 8230) {
                  var2Lifetime1Lifetime1 = -123;
                  return (byte) var2Lifetime1Lifetime1;
                }
                if (param1 != 8224) {
                  if (8225 != param1) {
                    if (param1 == 710) {
                      var2Lifetime1Lifetime1 = -120;
                      return (byte) var2Lifetime1Lifetime1;
                    }
                    if (param1 == 8240) {
                      var2Lifetime1Lifetime1 = -119;
                      return (byte) var2Lifetime1Lifetime1;
                    }
                    if (param1 == 352) {
                      var2Lifetime1Lifetime1 = -118;
                      return (byte) var2Lifetime1Lifetime1;
                    }
                    if (param1 == 8249) {
                      var2Lifetime1Lifetime1 = -117;
                      return (byte) var2Lifetime1Lifetime1;
                    }
                    if (param1 != 338) {
                      if (param1 == 381) {
                        var2Lifetime1Lifetime1 = -114;
                        return (byte) var2Lifetime1Lifetime1;
                      }
                      if (param1 != 8216) {
                        if (param1 != 8217) {
                          if (param1 != 8220) {
                            if (param1 != 8221) {
                              if (8226 == param1) {
                                var2Lifetime1Lifetime1 = -107;
                                return (byte) var2Lifetime1Lifetime1;
                              }
                              if (param1 == 8211) {
                                var2Lifetime1Lifetime1 = -106;
                                return (byte) var2Lifetime1Lifetime1;
                              }
                              if (param1 == 8212) {
                                var2Lifetime1Lifetime1 = -105;
                                return (byte) var2Lifetime1Lifetime1;
                              }
                              if (param1 != 732) {
                                if (param1 == 8482) {
                                  var2Lifetime1Lifetime1 = -103;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                if (353 == param1) {
                                  var2Lifetime1Lifetime1 = -102;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                if (8250 == param1) {
                                  var2Lifetime1Lifetime1 = -101;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                if (param1 == 339) {
                                  var2Lifetime1Lifetime1 = -100;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                if (382 == param1) {
                                  var2Lifetime1Lifetime1 = -98;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                if (param1 == 376) {
                                  var2Lifetime1Lifetime1 = -97;
                                  return (byte) var2Lifetime1Lifetime1;
                                }
                                var2Lifetime1Lifetime1 = 63;
                                return (byte) var2Lifetime1Lifetime1;
                              }
                              var2Lifetime1Lifetime1 = -104;
                            } else {
                              var2Lifetime1Lifetime1 = -108;
                            }
                          } else {
                            var2Lifetime1Lifetime1 = -109;
                          }
                        } else {
                          var2Lifetime1Lifetime1 = -110;
                        }
                      } else {
                        var2Lifetime1Lifetime1 = -111;
                      }
                    } else {
                      var2Lifetime1Lifetime1 = -116;
                    }
                  } else {
                    var2Lifetime1Lifetime1 = -121;
                  }
                } else {
                  var2Lifetime1Lifetime1 = -122;
                }
              } else {
                var2Lifetime1Lifetime1 = -124;
              }
            } else {
              var2Lifetime1Lifetime1 = -126;
            }
          }
          return (byte) var2Lifetime1Lifetime1;
        }
        if (param1 < 160) {
          if (param1 == 8364) {
            var2Lifetime2 = -128;
          } else {
            if (param1 != 8218) {
              if (402 == param1) {
                var2Lifetime2 = -125;
              } else {
                if (param1 != 8222) {
                  if (param1 == 8230) {
                    var2Lifetime2 = -123;
                  } else {
                    if (param1 != 8224) {
                      if (8225 != param1) {
                        if (param1 == 710) {
                          var2Lifetime2 = -120;
                        } else {
                          if (param1 == 8240) {
                            var2Lifetime2 = -119;
                          } else {
                            if (param1 == 352) {
                              var2Lifetime2 = -118;
                            } else {
                              if (param1 == 8249) {
                                var2Lifetime2 = -117;
                              } else {
                                if (param1 != 338) {
                                  if (param1 == 381) {
                                    var2Lifetime2 = -114;
                                  } else {
                                    if (param1 != 8216) {
                                      if (param1 != 8217) {
                                        if (param1 != 8220) {
                                          if (param1 != 8221) {
                                            if (8226 == param1) {
                                              var2Lifetime2 = -107;
                                            } else {
                                              if (param1 == 8211) {
                                                var2Lifetime2 = -106;
                                              } else {
                                                if (param1 == 8212) {
                                                  var2Lifetime2 = -105;
                                                } else {
                                                  if (param1 != 732) {
                                                    if (param1 == 8482) {
                                                      var2Lifetime2 = -103;
                                                    } else {
                                                      if (353 != param1) {
                                                        if (8250 != param1) {
                                                          if (param1 == 339) {
                                                            var2Lifetime2 = -100;
                                                          } else {
                                                            if (382 == param1) {
                                                              var2Lifetime2 = -98;
                                                            } else {
                                                              var2Lifetime2 = (param1 == 376) ? -97 : 63;
                                                            }
                                                          }
                                                        } else {
                                                          var2Lifetime2 = -101;
                                                        }
                                                      } else {
                                                        var2Lifetime2 = -102;
                                                      }
                                                    }
                                                  } else {
                                                    var2Lifetime2 = -104;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var2Lifetime2 = -108;
                                          }
                                        } else {
                                          var2Lifetime2 = -109;
                                        }
                                      } else {
                                        var2Lifetime2 = -110;
                                      }
                                    } else {
                                      var2Lifetime2 = -111;
                                    }
                                  }
                                } else {
                                  var2Lifetime2 = -116;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var2Lifetime2 = -121;
                      }
                    } else {
                      var2Lifetime2 = -122;
                    }
                  }
                } else {
                  var2Lifetime2 = -124;
                }
              }
            } else {
              var2Lifetime2 = -126;
            }
          }
        } else {
          if (param1 <= 255) {
            var2Lifetime2 = (byte)param1;
          } else {
            if (param1 == 8364) {
              var2Lifetime2 = -128;
            } else {
              if (param1 != 8218) {
                if (402 == param1) {
                  var2Lifetime2 = -125;
                } else {
                  if (param1 != 8222) {
                    if (param1 == 8230) {
                      var2Lifetime2 = -123;
                    } else {
                      if (param1 != 8224) {
                        if (8225 != param1) {
                          if (param1 == 710) {
                            var2Lifetime2 = -120;
                          } else {
                            if (param1 == 8240) {
                              var2Lifetime2 = -119;
                            } else {
                              if (param1 == 352) {
                                var2Lifetime2 = -118;
                              } else {
                                if (param1 == 8249) {
                                  var2Lifetime2 = -117;
                                } else {
                                  if (param1 != 338) {
                                    if (param1 == 381) {
                                      var2Lifetime2 = -114;
                                    } else {
                                      if (param1 != 8216) {
                                        if (param1 != 8217) {
                                          if (param1 != 8220) {
                                            if (param1 != 8221) {
                                              if (8226 == param1) {
                                                var2Lifetime2 = -107;
                                              } else {
                                                if (param1 == 8211) {
                                                  var2Lifetime2 = -106;
                                                } else {
                                                  if (param1 == 8212) {
                                                    var2Lifetime2 = -105;
                                                  } else {
                                                    if (param1 != 732) {
                                                      if (param1 == 8482) {
                                                        var2Lifetime2 = -103;
                                                      } else {
                                                        if (353 != param1) {
                                                          if (8250 != param1) {
                                                            if (param1 == 339) {
                                                              var2Lifetime2 = -100;
                                                            } else {
                                                              if (382 == param1) {
                                                                var2Lifetime2 = -98;
                                                              } else {
                                                                var2Lifetime2 = (param1 == 376) ? -97 : 63;
                                                              }
                                                            }
                                                          } else {
                                                            var2Lifetime2 = -101;
                                                          }
                                                        } else {
                                                          var2Lifetime2 = -102;
                                                        }
                                                      }
                                                    } else {
                                                      var2Lifetime2 = -104;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var2Lifetime2 = -108;
                                            }
                                          } else {
                                            var2Lifetime2 = -109;
                                          }
                                        } else {
                                          var2Lifetime2 = -110;
                                        }
                                      } else {
                                        var2Lifetime2 = -111;
                                      }
                                    }
                                  } else {
                                    var2Lifetime2 = -116;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var2Lifetime2 = -121;
                        }
                      } else {
                        var2Lifetime2 = -122;
                      }
                    }
                  } else {
                    var2Lifetime2 = -124;
                  }
                }
              } else {
                var2Lifetime2 = -126;
              }
            }
          }
        }
        return (byte) var2Lifetime2;
    }

    static {
        field_e = new String[16];
        field_d = new int[]{0, 350};
        field_a = "Waiting for fonts";
        field_g = new sl();
        field_h = new int[][]{new int[]{0, 119}, new int[]{0, 0}};
        field_f = "New Game";
        field_c = new int[][]{new int[]{9, 10}, new int[]{51, 52}};
    }
}
