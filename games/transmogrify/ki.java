/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends h {
    private ab field_p;
    private ab[] field_o;

    final static void a(boolean param0, int param1) {
        hj var2 = ff.field_D;
        var2.a(param0, param1);
        var2.f(6389, 1);
        var2.f(6389, 0);
    }

    final static boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return si.field_l > 250 ? true : false;
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        RuntimeException var6 = null;
        ab var7 = null;
        int var8 = 0;
        lj var10 = null;
        ab var11 = null;
        ab var12 = null;
        ab var13 = null;
        ab var14 = null;
        ab var15 = null;
        qg stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        qg stackOut_1_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof lj)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (qg) ((Object) stackOut_2_0);
                break L1;
              } else {
                stackOut_1_0 = (qg) (param4);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (lj) ((Object) stackIn_3_0);
              c.a(param4.field_p + (param0 - -param4.field_l), param4.field_p + param0, (byte) -50, param4.field_n + (param1 - -param4.field_h), param4.field_n + param1);
              if (var10 == null) {
                break L2;
              } else {
                param2 = param2 & var10.field_t;
                break L2;
              }
            }
            L3: {
              var7 = this.field_o[0];
              this.field_p.a(313);
              var7.a((ki) (this), (byte) -70, param0, param1, this.field_p, param4);
              if (var10 != null) {
                L4: {
                  if (var10.field_y) {
                    var11 = this.field_o[1];
                    if (var11 == null) {
                      break L4;
                    } else {
                      var11.a((ki) (this), (byte) -95, param0, param1, this.field_p, param4);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (var10.field_g) {
                  L5: {
                    L6: {
                      var13 = this.field_o[3];
                      if (var10.field_s == 0) {
                        break L6;
                      } else {
                        if (var13 != null) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      var12 = this.field_o[2];
                      if (var12 == null) {
                        break L7;
                      } else {
                        var12.a((ki) (this), (byte) -55, param0, param1, this.field_p, param4);
                        break L7;
                      }
                    }
                    if (!Transmogrify.field_A) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                  var13.a((ki) (this), (byte) -45, param0, param1, this.field_p, param4);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L8: {
              if (!param4.b((byte) -111)) {
                break L8;
              } else {
                var14 = this.field_o[5];
                if (var14 != null) {
                  var14.a((ki) (this), (byte) -107, param0, param1, this.field_p, param4);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              var8 = 127 % ((param3 - 51) / 47);
              if (param2) {
                break L9;
              } else {
                var15 = this.field_o[4];
                if (var15 != null) {
                  var15.a((ki) (this), (byte) -81, param0, param1, this.field_p, param4);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            this.field_p.a((byte) 21, (ki) (this), param1, param4, param0);
            fi.c(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var6);
            stackOut_30_1 = new StringBuilder().append("ki.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
    }

    final ab a(byte param0, int param1) {
        ab dupTemp$4 = null;
        ab dupTemp$5 = null;
        java.applet.Applet var4 = null;
        if (param0 != -21) {
          var4 = (java.applet.Applet) null;
          ki.a((byte) -43, (java.applet.Applet) null);
          dupTemp$4 = new ab();
          this.field_o[param1] = dupTemp$4;
          return dupTemp$4;
        } else {
          dupTemp$5 = new ab();
          this.field_o[param1] = dupTemp$5;
          return dupTemp$5;
        }
    }

    ki(ki param0, boolean param1) {
        this();
        try {
            param0.a(param1, (ki) (this), false);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ki.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, ki param1, boolean param2) {
        ab dupTemp$3 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ab var5 = null;
        ab var6 = null;
        int var7 = 0;
        ab stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ab stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ab stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ab stackIn_11_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ab stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ab stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ab stackOut_10_2 = null;
        ab stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ab stackOut_9_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            super.a((byte) -106, param1);
            if (!param2) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  var4_int = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (-7 >= (var4_int ^ -1)) {
                          break L4;
                        } else {
                          var5 = this.field_o[var4_int];
                          if (var7 != 0) {
                            break L3;
                          } else {
                            L5: {
                              L6: {
                                if (var5 == null) {
                                  break L6;
                                } else {
                                  L7: {
                                    var6 = param1.field_o[var4_int];
                                    stackOut_8_0 = (ab) (var5);
                                    stackOut_8_1 = 72;
                                    stackIn_10_0 = stackOut_8_0;
                                    stackIn_10_1 = stackOut_8_1;
                                    stackIn_9_0 = stackOut_8_0;
                                    stackIn_9_1 = stackOut_8_1;
                                    if (var6 == null) {
                                      dupTemp$3 = new ab();
                                      param1.field_o[var4_int] = dupTemp$3;
                                      stackOut_10_0 = (ab) ((Object) stackIn_10_0);
                                      stackOut_10_1 = stackIn_10_1;
                                      stackOut_10_2 = (ab) (dupTemp$3);
                                      stackIn_11_0 = stackOut_10_0;
                                      stackIn_11_1 = stackOut_10_1;
                                      stackIn_11_2 = stackOut_10_2;
                                      break L7;
                                    } else {
                                      stackOut_9_0 = (ab) ((Object) stackIn_9_0);
                                      stackOut_9_1 = stackIn_9_1;
                                      stackOut_9_2 = (ab) (var6);
                                      stackIn_11_0 = stackOut_9_0;
                                      stackIn_11_1 = stackOut_9_1;
                                      stackIn_11_2 = stackOut_9_2;
                                      break L7;
                                    }
                                  }
                                  ((ab) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2);
                                  if (var7 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              param1.field_o[var4_int] = null;
                              break L5;
                            }
                            var4_int++;
                            if (var7 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L1;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              ji.a(this.field_o, 0, param1.field_o, 0, 6);
              return;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("ki.J(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(ti[] param0, int param1) {
        ab[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ab var6 = null;
        int var7 = 0;
        ab[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4 = -26 / ((-58 - param1) / 38);
            var8 = this.field_o;
            var3 = var8;
            var5 = 0;
            L1: while (true) {
              if (var8.length <= var5) {
                break L0;
              } else {
                var6 = var8[var5];
                if (var7 == 0) {
                  L2: {
                    if (var6 != null) {
                      var6.field_i = param0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var5++;
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
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("ki.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, ti[] param2) {
        int var4_int = 0;
        if (param1 != -19106) {
            return;
        }
        try {
            var4_int = param0;
            if (!(this.field_o[var4_int] != null)) {
                this.field_o[var4_int] = new ab();
            }
            this.field_o[param0].field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ki.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ti param0, int param1) {
        ab[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ab var5 = null;
        int var6 = 0;
        ab[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var7 = this.field_o;
            var3 = var7;
            if (param1 == 1) {
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = var7[var4];
                  if (var6 == 0) {
                    L2: {
                      if (var5 != null) {
                        var5.field_d = param0;
                        break L2;
                      } else {
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("ki.F(");
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public ki() {
        this.field_o = new ab[6];
        this.field_p = new ab();
        ab dupTemp$0 = new ab();
        this.field_o[0] = dupTemp$0;
        ab var1 = dupTemp$0;
        var1.a(313);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        gb.a(param1, (byte) 83, "");
        if (param0 != 3) {
            return;
        }
        try {
            ol.a(param1, 30194);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ki.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
