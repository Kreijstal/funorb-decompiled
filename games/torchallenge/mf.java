/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static String[] field_b;
    static String field_a;

    final static void c(int param0) {
        if (param0 >= -68) {
            field_a = null;
        }
    }

    final static boolean a(byte param0) {
        int var1 = -57 / ((param0 - 35) / 35);
        return true;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 3) {
            return;
        }
        field_b = null;
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if ((param0 ^ -1) != param1) {
            break L0;
          } else {
            if ((ol.field_h ^ -1) < -1) {
              ol.field_h = ol.field_h - 1;
              var2_ref_byte__ = di.field_E[ol.field_h - 1];
              di.field_E[ol.field_h] = null;
              return var2_ref_byte__;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 != 5000) {
            break L1;
          } else {
            if (0 < bl.field_P) {
              bl.field_P = bl.field_P - 1;
              var2_ref_byte__ = nk.field_b[bl.field_P - 1];
              nk.field_b[bl.field_P] = null;
              return var2_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param0 != 30000) {
            break L2;
          } else {
            if (0 < oj.field_c) {
              oj.field_c = oj.field_c - 1;
              var2_ref_byte__ = cd.field_j[oj.field_c - 1];
              cd.field_j[oj.field_c] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != cg.field_i) {
            var2 = 0;
            L4: while (true) {
              if (var2 >= pe.field_gb.length) {
                break L3;
              } else {
                if (param0 == pe.field_gb[var2]) {
                  if (fk.field_v[var2] > 0) {
                    fk.field_v[var2] = fk.field_v[var2] - 1;
                    var3 = cg.field_i[var2][fk.field_v[var2] - 1];
                    cg.field_i[var2][fk.field_v[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        return new byte[param0];
    }

    final static void a(boolean param0, byte[] param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        int var17 = 0;
        int var18 = 0;
        L0: {
          var18 = TorChallenge.field_F ? 1 : 0;
          of.field_f = 0;
          wb.field_p = null;
          if (param2 == 24233) {
            break L0;
          } else {
            mf.a(-120);
            break L0;
          }
        }
        L1: {
          var4 = 0;
          fg.field_N = 0;
          var6 = 5;
          if (param0) {
            var4++;
            var7 = param1[var4];
            if ((var7 ^ -1) == -2) {
              var4++;
              fh.field_e = param1[var4];
              break L1;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        var4++;
        var7 = param1[var4];
        var5 = 0;
        L2: while (true) {
          L3: {
            if (6 <= var5) {
              break L3;
            } else {
              L4: {
                if ((var7 & 1 << var5 ^ -1) >= -1) {
                  break L4;
                } else {
                  var5++;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var5++;
              if (0 == 0) {
                continue L2;
              } else {
                break L3;
              }
            }
          }
          L5: {
            if (var7 == 0) {
              var5 = 0;
              break L5;
            } else {
              break L5;
            }
          }
          var4++;
          var8 = 0;
          L6: while (true) {
            L7: {
              if ((var8 ^ -1) <= -65) {
                break L7;
              } else {
                var9 = 0;
                L8: while (true) {
                  L9: {
                    if (var9 >= ba.field_i.field_a) {
                      break L9;
                    } else {
                      var4++;
                      ic.field_E[var8][var9] = param1[var4];
                      var9++;
                      if (0 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var8++;
                  if (0 == 0) {
                    continue L6;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L10: {
              if (!param3) {
                break L10;
              } else {
                L11: {
                  var4++;
                  var8 = param1[var4];
                  if (var8 > -1) {
                    var8 = var8 + 256;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var4++;
                  var9 = param1[var4];
                  if (-1 > var9) {
                    var9 = 256 - -var9;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  L14: {
                    var14 = 0;
                    ea.field_g = new qe[(var8 << 1109243944) + var9];
                    if (n.field_kb == null) {
                      break L14;
                    } else {
                      if (ba.field_i.field_a >= n.field_kb[0].length) {
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  n.field_kb = new int[64][][];
                  var5 = 0;
                  L15: while (true) {
                    if (-65 >= (var5 ^ -1)) {
                      break L13;
                    } else {
                      n.field_kb[var5] = new int[ba.field_i.field_a][];
                      var5++;
                      if (0 == 0) {
                        continue L15;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                L16: {
                  var15 = ea.field_e * 5;
                  var16 = null;
                  w.field_m = 0;
                  var5 = 0;
                  if (var5 >= ea.field_g.length) {
                    if (var16 == null) {
                      break L16;
                    } else {
                      if (null == wb.field_p) {
                        break L16;
                      } else {
                        wb.field_p.field_r = ((qe) var16).field_r;
                        wb.field_p.field_f = ((qe) var16).field_f;
                        break L16;
                      }
                    }
                  } else {
                    if (var16 == null) {
                      break L16;
                    } else {
                      if (null == wb.field_p) {
                        break L16;
                      } else {
                        wb.field_p.field_r = ((qe) var16).field_r;
                        wb.field_p.field_f = ((qe) var16).field_f;
                        break L16;
                      }
                    }
                  }
                }
                ol.field_g = ba.field_i;
                boolean discarded$1 = pg.d(0);
                qk.field_lb = 0;
                wj.field_a = 0;
                cb.field_c = new int[w.field_m][4];
                var5 = 0;
                L17: while (true) {
                  L18: {
                    if (w.field_m <= var5) {
                      break L18;
                    } else {
                      var17 = 0;
                      L19: while (true) {
                        L20: {
                          if (-5 >= (var17 ^ -1)) {
                            break L20;
                          } else {
                            cb.field_c[var5][var17] = -1;
                            var17++;
                            if (0 == 0) {
                              continue L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var5++;
                        if (0 == 0) {
                          continue L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  ch.a(bl.field_O[0], bl.field_O[1], 0);
                  break L10;
                }
              }
            }
            return;
          }
        }
    }

    final static void b(int param0) {
        int[] var4 = null;
        int[] var6 = null;
        int[] var8 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        L0: {
          var4 = new int[]{5};
          var15 = lg.field_d[4];
          da.a(200, 440, var15[6] + var15[8], 61, var15[3], 4, var4);
          ug.field_i[4] = new pd(4, be.field_e);
          var16 = lg.field_d[2];
          var6 = new int[]{8, 9, 10, 5};
          da.a(var16[1], var16[2], var16[6] + var16[8], 74, var16[3], param0, var6);
          ug.field_i[2] = new pd(2, be.field_e);
          if (0 >= ee.field_o) {
            break L0;
          } else {
            if (ol.a((byte) -119, sh.field_u)) {
              var17 = lg.field_d[1];
              var8 = new int[]{1, 12, 13, 4, 31, 3, 7};
              da.a(var17[1], var17[2], var17[6] + var17[8], 118, var17[3], 1, var8);
              ug.field_i[1] = new pd(1, be.field_e);
              break L0;
            } else {
              break L0;
            }
          }
        }
        ll.field_b = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[255];
    }
}
