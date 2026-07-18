/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ira extends osa {
    private int field_u;
    private int field_s;
    static jpa field_t;

    final int c(int param0) {
        if (param0 != 1) {
            ((ira) this).b(31);
        }
        return 11;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = -54 / ((-50 - param2) / 41);
        return param0 * -1918454973 + -669632447 * param1;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        L0: {
          var4 = param1 >> 31;
          param1 = var4 + param1 ^ var4;
          var4 = param0 >> 31;
          param0 = param0 - -var4 ^ var4;
          if (~param0 >= ~param1) {
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
        if (param0 << 5 < param1) {
          return param1 << var3;
        } else {
          param1 = param1 * param1 + param0 * param0;
          if (param1 >= 65536) {
            if (param1 < 16777216) {
              if (1048576 <= param1) {
                if (param1 < 4194304) {
                  return lw.field_g[param1 >> 14] >> 5;
                } else {
                  return lw.field_g[param1 >> 16] >> 4;
                }
              } else {
                if (262144 > param1) {
                  return lw.field_g[param1 >> 10] >> 7;
                } else {
                  return lw.field_g[param1 >> 12] >> 6;
                }
              }
            } else {
              if (268435456 > param1) {
                if (param1 >= 67108864) {
                  L7: {
                    if (2 > var3) {
                      stackOut_48_0 = lw.field_g[param1 >> 20] >> 2 + -var3;
                      stackIn_49_0 = stackOut_48_0;
                      break L7;
                    } else {
                      stackOut_47_0 = lw.field_g[param1 >> 20] << -2 + var3;
                      stackIn_49_0 = stackOut_47_0;
                      break L7;
                    }
                  }
                  return stackIn_49_0;
                } else {
                  L8: {
                    if (var3 >= 3) {
                      stackOut_44_0 = lw.field_g[param1 >> 18] << var3 - 3;
                      stackIn_45_0 = stackOut_44_0;
                      break L8;
                    } else {
                      stackOut_43_0 = lw.field_g[param1 >> 18] >> 3 - var3;
                      stackIn_45_0 = stackOut_43_0;
                      break L8;
                    }
                  }
                  return stackIn_45_0;
                }
              } else {
                if (param1 < 1073741824) {
                  L9: {
                    if (1 > var3) {
                      stackOut_39_0 = lw.field_g[param1 >> 22] >> 1 + -var3;
                      stackIn_40_0 = stackOut_39_0;
                      break L9;
                    } else {
                      stackOut_38_0 = lw.field_g[param1 >> 22] << var3 + -1;
                      stackIn_40_0 = stackOut_38_0;
                      break L9;
                    }
                  }
                  return stackIn_40_0;
                } else {
                  return lw.field_g[param1 >> 24] << var3;
                }
              }
            }
          } else {
            if (param1 < 256) {
              if (0 > param1) {
                return -1;
              } else {
                return lw.field_g[param1] >> 12;
              }
            } else {
              if (param1 >= 4096) {
                if (param1 >= 16384) {
                  return lw.field_g[param1 >> 8] >> 8;
                } else {
                  return lw.field_g[param1 >> 6] >> 9;
                }
              } else {
                if (param1 >= 1024) {
                  return lw.field_g[param1 >> 4] >> 10;
                } else {
                  return lw.field_g[param1 >> 2] >> 11;
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 != -1) {
                break L1;
              } else {
                if (rba.field_a == null) {
                  return;
                } else {
                  break L1;
                }
              }
            }
            if (param1 != hb.field_t.field_c) {
              L2: {
                if (param1 != -1) {
                  L3: {
                    if (param1 < 0) {
                      break L3;
                    } else {
                      if (param1 == 7) {
                        break L3;
                      } else {
                        if (param1 == 8) {
                          break L3;
                        } else {
                          if (param1 == 12) {
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
                      if (wm.field_a.field_c == 12) {
                        break L7;
                      } else {
                        if (wm.field_a.field_c == 4) {
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
                  ((wv) (Object) hb.field_t).a(0, 0, param0);
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
                  var15 = rb.field_o;
                  var13 = var15;
                  var11 = var13;
                  var9 = var11;
                  var6 = var9;
                  var3_array = var6;
                  var4 = 0;
                  L10: while (true) {
                    if (var4 >= 8) {
                      var16 = pq.field_e;
                      var14 = var16;
                      var12 = var14;
                      var10 = var12;
                      var7 = var10;
                      var3_array = var7;
                      var8 = 0;
                      var4 = var8;
                      L11: while (true) {
                        if (var8 >= 8) {
                          uma.field_c = false;
                          mpa.field_X = false;
                          pna.field_p = false;
                          ip.field_b = false;
                          break L9;
                        } else {
                          var16[var8] = 0;
                          var8++;
                          continue L11;
                        }
                      }
                    } else {
                      var15[var4] = 0;
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
                    if (!((wv) (Object) wm.field_a).a(true, (wv) (Object) hb.field_t)) {
                      break L13;
                    } else {
                      hb.field_t.field_d = wm.field_a.field_c;
                      break L13;
                    }
                  }
                }
              }
              var3_int = 69 % ((40 - param2) / 38);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "ira.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte[] param1) {
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
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
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
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      ck.field_c[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      pb.field_l[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.h(param0 + 255);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var12 >= var5) {
                                            if ((2 & var11) == 0) {
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
                                                        byte dupTemp$2 = var17.c((byte) 47);
                                                        var9[var12 + var5 * var13] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_44_0 = var10;
                                                        stackIn_46_0 = stackOut_44_0;
                                                        stackIn_45_0 = stackOut_44_0;
                                                        if (-1 == var14) {
                                                          stackOut_46_0 = stackIn_46_0;
                                                          stackOut_46_1 = 0;
                                                          stackIn_47_0 = stackOut_46_0;
                                                          stackIn_47_1 = stackOut_46_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_45_0 = stackIn_45_0;
                                                          stackOut_45_1 = 1;
                                                          stackIn_47_0 = stackOut_45_0;
                                                          stackIn_47_1 = stackOut_45_1;
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
                                            if ((var11 & 2) != 0) {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    byte dupTemp$3 = var17.c((byte) 87);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_29_0 = var10;
                                                    stackIn_31_0 = stackOut_29_0;
                                                    stackIn_30_0 = stackOut_29_0;
                                                    if (var13 == -1) {
                                                      stackOut_31_0 = stackIn_31_0;
                                                      stackOut_31_1 = 0;
                                                      stackIn_32_0 = stackOut_31_0;
                                                      stackIn_32_1 = stackOut_31_1;
                                                      break L15;
                                                    } else {
                                                      stackOut_30_0 = stackIn_30_0;
                                                      stackOut_30_1 = 1;
                                                      stackIn_32_0 = stackOut_30_0;
                                                      stackIn_32_1 = stackOut_30_1;
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
            stackOut_51_0 = (RuntimeException) var2;
            stackOut_51_1 = new StringBuilder().append("ira.FA(").append(param0).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ')');
        }
    }

    final void b(int param0) {
        int var2 = ((ira) this).field_n.s(25745) - ((ira) this).f(10);
        int var3 = ((ira) this).field_n.e(false) - ((ira) this).g((byte) 30);
        int var4 = 0;
        if (var2 > ((ira) this).field_u) {
            var4 = -(var2 - ((ira) this).field_u);
        }
        int var5 = 0;
        if (!(-((ira) this).field_u <= var2)) {
            var4 = -((ira) this).field_u + -var2;
        }
        if (var3 > ((ira) this).field_s) {
            var5 = -(-((ira) this).field_s + var3);
        }
        if (!(-((ira) this).field_s <= var3)) {
            var5 = -((ira) this).field_s - var3;
        }
        if (param0 != 1) {
            return;
        }
        ((ira) this).field_n.a((byte) -35, var4, var5);
    }

    ira(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            ((ira) this).field_u = param1.b((byte) 44, 10) << 16;
            ((ira) this).field_s = param1.b((byte) 44, 10) << 16;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ira.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void j(byte param0) {
        field_t = null;
    }

    final void b(byte param0) {
        int var2 = 27 / ((-69 - param0) / 42);
    }

    final int a(int param0, int param1) {
        if (param0 != 0) {
            return 20;
        }
        param1 = fs.a((byte) 68, param1, ((ira) this).field_u);
        param1 = fs.a((byte) 90, param1, ((ira) this).field_s);
        return param1;
    }

    final void a(kh param0, byte param1) {
        try {
            super.a(param0, (byte) -106);
            param0.a((byte) -126, ((ira) this).field_u >> 16, 10);
            if (param1 >= -78) {
                ira.a(true, -95, (byte) -90);
            }
            param0.a((byte) 16, ((ira) this).field_s >> 16, 10);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ira.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, fsa param1) {
        try {
            if (param0 <= 35) {
                Object var4 = null;
                ira.a(63, (byte[]) null);
            }
            super.a(112, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ira.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
