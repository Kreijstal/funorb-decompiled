/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rb {
    static int field_a;
    static wb field_b;

    final static void a(byte param0) {
        try {
            if (param0 != -114) {
                field_a = 53;
            }
            if (!(ah.field_b == null)) {
                try {
                    ah.field_b.a(0L, (byte) -127);
                    ah.field_b.a(nf.field_l.field_g, 24, (byte) 118, nf.field_l.field_h);
                } catch (Exception exception) {
                }
            }
            nf.field_l.field_h = nf.field_l.field_h + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = Transmogrify.field_A ? 1 : 0;
        ng var4 = (ng) (Object) kf.field_o.a((byte) -95);
        while (var4 != null) {
            th.a(65536, param0, var4);
            var4 = (ng) (Object) kf.field_o.a(true);
        }
        if (param1 >= -77) {
            rb.a(-91, -27);
        }
    }

    final static int a(int param0, CharSequence param1, byte[] param2, int param3, byte param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        var6 = param3 - param5;
        var7 = 0;
        L0: while (true) {
          L1: {
            if (var7 >= var6) {
              break L1;
            } else {
              L2: {
                L3: {
                  L4: {
                    var8 = param1.charAt(var7 + param5);
                    if (var8 <= 0) {
                      break L4;
                    } else {
                      if (128 > var8) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var8 < 160) {
                      break L5;
                    } else {
                      if (var8 <= 255) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (var8 != 8364) {
                      break L6;
                    } else {
                      param2[var7 + param0] = (byte)-128;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (8218 == var8) {
                      break L7;
                    } else {
                      L8: {
                        if (var8 != 402) {
                          break L8;
                        } else {
                          param2[param0 - -var7] = (byte)-125;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (var8 != 8222) {
                          break L9;
                        } else {
                          param2[var7 + param0] = (byte)-124;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var8 == 8230) {
                          break L10;
                        } else {
                          L11: {
                            if (8224 != var8) {
                              break L11;
                            } else {
                              param2[param0 + var7] = (byte)-122;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (var8 != 8225) {
                              break L12;
                            } else {
                              param2[var7 + param0] = (byte)-121;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (var8 != 710) {
                              break L13;
                            } else {
                              param2[var7 + param0] = (byte)-120;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (var8 == 8240) {
                              break L14;
                            } else {
                              L15: {
                                if (var8 == 352) {
                                  break L15;
                                } else {
                                  L16: {
                                    if (8249 == var8) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if (var8 != 338) {
                                          break L17;
                                        } else {
                                          param2[var7 + param0] = (byte)-116;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      L18: {
                                        if (var8 != 381) {
                                          break L18;
                                        } else {
                                          param2[param0 + var7] = (byte)-114;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      L19: {
                                        if (var8 == 8216) {
                                          break L19;
                                        } else {
                                          L20: {
                                            if (var8 == 8217) {
                                              break L20;
                                            } else {
                                              L21: {
                                                if (var8 != 8220) {
                                                  break L21;
                                                } else {
                                                  param2[var7 + param0] = (byte)-109;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              L22: {
                                                if (var8 == 8221) {
                                                  break L22;
                                                } else {
                                                  L23: {
                                                    if (8226 != var8) {
                                                      break L23;
                                                    } else {
                                                      param2[param0 - -var7] = (byte)-107;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  L24: {
                                                    if (var8 != 8211) {
                                                      break L24;
                                                    } else {
                                                      param2[var7 + param0] = (byte)-106;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                  }
                                                  L25: {
                                                    if (var8 == 8212) {
                                                      break L25;
                                                    } else {
                                                      L26: {
                                                        if (var8 != 732) {
                                                          break L26;
                                                        } else {
                                                          param2[param0 + var7] = (byte)-104;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L26;
                                                          }
                                                        }
                                                      }
                                                      L27: {
                                                        if (8482 == var8) {
                                                          break L27;
                                                        } else {
                                                          L28: {
                                                            if (353 == var8) {
                                                              break L28;
                                                            } else {
                                                              L29: {
                                                                if (var8 == 8250) {
                                                                  break L29;
                                                                } else {
                                                                  L30: {
                                                                    if (var8 == 339) {
                                                                      break L30;
                                                                    } else {
                                                                      L31: {
                                                                        if (var8 == 382) {
                                                                          break L31;
                                                                        } else {
                                                                          L32: {
                                                                            if (var8 == 376) {
                                                                              break L32;
                                                                            } else {
                                                                              param2[var7 + param0] = (byte)63;
                                                                              if (0 == 0) {
                                                                                break L2;
                                                                              } else {
                                                                                break L32;
                                                                              }
                                                                            }
                                                                          }
                                                                          param2[param0 + var7] = (byte)-97;
                                                                          if (0 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      param2[var7 + param0] = (byte)-98;
                                                                      if (0 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L30;
                                                                      }
                                                                    }
                                                                  }
                                                                  param2[param0 + var7] = (byte)-100;
                                                                  if (0 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L29;
                                                                  }
                                                                }
                                                              }
                                                              param2[param0 - -var7] = (byte)-101;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L28;
                                                              }
                                                            }
                                                          }
                                                          param2[var7 + param0] = (byte)-102;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L27;
                                                          }
                                                        }
                                                      }
                                                      param2[var7 + param0] = (byte)-103;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                  }
                                                  param2[param0 + var7] = (byte)-105;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                              param2[var7 + param0] = (byte)-108;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          param2[var7 + param0] = (byte)-110;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      param2[var7 + param0] = (byte)-111;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  param2[var7 + param0] = (byte)-117;
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              param2[param0 + var7] = (byte)-118;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L14;
                              }
                            }
                          }
                          param2[var7 + param0] = (byte)-119;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L10;
                          }
                        }
                      }
                      param2[var7 + param0] = (byte)-123;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param2[var7 + param0] = (byte)-126;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                param2[param0 - -var7] = (byte)var8;
                break L2;
              }
              var7++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          if (param4 == -116) {
            return var6;
          } else {
            return 29;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            IOException var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (nk.field_b == null) {
                break L0;
              } else {
                L1: {
                  L2: {
                    if (param0 >= 0) {
                      if (ll.field_Q != lj.field_z) {
                        break L0;
                      } else {
                        if (ff.field_D.field_h != 0) {
                          break L2;
                        } else {
                          if ((10000L + td.field_b ^ -1L) <= (lk.a(0) ^ -1L)) {
                            break L2;
                          } else {
                            ff.field_D.a(false, param0);
                            if (param1 == -377) {
                              break L1;
                            } else {
                              rb.a(81, (byte) 3);
                              break L1;
                            }
                          }
                        }
                      }
                    } else {
                      if (ff.field_D.field_h != 0) {
                        break L2;
                      } else {
                        if ((10000L + td.field_b ^ -1L) <= (lk.a(0) ^ -1L)) {
                          break L2;
                        } else {
                          ff.field_D.a(false, param0);
                          if (param1 == -377) {
                            break L1;
                          } else {
                            rb.a(81, (byte) 3);
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  if (param1 == -377) {
                    break L1;
                  } else {
                    rb.a(81, (byte) 3);
                    break L1;
                  }
                }
                L3: {
                  if (-1 <= (ff.field_D.field_h ^ -1)) {
                    break L3;
                  } else {
                    try {
                      nk.field_b.a((byte) 9, ff.field_D.field_g, ff.field_D.field_h, 0);
                      td.field_b = lk.a(0);
                    } catch (java.io.IOException decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                    }
                    var2 = (IOException) (Object) decompiledCaughtException;
                    pc.a(1);
                    break L3;
                  }
                }
                ff.field_D.field_h = 0;
              }
            }
            ff.field_D.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (param1 != null) {
          L0: {
            var3 = param1.length();
            if (param0 < -63) {
              break L0;
            } else {
              rb.a(-55);
              break L0;
            }
          }
          L1: {
            if (1 > var3) {
              break L1;
            } else {
              if (var3 >= -13) {
                L2: {
                  var4 = hj.a((byte) -125, param1);
                  if (var4 == null) {
                    break L2;
                  } else {
                    if (-2 <= var4.length()) {
                      L3: {
                        if (uf.a(var4.charAt(0), (byte) -96)) {
                          break L3;
                        } else {
                          if (!uf.a(var4.charAt(-1 + var4.length()), (byte) -128)) {
                            var5 = 0;
                            var6 = 0;
                            L4: while (true) {
                              if (param1.length() <= var6) {
                                if (-1 > (var5 ^ -1)) {
                                  return kd.field_d;
                                } else {
                                  return null;
                                }
                              } else {
                                L5: {
                                  var7 = param1.charAt(var6);
                                  if (uf.a((char) var7, (byte) -98)) {
                                    var5++;
                                    break L5;
                                  } else {
                                    var5 = 0;
                                    break L5;
                                  }
                                }
                                if (var5 >= 2) {
                                  if (!param2) {
                                    return ng.field_g;
                                  } else {
                                    var6++;
                                    continue L4;
                                  }
                                } else {
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      return kd.field_d;
                    } else {
                      break L2;
                    }
                  }
                }
                return se.field_o;
              } else {
                break L1;
              }
            }
          }
          return se.field_o;
        } else {
          return se.field_o;
        }
    }

    public static void a(int param0) {
        if (param0 > -23) {
            field_b = null;
        }
        field_b = null;
    }

    static {
    }
}
