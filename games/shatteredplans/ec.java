/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends ml {
    private String field_n;
    private boolean field_o;
    static boolean[] field_r;
    static vr field_s;
    static int field_q;
    static long field_p;
    static String[] field_v;
    static String field_t;
    static String field_u;

    final static void a(int param0, int[] param1, int param2) {
        try {
            qg.field_p[param2] = param1;
            if (param0 != -1) {
                field_t = (String) null;
            }
            mj.field_Hb[param2] = new sm(param2);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ec.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final u b(int param0, String param1) {
        kj var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        CharSequence var5 = null;
        u stackIn_3_0 = null;
        u stackIn_9_0 = null;
        u stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        u stackOut_2_0 = null;
        u stackOut_8_0 = null;
        u stackOut_15_0 = null;
        u stackOut_14_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            if (!vg.a(var5, (byte) -89)) {
              stackOut_2_0 = tj.field_b;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1.equals(this.field_n)) {
                  break L1;
                } else {
                  L2: {
                    var3 = ji.a(param0 + 3780, param1);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (var3.field_g == null) {
                        this.field_o = var3.field_h;
                        this.field_n = param1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_8_0 = lm.field_d;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L3: {
                if (param0 == -11196) {
                  break L3;
                } else {
                  var4 = (int[]) null;
                  ec.a(30, (int[]) null, 29);
                  break L3;
                }
              }
              L4: {
                if (!this.field_o) {
                  stackOut_15_0 = tj.field_b;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = p.field_g;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("ec.N(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final static void e(byte param0) {
        RuntimeException runtimeException = null;
        int var2 = 0;
        mj var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              he.field_p = null;
              np.field_a = null;
              k.field_i = false;
              if (null != gr.field_p) {
                gr.field_p.a(param0 + 66);
                gr.field_p = null;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -66) {
                break L2;
              } else {
                field_v = (String[]) null;
                break L2;
              }
            }
            L3: {
              ShatteredPlansClient.field_H = null;
              if (null == kj.field_a) {
                break L3;
              } else {
                kj.field_a.a(param0 + 66);
                kj.field_a = null;
                break L3;
              }
            }
            L4: {
              ea.field_b = null;
              if (uo.field_a == null) {
                break L4;
              } else {
                uo.field_a.a(0);
                uo.field_a = null;
                break L4;
              }
            }
            L5: {
              qp.field_w = null;
              if (ShatteredPlansClient.field_H == null) {
                break L5;
              } else {
                var3 = (mj) ((Object) ShatteredPlansClient.field_H.c((byte) -102));
                L6: while (true) {
                  if (var3 == null) {
                    ShatteredPlansClient.field_H = null;
                    break L5;
                  } else {
                    var3.a(16);
                    var3 = (mj) ((Object) ShatteredPlansClient.field_H.b((byte) -107));
                    continue L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "ec.S(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        bi discarded$0 = null;
        field_u = null;
        field_s = null;
        if (!param0) {
            discarded$0 = ec.a(-25, -13, false);
        }
        field_t = null;
        field_v = null;
        field_r = null;
    }

    final static bi a(int param0, int param1, boolean param2) {
        int var3 = 0;
        bi var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          var3 = (-(3 * d.field_b[param0].field_z / 4) + 130) * param1 / 5;
          if (var3 > 0) {
            break L0;
          } else {
            var3 = 1;
            break L0;
          }
        }
        var4 = new bi(var3, -6 + d.field_b[param0].field_w);
        ra.a(-104);
        var4.e();
        var5 = 0;
        L1: while (true) {
          if (var4.field_z <= var5) {
            var5 = 0;
            L2: while (true) {
              if (-1 + var4.field_z <= var5) {
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var4.field_w) {
                    L4: {
                      var4.field_B[var4.field_z * var4.field_w - 1] = ui.a(0, var4.field_B[-1 + var4.field_w * var4.field_z], -85, 190);
                      cg.i(0);
                      if (param2) {
                        break L4;
                      } else {
                        field_r = (boolean[]) null;
                        break L4;
                      }
                    }
                    return var4;
                  } else {
                    var4.field_B[var4.field_z - 1 - -(var5 * var4.field_z)] = ui.a(0, var4.field_B[var5 * var4.field_z + (-1 + var4.field_z)], -86, 128);
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var4.field_B[var5] = ui.a(0, var4.field_B[var5], -92, 128);
                var4.field_B[var4.field_z * (var4.field_w - 1) + var5] = ui.a(0, var4.field_B[var4.field_z * (var4.field_w + -1) + var5], -118, 64);
                var5++;
                continue L2;
              }
            }
          } else {
            gf.j(var5, 0, var4.field_w, ui.a(0, gm.field_k[param0], -81, 128 - -(128 * var5 / var4.field_z)));
            var5++;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = 0;
          if (param0 == -1) {
            break L0;
          } else {
            field_p = -46L;
            break L0;
          }
        }
        L1: {
          var3 = js.field_j;
          if (-6 < (var3 ^ -1)) {
            var2 = 8192 * var3 * var3 / 1100;
            break L1;
          } else {
            if (105 <= var3) {
              if ((var3 ^ -1) <= -121) {
                break L1;
              } else {
                var3 = 120 + -var3;
                var2 = 8192 + -(var3 * var3 * 8192 / 3300);
                break L1;
              }
            } else {
              var2 = (-40960 + var3 * 16384) / 220;
              break L1;
            }
          }
        }
        L2: {
          var4 = 1;
          var5 = 0;
          if (-2 == (param1 ^ -1)) {
            var5 = 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (3 != param1) {
            break L3;
          } else {
            var4 = -1;
            break L3;
          }
        }
        L4: {
          if (4 != param1) {
            break L4;
          } else {
            var4 = 1;
            var5 = 1;
            break L4;
          }
        }
        L5: {
          if (5 != param1) {
            break L5;
          } else {
            var5 = 1;
            var4 = -1;
            break L5;
          }
        }
        L6: {
          if (-7 == (param1 ^ -1)) {
            var4 = 1;
            var5 = -1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            if ((param1 ^ -1) == -8) {
              break L8;
            } else {
              if ((param1 ^ -1) == -9) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if (param1 != 11) {
            break L9;
          } else {
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (param1 == 12) {
            var5 = -1;
            var4 = -1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (-14 != (param1 ^ -1)) {
            break L11;
          } else {
            var5 = -1;
            var4 = 1;
            break L11;
          }
        }
        L12: {
          if (14 != param1) {
            break L12;
          } else {
            var4 = -1;
            var5 = 1;
            break L12;
          }
        }
        L13: {
          if (-16 != (param1 ^ -1)) {
            break L13;
          } else {
            var5 = 1;
            var4 = 1;
            break L13;
          }
        }
        ib.field_a = mq.a(var4 * var2, (byte) 80, var5 * var2);
    }

    ec(go param0) {
        super(param0);
        this.field_o = false;
    }

    final void d(int param0) {
        this.field_n = null;
        if (param0 != 0) {
            int[] var3 = (int[]) null;
            ec.a(-117, (int[]) null, 13);
        }
    }

    final static sr a(sl param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        sr var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        sr stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        sr stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.b((byte) 126, 8);
            if (var2_int > 0) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = ng.a(param0, (byte) -95) ? 1 : 0;
                var4 = ng.a(param0, (byte) -95) ? 1 : 0;
                var5 = new sr();
                var5.field_x = (short)param0.b((byte) 115, 16);
                var5.field_w = tm.a((byte) 39, param0, 16, var5.field_w);
                var5.field_z = tm.a((byte) 39, param0, 16, var5.field_z);
                var5.field_f = tm.a((byte) 39, param0, 16, var5.field_f);
                var5.field_u = (short)param0.b((byte) 99, 16);
                var5.field_s = tm.a((byte) 39, param0, 16, var5.field_s);
                var6 = 99 % ((-48 - param1) / 42);
                var5.field_i = tm.a((byte) 39, param0, 16, var5.field_i);
                var5.field_B = tm.a((byte) 39, param0, 16, var5.field_B);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_e = (short)param0.b((byte) 82, 16);
                  var5.field_I = tm.a((byte) 39, param0, 16, var5.field_I);
                  var5.field_y = tm.a((byte) 39, param0, 16, var5.field_y);
                  var5.field_v = tm.a((byte) 39, param0, 16, var5.field_v);
                  var5.field_M = tm.a((byte) 39, param0, 16, var5.field_M);
                  var5.field_P = tm.a((byte) 39, param0, 16, var5.field_P);
                  var5.field_n = tm.a((byte) 39, param0, 16, var5.field_n);
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  discarded$1 = param0.b((byte) 98, 16);
                  var5.field_C = tm.a((byte) 39, param0, 16, var5.field_C);
                  var5.field_g = tm.a((byte) 39, param0, 16, var5.field_g);
                  var5.field_L = tm.a((byte) 39, param0, 16, var5.field_L);
                  var5.field_J = tm.a((byte) 39, param0, 16, var5.field_J);
                  var5.field_G = tm.a((byte) 39, param0, 16, var5.field_G);
                  break L2;
                }
              }
              L3: {
                if (ng.a(param0, (byte) -95)) {
                  var5.field_b = tm.a((byte) 39, param0, 16, var5.field_b);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!ng.a(param0, (byte) -95)) {
                  break L4;
                } else {
                  var5.field_p = df.a(16, false, param0, var5.field_p);
                  var7 = 0;
                  var8 = 0;
                  L5: while (true) {
                    if (var5.field_p.length <= var8) {
                      if (var7 == 0) {
                        var5.field_p = null;
                        break L4;
                      } else {
                        var5.field_o = (byte)(1 + var7);
                        break L4;
                      }
                    } else {
                      if ((255 & var5.field_p[var8]) > var7) {
                        var7 = 255 & var5.field_p[var8];
                        var8++;
                        continue L5;
                      } else {
                        var8++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = (sr) (var5);
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("ec.V(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    final static void b(int param0, int param1) {
        if (param0 != -8) {
            ec.e((byte) 84);
        }
        if (!(-51 == (param1 ^ -1))) {
            throw new IllegalArgumentException();
        }
    }

    final String a(boolean param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        kj var4 = null;
        CharSequence var5 = null;
        String stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        Object stackOut_10_0 = null;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_n = (String) null;
                break L1;
              }
            }
            var5 = (CharSequence) ((Object) param1);
            var3 = im.a(var5, (byte) -123);
            if (var3 != null) {
              stackOut_4_0 = (String) (var3);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param1.equals(this.field_n)) {
                  break L2;
                } else {
                  var4 = ji.a(-7416, param1);
                  if (var4 != null) {
                    if (null == var4.field_g) {
                      this.field_n = param1;
                      this.field_o = var4.field_h;
                      break L2;
                    } else {
                      stackOut_10_0 = null;
                      stackIn_11_0 = stackOut_10_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_o) {
                stackOut_16_0 = ck.field_f;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackOut_14_0 = lr.field_d;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("ec.P(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_11_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    static {
        field_q = 480;
        field_t = "Animations speed is normal. Click to double.";
        field_s = new vr(true, true, false, true, false, false, false, 0);
        field_u = "Confirm Email:";
    }
}
