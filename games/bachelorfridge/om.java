/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends ana {
    static long field_v;
    private boolean field_y;
    private fna field_x;
    private ad[] field_z;
    private boolean field_w;

    final boolean c(byte param0) {
        int var2;
        int var4;
        ad var5;
        int var6;
        ad[] var7;
        int var8;
        ad[] var9;
        ad var10;
        ad var11;
        var6 = BachelorFridge.field_y;
        if (!this.field_m.a((byte) -106)) {
          if (!this.field_y) {
            L0: {
              if (this.field_w) {
                break L0;
              } else {
                this.field_w = true;
                aba.a((byte) -96, 60);
                break L0;
              }
            }
            var2 = 1;
            var7 = this.field_z;
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (var8 >= var7.length) {
                if (var2 == 0) {
                  return false;
                } else {
                  this.e(2147483647);
                  var2 = 108 % ((71 - param0) / 47);
                  return false;
                }
              } else {
                var11 = var7[var8];
                var5 = var11;
                var11.field_p = var11.field_p + 2;
                if (0 <= var11.field_p) {
                  var5.field_p = 0;
                  var8++;
                  continue L1;
                } else {
                  var2 = 0;
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L2: {
              if (!this.field_w) {
                this.field_w = true;
                aba.a((byte) 122, 60);
                break L2;
              } else {
                break L2;
              }
            }
            var2 = 1;
            var9 = this.field_z;
            var4 = 0;
            L3: while (true) {
              if (var4 >= var9.length) {
                if (var2 == 0) {
                  return false;
                } else {
                  this.d(0);
                  return true;
                }
              } else {
                var10 = var9[var4];
                var10.field_p = var10.field_p + 2;
                if (-257 < (var10.field_p ^ -1)) {
                  var2 = 0;
                  var4++;
                  continue L3;
                } else {
                  var10.field_p = 256;
                  var4++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    private final void d(int param0) {
        int var3 = 0;
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        ad[] var6 = this.field_z;
        ad[] var2 = var6;
        for (var3 = param0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_p = 0;
        }
    }

    om(gj param0, fna param1) {
        super(param0, param1);
        int var3_int = 0;
        cn var4 = null;
        int var5 = 0;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_w = false;
        try {
          L0: {
            this.field_x = param1;
            var3_int = this.field_x.field_o.g(0);
            this.field_z = new ad[var3_int];
            var4 = (cn) ((Object) this.field_x.field_o.b((byte) 90));
            var5 = 0;
            var7 = 0;
            var5 = var7;
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                this.field_z[var7] = var4.field_h.a(-27449, this.field_q);
                this.field_z[var7].field_p = -256;
                var4 = (cn) ((Object) this.field_x.field_o.c(0));
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("om.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
    }

    final static void a(gs param0, byte param1) {
        int stackIn_3_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        op var5 = null;
        ik var6 = null;
        String var7 = null;
        ik var8 = null;
        String var9 = null;
        ik var10 = null;
        String var11 = null;
        ik var12 = null;
        String var13 = null;
        ik var14 = null;
        try {
          L0: {
            L1: {
              if (1 == param0.field_p) {
                stackIn_3_0 = param0.field_d;
                break L1;
              } else {
                stackIn_3_0 = 0;
                break L1;
              }
            }
            L2: {
              mna.a(stackIn_3_0, (int[]) null, param0.field_a, param0.field_e, param0.field_g, param0.field_p, -113, (sga) null, param0.field_h);
              if (param0.field_p != 0) {
                break L2;
              } else {
                if (hs.a(-75)) {
                  break L2;
                } else {
                  if (pw.field_w != null) {
                    break L2;
                  } else {
                    if (rv.field_n == null) {
                      L3: {
                        if (!sea.field_j) {
                          var6 = ms.field_u;
                          var7 = or.field_j;
                          var6.field_a.a(var7, true, 14);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var8 = ms.field_u;
                      var9 = gea.field_f;
                      var8.field_a.a(var9, true, 20);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (param0.field_p != 1) {
                break L4;
              } else {
                if (hs.a(125)) {
                  break L4;
                } else {
                  if (null == pw.field_w) {
                    break L4;
                  } else {
                    if (param0.field_d == pw.field_w.f((byte) -106)) {
                      L5: {
                        if (!sea.field_j) {
                          var10 = ms.field_u;
                          var11 = ama.field_k;
                          var10.field_a.a(var11, true, 14);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var12 = ms.field_u;
                      var13 = ma.field_k;
                      var12.field_a.a(var13, true, 20);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            L6: {
              ms.field_u.b(true);
              ms.field_u.a(114, false);
              ms.field_u.a(param0.field_o, (byte) -127, param0.field_p);
              ms.field_u.a(21654);
              ms.field_u.a(-120, param0);
              var14 = ms.field_u;
              var3 = nfa.field_a;
              var4 = jc.field_r;
              var14.field_a.a(0, false, var3, 0, var4);
              if (param1 <= -43) {
                break L6;
              } else {
                var5 = (op) null;
                om.a(45, (byte) 61, 72, false, 85, (aga) null, 59, (op) null);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("om.B(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
    }

    private final void e(int param0) {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = this.field_x.field_l.a(107, this.field_q.field_h);
        if (var2.i(param0 + -2147483560)) {
            return;
        }
        if (param0 != 2147483647) {
            this.e(-47);
        }
        cn var3 = (cn) ((Object) this.field_x.field_o.b((byte) 90));
        while (var3 != null) {
            var4 = var3.field_h.a(param0 ^ -2147456200, this.field_q);
            var4.field_s.field_J = var3.field_m;
            var4.field_s.field_x = var3.field_l;
            this.field_q.b(var4, (ad) null, true);
            var3 = (cn) ((Object) this.field_x.field_o.c(0));
        }
        this.field_w = false;
        this.field_y = true;
    }

    final static gha b(boolean param0) {
        if (null == gk.field_e) {
            gk.field_e = new gha(oc.field_l, 20, 0, 0, 0, 11579568, -1, 0, 0, oc.field_l.field_u, -1, 2147483647, true);
        }
        if (param0) {
            return (gha) null;
        }
        return gk.field_e;
    }

    final static int a(int param0, byte param1, int param2, boolean param3, int param4, aga param5, int param6, op param7) {
        int stackIn_31_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        gs var13 = null;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            var8_int = 0;
            var9 = 1;
            L1: while (true) {
              L2: {
                if (param4 < var9) {
                  break L2;
                } else {
                  L3: {
                    var10 = null;
                    var11 = param0;
                    if (-3 != (var11 ^ -1)) {
                      if ((var11 ^ -1) == -2) {
                        if ((-var9 + param2 ^ -1) > -1) {
                          break L3;
                        } else {
                          var10 = param7.field_a[param6][-var9 + param2];
                          break L3;
                        }
                      } else {
                        if (4 == var11) {
                          if (param7.field_z <= var9 + param6) {
                            break L3;
                          } else {
                            var10 = param7.field_a[param6 - -var9][param2];
                            break L3;
                          }
                        } else {
                          if (var11 != 3) {
                            break L3;
                          } else {
                            if (var9 + param2 < param7.field_B) {
                              var10 = param7.field_a[param6][var9 + param2];
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    } else {
                      if ((param6 + -var9 ^ -1) <= -1) {
                        var10 = param7.field_a[-var9 + param6][param2];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var10 == null) {
                    break L2;
                  } else {
                    if (param5.a(((wia) (var10)).field_n, false)) {
                      if (((wia) (var10)).field_l == null) {
                        var8_int = var9;
                        var9++;
                        continue L1;
                      } else {
                        if (param3) {
                          break L2;
                        } else {
                          var9++;
                          continue L1;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L4: {
                if (param1 > 11) {
                  break L4;
                } else {
                  var13 = (gs) null;
                  om.a((gs) null, (byte) -115);
                  break L4;
                }
              }
              stackIn_31_0 = var8_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var8);

            stackIn_34_1 = new StringBuilder().append("om.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L5;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L6;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_35_0), stackIn_38_2 + ')');
        }
        return stackIn_31_0;
    }

    static {
    }
}
