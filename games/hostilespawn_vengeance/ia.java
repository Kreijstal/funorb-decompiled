/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static int[] field_i;
    static int field_h;
    static String field_k;
    private int[] field_c;
    static bd field_e;
    private boolean field_f;
    static bd[] field_l;
    private int field_a;
    private int field_g;
    private int field_j;
    private int[] field_d;
    private boolean[] field_b;

    final static boolean b() {
        return ti.field_b == ki.field_f;
    }

    final boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == -28) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param2 != ((ia) this).field_g) {
              break L2;
            } else {
              if (param0 != ((ia) this).field_a) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void d(int param0) {
        kf.a(((ia) this).field_c, 0, kh.field_ib, 0, kh.field_ib.length);
        kf.a(((ia) this).field_d, 0, kh.field_U, 0, kh.field_U.length);
        kf.a(((ia) this).field_b, 0, kh.field_Q, 0, kh.field_Q.length);
        if (param0 != 64) {
            field_k = null;
        }
        wa.field_p = ((ia) this).field_j;
        vj.field_s = 0;
        uf.field_h = ((ia) this).field_f;
        n.field_s = 0;
        eh.field_g = ba.a((byte) 113);
        w.field_r = 0;
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = -98 % ((param1 - 85) / 38);
            var5 = 0;
            L1: while (true) {
              if (var2_int <= var5) {
                stackOut_4_0 = new String(var3);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3[-var5 + -1 + var2_int] = param0.charAt(var5);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ia.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final static void a(p param0, int[] param1, int param2) {
        RuntimeException var3 = null;
        double var3_double = 0.0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        oj var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_double = (double)(-param0.field_e + 100) / 15.0;
              var5 = 5;
              var3_double = var3_double / (double)var5;
              if (param2 == -14808) {
                break L1;
              } else {
                var15 = null;
                ia.a((p) null, (int[]) null, 42);
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var6 >= var5) {
                param0.field_e = param0.field_e + 2;
                var6 = param0.field_j.field_e;
                var7 = param0.field_j.field_g;
                var8 = 0;
                L3: while (true) {
                  if (var8 >= rc.field_e) {
                    L4: {
                      if (param0.field_e < 100) {
                        break L4;
                      } else {
                        param0.field_i = -1;
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L5: {
                      var9 = re.field_n[var8];
                      if (var9.field_I <= 0) {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        break L5;
                      } else {
                        stackOut_28_0 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        break L5;
                      }
                    }
                    L6: {
                      var10 = stackIn_30_0;
                      var11 = var9.field_I;
                      if (var9.field_i != 0) {
                        break L6;
                      } else {
                        var11 = eh.field_g;
                        break L6;
                      }
                    }
                    L7: {
                      var12 = var9.field_j.field_e - var6;
                      var13 = var9.field_j.field_g - var7;
                      if (var12 >= 0) {
                        break L7;
                      } else {
                        var12 = -var12;
                        break L7;
                      }
                    }
                    L8: {
                      if (var13 < 0) {
                        var13 = -var13;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (2 <= var12) {
                        break L9;
                      } else {
                        if (var13 >= 2) {
                          break L9;
                        } else {
                          param0.field_e = param0.field_e + 20;
                          var11--;
                          if (0 < var11) {
                            break L9;
                          } else {
                            if (var9.field_i != 0) {
                              if (var10 == 0) {
                                break L9;
                              } else {
                                if (!var9.field_b) {
                                  break L9;
                                } else {
                                  if (var9.field_i == 27) {
                                    break L9;
                                  } else {
                                    al.field_U[2] = al.field_U[2] + 1;
                                    if (al.field_U[2] + 1 != 30) {
                                      break L9;
                                    } else {
                                      ti.a(248, (byte) 43, 7);
                                      break L9;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                    L10: {
                      if (var9.field_i != 0) {
                        if (!var9.a(31, -108)) {
                          break L10;
                        } else {
                          var9.field_I = var11;
                          break L10;
                        }
                      } else {
                        if (param0.field_i == 35) {
                          break L10;
                        } else {
                          if (param0.field_e < 40) {
                            if (var11 >= eh.field_g) {
                              break L10;
                            } else {
                              ci.a(-var11 + eh.field_g, 125);
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    var8++;
                    continue L3;
                  }
                }
              } else {
                L11: {
                  param0.field_l.b(var3_double, param0.field_c, 98);
                  param0.a(8573);
                  var7 = param0.field_j.b(param2 ^ 14804);
                  if (param1[var7] == 2) {
                    L12: {
                      param0.field_l.b(-var3_double, param0.field_c, 126);
                      param0.a(8573);
                      if (param1[-ln.field_a.field_d + var7] == 2) {
                        break L12;
                      } else {
                        if (64.0 > param0.field_c) {
                          break L12;
                        } else {
                          if (192.0 >= param0.field_c) {
                            param0.field_c = -param0.field_c + 128.0;
                            param0.field_e = (int)(-((double)(-param0.field_e + 100) / 1.5) + 100.0);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      if (param1[ln.field_a.field_d + var7] == 2) {
                        break L13;
                      } else {
                        L14: {
                          if (64.0 > param0.field_c) {
                            break L14;
                          } else {
                            if (param0.field_c <= 192.0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        param0.field_e = (int)(-((double)(-param0.field_e + 100) / 1.5) + 100.0);
                        param0.field_c = -param0.field_c + 128.0;
                        break L11;
                      }
                    }
                    L15: {
                      if (param1[-1 + var7] == 2) {
                        break L15;
                      } else {
                        if (128.0 > param0.field_c) {
                          break L15;
                        } else {
                          param0.field_c = -param0.field_c + 256.0;
                          param0.field_e = (int)(-((double)(100 - param0.field_e) / 1.5) + 100.0);
                          break L11;
                        }
                      }
                    }
                    if (param1[var7 + 1] == 2) {
                      break L11;
                    } else {
                      if (128.0 > param0.field_c) {
                        param0.field_e = (int)(100.0 - (double)(100 - param0.field_e) / 1.5);
                        param0.field_c = 256.0 - param0.field_c;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  } else {
                    break L11;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var3;
            stackOut_59_1 = new StringBuilder().append("ia.C(");
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param0 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L16;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L16;
            }
          }
          L17: {
            stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
            stackOut_62_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L17;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L17;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + ',' + param2 + ')');
        }
    }

    final void c(int param0) {
        ((ia) this).field_a = bm.field_c;
        ((ia) this).field_g = rl.field_c;
        kf.a(kh.field_ib, 0, ((ia) this).field_c, 0, kh.field_ib.length);
        kf.a(kh.field_U, 0, ((ia) this).field_d, 0, kh.field_U.length);
        if (param0 != -32238) {
            return;
        }
        kf.a(kh.field_Q, 0, ((ia) this).field_b, 0, kh.field_Q.length);
        ((ia) this).field_f = uf.field_h;
        ((ia) this).field_j = wa.field_p;
    }

    public static void a() {
        field_k = null;
        field_i = null;
        int var1 = 105;
        field_l = null;
        field_e = null;
    }

    final void a(int param0) {
        ((ia) this).field_g = -1;
        if (param0 != 0) {
            Object var3 = null;
            String discarded$0 = ia.a((String) null, 69);
        }
    }

    ia() {
        ((ia) this).field_c = new int[kh.field_ib.length];
        ((ia) this).field_d = new int[kh.field_U.length];
        ((ia) this).field_b = new boolean[kh.field_Q.length];
        ((ia) this).field_g = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new bd[222];
        field_k = "Switch level set";
        field_i = new int[4];
    }
}
