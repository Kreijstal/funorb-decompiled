/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends ll {
    byte field_H;
    static String field_L;
    static oh field_M;
    int field_I;
    static hl field_N;
    static le field_F;
    static String field_J;
    static boolean[] field_G;
    bh field_K;

    final static mh b(int param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        mh var7 = null;
        int var8 = 0;
        mh stackIn_3_0 = null;
        mh stackIn_6_0 = null;
        mh stackIn_10_0 = null;
        mh stackIn_16_0 = null;
        mh stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TetraLink.field_J;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = c.field_o;
            return stackIn_3_0;
          }
          if (var2_int > 255) {
            stackIn_6_0 = nb.field_V;
            return stackIn_6_0;
          }
          var3 = hi.a(param1, '.', param0 + 781);
          if (var3.length < param0) {
            stackIn_10_0 = c.field_o;
            return stackIn_10_0;
          }
          var4 = var3;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = sd.a(param0 ^ 28, var6);
            if (var7 != null) {
              stackIn_16_0 = var7;
              return stackIn_16_0;
            }
          }
          stackIn_19_0 = rf.a(-1723, var3[-1 + var3.length]);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("rh.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(java.awt.Color param0, int param1, String param2, byte param3, boolean param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        try {
          try {
            var10 = uh.field_b.getGraphics();
            if (null == gg.field_k) {
              gg.field_k = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param3 < 68) {
              var9 = (String) null;
              rh.b(4, (String) null);
            }
            if (param4) {
              var10.setColor(java.awt.Color.black);
              var10.fillRect(0, 0, n.field_M, d.field_h);
            }
            if (param0 == null) {
              param0 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (wm.field_p == null) {
                wm.field_p = uh.field_b.createImage(304, 34);
              }
              var11 = wm.field_p.getGraphics();
              var11.setColor(param0);
              var11.drawRect(0, 0, 303, 33);
              var11.fillRect(2, 2, param1 * 3, 30);
              var11.setColor(java.awt.Color.black);
              var11.drawRect(1, 1, 301, 31);
              var11.fillRect(param1 * 3 + 2, 2, -(3 * param1) + 300, 30);
              var11.setFont(gg.field_k);
              var11.setColor(java.awt.Color.white);
              var11.drawString(param2, (-(param2.length() * 6) + 304) / 2, 22);
              var10.drawImage(wm.field_p, n.field_M / 2 - 152, d.field_h / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + n.field_M / 2;
              var8 = -18 + d.field_h / 2;
              var10.setColor(param0);
              var10.drawRect(var7, var8, 303, 33);
              var10.fillRect(var7 + 2, 2 + var8, param1 * 3, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1 + var7, 1 + var8, 301, 31);
              var10.fillRect(3 * param1 + 2 + var7, var8 + 2, -(param1 * 3) + 300, 30);
              var10.setFont(gg.field_k);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param2, (304 - param2.length() * 6) / 2 + var7, var8 + 22);
            }
            if (null != sj.field_c) {
              var10.setFont(gg.field_k);
              var10.setColor(java.awt.Color.white);
              var10.drawString(sj.field_c, n.field_M / 2 - 6 * sj.field_c.length() / 2, d.field_h / 2 - 26);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            uh.field_b.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("rh.J(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = ll.a(dd.field_c, (byte) -122, mb.field_z);
          if (param1 > -34) {
            field_N = (hl) null;
          }
          if (var2_int == 1) {
            param0 = "<img=0>" + param0;
          }
          if (var2_int == 2) {
            param0 = "<img=1>" + param0;
          }
          stackIn_8_0 = (String) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("rh.L(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static byte a(char param0, boolean param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime1Lifetime1;
        int var2Lifetime1Lifetime2;
        var3 = TetraLink.field_J;
        if (!param1) {
          if (0 < param0 &&
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
            if (8218 == param0) {
              var2Lifetime4 = -126;
            } else {
              if (param0 == 402) {
                var2Lifetime4 = -125;
              } else {
                if (param0 == 8222) {
                  var2Lifetime4 = -124;
                } else {
                  if (param0 == 8230) {
                    var2Lifetime4 = -123;
                  } else {
                    if (param0 == 8224) {
                      var2Lifetime4 = -122;
                    } else {
                      if (param0 == 8225) {
                        var2Lifetime4 = -121;
                      } else {
                        if (param0 == 710) {
                          var2Lifetime4 = -120;
                        } else {
                          if (param0 == 8240) {
                            var2Lifetime4 = -119;
                          } else {
                            if (param0 == 352) {
                              var2Lifetime4 = -118;
                            } else {
                              if (param0 != 8249) {
                                if (338 == param0) {
                                  var2Lifetime4 = -116;
                                } else {
                                  if (param0 == 381) {
                                    var2Lifetime4 = -114;
                                  } else {
                                    if (param0 == 8216) {
                                      var2Lifetime4 = -111;
                                    } else {
                                      if (param0 != 8217) {
                                        if (param0 != 8220) {
                                          if (param0 != 8221) {
                                            if (param0 == 8226) {
                                              var2Lifetime4 = -107;
                                            } else {
                                              if (param0 == 8211) {
                                                var2Lifetime4 = -106;
                                              } else {
                                                if (param0 != 8212) {
                                                  if (param0 == 732) {
                                                    var2Lifetime4 = -104;
                                                  } else {
                                                    if (8482 == param0) {
                                                      var2Lifetime4 = -103;
                                                    } else {
                                                      if (param0 != 353) {
                                                        if (param0 != 8250) {
                                                          if (param0 == 339) {
                                                            var2Lifetime4 = -100;
                                                          } else {
                                                            if (param0 != 382) {
                                                              var2Lifetime4 = (param0 != 376) ? 63 : -97;
                                                            } else {
                                                              var2Lifetime4 = -98;
                                                            }
                                                          }
                                                        } else {
                                                          var2Lifetime4 = -101;
                                                        }
                                                      } else {
                                                        var2Lifetime4 = -102;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2Lifetime4 = -105;
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
                                    }
                                  }
                                }
                              } else {
                                var2Lifetime4 = -117;
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
        field_L = (String) null;
        if (0 < param0) {
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
            if (8218 == param0) {
              var2Lifetime1Lifetime2 = -126;
            } else {
              if (param0 == 402) {
                var2Lifetime1Lifetime2 = -125;
              } else {
                if (param0 == 8222) {
                  var2Lifetime1Lifetime2 = -124;
                } else {
                  if (param0 == 8230) {
                    var2Lifetime1Lifetime2 = -123;
                  } else {
                    if (param0 == 8224) {
                      var2Lifetime1Lifetime2 = -122;
                    } else {
                      if (param0 == 8225) {
                        var2Lifetime1Lifetime2 = -121;
                      } else {
                        if (param0 == 710) {
                          var2Lifetime1Lifetime2 = -120;
                        } else {
                          if (param0 == 8240) {
                            var2Lifetime1Lifetime2 = -119;
                          } else {
                            if (param0 == 352) {
                              var2Lifetime1Lifetime2 = -118;
                            } else {
                              if (param0 != 8249) {
                                if (338 == param0) {
                                  var2Lifetime1Lifetime2 = -116;
                                } else {
                                  if (param0 == 381) {
                                    var2Lifetime1Lifetime2 = -114;
                                  } else {
                                    if (param0 == 8216) {
                                      var2Lifetime1Lifetime2 = -111;
                                    } else {
                                      if (param0 != 8217) {
                                        if (param0 != 8220) {
                                          if (param0 != 8221) {
                                            if (param0 == 8226) {
                                              var2Lifetime1Lifetime2 = -107;
                                            } else {
                                              if (param0 == 8211) {
                                                var2Lifetime1Lifetime2 = -106;
                                              } else {
                                                if (param0 != 8212) {
                                                  if (param0 == 732) {
                                                    var2Lifetime1Lifetime2 = -104;
                                                  } else {
                                                    if (8482 == param0) {
                                                      var2Lifetime1Lifetime2 = -103;
                                                    } else {
                                                      if (param0 != 353) {
                                                        if (param0 != 8250) {
                                                          if (param0 == 339) {
                                                            var2Lifetime1Lifetime2 = -100;
                                                          } else {
                                                            if (param0 != 382) {
                                                              var2Lifetime1Lifetime2 = (param0 != 376) ? 63 : -97;
                                                            } else {
                                                              var2Lifetime1Lifetime2 = -98;
                                                            }
                                                          }
                                                        } else {
                                                          var2Lifetime1Lifetime2 = -101;
                                                        }
                                                      } else {
                                                        var2Lifetime1Lifetime2 = -102;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2Lifetime1Lifetime2 = -105;
                                                }
                                              }
                                            }
                                          } else {
                                            var2Lifetime1Lifetime2 = -108;
                                          }
                                        } else {
                                          var2Lifetime1Lifetime2 = -109;
                                        }
                                      } else {
                                        var2Lifetime1Lifetime2 = -110;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var2Lifetime1Lifetime2 = -117;
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
          return (byte) var2Lifetime1Lifetime2;
        }
        if (param0 < 160) {
          if (param0 == 8364) {
            var2Lifetime2 = -128;
          } else {
            if (8218 == param0) {
              var2Lifetime2 = -126;
            } else {
              if (param0 == 402) {
                var2Lifetime2 = -125;
              } else {
                if (param0 == 8222) {
                  var2Lifetime2 = -124;
                } else {
                  if (param0 == 8230) {
                    var2Lifetime2 = -123;
                  } else {
                    if (param0 == 8224) {
                      var2Lifetime2 = -122;
                    } else {
                      if (param0 == 8225) {
                        var2Lifetime2 = -121;
                      } else {
                        if (param0 == 710) {
                          var2Lifetime2 = -120;
                        } else {
                          if (param0 == 8240) {
                            var2Lifetime2 = -119;
                          } else {
                            if (param0 == 352) {
                              var2Lifetime2 = -118;
                            } else {
                              if (param0 != 8249) {
                                if (338 == param0) {
                                  var2Lifetime2 = -116;
                                } else {
                                  if (param0 == 381) {
                                    var2Lifetime2 = -114;
                                  } else {
                                    if (param0 == 8216) {
                                      var2Lifetime2 = -111;
                                    } else {
                                      if (param0 != 8217) {
                                        if (param0 != 8220) {
                                          if (param0 != 8221) {
                                            if (param0 == 8226) {
                                              var2Lifetime2 = -107;
                                            } else {
                                              if (param0 == 8211) {
                                                var2Lifetime2 = -106;
                                              } else {
                                                if (param0 != 8212) {
                                                  if (param0 == 732) {
                                                    var2Lifetime2 = -104;
                                                  } else {
                                                    if (8482 == param0) {
                                                      var2Lifetime2 = -103;
                                                    } else {
                                                      if (param0 != 353) {
                                                        if (param0 != 8250) {
                                                          if (param0 == 339) {
                                                            var2Lifetime2 = -100;
                                                          } else {
                                                            if (param0 != 382) {
                                                              var2Lifetime2 = (param0 != 376) ? 63 : -97;
                                                            } else {
                                                              var2Lifetime2 = -98;
                                                            }
                                                          }
                                                        } else {
                                                          var2Lifetime2 = -101;
                                                        }
                                                      } else {
                                                        var2Lifetime2 = -102;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2Lifetime2 = -105;
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
                                    }
                                  }
                                }
                              } else {
                                var2Lifetime2 = -117;
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
          if (param0 <= 255) {
            var2Lifetime2 = (byte)param0;
          } else {
            if (param0 == 8364) {
              var2Lifetime2 = -128;
            } else {
              if (8218 == param0) {
                var2Lifetime2 = -126;
              } else {
                if (param0 == 402) {
                  var2Lifetime2 = -125;
                } else {
                  if (param0 == 8222) {
                    var2Lifetime2 = -124;
                  } else {
                    if (param0 == 8230) {
                      var2Lifetime2 = -123;
                    } else {
                      if (param0 == 8224) {
                        var2Lifetime2 = -122;
                      } else {
                        if (param0 == 8225) {
                          var2Lifetime2 = -121;
                        } else {
                          if (param0 == 710) {
                            var2Lifetime2 = -120;
                          } else {
                            if (param0 == 8240) {
                              var2Lifetime2 = -119;
                            } else {
                              if (param0 == 352) {
                                var2Lifetime2 = -118;
                              } else {
                                if (param0 != 8249) {
                                  if (338 == param0) {
                                    var2Lifetime2 = -116;
                                  } else {
                                    if (param0 == 381) {
                                      var2Lifetime2 = -114;
                                    } else {
                                      if (param0 == 8216) {
                                        var2Lifetime2 = -111;
                                      } else {
                                        if (param0 != 8217) {
                                          if (param0 != 8220) {
                                            if (param0 != 8221) {
                                              if (param0 == 8226) {
                                                var2Lifetime2 = -107;
                                              } else {
                                                if (param0 == 8211) {
                                                  var2Lifetime2 = -106;
                                                } else {
                                                  if (param0 != 8212) {
                                                    if (param0 == 732) {
                                                      var2Lifetime2 = -104;
                                                    } else {
                                                      if (8482 == param0) {
                                                        var2Lifetime2 = -103;
                                                      } else {
                                                        if (param0 != 353) {
                                                          if (param0 != 8250) {
                                                            if (param0 == 339) {
                                                              var2Lifetime2 = -100;
                                                            } else {
                                                              if (param0 != 382) {
                                                                var2Lifetime2 = (param0 != 376) ? 63 : -97;
                                                              } else {
                                                                var2Lifetime2 = -98;
                                                              }
                                                            }
                                                          } else {
                                                            var2Lifetime2 = -101;
                                                          }
                                                        } else {
                                                          var2Lifetime2 = -102;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2Lifetime2 = -105;
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
                                      }
                                    }
                                  }
                                } else {
                                  var2Lifetime2 = -117;
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
        return (byte) var2Lifetime2;
    }

    public static void g(int param0) {
        field_N = null;
        field_J = null;
        field_M = null;
        int var1 = 91 / ((-15 - param0) / 54);
        field_F = null;
        field_L = null;
        field_G = null;
    }

    final static String a(int param0, bh param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param1.f((byte) 110);
            if (var3_int > param2) {
              var3_int = param2;
            }
            if (param0 < 109) {
              stackIn_4_0 = (String) null;
              return stackIn_4_0;
            }
            var4 = new byte[var3_int];
            param1.field_t = param1.field_t + ck.field_Z.a(param1.field_u, 0, param1.field_t, var3_int, false, var4);
            var5 = cl.a(-1095, var3_int, var4, 0);
            stackIn_6_0 = var5;
            return stackIn_6_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_8_0 = "Cabbage";
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("rh.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (param0) {
          this.field_I = -36;
          if (null == this.field_K) {
            return 0;
          }
          return 100 * this.field_K.field_t / (this.field_K.field_u.length - this.field_H);
        }
        if (null == this.field_K) {
          return 0;
        }
        return 100 * this.field_K.field_t / (this.field_K.field_u.length - this.field_H);
    }

    final byte[] c(boolean param0) {
        if (this.field_v) {
          throw new RuntimeException();
        }
        if (this.field_K.field_t < this.field_K.field_u.length - this.field_H) {
          throw new RuntimeException();
        }
        if (param0) {
          return this.field_K.field_u;
        }
        return (byte[]) null;
    }

    rh() {
    }

    static {
        field_L = "Waiting for textures";
        field_J = "Please remove <%0> from your ignore list first.";
    }
}
