/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq {
    String field_c;
    int field_q;
    static boolean field_o;
    static String field_p;
    static String field_s;
    int field_j;
    String field_d;
    String[] field_m;
    sq field_l;
    int field_n;
    static String field_i;
    int field_t;
    lm[] field_f;
    boolean field_h;
    private String[] field_e;
    boolean field_r;
    static int field_a;
    int field_b;
    boolean field_k;
    String field_g;

    final static byte[] a(int param0, Object param1, boolean param2) {
        byte[] discarded$2 = null;
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        le var5 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_14_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (param1 instanceof byte[]) {
                var3 = (byte[]) (param1);
                if (param2) {
                  stackOut_8_0 = ck.a(var3, false);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_6_0 = (byte[]) (var3);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L1: {
                  if (param0 == -1) {
                    break L1;
                  } else {
                    var4 = (Object) null;
                    discarded$2 = sq.a(101, (Object) null, true);
                    break L1;
                  }
                }
                if (param1 instanceof le) {
                  var5 = (le) (param1);
                  stackOut_14_0 = var5.a(false);
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("sq.E(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 30712) {
            return;
        }
        if (this.field_m == null) {
            this.field_m = new String[]{param1};
            return;
        }
        try {
            var3_int = this.field_m.length;
            var4 = new String[var3_int - -1];
            for (var5 = 0; var5 < var3_int; var5++) {
                var4[var5] = this.field_m[var5];
            }
            this.field_m = var4;
            this.field_m[var3_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "sq.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (null != this.field_e) {
              var3_int = this.field_e.length;
              var4 = new String[1 + var3_int];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var3_int) {
                  L2: {
                    this.field_e = var4;
                    this.field_e[var3_int] = param0;
                    if (param1 == -47) {
                      break L2;
                    } else {
                      var7 = (String) null;
                      this.a(-110, (String) null);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4[var5] = this.field_e[var5];
                  var5++;
                  continue L1;
                }
              }
            } else {
              this.field_e = new String[]{param0};
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("sq.C(");
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
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, lm param1) {
        int var3_int = 0;
        lm[] var4 = null;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < 5) {
            return;
        }
        if (null == this.field_f) {
            this.field_f = new lm[]{param1};
            return;
        }
        try {
            var3_int = this.field_f.length;
            var4 = new lm[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
                var4[var5] = this.field_f[var5];
            }
            this.field_f = var4;
            this.field_f[var3_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "sq.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        sl var3 = js.field_f;
        var3.h(param1, 255);
        var3.c(3, (byte) -70);
        var3.c(8, (byte) -58);
        var3.d(param2, 255);
        if (param0 >= -18) {
            field_p = (String) null;
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return bh.field_j;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        wa var7_ref = null;
        int var8 = 0;
        wa var9 = null;
        wa var10 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if ((param0 ^ -1) > -1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (gf.field_k <= param0) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param5 == -27259) {
                    break L1;
                  } else {
                    field_i = (String) null;
                    break L1;
                  }
                }
                if (param2 == 0) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    if (-1 != (param3 ^ -1)) {
                      break L2;
                    } else {
                      if (0 == param1) {
                        if (param6 == 0) {
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          param2 = 1;
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      var9 = bj.field_J[param0];
                      var10 = var9;
                      var7_ref = var10;
                      if (var10 == null) {
                        break L4;
                      } else {
                        if (var10.field_g > param4) {
                          break L4;
                        } else {
                          L5: {
                            if (param4 != var10.field_g) {
                              break L5;
                            } else {
                              if (var10.field_h < param2) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: while (true) {
                            L7: {
                              if (null == var7_ref.field_c) {
                                break L7;
                              } else {
                                L8: {
                                  if (param4 > var7_ref.field_c.field_g) {
                                    break L8;
                                  } else {
                                    if (param4 != var7_ref.field_c.field_g) {
                                      break L7;
                                    } else {
                                      if (param2 >= var7_ref.field_c.field_h) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                var7_ref = var7_ref.field_c;
                                continue L6;
                              }
                            }
                            var7_ref.field_c = wi.a(param1, param6, var7_ref.field_c, param3, param2, param4, -3903);
                            break L3;
                          }
                        }
                      }
                    }
                    bj.field_J[param0] = wi.a(param1, param6, var9, param3, param2, param4, -3903);
                    break L3;
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var7), "sq.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_s = null;
        field_p = null;
        if (param0 < 126) {
            sq.a(-28, 66, 76);
        }
        field_i = null;
    }

    sq() {
        this.field_c = "";
        this.field_g = null;
    }

    static {
        field_s = "Allow spectators?";
        field_p = "<%0> fewer ships per turn";
        field_i = "Decline invitation to <%0>'s game";
    }
}
