/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fj extends rl implements ij {
    static int[] field_lb;
    private boolean field_jb;
    private boolean field_kb;
    private boolean field_gb;
    private we field_fb;
    private cc field_mb;
    static String field_hb;
    private boolean field_ib;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param5 >= param2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 > 1 + param5) {
                L1: {
                  if (param0 <= param5 - -5) {
                    break L1;
                  } else {
                    if (param4 != param3) {
                      var7_int = (param4 >> 811497217) + (param3 >> -709459775) + (param3 & param4 & 1);
                      var8 = param5;
                      var9 = param4;
                      var10 = param3;
                      var11 = param5;
                      L2: while (true) {
                        if (var11 >= param0) {
                          fj.a(var8, param1 + 0, param2, var9, param4, param5, param6);
                          fj.a(param0, param1, param2, param3, var10, var8, param6);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = ac.field_I[var11];
                            if (param6) {
                              stackIn_24_0 = on.field_e[var12];
                              break L3;
                            } else {
                              stackIn_24_0 = hm.field_A[var12];
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_24_0;
                            if (var7_int < var13) {
                              ac.field_I[var11] = ac.field_I[var8];
                              incrementValue$0 = var8;
                              var8++;
                              ac.field_I[incrementValue$0] = var12;
                              if (var9 > var13) {
                                var9 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              if (var10 < var13) {
                                var10 = var13;
                                break L4;
                              } else {
                                var11++;
                                continue L2;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = param0 - 1;
                L5: while (true) {
                  if (param5 >= var7_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param5;
                    L6: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = ac.field_I[var8];
                          var10 = ac.field_I[1 + var8];
                          if (eg.a(param6, var9, (byte) 98, var10)) {
                            ac.field_I[var8] = var10;
                            ac.field_I[1 + var8] = var9;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
                      }
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
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var7), "fj.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    fj(sd param0, cc param1, String param2, boolean param3, boolean param4) {
        super(param0, new rh((fj) null, param1, param2), 77, 10, 10);
        try {
            this.field_kb = false;
            this.field_jb = param4 ? true : false;
            this.field_mb = param1;
            this.field_gb = false;
            this.field_ib = param3 ? true : false;
            this.field_fb = new we(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_fb.field_F = true;
            this.c((byte) -14, this.field_fb);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != param1) {
              stackIn_4_0 = super.a(param0, 13, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.h((byte) 85);
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("fj.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static aa a(cr param0, cr param1, ud param2, int param3, cr param4) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        aa stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        aa[] var11 = null;
        int var12 = 0;
        ud var13_ref_ud = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        q var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        var17 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param2.field_C == null) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = param2.field_C.length;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null != param2.field_z) {
                  stackIn_10_0 = param2.field_z.length;
                  break L2;
                } else {
                  stackIn_10_0 = 0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var6 + var5_int;
                var8 = new String[var7];
                var21 = new char[var7];
                var19 = var21;
                var9 = var19;
                var20 = new int[var7];
                var18 = var20;
                var10 = var18;
                var11 = new aa[var7];
                if (null == param2.field_C) {
                  break L3;
                } else {
                  var12 = 0;
                  L4: while (true) {
                    if (var12 >= param2.field_C.length) {
                      break L3;
                    } else {
                      var13_ref_ud = ni.field_d.a(param2.field_C[var12], true);
                      var8[var12] = var13_ref_ud.field_D;
                      var9[var12] = param2.field_v[var12];
                      var11[var12] = fj.a(param0, param1, var13_ref_ud, 10, param4);
                      var12++;
                      continue L4;
                    }
                  }
                }
              }
              L5: {
                if (param3 == 10) {
                  break L5;
                } else {
                  fj.a(118, 81, -122, 27, -116, -20, false);
                  break L5;
                }
              }
              L6: {
                if (null == param2.field_z) {
                  break L6;
                } else {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L7: while (true) {
                    if (param2.field_z.length <= var14) {
                      break L6;
                    } else {
                      L8: {
                        var15 = param2.field_z[var14];
                        if (var15 == -1) {
                          var8[var14 + var12] = br.field_W;
                          var9[var12 + var14] = param2.field_u[var14];
                          var10[var12 + var14] = param2.field_z[var14];
                          break L8;
                        } else {
                          L9: {
                            var16 = wm.field_k.a(1, var15);
                            var8[var14 + var12] = var16.h(tk.a(param3, 43));
                            var9[var12 - -var14] = param2.field_u[var14];
                            if (var9[var12 - -var14] <= 0) {
                              var13 = (char)(var13 + 1);
                              var9[var14 + var12] = (char)var13;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10[var14 + var12] = param2.field_z[var14];
                          break L8;
                        }
                      }
                      var14++;
                      continue L7;
                    }
                  }
                }
              }
              stackIn_27_0 = new aa(0L, param0, param4, param1, var11, var20, var8, var21);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("fj.TA(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L13;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L13;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_31_0), stackIn_40_2 + ')');
        }
        return stackIn_27_0;
    }

    final void h(byte param0) {
        if (param0 < 55) {
            fj.g((byte) 127);
        }
        if (!(this.field_I)) {
            return;
        }
        this.field_I = false;
        if (this.field_ib) {
            sm.k(-14284);
        } else {
            if (this.field_jb) {
                sg.a(3);
            }
        }
    }

    final void m(int param0) {
        this.field_fb.b(param0, -113, 4210752);
        rh var2 = new rh((fj) (this), this.field_mb, qk.field_H);
        var2.a(gb.field_a, 15, -102);
        this.a(false, var2);
    }

    public void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              var6_int = 0 % ((param2 - -63) / 51);
              if (!this.field_kb) {
                gg.a("tochangedisplayname.ws", true, ob.e((byte) 77));
                break L1;
              } else {
                rh.b(-14, 3);
                this.h((byte) 93);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("fj.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void n(int param0) {
        int var1 = 106 / ((param0 - -20) / 39);
        field_lb = null;
        field_hb = null;
    }

    final void a(int param0, boolean param1, String param2) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        rh stackIn_15_0 = null;
        rh stackIn_16_0 = null;
        String stackIn_16_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rh var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rh var6 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.field_gb) {
              L1: {
                stackIn_5_0 = this;

                if (!param1) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 1;
                  break L1;
                }
              }
              L2: {
                ((fj) (this)).field_gb = stackIn_6_1 != 0;
                stackIn_8_0 = this;

                if (-257 != (param0 ^ -1)) {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 1;
                  break L2;
                }
              }
              L3: {
                ((fj) (this)).field_kb = stackIn_9_1 != 0;
                this.field_fb.b(8405024, -117, 4210752);
                var6 = new rh((fj) (this), this.field_mb, param2);
                var4 = var6;
                if (5 != param0) {
                  if (256 != param0) {
                    L4: {
                      stackIn_15_0 = (rh) (var6);

                      if (this.field_ib) {
                        stackIn_16_0 = (rh) ((Object) stackIn_15_0);
                        stackIn_16_1 = bk.field_d;
                        break L4;
                      } else {
                        stackIn_16_0 = (rh) ((Object) stackIn_15_0);
                        stackIn_16_1 = ap.field_f;
                        break L4;
                      }
                    }
                    ((rh) (Object) stackIn_16_0).a(stackIn_16_1, -1, -60);
                    break L3;
                  } else {
                    var6.a(bk.field_d, (uf) (this), -109);
                    break L3;
                  }
                } else {
                  var6.a(jb.field_A, 11, -66);
                  var6.a(jd.field_b, 17, -60);
                  break L3;
                }
              }
              L5: {
                if (3 != param0) {
                  if (param0 != 4) {
                    if (6 == param0) {
                      var6.a(hm.field_H, 9, -90);
                      break L5;
                    } else {
                      if ((param0 ^ -1) != -10) {
                        break L5;
                      } else {
                        var6.a(s.field_v, (uf) (this), -126);
                        break L5;
                      }
                    }
                  } else {
                    var6.a(so.field_z, 8, -58);
                    break L5;
                  }
                } else {
                  var6.a(hb.field_o, 7, -82);
                  break L5;
                }
              }
              this.a(false, var6);
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
            var4_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4_ref);

            stackIn_29_1 = new StringBuilder().append("fj.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void g(byte param0) {
        km.a(af.field_H, true, true, mk.field_S);
        int var1 = 68 % ((-79 - param0) / 44);
        bf.field_a = true;
    }

    static {
        field_hb = "Mouse over an icon for details";
    }
}
