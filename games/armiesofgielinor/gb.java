/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        ((gb) this).field_C = -1;
        try {
          L0: {
            L1: {
              if (param0.field_xb.field_Cb) {
                this.e(-124, 1);
                break L1;
              } else {
                this.e(-119, 2);
                break L1;
              }
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
            L2: while (true) {
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
                var2_ref = (jd) (Object) param0.field_xb.field_t[1].e((byte) 95);
                L3: while (true) {
                  if (var2_ref == null) {
                    break L0;
                  } else {
                    var2_ref.a((jd) (Object) param0.field_xb.field_t[0].e((byte) 94), 2048);
                    var2_ref = (jd) (Object) param0.field_xb.field_t[1].a((byte) 123);
                    continue L3;
                  }
                }
              } else {
                param0.field_xb.field_Eb[br.field_c[var2_int]].a(126);
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("gb.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = 0;
        if (param1 < -1) {
          return;
        } else {
          L0: {
            if (ks.field_y < param1) {
              break L0;
            } else {
              if (param0 < -1) {
                break L0;
              } else {
                if (~param0 >= ~ef.field_c) {
                  L1: {
                    L2: {
                      if (param1 == -1) {
                        break L2;
                      } else {
                        if (param1 != ks.field_y) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var5 += 2;
                    break L1;
                  }
                  L3: {
                    L4: {
                      if (param0 == -1) {
                        break L4;
                      } else {
                        if (~param0 == ~ef.field_c) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5++;
                    break L3;
                  }
                  L5: {
                    if (param0 != -1) {
                      break L5;
                    } else {
                      if (~param1 == ~ks.field_y) {
                        var5++;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (var5 > 0) {
                      if (th.a(param0 + param1, 1, 2) != 0) {
                        hq.field_a[(og.field_p[th.a(param1, 1, ks.field_y) - -(th.a(param0, 1, ef.field_c) * ks.field_y)] % 6 - -1 << 2) + -1 + var5].a(param2, param3);
                        break L6;
                      } else {
                        hq.field_a[0].a(param2, param3);
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  var6 = 88 / ((-21 - param4) / 46);
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    private final boolean c(int param0, int param1) {
        if (0 == ((gb) this).field_q.field_xb.field_E[0][param0]) {
            return true;
        }
        if (param1 <= 81) {
            boolean discarded$0 = this.b(37, (byte) -23);
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7) {
        RuntimeException runtimeException = null;
        Object var9 = null;
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
                var9 = null;
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
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gb.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param6 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param7 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = ((gb) this).field_k;
          if (var4 != 1) {
            if (var4 != 2) {
              if (var4 == 3) {
                if (param2 == 19) {
                  this.e(param1 ^ 126, 5);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                if (var4 == 9) {
                  if (param2 == 2) {
                    if (((gb) this).field_C >= 4) {
                      this.e(-128, 14);
                      break L0;
                    } else {
                      this.e(param1 ^ 121, 5);
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                } else {
                  if (var4 != 8) {
                    if (var4 != 11) {
                      if (var4 == 10) {
                        L1: {
                          if (25 != param2) {
                            break L1;
                          } else {
                            if (param0 != ((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C]) {
                              this.e(-126, 11);
                              break L0;
                            } else {
                              break L1;
                            }
                          }
                        }
                        if (param2 != 27) {
                          break L0;
                        } else {
                          if (param0 != ((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C]) {
                            break L0;
                          } else {
                            this.e(param1 + -122, 12);
                            break L0;
                          }
                        }
                      } else {
                        if (var4 == 6) {
                          L2: {
                            if (param2 != 25) {
                              break L2;
                            } else {
                              if (param0 != ((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C]) {
                                this.e(-119, 11);
                                break L0;
                              } else {
                                break L2;
                              }
                            }
                          }
                          L3: {
                            L4: {
                              if (param2 == 28) {
                                break L4;
                              } else {
                                if (param2 != 4) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            if (!this.j(-36)) {
                              break L3;
                            } else {
                              if (uc.field_d[((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C]][4] == 5) {
                                this.e(-123, 10);
                                break L0;
                              } else {
                                break L0;
                              }
                            }
                          }
                          if (param2 != 27) {
                            break L0;
                          } else {
                            if (((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C] == param0) {
                              this.e(-115, 12);
                              break L0;
                            } else {
                              break L0;
                            }
                          }
                        } else {
                          if (var4 == 12) {
                            if (2 != param2) {
                              break L0;
                            } else {
                              if (((gb) this).field_C < 4) {
                                this.e(param1 ^ 117, 5);
                                break L0;
                              } else {
                                this.e(param1 ^ 118, 14);
                                break L0;
                              }
                            }
                          } else {
                            break L0;
                          }
                        }
                      }
                    } else {
                      if (param2 != 25) {
                        break L0;
                      } else {
                        if (((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C] == param0) {
                          this.h(85);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (param2 != 25) {
                      break L0;
                    } else {
                      if (param0 == ((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C]) {
                        this.h(51);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            } else {
              if (29 != param2) {
                break L0;
              } else {
                this.e(param1 ^ 115, 1);
                break L0;
              }
            }
          } else {
            if (param2 == 2) {
              if (((gb) this).field_q.field_pb == 0) {
                this.e(-122, 3);
                break L0;
              } else {
                this.e(-116, 5);
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L5: {
          if (param1 == -3) {
            break L5;
          } else {
            boolean discarded$1 = this.b(82, (byte) 62);
            break L5;
          }
        }
    }

    private final boolean b(int param0, byte param1) {
        int var3 = b.a(false, param0);
        if (((gb) this).field_q.field_xb.field_E[0][-1 + jv.a(false, param0)] == 0) {
            return true;
        }
        if ((((gb) this).field_q.field_xb.field_a[0][jv.a(false, param0) - 1] & 1 << var3) == 0) {
            return true;
        }
        if (param1 > 0) {
            gb.a(-50, 57, -48, -76, (byte) -116);
        }
        return false;
    }

    private final String a(byte param0, int param1) {
        if (uc.field_d[param1][3] == 4) {
            if (1 == uc.field_d[param1][5]) {
                if (!(!this.c(uc.field_d[param1][6], 121))) {
                    return r.field_E[23];
                }
            }
        }
        if (param1 == 115) {
            if (this.b(63, (byte) -9)) {
                return r.field_E[25];
            }
        }
        if (param1 == 115) {
            if (this.b(63, (byte) -58)) {
                return r.field_E[25];
            }
        }
        if (param1 == 116) {
            if (this.b(58, (byte) -62)) {
                return r.field_E[25];
            }
        }
        if (param1 == 117) {
            if (!(!this.b(53, (byte) -44))) {
                return r.field_E[25];
            }
        }
        if (param1 == 118) {
            if (!(!this.b(59, (byte) -120))) {
                return r.field_E[25];
            }
        }
        if (119 == param1) {
            if (this.b(43, (byte) -103)) {
                return r.field_E[25];
            }
        }
        if (param0 == 66) {
            return null;
        }
        ((gb) this).b(-6, 14, 3);
        return null;
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = ((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C];
          var3 = var2;
          if (-1 == var3) {
            break L0;
          } else {
            L1: {
              if (var3 != 0) {
                if (1 == var3) {
                  break L1;
                } else {
                  if (var3 != 2) {
                    if (var3 == 3) {
                      break L1;
                    } else {
                      if (var3 != 4) {
                        if (var3 != 5) {
                          if (var3 == 6) {
                            break L1;
                          } else {
                            L2: {
                              if (var3 == 7) {
                                break L2;
                              } else {
                                if (var3 != 8) {
                                  if (var3 != 9) {
                                    if (var3 == 10) {
                                      break L2;
                                    } else {
                                      if (11 != var3) {
                                        L3: {
                                          if (12 != var3) {
                                            if (var3 == 13) {
                                              break L3;
                                            } else {
                                              if (var3 != 14) {
                                                if (15 != var3) {
                                                  if (var3 == 16) {
                                                    break L3;
                                                  } else {
                                                    if (var3 != 17) {
                                                      L4: {
                                                        if (var3 != 18) {
                                                          if (var3 == 19) {
                                                            break L4;
                                                          } else {
                                                            if (var3 != 20) {
                                                              if (21 == var3) {
                                                                break L4;
                                                              } else {
                                                                if (var3 == 22) {
                                                                  break L4;
                                                                } else {
                                                                  if (var3 == 23) {
                                                                    ((gb) this).a(r.field_E[15], (byte) 115);
                                                                    this.e(-121, 6);
                                                                    break L0;
                                                                  } else {
                                                                    if (var3 != 24) {
                                                                      if (var3 == 25) {
                                                                        ((gb) this).a(r.field_E[12], (byte) 125);
                                                                        this.e(-126, 6);
                                                                        break L0;
                                                                      } else {
                                                                        if (var3 == 26) {
                                                                          ((gb) this).a(r.field_E[13], (byte) 114);
                                                                          this.e(-123, 6);
                                                                          break L0;
                                                                        } else {
                                                                          if (27 != var3) {
                                                                            L5: {
                                                                              if (var3 != 28) {
                                                                                if (var3 == 29) {
                                                                                  break L5;
                                                                                } else {
                                                                                  if (var3 != 30) {
                                                                                    if (var3 != 31) {
                                                                                      if (32 == var3) {
                                                                                        break L5;
                                                                                      } else {
                                                                                        if (var3 == 33) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (var3 != 34) {
                                                                                            if (var3 != 35) {
                                                                                              if (var3 != 36) {
                                                                                                L6: {
                                                                                                  if (var3 == 37) {
                                                                                                    break L6;
                                                                                                  } else {
                                                                                                    if (var3 == 38) {
                                                                                                      break L6;
                                                                                                    } else {
                                                                                                      if (39 != var3) {
                                                                                                        if (var3 != 40) {
                                                                                                          if (var3 != 41) {
                                                                                                            if (var3 == 42) {
                                                                                                              break L6;
                                                                                                            } else {
                                                                                                              if (var3 != 43) {
                                                                                                                if (var3 == 44) {
                                                                                                                  ((gb) this).a(r.field_E[14], (byte) 123);
                                                                                                                  this.e(-119, 6);
                                                                                                                  break L0;
                                                                                                                } else {
                                                                                                                  if (var3 != 45) {
                                                                                                                    if (var3 == 46) {
                                                                                                                      ((gb) this).a(r.field_E[9], (byte) 126);
                                                                                                                      this.e(-121, 6);
                                                                                                                      break L0;
                                                                                                                    } else {
                                                                                                                      L7: {
                                                                                                                        if (var3 == 47) {
                                                                                                                          break L7;
                                                                                                                        } else {
                                                                                                                          if (48 == var3) {
                                                                                                                            break L7;
                                                                                                                          } else {
                                                                                                                            if (var3 == 49) {
                                                                                                                              break L7;
                                                                                                                            } else {
                                                                                                                              if (var3 != 50) {
                                                                                                                                if (51 != var3) {
                                                                                                                                  if (var3 == 52) {
                                                                                                                                    break L7;
                                                                                                                                  } else {
                                                                                                                                    if (var3 == 53) {
                                                                                                                                      break L7;
                                                                                                                                    } else {
                                                                                                                                      L8: {
                                                                                                                                        if (var3 != 54) {
                                                                                                                                          if (55 == var3) {
                                                                                                                                            break L8;
                                                                                                                                          } else {
                                                                                                                                            if (var3 != 56) {
                                                                                                                                              if (var3 == 57) {
                                                                                                                                                break L8;
                                                                                                                                              } else {
                                                                                                                                                if (var3 != 58) {
                                                                                                                                                  if (var3 != 59) {
                                                                                                                                                    if (var3 == 60) {
                                                                                                                                                      break L8;
                                                                                                                                                    } else {
                                                                                                                                                      L9: {
                                                                                                                                                        if (var3 != 61) {
                                                                                                                                                          if (var3 == 62) {
                                                                                                                                                            break L9;
                                                                                                                                                          } else {
                                                                                                                                                            if (var3 == 63) {
                                                                                                                                                              break L9;
                                                                                                                                                            } else {
                                                                                                                                                              if (var3 == 64) {
                                                                                                                                                                break L9;
                                                                                                                                                              } else {
                                                                                                                                                                if (var3 != 65) {
                                                                                                                                                                  if (var3 == 66) {
                                                                                                                                                                    break L9;
                                                                                                                                                                  } else {
                                                                                                                                                                    if (67 == var3) {
                                                                                                                                                                      break L9;
                                                                                                                                                                    } else {
                                                                                                                                                                      if (var3 == 68) {
                                                                                                                                                                        ((gb) this).a(r.field_E[8], (byte) 121);
                                                                                                                                                                        this.e(-116, 6);
                                                                                                                                                                        break L0;
                                                                                                                                                                      } else {
                                                                                                                                                                        L10: {
                                                                                                                                                                          if (var3 != 69) {
                                                                                                                                                                            if (var3 == 70) {
                                                                                                                                                                              break L10;
                                                                                                                                                                            } else {
                                                                                                                                                                              if (var3 != 71) {
                                                                                                                                                                                if (72 == var3) {
                                                                                                                                                                                  break L10;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (var3 != 73) {
                                                                                                                                                                                    if (var3 != 74) {
                                                                                                                                                                                      if (75 != var3) {
                                                                                                                                                                                        if (var3 == 76) {
                                                                                                                                                                                          break L10;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          if (var3 == 77) {
                                                                                                                                                                                            break L10;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            if (var3 == 78) {
                                                                                                                                                                                              break L10;
                                                                                                                                                                                            } else {
                                                                                                                                                                                              if (var3 == 79) {
                                                                                                                                                                                                break L10;
                                                                                                                                                                                              } else {
                                                                                                                                                                                                if (var3 == 80) {
                                                                                                                                                                                                  break L10;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  if (var3 == 81) {
                                                                                                                                                                                                    break L10;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    if (var3 != 82) {
                                                                                                                                                                                                      if (var3 == 83) {
                                                                                                                                                                                                        break L10;
                                                                                                                                                                                                      } else {
                                                                                                                                                                                                        if (84 != var3) {
                                                                                                                                                                                                          if (85 != var3) {
                                                                                                                                                                                                            if (var3 != 86) {
                                                                                                                                                                                                              if (var3 == 87) {
                                                                                                                                                                                                                break L10;
                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                if (var3 != 88) {
                                                                                                                                                                                                                  if (var3 == 89) {
                                                                                                                                                                                                                    break L10;
                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                    if (90 == var3) {
                                                                                                                                                                                                                      break L10;
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                      if (91 == var3) {
                                                                                                                                                                                                                        break L10;
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                        if (var3 != 92) {
                                                                                                                                                                                                                          if (var3 != 93) {
                                                                                                                                                                                                                            if (var3 == 94) {
                                                                                                                                                                                                                              break L10;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                              if (95 != var3) {
                                                                                                                                                                                                                                if (var3 == 96) {
                                                                                                                                                                                                                                  break L10;
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                  if (var3 == 97) {
                                                                                                                                                                                                                                    break L10;
                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                    if (var3 != 98) {
                                                                                                                                                                                                                                      if (var3 != 99) {
                                                                                                                                                                                                                                        if (var3 != 100) {
                                                                                                                                                                                                                                          if (var3 == 101) {
                                                                                                                                                                                                                                            break L10;
                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                            if (var3 == 102) {
                                                                                                                                                                                                                                              break L10;
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                              if (var3 == 103) {
                                                                                                                                                                                                                                                break L10;
                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                if (104 == var3) {
                                                                                                                                                                                                                                                  break L10;
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                  if (var3 != 105) {
                                                                                                                                                                                                                                                    if (var3 != 106) {
                                                                                                                                                                                                                                                      if (var3 != 107) {
                                                                                                                                                                                                                                                        if (108 != var3) {
                                                                                                                                                                                                                                                          if (var3 != 109) {
                                                                                                                                                                                                                                                            if (var3 == 110) {
                                                                                                                                                                                                                                                              break L10;
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                              if (var3 == 111) {
                                                                                                                                                                                                                                                                ((gb) this).a(r.field_E[13], (byte) 125);
                                                                                                                                                                                                                                                                this.e(-117, 6);
                                                                                                                                                                                                                                                                break L0;
                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                if (var3 == 112) {
                                                                                                                                                                                                                                                                  ((gb) this).a(r.field_E[13], (byte) 123);
                                                                                                                                                                                                                                                                  this.e(-115, 6);
                                                                                                                                                                                                                                                                  break L0;
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                  if (113 != var3) {
                                                                                                                                                                                                                                                                    if (var3 != 114) {
                                                                                                                                                                                                                                                                      if (var3 == 115) {
                                                                                                                                                                                                                                                                        if (this.b(63, (byte) -72)) {
                                                                                                                                                                                                                                                                          ((gb) this).a(r.field_E[25], (byte) 116);
                                                                                                                                                                                                                                                                          this.e(-116, 9);
                                                                                                                                                                                                                                                                          break L0;
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                          ((gb) this).a(r.field_E[18], (byte) 114);
                                                                                                                                                                                                                                                                          this.e(-116, 6);
                                                                                                                                                                                                                                                                          break L0;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                        if (var3 != 116) {
                                                                                                                                                                                                                                                                          if (var3 != 117) {
                                                                                                                                                                                                                                                                            if (var3 == 118) {
                                                                                                                                                                                                                                                                              if (this.b(59, (byte) -39)) {
                                                                                                                                                                                                                                                                                ((gb) this).a(r.field_E[25], (byte) 119);
                                                                                                                                                                                                                                                                                this.e(-114, 9);
                                                                                                                                                                                                                                                                                break L0;
                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                ((gb) this).a(r.field_E[17], (byte) 124);
                                                                                                                                                                                                                                                                                this.e(-117, 6);
                                                                                                                                                                                                                                                                                break L0;
                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                              if (var3 == 119) {
                                                                                                                                                                                                                                                                                if (!this.b(43, (byte) -79)) {
                                                                                                                                                                                                                                                                                  ((gb) this).a(r.field_E[21], (byte) 111);
                                                                                                                                                                                                                                                                                  this.e(-117, 6);
                                                                                                                                                                                                                                                                                  break L0;
                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                  ((gb) this).a(r.field_E[25], (byte) 115);
                                                                                                                                                                                                                                                                                  this.e(-125, 9);
                                                                                                                                                                                                                                                                                  break L0;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                if (120 != var3) {
                                                                                                                                                                                                                                                                                  if (var3 == 121) {
                                                                                                                                                                                                                                                                                    ((gb) this).a(r.field_E[8], (byte) 121);
                                                                                                                                                                                                                                                                                    this.e(-116, 6);
                                                                                                                                                                                                                                                                                    break L0;
                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                    if (var3 == 122) {
                                                                                                                                                                                                                                                                                      ((gb) this).a(r.field_E[8], (byte) 109);
                                                                                                                                                                                                                                                                                      this.e(-128, 6);
                                                                                                                                                                                                                                                                                      break L0;
                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                      if (var3 == 123) {
                                                                                                                                                                                                                                                                                        ((gb) this).a(r.field_E[8], (byte) 114);
                                                                                                                                                                                                                                                                                        this.e(-128, 6);
                                                                                                                                                                                                                                                                                        break L0;
                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                        if (var3 == 124) {
                                                                                                                                                                                                                                                                                          ((gb) this).a(r.field_E[9], (byte) 120);
                                                                                                                                                                                                                                                                                          this.e(-121, 6);
                                                                                                                                                                                                                                                                                          break L0;
                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                          if (125 != var3) {
                                                                                                                                                                                                                                                                                            if (var3 != 126) {
                                                                                                                                                                                                                                                                                              if (var3 != 127) {
                                                                                                                                                                                                                                                                                                if (128 == var3) {
                                                                                                                                                                                                                                                                                                  ((gb) this).a(r.field_E[9], (byte) 118);
                                                                                                                                                                                                                                                                                                  this.e(-123, 6);
                                                                                                                                                                                                                                                                                                  break L0;
                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                  if (var3 != 129) {
                                                                                                                                                                                                                                                                                                    if (var3 == 130) {
                                                                                                                                                                                                                                                                                                      ((gb) this).a(r.field_E[9], (byte) 126);
                                                                                                                                                                                                                                                                                                      this.e(-122, 6);
                                                                                                                                                                                                                                                                                                      break L0;
                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                      if (var3 == 131) {
                                                                                                                                                                                                                                                                                                        ((gb) this).a(r.field_E[9], (byte) 125);
                                                                                                                                                                                                                                                                                                        this.e(-126, 6);
                                                                                                                                                                                                                                                                                                        break L0;
                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                        if (var3 != 132) {
                                                                                                                                                                                                                                                                                                          if (133 != var3) {
                                                                                                                                                                                                                                                                                                            if (var3 != 134) {
                                                                                                                                                                                                                                                                                                              break L0;
                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                              ((gb) this).a(r.field_E[9], (byte) 112);
                                                                                                                                                                                                                                                                                                              this.e(-124, 6);
                                                                                                                                                                                                                                                                                                              break L0;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                                            ((gb) this).a(r.field_E[9], (byte) 123);
                                                                                                                                                                                                                                                                                                            this.e(-124, 6);
                                                                                                                                                                                                                                                                                                            break L0;
                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                          ((gb) this).a(r.field_E[9], (byte) 120);
                                                                                                                                                                                                                                                                                                          this.e(-117, 6);
                                                                                                                                                                                                                                                                                                          break L0;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                    ((gb) this).a(r.field_E[9], (byte) 119);
                                                                                                                                                                                                                                                                                                    this.e(-116, 6);
                                                                                                                                                                                                                                                                                                    break L0;
                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                ((gb) this).a(r.field_E[9], (byte) 126);
                                                                                                                                                                                                                                                                                                this.e(-126, 6);
                                                                                                                                                                                                                                                                                                break L0;
                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                              ((gb) this).a(r.field_E[9], (byte) 125);
                                                                                                                                                                                                                                                                                              this.e(-123, 6);
                                                                                                                                                                                                                                                                                              break L0;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                            ((gb) this).a(r.field_E[9], (byte) 123);
                                                                                                                                                                                                                                                                                            this.e(-116, 6);
                                                                                                                                                                                                                                                                                            break L0;
                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                  ((gb) this).a(r.field_E[9], (byte) 124);
                                                                                                                                                                                                                                                                                  this.e(-115, 6);
                                                                                                                                                                                                                                                                                  break L0;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                            if (this.b(53, (byte) -32)) {
                                                                                                                                                                                                                                                                              ((gb) this).a(r.field_E[25], (byte) 117);
                                                                                                                                                                                                                                                                              this.e(-123, 9);
                                                                                                                                                                                                                                                                              break L0;
                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                              ((gb) this).a(r.field_E[19], (byte) 112);
                                                                                                                                                                                                                                                                              this.e(-115, 6);
                                                                                                                                                                                                                                                                              break L0;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                          if (!this.b(58, (byte) -35)) {
                                                                                                                                                                                                                                                                            ((gb) this).a(r.field_E[20], (byte) 115);
                                                                                                                                                                                                                                                                            this.e(-128, 6);
                                                                                                                                                                                                                                                                            break L0;
                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                            ((gb) this).a(r.field_E[25], (byte) 118);
                                                                                                                                                                                                                                                                            this.e(-118, 9);
                                                                                                                                                                                                                                                                            break L0;
                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                      ((gb) this).a(r.field_E[13], (byte) 122);
                                                                                                                                                                                                                                                                      this.e(-124, 6);
                                                                                                                                                                                                                                                                      break L0;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                    ((gb) this).a(r.field_E[13], (byte) 112);
                                                                                                                                                                                                                                                                    this.e(-115, 6);
                                                                                                                                                                                                                                                                    break L0;
                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                            ((gb) this).a(r.field_E[9], (byte) 120);
                                                                                                                                                                                                                                                            this.e(-114, 6);
                                                                                                                                                                                                                                                            break L0;
                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                          break L10;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                        break L10;
                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                      break L10;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                    break L10;
                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                          break L10;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                        break L10;
                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                      break L10;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                break L10;
                                                                                                                                                                                                                              }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                            break L10;
                                                                                                                                                                                                                          }
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                          break L10;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                      }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                  }
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                  break L10;
                                                                                                                                                                                                                }
                                                                                                                                                                                                              }
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                              break L10;
                                                                                                                                                                                                            }
                                                                                                                                                                                                          } else {
                                                                                                                                                                                                            break L10;
                                                                                                                                                                                                          }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                          break L10;
                                                                                                                                                                                                        }
                                                                                                                                                                                                      }
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                      break L10;
                                                                                                                                                                                                    }
                                                                                                                                                                                                  }
                                                                                                                                                                                                }
                                                                                                                                                                                              }
                                                                                                                                                                                            }
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                      } else {
                                                                                                                                                                                        break L10;
                                                                                                                                                                                      }
                                                                                                                                                                                    } else {
                                                                                                                                                                                      break L10;
                                                                                                                                                                                    }
                                                                                                                                                                                  } else {
                                                                                                                                                                                    break L10;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              } else {
                                                                                                                                                                                break L10;
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                          } else {
                                                                                                                                                                            break L10;
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                        ((gb) this).a(r.field_E[9], (byte) 120);
                                                                                                                                                                        this.e(-114, 6);
                                                                                                                                                                        break L0;
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                } else {
                                                                                                                                                                  break L9;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        } else {
                                                                                                                                                          break L9;
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                      ((gb) this).a(r.field_E[13], (byte) 114);
                                                                                                                                                      this.e(-116, 6);
                                                                                                                                                      break L0;
                                                                                                                                                    }
                                                                                                                                                  } else {
                                                                                                                                                    break L8;
                                                                                                                                                  }
                                                                                                                                                } else {
                                                                                                                                                  break L8;
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            } else {
                                                                                                                                              break L8;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          break L8;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      ((gb) this).a(r.field_E[9], (byte) 115);
                                                                                                                                      this.e(-118, 6);
                                                                                                                                      break L0;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  break L7;
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                break L7;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      ((gb) this).a(r.field_E[13], (byte) 125);
                                                                                                                      this.e(-115, 6);
                                                                                                                      break L0;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    this.e(-114, 12);
                                                                                                                    break L0;
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                ((gb) this).a(r.field_E[10], (byte) 125);
                                                                                                                this.e(-114, 6);
                                                                                                                break L0;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L6;
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L6;
                                                                                                        }
                                                                                                      } else {
                                                                                                        break L6;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                if (this.c(uc.field_d[var2][6], 120)) {
                                                                                                  ((gb) this).a(r.field_E[23], (byte) 119);
                                                                                                  this.e(-122, 9);
                                                                                                  break L0;
                                                                                                } else {
                                                                                                  this.e(-119, 12);
                                                                                                  break L0;
                                                                                                }
                                                                                              } else {
                                                                                                ((gb) this).a(r.field_E[8], (byte) 112);
                                                                                                this.e(-116, 6);
                                                                                                break L0;
                                                                                              }
                                                                                            } else {
                                                                                              break L5;
                                                                                            }
                                                                                          } else {
                                                                                            break L5;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      break L5;
                                                                                    }
                                                                                  } else {
                                                                                    break L5;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                break L5;
                                                                              }
                                                                            }
                                                                            ((gb) this).a(r.field_E[9], (byte) 115);
                                                                            this.e(-126, 6);
                                                                            break L0;
                                                                          } else {
                                                                            ((gb) this).a(r.field_E[11], (byte) 116);
                                                                            this.e(-123, 6);
                                                                            break L0;
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      ((gb) this).a(r.field_E[13], (byte) 116);
                                                                      this.e(-117, 6);
                                                                      break L0;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              break L4;
                                                            }
                                                          }
                                                        } else {
                                                          break L4;
                                                        }
                                                      }
                                                      ((gb) this).a(r.field_E[8], (byte) 113);
                                                      this.e(-124, 6);
                                                      break L0;
                                                    } else {
                                                      break L3;
                                                    }
                                                  }
                                                } else {
                                                  break L3;
                                                }
                                              } else {
                                                break L3;
                                              }
                                            }
                                          } else {
                                            break L3;
                                          }
                                        }
                                        ((gb) this).a(r.field_E[9], (byte) 118);
                                        this.e(-122, 6);
                                        break L0;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  break L2;
                                }
                              }
                            }
                            this.e(-114, 12);
                            break L0;
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            ((gb) this).a(r.field_E[8], (byte) 122);
            this.e(-128, 6);
            break L0;
          }
        }
        L11: {
          if (param0 > 35) {
            break L11;
          } else {
            gb.a(-66, 125, 5, 76, (byte) 66);
            break L11;
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
        Object var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
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
                          var10 = null;
                          gb.a((wk[]) null, -52, 126, 81, -73);
                          break L3;
                        }
                      }
                      qn.a(an.field_H);
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
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("gb.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_206_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_205_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = ((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C];
        var3 = var2;
        if (var3 != -1) {
          L0: {
            L1: {
              if (var3 != 0) {
                if (var3 != 1) {
                  if (2 != var3) {
                    if (var3 == 3) {
                      return 0;
                    } else {
                      if (var3 == 4) {
                        return 0;
                      } else {
                        if (var3 == 5) {
                          return 0;
                        } else {
                          if (var3 == 6) {
                            return 0;
                          } else {
                            L2: {
                              if (var3 != 7) {
                                if (var3 != 8) {
                                  if (var3 != 9) {
                                    if (var3 == 10) {
                                      return 1;
                                    } else {
                                      if (var3 == 11) {
                                        return 1;
                                      } else {
                                        if (var3 == 12) {
                                          return 2;
                                        } else {
                                          if (var3 == 13) {
                                            return 3;
                                          } else {
                                            if (14 != var3) {
                                              if (var3 != 15) {
                                                if (var3 == 16) {
                                                  return 3;
                                                } else {
                                                  if (17 == var3) {
                                                    return 3;
                                                  } else {
                                                    if (var3 == 18) {
                                                      return 4;
                                                    } else {
                                                      if (var3 != 19) {
                                                        if (var3 == 20) {
                                                          return 4;
                                                        } else {
                                                          if (21 == var3) {
                                                            return 4;
                                                          } else {
                                                            if (var3 == 22) {
                                                              return 4;
                                                            } else {
                                                              if (var3 == 23) {
                                                                return 5;
                                                              } else {
                                                                if (var3 != 24) {
                                                                  if (25 == var3) {
                                                                    return 6;
                                                                  } else {
                                                                    if (26 != var3) {
                                                                      if (var3 == 27) {
                                                                        return 7;
                                                                      } else {
                                                                        if (var3 != 28) {
                                                                          if (var3 == 29) {
                                                                            return 8;
                                                                          } else {
                                                                            if (30 != var3) {
                                                                              if (var3 != 31) {
                                                                                if (32 != var3) {
                                                                                  if (33 == var3) {
                                                                                    return 8;
                                                                                  } else {
                                                                                    if (34 == var3) {
                                                                                      return 9;
                                                                                    } else {
                                                                                      if (var3 != 35) {
                                                                                        if (var3 == 36) {
                                                                                          return 10;
                                                                                        } else {
                                                                                          if (var3 == 37) {
                                                                                            return 11;
                                                                                          } else {
                                                                                            if (var3 != 38) {
                                                                                              if (var3 != 39) {
                                                                                                if (var3 == 40) {
                                                                                                  return 11;
                                                                                                } else {
                                                                                                  if (41 == var3) {
                                                                                                    return 11;
                                                                                                  } else {
                                                                                                    if (42 == var3) {
                                                                                                      return 11;
                                                                                                    } else {
                                                                                                      if (var3 != 43) {
                                                                                                        if (var3 == 44) {
                                                                                                          return 13;
                                                                                                        } else {
                                                                                                          if (var3 != 45) {
                                                                                                            if (46 != var3) {
                                                                                                              if (var3 != 47) {
                                                                                                                if (var3 != 48) {
                                                                                                                  if (var3 != 49) {
                                                                                                                    if (var3 == 50) {
                                                                                                                      return 16;
                                                                                                                    } else {
                                                                                                                      if (var3 != 51) {
                                                                                                                        if (var3 == 52) {
                                                                                                                          return 16;
                                                                                                                        } else {
                                                                                                                          if (var3 != 53) {
                                                                                                                            if (var3 != 54) {
                                                                                                                              if (var3 == 55) {
                                                                                                                                return 17;
                                                                                                                              } else {
                                                                                                                                if (var3 != 56) {
                                                                                                                                  if (var3 == 57) {
                                                                                                                                    return 17;
                                                                                                                                  } else {
                                                                                                                                    if (58 != var3) {
                                                                                                                                      if (var3 == 59) {
                                                                                                                                        return 17;
                                                                                                                                      } else {
                                                                                                                                        if (var3 != 60) {
                                                                                                                                          if (var3 == 61) {
                                                                                                                                            return 18;
                                                                                                                                          } else {
                                                                                                                                            if (var3 != 62) {
                                                                                                                                              if (63 == var3) {
                                                                                                                                                return 18;
                                                                                                                                              } else {
                                                                                                                                                if (var3 == 64) {
                                                                                                                                                  return 18;
                                                                                                                                                } else {
                                                                                                                                                  if (65 == var3) {
                                                                                                                                                    return 18;
                                                                                                                                                  } else {
                                                                                                                                                    if (var3 == 66) {
                                                                                                                                                      return 18;
                                                                                                                                                    } else {
                                                                                                                                                      if (67 == var3) {
                                                                                                                                                        return 18;
                                                                                                                                                      } else {
                                                                                                                                                        if (var3 == 68) {
                                                                                                                                                          return 19;
                                                                                                                                                        } else {
                                                                                                                                                          if (69 != var3) {
                                                                                                                                                            if (var3 == 70) {
                                                                                                                                                              return 21;
                                                                                                                                                            } else {
                                                                                                                                                              if (71 == var3) {
                                                                                                                                                                return 21;
                                                                                                                                                              } else {
                                                                                                                                                                if (var3 != 72) {
                                                                                                                                                                  if (var3 == 73) {
                                                                                                                                                                    return 21;
                                                                                                                                                                  } else {
                                                                                                                                                                    if (var3 == 74) {
                                                                                                                                                                      return 21;
                                                                                                                                                                    } else {
                                                                                                                                                                      if (75 != var3) {
                                                                                                                                                                        if (var3 == 76) {
                                                                                                                                                                          return 21;
                                                                                                                                                                        } else {
                                                                                                                                                                          if (var3 == 77) {
                                                                                                                                                                            return 21;
                                                                                                                                                                          } else {
                                                                                                                                                                            if (var3 == 78) {
                                                                                                                                                                              return 21;
                                                                                                                                                                            } else {
                                                                                                                                                                              if (var3 != 79) {
                                                                                                                                                                                if (var3 == 80) {
                                                                                                                                                                                  return 21;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (81 == var3) {
                                                                                                                                                                                    return 21;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (var3 != 82) {
                                                                                                                                                                                      if (var3 != 83) {
                                                                                                                                                                                        if (84 != var3) {
                                                                                                                                                                                          if (var3 != 85) {
                                                                                                                                                                                            if (var3 != 86) {
                                                                                                                                                                                              if (var3 != 87) {
                                                                                                                                                                                                if (88 == var3) {
                                                                                                                                                                                                  return 21;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  if (var3 != 89) {
                                                                                                                                                                                                    if (var3 == 90) {
                                                                                                                                                                                                      return 21;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                      if (91 == var3) {
                                                                                                                                                                                                        return 21;
                                                                                                                                                                                                      } else {
                                                                                                                                                                                                        if (var3 != 92) {
                                                                                                                                                                                                          if (var3 == 93) {
                                                                                                                                                                                                            return 21;
                                                                                                                                                                                                          } else {
                                                                                                                                                                                                            if (var3 == 94) {
                                                                                                                                                                                                              return 22;
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                              if (95 != var3) {
                                                                                                                                                                                                                if (var3 != 96) {
                                                                                                                                                                                                                  if (var3 != 97) {
                                                                                                                                                                                                                    if (var3 != 98) {
                                                                                                                                                                                                                      if (var3 == 99) {
                                                                                                                                                                                                                        return 22;
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                        if (var3 != 100) {
                                                                                                                                                                                                                          if (var3 == 101) {
                                                                                                                                                                                                                            return 22;
                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                            if (var3 == 102) {
                                                                                                                                                                                                                              return 22;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                              if (var3 == 103) {
                                                                                                                                                                                                                                return 21;
                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                if (var3 == 104) {
                                                                                                                                                                                                                                  return 21;
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                  if (105 != var3) {
                                                                                                                                                                                                                                    if (106 != var3) {
                                                                                                                                                                                                                                      if (var3 == 107) {
                                                                                                                                                                                                                                        return 22;
                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                        if (var3 == 108) {
                                                                                                                                                                                                                                          return 23;
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                          if (var3 != 109) {
                                                                                                                                                                                                                                            if (110 != var3) {
                                                                                                                                                                                                                                              if (var3 != 111) {
                                                                                                                                                                                                                                                if (var3 != 112) {
                                                                                                                                                                                                                                                  if (var3 == 113) {
                                                                                                                                                                                                                                                    return 25;
                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                    if (var3 != 114) {
                                                                                                                                                                                                                                                      if (var3 == 115) {
                                                                                                                                                                                                                                                        return 26;
                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                        if (var3 != 116) {
                                                                                                                                                                                                                                                          if (var3 != 117) {
                                                                                                                                                                                                                                                            if (var3 == 118) {
                                                                                                                                                                                                                                                              return 26;
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                              if (var3 != 119) {
                                                                                                                                                                                                                                                                if (var3 != 120) {
                                                                                                                                                                                                                                                                  if (121 != var3) {
                                                                                                                                                                                                                                                                    if (var3 != 122) {
                                                                                                                                                                                                                                                                      if (var3 == 123) {
                                                                                                                                                                                                                                                                        return 28;
                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                        if (var3 == 124) {
                                                                                                                                                                                                                                                                          return 22;
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                          if (125 != var3) {
                                                                                                                                                                                                                                                                            if (var3 == 126) {
                                                                                                                                                                                                                                                                              return 22;
                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                              if (var3 != 127) {
                                                                                                                                                                                                                                                                                if (var3 == 128) {
                                                                                                                                                                                                                                                                                  return 22;
                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                  if (var3 != 129) {
                                                                                                                                                                                                                                                                                    if (var3 != 130) {
                                                                                                                                                                                                                                                                                      if (var3 != 131) {
                                                                                                                                                                                                                                                                                        if (132 == var3) {
                                                                                                                                                                                                                                                                                          return 22;
                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                          if (var3 != 133) {
                                                                                                                                                                                                                                                                                            if (var3 == 134) {
                                                                                                                                                                                                                                                                                              return 22;
                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                              stackOut_204_0 = 0;
                                                                                                                                                                                                                                                                                              stackIn_206_0 = stackOut_204_0;
                                                                                                                                                                                                                                                                                              break L0;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                            return 22;
                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                        return 22;
                                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                      return 22;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                    return 22;
                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                return 22;
                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                            return 22;
                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                      return 28;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                    return 28;
                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                  return 27;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                return 26;
                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                            return 26;
                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                          return 26;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                      return 25;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                  return 25;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                return 25;
                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                              return 2;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                            return 24;
                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                      return 22;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                    return 22;
                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                              }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                          }
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                          return 22;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                      }
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                      return 22;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                    return 22;
                                                                                                                                                                                                                  }
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                  return 22;
                                                                                                                                                                                                                }
                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                return 22;
                                                                                                                                                                                                              }
                                                                                                                                                                                                            }
                                                                                                                                                                                                          }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                          return 21;
                                                                                                                                                                                                        }
                                                                                                                                                                                                      }
                                                                                                                                                                                                    }
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    return 21;
                                                                                                                                                                                                  }
                                                                                                                                                                                                }
                                                                                                                                                                                              } else {
                                                                                                                                                                                                return 21;
                                                                                                                                                                                              }
                                                                                                                                                                                            } else {
                                                                                                                                                                                              return 21;
                                                                                                                                                                                            }
                                                                                                                                                                                          } else {
                                                                                                                                                                                            return 21;
                                                                                                                                                                                          }
                                                                                                                                                                                        } else {
                                                                                                                                                                                          return 21;
                                                                                                                                                                                        }
                                                                                                                                                                                      } else {
                                                                                                                                                                                        return 21;
                                                                                                                                                                                      }
                                                                                                                                                                                    } else {
                                                                                                                                                                                      return 21;
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              } else {
                                                                                                                                                                                return 21;
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      } else {
                                                                                                                                                                        return 21;
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                } else {
                                                                                                                                                                  return 21;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                          } else {
                                                                                                                                                            return 2;
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            } else {
                                                                                                                                              return 18;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          return 17;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      return 17;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 17;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 17;
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 16;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 16;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 16;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 16;
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 16;
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 15;
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 14;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 12;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                return 11;
                                                                                              }
                                                                                            } else {
                                                                                              return 11;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        return 9;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  return 8;
                                                                                }
                                                                              } else {
                                                                                return 8;
                                                                              }
                                                                            } else {
                                                                              return 8;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          return 2;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      return 6;
                                                                    }
                                                                  }
                                                                } else {
                                                                  return 5;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        return 4;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                return 3;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                            return 1;
                          }
                        }
                      }
                    }
                  } else {
                    return 0;
                  }
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            stackOut_205_0 = 0;
            stackIn_206_0 = stackOut_205_0;
            break L0;
          }
          return stackIn_206_0;
        } else {
          return 0;
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String[] stackIn_44_2 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_45_2 = null;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String[] stackIn_46_2 = null;
        int stackIn_46_3 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        String[] stackOut_43_2 = null;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String[] stackOut_45_2 = null;
        int stackOut_45_3 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String[] stackOut_44_2 = null;
        int stackOut_44_3 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 <= -113) {
            break L0;
          } else {
            String discarded$2 = this.a((byte) -54, -8);
            break L0;
          }
        }
        L1: {
          ((gb) this).field_c = true;
          ((gb) this).field_k = param1;
          ((gb) this).d((byte) 37);
          this.d(-85, -1);
          var6 = param1;
          if (var6 != 2) {
            if (var6 != 1) {
              if (var6 == 3) {
                ((gb) this).a(r.field_E[1], (byte) 111);
                ((gb) this).field_w = 1;
                this.d(-75, 255);
                break L1;
              } else {
                if (5 == var6) {
                  ((gb) this).field_C = ((gb) this).field_C + 1;
                  if (-1 != ((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C]) {
                    var6 = 0;
                    L2: while (true) {
                      if (var6 >= ((gb) this).field_C) {
                        L3: {
                          var3 = uc.field_d[((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C]][3];
                          var4 = this.a((byte) 66, ((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C]);
                          if (var4 == null) {
                            L4: {
                              if (var3 == 4) {
                                var4 = r.field_E[22];
                                break L4;
                              } else {
                                var4 = r.field_E[26];
                                break L4;
                              }
                            }
                            var4 = fo.a(4800, var4, new String[1]);
                            ((gb) this).field_w = 1;
                            ((gb) this).field_k = 8;
                            this.d(-37, ((gb) this).field_C);
                            break L3;
                          } else {
                            ((gb) this).field_k = 9;
                            ((gb) this).field_w = 0;
                            break L3;
                          }
                        }
                        ((gb) this).a(fo.a(4800, r.field_E[3 - -((gb) this).field_C], new String[3]), (byte) 109);
                        break L1;
                      } else {
                        if (~((gb) this).field_q.field_xb.field_B[0][var6] == ~((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C]) {
                          ((gb) this).a(fo.a(4800, r.field_E[31], new String[1]), (byte) 119);
                          ((gb) this).field_w = 0;
                          ((gb) this).field_k = 9;
                          L5: while (true) {
                            L6: {
                              if (((gb) this).field_C >= 5) {
                                break L6;
                              } else {
                                if (~((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C] != ~((gb) this).field_q.field_xb.field_B[0][var6]) {
                                  break L6;
                                } else {
                                  ((gb) this).field_C = ((gb) this).field_C + 1;
                                  continue L5;
                                }
                              }
                            }
                            ((gb) this).field_C = ((gb) this).field_C - 1;
                            return;
                          }
                        } else {
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    ((gb) this).a(r.field_E[24], (byte) 117);
                    L7: while (true) {
                      L8: {
                        if (((gb) this).field_C >= 5) {
                          break L8;
                        } else {
                          if (-1 != ((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C]) {
                            break L8;
                          } else {
                            ((gb) this).field_C = ((gb) this).field_C + 1;
                            continue L7;
                          }
                        }
                      }
                      ((gb) this).field_k = 9;
                      ((gb) this).field_w = 0;
                      ((gb) this).field_C = ((gb) this).field_C - 1;
                      return;
                    }
                  }
                } else {
                  if (11 == var6) {
                    L9: {
                      var4 = r.field_E[26];
                      String dupTemp$3 = fo.a(4800, var4, new String[1]);
                      var8 = dupTemp$3;
                      var4 = dupTemp$3;
                      stackOut_43_0 = this;
                      stackOut_43_1 = 4800;
                      stackOut_43_2 = r.field_E;
                      stackIn_45_0 = stackOut_43_0;
                      stackIn_45_1 = stackOut_43_1;
                      stackIn_45_2 = stackOut_43_2;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      stackIn_44_2 = stackOut_43_2;
                      if (((gb) this).field_q.field_gc < 0) {
                        stackOut_45_0 = this;
                        stackOut_45_1 = stackIn_45_1;
                        stackOut_45_2 = (String[]) (Object) stackIn_45_2;
                        stackOut_45_3 = 1;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        stackIn_46_2 = stackOut_45_2;
                        stackIn_46_3 = stackOut_45_3;
                        break L9;
                      } else {
                        stackOut_44_0 = this;
                        stackOut_44_1 = stackIn_44_1;
                        stackOut_44_2 = (String[]) (Object) stackIn_44_2;
                        stackOut_44_3 = 0;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        stackIn_46_2 = stackOut_44_2;
                        stackIn_46_3 = stackOut_44_3;
                        break L9;
                      }
                    }
                    ((gb) this).a(fo.a(stackIn_46_1, stackIn_46_2[stackIn_46_3 + 32], new String[1]), (byte) 125);
                    this.d(-122, ((gb) this).field_C);
                    ((gb) this).field_w = 1;
                    break L1;
                  } else {
                    if (var6 != 6) {
                      if (10 != var6) {
                        if (var6 != 12) {
                          if (var6 == 14) {
                            ((gb) this).a(r.field_E[30], (byte) 110);
                            ((gb) this).field_w = 3;
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          L10: {
                            var9 = us.field_b[this.i(-134)];
                            var5 = var9;
                            if (((gb) this).field_C == 0) {
                              var5 = fo.a(4800, r.field_E[27], new String[1]);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((gb) this).a(var5, (byte) 126);
                          ((gb) this).field_w = 0;
                          break L1;
                        }
                      } else {
                        ((gb) this).a(r.field_E[29], (byte) 110);
                        ((gb) this).field_w = 1;
                        break L1;
                      }
                    } else {
                      ((gb) this).field_w = 1;
                      break L1;
                    }
                  }
                }
              }
            } else {
              ((gb) this).a(r.field_E[0], (byte) 126);
              ((gb) this).field_w = 0;
              break L1;
            }
          } else {
            ((gb) this).a(r.field_E[2], (byte) 111);
            ((gb) this).field_w = 4;
            break L1;
          }
        }
    }

    private final boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((gb) this).field_q.field_T == null) {
          return false;
        } else {
          L0: {
            var2 = ((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C];
            if (var2 != 36) {
              if (var2 == 34) {
                if (((gb) this).field_q.field_T.field_O != 0) {
                  break L0;
                } else {
                  if (!((gb) this).field_q.field_T.field_s) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                if (var2 == 35) {
                  if (((gb) this).field_q.field_T.field_O != 0) {
                    break L0;
                  } else {
                    if (((gb) this).field_q.field_T.field_s) {
                      break L0;
                    } else {
                      return true;
                    }
                  }
                } else {
                  if (var2 != 109) {
                    break L0;
                  } else {
                    if (((gb) this).field_q.field_T.field_O != 0) {
                      break L0;
                    } else {
                      if (((gb) this).field_q.field_T.field_s) {
                        break L0;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
            } else {
              if (((gb) this).field_q.field_T.field_O == 0) {
                break L0;
              } else {
                if (((gb) this).field_q.field_T.field_s) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
          }
          return false;
        }
    }

    private final void d(int param0, int param1) {
        ((gb) this).field_q.field_Jb = param1;
        if (param0 > 0) {
            field_B = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = true;
        field_y = 480;
        field_z = 7;
    }
}
