/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends kl {
    static int[] field_z;
    static gn field_w;
    static int field_x;
    static af field_y;

    public static void d() {
        field_w = null;
        field_y = null;
        field_z = null;
    }

    private tl(qi param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(int[] param0) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        aa var4_ref_aa = null;
        int var4 = 0;
        int var5_int = 0;
        aa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            if (d.field_f == ad.field_b) {
              L1: {
                L2: {
                  var2_long = bb.b(-1);
                  if (wl.field_c == 0) {
                    break L2;
                  } else {
                    if (ji.field_o >= 0) {
                      break L2;
                    } else {
                      L3: {
                        var4_ref_aa = (aa) (Object) ej.field_a.b((byte) 111);
                        if (var4_ref_aa == null) {
                          break L3;
                        } else {
                          if (var2_long <= var4_ref_aa.field_o) {
                            break L3;
                          } else {
                            var4_ref_aa.d(0);
                            ad.field_c = var4_ref_aa.field_i.length;
                            rd.field_e.field_l = 0;
                            var5_int = 0;
                            L4: while (true) {
                              if (~var5_int <= ~ad.field_c) {
                                ab.field_pb = hc.field_e;
                                hc.field_e = rd.field_l;
                                rd.field_l = vn.field_c;
                                vn.field_c = var4_ref_aa.field_l;
                                stackOut_11_0 = 1;
                                stackIn_12_0 = stackOut_11_0;
                                return stackIn_12_0 != 0;
                              } else {
                                rd.field_e.field_i[var5_int] = var4_ref_aa.field_i[var5_int];
                                var5_int++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                      break L1;
                    }
                  }
                }
                break L1;
              }
              L5: while (true) {
                L6: {
                  if (0 <= ji.field_o) {
                    break L6;
                  } else {
                    rd.field_e.field_l = 0;
                    if (!hi.b(1, (byte) 40)) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
                    } else {
                      ji.field_o = rd.field_e.g((byte) 73);
                      rd.field_e.field_l = 0;
                      ad.field_c = param0[ji.field_o];
                      break L6;
                    }
                  }
                }
                if (ok.a((byte) 55)) {
                  if (0 == wl.field_c) {
                    ab.field_pb = hc.field_e;
                    hc.field_e = rd.field_l;
                    rd.field_l = vn.field_c;
                    vn.field_c = ji.field_o;
                    ji.field_o = -1;
                    stackOut_33_0 = 1;
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    L7: {
                      var4 = wl.field_c;
                      if (ji.field_d == 0.0) {
                        break L7;
                      } else {
                        var4 = (int)((double)var4 + ha.field_n.nextGaussian() * ji.field_d);
                        if (var4 < 0) {
                          var4 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var5 = new aa((long)var4 + var2_long, ji.field_o, new byte[ad.field_c]);
                    var6 = 0;
                    L8: while (true) {
                      if (~var6 <= ~ad.field_c) {
                        ej.field_a.a((byte) -70, (hl) (Object) var5);
                        ji.field_o = -1;
                        continue L5;
                      } else {
                        var5.field_i[var6] = rd.field_e.field_i[var6];
                        var6++;
                        continue L8;
                      }
                    }
                  }
                } else {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var2;
            stackOut_35_1 = new StringBuilder().append("tl.U(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L9;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L9;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + 31881 + 41);
        }
        return stackIn_34_0 != 0;
    }

    final static cg a(String param0, byte param1) {
        RuntimeException var2 = null;
        cg var3 = null;
        int var4 = 0;
        Object var5 = null;
        String[] var6 = null;
        String[] var7 = null;
        cg stackIn_61_0 = null;
        cg stackIn_62_0 = null;
        cg stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        cg stackIn_64_0 = null;
        cg stackIn_65_0 = null;
        cg stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        cg stackIn_67_0 = null;
        cg stackIn_68_0 = null;
        cg stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        cg stackIn_92_0 = null;
        cg stackIn_93_0 = null;
        cg stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        cg stackIn_129_0 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_133_2 = null;
        RuntimeException decompiledCaughtException = null;
        cg stackOut_91_0 = null;
        cg stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        cg stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        cg stackOut_60_0 = null;
        cg stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        cg stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        cg stackOut_63_0 = null;
        cg stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        cg stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        cg stackOut_66_0 = null;
        cg stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        cg stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        cg stackOut_128_0 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            var6 = ca.a((byte) -127, ' ', param0);
            var7 = var6;
            if (var6.length == 0) {
              throw new IllegalArgumentException();
            } else {
              L1: {
                var3 = new cg();
                if (param1 == -95) {
                  break L1;
                } else {
                  var5 = null;
                  cg discarded$2 = tl.a((String) null, (byte) -55);
                  break L1;
                }
              }
              L2: {
                if (var6[0].equalsIgnoreCase("addplayer")) {
                  if (var7.length == 2) {
                    var3.field_c = 0;
                    var3.field_d = mo.a((CharSequence) (Object) var7[1], (byte) -116);
                    break L2;
                  } else {
                    throw new IllegalArgumentException();
                  }
                } else {
                  if (!var6[0].equalsIgnoreCase("pause")) {
                    if (var6[0].equalsIgnoreCase("highlight")) {
                      if (3 < var6.length) {
                        throw new IllegalArgumentException();
                      } else {
                        var3.field_c = 2;
                        if (var6[1].equalsIgnoreCase("booster")) {
                          var3.field_d = -112;
                          break L2;
                        } else {
                          if (!var6[1].equalsIgnoreCase("slowdown")) {
                            if (var7[1].equalsIgnoreCase("player")) {
                              var3.field_d = -107 - mo.a((CharSequence) (Object) var7[2], (byte) -116);
                              break L2;
                            } else {
                              if (2 >= var7.length) {
                                int discarded$3 = 1;
                                if (!ik.a((CharSequence) (Object) var7[1])) {
                                  L3: {
                                    if (var7[1].equalsIgnoreCase("off")) {
                                      break L3;
                                    } else {
                                      if (!var7[1].equalsIgnoreCase("none")) {
                                        if (var7[1].equalsIgnoreCase("fade")) {
                                          var3.field_d = -114;
                                          break L2;
                                        } else {
                                          if (var7[1].equalsIgnoreCase("all")) {
                                            var3.field_d = -106;
                                            break L2;
                                          } else {
                                            var3.field_d = -vh.a(param1 + 200, var7[1]) + -102;
                                            break L2;
                                          }
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var3.field_d = -101;
                                  break L2;
                                } else {
                                  var3.field_d = mo.a((CharSequence) (Object) var7[1], (byte) -116);
                                  break L2;
                                }
                              } else {
                                throw new IllegalArgumentException();
                              }
                            }
                          } else {
                            var3.field_d = -113;
                            break L2;
                          }
                        }
                      }
                    } else {
                      if (var6[0].equalsIgnoreCase("addpowerups")) {
                        if (var6.length != 3) {
                          throw new IllegalArgumentException();
                        } else {
                          L4: {
                            var3.field_c = 3;
                            if (!var6[1].equalsIgnoreCase("random")) {
                              var3.field_d = vh.a(param1 + 191, var7[1]);
                              break L4;
                            } else {
                              var3.field_d = -1;
                              break L4;
                            }
                          }
                          var3.field_h = mo.a((CharSequence) (Object) var7[2], (byte) -116);
                          break L2;
                        }
                      } else {
                        if (!var6[0].equalsIgnoreCase("addpowerupstrips")) {
                          if (var6[0].equalsIgnoreCase("removepowerups")) {
                            var3.field_c = 5;
                            if (-4 > var6.length) {
                              throw new IllegalArgumentException();
                            } else {
                              if (-4 == var6.length) {
                                if (var7[1].equalsIgnoreCase("car")) {
                                  L5: {
                                    var3.field_d = -107;
                                    stackOut_91_0 = (cg) var3;
                                    stackIn_93_0 = stackOut_91_0;
                                    stackIn_92_0 = stackOut_91_0;
                                    if (var7[2].equalsIgnoreCase("all")) {
                                      stackOut_93_0 = (cg) (Object) stackIn_93_0;
                                      stackOut_93_1 = -106;
                                      stackIn_94_0 = stackOut_93_0;
                                      stackIn_94_1 = stackOut_93_1;
                                      break L5;
                                    } else {
                                      stackOut_92_0 = (cg) (Object) stackIn_92_0;
                                      stackOut_92_1 = mo.a((CharSequence) (Object) var7[2], (byte) -116);
                                      stackIn_94_0 = stackOut_92_0;
                                      stackIn_94_1 = stackOut_92_1;
                                      break L5;
                                    }
                                  }
                                  stackIn_94_0.field_h = stackIn_94_1;
                                  break L2;
                                } else {
                                  throw new IllegalArgumentException();
                                }
                              } else {
                                if (var6.length == 2) {
                                  if (var7[1].equalsIgnoreCase("car")) {
                                    var3.field_h = -106;
                                    var3.field_d = -107;
                                    break L2;
                                  } else {
                                    if (!var7[1].equalsIgnoreCase("all")) {
                                      var3.field_d = vh.a(105, var7[1]);
                                      break L2;
                                    } else {
                                      var3.field_d = -106;
                                      break L2;
                                    }
                                  }
                                } else {
                                  var3.field_d = -106;
                                  break L2;
                                }
                              }
                            }
                          } else {
                            if (var6[0].equalsIgnoreCase("lockpowerups")) {
                              if (var6.length > 2) {
                                throw new IllegalArgumentException();
                              } else {
                                L6: {
                                  var3.field_c = 6;
                                  if (var6.length == 1) {
                                    break L6;
                                  } else {
                                    if (!var6[1].equalsIgnoreCase("on")) {
                                      if (var7[1].equalsIgnoreCase("off")) {
                                        var3.field_d = 0;
                                        break L2;
                                      } else {
                                        throw new IllegalArgumentException();
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                var3.field_d = -1;
                                break L2;
                              }
                            } else {
                              if (var6[0].equalsIgnoreCase("playerpower")) {
                                if (5 != var6.length) {
                                  throw new IllegalArgumentException();
                                } else {
                                  L7: {
                                    var3.field_c = 7;
                                    var3.field_d = mo.a((CharSequence) (Object) var6[1], (byte) -116);
                                    stackOut_60_0 = (cg) var3;
                                    stackIn_62_0 = stackOut_60_0;
                                    stackIn_61_0 = stackOut_60_0;
                                    if (var6[2].equalsIgnoreCase("empty")) {
                                      stackOut_62_0 = (cg) (Object) stackIn_62_0;
                                      stackOut_62_1 = -1;
                                      stackIn_63_0 = stackOut_62_0;
                                      stackIn_63_1 = stackOut_62_1;
                                      break L7;
                                    } else {
                                      stackOut_61_0 = (cg) (Object) stackIn_61_0;
                                      stackOut_61_1 = vh.a(121, var6[2]);
                                      stackIn_63_0 = stackOut_61_0;
                                      stackIn_63_1 = stackOut_61_1;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    stackIn_63_0.field_h = stackIn_63_1;
                                    stackOut_63_0 = (cg) var3;
                                    stackIn_65_0 = stackOut_63_0;
                                    stackIn_64_0 = stackOut_63_0;
                                    if (!var6[3].equalsIgnoreCase("empty")) {
                                      stackOut_65_0 = (cg) (Object) stackIn_65_0;
                                      stackOut_65_1 = vh.a(115, var6[3]);
                                      stackIn_66_0 = stackOut_65_0;
                                      stackIn_66_1 = stackOut_65_1;
                                      break L8;
                                    } else {
                                      stackOut_64_0 = (cg) (Object) stackIn_64_0;
                                      stackOut_64_1 = -1;
                                      stackIn_66_0 = stackOut_64_0;
                                      stackIn_66_1 = stackOut_64_1;
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    stackIn_66_0.field_e = stackIn_66_1;
                                    stackOut_66_0 = (cg) var3;
                                    stackIn_68_0 = stackOut_66_0;
                                    stackIn_67_0 = stackOut_66_0;
                                    if (!var6[4].equalsIgnoreCase("empty")) {
                                      stackOut_68_0 = (cg) (Object) stackIn_68_0;
                                      stackOut_68_1 = vh.a(102, var6[4]);
                                      stackIn_69_0 = stackOut_68_0;
                                      stackIn_69_1 = stackOut_68_1;
                                      break L9;
                                    } else {
                                      stackOut_67_0 = (cg) (Object) stackIn_67_0;
                                      stackOut_67_1 = -1;
                                      stackIn_69_0 = stackOut_67_0;
                                      stackIn_69_1 = stackOut_67_1;
                                      break L9;
                                    }
                                  }
                                  stackIn_69_0.field_k = stackIn_69_1;
                                  break L2;
                                }
                              } else {
                                if (var6[0].equalsIgnoreCase("setlap")) {
                                  if (var6.length == 3) {
                                    var3.field_c = 8;
                                    var3.field_d = mo.a((CharSequence) (Object) var6[1], (byte) -116);
                                    var3.field_h = mo.a((CharSequence) (Object) var6[2], (byte) -116);
                                    break L2;
                                  } else {
                                    throw new IllegalArgumentException();
                                  }
                                } else {
                                  if (!var6[0].equalsIgnoreCase("spin")) {
                                    if (var7[0].equalsIgnoreCase("resetplayers")) {
                                      if (var7.length == 2) {
                                        var3.field_c = 10;
                                        var3.field_d = mo.a((CharSequence) (Object) var7[1], (byte) -116);
                                        break L2;
                                      } else {
                                        throw new IllegalArgumentException();
                                      }
                                    } else {
                                      if (var7[0].equalsIgnoreCase("setlapcount")) {
                                        if (2 == var7.length) {
                                          var3.field_c = 11;
                                          var3.field_d = mo.a((CharSequence) (Object) var7[1], (byte) -116);
                                          break L2;
                                        } else {
                                          throw new IllegalArgumentException();
                                        }
                                      } else {
                                        if (var7[0].equalsIgnoreCase("endtutorial")) {
                                          if (var7.length == 1) {
                                            var3.field_c = 12;
                                            break L2;
                                          } else {
                                            throw new IllegalArgumentException();
                                          }
                                        } else {
                                          if (var7[0].equalsIgnoreCase("endgame")) {
                                            if (1 == var7.length) {
                                              var3.field_c = 13;
                                              break L2;
                                            } else {
                                              throw new IllegalArgumentException();
                                            }
                                          } else {
                                            throw new IllegalArgumentException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (var6.length == 3) {
                                      var3.field_c = 9;
                                      var3.field_d = mo.a((CharSequence) (Object) var6[1], (byte) -116);
                                      if (var6[2].equalsIgnoreCase("forever")) {
                                        var3.field_h = -1;
                                        break L2;
                                      } else {
                                        var3.field_h = mo.a((CharSequence) (Object) var6[2], (byte) -116);
                                        break L2;
                                      }
                                    } else {
                                      throw new IllegalArgumentException();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (var6.length != 3) {
                            throw new IllegalArgumentException();
                          } else {
                            L10: {
                              var3.field_c = 4;
                              if (var6[1].equalsIgnoreCase("random")) {
                                var3.field_d = -1;
                                break L10;
                              } else {
                                var3.field_d = vh.a(102, var6[1]);
                                break L10;
                              }
                            }
                            var3.field_h = mo.a((CharSequence) (Object) var7[2], (byte) -116);
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    if (2 >= var6.length) {
                      L11: {
                        var3.field_c = 1;
                        if (var6.length == 1) {
                          break L11;
                        } else {
                          if (!var6[1].equalsIgnoreCase("on")) {
                            if (var7[1].equalsIgnoreCase("off")) {
                              var3.field_d = 0;
                              break L2;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          } else {
                            break L11;
                          }
                        }
                      }
                      var3.field_d = -1;
                      break L2;
                    } else {
                      throw new IllegalArgumentException();
                    }
                  }
                }
              }
              stackOut_128_0 = (cg) var3;
              stackIn_129_0 = stackOut_128_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_130_0 = (RuntimeException) var2;
            stackOut_130_1 = new StringBuilder().append("tl.T(");
            stackIn_132_0 = stackOut_130_0;
            stackIn_132_1 = stackOut_130_1;
            stackIn_131_0 = stackOut_130_0;
            stackIn_131_1 = stackOut_130_1;
            if (param0 == null) {
              stackOut_132_0 = (RuntimeException) (Object) stackIn_132_0;
              stackOut_132_1 = (StringBuilder) (Object) stackIn_132_1;
              stackOut_132_2 = "null";
              stackIn_133_0 = stackOut_132_0;
              stackIn_133_1 = stackOut_132_1;
              stackIn_133_2 = stackOut_132_2;
              break L12;
            } else {
              stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
              stackOut_131_1 = (StringBuilder) (Object) stackIn_131_1;
              stackOut_131_2 = "{...}";
              stackIn_133_0 = stackOut_131_0;
              stackIn_133_1 = stackOut_131_1;
              stackIn_133_2 = stackOut_131_2;
              break L12;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_133_0, stackIn_133_2 + 44 + param1 + 41);
        }
        return stackIn_129_0;
    }

    final String a(n param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -110 / ((param1 - 73) / 49);
            stackOut_0_0 = ni.a('*', (byte) -125, param0.field_q.length());
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("tl.S(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    tl(int param0) {
        this(hl.field_g, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[8192];
        field_x = 4;
    }
}
