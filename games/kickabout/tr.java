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

    final static void d(int param0) {
        qg var1 = (qg) ((Object) tk.field_Ab.h(-125));
        if (!(var1 != null)) {
            var1 = new qg();
        }
        if (param0 != -12974) {
            tr.a(true);
        }
        var1.a((byte) -96, on.field_e, on.field_b, on.field_a, on.field_g, on.field_f, on.field_h, on.field_c);
        ik.field_C.a(var1, 3);
    }

    public final boolean a(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 > 63) {
            break L0;
          } else {
            field_e = (int[]) null;
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

    public final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_6_0 = 0;
        L0: {
          if (pn.g(2368)) {
            if ((8 & this.field_h) == 0) {
              stackIn_6_0 = 1;
              break L0;
            } else {
              stackIn_6_0 = 0;
              break L0;
            }
          } else {
            stackIn_6_0 = 0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_6_0;
          var4 = 125 / ((param0 - 50) / 45);
          sr.a(var2 != 0, (byte) -89);
          var3 = g.field_a.field_T;
          if (this.a((byte) 103)) {
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

    final static String b(int param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = Kickabout.field_G;
        if (param0 != 0) {
            field_f = (String[]) null;
        }
        String var6 = "(" + dj.field_A + " " + wb.field_n + " " + kq.field_Ab + ") " + so.field_b;
        String var1 = var6;
        if (-1 > (ms.field_b ^ -1)) {
            var1 = var6 + ":";
            for (var2 = 0; var2 < ms.field_b; var2++) {
                var7 = var1 + ' ';
                var3 = un.field_e.field_f[var2] & 255;
                var4 = var3 >> 99833380;
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
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    final static int a(ea param0, boolean param1, ea param2) {
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        var17 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var13 = fr.a(param2, ra.field_F, true);
                var14 = fr.a(param2, tf.field_g, true);
                var15 = fr.a(param2, gm.field_fb, true);
                var16 = fr.a(param2, ao.field_i, true);
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
                      stackIn_12_0 = 0;
                      decompiledRegionSelector0 = 0;
                      break L0;
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
              if (-3 == (var3_int ^ -1)) {
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
              if (!param1) {
                break L5;
              } else {
                tr.a(true);
                break L5;
              }
            }
            L6: {
              if ((var3_int ^ -1) != -2) {
                break L6;
              } else {
                param0.field_k = param2.field_k;
                param0.field_c = param2.field_c;
                param2.field_d = var5;
                param0.field_i = var5;
                break L6;
              }
            }
            L7: {
              if (var3_int != 0) {
                break L7;
              } else {
                param0.field_c = param2.field_c;
                param0.field_i = param2.field_i;
                param2.field_e = var6;
                param0.field_k = var6;
                break L7;
              }
            }
            param2.field_h = (param2.field_e - param2.field_k) * (-param2.field_c + param2.field_l) * (-param2.field_i + param2.field_d);
            param0.field_h = (-param0.field_k + param0.field_e) * (param0.field_l + -param0.field_c) * (-param0.field_i + param0.field_d);
            stackIn_23_0 = 1;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("tr.A(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_23_0;
        }
    }

    final static gg a(String param0, byte param1) {
        String var2 = null;
        gg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_12_0 = null;
        gg stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (kw.field_b != null) {
              if (param0 != null) {
                if (param0.length() != 0) {
                  L1: {
                    var6 = (CharSequence) ((Object) param0);
                    var2 = mo.a(0, var6);
                    if (param1 == 40) {
                      break L1;
                    } else {
                      field_g = (String) null;
                      break L1;
                    }
                  }
                  if (var2 != null) {
                    var3 = (gg) ((Object) kw.field_b.a(param1 ^ -3635, (long)var2.hashCode()));
                    L2: while (true) {
                      if (var3 != null) {
                        var7 = (CharSequence) ((Object) var3.field_Gb);
                        var4 = mo.a(param1 ^ 40, var7);
                        if (var4.equals(var2)) {
                          stackIn_19_0 = (gg) (var3);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3 = (gg) ((Object) kw.field_b.a((byte) 103));
                          continue L2;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_12_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("tr.D(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gg) ((Object) stackIn_12_0);
        } else {
          return stackIn_19_0;
        }
    }

    private final boolean c(int param0) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            this.field_a = -6;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.a((byte) 94)) {
              break L2;
            } else {
              L3: {
                if (!bt.field_e) {
                  break L3;
                } else {
                  if (sf.c(-1, -1)) {
                    break L2;
                  } else {
                    if (!sf.c(-2, -1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_9_0 = 0;
              break L1;
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public final void a(int param0, boolean param1) {
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        boolean stackIn_24_7;
        int stackIn_24_8;
        int stackIn_24_9;
        int stackIn_24_10;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        boolean stackIn_25_7 = false;
        int stackIn_25_8 = 0;
        int stackIn_25_9 = 0;
        int stackIn_25_10 = 0;
        int stackIn_25_11 = 0;
        int var3;
        int var4;
        int var5;
        L0: {
          if (param0 == -25) {
            break L0;
          } else {
            field_e = (int[]) null;
            break L0;
          }
        }
        L1: {
          if (od.field_n) {
            L2: {
              if (!this.c(-1)) {
                break L2;
              } else {
                if ((this.field_a ^ -1) <= -21) {
                  break L2;
                } else {
                  this.field_a = this.field_a + 1;
                  break L2;
                }
              }
            }
            L3: {
              if (this.c(-1)) {
                break L3;
              } else {
                if ((this.field_a ^ -1) < -1) {
                  this.field_a = this.field_a - 1;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var3 = -(this.field_a * this.field_a) + 400;
              var4 = var3 * (-np.field_Bb + 480) / 400 + np.field_Bb;
              up.a(var4, (byte) -124);
              this.field_h = this.field_h + 1;
              kp.a(-121);
              if (null != uv.field_i) {
                if (sp.a(uv.field_i.field_Eb, -3, uv.field_i.field_bc, uv.field_i.field_gc)) {
                  if (tu.field_E.d((byte) 46)) {
                    stackIn_19_0 = 1;
                    break L4;
                  } else {
                    stackIn_19_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_19_0 = 0;
                  break L4;
                }
              } else {
                stackIn_19_0 = 0;
                break L4;
              }
            }
            L5: {
              var5 = stackIn_19_0;
              stackIn_21_0 = 0;

              stackIn_21_1 = -117;

              stackIn_21_2 = 15;

              if (nq.g(0) <= 50) {
                stackIn_22_0 = stackIn_21_0;
                stackIn_22_1 = stackIn_21_1;
                stackIn_22_2 = stackIn_21_2;
                stackIn_22_3 = 0;
                break L5;
              } else {
                stackIn_22_0 = stackIn_21_0;
                stackIn_22_1 = stackIn_21_1;
                stackIn_22_2 = stackIn_21_2;
                stackIn_22_3 = 1;
                break L5;
              }
            }
            L6: {








              stackIn_24_4 = 14;

              stackIn_24_5 = var5;

              stackIn_24_6 = id.field_v;

              stackIn_24_7 = param1;

              stackIn_24_8 = 11;

              stackIn_24_9 = 1;

              stackIn_24_10 = 13;

              if (this.a((byte) 121)) {




                stackIn_25_4 = stackIn_24_4;
                stackIn_25_5 = stackIn_24_5;
                stackIn_25_6 = stackIn_24_6;
                stackIn_25_7 = stackIn_24_7;
                stackIn_25_8 = stackIn_24_8;
                stackIn_25_9 = stackIn_24_9;
                stackIn_25_10 = stackIn_24_10;
                stackIn_25_11 = 0;
                break L6;
              } else {




                stackIn_25_4 = stackIn_24_4;
                stackIn_25_5 = stackIn_24_5;
                stackIn_25_6 = stackIn_24_6;
                stackIn_25_7 = stackIn_24_7;
                stackIn_25_8 = stackIn_24_8;
                stackIn_25_9 = stackIn_24_9;
                stackIn_25_10 = stackIn_24_10;
                stackIn_25_11 = 1;
                break L6;
              }
            }
            L7: {
              te.a(stackIn_22_0, (byte) stackIn_22_1, stackIn_22_2, stackIn_22_3 != 0, stackIn_25_4, stackIn_25_5 != 0, stackIn_25_6, stackIn_25_7, stackIn_25_8, stackIn_25_9 != 0, stackIn_25_10, stackIn_25_11 != 0);
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
            ll.c((byte) 51);
            this.field_a = 0;
            break L1;
          }
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_f = null;
        field_g = null;
        field_b = null;
        field_c = null;
        if (param0) {
            String var2 = (String) null;
            tr.a((String) null, (byte) -45);
        }
    }

    public final boolean a(int param0, int param1, char param2) {
        if (param0 != 11516) {
            this.field_a = -5;
        }
        if (-3 >= (tk.field_Ib ^ -1) || -1 > (eq.field_d ^ -1)) {
            if (ne.field_G[86]) {
                if (84 != param1) {
                } else {
                    if (null != e.field_m) {
                        fd.h(0);
                    } else {
                        dw.a(true, param0 + -11516);
                    }
                    return true;
                }
            }
        }
        if (!(this.a((byte) 73))) {
            return false;
        }
        return ss.a((byte) 88, 12, 15, 13);
    }

    static {
        int var0 = 0;
        field_g = "Profile";
        field_e = new int[16];
        for (var0 = 0; (var0 ^ -1) > -17; var0++) {
            field_e[var0] = var0 * (var0 * 65793);
        }
        field_c = "In an Exhibition Game you don't play with your normal team, but with premade level 50 players instead.";
        field_f = new String[]{"Showing by rating", "Showing by win percentage"};
        field_b = new hh();
    }
}
