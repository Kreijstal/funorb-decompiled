/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qo {
    static int field_b;
    static int field_a;
    static int[] field_c;
    ha[] field_d;
    static ln field_e;

    final int a(byte param0, int param1) {
        ha var4 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = 0;
        if (param0 < 43) {
            qo.a(55);
        }
        while (this.field_d.length > var3) {
            var4 = this.field_d[var3];
            if (var4.field_b.length > param1) {
                return var3;
            }
            param1 = param1 - (var4.field_b.length - 1);
            var3++;
        }
        return this.field_d.length;
    }

    final static void a(int param0, int param1) {
        int var2 = (kh.field_Mb - 640) / 2;
        int var3 = ed.field_f * ed.field_f;
        int var4 = var3 - param1 * param1;
        if (param0 != 22353) {
            field_b = 102;
        }
        am.field_xb.a(199, gf.field_k + -120 - 94, (byte) 109, 90, var2 - 199 * var4 / var3);
        pf.field_g.a(438, -124 + gf.field_k, (byte) 77, 0, 438 * var4 / var3 + var2 + 202);
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        int var1 = -47 % ((param0 - -43) / 59);
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 438) {
          L0: {
            L1: {
              if (null == this.field_d) {
                break L1;
              } else {
                if (-1 <= (this.field_d.length ^ -1)) {
                  break L1;
                } else {
                  stackIn_6_0 = this.field_d[this.field_d.length + -1].field_c - this.field_d[0].field_e;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return 23;
        }
    }

    final int c(int param0) {
        int var2;
        ha[] var3_ref_ha__;
        int var4;
        ha var5;
        int var7;
        int var3;
        int var6;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = -1;
          if (null == this.field_d) {
            break L0;
          } else {
            var3_ref_ha__ = this.field_d;
            var4 = 0;
            L1: while (true) {
              if (var3_ref_ha__.length <= var4) {
                break L0;
              } else {
                var5 = var3_ref_ha__[var4];
                if (var5 != null) {
                  var6 = var5.b(35);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        var3 = -49 % ((param0 - 25) / 59);
        return var2;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == -28135) {
              var5_int = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              L1: while (true) {
                if (var7 <= var8) {
                  if ((var5_int ^ -1) < -1) {
                    stackIn_21_0 = (param1 + -param2 << 1998035880) / var5_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackIn_23_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L2: {
                    var9 = param3.charAt(var8);
                    if (var9 == 60) {
                      var6 = 1;
                      break L2;
                    } else {
                      if (var9 != 62) {
                        if (var6 == 0) {
                          if (var9 == 32) {
                            var5_int++;
                            break L2;
                          } else {
                            var8++;
                            continue L1;
                          }
                        } else {
                          var8++;
                          continue L1;
                        }
                      } else {
                        var6 = 0;
                        break L2;
                      }
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 43;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("qo.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0;
          } else {
            return stackIn_23_0;
          }
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        ha var6;
        int var7;
        int var8;
        L0: {
          var8 = ShatteredPlansClient.field_F ? 1 : 0;
          if (this.field_d == null) {
            break L0;
          } else {
            if (this.field_d.length == 0) {
              break L0;
            } else {
              if (this.field_d[0].field_e > param2) {
                break L0;
              } else {
                if (this.field_d[this.field_d.length + -1].field_c < param2) {
                  return -1;
                } else {
                  if ((this.field_d.length ^ -1) == -2) {
                    return this.field_d[0].a(false, param0);
                  } else {
                    L1: {
                      var4 = 0;
                      if (param1 == 3357) {
                        break L1;
                      } else {
                        this.b(-63);
                        break L1;
                      }
                    }
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= this.field_d.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = this.field_d[var5];
                          if (param2 < var6.field_e) {
                            break L3;
                          } else {
                            if (var6.field_c < param2) {
                              break L3;
                            } else {
                              var7 = var6.a(false, param0);
                              if ((var7 ^ -1) == 0) {
                                return -1;
                              } else {
                                return var4 - -var7;
                              }
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_b.length);
                        var5++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final int a(boolean param0, int param1) {
        ha var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        ha[] var3 = this.field_d;
        int var4 = 0;
        if (!param0) {
            field_c = (int[]) null;
        }
        while (var3.length > var4) {
            var5 = var3[var4];
            if (var5.field_b.length > param1) {
                return var5.field_b[param1];
            }
            param1 = param1 - (var5.field_b.length + -1);
            var4++;
        }
        return 0;
    }

    static {
        field_c = new int[8192];
    }
}
