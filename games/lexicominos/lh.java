/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ik {
    private n[] field_v;
    static int field_u;
    static boolean field_w;
    private n field_t;

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        RuntimeException var6 = null;
        n var7 = null;
        n var9 = null;
        kf var10 = null;
        n var11 = null;
        n var12 = null;
        n var13 = null;
        n var14 = null;
        w stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        w stackOut_1_0 = null;
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
              if (!(param3 instanceof kf)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (w) ((Object) stackOut_2_0);
                break L1;
              } else {
                stackOut_1_0 = (w) (param3);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (kf) ((Object) stackIn_3_0);
              ca.a(param3.field_t + (param1 + param3.field_j), param3.field_o + param0, param3.field_t + param1, param3.field_v + (param3.field_o + param0), false);
              if (var10 == null) {
                break L2;
              } else {
                param2 = param2 & var10.field_D;
                break L2;
              }
            }
            L3: {
              var7 = this.field_v[0];
              this.field_t.a(param4 + 3389);
              var7.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
              if (var10 == null) {
                break L3;
              } else {
                L4: {
                  if (var10.field_C) {
                    var11 = this.field_v[1];
                    if (var11 != null) {
                      var11.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (var10.field_m) {
                  L5: {
                    var12 = this.field_v[3];
                    if (0 == var10.field_h) {
                      break L5;
                    } else {
                      if (var12 == null) {
                        break L5;
                      } else {
                        var12.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                        if (!Lexicominos.field_L) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var9 = this.field_v[2];
                  if (var9 != null) {
                    var9.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L6: {
              if (param3.a(18337)) {
                var13 = this.field_v[5];
                if (var13 == null) {
                  break L6;
                } else {
                  var13.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!param2) {
                var14 = this.field_v[4];
                if (var14 == null) {
                  break L7;
                } else {
                  var14.a(param1, this.field_t, (byte) 76, param0, (lh) (this), param3);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (param4 == -3284) {
                break L8;
              } else {
                this.field_v = (n[]) null;
                break L8;
              }
            }
            this.field_t.a((lh) (this), param3, param1, param4 ^ 3254, param0);
            pd.a(param4 + -19665);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var6);
            stackOut_32_1 = new StringBuilder().append("lh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param4 + ')');
        }
    }

    public lh() {
        this.field_v = new n[6];
        this.field_t = new n();
        n dupTemp$0 = new n();
        this.field_v[0] = dupTemp$0;
        n var1 = dupTemp$0;
        var1.a(109);
    }

    private final void a(boolean param0, lh param1, int param2) {
        n dupTemp$3 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        n var5 = null;
        n var6 = null;
        int var7 = 0;
        n stackIn_9_0 = null;
        n stackIn_10_0 = null;
        n stackIn_11_0 = null;
        n stackIn_11_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        n stackOut_8_0 = null;
        n stackOut_10_0 = null;
        n stackOut_10_1 = null;
        n stackOut_9_0 = null;
        n stackOut_9_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param1, false);
                if (!param0) {
                  break L2;
                } else {
                  var4_int = 0;
                  L3: while (true) {
                    if (-7 >= (var4_int ^ -1)) {
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      var5 = this.field_v[var4_int];
                      if (var7 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (var5 != null) {
                              break L5;
                            } else {
                              param1.field_v[var4_int] = null;
                              if (var7 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            var6 = param1.field_v[var4_int];
                            stackOut_8_0 = (n) (var5);
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_9_0 = stackOut_8_0;
                            if (var6 != null) {
                              stackOut_10_0 = (n) ((Object) stackIn_10_0);
                              stackOut_10_1 = (n) (var6);
                              stackIn_11_0 = stackOut_10_0;
                              stackIn_11_1 = stackOut_10_1;
                              break L6;
                            } else {
                              dupTemp$3 = new n();
                              param1.field_v[var4_int] = dupTemp$3;
                              stackOut_9_0 = (n) ((Object) stackIn_9_0);
                              stackOut_9_1 = (n) (dupTemp$3);
                              stackIn_11_0 = stackOut_9_0;
                              stackIn_11_1 = stackOut_9_1;
                              break L6;
                            }
                          }
                          ((n) (Object) stackIn_11_0).a(stackIn_11_1, param2 ^ -25688);
                          break L4;
                        }
                        var4_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
              o.a(this.field_v, 0, param1.field_v, 0, 6);
              break L1;
            }
            if (param2 == 6) {
              break L0;
            } else {
              field_u = 31;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("lh.FA(").append(param0).append(',');
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
          throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
    }

    final void a(db[] param0, byte param1) {
        n[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        n var5 = null;
        int var6 = 0;
        n[] var7 = null;
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
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == -112) {
              var7 = this.field_v;
              var3 = var7;
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
                        var5.field_f = param0;
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
            stackOut_12_1 = new StringBuilder().append("lh.B(");
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
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    lh(lh param0, boolean param1) {
        this();
        try {
            param0.a(param1, (lh) (this), 6);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 == -24921) {
          if (wf.field_i >= 20) {
            if (ha.a(126)) {
              if (-1 > (be.field_l ^ -1)) {
                if (ca.d(true)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_w = false;
          if (wf.field_i >= 20) {
            if (ha.a(126)) {
              if (-1 > (be.field_l ^ -1)) {
                if (ca.d(true)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void a(int param0, db param1) {
        RuntimeException runtimeException = null;
        n[] var3 = null;
        int var3_int = 0;
        int var4 = 0;
        n var5 = null;
        int var6 = 0;
        n[] var7 = null;
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
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var7 = this.field_v;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              L2: {
                if (var4 >= var7.length) {
                  break L2;
                } else {
                  L3: {
                    var5 = var7[var4];
                    if (var5 != null) {
                      var5.field_j = param1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3_int = 45 / ((param0 - -58) / 39);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("lh.CA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final n a(boolean param0, int param1) {
        if (param0) {
            return (n) null;
        }
        n dupTemp$0 = new n();
        this.field_v[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(db[] param0, boolean param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param2;
            if (this.field_v[var4_int] == null) {
                this.field_v[var4_int] = new n();
            }
            if (param1) {
                this.field_v = (n[]) null;
            }
            this.field_v[param2].field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "lh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(wf param0, int param1) {
        int var2_int = 0;
        try {
            ki.field_g = param0.b(-1698573656) << 2051500101;
            var2_int = param0.d(true);
            ki.field_g = ki.field_g + (var2_int >> -88380445);
            sg.field_a = 1835008 & var2_int << 606181778;
            sg.field_a = sg.field_a + (param0.b(-1698573656) << 1599213154);
            var2_int = param0.d(true);
            hh.field_I = (63 & var2_int) << 14035983;
            sg.field_a = sg.field_a + (var2_int >> -723920378);
            hh.field_I = hh.field_I + (param0.d(true) << -953531545);
            if (param1 != -95) {
                wf var3 = (wf) null;
                lh.a((wf) null, 6);
            }
            var2_int = param0.d(true);
            hh.field_I = hh.field_I + (var2_int >> 436105121);
            th.field_s = var2_int << 15324528 & 65536;
            th.field_s = th.field_s + param0.b(-1698573656);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "lh.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_u = 0;
        field_w = false;
    }
}
