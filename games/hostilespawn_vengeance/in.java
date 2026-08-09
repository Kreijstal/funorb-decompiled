/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class in {
    static int[] field_c;
    static bd field_d;
    static String field_a;
    static int field_b;

    abstract int a(byte param0, long param1);

    final static boolean a(boolean param0, int param1, int param2, CharSequence param3) {
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 2) {
                break L1;
              } else {
                if (36 >= param1) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 104 / ((16 - param2) / 50);
                  var7 = 0;
                  var8 = param3.length();
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= var8) {
                      stackIn_41_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        L4: {
                          var10 = param3.charAt(var9);
                          if (var9 == 0) {
                            if (var10 == 45) {
                              var4_int = 1;
                              break L3;
                            } else {
                              if (43 != var10) {
                                break L4;
                              } else {
                                if (!param0) {
                                  break L4;
                                } else {
                                  var9++;
                                  continue L2;
                                }
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (48 > var10) {
                              break L6;
                            } else {
                              if (57 < var10) {
                                break L6;
                              } else {
                                var10 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (var10 < 65) {
                              break L7;
                            } else {
                              if (var10 <= 90) {
                                var10 -= 55;
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var10 < 97) {
                              break L8;
                            } else {
                              if (122 < var10) {
                                break L8;
                              } else {
                                var10 -= 87;
                                break L5;
                              }
                            }
                          }
                          stackIn_26_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        if (var10 < param1) {
                          L9: {
                            if (var4_int != 0) {
                              var10 = -var10;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var11 = param1 * var7 + var10;
                          if (var7 != var11 / param1) {
                            stackIn_37_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var7 = var11;
                            var5 = 1;
                            break L3;
                          }
                        } else {
                          stackIn_30_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var4);

            stackIn_44_1 = new StringBuilder().append("in.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L10;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L10;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_26_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_30_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_37_0 != 0;
            } else {
              return stackIn_41_0 != 0;
            }
          }
        }
    }

    final static void a(int param0, p param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param1.field_e / param0;
                if (var4_int < 0) {
                  break L2;
                } else {
                  if (id.field_p.length <= var4_int) {
                    break L2;
                  } else {
                    id.field_p[var4_int].a(true, 128, (int)param1.field_c, param3, param2);
                    break L1;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("in.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(double param0, p param1, byte param2, int[] param3, int param4, double param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        og var9 = null;
        int var10 = 0;
        oc var11 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param2 == 29) {
              var11 = new oc(param1.field_j);
              var9 = new og(param1.field_l);
              param1.field_e = 0;
              param3[param4] = 0;
              L1: while (true) {
                L2: {
                  if (-1 != (param1.field_e ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      param1.field_l.a(2, (byte) 94, param1.field_c);
                      param1.a(8573);
                      if (2 != param3[param1.field_j.b(-4)]) {
                        break L3;
                      } else {
                        param1.field_e = 1;
                        break L3;
                      }
                    }
                    if (!param1.a(param0, param5, 29821)) {
                      continue L1;
                    } else {
                      param1.field_i = 13;
                      param1.field_e = 0;
                      param1.field_j.a((byte) 46, var11);
                      param1.field_l.a(var9, -28860);
                      break L2;
                    }
                  }
                }
                L4: {
                  param3[param4] = 3;
                  if (-14 == (param1.field_i ^ -1)) {
                    break L4;
                  } else {
                    param1.field_i = -1;
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("in.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void b(boolean param0);

    abstract long a(byte param0);

    final int a(long param0, int param1) {
        if (param1 < 90) {
            field_a = (String) null;
        }
        long var4 = this.a((byte) -78);
        if (!((var4 ^ -1L) >= -1L)) {
            vj.a(var4, (byte) -49);
        }
        return this.a((byte) -125, param0);
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -86 % ((param0 - -24) / 52);
        field_d = null;
        field_c = null;
    }

    final static void a(boolean param0) {
        int stackIn_63_0 = 0;
        int stackIn_65_0;
        int stackIn_65_1;
        int stackIn_65_2;
        int stackIn_65_3;
        int stackIn_66_0;
        int stackIn_66_1;
        int stackIn_66_2;
        int stackIn_66_3;
        int stackIn_66_4;
        nc stackIn_85_0;
        String stackIn_85_1;
        int stackIn_85_2;
        int stackIn_85_3;
        nc stackIn_86_0;
        String stackIn_86_1;
        int stackIn_86_2;
        int stackIn_86_3;
        int stackIn_86_4;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var8_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4 = new String[8];
            var4[0] = pc.field_b;
            var4[1] = Integer.toString(kh.field_ib[an.field_r[1]]);
            var4[2] = Integer.toString((9 + kh.field_ib[an.field_r[2]]) / 10);
            var4[3] = Integer.toString((kh.field_ib[an.field_r[3]] + 49) / 50);
            var4[4] = Integer.toString((kh.field_ib[an.field_r[4]] + 4) / 5);
            var4[5] = Integer.toString(kh.field_ib[an.field_r[5]]);
            var4[6] = Integer.toString(kh.field_ib[an.field_r[6]]);
            var4[7] = Integer.toString(kh.field_ib[an.field_r[7]]);
            var1_int = 0;
            L1: while (true) {
              if ((var1_int ^ -1) <= -3) {
                var5 = 150;
                var6 = 5;
                var1_int = 0;
                L2: while (true) {
                  if (var1_int >= kh.field_Q.length) {
                    L3: {
                      if (!param0) {
                        break L3;
                      } else {
                        field_b = 104;
                        break L3;
                      }
                    }
                    var1_int = 0;
                    L4: while (true) {
                      if (-9 >= (var1_int ^ -1)) {
                        break L0;
                      } else {
                        L5: {
                          if (kh.field_Q[var1_int]) {
                            L6: {
                              if (-1 != (5 & el.field_m ^ -1)) {
                                break L6;
                              } else {
                                if (j.field_c < -7 + var5) {
                                  break L6;
                                } else {
                                  if (j.field_c >= ti.field_j.field_z + var5 - -9) {
                                    break L6;
                                  } else {
                                    if (rb.field_m < ti.field_j.field_A + var6) {
                                      ri.field_h = var1_int;
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            L7: {
                              var7 = 0;
                              if (var1_int == ri.field_h) {
                                L8: {
                                  if (0 == (el.field_m & 5)) {
                                    stackIn_63_0 = 0;
                                    break L8;
                                  } else {
                                    stackIn_63_0 = 1;
                                    break L8;
                                  }
                                }
                                L9: {
                                  var7 = stackIn_63_0;
                                  stackIn_65_0 = var5 + 2;

                                  stackIn_65_1 = var6 + 2;

                                  stackIn_65_2 = -7 + ti.field_j.field_z;

                                  stackIn_65_3 = ti.field_j.field_A + -6;

                                  if (var7 != 0) {
                                    stackIn_66_0 = stackIn_65_0;
                                    stackIn_66_1 = stackIn_65_1;
                                    stackIn_66_2 = stackIn_65_2;
                                    stackIn_66_3 = stackIn_65_3;
                                    stackIn_66_4 = 16776960;
                                    break L9;
                                  } else {
                                    stackIn_66_0 = stackIn_65_0;
                                    stackIn_66_1 = stackIn_65_1;
                                    stackIn_66_2 = stackIn_65_2;
                                    stackIn_66_3 = stackIn_65_3;
                                    stackIn_66_4 = 8421504;
                                    break L9;
                                  }
                                }
                                si.c(stackIn_66_0, stackIn_66_1, stackIn_66_2, stackIn_66_3, stackIn_66_4);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L10: {
                              L11: {
                                ti.field_j.e(var5, var6);
                                if ((var1_int ^ -1) >= -1) {
                                  break L11;
                                } else {
                                  if (kh.field_ib[an.field_r[var1_int]] > 0) {
                                    break L11;
                                  } else {
                                    var8 = 0;
                                    var9 = 0;
                                    L12: while (true) {
                                      if (di.field_b[var1_int].field_A <= var9) {
                                        break L10;
                                      } else {
                                        var10 = 0;
                                        L13: while (true) {
                                          if (di.field_b[var1_int].field_z <= var10) {
                                            var8 = var8 + di.field_b[var1_int].field_u * 2;
                                            var9 += 2;
                                            continue L12;
                                          } else {
                                            var11 = di.field_b[var1_int].field_D[var8 + var10];
                                            var11 = (255 & var11 >> -1527634544) / 4;
                                            var11 = var11 * 262401;
                                            si.a(4 + var10 / 2 - -var5, var9 / 2 + var6, var11);
                                            var10 += 2;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              di.field_b[var1_int].b(var5 + 4, var6, di.field_b[var1_int].field_z / 2, di.field_b[var1_int].field_A / 2, 256);
                              break L10;
                            }
                            L14: {
                              if (!kh.field_cb[var1_int]) {
                                break L14;
                              } else {
                                var8 = 12 + var5;
                                var9 = var6 - -3;
                                of.field_e.a('2', var8 + -1, var9, 65793);
                                of.field_e.a('2', var8 + 1, var9, 65793);
                                of.field_e.a('2', var8, -1 + var9, 65793);
                                of.field_e.a('2', var8, 1 + var9, 65793);
                                of.field_e.a('2', var8, var9, 16772608);
                                break L14;
                              }
                            }
                            L15: {
                              if (hf.field_i != var1_int) {
                                break L15;
                              } else {
                                var7 = 1;
                                break L15;
                              }
                            }
                            L16: {
                              if (var7 != 0) {
                                si.c(var5 + 24, var6 - -16, 9, 10, 16776960);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            L17: {
                              stackIn_85_0 = al.field_Z;

                              stackIn_85_1 = Integer.toString(1 + var1_int);

                              stackIn_85_2 = var5 - -29;

                              stackIn_85_3 = var6 - -26;

                              if (var7 != 0) {
                                stackIn_86_0 = (nc) ((Object) stackIn_85_0);
                                stackIn_86_1 = (String) ((Object) stackIn_85_1);
                                stackIn_86_2 = stackIn_85_2;
                                stackIn_86_3 = stackIn_85_3;
                                stackIn_86_4 = 0;
                                break L17;
                              } else {
                                stackIn_86_0 = (nc) ((Object) stackIn_85_0);
                                stackIn_86_1 = (String) ((Object) stackIn_85_1);
                                stackIn_86_2 = stackIn_85_2;
                                stackIn_86_3 = stackIn_85_3;
                                stackIn_86_4 = 16776960;
                                break L17;
                              }
                            }
                            ((nc) (Object) stackIn_86_0).b(stackIn_86_1, stackIn_86_2, stackIn_86_3, stackIn_86_4, -1);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var5 += 46;
                        var1_int++;
                        continue L4;
                      }
                    }
                  } else {
                    L18: {
                      if (!kh.field_Q[var1_int]) {
                        break L18;
                      } else {
                        if ((an.field_r[var1_int] ^ -1) <= -1) {
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                    }
                    var1_int++;
                    continue L2;
                  }
                }
              } else {
                L19: {
                  var2 = 8;
                  if (1 != var1_int) {
                    break L19;
                  } else {
                    var2 = 632 + -qa.field_g[0].field_u;
                    break L19;
                  }
                }
                L20: {
                  var3 = 8;
                  var5 = kh.field_U[var1_int];
                  if ((var5 ^ -1) > -1) {
                    break L20;
                  } else {
                    L21: {
                      var6 = 16772608;
                      var7 = an.field_r[var5];
                      if (var7 < 0) {
                        break L21;
                      } else {
                        if ((kh.field_ib[var7] ^ -1) >= -1) {
                          var6 = 16728128;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                    }
                    L22: {
                      if (-1 == (var1_int ^ -1)) {
                        oc.field_c.e(0, 0);
                        dn.a(var2, -112, var5, var3 + -16, var6);
                        break L22;
                      } else {
                        oc.field_c.d(640 + -oc.field_c.field_z, 0);
                        pf.a(var2, -16 + var3, 0, var5, var6);
                        break L22;
                      }
                    }
                    L23: {
                      if (var1_int != 0) {
                        si.d(515, 0, 640, 480);
                        si.c();
                        break L23;
                      } else {
                        si.d(0, 0, 125, 480);
                        si.c();
                        break L23;
                      }
                    }
                    L24: {
                      if (0 != (var7 ^ -1)) {
                        if (-1 == (var1_int ^ -1)) {
                          var2 = var2 + (8 + qa.field_g[0].field_u);
                          hh.field_a[var7].e(46, 5 + var3);
                          break L24;
                        } else {
                          if (-2 == (var1_int ^ -1)) {
                            var2 -= 24;
                            hh.field_a[var7].e(562, 5 + var3);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                      } else {
                        break L24;
                      }
                    }
                    if (-1 >= (var5 ^ -1)) {
                      L25: {
                        var8_ref_String = var4[var5];
                        if (0 > var7) {
                          break L25;
                        } else {
                          if (-1 <= (kh.field_ib[var7] ^ -1)) {
                            var8_ref_String = nf.field_p.toUpperCase();
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                      }
                      if (var1_int != 0) {
                        if ((var1_int ^ -1) == -2) {
                          var2 -= 24;
                          if (var5 == 0) {
                            of.field_e.c(var8_ref_String, 572, 32 + var3, 16772608, 0);
                            break L20;
                          } else {
                            kb.a(7, 42 + var3, var6, 0, var8_ref_String, al.field_Z, 572);
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      } else {
                        L26: {
                          if (var5 == 0) {
                            of.field_e.a(var8_ref_String, 68, var3 - -32, 16772608, 0);
                            break L26;
                          } else {
                            ec.a(7, var3 - -42, false, al.field_Z, 68, var6, var8_ref_String);
                            break L26;
                          }
                        }
                        var2 += 24;
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "in.F(" + param0 + ')');
        }
    }

    static {
        field_c = new int[8192];
        field_b = 838899712;
        field_a = "Loading fonts";
    }
}
