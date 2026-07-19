/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends dk {
    private int field_l;
    private int field_o;
    private String field_n;
    private int field_m;
    private m field_p;
    private int field_k;
    static String field_g;
    static dm field_j;
    private int field_e;
    private boolean field_d;
    static int field_h;
    static int field_i;
    static vk field_f;

    final static void d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            if (param0 == 2971) {
              var1_int = ch.field_d[0];
              var2 = 1;
              L1: while (true) {
                if (var2 >= ch.field_d.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = ch.field_d[var2];
                  sf.a(pj.field_i, var2 << -48027036, pj.field_i, var1_int, var3);
                  var1_int = var1_int + var3;
                  var2++;
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
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "vc.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, m param3, String param4) {
        RuntimeException var6 = null;
        m var7 = null;
        lk var9 = null;
        lk var10 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            if (param4 != null) {
              L1: {
                if (this.field_p != param3) {
                  break L1;
                } else {
                  if (!this.field_d) {
                    break L1;
                  } else {
                    if (this.field_k != 2) {
                      break L1;
                    } else {
                      if (null == this.field_n) {
                        break L1;
                      } else {
                        if (!this.field_n.equals(param4)) {
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
                this.field_p = param3;
                this.field_n = param4;
                this.field_d = true;
                this.field_k = 2;
                var9 = this.a(-1, param1, param3, param4);
                var10 = var9;
                var10.field_c[0] = param0 - param3.a(param4);
                var10.field_c[param4.length()] = param0;
                qb.a(0, var10, param4, 60, param3);
                if (param2 < -12) {
                  break L2;
                } else {
                  var7 = (m) null;
                  this.a(98, 34, (String) null, 56, (m) null, 65, 122, -79);
                  break L2;
                }
              }
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
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("vc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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

    final void a(String param0, int param1, int param2, byte param3, m param4) {
        lk var8 = null;
        int var7 = 0;
        if (param0 == null) {
            this.field_a = null;
            return;
        }
        if (param3 != 58) {
            vc.d(-90);
        }
        if (this.field_p == param4) {
            if (this.field_d) {
                if (this.field_k == 1) {
                    if (null != this.field_n) {
                        if (this.field_n.equals(param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_k = 1;
            this.field_d = true;
            this.field_p = param4;
            var8 = this.a(-1, param1, param4, param0);
            var7 = param4.a(param0);
            var8.field_c[0] = param2 - (var7 >> -1193764287);
            var8.field_c[param0.length()] = (var7 >> 1641559585) + param2;
            qb.a(0, var8, param0, 60, param4);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3, m param4) {
        lk var7 = null;
        lk var8 = null;
        if (param2 == null) {
            this.field_a = null;
            return;
        }
        if (param3 > -89) {
            field_j = (dm) null;
        }
        if (this.field_p == param4) {
            if (this.field_d) {
                if (0 == this.field_k) {
                    if (this.field_n != null) {
                        if (!(!this.field_n.equals(param2))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_n = param2;
            this.field_k = 0;
            this.field_d = true;
            this.field_p = param4;
            var7 = this.a(-1, param0, param4, param2);
            var8 = var7;
            var7.field_c[0] = param1;
            var8.field_c[param2.length()] = param4.a(param2) + param1;
            qb.a(0, var8, param2, 60, param4);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vc.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3, m param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        lk var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        lk stackIn_34_0 = null;
        lk stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        lk stackIn_35_0 = null;
        lk stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        lk stackIn_36_0 = null;
        lk stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_33_0 = null;
        lk stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        lk stackOut_35_0 = null;
        lk stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        lk stackOut_34_0 = null;
        lk stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var15 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                param3 = param4.field_p;
                break L1;
              } else {
                break L1;
              }
            }
            if (param2 != null) {
              L2: {
                if (param4 != this.field_p) {
                  break L2;
                } else {
                  if (this.field_d) {
                    break L2;
                  } else {
                    if (this.field_k != param6) {
                      break L2;
                    } else {
                      if (this.field_m != param0) {
                        break L2;
                      } else {
                        if (this.field_e != param3) {
                          break L2;
                        } else {
                          if (param7 != this.field_o) {
                            break L2;
                          } else {
                            if (param5 != this.field_l) {
                              break L2;
                            } else {
                              if (null == this.field_n) {
                                break L2;
                              } else {
                                if (!this.field_n.equals(param2)) {
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
                this.field_o = param7;
                this.field_k = param6;
                this.field_m = param0;
                this.field_e = param3;
                this.field_l = param5;
                this.field_n = param2;
                this.field_d = false;
                this.field_p = param4;
                var16 = new String[param1 + param4.b(param2, param5)];
                var17 = var16;
                var10 = Math.max(1, param4.a(param2, new int[]{param5}, var17));
                if (this.field_m != 3) {
                  break L3;
                } else {
                  if (-2 != (var10 ^ -1)) {
                    break L3;
                  } else {
                    this.field_m = 1;
                    break L3;
                  }
                }
              }
              L4: {
                this.field_a = new lk[var10];
                if (-1 != (this.field_m ^ -1)) {
                  if (-2 != (this.field_m ^ -1)) {
                    if (this.field_m == 2) {
                      var11 = -param4.field_q + this.field_o - var10 * this.field_e;
                      break L4;
                    } else {
                      L5: {
                        var12 = (-(this.field_e * var10) + this.field_o) / (var10 - -1);
                        if ((var12 ^ -1) > -1) {
                          var12 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.field_e = this.field_e + var12;
                      var11 = param4.field_o - -var12;
                      break L4;
                    }
                  } else {
                    var11 = param4.field_o + (this.field_o - this.field_e * var10 >> 802420961);
                    break L4;
                  }
                } else {
                  var11 = param4.field_o;
                  break L4;
                }
              }
              var12 = 0;
              L6: while (true) {
                if (var12 >= var10) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L7: {
                    var13 = var16[var12];
                    stackOut_33_0 = null;
                    stackOut_33_1 = null;
                    stackOut_33_2 = -param4.field_o + var11;
                    stackOut_33_3 = var11 + param4.field_q;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    stackIn_35_3 = stackOut_33_3;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    stackIn_34_3 = stackOut_33_3;
                    if (var13 == null) {
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = stackIn_35_2;
                      stackOut_35_3 = stackIn_35_3;
                      stackOut_35_4 = 0;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      stackIn_36_2 = stackOut_35_2;
                      stackIn_36_3 = stackOut_35_3;
                      stackIn_36_4 = stackOut_35_4;
                      break L7;
                    } else {
                      stackOut_34_0 = null;
                      stackOut_34_1 = null;
                      stackOut_34_2 = stackIn_34_2;
                      stackOut_34_3 = stackIn_34_3;
                      stackOut_34_4 = var13.length();
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_36_2 = stackOut_34_2;
                      stackIn_36_3 = stackOut_34_3;
                      stackIn_36_4 = stackOut_34_4;
                      break L7;
                    }
                  }
                  L8: {
                    var14 = new lk(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                    var14.field_c[0] = 0;
                    if (var13 == null) {
                      break L8;
                    } else {
                      L9: {
                        var14.field_c[var13.length()] = param4.a(var13);
                        if (param6 != 3) {
                          stackOut_39_0 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          break L9;
                        } else {
                          stackOut_38_0 = this.a(-116, param4.a(var13), param5, var13);
                          stackIn_40_0 = stackOut_38_0;
                          break L9;
                        }
                      }
                      qb.a(stackIn_40_0, var14, var13, 60, param4);
                      break L8;
                    }
                  }
                  this.field_a[var12] = var14;
                  var11 = var11 + param3;
                  var12++;
                  continue L6;
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
          L10: {
            var9 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var9);
            stackOut_43_1 = new StringBuilder().append("vc.B(").append(param0).append(',').append(param1).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L10;
            }
          }
          L11: {
            stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param3).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param4 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L11;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L11;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final static void c(int param0) {
        int var2 = 0;
        int discarded$0 = 0;
        if (param0 != -1) {
            field_h = 119;
        }
        nj var3 = (nj) ((Object) pb.field_t.g(0));
        nj var1 = var3;
        if (var1 != null) {
            var2 = eh.field_c;
            ma.a(var2, 10, tl.field_h, (byte) -92, jf.field_c, ll.field_h);
            sl.field_f[var3.field_h].f(25, var2 + (-32 + (tl.field_h + -15)) / 2);
            discarded$0 = dd.field_G.a(pg.field_a[var3.field_h], 67, 15 + var2, jf.field_c + -42 + -30, tl.field_h + -30, 0, -1, 1, 1, 30);
        }
    }

    private final lk a(int param0, int param1, m param2, String param3) {
        lk var5 = null;
        RuntimeException var5_ref = null;
        m var6 = null;
        lk var7 = null;
        lk stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        lk stackOut_2_0 = null;
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
        try {
          L0: {
            L1: {
              var7 = new lk(param1 + -param2.field_o, param1 - -param2.field_q, param3.length());
              var5 = var7;
              if (param0 == -1) {
                break L1;
              } else {
                var6 = (m) null;
                this.a(-65, -103, (String) null, -76, (m) null, -99, 20, -32);
                break L1;
              }
            }
            this.field_a = new lk[]{var7};
            stackOut_2_0 = (lk) (var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5_ref);
            stackOut_4_1 = new StringBuilder().append("vc.C(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(byte param0) {
        field_g = null;
        field_j = null;
        field_f = null;
        int var1 = 78 % ((-20 - param0) / 33);
    }

    public vc() {
    }

    static {
        field_h = 0;
    }
}
