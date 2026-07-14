/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static String field_e;
    static bm field_d;
    static bd field_b;
    static ub field_a;
    static String field_g;
    static String field_f;
    static gb field_h;
    static String[] field_c;

    final static void a(int param0, int param1, int[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        bd var9 = null;
        int var10 = 0;
        int var11 = 0;
        oj var12 = null;
        oj var13 = null;
        oj var14 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        var4 = 0;
        if (param1 != -457) {
          bi.a(false);
          if (rc.field_e > var4) {
            L0: {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      var13 = re.field_n[var4];
                      var5 = (int)(24.0 * ((double)(-1 + var13.field_j.field_e) + var13.field_l.field_f)) + -param3;
                      var6 = -param0 + (int)(24.0 * (var13.field_l.field_a + (double)var13.field_j.field_g));
                      if (var5 > 95) {
                        var4++;
                        break L4;
                      } else {
                        if (95 > var6) {
                          break L4;
                        } else {
                          if (-737 > (var5 ^ -1)) {
                            break L3;
                          } else {
                            if ((var6 ^ -1) >= -577) {
                              L5: {
                                var9 = null;
                                var10 = var13.field_i;
                                if ((var10 ^ -1) != -17) {
                                  if (var10 != 229) {
                                    if (17 != var10) {
                                      if (227 != var10) {
                                        if (var10 != 226) {
                                          if ((var10 ^ -1) != -229) {
                                            if (232 != var10) {
                                              break L5;
                                            } else {
                                              var9 = ta.field_jb;
                                              break L5;
                                            }
                                          } else {
                                            var9 = tb.field_I;
                                            break L5;
                                          }
                                        } else {
                                          var9 = rh.field_x;
                                          break L5;
                                        }
                                      } else {
                                        var9 = fk.field_c;
                                        break L5;
                                      }
                                    } else {
                                      var9 = d.field_s;
                                      break L5;
                                    }
                                  } else {
                                    var9 = lm.field_y;
                                    break L5;
                                  }
                                } else {
                                  var9 = ee.field_g;
                                  break L5;
                                }
                              }
                              if (var9 == null) {
                                break L1;
                              } else {
                                L6: {
                                  var7 = 128;
                                  if (ta.field_jb == var9) {
                                    var6 += 10;
                                    var5 += 10;
                                    if (-241 < (var13.field_e ^ -1)) {
                                      break L6;
                                    } else {
                                      var9 = wg.field_zb;
                                      break L6;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                                L7: {
                                  if ((var13.field_e ^ -1) > -1) {
                                    var7 = (384000 - -(128 * var13.field_e)) / 3000;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                var9.a(true, var7, (int)var13.field_c, var5, var6);
                                break L0;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    var4++;
                    break L3;
                  }
                  var4++;
                  break L2;
                }
                var4++;
                break L1;
              }
              var4++;
              break L0;
            }
            var4++;
            var4++;
            var4++;
            var4++;
            var4++;
            var4++;
            var4++;
            L8: while (true) {
              if (rc.field_e > var4) {
                var14 = re.field_n[var4];
                var5 = (int)(24.0 * ((double)(-1 + var14.field_j.field_e) + var14.field_l.field_f)) + -param3;
                var6 = -param0 + (int)(24.0 * (var14.field_l.field_a + (double)var14.field_j.field_g));
                if (var5 <= 95) {
                  if (95 <= var6) {
                    if (-737 <= (var5 ^ -1)) {
                      if ((var6 ^ -1) >= -577) {
                        L9: {
                          var9 = null;
                          var10 = var14.field_i;
                          if ((var10 ^ -1) != -17) {
                            if (var10 != 229) {
                              if (17 != var10) {
                                if (227 != var10) {
                                  if (var10 != 226) {
                                    if ((var10 ^ -1) != -229) {
                                      if (232 != var10) {
                                        break L9;
                                      } else {
                                        var9 = ta.field_jb;
                                        break L9;
                                      }
                                    } else {
                                      var9 = tb.field_I;
                                      break L9;
                                    }
                                  } else {
                                    var9 = rh.field_x;
                                    break L9;
                                  }
                                } else {
                                  var9 = fk.field_c;
                                  break L9;
                                }
                              } else {
                                var9 = d.field_s;
                                break L9;
                              }
                            } else {
                              var9 = lm.field_y;
                              break L9;
                            }
                          } else {
                            var9 = ee.field_g;
                            break L9;
                          }
                        }
                        if (var9 != null) {
                          L10: {
                            var7 = 128;
                            if (ta.field_jb == var9) {
                              var6 += 10;
                              var5 += 10;
                              if (-241 < (var14.field_e ^ -1)) {
                                break L10;
                              } else {
                                var9 = wg.field_zb;
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            if ((var14.field_e ^ -1) > -1) {
                              var7 = (384000 - -(128 * var14.field_e)) / 3000;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var9.a(true, var7, (int)var14.field_c, var5, var6);
                          var4++;
                          continue L8;
                        } else {
                          var4++;
                          continue L8;
                        }
                      } else {
                        var4++;
                        continue L8;
                      }
                    } else {
                      var4++;
                      continue L8;
                    }
                  } else {
                    var4++;
                    continue L8;
                  }
                } else {
                  var4++;
                  continue L8;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          L12: while (true) {
            if (rc.field_e > var4) {
              var12 = re.field_n[var4];
              var5 = (int)(24.0 * ((double)(-1 + var12.field_j.field_e) + var12.field_l.field_f)) + -param3;
              var6 = -param0 + (int)(24.0 * (var12.field_l.field_a + (double)var12.field_j.field_g));
              if (var5 <= 95) {
                if (95 <= var6) {
                  if (-737 <= (var5 ^ -1)) {
                    if ((var6 ^ -1) >= -577) {
                      L13: {
                        var9 = null;
                        var10 = var12.field_i;
                        if ((var10 ^ -1) != -17) {
                          if (var10 != 229) {
                            if (17 != var10) {
                              if (227 != var10) {
                                if (var10 != 226) {
                                  if ((var10 ^ -1) != -229) {
                                    if (232 != var10) {
                                      break L13;
                                    } else {
                                      var9 = ta.field_jb;
                                      break L13;
                                    }
                                  } else {
                                    var9 = tb.field_I;
                                    break L13;
                                  }
                                } else {
                                  var9 = rh.field_x;
                                  break L13;
                                }
                              } else {
                                var9 = fk.field_c;
                                break L13;
                              }
                            } else {
                              var9 = d.field_s;
                              break L13;
                            }
                          } else {
                            var9 = lm.field_y;
                            break L13;
                          }
                        } else {
                          var9 = ee.field_g;
                          break L13;
                        }
                      }
                      if (var9 != null) {
                        L14: {
                          var7 = 128;
                          if (ta.field_jb == var9) {
                            var6 += 10;
                            var5 += 10;
                            if (-241 < (var12.field_e ^ -1)) {
                              break L14;
                            } else {
                              var9 = wg.field_zb;
                              break L14;
                            }
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          if ((var12.field_e ^ -1) > -1) {
                            var7 = (384000 - -(128 * var12.field_e)) / 3000;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        var9.a(true, var7, (int)var12.field_c, var5, var6);
                        var4++;
                        continue L12;
                      } else {
                        var4++;
                        continue L12;
                      }
                    } else {
                      var4++;
                      continue L12;
                    }
                  } else {
                    var4++;
                    continue L12;
                  }
                } else {
                  var4++;
                  continue L12;
                }
              } else {
                var4++;
                continue L12;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_g = null;
        field_a = null;
        if (!param0) {
          field_f = null;
          field_c = null;
          field_e = null;
          field_f = null;
          field_h = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_f = null;
          field_h = null;
          return;
        }
    }

    final static void a(p param0, int param1, int param2, int param3) {
        int var4 = 0;
        Object var5 = null;
        bd stackIn_1_0 = null;
        double stackIn_1_1 = 0.0;
        double stackIn_1_2 = 0.0;
        int stackIn_1_3 = 0;
        bd stackIn_2_0 = null;
        double stackIn_2_1 = 0.0;
        double stackIn_2_2 = 0.0;
        int stackIn_2_3 = 0;
        bd stackIn_3_0 = null;
        double stackIn_3_1 = 0.0;
        double stackIn_3_2 = 0.0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        bd stackOut_0_0 = null;
        double stackOut_0_1 = 0.0;
        double stackOut_0_2 = 0.0;
        int stackOut_0_3 = 0;
        bd stackOut_2_0 = null;
        double stackOut_2_1 = 0.0;
        double stackOut_2_2 = 0.0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        bd stackOut_1_0 = null;
        double stackOut_1_1 = 0.0;
        double stackOut_1_2 = 0.0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        L0: {
          var4 = Math.min(param0.field_e, 90);
          var4 = (3 * var4 - var4 * var4 / 60) % te.field_G.length;
          stackOut_0_0 = te.field_G[var4];
          stackOut_0_1 = (double)param1;
          stackOut_0_2 = (double)param2;
          stackOut_0_3 = 0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (param0.field_f) {
            stackOut_2_0 = (bd) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 128;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (bd) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        ((bd) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3 != 0, (double)stackIn_3_4 + param0.field_c, 128);
        if (param3 <= -4) {
          return;
        } else {
          var5 = null;
          bi.a((p) null, 117, 10, -118);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Finally! I must be nearly at the exit now.";
        field_d = new bm();
        field_a = new ub();
        field_c = new String[]{"Civilian", "Draftee", "Rookie", "Technician", "Squaddie", "Engineer", "Sergeant", "Marine", "Commando", "Elite Soldier", "Lone Wolf", "Elite Wolf", "Hero of the UFE", "Elite Hero", "Slayer of the Spawn", "Slayer Elite", "Scourge of the Spawn", "Scourge Elite", "Spirit of the Hammerhead", "Spirit of Vengeance"};
        field_f = "Total aliens killed: <col=ffffff><%0>";
    }
}
