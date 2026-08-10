/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends ug {
    float[] field_f;
    float[] field_e;
    float[] field_i;
    static pj field_k;
    static int field_h;
    static le field_g;
    static kj field_j;

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        float[] var5 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = sb.field_r.field_C - -sb.field_r.field_D;
            var2 = 0;
            L1: while (true) {
              if (5 <= var2) {
                L2: {
                  ac.field_a.a((byte) 118);
                  if (param0 < -78) {
                    break L2;
                  } else {
                    var5 = (float[]) null;
                    wg.a((float[]) null, (byte) -105);
                    break L2;
                  }
                }
                ck.field_b = -1;
                break L0;
              } else {
                L3: {
                  fd.field_o[var2] = false;
                  m.field_e[var2] = 272;
                  th.field_o[var2] = 30 + (var1_int + (pl.field_e.field_D + pl.field_e.field_C) * pl.field_e.a(th.field_n[var2], -57 + m.field_e[var2]));
                  if (-138 >= (th.field_o[var2] ^ -1)) {
                    break L3;
                  } else {
                    th.field_o[var2] = 137;
                    break L3;
                  }
                }
                L4: {
                  sl.field_k[var2] = -(m.field_e[var2] / 2) + 320;
                  si.field_v[var2] = 240 - th.field_o[var2] / 2;
                  vh.field_E[var2] = new le(m.field_e[var2], th.field_o[var2]);
                  vh.field_E[var2].e();
                  lb.a(0, m.field_e[var2], (byte) -128, wc.field_e, 0, th.field_o[var2]);
                  pl.field_e.a(th.field_n[var2], 57, 15, m.field_e[var2] + -72, th.field_o[var2] + -30, 1, -1, 0, 0, pl.field_e.field_C + pl.field_e.field_D);
                  sb.field_r.b(lb.field_A, 57, th.field_o[var2] + -15, 1, 6579300);
                  var3 = var2;
                  if (0 != var3) {
                    if (3 != var3) {
                      if (var3 == 4) {
                        qi.field_K[1].d(15, 15, 32, 32);
                        qi.field_K[2].d(15, 47, 32, 32);
                        qi.field_K[3].d(15, 79, 32, 32);
                        break L4;
                      } else {
                        if (-2 == (var3 ^ -1)) {
                          ak.field_t[1].c(15, 15);
                          ak.field_t[2].c(15, 47);
                          tl.field_b.c(15, 79);
                          break L4;
                        } else {
                          if ((var3 ^ -1) != -3) {
                            break L4;
                          } else {
                            ge.h(15, 15, 42, 106);
                            wc.field_h.c(15, 15);
                            hb.field_m[4][0].c(15, 47);
                            ak.field_t[4].c(15, 79);
                            break L4;
                          }
                        }
                      }
                    } else {
                      qi.field_K[0].d(15, 15, 32, 32);
                      qi.field_K[0].d(15, 47, 32, 32);
                      qi.field_K[0].d(15, 79, 32, 32);
                      break L4;
                    }
                  } else {
                    nh.field_f[0][0][0].c(15, 15);
                    ak.field_t[0].c(15, 47);
                    ak.field_t[0].c(15, 79);
                    break L4;
                  }
                }
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "wg.A(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1, ad param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -3) {
                break L1;
              } else {
                field_g = (le) null;
                break L1;
              }
            }
            var5 = param2.b(255, param1, param0);
            var4 = var5;
            if (var5 != null) {
              ol.a(var5, -83);
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("wg.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final static float a(float[] param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        float stackIn_3_0 = 0.0f;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 113) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                wg.a(false, (CharSequence) null, 26);
                break L1;
              }
            }
            stackIn_3_0 = param0[1] * param0[1] + param0[0] * param0[0];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wg.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, java.applet.Applet param1, String param2, int param3, long param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            ad var8 = null;
            String var9 = null;
            String var10 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var9 = param1.getParameter("cookiehost");
                      var7 = var9;
                      var7 = var9;
                      var10 = param0 + "=" + param2 + "; version=1; path=/; domain=" + var9;
                      var7 = var10;
                      var7 = var10;
                      if ((param4 ^ -1L) <= -1L) {
                        var7 = var10 + "; Expires=" + ha.a((byte) 126, 1000L * param4 + pf.a(0)) + "; Max-Age=" + param4;
                        break L2;
                      } else {
                        var7 = var10 + "; Discard;";
                        break L2;
                      }
                    }
                    mf.a(true, param1, "document.cookie=\"" + var7 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var6 = decompiledCaughtException;
                    break L3;
                  }
                }
                L4: {
                  if (param3 == -26372) {
                    break L4;
                  } else {
                    var8 = (ad) null;
                    wg.a(-106, -61, (ad) null, -79);
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("wg.D(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L7;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L7;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void f(int param0) {
        jh.field_C.c((byte) 73, new lb());
        if (param0 != -1) {
            float[] var2 = (float[]) null;
            wg.a((float[]) null, (byte) -21);
        }
    }

    final void e(int param0) {
        float var2 = this.field_e[0];
        float var3 = this.field_e[1];
        wj.a(this.field_e, -110, vj.a(uh.a(this.field_f, 0.00009999999747378752f, (byte) 40), (byte) -2, ac.a(this.field_i, 117, this.field_e)));
        this.field_i[0] = var2;
        this.field_i[1] = var3;
        if (param0 >= -81) {
            field_h = 28;
        }
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3 = pc.a((byte) -123, param0, param1);
            if (var3 == null) {
              var4 = 0;
              L1: while (true) {
                if (param1.length() <= var4) {
                  if (param2 != 17212) {
                    stackIn_14_0 = (String) null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  if (!vb.a((byte) 110, param1.charAt(var4))) {
                    stackIn_9_0 = kd.field_b;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("wg.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static int a(boolean param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.length();
            if (!param0) {
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4) {
                  stackIn_10_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (param2 != param1.charAt(var5)) {
                      break L2;
                    } else {
                      var3_int++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 16;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("wg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_k = null;
        field_g = null;
        field_j = null;
    }

    wg(float param0, float param1) {
        this.field_e = new float[2];
        this.field_f = new float[2];
        this.field_i = new float[2];
        this.field_i[0] = param0;
        this.field_e[0] = param0;
        this.field_i[1] = param1;
        this.field_e[1] = param1;
    }

    static {
        field_k = new pj();
    }
}
