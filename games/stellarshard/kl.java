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
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qc var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_34_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_41_0 = 0;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        qc stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_27_0 = null;
        String stackOut_26_0 = null;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_40_0 = 0;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        qc stackOut_45_0 = null;
        qc stackOut_44_0 = null;
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
                          stackOut_18_0 = bb.field_k.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L6;
                        } else {
                          stackOut_17_0 = pd.field_g.length;
                          stackIn_19_0 = stackOut_17_0;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_19_0;
                        if (o.field_g.length <= fb.field_e.length) {
                          stackOut_21_0 = fb.field_e.length;
                          stackIn_22_0 = stackOut_21_0;
                          break L7;
                        } else {
                          stackOut_20_0 = o.field_g.length;
                          stackIn_22_0 = stackOut_20_0;
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
                                stackOut_27_0 = pd.field_g[-var7 + var3 + (-6 - -pd.field_g.length)];
                                stackIn_28_0 = stackOut_27_0;
                                break L9;
                              } else {
                                stackOut_26_0 = "";
                                stackIn_28_0 = stackOut_26_0;
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
                              stackOut_33_0 = "";
                              stackIn_34_0 = stackOut_33_0;
                              break L10;
                            } else {
                              stackOut_32_0 = fb.field_e[-var7 + -7 + var3];
                              stackIn_34_0 = stackOut_32_0;
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
                  stackOut_38_0 = -112;
                  stackOut_38_1 = (String) (var6);
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  if (-1 < (var4 ^ -1)) {
                    stackOut_40_0 = stackIn_40_0;
                    stackOut_40_1 = (String) ((Object) stackIn_40_1);
                    stackOut_40_2 = 0;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    stackIn_41_2 = stackOut_40_2;
                    break L12;
                  } else {
                    stackOut_39_0 = stackIn_39_0;
                    stackOut_39_1 = (String) ((Object) stackIn_39_1);
                    stackOut_39_2 = 1;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_41_2 = stackOut_39_2;
                    break L12;
                  }
                }
                L13: {
                  var7 = qe.a((byte) stackIn_41_0, stackIn_41_1, stackIn_41_2 != 0);
                  var8 = s.field_b - (var7 >> -1409092063);
                  if (var4 >= 0) {
                    L14: {
                      if (var4 == ua.field_i.field_f) {
                        stackOut_45_0 = ld.field_y;
                        stackIn_46_0 = stackOut_45_0;
                        break L14;
                      } else {
                        stackOut_44_0 = pk.field_a;
                        stackIn_46_0 = stackOut_44_0;
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
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_68_0 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
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
                stackOut_68_0 = (byte[]) (var3);
                stackIn_69_0 = stackOut_68_0;
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
            stackOut_70_0 = (RuntimeException) (var2);
            stackOut_70_1 = new StringBuilder().append("kl.A(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ')');
        }
        return stackIn_69_0;
    }

    final static String a(byte param0) {
        String discarded$0 = null;
        String var1 = "";
        if (!(null == af.field_r)) {
            var1 = af.field_r.f((byte) -76);
        }
        if (param0 != 124) {
            discarded$0 = kl.a((byte) 55);
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
