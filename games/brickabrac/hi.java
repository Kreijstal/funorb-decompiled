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
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_31_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_160_0 = 0;
        int var3;
        int var4;
        String var4_ref_String;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        Object var21;
        Object var22;
        Object var23;
        CharSequence var24;
        CharSequence var25;
        CharSequence var26;
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
                  if ((ng.field_b ^ -1) != -3) {
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
                if ((dc.field_b ^ -1) != -85) {
                  if (85 != dc.field_b) {
                    L3: {
                      var4 = go.field_b;
                      if (param0) {
                        stackIn_103_0 = 0;
                        break L3;
                      } else {
                        stackIn_103_0 = 1;
                        break L3;
                      }
                    }
                    if (ii.a(stackIn_103_0 != 0, (char) var4)) {
                      L4: {
                        if (var3 == 0) {
                          break L4;
                        } else {
                          if (-81 >= (fp.field_A.length() ^ -1)) {
                            break L4;
                          } else {
                            L5: {
                              discarded$0 = fp.field_A.append((char) var4);
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
                              if ((ng.field_b ^ -1) != -3) {
                                L6: {
                                  var7 = "";
                                  if (ng.field_b == 0) {
                                    L7: {
                                      if (o.field_e != null) {
                                        break L7;
                                      } else {
                                        if (!th.field_d) {
                                          break L7;
                                        } else {
                                          var7 = "[" + fi.field_u + "] ";
                                          break L7;
                                        }
                                      }
                                    }
                                    if (null != o.field_e) {
                                      L8: {
                                        if (!ge.field_v) {
                                          break L8;
                                        } else {
                                          if (null != jd.field_b) {
                                            var7 = "[" + jd.field_b + "] ";
                                            break L6;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      var7 = "[" + rd.a(fm.field_a, new String[]{o.field_e.field_Fc}, (byte) 103) + "] ";
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                                var20 = var7 + var19 + ": ";
                                var7 = var20;
                                var7 = var20;
                                var5 = var5 - jq.field_y.c(var20);
                                break L5;
                              } else {
                                var25 = (CharSequence) ((Object) tk.field_p);
                                var18 = rd.a(hq.field_x, new String[]{ap.a(true, var25)}, (byte) 103);
                                var7 = var18;
                                var7 = var18;
                                var8 = rd.a(ek.field_fb, new String[]{var16}, (byte) 103);
                                var7 = var8;
                                var7 = var8;
                                var9 = jq.field_y.c(var18);
                                var10 = jq.field_y.c(var8);
                                if (var9 > var10) {
                                  var5 = var5 - var9;
                                  break L5;
                                } else {
                                  var5 = var5 - var10;
                                  break L5;
                                }
                              }
                            }
                            if (var5 < jq.field_y.c(fp.field_A.toString())) {
                              uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    L9: {
                      if (var3 == 0) {
                        break L9;
                      } else {
                        if (fp.field_A.length() <= 0) {
                          break L9;
                        } else {
                          uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                          break L9;
                        }
                      }
                    }
                    return true;
                  }
                } else {
                  L10: {
                    if (var3 == 0) {
                      if (-1 == (ng.field_b ^ -1)) {
                        break L10;
                      } else {
                        L11: {
                          if (param0) {
                            stackIn_93_0 = 0;
                            break L11;
                          } else {
                            stackIn_93_0 = 1;
                            break L11;
                          }
                        }
                        fl.b(stackIn_93_0 != 0);
                        break L10;
                      }
                    } else {
                      if (-1 > (fp.field_A.length() ^ -1)) {
                        var4_ref_String = fp.field_A.toString();
                        if (mm.a(var4_ref_String, (byte) -128)) {
                          var13 = (String) null;
                          var12 = (String) null;
                          wp.a((byte) 92, 0, (String) null, ck.field_j, (String) null, 2);
                          var15 = (String) null;
                          var14 = (String) null;
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
                            if (-3 == (tm.a(var5, (byte) 18) ^ -1)) {
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
            if ((ng.field_b ^ -1) != -3) {
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
          if ((dc.field_b ^ -1) != -85) {
            if (85 == dc.field_b) {
              if (var3 != 0) {
                if (fp.field_A.length() > 0) {
                  uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                  return true;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              L15: {
                var4 = go.field_b;
                if (param0) {
                  stackIn_160_0 = 0;
                  break L15;
                } else {
                  stackIn_160_0 = 1;
                  break L15;
                }
              }
              if (ii.a(stackIn_160_0 != 0, (char) var4)) {
                if (var3 != 0) {
                  if (-81 < (fp.field_A.length() ^ -1)) {
                    L16: {
                      discarded$1 = fp.field_A.append((char) var4);
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
                      if ((ng.field_b ^ -1) != -3) {
                        var7 = "";
                        if (ng.field_b == 0) {
                          L17: {
                            if (o.field_e != null) {
                              break L17;
                            } else {
                              if (!th.field_d) {
                                break L17;
                              } else {
                                var7 = "[" + fi.field_u + "] ";
                                break L17;
                              }
                            }
                          }
                          if (null != o.field_e) {
                            if (ge.field_v) {
                              if (null != jd.field_b) {
                                var7 = "[" + jd.field_b + "] ";
                                var20 = var7 + var19 + ": ";
                                var5 = var5 - jq.field_y.c(var20);
                                break L16;
                              } else {
                                L18: {
                                  var7 = "[" + rd.a(fm.field_a, new String[]{o.field_e.field_Fc}, (byte) 103) + "] ";
                                  var20 = var7 + var19 + ": ";
                                  var5 = var5 - jq.field_y.c(var20);
                                  if (var5 < jq.field_y.c(fp.field_A.toString())) {
                                    uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                return true;
                              }
                            } else {
                              L19: {
                                var7 = "[" + rd.a(fm.field_a, new String[]{o.field_e.field_Fc}, (byte) 103) + "] ";
                                var20 = var7 + var19 + ": ";
                                var5 = var5 - jq.field_y.c(var20);
                                if (var5 < jq.field_y.c(fp.field_A.toString())) {
                                  uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              return true;
                            }
                          } else {
                            L20: {
                              var20 = var7 + var19 + ": ";
                              var5 = var5 - jq.field_y.c(var20);
                              if (var5 < jq.field_y.c(fp.field_A.toString())) {
                                uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            return true;
                          }
                        } else {
                          L21: {
                            var20 = var7 + var19 + ": ";
                            var7 = var20;
                            var7 = var20;
                            var5 = var5 - jq.field_y.c(var20);
                            if (var5 < jq.field_y.c(fp.field_A.toString())) {
                              uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          return true;
                        }
                      } else {
                        var26 = (CharSequence) ((Object) tk.field_p);
                        var18 = rd.a(hq.field_x, new String[]{ap.a(true, var26)}, (byte) 103);
                        var7 = var18;
                        var7 = var18;
                        var8 = rd.a(ek.field_fb, new String[]{var16}, (byte) 103);
                        var7 = var8;
                        var7 = var8;
                        var9 = jq.field_y.c(var18);
                        var10 = jq.field_y.c(var8);
                        if (var9 > var10) {
                          var5 = var5 - var9;
                          break L16;
                        } else {
                          var5 = var5 - var10;
                          break L16;
                        }
                      }
                    }
                    if (var5 < jq.field_y.c(fp.field_A.toString())) {
                      uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            if (var3 != 0) {
              if (-1 > (fp.field_A.length() ^ -1)) {
                var4_ref_String = fp.field_A.toString();
                var7 = var4_ref_String;
                var7 = var4_ref_String;
                if (mm.a(var4_ref_String, (byte) -128)) {
                  var13 = (String) null;
                  var12 = (String) null;
                  wp.a((byte) 92, 0, (String) null, ck.field_j, (String) null, 2);
                  var15 = (String) null;
                  var14 = (String) null;
                  wp.a((byte) 92, 0, (String) null, w.field_m, (String) null, 2);
                  fl.b(true);
                  return true;
                } else {
                  L22: {
                    var5 = ng.field_b;
                    if (var5 != 0) {
                      break L22;
                    } else {
                      if (null == o.field_e) {
                        break L22;
                      } else {
                        var5 = 1;
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (-3 == (tm.a(var5, (byte) 18) ^ -1)) {
                      eo.a(0, param2, 1, var5);
                      break L23;
                    } else {
                      break L23;
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
            } else {
              L24: {
                if (-1 == (ng.field_b ^ -1)) {
                  break L24;
                } else {
                  L25: {
                    if (param0) {
                      stackIn_139_0 = 0;
                      break L25;
                    } else {
                      stackIn_139_0 = 1;
                      break L25;
                    }
                  }
                  fl.b(stackIn_139_0 != 0);
                  break L24;
                }
              }
              return true;
            }
          }
        } else {
          L26: {
            field_v = (vl) null;
            if (ng.field_b != 0) {
              break L26;
            } else {
              if (null != nl.field_f) {
                var3 = 0;
                break L26;
              } else {
                break L26;
              }
            }
          }
          L27: {
            if ((ng.field_b ^ -1) != -3) {
              break L27;
            } else {
              if (ve.b(-21835160)) {
                break L27;
              } else {
                var3 = 0;
                break L27;
              }
            }
          }
          if ((dc.field_b ^ -1) != -85) {
            if (85 != dc.field_b) {
              L28: {
                var4 = go.field_b;
                if (param0) {
                  stackIn_41_0 = 0;
                  break L28;
                } else {
                  stackIn_41_0 = 1;
                  break L28;
                }
              }
              if (ii.a(stackIn_41_0 != 0, (char) var4)) {
                if (var3 != 0) {
                  if (-81 < (fp.field_A.length() ^ -1)) {
                    L29: {
                      discarded$2 = fp.field_A.append((char) var4);
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
                      if ((ng.field_b ^ -1) != -3) {
                        L30: {
                          var7 = "";
                          if (ng.field_b == 0) {
                            L31: {
                              if (o.field_e != null) {
                                break L31;
                              } else {
                                if (!th.field_d) {
                                  break L31;
                                } else {
                                  var7 = "[" + fi.field_u + "] ";
                                  break L31;
                                }
                              }
                            }
                            if (null != o.field_e) {
                              L32: {
                                if (!ge.field_v) {
                                  break L32;
                                } else {
                                  if (null != jd.field_b) {
                                    var7 = "[" + jd.field_b + "] ";
                                    break L30;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                              var7 = "[" + rd.a(fm.field_a, new String[]{o.field_e.field_Fc}, (byte) 103) + "] ";
                              break L30;
                            } else {
                              break L30;
                            }
                          } else {
                            break L30;
                          }
                        }
                        var20 = var7 + var19 + ": ";
                        var5 = var5 - jq.field_y.c(var20);
                        break L29;
                      } else {
                        var24 = (CharSequence) ((Object) tk.field_p);
                        var18 = rd.a(hq.field_x, new String[]{ap.a(true, var24)}, (byte) 103);
                        var7 = var18;
                        var7 = var18;
                        var8 = rd.a(ek.field_fb, new String[]{var16}, (byte) 103);
                        var7 = var8;
                        var7 = var8;
                        var9 = jq.field_y.c(var18);
                        var10 = jq.field_y.c(var8);
                        if (var9 > var10) {
                          var5 = var5 - var9;
                          break L29;
                        } else {
                          var5 = var5 - var10;
                          break L29;
                        }
                      }
                    }
                    if (var5 >= jq.field_y.c(fp.field_A.toString())) {
                      return true;
                    } else {
                      uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              L33: {
                if (var3 == 0) {
                  break L33;
                } else {
                  if (fp.field_A.length() <= 0) {
                    break L33;
                  } else {
                    uk.a(' ', fp.field_A, -1 + fp.field_A.length(), false);
                    break L33;
                  }
                }
              }
              return true;
            }
          } else {
            L34: {
              if (var3 == 0) {
                if (-1 == (ng.field_b ^ -1)) {
                  break L34;
                } else {
                  L35: {
                    if (param0) {
                      stackIn_31_0 = 0;
                      break L35;
                    } else {
                      stackIn_31_0 = 1;
                      break L35;
                    }
                  }
                  fl.b(stackIn_31_0 != 0);
                  break L34;
                }
              } else {
                if (-1 > (fp.field_A.length() ^ -1)) {
                  var4_ref_String = fp.field_A.toString();
                  if (mm.a(var4_ref_String, (byte) -128)) {
                    var13 = (String) null;
                    var12 = (String) null;
                    wp.a((byte) 92, 0, (String) null, ck.field_j, (String) null, 2);
                    var15 = (String) null;
                    var14 = (String) null;
                    wp.a((byte) 92, 0, (String) null, w.field_m, (String) null, 2);
                    fl.b(true);
                    break L34;
                  } else {
                    L36: {
                      var5 = ng.field_b;
                      if (var5 != 0) {
                        break L36;
                      } else {
                        if (null == o.field_e) {
                          break L36;
                        } else {
                          var5 = 1;
                          break L36;
                        }
                      }
                    }
                    L37: {
                      if (-3 == (tm.a(var5, (byte) 18) ^ -1)) {
                        eo.a(0, param2, 1, var5);
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    c.a(-1, tk.field_p, (byte) -106, ng.field_b, param1, var4_ref_String);
                    fl.b(true);
                    break L34;
                  }
                } else {
                  fl.b(true);
                  break L34;
                }
              }
            }
            return true;
          }
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (!param3.field_q) {
                if (param3.f(-71)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param3 instanceof d) {
                param0 = param0 & ((d) ((Object) param3)).field_J;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param0) {
                stackIn_14_0 = this.field_x;
                break L3;
              } else {
                if (var6_int != 0) {
                  stackIn_14_0 = this.field_y;
                  break L3;
                } else {
                  stackIn_14_0 = this.field_z;
                  break L3;
                }
              }
            }
            L4: {
              var7 = stackIn_14_0;
              ac.a(this.field_B, param3.field_w + param4 + (param3.field_s - this.field_B[0].field_z >> 611386881), param3.field_o + param2, param3.field_t, var7, (byte) 122);
              if (!param0) {
                stackIn_17_0 = 7105644;
                break L4;
              } else {
                stackIn_17_0 = 16777215;
                break L4;
              }
            }
            L5: {
              var8 = stackIn_17_0;
              if (param1 == -20618) {
                break L5;
              } else {
                field_A = (int[]) null;
                break L5;
              }
            }
            this.field_k.a(param3.field_A, param3.field_o + param2, param4 - -param3.field_w + -2, param3.field_t, param3.field_s, var8, -1, 1, 1, this.field_k.field_F);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("hi.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param4 + ')');
        }
    }

    public hi() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, String param1) {
        try {
            if (param0 != 85) {
                field_A = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "hi.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_v = null;
        field_w = null;
        field_A = null;
        if (param0 > -82) {
            field_A = (int[]) null;
        }
    }

    private hi(int param0, int param1, int param2) {
        this.field_x = param2;
        this.field_y = param1;
        this.field_z = param0;
        this.field_k = wm.field_a;
        this.field_B = sf.field_U;
    }

    static {
        field_v = new vl();
    }
}
