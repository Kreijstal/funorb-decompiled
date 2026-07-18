/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends l {
    long field_p;
    byte[] field_l;
    static p field_o;
    int field_i;
    static byte[][] field_k;
    static ra field_h;
    static int field_j;
    static java.awt.Frame field_m;
    static String field_g;
    static boolean field_n;

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3_int = param1 >> -2139635681 & param0 + -1;
            if (param2 == 1) {
              stackOut_3_0 = var3_int + ((param1 >>> -2126198881) + param1) % param0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 82;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "bj.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1, int param2) {
        try {
            ad.field_i = param2;
            hn.field_q = param0;
            if (param1 != 23) {
                field_k = null;
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "bj.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_o = null;
            field_g = null;
            field_k = null;
            field_h = null;
            field_m = null;
            if (param0 >= -59) {
                bj.a(-31);
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "bj.B(" + param0 + ')');
        }
    }

    bj(long param0, int param1, byte[] param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((bj) this).field_i = param1;
            ((bj) this).field_l = param2;
            ((bj) this).field_p = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bj.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static void a(int param0) {
        hg var1 = null;
        int var2 = 0;
        lk var3_ref_lk = null;
        int var3 = 0;
        long var3_long = 0L;
        he var3_ref_he = null;
        int var4 = 0;
        he var4_ref_he = null;
        String var5 = null;
        int var5_int = 0;
        he var5_ref = null;
        lk var5_ref2 = null;
        String var6 = null;
        lk var6_ref = null;
        he var6_ref2 = null;
        String var7 = null;
        lk var7_ref = null;
        lk var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        lk stackIn_84_0 = null;
        lk stackIn_85_0 = null;
        lk stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_150_0 = 0;
        lk stackIn_157_0 = null;
        lk stackIn_158_0 = null;
        lk stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        boolean stackIn_168_0 = false;
        boolean stackIn_169_0 = false;
        int stackIn_179_0 = 0;
        lk stackOut_83_0 = null;
        lk stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        lk stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_149_0 = 0;
        int stackOut_148_0 = 0;
        lk stackOut_156_0 = null;
        lk stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        lk stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        boolean stackOut_167_0 = false;
        boolean stackOut_168_0 = false;
        int stackOut_178_0 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        var1 = sh.field_qb;
        var2 = ((jc) (Object) var1).g(11132);
        if (param0 < -3) {
          L0: {
            L1: {
              if (var2 == 0) {
                break L1;
              } else {
                if (var2 == 1) {
                  break L1;
                } else {
                  if (var2 == 2) {
                    break L1;
                  } else {
                    if (var2 == 3) {
                      break L1;
                    } else {
                      if (var2 == 4) {
                        break L1;
                      } else {
                        L2: {
                          if (5 == var2) {
                            break L2;
                          } else {
                            L3: {
                              if (6 == var2) {
                                break L3;
                              } else {
                                L4: {
                                  if (var2 != 7) {
                                    break L4;
                                  } else {
                                    var3_ref_lk = (lk) (Object) ci.field_o.a((byte) -77);
                                    L5: while (true) {
                                      L6: {
                                        L7: {
                                          if (null == var3_ref_lk) {
                                            break L7;
                                          } else {
                                            var3_ref_lk.a(false);
                                            var3_ref_lk.c(53);
                                            var3_ref_lk = (lk) (Object) ci.field_o.a(16213);
                                            if (var11 != 0) {
                                              break L6;
                                            } else {
                                              if (var11 == 0) {
                                                continue L5;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                        ea.field_a = 0;
                                        break L6;
                                      }
                                      if (var11 == 0) {
                                        break L0;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                }
                                L8: {
                                  if (8 != var2) {
                                    break L8;
                                  } else {
                                    L9: {
                                      var3 = ((jc) (Object) var1).c((byte) 100);
                                      var4_ref_he = (he) (Object) ma.field_c.a((long)var3, (byte) -103);
                                      if (null != var4_ref_he) {
                                        break L9;
                                      } else {
                                        var4_ref_he = new he(vb.field_h);
                                        ma.field_c.a((long)var3, (wb) (Object) var4_ref_he, 30804);
                                        break L9;
                                      }
                                    }
                                    cc.a(true, var4_ref_he, true, (jc) (Object) var1);
                                    pg.a(false, var4_ref_he);
                                    if (var11 == 0) {
                                      break L0;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L10: {
                                  if (var2 == 9) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (10 == var2) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if (var2 == 11) {
                                            break L12;
                                          } else {
                                            if (var2 == 12) {
                                              break L12;
                                            } else {
                                              L13: {
                                                if (var2 == 13) {
                                                  break L13;
                                                } else {
                                                  L14: {
                                                    if (var2 == 14) {
                                                      break L14;
                                                    } else {
                                                      if (var2 == 16) {
                                                        break L14;
                                                      } else {
                                                        L15: {
                                                          if (var2 == 15) {
                                                            break L15;
                                                          } else {
                                                            if (var2 == 17) {
                                                              break L15;
                                                            } else {
                                                              L16: {
                                                                if (var2 == 18) {
                                                                  break L16;
                                                                } else {
                                                                  L17: {
                                                                    if (var2 == 19) {
                                                                      break L17;
                                                                    } else {
                                                                      L18: {
                                                                        if (var2 == 20) {
                                                                          break L18;
                                                                        } else {
                                                                          L19: {
                                                                            if (21 != var2) {
                                                                              break L19;
                                                                            } else {
                                                                              L20: {
                                                                                L21: {
                                                                                  var3 = ((jc) (Object) var1).c((byte) -90);
                                                                                  if (0 != var3) {
                                                                                    break L21;
                                                                                  } else {
                                                                                    d.field_Eb = 0L;
                                                                                    if (var11 == 0) {
                                                                                      break L20;
                                                                                    } else {
                                                                                      break L21;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                d.field_Eb = hc.a(-9986) + (long)var3;
                                                                                break L20;
                                                                              }
                                                                              if (var11 == 0) {
                                                                                break L0;
                                                                              } else {
                                                                                break L19;
                                                                              }
                                                                            }
                                                                          }
                                                                          L22: {
                                                                            if (var2 == 22) {
                                                                              break L22;
                                                                            } else {
                                                                              L23: {
                                                                                if (var2 == 23) {
                                                                                  break L23;
                                                                                } else {
                                                                                  en.a("L1: " + rg.a(true), (Throwable) null, 1);
                                                                                  tn.a(false);
                                                                                  if (var11 == 0) {
                                                                                    break L0;
                                                                                  } else {
                                                                                    break L23;
                                                                                  }
                                                                                }
                                                                              }
                                                                              hh.field_d = ((jc) (Object) var1).e((byte) -60);
                                                                              if (var11 == 0) {
                                                                                break L0;
                                                                              } else {
                                                                                break L22;
                                                                              }
                                                                            }
                                                                          }
                                                                          sb.field_i = ((jc) (Object) var1).c((byte) 69);
                                                                          nh.field_c = ((jc) (Object) var1).c(0);
                                                                          if (var11 == 0) {
                                                                            break L0;
                                                                          } else {
                                                                            break L18;
                                                                          }
                                                                        }
                                                                      }
                                                                      cc.a(false, wl.field_d, true, (jc) (Object) var1);
                                                                      if (var11 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L17;
                                                                      }
                                                                    }
                                                                  }
                                                                  L24: {
                                                                    var3_long = ((jc) (Object) var1).e((byte) -60);
                                                                    var5_int = ((jc) (Object) var1).g(11132);
                                                                    var6_ref = ic.a(var3_long, (byte) -127);
                                                                    if (var6_ref != null) {
                                                                      L25: {
                                                                        L26: {
                                                                          if (var5_int != 0) {
                                                                            break L26;
                                                                          } else {
                                                                            var6_ref.a(false);
                                                                            if (var11 == 0) {
                                                                              break L25;
                                                                            } else {
                                                                              break L26;
                                                                            }
                                                                          }
                                                                        }
                                                                        var6_ref.field_Gb = fn.field_c;
                                                                        var6_ref.field_Wb = var5_int;
                                                                        break L25;
                                                                      }
                                                                      var6_ref.c(32);
                                                                      wl.field_d.field_ic = wl.field_d.field_ic - 1;
                                                                      break L24;
                                                                    } else {
                                                                      break L24;
                                                                    }
                                                                  }
                                                                  if (var11 == 0) {
                                                                    break L0;
                                                                  } else {
                                                                    break L16;
                                                                  }
                                                                }
                                                              }
                                                              L27: {
                                                                var3_long = ((jc) (Object) var1).e((byte) -60);
                                                                var5 = ((jc) (Object) var1).h(-118);
                                                                var6 = ((jc) (Object) var1).h(-118);
                                                                var7_ref = ic.a(var3_long, (byte) -127);
                                                                if (var7_ref == null) {
                                                                  var7_ref = new lk(var5, var6, var3_long);
                                                                  ah.field_h.a(var3_long, (wb) (Object) var7_ref, 30804);
                                                                  wl.field_d.field_ic = wl.field_d.field_ic + 1;
                                                                  break L27;
                                                                } else {
                                                                  break L27;
                                                                }
                                                              }
                                                              L28: {
                                                                var7_ref.field_Vb = ((jc) (Object) var1).c((byte) 75);
                                                                var8_int = ((jc) (Object) var1).c(0);
                                                                stackOut_83_0 = (lk) var7_ref;
                                                                stackIn_85_0 = stackOut_83_0;
                                                                stackIn_84_0 = stackOut_83_0;
                                                                if (0 == (1 & var8_int)) {
                                                                  stackOut_85_0 = (lk) (Object) stackIn_85_0;
                                                                  stackOut_85_1 = 0;
                                                                  stackIn_86_0 = stackOut_85_0;
                                                                  stackIn_86_1 = stackOut_85_1;
                                                                  break L28;
                                                                } else {
                                                                  stackOut_84_0 = (lk) (Object) stackIn_84_0;
                                                                  stackOut_84_1 = 1;
                                                                  stackIn_86_0 = stackOut_84_0;
                                                                  stackIn_86_1 = stackOut_84_1;
                                                                  break L28;
                                                                }
                                                              }
                                                              stackIn_86_0.field_Jb = stackIn_86_1 != 0;
                                                              var7_ref.field_Rb = var8_int >> 1848459425;
                                                              var7_ref.field_Ub = ((jc) (Object) var1).g(11132);
                                                              var7_ref.field_Fb = ((jc) (Object) var1).g(11132);
                                                              qm.field_Mb.a((l) (Object) var7_ref, (byte) -101);
                                                              if (var11 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L15;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        L29: {
                                                          var3_long = ((jc) (Object) var1).e((byte) -60);
                                                          var5_int = ((jc) (Object) var1).g(11132);
                                                          var6_ref = db.a(var3_long, false);
                                                          if (var6_ref == null) {
                                                            break L29;
                                                          } else {
                                                            L30: {
                                                              L31: {
                                                                if (var2 == 15) {
                                                                  break L31;
                                                                } else {
                                                                  if (!var6_ref.field_Sb) {
                                                                    break L30;
                                                                  } else {
                                                                    ea.field_a = ea.field_a - 1;
                                                                    var6_ref.field_Sb = false;
                                                                    if (var11 == 0) {
                                                                      break L30;
                                                                    } else {
                                                                      break L31;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var6_ref.field_Xb = false;
                                                              break L30;
                                                            }
                                                            L32: {
                                                              if (0 == var5_int) {
                                                                break L32;
                                                              } else {
                                                                var6_ref.field_Gb = fn.field_c;
                                                                var6_ref.field_Wb = var5_int;
                                                                break L32;
                                                              }
                                                            }
                                                            je.a(var6_ref, (byte) 99);
                                                            break L29;
                                                          }
                                                        }
                                                        if (var11 == 0) {
                                                          break L0;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L33: {
                                                    var3_long = ((jc) (Object) var1).e((byte) -60);
                                                    var5_ref2 = db.a(var3_long, false);
                                                    if (null == var5_ref2) {
                                                      break L33;
                                                    } else {
                                                      L34: {
                                                        L35: {
                                                          if (var2 == 14) {
                                                            break L35;
                                                          } else {
                                                            if (!var5_ref2.field_Sb) {
                                                              var5_ref2.field_Sb = true;
                                                              ea.field_a = ea.field_a + 1;
                                                              if (var11 == 0) {
                                                                break L34;
                                                              } else {
                                                                break L35;
                                                              }
                                                            } else {
                                                              break L34;
                                                            }
                                                          }
                                                        }
                                                        var5_ref2.field_Xb = true;
                                                        break L34;
                                                      }
                                                      je.a(var5_ref2, (byte) 112);
                                                      break L33;
                                                    }
                                                  }
                                                  if (var11 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              L36: {
                                                var3 = ((jc) (Object) var1).c((byte) 66);
                                                var4 = ((jc) (Object) var1).g(11132);
                                                var5_ref = (he) (Object) ma.field_c.a((long)var3, (byte) -5);
                                                if (null != var5_ref) {
                                                  L37: {
                                                    var6_ref2 = var5_ref;
                                                    var5_ref.field_sc = false;
                                                    var6_ref2.field_dc = false;
                                                    if (0 == var4) {
                                                      break L37;
                                                    } else {
                                                      var5_ref.field_Eb = var4;
                                                      var5_ref.field_Mb = fn.field_c;
                                                      break L37;
                                                    }
                                                  }
                                                  pg.a(false, var5_ref);
                                                  break L36;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                              if (var11 == 0) {
                                                break L0;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                        }
                                        L38: {
                                          var3 = ((jc) (Object) var1).c((byte) 71);
                                          var4_ref_he = (he) (Object) ma.field_c.a((long)var3, (byte) -46);
                                          if (var4_ref_he != null) {
                                            L39: {
                                              L40: {
                                                if (11 != var2) {
                                                  break L40;
                                                } else {
                                                  var4_ref_he.field_dc = true;
                                                  if (var11 == 0) {
                                                    break L39;
                                                  } else {
                                                    break L40;
                                                  }
                                                }
                                              }
                                              var4_ref_he.field_sc = true;
                                              break L39;
                                            }
                                            pg.a(false, var4_ref_he);
                                            break L38;
                                          } else {
                                            break L38;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var3_ref_he = (he) (Object) te.field_f.a((byte) -110);
                                    L41: while (true) {
                                      L42: {
                                        if (var3_ref_he == null) {
                                          break L42;
                                        } else {
                                          var3_ref_he.a(false);
                                          var3_ref_he.c(11);
                                          var3_ref_he = (he) (Object) te.field_f.a(16213);
                                          if (var11 != 0) {
                                            break L0;
                                          } else {
                                            if (var11 == 0) {
                                              continue L41;
                                            } else {
                                              break L42;
                                            }
                                          }
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L0;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                L43: {
                                  var3 = ((jc) (Object) var1).c((byte) 38);
                                  var4 = ((jc) (Object) var1).g(11132);
                                  var5_ref = (he) (Object) ma.field_c.a((long)var3, (byte) 100);
                                  if (null != var5_ref) {
                                    L44: {
                                      L45: {
                                        if (0 == var4) {
                                          break L45;
                                        } else {
                                          var5_ref.field_Eb = var4;
                                          var5_ref.field_Mb = fn.field_c;
                                          if (var11 == 0) {
                                            break L44;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                      var5_ref.a(false);
                                      break L44;
                                    }
                                    var5_ref.c(25);
                                    break L43;
                                  } else {
                                    break L43;
                                  }
                                }
                                if (var11 == 0) {
                                  break L0;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            L46: {
                              var3_long = ((jc) (Object) var1).e((byte) -60);
                              var5_int = ((jc) (Object) var1).g(11132);
                              var6_ref = db.a(var3_long, false);
                              if (null != var6_ref) {
                                L47: {
                                  if (!var6_ref.field_Sb) {
                                    break L47;
                                  } else {
                                    ea.field_a = ea.field_a - 1;
                                    var6_ref.field_Sb = false;
                                    break L47;
                                  }
                                }
                                L48: {
                                  L49: {
                                    if (var5_int != 0) {
                                      break L49;
                                    } else {
                                      var6_ref.a(false);
                                      if (var11 == 0) {
                                        break L48;
                                      } else {
                                        break L49;
                                      }
                                    }
                                  }
                                  var6_ref.field_Wb = var5_int;
                                  var6_ref.field_Gb = fn.field_c;
                                  break L48;
                                }
                                var6_ref.c(44);
                                break L46;
                              } else {
                                break L46;
                              }
                            }
                            if (var11 == 0) {
                              break L0;
                            } else {
                              break L2;
                            }
                          }
                        }
                        L50: {
                          var3_long = ((jc) (Object) var1).e((byte) -60);
                          var5 = ((jc) (Object) var1).h(-127);
                          var6 = ((jc) (Object) var1).h(-124);
                          var7 = ((jc) (Object) var1).h(-119);
                          var8 = db.a(var3_long, false);
                          if (var6.equals((Object) (Object) "")) {
                            stackOut_149_0 = 0;
                            stackIn_150_0 = stackOut_149_0;
                            break L50;
                          } else {
                            stackOut_148_0 = 1;
                            stackIn_150_0 = stackOut_148_0;
                            break L50;
                          }
                        }
                        L51: {
                          L52: {
                            var9 = stackIn_150_0;
                            if (var8 != null) {
                              break L52;
                            } else {
                              var8 = new lk(var5, var7, var3_long);
                              ti.field_i.a(var3_long, (wb) (Object) var8, 30804);
                              if (var11 == 0) {
                                break L51;
                              } else {
                                break L52;
                              }
                            }
                          }
                          if (var9 != 0) {
                            var8.a(var7, var5, 0);
                            break L51;
                          } else {
                            break L51;
                          }
                        }
                        L53: {
                          var8.field_Ib = hc.a(-9986) + -(long)((jc) (Object) var1).d((byte) 123);
                          var8.field_Vb = ((jc) (Object) var1).c((byte) 33);
                          var10 = ((jc) (Object) var1).c(0);
                          var8.field_Rb = var10 >> 352882849;
                          stackOut_156_0 = (lk) var8;
                          stackIn_158_0 = stackOut_156_0;
                          stackIn_157_0 = stackOut_156_0;
                          if (0 == (1 & var10)) {
                            stackOut_158_0 = (lk) (Object) stackIn_158_0;
                            stackOut_158_1 = 0;
                            stackIn_159_0 = stackOut_158_0;
                            stackIn_159_1 = stackOut_158_1;
                            break L53;
                          } else {
                            stackOut_157_0 = (lk) (Object) stackIn_157_0;
                            stackOut_157_1 = 1;
                            stackIn_159_0 = stackOut_157_0;
                            stackIn_159_1 = stackOut_157_1;
                            break L53;
                          }
                        }
                        stackIn_159_0.field_Jb = stackIn_159_1 != 0;
                        var8.field_Ub = ((jc) (Object) var1).g(11132);
                        var8.field_Fb = ((jc) (Object) var1).g(11132);
                        je.a(var8, (byte) 95);
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var3_ref_lk = (lk) (Object) qm.field_Mb.a((byte) -62);
            L54: while (true) {
              L55: {
                L56: {
                  if (null == var3_ref_lk) {
                    break L56;
                  } else {
                    var3_ref_lk.a(false);
                    var3_ref_lk.c(54);
                    var3_ref_lk = (lk) (Object) qm.field_Mb.a(16213);
                    if (var11 != 0) {
                      break L55;
                    } else {
                      if (var11 == 0) {
                        continue L54;
                      } else {
                        break L56;
                      }
                    }
                  }
                }
                var3_ref_lk = (lk) (Object) ti.field_i.a(true);
                break L55;
              }
              L57: while (true) {
                L58: {
                  L59: {
                    if (var3_ref_lk == null) {
                      break L59;
                    } else {
                      stackOut_167_0 = var3_ref_lk.field_Xb;
                      stackIn_179_0 = stackOut_167_0 ? 1 : 0;
                      stackIn_168_0 = stackOut_167_0;
                      if (var11 != 0) {
                        break L58;
                      } else {
                        stackOut_168_0 = stackIn_168_0;
                        stackIn_169_0 = stackOut_168_0;
                        L60: {
                          L61: {
                            if (stackIn_169_0) {
                              break L61;
                            } else {
                              if (!var3_ref_lk.field_Sb) {
                                break L60;
                              } else {
                                break L61;
                              }
                            }
                          }
                          L62: {
                            var3_ref_lk.field_Xb = false;
                            if (!var3_ref_lk.field_Sb) {
                              break L62;
                            } else {
                              ea.field_a = ea.field_a - 1;
                              var3_ref_lk.field_Sb = false;
                              break L62;
                            }
                          }
                          je.a(var3_ref_lk, (byte) 114);
                          break L60;
                        }
                        var3_ref_lk = (lk) (Object) ti.field_i.b(-1);
                        if (var11 == 0) {
                          continue L57;
                        } else {
                          break L59;
                        }
                      }
                    }
                  }
                  stackOut_178_0 = ~var2;
                  stackIn_179_0 = stackOut_178_0;
                  break L58;
                }
                L63: {
                  if (stackIn_179_0 != -2) {
                    break L63;
                  } else {
                    if (wl.field_d == null) {
                      break L63;
                    } else {
                      cf.field_b = wl.field_d.field_Qb;
                      break L63;
                    }
                  }
                }
                L64: {
                  if (var2 != 4) {
                    wl.field_d = null;
                    break L64;
                  } else {
                    var3 = ((jc) (Object) var1).c((byte) -66);
                    wl.field_d = new he(vb.field_h);
                    wl.field_d.a(0, (long)var3);
                    cc.a(false, wl.field_d, true, (jc) (Object) var1);
                    d.field_Eb = 0L;
                    break L64;
                  }
                }
                L65: {
                  L66: {
                    L67: {
                      if (var2 == 2) {
                        break L67;
                      } else {
                        if (var2 != 3) {
                          break L66;
                        } else {
                          break L67;
                        }
                      }
                    }
                    if (null == la.field_h) {
                      la.field_h = new he(vb.field_h);
                      if (var11 == 0) {
                        break L65;
                      } else {
                        break L66;
                      }
                    } else {
                      break L65;
                    }
                  }
                  la.field_h = null;
                  break L65;
                }
                L68: {
                  if (3 != var2) {
                    break L68;
                  } else {
                    ld.field_c = true;
                    var3 = 0;
                    L69: while (true) {
                      L70: {
                        L71: {
                          if (var3 >= kn.field_E.length) {
                            break L71;
                          } else {
                            kn.field_E[var3] = ((jc) (Object) var1).a((byte) -88);
                            var3++;
                            if (var11 != 0) {
                              break L70;
                            } else {
                              if (var11 == 0) {
                                continue L69;
                              } else {
                                break L71;
                              }
                            }
                          }
                        }
                        aa.field_e = ((jc) (Object) var1).g(11132);
                        qc.field_c = ((jc) (Object) var1).g(11132);
                        break L70;
                      }
                      var3 = 0;
                      L72: while (true) {
                        L73: {
                          if (var3 >= pm.field_p.length) {
                            break L73;
                          } else {
                            pm.field_p[var3] = ((jc) (Object) var1).a((byte) -77);
                            var3++;
                            if (var11 != 0) {
                              break L0;
                            } else {
                              if (var11 == 0) {
                                continue L72;
                              } else {
                                break L73;
                              }
                            }
                          }
                        }
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L68;
                        }
                      }
                    }
                  }
                }
                ld.field_c = false;
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new p();
        field_k = new byte[50][];
        field_h = new ra();
        field_g = "Create a free Account";
    }
}
