/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mb extends ce {
    private int field_n;
    private int field_j;
    static String field_k;
    private int field_h;
    private boolean field_o;
    static int field_p;
    private vm field_q;
    private int field_t;
    private int field_r;
    static he field_s;
    static int field_i;
    static gb field_m;
    private String field_l;

    final void a(int param0, int param1, int param2, int param3, vm param4, String param5, int param6, int param7) {
        pm stackIn_33_0;
        pm stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        pm stackIn_34_0 = null;
        pm stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        pm var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 != 0) {
                break L1;
              } else {
                param7 = param4.field_u;
                break L1;
              }
            }
            if (param5 != null) {
              L2: {
                if (param4 != this.field_q) {
                  break L2;
                } else {
                  if (this.field_o) {
                    break L2;
                  } else {
                    if (param6 != this.field_j) {
                      break L2;
                    } else {
                      if (this.field_h != param3) {
                        break L2;
                      } else {
                        if (this.field_r != param7) {
                          break L2;
                        } else {
                          if (param1 != this.field_t) {
                            break L2;
                          } else {
                            if (this.field_n != param2) {
                              break L2;
                            } else {
                              if (this.field_l == null) {
                                break L2;
                              } else {
                                if (!this.field_l.equals(param5)) {
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
                this.field_t = param1;
                this.field_h = param3;
                this.field_o = false;
                this.field_q = param4;
                this.field_r = param7;
                this.field_n = param2;
                this.field_j = param6;
                this.field_l = param5;
                var16 = new String[param4.a(param5, param2) - -1];
                var17 = var16;
                var10 = Math.max(1, param4.a(param5, new int[]{param2}, var17));
                if (-4 != (this.field_h ^ -1)) {
                  break L3;
                } else {
                  if ((var10 ^ -1) != -2) {
                    break L3;
                  } else {
                    this.field_h = 1;
                    break L3;
                  }
                }
              }
              L4: {
                this.field_d = new pm[var10];
                if (param0 != this.field_h) {
                  if (-2 != (this.field_h ^ -1)) {
                    if (2 == this.field_h) {
                      var11 = -(var10 * this.field_r) + (-param4.field_F + this.field_t);
                      break L4;
                    } else {
                      L5: {
                        var12 = (-(this.field_r * var10) + this.field_t) / (1 + var10);
                        if (-1 >= (var12 ^ -1)) {
                          break L5;
                        } else {
                          var12 = 0;
                          break L5;
                        }
                      }
                      var11 = param4.field_y - -var12;
                      this.field_r = this.field_r + var12;
                      break L4;
                    }
                  } else {
                    var11 = (this.field_t + -(var10 * this.field_r) >> 364852865) + param4.field_y;
                    break L4;
                  }
                } else {
                  var11 = param4.field_y;
                  break L4;
                }
              }
              var12 = 0;
              L6: while (true) {
                if (var10 <= var12) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L7: {
                    var13 = var16[var12];
                    stackIn_33_0 = null;

                    stackIn_33_1 = null;

                    stackIn_33_2 = -param4.field_y + var11;

                    stackIn_33_3 = param4.field_F + var11;

                    if (var13 != null) {
                      stackIn_34_0 = null;
                      stackIn_34_1 = null;
                      stackIn_34_2 = stackIn_33_2;
                      stackIn_34_3 = stackIn_33_3;
                      stackIn_34_4 = var13.length();
                      break L7;
                    } else {
                      stackIn_34_0 = null;
                      stackIn_34_1 = null;
                      stackIn_34_2 = stackIn_33_2;
                      stackIn_34_3 = stackIn_33_3;
                      stackIn_34_4 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var14 = new pm(stackIn_34_2, stackIn_34_3, stackIn_34_4);
                    var14.field_b[0] = 0;
                    if (var13 == null) {
                      break L8;
                    } else {
                      L9: {
                        var14.field_b[var13.length()] = param4.a(var13);
                        if (-4 != (param6 ^ -1)) {
                          stackIn_38_0 = 0;
                          break L9;
                        } else {
                          stackIn_38_0 = this.a(param4.a(var13), param2, 41, var13);
                          break L9;
                        }
                      }
                      ld.a(stackIn_38_0, (byte) 98, param4, var13, var14);
                      break L8;
                    }
                  }
                  this.field_d[var12] = var14;
                  var11 = var11 + param7;
                  var12++;
                  continue L6;
                }
              }
            } else {
              this.field_d = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var9);

            stackIn_43_1 = new StringBuilder().append("mb.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L10;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_46_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');

            if (param5 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L11;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L11;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_44_0), stackIn_47_2 + ',' + param6 + ',' + param7 + ')');
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

    private final pm a(byte param0, String param1, vm param2, int param3) {
        pm var5 = null;
        RuntimeException var5_ref = null;
        pm var6 = null;
        pm stackIn_2_0 = null;
        pm stackIn_4_0 = null;
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
            if (param0 == 53) {
              var6 = new pm(param3 - param2.field_y, param3 - -param2.field_F, param1.length());
              var5 = var6;
              this.field_d = new pm[]{var6};
              stackIn_4_0 = (pm) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pm) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("mb.O(").append(param0).append(',');

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
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        de var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ne var5_ref_ne = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        en var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = sc.field_g;
              var2 = var10.l(32270);
              var3 = var10.l(32270);
              if (param0 == 65) {
                break L1;
              } else {
                mb.c(-95);
                break L1;
              }
            }
            if (var2 == 0) {
              var4 = (de) ((Object) ke.field_B.g(-76));
              if (var4 != null) {
                L2: {
                  var5 = -var10.field_i + jd.field_q;
                  var12 = var4.field_h;
                  var11 = var12;
                  var6 = var11;
                  if (var5 <= var12.length << 423186914) {
                    break L2;
                  } else {
                    var5 = var12.length << -3559518;
                    break L2;
                  }
                }
                var7 = 0;
                L3: while (true) {
                  if (var5 <= var7) {
                    var4.field_j = true;
                    var4.b(param0 + -170);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var6[var7 >> -2087346942] = var6[var7 >> -2087346942] + (var10.l(32270) << (ua.a(var7, 3) << -1002333144));
                    var7++;
                    continue L3;
                  }
                }
              } else {
                le.c((byte) 122);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              if (1 != var2) {
                ic.a((byte) -116, "LR1: " + gf.a((byte) -126), (Throwable) null);
                le.c((byte) 93);
                return;
              } else {
                var4_int = var10.i(param0 + -1);
                var5_ref_ne = (ne) ((Object) n.field_v.g(-106));
                L4: while (true) {
                  L5: {
                    if (var5_ref_ne == null) {
                      break L5;
                    } else {
                      L6: {
                        if (var3 != var5_ref_ne.field_i) {
                          break L6;
                        } else {
                          if (var4_int != var5_ref_ne.field_m) {
                            break L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var5_ref_ne = (ne) ((Object) n.field_v.a(12684));
                      continue L4;
                    }
                  }
                  if (var5_ref_ne == null) {
                    le.c((byte) 76);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var5_ref_ne.b(param0 + 61);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "mb.N(" + param0 + ')');
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

    final void a(int param0, int param1, String param2, vm param3, byte param4) {
        pm var8 = null;
        pm var9 = null;
        if (!(param2 != null)) {
            this.field_d = null;
            return;
        }
        if (this.field_q == param3 && this.field_o && 0 == this.field_j && this.field_l != null && this.field_l.equals(param2)) {
            return;
        }
        try {
            this.field_l = param2;
            this.field_o = true;
            this.field_q = param3;
            this.field_j = 0;
            var8 = this.a((byte) 53, param2, param3, param0);
            var9 = var8;
            if (param4 != -2) {
                String var7 = (String) null;
                this.a((vm) null, 45, -44, -47, (String) null);
            }
            var8.field_b[0] = param1;
            var9.field_b[param2.length()] = param3.a(param2) + param1;
            ld.a(0, (byte) -69, param3, param2, var9);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "mb.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(vm param0, int param1, int param2, int param3, String param4) {
        pm var8 = null;
        pm var9 = null;
        if (!(param4 != null)) {
            this.field_d = null;
            return;
        }
        if (this.field_q == param0 && this.field_o && (this.field_j ^ -1) == -3 && this.field_l != null && this.field_l.equals(param4)) {
            return;
        }
        this.field_q = param0;
        this.field_o = true;
        this.field_j = 2;
        this.field_l = param4;
        if (param2 != -1002333144) {
            return;
        }
        try {
            var8 = this.a((byte) 53, param4, param0, param1);
            var9 = var8;
            var9.field_b[0] = -param0.a(param4) + param3;
            var9.field_b[param4.length()] = param3;
            ld.a(0, (byte) 65, param0, param4, var9);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "mb.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1 == -22370) {
                break L0;
              } else {
                mb.c(-64, 48);
                break L0;
              }
            }
            L1: {
              if (null == ag.field_t) {
                break L1;
              } else {
                L2: {
                  if (0 > param0) {
                    break L2;
                  } else {
                    if (ci.field_d != rc.field_a) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 != (s.field_b.field_i ^ -1)) {
                    break L3;
                  } else {
                    if (10000L + gf.field_h >= hn.a((byte) 80)) {
                      break L3;
                    } else {
                      s.field_b.i(param1 + 41689, param0);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (s.field_b.field_i > 0) {
                    try {
                      L5: {
                        ag.field_t.a(s.field_b.field_i, s.field_b.field_n, (byte) 112, 0);
                        gf.field_h = hn.a((byte) 80);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        le.c((byte) 81);
                        break L6;
                      }
                    }
                    s.field_b.field_i = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            }
            s.field_b.field_i = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static nd c(int param0, int param1) {
        nd[] var2;
        int var3;
        int var4;
        nd[] var5;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var5 = gj.a(-17);
        var2 = var5;
        if (param0 == -22094) {
          var3 = 0;
          L0: while (true) {
            if (var5.length > var3) {
              if (param1 != var5[var3].field_c) {
                var3++;
                continue L0;
              } else {
                return var5[var3];
              }
            } else {
              return null;
            }
          }
        } else {
          return (nd) null;
        }
    }

    public static void c(int param0) {
        if (param0 <= 105) {
          mb.d(78, 82);
          field_m = null;
          field_k = null;
          field_s = null;
          return;
        } else {
          field_m = null;
          field_k = null;
          field_s = null;
          return;
        }
    }

    final void a(int param0, String param1, int param2, int param3, vm param4) {
        pm var8 = null;
        int var7 = 0;
        if (!(param1 != null)) {
            this.field_d = null;
            return;
        }
        if (param4 == this.field_q && this.field_o && -2 == (this.field_j ^ -1) && null != this.field_l && this.field_l.equals(param1)) {
            return;
        }
        try {
            this.field_o = true;
            if (param3 != 28916) {
                this.field_l = (String) null;
            }
            this.field_q = param4;
            this.field_j = 1;
            var8 = this.a((byte) 53, param1, param4, param0);
            var7 = param4.a(param1);
            var8.field_b[0] = -(var7 >> 239503617) + param2;
            var8.field_b[param1.length()] = param2 + (var7 >> -832682751);
            ld.a(0, (byte) -54, param4, param1, var8);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "mb.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public mb() {
    }

    static {
        field_k = "Weapons";
        field_i = 0;
    }
}
