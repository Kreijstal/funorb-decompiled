/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends qs {
    static pf field_E;
    private static int[] field_G;
    static int[] field_F;
    private static int[] field_A;
    static int field_C;
    private static int[] field_I;
    private static int[] field_H;
    static String field_B;

    final static void a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_146_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (s.field_c == -1) {
          if (0 != (cb.field_n ^ -1)) {
            L0: {
              L1: {
                rq.field_e = rq.field_e + 1;
                if (param0 == null) {
                  if (jq.field_d != null) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  if (param0.equals((Object) (Object) jq.field_d)) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (!sc.field_q) {
                  if (ri.field_F <= rq.field_e) {
                    if (rq.field_e < ri.field_F - -de.field_i) {
                      stackOut_144_0 = 1;
                      stackIn_146_0 = stackOut_144_0;
                      break L2;
                    } else {
                      stackOut_143_0 = 0;
                      stackIn_146_0 = stackOut_143_0;
                      break L2;
                    }
                  } else {
                    stackOut_141_0 = 0;
                    stackIn_146_0 = stackOut_141_0;
                    break L2;
                  }
                } else {
                  stackOut_139_0 = 0;
                  stackIn_146_0 = stackOut_139_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = stackIn_146_0;
                  if (param0 == null) {
                    break L4;
                  } else {
                    if (sc.field_q) {
                      rq.field_e = ri.field_F;
                      break L3;
                    } else {
                      if (var2 == 0) {
                        break L4;
                      } else {
                        rq.field_e = ri.field_F;
                        break L3;
                      }
                    }
                  }
                }
                rq.field_e = 0;
                break L3;
              }
              if (param0 != null) {
                sc.field_q = false;
                rs.field_Fb = cb.field_n;
                ra.field_g = s.field_c;
                break L0;
              } else {
                if (var2 == 0) {
                  rs.field_Fb = cb.field_n;
                  ra.field_g = s.field_c;
                  break L0;
                } else {
                  sc.field_q = true;
                  rs.field_Fb = cb.field_n;
                  ra.field_g = s.field_c;
                  break L0;
                }
              }
            }
            L5: {
              jq.field_d = param0;
              if (sc.field_q) {
                break L5;
              } else {
                if (rq.field_e >= ri.field_F) {
                  break L5;
                } else {
                  if (r.field_d) {
                    rq.field_e = 0;
                    rs.field_Fb = cb.field_n;
                    ra.field_g = s.field_c;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              s.field_c = -1;
              if (param1 == 0) {
                break L6;
              } else {
                field_F = null;
                break L6;
              }
            }
            L7: {
              cb.field_n = -1;
              if (!sc.field_q) {
                break L7;
              } else {
                if (rq.field_e != t.field_f) {
                  break L7;
                } else {
                  sc.field_q = false;
                  rq.field_e = 0;
                  break L7;
                }
              }
            }
            return;
          } else {
            L8: {
              L9: {
                s.field_c = pd.field_k;
                cb.field_n = bb.field_b;
                rq.field_e = rq.field_e + 1;
                if (param0 == null) {
                  if (jq.field_d != null) {
                    break L8;
                  } else {
                    break L9;
                  }
                } else {
                  if (param0.equals((Object) (Object) jq.field_d)) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (!sc.field_q) {
                  if (ri.field_F <= rq.field_e) {
                    if (rq.field_e >= ri.field_F - -de.field_i) {
                      stackOut_108_0 = 0;
                      stackIn_110_0 = stackOut_108_0;
                      break L10;
                    } else {
                      stackOut_107_0 = 1;
                      stackIn_110_0 = stackOut_107_0;
                      break L10;
                    }
                  } else {
                    stackOut_105_0 = 0;
                    stackIn_110_0 = stackOut_105_0;
                    break L10;
                  }
                } else {
                  stackOut_103_0 = 0;
                  stackIn_110_0 = stackOut_103_0;
                  break L10;
                }
              }
              L11: {
                L12: {
                  var2 = stackIn_110_0;
                  if (param0 == null) {
                    break L12;
                  } else {
                    if (sc.field_q) {
                      rq.field_e = ri.field_F;
                      break L11;
                    } else {
                      if (var2 == 0) {
                        break L12;
                      } else {
                        rq.field_e = ri.field_F;
                        break L11;
                      }
                    }
                  }
                }
                rq.field_e = 0;
                break L11;
              }
              L13: {
                if (param0 != null) {
                  sc.field_q = false;
                  break L13;
                } else {
                  if (var2 == 0) {
                    break L13;
                  } else {
                    sc.field_q = true;
                    break L13;
                  }
                }
              }
              rs.field_Fb = cb.field_n;
              ra.field_g = s.field_c;
              break L8;
            }
            L14: {
              jq.field_d = param0;
              if (sc.field_q) {
                break L14;
              } else {
                if (rq.field_e >= ri.field_F) {
                  break L14;
                } else {
                  if (r.field_d) {
                    rq.field_e = 0;
                    rs.field_Fb = cb.field_n;
                    ra.field_g = s.field_c;
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
            }
            L15: {
              s.field_c = -1;
              if (param1 == 0) {
                break L15;
              } else {
                field_F = null;
                break L15;
              }
            }
            L16: {
              cb.field_n = -1;
              if (!sc.field_q) {
                break L16;
              } else {
                if (rq.field_e != t.field_f) {
                  break L16;
                } else {
                  sc.field_q = false;
                  rq.field_e = 0;
                  break L16;
                }
              }
            }
            return;
          }
        } else {
          rq.field_e = rq.field_e + 1;
          if (param0 == null) {
            if (jq.field_d != null) {
              L17: {
                jq.field_d = param0;
                if (sc.field_q) {
                  break L17;
                } else {
                  if (rq.field_e >= ri.field_F) {
                    break L17;
                  } else {
                    if (r.field_d) {
                      rq.field_e = 0;
                      rs.field_Fb = cb.field_n;
                      ra.field_g = s.field_c;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
              }
              L18: {
                s.field_c = -1;
                if (param1 == 0) {
                  break L18;
                } else {
                  field_F = null;
                  break L18;
                }
              }
              L19: {
                cb.field_n = -1;
                if (!sc.field_q) {
                  break L19;
                } else {
                  if (rq.field_e != t.field_f) {
                    break L19;
                  } else {
                    sc.field_q = false;
                    rq.field_e = 0;
                    break L19;
                  }
                }
              }
              return;
            } else {
              L20: {
                if (!sc.field_q) {
                  if (ri.field_F <= rq.field_e) {
                    if (rq.field_e < ri.field_F - -de.field_i) {
                      stackOut_56_0 = 1;
                      stackIn_58_0 = stackOut_56_0;
                      break L20;
                    } else {
                      stackOut_55_0 = 0;
                      stackIn_58_0 = stackOut_55_0;
                      break L20;
                    }
                  } else {
                    stackOut_53_0 = 0;
                    stackIn_58_0 = stackOut_53_0;
                    break L20;
                  }
                } else {
                  stackOut_51_0 = 0;
                  stackIn_58_0 = stackOut_51_0;
                  break L20;
                }
              }
              L21: {
                var2 = stackIn_58_0;
                if (param0 != null) {
                  if (sc.field_q) {
                    rq.field_e = ri.field_F;
                    break L21;
                  } else {
                    if (var2 != 0) {
                      rq.field_e = ri.field_F;
                      break L21;
                    } else {
                      rq.field_e = 0;
                      break L21;
                    }
                  }
                } else {
                  rq.field_e = 0;
                  break L21;
                }
              }
              L22: {
                if (param0 != null) {
                  sc.field_q = false;
                  rs.field_Fb = cb.field_n;
                  ra.field_g = s.field_c;
                  break L22;
                } else {
                  if (var2 == 0) {
                    rs.field_Fb = cb.field_n;
                    ra.field_g = s.field_c;
                    break L22;
                  } else {
                    sc.field_q = true;
                    rs.field_Fb = cb.field_n;
                    ra.field_g = s.field_c;
                    break L22;
                  }
                }
              }
              L23: {
                jq.field_d = param0;
                if (sc.field_q) {
                  break L23;
                } else {
                  if (rq.field_e >= ri.field_F) {
                    break L23;
                  } else {
                    if (r.field_d) {
                      rq.field_e = 0;
                      rs.field_Fb = cb.field_n;
                      ra.field_g = s.field_c;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
              }
              L24: {
                s.field_c = -1;
                if (param1 == 0) {
                  break L24;
                } else {
                  field_F = null;
                  break L24;
                }
              }
              L25: {
                cb.field_n = -1;
                if (!sc.field_q) {
                  break L25;
                } else {
                  if (rq.field_e != t.field_f) {
                    break L25;
                  } else {
                    sc.field_q = false;
                    rq.field_e = 0;
                    break L25;
                  }
                }
              }
              return;
            }
          } else {
            if (param0.equals((Object) (Object) jq.field_d)) {
              L26: {
                jq.field_d = param0;
                if (sc.field_q) {
                  break L26;
                } else {
                  if (rq.field_e >= ri.field_F) {
                    break L26;
                  } else {
                    if (r.field_d) {
                      rq.field_e = 0;
                      rs.field_Fb = cb.field_n;
                      ra.field_g = s.field_c;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                }
              }
              L27: {
                s.field_c = -1;
                if (param1 == 0) {
                  break L27;
                } else {
                  field_F = null;
                  break L27;
                }
              }
              L28: {
                cb.field_n = -1;
                if (!sc.field_q) {
                  break L28;
                } else {
                  if (rq.field_e != t.field_f) {
                    break L28;
                  } else {
                    sc.field_q = false;
                    rq.field_e = 0;
                    break L28;
                  }
                }
              }
              return;
            } else {
              L29: {
                if (!sc.field_q) {
                  if (ri.field_F <= rq.field_e) {
                    if (rq.field_e < ri.field_F - -de.field_i) {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L29;
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_11_0 = stackOut_8_0;
                      break L29;
                    }
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_11_0 = stackOut_6_0;
                    break L29;
                  }
                } else {
                  stackOut_4_0 = 0;
                  stackIn_11_0 = stackOut_4_0;
                  break L29;
                }
              }
              L30: {
                var2 = stackIn_11_0;
                if (param0 != null) {
                  L31: {
                    if (sc.field_q) {
                      break L31;
                    } else {
                      if (var2 != 0) {
                        break L31;
                      } else {
                        rq.field_e = 0;
                        break L30;
                      }
                    }
                  }
                  rq.field_e = ri.field_F;
                  break L30;
                } else {
                  rq.field_e = 0;
                  break L30;
                }
              }
              L32: {
                if (param0 != null) {
                  sc.field_q = false;
                  rs.field_Fb = cb.field_n;
                  ra.field_g = s.field_c;
                  break L32;
                } else {
                  if (var2 == 0) {
                    rs.field_Fb = cb.field_n;
                    ra.field_g = s.field_c;
                    break L32;
                  } else {
                    sc.field_q = true;
                    rs.field_Fb = cb.field_n;
                    ra.field_g = s.field_c;
                    break L32;
                  }
                }
              }
              L33: {
                jq.field_d = param0;
                if (sc.field_q) {
                  break L33;
                } else {
                  if (rq.field_e >= ri.field_F) {
                    break L33;
                  } else {
                    if (r.field_d) {
                      rq.field_e = 0;
                      rs.field_Fb = cb.field_n;
                      ra.field_g = s.field_c;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                }
              }
              L34: {
                s.field_c = -1;
                if (param1 == 0) {
                  break L34;
                } else {
                  field_F = null;
                  break L34;
                }
              }
              L35: {
                cb.field_n = -1;
                if (!sc.field_q) {
                  break L35;
                } else {
                  if (rq.field_e != t.field_f) {
                    break L35;
                  } else {
                    sc.field_q = false;
                    rq.field_e = 0;
                    break L35;
                  }
                }
              }
              return;
            }
          }
        }
    }

    final static String g(byte param0) {
        if (!(-3 >= (ma.field_p ^ -1))) {
            return de.field_h;
        }
        if (es.field_j != null) {
            if (!(es.field_j.b((byte) 107))) {
                return i.field_a;
            }
            return ns.field_xb;
        }
        if (!(rq.field_g.b((byte) 13))) {
            return fa.field_J;
        }
        if (!(rq.field_g.a("commonui", 77))) {
            return ii.field_r + " - " + rq.field_g.a("commonui", (byte) 65) + "%";
        }
        if (!(tq.field_f.b((byte) -69))) {
            return rq.field_h;
        }
        if (!tq.field_f.a("commonui", -91)) {
            return on.field_h + " - " + tq.field_f.a("commonui", (byte) 28) + "%";
        }
        int var1 = 32 % ((param0 - 15) / 52);
        if (!(l.field_g.b((byte) -2))) {
            return ed.field_e;
        }
        if (!(l.field_g.a(-1))) {
            return jh.field_v + " - " + l.field_g.d(100) + "%";
        }
        return ea.field_d;
    }

    public static void f(byte param0) {
        field_F = null;
        field_I = null;
        field_G = null;
        if (param0 != 111) {
          String discarded$2 = vj.i(-3);
          field_E = null;
          field_B = null;
          field_A = null;
          field_H = null;
          return;
        } else {
          field_E = null;
          field_B = null;
          field_A = null;
          field_H = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        fr var8 = null;
        super.a(param0, param1, param2, param3, param4 + 0, param5);
        var8 = oa.field_b;
        if (param4 == -600269855) {
          if (var8 != null) {
            if (((vj) this).a(param0, 87, param3, param1, param2)) {
              if (!(((vj) this).field_u instanceof lf)) {
                if (var8.field_u instanceof lf) {
                  ((lf) (Object) var8.field_u).a(param4 ^ 600248316, (vj) this, var8);
                  oa.field_b = null;
                  return;
                } else {
                  return;
                }
              } else {
                ((lf) (Object) ((vj) this).field_u).a(-27619, (vj) this, var8);
                oa.field_b = null;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private vj(int param0, int param1, int param2, int param3, iq param4, ko param5, vg param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((vj) this).field_z = param6;
    }

    final static String i(int param0) {
        if (param0 >= -90) {
            field_B = null;
            if (!(ue.field_a != ee.field_l)) {
                return aa.field_G;
            }
            return oj.field_Ib;
        }
        if (!(ue.field_a != ee.field_l)) {
            return aa.field_G;
        }
        return oj.field_Ib;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_E = new pf();
        field_F = new int[256];
        field_G = new int[256];
        field_I = new int[256];
        field_H = new int[256];
        field_A = new int[256];
        field_B = "Diplomacy";
        for (var0 = 0; 256 > var0; var0++) {
            field_F[var0] = 65793 * var0;
            field_A[var0] = 65793 * (var0 >> 140729538);
            field_I[var0] = var0 * 65536;
            field_G[var0] = ee.a(we.a(var0, -1912602370) << 242378823, var0);
            field_H[var0] = (var0 >> -107959071) * 65537;
        }
    }
}
