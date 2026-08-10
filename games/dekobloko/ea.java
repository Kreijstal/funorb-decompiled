/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends cf {
    private boolean field_w;
    private int field_B;
    static int field_p;
    private int field_s;
    static w field_A;
    static String field_u;
    private int field_v;
    private String field_m;
    static int field_n;
    static java.math.BigInteger field_k;
    static int field_r;
    static ck field_l;
    static w field_D;
    private mm field_o;
    static int field_t;
    private int field_z;
    private int field_q;
    static String field_y;
    static String field_C;
    static cd field_x;

    final void a(int param0, int param1, String param2, byte param3, mm param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        nf var8 = null;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param4 != this.field_o) {
                  break L1;
                } else {
                  if (!this.field_w) {
                    break L1;
                  } else {
                    if ((this.field_s ^ -1) != -2) {
                      break L1;
                    } else {
                      if (null == this.field_m) {
                        break L1;
                      } else {
                        if (!this.field_m.equals(param2)) {
                          break L1;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                this.field_o = param4;
                this.field_s = 1;
                if (param3 == 8) {
                  break L2;
                } else {
                  ea.a(54, 119, -124, -51, 32, 28);
                  break L2;
                }
              }
              this.field_w = true;
              var8 = this.a(-95, param0, param4, param2);
              var7 = param4.a(param2);
              var8.field_a[0] = param1 - (var7 >> -385423935);
              var8.field_a[param2.length()] = param1 - -(var7 >> -862867359);
              hm.a(var8, param4, 0, param2, param3 ^ -9);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_a = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("ea.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
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

    final static boolean c(byte param0) {
        int stackIn_8_0 = 0;
        if (param0 < -23) {
          if (hc.field_d >= 10) {
            if (v.field_d) {
              return false;
            } else {
              L0: {
                if (si.c(-12851)) {
                  stackIn_8_0 = 0;
                  break L0;
                } else {
                  stackIn_8_0 = 1;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static ck[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6;
        int var7;
        int var8;
        ck var9;
        ck var10;
        ck var11;
        ck var12;
        ck var13;
        Object var14;
        int[] var15;
        ck var16;
        int[] var17;
        int[] var18;
        var18 = hk.field_l;
        var17 = var18;
        var15 = var17;
        var6 = var15;
        var7 = hk.field_j;
        var8 = hk.field_i;
        var9 = new ck(param2, param3 - param2 * 2);
        var9.a();
        hk.d(0, 0, param2, param3 + -(2 * param2), param5, param4);
        var10 = new ck(param2, param2);
        var10.a();
        hk.a(0, 0, param2, param2, param5);
        var11 = new ck(16, param2);
        if (param1 != -20982) {
          return (ck[]) null;
        } else {
          L0: {
            var11.a();
            hk.a(0, 0, 16, param2, param5);
            var12 = new ck(param2, param2);
            var12.a();
            hk.a(0, 0, param2, param2, param4);
            var13 = new ck(16, param2);
            var13.a();
            hk.a(0, 0, 16, param2, param4);
            var14 = null;
            if (param0 > 0) {
              var16 = new ck(16, 16);
              var14 = var16;
              var16.a();
              hk.a(0, 0, 16, 16, param0);
              break L0;
            } else {
              break L0;
            }
          }
          hk.a(var18, var7, var8);
          return new ck[]{var10, var11, var10, var9, (ck) (var14), var9, var12, var13, var12};
        }
    }

    final void a(int param0, mm param1, String param2, int param3, int param4) {
        nf var7 = null;
        nf var8 = null;
        if (!(param2 != null)) {
            this.field_a = null;
            return;
        }
        if (param4 <= 11) {
            field_r = -109;
        }
        if (param1 == this.field_o && this.field_w && this.field_s == 0 && null != this.field_m) {
            if (!(!this.field_m.equals(param2))) {
                return;
            }
        }
        try {
            this.field_w = true;
            this.field_o = param1;
            this.field_m = param2;
            this.field_s = 0;
            var7 = this.a(-27, param3, param1, param2);
            var8 = var7;
            var7.field_a[0] = param0;
            var8.field_a[param2.length()] = param1.a(param2) + param0;
            hm.a(var8, param1, 0, param2, -1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ea.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, mm param2, int param3, int param4, int param5, int param6, int param7) {
        nf stackIn_37_0;
        nf stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        nf stackIn_38_0 = null;
        nf stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        nf stackIn_42_0 = null;
        mm stackIn_42_1 = null;
        nf stackIn_43_0 = null;
        mm stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        nf var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 == 0) {
                param7 = param2.field_S;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 != null) {
              L2: {
                if (this.field_o != param2) {
                  break L2;
                } else {
                  if (this.field_w) {
                    break L2;
                  } else {
                    if (this.field_s != param5) {
                      break L2;
                    } else {
                      if (this.field_q != param1) {
                        break L2;
                      } else {
                        if (param7 != this.field_B) {
                          break L2;
                        } else {
                          if (this.field_v != param4) {
                            break L2;
                          } else {
                            if (param3 != this.field_z) {
                              break L2;
                            } else {
                              if (null == this.field_m) {
                                break L2;
                              } else {
                                if (!this.field_m.equals(param0)) {
                                  break L2;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                this.field_B = param7;
                this.field_m = param0;
                this.field_q = param1;
                this.field_z = param3;
                this.field_o = param2;
                this.field_v = param4;
                this.field_w = false;
                this.field_s = param5;
                var16 = new String[param2.a(param0, param3) + 1];
                var17 = var16;
                var10 = Math.max(1, param2.a(param0, new int[]{param3}, var17));
                if ((this.field_q ^ -1) != -4) {
                  break L3;
                } else {
                  if (-2 == (var10 ^ -1)) {
                    this.field_q = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param6 >= 8) {
                  break L4;
                } else {
                  ea.b(true);
                  break L4;
                }
              }
              L5: {
                this.field_a = new nf[var10];
                if (this.field_q != 0) {
                  if (this.field_q == 1) {
                    var11 = (-(var10 * this.field_B) + this.field_v >> -531200703) + param2.field_R;
                    break L5;
                  } else {
                    if (this.field_q == 2) {
                      var11 = -(this.field_B * var10) + -param2.field_K + this.field_v;
                      break L5;
                    } else {
                      L6: {
                        var12 = (-(var10 * this.field_B) + this.field_v) / (1 + var10);
                        if (-1 >= (var12 ^ -1)) {
                          break L6;
                        } else {
                          var12 = 0;
                          break L6;
                        }
                      }
                      var11 = var12 + param2.field_R;
                      this.field_B = this.field_B + var12;
                      break L5;
                    }
                  }
                } else {
                  var11 = param2.field_R;
                  break L5;
                }
              }
              var12 = 0;
              L7: while (true) {
                if (var10 <= var12) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L8: {
                    var13 = var16[var12];
                    stackIn_37_0 = null;

                    stackIn_37_1 = null;

                    stackIn_37_2 = -param2.field_R + var11;

                    stackIn_37_3 = param2.field_K + var11;

                    if (var13 != null) {
                      stackIn_38_0 = null;
                      stackIn_38_1 = null;
                      stackIn_38_2 = stackIn_37_2;
                      stackIn_38_3 = stackIn_37_3;
                      stackIn_38_4 = var13.length();
                      break L8;
                    } else {
                      stackIn_38_0 = null;
                      stackIn_38_1 = null;
                      stackIn_38_2 = stackIn_37_2;
                      stackIn_38_3 = stackIn_37_3;
                      stackIn_38_4 = 0;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new nf(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                    var14.field_a[0] = 0;
                    if (var13 != null) {
                      L10: {
                        var14.field_a[var13.length()] = param2.a(var13);
                        stackIn_42_0 = (nf) (var14);

                        stackIn_42_1 = (mm) (param2);

                        if ((param5 ^ -1) == -4) {
                          stackIn_43_0 = (nf) ((Object) stackIn_42_0);
                          stackIn_43_1 = (mm) ((Object) stackIn_42_1);
                          stackIn_43_2 = this.a((byte) 64, param2.a(var13), var13, param3);
                          break L10;
                        } else {
                          stackIn_43_0 = (nf) ((Object) stackIn_42_0);
                          stackIn_43_1 = (mm) ((Object) stackIn_42_1);
                          stackIn_43_2 = 0;
                          break L10;
                        }
                      }
                      hm.a(stackIn_43_0, stackIn_43_1, stackIn_43_2, var13, -1);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  this.field_a[var12] = var14;
                  var11 = var11 + param7;
                  var12++;
                  continue L7;
                }
              }
            } else {
              this.field_a = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackIn_48_0 = (RuntimeException) (var9);

            stackIn_48_1 = new StringBuilder().append("ea.R(");

            if (param0 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L11;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L12;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_49_0), stackIn_52_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final static String b(boolean param0) {
        if (!wd.field_d) {
          if (jc.field_g >= o.field_b) {
            if (he.field_gb + o.field_b <= jc.field_g) {
              if (param0) {
                return null;
              } else {
                ea.b(true);
                return null;
              }
            } else {
              return k.field_e;
            }
          } else {
            if (param0) {
              return null;
            } else {
              ea.b(true);
              return null;
            }
          }
        } else {
          if (param0) {
            return null;
          } else {
            ea.b(true);
            return null;
          }
        }
    }

    final void a(int param0, mm param1, int param2, int param3, String param4) {
        nf var8 = null;
        nf var9 = null;
        if (!(param4 != null)) {
            this.field_a = null;
            return;
        }
        if (this.field_o == param1 && this.field_w && (this.field_s ^ -1) == -3 && this.field_m != null && this.field_m.equals(param4)) {
            return;
        }
        try {
            this.field_m = param4;
            this.field_o = param1;
            this.field_w = true;
            this.field_s = 2;
            var8 = this.a(88, param3, param1, param4);
            var9 = var8;
            var9.field_a[param0] = -param1.a(param4) + param2;
            var9.field_a[param4.length()] = param2;
            hm.a(var9, param1, 0, param4, -1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ea.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != -37) {
          return;
        } else {
          field_y = null;
          field_x = null;
          field_u = null;
          field_k = null;
          field_A = null;
          field_l = null;
          field_D = null;
          field_C = null;
          return;
        }
    }

    public ea() {
    }

    private final nf a(int param0, int param1, mm param2, String param3) {
        nf var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        nf var7 = null;
        nf stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = new nf(param1 + -param2.field_R, param1 - -param2.field_K, param3.length());
            var5 = var7;
            var6 = -31 / ((27 - param0) / 34);
            this.field_a = new nf[]{var7};
            stackIn_1_0 = (nf) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5_ref);

            stackIn_4_1 = new StringBuilder().append("ea.L(").append(param0).append(',').append(param1).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean d(byte param0) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        if (param0 > 34) {
          if (w.field_H == null) {
            if (!qd.e(-6)) {
              if (pd.field_f == null) {
                if (ab.c(48)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_20_0 = 1;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_y = (String) null;
          if (w.field_H == null) {
            if (!qd.e(-6)) {
              if (pd.field_f == null) {
                if (ab.c(48)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_8_0 = 1;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        field_n = 0;
        field_u = "Invite players";
        field_y = "Under the Sea";
        field_t = 0;
        field_p = 360;
        field_C = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_k = new java.math.BigInteger("65537");
    }
}
