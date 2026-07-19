/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends l {
    static int field_y;
    private kj[] field_v;
    static String field_t;
    static String field_u;
    static int field_B;
    private kj field_x;
    static nh[] field_z;
    static String field_w;
    static int field_A;

    public static void b(byte param0) {
        field_z = null;
        field_u = null;
        field_w = null;
        if (param0 <= 69) {
            field_t = (String) null;
        }
        field_t = null;
    }

    final void a(int param0, nh[] param1) {
        kj[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        kj var5 = null;
        int var6 = 0;
        kj[] var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var7 = this.field_v;
            var3 = var7;
            var4 = param0;
            L1: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L2;
                  } else {
                    var5.field_c = param1;
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
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("ch.V(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void c(int param0) {
        sh.field_e = false;
        wg.field_h = null;
        if (param0 != 3) {
            field_B = 33;
        }
        ga.field_i = null;
        ng.field_d = null;
        lk.field_i = null;
    }

    public ch() {
        this.field_v = new kj[6];
        this.field_x = new kj();
        kj dupTemp$0 = new kj();
        this.field_v[0] = dupTemp$0;
        kj var1 = dupTemp$0;
        var1.b(0);
    }

    final void a(nh[] param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param1;
            if (!(this.field_v[var4_int] != null)) {
                this.field_v[var4_int] = new kj();
            }
            if (param2 < 116) {
                field_t = (String) null;
            }
            this.field_v[param1].field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ch.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    ch(ch param0, boolean param1) {
        this();
        try {
            param0.a((ch) (this), param1, 28905);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ch.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final kj a(byte param0, int param1) {
        if (param0 <= 54) {
            this.field_v = (kj[]) null;
        }
        kj dupTemp$0 = new kj();
        this.field_v[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(int param0, nh param1) {
        kj[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        kj var5 = null;
        int var6 = 0;
        ch var7 = null;
        kj[] var8 = null;
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
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = this.field_v;
              var3 = var8;
              if (param0 == -32680) {
                break L1;
              } else {
                var7 = (ch) null;
                this.a((ch) null, false, 11);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var8.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 != null) {
                    var5.field_e = param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("ch.CA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        RuntimeException var6 = null;
        kj var7 = null;
        kj var9 = null;
        nh[] var10 = null;
        hf var11 = null;
        kj var12 = null;
        kj var13 = null;
        kj var14 = null;
        kj var15 = null;
        vg stackIn_3_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        vg stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (param2 instanceof hf) {
                stackOut_2_0 = (vg) (param2);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (vg) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var11 = (hf) ((Object) stackIn_3_0);
              ib.a(param3 - -param2.field_m, param2.field_m + (param3 - -param2.field_k), (byte) 16, param4 + param2.field_o + param2.field_w, param4 - -param2.field_o);
              if (var11 == null) {
                break L2;
              } else {
                param0 = param0 & var11.field_E;
                break L2;
              }
            }
            L3: {
              var7 = this.field_v[0];
              this.field_x.b(0);
              var7.a(param4, (ch) (this), true, param3, param2, this.field_x);
              if (var11 != null) {
                L4: {
                  if (!var11.field_A) {
                    break L4;
                  } else {
                    var12 = this.field_v[1];
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a(param4, (ch) (this), true, param3, param2, this.field_x);
                      break L4;
                    }
                  }
                }
                if (!var11.field_n) {
                  break L3;
                } else {
                  L5: {
                    var13 = this.field_v[3];
                    if (var11.field_y == 0) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a(param4, (ch) (this), true, param3, param2, this.field_x);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var9 = this.field_v[2];
                  if (var9 != null) {
                    var9.a(param4, (ch) (this), true, param3, param2, this.field_x);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (!param2.a(true)) {
                break L6;
              } else {
                var14 = this.field_v[5];
                if (var14 == null) {
                  break L6;
                } else {
                  var14.a(param4, (ch) (this), true, param3, param2, this.field_x);
                  break L6;
                }
              }
            }
            L7: {
              if (param0) {
                break L7;
              } else {
                var15 = this.field_v[4];
                if (var15 != null) {
                  var15.a(param4, (ch) (this), true, param3, param2, this.field_x);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              this.field_x.a((ch) (this), param2, true, param3, param4);
              if (param1 > 94) {
                break L8;
              } else {
                var10 = (nh[]) null;
                this.a((nh[]) null, -43, 125);
                break L8;
              }
            }
            cl.d((byte) -110);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var6);
            stackOut_29_1 = new StringBuilder().append("ch.J(").append(param0).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(ch param0, boolean param1, int param2) {
        kj dupTemp$17 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        kj var5 = null;
        kj var6 = null;
        int var7 = 0;
        kj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        kj stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        kj stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        kj stackIn_10_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        kj stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        kj stackOut_9_2 = null;
        kj stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        kj stackOut_8_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            super.a(param0, 117);
            if (param2 == 28905) {
              L1: {
                if (!param1) {
                  kg.a(this.field_v, 0, param0.field_v, 0, 6);
                  break L1;
                } else {
                  var4_int = 0;
                  L2: while (true) {
                    if ((var4_int ^ -1) <= -7) {
                      break L1;
                    } else {
                      L3: {
                        var5 = this.field_v[var4_int];
                        if (var5 == null) {
                          param0.field_v[var4_int] = null;
                          break L3;
                        } else {
                          L4: {
                            var6 = param0.field_v[var4_int];
                            stackOut_7_0 = (kj) (var5);
                            stackOut_7_1 = -7;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            if (var6 == null) {
                              dupTemp$17 = new kj();
                              param0.field_v[var4_int] = dupTemp$17;
                              stackOut_9_0 = (kj) ((Object) stackIn_9_0);
                              stackOut_9_1 = stackIn_9_1;
                              stackOut_9_2 = (kj) (dupTemp$17);
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              stackIn_10_2 = stackOut_9_2;
                              break L4;
                            } else {
                              stackOut_8_0 = (kj) ((Object) stackIn_8_0);
                              stackOut_8_1 = stackIn_8_1;
                              stackOut_8_2 = (kj) (var6);
                              stackIn_10_0 = stackOut_8_0;
                              stackIn_10_1 = stackOut_8_1;
                              stackIn_10_2 = stackOut_8_2;
                              break L4;
                            }
                          }
                          ((kj) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2);
                          break L3;
                        }
                      }
                      var4_int++;
                      continue L2;
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
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("ch.DA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_t = "Suggested names: ";
        field_u = "Type your password again to make sure it's correct";
        field_w = "Select weapon";
    }
}
