/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends um {
    private int field_z;
    static vl field_v;
    static int[] field_A;
    private int field_y;
    private int field_x;
    static fo field_w;
    private jp[] field_B;

    final static boolean a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        Object var13 = null;
        Object var14 = null;
        Object var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        CharSequence var24 = null;
        CharSequence var25 = null;
        CharSequence var26 = null;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_156_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        L0: {
          var21 = null;
          var22 = null;
          var23 = null;
          var11 = BrickABrac.field_J ? 1 : 0;
          var3 = 1;
          if (nd.field_b) {
            break L0;
          } else {
            if (null != wp.field_k) {
              break L0;
            } else {
              var3 = 0;
              break L0;
            }
          }
        }
        if (!param0) {
          L1: {
            if (ng.field_b != 0) {
              break L1;
            } else {
              if (null != nl.field_f) {
                var3 = 0;
                break L1;
              } else {
                L2: {
                  if (ng.field_b != 2) {
                    break L2;
                  } else {
                    if (ve.b(-21835160)) {
                      break L2;
                    } else {
                      var3 = 0;
                      break L2;
                    }
                  }
                }
                if (dc.field_b != 84) {
                  if (85 == dc.field_b) {
                    L3: {
                      if (var3 == 0) {
                        break L3;
                      } else {
                        if (fp.field_A.length() <= 0) {
                          break L3;
                        } else {
                          StringBuilder discarded$13 = uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                          break L3;
                        }
                      }
                    }
                    return true;
                  } else {
                    L4: {
                      var4 = go.field_b;
                      if (param0) {
                        stackOut_96_0 = 0;
                        stackIn_97_0 = stackOut_96_0;
                        break L4;
                      } else {
                        stackOut_95_0 = 1;
                        stackIn_97_0 = stackOut_95_0;
                        break L4;
                      }
                    }
                    if (ii.a(stackIn_97_0 == 0, (char) var4)) {
                      return false;
                    } else {
                      L5: {
                        if (var3 == 0) {
                          break L5;
                        } else {
                          if (fp.field_A.length() >= 80) {
                            break L5;
                          } else {
                            L6: {
                              StringBuilder discarded$14 = fp.field_A.append(var4);
                              var5 = 485;
                              var17 = tb.field_cb;
                              var7 = var17;
                              var7 = var17;
                              var16 = r.a((byte) 104, var17);
                              var7 = var16;
                              var7 = var16;
                              var19 = var16;
                              var7 = var19;
                              var7 = var19;
                              if (ng.field_b != 2) {
                                L7: {
                                  var7 = "";
                                  if (ng.field_b == 0) {
                                    L8: {
                                      if (o.field_e != null) {
                                        break L8;
                                      } else {
                                        if (!th.field_d) {
                                          break L8;
                                        } else {
                                          var7 = "[" + fi.field_u + "] ";
                                          break L8;
                                        }
                                      }
                                    }
                                    if (null != o.field_e) {
                                      L9: {
                                        if (!ge.field_v) {
                                          break L9;
                                        } else {
                                          if (null != jd.field_b) {
                                            var7 = "[" + jd.field_b + "] ";
                                            break L7;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      var7 = "[" + rd.a(fm.field_a, new String[1], (byte) 103) + "] ";
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                                var20 = var7 + var19 + ": ";
                                var7 = var20;
                                var7 = var20;
                                var5 = var5 - jq.field_y.c(var20);
                                break L6;
                              } else {
                                var25 = (CharSequence) (Object) tk.field_p;
                                var18 = rd.a(hq.field_x, new String[1], (byte) 103);
                                var7 = var18;
                                var7 = var18;
                                var8 = rd.a(ek.field_fb, new String[1], (byte) 103);
                                var7 = var8;
                                var7 = var8;
                                var9 = jq.field_y.c(var18);
                                var10 = jq.field_y.c(var8);
                                if (var9 > var10) {
                                  var5 = var5 - var9;
                                  break L6;
                                } else {
                                  var5 = var5 - var10;
                                  break L6;
                                }
                              }
                            }
                            if (var5 < jq.field_y.c(fp.field_A.toString())) {
                              StringBuilder discarded$15 = uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      return true;
                    }
                  }
                } else {
                  L10: {
                    if (var3 == 0) {
                      if (ng.field_b == 0) {
                        break L10;
                      } else {
                        L11: {
                          if (param0) {
                            stackOut_90_0 = 0;
                            stackIn_91_0 = stackOut_90_0;
                            break L11;
                          } else {
                            stackOut_89_0 = 1;
                            stackIn_91_0 = stackOut_89_0;
                            break L11;
                          }
                        }
                        fl.b(stackIn_91_0 != 0);
                        break L10;
                      }
                    } else {
                      if (fp.field_A.length() > 0) {
                        var4_ref_String = fp.field_A.toString();
                        if (mm.a(var4_ref_String, (byte) -128)) {
                          var13 = null;
                          var12 = null;
                          wp.a((byte) 92, 0, (String) null, ck.field_j, (String) null, 2);
                          var15 = null;
                          var14 = null;
                          wp.a((byte) 92, 0, (String) null, w.field_m, (String) null, 2);
                          fl.b(true);
                          break L10;
                        } else {
                          L12: {
                            var5 = ng.field_b;
                            if (var5 != 0) {
                              break L12;
                            } else {
                              if (null == o.field_e) {
                                break L12;
                              } else {
                                var5 = 1;
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (tm.a(var5, (byte) 18) == 2) {
                              eo.a(0, param2, 1, var5);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          c.a(-1, tk.field_p, (byte) -106, ng.field_b, param1, var4_ref_String);
                          fl.b(true);
                          break L10;
                        }
                      } else {
                        fl.b(true);
                        break L10;
                      }
                    }
                  }
                  return true;
                }
              }
            }
          }
          L14: {
            if (ng.field_b != 2) {
              break L14;
            } else {
              if (ve.b(-21835160)) {
                break L14;
              } else {
                var3 = 0;
                break L14;
              }
            }
          }
          if (dc.field_b != 84) {
            if (85 == dc.field_b) {
              L15: {
                if (var3 == 0) {
                  break L15;
                } else {
                  if (fp.field_A.length() <= 0) {
                    break L15;
                  } else {
                    StringBuilder discarded$16 = uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                    return true;
                  }
                }
              }
              return true;
            } else {
              L16: {
                var4 = go.field_b;
                if (param0) {
                  stackOut_155_0 = 0;
                  stackIn_156_0 = stackOut_155_0;
                  break L16;
                } else {
                  stackOut_154_0 = 1;
                  stackIn_156_0 = stackOut_154_0;
                  break L16;
                }
              }
              if (ii.a(stackIn_156_0 == 0, (char) var4)) {
                return false;
              } else {
                L17: {
                  if (var3 == 0) {
                    break L17;
                  } else {
                    if (fp.field_A.length() >= 80) {
                      break L17;
                    } else {
                      L18: {
                        StringBuilder discarded$17 = fp.field_A.append(var4);
                        var5 = 485;
                        var17 = tb.field_cb;
                        var7 = var17;
                        var7 = var17;
                        var16 = r.a((byte) 104, var17);
                        var7 = var16;
                        var7 = var16;
                        var19 = var16;
                        var7 = var19;
                        var7 = var19;
                        if (ng.field_b != 2) {
                          var7 = "";
                          if (ng.field_b == 0) {
                            L19: {
                              if (o.field_e != null) {
                                break L19;
                              } else {
                                if (!th.field_d) {
                                  break L19;
                                } else {
                                  var7 = "[" + fi.field_u + "] ";
                                  break L19;
                                }
                              }
                            }
                            if (null != o.field_e) {
                              if (!ge.field_v) {
                                L20: {
                                  var7 = "[" + rd.a(fm.field_a, new String[1], (byte) 103) + "] ";
                                  var20 = var7 + var19 + ": ";
                                  var5 = var5 - jq.field_y.c(var20);
                                  if (var5 < jq.field_y.c(fp.field_A.toString())) {
                                    StringBuilder discarded$18 = uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                return true;
                              } else {
                                if (null != jd.field_b) {
                                  var7 = "[" + jd.field_b + "] ";
                                  var20 = var7 + var19 + ": ";
                                  var5 = var5 - jq.field_y.c(var20);
                                  break L18;
                                } else {
                                  L21: {
                                    var7 = "[" + rd.a(fm.field_a, new String[1], (byte) 103) + "] ";
                                    var20 = var7 + var19 + ": ";
                                    var5 = var5 - jq.field_y.c(var20);
                                    if (var5 < jq.field_y.c(fp.field_A.toString())) {
                                      StringBuilder discarded$19 = uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  return true;
                                }
                              }
                            } else {
                              L22: {
                                var20 = var7 + var19 + ": ";
                                var5 = var5 - jq.field_y.c(var20);
                                if (var5 < jq.field_y.c(fp.field_A.toString())) {
                                  StringBuilder discarded$20 = uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              return true;
                            }
                          } else {
                            L23: {
                              var20 = var7 + var19 + ": ";
                              var7 = var20;
                              var7 = var20;
                              var5 = var5 - jq.field_y.c(var20);
                              if (var5 < jq.field_y.c(fp.field_A.toString())) {
                                StringBuilder discarded$21 = uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            return true;
                          }
                        } else {
                          var26 = (CharSequence) (Object) tk.field_p;
                          var18 = rd.a(hq.field_x, new String[1], (byte) 103);
                          var7 = var18;
                          var7 = var18;
                          var8 = rd.a(ek.field_fb, new String[1], (byte) 103);
                          var7 = var8;
                          var7 = var8;
                          var9 = jq.field_y.c(var18);
                          var10 = jq.field_y.c(var8);
                          if (var9 > var10) {
                            var5 = var5 - var9;
                            break L18;
                          } else {
                            var5 = var5 - var10;
                            break L18;
                          }
                        }
                      }
                      if (var5 < jq.field_y.c(fp.field_A.toString())) {
                        StringBuilder discarded$22 = uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                        break L17;
                      } else {
                        return true;
                      }
                    }
                  }
                }
                return true;
              }
            }
          } else {
            if (var3 == 0) {
              L24: {
                if (ng.field_b == 0) {
                  break L24;
                } else {
                  L25: {
                    if (param0) {
                      stackOut_149_0 = 0;
                      stackIn_150_0 = stackOut_149_0;
                      break L25;
                    } else {
                      stackOut_148_0 = 1;
                      stackIn_150_0 = stackOut_148_0;
                      break L25;
                    }
                  }
                  fl.b(stackIn_150_0 != 0);
                  break L24;
                }
              }
              return true;
            } else {
              if (fp.field_A.length() > 0) {
                var4_ref_String = fp.field_A.toString();
                var7 = var4_ref_String;
                var7 = var4_ref_String;
                if (mm.a(var4_ref_String, (byte) -128)) {
                  var13 = null;
                  var12 = null;
                  wp.a((byte) 92, 0, (String) null, ck.field_j, (String) null, 2);
                  var15 = null;
                  var14 = null;
                  wp.a((byte) 92, 0, (String) null, w.field_m, (String) null, 2);
                  fl.b(true);
                  return true;
                } else {
                  L26: {
                    var5 = ng.field_b;
                    if (var5 != 0) {
                      break L26;
                    } else {
                      if (null == o.field_e) {
                        break L26;
                      } else {
                        var5 = 1;
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (tm.a(var5, (byte) 18) == 2) {
                      eo.a(0, param2, 1, var5);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  c.a(-1, tk.field_p, (byte) -106, ng.field_b, param1, var4_ref_String);
                  fl.b(true);
                  return true;
                }
              } else {
                fl.b(true);
                return true;
              }
            }
          }
        } else {
          L28: {
            field_v = null;
            if (ng.field_b != 0) {
              break L28;
            } else {
              if (null != nl.field_f) {
                var3 = 0;
                break L28;
              } else {
                break L28;
              }
            }
          }
          L29: {
            if (ng.field_b != 2) {
              break L29;
            } else {
              if (ve.b(-21835160)) {
                break L29;
              } else {
                var3 = 0;
                break L29;
              }
            }
          }
          if (dc.field_b != 84) {
            if (85 == dc.field_b) {
              L30: {
                if (var3 == 0) {
                  break L30;
                } else {
                  if (fp.field_A.length() <= 0) {
                    break L30;
                  } else {
                    StringBuilder discarded$23 = uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                    break L30;
                  }
                }
              }
              return true;
            } else {
              L31: {
                var4 = go.field_b;
                if (param0) {
                  stackOut_36_0 = 0;
                  stackIn_37_0 = stackOut_36_0;
                  break L31;
                } else {
                  stackOut_35_0 = 1;
                  stackIn_37_0 = stackOut_35_0;
                  break L31;
                }
              }
              if (ii.a(stackIn_37_0 == 0, (char) var4)) {
                return false;
              } else {
                L32: {
                  if (var3 == 0) {
                    break L32;
                  } else {
                    if (fp.field_A.length() >= 80) {
                      break L32;
                    } else {
                      L33: {
                        StringBuilder discarded$24 = fp.field_A.append(var4);
                        var5 = 485;
                        var17 = tb.field_cb;
                        var7 = var17;
                        var7 = var17;
                        var16 = r.a((byte) 104, var17);
                        var7 = var16;
                        var7 = var16;
                        var19 = var16;
                        var7 = var19;
                        var7 = var19;
                        if (ng.field_b != 2) {
                          L34: {
                            var7 = "";
                            if (ng.field_b == 0) {
                              L35: {
                                if (o.field_e != null) {
                                  break L35;
                                } else {
                                  if (!th.field_d) {
                                    break L35;
                                  } else {
                                    var7 = "[" + fi.field_u + "] ";
                                    break L35;
                                  }
                                }
                              }
                              if (null != o.field_e) {
                                L36: {
                                  if (!ge.field_v) {
                                    break L36;
                                  } else {
                                    if (null != jd.field_b) {
                                      var7 = "[" + jd.field_b + "] ";
                                      break L34;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                var7 = "[" + rd.a(fm.field_a, new String[1], (byte) 103) + "] ";
                                break L34;
                              } else {
                                break L34;
                              }
                            } else {
                              break L34;
                            }
                          }
                          var20 = var7 + var19 + ": ";
                          var5 = var5 - jq.field_y.c(var20);
                          break L33;
                        } else {
                          var24 = (CharSequence) (Object) tk.field_p;
                          var18 = rd.a(hq.field_x, new String[1], (byte) 103);
                          var7 = var18;
                          var7 = var18;
                          var8 = rd.a(ek.field_fb, new String[1], (byte) 103);
                          var7 = var8;
                          var7 = var8;
                          var9 = jq.field_y.c(var18);
                          var10 = jq.field_y.c(var8);
                          if (var9 > var10) {
                            var5 = var5 - var9;
                            break L33;
                          } else {
                            var5 = var5 - var10;
                            break L33;
                          }
                        }
                      }
                      if (var5 < jq.field_y.c(fp.field_A.toString())) {
                        StringBuilder discarded$25 = uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                        break L32;
                      } else {
                        return true;
                      }
                    }
                  }
                }
                return true;
              }
            }
          } else {
            L37: {
              if (var3 == 0) {
                if (ng.field_b == 0) {
                  break L37;
                } else {
                  L38: {
                    if (param0) {
                      stackOut_30_0 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      break L38;
                    } else {
                      stackOut_29_0 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      break L38;
                    }
                  }
                  fl.b(stackIn_31_0 != 0);
                  break L37;
                }
              } else {
                if (fp.field_A.length() > 0) {
                  var4_ref_String = fp.field_A.toString();
                  if (mm.a(var4_ref_String, (byte) -128)) {
                    var13 = null;
                    var12 = null;
                    wp.a((byte) 92, 0, (String) null, ck.field_j, (String) null, 2);
                    var15 = null;
                    var14 = null;
                    wp.a((byte) 92, 0, (String) null, w.field_m, (String) null, 2);
                    fl.b(true);
                    break L37;
                  } else {
                    L39: {
                      var5 = ng.field_b;
                      if (var5 != 0) {
                        break L39;
                      } else {
                        if (null == o.field_e) {
                          break L39;
                        } else {
                          var5 = 1;
                          break L39;
                        }
                      }
                    }
                    L40: {
                      if (tm.a(var5, (byte) 18) == 2) {
                        eo.a(0, param2, 1, var5);
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    c.a(-1, tk.field_p, (byte) -106, ng.field_b, param1, var4_ref_String);
                    fl.b(true);
                    break L37;
                  }
                } else {
                  fl.b(true);
                  break L37;
                }
              }
            }
            return true;
          }
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (!param3.field_q) {
                if (param3.f(-71)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param3 instanceof d) {
                param0 = param0 & ((d) (Object) param3).field_J;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param0) {
                stackOut_13_0 = ((hi) this).field_x;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                if (var6_int != 0) {
                  stackOut_12_0 = ((hi) this).field_y;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((hi) this).field_z;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              }
            }
            L4: {
              var7 = stackIn_14_0;
              ac.a(((hi) this).field_B, param3.field_w + param4 + (param3.field_s - ((hi) this).field_B[0].field_z >> 1), param3.field_o + param2, param3.field_t, var7, (byte) 122);
              if (!param0) {
                stackOut_16_0 = 7105644;
                stackIn_17_0 = stackOut_16_0;
                break L4;
              } else {
                stackOut_15_0 = 16777215;
                stackIn_17_0 = stackOut_15_0;
                break L4;
              }
            }
            L5: {
              var8 = stackIn_17_0;
              if (param1 == -20618) {
                break L5;
              } else {
                field_A = null;
                break L5;
              }
            }
            int discarded$1 = ((hi) this).field_k.a(param3.field_A, param3.field_o + param2, param4 - -param3.field_w + -2, param3.field_t, param3.field_s, var8, -1, 1, 1, ((hi) this).field_k.field_F);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("hi.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param4 + 41);
        }
    }

    public hi() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 85) {
                break L1;
              } else {
                field_A = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hi.EA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void c(byte param0) {
        field_v = null;
        field_w = null;
        field_A = null;
    }

    private hi(int param0, int param1, int param2) {
        ((hi) this).field_x = param2;
        ((hi) this).field_y = param1;
        ((hi) this).field_z = param0;
        ((hi) this).field_k = wm.field_a;
        ((hi) this).field_B = sf.field_U;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new vl();
    }
}
