/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static int field_c;
    static volatile boolean field_a;
    static int field_d;
    static String field_b;

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_172_0 = 0;
        int stackIn_172_1 = 0;
        boolean stackIn_212_0 = false;
        int stackIn_224_0 = 0;
        int stackIn_227_0 = 0;
        boolean stackIn_235_0 = false;
        int stackIn_281_0 = 0;
        boolean stackIn_287_0 = false;
        int stackIn_322_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        Throwable decompiledCaughtException = null;
        boolean stackOut_211_0;
        boolean stackOut_286_0;
        boolean stackOut_234_0;
        int var1_int = 0;
        RuntimeException var1 = null;
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
        ArrayIndexOutOfBoundsException var21_ref_ArrayIndexOutOfBoundsException = null;
        int var22 = 0;
        oj var22_ref_oj = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        var26 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (50 > df.field_c) {
                if (ik.field_b) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  ik.field_b = true;
                  fieldTemp$0 = aa.field_f + 1;
                  aa.field_f = aa.field_f + 1;
                  if (-11 >= (fieldTemp$0 ^ -1)) {
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                break L1;
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
            L2: while (true) {
              if (rc.field_e <= var8_int) {
                L3: {
                  var8 = mm.field_m[0].field_j;
                  var9 = var8.b(-4);
                  var10 = ln.field_a.field_g[var9];
                  if (-1 != (var10 ^ -1)) {
                    break L3;
                  } else {
                    var10 = -1;
                    break L3;
                  }
                }
                L4: {
                  var11 = var8.field_g + -50;
                  var12 = 50 + var8.field_g;
                  var13 = -50 + var8.field_e;
                  if (0 < var11) {
                    break L4;
                  } else {
                    var11 = 1;
                    break L4;
                  }
                }
                L5: {
                  if (0 >= var13) {
                    var13 = 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var14 = var8.field_e + 50;
                  if (var14 >= var1_int + -1) {
                    var14 = var1_int + -2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var2 + -1 <= var12) {
                    var12 = -2 + var2;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var15 = 0;
                var16 = var11;
                L8: while (true) {
                  if ((var12 ^ -1) >= (var16 ^ -1)) {
                    var16 = var11 * var1_int;
                    var17 = var8.field_e;
                    var18 = var8.field_g;
                    var19 = Math.max(-19 + var8.field_e, 1);
                    var20 = Math.min(20 + var8.field_e, ln.field_a.field_d - param0);
                    var21 = Math.max(var8.field_g - 17, 1);
                    var22 = Math.min(16 + var8.field_g, ln.field_a.field_a + -2);
                    var23 = var19;
                    L9: while (true) {
                      if ((var20 ^ -1) > (var23 ^ -1)) {
                        var23 = 1 + var21;
                        L10: while (true) {
                          if (var22 + -1 < var23) {
                            L11: {
                              if ((var10 ^ -1) >= -1) {
                                break L11;
                              } else {
                                var16 = var21 * ln.field_a.field_d;
                                var23 = var21;
                                L12: while (true) {
                                  if (var22 < var23) {
                                    break L11;
                                  } else {
                                    var24 = var19;
                                    L13: while (true) {
                                      L14: {
                                        if ((var20 ^ -1) > (var24 ^ -1)) {
                                          stackIn_71_0 = var16;
                                          stackIn_71_1 = ln.field_a.field_d;
                                          break L14;
                                        } else {
                                          stackIn_71_0 = var10 ^ -1;

                                          stackIn_71_1 = ln.field_a.field_g[var24 + var16] ^ -1;

                                          L15: {
                                            if (stackIn_71_0 == stackIn_71_1) {
                                              ln.field_a.field_e[var16 + var24] = true;
                                              ln.field_a.field_f[var16 - -var24] = 2;
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                          var24++;
                                          continue L13;
                                        }
                                      }
                                      var16 = stackIn_71_0 + stackIn_71_1;
                                      var23++;
                                      continue L12;
                                    }
                                  }
                                }
                              }
                            }
                            L16: {
                              cm.field_c[var9] = 50;
                              var6[var9] = true;
                              var19 = 49;
                              var20 = var9;
                              if (!n.field_o) {
                                break L16;
                              } else {
                                var21 = 0;
                                L17: while (true) {
                                  if ((var21 ^ -1) <= (rc.field_e ^ -1)) {
                                    break L16;
                                  } else {
                                    L18: {
                                      var22_ref_oj = re.field_n[var21];
                                      var23 = var22_ref_oj.field_j.b(param0 ^ -2);
                                      if (null == var22_ref_oj) {
                                        break L18;
                                      } else {
                                        if (!od.a(var22_ref_oj.field_i, 1)) {
                                          break L18;
                                        } else {
                                          if ((var22_ref_oj.field_h ^ -1) == -1) {
                                            break L18;
                                          } else {
                                            L19: {
                                              if (null == q.field_g) {
                                                break L19;
                                              } else {
                                                if (q.field_g.a(var22_ref_oj, (byte) -5)) {
                                                  break L18;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            var4[var23] = 0;
                                            if (rh.a(var22_ref_oj.field_i, true)) {
                                              L20: {
                                                var4[var23 + -ln.field_a.field_d] = 0;
                                                var24 = var4[1 + -ln.field_a.field_d + var23];
                                                if (1 != var4[1 + var23]) {
                                                  break L20;
                                                } else {
                                                  if ((var24 ^ -1) == -3) {
                                                    break L20;
                                                  } else {
                                                    if (var24 == 3) {
                                                      break L20;
                                                    } else {
                                                      if (4 != var24) {
                                                        var4[var23 + 1] = 0;
                                                        break L20;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var24 != 1) {
                                                break L18;
                                              } else {
                                                var24 = var4[var23 - (ln.field_a.field_d * 2 + 1)];
                                                if (2 == var24) {
                                                  break L18;
                                                } else {
                                                  if ((var24 ^ -1) == -4) {
                                                    break L18;
                                                  } else {
                                                    if ((var24 ^ -1) != -5) {
                                                      var4[-ln.field_a.field_d + (var23 - -1)] = 0;
                                                      break L18;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              L21: {
                                                var4[1 + var23] = 0;
                                                var24 = var4[var23 + ln.field_a.field_d - 1];
                                                if (1 != var4[var23 + ln.field_a.field_d]) {
                                                  break L21;
                                                } else {
                                                  if (var24 == 2) {
                                                    break L21;
                                                  } else {
                                                    if (var24 == 3) {
                                                      break L21;
                                                    } else {
                                                      if (4 != var24) {
                                                        var4[var23 - -ln.field_a.field_d] = 0;
                                                        break L21;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L22: {
                                                var24 = var4[ln.field_a.field_d + var23];
                                                if ((var4[ln.field_a.field_d + (var23 + 1)] ^ -1) != -2) {
                                                  break L22;
                                                } else {
                                                  if (2 == var24) {
                                                    break L22;
                                                  } else {
                                                    if (var24 == 3) {
                                                      break L22;
                                                    } else {
                                                      if (var24 != 4) {
                                                        var4[1 + ln.field_a.field_d + var23] = 0;
                                                        break L22;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              break L18;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var21++;
                                    continue L17;
                                  }
                                }
                              }
                            }
                            try {
                              L23: {
                                L24: while (true) {
                                  L25: {
                                    L26: {
                                      kl.field_c[var19] = var20;
                                      cm.field_c[var20] = var19 + 1;
                                      var21 = var20 + 1;
                                      var22 = -1 + var20;
                                      var23 = -var1_int + var20;
                                      var24 = var20 - -var1_int;
                                      var25 = cm.field_c[var20] + -1;
                                      if (var19 <= 0) {
                                        break L26;
                                      } else {
                                        stackIn_148_0 = var4[var21] ^ -1;
                                        stackIn_148_1 = -1;
                                        L27: {
                                          if (stackIn_148_0 == stackIn_148_1) {
                                            break L27;
                                          } else {
                                            if ((var4[var21] ^ -1) != -6) {
                                              break L26;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                        if (cm.field_c[var21] < var25) {
                                          var19--;
                                          var20 = var21;
                                          break L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    L28: {
                                      if (var19 <= 0) {
                                        break L28;
                                      } else {
                                        L29: {
                                          if (-1 == (var4[var23] ^ -1)) {
                                            break L29;
                                          } else {
                                            if (-6 != (var4[var23] ^ -1)) {
                                              break L28;
                                            } else {
                                              break L29;
                                            }
                                          }
                                        }
                                        if (var25 <= cm.field_c[var23]) {
                                          break L28;
                                        } else {
                                          var20 = var23;
                                          var19--;
                                          break L25;
                                        }
                                      }
                                    }
                                    stackIn_172_0 = var19 ^ -1;
                                    stackIn_172_1 = -1;
                                    L30: {
                                      if (stackIn_172_0 >= stackIn_172_1) {
                                        break L30;
                                      } else {
                                        L31: {
                                          if (var4[var24] == 0) {
                                            break L31;
                                          } else {
                                            if (var4[var24] != 5) {
                                              break L30;
                                            } else {
                                              break L31;
                                            }
                                          }
                                        }
                                        if ((cm.field_c[var24] ^ -1) > (var25 ^ -1)) {
                                          var19--;
                                          var20 = var24;
                                          break L25;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    }
                                    L32: {
                                      if (var19 <= 0) {
                                        break L32;
                                      } else {
                                        L33: {
                                          if ((var4[var22] ^ -1) == -1) {
                                            break L33;
                                          } else {
                                            if (-6 != (var4[var22] ^ -1)) {
                                              break L32;
                                            } else {
                                              break L33;
                                            }
                                          }
                                        }
                                        if (var25 > cm.field_c[var22]) {
                                          var20 = var22;
                                          var19--;
                                          break L25;
                                        } else {
                                          break L32;
                                        }
                                      }
                                    }
                                    var19++;
                                    if (-51 >= (var19 ^ -1)) {
                                      break L23;
                                    } else {
                                      var20 = kl.field_c[var19];
                                      break L25;
                                    }
                                  }
                                  continue L24;
                                }
                              }
                            } catch (java.lang.ArrayIndexOutOfBoundsException decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L34: {
                                L35: {
                                  var21_ref_ArrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
                                  if (li.field_q < 2) {
                                    break L35;
                                  } else {
                                    System.out.println("DEBUG AND ADMIN MESSAGE:");
                                    System.out.println("ArrayIndexOutOfBoundsException while routefinding");
                                    var21_ref_ArrayIndexOutOfBoundsException.printStackTrace();
                                    break L35;
                                  }
                                }
                                break L34;
                              }
                            }
                            L36: {
                              L37: {
                                var15 = 0;
                                if (n.field_o) {
                                  var21 = 0;
                                  L38: while (true) {
                                    if ((var21 ^ -1) <= (rc.field_e ^ -1)) {
                                      break L37;
                                    } else {
                                      var22_ref_oj = re.field_n[var21];
                                      stackOut_211_0 = od.a(var22_ref_oj.field_i, 1);
                                      stackIn_227_0 = stackOut_211_0 ? 1 : 0;
                                      stackIn_212_0 = stackOut_211_0;
                                      L39: {
                                        if (stackIn_212_0) {
                                          if (-1 != (var22_ref_oj.field_e ^ -1)) {
                                            break L39;
                                          } else {
                                            if (0 >= var22_ref_oj.field_I) {
                                              break L39;
                                            } else {
                                              L40: {
                                                var23 = var22_ref_oj.field_j.b(-4);
                                                if (rh.a(var22_ref_oj.field_i, true)) {
                                                  stackIn_224_0 = -ln.field_a.field_d;
                                                  break L40;
                                                } else {
                                                  stackIn_224_0 = 1;
                                                  break L40;
                                                }
                                              }
                                              var24 = stackIn_224_0;
                                              ln.field_a.field_c[var23] = 2;
                                              ln.field_a.field_c[var24 + var23] = 2;
                                              break L39;
                                            }
                                          }
                                        } else {
                                          break L39;
                                        }
                                      }
                                      var21++;
                                      continue L38;
                                    }
                                  }
                                } else {
                                  break L37;
                                }
                              }
                              stackIn_227_0 = 0;
                              break L36;
                            }
                            L41: {
                              if (stackIn_227_0 != (cj.field_I & 4)) {
                                var16 = var1_int;
                                var21 = 1;
                                L42: while (true) {
                                  if ((var21 ^ -1) <= (-1 + var2 ^ -1)) {
                                    var16 = var1_int;
                                    var21 = 1;
                                    L43: while (true) {
                                      if ((var21 ^ -1) <= (var2 - 1 ^ -1)) {
                                        break L41;
                                      } else {
                                        var22 = 1;
                                        L44: while (true) {
                                          L45: {
                                            if ((var1_int + -1 ^ -1) >= (var22 ^ -1)) {
                                              stackIn_322_0 = var16 + var1_int;
                                              break L45;
                                            } else {
                                              var15 = var16 + var22;
                                              stackOut_286_0 = var5[var15];
                                              stackIn_322_0 = stackOut_286_0 ? 1 : 0;
                                              stackIn_287_0 = stackOut_286_0;
                                              L46: {
                                                if (stackIn_287_0) {
                                                  break L46;
                                                } else {
                                                  if (2 == var4[var15]) {
                                                    L47: {
                                                      L48: {
                                                        if (!var5[var15 - -1]) {
                                                          break L48;
                                                        } else {
                                                          if (-3 != (var4[var15 - -1] ^ -1)) {
                                                            break L47;
                                                          } else {
                                                            break L48;
                                                          }
                                                        }
                                                      }
                                                      L49: {
                                                        if (!var5[-1 + var15]) {
                                                          break L49;
                                                        } else {
                                                          if (-3 != (var4[var15 + -1] ^ -1)) {
                                                            break L47;
                                                          } else {
                                                            break L49;
                                                          }
                                                        }
                                                      }
                                                      L50: {
                                                        if (!var5[var1_int + var15]) {
                                                          break L50;
                                                        } else {
                                                          if ((var4[var15 - -var1_int] ^ -1) != -3) {
                                                            break L47;
                                                          } else {
                                                            break L50;
                                                          }
                                                        }
                                                      }
                                                      if (!var5[-var1_int + var15]) {
                                                        break L46;
                                                      } else {
                                                        if (-3 != (var4[var15 + -var1_int] ^ -1)) {
                                                          break L47;
                                                        } else {
                                                          break L46;
                                                        }
                                                      }
                                                    }
                                                    var5[var15] = true;
                                                    var7[var15] = 2;
                                                    break L46;
                                                  } else {
                                                    break L46;
                                                  }
                                                }
                                              }
                                              var22++;
                                              continue L44;
                                            }
                                          }
                                          var16 = stackIn_322_0;
                                          var21++;
                                          continue L43;
                                        }
                                      }
                                    }
                                  } else {
                                    var22 = 1;
                                    L51: while (true) {
                                      L52: {
                                        if (-1 + var1_int <= var22) {
                                          stackIn_281_0 = var16 + var1_int;
                                          break L52;
                                        } else {
                                          var15 = var22 + var16;
                                          stackOut_234_0 = var5[var15];
                                          stackIn_281_0 = stackOut_234_0 ? 1 : 0;
                                          stackIn_235_0 = stackOut_234_0;
                                          L53: {
                                            if (stackIn_235_0) {
                                              break L53;
                                            } else {
                                              if (var4[var15] == 1) {
                                                L54: {
                                                  L55: {
                                                    if (!var5[1 + var15]) {
                                                      break L55;
                                                    } else {
                                                      if (-3 == (var4[1 + var15] ^ -1)) {
                                                        break L55;
                                                      } else {
                                                        if (-2 != (var4[var15 + 1] ^ -1)) {
                                                          break L54;
                                                        } else {
                                                          break L55;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L56: {
                                                    if (!var5[var15 + -1]) {
                                                      break L56;
                                                    } else {
                                                      if (var4[var15 + -1] == 2) {
                                                        break L56;
                                                      } else {
                                                        if (-2 != (var4[var15 - 1] ^ -1)) {
                                                          break L54;
                                                        } else {
                                                          break L56;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L57: {
                                                    if (!var5[var15 + var1_int]) {
                                                      break L57;
                                                    } else {
                                                      if (var4[var1_int + var15] == 2) {
                                                        break L57;
                                                      } else {
                                                        if (-2 != (var4[var1_int + var15] ^ -1)) {
                                                          break L54;
                                                        } else {
                                                          break L57;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (!var5[var15 + -var1_int]) {
                                                    break L53;
                                                  } else {
                                                    if (-3 == (var4[var15 - var1_int] ^ -1)) {
                                                      break L53;
                                                    } else {
                                                      if (var4[-var1_int + var15] == 1) {
                                                        break L53;
                                                      } else {
                                                        break L54;
                                                      }
                                                    }
                                                  }
                                                }
                                                var5[var15] = true;
                                                var7[var15] = 2;
                                                break L53;
                                              } else {
                                                break L53;
                                              }
                                            }
                                          }
                                          var22++;
                                          continue L51;
                                        }
                                      }
                                      var16 = stackIn_281_0;
                                      var21++;
                                      continue L42;
                                    }
                                  }
                                }
                              } else {
                                break L41;
                              }
                            }
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            ui.a(var23, var17, var18, var19, (byte) -69);
                            ui.a(var23, var17, var18, var20, (byte) -69);
                            var23++;
                            continue L10;
                          }
                        }
                      } else {
                        ui.a(var21, var17, var18, var23, (byte) -69);
                        ui.a(var22, var17, var18, var23, (byte) -69);
                        var23++;
                        continue L9;
                      }
                    }
                  } else {
                    var15 = var16 * var1_int + var13;
                    var17 = var13;
                    L58: while (true) {
                      if (var14 <= var17) {
                        var16++;
                        continue L8;
                      } else {
                        var5[var15] = false;
                        var6[var15] = false;
                        var15++;
                        var17++;
                        continue L58;
                      }
                    }
                  }
                }
              } else {
                L59: {
                  var9_ref_oj = re.field_n[var8_int];
                  var10 = var9_ref_oj.field_j.b(param0 + -6);
                  if (var10 < 0) {
                    break L59;
                  } else {
                    if ((var3 ^ -1) >= (var10 ^ -1)) {
                      break L59;
                    } else {
                      if (var4[var10] != 3) {
                        break L59;
                      } else {
                        var4[var10] = 0;
                        break L59;
                      }
                    }
                  }
                }
                var8_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "pc.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, pf param3, byte param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var19 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param4 > 79) {
              L1: {
                var5_int = vf.b(123, (param0 + -param1) * 3);
                var6 = 3 * param1;
                lk.l(74);
                var7 = var5_int + -10;
                if (param3.field_f <= 0) {
                  break L1;
                } else {
                  if (null != param3.field_x) {
                    fk.a((byte) -74);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              th.field_Lb = 0;
              var8 = 0;
              L2: while (true) {
                L3: {
                  if ((var8 ^ -1) <= (param3.field_k ^ -1)) {
                    stackIn_48_0 = 0;
                    break L3;
                  } else {
                    var9 = param3.field_i[var8];
                    var10 = param3.field_P[var8];
                    var11 = param3.field_z[var8];
                    stackOut_12_0 = param2;
                    stackIn_48_0 = stackOut_12_0 ? 1 : 0;
                    stackIn_13_0 = stackOut_12_0;
                    L4: {
                      L5: {
                        if (!stackIn_13_0) {
                          break L5;
                        } else {
                          var12 = tb.field_K[var9];
                          var13 = lc.field_c[var9];
                          var14 = tb.field_K[var10] - var12;
                          var15 = -var12 + tb.field_K[var11];
                          var16 = lc.field_c[var10] - var13;
                          var17 = -var13 + lc.field_c[var11];
                          if (-1 >= (var17 * var14 + -(var16 * var15) ^ -1)) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var12 = rb.field_p[var9];
                      if (-2147483648 == var12) {
                        break L4;
                      } else {
                        var13 = rb.field_p[var10];
                        if (-2147483648 == var13) {
                          break L4;
                        } else {
                          var14 = rb.field_p[var11];
                          if ((var14 ^ -1) != 2147483647) {
                            L6: {
                              var15 = var14 + (var12 - (-var13 + var6));
                              stackIn_26_0 = -1 + mn.field_a.length;

                              if ((var7 ^ -1) <= -1) {
                                stackIn_27_0 = stackIn_26_0;
                                stackIn_27_1 = var15 >> var7;
                                break L6;
                              } else {
                                stackIn_27_0 = stackIn_26_0;
                                stackIn_27_1 = var15 << -var7;
                                break L6;
                              }
                            }
                            var16 = stackIn_27_0 + -stackIn_27_1;
                            var17 = mn.field_a[var16];
                            L7: while (true) {
                              L8: {
                                if (0 == var17 >> -1647043868) {
                                  stackIn_38_0 = (var16 << 1390621636) + var17;
                                  break L8;
                                } else {
                                  var16--;
                                  stackIn_38_0 = var16;

                                  if (stackIn_38_0 >= 0) {
                                    var17 = mn.field_a[var16];
                                    continue L7;
                                  } else {
                                    System.err.println("Out of range!");
                                    break L4;
                                  }
                                }
                              }
                              L9: {
                                var18 = stackIn_38_0;
                                lh.field_d[var18] = var8;
                                mn.field_a[var16] = 1 + var17;
                                if (-1 <= (param3.field_f ^ -1)) {
                                  break L9;
                                } else {
                                  if (null != param3.field_x) {
                                    dupTemp$0 = param3.field_x[var8];
                                    ke.field_z[dupTemp$0] = ke.field_z[dupTemp$0] + 1;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              th.field_Lb = th.field_Lb + 1;
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var8++;
                    continue L2;
                  }
                }
                L10: {
                  if (stackIn_48_0 >= param3.field_f) {
                    break L10;
                  } else {
                    if (null == param3.field_x) {
                      break L10;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L11: while (true) {
                        if ((var9 ^ -1) <= (ke.field_z.length ^ -1)) {
                          break L10;
                        } else {
                          var10 = ke.field_z[var9];
                          ke.field_z[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          continue L11;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_61_0 = (RuntimeException) (var5);

            stackIn_61_1 = new StringBuilder().append("pc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "null";
              break L12;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "{...}";
              break L12;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_62_0), stackIn_62_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        try {
            ac.a(param1, param0, -1, (String) null);
            if (param2) {
                pc.a(118, 37, true, (pf) null, (byte) -126);
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "pc.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 14088) {
                break L1;
              } else {
                pc.a(true, true, true);
                break L1;
              }
            }
            stackIn_4_0 = se.field_c.equals(mf.a(false, (CharSequence) ((Object) param1)));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("pc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(String param0, String param1, boolean param2, long param3, java.applet.Applet param4) {
        try {
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            StringBuilder stackIn_21_1 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            Throwable decompiledCaughtException = null;
            String var6 = null;
            Throwable var6_ref = null;
            RuntimeException var6_ref2 = null;
            String var7 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param2) {
                        break L2;
                      } else {
                        field_a = false;
                        break L2;
                      }
                    }
                    L3: {
                      var6 = param4.getParameter("cookiehost");
                      var7 = param1 + "=" + param0 + "; version=1; path=/; domain=" + var6;
                      if (param3 >= 0L) {
                        var7 = var7 + "; Expires=" + dk.a((byte) -41, 1000L * param3 + hn.a((byte) 80)) + "; Max-Age=" + param3;
                        break L3;
                      } else {
                        var7 = var7 + "; Discard;";
                        break L3;
                      }
                    }
                    a.a(param4, 17467, "document.cookie=\"" + var7 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var6_ref = decompiledCaughtException;
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var6_ref2);

                stackIn_13_1 = new StringBuilder().append("pc.E(");

                if (param0 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L5;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

                if (param1 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L6;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "null";
                  break L7;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "{...}";
                  break L7;
                }
              }
              throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_22_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        try {
            field_b = null;
            if (param0 != 1) {
                field_c = -57;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "pc.D(" + param0 + ')');
        }
    }

    static {
        field_a = true;
        field_b = "@";
    }
}
