/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static wc field_e;
    private cm field_l;
    private cm field_c;
    private uh field_i;
    static int field_g;
    static String field_h;
    static boolean field_j;
    static gk[] field_a;
    static byte[] field_f;
    static String field_k;
    static String field_b;
    private uh field_d;

    final sk a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        sk stackIn_3_0 = null;
        sk stackIn_7_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_c.b((byte) -61) == 1) {
              stackIn_3_0 = this.a(param1, false, 0, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_c.a(true, param1) == 1) {
                stackIn_7_0 = this.a(0, false, param1, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param2 == -6923) {
                    break L1;
                  } else {
                    ub.a(false, 68);
                    break L1;
                  }
                }
                throw new RuntimeException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ub.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(boolean param0) {
        kd var1 = null;
        int var2 = SteelSentinels.field_G;
        try {
            nn.field_f = null;
            vd.field_h = 0;
            cc.field_gc = 0;
            ea.field_c.g(6);
            am.field_c.g(6);
            var1 = pi.field_a.a(114);
            while (var1 != null) {
                var1.e(480);
                var1 = pi.field_a.a((byte) -55);
            }
            var1 = db.field_h.a(97);
            while (var1 != null) {
                var1.e(480);
                var1 = db.field_h.a((byte) -117);
            }
            if (!param0) {
                ub.c(-100);
            }
            qc.field_P = 0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ub.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_k = null;
        if (param0 < 68) {
          field_b = (String) null;
          field_h = null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_h = null;
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static String a(byte param0, int param1, byte[] param2, int param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_2_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            var11 = new char[param3];
            var10 = var11;
            var9 = var10;
            var4 = var9;
            if (param0 == 37) {
              var5 = 0;
              var6 = 0;
              L1: while (true) {
                if (param3 <= var6) {
                  stackIn_17_0 = new String(var11, 0, var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = param2[var6 + param1] & 255;
                    if (var7 == 0) {
                      break L2;
                    } else {
                      L3: {
                        if (128 > var7) {
                          break L3;
                        } else {
                          if (160 > var7) {
                            L4: {
                              var8 = gl.field_w[var7 + -128];
                              if (var8 == 0) {
                                var8 = 63;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var7 = var8;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      incrementValue$1 = var5;
                      var5++;
                      var9[incrementValue$1] = (char)var7;
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("ub.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_17_0;
        }
    }

    final sk a(byte param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        sk stackIn_4_0 = null;
        sk stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -35) {
                break L1;
              } else {
                ub.a(-82);
                break L1;
              }
            }
            if (-2 != (this.field_l.b((byte) 121) ^ -1)) {
              if (1 != this.field_l.a(true, param2)) {
                throw new RuntimeException();
              } else {
                stackIn_7_0 = this.a(param2, 0, 0, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = this.a(0, 0, param2, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("ub.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void c(int param0) {
        if (wb.field_c != null) {
          pa.a(wb.field_c, 9174);
          if (param0 != 0) {
            L0: {
              field_k = (String) null;
              wb.field_c.a(hb.field_i, param0 ^ -101);
              wb.field_c = null;
              if (null != ve.field_a) {
                ve.field_a.a(15481);
                break L0;
              } else {
                break L0;
              }
            }
            sl.field_n.requestFocus();
            return;
          } else {
            L1: {
              wb.field_c.a(hb.field_i, param0 ^ -101);
              wb.field_c = null;
              if (null != ve.field_a) {
                ve.field_a.a(15481);
                break L1;
              } else {
                break L1;
              }
            }
            sl.field_n.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    private final sk a(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sk var8 = null;
        uk var9 = null;
        sk stackIn_5_0 = null;
        sk stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = param2 ^ (65520 & param0 << 1816291268 | param0 >>> -657504340);
              var5_int = var5_int | param0 << -306872816;
              if (param1 == 0) {
                break L1;
              } else {
                this.field_d = (uh) null;
                break L1;
              }
            }
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (sk) ((Object) this.field_d.a(var6, 127));
            if (var8 != null) {
              stackIn_5_0 = (sk) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param3 == null) {
                  break L2;
                } else {
                  if (param3[0] > 0) {
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              L3: {
                var9 = (uk) ((Object) this.field_i.a(var6, 124));
                if (var9 != null) {
                  break L3;
                } else {
                  var9 = uk.a(this.field_l, param0, param2);
                  if (var9 != null) {
                    this.field_i.a(var6, var9, -1816);
                    break L3;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param3);
              if (var8 != null) {
                var9.b(4);
                this.field_d.a(var6, var8, -1816);
                stackIn_19_0 = (sk) (var8);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("ub.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_19_0;
        }
    }

    private final sk a(String param0, int param1, String param2, int[] param3) {
        sk discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        sk stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = this.field_c.a(param0, 103);
            if (var5_int >= 0) {
              L1: {
                if (param1 <= -67) {
                  break L1;
                } else {
                  var7 = (int[]) null;
                  discarded$1 = this.a((String) null, 67, (String) null, (int[]) null);
                  break L1;
                }
              }
              var6 = this.field_c.a(var5_int, -32759, param2);
              if (var6 >= 0) {
                stackIn_9_0 = this.a(var6, false, var5_int, param3);
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ub.M(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ')');
        }
        return stackIn_9_0;
    }

    final sk a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        sk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = -34 / ((param2 - 33) / 60);
            stackIn_1_0 = this.a(param1, -78, param0, (int[]) null);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("ub.J(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    private final sk a(int param0, boolean param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sk var8 = null;
        mh var9 = null;
        sk var10 = null;
        sk stackIn_2_0 = null;
        sk stackIn_5_0 = null;
        sk stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param0 ^ (param2 >>> -489606932 | param2 << -953753500 & 65532);
            var5_int = var5_int | param2 << 1256070480;
            var6 = (long)var5_int;
            if (!param1) {
              var8 = (sk) ((Object) this.field_d.a(var6, 124));
              if (var8 == null) {
                L1: {
                  if (param3 == null) {
                    break L1;
                  } else {
                    if ((param3[0] ^ -1) < -1) {
                      break L1;
                    } else {
                      return null;
                    }
                  }
                }
                var9 = mh.a(this.field_c, param2, param0);
                if (var9 != null) {
                  L2: {
                    var10 = var9.b();
                    var8 = var10;
                    this.field_d.a(var6, var8, -1816);
                    if (param3 == null) {
                      break L2;
                    } else {
                      param3[0] = param3[0] - var10.field_r.length;
                      break L2;
                    }
                  }
                  stackIn_16_0 = (sk) (var8);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              } else {
                stackIn_5_0 = (sk) (var8);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (sk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("ub.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.field_G;
        if (param0 > 115) {
          var2 = param1;
          if (var2 != 2) {
            if (-57 != (var2 ^ -1)) {
              if (58 != var2) {
                if (-67 != (var2 ^ -1)) {
                  if (-71 != (var2 ^ -1)) {
                    if (-77 != (var2 ^ -1)) {
                      if (80 != var2) {
                        if (85 != var2) {
                          if (89 != var2) {
                            if (-94 != (var2 ^ -1)) {
                              return -1;
                            } else {
                              return 106;
                            }
                          } else {
                            return 105;
                          }
                        } else {
                          return 104;
                        }
                      } else {
                        return 103;
                      }
                    } else {
                      return 102;
                    }
                  } else {
                    return 100;
                  }
                } else {
                  return 99;
                }
              } else {
                return 98;
              }
            } else {
              return 97;
            }
          } else {
            return 96;
          }
        } else {
          field_k = (String) null;
          var2 = param1;
          if (var2 != 2) {
            if (-57 != (var2 ^ -1)) {
              if (58 != var2) {
                if (-67 != (var2 ^ -1)) {
                  if (-71 != (var2 ^ -1)) {
                    if (-77 != (var2 ^ -1)) {
                      if (80 != var2) {
                        if (85 != var2) {
                          if (89 != var2) {
                            if (-94 == (var2 ^ -1)) {
                              return 106;
                            } else {
                              return -1;
                            }
                          } else {
                            return 105;
                          }
                        } else {
                          return 104;
                        }
                      } else {
                        return 103;
                      }
                    } else {
                      return 102;
                    }
                  } else {
                    return 100;
                  }
                } else {
                  return 99;
                }
              } else {
                return 98;
              }
            } else {
              return 97;
            }
          } else {
            return 96;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        if (!param0) {
          L0: {
            if (g.field_c != null) {
              l.a(g.field_c, (byte) -128);
              ef.a(1, ll.field_q * 2);
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 == -1) {
            return;
          } else {
            L1: {
              if (qj.field_q[param1] != null) {
                g.field_c = em.a(qj.field_q[param1], 100, ll.field_q);
                ef.a(1, ll.field_q / 2);
                on.a(g.field_c, -48);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static int b(int param0) {
        if (param0 >= -62) {
            field_k = (String) null;
            return km.field_f;
        }
        return km.field_f;
    }

    ub(cm param0, cm param1) {
        this.field_i = new uh(256);
        this.field_d = new uh(256);
        try {
            this.field_c = param0;
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ub.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new wc();
        field_h = "<%0> would need a rating of <%1> to play with the current options.";
        field_j = false;
        field_g = -1;
        field_k = "Campaign: <col=ffffff><%0></col>";
        field_b = "You must be a member to play with the current options.";
    }
}
