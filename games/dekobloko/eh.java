/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eh {
    int field_g;
    int[] field_f;
    int field_i;
    java.awt.Image field_c;
    static jc field_b;
    static boolean[][] field_h;
    static String field_e;
    static String field_d;
    static ni field_j;
    static int field_a;

    final void a(byte param0) {
        if (param0 > -82) {
            this.a((byte) 23);
        }
        hk.a(this.field_f, this.field_g, this.field_i);
    }

    abstract void a(int param0, byte param1, int param2, java.awt.Component param3);

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
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
        wl var16 = null;
        wl var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -72) {
                break L1;
              } else {
                field_a = 89;
                break L1;
              }
            }
            var16 = new wl(param1);
            var17 = var16;
            var17.field_n = -2 + param1.length;
            ec.field_g = var17.e(3);
            da.field_d = new boolean[ec.field_g];
            sg.field_d = new int[ec.field_g];
            fh.field_a = new int[ec.field_g];
            tm.field_a = new int[ec.field_g];
            hc.field_c = new int[ec.field_g];
            pd.field_e = new byte[ec.field_g][];
            tc.field_Nb = new byte[ec.field_g][];
            var17.field_n = -(ec.field_g * 8) + (param1.length - 7);
            ed.field_f = var17.e(3);
            i.field_d = var17.e(3);
            var3 = 1 + (var17.d((byte) -104) & 255);
            var4 = 0;
            L2: while (true) {
              if (var4 >= ec.field_g) {
                var4 = 0;
                L3: while (true) {
                  if (ec.field_g <= var4) {
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= ec.field_g) {
                        var4 = 0;
                        L5: while (true) {
                          if (ec.field_g <= var4) {
                            var17.field_n = -(3 * (var3 + -1)) + (param1.length - (7 + ec.field_g * 8));
                            mb.field_d = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var3 <= var4) {
                                var17.field_n = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (ec.field_g <= var4) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = tm.field_a[var4];
                                      var6 = hc.field_c[var4];
                                      var7 = var5 * var6;
                                      var20 = new byte[var7];
                                      var18 = var20;
                                      var8 = var18;
                                      tc.field_Nb[var4] = var20;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var9 = var19;
                                      pd.field_e[var4] = var21;
                                      var10 = 0;
                                      var11 = var17.d((byte) -35);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var5 <= var12) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var5 <= var12) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L11: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L10;
                                                    } else {
                                                      L12: {
                                                        dupTemp$0 = var17.g((byte) -115);
                                                        var9[var12 + var13 * var5] = dupTemp$0;
                                                        var14 = dupTemp$0;
                                                        stackIn_48_0 = var10;

                                                        if (-1 == var14) {
                                                          stackIn_49_0 = stackIn_48_0;
                                                          stackIn_49_1 = 0;
                                                          break L12;
                                                        } else {
                                                          stackIn_49_0 = stackIn_48_0;
                                                          stackIn_49_1 = 1;
                                                          break L12;
                                                        }
                                                      }
                                                      var10 = stackIn_49_0 | stackIn_49_1;
                                                      var13++;
                                                      continue L11;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var13 = 0;
                                            L13: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L9;
                                              } else {
                                                var8[var13 * var5 + var12] = var17.g((byte) -124);
                                                var13++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L14: while (true) {
                                          if (var7 <= var12) {
                                            if ((var11 & 2) == 0) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L15: while (true) {
                                                if (var12 >= var7) {
                                                  break L8;
                                                } else {
                                                  L16: {
                                                    dupTemp$1 = var17.g((byte) -119);
                                                    var9[var12] = dupTemp$1;
                                                    var13 = dupTemp$1;
                                                    stackIn_32_0 = var10;

                                                    if ((var13 ^ -1) == 0) {
                                                      stackIn_33_0 = stackIn_32_0;
                                                      stackIn_33_1 = 0;
                                                      break L16;
                                                    } else {
                                                      stackIn_33_0 = stackIn_32_0;
                                                      stackIn_33_1 = 1;
                                                      break L16;
                                                    }
                                                  }
                                                  var10 = stackIn_33_0 | stackIn_33_1;
                                                  var12++;
                                                  continue L15;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.g((byte) -127);
                                            var12++;
                                            continue L14;
                                          }
                                        }
                                      }
                                    }
                                    da.field_d[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  mb.field_d[var4] = var17.h(param0 + 65352);
                                  if (0 == mb.field_d[var4]) {
                                    mb.field_d[var4] = 1;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            hc.field_c[var4] = var17.e(3);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        tm.field_a[var4] = var17.e(3);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    fh.field_a[var4] = var17.e(qm.b((int) param0, -69));
                    var4++;
                    continue L3;
                  }
                }
              } else {
                sg.field_d[var4] = var16.e(qm.b((int) param0, -69));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var2);

            stackIn_55_1 = new StringBuilder().append("eh.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L18;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L18;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
        }
    }

    abstract void a(byte param0, java.awt.Graphics param1, int param2, int param3);

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_h = (boolean[][]) null;
        field_b = null;
        field_j = null;
        if (param0 != 24744) {
            eh.a(125);
        }
    }

    static {
        field_b = new jc();
        field_e = "Shape feedback:";
    }
}
