/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static ok field_c;
    static int field_d;
    static int field_b;
    static String field_a;

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 83) {
            field_d = 125;
          }
          stackIn_3_0 = bi.a(0, param1.length, param1, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("nf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, o[] param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = wizardrun.field_H;
        try {
          if (param4 != null &&
            param2 > 0) {
            var5_int = param4[0].field_x;
            var6 = param4[2].field_x;
            if (param3 > -31) {
              nf.b(38);
            }
            var7 = param4[1].field_x;
            param4[0].e(param0, param1);
            param4[2].e(param2 + param0 - var6, param1);
            ed.b(ac.field_q);
            ed.b(var5_int + param0, param1, param0 + param2 - var6, param4[1].field_s + param1);
            var8 = var5_int + param0;
            var9 = -var6 + param0 + param2;
            for (param0 = var8; param0 < var9; param0 = param0 + var7) {
              param4[1].e(param0, param1);
            }
            ed.a(ac.field_q);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("nf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 >= -120) {
          nf.a(-101, ' ');
          field_c = null;
          field_a = null;
          return;
        }
        field_c = null;
        field_a = null;
    }

    final static byte a(int param0, char param1) {
        int var2;
        int var3;
        var3 = wizardrun.field_H;
        if (param1 <= 0) {
          if (param1 >= 160 &&
            255 >= param1) {
            var2 = (byte)param1;
          } else {
            if (param1 == 8364) {
              var2 = -128;
            } else {
              if (param1 == 8218) {
                var2 = -126;
                if (param0 != 26614) {
                  nf.b(57);
                }
                return (byte) var2;
              }
              if (param1 == 402) {
                var2 = -125;
                if (param0 != 26614) {
                  nf.b(57);
                }
                return (byte) var2;
              }
              if (param1 != 8222) {
                if (8230 == param1) {
                  var2 = -123;
                  if (param0 != 26614) {
                    nf.b(57);
                  }
                  return (byte) var2;
                }
                if (8224 != param1) {
                  if (param1 == 8225) {
                    var2 = -121;
                    if (param0 != 26614) {
                      nf.b(57);
                    }
                    return (byte) var2;
                  }
                  if (param1 != 710) {
                    if (8240 != param1) {
                      if (param1 == 352) {
                        var2 = -118;
                        if (param0 != 26614) {
                          nf.b(57);
                        }
                        return (byte) var2;
                      }
                      if (8249 != param1) {
                        if (param1 == 338) {
                          var2 = -116;
                        } else {
                          if (param1 != 381) {
                            if (param1 == 8216) {
                              var2 = -111;
                            } else {
                              if (param1 != 8217) {
                                if (param1 != 8220) {
                                  if (param1 == 8221) {
                                    var2 = -108;
                                  } else {
                                    if (param1 != 8226) {
                                      if (8211 != param1) {
                                        if (param1 == 8212) {
                                          var2 = -105;
                                        } else {
                                          if (param1 != 732) {
                                            if (param1 != 8482) {
                                              if (param1 != 353) {
                                                if (param1 == 8250) {
                                                  var2 = -101;
                                                } else {
                                                  if (param1 == 339) {
                                                    var2 = -100;
                                                  } else {
                                                    if (param1 != 382) {
                                                      var2 = (param1 == 376) ? -97 : 63;
                                                    } else {
                                                      var2 = -98;
                                                    }
                                                  }
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
                                        var2 = -106;
                                      }
                                    } else {
                                      var2 = -107;
                                    }
                                  }
                                } else {
                                  var2 = -109;
                                }
                              } else {
                                var2 = -110;
                              }
                            }
                          } else {
                            var2 = -114;
                          }
                        }
                      } else {
                        var2 = -117;
                      }
                    } else {
                      var2 = -119;
                    }
                  } else {
                    var2 = -120;
                  }
                } else {
                  var2 = -122;
                }
              } else {
                var2 = -124;
              }
            }
          }
        } else {
          if (param1 < 128) {
            var2 = (byte)param1;
          } else {
            if (param1 < 160) {
              if (param1 == 8364) {
                var2 = -128;
              } else {
                if (param1 == 8218) {
                  var2 = -126;
                } else {
                  if (param1 == 402) {
                    var2 = -125;
                  } else {
                    if (param1 != 8222) {
                      if (8230 == param1) {
                        var2 = -123;
                      } else {
                        if (8224 != param1) {
                          if (param1 == 8225) {
                            var2 = -121;
                          } else {
                            if (param1 != 710) {
                              if (8240 != param1) {
                                if (param1 == 352) {
                                  var2 = -118;
                                } else {
                                  if (8249 != param1) {
                                    if (param1 == 338) {
                                      var2 = -116;
                                    } else {
                                      if (param1 != 381) {
                                        if (param1 == 8216) {
                                          var2 = -111;
                                        } else {
                                          if (param1 != 8217) {
                                            if (param1 != 8220) {
                                              if (param1 == 8221) {
                                                var2 = -108;
                                              } else {
                                                if (param1 != 8226) {
                                                  if (8211 != param1) {
                                                    if (param1 == 8212) {
                                                      var2 = -105;
                                                    } else {
                                                      if (param1 != 732) {
                                                        if (param1 != 8482) {
                                                          if (param1 != 353) {
                                                            if (param1 == 8250) {
                                                              var2 = -101;
                                                            } else {
                                                              if (param1 == 339) {
                                                                var2 = -100;
                                                              } else {
                                                                if (param1 != 382) {
                                                                  if (param1 == 376) {
                                                                    var2 = -97;
                                                                  } else {
                                                                    var2 = 63;
                                                                  }
                                                                } else {
                                                                  var2 = -98;
                                                                }
                                                              }
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
                                                    var2 = -106;
                                                  }
                                                } else {
                                                  var2 = -107;
                                                }
                                              }
                                            } else {
                                              var2 = -109;
                                            }
                                          } else {
                                            var2 = -110;
                                          }
                                        }
                                      } else {
                                        var2 = -114;
                                      }
                                    }
                                  } else {
                                    var2 = -117;
                                  }
                                }
                              } else {
                                var2 = -119;
                              }
                            } else {
                              var2 = -120;
                            }
                          }
                        } else {
                          var2 = -122;
                        }
                      }
                    } else {
                      var2 = -124;
                    }
                  }
                }
              }
            } else {
              if (255 < param1) {
                if (param1 == 8364) {
                  var2 = -128;
                } else {
                  if (param1 == 8218) {
                    var2 = -126;
                    if (param0 == 26614) {
                      return (byte) var2;
                    }
                    nf.b(57);
                    return (byte) var2;
                  }
                  if (param1 == 402) {
                    var2 = -125;
                    if (param0 == 26614) {
                      return (byte) var2;
                    }
                    nf.b(57);
                    return (byte) var2;
                  }
                  if (param1 != 8222) {
                    if (8230 == param1) {
                      var2 = -123;
                      if (param0 == 26614) {
                        return (byte) var2;
                      }
                      nf.b(57);
                      return (byte) var2;
                    }
                    if (8224 != param1) {
                      if (param1 == 8225) {
                        var2 = -121;
                        if (param0 == 26614) {
                          return (byte) var2;
                        }
                        nf.b(57);
                        return (byte) var2;
                      }
                      if (param1 != 710) {
                        if (8240 != param1) {
                          if (param1 == 352) {
                            var2 = -118;
                            if (param0 == 26614) {
                              return (byte) var2;
                            }
                            nf.b(57);
                            return (byte) var2;
                          }
                          if (8249 != param1) {
                            if (param1 == 338) {
                              var2 = -116;
                              if (param0 == 26614) {
                                return (byte) var2;
                              }
                              nf.b(57);
                              return (byte) var2;
                            }
                            if (param1 != 381) {
                              if (param1 == 8216) {
                                var2 = -111;
                                if (param0 == 26614) {
                                  return (byte) var2;
                                }
                                nf.b(57);
                                return (byte) var2;
                              }
                              if (param1 != 8217) {
                                if (param1 != 8220) {
                                  if (param1 == 8221) {
                                    var2 = -108;
                                    if (param0 == 26614) {
                                      return (byte) var2;
                                    }
                                    nf.b(57);
                                    return (byte) var2;
                                  }
                                  if (param1 != 8226) {
                                    if (8211 != param1) {
                                      if (param1 == 8212) {
                                        var2 = -105;
                                        if (param0 == 26614) {
                                          return (byte) var2;
                                        }
                                        nf.b(57);
                                        return (byte) var2;
                                      }
                                      if (param1 != 732) {
                                        if (param1 != 8482) {
                                          if (param1 != 353) {
                                            if (param1 == 8250) {
                                              var2 = -101;
                                              if (param0 == 26614) {
                                                return (byte) var2;
                                              }
                                              nf.b(57);
                                              return (byte) var2;
                                            }
                                            if (param1 == 339) {
                                              var2 = -100;
                                              if (param0 == 26614) {
                                                return (byte) var2;
                                              }
                                              nf.b(57);
                                              return (byte) var2;
                                            }
                                            if (param1 != 382) {
                                              if (param1 == 376) {
                                                var2 = -97;
                                                if (param0 == 26614) {
                                                  return (byte) var2;
                                                }
                                                nf.b(57);
                                                return (byte) var2;
                                              }
                                              var2 = 63;
                                            } else {
                                              var2 = -98;
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
                                    } else {
                                      var2 = -106;
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
                          var2 = -119;
                        }
                      } else {
                        var2 = -120;
                      }
                    } else {
                      var2 = -122;
                    }
                  } else {
                    var2 = -124;
                  }
                }
              } else {
                var2 = (byte)param1;
              }
            }
          }
        }
        if (param0 == 26614) {
          return (byte) var2;
        }
        nf.b(57);
        return (byte) var2;
    }

    final static void a(int param0) {
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        qj stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qj var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = wizardrun.field_H;
        try {
          var1_int = pf.field_f;
          var2 = 0;
          if (oc.field_d == 2) {
            var3_long = -kh.field_g + d.a((byte) 63);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          var3 = 0;
          if (param0 <= 83) {
            nf.a((byte) -49);
          }
          while (a.field_b.length > var3) {
            var4 = ec.field_g[var3];
            if (var4 < 0) {
              var5 = ge.field_b;
            } else {
              if (ga.field_d.field_g != var4) {
                var5 = jl.field_s;
              } else {
                var5 = tc.field_i;
              }
            }
            var6 = a.field_b[var3];
            if (oc.field_d == 2 &&
              var2 == 1) {
              if (ke.field_t.length < lb.field_f.length) {
                stackIn_17_0 = lb.field_f.length;
              } else {
                stackIn_17_0 = ke.field_t.length;
              }
              var7 = stackIn_17_0;
              if (ec.field_a.length >= f.field_b.length) {
                stackIn_20_0 = ec.field_a.length;
              } else {
                stackIn_20_0 = f.field_b.length;
              }
              var8 = stackIn_20_0;
              if (var3 >= 6 &&
                var3 < 6 + var7) {
                if (-var7 + ke.field_t.length + var3 - 6 >= 0) {
                  stackIn_26_0 = ke.field_t[-var7 + ke.field_t.length + (var3 - 6)];
                } else {
                  stackIn_26_0 = "";
                }
                var6 = stackIn_26_0;
              }
              if (var7 + 7 <= var3 &&
                var7 + 7 + var8 > var3) {
                if (ec.field_a.length <= var3 - 7 - var7) {
                  stackIn_33_0 = "";
                } else {
                  stackIn_33_0 = ec.field_a[-7 + var3 - var7];
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            var7Lifetime1 = sf.a(!(0 > var4), 110, var6);
            var8Lifetime1 = id.field_c - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              if (var4 == ga.field_d.field_g) {
                stackIn_44_0 = og.field_N;
              } else {
                stackIn_44_0 = og.field_S;
              }
              var9 = stackIn_44_0;
              var1_int = var1_int + na.field_e;
              if (var9 != null) {
                var9.a(var1_int, (e.field_d << 1) + ec.field_c, (vl.field_h << 1) + var7Lifetime1, 1, -vl.field_h + var8Lifetime1);
              }
              var1_int = var1_int + e.field_d;
            }
            if (0 > var4) {
              le.field_j.c(var6, var8Lifetime1, var1_int + lc.field_a, var5, -1);
              var1_int = var1_int + si.field_f;
            } else {
              uf.field_c.c(var6, var8Lifetime1, var1_int + ki.field_I, var5, -1);
              var1_int = var1_int + (ec.field_c + na.field_e + e.field_d);
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "nf.C(" + param0 + ')');
        }
    }

    final static String a(byte param0) {
        if (fi.field_y == pl.field_E) {
          return na.field_l;
        }
        if (pl.field_E == wc.field_j) {
          return qc.field_I;
        }
        if (param0 < 121) {
          return (String) null;
        }
        if (!we.field_c.a(true)) {
          return qc.field_I;
        }
        return rg.field_S;
    }

    static {
        field_c = new ok();
        field_d = 64;
        field_a = "Orb coins: <%0>";
    }
}
