/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static boolean field_c;
    static String field_a;
    static w field_e;
    static int[] field_b;
    static String[] field_d;

    final static void a(int param0, boolean param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        w var6 = null;
        w var7 = null;
        w var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref_String = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        vj var17 = null;
        Object var18 = null;
        tj var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        w var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        w var26 = null;
        w stackIn_20_0 = null;
        w stackIn_21_0 = null;
        w stackIn_22_0 = null;
        w stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_72_0 = 0;
        boolean stackIn_81_0 = false;
        int stackIn_87_0 = 0;
        boolean stackIn_135_0 = false;
        int stackIn_153_0 = 0;
        w stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        w stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        w stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        w stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        w stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        int stackIn_176_2 = 0;
        w stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        w stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        w stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        w stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        w stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        int stackIn_181_2 = 0;
        w stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        w stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        w stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        w stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        w stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        int stackIn_186_2 = 0;
        RuntimeException decompiledCaughtException = null;
        w stackOut_19_0 = null;
        w stackOut_20_0 = null;
        w stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        w stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_71_0 = 0;
        boolean stackOut_80_0 = false;
        int stackOut_86_0 = 0;
        boolean stackOut_134_0 = false;
        int stackOut_152_0 = 0;
        w stackOut_171_0 = null;
        int stackOut_171_1 = 0;
        w stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        w stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        w stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        int stackOut_174_2 = 0;
        w stackOut_175_0 = null;
        int stackOut_175_1 = 0;
        int stackOut_175_2 = 0;
        w stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        w stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        w stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        w stackOut_179_0 = null;
        int stackOut_179_1 = 0;
        int stackOut_179_2 = 0;
        w stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        int stackOut_180_2 = 0;
        w stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        w stackOut_182_0 = null;
        int stackOut_182_1 = 0;
        w stackOut_183_0 = null;
        int stackOut_183_1 = 0;
        w stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        int stackOut_184_2 = 0;
        w stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        int stackOut_185_2 = 0;
        var18 = null;
        var19 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                mn.a(-82);
                break L1;
              }
            }
            L2: {
              qf.a(tg.field_e, param0 + 101);
              if (cd.field_m != null) {
                L3: {
                  L4: {
                    ma.field_G.field_Hb = true;
                    var22 = fh.field_d;
                    var26 = var22;
                    fh.field_d.field_N = 0;
                    var26.field_mb = 0;
                    var6 = nn.field_a;
                    nn.field_a.field_N = 0;
                    var6.field_mb = 0;
                    var7 = tg.field_i;
                    tg.field_i.field_N = 0;
                    var7.field_mb = 0;
                    if (!ig.b(true)) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          fl.field_b.field_Y = jf.field_f.toUpperCase();
                          var9 = (2 + oh.field_d.field_mb) / 2;
                          fh.field_d.a(-2 + var9, 0, oh.field_d.field_N - 40, 40, 0);
                          if ((cd.field_m.field_mc ^ -1) >= (cd.field_m.field_rc ^ -1)) {
                            break L6;
                          } else {
                            fh.field_d.field_Y = ea.field_u.toUpperCase();
                            fh.field_d.field_Hb = true;
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        fh.field_d.field_Y = cb.field_k.toUpperCase();
                        fh.field_d.field_Hb = false;
                        break L5;
                      }
                      L7: {
                        fh.field_d.field_lb = d.field_g.field_lb;
                        if ((cj.field_a ^ -1) < -1) {
                          L8: {
                            L9: {
                              if ((cj.field_a ^ -1) == -2) {
                                break L9;
                              } else {
                                var10_ref_String = cm.a((byte) 122, fl.field_a, new String[]{Integer.toString(cj.field_a)});
                                if (var19 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var10_ref_String = ec.field_c;
                            break L8;
                          }
                          fh.field_d.field_Y = fh.field_d.field_Y + "<br>" + var10_ref_String;
                          if (-1 != (oe.field_G & 16 ^ -1)) {
                            break L7;
                          } else {
                            if (!dn.field_k) {
                              fh.field_d.field_lb = d.field_g.field_S;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      L10: {
                        L11: {
                          nn.field_a.a(-var9 + oh.field_d.field_mb, 0, -40 + oh.field_d.field_N, 40, var9);
                          nn.field_a.field_Y = mc.field_c.toUpperCase();
                          stackOut_19_0 = nn.field_a;
                          stackIn_22_0 = stackOut_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          if (!param1) {
                            break L11;
                          } else {
                            stackOut_20_0 = (w) ((Object) stackIn_20_0);
                            stackIn_22_0 = stackOut_20_0;
                            stackIn_21_0 = stackOut_20_0;
                            if (km.field_C != 0L) {
                              break L11;
                            } else {
                              stackOut_21_0 = (w) ((Object) stackIn_21_0);
                              stackOut_21_1 = 1;
                              stackIn_23_0 = stackOut_21_0;
                              stackIn_23_1 = stackOut_21_1;
                              break L10;
                            }
                          }
                        }
                        stackOut_22_0 = (w) ((Object) stackIn_22_0);
                        stackOut_22_1 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        break L10;
                      }
                      L12: {
                        stackIn_23_0.field_Hb = stackIn_23_1 != 0;
                        var8 = nn.field_a;
                        var10 = 2;
                        if (null == bc.field_D) {
                          break L12;
                        } else {
                          L13: {
                            if (null != km.field_D) {
                              break L13;
                            } else {
                              rd.field_c = new boolean[j.field_b];
                              km.field_D = new byte[j.field_b];
                              break L13;
                            }
                          }
                          var11 = 0;
                          L14: while (true) {
                            L15: {
                              L16: {
                                if (j.field_b <= var11) {
                                  break L16;
                                } else {
                                  rd.field_c[var11] = false;
                                  var11++;
                                  if (var19 != 0) {
                                    break L15;
                                  } else {
                                    if (var19 == 0) {
                                      continue L14;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              var10 = 0;
                              break L15;
                            }
                            L17: while (true) {
                              L18: {
                                L19: {
                                  if (2 <= var10) {
                                    break L19;
                                  } else {
                                    var11 = 0;
                                    stackOut_34_0 = 0;
                                    stackIn_72_0 = stackOut_34_0;
                                    stackIn_35_0 = stackOut_34_0;
                                    if (var19 != 0) {
                                      break L18;
                                    } else {
                                      var12 = stackIn_35_0;
                                      L20: while (true) {
                                        stackOut_36_0 = var12;
                                        stackOut_36_1 = bc.field_D.length;
                                        stackIn_37_0 = stackOut_36_0;
                                        stackIn_37_1 = stackOut_36_1;
                                        L21: while (true) {
                                          L22: {
                                            L23: {
                                              if (stackIn_37_0 >= stackIn_37_1) {
                                                break L23;
                                              } else {
                                                var25 = bc.field_D[var12];
                                                var23 = var25;
                                                var20 = var23;
                                                var13_ref_int__ = var20;
                                                stackOut_38_0 = 0;
                                                stackIn_66_0 = stackOut_38_0;
                                                stackIn_39_0 = stackOut_38_0;
                                                if (var19 != 0) {
                                                  break L22;
                                                } else {
                                                  var14 = stackIn_39_0;
                                                  L24: while (true) {
                                                    L25: {
                                                      L26: {
                                                        L27: {
                                                          if (var25.length <= var14) {
                                                            break L27;
                                                          } else {
                                                            var15 = var25[var14];
                                                            var16 = var20[1 + var14];
                                                            stackOut_41_0 = var15;
                                                            stackOut_41_1 = -1;
                                                            stackIn_58_0 = stackOut_41_0;
                                                            stackIn_58_1 = stackOut_41_1;
                                                            stackIn_42_0 = stackOut_41_0;
                                                            stackIn_42_1 = stackOut_41_1;
                                                            if (var19 != 0) {
                                                              break L26;
                                                            } else {
                                                              L28: {
                                                                L29: {
                                                                  if (stackIn_42_0 != stackIn_42_1) {
                                                                    break L29;
                                                                  } else {
                                                                    L30: {
                                                                      if ((var10 ^ -1) == -1) {
                                                                        stackOut_45_0 = cd.field_m.field_mc;
                                                                        stackIn_46_0 = stackOut_45_0;
                                                                        break L30;
                                                                      } else {
                                                                        stackOut_44_0 = cd.field_m.field_rc;
                                                                        stackIn_46_0 = stackOut_44_0;
                                                                        break L30;
                                                                      }
                                                                    }
                                                                    L31: {
                                                                      var17_int = stackIn_46_0;
                                                                      if (var16 == var17_int) {
                                                                        break L31;
                                                                      } else {
                                                                        if (var19 == 0) {
                                                                          break L25;
                                                                        } else {
                                                                          break L31;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (var19 == 0) {
                                                                      break L28;
                                                                    } else {
                                                                      break L29;
                                                                    }
                                                                  }
                                                                }
                                                                if (var16 == (255 & cd.field_m.field_kc[var15])) {
                                                                  break L28;
                                                                } else {
                                                                  if (var19 == 0) {
                                                                    break L25;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                }
                                                              }
                                                              var14 += 2;
                                                              if (var19 == 0) {
                                                                continue L24;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var11 = 1;
                                                        var14 = -1;
                                                        var15 = 0;
                                                        stackOut_57_0 = var15 ^ -1;
                                                        stackOut_57_1 = var25.length ^ -1;
                                                        stackIn_58_0 = stackOut_57_0;
                                                        stackIn_58_1 = stackOut_57_1;
                                                        break L26;
                                                      }
                                                      L32: while (true) {
                                                        L33: {
                                                          if (stackIn_58_0 <= stackIn_58_1) {
                                                            break L33;
                                                          } else {
                                                            var16 = var25[var15];
                                                            stackOut_59_0 = var14 ^ -1;
                                                            stackOut_59_1 = var16 ^ -1;
                                                            stackIn_37_0 = stackOut_59_0;
                                                            stackIn_37_1 = stackOut_59_1;
                                                            stackIn_60_0 = stackOut_59_0;
                                                            stackIn_60_1 = stackOut_59_1;
                                                            if (var19 != 0) {
                                                              continue L21;
                                                            } else {
                                                              L34: {
                                                                if (stackIn_60_0 <= stackIn_60_1) {
                                                                  break L34;
                                                                } else {
                                                                  var14 = var16;
                                                                  break L34;
                                                                }
                                                              }
                                                              var15 += 2;
                                                              if (var19 == 0) {
                                                                stackOut_57_0 = var15 ^ -1;
                                                                stackOut_57_1 = var25.length ^ -1;
                                                                stackIn_58_0 = stackOut_57_0;
                                                                stackIn_58_1 = stackOut_57_1;
                                                                continue L32;
                                                              } else {
                                                                break L33;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        rd.field_c[var14] = true;
                                                        break L25;
                                                      }
                                                    }
                                                    var12++;
                                                    if (var19 == 0) {
                                                      continue L20;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            stackOut_65_0 = var11;
                                            stackIn_66_0 = stackOut_65_0;
                                            break L22;
                                          }
                                          L35: {
                                            if (stackIn_66_0 == 0) {
                                              break L35;
                                            } else {
                                              if (var19 == 0) {
                                                break L19;
                                              } else {
                                                break L35;
                                              }
                                            }
                                          }
                                          var10++;
                                          if (var19 == 0) {
                                            continue L17;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_71_0 = te.field_p;
                                stackIn_72_0 = stackOut_71_0;
                                break L18;
                              }
                              if (stackIn_72_0 < 2) {
                                break L12;
                              } else {
                                if (bj.field_d[12]) {
                                  var10 = 2;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                      }
                      L36: {
                        L37: {
                          if ((var10 ^ -1) <= -3) {
                            break L37;
                          } else {
                            nn.field_a.field_Hb = false;
                            if (!nn.field_a.field_Kb) {
                              break L36;
                            } else {
                              var11_ref = null;
                              var12 = 0;
                              var13 = 0;
                              L38: while (true) {
                                L39: {
                                  L40: {
                                    if (j.field_b <= var13) {
                                      break L40;
                                    } else {
                                      stackOut_80_0 = rd.field_c[var13];
                                      stackIn_87_0 = stackOut_80_0 ? 1 : 0;
                                      stackIn_81_0 = stackOut_80_0;
                                      if (var19 != 0) {
                                        break L39;
                                      } else {
                                        L41: {
                                          if (!stackIn_81_0) {
                                            break L41;
                                          } else {
                                            L42: {
                                              var24 = "<col=A00000>" + pa.field_db[var13] + "</col>";
                                              if (var11_ref != null) {
                                                break L42;
                                              } else {
                                                var11_ref = var24;
                                                if (var19 == 0) {
                                                  break L41;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                            }
                                            var12 = 1;
                                            var11_ref = (String) (var11_ref) + ", " + var24;
                                            break L41;
                                          }
                                        }
                                        var13++;
                                        if (var19 == 0) {
                                          continue L38;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_86_0 = var10;
                                  stackIn_87_0 = stackOut_86_0;
                                  break L39;
                                }
                                L43: {
                                  if (stackIn_87_0 != 0) {
                                    L44: {
                                      var13_ref_String = bg.field_e;
                                      if (var12 == 0) {
                                        break L44;
                                      } else {
                                        var14_ref_String = jf.field_a + (String) (var11_ref);
                                        if (var19 == 0) {
                                          break L43;
                                        } else {
                                          break L44;
                                        }
                                      }
                                    }
                                    var14_ref_String = cm.a((byte) 119, fn.field_f, new String[]{(String) (var11_ref)});
                                    break L43;
                                  } else {
                                    L45: {
                                      var13_ref_String = hh.field_d;
                                      if (var12 != 0) {
                                        break L45;
                                      } else {
                                        var14_ref_String = cm.a((byte) 82, ci.field_e, new String[]{(String) (var11_ref)});
                                        if (var19 == 0) {
                                          break L43;
                                        } else {
                                          break L45;
                                        }
                                      }
                                    }
                                    var14_ref_String = mf.field_S + (String) (var11_ref);
                                    break L43;
                                  }
                                }
                                sl.field_g = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                                if (var19 == 0) {
                                  break L36;
                                } else {
                                  break L37;
                                }
                              }
                            }
                          }
                        }
                        L46: {
                          if (null != cb.field_e) {
                            break L46;
                          } else {
                            if (mg.field_Ob != null) {
                              break L46;
                            } else {
                              if (ik.field_h != null) {
                                break L46;
                              } else {
                                if (af.field_b != null) {
                                  break L46;
                                } else {
                                  break L36;
                                }
                              }
                            }
                          }
                        }
                        var11 = 0;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        L47: while (true) {
                          L48: {
                            L49: {
                              if (var16 >= j.field_b) {
                                break L49;
                              } else {
                                var17_int = cd.field_m.field_kc[var16] & 255;
                                if (var19 != 0) {
                                  break L48;
                                } else {
                                  L50: {
                                    if (cb.field_e == null) {
                                      break L50;
                                    } else {
                                      if (cb.field_e[var16] == null) {
                                        break L50;
                                      } else {
                                        if (cb.field_e[var16][var17_int]) {
                                          var11 = 1;
                                          break L50;
                                        } else {
                                          break L50;
                                        }
                                      }
                                    }
                                  }
                                  L51: {
                                    if (null == mg.field_Ob) {
                                      break L51;
                                    } else {
                                      if (null == mg.field_Ob[var16]) {
                                        break L51;
                                      } else {
                                        L52: {
                                          var18_int = mg.field_Ob[var16][var17_int];
                                          if ((var18_int ^ -1) < (var13 ^ -1)) {
                                            var13 = var18_int;
                                            break L52;
                                          } else {
                                            break L52;
                                          }
                                        }
                                        if (var18_int == 0) {
                                          break L51;
                                        } else {
                                          if (!uc.field_a) {
                                            var11 = 1;
                                            break L51;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L53: {
                                    if (ik.field_h == null) {
                                      break L53;
                                    } else {
                                      if (ik.field_h[var16] != null) {
                                        L54: {
                                          var18_int = ik.field_h[var16][var17_int];
                                          if (var18_int == 0) {
                                            break L54;
                                          } else {
                                            if (!uc.field_a) {
                                              var11 = 1;
                                              break L54;
                                            } else {
                                              break L54;
                                            }
                                          }
                                        }
                                        if (var18_int > var14) {
                                          var14 = var18_int;
                                          break L53;
                                        } else {
                                          break L53;
                                        }
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                  L55: {
                                    if (null == af.field_b) {
                                      break L55;
                                    } else {
                                      if (af.field_b[var16] == null) {
                                        break L55;
                                      } else {
                                        var15 = var15 | af.field_b[var16][var17_int];
                                        break L55;
                                      }
                                    }
                                  }
                                  var16++;
                                  if (var19 == 0) {
                                    continue L47;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                            }
                            var16 = 0;
                            break L48;
                          }
                          var17 = tb.field_b.field_Ob.field_M;
                          var18_ref = (tj) ((Object) var17.c((byte) 83));
                          L56: while (true) {
                            L57: {
                              L58: {
                                if (var18_ref == null) {
                                  break L58;
                                } else {
                                  stackOut_134_0 = var18_ref.g((byte) 68);
                                  stackIn_153_0 = stackOut_134_0 ? 1 : 0;
                                  stackIn_135_0 = stackOut_134_0;
                                  if (var19 != 0) {
                                    break L57;
                                  } else {
                                    L59: {
                                      L60: {
                                        if (!stackIn_135_0) {
                                          break L60;
                                        } else {
                                          if (var19 == 0) {
                                            break L59;
                                          } else {
                                            break L60;
                                          }
                                        }
                                      }
                                      L61: {
                                        if (var11 == 0) {
                                          break L61;
                                        } else {
                                          if (!var18_ref.field_ec) {
                                            var16 = 1;
                                            if (var19 == 0) {
                                              break L58;
                                            } else {
                                              break L61;
                                            }
                                          } else {
                                            break L61;
                                          }
                                        }
                                      }
                                      L62: {
                                        if (var18_ref.field_Ub >= var13) {
                                          break L62;
                                        } else {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L58;
                                          } else {
                                            break L62;
                                          }
                                        }
                                      }
                                      L63: {
                                        if ((var18_ref.field_Xb ^ -1) <= (var14 ^ -1)) {
                                          break L63;
                                        } else {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L58;
                                          } else {
                                            break L63;
                                          }
                                        }
                                      }
                                      L64: {
                                        if ((var15 & (var18_ref.field_Sb ^ -1)) <= 0) {
                                          break L64;
                                        } else {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L58;
                                          } else {
                                            break L64;
                                          }
                                        }
                                      }
                                      if (var12 != 0) {
                                        var16 = 1;
                                        if (var19 == 0) {
                                          break L58;
                                        } else {
                                          break L59;
                                        }
                                      } else {
                                        break L59;
                                      }
                                    }
                                    var18_ref = (tj) ((Object) var17.d(true));
                                    if (var19 == 0) {
                                      continue L56;
                                    } else {
                                      break L58;
                                    }
                                  }
                                }
                              }
                              stackOut_152_0 = te.field_p;
                              stackIn_153_0 = stackOut_152_0;
                              break L57;
                            }
                            L65: {
                              if (stackIn_153_0 < 2) {
                                break L65;
                              } else {
                                if (!bj.field_d[12]) {
                                  break L65;
                                } else {
                                  var16 = 0;
                                  break L65;
                                }
                              }
                            }
                            if (var16 == 0) {
                              break L36;
                            } else {
                              nn.field_a.field_Hb = false;
                              if (nn.field_a.field_Kb) {
                                L66: {
                                  if (0 == je.field_f.field_h.field_Pb) {
                                    break L66;
                                  } else {
                                    sl.field_g = cm.a((byte) 94, ii.field_s, new String[]{eg.field_b});
                                    if (var19 == 0) {
                                      break L36;
                                    } else {
                                      break L66;
                                    }
                                  }
                                }
                                sl.field_g = ui.field_L;
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                          }
                        }
                      }
                      if (var19 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var9_ref_String = cd.field_m.field_Vb;
                  fl.field_b.field_Y = cm.a((byte) 101, hf.field_a, new String[]{var9_ref_String}).toUpperCase();
                  tg.field_i.a(oh.field_d.field_mb, param0 ^ 0, oh.field_d.field_N - 40, 40, 0);
                  tg.field_i.field_Y = cm.a((byte) 116, h.field_e, new String[]{var9_ref_String});
                  var8 = tg.field_i;
                  break L3;
                }
                L67: {
                  if (km.field_C == 0L) {
                    break L67;
                  } else {
                    L68: {
                      var9 = (int)(km.field_C + -ik.a(4));
                      var9 = (999 + var9) / 1000;
                      if (var9 < 1) {
                        var9 = 1;
                        break L68;
                      } else {
                        break L68;
                      }
                    }
                    var8.field_Y = cm.a((byte) 119, cf.field_b, new String[]{Integer.toString(var9)});
                    break L67;
                  }
                }
                he.field_jb.field_Y = cm.a((byte) 101, sb.field_n, new String[]{Integer.toString(cd.field_m.field_rc), Integer.toString(cd.field_m.field_mc)});
                break L2;
              } else {
                break L2;
              }
            }
            L69: {
              L70: {
                stackOut_171_0 = ee.field_i;
                stackOut_171_1 = 0;
                stackIn_175_0 = stackOut_171_0;
                stackIn_175_1 = stackOut_171_1;
                stackIn_172_0 = stackOut_171_0;
                stackIn_172_1 = stackOut_171_1;
                if (!param2) {
                  break L70;
                } else {
                  stackOut_172_0 = (w) ((Object) stackIn_172_0);
                  stackOut_172_1 = stackIn_172_1;
                  stackIn_175_0 = stackOut_172_0;
                  stackIn_175_1 = stackOut_172_1;
                  stackIn_173_0 = stackOut_172_0;
                  stackIn_173_1 = stackOut_172_1;
                  if (param3) {
                    break L70;
                  } else {
                    stackOut_173_0 = (w) ((Object) stackIn_173_0);
                    stackOut_173_1 = stackIn_173_1;
                    stackIn_175_0 = stackOut_173_0;
                    stackIn_175_1 = stackOut_173_1;
                    stackIn_174_0 = stackOut_173_0;
                    stackIn_174_1 = stackOut_173_1;
                    if (dn.field_k) {
                      break L70;
                    } else {
                      stackOut_174_0 = (w) ((Object) stackIn_174_0);
                      stackOut_174_1 = stackIn_174_1;
                      stackOut_174_2 = 1;
                      stackIn_176_0 = stackOut_174_0;
                      stackIn_176_1 = stackOut_174_1;
                      stackIn_176_2 = stackOut_174_2;
                      break L69;
                    }
                  }
                }
              }
              stackOut_175_0 = (w) ((Object) stackIn_175_0);
              stackOut_175_1 = stackIn_175_1;
              stackOut_175_2 = 0;
              stackIn_176_0 = stackOut_175_0;
              stackIn_176_1 = stackOut_175_1;
              stackIn_176_2 = stackOut_175_2;
              break L69;
            }
            L71: {
              L72: {
                ((w) (Object) stackIn_176_0).a(stackIn_176_1 != 0, stackIn_176_2 != 0);
                stackOut_176_0 = oh.field_d;
                stackOut_176_1 = 0;
                stackIn_180_0 = stackOut_176_0;
                stackIn_180_1 = stackOut_176_1;
                stackIn_177_0 = stackOut_176_0;
                stackIn_177_1 = stackOut_176_1;
                if (!param2) {
                  break L72;
                } else {
                  stackOut_177_0 = (w) ((Object) stackIn_177_0);
                  stackOut_177_1 = stackIn_177_1;
                  stackIn_180_0 = stackOut_177_0;
                  stackIn_180_1 = stackOut_177_1;
                  stackIn_178_0 = stackOut_177_0;
                  stackIn_178_1 = stackOut_177_1;
                  if (param3) {
                    break L72;
                  } else {
                    stackOut_178_0 = (w) ((Object) stackIn_178_0);
                    stackOut_178_1 = stackIn_178_1;
                    stackIn_180_0 = stackOut_178_0;
                    stackIn_180_1 = stackOut_178_1;
                    stackIn_179_0 = stackOut_178_0;
                    stackIn_179_1 = stackOut_178_1;
                    if (dn.field_k) {
                      break L72;
                    } else {
                      stackOut_179_0 = (w) ((Object) stackIn_179_0);
                      stackOut_179_1 = stackIn_179_1;
                      stackOut_179_2 = 1;
                      stackIn_181_0 = stackOut_179_0;
                      stackIn_181_1 = stackOut_179_1;
                      stackIn_181_2 = stackOut_179_2;
                      break L71;
                    }
                  }
                }
              }
              stackOut_180_0 = (w) ((Object) stackIn_180_0);
              stackOut_180_1 = stackIn_180_1;
              stackOut_180_2 = 0;
              stackIn_181_0 = stackOut_180_0;
              stackIn_181_1 = stackOut_180_1;
              stackIn_181_2 = stackOut_180_2;
              break L71;
            }
            L73: {
              L74: {
                ((w) (Object) stackIn_181_0).a(stackIn_181_1 != 0, stackIn_181_2 != 0);
                stackOut_181_0 = (w) (field_e);
                stackOut_181_1 = 0;
                stackIn_185_0 = stackOut_181_0;
                stackIn_185_1 = stackOut_181_1;
                stackIn_182_0 = stackOut_181_0;
                stackIn_182_1 = stackOut_181_1;
                if (!param2) {
                  break L74;
                } else {
                  stackOut_182_0 = (w) ((Object) stackIn_182_0);
                  stackOut_182_1 = stackIn_182_1;
                  stackIn_185_0 = stackOut_182_0;
                  stackIn_185_1 = stackOut_182_1;
                  stackIn_183_0 = stackOut_182_0;
                  stackIn_183_1 = stackOut_182_1;
                  if (param3) {
                    break L74;
                  } else {
                    stackOut_183_0 = (w) ((Object) stackIn_183_0);
                    stackOut_183_1 = stackIn_183_1;
                    stackIn_185_0 = stackOut_183_0;
                    stackIn_185_1 = stackOut_183_1;
                    stackIn_184_0 = stackOut_183_0;
                    stackIn_184_1 = stackOut_183_1;
                    if (!dn.field_k) {
                      break L74;
                    } else {
                      stackOut_184_0 = (w) ((Object) stackIn_184_0);
                      stackOut_184_1 = stackIn_184_1;
                      stackOut_184_2 = 1;
                      stackIn_186_0 = stackOut_184_0;
                      stackIn_186_1 = stackOut_184_1;
                      stackIn_186_2 = stackOut_184_2;
                      break L73;
                    }
                  }
                }
              }
              stackOut_185_0 = (w) ((Object) stackIn_185_0);
              stackOut_185_1 = stackIn_185_1;
              stackOut_185_2 = 0;
              stackIn_186_0 = stackOut_185_0;
              stackIn_186_1 = stackOut_185_1;
              stackIn_186_2 = stackOut_185_2;
              break L73;
            }
            L75: {
              ((w) (Object) stackIn_186_0).a(stackIn_186_1 != 0, stackIn_186_2 != 0);
              je.field_f.field_h.b(false);
              if (cd.field_m != null) {
                L76: {
                  if ((ma.field_G.field_ob ^ -1) == -1) {
                    break L76;
                  } else {
                    md.a(param0 ^ 9, param4, cd.field_m.e(-76));
                    break L76;
                  }
                }
                L77: {
                  if (-1 != (nn.field_a.field_ob ^ -1)) {
                    gm.field_I = true;
                    break L77;
                  } else {
                    break L77;
                  }
                }
                L78: {
                  if (-1 == (fh.field_d.field_ob ^ -1)) {
                    break L78;
                  } else {
                    dn.field_k = true;
                    break L78;
                  }
                }
                L79: {
                  if (qc.field_q.field_ob == 0) {
                    break L79;
                  } else {
                    dn.field_k = false;
                    break L79;
                  }
                }
                mc.a(cd.field_m, false, param4, (byte) -126);
                break L75;
              } else {
                break L75;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var5), "mn.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, long param1, int param2) {
        uf var4 = we.field_b;
        var4.f(param2, -4);
        var4.field_n = var4.field_n + 1;
        int var5 = var4.field_n;
        var4.a(true, 7);
        var4.a(param1, (byte) 0);
        var4.b(-var5 + var4.field_n, param0);
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 >= -113) {
            return;
        }
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_a = "Return to game";
        field_d = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_b = new int[]{40, 30, 24, 19, 15, 12, 9, 6, 4, 2, 0};
    }
}
