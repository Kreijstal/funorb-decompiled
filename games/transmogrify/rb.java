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
        int var3 = 0;
        ng var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (ng) ((Object) kf.field_o.a((byte) -95));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 < -77) {
                    break L2;
                  } else {
                    rb.a(-91, -27);
                    break L2;
                  }
                }
                break L0;
              } else {
                th.a(65536, param0, var4);
                var4 = (ng) ((Object) kf.field_o.a(true));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "rb.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, CharSequence param1, byte[] param2, int param3, byte param4, int param5) {
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var6_int = param3 - param5;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6_int) {
                if (param4 == -116) {
                  stackIn_70_0 = var6_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_68_0 = 29;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
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
                    if (var8 != 8364) {
                      if (8218 == var8) {
                        param2[var7 + param0] = (byte)-126;
                        break L2;
                      } else {
                        if (var8 != 402) {
                          if (var8 != 8222) {
                            if (var8 == 8230) {
                              param2[var7 + param0] = (byte)-123;
                              break L2;
                            } else {
                              if (8224 != var8) {
                                if (var8 != 8225) {
                                  if (var8 != 710) {
                                    if (var8 == 8240) {
                                      param2[var7 + param0] = (byte)-119;
                                      break L2;
                                    } else {
                                      if (var8 == 352) {
                                        param2[param0 + var7] = (byte)-118;
                                        break L2;
                                      } else {
                                        if (8249 == var8) {
                                          param2[var7 + param0] = (byte)-117;
                                          break L2;
                                        } else {
                                          if (var8 != 338) {
                                            if (var8 != 381) {
                                              if (var8 == 8216) {
                                                param2[var7 + param0] = (byte)-111;
                                                break L2;
                                              } else {
                                                if (var8 == 8217) {
                                                  param2[var7 + param0] = (byte)-110;
                                                  break L2;
                                                } else {
                                                  if (var8 != 8220) {
                                                    if (var8 == 8221) {
                                                      param2[var7 + param0] = (byte)-108;
                                                      break L2;
                                                    } else {
                                                      if (8226 != var8) {
                                                        if (var8 != 8211) {
                                                          if (var8 == 8212) {
                                                            param2[param0 + var7] = (byte)-105;
                                                            break L2;
                                                          } else {
                                                            if (var8 != 732) {
                                                              if (8482 == var8) {
                                                                param2[var7 + param0] = (byte)-103;
                                                                break L2;
                                                              } else {
                                                                if (353 == var8) {
                                                                  param2[var7 + param0] = (byte)-102;
                                                                  break L2;
                                                                } else {
                                                                  if (var8 == 8250) {
                                                                    param2[param0 - -var7] = (byte)-101;
                                                                    break L2;
                                                                  } else {
                                                                    if (var8 == 339) {
                                                                      param2[param0 + var7] = (byte)-100;
                                                                      break L2;
                                                                    } else {
                                                                      if (var8 == 382) {
                                                                        param2[var7 + param0] = (byte)-98;
                                                                        break L2;
                                                                      } else {
                                                                        if (var8 == 376) {
                                                                          param2[param0 + var7] = (byte)-97;
                                                                          break L2;
                                                                        } else {
                                                                          param2[var7 + param0] = (byte)63;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              param2[param0 + var7] = (byte)-104;
                                                              break L2;
                                                            }
                                                          }
                                                        } else {
                                                          param2[var7 + param0] = (byte)-106;
                                                          break L2;
                                                        }
                                                      } else {
                                                        param2[param0 - -var7] = (byte)-107;
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    param2[var7 + param0] = (byte)-109;
                                                    break L2;
                                                  }
                                                }
                                              }
                                            } else {
                                              param2[param0 + var7] = (byte)-114;
                                              break L2;
                                            }
                                          } else {
                                            param2[var7 + param0] = (byte)-116;
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    param2[var7 + param0] = (byte)-120;
                                    break L2;
                                  }
                                } else {
                                  param2[var7 + param0] = (byte)-121;
                                  break L2;
                                }
                              } else {
                                param2[param0 + var7] = (byte)-122;
                                break L2;
                              }
                            }
                          } else {
                            param2[var7 + param0] = (byte)-124;
                            break L2;
                          }
                        } else {
                          param2[param0 - -var7] = (byte)-125;
                          break L2;
                        }
                      }
                    } else {
                      param2[var7 + param0] = (byte)-128;
                      break L2;
                    }
                  }
                  param2[param0 - -var7] = (byte)var8;
                  break L2;
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var6);

            stackIn_73_1 = new StringBuilder().append("rb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L6;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');

            if (param2 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L7;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_74_0), stackIn_77_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_68_0;
        } else {
          return stackIn_70_0;
        }
    }

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
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
                      L4: {
                        nk.field_b.a((byte) 9, ff.field_D.field_g, ff.field_D.field_h, 0);
                        td.field_b = lk.a(0);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var2 = (IOException) (Object) decompiledCaughtException;
                        pc.a(1);
                        break L5;
                      }
                    }
                    ff.field_D.field_h = 0;
                    break L3;
                  }
                }
                return;
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
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (param0 < -63) {
                  break L1;
                } else {
                  rb.a(-55);
                  break L1;
                }
              }
              L2: {
                if (1 > var3_int) {
                  break L2;
                } else {
                  if ((var3_int ^ -1) >= -13) {
                    L3: {
                      var4 = hj.a((byte) -125, param1);
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (-2 >= (var4.length() ^ -1)) {
                          L4: {
                            if (uf.a(var4.charAt(0), (byte) -96)) {
                              break L4;
                            } else {
                              if (!uf.a(var4.charAt(-1 + var4.length()), (byte) -128)) {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  if (param1.length() <= var6) {
                                    if (-1 > (var5 ^ -1)) {
                                      stackIn_35_0 = kd.field_d;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param1.charAt(var6);
                                      if (uf.a((char) var7, (byte) -98)) {
                                        var5++;
                                        break L6;
                                      } else {
                                        var5 = 0;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (var5 < 2) {
                                        break L7;
                                      } else {
                                        if (!param2) {
                                          stackIn_30_0 = ng.field_g;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          stackIn_20_0 = kd.field_d;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackIn_15_0 = se.field_o;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_10_0 = se.field_o;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = se.field_o;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("rb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L8;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0;
                } else {
                  return stackIn_35_0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 > -23) {
            field_b = (wb) null;
        }
        field_b = null;
    }

    static {
    }
}
