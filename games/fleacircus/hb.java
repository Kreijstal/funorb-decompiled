/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends e {
    private te[] field_s;
    static int field_t;
    static String field_q;
    private te field_r;

    private final void a(boolean param0, hb param1, byte param2) {
        te dupTemp$9 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        te var5 = null;
        te var6 = null;
        int var7 = 0;
        te stackIn_12_0 = null;
        te stackIn_13_0 = null;
        te stackIn_14_0 = null;
        te stackIn_14_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        te stackOut_11_0 = null;
        te stackOut_13_0 = null;
        te stackOut_13_1 = null;
        te stackOut_12_0 = null;
        te stackOut_12_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            super.a(2, param1);
            if (param2 == 70) {
              L1: {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    dm.a(this.field_s, 0, param1.field_s, 0, 6);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4_int = 0;
                L3: while (true) {
                  if (6 <= var4_int) {
                    break L1;
                  } else {
                    var5 = this.field_s[var4_int];
                    if (var7 == 0) {
                      L4: {
                        L5: {
                          if (var5 == null) {
                            break L5;
                          } else {
                            L6: {
                              var6 = param1.field_s[var4_int];
                              stackOut_11_0 = (te) (var5);
                              stackIn_13_0 = stackOut_11_0;
                              stackIn_12_0 = stackOut_11_0;
                              if (var6 == null) {
                                dupTemp$9 = new te();
                                param1.field_s[var4_int] = dupTemp$9;
                                stackOut_13_0 = (te) ((Object) stackIn_13_0);
                                stackOut_13_1 = (te) (dupTemp$9);
                                stackIn_14_0 = stackOut_13_0;
                                stackIn_14_1 = stackOut_13_1;
                                break L6;
                              } else {
                                stackOut_12_0 = (te) ((Object) stackIn_12_0);
                                stackOut_12_1 = (te) (var6);
                                stackIn_14_0 = stackOut_12_0;
                                stackIn_14_1 = stackOut_12_1;
                                break L6;
                              }
                            }
                            ((te) (Object) stackIn_14_0).a(stackIn_14_1, 33);
                            if (var7 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        param1.field_s[var4_int] = null;
                        break L4;
                      }
                      var4_int++;
                      continue L3;
                    } else {
                      return;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("hb.O(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        te discarded$1 = null;
        RuntimeException var6 = null;
        te var7 = null;
        te var9 = null;
        bb var10 = null;
        te var11 = null;
        te var12 = null;
        te var13 = null;
        te var14 = null;
        qa stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        qa stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof bb) {
                stackOut_2_0 = (qa) (param3);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (qa) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var10 = (bb) ((Object) stackIn_3_0);
              mi.a((byte) -52, param1 + (param3.field_y - -param3.field_u), param3.field_y + param1, param4 + (param3.field_z + param3.field_j), param4 + param3.field_z);
              if (var10 != null) {
                param2 = param2 & var10.field_D;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 <= -36) {
                break L3;
              } else {
                discarded$1 = this.a(3, 55);
                break L3;
              }
            }
            L4: {
              var7 = this.field_s[0];
              this.field_r.a(0);
              var7.a(this.field_r, param4, param3, (hb) (this), param1, -2);
              if (var10 == null) {
                break L4;
              } else {
                L5: {
                  if (var10.field_G) {
                    var11 = this.field_s[1];
                    if (var11 == null) {
                      break L5;
                    } else {
                      var11.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (var10.field_x) {
                  L6: {
                    L7: {
                      var12 = this.field_s[3];
                      if (0 == var10.field_v) {
                        break L7;
                      } else {
                        if (var12 != null) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      var9 = this.field_s[2];
                      if (var9 != null) {
                        var9.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (!fleas.field_A) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                  var12.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L9: {
              if (param3.e(1)) {
                var13 = this.field_s[5];
                if (var13 == null) {
                  break L9;
                } else {
                  var13.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (param2) {
                break L10;
              } else {
                var14 = this.field_s[4];
                if (var14 == null) {
                  break L10;
                } else {
                  var14.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                  break L10;
                }
              }
            }
            this.field_r.a((hb) (this), param3, 0, param4, param1);
            ia.a(-85);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var6);
            stackOut_32_1 = new StringBuilder().append("hb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param4 + ')');
        }
    }

    final void a(dd[] param0, int param1, int param2) {
        int var4_int = 0;
        try {
            if (param1 > -27) {
                field_t = -122;
            }
            var4_int = param2;
            if (this.field_s[var4_int] == null) {
                this.field_s[var4_int] = new te();
            }
            this.field_s[param2].field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "hb.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public hb() {
        this.field_s = new te[6];
        this.field_r = new te();
        te dupTemp$0 = new te();
        this.field_s[0] = dupTemp$0;
        te var1 = dupTemp$0;
        var1.a(0);
    }

    final te a(int param0, int param1) {
        if (param1 != -17562) {
            return (te) null;
        }
        te dupTemp$0 = new te();
        this.field_s[param0] = dupTemp$0;
        return dupTemp$0;
    }

    hb(hb param0, boolean param1) {
        this();
        try {
            param0.a(param1, (hb) (this), (byte) 70);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(dd param0, int param1) {
        te[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        te var5 = null;
        int var6 = 0;
        te[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var7 = this.field_s;
            var3 = var7;
            var4 = param1;
            L1: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                var5 = var7[var4];
                if (var6 == 0) {
                  L2: {
                    if (var5 == null) {
                      break L2;
                    } else {
                      var5.field_c = param0;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("hb.P(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        field_q = null;
        int var1 = -65 / ((param0 - -36) / 56);
    }

    final void a(byte param0, dd[] param1) {
        te discarded$2 = null;
        te[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        te var5 = null;
        int var6 = 0;
        te[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var7 = this.field_s;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 >= var7.length) {
                    break L3;
                  } else {
                    var5 = var7[var4];
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var5 != null) {
                          var5.field_g = param1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 61) {
                  break L2;
                } else {
                  discarded$2 = this.a(77, -61);
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("hb.L(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    static {
        field_q = "From only <%0>/month";
    }
}
