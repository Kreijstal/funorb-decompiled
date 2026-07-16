/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends ri {
    static String[] field_y;
    static volatile boolean field_A;
    static int field_w;
    static String field_C;
    static String field_D;
    static tf field_B;
    static byte[] field_x;
    static String[][] field_z;

    final static void a(int param0, int param1) {
        hn var2 = null;
        if (param0 != 65536) {
          int discarded$2 = rp.a(false, -70);
          var2 = new hn(1, new int[1]);
          ii.a(var2, 69);
          return;
        } else {
          var2 = new hn(1, new int[1]);
          ii.a(var2, 69);
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if ((param0 ^ -1) != -2) {
          if (param2 > -123) {
            return -2;
          } else {
            return sr.field_j[param0];
          }
        } else {
          if (!rd.a(-16143, param1)) {
            if (param2 > -123) {
              return -2;
            } else {
              return sr.field_j[param0];
            }
          } else {
            return 29;
          }
        }
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_73_0 = 0;
        L0: {
          var5 = Kickabout.field_G;
          nq.field_I = nq.field_I + 65536;
          if (param1 == -587) {
            break L0;
          } else {
            ff[] discarded$1 = rp.b(-111);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if (-65537 < (bd.a(vp.field_a, false, nq.field_I) ^ -1)) {
                break L3;
              } else {
                stackOut_3_0 = nq.field_I - vp.field_a;
                stackIn_7_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (var5 != 0) {
                  break L2;
                } else {
                  nq.field_I = stackIn_4_0;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            break L2;
          }
          L4: {
            L5: {
              var2 = stackIn_7_0;
              if (wo.field_n != null) {
                break L5;
              } else {
                if (null == sb.field_b) {
                  break L4;
                } else {
                  var2 = sb.field_b.length;
                  if (var5 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            var2 = wo.field_n.length;
            break L4;
          }
          L6: {
            if (-1 != var2) {
              L7: {
                if ((vp.field_f ^ -1) >= (ig.field_g ^ -1)) {
                  break L7;
                } else {
                  L8: {
                    ig.field_g = ig.field_g + 1;
                    if ((vp.field_c ^ -1) <= (ig.field_g ^ -1)) {
                      break L8;
                    } else {
                      L9: {
                        if (wo.field_n == null) {
                          break L9;
                        } else {
                          if (wo.field_n[ps.field_e] != null) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      ig.field_g = ig.field_g - 1;
                      if (var5 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if ((ig.field_g ^ -1) > (vp.field_f ^ -1)) {
                    break L7;
                  } else {
                    if (null != wo.field_n[(ps.field_e - -1) % var2]) {
                      break L7;
                    } else {
                      ig.field_g = ig.field_g - 1;
                      break L7;
                    }
                  }
                }
              }
              L10: {
                if ((vp.field_f ^ -1) >= (ig.field_g ^ -1)) {
                  L11: {
                    ig.field_g = ig.field_g - vp.field_f;
                    if (sm.field_m) {
                      break L11;
                    } else {
                      ps.field_e = ps.field_e - 1;
                      if (ps.field_e >= 0) {
                        break L10;
                      } else {
                        ps.field_e = ps.field_e + var2;
                        if (var5 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  ps.field_e = ps.field_e + 1;
                  if ((ps.field_e ^ -1) > (var2 ^ -1)) {
                    break L10;
                  } else {
                    ps.field_e = ps.field_e - var2;
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              if ((vp.field_c ^ -1) <= (ig.field_g ^ -1)) {
                break L6;
              } else {
                sm.field_m = true;
                break L6;
              }
            } else {
              break L6;
            }
          }
          L12: {
            if (null != ga.field_E) {
              L13: {
                var3 = -(ga.field_E.field_v / 2) + 357;
                var4 = 0;
                if (0 == wj.field_A) {
                  break L13;
                } else {
                  if (vc.field_y <= var3) {
                    break L13;
                  } else {
                    if ((ga.field_E.field_w + var3 ^ -1) < (vc.field_y ^ -1)) {
                      L14: {
                        if ((269 + -ga.field_E.field_q ^ -1) <= (sm.field_q ^ -1)) {
                          break L14;
                        } else {
                          if ((sm.field_q ^ -1) <= -270) {
                            break L14;
                          } else {
                            sm.field_m = false;
                            ig.field_g = vp.field_f;
                            var4 = 1;
                            break L14;
                          }
                        }
                      }
                      if (-587 <= (sm.field_q ^ -1)) {
                        break L13;
                      } else {
                        if (sm.field_q >= ga.field_E.field_q + 586) {
                          break L13;
                        } else {
                          ig.field_g = vp.field_f;
                          var4 = 1;
                          sm.field_m = true;
                          break L13;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                }
              }
              if (var4 != 0) {
                break L12;
              } else {
                if (ig.field_g <= vp.field_c) {
                  break L12;
                } else {
                  if ((var3 ^ -1) <= (n.field_m ^ -1)) {
                    break L12;
                  } else {
                    if (var3 - -ga.field_E.field_w > n.field_m) {
                      L15: {
                        if ((el.field_A ^ -1) >= (269 - ga.field_E.field_q ^ -1)) {
                          break L15;
                        } else {
                          if (269 > el.field_A) {
                            ig.field_g = vp.field_c;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if ((el.field_A ^ -1) >= -587) {
                        break L12;
                      } else {
                        if (el.field_A >= ga.field_E.field_q + 586) {
                          break L12;
                        } else {
                          ig.field_g = vp.field_c;
                          break L12;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                }
              }
            } else {
              break L12;
            }
          }
          if (param0) {
            L16: {
              fp.field_l.a(-21174, vp.a(n.field_m, el.field_A, (byte) 98), vp.a(vc.field_y, sm.field_q, (byte) 69));
              if (!fp.field_l.c(-1)) {
                break L16;
              } else {
                if (fp.field_l.field_e != 0) {
                  if ((fp.field_l.field_e ^ -1) != -2) {
                    break L16;
                  } else {
                    return 2;
                  }
                } else {
                  return 3;
                }
              }
            }
            L17: while (true) {
              if (!nk.b((byte) -59)) {
                return 0;
              } else {
                L18: {
                  fp.field_l.a(0, true);
                  if (!fp.field_l.c(param1 ^ 586)) {
                    break L18;
                  } else {
                    if ((fp.field_l.field_e ^ -1) == -1) {
                      return 3;
                    } else {
                      if (1 != fp.field_l.field_e) {
                        break L18;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
                if (cc.field_e != 13) {
                  continue L17;
                } else {
                  stackOut_73_0 = 1;
                  stackIn_76_0 = stackOut_73_0;
                  stackIn_74_0 = stackOut_73_0;
                  if (var5 != 0) {
                    return stackIn_76_0;
                  } else {
                    return stackIn_74_0;
                  }
                }
              }
            }
          } else {
            return 0;
          }
        }
    }

    private rp(hu param0, int param1) {
        super(param0, param1);
    }

    final String b(byte param0, fd param1) {
        if (param0 > -38) {
          field_D = null;
          return ce.a('*', (byte) 48, param1.field_q.length());
        } else {
          return ce.a('*', (byte) 48, param1.field_q.length());
        }
    }

    final static ff[] b(int param0) {
        if (param0 != -27666) {
          field_A = true;
          return new ff[]{eb.field_c, om.field_yb, um.field_c, tb.field_t, wr.field_h, fi.field_e, vp.field_o, ge.field_j, kd.field_r, mn.field_e, cr.field_b, uq.field_d, tj.field_z, k.field_l};
        } else {
          return new ff[]{eb.field_c, om.field_yb, um.field_c, tb.field_t, wr.field_h, fi.field_e, vp.field_o, ge.field_j, kd.field_r, mn.field_e, cr.field_b, uq.field_d, tj.field_z, k.field_l};
        }
    }

    rp(int param0) {
        this(gf.field_a, param0);
    }

    public static void a(int param0) {
        field_C = null;
        field_z = null;
        field_y = null;
        field_B = null;
        field_D = null;
        field_x = null;
        if (param0 >= 84) {
          return;
        } else {
          int discarded$2 = rp.a(114, -72, -26);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new String[]{"Timelimit", "Facebook", "Gamemode", "Tournament"};
        field_A = false;
        field_C = "This player did not sell. He remains in your team.";
        field_D = "Computer";
        field_z = new String[][]{new String[4], new String[4]};
    }
}
