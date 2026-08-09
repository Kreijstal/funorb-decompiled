/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends gg {
    int field_q;
    int field_m;
    int field_p;
    static ka field_r;
    int field_n;
    static int field_k;
    int field_s;
    int field_l;
    static String field_o;

    public static void c(byte param0) {
        field_o = null;
        if (param0 != -106) {
            kl.a(true);
        }
        field_r = null;
    }

    final static void a(boolean param0) {
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_34_0 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_41_0 = 0;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        qc stackIn_46_0 = null;
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
        qc var9 = null;
        int var10 = 0;
        var10 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var1_int = rg.field_F;
              var2 = 0;
              if (param0) {
                break L1;
              } else {
                field_r = (ka) null;
                break L1;
              }
            }
            L2: {
              if (-3 != (rb.field_s ^ -1)) {
                break L2;
              } else {
                var3_long = -jj.field_p + ih.a((byte) -98);
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (0 > var2) {
                  var2 = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var3 = 0;
            L3: while (true) {
              if (stellarshard.field_L.length <= var3) {
                break L0;
              } else {
                L4: {
                  var4 = sj.field_J[var3];
                  if (var4 < 0) {
                    var5 = ul.field_G;
                    break L4;
                  } else {
                    if (var4 == ua.field_i.field_f) {
                      var5 = field_k;
                      break L4;
                    } else {
                      var5 = lg.field_b;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = stellarshard.field_L[var3];
                  if (2 != rb.field_s) {
                    break L5;
                  } else {
                    if (-2 != (var2 ^ -1)) {
                      break L5;
                    } else {
                      L6: {
                        if (pd.field_g.length < bb.field_k.length) {
                          stackIn_19_0 = bb.field_k.length;
                          break L6;
                        } else {
                          stackIn_19_0 = pd.field_g.length;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_19_0;
                        if (o.field_g.length <= fb.field_e.length) {
                          stackIn_22_0 = fb.field_e.length;
                          break L7;
                        } else {
                          stackIn_22_0 = o.field_g.length;
                          break L7;
                        }
                      }
                      L8: {
                        var8 = stackIn_22_0;
                        if (6 > var3) {
                          break L8;
                        } else {
                          if (var3 < 6 + var7) {
                            L9: {
                              if ((-6 + var3 - -pd.field_g.length + -var7 ^ -1) <= -1) {
                                stackIn_28_0 = pd.field_g[-var7 + var3 + (-6 - -pd.field_g.length)];
                                break L9;
                              } else {
                                stackIn_28_0 = "";
                                break L9;
                              }
                            }
                            var6 = stackIn_28_0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (7 + var7 > var3) {
                        break L5;
                      } else {
                        if (var8 + var7 + 7 <= var3) {
                          break L5;
                        } else {
                          L10: {
                            if (fb.field_e.length <= var3 + (-7 - var7)) {
                              stackIn_34_0 = "";
                              break L10;
                            } else {
                              stackIn_34_0 = fb.field_e[-var7 + -7 + var3];
                              break L10;
                            }
                          }
                          var6 = stackIn_34_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if ((var4 ^ -1) == 1) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackIn_40_0 = -112;

                  stackIn_40_1 = (String) (var6);

                  if (-1 < (var4 ^ -1)) {
                    stackIn_41_0 = stackIn_40_0;
                    stackIn_41_1 = (String) ((Object) stackIn_40_1);
                    stackIn_41_2 = 0;
                    break L12;
                  } else {
                    stackIn_41_0 = stackIn_40_0;
                    stackIn_41_1 = (String) ((Object) stackIn_40_1);
                    stackIn_41_2 = 1;
                    break L12;
                  }
                }
                L13: {
                  var7 = qe.a((byte) stackIn_41_0, stackIn_41_1, stackIn_41_2 != 0);
                  var8 = s.field_b - (var7 >> -1409092063);
                  if (var4 >= 0) {
                    L14: {
                      if (var4 == ua.field_i.field_f) {
                        stackIn_46_0 = ld.field_y;
                        break L14;
                      } else {
                        stackIn_46_0 = pk.field_a;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_46_0;
                      var1_int = var1_int + nh.field_f;
                      if (var9 != null) {
                        var9.a(true, var7 + (le.field_k << 1718043457), na.field_a - -(nh.field_h << 1599016833), var1_int, var8 - le.field_k);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var1_int = var1_int + nh.field_h;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if ((var4 ^ -1) > -1) {
                    pe.field_c.a(var6, var8, var1_int - -mc.field_a, var5, -1);
                    var1_int = var1_int + l.field_e;
                    break L16;
                  } else {
                    mj.field_E.a(var6, var8, var1_int - -fg.field_M, var5, -1);
                    var1_int = var1_int + (na.field_a + (nh.field_f + nh.field_h));
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "kl.B(" + param0 + ')');
        }
    }

    final static byte[] a(CharSequence param0, int param1) {
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param1 == -20650) {
                break L1;
              } else {
                field_k = 12;
                break L1;
              }
            }
            var2_int = param0.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackIn_69_0 = (byte[]) (var3);
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (0 >= var5) {
                        break L5;
                      } else {
                        if (var5 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 160) {
                        break L6;
                      } else {
                        if (var5 > 255) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 != 8218) {
                        if (var5 == 402) {
                          var3[var4] = (byte)-125;
                          break L3;
                        } else {
                          if (var5 != 8222) {
                            if (8230 != var5) {
                              if (var5 == 8224) {
                                var3[var4] = (byte)-122;
                                break L3;
                              } else {
                                if (var5 == 8225) {
                                  var3[var4] = (byte)-121;
                                  break L3;
                                } else {
                                  if (var5 == 710) {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  } else {
                                    if (8240 == var5) {
                                      var3[var4] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var5 == 352) {
                                        var3[var4] = (byte)-118;
                                        break L3;
                                      } else {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (338 == var5) {
                                            var3[var4] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (381 == var5) {
                                              var3[var4] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (8216 == var5) {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              } else {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (var5 != 8220) {
                                                    if (8221 != var5) {
                                                      if (var5 != 8226) {
                                                        if (var5 != 8211) {
                                                          if (var5 != 8212) {
                                                            if (732 == var5) {
                                                              var3[var4] = (byte)-104;
                                                              break L3;
                                                            } else {
                                                              if (var5 != 8482) {
                                                                if (353 != var5) {
                                                                  if (8250 == var5) {
                                                                    var3[var4] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (339 == var5) {
                                                                      var3[var4] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (382 != var5) {
                                                                        if (var5 != 376) {
                                                                          var3[var4] = (byte)63;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte)-97;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte)-98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-102;
                                                                  break L3;
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-103;
                                                                break L3;
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-105;
                                                            break L3;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-107;
                                                        break L3;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-109;
                                                    break L3;
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
                              var3[var4] = (byte)-123;
                              break L3;
                            }
                          } else {
                            var3[var4] = (byte)-124;
                            break L3;
                          }
                        }
                      } else {
                        var3[var4] = (byte)-126;
                        break L3;
                      }
                    } else {
                      var3[var4] = (byte)-128;
                      break L3;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var2);

            stackIn_72_1 = new StringBuilder().append("kl.A(");

            if (param0 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ')');
        }
        return stackIn_69_0;
    }

    final static String a(byte param0) {
        String var1 = "";
        if (!(null == af.field_r)) {
            var1 = af.field_r.f((byte) -76);
        }
        if (param0 != 124) {
            kl.a((byte) 55);
        }
        if (-1 == (var1.length() ^ -1)) {
            var1 = of.i(195);
        }
        if (var1.length() == 0) {
            var1 = mg.field_k;
        }
        return var1;
    }

    kl(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_s = param1;
        this.field_l = param0;
        this.field_p = param5;
        this.field_m = param2;
        this.field_q = param4;
        this.field_n = param3;
    }

    static {
        field_o = null;
    }
}
