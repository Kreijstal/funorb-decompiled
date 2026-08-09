/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends pg {
    private wl field_i;
    private boolean field_n;
    static int[] field_j;
    private String field_g;
    private int field_m;
    private int field_l;
    static tk field_p;
    private int field_k;
    private int field_o;
    private int field_h;

    final void a(wl param0, String param1, int param2, int param3, byte param4) {
        vl discarded$0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        wl var7 = null;
        vl var9 = null;
        vl var10 = null;
        try {
          L0: {
            L1: {
              if (param4 == 69) {
                break L1;
              } else {
                var7 = (wl) null;
                discarded$0 = this.a((String) null, 107, 116, (wl) null);
                break L1;
              }
            }
            if (param1 == null) {
              this.field_a = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 != this.field_i) {
                  break L2;
                } else {
                  if (!this.field_n) {
                    break L2;
                  } else {
                    if ((this.field_l ^ -1) != -3) {
                      break L2;
                    } else {
                      if (null == this.field_g) {
                        break L2;
                      } else {
                        if (!this.field_g.equals(param1)) {
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
              this.field_l = 2;
              this.field_n = true;
              this.field_g = param1;
              this.field_i = param0;
              var9 = this.a(param1, param3, 116, param0);
              var10 = var9;
              var10.field_b[0] = -param0.b(param1) + param2;
              var10.field_b[param1.length()] = param2;
              vi.a(0, param1, var10, param0, false);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("wh.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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

    private final vl a(String param0, int param1, int param2, wl param3) {
        vl var5 = null;
        RuntimeException var5_ref = null;
        vl var6 = null;
        vl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = new vl(-param3.field_r + param1, param1 + param3.field_x, param0.length());
              var5 = var6;
              if (param2 > 112) {
                break L1;
              } else {
                field_j = (int[]) null;
                break L1;
              }
            }
            this.field_a = new vl[]{var6};
            stackIn_3_0 = (vl) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("wh.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, String param1, wl param2, int param3, int param4, int param5, int param6, byte param7) {
        vl stackIn_35_0;
        vl stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        vl stackIn_36_0 = null;
        vl stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        vl var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        var16 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (-1 != (param6 ^ -1)) {
                break L1;
              } else {
                param6 = param2.field_y;
                break L1;
              }
            }
            if (param1 == null) {
              this.field_a = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (this.field_i != param2) {
                  break L2;
                } else {
                  if (this.field_n) {
                    break L2;
                  } else {
                    if (param4 != this.field_l) {
                      break L2;
                    } else {
                      if (param5 != this.field_h) {
                        break L2;
                      } else {
                        if (this.field_k != param6) {
                          break L2;
                        } else {
                          if (this.field_m != param0) {
                            break L2;
                          } else {
                            if (param3 != this.field_o) {
                              break L2;
                            } else {
                              if (null == this.field_g) {
                                break L2;
                              } else {
                                if (this.field_g.equals(param1)) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L2;
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
                this.field_g = param1;
                this.field_h = param5;
                this.field_k = param6;
                this.field_m = param0;
                this.field_i = param2;
                this.field_l = param4;
                this.field_o = param3;
                this.field_n = false;
                var17 = new String[param2.a(param1, param3) - -1];
                var18 = var17;
                var10 = Math.max(1, param2.a(param1, new int[]{param3}, var18));
                var12 = 55 / ((param7 - 65) / 32);
                if (-4 != (this.field_h ^ -1)) {
                  break L3;
                } else {
                  if (-2 != (var10 ^ -1)) {
                    break L3;
                  } else {
                    this.field_h = 1;
                    break L3;
                  }
                }
              }
              L4: {
                this.field_a = new vl[var10];
                if (this.field_h == 0) {
                  var11 = param2.field_r;
                  break L4;
                } else {
                  if (-2 != (this.field_h ^ -1)) {
                    if (2 != this.field_h) {
                      L5: {
                        var13 = (-(var10 * this.field_k) + this.field_m) / (var10 + 1);
                        if (0 > var13) {
                          var13 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.field_k = this.field_k + var13;
                      var11 = param2.field_r + var13;
                      break L4;
                    } else {
                      var11 = -param2.field_x + (this.field_m - var10 * this.field_k);
                      break L4;
                    }
                  } else {
                    var11 = (-(this.field_k * var10) + this.field_m >> 2027795809) + param2.field_r;
                    break L4;
                  }
                }
              }
              var13 = 0;
              L6: while (true) {
                if (var10 <= var13) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L7: {
                    var14 = var17[var13];
                    stackIn_35_0 = null;

                    stackIn_35_1 = null;

                    stackIn_35_2 = var11 + -param2.field_r;

                    stackIn_35_3 = var11 - -param2.field_x;

                    if (var14 != null) {
                      stackIn_36_0 = null;
                      stackIn_36_1 = null;
                      stackIn_36_2 = stackIn_35_2;
                      stackIn_36_3 = stackIn_35_3;
                      stackIn_36_4 = var14.length();
                      break L7;
                    } else {
                      stackIn_36_0 = null;
                      stackIn_36_1 = null;
                      stackIn_36_2 = stackIn_35_2;
                      stackIn_36_3 = stackIn_35_3;
                      stackIn_36_4 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var15 = new vl(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                    var15.field_b[0] = 0;
                    if (var14 == null) {
                      break L8;
                    } else {
                      L9: {
                        var15.field_b[var14.length()] = param2.b(var14);
                        if (3 != param4) {
                          stackIn_40_0 = 0;
                          break L9;
                        } else {
                          stackIn_40_0 = this.a(-21446, param2.b(var14), var14, param3);
                          break L9;
                        }
                      }
                      vi.a(stackIn_40_0, var14, var15, param2, false);
                      break L8;
                    }
                  }
                  this.field_a[var13] = var15;
                  var11 = var11 + param6;
                  var13++;
                  continue L6;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var9);

            stackIn_45_1 = new StringBuilder().append("wh.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L10;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');

            if (param2 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L11;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L11;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_46_0), stackIn_49_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final void a(String param0, int param1, int param2, int param3, wl param4) {
        vl var7 = null;
        vl var8 = null;
        if (!(param0 != null)) {
            this.field_a = null;
            return;
        }
        if (this.field_i == param4 && this.field_n && this.field_l == 0 && null != this.field_g) {
            if (!(!this.field_g.equals(param0))) {
                return;
            }
        }
        try {
            this.field_g = param0;
            this.field_l = 0;
            this.field_i = param4;
            this.field_n = true;
            var7 = this.a(param0, param3, param1 + 117, param4);
            var8 = var7;
            var7.field_b[0] = param2;
            var8.field_b[param0.length()] = param2 - -param4.b(param0);
            vi.a(param1, param0, var8, param4, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_p = null;
        if (!param0) {
            wh.a(true);
            field_j = null;
            return;
        }
        field_j = null;
    }

    final void a(String param0, int param1, wl param2, int param3, boolean param4) {
        vl var8 = null;
        int var7 = 0;
        if (!(param0 != null)) {
            this.field_a = null;
            return;
        }
        if (param2 == this.field_i && this.field_n && this.field_l == 1 && this.field_g != null && this.field_g.equals(param0)) {
            return;
        }
        try {
            this.field_i = param2;
            this.field_n = param4 ? true : false;
            this.field_l = 1;
            var8 = this.a(param0, param3, 117, param2);
            var7 = param2.b(param0);
            var8.field_b[0] = -(var7 >> -1372458751) + param1;
            var8.field_b[param0.length()] = (var7 >> 1641083553) + param1;
            vi.a(0, param0, var8, param2, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wh.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public wh() {
    }

    static {
        field_p = new tk();
    }
}
