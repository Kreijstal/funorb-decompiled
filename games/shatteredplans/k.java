/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static bi field_d;
    static String field_e;
    pf field_a;
    static boolean field_b;
    static fg field_h;
    static byte[] field_c;
    static String[] field_j;
    static char[] field_f;
    static boolean field_i;
    static int[] field_g;

    final void a(int param0, ln param1, ln param2, fs param3) {
        try {
            this.field_a.a((byte) -113, new qm(3, param3, param1, param2));
            int var5_int = -23 / ((param0 - -43) / 44);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "k.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ln param0, fs param1, byte param2, boolean param3, int param4, ln param5) {
        mg var7 = null;
        try {
            int var8 = -65 % ((-22 - param2) / 40);
            var7 = new mg(param5, param0, param1, param4);
            this.field_a.a((byte) -113, var7);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "k.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, fs param1, fs param2) {
        try {
            this.field_a.a((byte) -113, new rf(param1, param2));
            if (param0 != 255) {
                field_d = (bi) null;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "k.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ln param0, int param1, int[] param2, ln[] param3) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7_int = 0;
        ln[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        ln[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              if (param1 >= 64) {
                break L1;
              } else {
                var11 = (ln[]) null;
                this.a((ln) null, -107, (int[]) null, (ln[]) null);
                break L1;
              }
            }
            var7_int = 0;
            L2: while (true) {
              if (var7_int >= param2.length) {
                L3: {
                  if (var6 > 0) {
                    var7 = new ln[var6];
                    var14 = new int[var6];
                    var13 = var14;
                    var8 = var13;
                    var12 = 0;
                    var6 = var12;
                    var9 = 0;
                    L4: while (true) {
                      if (param2.length <= var9) {
                        this.field_a.a((byte) -113, new nr(param0, var14, var7));
                        break L3;
                      } else {
                        L5: {
                          if (0 == param2[var9]) {
                            break L5;
                          } else {
                            var7[var12] = param3[var9];
                            var8[var12] = param2[var9];
                            var12++;
                            break L5;
                          }
                        }
                        var9++;
                        continue L4;
                      }
                    }
                  } else {
                    this.field_a.a((byte) -113, new nr(param0, var5_int));
                    break L3;
                  }
                }
                break L0;
              } else {
                L6: {
                  if (-1 == (param2[var7_int] ^ -1)) {
                    break L6;
                  } else {
                    var6++;
                    break L6;
                  }
                }
                var5_int = var5_int + param2[var7_int];
                var7_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("k.H(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_j = null;
        field_d = null;
        field_f = null;
        field_g = null;
        field_c = null;
        if (param0 != 0) {
            field_e = (String) null;
        }
    }

    final void a(int param0, ln param1, boolean param2) {
        try {
            this.field_a.a((byte) -113, new nr(param1, param0));
            if (!param2) {
                this.field_a = (pf) null;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "k.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, ln param1, fs param2) {
        try {
            this.field_a.a((byte) -113, new qm(param0, param2, param1));
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "k.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public k() {
        this.field_a = new pf();
    }

    final void a(int param0, ln param1, fs param2, int param3) {
        try {
            int var5_int = 48 / ((param3 - -6) / 60);
            this.field_a.a((byte) -113, new qi(param1, param2, param0));
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "k.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final eg a(int[] param0, ln param1, int param2, fs[] param3) {
        eg var5 = null;
        RuntimeException var5_ref = null;
        byte[] var6 = null;
        eg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                var6 = (byte[]) null;
                k.a((byte[]) null, (byte) 21);
                break L1;
              }
            }
            var5 = new eg(param1, param3, param0);
            this.field_a.a((byte) -113, var5);
            stackIn_3_0 = (eg) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("k.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(fs param0, boolean param1) {
        try {
            this.field_a.a((byte) -113, new ca(param0));
            if (param1) {
                ln var4 = (ln) null;
                this.a(-87, (ln) null, -32);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "k.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte[] param0, byte param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
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
        ob var16 = null;
        ob var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var16 = new ob(param0);
            var17 = var16;
            var17.field_j = param0.length - 2;
            en.field_c = var17.f(-20976);
            cm.field_g = new int[en.field_c];
            kc.field_l = new byte[en.field_c][];
            ua.field_h = new boolean[en.field_c];
            hd.field_q = new byte[en.field_c][];
            mc.field_s = new int[en.field_c];
            cf.field_H = new int[en.field_c];
            sj.field_a = new int[en.field_c];
            var17.field_j = param0.length + (-7 + -(en.field_c * 8));
            tk.field_y = var17.f(-20976);
            eg.field_t = var17.f(-20976);
            var3 = (var17.j(-70) & 255) + 1;
            var4 = 0;
            L1: while (true) {
              if (en.field_c <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= en.field_c) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= en.field_c) {
                        var5 = -25 % ((-23 - param1) / 52);
                        var4 = 0;
                        L4: while (true) {
                          if (en.field_c <= var4) {
                            var17.field_j = -(3 * (var3 + -1)) + -(en.field_c * 8) + (param0.length - 7);
                            eo.field_fb = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var4 >= var3) {
                                var17.field_j = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= en.field_c) {
                                    break L0;
                                  } else {
                                    var5 = mc.field_s[var4];
                                    var6 = cm.field_g[var4];
                                    var7 = var6 * var5;
                                    var20 = new byte[var7];
                                    var18 = var20;
                                    var8 = var18;
                                    hd.field_q[var4] = var20;
                                    var21 = new byte[var7];
                                    var19 = var21;
                                    var9 = var19;
                                    kc.field_l[var4] = var21;
                                    var10 = 0;
                                    var11 = var17.j(-74);
                                    stackIn_23_0 = -1;
                                    stackIn_23_1 = var11 & 1 ^ -1;
                                    L7: {
                                      if (stackIn_23_0 == stackIn_23_1) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var7 <= var12) {
                                            if ((var11 & 2) != 0) {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var12 >= var7) {
                                                  break L7;
                                                } else {
                                                  L10: {
                                                    dupTemp$0 = var17.g(-2852);
                                                    var9[var12] = dupTemp$0;
                                                    var13 = dupTemp$0;
                                                    stackIn_50_0 = var10;

                                                    if (var13 == -1) {
                                                      stackIn_51_0 = stackIn_50_0;
                                                      stackIn_51_1 = 0;
                                                      break L10;
                                                    } else {
                                                      stackIn_51_0 = stackIn_50_0;
                                                      stackIn_51_1 = 1;
                                                      break L10;
                                                    }
                                                  }
                                                  var10 = stackIn_51_0 | stackIn_51_1;
                                                  var12++;
                                                  continue L9;
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var8[var12] = var17.g(-2852);
                                            var12++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L11: while (true) {
                                          if (var5 <= var12) {
                                            if (0 != (var11 & 2)) {
                                              var12 = 0;
                                              L12: while (true) {
                                                if (var5 <= var12) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L13: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L12;
                                                    } else {
                                                      L14: {
                                                        dupTemp$1 = var17.g(-2852);
                                                        var9[var12 + var5 * var13] = dupTemp$1;
                                                        var14 = dupTemp$1;
                                                        stackIn_38_0 = var10;

                                                        if ((var14 ^ -1) == 0) {
                                                          stackIn_39_0 = stackIn_38_0;
                                                          stackIn_39_1 = 0;
                                                          break L14;
                                                        } else {
                                                          stackIn_39_0 = stackIn_38_0;
                                                          stackIn_39_1 = 1;
                                                          break L14;
                                                        }
                                                      }
                                                      var10 = stackIn_39_0 | stackIn_39_1;
                                                      var13++;
                                                      continue L13;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var13 = 0;
                                            L15: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L11;
                                              } else {
                                                var8[var12 - -(var5 * var13)] = var17.g(-2852);
                                                var13++;
                                                continue L15;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    ua.field_h[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  eo.field_fb[var4] = var17.k(255);
                                  if (eo.field_fb[var4] == 0) {
                                    eo.field_fb[var4] = 1;
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
                            cm.field_g[var4] = var17.f(-20976);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        mc.field_s[var4] = var17.f(-20976);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    sj.field_a[var4] = var17.f(-20976);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                cf.field_H[var4] = var16.f(-20976);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var2);

            stackIn_56_1 = new StringBuilder().append("k.E(");

            if (param0 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L17;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L17;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param1 + ')');
        }
    }

    final void a(fs param0, ln param1, byte param2) {
        try {
            this.field_a.a((byte) -113, new qm(1, param0, param1));
            int var4_int = 21 % ((-27 - param2) / 52);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "k.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, ln param1, int param2) {
        try {
            if (param2 != -4900) {
                this.field_a = (pf) null;
            }
            this.field_a.a((byte) -113, new hj(param1.field_y, param1, param0));
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "k.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Loading sound effects";
        field_b = false;
        field_h = new fg();
        field_j = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_f = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_g = new int[8192];
    }
}
