/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends e {
    private te[] field_s;
    static int field_t;
    static String field_q;
    private te field_r;

    private final void a(boolean param0, hb param1, byte param2) {
        te dupTemp$2 = null;
        int var4_int = 0;
        te var5 = null;
        te var6 = null;
        int var7 = 0;
        te stackIn_10_0 = null;
        te stackIn_11_0 = null;
        te stackIn_11_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            super.a(2, param1);
            if (param2 == 70) {
              L1: {
                if (param0) {
                  var4_int = 0;
                  L2: while (true) {
                    if (6 <= var4_int) {
                      break L1;
                    } else {
                      L3: {
                        var5 = this.field_s[var4_int];
                        if (var5 == null) {
                          param1.field_s[var4_int] = null;
                          break L3;
                        } else {
                          L4: {
                            var6 = param1.field_s[var4_int];
                            stackIn_10_0 = (te) (var5);

                            if (var6 == null) {
                              dupTemp$2 = new te();
                              param1.field_s[var4_int] = dupTemp$2;
                              stackIn_11_0 = (te) ((Object) stackIn_10_0);
                              stackIn_11_1 = (te) (dupTemp$2);
                              break L4;
                            } else {
                              stackIn_11_0 = (te) ((Object) stackIn_10_0);
                              stackIn_11_1 = (te) (var6);
                              break L4;
                            }
                          }
                          ((te) (Object) stackIn_11_0).a(stackIn_11_1, 33);
                          break L3;
                        }
                      }
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  dm.a(this.field_s, 0, param1.field_s, 0, 6);
                  break L1;
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
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("hb.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        qa stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        te var7 = null;
        te var9 = null;
        bb var10 = null;
        te var11 = null;
        te var12 = null;
        te var13 = null;
        te var14 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof bb) {
                stackIn_3_0 = (qa) (param3);
                break L1;
              } else {
                stackIn_3_0 = null;
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
                this.a(3, 55);
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
                    var12 = this.field_s[3];
                    if (0 == var10.field_v) {
                      break L6;
                    } else {
                      if (var12 != null) {
                        var12.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = this.field_s[2];
                  if (var9 != null) {
                    var9.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            L7: {
              if (param3.e(1)) {
                var13 = this.field_s[5];
                if (var13 == null) {
                  break L7;
                } else {
                  var13.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (param2) {
                break L8;
              } else {
                var14 = this.field_s[4];
                if (var14 == null) {
                  break L8;
                } else {
                  var14.a(this.field_r, param4, param3, (hb) (this), param1, -2);
                  break L8;
                }
              }
            }
            this.field_r.a((hb) (this), param3, 0, param4, param1);
            ia.a(-85);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var6);

            stackIn_33_1 = new StringBuilder().append("hb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param4 + ')');
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
        int var4 = 0;
        te var5 = null;
        int var6 = 0;
        te[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
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
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L2;
                  } else {
                    var5.field_c = param0;
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("hb.P(");

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
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        field_q = null;
        int var1 = -65 / ((param0 - -36) / 56);
    }

    final void a(byte param0, dd[] param1) {
        te[] var3 = null;
        int var4 = 0;
        te var5 = null;
        int var6 = 0;
        te[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var7 = this.field_s;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var7.length) {
                L2: {
                  if (param0 == 61) {
                    break L2;
                  } else {
                    this.a(77, -61);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_g = param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("hb.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    static {
        field_q = "From only <%0>/month";
    }
}
