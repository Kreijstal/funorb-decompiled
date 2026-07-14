/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends kl {
    static int[] field_z;
    static gn field_w;
    static int field_x;
    static af field_y;

    public static void d(boolean param0) {
        field_w = null;
        if (!param0) {
            field_y = null;
        }
        field_y = null;
        field_z = null;
    }

    private tl(qi param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(int[] param0, int param1) {
        long var2 = 0L;
        aa var4_ref_aa = null;
        int var4 = 0;
        int var5_int = 0;
        aa var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        if (d.field_f == ad.field_b) {
          L0: {
            if (param1 == 31881) {
              break L0;
            } else {
              tl.d(false);
              break L0;
            }
          }
          L1: {
            var2 = bb.b(-1);
            if (-1 == wl.field_c) {
              break L1;
            } else {
              if (-1 <= ji.field_o) {
                break L1;
              } else {
                var4_ref_aa = (aa) (Object) ej.field_a.b((byte) 111);
                if (var4_ref_aa == null) {
                  break L1;
                } else {
                  if (var2 <= var4_ref_aa.field_o) {
                    break L1;
                  } else {
                    var4_ref_aa.d(0);
                    ad.field_c = var4_ref_aa.field_i.length;
                    rd.field_e.field_l = 0;
                    var5_int = 0;
                    L2: while (true) {
                      if (var5_int >= ad.field_c) {
                        ab.field_pb = hc.field_e;
                        hc.field_e = rd.field_l;
                        rd.field_l = vn.field_c;
                        vn.field_c = var4_ref_aa.field_l;
                        return true;
                      } else {
                        rd.field_e.field_i[var5_int] = var4_ref_aa.field_i[var5_int];
                        var5_int++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
          L3: while (true) {
            L4: {
              if (0 <= ji.field_o) {
                break L4;
              } else {
                rd.field_e.field_l = 0;
                if (!hi.b(1, (byte) 40)) {
                  return false;
                } else {
                  ji.field_o = rd.field_e.g((byte) 73);
                  rd.field_e.field_l = 0;
                  ad.field_c = param0[ji.field_o];
                  break L4;
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
                return true;
              } else {
                L5: {
                  var4 = wl.field_c;
                  if (ji.field_d == 0.0) {
                    break L5;
                  } else {
                    var4 = (int)((double)var4 + ha.field_n.nextGaussian() * ji.field_d);
                    if (var4 < 0) {
                      var4 = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = new aa((long)var4 + var2, ji.field_o, new byte[ad.field_c]);
                var6 = 0;
                L6: while (true) {
                  if (var6 >= ad.field_c) {
                    ej.field_a.a((byte) -70, (hl) (Object) var5);
                    ji.field_o = -1;
                    continue L3;
                  } else {
                    var5.field_i[var6] = rd.field_e.field_i[var6];
                    var6++;
                    continue L6;
                  }
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final static cg a(String param0, byte param1) {
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
        var4 = HoldTheLine.field_D;
        var6 = ca.a((byte) -127, ' ', param0);
        var7 = var6;
        if (var6.length == 0) {
          throw new IllegalArgumentException();
        } else {
          L0: {
            var3 = new cg();
            if (param1 == -95) {
              break L0;
            } else {
              var5 = null;
              cg discarded$1 = tl.a((String) null, (byte) -55);
              break L0;
            }
          }
          L1: {
            if (var6[0].equalsIgnoreCase("addplayer")) {
              if (var7.length == 2) {
                var3.field_c = 0;
                var3.field_d = mo.a((CharSequence) (Object) var7[1], (byte) -116);
                break L1;
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
                      break L1;
                    } else {
                      if (!var6[1].equalsIgnoreCase("slowdown")) {
                        if (var7[1].equalsIgnoreCase("player")) {
                          var3.field_d = -107 - mo.a((CharSequence) (Object) var7[2], (byte) -116);
                          break L1;
                        } else {
                          if (2 >= var7.length) {
                            if (!ik.a((CharSequence) (Object) var7[1], true)) {
                              L2: {
                                if (var7[1].equalsIgnoreCase("off")) {
                                  break L2;
                                } else {
                                  if (!var7[1].equalsIgnoreCase("none")) {
                                    if (var7[1].equalsIgnoreCase("fade")) {
                                      var3.field_d = -114;
                                      break L1;
                                    } else {
                                      if (var7[1].equalsIgnoreCase("all")) {
                                        var3.field_d = -106;
                                        break L1;
                                      } else {
                                        var3.field_d = -vh.a(param1 + 200, var7[1]) + -102;
                                        break L1;
                                      }
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                              var3.field_d = -101;
                              break L1;
                            } else {
                              var3.field_d = mo.a((CharSequence) (Object) var7[1], (byte) -116);
                              break L1;
                            }
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      } else {
                        var3.field_d = -113;
                        break L1;
                      }
                    }
                  }
                } else {
                  if (var6[0].equalsIgnoreCase("addpowerups")) {
                    if (-4 != (var6.length ^ -1)) {
                      throw new IllegalArgumentException();
                    } else {
                      var3.field_c = 3;
                      if (!var6[1].equalsIgnoreCase("random")) {
                        var3.field_d = vh.a(param1 + 191, var7[1]);
                        var3.field_h = mo.a((CharSequence) (Object) var7[2], (byte) -116);
                        break L1;
                      } else {
                        var3.field_d = -1;
                        var3.field_h = mo.a((CharSequence) (Object) var7[2], (byte) -116);
                        break L1;
                      }
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
                              L3: {
                                var3.field_d = -107;
                                stackOut_91_0 = (cg) var3;
                                stackIn_93_0 = stackOut_91_0;
                                stackIn_92_0 = stackOut_91_0;
                                if (var7[2].equalsIgnoreCase("all")) {
                                  stackOut_93_0 = (cg) (Object) stackIn_93_0;
                                  stackOut_93_1 = -106;
                                  stackIn_94_0 = stackOut_93_0;
                                  stackIn_94_1 = stackOut_93_1;
                                  break L3;
                                } else {
                                  stackOut_92_0 = (cg) (Object) stackIn_92_0;
                                  stackOut_92_1 = mo.a((CharSequence) (Object) var7[2], (byte) -116);
                                  stackIn_94_0 = stackOut_92_0;
                                  stackIn_94_1 = stackOut_92_1;
                                  break L3;
                                }
                              }
                              stackIn_94_0.field_h = stackIn_94_1;
                              break L1;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          } else {
                            if (-3 == (var6.length ^ -1)) {
                              if (var7[1].equalsIgnoreCase("car")) {
                                var3.field_h = -106;
                                var3.field_d = -107;
                                break L1;
                              } else {
                                if (!var7[1].equalsIgnoreCase("all")) {
                                  var3.field_d = vh.a(105, var7[1]);
                                  break L1;
                                } else {
                                  var3.field_d = -106;
                                  break L1;
                                }
                              }
                            } else {
                              var3.field_d = -106;
                              break L1;
                            }
                          }
                        }
                      } else {
                        if (var6[0].equalsIgnoreCase("lockpowerups")) {
                          if (-3 > (var6.length ^ -1)) {
                            throw new IllegalArgumentException();
                          } else {
                            L4: {
                              var3.field_c = 6;
                              if ((var6.length ^ -1) == -2) {
                                break L4;
                              } else {
                                if (!var6[1].equalsIgnoreCase("on")) {
                                  if (var7[1].equalsIgnoreCase("off")) {
                                    var3.field_d = 0;
                                    break L1;
                                  } else {
                                    throw new IllegalArgumentException();
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var3.field_d = -1;
                            break L1;
                          }
                        } else {
                          if (var6[0].equalsIgnoreCase("playerpower")) {
                            if (5 != var6.length) {
                              throw new IllegalArgumentException();
                            } else {
                              L5: {
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
                                  break L5;
                                } else {
                                  stackOut_61_0 = (cg) (Object) stackIn_61_0;
                                  stackOut_61_1 = vh.a(121, var6[2]);
                                  stackIn_63_0 = stackOut_61_0;
                                  stackIn_63_1 = stackOut_61_1;
                                  break L5;
                                }
                              }
                              L6: {
                                stackIn_63_0.field_h = stackIn_63_1;
                                stackOut_63_0 = (cg) var3;
                                stackIn_65_0 = stackOut_63_0;
                                stackIn_64_0 = stackOut_63_0;
                                if (!var6[3].equalsIgnoreCase("empty")) {
                                  stackOut_65_0 = (cg) (Object) stackIn_65_0;
                                  stackOut_65_1 = vh.a(115, var6[3]);
                                  stackIn_66_0 = stackOut_65_0;
                                  stackIn_66_1 = stackOut_65_1;
                                  break L6;
                                } else {
                                  stackOut_64_0 = (cg) (Object) stackIn_64_0;
                                  stackOut_64_1 = -1;
                                  stackIn_66_0 = stackOut_64_0;
                                  stackIn_66_1 = stackOut_64_1;
                                  break L6;
                                }
                              }
                              L7: {
                                stackIn_66_0.field_e = stackIn_66_1;
                                stackOut_66_0 = (cg) var3;
                                stackIn_68_0 = stackOut_66_0;
                                stackIn_67_0 = stackOut_66_0;
                                if (!var6[4].equalsIgnoreCase("empty")) {
                                  stackOut_68_0 = (cg) (Object) stackIn_68_0;
                                  stackOut_68_1 = vh.a(102, var6[4]);
                                  stackIn_69_0 = stackOut_68_0;
                                  stackIn_69_1 = stackOut_68_1;
                                  break L7;
                                } else {
                                  stackOut_67_0 = (cg) (Object) stackIn_67_0;
                                  stackOut_67_1 = -1;
                                  stackIn_69_0 = stackOut_67_0;
                                  stackIn_69_1 = stackOut_67_1;
                                  break L7;
                                }
                              }
                              stackIn_69_0.field_k = stackIn_69_1;
                              break L1;
                            }
                          } else {
                            if (var6[0].equalsIgnoreCase("setlap")) {
                              if (-4 == (var6.length ^ -1)) {
                                var3.field_c = 8;
                                var3.field_d = mo.a((CharSequence) (Object) var6[1], (byte) -116);
                                var3.field_h = mo.a((CharSequence) (Object) var6[2], (byte) -116);
                                break L1;
                              } else {
                                throw new IllegalArgumentException();
                              }
                            } else {
                              if (!var6[0].equalsIgnoreCase("spin")) {
                                if (var7[0].equalsIgnoreCase("resetplayers")) {
                                  if (var7.length == 2) {
                                    var3.field_c = 10;
                                    var3.field_d = mo.a((CharSequence) (Object) var7[1], (byte) -116);
                                    break L1;
                                  } else {
                                    throw new IllegalArgumentException();
                                  }
                                } else {
                                  if (var7[0].equalsIgnoreCase("setlapcount")) {
                                    if (2 == var7.length) {
                                      var3.field_c = 11;
                                      var3.field_d = mo.a((CharSequence) (Object) var7[1], (byte) -116);
                                      break L1;
                                    } else {
                                      throw new IllegalArgumentException();
                                    }
                                  } else {
                                    if (var7[0].equalsIgnoreCase("endtutorial")) {
                                      if ((var7.length ^ -1) == -2) {
                                        var3.field_c = 12;
                                        break L1;
                                      } else {
                                        throw new IllegalArgumentException();
                                      }
                                    } else {
                                      if (var7[0].equalsIgnoreCase("endgame")) {
                                        if (1 == var7.length) {
                                          var3.field_c = 13;
                                          break L1;
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
                                if ((var6.length ^ -1) == -4) {
                                  var3.field_c = 9;
                                  var3.field_d = mo.a((CharSequence) (Object) var6[1], (byte) -116);
                                  if (var6[2].equalsIgnoreCase("forever")) {
                                    var3.field_h = -1;
                                    break L1;
                                  } else {
                                    var3.field_h = mo.a((CharSequence) (Object) var6[2], (byte) -116);
                                    break L1;
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
                      if ((var6.length ^ -1) != -4) {
                        throw new IllegalArgumentException();
                      } else {
                        var3.field_c = 4;
                        if (var6[1].equalsIgnoreCase("random")) {
                          var3.field_d = -1;
                          var3.field_h = mo.a((CharSequence) (Object) var7[2], (byte) -116);
                          break L1;
                        } else {
                          var3.field_d = vh.a(102, var6[1]);
                          var3.field_h = mo.a((CharSequence) (Object) var7[2], (byte) -116);
                          break L1;
                        }
                      }
                    }
                  }
                }
              } else {
                if (2 >= var6.length) {
                  L8: {
                    var3.field_c = 1;
                    if ((var6.length ^ -1) == -2) {
                      break L8;
                    } else {
                      if (!var6[1].equalsIgnoreCase("on")) {
                        if (var7[1].equalsIgnoreCase("off")) {
                          var3.field_d = 0;
                          break L1;
                        } else {
                          throw new IllegalArgumentException();
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  var3.field_d = -1;
                  break L1;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            }
          }
          return var3;
        }
    }

    final String a(n param0, byte param1) {
        int var3 = -110 / ((param1 - 73) / 49);
        return ni.a('*', (byte) -125, param0.field_q.length());
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
