/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hqb {
    llb field_b;
    private String field_g;
    private int field_c;
    static int field_f;
    aw field_i;
    private long field_d;
    static String[][] field_k;
    int field_h;
    private int[] field_e;
    String field_a;
    static String field_j;

    private final boolean a(int param0, int param1, int param2) {
        String var4 = null;
        L0: {
          if (param2 <= -64) {
            break L0;
          } else {
            ((hqb) this).b(33);
            break L0;
          }
        }
        L1: {
          var4 = null;
          if (param1 != 4) {
            if ((param1 ^ -1) == -6) {
              var4 = npa.a((byte) 90, ((hqb) this).field_a, param0);
              break L1;
            } else {
              if (6 != param1) {
                if (7 == param1) {
                  var4 = iab.a(param0, ((hqb) this).field_g, ((hqb) this).field_a, (byte) -76);
                  break L1;
                } else {
                  return false;
                }
              } else {
                var4 = tba.a(2, ((hqb) this).field_a, param0);
                break L1;
              }
            }
          } else {
            var4 = ukb.a(((hqb) this).field_a, param0, 9602);
            break L1;
          }
        }
        L2: {
          if (var4 == null) {
            break L2;
          } else {
            lh.a((byte) -112, 0, (String) null, ((hqb) this).field_a, var4, 2);
            break L2;
          }
        }
        return true;
    }

    private final boolean a(byte param0, int param1, int param2) {
        if (param0 != 16) {
            field_f = 14;
        }
        if (17 != param1) {
            return false;
        }
        crb.field_v = new bwa(((hqb) this).field_b.field_M, ((hqb) this).field_b.field_u, ((hqb) this).field_b.field_hb, ((hqb) this).field_b.field_G, param2, fh.field_g, lo.field_b, kn.field_p, qc.field_q, urb.field_o, iga.field_o, ((hqb) this).field_a, ((hqb) this).field_d);
        return true;
    }

    private final boolean b(byte param0, int param1, int param2) {
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (-1 != (param2 ^ -1)) {
            if (param2 != 1) {
              if (param2 != -3) {
                if (-4 != param2) {
                  if ((param2 ^ -1) != -11) {
                    if ((param2 ^ -1) == -16) {
                      mia.a(param1, ((hqb) this).field_h, 91);
                      break L0;
                    } else {
                      if (16 != param2) {
                        return false;
                      } else {
                        mia.a(param1, 0, 53);
                        break L0;
                      }
                    }
                  } else {
                    jua.a(((hqb) this).field_h, param1, 20694);
                    break L0;
                  }
                } else {
                  sh.a(((hqb) this).field_h, -1, param1);
                  break L0;
                }
              } else {
                pa.a(param1, (byte) -128, ((hqb) this).field_h);
                break L0;
              }
            } else {
              pe.a(param1, ((hqb) this).field_d, param0 ^ -25);
              break L0;
            }
          } else {
            ut.a(6, ((hqb) this).field_d, param1);
            break L0;
          }
        }
        if (param0 == 99) {
          return true;
        } else {
          boolean discarded$2 = this.a((byte) 32, 2, 100);
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, byte param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = VoidHunters.field_G;
        if (param4 > param0) {
          if (1 + param0 >= param2) {
            return;
          } else {
            L0: {
              if (param0 + 5 >= param2) {
                break L0;
              } else {
                if (param6 == param1) {
                  break L0;
                } else {
                  var7 = (1 & (param6 & param1)) + ((param6 >> -1515240959) - -(param1 >> 266938081));
                  var8 = param0;
                  var9 = param1;
                  var10 = param6;
                  var11 = param0;
                  L1: while (true) {
                    if (var11 >= param2) {
                      hqb.a(param0, param1, var8, param3, param4, (byte) 24, var9);
                      hqb.a(var8, var10, param2, param3, param4, param5, param6);
                      return;
                    } else {
                      L2: {
                        var12 = sv.field_f[var11];
                        if (param3) {
                          stackOut_22_0 = fmb.field_o[var12];
                          stackIn_23_0 = stackOut_22_0;
                          break L2;
                        } else {
                          stackOut_21_0 = hga.field_o[var12];
                          stackIn_23_0 = stackOut_21_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_23_0;
                      if (var13 > var7) {
                        sv.field_f[var11] = sv.field_f[var8];
                        var8++;
                        sv.field_f[var8] = var12;
                        if (var13 < var9) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        if (var13 > var10) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = param2 - 1;
            L3: while (true) {
              if (param0 >= var7) {
                return;
              } else {
                var8 = param0;
                L4: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = sv.field_f[var8];
                    var10 = sv.field_f[1 + var8];
                    if (dla.a(param5 + 103, param3, var10, var9)) {
                      sv.field_f[var8] = var10;
                      sv.field_f[1 + var8] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int[] param2) {
        String var4 = null;
        vu var5 = null;
        int var6 = 0;
        Object var7 = null;
        String var8 = null;
        L0: {
          if (((hqb) this).field_a == null) {
            break L0;
          } else {
            L1: {
              if ((wqa.field_a ^ -1L) != (((hqb) this).field_d ^ -1L)) {
                break L1;
              } else {
                if (param1 != 2) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (iwa.field_b != 2) {
              break L0;
            } else {
              L2: {
                var8 = this.b((byte) -63);
                var4 = var8;
                var5 = di.a(((hqb) this).field_a, 0);
                var6 = ltb.a((byte) -94, ((hqb) this).field_a) ? 1 : 0;
                if (var5 != null) {
                  break L2;
                } else {
                  if (var6 == 0) {
                    ((hqb) this).field_i.a(isa.a(knb.field_r, new String[1], 93), (byte) -53, 4);
                    ((hqb) this).field_i.a(isa.a(uda.field_c, new String[1], 104), (byte) -53, 6);
                    if (param2 == null) {
                      break L2;
                    } else {
                      if ((param1 ^ -1) == -3) {
                        break L2;
                      } else {
                        if (erb.field_p) {
                          break L2;
                        } else {
                          ((hqb) this).field_e = param2;
                          ((hqb) this).field_i.a(isa.a(raa.field_q, new String[1], 87), (byte) -53, 19);
                          break L2;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var5 == null) {
                  break L3;
                } else {
                  L4: {
                    if (qs.a(0, ((hqb) this).field_a)) {
                      break L4;
                    } else {
                      if (erb.field_p) {
                        break L4;
                      } else {
                        L5: {
                          if (hb.field_c) {
                            break L5;
                          } else {
                            ((hqb) this).field_i.a(isa.a(qia.field_o, new String[1], 104), (byte) -53, 8);
                            break L5;
                          }
                        }
                        ((hqb) this).field_i.a(isa.a(eha.field_p, new String[1], 112), (byte) -53, 18);
                        if (param2 != null) {
                          ((hqb) this).field_e = param2;
                          ((hqb) this).field_i.a(isa.a(raa.field_q, new String[1], 73), (byte) -53, 19);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  ((hqb) this).field_i.a(isa.a(dfb.field_o, new String[1], 114), (byte) -53, 5);
                  break L3;
                }
              }
              if (var6 != 0) {
                ((hqb) this).field_i.a(isa.a(lu.field_c, new String[1], 80), (byte) -53, 7);
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L6: {
          if (param0 < -13) {
            break L6;
          } else {
            var7 = null;
            String discarded$1 = hqb.a(false, (byte) -9, (CharSequence) null);
            break L6;
          }
        }
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        if (param1 == 43) {
          if (param2 != null) {
            L0: {
              var3 = param2.length();
              if (var3 < 1) {
                break L0;
              } else {
                if (var3 > 12) {
                  break L0;
                } else {
                  L1: {
                    var4 = jwa.a(false, param2);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (-2 >= (var4.length() ^ -1)) {
                        L2: {
                          if (fg.a(var4.charAt(0), 56)) {
                            break L2;
                          } else {
                            if (!fg.a(var4.charAt(var4.length() - 1), param1 ^ 79)) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param2.length()) {
                                  if (0 < var5) {
                                    return kma.field_d;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  L4: {
                                    var7 = param2.charAt(var6);
                                    if (fg.a((char) var7, 45)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  if ((var5 ^ -1) <= -3) {
                                    if (!param0) {
                                      return amb.field_a;
                                    } else {
                                      var6++;
                                      continue L3;
                                    }
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        return kma.field_d;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return bka.field_o;
                }
              }
            }
            return bka.field_o;
          } else {
            return bka.field_o;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 > -103) {
            Object var2 = null;
            String discarded$0 = hqb.a(true, (byte) -64, (CharSequence) null);
        }
        field_j = null;
    }

    final void a(int param0, boolean param1) {
        ((hqb) this).field_i.b(param1, 39);
        if (param0 != 1) {
            field_f = 4;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (param2 == -17791) {
            break L0;
          } else {
            ((hqb) this).field_a = null;
            break L0;
          }
        }
        L1: {
          if (param1 != 8) {
            if (18 == param1) {
              bab.a(((hqb) this).field_a, ((hqb) this).field_d, 63);
              break L1;
            } else {
              if (param1 == -12) {
                mea.a(0, (byte) -118, param0, ((hqb) this).field_c);
                break L1;
              } else {
                if (param1 == 12) {
                  mea.a(1, (byte) -123, param0, ((hqb) this).field_c);
                  break L1;
                } else {
                  if (-14 == param1) {
                    mea.a(2, (byte) -105, param0, ((hqb) this).field_c);
                    break L1;
                  } else {
                    if (param1 != 14) {
                      if (param1 != 20) {
                        if (19 != param1) {
                          return false;
                        } else {
                          boolean discarded$28 = fia.a(((hqb) this).field_e, ((hqb) this).field_c, (byte) 105, ((hqb) this).field_d, ((hqb) this).field_a);
                          return true;
                        }
                      } else {
                        or.a(0);
                        break L1;
                      }
                    } else {
                      km.e(1);
                      break L1;
                    }
                  }
                }
              }
            }
          } else {
            ir.a((byte) 39, ((hqb) this).field_d, ((hqb) this).field_a);
            break L1;
          }
        }
        return true;
    }

    final void a(boolean param0, int param1) {
        jk var4 = null;
        String var5 = null;
        int var6 = 0;
        jk var7 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (param1 > 1) {
            break L0;
          } else {
            ((hqb) this).field_b = null;
            break L0;
          }
        }
        L1: {
          if (((hqb) this).field_a == null) {
            break L1;
          } else {
            if (wqa.field_a == ((hqb) this).field_d) {
              break L1;
            } else {
              if (null == lqa.field_o) {
                break L1;
              } else {
                if (!nmb.b(-45)) {
                  break L1;
                } else {
                  var7 = pdb.a((byte) 80, ((hqb) this).field_d);
                  var4 = pjb.a(((hqb) this).field_d, true);
                  var5 = this.b((byte) -128);
                  if (var4 == null) {
                    if (var7 == null) {
                      break L1;
                    } else {
                      if (!lqa.field_o.field_Gb) {
                        break L1;
                      } else {
                        if (lqa.field_o.field_zb < lqa.field_o.field_Fb) {
                          if (!var7.field_Eb) {
                            L2: {
                              if (!param0) {
                                break L2;
                              } else {
                                if (!var7.field_Fb) {
                                  break L2;
                                } else {
                                  ((hqb) this).field_i.a(isa.a(ica.field_p, new String[1], 121), (byte) -53, 0);
                                  ((hqb) this).field_i.a(isa.a(aib.field_b, new String[1], 75), (byte) -53, 1);
                                  break L1;
                                }
                              }
                            }
                            ((hqb) this).field_i.a(isa.a(ina.field_o, new String[1], 94), (byte) -53, 0);
                            break L1;
                          } else {
                            ((hqb) this).field_i.a(isa.a(ts.field_a, new String[1], 115), (byte) -53, 1);
                            break L1;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    L3: {
                      if (!lqa.field_o.field_fc) {
                        break L3;
                      } else {
                        if (lqa.field_o.field_Ub >= 0) {
                          break L3;
                        } else {
                          break L1;
                        }
                      }
                    }
                    ((hqb) this).field_i.a(isa.a(ib.field_o, new String[1], 106), (byte) -53, 1);
                    break L1;
                  }
                }
              }
            }
          }
        }
    }

    final void a(pgb param0, int param1) {
        if (!(!param0.field_k)) {
            return;
        }
        if (param1 <= 73) {
            return;
        }
        ((hqb) this).field_c = param0.field_a;
        if (!(param0.field_a != 0)) {
            if (!(kib.field_d != 0)) {
                ((hqb) this).field_i.a(vv.field_a, (byte) -53, 12);
            }
            ((hqb) this).field_i.a(tda.field_M, (byte) -53, 13);
        }
        if (!(1 != param0.field_a)) {
            if (0 == idb.field_p) {
                ((hqb) this).field_i.a(gbb.field_p, (byte) -53, 12);
            }
            ((hqb) this).field_i.a(ocb.field_j, (byte) -53, 13);
        }
        if (-3 == (param0.field_a ^ -1)) {
            if (!(0 != lla.field_h)) {
                ((hqb) this).field_i.a(bga.field_o, (byte) -53, 12);
            }
            ((hqb) this).field_i.a(uta.field_o, (byte) -53, 13);
        }
    }

    private final String b(byte param0) {
        String var2 = null;
        if (param0 >= -24) {
            return null;
        }
        if (((hqb) this).field_g == null) {
            var2 = ((hqb) this).field_a;
        } else {
            var2 = ((hqb) this).field_g;
        }
        return var2;
    }

    final void a(boolean param0) {
        mm var5 = null;
        int var4 = VoidHunters.field_G;
        if (!param0) {
            return;
        }
        if (lqa.field_o != null) {
        } else {
            var5 = meb.a(((hqb) this).field_h, 1);
            if (var5 == null) {
            } else {
                String var3 = var5.field_Vb;
                if (var5.field_ac) {
                    ((hqb) this).field_i.a(isa.a(rib.field_o, new String[1], 127), (byte) -53, 2);
                    ((hqb) this).field_i.a(isa.a(nrb.field_a, new String[1], 127), (byte) -53, 3);
                } else {
                    if (!var5.field_cc) {
                        // ifne L229
                        // ifeq L229
                        if (var5.field_fc) {
                            // ifeq L229
                        }
                        ((hqb) this).field_i.a(isa.a(ue.field_c, new String[1], 107), (byte) -53, 2);
                    } else {
                        ((hqb) this).field_i.a(isa.a(ti.field_g, new String[1], 101), (byte) -53, 2);
                    }
                    if (!(!var5.field_Qb)) {
                        ((hqb) this).field_i.a(isa.a(t.field_e, new String[1], 126), (byte) -53, 3);
                    }
                }
            }
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = ((hqb) this).field_i.a(param1 + 17, param0);
        if (!(var6 != -2)) {
            return false;
        }
        boolean discarded$1 = this.b((byte) 99, param2, var6);
        if (param1 != -11) {
            ((hqb) this).b(26);
        }
        boolean discarded$2 = this.a(param3, var6, -111);
        boolean discarded$3 = this.b(param3, var6, -17791);
        boolean discarded$4 = this.a((byte) 16, var6, param4);
        return true;
    }

    final boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (((hqb) this).field_i == null) {
                break L1;
              } else {
                if (!((hqb) this).field_i.e((byte) -126)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final void b(int param0) {
        String var3 = null;
        if (((hqb) this).field_a != null) {
            if (wqa.field_a != ((hqb) this).field_d) {
                var3 = this.b((byte) -110);
                String var2 = var3;
                ((hqb) this).field_i.a(isa.a(ona.field_l, new String[1], 83), (byte) -53, 17);
            }
        }
        if (param0 != -9923) {
            ((hqb) this).a(-125, false);
        }
    }

    hqb(llb param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        ((hqb) this).field_i = new aw(aba.field_a);
        ((hqb) this).field_d = param1;
        ((hqb) this).field_b = param0;
        ((hqb) this).field_g = param3;
        param0.field_J = true;
        ((hqb) this).field_a = param2;
        ((hqb) this).field_c = param5;
        ((hqb) this).field_h = param4;
        ((hqb) this).field_e = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_j = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
    }
}
