/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends tc {
    jd field_l;
    static String field_w;
    int field_u;
    jb field_k;
    static boolean[] field_q;
    private float field_p;
    private int field_y;
    static String[] field_z;
    jd field_o;
    static int field_s;
    private float field_x;
    int field_n;
    static boolean field_t;
    ej field_r;
    private float field_v;
    int field_m;

    private final jd e(int param0) {
        if (((cl) this).field_k == null) {
            return null;
        }
        if (param0 != -8786) {
            return null;
        }
        Object var2 = null;
        if (!(!((cl) this).field_k.g(81))) {
            var2 = (Object) (Object) ((cl) this).field_r.field_D.c(((cl) this).field_k.field_o, true, ((cl) this).field_k.field_k);
        }
        return (jd) var2;
    }

    private final float a(int param0, int param1, boolean param2, nn param3) {
        int var5_int = 0;
        float var6 = 0.0f;
        ha var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ne var12 = null;
        jd var13 = null;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17_int = 0;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19_int = 0;
        float var19 = 0.0f;
        int var20_int = 0;
        float var20 = 0.0f;
        int var21_int = 0;
        float var21 = 0.0f;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        float var25 = 0.0f;
        int var25_int = 0;
        int var26_int = 0;
        float var26 = 0.0f;
        float var27 = 0.0f;
        int var27_int = 0;
        float var28 = 0.0f;
        int var29 = 0;
        int var30 = 0;
        int stackIn_13_0 = 0;
        int stackIn_39_0 = 0;
        float stackIn_77_0 = 0.0f;
        float stackIn_78_0 = 0.0f;
        float stackIn_79_0 = 0.0f;
        int stackIn_79_1 = 0;
        int stackIn_126_0 = 0;
        float stackIn_198_0 = 0.0f;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        float stackOut_76_0 = 0.0f;
        float stackOut_78_0 = 0.0f;
        int stackOut_78_1 = 0;
        float stackOut_77_0 = 0.0f;
        int stackOut_77_1 = 0;
        int stackOut_124_0 = 0;
        int stackOut_125_0 = 0;
        float stackOut_197_0 = 0.0f;
        float stackOut_196_0 = 0.0f;
        L0: {
          var29 = ArmiesOfGielinor.field_M ? 1 : 0;
          var5_int = 1000000;
          if (param1 == -5) {
            break L0;
          } else {
            ((cl) this).g(-12);
            break L0;
          }
        }
        L1: {
          L2: {
            var6 = -3.4028234663852886e+38f;
            var7 = ((cl) this).field_r.field_D;
            var8 = param0 % var7.field_v;
            var9 = param0 / var7.field_v;
            if (this != (Object) (Object) ((cl) this).field_r.field_J) {
              break L2;
            } else {
              if (((cl) this).field_r.field_N[param0] != -3.4028234663852886e+38f) {
                var6 = ((cl) this).field_r.field_N[param0];
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            var10 = ((cl) this).field_o.field_J - -(var7.field_v * ((cl) this).field_o.field_w);
            if (!((cl) this).field_o.field_bb) {
              break L3;
            } else {
              if (~param0 == ~var10) {
                return -3.4028234663852886e+38f;
              } else {
                break L3;
              }
            }
          }
          L4: {
            L5: {
              if (~param3.field_q[param0] >= ~param3.c(param1 + 27737)) {
                break L5;
              } else {
                if (var10 == param0) {
                  break L5;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L4;
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L4;
          }
          L6: {
            var11 = stackIn_13_0;
            var12 = var7.field_Eb[param0];
            if (var11 != 0) {
              break L6;
            } else {
              if (!((cl) this).field_o.c(false)) {
                break L6;
              } else {
                if (var10 == param0) {
                  break L6;
                } else {
                  if (((cl) this).field_o.field_H != 0) {
                    break L6;
                  } else {
                    if (((cl) this).field_o.field_Y < ((cl) this).field_o.field_t) {
                      break L6;
                    } else {
                      var11 = 1;
                      break L6;
                    }
                  }
                }
              }
            }
          }
          L7: {
            param3.a(var9, false, var8, (byte) 93);
            if ((4 & param3.field_e[param0]) != 0) {
              break L7;
            } else {
              if (var11 == 0) {
                break L7;
              } else {
                return -3.4028234663852886e+38f;
              }
            }
          }
          L8: {
            if (param3.field_u) {
              break L8;
            } else {
              L9: {
                if (var8 != ((cl) this).field_o.field_J) {
                  break L9;
                } else {
                  if (~var9 != ~((cl) this).field_o.field_w) {
                    break L9;
                  } else {
                    break L8;
                  }
                }
              }
              return -3.4028234663852886e+38f;
            }
          }
          L10: {
            var13 = var12.field_c;
            if (var13 == ((cl) this).field_o) {
              var13 = null;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            var14 = 0.0f;
            var15 = 0.0f;
            var6 = 0.0f;
            var16 = 0.0f;
            if (var13 != null) {
              if ((param3.field_e[param0] & 4) == 0) {
                return -3.4028234663852886e+38f;
              } else {
                if (0.0f == ((cl) this).field_x) {
                  break L11;
                } else {
                  L12: {
                    var17_int = 1000000;
                    var18 = -3.4028234663852886e+38f;
                    if (bw.field_m[((cl) this).field_o.field_N][0] != 4) {
                      stackOut_38_0 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      break L12;
                    } else {
                      stackOut_37_0 = 1;
                      stackIn_39_0 = stackOut_37_0;
                      break L12;
                    }
                  }
                  var19_int = stackIn_39_0;
                  var20_int = ((cl) this).field_o.B(3257);
                  var21_int = ((cl) this).field_o.l((byte) -79);
                  var22 = -var20_int;
                  L13: while (true) {
                    if (var22 > var20_int) {
                      if (1000000 == var17_int) {
                        return -3.4028234663852886e+38f;
                      } else {
                        var5_int = var17_int;
                        var16 = var18;
                        var6 = var6 + var16;
                        break L11;
                      }
                    } else {
                      var23 = -var20_int;
                      L14: while (true) {
                        if (var20_int < var23) {
                          var22++;
                          continue L13;
                        } else {
                          L15: {
                            var24 = Math.abs(var22) - -Math.abs(var23);
                            if (~var24 > ~var21_int) {
                              break L15;
                            } else {
                              if (var20_int < var24) {
                                break L15;
                              } else {
                                if (((cl) this).field_r.field_m.a(var8, -42, var19_int != 0, var23, var22, var9)) {
                                  L16: {
                                    var26_int = var23 + var8 - -(var7.field_v * (var22 + var9));
                                    if (var7.field_Eb[var26_int].field_c == null) {
                                      break L16;
                                    } else {
                                      if (var7.field_Eb[var26_int].field_c == ((cl) this).field_o) {
                                        break L16;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  var27 = this.a(param0, var8 - -var23, var9 - -var22, param1 ^ -2);
                                  if (var27 == -3.4028234663852886e+38f) {
                                    break L15;
                                  } else {
                                    L17: {
                                      L18: {
                                        if (var12.field_h == 11) {
                                          break L18;
                                        } else {
                                          if (var12.field_h != 7) {
                                            break L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      if (!var12.a(((cl) this).field_r.field_z, (byte) 91)) {
                                        break L17;
                                      } else {
                                        L19: {
                                          if (var27 >= 1.0f) {
                                            break L19;
                                          } else {
                                            var27 = 1.0f;
                                            break L19;
                                          }
                                        }
                                        var27 = var27 * ((cl) this).field_r.field_P[39];
                                        break L17;
                                      }
                                    }
                                    L20: {
                                      L21: {
                                        if (((cl) this).field_v == 0.0f) {
                                          break L21;
                                        } else {
                                          if (var12.a(false)) {
                                            var27 = var27 * ((cl) this).field_v;
                                            break L20;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                      var27 = var27 * ((cl) this).field_x;
                                      break L20;
                                    }
                                    var28 = this.a(var26_int, -5, false, param3);
                                    if (var28 == -3.4028234663852886e+38f) {
                                      break L15;
                                    } else {
                                      var27 = var28 + var27;
                                      if (var18 >= var27) {
                                        break L15;
                                      } else {
                                        var17_int = var26_int;
                                        var18 = var27;
                                        break L15;
                                      }
                                    }
                                  }
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          var23++;
                          continue L14;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              break L11;
            }
          }
          L22: {
            if (var13 != null) {
              break L22;
            } else {
              if (!var12.a(((cl) this).field_r.field_z, (byte) 91)) {
                break L22;
              } else {
                if (11 != var12.field_h) {
                  L23: {
                    stackOut_76_0 = var6;
                    stackIn_78_0 = stackOut_76_0;
                    stackIn_77_0 = stackOut_76_0;
                    if (var12.field_h != 7) {
                      stackOut_78_0 = stackIn_78_0;
                      stackOut_78_1 = 1;
                      stackIn_79_0 = stackOut_78_0;
                      stackIn_79_1 = stackOut_78_1;
                      break L23;
                    } else {
                      stackOut_77_0 = stackIn_77_0;
                      stackOut_77_1 = 2;
                      stackIn_79_0 = stackOut_77_0;
                      stackIn_79_1 = stackOut_77_1;
                      break L23;
                    }
                  }
                  var6 = stackIn_79_0 + (float)stackIn_79_1 * ((float)(-((cl) this).field_o.field_Y + ((cl) this).field_o.field_t) * ((cl) this).field_r.field_P[12]);
                  break L22;
                } else {
                  break L22;
                }
              }
            }
          }
          L24: {
            if (~var10 != ~param0) {
              break L24;
            } else {
              if (!((cl) this).field_o.a(23072)) {
                var6 = var6 + (float)(-((cl) this).field_o.field_Y + ((cl) this).field_o.field_t) * ((cl) this).field_r.field_P[12];
                break L24;
              } else {
                break L24;
              }
            }
          }
          L25: {
            L26: {
              if (var12.field_h == 11) {
                break L26;
              } else {
                if (var12.field_h != 7) {
                  break L25;
                } else {
                  break L26;
                }
              }
            }
            if (!var12.a(((cl) this).field_r.field_z, (byte) 91)) {
              break L25;
            } else {
              if (((cl) this).field_r.field_P[53] < (float)var7.field_H[((cl) this).field_r.field_z]) {
                var6 = var6 - ((cl) this).field_r.field_P[52] * (float)var7.field_H[((cl) this).field_r.field_z];
                break L25;
              } else {
                break L25;
              }
            }
          }
          var17 = 0.0f;
          var18 = 0.0f;
          var19 = 0.0f;
          var20 = 0.0f;
          var21 = 0.0f;
          var22 = ((cl) this).field_o.g(param1 ^ -5);
          var23 = ((cl) this).field_o.g(param1 + 5);
          var24 = 0;
          L27: while (true) {
            if (var24 >= 8) {
              L28: {
                var19 = ((cl) this).field_r.field_A[8][param0];
                var20 = var20 / (1.0f + var21);
                if (0.0f != var16) {
                  break L28;
                } else {
                  if (((cl) this).field_v != 0.0f) {
                    L29: {
                      var15 = ((cl) this).field_r.field_P[6] * ((cl) this).field_r.field_n[var23][9][param0];
                      if (((cl) this).field_o.field_O == var12.field_a) {
                        break L29;
                      } else {
                        if (var12.a(false)) {
                          var15 = var15 * ((cl) this).field_r.field_P[41];
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                    }
                    L30: {
                      var15 = var15 + ((cl) this).field_r.field_P[46] * var20;
                      var15 = var15 - ((cl) this).field_r.field_P[7] * var17;
                      var15 = var15 - var19 * ((cl) this).field_r.field_P[8];
                      if (!var12.a(false)) {
                        break L30;
                      } else {
                        if (((cl) this).field_o.field_J != var8) {
                          break L30;
                        } else {
                          if (~var9 != ~((cl) this).field_o.field_w) {
                            break L30;
                          } else {
                            if (~var12.field_m <= ~(((cl) this).field_o.g((byte) 122) * 4)) {
                              break L30;
                            } else {
                              if (~var12.field_a != ~((cl) this).field_o.field_O) {
                                var15 = var15 + 999999.0f;
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                          }
                        }
                      }
                    }
                    var6 = var6 + var15 * ((cl) this).field_v;
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L31: {
                L32: {
                  if (!((cl) this).field_o.u(8)) {
                    break L32;
                  } else {
                    if (((cl) this).field_o.field_H != 0) {
                      break L32;
                    } else {
                      stackOut_124_0 = 1;
                      stackIn_126_0 = stackOut_124_0;
                      break L31;
                    }
                  }
                }
                stackOut_125_0 = 0;
                stackIn_126_0 = stackOut_125_0;
                break L31;
              }
              L33: {
                var24 = stackIn_126_0;
                if (var16 != 0.0f) {
                  break L33;
                } else {
                  L34: {
                    if (var24 == 0) {
                      break L34;
                    } else {
                      if (param2) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  L35: {
                    var25 = ((cl) this).field_r.field_n[var23][9][param0];
                    if (0.0f != ((cl) this).field_v) {
                      break L35;
                    } else {
                      if (!((cl) this).field_o.c(false)) {
                        var25 = var25 - ((cl) this).field_r.field_V[param0];
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                  }
                  L36: {
                    if (((cl) this).field_o.field_H != 0) {
                      var25 = var25 * ((cl) this).field_r.field_P[60];
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    var14 = ((cl) this).field_r.field_P[4] * var25;
                    var14 = var14 + var18 * ((cl) this).field_r.field_P[5];
                    var26 = 1.0f;
                    if (!((cl) this).field_o.i(-21428)) {
                      break L37;
                    } else {
                      var26 = var26 * ((cl) this).field_r.field_P[58];
                      break L37;
                    }
                  }
                  L38: {
                    if (!((cl) this).field_o.c(false)) {
                      break L38;
                    } else {
                      var26 = var26 * ((cl) this).field_r.field_P[49];
                      break L38;
                    }
                  }
                  L39: {
                    var14 = var14 - var26 * (var17 * ((cl) this).field_r.field_P[40]);
                    if (!((cl) this).field_o.c(false)) {
                      break L39;
                    } else {
                      var14 = var14 + var20 * ((cl) this).field_r.field_P[57];
                      break L39;
                    }
                  }
                  L40: {
                    if (((cl) this).field_o.i(-21428)) {
                      break L40;
                    } else {
                      if (!var12.a(false)) {
                        break L40;
                      } else {
                        if (~((cl) this).field_r.field_z == ~var12.field_a) {
                          break L40;
                        } else {
                          var14 = var14 - ((cl) this).field_r.field_P[38] * var19;
                          break L40;
                        }
                      }
                    }
                  }
                  L41: {
                    if (!((cl) this).field_o.f((byte) -109)) {
                      break L41;
                    } else {
                      L42: {
                        var27_int = 0;
                        if (0 >= var8) {
                          break L42;
                        } else {
                          if (var7.field_Eb[-1 + param0].c(-58)) {
                            var27_int++;
                            break L42;
                          } else {
                            break L42;
                          }
                        }
                      }
                      L43: {
                        if (var7.field_v - 1 <= var8) {
                          break L43;
                        } else {
                          if (!var7.field_Eb[param0 - -1].c(117)) {
                            break L43;
                          } else {
                            var27_int++;
                            break L43;
                          }
                        }
                      }
                      L44: {
                        if (var9 <= 0) {
                          break L44;
                        } else {
                          if (var7.field_Eb[param0 - var7.field_v].c(param1 ^ 79)) {
                            var27_int++;
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                      }
                      L45: {
                        if (~var9 <= ~(-1 + var7.field_db)) {
                          break L45;
                        } else {
                          if (!var7.field_Eb[var7.field_v + param0].c(-117)) {
                            break L45;
                          } else {
                            var27_int++;
                            break L45;
                          }
                        }
                      }
                      var14 = var14 + ((cl) this).field_r.field_P[10] * (float)var27_int;
                      break L41;
                    }
                  }
                  L46: {
                    L47: {
                      if (((cl) this).field_o.p((byte) -107)) {
                        break L47;
                      } else {
                        if (((cl) this).field_o.d((byte) 105)) {
                          break L47;
                        } else {
                          break L46;
                        }
                      }
                    }
                    L48: {
                      var27_int = 0;
                      if (~var10 == ~(param0 - 1)) {
                        break L48;
                      } else {
                        if (var8 <= 0) {
                          break L48;
                        } else {
                          if (null == var7.field_Eb[param0 - 1].field_c) {
                            break L48;
                          } else {
                            if (((cl) this).field_o.field_O == var7.field_Eb[-1 + param0].field_c.field_O) {
                              var27_int++;
                              break L48;
                            } else {
                              break L48;
                            }
                          }
                        }
                      }
                    }
                    L49: {
                      if (var10 == 1 + param0) {
                        break L49;
                      } else {
                        if (var8 >= var7.field_v + -1) {
                          break L49;
                        } else {
                          if (null == var7.field_Eb[1 + param0].field_c) {
                            break L49;
                          } else {
                            if (((cl) this).field_o.field_O == var7.field_Eb[param0 - -1].field_c.field_O) {
                              var27_int++;
                              break L49;
                            } else {
                              break L49;
                            }
                          }
                        }
                      }
                    }
                    L50: {
                      if (-var7.field_v + param0 == var10) {
                        break L50;
                      } else {
                        if (var9 <= 0) {
                          break L50;
                        } else {
                          if (null == var7.field_Eb[-var7.field_v + param0].field_c) {
                            break L50;
                          } else {
                            if (~var7.field_Eb[-var7.field_v + param0].field_c.field_O != ~((cl) this).field_o.field_O) {
                              break L50;
                            } else {
                              var27_int++;
                              break L50;
                            }
                          }
                        }
                      }
                    }
                    L51: {
                      if (var10 == param0 - -var7.field_v) {
                        break L51;
                      } else {
                        if (var9 >= -1 + var7.field_db) {
                          break L51;
                        } else {
                          if (null == var7.field_Eb[var7.field_v + param0].field_c) {
                            break L51;
                          } else {
                            if (var7.field_Eb[var7.field_v + param0].field_c.field_O != ((cl) this).field_o.field_O) {
                              break L51;
                            } else {
                              var27_int++;
                              break L51;
                            }
                          }
                        }
                      }
                    }
                    var14 = var14 + (float)var27_int * ((cl) this).field_r.field_P[11];
                    break L46;
                  }
                  L52: {
                    if (((cl) this).field_o.s(124)) {
                      if (var7.field_Eb[param0].c(81)) {
                        var14 = var14 + ((cl) this).field_r.field_P[51];
                        break L52;
                      } else {
                        break L52;
                      }
                    } else {
                      break L52;
                    }
                  }
                  L53: {
                    if (0 == ((cl) this).field_o.field_H) {
                      break L53;
                    } else {
                      L54: {
                        if (!((cl) this).field_o.c(false)) {
                          stackOut_197_0 = 1.0f;
                          stackIn_198_0 = stackOut_197_0;
                          break L54;
                        } else {
                          stackOut_196_0 = ((cl) this).field_r.field_P[48];
                          stackIn_198_0 = stackOut_196_0;
                          break L54;
                        }
                      }
                      var27 = stackIn_198_0;
                      var14 = var14 + ((cl) this).field_r.field_I[((cl) this).field_o.g(0)][((cl) this).field_o.field_H + -1][param0] * var27;
                      break L53;
                    }
                  }
                  var6 = var6 + var14 * ((cl) this).field_p;
                  break L33;
                }
              }
              L55: {
                if (~param0 != ~var10) {
                  break L55;
                } else {
                  var6 = var6 + 0.0010000000474974513f;
                  break L55;
                }
              }
              if (this != (Object) (Object) ((cl) this).field_r.field_J) {
                break L1;
              } else {
                ((cl) this).field_r.field_N[param0] = var6;
                break L1;
              }
            } else {
              L56: {
                L57: {
                  L58: {
                    if (1 == var24) {
                      break L58;
                    } else {
                      if (0 != var24) {
                        break L57;
                      } else {
                        break L58;
                      }
                    }
                  }
                  if (var22 != 4) {
                    break L57;
                  } else {
                    break L56;
                  }
                }
                var17 = var17 + (float)fk.field_d[var24][var22] * ((cl) this).field_r.field_K[var24][param0] / 100.0f;
                break L56;
              }
              L59: {
                L60: {
                  if (var24 != 4) {
                    break L60;
                  } else {
                    if (((cl) this).field_o.j((byte) 92)) {
                      break L60;
                    } else {
                      break L59;
                    }
                  }
                }
                var18 = var18 + (float)fk.field_d[var22][var24] * ((cl) this).field_r.field_n[var23][var24][param0] / 100.0f;
                break L59;
              }
              var30 = 0;
              var25_int = var30;
              L61: while (true) {
                if (8 <= var30) {
                  var21 = var21 + ((cl) this).field_r.field_K[var24][param0];
                  var24++;
                  continue L27;
                } else {
                  var20 = var20 + ((cl) this).field_r.field_A[var30][param0] * ((cl) this).field_r.field_K[var24][param0] * (float)fk.field_d[var30][var24] / 100.0f;
                  var30++;
                  continue L61;
                }
              }
            }
          }
        }
        L62: {
          if (!param2) {
            break L62;
          } else {
            if (var5_int == 1000000) {
              if (var6 == 0.0f) {
                break L62;
              } else {
                ((cl) this).field_r.a((cl) this, (byte) 85).a(var9, var8, param1 ^ 104, var6);
                break L62;
              }
            } else {
              ((cl) this).field_r.a((cl) this, (byte) -88).a(var5_int / var7.field_v, var8, var5_int % var7.field_v, -120, var6, var9);
              break L62;
            }
          }
        }
        return var6;
    }

    final float a(boolean param0, byte param1) {
        nn var3 = null;
        sm var4 = null;
        float var5 = 0.0f;
        int var6 = 0;
        float var7 = 0.0f;
        int var8 = 0;
        nn var9 = null;
        nn stackIn_7_0 = null;
        float[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        float[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        float[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        float stackIn_27_2 = 0.0f;
        nn stackOut_6_0 = null;
        nn stackOut_5_0 = null;
        float[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        float[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        float stackOut_26_2 = 0.0f;
        float[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        float stackOut_25_2 = 0.0f;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            if (!((cl) this).field_o.field_s) {
              break L0;
            } else {
              if (((cl) this).field_o.field_B > 0) {
                break L0;
              } else {
                return -3.4028234663852886e+38f;
              }
            }
          }
        }
        L1: {
          if (param0) {
            stackOut_6_0 = ((cl) this).field_r.field_U;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            stackOut_5_0 = ((cl) this).field_r.field_l;
            stackIn_7_0 = stackOut_5_0;
            break L1;
          }
        }
        L2: {
          var9 = stackIn_7_0;
          var3 = var9;
          if (param1 < -122) {
            break L2;
          } else {
            jd discarded$1 = this.e(-4);
            break L2;
          }
        }
        L3: {
          var4 = ((cl) this).field_r.a((cl) this, (byte) 86);
          if (!param0) {
            break L3;
          } else {
            var4.b((byte) 72);
            break L3;
          }
        }
        L4: {
          var9.a(false, 20, ((cl) this).field_o.field_O, ((cl) this).field_o, -1, -1);
          if ((Object) (Object) ((cl) this).field_r.field_J != this) {
            break L4;
          } else {
            var6 = 0;
            L5: while (true) {
              if (((cl) this).field_r.field_N.length <= var6) {
                break L4;
              } else {
                ((cl) this).field_r.field_N[var6] = -3.4028234663852886e+38f;
                var6++;
                continue L5;
              }
            }
          }
        }
        var5 = -3.4028234663852886e+38f;
        var6 = 0;
        L6: while (true) {
          if (var9.field_q.length <= var6) {
            L7: {
              if (!param0) {
                var9.d(-57);
                break L7;
              } else {
                L8: {
                  ((cl) this).field_k = var4.a((byte) -90);
                  ((cl) this).field_l = this.e(-8786);
                  if (null == ((cl) this).field_k) {
                    break L8;
                  } else {
                    if (((cl) this).field_k.field_r == -2) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
                var5 = -3.4028234663852886e+38f;
                break L7;
              }
            }
            return var5;
          } else {
            L9: {
              if (!param0) {
                fs.field_b[var6] = 0.0f;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var7 = this.a(var6, -5, param0, var9);
              if (var5 >= var7) {
                break L10;
              } else {
                var5 = var7;
                break L10;
              }
            }
            if (!param0) {
              L11: {
                stackOut_24_0 = fs.field_b;
                stackOut_24_1 = var6;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (-3.4028234663852886e+38f != var7) {
                  stackOut_26_0 = (float[]) (Object) stackIn_26_0;
                  stackOut_26_1 = stackIn_26_1;
                  stackOut_26_2 = var7;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L11;
                } else {
                  stackOut_25_0 = (float[]) (Object) stackIn_25_0;
                  stackOut_25_1 = stackIn_25_1;
                  stackOut_25_2 = -1.0f;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L11;
                }
              }
              stackIn_27_0[stackIn_27_1] = stackIn_27_2;
              var6++;
              continue L6;
            } else {
              var6++;
              continue L6;
            }
          }
        }
    }

    private final int a(byte param0, boolean param1) {
        int[] var4 = null;
        int var5 = 0;
        ne var6 = null;
        int var7 = 0;
        nn var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] stackIn_3_0 = null;
        int[] stackOut_2_0 = null;
        int[] stackOut_1_0 = null;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var8 = ((cl) this).field_r.field_U;
          if (param1) {
            stackOut_2_0 = var8.field_q;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = var8.field_k;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = stackIn_3_0;
          var9 = var10;
          var4 = var9;
          if (param0 > 14) {
            break L1;
          } else {
            ((cl) this).field_x = 1.991025686264038f;
            break L1;
          }
        }
        var5 = 0;
        L2: while (true) {
          if (var5 >= var8.field_q.length) {
            return 1000000;
          } else {
            if (0 < var10[var5]) {
              if (var10[var5] <= var8.c(27732)) {
                var6 = ((cl) this).field_r.field_D.field_Eb[var5];
                if (var6.a(false)) {
                  if (!var6.a(((cl) this).field_r.field_z, (byte) 91)) {
                    L3: {
                      if (null == var6.field_c) {
                        break L3;
                      } else {
                        if (!param1) {
                          if (((cl) this).field_r.field_z == var6.field_c.field_O) {
                            break L3;
                          } else {
                            var5++;
                            continue L2;
                          }
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    }
                    return var5;
                  } else {
                    var5++;
                    continue L2;
                  }
                } else {
                  var5++;
                  continue L2;
                }
              } else {
                var5++;
                continue L2;
              }
            } else {
              var5++;
              continue L2;
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        bv var2 = vl.field_n;
        var2.h(param0 ^ 32164, param1);
        var2.field_q = var2.field_q + 1;
        int var3 = var2.field_q;
        var2.b(1, param0);
        var2.b(1, vu.field_M.field_nc);
        int var4 = (vu.field_M.field_ac << 6) + vu.field_M.field_Tb;
        var2.b(1, var4);
        var2.a(vu.field_M.field_pc, 0, vu.field_M.field_pc.length, -38);
        var2.e(var2.field_q - var3, param0 ^ 5935);
    }

    public static void a(int param0) {
        field_q = null;
        field_z = null;
        field_w = null;
    }

    final boolean a(byte param0, cl param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (param1 == null) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1.field_y > ((cl) this).field_y) {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              } else {
                if (((cl) this).field_y == param1.field_y) {
                  L1: {
                    if (param1.field_o.field_J - -param1.field_o.field_w >= ((cl) this).field_o.field_J + ((cl) this).field_o.field_w) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L1;
                    }
                  }
                  return stackIn_10_0 != 0;
                } else {
                  if (param0 < -78) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("cl.D(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0 != 0;
    }

    private final void a(byte param0) {
        nn var2 = ((cl) this).field_r.field_U;
        var2.a(false, 81, ((cl) this).field_r.field_z, ((cl) this).field_o, -1, -1);
    }

    private final void c(int param0, int param1) {
        int var4 = 0;
        int var3 = param0 % ((cl) this).field_r.field_D.field_v;
        int var5 = param0 / ((cl) this).field_r.field_D.field_v;
        float var6 = ((cl) this).field_r.field_P[54] * ((cl) this).field_r.field_n[0][9][param0];
        ((cl) this).field_r.field_m.a(((cl) this).field_r.field_V, true, var6, 0, (byte) -4, 9, var5, var3);
        ((cl) this).field_r.field_m.a(((cl) this).field_r.field_V, true, var6, 0, (byte) -4, 9, ((cl) this).field_o.field_w, ((cl) this).field_o.field_J);
    }

    final void g(int param0) {
        if (null != ((cl) this).field_k) {
            if (!(((cl) this).field_k.field_r == -2)) {
                int discarded$0 = ((cl) this).field_k.a((byte) 5, ((cl) this).field_r);
            }
        }
        if (param0 != 4) {
            return;
        }
        ((cl) this).field_r.field_U.d(param0 + -34);
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        ne var4 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!((cl) this).field_o.field_s) {
          L0: {
            if (((cl) this).field_o.i(-21428)) {
              ((cl) this).field_v = ((cl) this).field_r.field_P[33];
              ((cl) this).field_x = ((cl) this).field_r.field_P[34];
              ((cl) this).field_p = ((cl) this).field_r.field_P[35];
              break L0;
            } else {
              ((cl) this).field_v = 0.0f;
              ((cl) this).field_x = ((cl) this).field_r.field_P[36];
              ((cl) this).field_p = ((cl) this).field_r.field_P[37];
              break L0;
            }
          }
          L1: {
            ((cl) this).field_y = 100;
            if (!((cl) this).field_o.i(-21428)) {
              L2: {
                if (((cl) this).field_o.g(0) != 5) {
                  break L2;
                } else {
                  ((cl) this).field_y = 10;
                  break L2;
                }
              }
              L3: {
                if (2 == ((cl) this).field_o.g(0)) {
                  break L3;
                } else {
                  if (3 != ((cl) this).field_o.g(0)) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              ((cl) this).field_y = 200;
              break L1;
            } else {
              ((cl) this).field_y = 50;
              this.a((byte) 67);
              if (this.a((byte) 124, true) != 1000000) {
                ((cl) this).field_y = 300;
                break L1;
              } else {
                var2 = this.a((byte) 125, false);
                if (var2 == 1000000) {
                  break L1;
                } else {
                  this.c(var2, 122);
                  ((cl) this).field_y = 1;
                  break L1;
                }
              }
            }
          }
          L4: {
            if (((cl) this).field_o.c(false)) {
              ((cl) this).field_y = ((cl) this).field_y - 300;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (((cl) this).field_o.field_H == 0) {
              break L5;
            } else {
              var4 = ((cl) this).field_r.field_D.field_Eb[((cl) this).field_r.field_D.field_v * ((cl) this).field_o.field_w + ((cl) this).field_o.field_J];
              if (var4.a((byte) -107) == ((cl) this).field_o.field_H) {
                ((cl) this).field_o.field_H = 0;
                break L5;
              } else {
                break L5;
              }
            }
          }
          L6: {
            var2 = -97 % ((param0 - -13) / 63);
            if (((cl) this).field_o.field_H != 0) {
              ((cl) this).field_y = ((cl) this).field_y + 300;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!((cl) this).field_o.field_bb) {
              break L7;
            } else {
              ((cl) this).field_y = ((cl) this).field_y + 500;
              break L7;
            }
          }
          ((cl) this).field_y = ((cl) this).field_y + ((cl) this).field_o.g((byte) 122);
          return;
        } else {
          return;
        }
    }

    private final float a(int param0, int param1, int param2, int param3) {
        float var5 = 0.0f;
        ha var6 = null;
        int var7 = 0;
        int var8 = 0;
        ne var9 = null;
        jd var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        float var21 = 0.0f;
        int[] var25 = null;
        int stackIn_3_0 = 0;
        float stackIn_30_0 = 0.0f;
        float stackIn_33_0 = 0.0f;
        float stackIn_36_0 = 0.0f;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        float stackOut_29_0 = 0.0f;
        float stackOut_28_0 = 0.0f;
        float stackOut_32_0 = 0.0f;
        float stackOut_31_0 = 0.0f;
        float stackOut_35_0 = 0.0f;
        float stackOut_34_0 = 0.0f;
        L0: {
          var5 = 0.0f;
          var6 = ((cl) this).field_r.field_D;
          var7 = param0 % var6.field_v;
          var8 = param0 / var6.field_v;
          var9 = var6.field_Eb[param0];
          var10 = var9.field_c;
          var11 = -param1 + var7;
          var12 = var8 + -param2;
          if (Math.abs(var11) + Math.abs(var12) != 1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var13 = stackIn_3_0;
          var25 = var6.a(var10, param2, (byte) -123, var12, ((cl) this).field_o, var11, param1);
          var15 = var25[0];
          var16 = var25[1];
          var17 = 0;
          if (var10.g((byte) 122) < var15) {
            var15 = var10.g((byte) 122);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var18 = 0;
          if (!((cl) this).field_o.field_C) {
            break L2;
          } else {
            if (var13 != 0) {
              var17 = var15;
              if (var17 <= -((cl) this).field_o.field_Y + ((cl) this).field_o.field_t) {
                break L2;
              } else {
                var17 = -((cl) this).field_o.field_Y + ((cl) this).field_o.field_t;
                break L2;
              }
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (((cl) this).field_o.g((byte) 122) - -var17 >= var16) {
            break L3;
          } else {
            var16 = var17 + ((cl) this).field_o.g((byte) 122);
            break L3;
          }
        }
        L4: {
          if ((2 & var25[2]) == 0) {
            L5: {
              if (!var10.field_C) {
                break L5;
              } else {
                if (var13 != 0) {
                  var18 = var16;
                  if (-var10.field_Y + var10.field_t < var18) {
                    var18 = -var10.field_Y + var10.field_t;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
            if (0 != (var25[2] & 1)) {
              var18++;
              break L4;
            } else {
              break L4;
            }
          } else {
            var16 = 0;
            var17++;
            break L4;
          }
        }
        L6: {
          if (!((cl) this).field_o.a(var10, (byte) 115)) {
            break L6;
          } else {
            if (var10.x(-99)) {
              break L6;
            } else {
              var17 = 0;
              var18 = 0;
              var15 = var10.g((byte) 122);
              var16 = 0;
              break L6;
            }
          }
        }
        L7: {
          var19 = var15 + -var18;
          var20 = var16 - var17;
          if (!var10.c(false)) {
            stackOut_29_0 = 1.0f;
            stackIn_30_0 = stackOut_29_0;
            break L7;
          } else {
            stackOut_28_0 = ((cl) this).field_r.field_P[61];
            stackIn_30_0 = stackOut_28_0;
            break L7;
          }
        }
        L8: {
          var21 = stackIn_30_0;
          var5 = var5 + (float)var19 * ((cl) this).field_r.field_P[0] * var21;
          if (!((cl) this).field_o.c(false)) {
            stackOut_32_0 = 1.0f;
            stackIn_33_0 = stackOut_32_0;
            break L8;
          } else {
            var21 = ((cl) this).field_r.field_P[48];
            stackOut_31_0 = var21;
            stackIn_33_0 = stackOut_31_0;
            break L8;
          }
        }
        L9: {
          var21 = stackIn_33_0;
          var5 = var5 - (float)var20 * ((cl) this).field_r.field_P[1] * var21;
          if (var9.k(12)) {
            var21 = ((cl) this).field_r.field_P[50];
            stackOut_35_0 = var21;
            stackIn_36_0 = stackOut_35_0;
            break L9;
          } else {
            stackOut_34_0 = 1.0f;
            stackIn_36_0 = stackOut_34_0;
            break L9;
          }
        }
        L10: {
          var21 = stackIn_36_0;
          var5 = var5 + ((cl) this).field_r.field_P[2] * var21 * ((cl) this).field_r.field_n[0][9][param0];
          if (0 == (var25[2] & 1)) {
            break L10;
          } else {
            if (!var10.c(false)) {
              var5 = var5 - ((cl) this).field_r.field_P[32];
              break L10;
            } else {
              break L10;
            }
          }
        }
        L11: {
          if (!var10.a(23072)) {
            break L11;
          } else {
            var5 = var5 * ((cl) this).field_r.field_P[47];
            break L11;
          }
        }
        L12: {
          if (var10.g(0) == param3) {
            var5 = var5 * ((cl) this).field_r.field_P[31];
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (var10.i(-21428)) {
            var5 = var5 * ((cl) this).field_r.field_P[30];
            if (!var6.field_Eb[param0].a(false)) {
              break L13;
            } else {
              if (var6.field_Eb[param0].field_a != var10.field_O) {
                var5 = var5 * ((cl) this).field_r.field_P[30];
                break L13;
              } else {
                break L13;
              }
            }
          } else {
            break L13;
          }
        }
        L14: {
          if ((var25[2] & 1) == 0) {
            break L14;
          } else {
            if (1 < var25[0]) {
              break L14;
            } else {
              return -3.4028234663852886e+38f;
            }
          }
        }
        return var5;
    }

    cl(ej param0, jd param1) {
        try {
            ((cl) this).field_r = param0;
            ((cl) this).field_o = param1;
            ((cl) this).field_o.field_p = (cl) this;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "cl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_w = "Leaders cannot carry a ring of life.";
    }
}
