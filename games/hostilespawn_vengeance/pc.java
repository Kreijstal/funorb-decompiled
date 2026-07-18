/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static int field_c;
    static volatile boolean field_a;
    static int field_d;
    static String field_b;

    final static void a() {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        boolean[] var5 = null;
        boolean[] var6 = null;
        int[] var7 = null;
        int var8_int = 0;
        oc var8 = null;
        int var9 = 0;
        oj var9_ref_oj = null;
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
        oj var22_ref_oj = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_159_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        L0: {
          var26 = HostileSpawn.field_I ? 1 : 0;
          if (50 > df.field_c) {
            if (ik.field_b) {
              return;
            } else {
              ik.field_b = true;
              int fieldTemp$5 = aa.field_f + 1;
              aa.field_f = aa.field_f + 1;
              if (fieldTemp$5 >= 10) {
                break L0;
              } else {
                return;
              }
            }
          } else {
            break L0;
          }
        }
        aa.field_f = 0;
        var1_int = ln.field_a.field_d;
        var2 = ln.field_a.field_a;
        var3 = ln.field_a.field_n;
        kf.a(cm.field_c, 0, var3);
        var4 = ln.field_a.field_c;
        var5 = ln.field_a.field_e;
        var6 = ln.field_a.field_q;
        var7 = ln.field_a.field_f;
        var8_int = 1;
        L1: while (true) {
          if (rc.field_e <= var8_int) {
            L2: {
              var8 = mm.field_m[0].field_j;
              var9 = var8.b(-4);
              var10 = ln.field_a.field_g[var9];
              if (var10 != 0) {
                break L2;
              } else {
                var10 = -1;
                break L2;
              }
            }
            L3: {
              var11 = var8.field_g + -50;
              var12 = 50 + var8.field_g;
              var13 = -50 + var8.field_e;
              if (0 < var11) {
                break L3;
              } else {
                var11 = 1;
                break L3;
              }
            }
            L4: {
              if (0 >= var13) {
                var13 = 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var14 = var8.field_e + 50;
              if (var14 >= var1_int + -1) {
                var14 = var1_int + -2;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var2 + -1 <= var12) {
                var12 = -2 + var2;
                break L6;
              } else {
                break L6;
              }
            }
            var15 = 0;
            var16 = var11;
            L7: while (true) {
              if (~var12 >= ~var16) {
                var16 = var11 * var1_int;
                var17 = var8.field_e;
                var18 = var8.field_g;
                var19 = Math.max(-19 + var8.field_e, 1);
                var20 = Math.min(20 + var8.field_e, ln.field_a.field_d - 2);
                var21 = Math.max(var8.field_g - 17, 1);
                var22 = Math.min(16 + var8.field_g, ln.field_a.field_a + -2);
                var23 = var19;
                L8: while (true) {
                  if (~var20 > ~var23) {
                    var23 = 1 + var21;
                    L9: while (true) {
                      if (var22 + -1 < var23) {
                        L10: {
                          if (var10 <= 0) {
                            break L10;
                          } else {
                            var16 = var21 * ln.field_a.field_d;
                            var23 = var21;
                            L11: while (true) {
                              if (var22 < var23) {
                                break L10;
                              } else {
                                var24 = var19;
                                L12: while (true) {
                                  if (~var20 > ~var24) {
                                    var16 = var16 + ln.field_a.field_d;
                                    var23++;
                                    continue L11;
                                  } else {
                                    L13: {
                                      if (~var10 == ~ln.field_a.field_g[var24 + var16]) {
                                        ln.field_a.field_e[var16 + var24] = true;
                                        ln.field_a.field_f[var16 - -var24] = 2;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    var24++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L14: {
                          cm.field_c[var9] = 50;
                          var6[var9] = true;
                          var19 = 49;
                          var20 = var9;
                          if (!n.field_o) {
                            break L14;
                          } else {
                            var21 = 0;
                            L15: while (true) {
                              if (~var21 <= ~rc.field_e) {
                                break L14;
                              } else {
                                L16: {
                                  var22_ref_oj = re.field_n[var21];
                                  var23 = var22_ref_oj.field_j.b(-4);
                                  if (null == var22_ref_oj) {
                                    break L16;
                                  } else {
                                    if (!od.a(var22_ref_oj.field_i, 1)) {
                                      break L16;
                                    } else {
                                      if (var22_ref_oj.field_h == 0) {
                                        break L16;
                                      } else {
                                        L17: {
                                          if (null == q.field_g) {
                                            break L17;
                                          } else {
                                            if (q.field_g.a(var22_ref_oj, (byte) -5)) {
                                              break L16;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        var4[var23] = 0;
                                        if (rh.a(var22_ref_oj.field_i, true)) {
                                          L18: {
                                            var4[var23 + -ln.field_a.field_d] = 0;
                                            var24 = var4[1 + -ln.field_a.field_d + var23];
                                            if (1 != var4[1 + var23]) {
                                              break L18;
                                            } else {
                                              if (var24 == 2) {
                                                break L18;
                                              } else {
                                                if (var24 == 3) {
                                                  break L18;
                                                } else {
                                                  if (4 != var24) {
                                                    var4[var23 + 1] = 0;
                                                    break L18;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var24 != 1) {
                                            break L16;
                                          } else {
                                            var24 = var4[var23 - (ln.field_a.field_d * 2 + 1)];
                                            if (2 == var24) {
                                              break L16;
                                            } else {
                                              if (var24 == 3) {
                                                break L16;
                                              } else {
                                                if (var24 != 4) {
                                                  var4[-ln.field_a.field_d + (var23 - -1)] = 0;
                                                  break L16;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          L19: {
                                            var4[1 + var23] = 0;
                                            var24 = var4[var23 + ln.field_a.field_d - 1];
                                            if (1 != var4[var23 + ln.field_a.field_d]) {
                                              break L19;
                                            } else {
                                              if (var24 == 2) {
                                                break L19;
                                              } else {
                                                if (var24 == 3) {
                                                  break L19;
                                                } else {
                                                  if (4 != var24) {
                                                    var4[var23 - -ln.field_a.field_d] = 0;
                                                    break L19;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L20: {
                                            var24 = var4[ln.field_a.field_d + var23];
                                            if (var4[ln.field_a.field_d + (var23 + 1)] != 1) {
                                              break L20;
                                            } else {
                                              if (2 == var24) {
                                                break L20;
                                              } else {
                                                if (var24 == 3) {
                                                  break L20;
                                                } else {
                                                  if (var24 != 4) {
                                                    var4[1 + ln.field_a.field_d + var23] = 0;
                                                    break L20;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          break L16;
                                        }
                                      }
                                    }
                                  }
                                }
                                var21++;
                                continue L15;
                              }
                            }
                          }
                        }
                        L21: while (true) {
                          L22: {
                            L23: {
                              kl.field_c[var19] = var20;
                              cm.field_c[var20] = var19 + 1;
                              var21 = var20 + 1;
                              var22 = -1 + var20;
                              var23 = -var1_int + var20;
                              var24 = var20 - -var1_int;
                              var25 = cm.field_c[var20] + -1;
                              if (var19 <= 0) {
                                break L23;
                              } else {
                                stackOut_106_0 = ~var4[var21];
                                stackOut_106_1 = -1;
                                stackIn_107_0 = stackOut_106_0;
                                stackIn_107_1 = stackOut_106_1;
                                L24: {
                                  if (stackIn_107_0 == stackIn_107_1) {
                                    break L24;
                                  } else {
                                    if (var4[var21] != 5) {
                                      break L23;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                if (cm.field_c[var21] < var25) {
                                  var19--;
                                  var20 = var21;
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            L25: {
                              if (var19 <= 0) {
                                break L25;
                              } else {
                                L26: {
                                  if (var4[var23] == 0) {
                                    break L26;
                                  } else {
                                    if (var4[var23] != 5) {
                                      break L25;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                                if (var25 <= cm.field_c[var23]) {
                                  break L25;
                                } else {
                                  var20 = var23;
                                  var19--;
                                  break L22;
                                }
                              }
                            }
                            stackOut_122_0 = ~var19;
                            stackOut_122_1 = -1;
                            stackIn_123_0 = stackOut_122_0;
                            stackIn_123_1 = stackOut_122_1;
                            L27: {
                              if (stackIn_123_0 >= stackIn_123_1) {
                                break L27;
                              } else {
                                L28: {
                                  if (var4[var24] == 0) {
                                    break L28;
                                  } else {
                                    if (var4[var24] != 5) {
                                      break L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                if (~cm.field_c[var24] > ~var25) {
                                  var19--;
                                  var20 = var24;
                                  break L22;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            L29: {
                              if (var19 <= 0) {
                                break L29;
                              } else {
                                L30: {
                                  if (var4[var22] == 0) {
                                    break L30;
                                  } else {
                                    if (var4[var22] != 5) {
                                      break L29;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                                if (var25 > cm.field_c[var22]) {
                                  var20 = var22;
                                  var19--;
                                  break L22;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            var19++;
                            if (var19 >= 50) {
                              L31: {
                                var15 = 0;
                                if (n.field_o) {
                                  var21 = 0;
                                  L32: while (true) {
                                    if (~var21 <= ~rc.field_e) {
                                      break L31;
                                    } else {
                                      L33: {
                                        var22_ref_oj = re.field_n[var21];
                                        if (od.a(var22_ref_oj.field_i, 1)) {
                                          if (var22_ref_oj.field_e != 0) {
                                            break L33;
                                          } else {
                                            if (0 >= var22_ref_oj.field_I) {
                                              break L33;
                                            } else {
                                              L34: {
                                                var23 = var22_ref_oj.field_j.b(-4);
                                                if (rh.a(var22_ref_oj.field_i, true)) {
                                                  stackOut_158_0 = -ln.field_a.field_d;
                                                  stackIn_159_0 = stackOut_158_0;
                                                  break L34;
                                                } else {
                                                  stackOut_157_0 = 1;
                                                  stackIn_159_0 = stackOut_157_0;
                                                  break L34;
                                                }
                                              }
                                              var24 = stackIn_159_0;
                                              ln.field_a.field_c[var23] = 2;
                                              ln.field_a.field_c[var24 + var23] = 2;
                                              break L33;
                                            }
                                          }
                                        } else {
                                          break L33;
                                        }
                                      }
                                      var21++;
                                      continue L32;
                                    }
                                  }
                                } else {
                                  break L31;
                                }
                              }
                              L35: {
                                if (0 != (cj.field_I & 4)) {
                                  var16 = var1_int;
                                  var21 = 1;
                                  L36: while (true) {
                                    if (~var21 <= ~(-1 + var2)) {
                                      var16 = var1_int;
                                      var21 = 1;
                                      L37: while (true) {
                                        if (~var21 <= ~(var2 - 1)) {
                                          break L35;
                                        } else {
                                          var22 = 1;
                                          L38: while (true) {
                                            if (~(var1_int + -1) >= ~var22) {
                                              var16 = var16 + var1_int;
                                              var21++;
                                              continue L37;
                                            } else {
                                              L39: {
                                                var15 = var16 + var22;
                                                if (var5[var15]) {
                                                  break L39;
                                                } else {
                                                  if (2 == var4[var15]) {
                                                    L40: {
                                                      L41: {
                                                        if (!var5[var15 - -1]) {
                                                          break L41;
                                                        } else {
                                                          if (var4[var15 - -1] != 2) {
                                                            break L40;
                                                          } else {
                                                            break L41;
                                                          }
                                                        }
                                                      }
                                                      L42: {
                                                        if (!var5[-1 + var15]) {
                                                          break L42;
                                                        } else {
                                                          if (var4[var15 + -1] != 2) {
                                                            break L40;
                                                          } else {
                                                            break L42;
                                                          }
                                                        }
                                                      }
                                                      L43: {
                                                        if (!var5[var1_int + var15]) {
                                                          break L43;
                                                        } else {
                                                          if (var4[var15 - -var1_int] != 2) {
                                                            break L40;
                                                          } else {
                                                            break L43;
                                                          }
                                                        }
                                                      }
                                                      if (!var5[-var1_int + var15]) {
                                                        break L39;
                                                      } else {
                                                        if (var4[var15 + -var1_int] != 2) {
                                                          break L40;
                                                        } else {
                                                          break L39;
                                                        }
                                                      }
                                                    }
                                                    var5[var15] = true;
                                                    var7[var15] = 2;
                                                    break L39;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                              }
                                              var22++;
                                              continue L38;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var22 = 1;
                                      L44: while (true) {
                                        if (-1 + var1_int <= var22) {
                                          var16 = var16 + var1_int;
                                          var21++;
                                          continue L36;
                                        } else {
                                          L45: {
                                            var15 = var22 + var16;
                                            if (var5[var15]) {
                                              break L45;
                                            } else {
                                              if (var4[var15] == 1) {
                                                L46: {
                                                  L47: {
                                                    if (!var5[1 + var15]) {
                                                      break L47;
                                                    } else {
                                                      if (var4[1 + var15] == 2) {
                                                        break L47;
                                                      } else {
                                                        if (var4[var15 + 1] != 1) {
                                                          break L46;
                                                        } else {
                                                          break L47;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L48: {
                                                    if (!var5[var15 + -1]) {
                                                      break L48;
                                                    } else {
                                                      if (var4[var15 + -1] == 2) {
                                                        break L48;
                                                      } else {
                                                        if (var4[var15 - 1] != 1) {
                                                          break L46;
                                                        } else {
                                                          break L48;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L49: {
                                                    if (!var5[var15 + var1_int]) {
                                                      break L49;
                                                    } else {
                                                      if (var4[var1_int + var15] == 2) {
                                                        break L49;
                                                      } else {
                                                        if (var4[var1_int + var15] != 1) {
                                                          break L46;
                                                        } else {
                                                          break L49;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (!var5[var15 + -var1_int]) {
                                                    break L45;
                                                  } else {
                                                    if (var4[var15 - var1_int] == 2) {
                                                      break L45;
                                                    } else {
                                                      if (var4[-var1_int + var15] == 1) {
                                                        break L45;
                                                      } else {
                                                        break L46;
                                                      }
                                                    }
                                                  }
                                                }
                                                var5[var15] = true;
                                                var7[var15] = 2;
                                                break L45;
                                              } else {
                                                break L45;
                                              }
                                            }
                                          }
                                          var22++;
                                          continue L44;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L35;
                                }
                              }
                              return;
                            } else {
                              var20 = kl.field_c[var19];
                              break L22;
                            }
                          }
                          continue L21;
                        }
                      } else {
                        int discarded$6 = -69;
                        ui.a(var23, var17, var18, var19);
                        int discarded$7 = -69;
                        ui.a(var23, var17, var18, var20);
                        var23++;
                        continue L9;
                      }
                    }
                  } else {
                    int discarded$8 = -69;
                    ui.a(var21, var17, var18, var23);
                    int discarded$9 = -69;
                    ui.a(var22, var17, var18, var23);
                    var23++;
                    continue L8;
                  }
                }
              } else {
                var15 = var16 * var1_int + var13;
                var17 = var13;
                L50: while (true) {
                  if (var14 <= var17) {
                    var16++;
                    continue L7;
                  } else {
                    var5[var15] = false;
                    var6[var15] = false;
                    var15++;
                    var17++;
                    continue L50;
                  }
                }
              }
            }
          } else {
            L51: {
              var9_ref_oj = re.field_n[var8_int];
              var10 = var9_ref_oj.field_j.b(-4);
              if (var10 < 0) {
                break L51;
              } else {
                if (~var3 >= ~var10) {
                  break L51;
                } else {
                  if (var4[var10] != 3) {
                    break L51;
                  } else {
                    var4[var10] = 0;
                    break L51;
                  }
                }
              }
            }
            var8_int++;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, pf param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var19 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = vf.b(123, (param0 + -param1) * 3);
              var6 = 3 * param1;
              lk.l(74);
              var7 = var5_int + -10;
              if (param3.field_f <= 0) {
                break L1;
              } else {
                if (null != param3.field_x) {
                  int discarded$1 = -74;
                  fk.a();
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            th.field_Lb = 0;
            var8 = 0;
            L2: while (true) {
              if (~var8 <= ~param3.field_k) {
                L3: {
                  if (0 >= param3.field_f) {
                    break L3;
                  } else {
                    if (null == param3.field_x) {
                      break L3;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L4: while (true) {
                        if (~var9 <= ~ke.field_z.length) {
                          break L3;
                        } else {
                          var10 = ke.field_z[var9];
                          ke.field_z[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                L5: {
                  L6: {
                    var9 = param3.field_i[var8];
                    var10 = param3.field_P[var8];
                    var11 = param3.field_z[var8];
                    if (!param2) {
                      break L6;
                    } else {
                      var12 = tb.field_K[var9];
                      var13 = lc.field_c[var9];
                      var14 = tb.field_K[var10] - var12;
                      var15 = -var12 + tb.field_K[var11];
                      var16 = lc.field_c[var10] - var13;
                      var17 = -var13 + lc.field_c[var11];
                      if (var17 * var14 + -(var16 * var15) >= 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var12 = rb.field_p[var9];
                  if (-2147483648 == var12) {
                    break L5;
                  } else {
                    var13 = rb.field_p[var10];
                    if (-2147483648 == var13) {
                      break L5;
                    } else {
                      var14 = rb.field_p[var11];
                      if (var14 != -2147483648) {
                        L7: {
                          var15 = var14 + (var12 - (-var13 + var6));
                          stackOut_22_0 = -1 + mn.field_a.length;
                          stackIn_25_0 = stackOut_22_0;
                          stackIn_23_0 = stackOut_22_0;
                          if (var7 >= 0) {
                            stackOut_25_0 = stackIn_25_0;
                            stackOut_25_1 = var15 >> var7;
                            stackIn_26_0 = stackOut_25_0;
                            stackIn_26_1 = stackOut_25_1;
                            break L7;
                          } else {
                            stackOut_23_0 = stackIn_23_0;
                            stackOut_23_1 = var15 << -var7;
                            stackIn_26_0 = stackOut_23_0;
                            stackIn_26_1 = stackOut_23_1;
                            break L7;
                          }
                        }
                        var16 = stackIn_26_0 + -stackIn_26_1;
                        var17 = mn.field_a[var16];
                        L8: while (true) {
                          if (0 == var17 >> 4) {
                            L9: {
                              var18 = (var16 << 4) + var17;
                              lh.field_d[var18] = var8;
                              mn.field_a[var16] = 1 + var17;
                              if (param3.field_f <= 0) {
                                break L9;
                              } else {
                                if (null != param3.field_x) {
                                  ke.field_z[param3.field_x[var8]] = ke.field_z[param3.field_x[var8]] + 1;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            th.field_Lb = th.field_Lb + 1;
                            break L5;
                          } else {
                            var16--;
                            if (var16 >= 0) {
                              var17 = mn.field_a[var16];
                              continue L8;
                            } else {
                              System.err.println("Out of range!");
                              break L5;
                            }
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var5;
            stackOut_54_1 = new StringBuilder().append("pc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_57_0 = stackOut_54_0;
            stackIn_57_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param3 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L10;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_58_2 = stackOut_55_2;
              break L10;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ',' + 106 + ')');
        }
    }

    final static void a(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ac.a(param1, param0, -1, (String) null);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3, "pc.B(" + param0 + ',' + param1 + ',' + false + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_3_0 = se.field_c.equals((Object) (Object) mf.a(false, (CharSequence) (Object) param1));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("pc.C(").append(14088).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(String param0, String param1, boolean param2, long param3, java.applet.Applet param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var6_ref2 = null;
            String var7 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var6_ref2 = param4.getParameter("cookiehost");
                      var7 = param1 + "=" + param0 + "; version=1; path=/; domain=" + var6_ref2;
                      if (param3 >= 0L) {
                        var7 = var7 + "; Expires=" + dk.a((byte) -41, 1000L * param3 + hn.a((byte) 80)) + "; Max-Age=" + param3;
                        break L2;
                      } else {
                        var7 = var7 + "; Discard;";
                        break L2;
                      }
                    }
                    a.a(param4, 17467, "document.cookie=\"" + var7 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var6 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) var6_ref;
                stackOut_10_1 = new StringBuilder().append("pc.E(");
                stackIn_13_0 = stackOut_10_0;
                stackIn_13_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param0 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L4;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_14_0 = stackOut_11_0;
                  stackIn_14_1 = stackOut_11_1;
                  stackIn_14_2 = stackOut_11_2;
                  break L4;
                }
              }
              L5: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
                stackIn_17_0 = stackOut_14_0;
                stackIn_17_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param1 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L5;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_18_1 = stackOut_15_1;
                  stackIn_18_2 = stackOut_15_2;
                  break L5;
                }
              }
              L6: {
                stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(true).append(',').append(param3).append(',');
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param4 == null) {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L6;
                } else {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "{...}";
                  stackIn_22_0 = stackOut_19_0;
                  stackIn_22_1 = stackOut_19_1;
                  stackIn_22_2 = stackOut_19_2;
                  break L6;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "pc.D(" + 1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_b = "@";
    }
}
