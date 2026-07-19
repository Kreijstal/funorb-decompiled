/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    private long field_f;
    static String[] field_d;
    int field_k;
    private boolean field_e;
    int field_g;
    private int field_c;
    private String field_j;
    static int field_a;
    String field_h;
    int field_i;
    int[] field_b;

    final int a(int param0) {
        if (!this.field_e) {
          if (2 == this.field_g) {
            if (this.field_c <= 0) {
              if (fk.field_h != this.field_f) {
                if (param0 == -1) {
                  if ((vl.field_b ^ -1) == -3) {
                    if (dj.a((byte) 79, this.field_j)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                } else {
                  field_d = (String[]) null;
                  if ((vl.field_b ^ -1) == -3) {
                    if (!dj.a((byte) 79, this.field_j)) {
                      return 0;
                    } else {
                      return 1;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          } else {
            if (fk.field_h != this.field_f) {
              if (param0 == -1) {
                if ((vl.field_b ^ -1) == -3) {
                  if (!dj.a((byte) 79, this.field_j)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              } else {
                field_d = (String[]) null;
                if ((vl.field_b ^ -1) == -3) {
                  if (!dj.a((byte) 79, this.field_j)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              return 1;
            }
          }
        } else {
          return 2;
        }
    }

    final static db[] a(byte param0) {
        db[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var12 = null;
        int[] var14 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        boolean stackIn_5_0 = false;
        int stackIn_24_0 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_45_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_23_0 = 0;
        int stackOut_44_0 = 0;
        boolean stackOut_27_0 = false;
        var8 = Lexicominos.field_L ? 1 : 0;
        if (param0 == 91) {
          var1 = new db[th.field_t];
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var2 >= th.field_t) {
                  break L2;
                } else {
                  var3 = pb.field_h[var2] * bd.field_m[var2];
                  var21 = be.field_f[var2];
                  stackOut_4_0 = me.field_w[var2];
                  stackIn_24_0 = stackOut_4_0 ? 1 : 0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var8 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (stackIn_5_0) {
                            break L5;
                          } else {
                            var9 = new int[var3];
                            var6_int = 0;
                            L6: while (true) {
                              L7: {
                                if (var6_int >= var3) {
                                  var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var9);
                                  break L7;
                                } else {
                                  var9[var6_int] = ci.field_b[vg.a(255, (int) var21[var6_int])];
                                  var6_int++;
                                  if (var8 != 0) {
                                    break L7;
                                  } else {
                                    continue L6;
                                  }
                                }
                              }
                              if (var8 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var22 = hl.field_o[var2];
                        var14 = new int[var3];
                        var12 = var14;
                        var6 = var12;
                        var7 = 0;
                        L8: while (true) {
                          if (var3 <= var7) {
                            var1[var2] = (db) ((Object) new pi(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var14));
                            break L4;
                          } else {
                            var6[var7] = tb.a(vg.a(255, (int) var22[var7]) << 774833816, ci.field_b[vg.a(255, (int) var21[var7])]);
                            var7++;
                            if (var8 != 0) {
                              break L3;
                            } else {
                              continue L8;
                            }
                          }
                        }
                      }
                      var2++;
                      break L3;
                    }
                    if (var8 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_23_0 = 12428;
              stackIn_24_0 = stackOut_23_0;
              break L1;
            }
            gk.a(stackIn_24_0);
            return var1;
          }
        } else {
          field_d = (String[]) null;
          var1 = new db[th.field_t];
          var2 = 0;
          L9: while (true) {
            L10: {
              if (var2 >= th.field_t) {
                stackOut_44_0 = 12428;
                stackIn_45_0 = stackOut_44_0;
                break L10;
              } else {
                var3 = pb.field_h[var2] * bd.field_m[var2];
                var23 = be.field_f[var2];
                stackOut_27_0 = me.field_w[var2];
                stackIn_45_0 = stackOut_27_0 ? 1 : 0;
                stackIn_28_0 = stackOut_27_0;
                if (var8 != 0) {
                  break L10;
                } else {
                  L11: {
                    L12: {
                      L13: {
                        if (stackIn_28_0) {
                          break L13;
                        } else {
                          var9 = new int[var3];
                          var6_int = 0;
                          L14: while (true) {
                            L15: {
                              if (var6_int >= var3) {
                                var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var9);
                                break L15;
                              } else {
                                var9[var6_int] = ci.field_b[vg.a(255, (int) var23[var6_int])];
                                var6_int++;
                                if (var8 != 0) {
                                  break L15;
                                } else {
                                  continue L14;
                                }
                              }
                            }
                            if (var8 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      var24 = hl.field_o[var2];
                      var14 = new int[var3];
                      var12 = var14;
                      var6 = var12;
                      var7 = 0;
                      L16: while (true) {
                        if (var3 <= var7) {
                          var1[var2] = (db) ((Object) new pi(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var14));
                          break L12;
                        } else {
                          var6[var7] = tb.a(vg.a(255, (int) var24[var7]) << 774833816, ci.field_b[vg.a(255, (int) var23[var7])]);
                          var7++;
                          if (var8 != 0) {
                            break L11;
                          } else {
                            continue L16;
                          }
                        }
                      }
                    }
                    var2++;
                    break L11;
                  }
                  continue L9;
                }
              }
            }
            gk.a(stackIn_45_0);
            return var1;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_a = 12;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static db a(String param0, String param1, sh param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        db stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        db stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param2.c(param0, (byte) -89);
              if (param3 <= -36) {
                break L1;
              } else {
                df.a(true);
                break L1;
              }
            }
            var5 = param2.a(param1, -27964, var4_int);
            stackOut_2_0 = uh.a(param2, var4_int, (byte) -108, var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("df.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    df(boolean param0) {
        L0: {
          L1: {
            this.field_c = rl.field_E;
            this.field_k = kc.field_c;
            this.field_g = kb.field_a;
            if (!param0) {
              break L1;
            } else {
              this.field_b = eb.field_d;
              if (!Lexicominos.field_L) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_b = null;
          break L0;
        }
        this.field_i = fd.field_g;
        this.field_f = jf.field_P;
        this.field_j = gk.field_c;
        this.field_h = oe.field_b;
        this.field_e = tf.field_a;
    }

    static {
        field_d = new String[]{"Wordsmith", "Expert Wordsmith", "Master Wordsmith", "Virtuoso Wordsmith", "Combosmith", "Expert Combosmith", "Master Combosmith", "Virtuoso Combosmith", "Sequence Builder", "Expert Sequence Builder", "Master Sequence Builder", "Lexicominist", "Expert Lexicominist", "Master Lexicominist", "Virtuoso Lexicominist", "Stunning Recovery"};
        field_a = -1;
    }
}
