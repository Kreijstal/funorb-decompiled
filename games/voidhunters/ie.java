/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends rqa {
    static int field_p;
    static phb field_o;

    public static void e() {
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(4, 94));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ie.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    ie(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a() {
        RuntimeException var1 = null;
        faa var1_ref = null;
        int var2 = 0;
        jk var3_ref_jk = null;
        long var3_long = 0L;
        int var3 = 0;
        Object var4 = null;
        mm var4_ref = null;
        int var4_int = 0;
        String var5_ref_String = null;
        int var5 = 0;
        mm var5_ref_mm = null;
        jk var5_ref_jk = null;
        String var6 = null;
        jk var6_ref = null;
        mm var6_ref2 = null;
        String var7 = null;
        jk var7_ref = null;
        jk var8_ref_jk = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jk var12 = null;
        mm var13 = null;
        mm var14 = null;
        mm var15 = null;
        Object var16 = null;
        Object var17 = null;
        mm var18 = null;
        jk var19 = null;
        int stackIn_12_0 = 0;
        jk stackIn_17_0 = null;
        jk stackIn_18_0 = null;
        jk stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        jk stackIn_83_0 = null;
        jk stackIn_84_0 = null;
        jk stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        RuntimeException decompiledCaughtException = null;
        jk stackOut_82_0 = null;
        jk stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        jk stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        jk stackOut_16_0 = null;
        jk stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        jk stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var4 = null;
        var16 = null;
        var17 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            var1_ref = qga.field_b;
            L1: {
              L2: {
                L3: {
                  var2 = ((ds) (Object) var1_ref).e((byte) -114);
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (var2 == 1) {
                      break L3;
                    } else {
                      if (var2 == 2) {
                        break L3;
                      } else {
                        if (var2 == 3) {
                          break L3;
                        } else {
                          if (4 == var2) {
                            break L3;
                          } else {
                            if (var2 != 5) {
                              if (var2 == 6) {
                                var3_long = ((ds) (Object) var1_ref).k(255);
                                var5 = ((ds) (Object) var1_ref).e((byte) -120);
                                var6_ref = pdb.a((byte) 80, var3_long);
                                if (var6_ref != null) {
                                  L4: {
                                    if (var6_ref.field_Fb) {
                                      qea.field_p = qea.field_p - 1;
                                      var6_ref.field_Fb = false;
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (var5 == 0) {
                                      var6_ref.b(-3846);
                                      break L5;
                                    } else {
                                      var6_ref.field_Db = var5;
                                      var6_ref.field_yb = ktb.field_p;
                                      break L5;
                                    }
                                  }
                                  var6_ref.d((byte) -35);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              } else {
                                if (var2 == 7) {
                                  var19 = (jk) (Object) cta.field_q.d(0);
                                  L6: while (true) {
                                    if (var19 == null) {
                                      qea.field_p = 0;
                                      break L1;
                                    } else {
                                      var19.b(-3846);
                                      var19.d((byte) -35);
                                      var19 = (jk) (Object) cta.field_q.a((byte) 11);
                                      continue L6;
                                    }
                                  }
                                } else {
                                  if (var2 != 8) {
                                    if (var2 != 9) {
                                      if (var2 == 10) {
                                        var18 = (mm) (Object) kja.field_E.d(0);
                                        L7: while (true) {
                                          if (var18 == null) {
                                            break L2;
                                          } else {
                                            var18.b(-3846);
                                            var18.d((byte) -35);
                                            var18 = (mm) (Object) kja.field_E.a((byte) 106);
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        L8: {
                                          if (var2 == 11) {
                                            break L8;
                                          } else {
                                            if (var2 == 12) {
                                              break L8;
                                            } else {
                                              if (13 == var2) {
                                                L9: {
                                                  var3 = ((ds) (Object) var1_ref).e(1869);
                                                  var4_int = ((ds) (Object) var1_ref).e((byte) -97);
                                                  var5_ref_mm = (mm) (Object) ks.field_r.a(-1, (long)var3);
                                                  if (var5_ref_mm == null) {
                                                    break L9;
                                                  } else {
                                                    L10: {
                                                      var13 = var5_ref_mm;
                                                      var6_ref2 = var13;
                                                      var5_ref_mm.field_Qb = false;
                                                      if (var4_int != 0) {
                                                        var5_ref_mm.field_ec = var4_int;
                                                        var5_ref_mm.field_Db = ktb.field_p;
                                                        break L10;
                                                      } else {
                                                        break L10;
                                                      }
                                                    }
                                                    var13.field_ac = false;
                                                    eta.a((byte) 109, var5_ref_mm);
                                                    break L9;
                                                  }
                                                }
                                                break L1;
                                              } else {
                                                L11: {
                                                  if (14 == var2) {
                                                    break L11;
                                                  } else {
                                                    if (var2 != 16) {
                                                      L12: {
                                                        if (var2 == 15) {
                                                          break L12;
                                                        } else {
                                                          if (var2 != 17) {
                                                            if (var2 == 18) {
                                                              L13: {
                                                                var3_long = ((ds) (Object) var1_ref).k(255);
                                                                var5_ref_String = ((ds) (Object) var1_ref).a(-1);
                                                                var6 = ((ds) (Object) var1_ref).a(-1);
                                                                int discarded$6 = 1;
                                                                var7_ref = pjb.a(var3_long);
                                                                if (var7_ref != null) {
                                                                  break L13;
                                                                } else {
                                                                  var7_ref = new jk(var5_ref_String, var6, var3_long);
                                                                  icb.field_p.a((fh) (Object) var7_ref, (byte) -76, var3_long);
                                                                  lqa.field_o.field_zb = lqa.field_o.field_zb + 1;
                                                                  break L13;
                                                                }
                                                              }
                                                              L14: {
                                                                var7_ref.field_Gb = ((ds) (Object) var1_ref).e(1869);
                                                                var8 = ((ds) (Object) var1_ref).l(11436);
                                                                stackOut_82_0 = (jk) var7_ref;
                                                                stackIn_84_0 = stackOut_82_0;
                                                                stackIn_83_0 = stackOut_82_0;
                                                                if ((1 & var8) == 0) {
                                                                  stackOut_84_0 = (jk) (Object) stackIn_84_0;
                                                                  stackOut_84_1 = 0;
                                                                  stackIn_85_0 = stackOut_84_0;
                                                                  stackIn_85_1 = stackOut_84_1;
                                                                  break L14;
                                                                } else {
                                                                  stackOut_83_0 = (jk) (Object) stackIn_83_0;
                                                                  stackOut_83_1 = 1;
                                                                  stackIn_85_0 = stackOut_83_0;
                                                                  stackIn_85_1 = stackOut_83_1;
                                                                  break L14;
                                                                }
                                                              }
                                                              stackIn_85_0.field_Lb = stackIn_85_1 != 0;
                                                              var7_ref.field_Bb = var8 >> 1;
                                                              var7_ref.field_vb = ((ds) (Object) var1_ref).e((byte) -103);
                                                              var7_ref.field_Ab = ((ds) (Object) var1_ref).e((byte) -111);
                                                              mea.field_e.b(-10258, (ksa) (Object) var7_ref);
                                                              break L1;
                                                            } else {
                                                              if (var2 == 19) {
                                                                L15: {
                                                                  var3_long = ((ds) (Object) var1_ref).k(255);
                                                                  var5 = ((ds) (Object) var1_ref).e((byte) -120);
                                                                  int discarded$7 = 1;
                                                                  var6_ref = pjb.a(var3_long);
                                                                  if (var6_ref == null) {
                                                                    break L15;
                                                                  } else {
                                                                    L16: {
                                                                      if (var5 != 0) {
                                                                        var6_ref.field_yb = ktb.field_p;
                                                                        var6_ref.field_Db = var5;
                                                                        break L16;
                                                                      } else {
                                                                        var6_ref.b(-3846);
                                                                        break L16;
                                                                      }
                                                                    }
                                                                    var6_ref.d((byte) -35);
                                                                    lqa.field_o.field_zb = lqa.field_o.field_zb - 1;
                                                                    break L15;
                                                                  }
                                                                }
                                                                break L1;
                                                              } else {
                                                                if (var2 == 20) {
                                                                  awa.a(-41, lqa.field_o, false, (ds) (Object) var1_ref);
                                                                  break L1;
                                                                } else {
                                                                  if (21 != var2) {
                                                                    if (var2 != 22) {
                                                                      if (var2 == 23) {
                                                                        wqa.field_a = ((ds) (Object) var1_ref).k(255);
                                                                        break L1;
                                                                      } else {
                                                                        gna.a((Throwable) null, "L1: " + hm.e(-13514), 0);
                                                                        ifb.l(-123);
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      tg.field_q = ((ds) (Object) var1_ref).e(1869);
                                                                      cla.field_b = ((ds) (Object) var1_ref).l(11436);
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    var3 = ((ds) (Object) var1_ref).e(1869);
                                                                    if (var3 == 0) {
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
                                                            break L12;
                                                          }
                                                        }
                                                      }
                                                      var3_long = ((ds) (Object) var1_ref).k(255);
                                                      var5 = ((ds) (Object) var1_ref).e((byte) -89);
                                                      var12 = pdb.a((byte) 80, var3_long);
                                                      var6_ref = var12;
                                                      if (var12 != null) {
                                                        L17: {
                                                          if (15 != var2) {
                                                            if (!var6_ref.field_Fb) {
                                                              break L17;
                                                            } else {
                                                              qea.field_p = qea.field_p - 1;
                                                              var6_ref.field_Fb = false;
                                                              break L17;
                                                            }
                                                          } else {
                                                            var12.field_Eb = false;
                                                            break L17;
                                                          }
                                                        }
                                                        L18: {
                                                          if (var5 != 0) {
                                                            var6_ref.field_yb = ktb.field_p;
                                                            var6_ref.field_Db = var5;
                                                            break L18;
                                                          } else {
                                                            break L18;
                                                          }
                                                        }
                                                        int discarded$8 = 1;
                                                        mnb.a(var6_ref);
                                                        break L1;
                                                      } else {
                                                        break L1;
                                                      }
                                                    } else {
                                                      break L11;
                                                    }
                                                  }
                                                }
                                                L19: {
                                                  var3_long = ((ds) (Object) var1_ref).k(255);
                                                  var5_ref_jk = pdb.a((byte) 80, var3_long);
                                                  if (var5_ref_jk == null) {
                                                    break L19;
                                                  } else {
                                                    L20: {
                                                      if (var2 != 14) {
                                                        if (!var5_ref_jk.field_Fb) {
                                                          var5_ref_jk.field_Fb = true;
                                                          qea.field_p = qea.field_p + 1;
                                                          break L20;
                                                        } else {
                                                          break L20;
                                                        }
                                                      } else {
                                                        var5_ref_jk.field_Eb = true;
                                                        break L20;
                                                      }
                                                    }
                                                    int discarded$9 = 1;
                                                    mnb.a(var5_ref_jk);
                                                    break L19;
                                                  }
                                                }
                                                break L1;
                                              }
                                            }
                                          }
                                        }
                                        L21: {
                                          var3 = ((ds) (Object) var1_ref).e(1869);
                                          var14 = (mm) (Object) ks.field_r.a(-1, (long)var3);
                                          var4_ref = var14;
                                          if (var14 == null) {
                                            break L21;
                                          } else {
                                            L22: {
                                              if (var2 != 11) {
                                                var4_ref.field_Qb = true;
                                                break L22;
                                              } else {
                                                var14.field_ac = true;
                                                break L22;
                                              }
                                            }
                                            eta.a((byte) 102, var4_ref);
                                            break L21;
                                          }
                                        }
                                        break L1;
                                      }
                                    } else {
                                      L23: {
                                        var3 = ((ds) (Object) var1_ref).e(1869);
                                        var4_int = ((ds) (Object) var1_ref).e((byte) -127);
                                        var15 = (mm) (Object) ks.field_r.a(-1, (long)var3);
                                        if (var15 == null) {
                                          break L23;
                                        } else {
                                          L24: {
                                            if (var4_int != 0) {
                                              var15.field_Db = ktb.field_p;
                                              var15.field_ec = var4_int;
                                              break L24;
                                            } else {
                                              var15.b(-3846);
                                              break L24;
                                            }
                                          }
                                          var15.d((byte) -35);
                                          break L23;
                                        }
                                      }
                                      break L1;
                                    }
                                  } else {
                                    L25: {
                                      var3 = ((ds) (Object) var1_ref).e(1869);
                                      var4_ref = (mm) (Object) ks.field_r.a(-1, (long)var3);
                                      if (var4_ref != null) {
                                        break L25;
                                      } else {
                                        var4_ref = new mm(ocb.field_l);
                                        ks.field_r.a((fh) (Object) var4_ref, (byte) -115, (long)var3);
                                        break L25;
                                      }
                                    }
                                    awa.a(118, var4_ref, true, (ds) (Object) var1_ref);
                                    eta.a((byte) 109, var4_ref);
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              L26: {
                                var3_long = ((ds) (Object) var1_ref).k(255);
                                var5_ref_String = ((ds) (Object) var1_ref).a(-1);
                                var6 = ((ds) (Object) var1_ref).a(-1);
                                var7 = ((ds) (Object) var1_ref).a(-1);
                                var8_ref_jk = pdb.a((byte) 80, var3_long);
                                if (var6.equals((Object) (Object) "")) {
                                  stackOut_11_0 = 0;
                                  stackIn_12_0 = stackOut_11_0;
                                  break L26;
                                } else {
                                  stackOut_10_0 = 1;
                                  stackIn_12_0 = stackOut_10_0;
                                  break L26;
                                }
                              }
                              L27: {
                                var9 = stackIn_12_0;
                                if (var8_ref_jk != null) {
                                  if (var9 == 0) {
                                    break L27;
                                  } else {
                                    var8_ref_jk.a(var7, var5_ref_String, -424);
                                    break L27;
                                  }
                                } else {
                                  var8_ref_jk = new jk(var5_ref_String, var7, var3_long);
                                  oha.field_o.a((fh) (Object) var8_ref_jk, (byte) -86, var3_long);
                                  break L27;
                                }
                              }
                              L28: {
                                var8_ref_jk.field_Kb = wt.a(false) - (long)((ds) (Object) var1_ref).h(77);
                                var8_ref_jk.field_Gb = ((ds) (Object) var1_ref).e(1869);
                                var10 = ((ds) (Object) var1_ref).l(11436);
                                stackOut_16_0 = (jk) var8_ref_jk;
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_17_0 = stackOut_16_0;
                                if (0 == (var10 & 1)) {
                                  stackOut_18_0 = (jk) (Object) stackIn_18_0;
                                  stackOut_18_1 = 0;
                                  stackIn_19_0 = stackOut_18_0;
                                  stackIn_19_1 = stackOut_18_1;
                                  break L28;
                                } else {
                                  stackOut_17_0 = (jk) (Object) stackIn_17_0;
                                  stackOut_17_1 = 1;
                                  stackIn_19_0 = stackOut_17_0;
                                  stackIn_19_1 = stackOut_17_1;
                                  break L28;
                                }
                              }
                              stackIn_19_0.field_Lb = stackIn_19_1 != 0;
                              var8_ref_jk.field_Bb = var10 >> 1;
                              var8_ref_jk.field_vb = ((ds) (Object) var1_ref).e((byte) -120);
                              var8_ref_jk.field_Ab = ((ds) (Object) var1_ref).e((byte) -113);
                              int discarded$10 = 1;
                              mnb.a(var8_ref_jk);
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_jk = (jk) (Object) mea.field_e.d(0);
                L29: while (true) {
                  if (var3_ref_jk == null) {
                    var3_ref_jk = (jk) (Object) oha.field_o.c(-31);
                    L30: while (true) {
                      if (var3_ref_jk == null) {
                        L31: {
                          if (var2 != 1) {
                            break L31;
                          } else {
                            if (null == lqa.field_o) {
                              break L31;
                            } else {
                              dsa.field_p = lqa.field_o.field_Vb;
                              break L31;
                            }
                          }
                        }
                        L32: {
                          if (var2 != 4) {
                            lqa.field_o = null;
                            break L32;
                          } else {
                            var3 = ((ds) (Object) var1_ref).e(1869);
                            lqa.field_o = new mm(ocb.field_l);
                            lqa.field_o.a((long)var3, (byte) 83);
                            awa.a(-123, lqa.field_o, false, (ds) (Object) var1_ref);
                            qga.field_a = 0L;
                            break L32;
                          }
                        }
                        L33: {
                          L34: {
                            if (var2 == 2) {
                              break L34;
                            } else {
                              if (3 != var2) {
                                ohb.field_o = null;
                                break L33;
                              } else {
                                break L34;
                              }
                            }
                          }
                          if (ohb.field_o == null) {
                            ohb.field_o = new mm(ocb.field_l);
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        if (3 == var2) {
                          ii.field_h = true;
                          var3 = 0;
                          L35: while (true) {
                            if (ce.field_o.length <= var3) {
                              imb.field_a = ((ds) (Object) var1_ref).e((byte) -113);
                              qd.field_d = ((ds) (Object) var1_ref).e((byte) -95);
                              var3 = 0;
                              L36: while (true) {
                                if (var3 >= nkb.field_p.length) {
                                  break L2;
                                } else {
                                  nkb.field_p[var3] = ((ds) (Object) var1_ref).d((byte) -114);
                                  var3++;
                                  continue L36;
                                }
                              }
                            } else {
                              ce.field_o[var3] = ((ds) (Object) var1_ref).d((byte) -114);
                              var3++;
                              continue L35;
                            }
                          }
                        } else {
                          ii.field_h = false;
                          break L1;
                        }
                      } else {
                        L37: {
                          L38: {
                            if (var3_ref_jk.field_Eb) {
                              break L38;
                            } else {
                              if (!var3_ref_jk.field_Fb) {
                                break L37;
                              } else {
                                break L38;
                              }
                            }
                          }
                          L39: {
                            if (var3_ref_jk.field_Fb) {
                              qea.field_p = qea.field_p - 1;
                              var3_ref_jk.field_Fb = false;
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                          var3_ref_jk.field_Eb = false;
                          int discarded$11 = 1;
                          mnb.a(var3_ref_jk);
                          break L37;
                        }
                        var3_ref_jk = (jk) (Object) oha.field_o.d(-1);
                        continue L30;
                      }
                    }
                  } else {
                    var3_ref_jk.b(-3846);
                    var3_ref_jk.d((byte) -35);
                    var3_ref_jk = (jk) (Object) mea.field_e.a((byte) 80);
                    continue L29;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "ie.C(" + 13 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
    }
}
