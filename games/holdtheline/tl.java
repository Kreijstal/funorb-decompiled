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
          field_y = (af) null;
        }
        field_y = null;
        field_z = null;
    }

    private tl(qi param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(int[] param0, int param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        aa var4_ref_aa = null;
        int var4 = 0;
        aa var5 = null;
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        try {
          if (d.field_f != ad.field_b) {
            return false;
          }
          if (param1 != 31881) {
            tl.d(false);
          }
          var2_long = bb.b(-1);
          if (wl.field_c != 0 &&
            ji.field_o < 0) {
            var4_ref_aa = (aa) (ej.field_a.b((byte) 111));
            if (var4_ref_aa != null &&
              var2_long > var4_ref_aa.field_o) {
              var4_ref_aa.d(0);
              ad.field_c = var4_ref_aa.field_i.length;
              rd.field_e.field_l = 0;
              for (var5_int = 0; var5_int < ad.field_c; var5_int++) {
                rd.field_e.field_i[var5_int] = var4_ref_aa.field_i[var5_int];
              }
              ab.field_pb = hc.field_e;
              hc.field_e = rd.field_l;
              rd.field_l = vn.field_c;
              vn.field_c = var4_ref_aa.field_l;
              return true;
            }
          }
          while (true) {
            if (0 > ji.field_o) {
              rd.field_e.field_l = 0;
              if (!hi.b(1, (byte) 40)) {
                return false;
              }
              ji.field_o = rd.field_e.g((byte) 73);
              rd.field_e.field_l = 0;
              ad.field_c = param0[ji.field_o];
            }
            if (!ok.a((byte) 55)) {
              return false;
            }
            if (0 == wl.field_c) {
              ab.field_pb = hc.field_e;
              hc.field_e = rd.field_l;
              rd.field_l = vn.field_c;
              vn.field_c = ji.field_o;
              ji.field_o = -1;
              return true;
            }
            var4 = wl.field_c;
            if (ji.field_d != 0.0) {
              var4 = (int)((double)var4 + ha.field_n.nextGaussian() * ji.field_d);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new aa((long)var4 + var2_long, ji.field_o, new byte[ad.field_c]);
            for (var6 = 0; var6 < ad.field_c; var6++) {
              var5.field_i[var6] = rd.field_e.field_i[var6];
            }
            ej.field_a.a((byte) -70, var5);
            ji.field_o = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("tl.U(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(')').toString());
        }
    }

    final static cg a(String param0, byte param1) {
        cg stackIn_62_0 = null;
        int stackIn_63_1 = 0;
        cg stackIn_65_0 = null;
        int stackIn_66_1 = 0;
        cg stackIn_68_0 = null;
        int stackIn_69_1 = 0;
        cg stackIn_93_0 = null;
        int stackIn_94_1 = 0;
        cg stackIn_129_0 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_133_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        cg var3 = null;
        int var4 = 0;
        String var5 = null;
        String[] var6 = null;
        String[] var7 = null;
        var4 = HoldTheLine.field_D;
        try {
          var6 = ca.a((byte) -127, ' ', param0);
          var7 = var6;
          if (var6.length == 0) {
            throw new IllegalArgumentException();
          }
          var3 = new cg();
          if (param1 != -95) {
            var5 = (String) null;
            tl.a((String) null, (byte) -55);
          }
          boolean decompiledFrameRemainder0 = true;
          if (var6[0].equalsIgnoreCase("addplayer")) {
            if (var7.length != 2) {
              throw new IllegalArgumentException();
            }
            var3.field_c = 0;
            var3.field_d = mo.a((CharSequence) ((Object) var7[1]), (byte) -116);
          } else {
            if (!var6[0].equalsIgnoreCase("pause")) {
              if (var6[0].equalsIgnoreCase("highlight")) {
                if (3 < var6.length) {
                  throw new IllegalArgumentException();
                }
                var3.field_c = 2;
                if (var6[1].equalsIgnoreCase("booster")) {
                  var3.field_d = -112;
                } else {
                  if (!var6[1].equalsIgnoreCase("slowdown")) {
                    if (var7[1].equalsIgnoreCase("player")) {
                      var3.field_d = -107 - mo.a((CharSequence) ((Object) var7[2]), (byte) -116);
                    } else {
                      if (2 < var7.length) {
                        throw new IllegalArgumentException();
                      }
                      if (!ik.a((CharSequence) ((Object) var7[1]), true)) {
                        if (!var7[1].equalsIgnoreCase("off") &&
                          !var7[1].equalsIgnoreCase("none")) {
                          if (var7[1].equalsIgnoreCase("fade")) {
                            var3.field_d = -114;
                          } else {
                            if (var7[1].equalsIgnoreCase("all")) {
                              var3.field_d = -106;
                            } else {
                              var3.field_d = -vh.a(param1 + 200, var7[1]) - 102;
                            }
                          }
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          var3.field_d = -101;
                        }
                      } else {
                        var3.field_d = mo.a((CharSequence) ((Object) var7[1]), (byte) -116);
                      }
                    }
                  } else {
                    var3.field_d = -113;
                  }
                }
              } else {
                if (var6[0].equalsIgnoreCase("addpowerups")) {
                  if (var6.length != 3) {
                    throw new IllegalArgumentException();
                  }
                  var3.field_c = 3;
                  if (!var6[1].equalsIgnoreCase("random")) {
                    var3.field_d = vh.a(param1 + 191, var7[1]);
                  } else {
                    var3.field_d = -1;
                  }
                  var3.field_h = mo.a((CharSequence) ((Object) var7[2]), (byte) -116);
                } else {
                  if (!var6[0].equalsIgnoreCase("addpowerupstrips")) {
                    if (var6[0].equalsIgnoreCase("removepowerups")) {
                      var3.field_c = 5;
                      if (var6.length > 3) {
                        throw new IllegalArgumentException();
                      }
                      if (var6.length == 3) {
                        if (!var7[1].equalsIgnoreCase("car")) {
                          throw new IllegalArgumentException();
                        }
                        var3.field_d = -107;
                        stackIn_93_0 = var3;
                        if (var7[2].equalsIgnoreCase("all")) {
                          stackIn_94_1 = -106;
                        } else {
                          stackIn_94_1 = mo.a((CharSequence) ((Object) var7[2]), (byte) -116);
                        }
                        stackIn_93_0.field_h = stackIn_94_1;
                      } else {
                        if (var6.length == 2) {
                          if (var7[1].equalsIgnoreCase("car")) {
                            var3.field_h = -106;
                            var3.field_d = -107;
                          } else {
                            if (!var7[1].equalsIgnoreCase("all")) {
                              var3.field_d = vh.a(105, var7[1]);
                            } else {
                              var3.field_d = -106;
                            }
                          }
                        } else {
                          var3.field_d = -106;
                        }
                      }
                    } else {
                      if (var6[0].equalsIgnoreCase("lockpowerups")) {
                        if (var6.length > 2) {
                          throw new IllegalArgumentException();
                        }
                        var3.field_c = 6;
                        if (var6.length != 1 &&
                          !var6[1].equalsIgnoreCase("on")) {
                          if (!var7[1].equalsIgnoreCase("off")) {
                            throw new IllegalArgumentException();
                          }
                          var3.field_d = 0;
                        } else {
                          var3.field_d = -1;
                        }
                      } else {
                        if (var6[0].equalsIgnoreCase("playerpower")) {
                          if (5 != var6.length) {
                            throw new IllegalArgumentException();
                          }
                          var3.field_c = 7;
                          var3.field_d = mo.a((CharSequence) ((Object) var6[1]), (byte) -116);
                          stackIn_62_0 = var3;
                          if (var6[2].equalsIgnoreCase("empty")) {
                            stackIn_63_1 = -1;
                          } else {
                            stackIn_63_1 = vh.a(121, var6[2]);
                          }
                          stackIn_62_0.field_h = stackIn_63_1;
                          stackIn_65_0 = var3;
                          if (!var6[3].equalsIgnoreCase("empty")) {
                            stackIn_66_1 = vh.a(115, var6[3]);
                          } else {
                            stackIn_66_1 = -1;
                          }
                          stackIn_65_0.field_e = stackIn_66_1;
                          stackIn_68_0 = var3;
                          if (!var6[4].equalsIgnoreCase("empty")) {
                            stackIn_69_1 = vh.a(102, var6[4]);
                          } else {
                            stackIn_69_1 = -1;
                          }
                          stackIn_68_0.field_k = stackIn_69_1;
                        } else {
                          if (var6[0].equalsIgnoreCase("setlap")) {
                            if (var6.length != 3) {
                              throw new IllegalArgumentException();
                            }
                            var3.field_c = 8;
                            var3.field_d = mo.a((CharSequence) ((Object) var6[1]), (byte) -116);
                            var3.field_h = mo.a((CharSequence) ((Object) var6[2]), (byte) -116);
                          } else {
                            if (!var6[0].equalsIgnoreCase("spin")) {
                              if (var7[0].equalsIgnoreCase("resetplayers")) {
                                if (var7.length != 2) {
                                  throw new IllegalArgumentException();
                                }
                                var3.field_c = 10;
                                var3.field_d = mo.a((CharSequence) ((Object) var7[1]), (byte) -116);
                              } else {
                                if (var7[0].equalsIgnoreCase("setlapcount")) {
                                  if (2 != var7.length) {
                                    throw new IllegalArgumentException();
                                  }
                                  var3.field_c = 11;
                                  var3.field_d = mo.a((CharSequence) ((Object) var7[1]), (byte) -116);
                                } else {
                                  if (var7[0].equalsIgnoreCase("endtutorial")) {
                                    if (var7.length != 1) {
                                      throw new IllegalArgumentException();
                                    }
                                    var3.field_c = 12;
                                  } else {
                                    if (!var7[0].equalsIgnoreCase("endgame")) {
                                      throw new IllegalArgumentException();
                                    }
                                    if (1 != var7.length) {
                                      throw new IllegalArgumentException();
                                    }
                                    var3.field_c = 13;
                                  }
                                }
                              }
                            } else {
                              if (var6.length != 3) {
                                throw new IllegalArgumentException();
                              }
                              var3.field_c = 9;
                              var3.field_d = mo.a((CharSequence) ((Object) var6[1]), (byte) -116);
                              if (var6[2].equalsIgnoreCase("forever")) {
                                var3.field_h = -1;
                              } else {
                                var3.field_h = mo.a((CharSequence) ((Object) var6[2]), (byte) -116);
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (var6.length != 3) {
                      throw new IllegalArgumentException();
                    }
                    var3.field_c = 4;
                    if (var6[1].equalsIgnoreCase("random")) {
                      var3.field_d = -1;
                    } else {
                      var3.field_d = vh.a(102, var6[1]);
                    }
                    var3.field_h = mo.a((CharSequence) ((Object) var7[2]), (byte) -116);
                  }
                }
              }
            } else {
              if (2 < var6.length) {
                throw new IllegalArgumentException();
              }
              var3.field_c = 1;
              if (var6.length != 1 &&
                !var6[1].equalsIgnoreCase("on")) {
                if (!var7[1].equalsIgnoreCase("off")) {
                  throw new IllegalArgumentException();
                }
                var3.field_d = 0;
              } else {
                var3.field_d = -1;
              }
            }
          }
          stackIn_129_0 = var3;
          return stackIn_129_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_132_0 = var2;
          stackIn_132_1 = new StringBuilder().append("tl.T(");
          if (param0 == null) {
            stackIn_133_2 = "null";
          } else {
            stackIn_133_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_132_0), ((StringBuilder) (Object) stackIn_132_1).append(stackIn_133_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(n param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -110 / ((param1 - 73) / 49);
          stackIn_1_0 = ni.a('*', (byte) -125, param0.field_q.length());
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("tl.S(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    tl(int param0) {
        this(hl.field_g, param0);
    }

    static {
        field_z = new int[8192];
        field_x = 4;
    }
}
