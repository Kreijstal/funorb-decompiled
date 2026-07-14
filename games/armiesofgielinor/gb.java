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
        int var2_int = 0;
        ((gb) this).field_C = -1;
        if (!param0.field_xb.field_Cb) {
            this.e(-119, 2);
        } else {
            this.e(-124, 1);
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
        for (var2_int = 0; br.field_c.length > var2_int; var2_int++) {
            param0.field_xb.field_Eb[br.field_c[var2_int]].a(126);
        }
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
        jd var2 = (jd) (Object) param0.field_xb.field_t[1].e((byte) 95);
        while (var2 != null) {
            var2.a((jd) (Object) param0.field_xb.field_t[0].e((byte) 94), 2048);
            var2 = (jd) (Object) param0.field_xb.field_t[1].a((byte) 123);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = 0;
        if ((param1 ^ -1) > 0) {
          return;
        } else {
          L0: {
            if (ks.field_y < param1) {
              break L0;
            } else {
              if ((param0 ^ -1) > 0) {
                break L0;
              } else {
                if ((param0 ^ -1) >= (ef.field_c ^ -1)) {
                  L1: {
                    L2: {
                      if (0 == (param1 ^ -1)) {
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
                      if (0 == (param0 ^ -1)) {
                        break L4;
                      } else {
                        if ((param0 ^ -1) == (ef.field_c ^ -1)) {
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
                      if ((param1 ^ -1) == (ks.field_y ^ -1)) {
                        var5++;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) < -1) {
                      if (th.a(param0 + param1, 1, 2) != 0) {
                        hq.field_a[(og.field_p[th.a(param1, 1, ks.field_y) - -(th.a(param0, 1, ef.field_c) * ks.field_y)] % 6 - -1 << 1352379746) + -1 + var5].a(param2, param3);
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
        kr.field_y[param1] = param6;
        kr.field_D.a(param3, param5, (byte) 18, param4, param2, param0, param1);
        if (param7 >= -26) {
            Object var9 = null;
            gb.a((wk[]) null, -121, -66, -22, -91);
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = ((gb) this).field_k;
          if ((var4 ^ -1) != -2) {
            if (-3 != (var4 ^ -1)) {
              if (-4 == (var4 ^ -1)) {
                if (-20 == (param2 ^ -1)) {
                  this.e(param1 ^ 126, 5);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                if ((var4 ^ -1) == -10) {
                  if (param2 == 2) {
                    if (-5 >= (((gb) this).field_C ^ -1)) {
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
                  if ((var4 ^ -1) != -9) {
                    if (-12 != (var4 ^ -1)) {
                      if (-11 == (var4 ^ -1)) {
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
                        if ((param2 ^ -1) != -28) {
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
                        if (-7 == (var4 ^ -1)) {
                          L2: {
                            if ((param2 ^ -1) != -26) {
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
                              if (-29 == (param2 ^ -1)) {
                                break L4;
                              } else {
                                if (-5 != (param2 ^ -1)) {
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
                          if (-28 != (param2 ^ -1)) {
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
                          if (-13 == (var4 ^ -1)) {
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
            if ((param2 ^ -1) == -3) {
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
        if ((((gb) this).field_q.field_xb.field_E[0][-1 + jv.a(false, param0)] ^ -1) == -1) {
            return true;
        }
        if (-1 == (((gb) this).field_q.field_xb.field_a[0][jv.a(false, param0) - 1] & 1 << var3 ^ -1)) {
            return true;
        }
        if (param1 > 0) {
            gb.a(-50, 57, -48, -76, (byte) -116);
        }
        return false;
    }

    private final String a(byte param0, int param1) {
        if (-5 == (uc.field_d[param1][3] ^ -1)) {
            if (1 == uc.field_d[param1][5]) {
                if (!(!this.c(uc.field_d[param1][6], 121))) {
                    return r.field_E[23];
                }
            }
        }
        if (-116 == (param1 ^ -1)) {
            if (this.b(63, (byte) -9)) {
                return r.field_E[25];
            }
        }
        if ((param1 ^ -1) == -116) {
            if (this.b(63, (byte) -58)) {
                return r.field_E[25];
            }
        }
        if (-117 == (param1 ^ -1)) {
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
              if ((var3 ^ -1) != -1) {
                if (1 == var3) {
                  break L1;
                } else {
                  if (var3 != 2) {
                    if (var3 == 3) {
                      break L1;
                    } else {
                      if ((var3 ^ -1) != -5) {
                        if ((var3 ^ -1) != -6) {
                          if ((var3 ^ -1) == -7) {
                            break L1;
                          } else {
                            L2: {
                              if (var3 == 7) {
                                break L2;
                              } else {
                                if (-9 != (var3 ^ -1)) {
                                  if ((var3 ^ -1) != -10) {
                                    if ((var3 ^ -1) == -11) {
                                      break L2;
                                    } else {
                                      if (11 != var3) {
                                        L3: {
                                          if (12 != var3) {
                                            if (-14 == (var3 ^ -1)) {
                                              break L3;
                                            } else {
                                              if (var3 != 14) {
                                                if (15 != var3) {
                                                  if (var3 == 16) {
                                                    break L3;
                                                  } else {
                                                    if (-18 != (var3 ^ -1)) {
                                                      L4: {
                                                        if ((var3 ^ -1) != -19) {
                                                          if (-20 == (var3 ^ -1)) {
                                                            break L4;
                                                          } else {
                                                            if (var3 != 20) {
                                                              if (21 == var3) {
                                                                break L4;
                                                              } else {
                                                                if ((var3 ^ -1) == -23) {
                                                                  break L4;
                                                                } else {
                                                                  if (-24 == (var3 ^ -1)) {
                                                                    ((gb) this).a(r.field_E[15], (byte) 115);
                                                                    this.e(-121, 6);
                                                                    break L0;
                                                                  } else {
                                                                    if ((var3 ^ -1) != -25) {
                                                                      if ((var3 ^ -1) == -26) {
                                                                        ((gb) this).a(r.field_E[12], (byte) 125);
                                                                        this.e(-126, 6);
                                                                        break L0;
                                                                      } else {
                                                                        if (-27 == (var3 ^ -1)) {
                                                                          ((gb) this).a(r.field_E[13], (byte) 114);
                                                                          this.e(-123, 6);
                                                                          break L0;
                                                                        } else {
                                                                          if (27 != var3) {
                                                                            L5: {
                                                                              if (-29 != (var3 ^ -1)) {
                                                                                if (-30 == (var3 ^ -1)) {
                                                                                  break L5;
                                                                                } else {
                                                                                  if ((var3 ^ -1) != -31) {
                                                                                    if (-32 != (var3 ^ -1)) {
                                                                                      if (32 == var3) {
                                                                                        break L5;
                                                                                      } else {
                                                                                        if (var3 == 33) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (-35 != (var3 ^ -1)) {
                                                                                            if ((var3 ^ -1) != -36) {
                                                                                              if ((var3 ^ -1) != -37) {
                                                                                                L6: {
                                                                                                  if (var3 == 37) {
                                                                                                    break L6;
                                                                                                  } else {
                                                                                                    if (-39 == (var3 ^ -1)) {
                                                                                                      break L6;
                                                                                                    } else {
                                                                                                      if (39 != var3) {
                                                                                                        if (var3 != 40) {
                                                                                                          if (-42 != (var3 ^ -1)) {
                                                                                                            if (var3 == 42) {
                                                                                                              break L6;
                                                                                                            } else {
                                                                                                              if ((var3 ^ -1) != -44) {
                                                                                                                if (-45 == (var3 ^ -1)) {
                                                                                                                  ((gb) this).a(r.field_E[14], (byte) 123);
                                                                                                                  this.e(-119, 6);
                                                                                                                  break L0;
                                                                                                                } else {
                                                                                                                  if (-46 != (var3 ^ -1)) {
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
                                                                                                                              if (-51 != (var3 ^ -1)) {
                                                                                                                                if (51 != var3) {
                                                                                                                                  if ((var3 ^ -1) == -53) {
                                                                                                                                    break L7;
                                                                                                                                  } else {
                                                                                                                                    if (-54 == (var3 ^ -1)) {
                                                                                                                                      break L7;
                                                                                                                                    } else {
                                                                                                                                      L8: {
                                                                                                                                        if ((var3 ^ -1) != -55) {
                                                                                                                                          if (55 == var3) {
                                                                                                                                            break L8;
                                                                                                                                          } else {
                                                                                                                                            if (var3 != 56) {
                                                                                                                                              if (-58 == (var3 ^ -1)) {
                                                                                                                                                break L8;
                                                                                                                                              } else {
                                                                                                                                                if ((var3 ^ -1) != -59) {
                                                                                                                                                  if ((var3 ^ -1) != -60) {
                                                                                                                                                    if (-61 == (var3 ^ -1)) {
                                                                                                                                                      break L8;
                                                                                                                                                    } else {
                                                                                                                                                      L9: {
                                                                                                                                                        if ((var3 ^ -1) != -62) {
                                                                                                                                                          if ((var3 ^ -1) == -63) {
                                                                                                                                                            break L9;
                                                                                                                                                          } else {
                                                                                                                                                            if (var3 == 63) {
                                                                                                                                                              break L9;
                                                                                                                                                            } else {
                                                                                                                                                              if ((var3 ^ -1) == -65) {
                                                                                                                                                                break L9;
                                                                                                                                                              } else {
                                                                                                                                                                if (var3 != 65) {
                                                                                                                                                                  if ((var3 ^ -1) == -67) {
                                                                                                                                                                    break L9;
                                                                                                                                                                  } else {
                                                                                                                                                                    if (67 == var3) {
                                                                                                                                                                      break L9;
                                                                                                                                                                    } else {
                                                                                                                                                                      if ((var3 ^ -1) == -69) {
                                                                                                                                                                        ((gb) this).a(r.field_E[8], (byte) 121);
                                                                                                                                                                        this.e(-116, 6);
                                                                                                                                                                        break L0;
                                                                                                                                                                      } else {
                                                                                                                                                                        L10: {
                                                                                                                                                                          if ((var3 ^ -1) != -70) {
                                                                                                                                                                            if (var3 == 70) {
                                                                                                                                                                              break L10;
                                                                                                                                                                            } else {
                                                                                                                                                                              if ((var3 ^ -1) != -72) {
                                                                                                                                                                                if (72 == var3) {
                                                                                                                                                                                  break L10;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (-74 != (var3 ^ -1)) {
                                                                                                                                                                                    if ((var3 ^ -1) != -75) {
                                                                                                                                                                                      if (75 != var3) {
                                                                                                                                                                                        if ((var3 ^ -1) == -77) {
                                                                                                                                                                                          break L10;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          if (-78 == (var3 ^ -1)) {
                                                                                                                                                                                            break L10;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            if (-79 == (var3 ^ -1)) {
                                                                                                                                                                                              break L10;
                                                                                                                                                                                            } else {
                                                                                                                                                                                              if ((var3 ^ -1) == -80) {
                                                                                                                                                                                                break L10;
                                                                                                                                                                                              } else {
                                                                                                                                                                                                if ((var3 ^ -1) == -81) {
                                                                                                                                                                                                  break L10;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  if ((var3 ^ -1) == -82) {
                                                                                                                                                                                                    break L10;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    if (var3 != 82) {
                                                                                                                                                                                                      if ((var3 ^ -1) == -84) {
                                                                                                                                                                                                        break L10;
                                                                                                                                                                                                      } else {
                                                                                                                                                                                                        if (84 != var3) {
                                                                                                                                                                                                          if (85 != var3) {
                                                                                                                                                                                                            if ((var3 ^ -1) != -87) {
                                                                                                                                                                                                              if (var3 == 87) {
                                                                                                                                                                                                                break L10;
                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                if (-89 != (var3 ^ -1)) {
                                                                                                                                                                                                                  if (-90 == (var3 ^ -1)) {
                                                                                                                                                                                                                    break L10;
                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                    if (90 == var3) {
                                                                                                                                                                                                                      break L10;
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                      if (91 == var3) {
                                                                                                                                                                                                                        break L10;
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                        if (-93 != (var3 ^ -1)) {
                                                                                                                                                                                                                          if (-94 != (var3 ^ -1)) {
                                                                                                                                                                                                                            if (var3 == 94) {
                                                                                                                                                                                                                              break L10;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                              if (95 != var3) {
                                                                                                                                                                                                                                if ((var3 ^ -1) == -97) {
                                                                                                                                                                                                                                  break L10;
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                  if ((var3 ^ -1) == -98) {
                                                                                                                                                                                                                                    break L10;
                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                    if ((var3 ^ -1) != -99) {
                                                                                                                                                                                                                                      if ((var3 ^ -1) != -100) {
                                                                                                                                                                                                                                        if ((var3 ^ -1) != -101) {
                                                                                                                                                                                                                                          if ((var3 ^ -1) == -102) {
                                                                                                                                                                                                                                            break L10;
                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                            if ((var3 ^ -1) == -103) {
                                                                                                                                                                                                                                              break L10;
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                              if ((var3 ^ -1) == -104) {
                                                                                                                                                                                                                                                break L10;
                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                if (104 == var3) {
                                                                                                                                                                                                                                                  break L10;
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                  if (var3 != 105) {
                                                                                                                                                                                                                                                    if (var3 != 106) {
                                                                                                                                                                                                                                                      if (var3 != 107) {
                                                                                                                                                                                                                                                        if (108 != var3) {
                                                                                                                                                                                                                                                          if (-110 != (var3 ^ -1)) {
                                                                                                                                                                                                                                                            if (-111 == (var3 ^ -1)) {
                                                                                                                                                                                                                                                              break L10;
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                              if ((var3 ^ -1) == -112) {
                                                                                                                                                                                                                                                                ((gb) this).a(r.field_E[13], (byte) 125);
                                                                                                                                                                                                                                                                this.e(-117, 6);
                                                                                                                                                                                                                                                                break L0;
                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                if ((var3 ^ -1) == -113) {
                                                                                                                                                                                                                                                                  ((gb) this).a(r.field_E[13], (byte) 123);
                                                                                                                                                                                                                                                                  this.e(-115, 6);
                                                                                                                                                                                                                                                                  break L0;
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                  if (113 != var3) {
                                                                                                                                                                                                                                                                    if ((var3 ^ -1) != -115) {
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
                                                                                                                                                                                                                                                                        if (-117 != (var3 ^ -1)) {
                                                                                                                                                                                                                                                                          if (var3 != 117) {
                                                                                                                                                                                                                                                                            if ((var3 ^ -1) == -119) {
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
                                                                                                                                                                                                                                                                                      if ((var3 ^ -1) == -124) {
                                                                                                                                                                                                                                                                                        ((gb) this).a(r.field_E[8], (byte) 114);
                                                                                                                                                                                                                                                                                        this.e(-128, 6);
                                                                                                                                                                                                                                                                                        break L0;
                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                        if (-125 == (var3 ^ -1)) {
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
                                                                                                                                                                                                                                                                                                  if ((var3 ^ -1) != -130) {
                                                                                                                                                                                                                                                                                                    if (-131 == (var3 ^ -1)) {
                                                                                                                                                                                                                                                                                                      ((gb) this).a(r.field_E[9], (byte) 126);
                                                                                                                                                                                                                                                                                                      this.e(-122, 6);
                                                                                                                                                                                                                                                                                                      break L0;
                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                      if (-132 == (var3 ^ -1)) {
                                                                                                                                                                                                                                                                                                        ((gb) this).a(r.field_E[9], (byte) 125);
                                                                                                                                                                                                                                                                                                        this.e(-126, 6);
                                                                                                                                                                                                                                                                                                        break L0;
                                                                                                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                                                                                                        if (var3 != 132) {
                                                                                                                                                                                                                                                                                                          if (133 != var3) {
                                                                                                                                                                                                                                                                                                            if (-135 != (var3 ^ -1)) {
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (param0 != null) {
            if (param3 <= 0) {
                return;
            }
            var5 = param0[0].field_A;
            var6 = param0[2].field_A;
            var7 = param0[1].field_A;
            param0[0].g(param1, param2);
            param0[2].g(param3 + (param1 - var6), param2);
            qn.b(an.field_H);
            qn.b(param1 - -var5, param2, param1 + (param3 + -var6), param0[1].field_x + param2);
            var8 = var5 + param1;
            var9 = param3 + param1 - var6;
            param1 = var8;
            while ((var9 ^ -1) < (param1 ^ -1)) {
                param0[1].g(param1, param2);
                param1 = param1 + var7;
            }
            if (param4 != 8941) {
                Object var10 = null;
                gb.a((wk[]) null, -52, 126, 81, -73);
            }
            qn.a(an.field_H);
            return;
        }
    }

    private final int i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_208_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_207_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = ((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C];
        if (param0 == -134) {
          var3 = var2;
          if (var3 != -1) {
            L0: {
              L1: {
                if (-1 != (var3 ^ -1)) {
                  if ((var3 ^ -1) != -2) {
                    if (2 != var3) {
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
                              L2: {
                                if (-8 != (var3 ^ -1)) {
                                  if ((var3 ^ -1) != -9) {
                                    if (-10 != (var3 ^ -1)) {
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
                                              if (14 != var3) {
                                                if ((var3 ^ -1) != -16) {
                                                  if ((var3 ^ -1) == -17) {
                                                    return 3;
                                                  } else {
                                                    if (17 == var3) {
                                                      return 3;
                                                    } else {
                                                      if (var3 == 18) {
                                                        return 4;
                                                      } else {
                                                        if ((var3 ^ -1) != -20) {
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
                                                                  if (-25 != (var3 ^ -1)) {
                                                                    if (25 == var3) {
                                                                      return 6;
                                                                    } else {
                                                                      if (26 != var3) {
                                                                        if ((var3 ^ -1) == -28) {
                                                                          return 7;
                                                                        } else {
                                                                          if (var3 != 28) {
                                                                            if (-30 == (var3 ^ -1)) {
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
                                                                                          if (-37 == (var3 ^ -1)) {
                                                                                            return 10;
                                                                                          } else {
                                                                                            if (-38 == (var3 ^ -1)) {
                                                                                              return 11;
                                                                                            } else {
                                                                                              if (var3 != 38) {
                                                                                                if (var3 != 39) {
                                                                                                  if ((var3 ^ -1) == -41) {
                                                                                                    return 11;
                                                                                                  } else {
                                                                                                    if (41 == var3) {
                                                                                                      return 11;
                                                                                                    } else {
                                                                                                      if (42 == var3) {
                                                                                                        return 11;
                                                                                                      } else {
                                                                                                        if (var3 != 43) {
                                                                                                          if (-45 == (var3 ^ -1)) {
                                                                                                            return 13;
                                                                                                          } else {
                                                                                                            if (var3 != 45) {
                                                                                                              if (46 != var3) {
                                                                                                                if (var3 != 47) {
                                                                                                                  if ((var3 ^ -1) != -49) {
                                                                                                                    if (-50 != (var3 ^ -1)) {
                                                                                                                      if (var3 == 50) {
                                                                                                                        return 16;
                                                                                                                      } else {
                                                                                                                        if (-52 != (var3 ^ -1)) {
                                                                                                                          if (-53 == (var3 ^ -1)) {
                                                                                                                            return 16;
                                                                                                                          } else {
                                                                                                                            if ((var3 ^ -1) != -54) {
                                                                                                                              if ((var3 ^ -1) != -55) {
                                                                                                                                if (-56 == (var3 ^ -1)) {
                                                                                                                                  return 17;
                                                                                                                                } else {
                                                                                                                                  if (-57 != (var3 ^ -1)) {
                                                                                                                                    if (-58 == (var3 ^ -1)) {
                                                                                                                                      return 17;
                                                                                                                                    } else {
                                                                                                                                      if (58 != var3) {
                                                                                                                                        if (-60 == (var3 ^ -1)) {
                                                                                                                                          return 17;
                                                                                                                                        } else {
                                                                                                                                          if (var3 != 60) {
                                                                                                                                            if (-62 == (var3 ^ -1)) {
                                                                                                                                              return 18;
                                                                                                                                            } else {
                                                                                                                                              if ((var3 ^ -1) != -63) {
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
                                                                                                                                                            if (69 != var3) {
                                                                                                                                                              if (-71 == (var3 ^ -1)) {
                                                                                                                                                                return 21;
                                                                                                                                                              } else {
                                                                                                                                                                if (71 == var3) {
                                                                                                                                                                  return 21;
                                                                                                                                                                } else {
                                                                                                                                                                  if (-73 != (var3 ^ -1)) {
                                                                                                                                                                    if (-74 == (var3 ^ -1)) {
                                                                                                                                                                      return 21;
                                                                                                                                                                    } else {
                                                                                                                                                                      if (-75 == (var3 ^ -1)) {
                                                                                                                                                                        return 21;
                                                                                                                                                                      } else {
                                                                                                                                                                        if (75 != var3) {
                                                                                                                                                                          if (var3 == 76) {
                                                                                                                                                                            return 21;
                                                                                                                                                                          } else {
                                                                                                                                                                            if (-78 == (var3 ^ -1)) {
                                                                                                                                                                              return 21;
                                                                                                                                                                            } else {
                                                                                                                                                                              if (var3 == 78) {
                                                                                                                                                                                return 21;
                                                                                                                                                                              } else {
                                                                                                                                                                                if (var3 != 79) {
                                                                                                                                                                                  if ((var3 ^ -1) == -81) {
                                                                                                                                                                                    return 21;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (81 == var3) {
                                                                                                                                                                                      return 21;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if (-83 != (var3 ^ -1)) {
                                                                                                                                                                                        if (var3 != 83) {
                                                                                                                                                                                          if (84 != var3) {
                                                                                                                                                                                            if ((var3 ^ -1) != -86) {
                                                                                                                                                                                              if (-87 != (var3 ^ -1)) {
                                                                                                                                                                                                if (-88 != (var3 ^ -1)) {
                                                                                                                                                                                                  if (88 == var3) {
                                                                                                                                                                                                    return 21;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    if (-90 != (var3 ^ -1)) {
                                                                                                                                                                                                      if (-91 == (var3 ^ -1)) {
                                                                                                                                                                                                        return 21;
                                                                                                                                                                                                      } else {
                                                                                                                                                                                                        if (91 == var3) {
                                                                                                                                                                                                          return 21;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                          if ((var3 ^ -1) != -93) {
                                                                                                                                                                                                            if (var3 == 93) {
                                                                                                                                                                                                              return 21;
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                              if (-95 == (var3 ^ -1)) {
                                                                                                                                                                                                                return 22;
                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                if (95 != var3) {
                                                                                                                                                                                                                  if ((var3 ^ -1) != -97) {
                                                                                                                                                                                                                    if ((var3 ^ -1) != -98) {
                                                                                                                                                                                                                      if (var3 != 98) {
                                                                                                                                                                                                                        if (-100 == (var3 ^ -1)) {
                                                                                                                                                                                                                          return 22;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                          if (-101 != (var3 ^ -1)) {
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
                                                                                                                                                                                                                                    if (105 != var3) {
                                                                                                                                                                                                                                      if (106 != var3) {
                                                                                                                                                                                                                                        if (var3 == 107) {
                                                                                                                                                                                                                                          return 22;
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                          if (-109 == (var3 ^ -1)) {
                                                                                                                                                                                                                                            return 23;
                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                            if ((var3 ^ -1) != -110) {
                                                                                                                                                                                                                                              if (110 != var3) {
                                                                                                                                                                                                                                                if ((var3 ^ -1) != -112) {
                                                                                                                                                                                                                                                  if ((var3 ^ -1) != -113) {
                                                                                                                                                                                                                                                    if (var3 == 113) {
                                                                                                                                                                                                                                                      return 25;
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                      if (-115 != (var3 ^ -1)) {
                                                                                                                                                                                                                                                        if (var3 == 115) {
                                                                                                                                                                                                                                                          return 26;
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                          if ((var3 ^ -1) != -117) {
                                                                                                                                                                                                                                                            if (var3 != 117) {
                                                                                                                                                                                                                                                              if ((var3 ^ -1) == -119) {
                                                                                                                                                                                                                                                                return 26;
                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                if ((var3 ^ -1) != -120) {
                                                                                                                                                                                                                                                                  if (-121 != (var3 ^ -1)) {
                                                                                                                                                                                                                                                                    if (121 != var3) {
                                                                                                                                                                                                                                                                      if ((var3 ^ -1) != -123) {
                                                                                                                                                                                                                                                                        if (-124 == (var3 ^ -1)) {
                                                                                                                                                                                                                                                                          return 28;
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                          if ((var3 ^ -1) == -125) {
                                                                                                                                                                                                                                                                            return 22;
                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                            if (125 != var3) {
                                                                                                                                                                                                                                                                              if (-127 == (var3 ^ -1)) {
                                                                                                                                                                                                                                                                                return 22;
                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                if (var3 != 127) {
                                                                                                                                                                                                                                                                                  if (-129 == (var3 ^ -1)) {
                                                                                                                                                                                                                                                                                    return 22;
                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                    if (var3 != 129) {
                                                                                                                                                                                                                                                                                      if (var3 != 130) {
                                                                                                                                                                                                                                                                                        if (var3 != 131) {
                                                                                                                                                                                                                                                                                          if (132 == var3) {
                                                                                                                                                                                                                                                                                            return 22;
                                                                                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                                                                                            if (-134 != (var3 ^ -1)) {
                                                                                                                                                                                                                                                                                              if ((var3 ^ -1) == -135) {
                                                                                                                                                                                                                                                                                                return 22;
                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                stackOut_206_0 = 0;
                                                                                                                                                                                                                                                                                                stackIn_208_0 = stackOut_206_0;
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
              stackOut_207_0 = 0;
              stackIn_208_0 = stackOut_207_0;
              break L0;
            }
            return stackIn_208_0;
          } else {
            return 0;
          }
        } else {
          return 8;
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        String var4 = null;
        String var4_ref = null;
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
            String discarded$1 = this.a((byte) -54, -8);
            break L0;
          }
        }
        L1: {
          ((gb) this).field_c = true;
          ((gb) this).field_k = param1;
          ((gb) this).d((byte) 37);
          this.d(-85, -1);
          var6 = param1;
          if ((var6 ^ -1) != -3) {
            if (var6 != 1) {
              if ((var6 ^ -1) == -4) {
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
                          var4_ref = this.a((byte) 66, ((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C]);
                          if (var4_ref == null) {
                            L4: {
                              if ((var3 ^ -1) == -5) {
                                var4 = r.field_E[22];
                                break L4;
                              } else {
                                var4 = r.field_E[26];
                                break L4;
                              }
                            }
                            var4_ref = fo.a(4800, var4, new String[1]);
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
                        if ((((gb) this).field_q.field_xb.field_B[0][var6] ^ -1) == (((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C] ^ -1)) {
                          ((gb) this).a(fo.a(4800, r.field_E[31], new String[1]), (byte) 119);
                          ((gb) this).field_w = 0;
                          ((gb) this).field_k = 9;
                          L5: while (true) {
                            L6: {
                              if (-6 >= (((gb) this).field_C ^ -1)) {
                                break L6;
                              } else {
                                if ((((gb) this).field_q.field_xb.field_B[0][((gb) this).field_C] ^ -1) != (((gb) this).field_q.field_xb.field_B[0][var6] ^ -1)) {
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
                        if (-6 >= (((gb) this).field_C ^ -1)) {
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
                      var8 = fo.a(4800, var4, new String[1]);
                      var4_ref = fo.a(4800, var4, new String[1]);
                      stackOut_43_0 = this;
                      stackOut_43_1 = 4800;
                      stackOut_43_2 = r.field_E;
                      stackIn_45_0 = stackOut_43_0;
                      stackIn_45_1 = stackOut_43_1;
                      stackIn_45_2 = stackOut_43_2;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      stackIn_44_2 = stackOut_43_2;
                      if ((((gb) this).field_q.field_gc ^ -1) > -1) {
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
                    ((gb) this).a(fo.a(stackIn_46_1, (String) (Object) stackIn_46_2[stackIn_46_3 + 32], new String[1]), (byte) 125);
                    this.d(-122, ((gb) this).field_C);
                    ((gb) this).field_w = 1;
                    break L1;
                  } else {
                    if ((var6 ^ -1) != -7) {
                      if (10 != var6) {
                        if (-13 != (var6 ^ -1)) {
                          if ((var6 ^ -1) == -15) {
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
            if (-37 != (var2 ^ -1)) {
              if (-35 == (var2 ^ -1)) {
                if ((((gb) this).field_q.field_T.field_O ^ -1) != -1) {
                  break L0;
                } else {
                  if (!((gb) this).field_q.field_T.field_s) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              } else {
                if (-36 == (var2 ^ -1)) {
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
                  if (-110 != (var2 ^ -1)) {
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
          if (param0 == -36) {
            return false;
          } else {
            field_z = 53;
            return false;
          }
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
