/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends bw {
    boolean field_l;
    static boolean field_i;
    static sna field_q;
    int field_o;
    static pia field_h;
    aga field_s;
    static int field_g;
    eaa field_n;
    int field_k;
    int field_j;
    static int[] field_m;
    eaa field_t;
    int field_p;
    int field_r;
    lna field_f;

    final float e(byte param0) {
        int var3 = BachelorFridge.field_y;
        gca var2 = (gca) ((Object) this.field_n.b((byte) 90));
        if (param0 != -121) {
            sna var4 = (sna) null;
            ad.a((sna) null, (jc) null, (sna) null, (sna) null, false);
        }
        while (var2 != null) {
            if (!(!(var2 instanceof c))) {
                return ((c) ((Object) var2)).field_j;
            }
            var2 = (gca) ((Object) this.field_n.c(0));
        }
        return 0.0f;
    }

    final void b(int param0, int param1) {
        this.field_f.a((byte) 28, this.field_s.field_o.field_b, param1);
        if (param0 != -1) {
            this.c((byte) 96);
        }
    }

    final void a(int param0, int param1, String param2) {
        try {
            if (param1 < 7) {
                String var5 = (String) null;
                this.a(-38, 92, (String) null);
            }
            this.field_t.a(new vca(taa.field_u, param2, param0, 4096, 20, 30, 50, (-8 + taa.field_u.field_F) * (-1 + this.field_t.g(0)) + 8), true);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ad.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(boolean param0) {
        field_m = null;
        field_h = null;
        if (param0) {
            ad.c(false);
        }
        field_q = null;
    }

    final static boolean a(int param0, int param1) {
        if (!(param1 >= 0)) {
            return 0 == (param1 + 1) % 4 ? true : false;
        }
        if (-1583 < (param1 ^ -1)) {
            return param1 % 4 == 0 ? true : false;
        }
        if (!(-1 == (param1 % 4 ^ -1))) {
            return false;
        }
        if (-1 != (param1 % 100 ^ -1)) {
            return true;
        }
        if (param0 != 30) {
            field_m = (int[]) null;
        }
        if (param1 % 400 == 0) {
            return true;
        }
        return false;
    }

    final static nv a(sna param0, jc param1, sna param2, sna param3, boolean param4) {
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        nv stackIn_27_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        nv[] var11 = null;
        int var12 = 0;
        jc var13_ref_jc = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        pda var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        var17 = BachelorFridge.field_y;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (null == param1.field_u) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = param1.field_u.length;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null != param1.field_q) {
                  stackIn_10_0 = param1.field_q.length;
                  break L2;
                } else {
                  stackIn_10_0 = 0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var5_int - -var6;
                var8 = new String[var7];
                var21 = new char[var7];
                var19 = var21;
                var9 = var19;
                if (!param4) {
                  break L3;
                } else {
                  field_g = -56;
                  break L3;
                }
              }
              L4: {
                var20 = new int[var7];
                var18 = var20;
                var10 = var18;
                var11 = new nv[var7];
                if (param1.field_u == null) {
                  break L4;
                } else {
                  var12 = 0;
                  L5: while (true) {
                    if (var12 >= param1.field_u.length) {
                      break L4;
                    } else {
                      var13_ref_jc = bga.field_l.a((byte) 105, param1.field_u[var12]);
                      var8[var12] = var13_ref_jc.field_s;
                      var9[var12] = param1.field_p[var12];
                      var11[var12] = ad.a(param0, var13_ref_jc, param2, param3, false);
                      var12++;
                      continue L5;
                    }
                  }
                }
              }
              L6: {
                if (null != param1.field_q) {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L7: while (true) {
                    if (param1.field_q.length <= var14) {
                      break L6;
                    } else {
                      L8: {
                        var15 = param1.field_q[var14];
                        if (0 != (var15 ^ -1)) {
                          L9: {
                            var16 = cea.field_h.a(-22834, var15);
                            var8[var14 + var12] = var16.d((byte) 74);
                            var9[var14 + var12] = param1.field_o[var14];
                            if (var9[var12 - -var14] > 0) {
                              break L9;
                            } else {
                              var13 = (char)(var13 + 1);
                              var9[var14 + var12] = (char)var13;
                              break L9;
                            }
                          }
                          var10[var14 + var12] = param1.field_q[var14];
                          break L8;
                        } else {
                          var8[var12 - -var14] = ci.field_p;
                          var9[var14 + var12] = param1.field_o[var14];
                          var10[var12 - -var14] = param1.field_q[var14];
                          break L8;
                        }
                      }
                      var14++;
                      continue L7;
                    }
                  }
                } else {
                  break L6;
                }
              }
              stackIn_27_0 = new nv(0L, param3, param0, param2, var11, var20, var8, var21);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("ad.E(");

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


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param3 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_31_0), stackIn_40_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nv) ((Object) stackIn_3_0);
        } else {
          return stackIn_27_0;
        }
    }

    final static boolean d(byte param0) {
        if (param0 < 7) {
            ad.a(54, -103);
        }
        return (ur.field_d ^ -1) < -251 ? true : false;
    }

    final void c(byte param0) {
        this.field_f = this.field_s.e((byte) -78);
        this.field_f.field_b = this.field_s.field_o.field_k.field_b;
        this.field_t = new eaa();
        this.field_n = new eaa();
        this.field_j = this.field_s.field_I;
        if (param0 >= -53) {
            this.a(124);
        }
        this.b(false);
    }

    final void b(boolean param0) {
        this.field_f.field_v = param0 ? true : false;
        this.field_f.field_i = false;
        if (this.field_s.field_y == 29 || -45 == (this.field_s.field_y ^ -1)) {
            this.field_f.a((byte) 92, this.field_s.field_o.field_b, 18);
            return;
        }
        if (!(35 != this.field_s.field_y)) {
            this.field_f.field_i = true;
        }
        if (this.field_s.field_y == 42) {
            this.field_f.field_v = true;
        }
        if ((this.field_s.field_I ^ -1) >= -1) {
            this.field_f.a((byte) 125, this.field_s.field_o.field_b, 6);
            this.field_f.field_u.a((byte) -69);
            return;
        }
        this.field_f.a((byte) 90, this.field_s.field_o.field_b, 0);
    }

    final void a(int param0) {
        int stackIn_20_0 = 0;
        int var3;
        gca var4;
        int var5;
        int var6;
        int var7;
        vca var8;
        var7 = BachelorFridge.field_y;
        var8 = (vca) ((Object) this.field_t.b((byte) 90));
        L0: while (true) {
          L1: {
            if (var8 == null) {
              break L1;
            } else {
              L2: {
                if (var8.b(false)) {
                  var8.a(false);
                  break L2;
                } else {
                  if (var8.c((byte) 127)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var8 = (vca) ((Object) this.field_t.c(0));
              continue L0;
            }
          }
          L3: {
            if (this.field_s.field_I < this.field_j) {
              this.field_j = this.field_j - 1;
              break L3;
            } else {
              if (this.field_s.field_I > this.field_j) {
                this.field_j = this.field_j + 1;
                break L3;
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (param0 >= 101) {
              break L4;
            } else {
              ad.c(true);
              break L4;
            }
          }
          var3 = 0;
          var4 = (gca) ((Object) this.field_n.b((byte) 90));
          L5: while (true) {
            if (var4 == null) {
              L6: {
                if (var3 != 0) {
                  break L6;
                } else {
                  if (this.field_s.field_y != 0) {
                    var4 = nba.a(this.field_s.field_y, false);
                    if (var4 == null) {
                      break L6;
                    } else {
                      this.field_n.a(var4, true);
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
              }
              return;
            } else {
              L7: {
                if ((this.field_s.field_y ^ -1) == (var4.field_h ^ -1)) {
                  stackIn_20_0 = 1;
                  break L7;
                } else {
                  stackIn_20_0 = 0;
                  break L7;
                }
              }
              L8: {
                var5 = stackIn_20_0;
                var6 = var4.a(false, var5 != 0) ? 1 : 0;
                if (var5 != 0) {
                  break L8;
                } else {
                  if (var6 == 0) {
                    var4.a(false);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              var4 = (gca) ((Object) this.field_n.c(0));
              var3 = var3 | var5;
              continue L5;
            }
          }
        }
    }

    ad(aga param0) {
        try {
            this.field_s = param0;
            this.c((byte) -126);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = false;
        field_m = new int[]{23, 23, 24, 26, 30};
    }
}
