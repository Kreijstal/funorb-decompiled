/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr implements hc {
    private int field_a;
    static String field_g;
    static int[] field_e;
    private int field_h;
    static long field_d;
    static String field_c;
    static hh field_b;
    static String[] field_f;

    final static void d() {
        qg var1 = (qg) (Object) tk.field_Ab.h(-125);
        if (!(var1 != null)) {
            var1 = new qg();
        }
        var1.a((byte) -96, on.field_e, on.field_b, on.field_a, on.field_g, on.field_f, on.field_h, on.field_c);
        ik.field_C.a((gn) (Object) var1, 3);
    }

    public final boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 63) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!od.field_n) {
              break L2;
            } else {
              if (!sf.c(-3, -1)) {
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

    public final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          int discarded$6 = 2368;
          if (pn.g()) {
            if ((8 & ((tr) this).field_h) == 0) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_6_0;
          var4 = 125 / ((param0 - 50) / 45);
          sr.a(var2 != 0, (byte) -89);
          var3 = g.field_a.field_T;
          if (((tr) this).a((byte) 103)) {
            break L1;
          } else {
            if (480 <= var3) {
              break L1;
            } else {
              on.c(0, var3, 640, 0, 128);
              break L1;
            }
          }
        }
    }

    final static String b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        String var1 = "(" + dj.field_A + " " + wb.field_n + " " + kq.field_Ab + ") " + so.field_b;
        if (ms.field_b > 0) {
            var1 = var1 + ":";
            for (var2 = 0; var2 < ms.field_b; var2++) {
                var1 = var1 + ' ';
                var3 = un.field_e.field_f[var2] & 255;
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (10 <= var4) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                if (var3 >= 10) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    final static int a(ea param0, boolean param1, ea param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var17 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                int discarded$4 = 1;
                var13 = fr.a(param2, ra.field_F);
                int discarded$5 = 1;
                var14 = fr.a(param2, tf.field_g);
                int discarded$6 = 1;
                var15 = fr.a(param2, gm.field_fb);
                int discarded$7 = 1;
                var16 = fr.a(param2, ao.field_i);
                var7 = rq.a(2, param2.field_l, (byte) -99, var15, param2, var13, var16, param2.field_c + 1, var14);
                var4 = jr.field_Mb;
                var9 = rq.a(1, param2.field_d, (byte) -99, var15, param2, var13, var16, 1 + param2.field_i, var14);
                var5 = jr.field_Mb;
                var11 = rq.a(0, param2.field_e, (byte) -99, var15, param2, var13, var16, 1 + param2.field_k, var14);
                var6 = jr.field_Mb;
                if (var9 > var7) {
                  break L2;
                } else {
                  if (var7 >= var11) {
                    var3_int = 2;
                    if (var4 < 0) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var7 > var9) {
                  break L3;
                } else {
                  if (var9 >= var11) {
                    var3_int = 1;
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              var3_int = 0;
              break L1;
            }
            L4: {
              param0.field_l = param2.field_l;
              param0.field_e = param2.field_e;
              param0.field_d = param2.field_d;
              if (var3_int == 2) {
                param0.field_k = param2.field_k;
                param2.field_l = var4;
                param0.field_c = var4;
                param0.field_i = param2.field_i;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var3_int != 1) {
                break L5;
              } else {
                param0.field_k = param2.field_k;
                param0.field_c = param2.field_c;
                param2.field_d = var5;
                param0.field_i = var5;
                break L5;
              }
            }
            L6: {
              if (var3_int != 0) {
                break L6;
              } else {
                param0.field_c = param2.field_c;
                param0.field_i = param2.field_i;
                param2.field_e = var6;
                param0.field_k = var6;
                break L6;
              }
            }
            param2.field_h = (param2.field_e - param2.field_k) * (-param2.field_c + param2.field_l) * (-param2.field_i + param2.field_d);
            param0.field_h = (-param0.field_k + param0.field_e) * (param0.field_l + -param0.field_c) * (-param0.field_i + param0.field_d);
            stackOut_20_0 = 1;
            stackIn_21_0 = stackOut_20_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("tr.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(false).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_21_0;
    }

    final static gg a(String param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        gg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_10_0 = null;
        gg stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        gg stackOut_16_0 = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = Kickabout.field_G;
        try {
          if (kw.field_b != null) {
            if (param0 != null) {
              if (param0.length() != 0) {
                var6 = (CharSequence) (Object) param0;
                var2 = mo.a(0, var6);
                if (var2 != null) {
                  var3 = (gg) (Object) kw.field_b.a(-3611, (long)var2.hashCode());
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_Gb;
                      var4 = mo.a(0, var7);
                      if (var4.equals((Object) (Object) var2)) {
                        stackOut_16_0 = (gg) var3;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        var3 = (gg) (Object) kw.field_b.a((byte) 103);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (gg) (Object) stackIn_10_0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2_ref;
            stackOut_20_1 = new StringBuilder().append("tr.D(");
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
              break L1;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 40 + ')');
        }
    }

    private final boolean c() {
        return ((tr) this).a((byte) 94) || bt.field_e;
    }

    public final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        boolean stackIn_23_7 = false;
        int stackIn_23_8 = 0;
        int stackIn_23_9 = 0;
        int stackIn_23_10 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        boolean stackIn_24_7 = false;
        int stackIn_24_8 = 0;
        int stackIn_24_9 = 0;
        int stackIn_24_10 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        boolean stackIn_25_7 = false;
        int stackIn_25_8 = 0;
        int stackIn_25_9 = 0;
        int stackIn_25_10 = 0;
        int stackIn_25_11 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        boolean stackOut_22_7 = false;
        int stackOut_22_8 = 0;
        int stackOut_22_9 = 0;
        int stackOut_22_10 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        boolean stackOut_24_7 = false;
        int stackOut_24_8 = 0;
        int stackOut_24_9 = 0;
        int stackOut_24_10 = 0;
        int stackOut_24_11 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        boolean stackOut_23_7 = false;
        int stackOut_23_8 = 0;
        int stackOut_23_9 = 0;
        int stackOut_23_10 = 0;
        int stackOut_23_11 = 0;
        L0: {
          if (param0 == -25) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          if (od.field_n) {
            L2: {
              int discarded$4 = -1;
              if (!this.c()) {
                break L2;
              } else {
                if (((tr) this).field_a >= 20) {
                  break L2;
                } else {
                  ((tr) this).field_a = ((tr) this).field_a + 1;
                  break L2;
                }
              }
            }
            L3: {
              int discarded$5 = -1;
              if (this.c()) {
                break L3;
              } else {
                if (((tr) this).field_a > 0) {
                  ((tr) this).field_a = ((tr) this).field_a - 1;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var3 = -(((tr) this).field_a * ((tr) this).field_a) + 400;
              var4 = var3 * (-np.field_Bb + 480) / 400 + np.field_Bb;
              up.a(var4, (byte) -124);
              ((tr) this).field_h = ((tr) this).field_h + 1;
              kp.a(-121);
              if (null != uv.field_i) {
                if (sp.a(uv.field_i.field_Eb, -3, uv.field_i.field_bc, uv.field_i.field_gc)) {
                  if (tu.field_E.d((byte) 46)) {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_19_0 = stackOut_16_0;
                    break L4;
                  }
                } else {
                  stackOut_14_0 = 0;
                  stackIn_19_0 = stackOut_14_0;
                  break L4;
                }
              } else {
                stackOut_12_0 = 0;
                stackIn_19_0 = stackOut_12_0;
                break L4;
              }
            }
            L5: {
              var5 = stackIn_19_0;
              int discarded$6 = 0;
              stackOut_19_0 = 0;
              stackOut_19_1 = -117;
              stackOut_19_2 = 15;
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              if (nq.g() <= 50) {
                stackOut_21_0 = stackIn_21_0;
                stackOut_21_1 = stackIn_21_1;
                stackOut_21_2 = stackIn_21_2;
                stackOut_21_3 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                stackIn_22_2 = stackOut_21_2;
                stackIn_22_3 = stackOut_21_3;
                break L5;
              } else {
                stackOut_20_0 = stackIn_20_0;
                stackOut_20_1 = stackIn_20_1;
                stackOut_20_2 = stackIn_20_2;
                stackOut_20_3 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_22_2 = stackOut_20_2;
                stackIn_22_3 = stackOut_20_3;
                break L5;
              }
            }
            L6: {
              stackOut_22_0 = stackIn_22_0;
              stackOut_22_1 = stackIn_22_1;
              stackOut_22_2 = stackIn_22_2;
              stackOut_22_3 = stackIn_22_3;
              stackOut_22_4 = 14;
              stackOut_22_5 = var5;
              stackOut_22_6 = id.field_v;
              stackOut_22_7 = param1;
              stackOut_22_8 = 11;
              stackOut_22_9 = 1;
              stackOut_22_10 = 13;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              stackIn_24_3 = stackOut_22_3;
              stackIn_24_4 = stackOut_22_4;
              stackIn_24_5 = stackOut_22_5;
              stackIn_24_6 = stackOut_22_6;
              stackIn_24_7 = stackOut_22_7;
              stackIn_24_8 = stackOut_22_8;
              stackIn_24_9 = stackOut_22_9;
              stackIn_24_10 = stackOut_22_10;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              stackIn_23_3 = stackOut_22_3;
              stackIn_23_4 = stackOut_22_4;
              stackIn_23_5 = stackOut_22_5;
              stackIn_23_6 = stackOut_22_6;
              stackIn_23_7 = stackOut_22_7;
              stackIn_23_8 = stackOut_22_8;
              stackIn_23_9 = stackOut_22_9;
              stackIn_23_10 = stackOut_22_10;
              if (((tr) this).a((byte) 121)) {
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = stackIn_24_1;
                stackOut_24_2 = stackIn_24_2;
                stackOut_24_3 = stackIn_24_3;
                stackOut_24_4 = stackIn_24_4;
                stackOut_24_5 = stackIn_24_5;
                stackOut_24_6 = stackIn_24_6;
                stackOut_24_7 = stackIn_24_7;
                stackOut_24_8 = stackIn_24_8;
                stackOut_24_9 = stackIn_24_9;
                stackOut_24_10 = stackIn_24_10;
                stackOut_24_11 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                stackIn_25_3 = stackOut_24_3;
                stackIn_25_4 = stackOut_24_4;
                stackIn_25_5 = stackOut_24_5;
                stackIn_25_6 = stackOut_24_6;
                stackIn_25_7 = stackOut_24_7;
                stackIn_25_8 = stackOut_24_8;
                stackIn_25_9 = stackOut_24_9;
                stackIn_25_10 = stackOut_24_10;
                stackIn_25_11 = stackOut_24_11;
                break L6;
              } else {
                stackOut_23_0 = stackIn_23_0;
                stackOut_23_1 = stackIn_23_1;
                stackOut_23_2 = stackIn_23_2;
                stackOut_23_3 = stackIn_23_3;
                stackOut_23_4 = stackIn_23_4;
                stackOut_23_5 = stackIn_23_5;
                stackOut_23_6 = stackIn_23_6;
                stackOut_23_7 = stackIn_23_7;
                stackOut_23_8 = stackIn_23_8;
                stackOut_23_9 = stackIn_23_9;
                stackOut_23_10 = stackIn_23_10;
                stackOut_23_11 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_25_2 = stackOut_23_2;
                stackIn_25_3 = stackOut_23_3;
                stackIn_25_4 = stackOut_23_4;
                stackIn_25_5 = stackOut_23_5;
                stackIn_25_6 = stackOut_23_6;
                stackIn_25_7 = stackOut_23_7;
                stackIn_25_8 = stackOut_23_8;
                stackIn_25_9 = stackOut_23_9;
                stackIn_25_10 = stackOut_23_10;
                stackIn_25_11 = stackOut_23_11;
                break L6;
              }
            }
            L7: {
              te.a(stackIn_25_0, (byte) stackIn_25_1, stackIn_25_2, stackIn_25_3 != 0, stackIn_25_4, stackIn_25_5 != 0, stackIn_25_6, stackIn_25_7, stackIn_25_8, stackIn_25_9 != 0, stackIn_25_10, stackIn_25_11 != 0);
              if (!gs.field_e) {
                break L7;
              } else {
                or.field_d.b(50, (byte) 105);
                gs.field_e = false;
                break L7;
              }
            }
            if (!mg.field_f) {
              break L1;
            } else {
              or.field_d.b(10, (byte) -97);
              mg.field_f = false;
              break L1;
            }
          } else {
            int discarded$7 = 51;
            ll.c();
            ((tr) this).field_a = 0;
            break L1;
          }
        }
    }

    public static void a() {
        field_e = null;
        field_f = null;
        field_g = null;
        field_b = null;
        field_c = null;
    }

    public final boolean a(int param0, int param1, char param2) {
        L0: {
          if (param0 == 11516) {
            break L0;
          } else {
            ((tr) this).field_a = -5;
            break L0;
          }
        }
        L1: {
          L2: {
            if (tk.field_Ib >= 2) {
              break L2;
            } else {
              if (eq.field_d <= 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (!ne.field_G[86]) {
            break L1;
          } else {
            if (84 == param1) {
              L3: {
                if (null == e.field_m) {
                  dw.a(true, param0 + -11516);
                  break L3;
                } else {
                  fd.h(0);
                  break L3;
                }
              }
              return true;
            } else {
              break L1;
            }
          }
        }
        if (!((tr) this).a((byte) 73)) {
          return false;
        } else {
          return ss.a((byte) 88, 12, 15, 13);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_g = "Profile";
        field_e = new int[16];
        for (var0 = 0; var0 < 16; var0++) {
            field_e[var0] = var0 * (var0 * 65793);
        }
        field_c = "In an Exhibition Game you don't play with your normal team, but with premade level 50 players instead.";
        field_f = new String[]{"Showing by rating", "Showing by win percentage"};
        field_b = new hh();
    }
}
