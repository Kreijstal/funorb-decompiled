/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq {
    static int field_d;
    static hd field_c;
    static dn field_a;
    static String field_g;
    static String field_f;
    static String field_e;
    static ru field_b;

    final static void a(int param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        boolean stackIn_20_0 = false;
        int stackIn_26_0 = 0;
        boolean stackIn_32_0 = false;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        String[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        String[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        String[] stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        String[] stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        String stackIn_58_2 = null;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        String[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        String[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        String[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String stackIn_66_2 = null;
        String[] stackIn_130_0 = null;
        String stackIn_131_0 = null;
        String stackIn_132_0 = null;
        String stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        String[] stackIn_139_0 = null;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        int stackIn_156_0 = 0;
        int stackIn_156_1 = 0;
        int stackIn_157_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_161_0 = 0;
        int stackIn_161_1 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        String[] stackIn_167_0 = null;
        int stackIn_167_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_170_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_19_0 = false;
        int stackOut_25_0 = 0;
        boolean stackOut_31_0 = false;
        int stackOut_37_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        String[] stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        String[] stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        String[] stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        String stackOut_57_2 = null;
        String[] stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        String stackOut_56_2 = null;
        String[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        String[] stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_163_0 = 0;
        int stackOut_163_1 = 0;
        String[] stackOut_166_0 = null;
        int stackOut_166_1 = 0;
        String[] stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String stackOut_65_2 = null;
        String[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        String stackOut_64_2 = null;
        String[] stackOut_129_0 = null;
        String stackOut_130_0 = null;
        String stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        String stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        String[] stackOut_138_0 = null;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        int stackOut_148_0 = 0;
        int stackOut_148_1 = 0;
        int stackOut_146_0 = 0;
        int stackOut_146_1 = 0;
        int stackOut_152_0 = 0;
        int stackOut_152_1 = 0;
        int stackOut_155_0 = 0;
        int stackOut_155_1 = 0;
        int stackOut_156_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_158_1 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_160_0 = 0;
        int stackOut_160_1 = 0;
        int stackOut_169_0 = 0;
        int stackOut_169_1 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    no.field_J = param0;
                    ip.field_e = true;
                    if ((no.field_J ^ -1) == -1) {
                      break L4;
                    } else {
                      L5: {
                        if (1 != no.field_J) {
                          break L5;
                        } else {
                          var3_int = iu.a(pf.field_d, hw.field_z, 7502, sc.field_b, du.field_b);
                          var4 = var3_int + 2;
                          ca.field_h = new int[var4];
                          wp.field_v = new String[var4];
                          var5 = 0;
                          L6: while (true) {
                            L7: {
                              L8: {
                                if ((var4 ^ -1) >= (var5 ^ -1)) {
                                  break L8;
                                } else {
                                  ca.field_h[var5] = -1;
                                  var5++;
                                  if (var9 != 0) {
                                    break L7;
                                  } else {
                                    if (var9 == 0) {
                                      continue L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              mi.field_G = new int[1];
                              break L7;
                            }
                            var5 = 0;
                            L9: while (true) {
                              L10: {
                                L11: {
                                  if ((var3_int ^ -1) >= (var5 ^ -1)) {
                                    break L11;
                                  } else {
                                    wp.field_v[var5] = du.field_b[var5];
                                    var5++;
                                    if (var9 != 0) {
                                      break L10;
                                    } else {
                                      if (var9 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                wp.field_v[var4 - 2] = "";
                                wp.field_v[-1 + var4] = pd.field_f;
                                ca.field_h[-1 + var4] = 0;
                                mi.field_G[0] = 5;
                                break L10;
                              }
                              if (var9 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      L12: {
                        if (-3 != (no.field_J ^ -1)) {
                          break L12;
                        } else {
                          var3_int = iu.a(pf.field_d, fo.a(4800, db.field_f, new String[]{"<br><%0><br>"}), 7502, sc.field_b, du.field_b);
                          var4 = -1;
                          var5 = 0;
                          L13: while (true) {
                            L14: {
                              L15: {
                                if ((var3_int ^ -1) >= (var5 ^ -1)) {
                                  break L15;
                                } else {
                                  stackOut_19_0 = "<%0>".equals(du.field_b[var5]);
                                  stackIn_26_0 = stackOut_19_0 ? 1 : 0;
                                  stackIn_20_0 = stackOut_19_0;
                                  if (var9 != 0) {
                                    break L14;
                                  } else {
                                    L16: {
                                      if (stackIn_20_0) {
                                        var4 = var5;
                                        if (var9 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      } else {
                                        break L16;
                                      }
                                    }
                                    var5++;
                                    if (var9 == 0) {
                                      continue L13;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                              stackOut_25_0 = var4;
                              stackIn_26_0 = stackOut_25_0;
                              break L14;
                            }
                            if (stackIn_26_0 == -1) {
                              throw new IllegalStateException();
                            } else {
                              mo.field_i = new String[var4];
                              vm.a(du.field_b, 0, mo.field_i, 0, var4);
                              hg.field_d = new String[var3_int + (-var4 - 1)];
                              vm.a(du.field_b, 1 + var4, hg.field_d, 0, -1 + var3_int + -var4);
                              var4 = -1;
                              var3_int = iu.a(pf.field_d, fo.a(4800, be.field_v, new String[]{"<br><%0><br>"}), 7502, sc.field_b, du.field_b);
                              var5 = 0;
                              L17: while (true) {
                                L18: {
                                  L19: {
                                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                                      break L19;
                                    } else {
                                      stackOut_31_0 = "<%0>".equals(du.field_b[var5]);
                                      stackIn_38_0 = stackOut_31_0 ? 1 : 0;
                                      stackIn_32_0 = stackOut_31_0;
                                      if (var9 != 0) {
                                        break L18;
                                      } else {
                                        L20: {
                                          if (stackIn_32_0) {
                                            var4 = var5;
                                            if (var9 == 0) {
                                              break L19;
                                            } else {
                                              break L20;
                                            }
                                          } else {
                                            break L20;
                                          }
                                        }
                                        var5++;
                                        if (var9 == 0) {
                                          continue L17;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_37_0 = var4;
                                  stackIn_38_0 = stackOut_37_0;
                                  break L18;
                                }
                                if (stackIn_38_0 != -1) {
                                  L21: {
                                    va.field_A = new String[var4];
                                    vm.a(du.field_b, 0, va.field_A, 0, var4);
                                    tc.field_f = new String[var3_int - var4 + -1];
                                    vm.a(du.field_b, var4 - -1, tc.field_f, 0, -1 + (-var4 + var3_int));
                                    if (va.field_A.length <= mo.field_i.length) {
                                      stackOut_42_0 = mo.field_i.length;
                                      stackIn_43_0 = stackOut_42_0;
                                      break L21;
                                    } else {
                                      stackOut_41_0 = va.field_A.length;
                                      stackIn_43_0 = stackOut_41_0;
                                      break L21;
                                    }
                                  }
                                  L22: {
                                    var5 = stackIn_43_0;
                                    if (tc.field_f.length > hg.field_d.length) {
                                      stackOut_45_0 = tc.field_f.length;
                                      stackIn_46_0 = stackOut_45_0;
                                      break L22;
                                    } else {
                                      stackOut_44_0 = hg.field_d.length;
                                      stackIn_46_0 = stackOut_44_0;
                                      break L22;
                                    }
                                  }
                                  var6 = stackIn_46_0;
                                  var7 = var6 + var5 + 7;
                                  ca.field_h = new int[var7];
                                  wp.field_v = new String[var7];
                                  var8 = 0;
                                  L23: while (true) {
                                    L24: {
                                      L25: {
                                        if (var8 >= var7) {
                                          break L25;
                                        } else {
                                          ca.field_h[var8] = -1;
                                          var8++;
                                          if (var9 != 0) {
                                            break L24;
                                          } else {
                                            if (var9 == 0) {
                                              continue L23;
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                      }
                                      ca.field_h[1] = 0;
                                      mi.field_G = new int[2];
                                      wp.field_v[0] = c.field_d;
                                      wp.field_v[1] = ui.field_e;
                                      mi.field_G[1] = 2;
                                      wp.field_v[5] = "";
                                      mi.field_G[0] = 5;
                                      wp.field_v[4] = ts.field_f;
                                      wp.field_v[2] = od.field_e;
                                      wp.field_v[3] = ge.field_m;
                                      ca.field_h[3] = 1;
                                      break L24;
                                    }
                                    var8 = 0;
                                    L26: while (true) {
                                      L27: {
                                        L28: {
                                          if ((var5 ^ -1) >= (var8 ^ -1)) {
                                            break L28;
                                          } else {
                                            stackOut_54_0 = wp.field_v;
                                            stackOut_54_1 = 6 + var8;
                                            stackOut_54_2 = -var5 + (va.field_A.length + var8);
                                            stackIn_60_0 = stackOut_54_0;
                                            stackIn_60_1 = stackOut_54_1;
                                            stackIn_60_2 = stackOut_54_2;
                                            stackIn_55_0 = stackOut_54_0;
                                            stackIn_55_1 = stackOut_54_1;
                                            stackIn_55_2 = stackOut_54_2;
                                            if (var9 != 0) {
                                              break L27;
                                            } else {
                                              L29: {
                                                stackOut_55_0 = (String[]) ((Object) stackIn_55_0);
                                                stackOut_55_1 = stackIn_55_1;
                                                stackIn_57_0 = stackOut_55_0;
                                                stackIn_57_1 = stackOut_55_1;
                                                stackIn_56_0 = stackOut_55_0;
                                                stackIn_56_1 = stackOut_55_1;
                                                if (stackIn_55_2 < 0) {
                                                  stackOut_57_0 = (String[]) ((Object) stackIn_57_0);
                                                  stackOut_57_1 = stackIn_57_1;
                                                  stackOut_57_2 = "";
                                                  stackIn_58_0 = stackOut_57_0;
                                                  stackIn_58_1 = stackOut_57_1;
                                                  stackIn_58_2 = stackOut_57_2;
                                                  break L29;
                                                } else {
                                                  stackOut_56_0 = (String[]) ((Object) stackIn_56_0);
                                                  stackOut_56_1 = stackIn_56_1;
                                                  stackOut_56_2 = va.field_A[-var5 + (va.field_A.length + var8)];
                                                  stackIn_58_0 = stackOut_56_0;
                                                  stackIn_58_1 = stackOut_56_1;
                                                  stackIn_58_2 = stackOut_56_2;
                                                  break L29;
                                                }
                                              }
                                              stackIn_58_0[stackIn_58_1] = stackIn_58_2;
                                              var8++;
                                              if (var9 == 0) {
                                                continue L26;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                        }
                                        stackOut_59_0 = wp.field_v;
                                        stackOut_59_1 = var5;
                                        stackOut_59_2 = 6;
                                        stackIn_60_0 = stackOut_59_0;
                                        stackIn_60_1 = stackOut_59_1;
                                        stackIn_60_2 = stackOut_59_2;
                                        break L27;
                                      }
                                      stackIn_60_0[stackIn_60_1 + stackIn_60_2] = null;
                                      ca.field_h[6 - -var5] = -2;
                                      var8 = 0;
                                      L30: while (true) {
                                        L31: {
                                          if ((var8 ^ -1) <= (var6 ^ -1)) {
                                            break L31;
                                          } else {
                                            stackOut_62_0 = wp.field_v;
                                            stackOut_62_1 = var5 + 7 - -var8;
                                            stackIn_167_0 = stackOut_62_0;
                                            stackIn_167_1 = stackOut_62_1;
                                            stackIn_63_0 = stackOut_62_0;
                                            stackIn_63_1 = stackOut_62_1;
                                            if (var9 != 0) {
                                              L32: while (true) {
                                                var7 = lg.a(stackIn_167_0[stackIn_167_1], true, (byte) -89);
                                                var8 = -(var7 >> 2029515649) + rk.field_B;
                                                var5 = var5 + cp.field_a;
                                                lg.field_b[var4] = new int[4];
                                                lg.field_b[var4][0] = var8 - et.field_b;
                                                lg.field_b[var4][1] = var5;
                                                lg.field_b[var4][2] = var7 + (et.field_b << 253363105);
                                                var5 = var5 + (q.field_B + (cp.field_a + (el.field_c << -1269442399)));
                                                lg.field_b[var4][3] = q.field_B + (el.field_c << 1958105697);
                                                L33: while (true) {
                                                  var4++;
                                                  if (var9 == 0) {
                                                    if (wp.field_v.length <= var4) {
                                                      break L2;
                                                    } else {
                                                      var6 = ca.field_h[var4];
                                                      stackOut_163_0 = var6 ^ -1;
                                                      stackOut_163_1 = -1;
                                                      stackIn_170_0 = stackOut_163_0;
                                                      stackIn_170_1 = stackOut_163_1;
                                                      stackIn_164_0 = stackOut_163_0;
                                                      stackIn_164_1 = stackOut_163_1;
                                                      if (var9 != 0) {
                                                        break L1;
                                                      } else {
                                                        L34: {
                                                          if (stackIn_164_0 <= stackIn_164_1) {
                                                            break L34;
                                                          } else {
                                                            var5 = var5 + fh.field_e;
                                                            if (var9 == 0) {
                                                              continue L33;
                                                            } else {
                                                              break L34;
                                                            }
                                                          }
                                                        }
                                                        stackOut_166_0 = wp.field_v;
                                                        stackOut_166_1 = var4;
                                                        stackIn_167_0 = stackOut_166_0;
                                                        stackIn_167_1 = stackOut_166_1;
                                                        continue L32;
                                                      }
                                                    }
                                                  } else {
                                                    break L2;
                                                  }
                                                }
                                              }
                                            } else {
                                              L35: {
                                                stackOut_63_0 = (String[]) ((Object) stackIn_63_0);
                                                stackOut_63_1 = stackIn_63_1;
                                                stackIn_65_0 = stackOut_63_0;
                                                stackIn_65_1 = stackOut_63_1;
                                                stackIn_64_0 = stackOut_63_0;
                                                stackIn_64_1 = stackOut_63_1;
                                                if (tc.field_f.length <= var8) {
                                                  stackOut_65_0 = (String[]) ((Object) stackIn_65_0);
                                                  stackOut_65_1 = stackIn_65_1;
                                                  stackOut_65_2 = "";
                                                  stackIn_66_0 = stackOut_65_0;
                                                  stackIn_66_1 = stackOut_65_1;
                                                  stackIn_66_2 = stackOut_65_2;
                                                  break L35;
                                                } else {
                                                  stackOut_64_0 = (String[]) ((Object) stackIn_64_0);
                                                  stackOut_64_1 = stackIn_64_1;
                                                  stackOut_64_2 = tc.field_f[var8];
                                                  stackIn_66_0 = stackOut_64_0;
                                                  stackIn_66_1 = stackOut_64_1;
                                                  stackIn_66_2 = stackOut_64_2;
                                                  break L35;
                                                }
                                              }
                                              stackIn_66_0[stackIn_66_1] = stackIn_66_2;
                                              var8++;
                                              if (var9 == 0) {
                                                continue L30;
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                        }
                                        if (var9 == 0) {
                                          break L3;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  throw new IllegalStateException();
                                }
                              }
                            }
                          }
                        }
                      }
                      L36: {
                        if (-4 == (no.field_J ^ -1)) {
                          break L36;
                        } else {
                          L37: {
                            if (no.field_J != 4) {
                              break L37;
                            } else {
                              var3_int = iu.a(pf.field_d, am.field_y, 7502, sc.field_b, du.field_b);
                              var4 = 2 - -var3_int;
                              wp.field_v = new String[var4];
                              ca.field_h = new int[var4];
                              var5 = 0;
                              L38: while (true) {
                                L39: {
                                  L40: {
                                    if (var4 <= var5) {
                                      break L40;
                                    } else {
                                      ca.field_h[var5] = -1;
                                      var5++;
                                      if (var9 != 0) {
                                        break L39;
                                      } else {
                                        if (var9 == 0) {
                                          continue L38;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                  }
                                  mi.field_G = new int[1];
                                  break L39;
                                }
                                var5 = 0;
                                L41: while (true) {
                                  L42: {
                                    L43: {
                                      if (var3_int <= var5) {
                                        break L43;
                                      } else {
                                        wp.field_v[var5] = du.field_b[var5];
                                        var5++;
                                        if (var9 != 0) {
                                          break L42;
                                        } else {
                                          if (var9 == 0) {
                                            continue L41;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                    }
                                    wp.field_v[-2 + var4] = "";
                                    wp.field_v[-1 + var4] = pd.field_f;
                                    ca.field_h[-1 + var4] = 0;
                                    mi.field_G[0] = 5;
                                    break L42;
                                  }
                                  if (var9 == 0) {
                                    break L3;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                            }
                          }
                          if (no.field_J == 5) {
                            var3_int = iu.a(pf.field_d, hb.field_a, 7502, sc.field_b, du.field_b);
                            var4 = 3 - -var3_int;
                            wp.field_v = new String[var4];
                            ca.field_h = new int[var4];
                            var5 = 0;
                            L44: while (true) {
                              L45: {
                                L46: {
                                  if ((var5 ^ -1) <= (var4 ^ -1)) {
                                    break L46;
                                  } else {
                                    ca.field_h[var5] = -1;
                                    var5++;
                                    if (var9 != 0) {
                                      break L45;
                                    } else {
                                      if (var9 == 0) {
                                        continue L44;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                                mi.field_G = new int[2];
                                break L45;
                              }
                              var5 = 0;
                              L47: while (true) {
                                L48: {
                                  L49: {
                                    if (var3_int <= var5) {
                                      break L49;
                                    } else {
                                      wp.field_v[var5] = du.field_b[var5];
                                      var5++;
                                      if (var9 != 0) {
                                        break L48;
                                      } else {
                                        if (var9 == 0) {
                                          continue L47;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                  }
                                  wp.field_v[var4 - 3] = "";
                                  wp.field_v[var4 + -2] = oo.field_j;
                                  ca.field_h[-2 + var4] = 0;
                                  mi.field_G[0] = 3;
                                  wp.field_v[-1 + var4] = pd.field_f;
                                  ca.field_h[var4 + -1] = 1;
                                  mi.field_G[1] = 5;
                                  break L48;
                                }
                                if (var9 == 0) {
                                  break L3;
                                } else {
                                  break L36;
                                }
                              }
                            }
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      L50: {
                        L51: {
                          if (!ft.field_m.field_e) {
                            break L51;
                          } else {
                            var3_int = iu.a(pf.field_d, ud.field_ab, 7502, sc.field_b, du.field_b);
                            if (var9 == 0) {
                              break L50;
                            } else {
                              break L51;
                            }
                          }
                        }
                        var3_int = iu.a(pf.field_d, tl.field_a, 7502, sc.field_b, du.field_b);
                        break L50;
                      }
                      var4 = var3_int + 2;
                      ca.field_h = new int[var4];
                      wp.field_v = new String[var4];
                      var5 = 0;
                      L52: while (true) {
                        L53: {
                          L54: {
                            if ((var5 ^ -1) <= (var4 ^ -1)) {
                              break L54;
                            } else {
                              ca.field_h[var5] = -1;
                              var5++;
                              if (var9 != 0) {
                                break L53;
                              } else {
                                if (var9 == 0) {
                                  continue L52;
                                } else {
                                  break L54;
                                }
                              }
                            }
                          }
                          mi.field_G = new int[1];
                          break L53;
                        }
                        var5 = 0;
                        L55: while (true) {
                          L56: {
                            L57: {
                              if ((var3_int ^ -1) >= (var5 ^ -1)) {
                                break L57;
                              } else {
                                wp.field_v[var5] = du.field_b[var5];
                                var5++;
                                if (var9 != 0) {
                                  break L56;
                                } else {
                                  if (var9 == 0) {
                                    continue L55;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                            }
                            wp.field_v[-2 + var4] = "";
                            wp.field_v[var4 - 1] = pd.field_f;
                            ca.field_h[-1 + var4] = 0;
                            mi.field_G[0] = 5;
                            break L56;
                          }
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var3_int = iu.a(pf.field_d, hw.field_z, 7502, sc.field_b, du.field_b);
                  var4 = 3 + var3_int;
                  ca.field_h = new int[var4];
                  wp.field_v = new String[var4];
                  var5 = 0;
                  L58: while (true) {
                    L59: {
                      L60: {
                        if (var4 <= var5) {
                          break L60;
                        } else {
                          ca.field_h[var5] = -1;
                          var5++;
                          if (var9 != 0) {
                            break L59;
                          } else {
                            if (var9 == 0) {
                              continue L58;
                            } else {
                              break L60;
                            }
                          }
                        }
                      }
                      mi.field_G = new int[2];
                      break L59;
                    }
                    var5 = 0;
                    L61: while (true) {
                      L62: {
                        L63: {
                          if (var3_int <= var5) {
                            break L63;
                          } else {
                            wp.field_v[var5] = du.field_b[var5];
                            var5++;
                            if (var9 != 0) {
                              break L62;
                            } else {
                              if (var9 == 0) {
                                continue L61;
                              } else {
                                break L63;
                              }
                            }
                          }
                        }
                        wp.field_v[-3 + var4] = "";
                        wp.field_v[-2 + var4] = tg.field_j;
                        ca.field_h[var4 - 2] = 0;
                        mi.field_G[0] = 4;
                        wp.field_v[-1 + var4] = pd.field_f;
                        ca.field_h[-1 + var4] = 1;
                        break L62;
                      }
                      mi.field_G[1] = 5;
                      break L3;
                    }
                  }
                }
                ug.field_c.field_k = mi.field_G.length;
                var3_int = 0;
                var4 = 0;
                L64: while (true) {
                  L65: {
                    L66: {
                      L67: {
                        L68: {
                          if ((var4 ^ -1) <= (wp.field_v.length ^ -1)) {
                            break L68;
                          } else {
                            stackOut_129_0 = wp.field_v;
                            stackIn_139_0 = stackOut_129_0;
                            stackIn_130_0 = stackOut_129_0;
                            if (var9 != 0) {
                              break L67;
                            } else {
                              L69: {
                                stackOut_130_0 = stackIn_130_0[var4];
                                stackIn_132_0 = stackOut_130_0;
                                stackIn_131_0 = stackOut_130_0;
                                if (-1 < (ca.field_h[var4] ^ -1)) {
                                  stackOut_132_0 = (String) ((Object) stackIn_132_0);
                                  stackOut_132_1 = 0;
                                  stackIn_133_0 = stackOut_132_0;
                                  stackIn_133_1 = stackOut_132_1;
                                  break L69;
                                } else {
                                  stackOut_131_0 = (String) ((Object) stackIn_131_0);
                                  stackOut_131_1 = 1;
                                  stackIn_133_0 = stackOut_131_0;
                                  stackIn_133_1 = stackOut_131_1;
                                  break L69;
                                }
                              }
                              L70: {
                                var5 = lg.a(stackIn_133_0, stackIn_133_1 != 0, (byte) -101);
                                if ((var3_int ^ -1) <= (var5 ^ -1)) {
                                  break L70;
                                } else {
                                  var3_int = var5;
                                  break L70;
                                }
                              }
                              var4++;
                              if (var9 == 0) {
                                continue L64;
                              } else {
                                break L68;
                              }
                            }
                          }
                        }
                        if (no.field_J == 2) {
                          stackOut_138_0 = mo.field_i;
                          stackIn_139_0 = stackOut_138_0;
                          break L67;
                        } else {
                          break L66;
                        }
                      }
                      var10 = stackIn_139_0;
                      var4_ref_String__ = var10;
                      var5 = 0;
                      L71: while (true) {
                        L72: {
                          if ((var5 ^ -1) <= (var10.length ^ -1)) {
                            break L72;
                          } else {
                            var11 = var10[var5];
                            var7 = lg.a(var11, false, (byte) -128);
                            stackOut_141_0 = var7 ^ -1;
                            stackOut_141_1 = var3_int ^ -1;
                            stackIn_147_0 = stackOut_141_0;
                            stackIn_147_1 = stackOut_141_1;
                            stackIn_142_0 = stackOut_141_0;
                            stackIn_142_1 = stackOut_141_1;
                            if (var9 != 0) {
                              L73: while (true) {
                                if (stackIn_147_0 <= stackIn_147_1) {
                                  break L66;
                                } else {
                                  var12 = var4_ref_String__[var5];
                                  var7 = lg.a(var12, false, (byte) -122);
                                  stackOut_148_0 = var3_int;
                                  stackOut_148_1 = var7;
                                  stackIn_153_0 = stackOut_148_0;
                                  stackIn_153_1 = stackOut_148_1;
                                  stackIn_149_0 = stackOut_148_0;
                                  stackIn_149_1 = stackOut_148_1;
                                  if (var9 != 0) {
                                    break L65;
                                  } else {
                                    L74: {
                                      if (stackIn_149_0 >= stackIn_149_1) {
                                        break L74;
                                      } else {
                                        var3_int = var7;
                                        break L74;
                                      }
                                    }
                                    var5++;
                                    if (var9 == 0) {
                                      stackOut_146_0 = var5 ^ -1;
                                      stackOut_146_1 = var4_ref_String__.length ^ -1;
                                      stackIn_147_0 = stackOut_146_0;
                                      stackIn_147_1 = stackOut_146_1;
                                      continue L73;
                                    } else {
                                      break L66;
                                    }
                                  }
                                }
                              }
                            } else {
                              L75: {
                                if (stackIn_142_0 >= stackIn_142_1) {
                                  break L75;
                                } else {
                                  var3_int = var7;
                                  break L75;
                                }
                              }
                              var5++;
                              if (var9 == 0) {
                                continue L71;
                              } else {
                                break L72;
                              }
                            }
                          }
                        }
                        var4_ref_String__ = hg.field_d;
                        var5 = 0;
                        L76: while (true) {
                          stackOut_146_0 = var5 ^ -1;
                          stackOut_146_1 = var4_ref_String__.length ^ -1;
                          stackIn_147_0 = stackOut_146_0;
                          stackIn_147_1 = stackOut_146_1;
                          if (stackIn_147_0 <= stackIn_147_1) {
                            break L66;
                          } else {
                            var12 = var4_ref_String__[var5];
                            var7 = lg.a(var12, false, (byte) -122);
                            stackOut_148_0 = var3_int;
                            stackOut_148_1 = var7;
                            stackIn_153_0 = stackOut_148_0;
                            stackIn_153_1 = stackOut_148_1;
                            stackIn_149_0 = stackOut_148_0;
                            stackIn_149_1 = stackOut_148_1;
                            if (var9 != 0) {
                              break L65;
                            } else {
                              L77: {
                                if (stackIn_149_0 >= stackIn_149_1) {
                                  break L77;
                                } else {
                                  var3_int = var7;
                                  break L77;
                                }
                              }
                              var5++;
                              if (var9 == 0) {
                                continue L76;
                              } else {
                                break L66;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_152_0 = el.field_c + cp.field_a << -1590907679;
                    stackOut_152_1 = ug.field_c.field_k;
                    stackIn_153_0 = stackOut_152_0;
                    stackIn_153_1 = stackOut_152_1;
                    break L65;
                  }
                  m.field_i = stackIn_153_0 * stackIn_153_1;
                  var4 = 0;
                  var5 = -42 % ((-39 - param2) / 37);
                  L78: while (true) {
                    L79: {
                      L80: {
                        if (wp.field_v.length <= var4) {
                          break L80;
                        } else {
                          stackOut_155_0 = m.field_i;
                          stackOut_155_1 = 0;
                          stackIn_161_0 = stackOut_155_0;
                          stackIn_161_1 = stackOut_155_1;
                          stackIn_156_0 = stackOut_155_0;
                          stackIn_156_1 = stackOut_155_1;
                          if (var9 != 0) {
                            break L79;
                          } else {
                            L81: {
                              stackOut_156_0 = stackIn_156_0;
                              stackIn_158_0 = stackOut_156_0;
                              stackIn_157_0 = stackOut_156_0;
                              if (stackIn_156_1 > ca.field_h[var4]) {
                                stackOut_158_0 = stackIn_158_0;
                                stackOut_158_1 = fh.field_e;
                                stackIn_159_0 = stackOut_158_0;
                                stackIn_159_1 = stackOut_158_1;
                                break L81;
                              } else {
                                stackOut_157_0 = stackIn_157_0;
                                stackOut_157_1 = q.field_B;
                                stackIn_159_0 = stackOut_157_0;
                                stackIn_159_1 = stackOut_157_1;
                                break L81;
                              }
                            }
                            m.field_i = stackIn_159_0 + stackIn_159_1;
                            var4++;
                            if (var9 == 0) {
                              continue L78;
                            } else {
                              break L80;
                            }
                          }
                        }
                      }
                      stackOut_160_0 = -(m.field_i >> -1934319263);
                      stackOut_160_1 = ar.field_C;
                      stackIn_161_0 = stackOut_160_0;
                      stackIn_161_1 = stackOut_160_1;
                      break L79;
                    }
                    od.field_b = stackIn_161_0 + stackIn_161_1;
                    lg.field_b = new int[wp.field_v.length][];
                    var4 = 0;
                    var5 = od.field_b;
                    L82: while (true) {
                      if (wp.field_v.length <= var4) {
                        break L2;
                      } else {
                        var6 = ca.field_h[var4];
                        stackOut_163_0 = var6 ^ -1;
                        stackOut_163_1 = -1;
                        stackIn_170_0 = stackOut_163_0;
                        stackIn_170_1 = stackOut_163_1;
                        stackIn_164_0 = stackOut_163_0;
                        stackIn_164_1 = stackOut_163_1;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          L83: {
                            L84: {
                              if (stackIn_164_0 <= stackIn_164_1) {
                                break L84;
                              } else {
                                var5 = var5 + fh.field_e;
                                if (var9 == 0) {
                                  break L83;
                                } else {
                                  break L84;
                                }
                              }
                            }
                            stackOut_166_0 = wp.field_v;
                            stackOut_166_1 = var4;
                            stackIn_167_0 = stackOut_166_0;
                            stackIn_167_1 = stackOut_166_1;
                            var7 = lg.a(stackIn_167_0[stackIn_167_1], true, (byte) -89);
                            var8 = -(var7 >> 2029515649) + rk.field_B;
                            var5 = var5 + cp.field_a;
                            lg.field_b[var4] = new int[4];
                            lg.field_b[var4][0] = var8 - et.field_b;
                            lg.field_b[var4][1] = var5;
                            lg.field_b[var4][2] = var7 + (et.field_b << 253363105);
                            var5 = var5 + (q.field_B + (cp.field_a + (el.field_c << -1269442399)));
                            lg.field_b[var4][3] = q.field_B + (el.field_c << 1958105697);
                            break L83;
                          }
                          var4++;
                          if (var9 == 0) {
                            continue L82;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_169_0 = no.field_J ^ -1;
              stackOut_169_1 = -3;
              stackIn_170_0 = stackOut_169_0;
              stackIn_170_1 = stackOut_169_1;
              break L1;
            }
            L85: {
              L86: {
                if (stackIn_170_0 != stackIn_170_1) {
                  break L86;
                } else {
                  ug.field_c.a(-1, param1, -1, 0);
                  if (var9 == 0) {
                    break L85;
                  } else {
                    break L86;
                  }
                }
              }
              ug.field_c.a(0, param1, ec.a(sm.field_d, 120, ko.field_b), 0);
              break L85;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "vq.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_e = null;
        field_g = null;
        field_a = null;
        if (param0 < 95) {
            field_c = (hd) null;
        }
        field_f = null;
    }

    final static boolean a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1) {
              stackOut_3_0 = wt.a(param0, (byte) 65, false);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("vq.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(bv param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -2) {
                break L1;
              } else {
                field_b = (ru) null;
                break L1;
              }
            }
            L2: {
              if (-2 != (param0.g(-108, 1) ^ -1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("vq.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
        field_g = "Reject <%0> from this game";
        field_e = "Liquids to permanently affect your units and your enemy's.";
        field_f = "Back to Menu";
    }
}
