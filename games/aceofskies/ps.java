/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ps {
    static int field_h;
    int[] field_j;
    private int[] field_n;
    static qo field_d;
    int[] field_k;
    int field_l;
    private byte[] field_c;
    int[] field_o;
    byte[][] field_i;
    static int[] field_e;
    int[][] field_q;
    nm field_b;
    private int[][] field_p;
    int[] field_g;
    nm[] field_r;
    int field_t;
    int field_m;
    static vd[][] field_f;
    private int field_s;
    int[] field_a;

    final static void a(String[] args, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
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
        try {
          L0: {
            L1: {
              var2_int = 60 / ((param1 - 53) / 55);
              if (null == qk.field_e) {
                break L1;
              } else {
                qk.field_e.field_B.a(args, true);
                break L1;
              }
            }
            L2: {
              if (null != fd.field_f) {
                fd.field_f.field_t.a(args, true);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ps.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (args == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        aq.field_b = null;
        qn.field_d = null;
    }

    private final void a(byte[] param0) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        rb var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        var16 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              int discarded$5 = 0;
              var17 = new rb(pn.a(param0));
              var4 = var17.g(-112);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 <= 7) {
                  L2: {
                    if (6 <= var4) {
                      ((ps) this).field_m = var17.a((byte) 113);
                      break L2;
                    } else {
                      ((ps) this).field_m = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.g(73);
                    if ((var5 & 1) == 0) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (var4 >= 7) {
                      ((ps) this).field_s = var17.c((byte) 127);
                      break L4;
                    } else {
                      ((ps) this).field_s = var17.i((byte) 0);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 & 2) == 0) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    var9 = -1;
                    ((ps) this).field_o = new int[((ps) this).field_s];
                    if (7 <= var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (((ps) this).field_s <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$6 = var8 + var17.c((byte) 127);
                            var8 = dupTemp$6;
                            ((ps) this).field_o[var10] = dupTemp$6;
                            if (((ps) this).field_o[var10] <= var9) {
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var10++;
                          continue L7;
                        }
                      }
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (((ps) this).field_s <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$7 = var8 + var17.i((byte) 0);
                            var8 = dupTemp$7;
                            ((ps) this).field_o[var10] = dupTemp$7;
                            if (((ps) this).field_o[var10] > var9) {
                              var9 = ((ps) this).field_o[var10];
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L11: {
                    ((ps) this).field_l = 1 + var9;
                    ((ps) this).field_g = new int[((ps) this).field_l];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((ps) this).field_i = new byte[((ps) this).field_l][];
                      break L11;
                    }
                  }
                  L12: {
                    ((ps) this).field_q = new int[((ps) this).field_l][];
                    ((ps) this).field_k = new int[((ps) this).field_l];
                    ((ps) this).field_a = new int[((ps) this).field_l];
                    ((ps) this).field_j = new int[((ps) this).field_l];
                    if (var6 != 0) {
                      ((ps) this).field_n = new int[((ps) this).field_l];
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= ((ps) this).field_l) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((ps) this).field_s) {
                              ((ps) this).field_b = new nm(((ps) this).field_n);
                              break L12;
                            } else {
                              ((ps) this).field_n[((ps) this).field_o[var10]] = var17.a((byte) 124);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((ps) this).field_n[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((ps) this).field_s <= var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((ps) this).field_s) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(0, 7186, 64, var21);
                              ((ps) this).field_i[((ps) this).field_o[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (((ps) this).field_s <= var10) {
                          L19: {
                            if (var4 < 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (((ps) this).field_s <= var10) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (((ps) this).field_s <= var10) {
                                      break L19;
                                    } else {
                                      var11 = ((ps) this).field_o[var10];
                                      var12 = ((ps) this).field_k[var11];
                                      var8 = 0;
                                      ((ps) this).field_q[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var14 >= var12) {
                                          L23: {
                                            ((ps) this).field_j[var11] = var13 + 1;
                                            if (var12 == var13 + 1) {
                                              ((ps) this).field_q[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$8 = var8 + var17.i((byte) 0);
                                            var8 = dupTemp$8;
                                            ((ps) this).field_q[var11][var14] = dupTemp$8;
                                            var15 = dupTemp$8;
                                            if (var15 > var13) {
                                              var13 = var15;
                                              break L24;
                                            } else {
                                              break L24;
                                            }
                                          }
                                          var14++;
                                          continue L22;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((ps) this).field_k[((ps) this).field_o[var10]] = var17.i((byte) 0);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= ((ps) this).field_s) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (var10 >= ((ps) this).field_s) {
                                      break L19;
                                    } else {
                                      var11 = ((ps) this).field_o[var10];
                                      var12 = ((ps) this).field_k[var11];
                                      var8 = 0;
                                      ((ps) this).field_q[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var14 >= var12) {
                                          L28: {
                                            ((ps) this).field_j[var11] = var13 - -1;
                                            if (var12 != var13 - -1) {
                                              break L28;
                                            } else {
                                              ((ps) this).field_q[var11] = null;
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$9 = var8 + var17.c((byte) 124);
                                            var8 = dupTemp$9;
                                            ((ps) this).field_q[var11][var14] = dupTemp$9;
                                            var15 = dupTemp$9;
                                            if (var13 >= var15) {
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          var14++;
                                          continue L27;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((ps) this).field_k[((ps) this).field_o[var10]] = var17.c((byte) 126);
                                  var10++;
                                  continue L25;
                                }
                              }
                            }
                          }
                          L30: {
                            if (var6 == 0) {
                              break L30;
                            } else {
                              ((ps) this).field_p = new int[var9 - -1][];
                              ((ps) this).field_r = new nm[1 + var9];
                              var10 = 0;
                              L31: while (true) {
                                if (((ps) this).field_s <= var10) {
                                  break L30;
                                } else {
                                  var11 = ((ps) this).field_o[var10];
                                  var12 = ((ps) this).field_k[var11];
                                  ((ps) this).field_p[var11] = new int[((ps) this).field_j[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (var13 >= ((ps) this).field_j[var11]) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var13 >= var12) {
                                          ((ps) this).field_r[var11] = new nm(((ps) this).field_p[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null != ((ps) this).field_q[var11]) {
                                              var14 = ((ps) this).field_q[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          ((ps) this).field_p[var11][var14] = var17.a((byte) 110);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((ps) this).field_p[var11][var13] = -1;
                                      var13++;
                                      continue L32;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          break L0;
                        } else {
                          ((ps) this).field_a[((ps) this).field_o[var10]] = var17.a((byte) 113);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((ps) this).field_g[((ps) this).field_o[var10]] = var17.a((byte) 125);
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var3 = decompiledCaughtException;
            stackOut_93_0 = (RuntimeException) var3;
            stackOut_93_1 = new StringBuilder().append("ps.E(");
            stackIn_95_0 = stackOut_93_0;
            stackIn_95_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param0 == null) {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L35;
            } else {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "{...}";
              stackIn_96_0 = stackOut_94_0;
              stackIn_96_1 = stackOut_94_1;
              stackIn_96_2 = stackOut_94_2;
              break L35;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_96_0, stackIn_96_2 + ',' + 100 + ')');
        }
    }

    final static void b() {
        oi.a(17, 20665);
    }

    final static void a(int param0, boolean param1, java.awt.Canvas param2) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          try {
            L0: {
              var4 = param2.getGraphics();
              cl.field_fb.a(118, var4, 0, 0);
              var4.dispose();
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L1: {
              var4_ref = (Exception) (Object) decompiledCaughtException;
              param2.repaint();
              break L1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref2;
            stackOut_6_1 = new StringBuilder().append("ps.C(").append(0).append(',').append(false).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 0 + ')');
        }
    }

    public static void a() {
        field_d = null;
        field_e = null;
        field_f = null;
    }

    ps(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((ps) this).field_t = lj.a(-124, param0, param0.length);
            if (param1 != ((ps) this).field_t) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((ps) this).field_c = qm.a(0, param0.length, param0, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((ps) this).field_c[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            int discarded$0 = 100;
            this.a(param0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ps.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[128];
        field_d = new qo();
    }
}
