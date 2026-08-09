/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends tj implements mf, he {
    static me field_G;
    private ma field_P;
    static int field_E;
    kv field_M;
    static String field_K;
    private fw field_L;
    static String field_I;
    static int field_F;
    private fw field_O;
    static String field_N;
    static int[] field_J;

    public na() {
        super(0, 0, 496, 0, (kh) null);
        this.field_P = new ma("", (qo) null, 12);
        lk var1 = new lk(gl.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, ArmiesOfGielinor.field_J.field_H, -1, 2147483647, true);
        kb var2 = new kb(iu.field_u, var1, (qo) null);
        this.field_O = new fw(ul.field_f, (qo) null);
        this.field_L = new fw(ac.field_s, (qo) null);
        this.field_P.field_s = ms.field_m;
        this.field_P.a((byte) 16, new uj(this.field_P));
        this.field_O.field_I = false;
        this.field_O.field_k = (kh) ((Object) new nu());
        this.field_L.field_k = (kh) ((Object) new td());
        this.field_P.field_k = (kh) ((Object) new lu(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, 270, var3, 8192, 50);
        var3 += 50;
        this.a((byte) 10, var2);
        var3 = var3 + (5 + this.a(-124, fq.field_k, dn.field_Ob, 170, var3, this.field_P));
        this.field_O.a(496 - var5 >> 1706931905, var5, var3, 8192, 40);
        this.field_L.a(var4 + 3, 60, var3 + 15, 8192, 40);
        this.field_L.field_x = (qo) (this);
        this.field_O.field_x = (qo) (this);
        this.a((byte) 10, (kb) (this.field_O));
        this.a((byte) 10, (kb) (this.field_L));
        this.field_M = new kv((mf) (this));
        this.field_M.a(60 + (this.field_P.field_B + this.field_P.field_l), -60 + (-this.field_P.field_B + (this.field_l + -this.field_P.field_l)), 20, 8192, 150);
        this.a((byte) 10, (kb) (this.field_M));
        this.a(0, 496, 0, 8192, var4 + var3 + 55);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 11) {
                break L1;
              } else {
                this.field_L = (fw) null;
                break L1;
              }
            }
            if (param4 == this.field_L) {
              ou.b((byte) 115);
              return;
            } else {
              if (param4 != this.field_O) {
                break L0;
              } else {
                this.b(false);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("na.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public final void a(byte param0) {
        int discarded$0 = 0;
        ((uj) ((Object) this.field_P.a(param0 + -918933514))).g(50);
        if (param0 != -116) {
            String var3 = (String) null;
            discarded$0 = this.a(-47, 45, (String) null, (kb) null, 47, (String) null, -7);
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        try {
            super.a(param0 ^ 0, param1, param2, param3);
            if (param0 != 32722) {
                this.field_O = (fw) null;
            }
            this.field_O.field_I = this.a(-29967);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "na.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(boolean param0, eg param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        gu var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
                L1: {
                  var4 = var3.a(false);
                  if (var4 != oo.field_g) {
                    stackIn_10_0 = 0;
                    break L1;
                  } else {
                    stackIn_10_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("na.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    private final boolean a(int param0) {
        if (param0 != -29967) {
            return false;
        }
        if (!this.a(true, (eg) (this.field_P))) {
            return false;
        }
        return true;
    }

    private final void b(boolean param0) {
        if (param0) {
            return;
        }
        if (!this.a(-29967)) {
            return;
        }
        q.a(param0, this.field_P.field_v);
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param1 + param0;
              var6 = param3 + param4;
              if (param1 > qn.field_j) {
                stackIn_4_0 = param1;
                break L1;
              } else {
                stackIn_4_0 = qn.field_j;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (qn.field_a < param4) {
                stackIn_7_0 = param4;
                break L2;
              } else {
                stackIn_7_0 = qn.field_a;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int >= qn.field_e) {
                stackIn_10_0 = qn.field_e;
                break L3;
              } else {
                stackIn_10_0 = var5_int;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 >= qn.field_f) {
                stackIn_13_0 = qn.field_f;
                break L4;
              } else {
                stackIn_13_0 = var6;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (param1 < qn.field_j) {
                break L5;
              } else {
                if (param1 < qn.field_e) {
                  var11 = var8 * qn.field_l + param1;
                  var12 = 1 + var10 + -var8 >> -621278815;
                  L6: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L5;
                    } else {
                      qn.field_d[var11] = 16777215;
                      var11 = var11 + 2 * qn.field_l;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (qn.field_a > param4) {
                break L7;
              } else {
                if (qn.field_f > var6) {
                  var11 = qn.field_l * param4 + var7;
                  var12 = -var7 + var9 + 1 >> 1874126561;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      qn.field_d[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L9: {
              var11 = 72 / ((param2 - 79) / 37);
              if (qn.field_j > var5_int) {
                break L9;
              } else {
                if (qn.field_e > var5_int) {
                  var12 = var5_int + qn.field_l * ((1 & var5_int - param1) + var8);
                  var13 = 1 - -var10 + -var8 >> 676038305;
                  L10: while (true) {
                    var13--;
                    if (-1 < (var13 ^ -1)) {
                      break L9;
                    } else {
                      qn.field_d[var12] = 16777215;
                      var12 = var12 + 2 * qn.field_l;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (qn.field_a > param4) {
                break L11;
              } else {
                if (var6 >= qn.field_f) {
                  break L11;
                } else {
                  var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                  var13 = 1 + var9 - var7 >> 1535936193;
                  L12: while (true) {
                    var13--;
                    if (0 > var13) {
                      break L11;
                    } else {
                      qn.field_d[var12] = 16777215;
                      var12 += 2;
                      continue L12;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "na.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(int param0, int param1, String param2, kb param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        pk var9 = null;
        ta var10 = null;
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
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var10 = new ta(20, param0, 120 - -param4, 25, param3, false, 120, 3, ArmiesOfGielinor.field_J, 16777215, param2);
            this.a((byte) 10, (kb) (var10));
            var9 = new pk(((eg) ((Object) param3)).a(-918933630), param5, 126, param0 + var10.field_w, param4 - -25, param1);
            var9.field_x = (qo) (this);
            this.a((byte) 10, (kb) (var9));
            if (param6 < -59) {
              stackIn_4_0 = var9.field_w + var10.field_w;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 6;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("na.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

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
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static nd a(dr[] param0, byte param1, nd[] param2, String param3) throws cb {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        nd stackIn_6_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5 = 5 / ((-46 - param1) / 37);
            var4_int = 0;
            L1: while (true) {
              if (param0.length <= var4_int) {
                var8 = new StringBuilder("The method " + param3 + "(");
                var7 = 0;
                var5 = var7;
                L2: while (true) {
                  if (param2.length <= var7) {
                    discarded$0 = var8.append(") is undefined.");
                    throw new cb(var8.toString());
                  } else {
                    L3: {
                      if (!param2[var7].field_e) {
                        discarded$1 = var8.append(hw.a(640, param2[var7].field_c.getClass()));
                        break L3;
                      } else {
                        discarded$2 = var8.append(cq.a(param2[var7].field_c, (byte) -75).toString());
                        break L3;
                      }
                    }
                    L4: {
                      if (var7 < param2.length + -1) {
                        discarded$3 = var8.append(',');
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var7++;
                    continue L2;
                  }
                }
              } else {
                if (param0[var4_int].a(param3, (byte) 55, param2)) {
                  stackIn_6_0 = param0[var4_int].a(-24872, param2);
                  break L0;
                } else {
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("na.J(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void f(byte param0) {
        if (param0 != -117) {
          field_K = (String) null;
          field_J = null;
          field_K = null;
          field_N = null;
          field_I = null;
          field_G = null;
          return;
        } else {
          field_J = null;
          field_K = null;
          field_N = null;
          field_I = null;
          field_G = null;
          return;
        }
    }

    public final void a(int param0, String param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        kb var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_P;
            var4 = param1;
            ((fn) ((Object) var3)).a(false, var4, -27934);
            if (param0 == -1) {
              break L0;
            } else {
              var5 = (kb) null;
              this.a((kb) null, 40, '', 104);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("na.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static om a(bv param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        om var3 = null;
        om stackIn_2_0 = null;
        om stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 3) {
              var2_int = param0.i(1);
              param0.o(117);
              var3 = pf.a(var2_int, (byte) 6, param0);
              param0.n(-2);
              stackIn_4_0 = (om) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (om) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("na.O(");

            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(int param0, String param1, String param2, int param3, int param4, kb param5) {
        RuntimeException var7 = null;
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
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -55) {
              stackIn_4_0 = this.a(param4, 35, param1, param5, param3, param2, -67);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -123;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("na.G(").append(param0).append(',');

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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3 + 0)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) != -99) {
                L1: {
                  if (param3 == -12215) {
                    break L1;
                  } else {
                    field_F = -74;
                    break L1;
                  }
                }
                if ((param1 ^ -1) == -100) {
                  stackIn_12_0 = this.b((byte) -127, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.a(false, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("na.F(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    static {
        field_E = 4;
        field_K = "Remove <%0> from friend list";
        field_I = "Spells";
        field_N = "This item can only be used on other players' units.";
        field_J = new int[]{1, 1, 2, 1, 1, 1, 2, 2, 2, 2, 3, 2, 2, 2, 3, 5, 1, 1, 1, 2, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 5, 2, 2, 2, 2, 2, 2, 3, 5, 3, 3, 5, 2, 3, 5, 3, 3, 5, 2, 3, 5, 2, 3, 5};
        field_G = new me(1, 2, 2, 0);
    }
}
