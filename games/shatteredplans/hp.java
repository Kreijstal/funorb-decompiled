/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends me {
    static int[] field_k;
    static ub field_l;
    static fc field_m;
    static bc field_n;
    private int[] field_q;
    private int[] field_o;
    static int field_p;

    final int b(boolean param0) {
        if (param0) {
            hp.b((byte) -59);
        }
        return rs.field_Cb.field_J - -(this.field_o.length * cc.field_n);
    }

    final boolean a(dc param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        ln[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ln var5_ref_ln = null;
        int var6 = 0;
        ln[] var7 = null;
        int var8 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, (byte) 94)) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= this.field_i.length) {
                  var7 = param0.field_g.field_e;
                  var3 = var7;
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= var7.length) {
                      L3: {
                        if (param1 >= 23) {
                          break L3;
                        } else {
                          this.b(false);
                          break L3;
                        }
                      }
                      var3_int = 0;
                      L4: while (true) {
                        if (this.field_i.length <= var3_int) {
                          var3_int = 0;
                          var4 = 0;
                          var5 = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (this.field_o.length <= var5) {
                                  if (var3_int == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  stackIn_26_0 = -1;

                                  stackIn_26_1 = param0.field_w & 1 << var5 ^ -1;

                                  L8: {
                                    if (stackIn_26_0 == stackIn_26_1) {
                                      if (50 <= this.field_o[var5]) {
                                        if (this.field_o[var5] <= var4) {
                                          if (var4 == this.field_o[var5]) {
                                            var3_int++;
                                            break L8;
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          var4 = this.field_o[var5];
                                          var3_int = 1;
                                          break L8;
                                        }
                                      } else {
                                        var5++;
                                        continue L5;
                                      }
                                    } else {
                                      this.field_o[var5] = -1;
                                      break L8;
                                    }
                                  }
                                  var5++;
                                  continue L5;
                                }
                              }
                              this.field_g = new fs[var3_int];
                              var8 = 0;
                              var5 = var8;
                              L9: while (true) {
                                if (var8 >= this.field_i.length) {
                                  stackIn_47_0 = 1;
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                } else {
                                  L10: {
                                    if (this.field_o[var8] == var4) {
                                      var3_int--;
                                      this.field_g[var3_int] = this.field_i[var8];
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var8++;
                                  continue L9;
                                }
                              }
                            }
                            stackIn_39_0 = 0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          this.field_o[var3_int] = this.field_o[var3_int] + this.field_q[var3_int];
                          var3_int++;
                          continue L4;
                        }
                      }
                    } else {
                      var5_ref_ln = var7[var4];
                      if (2 == var5_ref_ln.field_L) {
                        L11: {
                          if (null != var5_ref_ln.field_y) {
                            this.field_q[var5_ref_ln.field_y.field_x] = this.field_q[var5_ref_ln.field_y.field_x] - var5_ref_ln.field_G[0];
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  this.field_q[var3_int] = 0;
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3_ref = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var3_ref);

            stackIn_50_1 = new StringBuilder().append("hp.F(");

            if (param0 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L12;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L12;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_39_0 != 0;
          } else {
            return stackIn_47_0 != 0;
          }
        }
    }

    hp(fs[] param0) {
        super(param0);
        try {
            this.field_o = new int[this.field_i.length];
            this.field_q = new int[this.field_i.length];
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "hp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, ob param1) {
        int var3_int = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            for (var3_int = 0; var3_int < this.field_o.length; var3_int++) {
                param1.c(this.field_o[var3_int], (byte) -92);
            }
            int var4 = -49 % ((-72 - param0) / 45);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "hp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fs[] b(int param0) {
        int var2;
        double var3;
        int var5_int;
        fs[] var5;
        int var6;
        double var6_double;
        double var7;
        int var9;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            field_m = (fc) null;
            break L0;
          }
        }
        if (null != this.field_g) {
          return this.field_g;
        } else {
          var2 = 0;
          var3 = 1.7976931348623157e+308;
          var5_int = 0;
          L1: while (true) {
            if (this.field_i.length <= var5_int) {
              if (var2 != 0) {
                var5 = new fs[var2];
                var6 = 0;
                L2: while (true) {
                  if (var6 >= this.field_i.length) {
                    return var5;
                  } else {
                    if (-1 != (this.field_q[var6] ^ -1)) {
                      var7 = (double)(50 + -this.field_o[var6]) / (double)this.field_q[var6];
                      if (var3 == var7) {
                        var2--;
                        var5[var2] = this.field_i[var6];
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new fs[]{};
              }
            } else {
              if (-1 != (this.field_q[var5_int] ^ -1)) {
                if (this.field_o[var5_int] != 0) {
                  var6_double = (double)(50 + -this.field_o[var5_int]) / (double)this.field_q[var5_int];
                  if (var6_double != var3) {
                    if (var3 > var6_double) {
                      var2 = 1;
                      var3 = var6_double;
                      var5_int++;
                      continue L1;
                    } else {
                      var5_int++;
                      continue L1;
                    }
                  } else {
                    var2++;
                    var5_int++;
                    continue L1;
                  }
                } else {
                  var5_int++;
                  continue L1;
                }
              } else {
                var5_int++;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                cr.field_d = param2;
                var3 = param1.getParameter("cookieprefix");
                var4 = param1.getParameter("cookiehost");
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (!(param2.length() != 0)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ll.a(param1, "document.cookie=\"" + var5 + "\"", (byte) 123);
                if (param0 <= 7) {
                    field_n = (bc) null;
                }
                h.a(-1, param1);
            } catch (RuntimeException runtimeException) {
                throw r.a((Throwable) ((Object) runtimeException), "hp.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_m = null;
        field_k = null;
        field_n = null;
        field_l = null;
        int var1 = 29 / ((param0 - 12) / 51);
    }

    final void a(ob param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (this.field_o.length <= var3_int) {
                L2: {
                  if (param1 == -109) {
                    break L2;
                  } else {
                    var5 = (String) null;
                    hp.a((byte) 83, (java.applet.Applet) null, (String) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                this.field_o[var3_int] = param0.g(-2852);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("hp.G(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, dc param1, kq param2) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int[] var6 = null;
        int var7_int = 0;
        fs[] var7 = null;
        int[] var8 = null;
        int var8_int = 0;
        int[] var9 = null;
        int var10_int = 0;
        fs[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        qk[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var24 = new int[this.field_i.length];
            var18 = var24;
            var16 = var18;
            var26 = var16;
            var20 = var26;
            var4 = var20;
            if (param0 <= -9) {
              var5 = 0;
              L1: while (true) {
                if (var24.length <= var5) {
                  var5 = 0;
                  var25 = this.field_o;
                  var19 = var25;
                  var17 = var19;
                  var6 = var17;
                  var7_int = 0;
                  L2: while (true) {
                    if (var7_int >= var25.length) {
                      L3: {
                        if (-1 > (var5 ^ -1)) {
                          lh.a((byte) 35, var4, (int[]) ((Object) this.field_o.clone()));
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var23 = new qk[]{new qk(0, 0, 182, rs.field_Cb.field_J, re.a(ShatteredPlansClient.field_J, 4371, new String[]{Integer.toString(50)}))};
                      var7 = new fs[this.field_i.length];
                      var28 = new int[this.field_i.length];
                      var22 = var28;
                      var8 = var22;
                      var27 = new int[this.field_i.length];
                      var21 = var27;
                      var9 = var21;
                      var10_int = 0;
                      L4: while (true) {
                        if (var10_int >= this.field_i.length) {
                          L5: {
                            L6: {
                              var10 = this.b(0);
                              if (null != this.field_g) {
                                break L6;
                              } else {
                                if (var10.length == 0) {
                                  break L6;
                                } else {
                                  var12 = var10[0].field_x;
                                  var13 = (double)(-this.field_o[var12] + 50) / (double)this.field_q[var12];
                                  var11 = (int)Math.ceil(var13);
                                  break L5;
                                }
                              }
                            }
                            var11 = 0;
                            break L5;
                          }
                          param2.a(50, var7, var27, var28, var10, var23, (byte) -47, var11);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var7[var10_int] = this.field_i[var26[var10_int]];
                          var8[var10_int] = this.field_o[var26[var10_int]];
                          var9[var10_int] = this.field_q[var26[var10_int]];
                          var10_int++;
                          continue L4;
                        }
                      }
                    } else {
                      var8_int = var25[var7_int];
                      var5 = var5 + var8_int;
                      var7_int++;
                      continue L2;
                    }
                  }
                } else {
                  var24[var5] = var5;
                  var5++;
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
          L7: {
            var4_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4_ref);

            stackIn_23_1 = new StringBuilder().append("hp.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_k = new int[]{800, 400, 200, 120, 80};
    }
}
