/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends we {
    static String field_r;

    final boolean b(int param0, int param1) {
        if (param1 != -30487) {
            return true;
        }
        return this.c(param0, 0);
    }

    private final int h(int param0, int param1) {
        if (param1 != 1) {
            this.b(true, true, 29);
        }
        return this.field_m[param0].e(param1 ^ -164);
    }

    public static void d(int param0) {
        if (param0 != 72) {
            return;
        }
        field_r = null;
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
            this.a(-68, false);
        }
        return this.a((byte) 112, param0) - -this.h(param0, 1);
    }

    final void b(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if ((param2 ^ -1) > -1) {
          return;
        } else {
          if (this.field_m.length <= param2) {
            return;
          } else {
            if (this.b(param2, -30487)) {
              L0: {
                L1: {
                  L2: {
                    L3: {
                      L4: {
                        super.b(param0, param1, param2);
                        var4 = this.field_m[param2].field_g;
                        var5 = var4;
                        if ((var5 ^ -1) != -11) {
                          break L4;
                        } else {
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (11 != var5) {
                        break L0;
                      } else {
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (!this.field_k.a(param0)) {
                      break L1;
                    } else {
                      this.a(1, param1);
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (this.field_k.a(false)) {
                    this.b(-103, param1);
                    break L1;
                  } else {
                    break L0;
                  }
                }
                break L0;
              }
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        String[] var4 = null;
        String[] var5 = null;
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
        String[] var16 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        byte stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        var15 = TombRacer.field_G ? 1 : 0;
        int discarded$1 = be.a(sea.field_q.toUpperCase(), 1, qr.field_v, 2497287, -1, 160, 1, param1 - 20, 0, -1, (byte) 60, 320);
        ua.a(4, qr.field_v, rka.a(td.field_r, true), 600, -1, param1 + 72, 11288327);
        var16 = vna.field_d[td.field_r];
        var4 = var16;
        var5 = up.field_h[td.field_r];
        ura.a(-10985);
        var6 = Math.max(var5.length, var16.length);
        var7 = 80 + param1;
        var8 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var8 >= var6) {
                break L2;
              } else {
                var9 = 80;
                var10 = 470;
                stackOut_2_0 = var8;
                stackOut_2_1 = var5.length;
                stackIn_38_0 = stackOut_2_0;
                stackIn_38_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var15 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 >= stackIn_3_1) {
                      break L3;
                    } else {
                      if (null == no.field_m) {
                        return;
                      } else {
                        if ((no.field_m[td.field_r].length ^ -1) >= (var8 ^ -1)) {
                          break L3;
                        } else {
                          if (no.field_m[td.field_r][var8] != -1) {
                            var10 -= 60;
                            var9 += 60;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    if ((var8 ^ -1) <= (var16.length ^ -1)) {
                      break L4;
                    } else {
                      if (null != var16[var8]) {
                        L5: {
                          var7 += 30;
                          var11 = 0;
                          if (var8 >= no.field_m[td.field_r].length) {
                            break L5;
                          } else {
                            if (1 != (no.field_m[td.field_r][var8] ^ -1)) {
                              break L5;
                            } else {
                              var11 -= 60;
                              break L5;
                            }
                          }
                        }
                        ts.a(-1, -22, var7, var16[var8].toUpperCase(), var9 + var11, eda.field_f, 11288327);
                        var7 += 10;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (var5.length <= var8) {
                      break L6;
                    } else {
                      L7: {
                        if ((var8 ^ -1) <= (no.field_m[td.field_r].length ^ -1)) {
                          break L7;
                        } else {
                          if (0 > no.field_m[td.field_r][var8]) {
                            break L7;
                          } else {
                            if ((no.field_p[td.field_r][var8] ^ -1) == -4) {
                              break L7;
                            } else {
                              L8: {
                                L9: {
                                  var11 = no.field_q[td.field_r][var8];
                                  if (27 != no.field_u[td.field_r][var8]) {
                                    break L9;
                                  } else {
                                    L10: {
                                      var12 = -4;
                                      var13 = var11;
                                      if (-2 == (no.field_p[td.field_r][var8] ^ -1)) {
                                        stackOut_25_0 = 1;
                                        stackIn_26_0 = stackOut_25_0;
                                        break L10;
                                      } else {
                                        stackOut_24_0 = 109;
                                        stackIn_26_0 = stackOut_24_0;
                                        break L10;
                                      }
                                    }
                                    var14 = stackIn_26_0;
                                    hp.a(var13, no.field_r[td.field_r][var8], no.field_s[td.field_r][var8], wma.a(var14, 12166, 1), -1918106173, var12 + (no.field_k[td.field_r][var8] + var7), -50 + var9);
                                    if (var15 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (1 != no.field_p[td.field_r][var8]) {
                                  break L8;
                                } else {
                                  var12 = 20;
                                  var13 = var11;
                                  var14 = 4;
                                  hp.a(var13, 512 + no.field_r[td.field_r][var8], no.field_s[td.field_r][var8], wma.a(var14, 12166, 1), -1918106173, var7 + no.field_k[td.field_r][var8] + var12, -50 + var9);
                                  break L8;
                                }
                              }
                              L11: {
                                if (no.field_p[td.field_r][var8] == 2) {
                                  hp.a(var11, 1024, no.field_s[td.field_r][var8], wma.a(31, 12166, 1), -1918106173, var7 - -no.field_k[td.field_r][var8] - 16, var9 - 50);
                                  hp.a(var11, 1024, no.field_s[td.field_r][var8], wma.a(29, 12166, 1), -1918106173, -16 + var7 + no.field_k[td.field_r][var8], var9 - 65);
                                  hp.a(var11, 0, no.field_s[td.field_r][var8], wma.a(29, 12166, 1), -1918106173, var7 + (no.field_k[td.field_r][var8] + 16), var9 + -34);
                                  hp.a(var11, 512, no.field_s[td.field_r][var8], wma.a(29, 12166, 1), -1918106173, var7 - -no.field_k[td.field_r][var8] - -16, -65 + var9);
                                  hp.a(var11, 1536, no.field_s[td.field_r][var8], wma.a(29, 12166, 1), -1918106173, var7 - -no.field_k[td.field_r][var8] - 16, -34 + var9);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              hp.a(var11, no.field_r[td.field_r][var8], no.field_s[td.field_r][var8], wma.a(no.field_u[td.field_r][var8], 12166, no.field_m[td.field_r][var8]), -1918106173, var7 + no.field_k[td.field_r][var8], -50 + var9);
                              break L7;
                            }
                          }
                        }
                      }
                      L12: {
                        var11 = kn.field_p.a((aa) null, var10, 15, 0, var7, fm.a(false, -1), wca.field_l, 0, fm.a(false, 65793), var5[var8], (byte) 99, 640, 0, id.field_h, var9, 0);
                        if ((td.field_r ^ -1) >= -1) {
                          break L12;
                        } else {
                          var11 = Math.max(var11, 3);
                          break L12;
                        }
                      }
                      var7 = var7 + (10 + 15 * var11);
                      break L6;
                    }
                  }
                  var8++;
                  if (var15 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            se.f((byte) -6);
            stackOut_37_0 = param2;
            stackOut_37_1 = -9;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            break L1;
          }
          if (stackIn_38_0 < stackIn_38_1) {
            L13: {
              if (0 == td.field_r) {
                L14: {
                  var8 = 205 - -param1;
                  if (0L >= bva.b((byte) -107) / 1000L % 2L) {
                    stackOut_44_0 = 0;
                    stackIn_45_0 = stackOut_44_0;
                    break L14;
                  } else {
                    stackOut_43_0 = 1;
                    stackIn_45_0 = stackOut_43_0;
                    break L14;
                  }
                }
                L15: {
                  var9 = stackIn_45_0;
                  if (var9 != 0) {
                    stackOut_47_0 = 0;
                    stackIn_48_0 = stackOut_47_0;
                    break L15;
                  } else {
                    stackOut_46_0 = 4;
                    stackIn_48_0 = stackOut_46_0;
                    break L15;
                  }
                }
                L16: {
                  var10 = stackIn_48_0;
                  if (var9 == 0) {
                    stackOut_50_0 = 6;
                    stackIn_51_0 = stackOut_50_0;
                    break L16;
                  } else {
                    stackOut_49_0 = 2;
                    stackIn_51_0 = stackOut_49_0;
                    break L16;
                  }
                }
                L17: {
                  var11 = stackIn_51_0;
                  if (var9 != 0) {
                    stackOut_53_0 = 1;
                    stackIn_54_0 = stackOut_53_0;
                    break L17;
                  } else {
                    stackOut_52_0 = 7;
                    stackIn_54_0 = stackOut_52_0;
                    break L17;
                  }
                }
                L18: {
                  var12 = stackIn_54_0;
                  taa.a((byte) -112, var8, var10, 80);
                  if (var9 == 0) {
                    stackOut_56_0 = 5;
                    stackIn_57_0 = stackOut_56_0;
                    break L18;
                  } else {
                    stackOut_55_0 = 3;
                    stackIn_57_0 = stackOut_55_0;
                    break L18;
                  }
                }
                var13 = stackIn_57_0;
                taa.a((byte) -107, var8, var12, 96);
                taa.a((byte) -126, var8, var11, 112);
                taa.a((byte) -108, var8, var13, 127);
                taa.a((byte) -107, 25 + var8, 9, 115);
                taa.a((byte) -123, var8 - -50, 8, 118);
                taa.a((byte) -108, var8 + 75, 10, 115);
                taa.a((byte) -109, var8 - -100, 11, 106);
                break L13;
              } else {
                break L13;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
            field_r = (String) null;
        }
        return this.field_n - this.field_m[param0].d(11919) / 2;
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        if (param0 != 1) {
            return;
        }
        td.field_r = td.field_r - 1;
        if (!param1) {
            if (!((td.field_r ^ -1) != -1)) {
                var3 = fna.field_h;
                fna.field_h = 97;
                this.field_k.a(1, 63);
                fna.field_h = var3;
            }
        }
    }

    final boolean a(int param0, char param1, int param2) {
        boolean discarded$1 = false;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (this.c(0, 0)) {
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
          var4 = stackIn_3_0;
          if (this.c(2, 0)) {
            stackOut_5_0 = 2;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var5 = stackIn_6_0;
            if (13 != param0) {
              break L3;
            } else {
              this.c(-6);
              if (var6 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (this.field_k.a((byte) -127)) {
              L5: while (true) {
                this.field_k.b((byte) -50);
                stackOut_52_0 = this;
                stackOut_52_1 = 0;
                stackOut_52_2 = 0;
                stackIn_50_0 = stackOut_52_0;
                stackIn_50_1 = stackOut_52_1;
                stackIn_50_2 = stackOut_52_2;
                stackIn_53_0 = stackOut_52_0;
                stackIn_53_1 = stackOut_52_1;
                stackIn_53_2 = stackOut_52_2;
                if (var6 != 0) {
                  L6: while (true) {
                    if (!this.b(stackIn_50_1, stackIn_50_2)) {
                      L7: {
                        if (-98 == (param0 ^ -1)) {
                          L8: {
                            if (var4 < this.field_k.field_h) {
                              break L8;
                            } else {
                              this.field_k.b(var5, 89);
                              if (var6 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          this.field_k.b(this.field_k.field_h - 1, -115);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L9: {
                        if ((param0 ^ -1) != -97) {
                          break L9;
                        } else {
                          L10: {
                            if (this.field_k.field_h < 0) {
                              break L10;
                            } else {
                              if ((var5 ^ -1) >= (this.field_k.field_h ^ -1)) {
                                break L10;
                              } else {
                                this.field_k.b(1 + this.field_k.field_h, 80);
                                if (var6 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          this.field_k.b(var4, param2 + 94);
                          break L9;
                        }
                      }
                      stackOut_42_0 = this;
                      stackOut_42_1 = this.field_k.field_h;
                      stackOut_42_2 = -30487;
                      stackIn_50_0 = stackOut_42_0;
                      stackIn_50_1 = stackOut_42_1;
                      stackIn_50_2 = stackOut_42_2;
                      continue L6;
                    } else {
                      continue L5;
                    }
                  }
                } else {
                  stackOut_53_0 = this;
                  stackOut_53_1 = stackIn_53_1;
                  stackOut_53_2 = stackIn_53_2;
                  stackIn_26_0 = stackOut_53_0;
                  stackIn_26_1 = stackOut_53_1;
                  stackIn_26_2 = stackOut_53_2;
                  break L4;
                }
              }
            } else {
              L11: while (true) {
                L12: {
                  if (-98 == (param0 ^ -1)) {
                    L13: {
                      if (var4 < this.field_k.field_h) {
                        break L13;
                      } else {
                        this.field_k.b(var5, 89);
                        if (var6 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    this.field_k.b(this.field_k.field_h - 1, -115);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L14: {
                  if ((param0 ^ -1) != -97) {
                    break L14;
                  } else {
                    L15: {
                      if (this.field_k.field_h < 0) {
                        break L15;
                      } else {
                        if ((var5 ^ -1) >= (this.field_k.field_h ^ -1)) {
                          break L15;
                        } else {
                          this.field_k.b(1 + this.field_k.field_h, 80);
                          if (var6 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    this.field_k.b(var4, param2 + 94);
                    break L14;
                  }
                }
                stackOut_23_0 = this;
                stackOut_23_1 = this.field_k.field_h;
                stackOut_23_2 = -30487;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                stackIn_24_2 = stackOut_23_2;
                L16: while (true) {
                  if (!this.b(stackIn_24_1, stackIn_24_2)) {
                    continue L11;
                  } else {
                    this.field_k.b((byte) -50);
                    stackOut_25_0 = this;
                    stackOut_25_1 = 0;
                    stackOut_25_2 = 0;
                    stackIn_24_0 = stackOut_25_0;
                    stackIn_24_1 = stackOut_25_1;
                    stackIn_24_2 = stackOut_25_2;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    if (var6 != 0) {
                      continue L16;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
          }
          this.b(stackIn_26_1 != 0, stackIn_26_2 != 0, this.field_k.field_h);
          break L2;
        }
        if (param2 == 1) {
          return true;
        } else {
          discarded$1 = this.a(116, '￟', -90);
          return true;
        }
    }

    final int a(byte param0, int param1) {
        int discarded$0 = 0;
        int var3 = this.h(param1, 1);
        if (param0 <= 111) {
            discarded$0 = this.h(-63, 56);
        }
        if (!(param1 != 1)) {
            return 0;
        }
        if (-3 == (param1 ^ -1)) {
            return 640 + -var3;
        }
        return -(var3 >> 1230261409) + 320;
    }

    private final void b(int param0, boolean param1) {
        int var3 = 0;
        td.field_r = td.field_r + 1;
        if (param0 > -89) {
            return;
        }
        if (!param1) {
            if (!(10 != td.field_r)) {
                var3 = fna.field_h;
                fna.field_h = 96;
                this.field_k.a(1, 95);
                fna.field_h = var3;
            }
        }
    }

    jn(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final boolean c(int param0, int param1) {
        if (param1 != 0) {
            this.b(57, true);
        }
        if ((param0 ^ -1) == -2) {
            if (!(-1 != (td.field_r ^ -1))) {
                return false;
            }
        }
        if (-3 == (param0 ^ -1)) {
            if (!(10 != td.field_r)) {
                return false;
            }
        }
        return super.c(param0, 0);
    }

    static {
        field_r = "Orb points: ";
    }
}
