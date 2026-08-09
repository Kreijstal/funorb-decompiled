/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ira extends osa {
    private int field_u;
    private int field_s;
    static jpa field_t;

    final int c(int param0) {
        if (param0 != 1) {
            this.b(31);
        }
        return 11;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = -54 / ((-50 - param2) / 41);
        return param0 * -1918454973 + -669632447 * param1;
    }

    final static int a(int param0, int param1, int param2) {
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int var3;
        int var4;
        var4 = param1 >> -825477825;
        param1 = var4 + param1 ^ var4;
        var4 = param0 >> -386900833;
        param0 = param0 - -var4 ^ var4;
        if (param2 >= 73) {
          L0: {
            if (param0 <= param1) {
              break L0;
            } else {
              var4 = param1;
              param1 = param0;
              param0 = var4;
              break L0;
            }
          }
          L1: {
            var3 = 0;
            if (param1 >= 32768) {
              L2: {
                if (param1 >= 1073741824) {
                  var3 += 16;
                  param1 = param1 >> 16;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param1 >= 4194304) {
                  param1 = param1 >> 8;
                  var3 += 8;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param1 < 262144) {
                  break L4;
                } else {
                  var3 += 4;
                  param1 = param1 >> 4;
                  break L4;
                }
              }
              L5: {
                if (param1 >= 65536) {
                  var3 += 2;
                  param1 = param1 >> 2;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (32768 > param1) {
                  break L6;
                } else {
                  param1 = param1 >> 1;
                  var3++;
                  break L6;
                }
              }
              param0 = param0 >> var3;
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 << -950771611 < param1) {
            return param1 << var3;
          } else {
            param1 = param1 * param1 + param0 * param0;
            if (-65537 >= (param1 ^ -1)) {
              if (-16777217 < (param1 ^ -1)) {
                if (1048576 <= param1) {
                  if ((param1 ^ -1) > -4194305) {
                    return lw.field_g[param1 >> 512107310] >> 524562117;
                  } else {
                    return lw.field_g[param1 >> 459894000] >> -632306652;
                  }
                } else {
                  if (262144 > param1) {
                    return lw.field_g[param1 >> 108096490] >> -1376053401;
                  } else {
                    return lw.field_g[param1 >> 1892178668] >> -2045124122;
                  }
                }
              } else {
                if (268435456 > param1) {
                  if (-67108865 >= (param1 ^ -1)) {
                    L7: {
                      if (2 > var3) {
                        stackIn_51_0 = lw.field_g[param1 >> -1496083628] >> 2 + -var3;
                        break L7;
                      } else {
                        stackIn_51_0 = lw.field_g[param1 >> -1139609804] << -2 + var3;
                        break L7;
                      }
                    }
                    return stackIn_51_0;
                  } else {
                    L8: {
                      if (-4 >= (var3 ^ -1)) {
                        stackIn_47_0 = lw.field_g[param1 >> 1324290962] << var3 - 3;
                        break L8;
                      } else {
                        stackIn_47_0 = lw.field_g[param1 >> 351759538] >> 3 - var3;
                        break L8;
                      }
                    }
                    return stackIn_47_0;
                  }
                } else {
                  if (param1 < 1073741824) {
                    L9: {
                      if (1 > var3) {
                        stackIn_42_0 = lw.field_g[param1 >> 1493395510] >> 1 + -var3;
                        break L9;
                      } else {
                        stackIn_42_0 = lw.field_g[param1 >> -1342354090] << var3 + -1;
                        break L9;
                      }
                    }
                    return stackIn_42_0;
                  } else {
                    return lw.field_g[param1 >> -2104571144] << var3;
                  }
                }
              }
            } else {
              if (param1 < 256) {
                if (0 > param1) {
                  return -1;
                } else {
                  return lw.field_g[param1] >> 640633580;
                }
              } else {
                if ((param1 ^ -1) <= -4097) {
                  if (param1 >= 16384) {
                    return lw.field_g[param1 >> 307015464] >> -1448122008;
                  } else {
                    return lw.field_g[param1 >> 2135679878] >> 1508998025;
                  }
                } else {
                  if (-1025 >= (param1 ^ -1)) {
                    return lw.field_g[param1 >> -542219612] >> -1151711446;
                  } else {
                    return lw.field_g[param1 >> 2011293378] >> -1632762965;
                  }
                }
              }
            }
          }
        } else {
          return 77;
        }
    }

    final static void a(boolean param0, int param1, byte param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 != -1) {
                break L1;
              } else {
                if (rba.field_a == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param1 != hb.field_t.field_c) {
              L2: {
                if (0 != (param1 ^ -1)) {
                  L3: {
                    if ((param1 ^ -1) > -1) {
                      break L3;
                    } else {
                      if ((param1 ^ -1) == -8) {
                        break L3;
                      } else {
                        if ((param1 ^ -1) == -9) {
                          break L3;
                        } else {
                          if ((param1 ^ -1) == -13) {
                            break L3;
                          } else {
                            L4: {
                              er.b(1, 0);
                              kqa.b(18916);
                              if (!wka.field_d) {
                                break L4;
                              } else {
                                if (cs.field_c == null) {
                                  break L4;
                                } else {
                                  break L2;
                                }
                              }
                            }
                            fp.a(48);
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  if (-2 != param1) {
                    break L2;
                  } else {
                    er.b(1, 0);
                    kqa.b(18916);
                    wka.field_d = false;
                    cs.field_c = null;
                    break L2;
                  }
                } else {
                  er.b(1, 1);
                  cs.field_c = null;
                  wka.field_d = false;
                  break L2;
                }
              }
              L5: {
                wm.field_a = hb.field_t;
                if (null == wm.field_a) {
                  break L5;
                } else {
                  L6: {
                    wm.field_a.a(-123);
                    if (wm.field_a.field_c == 1) {
                      fp.a(108);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (null == mq.field_e) {
                    break L5;
                  } else {
                    L7: {
                      if ((wm.field_a.field_c ^ -1) == -13) {
                        break L7;
                      } else {
                        if ((wm.field_a.field_c ^ -1) == -5) {
                          break L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                    wma.a(tk.a(-22636), 12, mq.field_e.field_g, jg.a((byte) -80));
                    break L5;
                  }
                }
              }
              L8: {
                hb.field_t = eka.d(param1, 121);
                if (hb.field_t instanceof wv) {
                  ((wv) ((Object) hb.field_t)).a(0, 0, param0);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                hb.field_t.a((byte) 114);
                if (!mpa.field_X) {
                  break L9;
                } else {
                  qv.field_o = null;
                  sua.field_H = new vna();
                  var11 = rb.field_o;
                  var9 = var11;
                  var6 = var9;
                  var3 = var6;
                  var4 = 0;
                  L10: while (true) {
                    if (var4 >= 8) {
                      var12 = pq.field_e;
                      var10 = var12;
                      var7 = var10;
                      var3 = var7;
                      var8 = 0;
                      var4 = var8;
                      L11: while (true) {
                        if (-9 >= (var8 ^ -1)) {
                          uma.field_c = false;
                          mpa.field_X = false;
                          pna.field_p = false;
                          ip.field_b = false;
                          break L9;
                        } else {
                          var12[var8] = 0;
                          var8++;
                          continue L11;
                        }
                      }
                    } else {
                      var11[var4] = 0;
                      var4++;
                      continue L10;
                    }
                  }
                }
              }
              L12: {
                if (era.field_c) {
                  cv.o((byte) -119);
                  ig.a(-125);
                  ub.b(0);
                  era.field_c = false;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (!(hb.field_t instanceof wv)) {
                  break L13;
                } else {
                  if (!(wm.field_a instanceof wv)) {
                    break L13;
                  } else {
                    if (!((wv) ((Object) wm.field_a)).a(true, (wv) ((Object) hb.field_t))) {
                      break L13;
                    } else {
                      hb.field_t.field_d = wm.field_a.field_c;
                      break L13;
                    }
                  }
                }
              }
              var3_int = 69 % ((40 - param2) / 38);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3_ref), "ira.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        uia var16 = null;
        uia var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var16 = new uia(param1);
            var17 = var16;
            var17.field_h = -2 + param1.length;
            fa.field_b = var17.d(123);
            pg.field_C = new int[fa.field_b];
            ck.field_c = new byte[fa.field_b][];
            ak.field_p = new int[fa.field_b];
            iga.field_m = new int[fa.field_b];
            mq.field_b = new int[fa.field_b];
            pb.field_l = new byte[fa.field_b][];
            qqa.field_n = new boolean[fa.field_b];
            var17.field_h = -7 + param1.length + -(fa.field_b * 8);
            ika.field_a = var17.d(126);
            kba.field_s = var17.d(param0 ^ 126);
            var3 = 1 + (var17.h(255) & 255);
            var4 = 0;
            L1: while (true) {
              if (fa.field_b <= var4) {
                var4 = param0;
                L2: while (true) {
                  if (var4 >= fa.field_b) {
                    var4 = 0;
                    L3: while (true) {
                      if (fa.field_b <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (fa.field_b <= var4) {
                            var17.field_h = -(var3 * 3) - -3 + (-(8 * fa.field_b) + (-7 + param1.length));
                            mga.field_g = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var4 >= var3) {
                                var17.field_h = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (fa.field_b <= var4) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = mq.field_b[var4];
                                      var6 = iga.field_m[var4];
                                      var7 = var6 * var5;
                                      var20 = new byte[var7];
                                      var18 = var20;
                                      var8 = var18;
                                      ck.field_c[var4] = var20;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var9 = var19;
                                      pb.field_l[var4] = var21;
                                      var10 = 0;
                                      var11 = var17.h(param0 + 255);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var12 >= var5) {
                                            if (-1 == (2 & var11 ^ -1)) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var5 <= var12) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        dupTemp$0 = var17.c((byte) 47);
                                                        var9[var12 + var5 * var13] = dupTemp$0;
                                                        var14 = dupTemp$0;
                                                        stackIn_46_0 = var10;

                                                        if (-1 == var14) {
                                                          stackIn_47_0 = stackIn_46_0;
                                                          stackIn_47_1 = 0;
                                                          break L11;
                                                        } else {
                                                          stackIn_47_0 = stackIn_46_0;
                                                          stackIn_47_1 = 1;
                                                          break L11;
                                                        }
                                                      }
                                                      var10 = stackIn_47_0 | stackIn_47_1;
                                                      var13++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L12: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var12 - -(var13 * var5)] = var17.c((byte) 103);
                                                var13++;
                                                continue L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L13: while (true) {
                                          if (var12 >= var7) {
                                            if (-1 != (var11 & 2 ^ -1)) {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    dupTemp$1 = var17.c((byte) 87);
                                                    var9[var12] = dupTemp$1;
                                                    var13 = dupTemp$1;
                                                    stackIn_31_0 = var10;

                                                    if (var13 == -1) {
                                                      stackIn_32_0 = stackIn_31_0;
                                                      stackIn_32_1 = 0;
                                                      break L15;
                                                    } else {
                                                      stackIn_32_0 = stackIn_31_0;
                                                      stackIn_32_1 = 1;
                                                      break L15;
                                                    }
                                                  }
                                                  var10 = stackIn_32_0 | stackIn_32_1;
                                                  var12++;
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var8[var12] = var17.c((byte) 119);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    qqa.field_n[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  mga.field_g[var4] = var17.a(-32768);
                                  if (mga.field_g[var4] == 0) {
                                    mga.field_g[var4] = 1;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            iga.field_m[var4] = var17.d(122);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        mq.field_b[var4] = var17.d(kha.b(param0, 122));
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    pg.field_C[var4] = var17.d(127);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ak.field_p[var4] = var16.d(121);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var2);

            stackIn_53_1 = new StringBuilder().append("ira.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L17;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L17;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
        }
    }

    final void b(int param0) {
        int var2 = this.field_n.s(25745) - this.f(10);
        int var3 = this.field_n.e(false) - this.g((byte) 30);
        int var4 = 0;
        if (var2 > this.field_u) {
            var4 = -(var2 - this.field_u);
        }
        int var5 = 0;
        if (!(-this.field_u <= var2)) {
            var4 = -this.field_u + -var2;
        }
        if (var3 > this.field_s) {
            var5 = -(-this.field_s + var3);
        }
        if (!(-this.field_s <= var3)) {
            var5 = -this.field_s - var3;
        }
        if (param0 != 1) {
            return;
        }
        this.field_n.a((byte) -35, var4, var5);
    }

    ira(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_u = param1.b((byte) 44, 10) << 433652176;
            this.field_s = param1.b((byte) 44, 10) << 228953520;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ira.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void j(byte param0) {
        if (param0 != 91) {
            field_t = (jpa) null;
        }
        field_t = null;
    }

    final void b(byte param0) {
        int var2 = 27 / ((-69 - param0) / 42);
    }

    final int a(int param0, int param1) {
        if (param0 != 0) {
            return 20;
        }
        param1 = fs.a((byte) 68, param1, this.field_u);
        param1 = fs.a((byte) 90, param1, this.field_s);
        return param1;
    }

    final void a(kh param0, byte param1) {
        try {
            super.a(param0, (byte) -106);
            param0.a((byte) -126, this.field_u >> -1911376720, 10);
            if (param1 >= -78) {
                ira.a(true, -95, (byte) -90);
            }
            param0.a((byte) 16, this.field_s >> 198133648, 10);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ira.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, fsa param1) {
        try {
            if (param0 <= 35) {
                byte[] var4 = (byte[]) null;
                ira.a(63, (byte[]) null);
            }
            super.a(112, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ira.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
