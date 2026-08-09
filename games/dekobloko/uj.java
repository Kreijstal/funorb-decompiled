/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static String field_g;
    static String[] field_f;
    static int field_a;
    static String field_e;
    static String field_b;
    static String field_c;
    static ck[][] field_d;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var6 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = param1 + (2 + (485 + param4) + 16);
                        var7 = -37 / ((-64 - param5) / 62);
                        re.field_x.a(-6 + var6_int, 0, 3, -6 + ea.field_D.field_N, 3);
                        var8 = -5 + re.field_x.field_N;
                        sk.field_c.a(2 + (485 + param4) - -param1, 0, -param0 + var8, param0, 5);
                        wj.field_Mb.a(sk.field_c.field_mb - (param4 + jb.field_f.field_mb), 0, 0, param0, param4);
                        var8 = var8 - (param0 - -2);
                        jb.field_f.a(jb.field_f.field_mb, 0, 0, param0, param4 + wj.field_Mb.field_mb);
                        dn.field_l.a(6, 5, param1, 5, var8 - 5, 487 + param4 - -param1, 2);
                        if (null == bc.field_E) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        bc.field_E.b(dn.field_l.field_N, dn.field_l.field_mb, dn.field_l.field_vb, dn.field_l.field_Ib, -16555);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9 = -var6_int + (-param4 + ea.field_D.field_mb);
                        var10 = var9 / 2;
                        var11 = param2 + (var10 + param4);
                        var12 = 0;
                        var13 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var13 ^ -1) <= -7) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var15 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var13 ^ -1) <= -6) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null != dh.field_c[var13]) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var15 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var14 = 3 - -((-6 + (ea.field_D.field_N - -2)) * var12 / (dh.field_f - -1));
                        var12++;
                        var8 = 1 + ((-4 + ea.field_D.field_N) * var12 / (1 + dh.field_f) - var14);
                        if (var13 >= 5) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        dh.field_c[var13].a(var9, 0, var14, var8, var6_int);
                        ui.field_E[var13].a(-param4 + var10, 0, 0, var8, param4);
                        si.field_b[var13].a(param2, 0, param3, -param3 + (var8 - param3), var10);
                        le.field_D[var13].a(-var11 + (-param4 + var9), 0, param3, -param3 + (var8 - param3), var11);
                        if (var15 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        qb.field_p.a(var9, 0, var14, var8, var6_int);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        qb.field_p.a(var9, 0, var14, var8, var6_int);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var13++;
                        if (var15 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var6), "uj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_c = null;
        if (param0 <= 99) {
            return;
        }
        field_e = null;
        field_d = (ck[][]) null;
        field_g = null;
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        int fieldTemp$6 = 0;
        int dupTemp$7 = 0;
        byte[][] arrayValue$8 = null;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int dupTemp$11 = 0;
        byte[][] arrayValue$12 = null;
        int fieldTemp$13 = 0;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        if (param1 != 100) {
          L0: {
            if ((param1 ^ -1) != -5001) {
              break L0;
            } else {
              if (la.field_a <= 0) {
                break L0;
              } else {
                fieldTemp$2 = la.field_a - 1;
                la.field_a = la.field_a - 1;
                var2_ref_byte__ = vk.field_c[fieldTemp$2];
                vk.field_c[la.field_a] = null;
                return var2_ref_byte__;
              }
            }
          }
          if (param0 == 5) {
            L1: {
              if (param1 != 30000) {
                break L1;
              } else {
                if ((d.field_c ^ -1) >= -1) {
                  break L1;
                } else {
                  fieldTemp$3 = d.field_c - 1;
                  d.field_c = d.field_c - 1;
                  var2_ref_byte__ = gk.field_yb[fieldTemp$3];
                  gk.field_yb[d.field_c] = null;
                  return var2_ref_byte__;
                }
              }
            }
            if (null != jg.field_b) {
              var2 = 0;
              L2: while (true) {
                if (ln.field_d.length <= var2) {
                  return new byte[param1];
                } else {
                  if (ln.field_d[var2] == param1) {
                    if ((wa.field_d[var2] ^ -1) < -1) {
                      dupTemp$4 = wa.field_d[var2] - 1;
                      arrayValue$5 = jg.field_b[var2];
                      wa.field_d[var2] = dupTemp$4;
                      var3 = arrayValue$5[dupTemp$4];
                      jg.field_b[var2][wa.field_d[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              return new byte[param1];
            }
          } else {
            return (byte[]) null;
          }
        } else {
          if (rb.field_h <= 0) {
            if ((param1 ^ -1) == -5001) {
              if (la.field_a <= 0) {
                if (param0 == 5) {
                  L3: {
                    if (param1 != 30000) {
                      break L3;
                    } else {
                      if ((d.field_c ^ -1) >= -1) {
                        break L3;
                      } else {
                        fieldTemp$6 = d.field_c - 1;
                        d.field_c = d.field_c - 1;
                        var2_ref_byte__ = gk.field_yb[fieldTemp$6];
                        gk.field_yb[d.field_c] = null;
                        return var2_ref_byte__;
                      }
                    }
                  }
                  if (null != jg.field_b) {
                    var2 = 0;
                    L4: while (true) {
                      if (ln.field_d.length <= var2) {
                        return new byte[param1];
                      } else {
                        if (ln.field_d[var2] == param1) {
                          if ((wa.field_d[var2] ^ -1) < -1) {
                            dupTemp$7 = wa.field_d[var2] - 1;
                            arrayValue$8 = jg.field_b[var2];
                            wa.field_d[var2] = dupTemp$7;
                            var3 = arrayValue$8[dupTemp$7];
                            jg.field_b[var2][wa.field_d[var2]] = null;
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
                    return new byte[param1];
                  }
                } else {
                  return (byte[]) null;
                }
              } else {
                fieldTemp$9 = la.field_a - 1;
                la.field_a = la.field_a - 1;
                var2_ref_byte__ = vk.field_c[fieldTemp$9];
                vk.field_c[la.field_a] = null;
                return var2_ref_byte__;
              }
            } else {
              if (param0 == 5) {
                L5: {
                  if (param1 != 30000) {
                    break L5;
                  } else {
                    if ((d.field_c ^ -1) >= -1) {
                      break L5;
                    } else {
                      fieldTemp$10 = d.field_c - 1;
                      d.field_c = d.field_c - 1;
                      var2_ref_byte__ = gk.field_yb[fieldTemp$10];
                      gk.field_yb[d.field_c] = null;
                      return var2_ref_byte__;
                    }
                  }
                }
                if (null != jg.field_b) {
                  var2 = 0;
                  L6: while (true) {
                    if (ln.field_d.length > var2) {
                      if (ln.field_d[var2] == param1) {
                        if ((wa.field_d[var2] ^ -1) < -1) {
                          dupTemp$11 = wa.field_d[var2] - 1;
                          arrayValue$12 = jg.field_b[var2];
                          wa.field_d[var2] = dupTemp$11;
                          var3 = arrayValue$12[dupTemp$11];
                          jg.field_b[var2][wa.field_d[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L6;
                        }
                      } else {
                        var2++;
                        continue L6;
                      }
                    } else {
                      return new byte[param1];
                    }
                  }
                } else {
                  return new byte[param1];
                }
              } else {
                return (byte[]) null;
              }
            }
          } else {
            fieldTemp$13 = rb.field_h - 1;
            rb.field_h = rb.field_h - 1;
            var2_ref_byte__ = of.field_f[fieldTemp$13];
            of.field_f[rb.field_h] = null;
            return var2_ref_byte__;
          }
        }
    }

    static {
        field_f = new String[]{"Welcome to the Master Challenge!<br><br>The Master Challenge is not for the faint of heart. Games are short, and, unlike Stamina Mode, the Master Challenge gets very harsh very quickly. Get as many points as you can, while you can.", "The Master Challenge will test your skill in every different Deko Bloko strategy. You will need to use different strategies as the game progresses. Have you noticed the strategy box on the right? Keep checking it for each new theme."};
        field_e = "Seriously offensive language";
        field_b = "<%0> SHAPES";
        field_c = "to return to the normal view.";
        field_d = new ck[8][];
        field_g = "Rated games are available to members only. To become a member and gain access to Rated games, extra game options and more, please visit the 'Account' section of the website.";
    }
}
