/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr extends wt {
    static String field_p;
    private int[][] field_s;
    static boolean field_u;
    private String[] field_q;
    static int[] field_n;
    private int[] field_o;
    static String field_r;
    int[] field_t;

    public static void a(boolean param0) {
        field_r = null;
        if (param0) {
            return;
        }
        field_n = null;
        field_p = null;
    }

    final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 32) {
            break L0;
          } else {
            jr.a((byte) 88);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (ob.field_d ^ -1)) {
              break L2;
            } else {
              if (13 > bl.field_c) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
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
        byte[] var16 = null;
        rb var17 = null;
        rb var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        var15 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var17 = new rb(param0);
            var18 = var17;
            var18.field_g = param0.length + -2;
            to.field_t = var18.i((byte) 0);
            ji.field_b = new int[to.field_t];
            lh.field_a = new int[to.field_t];
            q.field_k = new boolean[to.field_t];
            lg.field_j = new int[to.field_t];
            ql.field_p = new byte[to.field_t][];
            fk.field_a = new byte[to.field_t][];
            ee.field_e = new int[to.field_t];
            var18.field_g = -(to.field_t * 8) + (-7 + param0.length);
            pu.field_a = var18.i((byte) 0);
            cc.field_i = var18.i((byte) 0);
            var3 = (var18.g(param1 ^ 7055) & 255) - -1;
            var4 = 0;
            L1: while (true) {
              if (to.field_t <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= to.field_t) {
                    L3: {
                      if (param1 == 7148) {
                        break L3;
                      } else {
                        var16 = (byte[]) null;
                        jr.a((byte[]) null, -128);
                        break L3;
                      }
                    }
                    var4 = 0;
                    L4: while (true) {
                      if (to.field_t <= var4) {
                        var4 = 0;
                        L5: while (true) {
                          if (var4 >= to.field_t) {
                            var18.field_g = param0.length + -7 + -(to.field_t * 8) - (-3 + 3 * var3);
                            ud.field_e = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var3 <= var4) {
                                var18.field_g = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (var4 >= to.field_t) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = ji.field_b[var4];
                                      var6 = ee.field_e[var4];
                                      var7 = var5 * var6;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var8 = var19;
                                      fk.field_a[var4] = var21;
                                      var22 = new byte[var7];
                                      var20 = var22;
                                      var9 = var20;
                                      ql.field_p[var4] = var22;
                                      var10 = 0;
                                      var11 = var18.g(param1 ^ 7088);
                                      if (0 == (var11 & 1)) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var12 >= var7) {
                                            if ((2 & var11) == 0) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var7 <= var12) {
                                                  break L8;
                                                } else {
                                                  L11: {
                                                    dupTemp$0 = var18.d(id.a(param1, 7148));
                                                    var9[var12] = dupTemp$0;
                                                    var13 = dupTemp$0;
                                                    stackIn_48_0 = var10;

                                                    if (var13 == -1) {
                                                      stackIn_49_0 = stackIn_48_0;
                                                      stackIn_49_1 = 0;
                                                      break L11;
                                                    } else {
                                                      stackIn_49_0 = stackIn_48_0;
                                                      stackIn_49_1 = 1;
                                                      break L11;
                                                    }
                                                  }
                                                  var10 = stackIn_49_0 | stackIn_49_1;
                                                  var12++;
                                                  continue L10;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var18.d(param1 + -7148);
                                            var12++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L12: while (true) {
                                          if (var12 >= var5) {
                                            if (-1 == (var11 & 2 ^ -1)) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L13: while (true) {
                                                if (var5 <= var12) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L14: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L13;
                                                    } else {
                                                      L15: {
                                                        dupTemp$1 = var18.d(0);
                                                        var9[var5 * var13 + var12] = dupTemp$1;
                                                        var14 = dupTemp$1;
                                                        stackIn_37_0 = var10;

                                                        if (0 == (var14 ^ -1)) {
                                                          stackIn_38_0 = stackIn_37_0;
                                                          stackIn_38_1 = 0;
                                                          break L15;
                                                        } else {
                                                          stackIn_38_0 = stackIn_37_0;
                                                          stackIn_38_1 = 1;
                                                          break L15;
                                                        }
                                                      }
                                                      var10 = stackIn_38_0 | stackIn_38_1;
                                                      var13++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L16: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L12;
                                              } else {
                                                var8[var13 * var5 + var12] = var18.d(0);
                                                var13++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    q.field_k[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  ud.field_e[var4] = var18.g((byte) -107);
                                  if ((ud.field_e[var4] ^ -1) == -1) {
                                    ud.field_e[var4] = 1;
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
                            ee.field_e[var4] = var18.i((byte) 0);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        ji.field_b[var4] = var18.i((byte) 0);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    lg.field_j[var4] = var18.i((byte) 0);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                lh.field_a[var4] = var17.i((byte) 0);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var2);

            stackIn_54_1 = new StringBuilder().append("jr.B(");

            if (param0 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L18;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L18;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param1 + ')');
        }
    }

    final String c(byte param0) {
        int var3 = 0;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (!(null != this.field_q)) {
            return "";
        }
        StringBuilder discarded$15 = var6.append(this.field_q[0]);
        if (param0 != 1) {
            byte[] var5 = (byte[]) null;
            jr.a((byte[]) null, 105);
        }
        for (var3 = 1; this.field_q.length > var3; var3++) {
            discarded$16 = var2.append("...");
            discarded$17 = var6.append(this.field_q[var3]);
        }
        return var2.toString();
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (!param0) {
            return;
        }
        if (null != this.field_t) {
            for (var2 = 0; var2 < this.field_t.length; var2++) {
                this.field_t[var2] = vo.a(this.field_t[var2], 32768);
            }
        }
    }

    private final void a(rb param0, int param1, int param2) {
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
        ej var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -71) {
                break L1;
              } else {
                this.field_t = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (param2 == 1) {
                this.field_q = ee.a((byte) 10, '<', param0.h(-17883));
                break L2;
              } else {
                L3: {
                  if (param2 == 2) {
                    var4_int = param0.g(-61);
                    this.field_t = new int[var4_int];
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= var4_int) {
                        break L3;
                      } else {
                        this.field_t[var5] = param0.i((byte) 0);
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    if (3 != param2) {
                      if ((param2 ^ -1) != -5) {
                        break L3;
                      } else {
                        break L2;
                      }
                    } else {
                      var4_int = param0.g(82);
                      this.field_o = new int[var4_int];
                      this.field_s = new int[var4_int][];
                      var5 = 0;
                      L5: while (true) {
                        if (var4_int <= var5) {
                          break L3;
                        } else {
                          L6: {
                            var6 = param0.i((byte) 0);
                            var7 = ks.a(var6, -28228);
                            if (var7 != null) {
                              this.field_o[var5] = var6;
                              array$0 = new int[var7.field_c];
                              this.field_s[var5] = array$0;
                              var8 = 0;
                              L7: while (true) {
                                if (var7.field_c <= var8) {
                                  break L6;
                                } else {
                                  this.field_s[var5][var8] = param0.i((byte) 0);
                                  var8++;
                                  continue L7;
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                          var5++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("jr.G(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, rb param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.g(99);
              if (var3_int == 0) {
                L2: {
                  if (param0 > 99) {
                    break L2;
                  } else {
                    field_n = (int[]) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                this.a(param1, -112, var3_int);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("jr.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    jr() {
    }

    static {
        field_n = new int[16384];
        field_r = "Please wait...";
        field_p = "Invalid password.";
    }
}
