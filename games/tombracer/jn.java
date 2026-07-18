/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends we {
    static String field_r;

    final boolean b(int param0, int param1) {
        if (param1 != -30487) {
            return true;
        }
        return ((jn) this).c(param0, 0);
    }

    private final int h(int param0, int param1) {
        if (param1 != 1) {
            ((jn) this).b(true, true, 29);
        }
        return ((jn) this).field_m[param0].e(param1 ^ -164);
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
        return ((jn) this).a((byte) 112, param0) - -this.h(param0, 1);
    }

    final void b(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param2 < 0) {
          return;
        } else {
          if (((jn) this).field_m.length <= param2) {
            return;
          } else {
            if (((jn) this).b(param2, -30487)) {
              L0: {
                super.b(param0, param1, param2);
                var4 = ((jn) this).field_m[param2].field_g;
                var5 = var4;
                if (var5 != 10) {
                  if (11 != var5) {
                    break L0;
                  } else {
                    if (((jn) this).field_k.a(false)) {
                      this.b(-103, param1);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                } else {
                  if (!((jn) this).field_k.a(param0)) {
                    break L0;
                  } else {
                    this.a(1, param1);
                    break L0;
                  }
                }
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
        int stackIn_26_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
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
          if (var8 >= var6) {
            se.f((byte) -6);
            if (param2 < -9) {
              L1: {
                if (0 == td.field_r) {
                  L2: {
                    var8 = 205 - -param1;
                    if (0L >= bva.b((byte) -107) / 1000L % 2L) {
                      stackOut_42_0 = 0;
                      stackIn_43_0 = stackOut_42_0;
                      break L2;
                    } else {
                      stackOut_41_0 = 1;
                      stackIn_43_0 = stackOut_41_0;
                      break L2;
                    }
                  }
                  L3: {
                    var9 = stackIn_43_0;
                    if (var9 != 0) {
                      stackOut_45_0 = 0;
                      stackIn_46_0 = stackOut_45_0;
                      break L3;
                    } else {
                      stackOut_44_0 = 4;
                      stackIn_46_0 = stackOut_44_0;
                      break L3;
                    }
                  }
                  L4: {
                    var10 = stackIn_46_0;
                    if (var9 == 0) {
                      stackOut_48_0 = 6;
                      stackIn_49_0 = stackOut_48_0;
                      break L4;
                    } else {
                      stackOut_47_0 = 2;
                      stackIn_49_0 = stackOut_47_0;
                      break L4;
                    }
                  }
                  L5: {
                    var11 = stackIn_49_0;
                    if (var9 != 0) {
                      stackOut_51_0 = 1;
                      stackIn_52_0 = stackOut_51_0;
                      break L5;
                    } else {
                      stackOut_50_0 = 7;
                      stackIn_52_0 = stackOut_50_0;
                      break L5;
                    }
                  }
                  L6: {
                    var12 = stackIn_52_0;
                    taa.a((byte) -112, var8, var10, 80);
                    if (var9 == 0) {
                      stackOut_54_0 = 5;
                      stackIn_55_0 = stackOut_54_0;
                      break L6;
                    } else {
                      stackOut_53_0 = 3;
                      stackIn_55_0 = stackOut_53_0;
                      break L6;
                    }
                  }
                  var13 = stackIn_55_0;
                  taa.a((byte) -107, var8, var12, 96);
                  taa.a((byte) -126, var8, var11, 112);
                  taa.a((byte) -108, var8, var13, 127);
                  taa.a((byte) -107, 25 + var8, 9, 115);
                  taa.a((byte) -123, var8 - -50, 8, 118);
                  taa.a((byte) -108, var8 + 75, 10, 115);
                  taa.a((byte) -109, var8 - -100, 11, 106);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L7: {
              var9 = 80;
              var10 = 470;
              if (var8 >= var5.length) {
                break L7;
              } else {
                if (null == no.field_m) {
                  return;
                } else {
                  if (no.field_m[td.field_r].length <= var8) {
                    break L7;
                  } else {
                    if (no.field_m[td.field_r][var8] != -1) {
                      var10 -= 60;
                      var9 += 60;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
              }
            }
            L8: {
              if (var8 >= var16.length) {
                break L8;
              } else {
                if (null != var16[var8]) {
                  L9: {
                    var7 += 30;
                    var11 = 0;
                    if (var8 >= no.field_m[td.field_r].length) {
                      break L9;
                    } else {
                      if (no.field_m[td.field_r][var8] != -2) {
                        break L9;
                      } else {
                        var11 -= 60;
                        break L9;
                      }
                    }
                  }
                  ts.a(-1, -22, var7, var16[var8].toUpperCase(), var9 + var11, eda.field_f, 11288327);
                  var7 += 10;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            if (var5.length > var8) {
              L10: {
                if (var8 >= no.field_m[td.field_r].length) {
                  break L10;
                } else {
                  if (0 > no.field_m[td.field_r][var8]) {
                    break L10;
                  } else {
                    if (no.field_p[td.field_r][var8] == 3) {
                      break L10;
                    } else {
                      L11: {
                        var11 = no.field_q[td.field_r][var8];
                        if (27 != no.field_u[td.field_r][var8]) {
                          if (1 != no.field_p[td.field_r][var8]) {
                            break L11;
                          } else {
                            var12 = 20;
                            var13 = var11;
                            var14 = 4;
                            hp.a(var13, 512 + no.field_r[td.field_r][var8], no.field_s[td.field_r][var8], wma.a(var14, 12166, 1), -1918106173, var7 + no.field_k[td.field_r][var8] + var12, -50 + var9);
                            break L11;
                          }
                        } else {
                          L12: {
                            var12 = -4;
                            var13 = var11;
                            if (no.field_p[td.field_r][var8] == 1) {
                              stackOut_25_0 = 1;
                              stackIn_26_0 = stackOut_25_0;
                              break L12;
                            } else {
                              stackOut_24_0 = 109;
                              stackIn_26_0 = stackOut_24_0;
                              break L12;
                            }
                          }
                          var14 = stackIn_26_0;
                          hp.a(var13, no.field_r[td.field_r][var8], no.field_s[td.field_r][var8], wma.a(var14, 12166, 1), -1918106173, var12 + (no.field_k[td.field_r][var8] + var7), -50 + var9);
                          break L11;
                        }
                      }
                      L13: {
                        if (no.field_p[td.field_r][var8] == 2) {
                          hp.a(var11, 1024, no.field_s[td.field_r][var8], wma.a(31, 12166, 1), -1918106173, var7 - -no.field_k[td.field_r][var8] - 16, var9 - 50);
                          hp.a(var11, 1024, no.field_s[td.field_r][var8], wma.a(29, 12166, 1), -1918106173, -16 + var7 + no.field_k[td.field_r][var8], var9 - 65);
                          hp.a(var11, 0, no.field_s[td.field_r][var8], wma.a(29, 12166, 1), -1918106173, var7 + (no.field_k[td.field_r][var8] + 16), var9 + -34);
                          hp.a(var11, 512, no.field_s[td.field_r][var8], wma.a(29, 12166, 1), -1918106173, var7 - -no.field_k[td.field_r][var8] - -16, -65 + var9);
                          hp.a(var11, 1536, no.field_s[td.field_r][var8], wma.a(29, 12166, 1), -1918106173, var7 - -no.field_k[td.field_r][var8] - 16, -34 + var9);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      hp.a(var11, no.field_r[td.field_r][var8], no.field_s[td.field_r][var8], wma.a(no.field_u[td.field_r][var8], 12166, no.field_m[td.field_r][var8]), -1918106173, var7 + no.field_k[td.field_r][var8], -50 + var9);
                      break L10;
                    }
                  }
                }
              }
              L14: {
                var11 = kn.field_p.a((aa) null, var10, 15, 0, var7, fm.a(false, -1), wca.field_l, 0, fm.a(false, 65793), var5[var8], (byte) 99, 640, 0, id.field_h, var9, 0);
                if (td.field_r <= 0) {
                  break L14;
                } else {
                  var11 = Math.max(var11, 3);
                  break L14;
                }
              }
              var7 = var7 + (10 + 15 * var11);
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
            field_r = null;
        }
        return ((jn) this).field_n - ((jn) this).field_m[param0].d(11919) / 2;
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        if (param0 != 1) {
            return;
        }
        td.field_r = td.field_r - 1;
        if (!param1) {
            if (!(td.field_r != 0)) {
                var3 = fna.field_h;
                fna.field_h = 97;
                ((jn) this).field_k.a(1, 63);
                fna.field_h = var3;
            }
        }
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (((jn) this).c(0, 0)) {
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
          if (((jn) this).c(2, 0)) {
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
          var5 = stackIn_6_0;
          if (13 != param0) {
            L3: {
              if (((jn) this).field_k.a((byte) -127)) {
                break L3;
              } else {
                L4: while (true) {
                  L5: {
                    if (param0 == 97) {
                      if (var4 < ((jn) this).field_k.field_h) {
                        ((jn) this).field_k.b(((jn) this).field_k.field_h - 1, -115);
                        break L5;
                      } else {
                        ((jn) this).field_k.b(var5, 89);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (param0 != 96) {
                      break L6;
                    } else {
                      L7: {
                        if (((jn) this).field_k.field_h < 0) {
                          break L7;
                        } else {
                          if (var5 <= ((jn) this).field_k.field_h) {
                            break L7;
                          } else {
                            ((jn) this).field_k.b(1 + ((jn) this).field_k.field_h, 80);
                            break L6;
                          }
                        }
                      }
                      ((jn) this).field_k.b(var4, param2 + 94);
                      break L6;
                    }
                  }
                  if (!((jn) this).b(((jn) this).field_k.field_h, -30487)) {
                    continue L4;
                  } else {
                    break L3;
                  }
                }
              }
            }
            ((jn) this).field_k.b((byte) -50);
            ((jn) this).b(false, false, ((jn) this).field_k.field_h);
            break L2;
          } else {
            ((jn) this).c(-6);
            break L2;
          }
        }
        if (param2 == 1) {
          return true;
        } else {
          boolean discarded$2 = ((jn) this).a(116, '￟', -90);
          return true;
        }
    }

    final int a(byte param0, int param1) {
        int var3 = this.h(param1, 1);
        if (param0 <= 111) {
            int discarded$0 = this.h(-63, 56);
        }
        if (!(param1 != 1)) {
            return 0;
        }
        if (param1 == 2) {
            return 640 + -var3;
        }
        return -(var3 >> 1) + 320;
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
                ((jn) this).field_k.a(1, 95);
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
        if (param0 == 1) {
            if (!(td.field_r != 0)) {
                return false;
            }
        }
        if (param0 == 2) {
            if (!(10 != td.field_r)) {
                return false;
            }
        }
        return super.c(param0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Orb points: ";
    }
}
