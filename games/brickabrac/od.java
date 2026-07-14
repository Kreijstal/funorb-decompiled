/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends java.awt.Canvas {
    static String field_b;
    private java.awt.Component field_a;
    static int field_c;

    od(java.awt.Component param0) {
        ((od) this).field_a = param0;
    }

    public final void paint(java.awt.Graphics param0) {
        ((od) this).field_a.paint(param0);
    }

    final static void a(byte param0) {
        int var2 = 0;
        L0: {
          var2 = BrickABrac.field_J ? 1 : 0;
          if (13 != pp.field_a) {
            if (pp.field_a == -15) {
              if (0 >= jl.field_a) {
                break L0;
              } else {
                jl.field_a = jl.field_a - 1;
                if (0 == jl.field_a - 1) {
                  mn.field_v = de.field_x;
                  tb.field_eb = hq.field_y;
                  pp.field_a = -1;
                  jl.field_a = 250;
                  ga.field_i = 0;
                  c.field_i = un.field_e;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              if (-1 == pp.field_a) {
                if (0 >= jl.field_a) {
                  break L0;
                } else {
                  jl.field_a = jl.field_a - 1;
                  if (0 == jl.field_a - 1) {
                    pp.field_a = -1;
                    ga.field_i = 1;
                    jl.field_a = 250;
                    c.field_i = un.field_e;
                    mn.field_v = de.field_x;
                    tb.field_eb = va.field_d;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                if (pp.field_a == 1) {
                  break L0;
                } else {
                  if (2 == pp.field_a) {
                    if (0 >= jl.field_a) {
                      break L0;
                    } else {
                      jl.field_a = jl.field_a - 1;
                      if (0 != jl.field_a - 1) {
                        break L0;
                      } else {
                        tb.field_eb = op.field_b;
                        pp.field_a = -1;
                        ga.field_i = 3;
                        break L0;
                      }
                    }
                  } else {
                    if (-4 == pp.field_a) {
                      break L0;
                    } else {
                      if (-5 != pp.field_a) {
                        if (pp.field_a != 5) {
                          if ((pp.field_a ^ -1) == -7) {
                            pp.field_a = da.field_G;
                            ga.field_i = da.field_G;
                            break L0;
                          } else {
                            L1: {
                              if ((pp.field_a ^ -1) == -9) {
                                break L1;
                              } else {
                                if ((pp.field_a ^ -1) != -10) {
                                  if (pp.field_a != 10) {
                                    if (-12 == (pp.field_a ^ -1)) {
                                      break L0;
                                    } else {
                                      if ((pp.field_a ^ -1) == -13) {
                                        break L0;
                                      } else {
                                        break L0;
                                      }
                                    }
                                  } else {
                                    ga.field_i = da.field_G;
                                    pp.field_a = da.field_G;
                                    break L0;
                                  }
                                } else {
                                  break L1;
                                }
                              }
                            }
                            if ((jl.field_a ^ -1) >= -1) {
                              break L0;
                            } else {
                              jl.field_a = jl.field_a - 1;
                              if (jl.field_a - 1 != 0) {
                                break L0;
                              } else {
                                ga.field_i = 11;
                                pp.field_a = -1;
                                tb.field_eb = bj.field_U;
                                wl.field_N = true;
                                break L0;
                              }
                            }
                          }
                        } else {
                          break L0;
                        }
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (0 >= jl.field_a) {
              break L0;
            } else {
              jl.field_a = jl.field_a - 1;
              if (0 != jl.field_a - 1) {
                break L0;
              } else {
                mn.field_v = de.field_x;
                pp.field_a = -1;
                c.field_i = un.field_e;
                tb.field_eb = sb.field_d;
                jl.field_a = 250;
                ga.field_i = 14;
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 == 32) {
            break L2;
          } else {
            field_c = 109;
            break L2;
          }
        }
    }

    public final void update(java.awt.Graphics param0) {
        ((od) this).field_a.update(param0);
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          if (0 >= param0) {
            break L0;
          } else {
            if (param0 < 128) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 < 160) {
            break L1;
          } else {
            if (param0 > 255) {
              break L1;
            } else {
              return true;
            }
          }
        }
        L2: {
          if (param0 != 0) {
            var6 = ai.field_r;
            var2 = var6;
            var3 = 0;
            L3: while (true) {
              if (var3 >= var6.length) {
                break L2;
              } else {
                var4 = var6[var3];
                if (var4 != param0) {
                  var3++;
                  continue L3;
                } else {
                  return true;
                }
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (param1 == -12) {
            break L4;
          } else {
            field_c = -78;
            break L4;
          }
        }
        return false;
    }

    public static void a(boolean param0) {
        if (param0) {
            od.a((byte) 23);
        }
        field_b = null;
    }

    final static void a(int param0, long param1, StringBuilder param2) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        gh.field_e.setLength(0);
        if (param0 != -9) {
            field_c = -91;
        }
        int var4 = param1 < 0L ? 1 : 0;
        int var5 = 0;
        do {
            StringBuilder discarded$0 = gh.field_e.append((char)(48 + (int)(param1 % 10L)));
            param1 = param1 / 10L;
            var5++;
        } while (0L != param1);
        if (var4 != 0) {
            StringBuilder discarded$1 = gh.field_e.append(45);
        }
        for (var6 = var5 - 1; (var6 ^ -1) <= -1; var6--) {
            StringBuilder discarded$2 = param2.append(gh.field_e.charAt(var6));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Shortcut Reference";
    }
}
