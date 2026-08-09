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

    public static void e(byte param0) {
        if (param0 < 83) {
            nf.d(-70);
        }
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
            for (var1_int = 0; (var1_int ^ -1) > -33; var1_int++) {
                jf.field_g[var1_int] = 0L;
            }
            nk.field_Kb = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "nf.M(" + param0 + ')');
        }
    }

    final String c(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = DungeonAssault.field_K;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (this.field_z == null) {
            return "";
        }
        if (param0 >= -65) {
            CharSequence[] var5 = (CharSequence[]) null;
            nf.a((CharSequence[]) null, (byte) 85);
        }
        StringBuilder discarded$0 = var6.append(this.field_z[0]);
        for (var3 = 1; this.field_z.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var6.append(this.field_z[var3]);
        }
        return var2.toString();
    }

    final void a(ec param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            if (param1 == -1) {
              L1: while (true) {
                var3_int = param0.c(true);
                if (var3_int == 0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.a(param0, 32768, var3_int);
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("nf.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        if (param0 > -4) {
            field_w = (String) null;
        }
        if (this.field_D != null) {
            for (var2 = 0; var2 < this.field_D.length; var2++) {
                this.field_D[var2] = mp.a(this.field_D[var2], 32768);
            }
        }
    }

    final static int[] a(wm param0, int param1, byte param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (-1 == (param1 % 7 ^ -1)) {
                break L1;
              } else {
                if (!param0.a(-(param1 / 7) + (-1 + param1), (byte) 103)) {
                  break L1;
                } else {
                  incrementValue$0 = var3_int;
                  var3_int++;
                  ia.field_S[incrementValue$0] = -1 + param1;
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
                  incrementValue$1 = var3_int;
                  var3_int++;
                  ia.field_S[incrementValue$1] = -7 + param1;
                  break L2;
                }
              }
            }
            L3: {
              if (param1 % 7 == 6) {
                break L3;
              } else {
                if (param0.a(param1 + -(param1 / 7), (byte) 86)) {
                  incrementValue$2 = var3_int;
                  var3_int++;
                  ia.field_S[incrementValue$2] = 1 + param1;
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
                  incrementValue$3 = var3_int;
                  var3_int++;
                  ia.field_S[incrementValue$3] = param1 + 7;
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
                stackIn_19_0 = (int[]) (var4);
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
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("nf.C(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_19_0;
    }

    private final void a(ec param0, int param1, int param2) {
        int[] array$0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ad var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) == -2) {
                this.field_z = ih.a(97, '<', param0.d(-117));
                break L1;
              } else {
                if (-3 == (param2 ^ -1)) {
                  var4_int = param0.c(true);
                  this.field_D = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      this.field_D[var5] = param0.k(0);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (-4 != (param2 ^ -1)) {
                    if (param2 != 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param0.c(true);
                    this.field_E = new int[var4_int];
                    this.field_B = new int[var4_int][];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L4: {
                          var6 = param0.k(0);
                          var7 = qd.a(96, var6);
                          if (var7 != null) {
                            this.field_E[var5] = var6;
                            array$0 = new int[var7.field_a];
                            this.field_B[var5] = array$0;
                            var8 = 0;
                            L5: while (true) {
                              if (var8 >= var7.field_a) {
                                break L4;
                              } else {
                                this.field_B[var5][var8] = param0.k(0);
                                var8++;
                                continue L5;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            L6: {
              if (param1 == 32768) {
                break L6;
              } else {
                this.d((byte) 59);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("nf.P(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, String param2) {
        int var3_int = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              he.field_s = false;
              cd.field_b = false;
              if (a.field_n == null) {
                break L1;
              } else {
                if (a.field_n.field_T) {
                  L2: {
                    if (param0 != 8) {
                      break L2;
                    } else {
                      L3: {
                        param0 = 2;
                        if (!qc.field_t) {
                          param2 = fk.field_s;
                          break L3;
                        } else {
                          param2 = d.field_b;
                          break L3;
                        }
                      }
                      wo.field_e.a(-12349, co.field_C);
                      break L2;
                    }
                  }
                  L4: {
                    var3_int = 1;
                    if (10 != param0) {
                      break L4;
                    } else {
                      rp.a((byte) -61);
                      var3_int = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int != 0) {
                      L6: {
                        if (he.field_s) {
                          param2 = jk.a(new String[]{param2}, oi.field_G, 30496);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (!jd.field_l) {
                          break L7;
                        } else {
                          param2 = kk.field_t;
                          break L7;
                        }
                      }
                      a.field_n.a(26889, param2, param0);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (-257 == (param0 ^ -1)) {
                    break L1;
                  } else {
                    if (-11 == (param0 ^ -1)) {
                      break L1;
                    } else {
                      if (qc.field_t) {
                        break L1;
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
            L8: {
              if (param1) {
                break L8;
              } else {
                field_y = 105;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("nf.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    nf() {
    }

    final static String a(CharSequence[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 116 / ((param1 - -62) / 53);
            stackIn_1_0 = ef.a(0, 39, param0, param0.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("nf.N(");

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
          throw vk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_C = new String[]{"Raiding", "Raiding a Dungeon.<br><br>At the centre of each dungeon is the <%highlight>hoard room</col>, where your rival Dragon sleeps upon his treasures. The dungeon can be entered at any of the four corner tiles.<br><br><%command>Select one of the highlighted entrances to begin your assault.</col>"};
        field_w = "<col=FF0000>Lethal</col>, even if abilities would prevent death.";
        field_x = "Sneak";
        field_y = -1;
    }
}
