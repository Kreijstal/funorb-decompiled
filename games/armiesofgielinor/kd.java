/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends tj implements nq, he, mf {
    static String field_U;
    kv field_T;
    static je field_M;
    static int[][] field_Z;
    static wo field_J;
    private ma field_I;
    private ma field_K;
    private hv field_W;
    private fw field_bb;
    private ma field_H;
    private ma field_O;
    static String field_Y;
    private vu field_ab;
    static int field_X;
    private ma field_V;
    static String field_Q;
    static je field_F;
    static wo field_R;
    static String field_L;
    static String field_S;
    static String field_E;
    private fw field_G;
    private ma field_N;

    public final void a(int param0, String param1) {
        ma var3 = null;
        String var4 = null;
        try {
            if (param0 != -1) {
                byte[] var5 = (byte[]) null;
                kd.a(11, (bv) null, (byte[]) null, (byte) -8);
            }
            var3 = this.field_O;
            var4 = param1;
            ((fn) ((Object) var3)).a(false, var4, -27934);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kd.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(int param0, bv param1, byte[] param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 <= -101) {
                break L1;
              } else {
                var9 = (byte[]) null;
                kd.a(-26, (bv) null, (byte[]) null, (byte) -65);
                break L1;
              }
            }
            var4_int = param1.g(-122, param0);
            if (-1 != (var4_int ^ -1)) {
              L2: {
                L3: {
                  if (param2 == null) {
                    break L3;
                  } else {
                    if (var4_int == param2.length) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param2 = new byte[var4_int];
                break L2;
              }
              L4: {
                var5 = param1.g(-117, 3);
                var6 = (byte)param1.g(77, 8);
                if ((var5 ^ -1) >= -1) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param2[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param2[var7] = (byte)(var6 + param1.g(44, var5));
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (byte[]) (param2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("kd.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param3 + ')');
        }
        return stackIn_18_0;
    }

    final static void a(int param0, String param1, ts param2, ka param3, byte param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param4 > 78) {
              var5_int = 0;
              var6 = -1;
              var7 = 1;
              L1: while (true) {
                if (var7 >= param1.length()) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var8 = param1.charAt(var7);
                    if (var8 == 60) {
                      var6 = param2.field_i[0] + (var5_int >> -771694200) - -param3.a(param1.substring(0, var7));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (0 != (var6 ^ -1)) {
                      param2.field_i[var7] = var6;
                      break L3;
                    } else {
                      L4: {
                        if (var8 != 32) {
                          break L4;
                        } else {
                          var5_int = var5_int + param0;
                          break L4;
                        }
                      }
                      param2.field_i[var7] = (var5_int >> 543810344) - -param2.field_i[0] - (-param3.a(param1.substring(0, 1 + var7)) + param3.a((char) var8));
                      break L3;
                    }
                  }
                  L5: {
                    if (var8 == 62) {
                      var6 = -1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("kd.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public kd() {
        super(0, 0, 496, 0, (kh) null);
        this.field_O = new ma("", (qo) null, 12);
        this.field_I = new ma("", (qo) null, 100);
        this.field_H = new ma("", (qo) null, 100);
        this.field_V = new ma("", (qo) null, 20);
        this.field_K = new ma("", (qo) null, 20);
        this.field_N = new ma("", (qo) null, 3);
        int var1 = 1;
        this.field_ab = new vu("", (qo) null, var1 != 0);
        this.field_bb = new fw(ed.field_c, (qo) null);
        this.field_G = new fw(pt.field_Y, (qo) null);
        this.field_O.field_s = ms.field_m;
        this.field_I.field_s = bb.field_d;
        this.field_H.field_s = oc.field_Jb;
        this.field_V.field_s = bm.field_k;
        this.field_K.field_s = ge.field_i;
        this.field_N.field_s = f.field_A;
        this.field_ab.field_s = rd.field_g;
        this.field_O.a((byte) 16, new uj(this.field_O));
        this.field_I.a((byte) 16, new vl(this.field_I));
        this.field_H.a((byte) 16, new kt(this.field_H, this.field_I));
        this.field_V.a((byte) 16, new ib(this.field_V, this.field_O, this.field_I));
        this.field_K.a((byte) 16, new di(this.field_K, this.field_V));
        this.field_N.a((byte) 16, new jh(this.field_N));
        this.field_bb.field_I = false;
        this.field_bb.field_k = (kh) ((Object) new nu());
        this.field_G.field_k = (kh) ((Object) new td());
        this.field_O.field_k = (kh) ((Object) new lu(10000536));
        lu dupTemp$0 = new lu(10000536);
        this.field_H.field_k = (kh) ((Object) dupTemp$0);
        this.field_I.field_k = (kh) ((Object) dupTemp$0);
        this.field_N.field_k = (kh) ((Object) new lu(10000536));
        this.field_ab.field_k = (kh) ((Object) new oi());
        ol dupTemp$1 = new ol(10000536);
        this.field_K.field_k = (kh) ((Object) dupTemp$1);
        this.field_V.field_k = (kh) ((Object) dupTemp$1);
        String var2 = fo.a(4800, qq.field_D, new String[]{this.m(150), this.l(29406)});
        int var3 = 20;
        var3 = var3 + this.a(tn.field_X, var3, 170, (byte) 18, this.field_I);
        var3 = var3 + (this.a(false, 170, this.field_H, hh.field_j, 20, "", var3) - -5);
        var3 = var3 + this.a(jj.field_h, var3, 170, (byte) 18, this.field_V);
        var3 = var3 + (this.a(st.field_B, this.field_K, 170, tf.field_m, 210, var3) + 5);
        var3 = var3 + (5 + this.a(dn.field_Ob, this.field_O, 170, fq.field_k, 210, var3));
        var3 = var3 + this.a(var3, this.field_N, 170, field_S, 27270);
        ta var4 = new ta(46, var3, this.field_l + -90, 25, this.field_ab, true, this.field_l + -120, 5, gl.field_e, 11579568, wg.field_c);
        this.a((byte) 10, (kb) (var4));
        var3 = var3 + var4.field_w;
        lk var5 = new lk(ArmiesOfGielinor.field_J, 0, 0, 0, 0, 16777215, -1, 0, 0, ArmiesOfGielinor.field_J.field_H, -1, 2147483647, true);
        this.field_W = new hv(var2, var5);
        this.field_W.field_s = "";
        this.field_W.a(nh.field_I, false, 0);
        this.field_W.a(nh.field_I, false, 1);
        this.field_W.field_x = (qo) (this);
        this.field_W.a(this.field_l + -90, 9567, 46, var3);
        var3 = var3 + (this.field_W.field_w + 15);
        this.a((byte) 10, (kb) (this.field_W));
        int var6 = 4;
        int var7 = 200;
        this.field_bb.a(496 + -var7 >> 59129633, var7, var3, 8192, 40);
        this.field_G.a(var6 - -3, 60, 15 + var3, 8192, 40);
        this.field_G.field_x = (qo) (this);
        this.field_bb.field_x = (qo) (this);
        this.a((byte) 10, (kb) (this.field_bb));
        this.a((byte) 10, (kb) (this.field_G));
        this.field_T = new kv((mf) (this));
        this.field_T.a(this.field_O.field_B - (-this.field_O.field_l - 60), this.field_l + (-this.field_O.field_B - this.field_O.field_l - 60), this.field_O.field_p - -20, 8192, 150);
        this.a((byte) 10, (kb) (this.field_T));
        this.a(0, 496, 0, 8192, var3 + (55 + var6));
    }

    private final String m(int param0) {
        if (param0 != 150) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean a(boolean param0, eg param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        gu var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              var3 = param1.a(-918933630);
              if (var3 == null) {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = var3.a(false);
                if (var4 != rn.field_e) {
                  if (var4 != ad.field_K) {
                    if (lq.field_c != var4) {
                      stackIn_17_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_15_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_12_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("kd.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L1;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0 != 0;
                } else {
                  return stackIn_17_0 != 0;
                }
              }
            }
          }
        }
    }

    public static void f(byte param0) {
        field_L = null;
        field_S = null;
        field_F = null;
        field_E = null;
        field_M = null;
        field_Z = (int[][]) null;
        field_Q = null;
        if (param0 != 19) {
            kd.f((byte) -98);
        }
        field_Y = null;
        field_R = null;
        field_U = null;
        field_J = null;
    }

    public final void a(int param0, int param1, byte param2, hv param3) {
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 >= 102) {
                break L1;
              } else {
                field_F = (je) null;
                break L1;
              }
            }
            L2: {
              if (0 == param0) {
                ak.a("terms.ws", (byte) -106);
                break L2;
              } else {
                if ((param0 ^ -1) == -2) {
                  ak.a("privacy.ws", (byte) -81);
                  break L2;
                } else {
                  if (param0 != 2) {
                    break L2;
                  } else {
                    ak.a("conduct.ws", (byte) -98);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("kd.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final int a(int param0, kb param1, int param2, String param3, int param4) {
        RuntimeException var6 = null;
        kw var7 = null;
        ta var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = new ta(20, param0, param2 + 120, 25, param1, false, 120, 3, ArmiesOfGielinor.field_J, 16777215, param3);
            if (param4 == 27270) {
              this.a((byte) 10, (kb) (var8));
              var7 = new kw(((eg) ((Object) param1)).a(-918933630));
              this.a((byte) 10, (kb) (var7));
              var7.a(3 + var8.field_l + var8.field_B, 15, var8.field_p + (-15 + var8.field_w >> 230010881), 8192, 15);
              stackIn_4_0 = var8.field_w;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -80;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("kd.R(").append(param0).append(',');

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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param1 == 11) {
                break L1;
              } else {
                this.field_I = (ma) null;
                break L1;
              }
            }
            L2: {
              if (this.field_G == param4) {
                ba.g(111);
                break L2;
              } else {
                if (param4 == this.field_bb) {
                  discarded$1 = this.a(-1);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("kd.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_bb.field_I = this.k(param0 ^ 32673);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kd.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final String l(int param0) {
        if (param0 != 29406) {
            kd.a(109, -112, true);
        }
        return "</col></u>";
    }

    private final boolean k(int param0) {
        String var3;
        L0: {
          if (!this.a(true, (eg) (this.field_O))) {
            break L0;
          } else {
            if (!this.a(true, (eg) (this.field_I))) {
              break L0;
            } else {
              if (!this.a(true, (eg) (this.field_H))) {
                break L0;
              } else {
                if (!this.a(true, (eg) (this.field_V))) {
                  break L0;
                } else {
                  if (!this.a(true, (eg) (this.field_K))) {
                    break L0;
                  } else {
                    if (!this.a(true, (eg) (this.field_N))) {
                      break L0;
                    } else {
                      L1: {
                        if (param0 > 96) {
                          break L1;
                        } else {
                          var3 = (String) null;
                          this.a(6, (String) null);
                          break L1;
                        }
                      }
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) == -99) {
                stackIn_7_0 = this.a(false, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 == param1) {
                  stackIn_11_0 = this.b((byte) -123, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("kd.F(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public final void a(byte param0) {
        if (param0 != -116) {
            return;
        }
        ((uj) ((Object) this.field_O.a(-918933630))).g(50);
    }

    private final int a(boolean param0, int param1, kb param2, String param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        pk var9 = null;
        ta var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var10 = new ta(20, param6, 120 + param1, 25, param2, param0, 120, 3, ArmiesOfGielinor.field_J, 16777215, param3);
            this.a((byte) 10, (kb) (var10));
            var9 = new pk(((eg) ((Object) param2)).a(-918933630), param5, 126, var10.field_w + param6, param1 + 50, param4);
            var9.field_x = (qo) (this);
            this.a((byte) 10, (kb) (var9));
            stackIn_1_0 = var10.field_w - -var9.field_w;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("kd.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(String param0, kb param1, int param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == 210) {
                break L1;
              } else {
                field_Y = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(false, param2, param1, param3, 35, param0, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("kd.G(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(String param0, int param1, int param2, byte param3, kb param4) {
        ta var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = new ta(20, param1, param2 + 120, 25, param4, false, 120, 3, ArmiesOfGielinor.field_J, 16777215, param0);
              this.a((byte) 10, (kb) (var6));
              if (param3 == 18) {
                break L1;
              } else {
                this.field_G = (fw) null;
                break L1;
              }
            }
            stackIn_3_0 = var6.field_w;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6_ref);

            stackIn_6_1 = new StringBuilder().append("kd.U(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        CharSequence var6 = null;
        String var4 = null;
        Object var5 = null;
        if (null != tb.field_e) {
            var3 = tb.field_e.b(true, param2);
            if (0 == var3) {
            } else {
                if (var3 == 2 && tb.field_e.field_X != null && !tb.field_e.field_X.equals("")) {
                    if (tb.field_e.field_X.charAt(0) == 91) {
                        var4 = tb.field_e.field_X;
                    } else {
                        var6 = (CharSequence) ((Object) tb.field_e.field_X);
                        var4 = k.a(var6, false);
                        var5 = var4;
                        var5 = var4;
                    }
                    var5 = null;
                    if (!(0 != ut.field_fb)) {
                        var5 = op.a(20, var4, param1);
                    }
                    if (!((ut.field_fb ^ -1) != -2)) {
                        var5 = nw.a(var4, (byte) -27, param1);
                    }
                    if (!((ut.field_fb ^ -1) != -3)) {
                        var5 = se.a(var4, param1, param0 + -83);
                    }
                    if ((ut.field_fb ^ -1) == -4) {
                        var5 = fq.a(param1, var4, false, var4);
                    }
                    if (!(var5 == null)) {
                        ta.a((String) null, 2, param0 ^ -18117, var4, (String) (var5), 0);
                    }
                }
                tb.field_e = null;
                ut.field_fb = -1;
            }
        }
        if (param0 != 2) {
            field_F = (je) null;
        }
    }

    private final boolean a(int param0) {
        if (!(this.k(97))) {
            return false;
        }
        int var2 = param0;
        try {
            var2 = Integer.parseInt(this.field_N.field_v);
        } catch (NumberFormatException numberFormatException) {
        }
        return eo.a(this.field_ab.field_K, (kd) (this), this.field_V.field_v, this.field_I.field_v, var2, (byte) -110, this.field_O.field_v);
    }

    static {
        field_X = -1;
        field_Y = "Continue Mission";
        field_U = "Names cannot start or end with space or underscore";
        field_Q = "King Black Dragon summoner";
        field_S = "Age:";
        field_Z = new int[][]{new int[]{95, 98, -1, 96, 195, 97, 100, -1, -1, -1}, new int[]{5, 6, -1, 3, 195, 4, 7, -1, -1, -1}, new int[]{152, 77, -1, 75, 195, 76, 78, -1, -1, -1}, new int[]{95, 92, -1, 153, 231, 91, 93, 154, -1, -1}, new int[]{35, 36, -1, 32, 33, 34, 37, 33, -1, -1}, new int[]{95, 203, 228, 201, 200, 202, 204, -1, -1, -1}, new int[]{28, 29, -1, 26, 25, 27, 30, 230, -1, -1}, new int[]{95, 98, -1, 96, 229, 97, 100, -1, 157, -1}, new int[]{95, 98, 99, 96, 195, 97, 100, -1, -1, -1}, new int[]{167, 168, -1, 165, -1, 166, 169, -1, -1, -1}, new int[]{95, 98, -1, 96, 229, 97, 100, -1, 17, 134}, new int[]{95, 92, -1, 90, 229, 91, 93, 90, -1, -1}, new int[]{94, 98, 99, 96, 195, 97, 100, -1, -1, -1}, new int[]{88, 207, -1, 205, 89, 206, 208, -1, -1, -1}, new int[]{88, 98, -1, 96, 2, 97, 100, 2, 1, -1}, new int[]{152, 120, -1, 118, 121, 119, 122, -1, -1, -1}, new int[]{95, 92, -1, 90, 231, 91, 93, 2, 1, -1}, new int[]{95, 98, -1, 96, 229, 97, 100, -1, 159, 158}, new int[]{103, 104, -1, 101, -1, 102, 105, 186, 185, -1}, new int[]{152, 223, -1, 222, 220, 221, 224, -1, -1, -1}, new int[]{177, 178, -1, 175, 0, 176, 179, -1, -1, -1}, new int[]{95, 145, -1, 142, 229, 144, 146, -1, 143, -1}, new int[]{95, 227, -1, 225, 229, 226, 227, 225, -1, -1}, new int[]{94, 98, 99, 96, 195, 97, 100, -1, -1, -1}, new int[]{59, 14, -1, 12, 15, 13, 16, -1, -1, -1}, new int[]{95, 227, -1, 225, -1, 226, 227, 2, -1, -1}, new int[]{152, 86, -1, 84, 194, 85, 87, -1, -1, -1}, new int[]{180, 183, -1, 181, -1, 182, 184, -1, -1, -1}, new int[]{209, 212, -1, 210, -1, 211, 213, 186, 185, -1}, new int[]{152, 163, -1, 160, 162, 161, 164, -1, 162, -1}, new int[]{59, 198, -1, 196, 195, 197, 199, -1, -1, -1}, new int[]{152, 223, -1, 222, 220, 221, 224, -1, -1, -1}, new int[]{95, 98, -1, 96, 229, 97, 100, -1, -1, -1}, new int[]{95, 42, -1, 39, 195, 41, 43, -1, -1, -1}, new int[]{95, 42, -1, 39, 195, 41, 43, -1, -1, -1}, new int[]{59, 149, -1, 147, 135, 148, 150, -1, -1, -1}, new int[]{94, 98, -1, 96, 229, 97, 100, -1, -1, -1}, new int[]{59, 67, -1, 65, 195, 66, 68, -1, -1, -1}, new int[]{63, 64, -1, 61, 62, 232, 69, -1, -1, -1}, new int[]{110, 111, -1, 107, -1, 108, 109, -1, -1, -1}, new int[]{50, 51, -1, 48, 47, 49, 52, -1, -1, -1}, new int[]{55, 56, -1, 53, 57, 54, 58, -1, -1, -1}, new int[]{152, 10, -1, 8, 194, 9, 11, -1, -1, -1}, new int[]{95, 92, -1, 90, 233, 91, 45, -1, -1, -1}, new int[]{95, 92, 234, 90, 44, 91, 93, -1, -1, -1}, new int[]{152, 81, -1, 79, 82, 80, 83, -1, -1, -1}, new int[]{152, 223, -1, 222, 220, 221, 224, -1, -1, -1}, new int[]{95, 98, 235, 96, 46, 97, 100, -1, -1, -1}, new int[]{95, 98, -1, 96, 236, 97, 100, 24, 1, -1}, new int[]{95, 98, 237, 96, 195, 97, 100, -1, -1, -1}, new int[]{95, 92, -1, 90, 195, 91, 93, -1, -1, -1}, new int[]{173, 172, -1, 170, 195, 171, 174, -1, -1, -1}, new int[]{95, 73, -1, 71, 70, 72, 74, -1, -1, -1}, new int[]{95, 73, -1, 71, 193, 72, 74, -1, -1, -1}, new int[]{59, 149, -1, 147, 238, 148, 150, -1, -1, -1}, new int[]{59, 149, -1, 147, 238, 148, 150, -1, -1, -1}, new int[]{59, 149, -1, 147, 238, 148, 150, -1, -1, -1}, new int[]{95, 42, 240, 39, 239, 41, 43, -1, -1, -1}, new int[]{59, 149, -1, 147, 238, 148, 150, -1, -1, -1}, new int[]{59, 149, -1, 147, 241, 148, 150, -1, -1, -1}, new int[]{152, 149, -1, 147, 151, 148, 150, -1, -1, -1}, new int[]{59, 149, -1, 147, 238, 148, 150, -1, -1, -1}, new int[]{59, 149, 242, 147, 195, 148, 150, -1, -1, -1}, new int[]{116, 115, -1, 112, 113, 114, 117, -1, -1, -1}, new int[]{152, 223, -1, 222, 220, 221, 224, -1, -1, -1}, new int[]{138, 139, -1, 139, 243, 137, 141, -1, -1, -1}, new int[]{131, 126, -1, 124, 123, 125, 132, -1, -1, -1}, new int[]{95, 98, -1, 96, 244, 97, 100, 31, -1, -1}, new int[]{95, 98, -1, 96, 245, 97, 100, -1, -1, -1}, new int[]{95, 98, 246, 96, 193, 97, 100, -1, -1, -1}, new int[]{28, 22, -1, 20, 19, 21, 23, -1, -1, -1}, new int[]{95, 129, -1, 127, 193, 128, 130, 127, -1, -1}, new int[]{152, 191, -1, 188, 187, 190, 192, -1, 189, -1}, new int[]{217, 216, 247, 214, 218, 215, 219, -1, 247, -1}, new int[]{35, 36, -1, 32, 33, 34, 37, 33, -1, -1}, new int[]{249, -1, 250, 40, -1, 251, 248, 40, 248, -1}, new int[]{252, -1, 252, -1, -1, 253, 252, -1, 252, -1}, new int[]{95, 92, -1, 90, 195, 91, 45, -1, -1, -1}, new int[]{}, new int[]{}, new int[]{}, new int[]{35, 36, 269, 266, 33, 268, 37, 267, -1, -1}, new int[]{95, 98, 99, 254, 195, 97, 100, 255, -1, -1}, new int[]{94, 98, 99, 256, 195, 97, 100, -1, -1, -1}, new int[]{95, 98, 99, 257, 195, 97, 100, -1, -1, -1}, new int[]{95, 98, 99, 258, 195, 97, 100, 259, -1, -1}, new int[]{95, 98, 99, 260, 195, 97, 100, -1, -1, -1}, new int[]{95, 98, 99, 261, 195, 97, 100, -1, -1, -1}, new int[]{95, 145, 264, 262, 229, 263, 265, -1, 143, -1}};
        field_E = "Team chat off";
        field_L = "Friends";
    }
}
