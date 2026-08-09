/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends rqa {
    static int field_p;
    static phb field_o;

    public static void e(int param0) {
        field_o = null;
        if (param0 != 3575) {
            ie.a(-8);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = (phb) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(4, 94));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ie.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    ie(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        int stackIn_12_0 = 0;
        jk stackIn_18_0 = null;
        jk stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        jk stackIn_81_0 = null;
        jk stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        faa var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        jk var3_ref_jk = null;
        int var4 = 0;
        mm var4_ref_mm = null;
        int var5 = 0;
        mm var6 = null;
        jk var7 = null;
        int var8 = 0;
        jk var8_ref_jk = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jk var12 = null;
        mm var13 = null;
        mm var14 = null;
        mm var15 = null;
        Object var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        jk var20 = null;
        Object var21 = null;
        jk var22 = null;
        jk var23 = null;
        jk var24 = null;
        String var25 = null;
        String var26 = null;
        Object var27 = null;
        mm var27_ref = null;
        mm var28 = null;
        jk var29 = null;
        mm var30 = null;
        jk var31 = null;
        var21 = null;
        var27 = null;
        var16 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            var1 = qga.field_b;
            if (param0 == 13) {
              L1: {
                L2: {
                  var2 = ((ds) ((Object) var1)).e((byte) -114);
                  if (var2 == 0) {
                    break L2;
                  } else {
                    if (-2 == (var2 ^ -1)) {
                      break L2;
                    } else {
                      if (-3 == (var2 ^ -1)) {
                        break L2;
                      } else {
                        if ((var2 ^ -1) == -4) {
                          break L2;
                        } else {
                          if (4 == var2) {
                            break L2;
                          } else {
                            if (-6 != (var2 ^ -1)) {
                              if ((var2 ^ -1) == -7) {
                                var3_long = ((ds) ((Object) var1)).k(255);
                                var5 = ((ds) ((Object) var1)).e((byte) -120);
                                var29 = pdb.a((byte) 80, var3_long);
                                if (var29 != null) {
                                  L3: {
                                    if (var29.field_Fb) {
                                      qea.field_p = qea.field_p - 1;
                                      var29.field_Fb = false;
                                      break L3;
                                    } else {
                                      break L3;
                                    }
                                  }
                                  L4: {
                                    if (-1 == (var5 ^ -1)) {
                                      var29.b(param0 + -3859);
                                      break L4;
                                    } else {
                                      var29.field_Db = var5;
                                      var29.field_yb = ktb.field_p;
                                      break L4;
                                    }
                                  }
                                  var29.d((byte) -35);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              } else {
                                if ((var2 ^ -1) == -8) {
                                  var31 = (jk) ((Object) cta.field_q.d(param0 ^ 13));
                                  L5: while (true) {
                                    if (var31 == null) {
                                      qea.field_p = 0;
                                      break L1;
                                    } else {
                                      var31.b(param0 + -3859);
                                      var31.d((byte) -35);
                                      var31 = (jk) ((Object) cta.field_q.a((byte) 11));
                                      continue L5;
                                    }
                                  }
                                } else {
                                  if (-9 != (var2 ^ -1)) {
                                    if (var2 != 9) {
                                      if ((var2 ^ -1) == -11) {
                                        var15 = (mm) ((Object) kja.field_E.d(0));
                                        L6: while (true) {
                                          if (var15 == null) {
                                            break L1;
                                          } else {
                                            var15.b(-3846);
                                            var15.d((byte) -35);
                                            var15 = (mm) ((Object) kja.field_E.a((byte) 106));
                                            continue L6;
                                          }
                                        }
                                      } else {
                                        L7: {
                                          if (var2 == 11) {
                                            break L7;
                                          } else {
                                            if (-13 == (var2 ^ -1)) {
                                              break L7;
                                            } else {
                                              if (13 == var2) {
                                                var3 = ((ds) ((Object) var1)).e(1869);
                                                var4 = ((ds) ((Object) var1)).e((byte) -97);
                                                var27_ref = (mm) ((Object) ks.field_r.a(-1, (long)var3));
                                                if (var27_ref == null) {
                                                  break L1;
                                                } else {
                                                  L8: {
                                                    var13 = var27_ref;
                                                    var6 = var13;
                                                    var27_ref.field_Qb = false;
                                                    if (var4 != 0) {
                                                      var27_ref.field_ec = var4;
                                                      var27_ref.field_Db = ktb.field_p;
                                                      break L8;
                                                    } else {
                                                      break L8;
                                                    }
                                                  }
                                                  var13.field_ac = false;
                                                  eta.a((byte) 109, var27_ref);
                                                  break L1;
                                                }
                                              } else {
                                                L9: {
                                                  if (14 == var2) {
                                                    break L9;
                                                  } else {
                                                    if (var2 != 16) {
                                                      L10: {
                                                        if (-16 == (var2 ^ -1)) {
                                                          break L10;
                                                        } else {
                                                          if (-18 != (var2 ^ -1)) {
                                                            if (-19 == (var2 ^ -1)) {
                                                              L11: {
                                                                var3_long = ((ds) ((Object) var1)).k(255);
                                                                var25 = ((ds) ((Object) var1)).a(-1);
                                                                var26 = ((ds) ((Object) var1)).a(param0 ^ -14);
                                                                var7 = pjb.a(var3_long, true);
                                                                if (var7 != null) {
                                                                  break L11;
                                                                } else {
                                                                  var7 = new jk(var25, var26, var3_long);
                                                                  icb.field_p.a(var7, (byte) -76, var3_long);
                                                                  lqa.field_o.field_zb = lqa.field_o.field_zb + 1;
                                                                  break L11;
                                                                }
                                                              }
                                                              L12: {
                                                                var7.field_Gb = ((ds) ((Object) var1)).e(1869);
                                                                var8 = ((ds) ((Object) var1)).l(11436);
                                                                stackIn_81_0 = (jk) (var7);

                                                                if (-1 == (1 & var8 ^ -1)) {
                                                                  stackIn_82_0 = (jk) ((Object) stackIn_81_0);
                                                                  stackIn_82_1 = 0;
                                                                  break L12;
                                                                } else {
                                                                  stackIn_82_0 = (jk) ((Object) stackIn_81_0);
                                                                  stackIn_82_1 = 1;
                                                                  break L12;
                                                                }
                                                              }
                                                              stackIn_82_0.field_Lb = stackIn_82_1 != 0;
                                                              var7.field_Bb = var8 >> 1188782945;
                                                              var7.field_vb = ((ds) ((Object) var1)).e((byte) -103);
                                                              var7.field_Ab = ((ds) ((Object) var1)).e((byte) -111);
                                                              mea.field_e.b(-10258, var7);
                                                              break L1;
                                                            } else {
                                                              if (var2 == 19) {
                                                                var3_long = ((ds) ((Object) var1)).k(255);
                                                                var5 = ((ds) ((Object) var1)).e((byte) -120);
                                                                var24 = pjb.a(var3_long, true);
                                                                if (var24 == null) {
                                                                  break L1;
                                                                } else {
                                                                  L13: {
                                                                    if (-1 != (var5 ^ -1)) {
                                                                      var24.field_yb = ktb.field_p;
                                                                      var24.field_Db = var5;
                                                                      break L13;
                                                                    } else {
                                                                      var24.b(-3846);
                                                                      break L13;
                                                                    }
                                                                  }
                                                                  var24.d((byte) -35);
                                                                  lqa.field_o.field_zb = lqa.field_o.field_zb - 1;
                                                                  break L1;
                                                                }
                                                              } else {
                                                                if (-21 == (var2 ^ -1)) {
                                                                  awa.a(-41, lqa.field_o, false, var1);
                                                                  break L1;
                                                                } else {
                                                                  if (21 != var2) {
                                                                    if (-23 != (var2 ^ -1)) {
                                                                      if (var2 == 23) {
                                                                        wqa.field_a = ((ds) ((Object) var1)).k(param0 ^ 242);
                                                                        break L1;
                                                                      } else {
                                                                        gna.a((Throwable) null, "L1: " + hm.e(-13514), 0);
                                                                        ifb.l(-123);
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      tg.field_q = ((ds) ((Object) var1)).e(param0 + 1856);
                                                                      cla.field_b = ((ds) ((Object) var1)).l(11436);
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    var3 = ((ds) ((Object) var1)).e(param0 ^ 1856);
                                                                    if (-1 == (var3 ^ -1)) {
                                                                      qga.field_a = 0L;
                                                                      break L1;
                                                                    } else {
                                                                      qga.field_a = wt.a(false) - -(long)var3;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            break L10;
                                                          }
                                                        }
                                                      }
                                                      var3_long = ((ds) ((Object) var1)).k(255);
                                                      var5 = ((ds) ((Object) var1)).e((byte) -89);
                                                      var12 = pdb.a((byte) 80, var3_long);
                                                      var23 = var12;
                                                      if (var12 != null) {
                                                        L14: {
                                                          if (15 != var2) {
                                                            if (!var23.field_Fb) {
                                                              break L14;
                                                            } else {
                                                              qea.field_p = qea.field_p - 1;
                                                              var23.field_Fb = false;
                                                              break L14;
                                                            }
                                                          } else {
                                                            var12.field_Eb = false;
                                                            break L14;
                                                          }
                                                        }
                                                        L15: {
                                                          if (-1 != (var5 ^ -1)) {
                                                            var23.field_yb = ktb.field_p;
                                                            var23.field_Db = var5;
                                                            break L15;
                                                          } else {
                                                            break L15;
                                                          }
                                                        }
                                                        mnb.a(var23, true);
                                                        break L1;
                                                      } else {
                                                        break L1;
                                                      }
                                                    } else {
                                                      break L9;
                                                    }
                                                  }
                                                }
                                                var3_long = ((ds) ((Object) var1)).k(255);
                                                var22 = pdb.a((byte) 80, var3_long);
                                                if (var22 == null) {
                                                  break L1;
                                                } else {
                                                  L16: {
                                                    if (var2 != 14) {
                                                      if (!var22.field_Fb) {
                                                        var22.field_Fb = true;
                                                        qea.field_p = qea.field_p + 1;
                                                        break L16;
                                                      } else {
                                                        break L16;
                                                      }
                                                    } else {
                                                      var22.field_Eb = true;
                                                      break L16;
                                                    }
                                                  }
                                                  mnb.a(var22, true);
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var3 = ((ds) ((Object) var1)).e(1869);
                                        var14 = (mm) ((Object) ks.field_r.a(-1, (long)var3));
                                        var28 = var14;
                                        if (var14 == null) {
                                          break L1;
                                        } else {
                                          L17: {
                                            if ((var2 ^ -1) != -12) {
                                              var28.field_Qb = true;
                                              break L17;
                                            } else {
                                              var14.field_ac = true;
                                              break L17;
                                            }
                                          }
                                          eta.a((byte) 102, var28);
                                          break L1;
                                        }
                                      }
                                    } else {
                                      var3 = ((ds) ((Object) var1)).e(1869);
                                      var4 = ((ds) ((Object) var1)).e((byte) -127);
                                      var30 = (mm) ((Object) ks.field_r.a(-1, (long)var3));
                                      if (var30 == null) {
                                        break L1;
                                      } else {
                                        L18: {
                                          if (-1 != (var4 ^ -1)) {
                                            var30.field_Db = ktb.field_p;
                                            var30.field_ec = var4;
                                            break L18;
                                          } else {
                                            var30.b(param0 + -3859);
                                            break L18;
                                          }
                                        }
                                        var30.d((byte) -35);
                                        break L1;
                                      }
                                    }
                                  } else {
                                    L19: {
                                      var3 = ((ds) ((Object) var1)).e(1869);
                                      var4_ref_mm = (mm) ((Object) ks.field_r.a(-1, (long)var3));
                                      if (var4_ref_mm != null) {
                                        break L19;
                                      } else {
                                        var4_ref_mm = new mm(ocb.field_l);
                                        ks.field_r.a(var4_ref_mm, (byte) -115, (long)var3);
                                        break L19;
                                      }
                                    }
                                    awa.a(118, var4_ref_mm, true, var1);
                                    eta.a((byte) 109, var4_ref_mm);
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              L20: {
                                var3_long = ((ds) ((Object) var1)).k(param0 + 242);
                                var18 = ((ds) ((Object) var1)).a(-1);
                                var17 = ((ds) ((Object) var1)).a(-1);
                                var19 = ((ds) ((Object) var1)).a(-1);
                                var20 = pdb.a((byte) 80, var3_long);
                                var8_ref_jk = var20;
                                if (var17.equals("")) {
                                  stackIn_12_0 = 0;
                                  break L20;
                                } else {
                                  stackIn_12_0 = 1;
                                  break L20;
                                }
                              }
                              L21: {
                                var9 = stackIn_12_0;
                                if (var20 != null) {
                                  if (var9 == 0) {
                                    break L21;
                                  } else {
                                    var20.a(var19, var18, -424);
                                    break L21;
                                  }
                                } else {
                                  var8_ref_jk = new jk(var18, var19, var3_long);
                                  oha.field_o.a(var8_ref_jk, (byte) -86, var3_long);
                                  break L21;
                                }
                              }
                              L22: {
                                var8_ref_jk.field_Kb = wt.a(false) - (long)((ds) ((Object) var1)).h(77);
                                var8_ref_jk.field_Gb = ((ds) ((Object) var1)).e(1869);
                                var10 = ((ds) ((Object) var1)).l(param0 ^ 11425);
                                stackIn_18_0 = (jk) (var8_ref_jk);

                                if (0 == (var10 & 1)) {
                                  stackIn_19_0 = (jk) ((Object) stackIn_18_0);
                                  stackIn_19_1 = 0;
                                  break L22;
                                } else {
                                  stackIn_19_0 = (jk) ((Object) stackIn_18_0);
                                  stackIn_19_1 = 1;
                                  break L22;
                                }
                              }
                              stackIn_19_0.field_Lb = stackIn_19_1 != 0;
                              var8_ref_jk.field_Bb = var10 >> 1992888513;
                              var8_ref_jk.field_vb = ((ds) ((Object) var1)).e((byte) -120);
                              var8_ref_jk.field_Ab = ((ds) ((Object) var1)).e((byte) -113);
                              mnb.a(var8_ref_jk, true);
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_jk = (jk) ((Object) mea.field_e.d(0));
                L23: while (true) {
                  if (var3_ref_jk == null) {
                    var3_ref_jk = (jk) ((Object) oha.field_o.c(-31));
                    L24: while (true) {
                      if (var3_ref_jk == null) {
                        L25: {
                          if (-2 != (var2 ^ -1)) {
                            break L25;
                          } else {
                            if (null == lqa.field_o) {
                              break L25;
                            } else {
                              dsa.field_p = lqa.field_o.field_Vb;
                              break L25;
                            }
                          }
                        }
                        L26: {
                          if ((var2 ^ -1) != -5) {
                            lqa.field_o = null;
                            break L26;
                          } else {
                            var3 = ((ds) ((Object) var1)).e(1869);
                            lqa.field_o = new mm(ocb.field_l);
                            lqa.field_o.a((long)var3, (byte) 83);
                            awa.a(-123, lqa.field_o, false, var1);
                            qga.field_a = 0L;
                            break L26;
                          }
                        }
                        L27: {
                          L28: {
                            if (var2 == 2) {
                              break L28;
                            } else {
                              if (3 != var2) {
                                ohb.field_o = null;
                                break L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                          if (ohb.field_o == null) {
                            ohb.field_o = new mm(ocb.field_l);
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        if (3 == var2) {
                          ii.field_h = true;
                          var3 = 0;
                          L29: while (true) {
                            if (ce.field_o.length <= var3) {
                              imb.field_a = ((ds) ((Object) var1)).e((byte) -113);
                              qd.field_d = ((ds) ((Object) var1)).e((byte) -95);
                              var3 = 0;
                              L30: while (true) {
                                if (var3 >= nkb.field_p.length) {
                                  break L1;
                                } else {
                                  nkb.field_p[var3] = ((ds) ((Object) var1)).d((byte) -114);
                                  var3++;
                                  continue L30;
                                }
                              }
                            } else {
                              ce.field_o[var3] = ((ds) ((Object) var1)).d((byte) -114);
                              var3++;
                              continue L29;
                            }
                          }
                        } else {
                          ii.field_h = false;
                          break L1;
                        }
                      } else {
                        L31: {
                          L32: {
                            if (var3_ref_jk.field_Eb) {
                              break L32;
                            } else {
                              if (!var3_ref_jk.field_Fb) {
                                break L31;
                              } else {
                                break L32;
                              }
                            }
                          }
                          L33: {
                            if (var3_ref_jk.field_Fb) {
                              qea.field_p = qea.field_p - 1;
                              var3_ref_jk.field_Fb = false;
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                          var3_ref_jk.field_Eb = false;
                          mnb.a(var3_ref_jk, true);
                          break L31;
                        }
                        var3_ref_jk = (jk) ((Object) oha.field_o.d(-1));
                        continue L24;
                      }
                    }
                  } else {
                    var3_ref_jk.b(-3846);
                    var3_ref_jk.d((byte) -35);
                    var3_ref_jk = (jk) ((Object) mea.field_e.a((byte) 80));
                    continue L23;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "ie.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_p = 0;
    }
}
