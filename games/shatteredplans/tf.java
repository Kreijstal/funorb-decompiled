/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf implements iq {
    static int field_n;
    private int field_g;
    private int field_m;
    private nq field_i;
    static String[] field_c;
    private int field_e;
    private int field_f;
    private int field_r;
    static int field_p;
    private int field_o;
    static bi field_b;
    private int field_d;
    static gq field_j;
    private int field_h;
    private int field_s;
    private int field_k;
    static bi[] field_l;
    static int[] field_a;
    private int field_q;

    final static ks a(String param0, int param1) {
        RuntimeException var2 = null;
        ks stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -12179) {
                break L1;
              } else {
                tf.a(true);
                break L1;
              }
            }
            stackIn_4_0 = new ks(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("tf.B(");

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
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                tf.a(true);
                break L1;
              }
            }
            L2: {
              if (param1 < 2) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "tf.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_c = null;
              field_b = null;
              field_j = null;
              field_a = null;
              if (!param0) {
                break L1;
              } else {
                field_l = (bi[]) null;
                break L1;
              }
            }
            field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "tf.C(" + param0 + ')');
        }
    }

    final static void a(int param0, nq param1, int param2, nq param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -10) {
              ql.field_n = param1;
              um.field_c = param3;
              fp.field_c = param2;
              eg.b(gf.field_b / 2, gf.field_k / 2, 0);
              id.a(param3.field_K - -param3.field_q, param3.field_K, 26883, param1.field_K, param1.field_q + param1.field_K);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("tf.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static wa a(byte param0) {
        int fieldTemp$0 = 0;
        wa localTemp$1 = null;
        Object stackIn_11_0 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        wa stackIn_45_0 = null;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        wa stackIn_52_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wa var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        wa var3 = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  if (rd.field_g != null) {
                    break L3;
                  } else {
                    stackIn_13_0 = er.field_i;

                    stackIn_13_1 = ui.field_p;

                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (stackIn_13_0 <= stackIn_13_1) {
                        break L3;
                      } else {
                        fieldTemp$0 = ui.field_p;
                        ui.field_p = ui.field_p + 1;
                        rd.field_g = bj.field_J[fieldTemp$0];
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                if (null != rd.field_g) {
                  stackIn_13_0 = param0;
                  stackIn_13_1 = -92;
                  break L2;
                } else {
                  stackIn_11_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              L4: {
                if (stackIn_13_0 == stackIn_13_1) {
                  break L4;
                } else {
                  field_p = -40;
                  break L4;
                }
              }
              L5: {
                var1 = rd.field_g.field_c;
                if (var1 != null) {
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (rd.field_g.field_g != var1.field_g) {
                          break L8;
                        } else {
                          var2 = rd.field_g.field_h + -var1.field_h;
                          stackIn_48_0 = -1;

                          stackIn_48_1 = var2 ^ -1;

                          if (var4 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (stackIn_48_0 > stackIn_48_1) {
                                ak.a(var1.field_h, 0, rd.field_g);
                                break L9;
                              } else {
                                if (var2 >= 0) {
                                  break L9;
                                } else {
                                  throw new RuntimeException();
                                }
                              }
                            }
                            L10: {
                              rd.field_g.field_f = rd.field_g.field_f + var1.field_f;
                              rd.field_g.field_e = rd.field_g.field_e + var1.field_e;
                              rd.field_g.field_a = rd.field_g.field_a + var1.field_a;
                              var3 = var1;
                              localTemp$1 = var1.field_c;
                              var1 = localTemp$1;
                              rd.field_g.field_c = localTemp$1;
                              var3.b(56);
                              if (0 != rd.field_g.field_f) {
                                break L10;
                              } else {
                                if (0 == rd.field_g.field_a) {
                                  L11: {
                                    if (var1 == null) {
                                      break L11;
                                    } else {
                                      if (rd.field_g.field_g != var1.field_g) {
                                        break L11;
                                      } else {
                                        var1.field_e = var1.field_e + rd.field_g.field_e;
                                        rd.field_g.b(-16);
                                        rd.field_g = var1;
                                        var1 = var1.field_c;
                                        if (var4 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  rd.field_g.field_h = 1;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (var1 != null) {
                              if (var4 == 0) {
                                continue L6;
                              } else {
                                break L8;
                              }
                            } else {
                              var1 = rd.field_g;
                              rd.field_g = null;
                              var1.b(param0 + 109);
                              stackIn_45_0 = (wa) (var1);
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          }
                        }
                      }
                      stackIn_48_0 = var1.field_g + -rd.field_g.field_g;
                      stackIn_48_1 = rd.field_g.field_h;
                      break L7;
                    }
                    if (stackIn_48_0 < stackIn_48_1) {
                      ak.a(-rd.field_g.field_g + var1.field_g, 0, rd.field_g);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                } else {
                  break L5;
                }
              }
              var1 = rd.field_g;
              rd.field_g = var1.field_c;
              var1.b(-118);
              stackIn_52_0 = (wa) (var1);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "tf.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wa) ((Object) stackIn_11_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_45_0;
          } else {
            return stackIn_52_0;
          }
        }
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        vg stackIn_4_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lk var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          L0: {
            L1: {
              if (!(param0 instanceof lk)) {
                stackIn_4_0 = null;
                break L1;
              } else {
                stackIn_4_0 = (vg) (param0);
                break L1;
              }
            }
            L2: {
              var6 = (lk) ((Object) stackIn_4_0);
              if (var6 != null) {
                param2 = param2 & var6.field_y;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              gf.d(param0.field_m + param1, param0.field_q + param3, param0.field_x, param0.field_n, this.field_m);
              if (param2) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            var8 = this.field_h + param0.field_m + param1;
            var9 = this.field_k + param0.field_q + param3;
            gf.a(var8, var9, this.field_e, this.field_s, 5592405);
            gf.d(var8, var9, this.field_e, this.field_s, var7);
            if (param4 == 12) {
              L4: {
                if (var6.field_z) {
                  gf.g(var8, var9, this.field_e + var8, this.field_s + var9, 1);
                  gf.g(this.field_e + var8, var9, var8, var9 - -this.field_s, 1);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (this.field_i == null) {
                  break L5;
                } else {
                  var10 = this.field_q + this.field_e - -this.field_h;
                  this.field_i.a(param0.field_s, var10 + (param0.field_m + param1), this.field_g + (param3 + param0.field_q), param0.field_x - var10 - this.field_q, -(this.field_q << 403882081) + param0.field_n, this.field_f, this.field_d, this.field_o, this.field_r, 0);
                  break L5;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var6_ref);

            stackIn_24_1 = new StringBuilder().append("tf.E(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    tf(nq param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_r = 1;
        this.field_o = 1;
        try {
          L0: {
            this.field_k = param6;
            this.field_g = param2;
            this.field_m = param9;
            this.field_i = param0;
            this.field_f = param3;
            this.field_q = param1;
            this.field_h = param5;
            this.field_s = param7;
            this.field_e = param8;
            this.field_d = param4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("tf.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_c = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_p = 256;
        field_j = new gq(8, 0, 4, 1);
    }
}
