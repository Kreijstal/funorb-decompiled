/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static lj field_f;
    static String field_a;
    static String[] field_e;
    static boolean field_h;
    static String field_d;
    static cf field_c;
    static ka[] field_i;
    static java.applet.Applet field_g;
    static int field_b;

    final static int a(byte param0, qe param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (param0 < -76) {
          var4 = 0;
          if (vg.a(param1.field_F, -1)) {
            L0: {
              if (null == n.field_kb) {
                break L0;
              } else {
                if (param1 == null) {
                  break L0;
                } else {
                  if (n.field_kb[param1.field_o][param1.field_H] == null) {
                    break L0;
                  } else {
                    var3 = 0;
                    L1: while (true) {
                      if (8 <= var3) {
                        return 1;
                      } else {
                        if (param2 == n.field_kb[param1.field_o][param1.field_H][var3]) {
                          n.field_kb[param1.field_o][param1.field_H][var3] = -1;
                          var3++;
                          continue L1;
                        } else {
                          var3++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            return -1;
          } else {
            return -1;
          }
        } else {
          return 24;
        }
    }

    final static vi a(String param0, boolean param1) {
        if (param0 != null) {
            // if_icmpeq L15
        } else {
            return vh.field_b;
        }
        int var2 = param0.indexOf('@');
        if (!(-1 != var2)) {
            return dj.field_W;
        }
        if (!param1) {
            field_i = null;
        }
        String var3 = param0.substring(0, var2);
        String var4 = param0.substring(var2 - -1);
        vi var5 = re.a(var3, (byte) 104);
        if (var5 != null) {
            return var5;
        }
        return pl.a(var4, 96);
    }

    final static void c(int param0) {
        int var2 = 0;
        ue var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pa var13 = null;
        int var14 = 0;
        int var15 = 0;
        pa var16 = null;
        int[][] var20 = null;
        var12 = TorChallenge.field_F ? 1 : 0;
        var13 = id.field_b;
        var16 = var13;
        var2 = var16.j(-87);
        var3 = (ue) (Object) wl.field_b.c((byte) -63);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var2 == var3.field_k) {
                break L1;
              } else {
                var3 = (ue) (Object) wl.field_b.c(param0 + -5697);
                continue L0;
              }
            }
          }
          if (var3 == null) {
            ob.b(param0 ^ -5466);
            return;
          } else {
            L2: {
              var4 = var16.j(-90);
              if (var4 != 0) {
                var5 = var3.field_m;
                mf.field_b[0] = mf.field_a;
                var6_int = 1;
                L3: while (true) {
                  if (var6_int >= var4) {
                    hh.a(param0 ^ 5425, var5, var4);
                    var6_int = 0;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        hl.a((byte) -44, var5);
                        var6 = new String[2][var5];
                        var20 = new int[2][4 * var5];
                        var8 = bb.field_c;
                        var9 = 0;
                        var10 = 0;
                        L5: while (true) {
                          if (var8 <= var9) {
                            var14 = 0;
                            var9 = var14;
                            var15 = 0;
                            var10 = var15;
                            L6: while (true) {
                              if (var8 <= var14) {
                                break L2;
                              } else {
                                var11 = hi.field_G[var14 + var5];
                                var6[1][var15] = mf.field_b[var11];
                                var20[1][var15 * 4] = bg.field_Q[var11];
                                var20[1][1 + 4 * var15] = rk.field_p[var11];
                                var20[1][2 + var15 * 4] = ea.field_a[var11];
                                var20[1][3 + 4 * var15] = cb.field_e[var11];
                                if (jc.a(mf.field_b[var11], 26691)) {
                                  if (rk.field_p[var11] + (ea.field_a[var11] - -cb.field_e[var11]) == 0) {
                                    var6[1][var15] = null;
                                    var15--;
                                    var14++;
                                    var15++;
                                    continue L6;
                                  } else {
                                    var14++;
                                    var15++;
                                    continue L6;
                                  }
                                } else {
                                  var14++;
                                  var15++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            var11 = hi.field_G[var9];
                            var6[0][var10] = mf.field_b[var11];
                            var20[0][4 * var10] = bg.field_Q[var11];
                            var20[0][var10 * 4 - -1] = rk.field_p[var11];
                            var20[0][var10 * 4 - -2] = ea.field_a[var11];
                            var20[0][3 + var10 * 4] = cb.field_e[var11];
                            if (jc.a(mf.field_b[var11], 26691)) {
                              if (ea.field_a[var11] + (rk.field_p[var11] - -cb.field_e[var11]) == 0) {
                                var6[0][var10] = null;
                                var10--;
                                var9++;
                                var10++;
                                continue L5;
                              } else {
                                var9++;
                                var10++;
                                continue L5;
                              }
                            } else {
                              var9++;
                              var10++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        ob.a(-33, (uf) (Object) var16);
                        if (var6_int == 0) {
                          dd.a(ia.field_j, var6_int, 27715, jf.field_sb, uc.field_U, ti.field_e);
                          var6_int++;
                          continue L4;
                        } else {
                          dd.a(ia.field_j, var6_int, param0 ^ 31088, jf.field_sb, uc.field_U, ti.field_e);
                          var6_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    mf.field_b[var6_int] = var13.b(false);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            if (param0 == 5427) {
              var3.a(true);
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_i = null;
        field_f = null;
        field_g = null;
        field_e = null;
        if (param0 != 0) {
            return;
        }
        field_c = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TorChallenge.field_F ? 1 : 0;
          if (param0 == 3) {
            break L0;
          } else {
            field_g = null;
            break L0;
          }
        }
        L1: {
          if (d.p(-82)) {
            break L1;
          } else {
            L2: {
              if (li.field_N) {
                break L2;
              } else {
                L3: {
                  if (null != qa.field_g) {
                    break L3;
                  } else {
                    qa.field_g = be.a(4, 31315);
                    break L3;
                  }
                }
                if (qa.field_g.field_i) {
                  eh.field_l = eh.field_l & (qa.field_g.field_m ^ -1);
                  jj.field_c = jj.field_c | qa.field_g.field_m;
                  qa.field_g = null;
                  li.field_N = true;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (eb.field_l == null) {
              break L1;
            } else {
              if (eb.field_l.field_j) {
                L4: {
                  L5: {
                    if (!gl.field_a) {
                      break L5;
                    } else {
                      if (null == eb.field_l.field_q) {
                        break L5;
                      } else {
                        if (null != hf.field_d) {
                          L6: {
                            vl.a(eb.field_l.field_q, 10);
                            if (null != hf.field_d) {
                              jl.a((byte) 121);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if (bh.field_p) {
                              break L7;
                            } else {
                              if (d.p(param0 ^ -99)) {
                                break L7;
                              } else {
                                wj.field_b.a((da) (Object) new eh(hf.field_d), -55);
                                break L7;
                              }
                            }
                          }
                          if (vh.field_d != null) {
                            break L4;
                          } else {
                            gl.field_a = false;
                            break L4;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L8: {
                    if (!gl.field_a) {
                      break L8;
                    } else {
                      if (null != eb.field_l.field_q) {
                        break L8;
                      } else {
                        if (hf.field_d == null) {
                          break L8;
                        } else {
                          L9: {
                            jl.a((byte) 123);
                            if (bh.field_p) {
                              break L9;
                            } else {
                              if (!d.p(-86)) {
                                wj.field_b.a((da) (Object) new eh(hf.field_d), -82);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (vh.field_d != null) {
                            break L4;
                          } else {
                            gl.field_a = false;
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    hf.field_d = eb.field_l.field_q;
                    if (!gl.field_a) {
                      break L10;
                    } else {
                      gl.field_a = false;
                      break L10;
                    }
                  }
                  if (null != hf.field_d) {
                    jl.a((byte) 114);
                    if (vh.field_d == null) {
                      vf.b((byte) 109);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                eb.field_l = null;
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L11: {
          if (vh.field_d == null) {
            break L11;
          } else {
            var1 = 0;
            L12: while (true) {
              if (var1 >= 3) {
                var1 = 1;
                var2 = 0;
                L13: while (true) {
                  if (-4 >= (var2 ^ -1)) {
                    if (var1 == 0) {
                      break L11;
                    } else {
                      L14: {
                        vh.field_d = null;
                        if (eb.field_l != null) {
                          break L14;
                        } else {
                          if (gl.field_a) {
                            break L14;
                          } else {
                            vf.b((byte) 115);
                            break L11;
                          }
                        }
                      }
                      if (eb.field_l == null) {
                        gl.field_a = false;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  } else {
                    if (vh.field_d[var2] != null) {
                      var1 = 0;
                      var2++;
                      continue L13;
                    } else {
                      var2++;
                      continue L13;
                    }
                  }
                }
              } else {
                if (vh.field_d[var1].field_i) {
                  ii.field_f[var1] = vh.field_d[var1].field_n;
                  vh.field_d[var1] = null;
                  var1++;
                  continue L12;
                } else {
                  var1++;
                  continue L12;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "To server list";
        field_h = false;
        field_e = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_d = "Connection timed out. Please try using a different server.";
    }
}
