/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq extends oj {
    int field_J;
    private boolean field_C;
    private int field_F;
    int field_I;
    static String field_D;
    static String field_z;
    static String field_y;
    static String field_A;
    static String field_H;
    int field_G;

    final static void e(byte param0) {
        if (param0 >= -73) {
            field_y = null;
        }
        if (ib.field_j != -fw.field_C + 0) {
            if (250 - fw.field_C == ib.field_j) {
            }
        }
        ib.field_j = ib.field_j + 1;
    }

    final boolean a(at param0, byte param1, ic param2) {
        int var4 = 0;
        int var6 = 0;
        int var8 = 0;
        jd var9 = null;
        jd var10 = null;
        jd var11 = null;
        jd var12 = null;
        jd var13 = null;
        jd var14 = null;
        jd var15 = null;
        jd var16 = null;
        L0: {
          L1: {
            var8 = ArmiesOfGielinor.field_M ? 1 : 0;
            var4 = 0;
            var6 = ((qq) this).field_F;
            if (2 != var6) {
              if ((var6 ^ -1) != -4) {
                if (var6 != -2) {
                  if (-5 != var6) {
                    if (var6 == 0) {
                      if (((qq) this).a((byte) -39, param2, param0, true)) {
                        var4 = 1;
                        break L0;
                      } else {
                        break L0;
                      }
                    } else {
                      ((qq) this).c((byte) -95);
                      break L0;
                    }
                  } else {
                    if (param2.field_xb.field_Eb[param2.field_xb.field_v * ((qq) this).field_J + ((qq) this).field_I].c(111)) {
                      if (((qq) this).a((byte) -39, param2, param0, true)) {
                        var4 = 1;
                        break L0;
                      } else {
                        break L0;
                      }
                    } else {
                      ((qq) this).c((byte) -74);
                      break L0;
                    }
                  }
                } else {
                  L2: {
                    if (-1 > (((qq) this).field_I ^ -1)) {
                      L3: {
                        L4: {
                          var13 = param2.field_xb.c(((qq) this).field_J, true, ((qq) this).field_I - 1);
                          if (!param2.field_xb.field_Eb[((qq) this).field_I - (1 - param2.field_xb.field_v * ((qq) this).field_J)].c(-65)) {
                            break L4;
                          } else {
                            if (null == ((qq) this).field_w) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (var13 == null) {
                          break L2;
                        } else {
                          if (!param2.field_xb.c(var13.field_O, -16985, ((qq) this).field_G)) {
                            break L2;
                          } else {
                            if (!var13.a(23072)) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((qq) this).field_s = ((qq) this).field_s + 1;
                      if (((qq) this).a(((qq) this).field_J, 15, param2, param0, ((qq) this).field_I + -1)) {
                        var4 = 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    if (((qq) this).field_I < param2.field_xb.field_v + -1) {
                      L6: {
                        L7: {
                          var14 = param2.field_xb.c(((qq) this).field_J, true, ((qq) this).field_I - -1);
                          if (!param2.field_xb.field_Eb[((qq) this).field_I - -1 + param2.field_xb.field_v * ((qq) this).field_J].c(-26)) {
                            break L7;
                          } else {
                            if (((qq) this).field_w == null) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (var14 == null) {
                          break L5;
                        } else {
                          if (!param2.field_xb.c(var14.field_O, -16985, ((qq) this).field_G)) {
                            break L5;
                          } else {
                            if (!var14.a(23072)) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      ((qq) this).field_s = ((qq) this).field_s + 1;
                      if (!((qq) this).a(((qq) this).field_J, 15, param2, param0, 1 + ((qq) this).field_I)) {
                        break L5;
                      } else {
                        var4 = 1;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L8: {
                    if (0 < ((qq) this).field_J) {
                      L9: {
                        L10: {
                          var15 = param2.field_xb.c(-1 + ((qq) this).field_J, true, ((qq) this).field_I);
                          if (!param2.field_xb.field_Eb[(((qq) this).field_J - 1) * param2.field_xb.field_v + ((qq) this).field_I].c(-45)) {
                            break L10;
                          } else {
                            if (((qq) this).field_w == null) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (var15 == null) {
                          break L8;
                        } else {
                          if (!param2.field_xb.c(var15.field_O, -16985, ((qq) this).field_G)) {
                            break L8;
                          } else {
                            if (!var15.a(23072)) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      ((qq) this).field_s = ((qq) this).field_s + 1;
                      if (!((qq) this).a(-1 + ((qq) this).field_J, 15, param2, param0, ((qq) this).field_I)) {
                        break L8;
                      } else {
                        var4 = 1;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L11: {
                    if (-1 + param2.field_xb.field_db <= ((qq) this).field_J) {
                      break L11;
                    } else {
                      L12: {
                        L13: {
                          var16 = param2.field_xb.c(((qq) this).field_J + 1, true, ((qq) this).field_I);
                          if (!param2.field_xb.field_Eb[((qq) this).field_I + (1 + ((qq) this).field_J) * param2.field_xb.field_v].c(-44)) {
                            break L13;
                          } else {
                            if (null == ((qq) this).field_w) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (var16 == null) {
                          break L11;
                        } else {
                          if (!param2.field_xb.c(var16.field_O, -16985, ((qq) this).field_G)) {
                            break L11;
                          } else {
                            if (!var16.a(23072)) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      ((qq) this).field_s = ((qq) this).field_s + 1;
                      if (!((qq) this).a(((qq) this).field_J + 1, 15, param2, param0, ((qq) this).field_I)) {
                        break L11;
                      } else {
                        var4 = 1;
                        break L11;
                      }
                    }
                  }
                  if (((qq) this).field_s <= 1) {
                    ((qq) this).c((byte) -127);
                    break L0;
                  } else {
                    if (((qq) this).a((byte) -39, param2, param0, true)) {
                      var4 = 1;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
          L14: {
            if (((qq) this).field_I > 0) {
              var9 = param2.field_xb.c(((qq) this).field_J, true, ((qq) this).field_I - 1);
              if (var9 == null) {
                break L14;
              } else {
                if (param2.field_xb.c(var9.field_O, -16985, ((qq) this).field_G)) {
                  ((qq) this).field_s = ((qq) this).field_s + 1;
                  if (((qq) this).a(((qq) this).field_J, 15, param2, param0, ((qq) this).field_I + -1)) {
                    var4 = 1;
                    break L14;
                  } else {
                    break L14;
                  }
                } else {
                  break L14;
                }
              }
            } else {
              break L14;
            }
          }
          L15: {
            if (param2.field_xb.field_v + -1 <= ((qq) this).field_I) {
              break L15;
            } else {
              var10 = param2.field_xb.c(((qq) this).field_J, true, ((qq) this).field_I - -1);
              if (var10 == null) {
                break L15;
              } else {
                if (!param2.field_xb.c(var10.field_O, -16985, ((qq) this).field_G)) {
                  break L15;
                } else {
                  ((qq) this).field_s = ((qq) this).field_s + 1;
                  if (((qq) this).a(((qq) this).field_J, 15, param2, param0, ((qq) this).field_I - -1)) {
                    var4 = 1;
                    break L15;
                  } else {
                    break L15;
                  }
                }
              }
            }
          }
          L16: {
            if (((qq) this).field_J > 0) {
              var11 = param2.field_xb.c(((qq) this).field_J + -1, true, ((qq) this).field_I);
              if (var11 == null) {
                break L16;
              } else {
                if (param2.field_xb.c(var11.field_O, -16985, ((qq) this).field_G)) {
                  ((qq) this).field_s = ((qq) this).field_s + 1;
                  if (!((qq) this).a(-1 + ((qq) this).field_J, 15, param2, param0, ((qq) this).field_I)) {
                    break L16;
                  } else {
                    var4 = 1;
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
            } else {
              break L16;
            }
          }
          L17: {
            if (((qq) this).field_J >= param2.field_xb.field_db - 1) {
              break L17;
            } else {
              var12 = param2.field_xb.c(1 + ((qq) this).field_J, true, ((qq) this).field_I);
              if (var12 == null) {
                break L17;
              } else {
                if (!param2.field_xb.c(var12.field_O, -16985, ((qq) this).field_G)) {
                  break L17;
                } else {
                  ((qq) this).field_s = ((qq) this).field_s + 1;
                  if (((qq) this).a(1 + ((qq) this).field_J, 15, param2, param0, ((qq) this).field_I)) {
                    var4 = 1;
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
            }
          }
          if (1 < ((qq) this).field_s) {
            if (((qq) this).a((byte) -39, param2, param0, true)) {
              var4 = 1;
              break L0;
            } else {
              break L0;
            }
          } else {
            ((qq) this).c((byte) -114);
            break L0;
          }
        }
        L18: {
          if (param1 < -84) {
            break L18;
          } else {
            qq.a((byte) -37, 26, -64, -50);
            break L18;
          }
        }
        ((qq) this).a(param2.field_xb, -26661);
        return var4 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        param0 = param0 << -492462104 | param0;
        int var4 = param0 ^ param0 >> 354722433;
        if (param1 != -12933) {
            return;
        }
        for (var7 = 0; 4 > var7; var7++) {
            var5 = -54 + (bm.field_y[var7][0] + param3) + (var4 & 15);
            var6 = param2 + (bm.field_y[var7][1] - -(param0 & 7) + -64);
            fe.a(jq.field_G[3], 60 + var5, var6 - -50, jq.field_G[3].field_A >> -580081759, jq.field_G[3].field_x >> -1346806815);
            var4 = var4 >> 1;
            param0 = param0 >> 1;
        }
    }

    final static void g(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        wd.field_b = rs.field_n.a(il.field_t[17]) - -20;
        int var1 = rs.field_n.a(il.field_t[18]);
        if (wd.field_b < var1) {
            wd.field_b = var1;
        }
        if (!(kr.field_G != null)) {
            kr.field_G = new rk();
        }
        kr.field_G.f((byte) 79);
        if (!(kr.field_E != null)) {
            kr.field_E = new dm();
        }
        kr.field_E.i(param0 + 0);
        kr.field_E.e((byte) 97);
        ts.field_j = bm.field_D;
        if (param0 != 1) {
            field_A = null;
        }
        for (var2 = 0; var2 < oh.field_G.length; var2++) {
            oh.field_G[var2] = true;
        }
        oh.field_G[37] = false;
        oh.field_G[32] = re.a(0, (byte) -98);
    }

    public static void d(byte param0) {
        if (param0 != 35) {
            return;
        }
        field_A = null;
        field_y = null;
        field_D = null;
        field_H = null;
        field_z = null;
    }

    final void a(ha param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((qq) this).field_C) {
          return;
        } else {
          L0: {
            ((qq) this).field_C = true;
            var3 = ((qq) this).field_F;
            if (var3 != 0) {
              if (var3 == 1) {
                param0.a((byte) 34, ((qq) this).field_G, ((qq) this).field_J, ((qq) this).field_I - -1);
                param0.a((byte) 30, ((qq) this).field_G, ((qq) this).field_J, -1 + ((qq) this).field_I);
                param0.a((byte) 61, ((qq) this).field_G, ((qq) this).field_J + 1, ((qq) this).field_I);
                param0.a((byte) 35, ((qq) this).field_G, ((qq) this).field_J - 1, ((qq) this).field_I);
                break L0;
              } else {
                if (var3 != 2) {
                  if (3 == var3) {
                    param0.f(((qq) this).field_I - -1, ((qq) this).field_G, 126, ((qq) this).field_J);
                    param0.f(-1 + ((qq) this).field_I, ((qq) this).field_G, param1 + 26785, ((qq) this).field_J);
                    param0.f(((qq) this).field_I, ((qq) this).field_G, 121, ((qq) this).field_J - -1);
                    param0.f(((qq) this).field_I, ((qq) this).field_G, 119, -1 + ((qq) this).field_J);
                    break L0;
                  } else {
                    if (4 == var3) {
                      param0.a(-100, param0.field_Eb[param0.field_v * ((qq) this).field_J + ((qq) this).field_I]);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                } else {
                  param0.a(-122, false, ((qq) this).field_I - -1, ((qq) this).field_J, ((qq) this).field_G, 3);
                  param0.a(-125, false, -1 + ((qq) this).field_I, ((qq) this).field_J, ((qq) this).field_G, 3);
                  param0.a(-119, false, ((qq) this).field_I, 1 + ((qq) this).field_J, ((qq) this).field_G, 3);
                  param0.a(-128, false, ((qq) this).field_I, -1 + ((qq) this).field_J, ((qq) this).field_G, 3);
                  break L0;
                }
              }
            } else {
              param0.c(((qq) this).field_J, ((qq) this).field_I, ((qq) this).field_G, (byte) -115);
              break L0;
            }
          }
          L1: {
            if (param1 == -26661) {
              break L1;
            } else {
              var5 = null;
              boolean discarded$1 = ((qq) this).a((at) null, (byte) -124, (ic) null);
              break L1;
            }
          }
          L2: {
            L3: {
              if (2 == ((qq) this).field_F) {
                break L3;
              } else {
                if (3 == ((qq) this).field_F) {
                  break L3;
                } else {
                  break L2;
                }
              }
            }
            param0.e(14, ((qq) this).field_I - -1, ((qq) this).field_G, ((qq) this).field_J);
            param0.e(14, -1 + ((qq) this).field_I, ((qq) this).field_G, ((qq) this).field_J);
            param0.e(14, ((qq) this).field_I, ((qq) this).field_G, 1 + ((qq) this).field_J);
            param0.e(param1 + 26675, ((qq) this).field_I, ((qq) this).field_G, -1 + ((qq) this).field_J);
            break L2;
          }
          fl.a(param0, -111);
          return;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        if (nw.g(98)) {
            return;
        }
        bv var4 = vl.field_n;
        var4.h(32161, 16);
        var4.field_q = var4.field_q + 1;
        int var5 = var4.field_q;
        var4.b(param0 ^ 7, 0);
        var4.b(true, param1);
        var4.b(1, param2);
        var4.b(true, param3);
        if (param0 != 6) {
            qq.a(-60, -103, 22, 28, -21);
        }
        var4.e(-var5 + var4.field_q, 5930);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var9 = 0;
        int var10 = 0;
        int var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        qn.e(param1, param4, 1 + param0, 10000536);
        qn.e(param1, param4 - -param2, param0 - -1, 12105912);
        int var5 = 1;
        if (!(qn.field_a <= var5 + param4)) {
            var5 = -param4 + qn.field_a;
        }
        int var6 = param2;
        if (!(qn.field_f >= var6 + param4)) {
            var6 = qn.field_f - param4;
        }
        int var7 = var5;
        int var8 = 125 / ((param3 - 27) / 51);
        while (var7 < var6) {
            var9 = 152 - -(var7 * 48 / param2);
            var10 = var9 << -847424080 | var9 << -110659992 | var9;
            qn.field_d[(var7 + param4) * qn.field_l + param1] = var10;
            qn.field_d[qn.field_l * (param4 - -var7) + (param1 - -param0)] = var10;
            var7++;
        }
    }

    final String a(byte param0, boolean param1) {
        int var3 = 0;
        String var4 = null;
        int var4_int = 0;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = -2 / ((53 - param0) / 51);
          if (!param1) {
            break L0;
          } else {
            System.out.println("State change event debug");
            System.out.println("At " + ((qq) this).field_I + "," + ((qq) this).field_J);
            System.out.println("Player" + ((qq) this).field_G);
            var4_int = ((qq) this).field_F;
            if (var4_int != 0) {
              if (var4_int == 1) {
                System.out.println("Raise");
                break L0;
              } else {
                if (var4_int == 2) {
                  System.out.println("Heal");
                  break L0;
                } else {
                  if (var4_int != 3) {
                    if (-5 == (var4_int ^ -1)) {
                      System.out.println("Bury");
                      break L0;
                    } else {
                      var4 = "EventStateChange: pos: (" + ((qq) this).field_I + "," + ((qq) this).field_J + "), type: " + ((qq) this).field_F + ", player: " + ((qq) this).field_G;
                      return var4;
                    }
                  } else {
                    System.out.println("Pump");
                    break L0;
                  }
                }
              }
            } else {
              System.out.println("Capture");
              break L0;
            }
          }
        }
        var4 = "EventStateChange: pos: (" + ((qq) this).field_I + "," + ((qq) this).field_J + "), type: " + ((qq) this).field_F + ", player: " + ((qq) this).field_G;
        return var4;
    }

    qq(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        L0: {
          ((qq) this).field_G = param3;
          ((qq) this).field_F = param0;
          ((qq) this).field_I = param1;
          ((qq) this).field_J = param2;
          ((qq) this).field_m = -1;
          var5 = ((qq) this).field_F;
          if (-1 == (var5 ^ -1)) {
            ((qq) this).field_m = 3;
            break L0;
          } else {
            if (1 == var5) {
              ((qq) this).field_m = 16;
              break L0;
            } else {
              if (var5 == -3) {
                ((qq) this).field_m = 12;
                break L0;
              } else {
                if (var5 == 3) {
                  ((qq) this).field_m = 14;
                  break L0;
                } else {
                  if (-5 != var5) {
                    break L0;
                  } else {
                    ((qq) this).field_m = 17;
                    break L0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(kl param0, kl param1, kl param2, int param3, boolean param4) {
        se.field_g = cr.a("", 4210752);
        se.field_g.a(false, true);
        if (param3 != 0) {
            return;
        }
        kr.a(param2, false, param1, param0);
        da.b(-2);
        oh.field_L = nb.field_i;
        mh.field_b = nb.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Invalid date";
        field_y = "Skip";
        field_A = "Empty";
        field_H = "Most honourable";
        field_D = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
