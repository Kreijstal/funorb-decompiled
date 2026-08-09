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
        if (this.field_k == null) {
            return null;
        }
        if (param0 != -8786) {
            return (jd) null;
        }
        Object var2 = null;
        if (!(!this.field_k.g(81))) {
            var2 = this.field_r.field_D.c(this.field_k.field_o, true, this.field_k.field_k);
        }
        return (jd) (var2);
    }

    private final float a(int param0, int param1, boolean param2, nn param3) {
        float stackIn_10_0 = 0.0f;
        int stackIn_17_0 = 0;
        float stackIn_26_0 = 0.0f;
        float stackIn_32_0 = 0.0f;
        float stackIn_41_0 = 0.0f;
        int stackIn_46_0 = 0;
        float stackIn_83_0 = 0.0f;
        float stackIn_91_0 = 0.0f;
        float stackIn_92_0 = 0.0f;
        int stackIn_92_1 = 0;
        int stackIn_141_0 = 0;
        float stackIn_213_0 = 0.0f;
        float stackIn_226_0 = 0.0f;
        RuntimeException stackIn_229_0 = null;
        StringBuilder stackIn_229_1 = null;
        RuntimeException stackIn_230_0 = null;
        StringBuilder stackIn_230_1 = null;
        String stackIn_230_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        float var6 = 0.0f;
        ha var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ne var12 = null;
        Object var13 = null;
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
        var29 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 1000000;
              if (param1 == -5) {
                break L1;
              } else {
                this.g(-12);
                break L1;
              }
            }
            L2: {
              L3: {
                var6 = -3.4028234663852886e+38f;
                var7 = this.field_r.field_D;
                var8 = param0 % var7.field_v;
                var9 = param0 / var7.field_v;
                if (this != this.field_r.field_J) {
                  break L3;
                } else {
                  if (this.field_r.field_N[param0] != -3.4028234663852886e+38f) {
                    var6 = this.field_r.field_N[param0];
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var10 = this.field_o.field_J - -(var7.field_v * this.field_o.field_w);
                if (!this.field_o.field_bb) {
                  break L4;
                } else {
                  if (param0 == var10) {
                    stackIn_10_0 = -3.4028234663852886e+38f;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (param3.field_q[param0] > param3.c(param1 + 27737)) {
                  if (var10 != param0) {
                    stackIn_17_0 = 1;
                    break L5;
                  } else {
                    stackIn_17_0 = 0;
                    break L5;
                  }
                } else {
                  stackIn_17_0 = 0;
                  break L5;
                }
              }
              L6: {
                var11 = stackIn_17_0;
                var12 = var7.field_Eb[param0];
                if (var11 != 0) {
                  break L6;
                } else {
                  if (!this.field_o.c(false)) {
                    break L6;
                  } else {
                    if (var10 == param0) {
                      break L6;
                    } else {
                      if (-1 != (this.field_o.field_H ^ -1)) {
                        break L6;
                      } else {
                        if (this.field_o.field_Y < this.field_o.field_t) {
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
                    stackIn_26_0 = -3.4028234663852886e+38f;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L8: {
                if (param3.field_u) {
                  break L8;
                } else {
                  L9: {
                    if (var8 != this.field_o.field_J) {
                      break L9;
                    } else {
                      if (var9 != this.field_o.field_w) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  stackIn_32_0 = -3.4028234663852886e+38f;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
              L10: {
                var13 = var12.field_c;
                if (var13 == this.field_o) {
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
                    stackIn_41_0 = -3.4028234663852886e+38f;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (0.0f == this.field_x) {
                      break L11;
                    } else {
                      L12: {
                        var17_int = 1000000;
                        var18 = -3.4028234663852886e+38f;
                        if (bw.field_m[this.field_o.field_N][0] != 4) {
                          stackIn_46_0 = 0;
                          break L12;
                        } else {
                          stackIn_46_0 = 1;
                          break L12;
                        }
                      }
                      var19_int = stackIn_46_0;
                      var20_int = this.field_o.B(3257);
                      var21_int = this.field_o.l((byte) -79);
                      var22 = -var20_int;
                      L13: while (true) {
                        if (var22 > var20_int) {
                          if (1000000 == var17_int) {
                            stackIn_83_0 = -3.4028234663852886e+38f;
                            decompiledRegionSelector0 = 4;
                            break L0;
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
                              var24 = Math.abs(var22) - -Math.abs(var23);
                              if ((var24 ^ -1) <= (var21_int ^ -1)) {
                                if (var20_int >= var24) {
                                  L15: {
                                    if (this.field_r.field_m.a(var8, -42, var19_int != 0, var23, var22, var9)) {
                                      L16: {
                                        var26_int = var23 + var8 - -(var7.field_v * (var22 + var9));
                                        if (var7.field_Eb[var26_int].field_c == null) {
                                          break L16;
                                        } else {
                                          if (var7.field_Eb[var26_int].field_c == this.field_o) {
                                            break L16;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      var27 = this.a(param0, var8 - -var23, var9 - -var22, param1 ^ -2);
                                      if (var27 != -3.4028234663852886e+38f) {
                                        L17: {
                                          L18: {
                                            if (-12 == (var12.field_h ^ -1)) {
                                              break L18;
                                            } else {
                                              if (var12.field_h != 7) {
                                                break L17;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          if (!var12.a(this.field_r.field_z, (byte) 91)) {
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
                                            var27 = var27 * this.field_r.field_P[39];
                                            break L17;
                                          }
                                        }
                                        L20: {
                                          L21: {
                                            if (this.field_v == 0.0f) {
                                              break L21;
                                            } else {
                                              if (var12.a(false)) {
                                                var27 = var27 * this.field_v;
                                                break L20;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                          var27 = var27 * this.field_x;
                                          break L20;
                                        }
                                        var28 = this.a(var26_int, -5, false, param3);
                                        if (var28 != -3.4028234663852886e+38f) {
                                          var27 = var28 + var27;
                                          if (var18 < var27) {
                                            var17_int = var26_int;
                                            var18 = var27;
                                            break L15;
                                          } else {
                                            var23++;
                                            continue L14;
                                          }
                                        } else {
                                          var23++;
                                          continue L14;
                                        }
                                      } else {
                                        var23++;
                                        continue L14;
                                      }
                                    } else {
                                      break L15;
                                    }
                                  }
                                  var23++;
                                  continue L14;
                                } else {
                                  var23++;
                                  continue L14;
                                }
                              } else {
                                var23++;
                                continue L14;
                              }
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
                  if (!var12.a(this.field_r.field_z, (byte) 91)) {
                    break L22;
                  } else {
                    if (11 != var12.field_h) {
                      L23: {
                        stackIn_91_0 = var6;

                        if (var12.field_h != 7) {
                          stackIn_92_0 = stackIn_91_0;
                          stackIn_92_1 = 1;
                          break L23;
                        } else {
                          stackIn_92_0 = stackIn_91_0;
                          stackIn_92_1 = 2;
                          break L23;
                        }
                      }
                      var6 = stackIn_92_0 + (float)stackIn_92_1 * ((float)(-this.field_o.field_Y + this.field_o.field_t) * this.field_r.field_P[12]);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
              }
              L24: {
                if (var10 != param0) {
                  break L24;
                } else {
                  if (!this.field_o.a(23072)) {
                    var6 = var6 + (float)(-this.field_o.field_Y + this.field_o.field_t) * this.field_r.field_P[12];
                    break L24;
                  } else {
                    break L24;
                  }
                }
              }
              L25: {
                L26: {
                  if ((var12.field_h ^ -1) == -12) {
                    break L26;
                  } else {
                    if (-8 != (var12.field_h ^ -1)) {
                      break L25;
                    } else {
                      break L26;
                    }
                  }
                }
                if (!var12.a(this.field_r.field_z, (byte) 91)) {
                  break L25;
                } else {
                  if (this.field_r.field_P[53] < (float)var7.field_H[this.field_r.field_z]) {
                    var6 = var6 - this.field_r.field_P[52] * (float)var7.field_H[this.field_r.field_z];
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
              var22 = this.field_o.g(param1 ^ -5);
              var23 = this.field_o.g(param1 + 5);
              var24 = 0;
              L27: while (true) {
                if ((var24 ^ -1) <= -9) {
                  L28: {
                    var19 = this.field_r.field_A[8][param0];
                    var20 = var20 / (1.0f + var21);
                    if (0.0f != var16) {
                      break L28;
                    } else {
                      if (this.field_v != 0.0f) {
                        L29: {
                          var15 = this.field_r.field_P[6] * this.field_r.field_n[var23][9][param0];
                          if (this.field_o.field_O == var12.field_a) {
                            break L29;
                          } else {
                            if (var12.a(false)) {
                              var15 = var15 * this.field_r.field_P[41];
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                        }
                        L30: {
                          var15 = var15 + this.field_r.field_P[46] * var20;
                          var15 = var15 - this.field_r.field_P[7] * var17;
                          var15 = var15 - var19 * this.field_r.field_P[8];
                          if (!var12.a(false)) {
                            break L30;
                          } else {
                            if (this.field_o.field_J != var8) {
                              break L30;
                            } else {
                              if (var9 != this.field_o.field_w) {
                                break L30;
                              } else {
                                if (var12.field_m >= this.field_o.g((byte) 122) * 4) {
                                  break L30;
                                } else {
                                  if (var12.field_a != this.field_o.field_O) {
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
                        var6 = var6 + var15 * this.field_v;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                  L31: {
                    if (this.field_o.u(8)) {
                      if (this.field_o.field_H == 0) {
                        stackIn_141_0 = 1;
                        break L31;
                      } else {
                        stackIn_141_0 = 0;
                        break L31;
                      }
                    } else {
                      stackIn_141_0 = 0;
                      break L31;
                    }
                  }
                  L32: {
                    var24 = stackIn_141_0;
                    if (var16 != 0.0f) {
                      break L32;
                    } else {
                      L33: {
                        if (var24 == 0) {
                          break L33;
                        } else {
                          if (param2) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      L34: {
                        var25 = this.field_r.field_n[var23][9][param0];
                        if (0.0f != this.field_v) {
                          break L34;
                        } else {
                          if (!this.field_o.c(false)) {
                            var25 = var25 - this.field_r.field_V[param0];
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                      }
                      L35: {
                        if (-1 != (this.field_o.field_H ^ -1)) {
                          var25 = var25 * this.field_r.field_P[60];
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                      L36: {
                        var14 = this.field_r.field_P[4] * var25;
                        var14 = var14 + var18 * this.field_r.field_P[5];
                        var26 = 1.0f;
                        if (!this.field_o.i(-21428)) {
                          break L36;
                        } else {
                          var26 = var26 * this.field_r.field_P[58];
                          break L36;
                        }
                      }
                      L37: {
                        if (!this.field_o.c(false)) {
                          break L37;
                        } else {
                          var26 = var26 * this.field_r.field_P[49];
                          break L37;
                        }
                      }
                      L38: {
                        var14 = var14 - var26 * (var17 * this.field_r.field_P[40]);
                        if (!this.field_o.c(false)) {
                          break L38;
                        } else {
                          var14 = var14 + var20 * this.field_r.field_P[57];
                          break L38;
                        }
                      }
                      L39: {
                        if (this.field_o.i(-21428)) {
                          break L39;
                        } else {
                          if (!var12.a(false)) {
                            break L39;
                          } else {
                            if (this.field_r.field_z == var12.field_a) {
                              break L39;
                            } else {
                              var14 = var14 - this.field_r.field_P[38] * var19;
                              break L39;
                            }
                          }
                        }
                      }
                      L40: {
                        if (!this.field_o.f((byte) -109)) {
                          break L40;
                        } else {
                          L41: {
                            var27_int = 0;
                            if (0 >= var8) {
                              break L41;
                            } else {
                              if (var7.field_Eb[-1 + param0].c(-58)) {
                                var27_int++;
                                break L41;
                              } else {
                                break L41;
                              }
                            }
                          }
                          L42: {
                            if (var7.field_v - 1 <= var8) {
                              break L42;
                            } else {
                              if (!var7.field_Eb[param0 - -1].c(117)) {
                                break L42;
                              } else {
                                var27_int++;
                                break L42;
                              }
                            }
                          }
                          L43: {
                            if (var9 <= 0) {
                              break L43;
                            } else {
                              if (var7.field_Eb[param0 - var7.field_v].c(param1 ^ 79)) {
                                var27_int++;
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                          }
                          L44: {
                            if (var9 >= -1 + var7.field_db) {
                              break L44;
                            } else {
                              if (!var7.field_Eb[var7.field_v + param0].c(-117)) {
                                break L44;
                              } else {
                                var27_int++;
                                break L44;
                              }
                            }
                          }
                          var14 = var14 + this.field_r.field_P[10] * (float)var27_int;
                          break L40;
                        }
                      }
                      L45: {
                        L46: {
                          if (this.field_o.p((byte) -107)) {
                            break L46;
                          } else {
                            if (this.field_o.d((byte) 105)) {
                              break L46;
                            } else {
                              break L45;
                            }
                          }
                        }
                        L47: {
                          var27_int = 0;
                          if (var10 == param0 - 1) {
                            break L47;
                          } else {
                            if ((var8 ^ -1) >= -1) {
                              break L47;
                            } else {
                              if (null == var7.field_Eb[param0 - 1].field_c) {
                                break L47;
                              } else {
                                if (this.field_o.field_O == var7.field_Eb[-1 + param0].field_c.field_O) {
                                  var27_int++;
                                  break L47;
                                } else {
                                  break L47;
                                }
                              }
                            }
                          }
                        }
                        L48: {
                          if (var10 == 1 + param0) {
                            break L48;
                          } else {
                            if (var8 >= var7.field_v + -1) {
                              break L48;
                            } else {
                              if (null == var7.field_Eb[1 + param0].field_c) {
                                break L48;
                              } else {
                                if (this.field_o.field_O == var7.field_Eb[param0 - -1].field_c.field_O) {
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
                          if (-var7.field_v + param0 == var10) {
                            break L49;
                          } else {
                            if ((var9 ^ -1) >= -1) {
                              break L49;
                            } else {
                              if (null == var7.field_Eb[-var7.field_v + param0].field_c) {
                                break L49;
                              } else {
                                if (var7.field_Eb[-var7.field_v + param0].field_c.field_O != this.field_o.field_O) {
                                  break L49;
                                } else {
                                  var27_int++;
                                  break L49;
                                }
                              }
                            }
                          }
                        }
                        L50: {
                          if (var10 == param0 - -var7.field_v) {
                            break L50;
                          } else {
                            if (var9 >= -1 + var7.field_db) {
                              break L50;
                            } else {
                              if (null == var7.field_Eb[var7.field_v + param0].field_c) {
                                break L50;
                              } else {
                                if (var7.field_Eb[var7.field_v + param0].field_c.field_O != this.field_o.field_O) {
                                  break L50;
                                } else {
                                  var27_int++;
                                  break L50;
                                }
                              }
                            }
                          }
                        }
                        var14 = var14 + (float)var27_int * this.field_r.field_P[11];
                        break L45;
                      }
                      L51: {
                        if (this.field_o.s(124)) {
                          if (var7.field_Eb[param0].c(81)) {
                            var14 = var14 + this.field_r.field_P[51];
                            break L51;
                          } else {
                            break L51;
                          }
                        } else {
                          break L51;
                        }
                      }
                      L52: {
                        if (0 == this.field_o.field_H) {
                          break L52;
                        } else {
                          L53: {
                            if (!this.field_o.c(false)) {
                              stackIn_213_0 = 1.0f;
                              break L53;
                            } else {
                              stackIn_213_0 = this.field_r.field_P[48];
                              break L53;
                            }
                          }
                          var27 = stackIn_213_0;
                          var14 = var14 + this.field_r.field_I[this.field_o.g(0)][this.field_o.field_H + -1][param0] * var27;
                          break L52;
                        }
                      }
                      var6 = var6 + var14 * this.field_p;
                      break L32;
                    }
                  }
                  L54: {
                    if (param0 != var10) {
                      break L54;
                    } else {
                      var6 = var6 + 0.0010000000474974513f;
                      break L54;
                    }
                  }
                  if (this != this.field_r.field_J) {
                    break L2;
                  } else {
                    this.field_r.field_N[param0] = var6;
                    break L2;
                  }
                } else {
                  L55: {
                    L56: {
                      L57: {
                        if (1 == var24) {
                          break L57;
                        } else {
                          if (0 != var24) {
                            break L56;
                          } else {
                            break L57;
                          }
                        }
                      }
                      if (var22 != 4) {
                        break L56;
                      } else {
                        break L55;
                      }
                    }
                    var17 = var17 + (float)fk.field_d[var24][var22] * this.field_r.field_K[var24][param0] / 100.0f;
                    break L55;
                  }
                  L58: {
                    L59: {
                      if ((var24 ^ -1) != -5) {
                        break L59;
                      } else {
                        if (this.field_o.j((byte) 92)) {
                          break L59;
                        } else {
                          break L58;
                        }
                      }
                    }
                    var18 = var18 + (float)fk.field_d[var22][var24] * this.field_r.field_n[var23][var24][param0] / 100.0f;
                    break L58;
                  }
                  var30 = 0;
                  var25_int = var30;
                  L60: while (true) {
                    if (8 <= var30) {
                      var21 = var21 + this.field_r.field_K[var24][param0];
                      var24++;
                      continue L27;
                    } else {
                      var20 = var20 + this.field_r.field_A[var30][param0] * this.field_r.field_K[var24][param0] * (float)fk.field_d[var30][var24] / 100.0f;
                      var30++;
                      continue L60;
                    }
                  }
                }
              }
            }
            L61: {
              if (!param2) {
                break L61;
              } else {
                if (var5_int == 1000000) {
                  if (var6 == 0.0f) {
                    break L61;
                  } else {
                    this.field_r.a((cl) (this), (byte) 85).a(var9, var8, param1 ^ 104, var6);
                    break L61;
                  }
                } else {
                  this.field_r.a((cl) (this), (byte) -88).a(var5_int / var7.field_v, var8, var5_int % var7.field_v, -120, var6, var9);
                  break L61;
                }
              }
            }
            stackIn_226_0 = var6;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L62: {
            var5 = decompiledCaughtException;
            stackIn_229_0 = (RuntimeException) (var5);

            stackIn_229_1 = new StringBuilder().append("cl.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_230_0 = (RuntimeException) ((Object) stackIn_229_0);
              stackIn_230_1 = (StringBuilder) ((Object) stackIn_229_1);
              stackIn_230_2 = "null";
              break L62;
            } else {
              stackIn_230_0 = (RuntimeException) ((Object) stackIn_229_0);
              stackIn_230_1 = (StringBuilder) ((Object) stackIn_229_1);
              stackIn_230_2 = "{...}";
              break L62;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_230_0), stackIn_230_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_26_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_32_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_41_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_83_0;
                } else {
                  return stackIn_226_0;
                }
              }
            }
          }
        }
    }

    final float a(boolean param0, byte param1) {
        jd discarded$0 = null;
        nn stackIn_7_0 = null;
        float[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        float[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        float stackIn_27_2 = 0.0f;
        nn var3;
        sm var4;
        float var5;
        int var6;
        float var7;
        int var8;
        nn var9;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            if (!this.field_o.field_s) {
              break L0;
            } else {
              if (-1 > (this.field_o.field_B ^ -1)) {
                break L0;
              } else {
                return -3.4028234663852886e+38f;
              }
            }
          }
        }
        L1: {
          if (param0) {
            stackIn_7_0 = this.field_r.field_U;
            break L1;
          } else {
            stackIn_7_0 = this.field_r.field_l;
            break L1;
          }
        }
        L2: {
          var9 = stackIn_7_0;
          var3 = var9;
          if (param1 < -122) {
            break L2;
          } else {
            discarded$0 = this.e(-4);
            break L2;
          }
        }
        L3: {
          var4 = this.field_r.a((cl) (this), (byte) 86);
          if (!param0) {
            break L3;
          } else {
            var4.b((byte) 72);
            break L3;
          }
        }
        L4: {
          var9.a(false, 20, this.field_o.field_O, this.field_o, -1, -1);
          if (this.field_r.field_J != this) {
            break L4;
          } else {
            var6 = 0;
            L5: while (true) {
              if (this.field_r.field_N.length <= var6) {
                break L4;
              } else {
                this.field_r.field_N[var6] = -3.4028234663852886e+38f;
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
                  this.field_k = var4.a((byte) -90);
                  this.field_l = this.e(-8786);
                  if (null == this.field_k) {
                    break L8;
                  } else {
                    if (1 == (this.field_k.field_r ^ -1)) {
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
                stackIn_26_0 = fs.field_b;

                stackIn_26_1 = var6;

                if (-3.4028234663852886e+38f != var7) {
                  stackIn_27_0 = (float[]) ((Object) stackIn_26_0);
                  stackIn_27_1 = stackIn_26_1;
                  stackIn_27_2 = var7;
                  break L11;
                } else {
                  stackIn_27_0 = (float[]) ((Object) stackIn_26_0);
                  stackIn_27_1 = stackIn_26_1;
                  stackIn_27_2 = -1.0f;
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
        int[] var4;
        int var5;
        int var7;
        nn var8;
        int[] var9;
        int[] var10;
        int[] stackIn_3_0 = null;
        ne var6;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var8 = this.field_r.field_U;
          if (param1) {
            stackIn_3_0 = var8.field_q;
            break L0;
          } else {
            stackIn_3_0 = var8.field_k;
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
            this.field_x = 1.991025686264038f;
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
                var6 = this.field_r.field_D.field_Eb[var5];
                if (var6.a(false)) {
                  if (!var6.a(this.field_r.field_z, (byte) 91)) {
                    L3: {
                      if (null == var6.field_c) {
                        break L3;
                      } else {
                        if (!param1) {
                          if (this.field_r.field_z == var6.field_c.field_O) {
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
        int var4 = (vu.field_M.field_ac << -908657146) + vu.field_M.field_Tb;
        var2.b(1, var4);
        var2.a(vu.field_M.field_pc, 0, vu.field_M.field_pc.length, -38);
        var2.e(var2.field_q - var3, param0 ^ 5935);
    }

    public static void a(int param0) {
        field_q = null;
        field_z = null;
        field_w = null;
        if (param0 != -31116) {
            field_w = (String) null;
        }
    }

    final boolean a(byte param0, cl param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == null) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1.field_y > this.field_y) {
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (this.field_y == param1.field_y) {
                  L1: {
                    if (param1.field_o.field_J - -param1.field_o.field_w >= this.field_o.field_J + this.field_o.field_w) {
                      stackIn_10_0 = 0;
                      break L1;
                    } else {
                      stackIn_10_0 = 1;
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (param0 < -78) {
                    stackIn_17_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_15_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("cl.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                return stackIn_17_0 != 0;
              }
            }
          }
        }
    }

    private final void a(byte param0) {
        nn var2 = this.field_r.field_U;
        var2.a(false, 81, this.field_r.field_z, this.field_o, -1, -1);
        if (param0 <= 23) {
            this.field_y = -31;
        }
    }

    private final void c(int param0, int param1) {
        int var4 = 0 / ((param1 - 80) / 41);
        int var3 = param0 % this.field_r.field_D.field_v;
        int var5 = param0 / this.field_r.field_D.field_v;
        float var6 = this.field_r.field_P[54] * this.field_r.field_n[0][9][param0];
        this.field_r.field_m.a(this.field_r.field_V, true, var6, 0, (byte) -4, 9, var5, var3);
        this.field_r.field_m.a(this.field_r.field_V, true, var6, 0, (byte) -4, 9, this.field_o.field_w, this.field_o.field_J);
    }

    final void g(int param0) {
        if (null != this.field_k) {
            if (!(this.field_k.field_r == -2)) {
                this.field_k.a((byte) 5, this.field_r);
            }
        }
        if (param0 != 4) {
            return;
        }
        this.field_r.field_U.d(param0 + -34);
    }

    final void f(int param0) {
        int var2;
        int var3;
        ne var4;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!this.field_o.field_s) {
          L0: {
            if (this.field_o.i(-21428)) {
              this.field_v = this.field_r.field_P[33];
              this.field_x = this.field_r.field_P[34];
              this.field_p = this.field_r.field_P[35];
              break L0;
            } else {
              this.field_v = 0.0f;
              this.field_x = this.field_r.field_P[36];
              this.field_p = this.field_r.field_P[37];
              break L0;
            }
          }
          L1: {
            this.field_y = 100;
            if (!this.field_o.i(-21428)) {
              L2: {
                if (-6 != (this.field_o.g(0) ^ -1)) {
                  break L2;
                } else {
                  this.field_y = 10;
                  break L2;
                }
              }
              L3: {
                if (2 == this.field_o.g(0)) {
                  break L3;
                } else {
                  if (3 != this.field_o.g(0)) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_y = 200;
              break L1;
            } else {
              this.field_y = 50;
              this.a((byte) 67);
              if ((this.a((byte) 124, true) ^ -1) != -1000001) {
                this.field_y = 300;
                break L1;
              } else {
                var2 = this.a((byte) 125, false);
                if ((var2 ^ -1) == -1000001) {
                  break L1;
                } else {
                  this.c(var2, 122);
                  this.field_y = 1;
                  break L1;
                }
              }
            }
          }
          L4: {
            if (this.field_o.c(false)) {
              this.field_y = this.field_y - 300;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (this.field_o.field_H == 0) {
              break L5;
            } else {
              var4 = this.field_r.field_D.field_Eb[this.field_r.field_D.field_v * this.field_o.field_w + this.field_o.field_J];
              if (var4.a((byte) -107) == this.field_o.field_H) {
                this.field_o.field_H = 0;
                break L5;
              } else {
                break L5;
              }
            }
          }
          L6: {
            var2 = -97 % ((param0 - -13) / 63);
            if (this.field_o.field_H != 0) {
              this.field_y = this.field_y + 300;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!this.field_o.field_bb) {
              break L7;
            } else {
              this.field_y = this.field_y + 500;
              break L7;
            }
          }
          this.field_y = this.field_y + this.field_o.g((byte) 122);
          return;
        } else {
          return;
        }
    }

    private final float a(int param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        float stackIn_30_0 = 0.0f;
        float stackIn_33_0 = 0.0f;
        float stackIn_36_0 = 0.0f;
        float var5;
        ha var6;
        int var7;
        int var8;
        ne var9;
        jd var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        float var21;
        int[] var25;
        L0: {
          var5 = 0.0f;
          var6 = this.field_r.field_D;
          var7 = param0 % var6.field_v;
          var8 = param0 / var6.field_v;
          var9 = var6.field_Eb[param0];
          var10 = var9.field_c;
          var11 = -param1 + var7;
          var12 = var8 + -param2;
          if (-2 != (Math.abs(var11) + Math.abs(var12) ^ -1)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          var13 = stackIn_3_0;
          var25 = var6.a(var10, param2, (byte) -123, var12, this.field_o, var11, param1);
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
          if (!this.field_o.field_C) {
            break L2;
          } else {
            if (var13 != 0) {
              var17 = var15;
              if (var17 <= -this.field_o.field_Y + this.field_o.field_t) {
                break L2;
              } else {
                var17 = -this.field_o.field_Y + this.field_o.field_t;
                break L2;
              }
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (this.field_o.g((byte) 122) - -var17 >= var16) {
            break L3;
          } else {
            var16 = var17 + this.field_o.g((byte) 122);
            break L3;
          }
        }
        L4: {
          if (-1 == (2 & var25[2] ^ -1)) {
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
          if (!this.field_o.a(var10, (byte) 115)) {
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
            stackIn_30_0 = 1.0f;
            break L7;
          } else {
            stackIn_30_0 = this.field_r.field_P[61];
            break L7;
          }
        }
        L8: {
          var21 = stackIn_30_0;
          var5 = var5 + (float)var19 * this.field_r.field_P[0] * var21;
          if (!this.field_o.c(false)) {
            stackIn_33_0 = 1.0f;
            break L8;
          } else {
            var21 = this.field_r.field_P[48];
            stackIn_33_0 = var21;
            break L8;
          }
        }
        L9: {
          var21 = stackIn_33_0;
          var5 = var5 - (float)var20 * this.field_r.field_P[1] * var21;
          if (var9.k(12)) {
            var21 = this.field_r.field_P[50];
            stackIn_36_0 = var21;
            break L9;
          } else {
            stackIn_36_0 = 1.0f;
            break L9;
          }
        }
        L10: {
          var21 = stackIn_36_0;
          var5 = var5 + this.field_r.field_P[2] * var21 * this.field_r.field_n[0][9][param0];
          if (0 == (var25[2] & 1)) {
            break L10;
          } else {
            if (!var10.c(false)) {
              var5 = var5 - this.field_r.field_P[32];
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
            var5 = var5 * this.field_r.field_P[47];
            break L11;
          }
        }
        L12: {
          if (var10.g(0) == param3) {
            var5 = var5 * this.field_r.field_P[31];
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (var10.i(-21428)) {
            var5 = var5 * this.field_r.field_P[30];
            if (!var6.field_Eb[param0].a(false)) {
              break L13;
            } else {
              if (var6.field_Eb[param0].field_a != var10.field_O) {
                var5 = var5 * this.field_r.field_P[30];
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
            this.field_r = param0;
            this.field_o = param1;
            this.field_o.field_p = (cl) (this);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "cl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_z = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_w = "Leaders cannot carry a ring of life.";
    }
}
