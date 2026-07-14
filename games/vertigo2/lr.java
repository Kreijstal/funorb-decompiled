/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends d {
    static String field_L;
    static er field_O;
    static String field_I;
    static String field_K;
    static String field_J;
    static String field_S;
    static String field_N;
    private int field_Q;
    static aa field_H;
    static cr field_P;
    static String field_M;
    static String field_T;
    private of field_R;

    final void a(byte param0, int param1, int param2, iq param3) {
        if (param0 <= 6) {
          lr.a((byte) 76);
          ((lr) this).field_Q = ((lr) this).field_Q + 1;
          super.a((byte) 114, param1, param2, param3);
          return;
        } else {
          ((lr) this).field_Q = ((lr) this).field_Q + 1;
          super.a((byte) 114, param1, param2, param3);
          return;
        }
    }

    final String a(boolean param0) {
        if (((lr) this).field_p) {
          return ((lr) this).field_R.d(-27183);
        } else {
          if (!param0) {
            return null;
          } else {
            String discarded$2 = ((lr) this).a(true);
            return null;
          }
        }
    }

    public static void a(byte param0) {
        field_O = null;
        field_K = null;
        field_T = null;
        field_H = null;
        field_I = null;
        int var1 = 91 / ((param0 - 36) / 47);
        field_S = null;
        field_L = null;
        field_M = null;
        field_J = null;
        field_N = null;
        field_P = null;
    }

    final boolean a(byte param0, iq param1) {
        if (param0 != 116) {
            return true;
        }
        return false;
    }

    final static void a(int param0, String param1, long param2) {
        CharSequence var5 = null;
        if (param0 > -18) {
          return;
        } else {
          ui.field_g = 2;
          ea.field_b = param1;
          var5 = (CharSequence) (Object) param1;
          sm.field_Kb = rc.a(var5, 320);
          ie.field_Nb = param2;
          nb.h(-14829);
          return;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        ba var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        er var12 = null;
        er var13 = null;
        er var15 = null;
        er var16 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          var5 = ((lr) this).field_o + param2 + (((lr) this).field_n >> -505238111);
          var6 = ((lr) this).field_t + (param3 - -(((lr) this).field_s >> -94601535));
          var8 = ((lr) this).field_R.a(-23996);
          if (tk.field_n != var8) {
            if (dj.field_c != var8) {
              if (ir.field_a != var8) {
                if (qm.field_G == var8) {
                  var12 = jn.field_b[1];
                  var12.d(var5 + -(var12.field_y >> -273556927), -(var12.field_t >> -1553433183) + var6, 256);
                  return;
                } else {
                  return;
                }
              } else {
                var13 = jn.field_b[2];
                var13.d(var5 - (var13.field_y >> 2139508065), var6 - (var13.field_t >> 1039685793), 256);
                return;
              }
            } else {
              var16 = jn.field_b[0];
              var9 = var16.field_x << 1860540833;
              var10 = var16.field_B << -574518751;
              if (cr.field_E != null) {
                if (var9 <= cr.field_E.field_y) {
                  if (cr.field_E.field_t >= var10) {
                    lq.a(cr.field_E, (byte) -94);
                    bi.c();
                    var16.a(112, 144, var16.field_x << -1221232988, var16.field_B << -575288796, -((lr) this).field_Q << 1570908298, 4096);
                    ln.d(-28558);
                    cr.field_E.d(var5 - var16.field_x, var6 + -var16.field_B, 256);
                    return;
                  } else {
                    cr.field_E = new er(var9, var10);
                    lq.a(cr.field_E, (byte) -94);
                    var16.a(112, 144, var16.field_x << -1221232988, var16.field_B << -575288796, -((lr) this).field_Q << 1570908298, 4096);
                    ln.d(-28558);
                    cr.field_E.d(var5 - var16.field_x, var6 + -var16.field_B, 256);
                    return;
                  }
                } else {
                  cr.field_E = new er(var9, var10);
                  lq.a(cr.field_E, (byte) -94);
                  var16.a(112, 144, var16.field_x << -1221232988, var16.field_B << -575288796, -((lr) this).field_Q << 1570908298, 4096);
                  ln.d(-28558);
                  cr.field_E.d(var5 - var16.field_x, var6 + -var16.field_B, 256);
                  return;
                }
              } else {
                cr.field_E = new er(var9, var10);
                lq.a(cr.field_E, (byte) -94);
                var16.a(112, 144, var16.field_x << -1221232988, var16.field_B << -575288796, -((lr) this).field_Q << 1570908298, 4096);
                ln.d(-28558);
                cr.field_E.d(var5 - var16.field_x, var6 + -var16.field_B, 256);
                return;
              }
            }
          } else {
            var15 = jn.field_b[0];
            var9 = var15.field_x << 1860540833;
            var10 = var15.field_B << -574518751;
            if (cr.field_E != null) {
              if (var9 <= cr.field_E.field_y) {
                if (cr.field_E.field_t >= var10) {
                  lq.a(cr.field_E, (byte) -94);
                  bi.c();
                  var15.a(112, 144, var15.field_x << -1221232988, var15.field_B << -575288796, -((lr) this).field_Q << 1570908298, 4096);
                  ln.d(-28558);
                  cr.field_E.d(var5 - var15.field_x, var6 + -var15.field_B, 256);
                  return;
                } else {
                  cr.field_E = new er(var9, var10);
                  lq.a(cr.field_E, (byte) -94);
                  var15.a(112, 144, var15.field_x << -1221232988, var15.field_B << -575288796, -((lr) this).field_Q << 1570908298, 4096);
                  ln.d(-28558);
                  cr.field_E.d(var5 - var15.field_x, var6 + -var15.field_B, 256);
                  return;
                }
              } else {
                cr.field_E = new er(var9, var10);
                lq.a(cr.field_E, (byte) -94);
                var15.a(112, 144, var15.field_x << -1221232988, var15.field_B << -575288796, -((lr) this).field_Q << 1570908298, 4096);
                ln.d(-28558);
                cr.field_E.d(var5 - var15.field_x, var6 + -var15.field_B, 256);
                return;
              }
            } else {
              cr.field_E = new er(var9, var10);
              lq.a(cr.field_E, (byte) -94);
              var15.a(112, 144, var15.field_x << -1221232988, var15.field_B << -575288796, -((lr) this).field_Q << 1570908298, 4096);
              ln.d(-28558);
              cr.field_E.d(var5 - var15.field_x, var6 + -var15.field_B, 256);
              return;
            }
          }
        }
    }

    final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (param0 == 0) {
          return "";
        } else {
          if (-2 == (param0 ^ -1)) {
            var10 = param2[param1];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4 = param1 + param0;
            var5 = 0;
            var6_int = param1;
            L0: while (true) {
              if (var4 <= var6_int) {
                var6 = new StringBuilder(var5);
                var7 = param1;
                if (param3 != 1039685793) {
                  L1: {
                    lr.a(-3, (String) null, 50L);
                    if (var4 <= var7) {
                      break L1;
                    } else {
                      L2: {
                        var11 = param2[var7];
                        var8 = var11;
                        if (var8 != null) {
                          StringBuilder discarded$4 = var6.append(var11);
                          break L2;
                        } else {
                          StringBuilder discarded$5 = var6.append("null");
                          var7++;
                          break L2;
                        }
                      }
                      var7++;
                      var7++;
                      break L1;
                    }
                  }
                  return var6.toString();
                } else {
                  L3: {
                    if (var4 <= var7) {
                      break L3;
                    } else {
                      L4: {
                        var12 = param2[var7];
                        var8 = var12;
                        if (var8 != null) {
                          StringBuilder discarded$6 = var6.append(var12);
                          break L4;
                        } else {
                          StringBuilder discarded$7 = var6.append("null");
                          var7++;
                          break L4;
                        }
                      }
                      var7++;
                      var7++;
                      break L3;
                    }
                  }
                  return var6.toString();
                }
              } else {
                var7_ref_CharSequence = param2[var6_int];
                if (var7_ref_CharSequence == null) {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                } else {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        L0: {
          var35 = Vertigo2.field_L ? 1 : 0;
          if (param4 != param1) {
            break L0;
          } else {
            if (param5 != param6) {
              break L0;
            } else {
              if (param0 != param9) {
                break L0;
              } else {
                if (param7 != param3) {
                  break L0;
                } else {
                  L1: {
                    eh.a(param7, param9, (byte) -4, param5, param8, param1);
                    if (param2 > 13) {
                      break L1;
                    } else {
                      field_O = null;
                      break L1;
                    }
                  }
                  return;
                }
              }
            }
          }
        }
        var10 = param1;
        var11 = param5;
        var12 = 3 * param1;
        var13 = 3 * param5;
        var14 = 3 * param4;
        var15 = param6 * 3;
        var16 = param0 * 3;
        var17 = 3 * param3;
        var18 = param9 - var16 - -var14 - param1;
        var19 = -param5 + (var15 + -var17 + param7);
        var20 = -var14 + (var16 - (var14 + -var12));
        var21 = var13 + -var15 + (var17 + -var15);
        var22 = -var12 + var14;
        var23 = -var13 + var15;
        var24 = 128;
        L2: while (true) {
          if (var24 > 4096) {
            if (param2 <= 13) {
              field_O = null;
              return;
            } else {
              return;
            }
          } else {
            var25 = var24 * var24 >> -671920692;
            var26 = var25 * var24 >> 1678141868;
            var27 = var18 * var26;
            var28 = var19 * var26;
            var29 = var20 * var25;
            var30 = var25 * var21;
            var31 = var24 * var22;
            var32 = var23 * var24;
            var33 = (var31 + var29 + var27 >> 1423347820) + param1;
            var34 = (var28 + (var30 - -var32) >> 1023763308) + param5;
            eh.a(var34, var33, (byte) -4, var11, param8, var10);
            var11 = var34;
            var10 = var33;
            // wide iinc 24 128
            continue L2;
          }
        }
    }

    final static int e(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!gf.a(false)) {
            L1: {
              ve.field_d.a((byte) -29, fk.b(gb.field_d, 1282642017, ed.field_n), fk.b(no.field_e, 1282642017, sd.field_N));
              if (ve.field_d.a(84)) {
                var1 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = 0;
            if (var1 != 0) {
              if (0 <= ve.field_d.field_c) {
                var3 = gi.field_n[ve.field_d.field_c];
                if (-3 == var3) {
                  hd.a((byte) 47);
                  if (param0 > -52) {
                    return 1;
                  } else {
                    L2: {
                      if (-1 != var3) {
                        break L2;
                      } else {
                        if (2 != da.field_j) {
                          break L2;
                        } else {
                          var4 = -qe.field_cb + gk.a(52);
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if ((var6 ^ -1) < -1) {
                            break L2;
                          } else {
                            var3 = 2;
                            bl.a(true, 5, -30962);
                            break L2;
                          }
                        }
                      }
                    }
                    return var3;
                  }
                } else {
                  if (-6 != var3) {
                    if (param0 <= -52) {
                      L3: {
                        if (-1 != var3) {
                          break L3;
                        } else {
                          if (2 != da.field_j) {
                            break L3;
                          } else {
                            var4 = -qe.field_cb + gk.a(52);
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if ((var6 ^ -1) < -1) {
                              break L3;
                            } else {
                              var3 = 2;
                              bl.a(true, 5, -30962);
                              break L3;
                            }
                          }
                        }
                      }
                      return var3;
                    } else {
                      return 1;
                    }
                  } else {
                    hd.a((byte) 47);
                    if (param0 > -52) {
                      return 1;
                    } else {
                      L4: {
                        if (-1 != var3) {
                          break L4;
                        } else {
                          if (2 != da.field_j) {
                            break L4;
                          } else {
                            var4 = -qe.field_cb + gk.a(52);
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (var6 < -1) {
                              break L4;
                            } else {
                              var3 = 2;
                              bl.a(true, 5, -30962);
                              break L4;
                            }
                          }
                        }
                      }
                      return var3;
                    }
                  }
                }
              } else {
                if (var2 != 0) {
                  if (da.field_j != -3) {
                    hd.a((byte) 47);
                    if (param0 > -52) {
                      return 1;
                    } else {
                      L5: {
                        if (-1 != var3) {
                          break L5;
                        } else {
                          if (2 != da.field_j) {
                            break L5;
                          } else {
                            var4 = -qe.field_cb + gk.a(52);
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (var6 < -1) {
                              break L5;
                            } else {
                              var3 = 2;
                              bl.a(true, 5, -30962);
                              break L5;
                            }
                          }
                        }
                      }
                      return var3;
                    }
                  } else {
                    if (param0 > -52) {
                      return 1;
                    } else {
                      L6: {
                        if (-1 != var3) {
                          break L6;
                        } else {
                          if (2 != da.field_j) {
                            break L6;
                          } else {
                            var4 = -qe.field_cb + gk.a(52);
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if ((var6 ^ -1) < -1) {
                              break L6;
                            } else {
                              var3 = 2;
                              bl.a(true, 5, -30962);
                              break L6;
                            }
                          }
                        }
                      }
                      return var3;
                    }
                  }
                } else {
                  if (param0 > -52) {
                    return 1;
                  } else {
                    L7: {
                      if (-1 != (var3 ^ -1)) {
                        break L7;
                      } else {
                        if (2 != da.field_j) {
                          break L7;
                        } else {
                          var4 = -qe.field_cb + gk.a(52);
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (var6 < -1) {
                            break L7;
                          } else {
                            var3 = 2;
                            bl.a(true, 5, -30962);
                            break L7;
                          }
                        }
                      }
                    }
                    return var3;
                  }
                }
              }
            } else {
              if (var2 != 0) {
                if (da.field_j != -3) {
                  hd.a((byte) 47);
                  if (param0 > -52) {
                    return 1;
                  } else {
                    L8: {
                      if (-1 != var3) {
                        break L8;
                      } else {
                        if (2 != da.field_j) {
                          break L8;
                        } else {
                          var4 = -qe.field_cb + gk.a(52);
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (var6 < -1) {
                            break L8;
                          } else {
                            var3 = 2;
                            bl.a(true, 5, -30962);
                            break L8;
                          }
                        }
                      }
                    }
                    return var3;
                  }
                } else {
                  if (param0 > -52) {
                    return 1;
                  } else {
                    L9: {
                      if (-1 != var3) {
                        break L9;
                      } else {
                        if (2 != da.field_j) {
                          break L9;
                        } else {
                          var4 = -qe.field_cb + gk.a(52);
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if ((var6 ^ -1) < -1) {
                            break L9;
                          } else {
                            var3 = 2;
                            bl.a(true, 5, -30962);
                            break L9;
                          }
                        }
                      }
                    }
                    return var3;
                  }
                }
              } else {
                if (param0 > -52) {
                  return 1;
                } else {
                  L10: {
                    if (-1 != (var3 ^ -1)) {
                      break L10;
                    } else {
                      if (2 != da.field_j) {
                        break L10;
                      } else {
                        var4 = -qe.field_cb + gk.a(52);
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (var6 < -1) {
                          break L10;
                        } else {
                          var3 = 2;
                          bl.a(true, 5, -30962);
                          break L10;
                        }
                      }
                    }
                  }
                  return var3;
                }
              }
            }
          } else {
            L11: {
              ve.field_d.d((byte) 81);
              if (!ve.field_d.a(84)) {
                break L11;
              } else {
                var1 = 1;
                break L11;
              }
            }
            if ((de.field_f ^ -1) == -14) {
              var2 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    lr(of param0) {
        ((lr) this).field_R = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Searching for an opponent";
        field_K = "+<%0>";
        field_L = "Checking";
        field_I = "game complete";
        field_S = null;
        field_M = "Invalid password.";
        field_T = "NEXT LEVEL IN: <%0>";
        field_N = "Close";
    }
}
