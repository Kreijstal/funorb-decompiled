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
        int var2 = 0;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        mh var7 = null;
        int var8 = 0;
        var8 = TetraLink.field_J;
        var2 = param1.length();
        if (var2 != 0) {
          if ((var2 ^ -1) >= -256) {
            var3 = hi.a(param1, '.', param0 + 781);
            if (var3.length < param0) {
              return c.field_o;
            } else {
              var4 = var3;
              var5 = 0;
              L0: while (true) {
                if (var4.length > var5) {
                  var6 = var4[var5];
                  var7 = sd.a(param0 ^ 28, var6);
                  if (var7 != null) {
                    return var7;
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  return rf.a(-1723, var3[-1 + var3.length]);
                }
              }
            }
          } else {
            return nb.field_V;
          }
        } else {
          return c.field_o;
        }
    }

    final static void a(java.awt.Color param0, int param1, String param2, byte param3, boolean param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var10 = uh.field_b.getGraphics();
              if (null == gg.field_k) {
                gg.field_k = new java.awt.Font("Helvetica", 1, 13);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 >= 68) {
                break L2;
              } else {
                var9 = null;
                mh discarded$2 = rh.b(4, (String) null);
                break L2;
              }
            }
            L3: {
              if (param4) {
                var10.setColor(java.awt.Color.black);
                var10.fillRect(0, 0, n.field_M, d.field_h);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0 != null) {
                break L4;
              } else {
                param0 = new java.awt.Color(140, 17, 17);
                break L4;
              }
            }
            try {
              L5: {
                L6: {
                  if (wm.field_p == null) {
                    wm.field_p = uh.field_b.createImage(304, 34);
                    break L6;
                  } else {
                    break L6;
                  }
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
                boolean discarded$3 = var10.drawImage(wm.field_p, n.field_M / 2 - 152, d.field_h / 2 - 18, (java.awt.image.ImageObserver) null);
                break L5;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
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
                break L7;
              }
            }
            L8: {
              if (null == sj.field_c) {
                break L8;
              } else {
                var10.setFont(gg.field_k);
                var10.setColor(java.awt.Color.white);
                var10.drawString(sj.field_c, n.field_M / 2 - 6 * sj.field_c.length() / 2, d.field_h / 2 - 26);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var5 = (Exception) (Object) decompiledCaughtException;
            uh.field_b.repaint();
            break L9;
          }
        }
    }

    final static String a(String param0, int param1) {
        int var2 = 0;
        var2 = ll.a(dd.field_c, (byte) -122, mb.field_z);
        if (param1 > -34) {
          L0: {
            field_N = null;
            if (-2 == (var2 ^ -1)) {
              param0 = "<img=0>" + param0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var2 != 2) {
              break L1;
            } else {
              param0 = "<img=1>" + param0;
              break L1;
            }
          }
          return param0;
        } else {
          L2: {
            if (-2 == (var2 ^ -1)) {
              param0 = "<img=0>" + param0;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var2 != 2) {
              break L3;
            } else {
              param0 = "<img=1>" + param0;
              break L3;
            }
          }
          return param0;
        }
    }

    final static byte a(char param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TetraLink.field_J;
        if (param1) {
          field_L = null;
          if (0 < param0) {
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
                if (8218 != param0) {
                  if (param0 != 402) {
                    if (param0 != 8222) {
                      if (param0 != 8230) {
                        if (param0 != 8224) {
                          if (param0 != 8225) {
                            if (param0 == 710) {
                              var2 = -120;
                              return (byte) var2;
                            } else {
                              if (param0 == 8240) {
                                var2 = -119;
                                return (byte) var2;
                              } else {
                                if (param0 == 352) {
                                  var2 = -118;
                                  return (byte) var2;
                                } else {
                                  L1: {
                                    if (param0 != 8249) {
                                      if (338 == param0) {
                                        var2 = -116;
                                        return (byte) var2;
                                      } else {
                                        if (param0 == 381) {
                                          var2 = -114;
                                          return (byte) var2;
                                        } else {
                                          if (param0 == 8216) {
                                            var2 = -111;
                                            return (byte) var2;
                                          } else {
                                            if (param0 != 8217) {
                                              if (param0 != 8220) {
                                                if (param0 != 8221) {
                                                  if (param0 == 8226) {
                                                    var2 = -107;
                                                    return (byte) var2;
                                                  } else {
                                                    if (param0 == 8211) {
                                                      var2 = -106;
                                                      return (byte) var2;
                                                    } else {
                                                      if (param0 != 8212) {
                                                        if (param0 == 732) {
                                                          var2 = -104;
                                                          return (byte) var2;
                                                        } else {
                                                          if (8482 == param0) {
                                                            var2 = -103;
                                                            return (byte) var2;
                                                          } else {
                                                            if (param0 != 353) {
                                                              if (param0 != 8250) {
                                                                if (param0 == 339) {
                                                                  var2 = -100;
                                                                  return (byte) var2;
                                                                } else {
                                                                  if (param0 != 382) {
                                                                    if (param0 != 376) {
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
                                                                }
                                                              } else {
                                                                var2 = -101;
                                                                break L1;
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L1;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L1;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L1;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var2 = -117;
                                      break L1;
                                    }
                                  }
                                  return (byte) var2;
                                }
                              }
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
                        return (byte) var2;
                      }
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
            if (param0 >= 160) {
              if (param0 > 255) {
                if (param0 != 8364) {
                  if (8218 != param0) {
                    if (param0 != 402) {
                      if (param0 != 8222) {
                        if (param0 != 8230) {
                          if (param0 == 8224) {
                            var2 = -122;
                            return (byte) var2;
                          } else {
                            L2: {
                              if (param0 == 8225) {
                                var2 = -121;
                                break L2;
                              } else {
                                if (param0 == 710) {
                                  var2 = -120;
                                  break L2;
                                } else {
                                  if (param0 == 8240) {
                                    var2 = -119;
                                    break L2;
                                  } else {
                                    if (param0 == 352) {
                                      var2 = -118;
                                      break L2;
                                    } else {
                                      if (param0 != 8249) {
                                        if (338 == param0) {
                                          var2 = -116;
                                          break L2;
                                        } else {
                                          if (param0 == 381) {
                                            var2 = -114;
                                            break L2;
                                          } else {
                                            if (param0 == 8216) {
                                              var2 = -111;
                                              break L2;
                                            } else {
                                              if (param0 != 8217) {
                                                if (param0 != 8220) {
                                                  if (param0 != 8221) {
                                                    if (param0 == 8226) {
                                                      var2 = -107;
                                                      break L2;
                                                    } else {
                                                      if (param0 == 8211) {
                                                        var2 = -106;
                                                        break L2;
                                                      } else {
                                                        if (param0 != 8212) {
                                                          if (param0 == 732) {
                                                            var2 = -104;
                                                            break L2;
                                                          } else {
                                                            if (8482 == param0) {
                                                              var2 = -103;
                                                              break L2;
                                                            } else {
                                                              if (param0 != 353) {
                                                                if (param0 != 8250) {
                                                                  if (param0 == 339) {
                                                                    var2 = -100;
                                                                    break L2;
                                                                  } else {
                                                                    if (param0 != 382) {
                                                                      if (param0 != 376) {
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
                                                                  }
                                                                } else {
                                                                  var2 = -101;
                                                                  break L2;
                                                                }
                                                              } else {
                                                                var2 = -102;
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -105;
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    break L2;
                                                  }
                                                } else {
                                                  var2 = -109;
                                                  break L2;
                                                }
                                              } else {
                                                var2 = -110;
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var2 = -117;
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            return (byte) var2;
                          }
                        } else {
                          var2 = -123;
                          return (byte) var2;
                        }
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
                if (8218 != param0) {
                  if (param0 != 402) {
                    if (param0 != 8222) {
                      if (param0 != 8230) {
                        if (param0 == 8224) {
                          var2 = -122;
                          return (byte) var2;
                        } else {
                          L3: {
                            if (param0 == 8225) {
                              var2 = -121;
                              break L3;
                            } else {
                              if (param0 == 710) {
                                var2 = -120;
                                break L3;
                              } else {
                                if (param0 == 8240) {
                                  var2 = -119;
                                  break L3;
                                } else {
                                  if (param0 == 352) {
                                    var2 = -118;
                                    break L3;
                                  } else {
                                    if (param0 != 8249) {
                                      if (338 == param0) {
                                        var2 = -116;
                                        break L3;
                                      } else {
                                        if (param0 == 381) {
                                          var2 = -114;
                                          break L3;
                                        } else {
                                          if (param0 == 8216) {
                                            var2 = -111;
                                            break L3;
                                          } else {
                                            if (param0 != 8217) {
                                              if (param0 != 8220) {
                                                if (param0 != 8221) {
                                                  if (param0 == 8226) {
                                                    var2 = -107;
                                                    break L3;
                                                  } else {
                                                    if (param0 == 8211) {
                                                      var2 = -106;
                                                      break L3;
                                                    } else {
                                                      if (param0 != 8212) {
                                                        if (param0 == 732) {
                                                          var2 = -104;
                                                          break L3;
                                                        } else {
                                                          if (8482 == param0) {
                                                            var2 = -103;
                                                            break L3;
                                                          } else {
                                                            if (param0 != 353) {
                                                              if (param0 != 8250) {
                                                                if (param0 == 339) {
                                                                  var2 = -100;
                                                                  break L3;
                                                                } else {
                                                                  if (param0 != 382) {
                                                                    if (param0 != 376) {
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
                                                                }
                                                              } else {
                                                                var2 = -101;
                                                                break L3;
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L3;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L3;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L3;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L3;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L3;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var2 = -117;
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          return (byte) var2;
                        }
                      } else {
                        var2 = -123;
                        return (byte) var2;
                      }
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
            if (0 >= param0) {
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
            if (8218 != param0) {
              if (param0 != 402) {
                if (param0 != 8222) {
                  if (param0 != 8230) {
                    if (param0 == 8224) {
                      var2 = -122;
                      return (byte) var2;
                    } else {
                      L6: {
                        if (param0 == 8225) {
                          var2 = -121;
                          break L6;
                        } else {
                          if (param0 == 710) {
                            var2 = -120;
                            break L6;
                          } else {
                            if (param0 == 8240) {
                              var2 = -119;
                              break L6;
                            } else {
                              if (param0 == 352) {
                                var2 = -118;
                                break L6;
                              } else {
                                if (param0 != 8249) {
                                  if (338 == param0) {
                                    var2 = -116;
                                    break L6;
                                  } else {
                                    if (param0 == 381) {
                                      var2 = -114;
                                      break L6;
                                    } else {
                                      if (param0 == 8216) {
                                        var2 = -111;
                                        break L6;
                                      } else {
                                        if (param0 != 8217) {
                                          if (param0 != 8220) {
                                            if (param0 != 8221) {
                                              if (param0 == 8226) {
                                                var2 = -107;
                                                break L6;
                                              } else {
                                                if (param0 == 8211) {
                                                  var2 = -106;
                                                  break L6;
                                                } else {
                                                  if (param0 != 8212) {
                                                    if (param0 == 732) {
                                                      var2 = -104;
                                                      break L6;
                                                    } else {
                                                      if (8482 == param0) {
                                                        var2 = -103;
                                                        break L6;
                                                      } else {
                                                        if (param0 != 353) {
                                                          if (param0 != 8250) {
                                                            if (param0 == 339) {
                                                              var2 = -100;
                                                              break L6;
                                                            } else {
                                                              if (param0 != 382) {
                                                                if (param0 != 376) {
                                                                  var2 = 63;
                                                                  break L6;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L6;
                                                                }
                                                              } else {
                                                                var2 = -98;
                                                                break L6;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L6;
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L6;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L6;
                                                  }
                                                }
                                              }
                                            } else {
                                              var2 = -108;
                                              break L6;
                                            }
                                          } else {
                                            var2 = -109;
                                            break L6;
                                          }
                                        } else {
                                          var2 = -110;
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                      }
                      return (byte) var2;
                    }
                  } else {
                    var2 = -123;
                    return (byte) var2;
                  }
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
        byte[] var4 = null;
        String var5 = null;
        Object stackIn_4_0 = null;
        String stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.f((byte) 110);
              if (var3_int <= param2) {
                break L1;
              } else {
                var3_int = param2;
                break L1;
              }
            }
            if (param0 >= 109) {
              var4 = new byte[var3_int];
              param1.field_t = param1.field_t + ck.field_Z.a(param1.field_u, 0, param1.field_t, var3_int, false, var4);
              var5 = cl.a(-1095, var3_int, var4, 0);
              stackOut_5_0 = (String) var5;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          return "Cabbage";
        }
        return stackIn_6_0;
    }

    final int a(boolean param0) {
        if (param0) {
            ((rh) this).field_I = -36;
            if (!(null != ((rh) this).field_K)) {
                return 0;
            }
            return 100 * ((rh) this).field_K.field_t / (((rh) this).field_K.field_u.length + -((rh) this).field_H);
        }
        if (!(null != ((rh) this).field_K)) {
            return 0;
        }
        return 100 * ((rh) this).field_K.field_t / (((rh) this).field_K.field_u.length + -((rh) this).field_H);
    }

    final byte[] c(boolean param0) {
        if (!((rh) this).field_v) {
          if (((rh) this).field_K.field_t >= ((rh) this).field_K.field_u.length - ((rh) this).field_H) {
            if (!param0) {
              return null;
            } else {
              return ((rh) this).field_K.field_u;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    rh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Waiting for textures";
        field_J = "Please remove <%0> from your ignore list first.";
    }
}
