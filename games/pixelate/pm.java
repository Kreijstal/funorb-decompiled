/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pm {
    int[] field_v;
    int field_f;
    private int field_c;
    int field_r;
    String[] field_i;
    static String field_s;
    hd[] field_a;
    static boolean field_u;
    private int field_q;
    static tf[] field_l;
    int field_g;
    dd field_d;
    int field_o;
    int field_p;
    boolean field_t;
    static boolean field_e;
    boolean field_b;
    int field_j;
    int field_k;
    private int field_m;
    private int field_n;
    static rf field_h;

    public static void b(int param0) {
        field_l = null;
        if (param0 != 0) {
            return;
        }
        field_s = null;
        field_h = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        sb var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        sb stackIn_44_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_36_0 = 0;
        String stackOut_36_1 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        sb stackOut_43_0 = null;
        sb stackOut_42_0 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = de.field_h;
              var2 = 0;
              if (2 != ha.field_h) {
                break L1;
              } else {
                var3_long = -pk.field_g + hm.a(64);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if ((var2 ^ -1) <= -1) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              }
            }
            if (param0 < -7) {
              var3 = 0;
              L2: while (true) {
                if (vm.field_e.length <= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var4 = fo.field_a[var3];
                    if ((var4 ^ -1) <= -1) {
                      if (var4 == mj.field_c.field_j) {
                        var5 = sl.field_l;
                        break L3;
                      } else {
                        var5 = ce.field_b;
                        break L3;
                      }
                    } else {
                      var5 = qo.field_s;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = vm.field_e[var3];
                    if (ha.field_h != 2) {
                      break L4;
                    } else {
                      if (1 == var2) {
                        L5: {
                          if (jk.field_d.length <= df.field_r.length) {
                            stackOut_18_0 = df.field_r.length;
                            stackIn_19_0 = stackOut_18_0;
                            break L5;
                          } else {
                            stackOut_17_0 = jk.field_d.length;
                            stackIn_19_0 = stackOut_17_0;
                            break L5;
                          }
                        }
                        L6: {
                          var7 = stackIn_19_0;
                          if (hb.field_jb.length <= uk.field_r.length) {
                            stackOut_21_0 = uk.field_r.length;
                            stackIn_22_0 = stackOut_21_0;
                            break L6;
                          } else {
                            stackOut_20_0 = hb.field_jb.length;
                            stackIn_22_0 = stackOut_20_0;
                            break L6;
                          }
                        }
                        L7: {
                          var8 = stackIn_22_0;
                          if (var3 < 6) {
                            break L7;
                          } else {
                            if (var3 >= 6 - -var7) {
                              break L7;
                            } else {
                              L8: {
                                if (0 <= var3 - (6 - df.field_r.length + var7)) {
                                  stackOut_26_0 = df.field_r[df.field_r.length + (-6 + (var3 - var7))];
                                  stackIn_27_0 = stackOut_26_0;
                                  break L8;
                                } else {
                                  stackOut_25_0 = "";
                                  stackIn_27_0 = stackOut_25_0;
                                  break L8;
                                }
                              }
                              var6 = stackIn_27_0;
                              break L7;
                            }
                          }
                        }
                        if (var3 < 7 - -var7) {
                          break L4;
                        } else {
                          if (var3 >= var8 + var7 + 7) {
                            break L4;
                          } else {
                            L9: {
                              if (-var7 + (-7 + var3) < uk.field_r.length) {
                                stackOut_32_0 = uk.field_r[-var7 + -7 + var3];
                                stackIn_33_0 = stackOut_32_0;
                                break L9;
                              } else {
                                stackOut_31_0 = "";
                                stackIn_33_0 = stackOut_31_0;
                                break L9;
                              }
                            }
                            var6 = stackIn_33_0;
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if (var4 != -2) {
                      break L10;
                    } else {
                      var6 = Integer.toString(var2);
                      break L10;
                    }
                  }
                  L11: {
                    stackOut_36_0 = 3;
                    stackOut_36_1 = (String) (var6);
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    if (-1 < (var4 ^ -1)) {
                      stackOut_38_0 = stackIn_38_0;
                      stackOut_38_1 = (String) ((Object) stackIn_38_1);
                      stackOut_38_2 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      stackIn_39_2 = stackOut_38_2;
                      break L11;
                    } else {
                      stackOut_37_0 = stackIn_37_0;
                      stackOut_37_1 = (String) ((Object) stackIn_37_1);
                      stackOut_37_2 = 1;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_39_2 = stackOut_37_2;
                      break L11;
                    }
                  }
                  L12: {
                    var7 = sb.a(stackIn_39_0, stackIn_39_1, stackIn_39_2 != 0);
                    var8 = qe.field_u - (var7 >> 664385313);
                    if ((var4 ^ -1) <= -1) {
                      L13: {
                        if (var4 == mj.field_c.field_j) {
                          stackOut_43_0 = tm.field_N;
                          stackIn_44_0 = stackOut_43_0;
                          break L13;
                        } else {
                          stackOut_42_0 = ao.field_e;
                          stackIn_44_0 = stackOut_42_0;
                          break L13;
                        }
                      }
                      L14: {
                        var9 = stackIn_44_0;
                        var1_int = var1_int + ko.field_fb;
                        if (var9 != null) {
                          var9.a(var1_int, gk.field_fb - -(bd.field_c << -1546198335), -1, var7 + (hc.field_J << 1475776353), -hc.field_J + var8);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var1_int = var1_int + bd.field_c;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L15: {
                    if (var4 < 0) {
                      bg.field_j.a(var6, var8, var1_int + ii.field_i, var5, -1);
                      var1_int = var1_int + hq.field_r;
                      break L15;
                    } else {
                      ma.field_y.a(var6, var8, var1_int + ul.field_q, var5, -1);
                      var1_int = var1_int + (gk.field_fb + (bd.field_c + ko.field_fb));
                      break L15;
                    }
                  }
                  var3++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "pm.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        for (var2 = param0; this.field_a.length > var2; var2++) {
            this.field_a[var2].a(-98);
        }
        return this.field_d.a((byte) -117);
    }

    final void a(we param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_q = param0.k(0);
              this.field_v[0] = param0.a((byte) -118);
              this.field_v[1] = param0.a((byte) -111);
              this.field_d.field_d = param0.f(255);
              this.field_a[0].b(-25, this.field_q);
              this.field_a[1].b(-47, this.field_q);
              this.field_a[0].a(-2, param0);
              this.field_a[1].a(-2, param0);
              if (param1 > 78) {
                break L1;
              } else {
                this.field_j = -84;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("pm.J(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        int var3 = 0;
        hd var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        this.field_q = this.field_q + 1;
        hd[] var6 = this.field_a;
        hd[] var2 = var6;
        for (var3 = param0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.b(param0 + -124, this.field_q);
            var4.b(-113);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        hh var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        hd var15 = null;
        hd stackIn_42_0 = null;
        hd stackIn_43_0 = null;
        hd stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        hd stackOut_41_0 = null;
        hd stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        hd stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        L0: {
          var14 = Pixelate.field_H ? 1 : 0;
          if (this.field_t) {
            break L0;
          } else {
            L1: {
              if ((param1 ^ -1) <= -1) {
                break L1;
              } else {
                if (param1 >= this.field_m) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var15 = this.field_a[param1];
              var6 = var15.a(param0, (byte) -91) ? 1 : 0;
              if (param2 > 25) {
                break L2;
              } else {
                pm.a((byte) -67, (String) null, -41L);
                break L2;
              }
            }
            L3: {
              if (var6 == 0) {
                break L3;
              } else {
                var15.field_b = param3;
                break L3;
              }
            }
            L4: {
              if (5 == param0) {
                var7 = this.field_d.field_l[this.field_d.field_d];
                this.field_b = true;
                this.field_o = 0;
                this.field_f = this.field_f + 1;
                var8 = 0;
                L5: while (true) {
                  if (var8 >= this.field_d.field_k) {
                    var8 = 0;
                    var9 = var15.field_e;
                    L6: while (true) {
                      if (2 + var15.field_e <= var9) {
                        L7: {
                          stackOut_41_0 = (hd) (var15);
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_42_0 = stackOut_41_0;
                          if (-5 < (var8 ^ -1)) {
                            stackOut_43_0 = (hd) ((Object) stackIn_43_0);
                            stackOut_43_1 = var8 * 10;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            break L7;
                          } else {
                            stackOut_42_0 = (hd) ((Object) stackIn_42_0);
                            stackOut_42_1 = 50;
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_44_1 = stackOut_42_1;
                            break L7;
                          }
                        }
                        L8: {
                          stackIn_44_0.field_f = stackIn_44_1;
                          if (2 == oa.field_j) {
                            break L8;
                          } else {
                            if (0 != oa.field_j) {
                              break L4;
                            } else {
                              if (0 < this.field_r) {
                                break L8;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        this.field_v[param1] = this.field_v[param1] + var15.field_f;
                        break L4;
                      } else {
                        var10 = var15.field_h;
                        L9: while (true) {
                          if (var10 >= var15.field_h + 2) {
                            var9++;
                            continue L6;
                          } else {
                            if (0 != var9) {
                              if (-1 != (var10 ^ -1)) {
                                if (var15.field_i - 1 != var9) {
                                  if (var10 != var15.field_a + -1) {
                                    var11 = var9 + var15.field_i * var10;
                                    if ((4 & var15.field_r[var11]) > 0) {
                                      var8++;
                                      var10++;
                                      continue L9;
                                    } else {
                                      var15.field_k = true;
                                      var10++;
                                      continue L9;
                                    }
                                  } else {
                                    var10++;
                                    continue L9;
                                  }
                                } else {
                                  var10++;
                                  continue L9;
                                }
                              } else {
                                var10++;
                                continue L9;
                              }
                            } else {
                              var10++;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var9 = 0;
                    L10: while (true) {
                      if (var9 >= this.field_d.field_o) {
                        var8++;
                        continue L5;
                      } else {
                        L11: {
                          var10 = var8 * this.field_d.field_o - -var9;
                          var11 = var9 - -1 + (2 + this.field_d.field_o) * (var8 - -1);
                          var12 = this.field_d.field_o - var9 - 1 + var8 * this.field_d.field_o;
                          var13 = var15.field_r[var11] & 3;
                          if (var13 == (255 & var7.field_n[var10])) {
                            var15.field_r[var11] = (byte)bq.a((int) var15.field_r[var11], 4);
                            break L11;
                          } else {
                            var15.field_r[var11] = (byte)cm.a((int) var15.field_r[var11], -5);
                            if (0 == var13) {
                              break L11;
                            } else {
                              this.field_o = this.field_o + 1;
                              break L11;
                            }
                          }
                        }
                        if ((255 & var7.field_n[var12]) == var13) {
                          var9++;
                          continue L10;
                        } else {
                          this.field_b = false;
                          var9++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            return var6 != 0;
          }
        }
        return false;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        if (param2 != 0) {
          throw new IllegalStateException();
        } else {
          this.field_r = param1;
          this.field_d = bj.a(this.field_r, -89);
          var4 = param0;
          L0: while (true) {
            if (var4 >= this.field_a.length) {
              this.field_d.field_d = 0;
              return;
            } else {
              if (null != this.field_a[var4]) {
                this.field_a[var4] = new hd(this.field_d);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, hh[] param2) {
        try {
            if (param0 != 13728) {
                field_l = (tf[]) null;
            }
            up.field_d[param1] = new dd(param2[0].field_g, param2[0].field_d, up.field_c[param1], up.field_k[param1], up.field_f[param1], up.field_p[param1], up.field_e[param1], up.field_i[param1], param2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "pm.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        this.field_j = param1;
        this.field_t = true;
        if (param0) {
            this.field_q = -37;
        }
    }

    final static void a(byte param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
            jo.field_k = param1;
            ce.field_d = 2;
            var5 = (CharSequence) ((Object) param1);
            fp.field_d = dh.a(var5, (byte) 38);
            if (param0 < 32) {
                field_s = (String) null;
            }
            oo.field_d = true;
            fp.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "pm.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    pm(String[] param0, int param1, int param2, int param3, int param4, int param5) {
        int discarded$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        Random var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              this.field_i = param0;
              this.field_r = param1;
              this.field_m = param0.length;
              this.field_c = param3;
              this.field_n = param4;
              this.field_v = new int[this.field_m];
              this.field_a = new hd[this.field_m];
              this.field_g = param5;
              this.field_q = this.field_c - -1;
              if (-1 != (param2 ^ -1)) {
                break L1;
              } else {
                this.field_d = bj.a(this.field_r, -121);
                break L1;
              }
            }
            L2: {
              if (1 != param2) {
                break L2;
              } else {
                this.field_d = un.field_j.b(-3060);
                break L2;
              }
            }
            L3: {
              if (-3 != (param2 ^ -1)) {
                break L3;
              } else {
                var9 = new Random((long)this.field_c);
                this.field_d = wo.a(this.field_r, cl.field_e[this.field_n], var9, (byte) 116);
                this.field_d.field_e = 1000;
                discarded$1 = ok.a(var9, -98, 2147483647);
                break L3;
              }
            }
            var7_int = 0;
            L4: while (true) {
              if (this.field_m <= var7_int) {
                this.field_d.field_d = 0;
                break L0;
              } else {
                this.field_a[var7_int] = new hd(this.field_d);
                var7_int++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var7);
            stackOut_12_1 = new StringBuilder().append("pm.<init>(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_u = false;
        field_e = true;
    }
}
