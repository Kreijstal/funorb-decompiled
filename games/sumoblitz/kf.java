/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends pj implements ft {
    int field_x;
    static ah field_u;
    static ki field_v;
    int field_s;
    private int field_y;
    private int field_D;
    private fr field_C;
    private int field_z;
    static int field_B;
    int field_A;
    private int field_r;
    static ri[] field_w;
    static String field_t;

    final void a(boolean param0, int param1, int param2) {
        if (param0) {
          this.field_z = 37;
          jaggl.OpenGL.glFramebufferRenderbufferEXT(param2, param1, 36161, this.field_y);
          this.field_z = param2;
          this.field_r = param1;
          return;
        } else {
          jaggl.OpenGL.glFramebufferRenderbufferEXT(param2, param1, 36161, this.field_y);
          this.field_z = param2;
          this.field_r = param1;
          return;
        }
    }

    final void g(int param0) {
        String discarded$5 = null;
        CharSequence var3 = null;
        if (param0 <= -124) {
          if ((this.field_y ^ -1) < -1) {
            this.field_C.b(this.field_y, 97, this.field_s);
            this.field_y = 0;
            return;
          } else {
            return;
          }
        } else {
          var3 = (CharSequence) null;
          discarded$5 = kf.a((CharSequence) null, (byte) -99);
          if ((this.field_y ^ -1) >= -1) {
            return;
          } else {
            this.field_C.b(this.field_y, 97, this.field_s);
            this.field_y = 0;
            return;
          }
        }
    }

    final static String f(int param0) {
        if (param0 != 1) {
            return (String) null;
        }
        if (!(null != qv.field_o)) {
            return "";
        }
        return qv.field_o;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fs var6 = null;
        fs var7 = null;
        boolean[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        boolean[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        boolean[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        boolean[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        boolean[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        boolean[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        boolean[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        boolean[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        boolean[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var6 = new fs(ah.field_g);
            var7 = var6;
            var2 = var7.e(-31302);
            if ((var2 ^ -1) > -2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              bl.field_e = var7.e(-31302);
              ki.field_f = var7.e(-31302);
              iv.field_i = var7.e(-31302);
              hc.field_f = var7.e(-31302);
              if (param0 > 92) {
                var3 = 0;
                L1: while (true) {
                  if (36 <= var3) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (var5 == 0) {
                      L2: {
                        L3: {
                          if (25 > var3) {
                            break L3;
                          } else {
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          go.field_j[var3] = var6.c((byte) 122);
                          ql.field_z[var3] = var6.a(255);
                          if ((var2 ^ -1) <= -3) {
                            var4 = var7.e(-31302);
                            ql.field_A[var3] = -1 + eb.a(4, var4);
                            if (-4 >= (var2 ^ -1)) {
                              L5: {
                                stackOut_17_0 = up.field_g;
                                stackOut_17_1 = var3;
                                stackIn_19_0 = stackOut_17_0;
                                stackIn_19_1 = stackOut_17_1;
                                stackIn_18_0 = stackOut_17_0;
                                stackIn_18_1 = stackOut_17_1;
                                if ((eb.a(1, var4 >> 110881382) ^ -1) != -2) {
                                  stackOut_19_0 = (boolean[]) ((Object) stackIn_19_0);
                                  stackOut_19_1 = stackIn_19_1;
                                  stackOut_19_2 = 0;
                                  stackIn_20_0 = stackOut_19_0;
                                  stackIn_20_1 = stackOut_19_1;
                                  stackIn_20_2 = stackOut_19_2;
                                  break L5;
                                } else {
                                  stackOut_18_0 = (boolean[]) ((Object) stackIn_18_0);
                                  stackOut_18_1 = stackIn_18_1;
                                  stackOut_18_2 = 1;
                                  stackIn_20_0 = stackOut_18_0;
                                  stackIn_20_1 = stackOut_18_1;
                                  stackIn_20_2 = stackOut_18_2;
                                  break L5;
                                }
                              }
                              L6: {
                                stackIn_20_0[stackIn_20_1] = stackIn_20_2 != 0;
                                stackOut_20_0 = qn.field_d;
                                stackOut_20_1 = var3;
                                stackIn_22_0 = stackOut_20_0;
                                stackIn_22_1 = stackOut_20_1;
                                stackIn_21_0 = stackOut_20_0;
                                stackIn_21_1 = stackOut_20_1;
                                if ((eb.a(1, var4 >> -509514585) ^ -1) != -2) {
                                  stackOut_22_0 = (boolean[]) ((Object) stackIn_22_0);
                                  stackOut_22_1 = stackIn_22_1;
                                  stackOut_22_2 = 0;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackIn_23_1 = stackOut_22_1;
                                  stackIn_23_2 = stackOut_22_2;
                                  break L6;
                                } else {
                                  stackOut_21_0 = (boolean[]) ((Object) stackIn_21_0);
                                  stackOut_21_1 = stackIn_21_1;
                                  stackOut_21_2 = 1;
                                  stackIn_23_0 = stackOut_21_0;
                                  stackIn_23_1 = stackOut_21_1;
                                  stackIn_23_2 = stackOut_21_2;
                                  break L6;
                                }
                              }
                              stackIn_23_0[stackIn_23_1] = stackIn_23_2 != 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        if (go.field_j[var3] == 0) {
                          break L2;
                        } else {
                          wm.field_f[var3] = true;
                          bl.field_e = var3;
                          break L2;
                        }
                      }
                      var3++;
                      continue L1;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "kf.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferRenderbufferEXT(this.field_z, this.field_r, 36161, 0);
        int var2 = -8 % ((44 - param0) / 58);
        this.field_z = -1;
        this.field_r = -1;
    }

    protected final void finalize() throws Throwable {
        this.g(-125);
        super.finalize();
    }

    public static void e(int param0) {
        if (param0 != -21057) {
          field_w = (ri[]) null;
          field_w = null;
          field_v = null;
          field_u = null;
          field_t = null;
          return;
        } else {
          field_w = null;
          field_v = null;
          field_u = null;
          field_t = null;
          return;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String discarded$2 = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
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
              if (param1 == 38) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                discarded$2 = kf.a((CharSequence) null, (byte) -40);
                break L1;
              }
            }
            L2: {
              var2 = td.a(-29275, vo.a(param0, 7441));
              if (var2 != null) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackOut_4_0 = (String) (var2);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("kf.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    kf(fr param0, int param1, int param2, int param3) {
        this.field_r = -1;
        this.field_z = -1;
        try {
            this.field_C = param0;
            this.field_x = param3;
            this.field_A = param2;
            this.field_D = param1;
            jaggl.OpenGL.glGenRenderbuffersEXT(1, pj.field_q, 0);
            this.field_y = pj.field_q[0];
            jaggl.OpenGL.glBindRenderbufferEXT(36161, this.field_y);
            jaggl.OpenGL.glRenderbufferStorageEXT(36161, this.field_D, this.field_A, this.field_x);
            this.field_s = this.field_A * (this.field_x * this.field_C.d(this.field_D, -72));
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "kf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_t = "Achievements";
    }
}
