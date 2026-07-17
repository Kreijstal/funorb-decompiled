/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends ll {
    int[] field_D;
    static String field_w;
    static int field_y;
    static boolean field_A;
    static String[] field_C;
    private String[] field_z;
    static q[] field_v;
    private int[][] field_B;
    static String field_x;
    private int[] field_E;

    public static void e() {
        field_w = null;
        field_C = null;
        field_v = null;
        field_x = null;
    }

    final static void d(int param0) {
        int var1_int = 0;
        int var2 = DungeonAssault.field_K;
        try {
            o.field_o.b(-92);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                id.field_b[var1_int] = 0L;
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                jf.field_g[var1_int] = 0L;
            }
            nk.field_Kb = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "nf.M(" + param0 + 41);
        }
    }

    final String c(byte param0) {
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (((nf) this).field_z == null) {
            return "";
        }
        if (param0 >= -65) {
            Object var5 = null;
            String discarded$0 = nf.a((CharSequence[]) null, (byte) 85);
        }
        StringBuilder discarded$1 = var6.append(((nf) this).field_z[0]);
        for (var3 = 1; ((nf) this).field_z.length > var3; var3++) {
            StringBuilder discarded$2 = var2.append("...");
            StringBuilder discarded$3 = var6.append(((nf) this).field_z[var3]);
        }
        return var2.toString();
    }

    final void a(ec param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            if (param1 == -1) {
              L1: while (true) {
                var3_int = param0.c(true);
                if (var3_int == 0) {
                  break L0;
                } else {
                  this.a(param0, 32768, var3_int);
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("nf.E(");
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
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        if (param0 > -4) {
            field_w = null;
        }
        if (((nf) this).field_D != null) {
            for (var2 = 0; var2 < ((nf) this).field_D.length; var2++) {
                ((nf) this).field_D[var2] = mp.a(((nf) this).field_D[var2], 32768);
            }
        }
    }

    final static int[] a(wm param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 % 7 == 0) {
                break L1;
              } else {
                if (!param0.a(-(param1 / 7) + (-1 + param1), (byte) 103)) {
                  break L1;
                } else {
                  int incrementValue$4 = var3_int;
                  var3_int++;
                  ia.field_S[incrementValue$4] = -1 + param1;
                  break L1;
                }
              }
            }
            L2: {
              if (param1 <= 6) {
                break L2;
              } else {
                if (!param0.a(param1 - -35, (byte) 121)) {
                  break L2;
                } else {
                  int incrementValue$5 = var3_int;
                  var3_int++;
                  ia.field_S[incrementValue$5] = -7 + param1;
                  break L2;
                }
              }
            }
            L3: {
              if (param1 % 7 == 6) {
                break L3;
              } else {
                if (param0.a(param1 + -(param1 / 7), (byte) 86)) {
                  int incrementValue$6 = var3_int;
                  var3_int++;
                  ia.field_S[incrementValue$6] = 1 + param1;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (42 <= param1) {
                break L4;
              } else {
                if (param0.a(param1 - -42, (byte) 86)) {
                  int incrementValue$7 = var3_int;
                  var3_int++;
                  ia.field_S[incrementValue$7] = param1 + 7;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            var4 = new int[var3_int];
            var6 = 51 / ((58 - param2) / 62);
            var5 = 0;
            L5: while (true) {
              if (var3_int <= var5) {
                stackOut_18_0 = (int[]) var4;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                var4[var5] = ia.field_S[var5];
                var5++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("nf.C(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_19_0;
    }

    private final void a(ec param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ad var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                ((nf) this).field_z = ih.a(97, '<', param0.d(-117));
                break L1;
              } else {
                L2: {
                  if (param2 == 2) {
                    var4_int = param0.c(true);
                    ((nf) this).field_D = new int[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      if (var4_int <= var5) {
                        break L2;
                      } else {
                        ((nf) this).field_D[var5] = param0.k(0);
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    if (param2 != 3) {
                      if (param2 != 4) {
                        break L2;
                      } else {
                        break L1;
                      }
                    } else {
                      var4_int = param0.c(true);
                      ((nf) this).field_E = new int[var4_int];
                      ((nf) this).field_B = new int[var4_int][];
                      var5 = 0;
                      L4: while (true) {
                        if (~var5 <= ~var4_int) {
                          break L2;
                        } else {
                          L5: {
                            var6 = param0.k(0);
                            var7 = qd.a(96, var6);
                            if (var7 != null) {
                              ((nf) this).field_E[var5] = var6;
                              ((nf) this).field_B[var5] = new int[var7.field_a];
                              var8 = 0;
                              L6: while (true) {
                                if (var8 >= var7.field_a) {
                                  break L5;
                                } else {
                                  ((nf) this).field_B[var5][var8] = param0.k(0);
                                  var8++;
                                  continue L6;
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                          var5++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("nf.P(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + 32768 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, boolean param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                he.field_s = false;
                cd.field_b = false;
                if (a.field_n == null) {
                  break L2;
                } else {
                  if (a.field_n.field_T) {
                    L3: {
                      if (param0 != 8) {
                        break L3;
                      } else {
                        L4: {
                          param0 = 2;
                          if (!qc.field_t) {
                            param2 = fk.field_s;
                            break L4;
                          } else {
                            param2 = d.field_b;
                            break L4;
                          }
                        }
                        wo.field_e.a(-12349, co.field_C);
                        break L3;
                      }
                    }
                    L5: {
                      var3_int = 1;
                      if (10 != param0) {
                        break L5;
                      } else {
                        int discarded$4 = -61;
                        rp.a();
                        var3_int = 0;
                        break L5;
                      }
                    }
                    L6: {
                      if (var3_int != 0) {
                        L7: {
                          if (he.field_s) {
                            int discarded$5 = 30496;
                            param2 = jk.a(new String[1], oi.field_G);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (!jd.field_l) {
                            break L8;
                          } else {
                            param2 = kk.field_t;
                            break L8;
                          }
                        }
                        a.field_n.a(26889, param2, param0);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (param0 == 256) {
                      break L2;
                    } else {
                      if (param0 == 10) {
                        break L2;
                      } else {
                        if (qc.field_t) {
                          break L2;
                        } else {
                          wo.field_e.i(22377);
                          break L1;
                        }
                      }
                    }
                  } else {
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
          L9: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("nf.O(").append(param0).append(44).append(1).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    nf() {
    }

    final static String a(CharSequence[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 116 / ((param1 - -62) / 53);
            stackOut_0_0 = ef.a(0, 39, param0, param0.length);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("nf.N(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new String[]{"Raiding", "Raiding a Dungeon.<br><br>At the centre of each dungeon is the <%highlight>hoard room</col>, where your rival Dragon sleeps upon his treasures. The dungeon can be entered at any of the four corner tiles.<br><br><%command>Select one of the highlighted entrances to begin your assault.</col>"};
        field_w = "<col=FF0000>Lethal</col>, even if abilities would prevent death.";
        field_x = "Sneak";
        field_y = -1;
    }
}
