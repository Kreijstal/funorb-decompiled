/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends tj implements he {
    static String field_P;
    private int field_J;
    String field_I;
    private boolean field_F;
    static wk field_M;
    ka field_K;
    private fw field_E;
    boolean field_H;
    pp field_O;
    private fw field_N;
    private int field_G;
    ai field_Q;

    public static void a(int param0) {
        field_M = null;
        if (param0 != -11835) {
            return;
        }
        field_P = null;
    }

    private final void a(boolean param0, String param1) {
        if (!(null != ((gh) this).field_O.field_W)) {
            return;
        }
        int var3_int = this.a(0, param1.toLowerCase());
        if (!(var3_int != -1)) {
            return;
        }
        try {
            ((gh) this).field_O.field_T = var3_int;
            this.n(107805154);
            ((gh) this).field_I = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "gh.O(" + 1 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((gh) this).field_J = -22;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((gh) this).field_F) {
              break L2;
            } else {
              if (!super.a(false)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param3, param4, param1, 8192, param0);
        int var6 = 2 % ((-8 - param2) / 44);
        ((gh) this).field_E.a(0, param4 + -20, 0, 8192, ((gh) this).field_J);
        ((gh) this).field_N.a(param4 - 20, 20, 0, 8192, ((gh) this).field_J);
        if (((gh) this).field_H) {
            ((gh) this).field_Q.a(0, param4, ((gh) this).field_J, 8192, param0 + -((gh) this).field_J);
        }
    }

    final boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            param1.f(1);
            if (param0 == 11) {
              L1: {
                ((gh) this).field_I = "";
                ((gh) this).field_F = true;
                if (null == ((gh) this).field_x) {
                  break L1;
                } else {
                  if (!(((gh) this).field_x instanceof ie)) {
                    break L1;
                  } else {
                    ((ie) (Object) ((gh) this).field_x).a((kb) this, ((gh) this).field_F, (byte) -41);
                    break L1;
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("gh.M(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final void g(byte param0) {
        if (!(!(((gh) this).field_x instanceof rp))) {
            ((rp) (Object) ((gh) this).field_x).a(-109, (gh) this);
        }
        if (param0 <= 4) {
            gh.a(-40);
        }
    }

    final boolean l(int param0) {
        if (param0 != 11180) {
            Object var3 = null;
            ((gh) this).a(-2, 83, 58, (kb) null);
        }
        return ((gh) this).field_H;
    }

    gh(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (kh) null);
        ((gh) this).field_I = "";
        ((gh) this).field_K = ArmiesOfGielinor.field_J;
        try {
            ((gh) this).field_O = new pp((gh) this, ((gh) this).field_K, param0, param1);
            ((gh) this).field_H = false;
            ((gh) this).field_O.field_x = (qo) this;
            ((gh) this).field_G = param2;
            ((gh) this).field_E = new fw("", (kh) (Object) new fk((gh) this), (qo) this);
            ((gh) this).field_N = new fw();
            ((gh) this).field_N.field_k = (kh) (Object) new gs();
            ((gh) this).field_N.field_x = (qo) this;
            ((gh) this).a((byte) 10, (kb) (Object) ((gh) this).field_E);
            ((gh) this).a((byte) 10, (kb) (Object) ((gh) this).field_N);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "gh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void k(int param0) {
        if (!(((gh) this).l(11180))) {
            return;
        }
        this.a(((gh) this).field_J, ((gh) this).field_p, (byte) -97, ((gh) this).field_B, ((gh) this).field_l);
        if (param0 >= -66) {
            Object var3 = null;
            int discarded$0 = this.a(-114, (String) null);
        }
        ((gh) this).field_H = false;
        ((gh) this).field_Q.d(124);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
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
              if (param1 == 11) {
                break L1;
              } else {
                ((gh) this).field_K = null;
                break L1;
              }
            }
            L2: {
              if (((gh) this).l(11180)) {
                this.k(-128);
                break L2;
              } else {
                this.m(param1 + -11);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("gh.N(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        try {
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "gh.P(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param3 > 103) {
                break L1;
              } else {
                ((gh) this).f(-3);
                break L1;
              }
            }
            stackOut_2_0 = super.a(param0, param1, param2, 107, param4, param5, param6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("gh.NA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0;
    }

    final static void f() {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!as.field_B) {
                L2: {
                  if (null == gu.field_b) {
                    int discarded$5 = 4;
                    int discarded$6 = -1;
                    gu.field_b = jc.b();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (gu.field_b.field_m) {
                    var18 = ei.field_e;
                    var14 = var18;
                    var12 = var14;
                    var10 = var12;
                    var5 = var10;
                    var1_array = var5;
                    var19 = gu.field_b.field_l;
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= 8) {
                        var20 = i.field_Nb;
                        var16 = var20;
                        var13 = var16;
                        var11 = var13;
                        var7 = var11;
                        var1_array = var7;
                        var21 = gu.field_b.field_l;
                        var9 = 0;
                        var3 = var9;
                        L5: while (true) {
                          if (var9 >= 8) {
                            gu.field_b = null;
                            as.field_B = true;
                            jd.m(77);
                            int discarded$7 = 1;
                            if (rb.a(0, ei.field_e)) {
                              rt.d((byte) 125);
                              break L3;
                            } else {
                              break L3;
                            }
                          } else {
                            var7[var9] = rn.a(var20[var9], ~var21[var9]);
                            var9++;
                            continue L5;
                          }
                        }
                      } else {
                        var5[var3] = oe.c(var18[var3], var19[var3]);
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (!as.field_B) {
                  break L1;
                } else {
                  qj.h(-78);
                  int discarded$8 = 1;
                  ws.b();
                  if (tg.field_a != 9) {
                    break L1;
                  } else {
                    if (io.a(i.field_Nb, (byte) 116)) {
                      break L1;
                    } else {
                      tg.field_a = 0;
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (im.field_w) {
                break L6;
              } else {
                if (de.field_a) {
                  break L6;
                } else {
                  vl.field_n.h(32161, 69);
                  de.field_a = true;
                  break L6;
                }
              }
            }
            L7: {
              if (ve.field_b) {
                break L7;
              } else {
                if (af.field_c) {
                  break L7;
                } else {
                  vl.field_n.h(32161, 75);
                  af.field_c = true;
                  break L7;
                }
              }
            }
            L8: {
              var1_int = -59;
              if (sh.field_h) {
                break L8;
              } else {
                L9: {
                  if (null != jr.field_f) {
                    break L9;
                  } else {
                    jr.field_f = fq.a(14663, 6);
                    break L9;
                  }
                }
                if (!jr.field_f.field_n) {
                  break L8;
                } else {
                  L10: {
                    if (null == jr.field_f.field_s) {
                      break L10;
                    } else {
                      int discarded$9 = 1;
                      oe.a(jr.field_f.field_s);
                      break L10;
                    }
                  }
                  L11: {
                    if (ps.field_v) {
                      rj.a(1);
                      break L11;
                    } else {
                      L12: {
                        ek.field_d = wp.field_E >> 2 & 3;
                        if ((wp.field_E & 1) == 0) {
                          stackOut_36_0 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          break L12;
                        } else {
                          stackOut_35_0 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          break L12;
                        }
                      }
                      L13: {
                        cu.field_a = stackIn_37_0 != 0;
                        if ((2 & wp.field_E) == 0) {
                          stackOut_39_0 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          break L13;
                        } else {
                          stackOut_38_0 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          break L13;
                        }
                      }
                      uc.field_a = stackIn_40_0 != 0;
                      if (3 > ek.field_d) {
                        break L11;
                      } else {
                        ek.field_d = 0;
                        break L11;
                      }
                    }
                  }
                  sh.field_h = true;
                  break L8;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "gh.E(" + -67 + 41);
        }
    }

    final int a(byte param0) {
        if (param0 != 71) {
            return -94;
        }
        return ((gh) this).field_O.field_T;
    }

    private final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (!((gh) this).l(11180)) {
            break L0;
          } else {
            if (((gh) this).field_O.field_T == -1) {
              break L0;
            } else {
              if (null == ((gh) this).field_O.field_W) {
                break L0;
              } else {
                if (null != ((gh) this).field_Q.field_K) {
                  var2 = ((gh) this).field_Q.field_S.field_w;
                  var3 = ((gh) this).field_O.field_Z;
                  var4 = ((gh) this).field_O.field_w + -var2;
                  if (var4 <= 0) {
                    return;
                  } else {
                    var5 = var3 * ((gh) this).field_O.field_T;
                    var6 = var5 + ((gh) this).field_Q.field_S.field_E.field_p;
                    var7 = var2 >> 2;
                    if (param0 == 107805154) {
                      L1: {
                        if (var6 >= var7) {
                          break L1;
                        } else {
                          L2: {
                            var8 = -(-var5 + var7 << 16) / var4;
                            if (var8 >= 0) {
                              break L2;
                            } else {
                              var8 = 0;
                              break L2;
                            }
                          }
                          ((gh) this).field_Q.field_K.field_W = var8;
                          break L1;
                        }
                      }
                      L3: {
                        var7 = -var3 + (3 * var2 >> 2);
                        if (var7 < var6) {
                          L4: {
                            var8 = -(var7 - var5 << 16) / var4;
                            if (var8 > 65536) {
                              var8 = 65536;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((gh) this).field_Q.field_K.field_W = var8;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        Object var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_58_0 = 0;
        boolean stackIn_60_0 = false;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_57_0 = 0;
        boolean stackOut_59_0 = false;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!((gh) this).a(false)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (((gh) this).field_O.field_W != null) {
                  L2: {
                    var5_int = ((gh) this).field_O.field_W.length;
                    if (param1 == 99) {
                      break L2;
                    } else {
                      if (param1 == 98) {
                        break L2;
                      } else {
                        L3: {
                          if (param1 == 105) {
                            break L3;
                          } else {
                            if (param1 == 104) {
                              break L3;
                            } else {
                              if (param1 != 84) {
                                if (param1 != 85) {
                                  if (32 > param2) {
                                    break L1;
                                  } else {
                                    if (param2 >= 128) {
                                      break L1;
                                    } else {
                                      var6 = ((gh) this).field_I + param2;
                                      this.a(true, var6);
                                      stackOut_51_0 = 1;
                                      stackIn_52_0 = stackOut_51_0;
                                      return stackIn_52_0 != 0;
                                    }
                                  }
                                } else {
                                  var6_int = ((gh) this).field_I.length();
                                  if (var6_int <= 0) {
                                    stackOut_47_0 = 1;
                                    stackIn_48_0 = stackOut_47_0;
                                    return stackIn_48_0 != 0;
                                  } else {
                                    ((gh) this).field_I = ((gh) this).field_I.substring(0, var6_int - 1);
                                    return true;
                                  }
                                }
                              } else {
                                L4: {
                                  if (!((gh) this).field_H) {
                                    this.m(0);
                                    break L4;
                                  } else {
                                    this.k(-116);
                                    break L4;
                                  }
                                }
                                stackOut_42_0 = 1;
                                stackIn_43_0 = stackOut_42_0;
                                return stackIn_43_0 != 0;
                              }
                            }
                          }
                        }
                        L5: {
                          if (((gh) this).l(param3 + 23395)) {
                            break L5;
                          } else {
                            this.m(0);
                            break L5;
                          }
                        }
                        L6: {
                          var6_int = ((gh) this).field_Q.field_S.field_w / ((gh) this).field_O.field_Z;
                          if (105 != param1) {
                            ((gh) this).field_O.field_T = ((gh) this).field_O.field_T - var6_int;
                            break L6;
                          } else {
                            ((gh) this).field_O.field_T = ((gh) this).field_O.field_T + var6_int;
                            break L6;
                          }
                        }
                        L7: {
                          if (0 > ((gh) this).field_O.field_T) {
                            ((gh) this).field_O.field_T = 0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (var5_int > ((gh) this).field_O.field_T) {
                            break L8;
                          } else {
                            ((gh) this).field_O.field_T = -1 + var5_int;
                            break L8;
                          }
                        }
                        this.n(param3 ^ -107796053);
                        stackOut_36_0 = 1;
                        stackIn_37_0 = stackOut_36_0;
                        return stackIn_37_0 != 0;
                      }
                    }
                  }
                  L9: {
                    if (((gh) this).l(11180)) {
                      break L9;
                    } else {
                      this.m(0);
                      break L9;
                    }
                  }
                  L10: {
                    if (param1 != 99) {
                      ((gh) this).field_O.field_T = ((gh) this).field_O.field_T - 1;
                      break L10;
                    } else {
                      ((gh) this).field_O.field_T = ((gh) this).field_O.field_T + 1;
                      break L10;
                    }
                  }
                  L11: {
                    if (((gh) this).field_O.field_T < 0) {
                      ((gh) this).field_O.field_T = 0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (~((gh) this).field_O.field_T <= ~var5_int) {
                      ((gh) this).field_O.field_T = var5_int - 1;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  this.n(107805154);
                  stackOut_21_0 = 1;
                  stackIn_22_0 = stackOut_21_0;
                  return stackIn_22_0 != 0;
                } else {
                  break L1;
                }
              }
              L13: {
                if (param3 == -12215) {
                  break L13;
                } else {
                  var8 = null;
                  boolean discarded$1 = ((gh) this).a((kb) null, -8, 'd', 65);
                  break L13;
                }
              }
              if (param1 == 80) {
                this.k(param3 + 12094);
                stackOut_57_0 = 0;
                stackIn_58_0 = stackOut_57_0;
                return stackIn_58_0 != 0;
              } else {
                stackOut_59_0 = super.a(param0, param1, param2, -12215);
                stackIn_60_0 = stackOut_59_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5;
            stackOut_61_1 = new StringBuilder().append("gh.F(");
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L14;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L14;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_60_0;
    }

    private final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param1 = param1.toLowerCase();
            var3_int = param0;
            L1: while (true) {
              if (((gh) this).field_O.field_W.length <= var3_int) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var4 = ((gh) this).field_O.field_W[var3_int].toString().toLowerCase();
                if (var4.startsWith(param1)) {
                  stackOut_5_0 = var3_int;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                } else {
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("gh.K(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final String h(int param0) {
        if (((gh) this).field_t) {
          if (param0 == 21384) {
            L0: {
              if (!((gh) this).l(11180)) {
                break L0;
              } else {
                if (!((gh) this).field_Q.field_t) {
                  break L0;
                } else {
                  if (-1 != ((gh) this).field_O.field_O) {
                    return ((gh) this).field_O.field_W[((gh) this).field_O.field_O].toString();
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (((gh) this).field_O.j(-6508) != null) {
              return ((gh) this).field_O.j(-6508).toString();
            } else {
              return super.h(param0);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ka param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, nr param12, int param13, nr param14, int param15, int param16, int param17, nr param18, ka param19) {
        RuntimeException var20 = null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            uk.field_s = param4;
            ej.field_G = param19;
            kq.a(param3, param17, (byte) 87, param10, param2);
            cv.a((byte) 123, param18, param5, param16);
            int discarded$2 = 8;
            int discarded$3 = -3;
            op.a(2, 8, param12, param14);
            g.a((byte) -85, 320, 240);
            mi.a(16777215, 128, 255, 3815);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var20 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var20;
            stackOut_4_1 = new StringBuilder().append("gh.A(").append(128).append(44).append(8).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param5).append(44).append(8).append(44).append(2).append(44).append(16777215).append(44).append(240).append(44).append(param10).append(44).append(-99).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param12 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(255).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param14 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(320).append(44).append(param16).append(44).append(param17).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param18 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param19 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    private final void m(int param0) {
        int var2 = ((gh) this).field_O.a((byte) -126);
        int var3 = var2;
        int var4 = 0;
        if (((gh) this).field_G < var3) {
            var3 = ((gh) this).field_G;
            var4 = 1;
        }
        this.a(var3 + ((gh) this).field_J, ((gh) this).field_p, (byte) 50, ((gh) this).field_B, ((gh) this).field_l);
        ((gh) this).field_O.a(0, ((gh) this).field_l, param0, param0 ^ 8192, var2);
        ((gh) this).field_Q = new ai(0, 0, 0, 0, (kh) (Object) new fc(), (kb) (Object) ((gh) this).field_O, (kh) null);
        if (var4 != 0) {
            ((gh) this).field_Q.a((byte) 118, true, lw.n(param0));
        }
        ((gh) this).field_Q.a(0, ((gh) this).field_l, ((gh) this).field_J, param0 + 8192, ((gh) this).field_w - ((gh) this).field_J);
        ((gh) this).field_H = true;
        ((gh) this).a((byte) 10, (kb) (Object) ((gh) this).field_Q);
        this.n(107805154);
    }

    final void f(int param0) {
        ((gh) this).field_F = false;
        super.f(param0);
        if (param0 != 1) {
            ((gh) this).field_G = -4;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((gh) this).field_J = param4;
        if (param3 != 8192) {
            Object var7 = null;
            int discarded$0 = this.a(20, (String) null);
        }
        this.a(param4, param2, (byte) 107, param0, param1);
    }

    static {
    }
}
