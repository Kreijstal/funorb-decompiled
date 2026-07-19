/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends iu {
    static int field_y;
    private int field_C;
    static boolean field_B;
    static int field_z;

    gb(ic param0) {
        super(param0);
        RuntimeException var2 = null;
        int var2_int = 0;
        jd var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_C = -1;
        try {
          L0: {
            L1: {
              L2: {
                if (param0.field_xb.field_Cb) {
                  break L2;
                } else {
                  this.e(-119, 2);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.e(-124, 1);
              break L1;
            }
            param0.field_xb.field_f = true;
            param0.field_xb.field_Eb[157].field_a = 1;
            param0.field_xb.field_mb[0] = 10;
            param0.field_xb.field_Eb[217].field_a = 1;
            param0.field_xb.field_Eb[56].field_a = 1;
            param0.field_xb.field_Eb[157].field_a = 1;
            param0.field_xb.field_Eb[217].field_a = 1;
            param0.field_xb.field_Eb[330].field_a = 1;
            param0.field_xb.field_Eb[166].field_a = 0;
            param0.field_xb.field_Eb[65].field_a = 0;
            var2_int = 0;
            L3: while (true) {
              L4: {
                if (br.field_c.length <= var2_int) {
                  param0.field_xb.a(true, 14, 74, 13, 1, 1, 0);
                  param0.field_xb.a(true, 17, 0, 8, 1, 1, 0);
                  param0.field_xb.a(true, 10, 0, 14, 1, 1, 0);
                  param0.field_xb.a(true, 9, 9, 4, 1, 1, 1);
                  param0.field_xb.a(true, 4, 9, 14, 1, 1, 0);
                  param0.field_xb.a(true, 1, 16, 11, 1, 1, 3);
                  param0.field_xb.a(true, 16, 16, 4, 1, 1, 0);
                  param0.field_xb.a(true, 14, 22, 9, 1, 1, 0);
                  param0.field_xb.a(true, 3, 22, 12, 1, 1, 1);
                  param0.field_xb.a(true, 8, 52, 5, 1, 1, 2);
                  param0.field_xb.a(true, 7, 52, 10, 1, 1, 0);
                  param0.field_xb.a(true, 5, 52, 5, 1, 1, 3);
                  break L4;
                } else {
                  param0.field_xb.field_Eb[br.field_c[var2_int]].a(126);
                  var2_int++;
                  if (var3 != 0) {
                    break L4;
                  } else {
                    continue L3;
                  }
                }
              }
              var2_ref = (jd) ((Object) param0.field_xb.field_t[1].e((byte) 95));
              L5: while (true) {
                L6: {
                  if (var2_ref == null) {
                    break L6;
                  } else {
                    var2_ref.a((jd) ((Object) param0.field_xb.field_t[0].e((byte) 94)), 2048);
                    var2_ref = (jd) ((Object) param0.field_xb.field_t[1].a((byte) 123));
                    if (var3 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      if (var3 == 0) {
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("gb.<init>(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = 0;
        if ((param1 ^ -1) <= 0) {
          if (ks.field_y >= param1) {
            if ((param0 ^ -1) <= 0) {
              if (param0 > ef.field_c) {
                return;
              } else {
                L0: {
                  L1: {
                    if (0 == (param1 ^ -1)) {
                      break L1;
                    } else {
                      if (param1 != ks.field_y) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var5 += 2;
                  break L0;
                }
                L2: {
                  L3: {
                    if (0 == (param0 ^ -1)) {
                      break L3;
                    } else {
                      if (param0 == ef.field_c) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var5++;
                  break L2;
                }
                L4: {
                  if (param0 != -1) {
                    break L4;
                  } else {
                    if (param1 == ks.field_y) {
                      var5++;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if ((var5 ^ -1) < -1) {
                    L6: {
                      if (th.a(param0 + param1, 1, 2) != 0) {
                        break L6;
                      } else {
                        hq.field_a[0].a(param2, param3);
                        if (!ArmiesOfGielinor.field_M) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    hq.field_a[(og.field_p[th.a(param1, 1, ks.field_y) - -(th.a(param0, 1, ef.field_c) * ks.field_y)] % 6 - -1 << 1352379746) + -1 + var5].a(param2, param3);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var6 = 88 / ((-21 - param4) / 46);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final boolean c(int param0, int param1) {
        boolean discarded$2 = false;
        if (0 != this.field_q.field_xb.field_E[0][param0]) {
          if (param1 <= 81) {
            discarded$2 = this.b(37, (byte) -23);
            return false;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7) {
        RuntimeException runtimeException = null;
        wk[] var9 = null;
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
              kr.field_y[param1] = param6;
              kr.field_D.a(param3, param5, (byte) 18, param4, param2, param0, param1);
              if (param7 < -26) {
                break L1;
              } else {
                var9 = (wk[]) null;
                gb.a((wk[]) null, -121, -66, -22, -91);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("gb.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param6 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param7 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        boolean discarded$1 = false;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
                            var4 = this.field_k;
                            if ((var4 ^ -1) != -2) {
                              break L9;
                            } else {
                              if (var5 == 0) {
                                if ((param2 ^ -1) == -3) {
                                  L10: {
                                    if (this.field_q.field_pb == 0) {
                                      break L10;
                                    } else {
                                      this.e(-116, 5);
                                      if (var5 == 0) {
                                        break L0;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  this.e(-122, 3);
                                  if (var5 == 0) {
                                    break L0;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L0;
                                }
                              } else {
                                break L9;
                              }
                            }
                          }
                          L11: {
                            if (-3 != (var4 ^ -1)) {
                              break L11;
                            } else {
                              if (var5 == 0) {
                                break L8;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (-4 == (var4 ^ -1)) {
                            break L7;
                          } else {
                            if ((var4 ^ -1) == -10) {
                              break L6;
                            } else {
                              L12: {
                                if ((var4 ^ -1) != -9) {
                                  break L12;
                                } else {
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L13: {
                                if (-12 != (var4 ^ -1)) {
                                  break L13;
                                } else {
                                  if (var5 == 0) {
                                    break L4;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (-11 == (var4 ^ -1)) {
                                break L3;
                              } else {
                                if (-7 == (var4 ^ -1)) {
                                  break L2;
                                } else {
                                  if (-13 == (var4 ^ -1)) {
                                    break L1;
                                  } else {
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (29 != param2) {
                          break L0;
                        } else {
                          this.e(param1 ^ 115, 1);
                          if (var5 == 0) {
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (-20 == (param2 ^ -1)) {
                        this.e(param1 ^ 126, 5);
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L6;
                        }
                      } else {
                        break L0;
                      }
                    }
                    if (param2 == 2) {
                      L14: {
                        if (-5 >= (this.field_C ^ -1)) {
                          break L14;
                        } else {
                          this.e(param1 ^ 121, 5);
                          if (var5 == 0) {
                            break L0;
                          } else {
                            break L14;
                          }
                        }
                      }
                      this.e(-128, 14);
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L5;
                      }
                    } else {
                      break L0;
                    }
                  }
                  if (param2 != 25) {
                    break L0;
                  } else {
                    if (param0 == this.field_q.field_xb.field_B[0][this.field_C]) {
                      this.h(51);
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L4;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
                if (param2 != 25) {
                  break L0;
                } else {
                  if (this.field_q.field_xb.field_B[0][this.field_C] == param0) {
                    this.h(85);
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L3;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              L15: {
                L16: {
                  if (25 != param2) {
                    break L16;
                  } else {
                    if (param0 != this.field_q.field_xb.field_B[0][this.field_C]) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                if ((param2 ^ -1) != -28) {
                  break L0;
                } else {
                  if (param0 != this.field_q.field_xb.field_B[0][this.field_C]) {
                    break L0;
                  } else {
                    this.e(param1 + -122, 12);
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L15;
                    }
                  }
                }
              }
              this.e(-126, 11);
              if (var5 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
            L17: {
              L18: {
                if ((param2 ^ -1) != -26) {
                  break L18;
                } else {
                  if (param0 != this.field_q.field_xb.field_B[0][this.field_C]) {
                    break L17;
                  } else {
                    break L18;
                  }
                }
              }
              L19: {
                L20: {
                  if (-29 == (param2 ^ -1)) {
                    break L20;
                  } else {
                    if (-5 != (param2 ^ -1)) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                if (!this.j(-36)) {
                  break L19;
                } else {
                  if (uc.field_d[this.field_q.field_xb.field_B[0][this.field_C]][4] == 5) {
                    this.e(-123, 10);
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L19;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              if (-28 != (param2 ^ -1)) {
                break L0;
              } else {
                if (this.field_q.field_xb.field_B[0][this.field_C] == param0) {
                  this.e(-115, 12);
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L17;
                  }
                } else {
                  break L0;
                }
              }
            }
            this.e(-119, 11);
            if (var5 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          if (2 != param2) {
            break L0;
          } else {
            L21: {
              if (this.field_C < 4) {
                break L21;
              } else {
                this.e(param1 ^ 118, 14);
                if (var5 == 0) {
                  break L0;
                } else {
                  break L21;
                }
              }
            }
            this.e(param1 ^ 117, 5);
            break L0;
          }
        }
        L22: {
          if (param1 == -3) {
            break L22;
          } else {
            discarded$1 = this.b(82, (byte) 62);
            break L22;
          }
        }
    }

    private final boolean b(int param0, byte param1) {
        int var3 = 0;
        var3 = b.a(false, param0);
        if (this.field_q.field_xb.field_E[0][-1 + jv.a(false, param0)] != 0) {
          if (-1 == (this.field_q.field_xb.field_a[0][jv.a(false, param0) - 1] & 1 << var3 ^ -1)) {
            return true;
          } else {
            L0: {
              if (param1 <= 0) {
                break L0;
              } else {
                gb.a(-50, 57, -48, -76, (byte) -116);
                break L0;
              }
            }
            return false;
          }
        } else {
          return true;
        }
    }

    private final String a(byte param0, int param1) {
        L0: {
          if (-5 != (uc.field_d[param1][3] ^ -1)) {
            break L0;
          } else {
            if (1 != uc.field_d[param1][5]) {
              break L0;
            } else {
              if (this.c(uc.field_d[param1][6], 121)) {
                return r.field_E[23];
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          if (-116 != (param1 ^ -1)) {
            break L1;
          } else {
            if (!this.b(63, (byte) -9)) {
              break L1;
            } else {
              return r.field_E[25];
            }
          }
        }
        L2: {
          if ((param1 ^ -1) != -116) {
            break L2;
          } else {
            if (!this.b(63, (byte) -58)) {
              break L2;
            } else {
              return r.field_E[25];
            }
          }
        }
        L3: {
          if (-117 != (param1 ^ -1)) {
            break L3;
          } else {
            if (!this.b(58, (byte) -62)) {
              break L3;
            } else {
              return r.field_E[25];
            }
          }
        }
        L4: {
          if (param1 != 117) {
            break L4;
          } else {
            if (this.b(53, (byte) -44)) {
              return r.field_E[25];
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (param1 != 118) {
            break L5;
          } else {
            if (this.b(59, (byte) -120)) {
              return r.field_E[25];
            } else {
              break L5;
            }
          }
        }
        L6: {
          if (119 != param1) {
            break L6;
          } else {
            if (!this.b(43, (byte) -103)) {
              break L6;
            } else {
              return r.field_E[25];
            }
          }
        }
        if (param0 == 66) {
          return null;
        } else {
          this.b(-6, 14, 3);
          return null;
        }
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = this.field_q.field_xb.field_B[0][this.field_C];
          var3 = var2;
          if (-1 == var3) {
            break L0;
          } else {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                L11: {
                                  L12: {
                                    L13: {
                                      L14: {
                                        L15: {
                                          L16: {
                                            L17: {
                                              L18: {
                                                L19: {
                                                  L20: {
                                                    L21: {
                                                      L22: {
                                                        L23: {
                                                          L24: {
                                                            L25: {
                                                              L26: {
                                                                L27: {
                                                                  L28: {
                                                                    L29: {
                                                                      L30: {
                                                                        L31: {
                                                                          L32: {
                                                                            L33: {
                                                                              L34: {
                                                                                L35: {
                                                                                  L36: {
                                                                                    L37: {
                                                                                      L38: {
                                                                                        L39: {
                                                                                          L40: {
                                                                                            L41: {
                                                                                              L42: {
                                                                                                L43: {
                                                                                                  L44: {
                                                                                                    L45: {
                                                                                                      L46: {
                                                                                                        if (var3 != 0) {
                                                                                                          break L46;
                                                                                                        } else {
                                                                                                          if (var4 == 0) {
                                                                                                            break L45;
                                                                                                          } else {
                                                                                                            break L46;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      if (1 == var3) {
                                                                                                        break L45;
                                                                                                      } else {
                                                                                                        L47: {
                                                                                                          if (var3 != 2) {
                                                                                                            break L47;
                                                                                                          } else {
                                                                                                            if (var4 == 0) {
                                                                                                              break L45;
                                                                                                            } else {
                                                                                                              break L47;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        if (var3 == 3) {
                                                                                                          break L45;
                                                                                                        } else {
                                                                                                          L48: {
                                                                                                            if ((var3 ^ -1) != -5) {
                                                                                                              break L48;
                                                                                                            } else {
                                                                                                              if (var4 == 0) {
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                break L48;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          L49: {
                                                                                                            if ((var3 ^ -1) != -6) {
                                                                                                              break L49;
                                                                                                            } else {
                                                                                                              if (var4 == 0) {
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                break L49;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          if ((var3 ^ -1) == -7) {
                                                                                                            break L45;
                                                                                                          } else {
                                                                                                            if (var3 == 7) {
                                                                                                              break L44;
                                                                                                            } else {
                                                                                                              L50: {
                                                                                                                if (-9 != (var3 ^ -1)) {
                                                                                                                  break L50;
                                                                                                                } else {
                                                                                                                  if (var4 == 0) {
                                                                                                                    break L44;
                                                                                                                  } else {
                                                                                                                    break L50;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              L51: {
                                                                                                                if ((var3 ^ -1) != -10) {
                                                                                                                  break L51;
                                                                                                                } else {
                                                                                                                  if (var4 == 0) {
                                                                                                                    break L44;
                                                                                                                  } else {
                                                                                                                    break L51;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              if ((var3 ^ -1) == -11) {
                                                                                                                break L44;
                                                                                                              } else {
                                                                                                                L52: {
                                                                                                                  if (11 != var3) {
                                                                                                                    break L52;
                                                                                                                  } else {
                                                                                                                    if (var4 == 0) {
                                                                                                                      break L44;
                                                                                                                    } else {
                                                                                                                      break L52;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                L53: {
                                                                                                                  if (12 != var3) {
                                                                                                                    break L53;
                                                                                                                  } else {
                                                                                                                    if (var4 == 0) {
                                                                                                                      break L43;
                                                                                                                    } else {
                                                                                                                      break L53;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                if (-14 == (var3 ^ -1)) {
                                                                                                                  break L43;
                                                                                                                } else {
                                                                                                                  L54: {
                                                                                                                    if (var3 != 14) {
                                                                                                                      break L54;
                                                                                                                    } else {
                                                                                                                      if (var4 == 0) {
                                                                                                                        break L43;
                                                                                                                      } else {
                                                                                                                        break L54;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  L55: {
                                                                                                                    if (15 != var3) {
                                                                                                                      break L55;
                                                                                                                    } else {
                                                                                                                      if (var4 == 0) {
                                                                                                                        break L43;
                                                                                                                      } else {
                                                                                                                        break L55;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  if (var3 == 16) {
                                                                                                                    break L43;
                                                                                                                  } else {
                                                                                                                    L56: {
                                                                                                                      if (-18 != (var3 ^ -1)) {
                                                                                                                        break L56;
                                                                                                                      } else {
                                                                                                                        if (var4 == 0) {
                                                                                                                          break L43;
                                                                                                                        } else {
                                                                                                                          break L56;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    L57: {
                                                                                                                      if ((var3 ^ -1) != -19) {
                                                                                                                        break L57;
                                                                                                                      } else {
                                                                                                                        if (var4 == 0) {
                                                                                                                          break L42;
                                                                                                                        } else {
                                                                                                                          break L57;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    if (-20 == (var3 ^ -1)) {
                                                                                                                      break L42;
                                                                                                                    } else {
                                                                                                                      L58: {
                                                                                                                        if (var3 != 20) {
                                                                                                                          break L58;
                                                                                                                        } else {
                                                                                                                          if (var4 == 0) {
                                                                                                                            break L42;
                                                                                                                          } else {
                                                                                                                            break L58;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      if (21 == var3) {
                                                                                                                        break L42;
                                                                                                                      } else {
                                                                                                                        if ((var3 ^ -1) == -23) {
                                                                                                                          break L42;
                                                                                                                        } else {
                                                                                                                          if (-24 == (var3 ^ -1)) {
                                                                                                                            break L41;
                                                                                                                          } else {
                                                                                                                            L59: {
                                                                                                                              if ((var3 ^ -1) != -25) {
                                                                                                                                break L59;
                                                                                                                              } else {
                                                                                                                                if (var4 == 0) {
                                                                                                                                  break L40;
                                                                                                                                } else {
                                                                                                                                  break L59;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            if ((var3 ^ -1) == -26) {
                                                                                                                              break L39;
                                                                                                                            } else {
                                                                                                                              if (-27 == (var3 ^ -1)) {
                                                                                                                                break L38;
                                                                                                                              } else {
                                                                                                                                L60: {
                                                                                                                                  if (27 != var3) {
                                                                                                                                    break L60;
                                                                                                                                  } else {
                                                                                                                                    if (var4 == 0) {
                                                                                                                                      break L37;
                                                                                                                                    } else {
                                                                                                                                      break L60;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                L61: {
                                                                                                                                  if (-29 != (var3 ^ -1)) {
                                                                                                                                    break L61;
                                                                                                                                  } else {
                                                                                                                                    if (var4 == 0) {
                                                                                                                                      break L36;
                                                                                                                                    } else {
                                                                                                                                      break L61;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                if (-30 == (var3 ^ -1)) {
                                                                                                                                  break L36;
                                                                                                                                } else {
                                                                                                                                  L62: {
                                                                                                                                    if ((var3 ^ -1) != -31) {
                                                                                                                                      break L62;
                                                                                                                                    } else {
                                                                                                                                      if (var4 == 0) {
                                                                                                                                        break L36;
                                                                                                                                      } else {
                                                                                                                                        break L62;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  L63: {
                                                                                                                                    if (-32 != (var3 ^ -1)) {
                                                                                                                                      break L63;
                                                                                                                                    } else {
                                                                                                                                      if (var4 == 0) {
                                                                                                                                        break L36;
                                                                                                                                      } else {
                                                                                                                                        break L63;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  if (32 == var3) {
                                                                                                                                    break L36;
                                                                                                                                  } else {
                                                                                                                                    if (var3 == 33) {
                                                                                                                                      break L36;
                                                                                                                                    } else {
                                                                                                                                      L64: {
                                                                                                                                        if (-35 != (var3 ^ -1)) {
                                                                                                                                          break L64;
                                                                                                                                        } else {
                                                                                                                                          if (var4 == 0) {
                                                                                                                                            break L36;
                                                                                                                                          } else {
                                                                                                                                            break L64;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      L65: {
                                                                                                                                        if ((var3 ^ -1) != -36) {
                                                                                                                                          break L65;
                                                                                                                                        } else {
                                                                                                                                          if (var4 == 0) {
                                                                                                                                            break L36;
                                                                                                                                          } else {
                                                                                                                                            break L65;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      L66: {
                                                                                                                                        if ((var3 ^ -1) != -37) {
                                                                                                                                          break L66;
                                                                                                                                        } else {
                                                                                                                                          if (var4 == 0) {
                                                                                                                                            break L35;
                                                                                                                                          } else {
                                                                                                                                            break L66;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      if (var3 == 37) {
                                                                                                                                        break L34;
                                                                                                                                      } else {
                                                                                                                                        if (-39 == (var3 ^ -1)) {
                                                                                                                                          break L34;
                                                                                                                                        } else {
                                                                                                                                          L67: {
                                                                                                                                            if (39 != var3) {
                                                                                                                                              break L67;
                                                                                                                                            } else {
                                                                                                                                              if (var4 == 0) {
                                                                                                                                                break L34;
                                                                                                                                              } else {
                                                                                                                                                break L67;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                          L68: {
                                                                                                                                            if (var3 != 40) {
                                                                                                                                              break L68;
                                                                                                                                            } else {
                                                                                                                                              if (var4 == 0) {
                                                                                                                                                break L34;
                                                                                                                                              } else {
                                                                                                                                                break L68;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                          L69: {
                                                                                                                                            if (-42 != (var3 ^ -1)) {
                                                                                                                                              break L69;
                                                                                                                                            } else {
                                                                                                                                              if (var4 == 0) {
                                                                                                                                                break L34;
                                                                                                                                              } else {
                                                                                                                                                break L69;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                          if (var3 == 42) {
                                                                                                                                            break L34;
                                                                                                                                          } else {
                                                                                                                                            L70: {
                                                                                                                                              if ((var3 ^ -1) != -44) {
                                                                                                                                                break L70;
                                                                                                                                              } else {
                                                                                                                                                if (var4 == 0) {
                                                                                                                                                  break L33;
                                                                                                                                                } else {
                                                                                                                                                  break L70;
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                            if (-45 == (var3 ^ -1)) {
                                                                                                                                              break L32;
                                                                                                                                            } else {
                                                                                                                                              L71: {
                                                                                                                                                if (-46 != (var3 ^ -1)) {
                                                                                                                                                  break L71;
                                                                                                                                                } else {
                                                                                                                                                  if (var4 == 0) {
                                                                                                                                                    break L31;
                                                                                                                                                  } else {
                                                                                                                                                    break L71;
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                              if (var3 == 46) {
                                                                                                                                                break L30;
                                                                                                                                              } else {
                                                                                                                                                if (var3 == 47) {
                                                                                                                                                  break L29;
                                                                                                                                                } else {
                                                                                                                                                  if (48 == var3) {
                                                                                                                                                    break L29;
                                                                                                                                                  } else {
                                                                                                                                                    if (var3 == 49) {
                                                                                                                                                      break L29;
                                                                                                                                                    } else {
                                                                                                                                                      L72: {
                                                                                                                                                        if (-51 != (var3 ^ -1)) {
                                                                                                                                                          break L72;
                                                                                                                                                        } else {
                                                                                                                                                          if (var4 == 0) {
                                                                                                                                                            break L29;
                                                                                                                                                          } else {
                                                                                                                                                            break L72;
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                      L73: {
                                                                                                                                                        if (51 != var3) {
                                                                                                                                                          break L73;
                                                                                                                                                        } else {
                                                                                                                                                          if (var4 == 0) {
                                                                                                                                                            break L29;
                                                                                                                                                          } else {
                                                                                                                                                            break L73;
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                      if ((var3 ^ -1) == -53) {
                                                                                                                                                        break L29;
                                                                                                                                                      } else {
                                                                                                                                                        if (-54 == (var3 ^ -1)) {
                                                                                                                                                          break L29;
                                                                                                                                                        } else {
                                                                                                                                                          L74: {
                                                                                                                                                            if ((var3 ^ -1) != -55) {
                                                                                                                                                              break L74;
                                                                                                                                                            } else {
                                                                                                                                                              if (var4 == 0) {
                                                                                                                                                                break L28;
                                                                                                                                                              } else {
                                                                                                                                                                break L74;
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                          if (55 == var3) {
                                                                                                                                                            break L28;
                                                                                                                                                          } else {
                                                                                                                                                            L75: {
                                                                                                                                                              if (var3 != 56) {
                                                                                                                                                                break L75;
                                                                                                                                                              } else {
                                                                                                                                                                if (var4 == 0) {
                                                                                                                                                                  break L28;
                                                                                                                                                                } else {
                                                                                                                                                                  break L75;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            if (-58 == (var3 ^ -1)) {
                                                                                                                                                              break L28;
                                                                                                                                                            } else {
                                                                                                                                                              L76: {
                                                                                                                                                                if ((var3 ^ -1) != -59) {
                                                                                                                                                                  break L76;
                                                                                                                                                                } else {
                                                                                                                                                                  if (var4 == 0) {
                                                                                                                                                                    break L28;
                                                                                                                                                                  } else {
                                                                                                                                                                    break L76;
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                              L77: {
                                                                                                                                                                if ((var3 ^ -1) != -60) {
                                                                                                                                                                  break L77;
                                                                                                                                                                } else {
                                                                                                                                                                  if (var4 == 0) {
                                                                                                                                                                    break L28;
                                                                                                                                                                  } else {
                                                                                                                                                                    break L77;
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                              if (-61 == (var3 ^ -1)) {
                                                                                                                                                                break L28;
                                                                                                                                                              } else {
                                                                                                                                                                L78: {
                                                                                                                                                                  if ((var3 ^ -1) != -62) {
                                                                                                                                                                    break L78;
                                                                                                                                                                  } else {
                                                                                                                                                                    if (var4 == 0) {
                                                                                                                                                                      break L27;
                                                                                                                                                                    } else {
                                                                                                                                                                      break L78;
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                                if ((var3 ^ -1) == -63) {
                                                                                                                                                                  break L27;
                                                                                                                                                                } else {
                                                                                                                                                                  if (var3 == 63) {
                                                                                                                                                                    break L27;
                                                                                                                                                                  } else {
                                                                                                                                                                    if ((var3 ^ -1) == -65) {
                                                                                                                                                                      break L27;
                                                                                                                                                                    } else {
                                                                                                                                                                      L79: {
                                                                                                                                                                        if (var3 != 65) {
                                                                                                                                                                          break L79;
                                                                                                                                                                        } else {
                                                                                                                                                                          if (var4 == 0) {
                                                                                                                                                                            break L27;
                                                                                                                                                                          } else {
                                                                                                                                                                            break L79;
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                      if ((var3 ^ -1) == -67) {
                                                                                                                                                                        break L27;
                                                                                                                                                                      } else {
                                                                                                                                                                        if (67 == var3) {
                                                                                                                                                                          break L27;
                                                                                                                                                                        } else {
                                                                                                                                                                          if ((var3 ^ -1) == -69) {
                                                                                                                                                                            break L26;
                                                                                                                                                                          } else {
                                                                                                                                                                            L80: {
                                                                                                                                                                              if ((var3 ^ -1) != -70) {
                                                                                                                                                                                break L80;
                                                                                                                                                                              } else {
                                                                                                                                                                                if (var4 == 0) {
                                                                                                                                                                                  break L25;
                                                                                                                                                                                } else {
                                                                                                                                                                                  break L80;
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                            if (var3 == 70) {
                                                                                                                                                                              break L25;
                                                                                                                                                                            } else {
                                                                                                                                                                              L81: {
                                                                                                                                                                                if ((var3 ^ -1) != -72) {
                                                                                                                                                                                  break L81;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (var4 == 0) {
                                                                                                                                                                                    break L25;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    break L81;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                              if (72 == var3) {
                                                                                                                                                                                break L25;
                                                                                                                                                                              } else {
                                                                                                                                                                                L82: {
                                                                                                                                                                                  if (-74 != (var3 ^ -1)) {
                                                                                                                                                                                    break L82;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (var4 == 0) {
                                                                                                                                                                                      break L25;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      break L82;
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                                L83: {
                                                                                                                                                                                  if ((var3 ^ -1) != -75) {
                                                                                                                                                                                    break L83;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (var4 == 0) {
                                                                                                                                                                                      break L25;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      break L83;
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                                L84: {
                                                                                                                                                                                  if (75 != var3) {
                                                                                                                                                                                    break L84;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (var4 == 0) {
                                                                                                                                                                                      break L25;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      break L84;
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                                if ((var3 ^ -1) == -77) {
                                                                                                                                                                                  break L25;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (-78 == (var3 ^ -1)) {
                                                                                                                                                                                    break L25;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (-79 == (var3 ^ -1)) {
                                                                                                                                                                                      break L25;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if ((var3 ^ -1) == -80) {
                                                                                                                                                                                        break L25;
                                                                                                                                                                                      } else {
                                                                                                                                                                                        if ((var3 ^ -1) == -81) {
                                                                                                                                                                                          break L25;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          if ((var3 ^ -1) == -82) {
                                                                                                                                                                                            break L25;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            L85: {
                                                                                                                                                                                              if (var3 != 82) {
                                                                                                                                                                                                break L85;
                                                                                                                                                                                              } else {
                                                                                                                                                                                                if (var4 == 0) {
                                                                                                                                                                                                  break L25;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  break L85;
                                                                                                                                                                                                }
                                                                                                                                                                                              }
                                                                                                                                                                                            }
                                                                                                                                                                                            if ((var3 ^ -1) == -84) {
                                                                                                                                                                                              break L25;
                                                                                                                                                                                            } else {
                                                                                                                                                                                              L86: {
                                                                                                                                                                                                if (84 != var3) {
                                                                                                                                                                                                  break L86;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  if (var4 == 0) {
                                                                                                                                                                                                    break L25;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    break L86;
                                                                                                                                                                                                  }
                                                                                                                                                                                                }
                                                                                                                                                                                              }
                                                                                                                                                                                              L87: {
                                                                                                                                                                                                if (85 != var3) {
                                                                                                                                                                                                  break L87;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  if (var4 == 0) {
                                                                                                                                                                                                    break L25;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    break L87;
                                                                                                                                                                                                  }
                                                                                                                                                                                                }
                                                                                                                                                                                              }
                                                                                                                                                                                              L88: {
                                                                                                                                                                                                if ((var3 ^ -1) != -87) {
                                                                                                                                                                                                  break L88;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  if (var4 == 0) {
                                                                                                                                                                                                    break L25;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    break L88;
                                                                                                                                                                                                  }
                                                                                                                                                                                                }
                                                                                                                                                                                              }
                                                                                                                                                                                              if (var3 == 87) {
                                                                                                                                                                                                break L25;
                                                                                                                                                                                              } else {
                                                                                                                                                                                                L89: {
                                                                                                                                                                                                  if (-89 != (var3 ^ -1)) {
                                                                                                                                                                                                    break L89;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    if (var4 == 0) {
                                                                                                                                                                                                      break L25;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                      break L89;
                                                                                                                                                                                                    }
                                                                                                                                                                                                  }
                                                                                                                                                                                                }
                                                                                                                                                                                                if (-90 == (var3 ^ -1)) {
                                                                                                                                                                                                  break L25;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  if (90 == var3) {
                                                                                                                                                                                                    break L25;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    if (91 == var3) {
                                                                                                                                                                                                      break L25;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                      L90: {
                                                                                                                                                                                                        if (-93 != (var3 ^ -1)) {
                                                                                                                                                                                                          break L90;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                          if (var4 == 0) {
                                                                                                                                                                                                            break L25;
                                                                                                                                                                                                          } else {
                                                                                                                                                                                                            break L90;
                                                                                                                                                                                                          }
                                                                                                                                                                                                        }
                                                                                                                                                                                                      }
                                                                                                                                                                                                      L91: {
                                                                                                                                                                                                        if (-94 != (var3 ^ -1)) {
                                                                                                                                                                                                          break L91;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                          if (var4 == 0) {
                                                                                                                                                                                                            break L25;
                                                                                                                                                                                                          } else {
                                                                                                                                                                                                            break L91;
                                                                                                                                                                                                          }
                                                                                                                                                                                                        }
                                                                                                                                                                                                      }
                                                                                                                                                                                                      if (var3 == 94) {
                                                                                                                                                                                                        break L25;
                                                                                                                                                                                                      } else {
                                                                                                                                                                                                        L92: {
                                                                                                                                                                                                          if (95 != var3) {
                                                                                                                                                                                                            break L92;
                                                                                                                                                                                                          } else {
                                                                                                                                                                                                            if (var4 == 0) {
                                                                                                                                                                                                              break L25;
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                              break L92;
                                                                                                                                                                                                            }
                                                                                                                                                                                                          }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if ((var3 ^ -1) == -97) {
                                                                                                                                                                                                          break L25;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                          if ((var3 ^ -1) == -98) {
                                                                                                                                                                                                            break L25;
                                                                                                                                                                                                          } else {
                                                                                                                                                                                                            L93: {
                                                                                                                                                                                                              if ((var3 ^ -1) != -99) {
                                                                                                                                                                                                                break L93;
                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                if (var4 == 0) {
                                                                                                                                                                                                                  break L25;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                  break L93;
                                                                                                                                                                                                                }
                                                                                                                                                                                                              }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            L94: {
                                                                                                                                                                                                              if ((var3 ^ -1) != -100) {
                                                                                                                                                                                                                break L94;
                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                if (var4 == 0) {
                                                                                                                                                                                                                  break L25;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                  break L94;
                                                                                                                                                                                                                }
                                                                                                                                                                                                              }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            L95: {
                                                                                                                                                                                                              if ((var3 ^ -1) != -101) {
                                                                                                                                                                                                                break L95;
                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                if (var4 == 0) {
                                                                                                                                                                                                                  break L25;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                  break L95;
                                                                                                                                                                                                                }
                                                                                                                                                                                                              }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if ((var3 ^ -1) == -102) {
                                                                                                                                                                                                              break L25;
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                              if ((var3 ^ -1) == -103) {
                                                                                                                                                                                                                break L25;
                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                if ((var3 ^ -1) == -104) {
                                                                                                                                                                                                                  break L25;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                  if (104 == var3) {
                                                                                                                                                                                                                    break L25;
                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                    L96: {
                                                                                                                                                                                                                      if (var3 != 105) {
                                                                                                                                                                                                                        break L96;
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                        if (var4 == 0) {
                                                                                                                                                                                                                          break L25;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                          break L96;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                      }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    L97: {
                                                                                                                                                                                                                      if (var3 != 106) {
                                                                                                                                                                                                                        break L97;
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                        if (var4 == 0) {
                                                                                                                                                                                                                          break L25;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                          break L97;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                      }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    L98: {
                                                                                                                                                                                                                      if (var3 != 107) {
                                                                                                                                                                                                                        break L98;
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                        if (var4 == 0) {
                                                                                                                                                                                                                          break L25;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                          break L98;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                      }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    L99: {
                                                                                                                                                                                                                      if (108 != var3) {
                                                                                                                                                                                                                        break L99;
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                        if (var4 == 0) {
                                                                                                                                                                                                                          break L25;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                          break L99;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                      }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    L100: {
                                                                                                                                                                                                                      if (-110 != (var3 ^ -1)) {
                                                                                                                                                                                                                        break L100;
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                        if (var4 == 0) {
                                                                                                                                                                                                                          break L25;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                          break L100;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                      }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (-111 == (var3 ^ -1)) {
                                                                                                                                                                                                                      break L25;
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                      if ((var3 ^ -1) == -112) {
                                                                                                                                                                                                                        break L24;
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                        if ((var3 ^ -1) == -113) {
                                                                                                                                                                                                                          break L23;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                          L101: {
                                                                                                                                                                                                                            if (113 != var3) {
                                                                                                                                                                                                                              break L101;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                              if (var4 == 0) {
                                                                                                                                                                                                                                break L22;
                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                break L101;
                                                                                                                                                                                                                              }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                          }
                                                                                                                                                                                                                          L102: {
                                                                                                                                                                                                                            if ((var3 ^ -1) != -115) {
                                                                                                                                                                                                                              break L102;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                              if (var4 == 0) {
                                                                                                                                                                                                                                break L21;
                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                break L102;
                                                                                                                                                                                                                              }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                          }
                                                                                                                                                                                                                          if (var3 == 115) {
                                                                                                                                                                                                                            break L20;
                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                            L103: {
                                                                                                                                                                                                                              if (-117 != (var3 ^ -1)) {
                                                                                                                                                                                                                                break L103;
                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                if (var4 == 0) {
                                                                                                                                                                                                                                  break L19;
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                  break L103;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                              }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            L104: {
                                                                                                                                                                                                                              if (var3 != 117) {
                                                                                                                                                                                                                                break L104;
                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                if (var4 == 0) {
                                                                                                                                                                                                                                  break L18;
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                  break L104;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                              }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if ((var3 ^ -1) == -119) {
                                                                                                                                                                                                                              break L17;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                              if (var3 == 119) {
                                                                                                                                                                                                                                break L16;
                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                L105: {
                                                                                                                                                                                                                                  if (120 != var3) {
                                                                                                                                                                                                                                    break L105;
                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                    if (var4 == 0) {
                                                                                                                                                                                                                                      break L15;
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                      break L105;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (var3 == 121) {
                                                                                                                                                                                                                                  break L14;
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                  if (var3 == 122) {
                                                                                                                                                                                                                                    break L13;
                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                    if ((var3 ^ -1) == -124) {
                                                                                                                                                                                                                                      break L12;
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                      if (-125 == (var3 ^ -1)) {
                                                                                                                                                                                                                                        break L11;
                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                        L106: {
                                                                                                                                                                                                                                          if (125 != var3) {
                                                                                                                                                                                                                                            break L106;
                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                            if (var4 == 0) {
                                                                                                                                                                                                                                              break L10;
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                              break L106;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        L107: {
                                                                                                                                                                                                                                          if (var3 != 126) {
                                                                                                                                                                                                                                            break L107;
                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                            if (var4 == 0) {
                                                                                                                                                                                                                                              break L9;
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                              break L107;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        L108: {
                                                                                                                                                                                                                                          if (var3 != 127) {
                                                                                                                                                                                                                                            break L108;
                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                            if (var4 == 0) {
                                                                                                                                                                                                                                              break L8;
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                              break L108;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (128 == var3) {
                                                                                                                                                                                                                                          break L7;
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                          L109: {
                                                                                                                                                                                                                                            if ((var3 ^ -1) != -130) {
                                                                                                                                                                                                                                              break L109;
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                              if (var4 == 0) {
                                                                                                                                                                                                                                                break L6;
                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                break L109;
                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                          if (-131 == (var3 ^ -1)) {
                                                                                                                                                                                                                                            break L5;
                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                            if (-132 == (var3 ^ -1)) {
                                                                                                                                                                                                                                              break L4;
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                              L110: {
                                                                                                                                                                                                                                                if (var3 != 132) {
                                                                                                                                                                                                                                                  break L110;
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                  if (var4 == 0) {
                                                                                                                                                                                                                                                    break L3;
                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                    break L110;
                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                              L111: {
                                                                                                                                                                                                                                                if (133 != var3) {
                                                                                                                                                                                                                                                  break L111;
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                  if (var4 == 0) {
                                                                                                                                                                                                                                                    break L2;
                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                    break L111;
                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                              if (-135 != (var3 ^ -1)) {
                                                                                                                                                                                                                                                break L0;
                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                if (var4 == 0) {
                                                                                                                                                                                                                                                  break L1;
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                  break L45;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                              }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                          }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                      }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                  }
                                                                                                                                                                                                                }
                                                                                                                                                                                                              }
                                                                                                                                                                                                            }
                                                                                                                                                                                                          }
                                                                                                                                                                                                        }
                                                                                                                                                                                                      }
                                                                                                                                                                                                    }
                                                                                                                                                                                                  }
                                                                                                                                                                                                }
                                                                                                                                                                                              }
                                                                                                                                                                                            }
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    this.a(r.field_E[8], (byte) 122);
                                                                                                    this.e(-128, 6);
                                                                                                    if (var4 == 0) {
                                                                                                      break L0;
                                                                                                    } else {
                                                                                                      break L44;
                                                                                                    }
                                                                                                  }
                                                                                                  this.e(-114, 12);
                                                                                                  if (var4 == 0) {
                                                                                                    break L0;
                                                                                                  } else {
                                                                                                    break L43;
                                                                                                  }
                                                                                                }
                                                                                                this.a(r.field_E[9], (byte) 118);
                                                                                                this.e(-122, 6);
                                                                                                if (var4 == 0) {
                                                                                                  break L0;
                                                                                                } else {
                                                                                                  break L42;
                                                                                                }
                                                                                              }
                                                                                              this.a(r.field_E[8], (byte) 113);
                                                                                              this.e(-124, 6);
                                                                                              if (var4 == 0) {
                                                                                                break L0;
                                                                                              } else {
                                                                                                break L41;
                                                                                              }
                                                                                            }
                                                                                            this.a(r.field_E[15], (byte) 115);
                                                                                            this.e(-121, 6);
                                                                                            if (var4 == 0) {
                                                                                              break L0;
                                                                                            } else {
                                                                                              break L40;
                                                                                            }
                                                                                          }
                                                                                          this.a(r.field_E[13], (byte) 116);
                                                                                          this.e(-117, 6);
                                                                                          if (var4 == 0) {
                                                                                            break L0;
                                                                                          } else {
                                                                                            break L39;
                                                                                          }
                                                                                        }
                                                                                        this.a(r.field_E[12], (byte) 125);
                                                                                        this.e(-126, 6);
                                                                                        if (var4 == 0) {
                                                                                          break L0;
                                                                                        } else {
                                                                                          break L38;
                                                                                        }
                                                                                      }
                                                                                      this.a(r.field_E[13], (byte) 114);
                                                                                      this.e(-123, 6);
                                                                                      if (var4 == 0) {
                                                                                        break L0;
                                                                                      } else {
                                                                                        break L37;
                                                                                      }
                                                                                    }
                                                                                    this.a(r.field_E[11], (byte) 116);
                                                                                    this.e(-123, 6);
                                                                                    if (var4 == 0) {
                                                                                      break L0;
                                                                                    } else {
                                                                                      break L36;
                                                                                    }
                                                                                  }
                                                                                  this.a(r.field_E[9], (byte) 115);
                                                                                  this.e(-126, 6);
                                                                                  if (var4 == 0) {
                                                                                    break L0;
                                                                                  } else {
                                                                                    break L35;
                                                                                  }
                                                                                }
                                                                                this.a(r.field_E[8], (byte) 112);
                                                                                this.e(-116, 6);
                                                                                if (var4 == 0) {
                                                                                  break L0;
                                                                                } else {
                                                                                  break L34;
                                                                                }
                                                                              }
                                                                              L112: {
                                                                                if (this.c(uc.field_d[var2][6], 120)) {
                                                                                  break L112;
                                                                                } else {
                                                                                  this.e(-119, 12);
                                                                                  if (var4 == 0) {
                                                                                    break L0;
                                                                                  } else {
                                                                                    break L112;
                                                                                  }
                                                                                }
                                                                              }
                                                                              this.a(r.field_E[23], (byte) 119);
                                                                              this.e(-122, 9);
                                                                              if (var4 == 0) {
                                                                                break L0;
                                                                              } else {
                                                                                break L33;
                                                                              }
                                                                            }
                                                                            this.a(r.field_E[10], (byte) 125);
                                                                            this.e(-114, 6);
                                                                            if (var4 == 0) {
                                                                              break L0;
                                                                            } else {
                                                                              break L32;
                                                                            }
                                                                          }
                                                                          this.a(r.field_E[14], (byte) 123);
                                                                          this.e(-119, 6);
                                                                          if (var4 == 0) {
                                                                            break L0;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                        this.e(-114, 12);
                                                                        if (var4 == 0) {
                                                                          break L0;
                                                                        } else {
                                                                          break L30;
                                                                        }
                                                                      }
                                                                      this.a(r.field_E[9], (byte) 126);
                                                                      this.e(-121, 6);
                                                                      if (var4 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L29;
                                                                      }
                                                                    }
                                                                    this.a(r.field_E[13], (byte) 125);
                                                                    this.e(-115, 6);
                                                                    if (var4 == 0) {
                                                                      break L0;
                                                                    } else {
                                                                      break L28;
                                                                    }
                                                                  }
                                                                  this.a(r.field_E[9], (byte) 115);
                                                                  this.e(-118, 6);
                                                                  if (var4 == 0) {
                                                                    break L0;
                                                                  } else {
                                                                    break L27;
                                                                  }
                                                                }
                                                                this.a(r.field_E[13], (byte) 114);
                                                                this.e(-116, 6);
                                                                if (var4 == 0) {
                                                                  break L0;
                                                                } else {
                                                                  break L26;
                                                                }
                                                              }
                                                              this.a(r.field_E[8], (byte) 121);
                                                              this.e(-116, 6);
                                                              if (var4 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L25;
                                                              }
                                                            }
                                                            this.a(r.field_E[9], (byte) 120);
                                                            this.e(-114, 6);
                                                            if (var4 == 0) {
                                                              break L0;
                                                            } else {
                                                              break L24;
                                                            }
                                                          }
                                                          this.a(r.field_E[13], (byte) 125);
                                                          this.e(-117, 6);
                                                          if (var4 == 0) {
                                                            break L0;
                                                          } else {
                                                            break L23;
                                                          }
                                                        }
                                                        this.a(r.field_E[13], (byte) 123);
                                                        this.e(-115, 6);
                                                        if (var4 == 0) {
                                                          break L0;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                      this.a(r.field_E[13], (byte) 112);
                                                      this.e(-115, 6);
                                                      if (var4 == 0) {
                                                        break L0;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                    this.a(r.field_E[13], (byte) 122);
                                                    this.e(-124, 6);
                                                    if (var4 == 0) {
                                                      break L0;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                  L113: {
                                                    if (this.b(63, (byte) -72)) {
                                                      break L113;
                                                    } else {
                                                      this.a(r.field_E[18], (byte) 114);
                                                      this.e(-116, 6);
                                                      if (var4 == 0) {
                                                        break L0;
                                                      } else {
                                                        break L113;
                                                      }
                                                    }
                                                  }
                                                  this.a(r.field_E[25], (byte) 116);
                                                  this.e(-116, 9);
                                                  if (var4 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                                L114: {
                                                  if (!this.b(58, (byte) -35)) {
                                                    break L114;
                                                  } else {
                                                    this.a(r.field_E[25], (byte) 118);
                                                    this.e(-118, 9);
                                                    if (var4 == 0) {
                                                      break L0;
                                                    } else {
                                                      break L114;
                                                    }
                                                  }
                                                }
                                                this.a(r.field_E[20], (byte) 115);
                                                this.e(-128, 6);
                                                if (var4 == 0) {
                                                  break L0;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                              L115: {
                                                if (this.b(53, (byte) -32)) {
                                                  break L115;
                                                } else {
                                                  this.a(r.field_E[19], (byte) 112);
                                                  this.e(-115, 6);
                                                  if (var4 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L115;
                                                  }
                                                }
                                              }
                                              this.a(r.field_E[25], (byte) 117);
                                              this.e(-123, 9);
                                              if (var4 == 0) {
                                                break L0;
                                              } else {
                                                break L17;
                                              }
                                            }
                                            L116: {
                                              if (this.b(59, (byte) -39)) {
                                                break L116;
                                              } else {
                                                this.a(r.field_E[17], (byte) 124);
                                                this.e(-117, 6);
                                                if (var4 == 0) {
                                                  break L0;
                                                } else {
                                                  break L116;
                                                }
                                              }
                                            }
                                            this.a(r.field_E[25], (byte) 119);
                                            this.e(-114, 9);
                                            if (var4 == 0) {
                                              break L0;
                                            } else {
                                              break L16;
                                            }
                                          }
                                          L117: {
                                            if (!this.b(43, (byte) -79)) {
                                              break L117;
                                            } else {
                                              this.a(r.field_E[25], (byte) 115);
                                              this.e(-125, 9);
                                              if (var4 == 0) {
                                                break L0;
                                              } else {
                                                break L117;
                                              }
                                            }
                                          }
                                          this.a(r.field_E[21], (byte) 111);
                                          this.e(-117, 6);
                                          if (var4 == 0) {
                                            break L0;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        this.a(r.field_E[9], (byte) 124);
                                        this.e(-115, 6);
                                        if (var4 == 0) {
                                          break L0;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      this.a(r.field_E[8], (byte) 121);
                                      this.e(-116, 6);
                                      if (var4 == 0) {
                                        break L0;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    this.a(r.field_E[8], (byte) 109);
                                    this.e(-128, 6);
                                    if (var4 == 0) {
                                      break L0;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  this.a(r.field_E[8], (byte) 114);
                                  this.e(-128, 6);
                                  if (var4 == 0) {
                                    break L0;
                                  } else {
                                    break L11;
                                  }
                                }
                                this.a(r.field_E[9], (byte) 120);
                                this.e(-121, 6);
                                if (var4 == 0) {
                                  break L0;
                                } else {
                                  break L10;
                                }
                              }
                              this.a(r.field_E[9], (byte) 123);
                              this.e(-116, 6);
                              if (var4 == 0) {
                                break L0;
                              } else {
                                break L9;
                              }
                            }
                            this.a(r.field_E[9], (byte) 125);
                            this.e(-123, 6);
                            if (var4 == 0) {
                              break L0;
                            } else {
                              break L8;
                            }
                          }
                          this.a(r.field_E[9], (byte) 126);
                          this.e(-126, 6);
                          if (var4 == 0) {
                            break L0;
                          } else {
                            break L7;
                          }
                        }
                        this.a(r.field_E[9], (byte) 118);
                        this.e(-123, 6);
                        if (var4 == 0) {
                          break L0;
                        } else {
                          break L6;
                        }
                      }
                      this.a(r.field_E[9], (byte) 119);
                      this.e(-116, 6);
                      if (var4 == 0) {
                        break L0;
                      } else {
                        break L5;
                      }
                    }
                    this.a(r.field_E[9], (byte) 126);
                    this.e(-122, 6);
                    if (var4 == 0) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                  this.a(r.field_E[9], (byte) 125);
                  this.e(-126, 6);
                  if (var4 == 0) {
                    break L0;
                  } else {
                    break L3;
                  }
                }
                this.a(r.field_E[9], (byte) 120);
                this.e(-117, 6);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
              this.a(r.field_E[9], (byte) 123);
              this.e(-124, 6);
              if (var4 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
            this.a(r.field_E[9], (byte) 112);
            this.e(-124, 6);
            break L0;
          }
        }
        L118: {
          if (param0 > 35) {
            break L118;
          } else {
            gb.a(-66, 125, 5, 76, (byte) 66);
            break L118;
          }
        }
    }

    final static void a(wk[] param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wk[] var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param3 > 0) {
                  var5_int = param0[0].field_A;
                  var6 = param0[2].field_A;
                  var7 = param0[1].field_A;
                  param0[0].g(param1, param2);
                  param0[2].g(param3 + (param1 - var6), param2);
                  qn.b(an.field_H);
                  qn.b(param1 - -var5_int, param2, param1 + (param3 + -var6), param0[1].field_x + param2);
                  var8 = var5_int + param1;
                  var9 = param3 + param1 - var6;
                  param1 = var8;
                  L2: while (true) {
                    if (var9 <= param1) {
                      L3: {
                        if (param4 == 8941) {
                          break L3;
                        } else {
                          var10 = (wk[]) null;
                          gb.a((wk[]) null, -52, 126, 81, -73);
                          break L3;
                        }
                      }
                      qn.a(an.field_H);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param0[1].g(param1, param2);
                      param1 = param1 + var7;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("gb.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = this.field_q.field_xb.field_B[0][this.field_C];
        if (param0 == -134) {
          L0: {
            L1: {
              var3 = var2;
              if (var3 != -1) {
                break L1;
              } else {
                if (var4 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (-1 != (var3 ^ -1)) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if ((var3 ^ -1) != -2) {
                break L3;
              } else {
                if (var4 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (2 != var3) {
                break L4;
              } else {
                if (var4 == 0) {
                  return 0;
                } else {
                  break L4;
                }
              }
            }
            if ((var3 ^ -1) == -4) {
              return 0;
            } else {
              if (-5 == (var3 ^ -1)) {
                return 0;
              } else {
                if (-6 == (var3 ^ -1)) {
                  return 0;
                } else {
                  if (-7 == (var3 ^ -1)) {
                    return 0;
                  } else {
                    L5: {
                      L6: {
                        if (-8 != (var3 ^ -1)) {
                          break L6;
                        } else {
                          if (var4 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if ((var3 ^ -1) != -9) {
                          break L7;
                        } else {
                          if (var4 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (-10 != (var3 ^ -1)) {
                          break L8;
                        } else {
                          if (var4 == 0) {
                            break L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (var3 == 10) {
                        return 1;
                      } else {
                        if ((var3 ^ -1) == -12) {
                          return 1;
                        } else {
                          if (var3 == 12) {
                            return 2;
                          } else {
                            if (-14 == (var3 ^ -1)) {
                              return 3;
                            } else {
                              L9: {
                                if (14 != var3) {
                                  break L9;
                                } else {
                                  if (var4 == 0) {
                                    return 3;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if ((var3 ^ -1) != -16) {
                                  break L10;
                                } else {
                                  if (var4 == 0) {
                                    return 3;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if ((var3 ^ -1) == -17) {
                                return 3;
                              } else {
                                if (17 == var3) {
                                  return 3;
                                } else {
                                  if (var3 == 18) {
                                    return 4;
                                  } else {
                                    L11: {
                                      if ((var3 ^ -1) != -20) {
                                        break L11;
                                      } else {
                                        if (var4 == 0) {
                                          return 4;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    if (var3 == 20) {
                                      return 4;
                                    } else {
                                      if (21 == var3) {
                                        return 4;
                                      } else {
                                        if (var3 == 22) {
                                          return 4;
                                        } else {
                                          if (-24 == (var3 ^ -1)) {
                                            return 5;
                                          } else {
                                            L12: {
                                              if (-25 != (var3 ^ -1)) {
                                                break L12;
                                              } else {
                                                if (var4 == 0) {
                                                  return 5;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            if (25 == var3) {
                                              return 6;
                                            } else {
                                              L13: {
                                                if (26 != var3) {
                                                  break L13;
                                                } else {
                                                  if (var4 == 0) {
                                                    return 6;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              if ((var3 ^ -1) == -28) {
                                                return 7;
                                              } else {
                                                L14: {
                                                  if (var3 != 28) {
                                                    break L14;
                                                  } else {
                                                    if (var4 == 0) {
                                                      return 2;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                if (-30 == (var3 ^ -1)) {
                                                  return 8;
                                                } else {
                                                  L15: {
                                                    if (30 != var3) {
                                                      break L15;
                                                    } else {
                                                      if (var4 == 0) {
                                                        return 8;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                  L16: {
                                                    if (var3 != 31) {
                                                      break L16;
                                                    } else {
                                                      if (var4 == 0) {
                                                        return 8;
                                                      } else {
                                                        break L16;
                                                      }
                                                    }
                                                  }
                                                  L17: {
                                                    if (32 != var3) {
                                                      break L17;
                                                    } else {
                                                      if (var4 == 0) {
                                                        return 8;
                                                      } else {
                                                        break L17;
                                                      }
                                                    }
                                                  }
                                                  if (33 == var3) {
                                                    return 8;
                                                  } else {
                                                    if (34 == var3) {
                                                      return 9;
                                                    } else {
                                                      L18: {
                                                        if (var3 != 35) {
                                                          break L18;
                                                        } else {
                                                          if (var4 == 0) {
                                                            return 9;
                                                          } else {
                                                            break L18;
                                                          }
                                                        }
                                                      }
                                                      if (-37 == (var3 ^ -1)) {
                                                        return 10;
                                                      } else {
                                                        if (-38 == (var3 ^ -1)) {
                                                          return 11;
                                                        } else {
                                                          L19: {
                                                            if (var3 != 38) {
                                                              break L19;
                                                            } else {
                                                              if (var4 == 0) {
                                                                return 11;
                                                              } else {
                                                                break L19;
                                                              }
                                                            }
                                                          }
                                                          L20: {
                                                            if (var3 != 39) {
                                                              break L20;
                                                            } else {
                                                              if (var4 == 0) {
                                                                return 11;
                                                              } else {
                                                                break L20;
                                                              }
                                                            }
                                                          }
                                                          if ((var3 ^ -1) == -41) {
                                                            return 11;
                                                          } else {
                                                            if (41 == var3) {
                                                              return 11;
                                                            } else {
                                                              if (42 == var3) {
                                                                return 11;
                                                              } else {
                                                                L21: {
                                                                  if (var3 != 43) {
                                                                    break L21;
                                                                  } else {
                                                                    if (var4 == 0) {
                                                                      return 12;
                                                                    } else {
                                                                      break L21;
                                                                    }
                                                                  }
                                                                }
                                                                if (-45 == (var3 ^ -1)) {
                                                                  return 13;
                                                                } else {
                                                                  L22: {
                                                                    if (var3 != 45) {
                                                                      break L22;
                                                                    } else {
                                                                      if (var4 == 0) {
                                                                        return 14;
                                                                      } else {
                                                                        break L22;
                                                                      }
                                                                    }
                                                                  }
                                                                  L23: {
                                                                    if (46 != var3) {
                                                                      break L23;
                                                                    } else {
                                                                      if (var4 == 0) {
                                                                        return 15;
                                                                      } else {
                                                                        break L23;
                                                                      }
                                                                    }
                                                                  }
                                                                  L24: {
                                                                    if (var3 != 47) {
                                                                      break L24;
                                                                    } else {
                                                                      if (var4 == 0) {
                                                                        return 16;
                                                                      } else {
                                                                        break L24;
                                                                      }
                                                                    }
                                                                  }
                                                                  L25: {
                                                                    if ((var3 ^ -1) != -49) {
                                                                      break L25;
                                                                    } else {
                                                                      if (var4 == 0) {
                                                                        return 16;
                                                                      } else {
                                                                        break L25;
                                                                      }
                                                                    }
                                                                  }
                                                                  L26: {
                                                                    if (-50 != (var3 ^ -1)) {
                                                                      break L26;
                                                                    } else {
                                                                      if (var4 == 0) {
                                                                        return 16;
                                                                      } else {
                                                                        break L26;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var3 == 50) {
                                                                    return 16;
                                                                  } else {
                                                                    L27: {
                                                                      if (-52 != (var3 ^ -1)) {
                                                                        break L27;
                                                                      } else {
                                                                        if (var4 == 0) {
                                                                          return 16;
                                                                        } else {
                                                                          break L27;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (-53 == (var3 ^ -1)) {
                                                                      return 16;
                                                                    } else {
                                                                      L28: {
                                                                        if ((var3 ^ -1) != -54) {
                                                                          break L28;
                                                                        } else {
                                                                          if (var4 == 0) {
                                                                            return 16;
                                                                          } else {
                                                                            break L28;
                                                                          }
                                                                        }
                                                                      }
                                                                      L29: {
                                                                        if ((var3 ^ -1) != -55) {
                                                                          break L29;
                                                                        } else {
                                                                          if (var4 == 0) {
                                                                            return 17;
                                                                          } else {
                                                                            break L29;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (-56 == (var3 ^ -1)) {
                                                                        return 17;
                                                                      } else {
                                                                        L30: {
                                                                          if (-57 != (var3 ^ -1)) {
                                                                            break L30;
                                                                          } else {
                                                                            if (var4 == 0) {
                                                                              return 17;
                                                                            } else {
                                                                              break L30;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (-58 == (var3 ^ -1)) {
                                                                          return 17;
                                                                        } else {
                                                                          L31: {
                                                                            if (58 != var3) {
                                                                              break L31;
                                                                            } else {
                                                                              if (var4 == 0) {
                                                                                return 17;
                                                                              } else {
                                                                                break L31;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (-60 == (var3 ^ -1)) {
                                                                            return 17;
                                                                          } else {
                                                                            L32: {
                                                                              if (var3 != 60) {
                                                                                break L32;
                                                                              } else {
                                                                                if (var4 == 0) {
                                                                                  return 17;
                                                                                } else {
                                                                                  break L32;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (-62 == (var3 ^ -1)) {
                                                                              return 18;
                                                                            } else {
                                                                              L33: {
                                                                                if ((var3 ^ -1) != -63) {
                                                                                  break L33;
                                                                                } else {
                                                                                  if (var4 == 0) {
                                                                                    return 18;
                                                                                  } else {
                                                                                    break L33;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (63 == var3) {
                                                                                return 18;
                                                                              } else {
                                                                                if (var3 == 64) {
                                                                                  return 18;
                                                                                } else {
                                                                                  if (65 == var3) {
                                                                                    return 18;
                                                                                  } else {
                                                                                    if ((var3 ^ -1) == -67) {
                                                                                      return 18;
                                                                                    } else {
                                                                                      if (67 == var3) {
                                                                                        return 18;
                                                                                      } else {
                                                                                        if ((var3 ^ -1) == -69) {
                                                                                          return 19;
                                                                                        } else {
                                                                                          L34: {
                                                                                            if (69 != var3) {
                                                                                              break L34;
                                                                                            } else {
                                                                                              if (var4 == 0) {
                                                                                                return 2;
                                                                                              } else {
                                                                                                break L34;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          if (-71 == (var3 ^ -1)) {
                                                                                            return 21;
                                                                                          } else {
                                                                                            if (71 == var3) {
                                                                                              return 21;
                                                                                            } else {
                                                                                              L35: {
                                                                                                if (-73 != (var3 ^ -1)) {
                                                                                                  break L35;
                                                                                                } else {
                                                                                                  if (var4 == 0) {
                                                                                                    return 21;
                                                                                                  } else {
                                                                                                    break L35;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              if (-74 == (var3 ^ -1)) {
                                                                                                return 21;
                                                                                              } else {
                                                                                                if (-75 == (var3 ^ -1)) {
                                                                                                  return 21;
                                                                                                } else {
                                                                                                  L36: {
                                                                                                    if (75 != var3) {
                                                                                                      break L36;
                                                                                                    } else {
                                                                                                      if (var4 == 0) {
                                                                                                        return 21;
                                                                                                      } else {
                                                                                                        break L36;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  if (var3 == 76) {
                                                                                                    return 21;
                                                                                                  } else {
                                                                                                    if (-78 == (var3 ^ -1)) {
                                                                                                      return 21;
                                                                                                    } else {
                                                                                                      if (var3 == 78) {
                                                                                                        return 21;
                                                                                                      } else {
                                                                                                        L37: {
                                                                                                          if (var3 != 79) {
                                                                                                            break L37;
                                                                                                          } else {
                                                                                                            if (var4 == 0) {
                                                                                                              return 21;
                                                                                                            } else {
                                                                                                              break L37;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        if ((var3 ^ -1) == -81) {
                                                                                                          return 21;
                                                                                                        } else {
                                                                                                          if (81 == var3) {
                                                                                                            return 21;
                                                                                                          } else {
                                                                                                            L38: {
                                                                                                              if (-83 != (var3 ^ -1)) {
                                                                                                                break L38;
                                                                                                              } else {
                                                                                                                if (var4 == 0) {
                                                                                                                  return 21;
                                                                                                                } else {
                                                                                                                  break L38;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            L39: {
                                                                                                              if (var3 != 83) {
                                                                                                                break L39;
                                                                                                              } else {
                                                                                                                if (var4 == 0) {
                                                                                                                  return 21;
                                                                                                                } else {
                                                                                                                  break L39;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            L40: {
                                                                                                              if (84 != var3) {
                                                                                                                break L40;
                                                                                                              } else {
                                                                                                                if (var4 == 0) {
                                                                                                                  return 21;
                                                                                                                } else {
                                                                                                                  break L40;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            L41: {
                                                                                                              if ((var3 ^ -1) != -86) {
                                                                                                                break L41;
                                                                                                              } else {
                                                                                                                if (var4 == 0) {
                                                                                                                  return 21;
                                                                                                                } else {
                                                                                                                  break L41;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            L42: {
                                                                                                              if (-87 != (var3 ^ -1)) {
                                                                                                                break L42;
                                                                                                              } else {
                                                                                                                if (var4 == 0) {
                                                                                                                  return 21;
                                                                                                                } else {
                                                                                                                  break L42;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            L43: {
                                                                                                              if (-88 != (var3 ^ -1)) {
                                                                                                                break L43;
                                                                                                              } else {
                                                                                                                if (var4 == 0) {
                                                                                                                  return 21;
                                                                                                                } else {
                                                                                                                  break L43;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            if (88 == var3) {
                                                                                                              return 21;
                                                                                                            } else {
                                                                                                              L44: {
                                                                                                                if (-90 != (var3 ^ -1)) {
                                                                                                                  break L44;
                                                                                                                } else {
                                                                                                                  if (var4 == 0) {
                                                                                                                    return 21;
                                                                                                                  } else {
                                                                                                                    break L44;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              if (-91 == (var3 ^ -1)) {
                                                                                                                return 21;
                                                                                                              } else {
                                                                                                                if (91 == var3) {
                                                                                                                  return 21;
                                                                                                                } else {
                                                                                                                  L45: {
                                                                                                                    if ((var3 ^ -1) != -93) {
                                                                                                                      break L45;
                                                                                                                    } else {
                                                                                                                      if (var4 == 0) {
                                                                                                                        return 21;
                                                                                                                      } else {
                                                                                                                        break L45;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  if (var3 == 93) {
                                                                                                                    return 21;
                                                                                                                  } else {
                                                                                                                    if (-95 == (var3 ^ -1)) {
                                                                                                                      return 22;
                                                                                                                    } else {
                                                                                                                      L46: {
                                                                                                                        if (95 != var3) {
                                                                                                                          break L46;
                                                                                                                        } else {
                                                                                                                          if (var4 == 0) {
                                                                                                                            return 22;
                                                                                                                          } else {
                                                                                                                            break L46;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      L47: {
                                                                                                                        if ((var3 ^ -1) != -97) {
                                                                                                                          break L47;
                                                                                                                        } else {
                                                                                                                          if (var4 == 0) {
                                                                                                                            return 22;
                                                                                                                          } else {
                                                                                                                            break L47;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      L48: {
                                                                                                                        if ((var3 ^ -1) != -98) {
                                                                                                                          break L48;
                                                                                                                        } else {
                                                                                                                          if (var4 == 0) {
                                                                                                                            return 22;
                                                                                                                          } else {
                                                                                                                            break L48;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      L49: {
                                                                                                                        if (var3 != 98) {
                                                                                                                          break L49;
                                                                                                                        } else {
                                                                                                                          if (var4 == 0) {
                                                                                                                            return 22;
                                                                                                                          } else {
                                                                                                                            break L49;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      if (-100 == (var3 ^ -1)) {
                                                                                                                        return 22;
                                                                                                                      } else {
                                                                                                                        L50: {
                                                                                                                          if (-101 != (var3 ^ -1)) {
                                                                                                                            break L50;
                                                                                                                          } else {
                                                                                                                            if (var4 == 0) {
                                                                                                                              return 22;
                                                                                                                            } else {
                                                                                                                              break L50;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                        if ((var3 ^ -1) == -102) {
                                                                                                                          return 22;
                                                                                                                        } else {
                                                                                                                          if (-103 == (var3 ^ -1)) {
                                                                                                                            return 22;
                                                                                                                          } else {
                                                                                                                            if (-104 == (var3 ^ -1)) {
                                                                                                                              return 21;
                                                                                                                            } else {
                                                                                                                              if ((var3 ^ -1) == -105) {
                                                                                                                                return 21;
                                                                                                                              } else {
                                                                                                                                L51: {
                                                                                                                                  if (105 != var3) {
                                                                                                                                    break L51;
                                                                                                                                  } else {
                                                                                                                                    if (var4 == 0) {
                                                                                                                                      return 22;
                                                                                                                                    } else {
                                                                                                                                      break L51;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                L52: {
                                                                                                                                  if (106 != var3) {
                                                                                                                                    break L52;
                                                                                                                                  } else {
                                                                                                                                    if (var4 == 0) {
                                                                                                                                      return 22;
                                                                                                                                    } else {
                                                                                                                                      break L52;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                if (var3 == 107) {
                                                                                                                                  return 22;
                                                                                                                                } else {
                                                                                                                                  if (-109 == (var3 ^ -1)) {
                                                                                                                                    return 23;
                                                                                                                                  } else {
                                                                                                                                    L53: {
                                                                                                                                      if ((var3 ^ -1) != -110) {
                                                                                                                                        break L53;
                                                                                                                                      } else {
                                                                                                                                        if (var4 == 0) {
                                                                                                                                          return 24;
                                                                                                                                        } else {
                                                                                                                                          break L53;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    L54: {
                                                                                                                                      if (110 != var3) {
                                                                                                                                        break L54;
                                                                                                                                      } else {
                                                                                                                                        if (var4 == 0) {
                                                                                                                                          return 2;
                                                                                                                                        } else {
                                                                                                                                          break L54;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    L55: {
                                                                                                                                      if ((var3 ^ -1) != -112) {
                                                                                                                                        break L55;
                                                                                                                                      } else {
                                                                                                                                        if (var4 == 0) {
                                                                                                                                          return 25;
                                                                                                                                        } else {
                                                                                                                                          break L55;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    L56: {
                                                                                                                                      if ((var3 ^ -1) != -113) {
                                                                                                                                        break L56;
                                                                                                                                      } else {
                                                                                                                                        if (var4 == 0) {
                                                                                                                                          return 25;
                                                                                                                                        } else {
                                                                                                                                          break L56;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    if (var3 == 113) {
                                                                                                                                      return 25;
                                                                                                                                    } else {
                                                                                                                                      L57: {
                                                                                                                                        if (-115 != (var3 ^ -1)) {
                                                                                                                                          break L57;
                                                                                                                                        } else {
                                                                                                                                          if (var4 == 0) {
                                                                                                                                            return 25;
                                                                                                                                          } else {
                                                                                                                                            break L57;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      if (var3 == 115) {
                                                                                                                                        return 26;
                                                                                                                                      } else {
                                                                                                                                        L58: {
                                                                                                                                          if ((var3 ^ -1) != -117) {
                                                                                                                                            break L58;
                                                                                                                                          } else {
                                                                                                                                            if (var4 == 0) {
                                                                                                                                              return 26;
                                                                                                                                            } else {
                                                                                                                                              break L58;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                        L59: {
                                                                                                                                          if (var3 != 117) {
                                                                                                                                            break L59;
                                                                                                                                          } else {
                                                                                                                                            if (var4 == 0) {
                                                                                                                                              return 26;
                                                                                                                                            } else {
                                                                                                                                              break L59;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                        if ((var3 ^ -1) == -119) {
                                                                                                                                          return 26;
                                                                                                                                        } else {
                                                                                                                                          L60: {
                                                                                                                                            if ((var3 ^ -1) != -120) {
                                                                                                                                              break L60;
                                                                                                                                            } else {
                                                                                                                                              if (var4 == 0) {
                                                                                                                                                return 26;
                                                                                                                                              } else {
                                                                                                                                                break L60;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                          L61: {
                                                                                                                                            if (-121 != (var3 ^ -1)) {
                                                                                                                                              break L61;
                                                                                                                                            } else {
                                                                                                                                              if (var4 == 0) {
                                                                                                                                                return 27;
                                                                                                                                              } else {
                                                                                                                                                break L61;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                          L62: {
                                                                                                                                            if (121 != var3) {
                                                                                                                                              break L62;
                                                                                                                                            } else {
                                                                                                                                              if (var4 == 0) {
                                                                                                                                                return 28;
                                                                                                                                              } else {
                                                                                                                                                break L62;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                          L63: {
                                                                                                                                            if ((var3 ^ -1) != -123) {
                                                                                                                                              break L63;
                                                                                                                                            } else {
                                                                                                                                              if (var4 == 0) {
                                                                                                                                                return 28;
                                                                                                                                              } else {
                                                                                                                                                break L63;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                          if (-124 == (var3 ^ -1)) {
                                                                                                                                            return 28;
                                                                                                                                          } else {
                                                                                                                                            if ((var3 ^ -1) == -125) {
                                                                                                                                              return 22;
                                                                                                                                            } else {
                                                                                                                                              L64: {
                                                                                                                                                if (125 != var3) {
                                                                                                                                                  break L64;
                                                                                                                                                } else {
                                                                                                                                                  if (var4 == 0) {
                                                                                                                                                    return 22;
                                                                                                                                                  } else {
                                                                                                                                                    break L64;
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                              if (-127 == (var3 ^ -1)) {
                                                                                                                                                return 22;
                                                                                                                                              } else {
                                                                                                                                                L65: {
                                                                                                                                                  if (var3 != 127) {
                                                                                                                                                    break L65;
                                                                                                                                                  } else {
                                                                                                                                                    if (var4 == 0) {
                                                                                                                                                      return 22;
                                                                                                                                                    } else {
                                                                                                                                                      break L65;
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                                if (-129 == (var3 ^ -1)) {
                                                                                                                                                  return 22;
                                                                                                                                                } else {
                                                                                                                                                  L66: {
                                                                                                                                                    if (var3 != 129) {
                                                                                                                                                      break L66;
                                                                                                                                                    } else {
                                                                                                                                                      if (var4 == 0) {
                                                                                                                                                        return 22;
                                                                                                                                                      } else {
                                                                                                                                                        break L66;
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                  L67: {
                                                                                                                                                    if (var3 != 130) {
                                                                                                                                                      break L67;
                                                                                                                                                    } else {
                                                                                                                                                      if (var4 == 0) {
                                                                                                                                                        return 22;
                                                                                                                                                      } else {
                                                                                                                                                        break L67;
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                  L68: {
                                                                                                                                                    if (var3 != 131) {
                                                                                                                                                      break L68;
                                                                                                                                                    } else {
                                                                                                                                                      if (var4 == 0) {
                                                                                                                                                        return 22;
                                                                                                                                                      } else {
                                                                                                                                                        break L68;
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                  if (132 == var3) {
                                                                                                                                                    return 22;
                                                                                                                                                  } else {
                                                                                                                                                    L69: {
                                                                                                                                                      if (-134 != (var3 ^ -1)) {
                                                                                                                                                        break L69;
                                                                                                                                                      } else {
                                                                                                                                                        if (var4 == 0) {
                                                                                                                                                          return 22;
                                                                                                                                                        } else {
                                                                                                                                                          break L69;
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                    if ((var3 ^ -1) == -135) {
                                                                                                                                                      return 22;
                                                                                                                                                    } else {
                                                                                                                                                      return 0;
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return 1;
                  }
                }
              }
            }
          }
          return 0;
        } else {
          return 8;
        }
    }

    private final void e(int param0, int param1) {
        String discarded$3 = null;
        String dupTemp$4 = null;
        String dupTemp$5 = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String[] stackIn_12_2 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String[] stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String[] stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        int stackIn_85_0 = 0;
        Object stackIn_90_0 = null;
        Object stackIn_94_0 = null;
        int stackIn_97_0 = 0;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        String[] stackIn_106_2 = null;
        Object stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        String[] stackIn_107_2 = null;
        Object stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        String[] stackIn_108_2 = null;
        int stackIn_108_3 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String[] stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String[] stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String[] stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        int stackOut_84_0 = 0;
        Object stackOut_89_0 = null;
        Object stackOut_93_0 = null;
        int stackOut_96_0 = 0;
        Object stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        String[] stackOut_105_2 = null;
        Object stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        String[] stackOut_107_2 = null;
        int stackOut_107_3 = 0;
        Object stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        String[] stackOut_106_2 = null;
        int stackOut_106_3 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 <= -113) {
            break L0;
          } else {
            discarded$3 = this.a((byte) -54, -8);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                this.field_c = true;
                this.field_k = param1;
                this.d((byte) 37);
                this.d(-85, -1);
                var6 = param1;
                if ((var6 ^ -1) != -3) {
                  break L4;
                } else {
                  if (var7 == 0) {
                    this.a(r.field_E[2], (byte) 111);
                    this.field_w = 4;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      return;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var6 != 1) {
                  break L5;
                } else {
                  if (var7 == 0) {
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              if ((var6 ^ -1) == -4) {
                break L2;
              } else {
                if (5 == var6) {
                  break L1;
                } else {
                  if (11 != var6) {
                    L6: {
                      if ((var6 ^ -1) != -7) {
                        break L6;
                      } else {
                        if (var7 != 0) {
                          break L6;
                        } else {
                          L7: {
                            this.field_w = 1;
                            if (var7 == 0) {
                              break L7;
                            } else {
                              this.a(r.field_E[29], (byte) 110);
                              this.field_w = 1;
                              if (var7 == 0) {
                                break L7;
                              } else {
                                L8: {
                                  var9 = us.field_b[this.i(-134)];
                                  var5 = var9;
                                  if (this.field_C == 0) {
                                    var5 = fo.a(4800, r.field_E[27], new String[]{var9});
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                this.a(var5, (byte) 126);
                                this.field_w = 0;
                                if (var7 == 0) {
                                  break L7;
                                } else {
                                  this.a(r.field_E[30], (byte) 110);
                                  this.field_w = 3;
                                  break L7;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    L9: {
                      if (10 != var6) {
                        break L9;
                      } else {
                        if (var7 != 0) {
                          break L9;
                        } else {
                          L10: {
                            this.a(r.field_E[29], (byte) 110);
                            this.field_w = 1;
                            if (var7 == 0) {
                              break L10;
                            } else {
                              L11: {
                                var9 = us.field_b[this.i(-134)];
                                var5 = var9;
                                if (this.field_C == 0) {
                                  var5 = fo.a(4800, r.field_E[27], new String[]{var9});
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              this.a(var5, (byte) 126);
                              this.field_w = 0;
                              if (var7 == 0) {
                                break L10;
                              } else {
                                this.a(r.field_E[30], (byte) 110);
                                this.field_w = 3;
                                break L10;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    L12: {
                      if (-13 != (var6 ^ -1)) {
                        break L12;
                      } else {
                        if (var7 != 0) {
                          break L12;
                        } else {
                          L13: {
                            var9 = us.field_b[this.i(-134)];
                            var5 = var9;
                            if (this.field_C == 0) {
                              var5 = fo.a(4800, r.field_E[27], new String[]{var9});
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            this.a(var5, (byte) 126);
                            this.field_w = 0;
                            if (var7 == 0) {
                              break L14;
                            } else {
                              this.a(r.field_E[30], (byte) 110);
                              this.field_w = 3;
                              break L14;
                            }
                          }
                          return;
                        }
                      }
                    }
                    if ((var6 ^ -1) != -15) {
                      return;
                    } else {
                      this.a(r.field_E[30], (byte) 110);
                      this.field_w = 3;
                      return;
                    }
                  } else {
                    L15: {
                      var4 = r.field_E[26];
                      dupTemp$4 = fo.a(4800, var4, new String[]{fq.field_f[this.field_q.field_xb.field_B[0][this.field_C]]});
                      var8 = dupTemp$4;
                      var4 = dupTemp$4;
                      stackOut_11_0 = this;
                      stackOut_11_1 = 4800;
                      stackOut_11_2 = r.field_E;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      if ((this.field_q.field_gc ^ -1) > -1) {
                        stackOut_13_0 = this;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = (String[]) ((Object) stackIn_13_2);
                        stackOut_13_3 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        stackIn_14_3 = stackOut_13_3;
                        break L15;
                      } else {
                        stackOut_12_0 = this;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = (String[]) ((Object) stackIn_12_2);
                        stackOut_12_3 = 0;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_14_3 = stackOut_12_3;
                        break L15;
                      }
                    }
                    L16: {
                      this.a(fo.a(stackIn_14_1, stackIn_14_2[stackIn_14_3 + 32], new String[]{var8}), (byte) 125);
                      this.d(-122, this.field_C);
                      this.field_w = 1;
                      if (var7 == 0) {
                        break L16;
                      } else {
                        this.field_w = 1;
                        this.a(r.field_E[29], (byte) 110);
                        this.field_w = 1;
                        if (var7 == 0) {
                          break L16;
                        } else {
                          L17: {
                            var9 = us.field_b[this.i(-134)];
                            var5 = var9;
                            if (this.field_C == 0) {
                              var5 = fo.a(4800, r.field_E[27], new String[]{var9});
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          this.a(var5, (byte) 126);
                          this.field_w = 0;
                          if (var7 == 0) {
                            break L16;
                          } else {
                            this.a(r.field_E[30], (byte) 110);
                            this.field_w = 3;
                            break L16;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            this.a(r.field_E[0], (byte) 126);
            this.field_w = 0;
            if (var7 != 0) {
              break L2;
            } else {
              return;
            }
          }
          this.a(r.field_E[1], (byte) 111);
          this.field_w = 1;
          this.d(-75, 255);
          if (var7 != 0) {
            break L1;
          } else {
            return;
          }
        }
        this.field_C = this.field_C + 1;
        if (-1 != this.field_q.field_xb.field_B[0][this.field_C]) {
          var6 = 0;
          L18: while (true) {
            L19: {
              L20: {
                if (var6 >= this.field_C) {
                  break L20;
                } else {
                  stackOut_84_0 = this.field_q.field_xb.field_B[0][var6] ^ -1;
                  stackIn_97_0 = stackOut_84_0;
                  stackIn_85_0 = stackOut_84_0;
                  if (var7 != 0) {
                    break L19;
                  } else {
                    if (stackIn_85_0 == (this.field_q.field_xb.field_B[0][this.field_C] ^ -1)) {
                      this.a(fo.a(4800, r.field_E[31], new String[]{fq.field_f[this.field_q.field_xb.field_B[0][this.field_C]]}), (byte) 119);
                      this.field_w = 0;
                      this.field_k = 9;
                      L21: while (true) {
                        L22: {
                          L23: {
                            if (-6 >= (this.field_C ^ -1)) {
                              break L23;
                            } else {
                              stackOut_89_0 = this;
                              stackIn_94_0 = stackOut_89_0;
                              stackIn_90_0 = stackOut_89_0;
                              if (var7 != 0) {
                                break L22;
                              } else {
                                if (((gb) (this)).field_q.field_xb.field_B[0][this.field_C] != this.field_q.field_xb.field_B[0][var6]) {
                                  break L23;
                                } else {
                                  this.field_C = this.field_C + 1;
                                  if (var7 == 0) {
                                    continue L21;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_93_0 = this;
                          stackIn_94_0 = stackOut_93_0;
                          break L22;
                        }
                        ((gb) (this)).field_C = ((gb) (this)).field_C - 1;
                        return;
                      }
                    } else {
                      var6++;
                      if (var7 == 0) {
                        continue L18;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
              }
              stackOut_96_0 = uc.field_d[this.field_q.field_xb.field_B[0][this.field_C]][3];
              stackIn_97_0 = stackOut_96_0;
              break L19;
            }
            L24: {
              L25: {
                var3 = stackIn_97_0;
                var4 = this.a((byte) 66, this.field_q.field_xb.field_B[0][this.field_C]);
                if (var4 == null) {
                  break L25;
                } else {
                  this.field_k = 9;
                  this.field_w = 0;
                  if (var7 == 0) {
                    break L24;
                  } else {
                    break L25;
                  }
                }
              }
              L26: {
                L27: {
                  if ((var3 ^ -1) == -5) {
                    break L27;
                  } else {
                    var4 = r.field_E[26];
                    if (var7 == 0) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
                var4 = r.field_E[22];
                break L26;
              }
              var4 = fo.a(4800, var4, new String[]{fq.field_f[this.field_q.field_xb.field_B[0][this.field_C]]});
              this.field_w = 1;
              this.field_k = 8;
              this.d(-37, this.field_C);
              break L24;
            }
            L28: {
              this.a(fo.a(4800, r.field_E[3 - -this.field_C], new String[]{fq.field_f[this.field_q.field_xb.field_B[0][this.field_C]], mn.field_l[this.field_q.field_xb.field_B[0][this.field_C]], var4}), (byte) 109);
              if (var7 == 0) {
                break L28;
              } else {
                L29: {
                  var4 = r.field_E[26];
                  dupTemp$5 = fo.a(4800, var4, new String[]{fq.field_f[this.field_q.field_xb.field_B[0][this.field_C]]});
                  var8 = dupTemp$5;
                  var4 = dupTemp$5;
                  stackOut_105_0 = this;
                  stackOut_105_1 = 4800;
                  stackOut_105_2 = r.field_E;
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_107_1 = stackOut_105_1;
                  stackIn_107_2 = stackOut_105_2;
                  stackIn_106_0 = stackOut_105_0;
                  stackIn_106_1 = stackOut_105_1;
                  stackIn_106_2 = stackOut_105_2;
                  if ((this.field_q.field_gc ^ -1) > -1) {
                    stackOut_107_0 = this;
                    stackOut_107_1 = stackIn_107_1;
                    stackOut_107_2 = (String[]) ((Object) stackIn_107_2);
                    stackOut_107_3 = 1;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    stackIn_108_2 = stackOut_107_2;
                    stackIn_108_3 = stackOut_107_3;
                    break L29;
                  } else {
                    stackOut_106_0 = this;
                    stackOut_106_1 = stackIn_106_1;
                    stackOut_106_2 = (String[]) ((Object) stackIn_106_2);
                    stackOut_106_3 = 0;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_108_1 = stackOut_106_1;
                    stackIn_108_2 = stackOut_106_2;
                    stackIn_108_3 = stackOut_106_3;
                    break L29;
                  }
                }
                this.a(fo.a(stackIn_108_1, stackIn_108_2[stackIn_108_3 + 32], new String[]{var8}), (byte) 125);
                this.d(-122, this.field_C);
                this.field_w = 1;
                if (var7 == 0) {
                  break L28;
                } else {
                  this.field_w = 1;
                  this.a(r.field_E[29], (byte) 110);
                  this.field_w = 1;
                  if (var7 == 0) {
                    break L28;
                  } else {
                    L30: {
                      var9 = us.field_b[this.i(-134)];
                      var5 = var9;
                      if (this.field_C == 0) {
                        var5 = fo.a(4800, r.field_E[27], new String[]{var9});
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    this.a(var5, (byte) 126);
                    this.field_w = 0;
                    if (var7 == 0) {
                      break L28;
                    } else {
                      this.a(r.field_E[30], (byte) 110);
                      this.field_w = 3;
                      break L28;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          this.a(r.field_E[24], (byte) 117);
          L31: while (true) {
            L32: {
              if (-6 >= (this.field_C ^ -1)) {
                break L32;
              } else {
                if (-1 != this.field_q.field_xb.field_B[0][this.field_C]) {
                  break L32;
                } else {
                  this.field_C = this.field_C + 1;
                  continue L31;
                }
              }
            }
            this.field_k = 9;
            this.field_w = 0;
            this.field_C = this.field_C - 1;
            return;
          }
        }
    }

    private final boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_q.field_T == null) {
          return false;
        } else {
          L0: {
            L1: {
              L2: {
                var2 = this.field_q.field_xb.field_B[0][this.field_C];
                if (-37 != (var2 ^ -1)) {
                  break L2;
                } else {
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-35 == (var2 ^ -1)) {
                if (this.field_q.field_T.field_O != 0) {
                  break L0;
                } else {
                  if (!this.field_q.field_T.field_s) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              } else {
                if (-36 == (var2 ^ -1)) {
                  if (this.field_q.field_T.field_O != 0) {
                    break L0;
                  } else {
                    if (this.field_q.field_T.field_s) {
                      break L0;
                    } else {
                      return true;
                    }
                  }
                } else {
                  if (-110 != (var2 ^ -1)) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      if (this.field_q.field_T.field_O != 0) {
                        break L0;
                      } else {
                        if (this.field_q.field_T.field_s) {
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if (this.field_q.field_T.field_O == 0) {
              break L0;
            } else {
              if (this.field_q.field_T.field_s) {
                break L0;
              } else {
                return true;
              }
            }
          }
          if (param0 != -36) {
            field_z = 53;
            return false;
          } else {
            return false;
          }
        }
    }

    private final void d(int param0, int param1) {
        this.field_q.field_Jb = param1;
        if (param0 > 0) {
            field_B = true;
        }
    }

    static {
        field_B = true;
        field_y = 480;
        field_z = 7;
    }
}
