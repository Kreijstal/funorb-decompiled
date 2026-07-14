/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends q {
    int field_k;
    static sm[] field_l;
    byte[] field_j;

    final static void a(nj param0, boolean param1) {
        Object var2 = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = (Object) (Object) Torquing.field_v;
                    // monitorenter Torquing.field_v
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        Torquing.field_v.field_r.b((lf) (Object) param0);
                        if (param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_l = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var2
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var3;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, CharSequence param1, int param2, int param3, byte[] param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Torquing.field_u;
          var6 = -param2 + param5;
          if (param3 == -12421) {
            break L0;
          } else {
            field_l = null;
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          L2: {
            if (var7 >= var6) {
              break L2;
            } else {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      var8 = param1.charAt(var7 + param2);
                      if ((var8 ^ -1) >= -1) {
                        break L6;
                      } else {
                        if (var8 < 128) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var8 < 160) {
                      break L4;
                    } else {
                      if (var8 > 255) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  param4[var7 + param0] = (byte)var8;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (var8 == 8364) {
                    break L7;
                  } else {
                    L8: {
                      if (var8 != 8218) {
                        break L8;
                      } else {
                        param4[var7 + param0] = (byte)-126;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (402 != var8) {
                        break L9;
                      } else {
                        param4[param0 + var7] = (byte)-125;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var8 != 8222) {
                        break L10;
                      } else {
                        param4[param0 - -var7] = (byte)-124;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var8 != 8230) {
                        break L11;
                      } else {
                        param4[param0 + var7] = (byte)-123;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (8224 == var8) {
                        break L12;
                      } else {
                        L13: {
                          if (var8 == 8225) {
                            break L13;
                          } else {
                            L14: {
                              if (var8 == 710) {
                                break L14;
                              } else {
                                L15: {
                                  if (8240 != var8) {
                                    break L15;
                                  } else {
                                    param4[var7 + param0] = (byte)-119;
                                    if (0 == 0) {
                                      break L3;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                L16: {
                                  if (352 != var8) {
                                    break L16;
                                  } else {
                                    param4[var7 + param0] = (byte)-118;
                                    if (0 == 0) {
                                      break L3;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                L17: {
                                  if (8249 == var8) {
                                    break L17;
                                  } else {
                                    L18: {
                                      if (var8 == 338) {
                                        break L18;
                                      } else {
                                        L19: {
                                          if (381 == var8) {
                                            break L19;
                                          } else {
                                            L20: {
                                              if (var8 != 8216) {
                                                break L20;
                                              } else {
                                                param4[param0 + var7] = (byte)-111;
                                                if (0 == 0) {
                                                  break L3;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            L21: {
                                              if (8217 == var8) {
                                                break L21;
                                              } else {
                                                L22: {
                                                  if (var8 != 8220) {
                                                    break L22;
                                                  } else {
                                                    param4[param0 + var7] = (byte)-109;
                                                    if (0 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                L23: {
                                                  if (var8 != 8221) {
                                                    break L23;
                                                  } else {
                                                    param4[var7 + param0] = (byte)-108;
                                                    if (0 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                                L24: {
                                                  if (var8 == 8226) {
                                                    break L24;
                                                  } else {
                                                    L25: {
                                                      if (var8 != 8211) {
                                                        break L25;
                                                      } else {
                                                        param4[param0 - -var7] = (byte)-106;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    L26: {
                                                      if (var8 == 8212) {
                                                        break L26;
                                                      } else {
                                                        L27: {
                                                          if (var8 != 732) {
                                                            break L27;
                                                          } else {
                                                            param4[var7 + param0] = (byte)-104;
                                                            if (0 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L27;
                                                            }
                                                          }
                                                        }
                                                        L28: {
                                                          if (var8 != 8482) {
                                                            break L28;
                                                          } else {
                                                            param4[param0 + var7] = (byte)-103;
                                                            if (0 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L28;
                                                            }
                                                          }
                                                        }
                                                        L29: {
                                                          if (var8 != 353) {
                                                            break L29;
                                                          } else {
                                                            param4[var7 + param0] = (byte)-102;
                                                            if (0 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L29;
                                                            }
                                                          }
                                                        }
                                                        L30: {
                                                          if (8250 == var8) {
                                                            break L30;
                                                          } else {
                                                            L31: {
                                                              if (var8 == 339) {
                                                                break L31;
                                                              } else {
                                                                L32: {
                                                                  if (382 == var8) {
                                                                    break L32;
                                                                  } else {
                                                                    L33: {
                                                                      if (var8 == 376) {
                                                                        break L33;
                                                                      } else {
                                                                        param4[var7 + param0] = (byte)63;
                                                                        if (0 == 0) {
                                                                          break L3;
                                                                        } else {
                                                                          break L33;
                                                                        }
                                                                      }
                                                                    }
                                                                    param4[param0 - -var7] = (byte)-97;
                                                                    if (0 == 0) {
                                                                      break L3;
                                                                    } else {
                                                                      break L32;
                                                                    }
                                                                  }
                                                                }
                                                                param4[var7 + param0] = (byte)-98;
                                                                if (0 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  break L31;
                                                                }
                                                              }
                                                            }
                                                            param4[param0 + var7] = (byte)-100;
                                                            if (0 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L30;
                                                            }
                                                          }
                                                        }
                                                        param4[var7 + param0] = (byte)-101;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L26;
                                                        }
                                                      }
                                                    }
                                                    param4[var7 + param0] = (byte)-105;
                                                    if (0 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                                param4[var7 + param0] = (byte)-107;
                                                if (0 == 0) {
                                                  break L3;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                            param4[param0 - -var7] = (byte)-110;
                                            if (0 == 0) {
                                              break L3;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        param4[var7 + param0] = (byte)-114;
                                        if (0 == 0) {
                                          break L3;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    param4[param0 + var7] = (byte)-116;
                                    if (0 == 0) {
                                      break L3;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                param4[param0 - -var7] = (byte)-117;
                                if (0 == 0) {
                                  break L3;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            param4[param0 + var7] = (byte)-120;
                            if (0 == 0) {
                              break L3;
                            } else {
                              break L13;
                            }
                          }
                        }
                        param4[param0 - -var7] = (byte)-121;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L12;
                        }
                      }
                    }
                    param4[param0 - -var7] = (byte)-122;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L7;
                    }
                  }
                }
                param4[param0 - -var7] = (byte)-128;
                break L3;
              }
              var7++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return var6;
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2, long param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            Object var8 = null;
            String var9 = null;
            String var10 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var9 = param1.getParameter("cookiehost");
                var7 = var9;
                var7 = var9;
                var10 = param4 + "=" + param2 + "; version=1; path=/; domain=" + var9;
                var7 = var10;
                var7 = var10;
                if (param0 >= 69) {
                  break L0;
                } else {
                  var8 = null;
                  ni.a((nj) null, false);
                  break L0;
                }
              }
              L1: {
                if (param3 >= 0L) {
                  var7 = var10 + "; Expires=" + ka.a(param3 * 1000L + km.b(-1), -2) + "; Max-Age=" + param3;
                  break L1;
                } else {
                  var7 = var10 + "; Discard;";
                  break L1;
                }
              }
              hp.a("document.cookie=\"" + var7 + "\"", 27476, param1);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static k a(int param0, int param1) {
        k[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        k[] var5 = null;
        var4 = Torquing.field_u;
        var5 = vc.c(0);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length <= var3) {
            if (param0 >= 74) {
              return null;
            } else {
              field_l = null;
              return null;
            }
          } else {
            if (var5[var3].field_g != param1) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          }
        }
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 >= -25) {
            field_l = null;
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param0.getGraphics();
            mk.field_b.a(86, param2, param1, var4);
            var4.dispose();
            int var5 = -27 / ((69 - param3) / 50);
        } catch (Exception exception) {
            param0.repaint();
        }
    }

    private ni() throws Throwable {
        throw new Error();
    }

    static {
    }
}
