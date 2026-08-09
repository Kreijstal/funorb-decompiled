/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jl {
    int field_o;
    private int field_i;
    ih field_h;
    private int field_g;
    private String[] field_b;
    private String field_m;
    static cn field_n;
    static int field_a;
    private int field_j;
    private int field_e;
    private int field_k;
    int field_d;
    static String field_l;
    int field_f;
    static int[] field_p;
    static String field_c;

    void a(int param0, ih param1, int param2, int param3) {
        try {
            int var5_int = 107 / ((param3 - 47) / 60);
            this.field_k = param2;
            this.field_j = param0;
            this.field_h = param1;
            this.a((byte) 102);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "jl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(String[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            if (this.field_h != null) {
              if (param0 == null) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.length == 0) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var3_int = 0;
                  var4 = param0;
                  var5 = param1;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      stackIn_19_0 = var3_int;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L2: {
                        var6 = var4[var5];
                        var7 = this.field_h.b(var6);
                        if (var3_int <= var7) {
                          var3_int = var7;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("jl.M(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_19_0;
            }
          }
        }
    }

    private final void a(byte param0) {
        int var2 = 640;
        if (param0 <= 39) {
            field_c = (String) null;
        }
        this.field_d = var2 / 2;
        this.field_g = var2 / 2;
        this.field_o = var2 * 3 / 4;
        this.field_f = this.c((byte) 111);
        this.field_i = this.field_f / 2;
        this.field_e = this.field_f + (this.field_i - -this.a(this.field_b, (byte) 113));
    }

    final static void b(int param0) {
        se.a((byte) 86, oc.d((byte) -91));
        if (param0 != 2) {
            jl.a(8);
        }
    }

    public static void a(int param0) {
        field_n = null;
        if (param0 != -30082) {
            jl.a(113);
        }
        field_l = null;
        field_p = null;
        field_c = null;
    }

    final int b(int param0, int param1) {
        if (this.field_h == null) {
            return param0;
        }
        if (!(this.field_m != null)) {
            return param0;
        }
        if (!(this.field_m.length() != 0)) {
            return param0;
        }
        this.field_h.c(this.field_m, this.field_g, param0, this.field_k, -1);
        if (param1 != 13947) {
            return 12;
        }
        return this.field_f - -this.field_i;
    }

    final int a(boolean param0) {
        if (!param0) {
            this.field_f = 117;
        }
        return this.field_o;
    }

    private final void a(boolean param0, int param1) {
        int var4;
        String var5;
        int var16;
        String[] var17;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        var16 = EscapeVector.field_A;
        if (this.field_h != null) {
          if (this.field_b == null) {
            return;
          } else {
            if (-1 != (this.field_b.length ^ -1)) {
              L0: {
                var17 = this.field_b;
                if (param0) {
                  break L0;
                } else {
                  this.a((byte) 91, 82);
                  break L0;
                }
              }
              var4 = 0;
              L1: while (true) {
                if (var17.length <= var4) {
                  return;
                } else {
                  var5 = var17[var4];
                  if (var5 != null) {
                    if (var5.length() != 0) {
                      var6 = 640;
                      var7 = (-this.field_o + var6) / 2;
                      var8 = param1 + -this.field_h.field_r;
                      var9 = this.field_o;
                      var10 = this.field_j;
                      var11 = -1;
                      var12 = 1;
                      var13 = 0;
                      var14 = this.field_f;
                      var15 = this.field_h.a(var5, var7, var8, var9, param1, var10, var11, var12, var13, var14);
                      param1 = param1 + var15 * this.field_f;
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
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, int param1) {
        this.field_d = this.field_d + param1;
        this.field_g = this.field_g + param1;
        if (param0 > -64) {
            this.field_f = 52;
        }
    }

    final int b(byte param0) {
        if (param0 != -90) {
            this.a((byte) -46);
        }
        return this.field_e;
    }

    private final int a(String[] param0, byte param1) {
        int var3_int = 0;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var7 = 0;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            if (this.field_h != null) {
              if (param0 == null) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.length == 0) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    if (param1 > 97) {
                      break L1;
                    } else {
                      this.field_e = 12;
                      break L1;
                    }
                  }
                  var3_int = 0;
                  var4 = param0;
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      stackIn_23_0 = var3_int;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        var6 = var4[var5];
                        if (var6 != null) {
                          if (0 != var6.length()) {
                            var7 = this.field_h.a(var6, this.field_o);
                            var3_int = var3_int + var7 * this.field_f;
                            break L3;
                          } else {
                            var5++;
                            continue L2;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("jl.J(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_23_0;
            }
          }
        }
    }

    final int c(byte param0) {
        if (param0 <= 98) {
            return -42;
        }
        int var2 = 0;
        if (this.field_h != null) {
            var2 = this.field_h.field_r + this.field_h.field_x;
        } else {
            var2 = 0;
        }
        return var2;
    }

    void a(int param0, int param1) {
        if (null == this.field_h) {
            return;
        }
        int var3 = this.field_h.field_r;
        param0 = param0 + var3;
        param0 = param0 + this.b(param0, 13947);
        this.a(true, param0);
        if (param1 != 3) {
            this.field_h = (ih) null;
        }
    }

    jl(String param0, String[] param1) {
        try {
            if (param0 != null) {
                this.field_m = param0.toUpperCase();
            }
            this.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 35;
        field_n = new cn();
        field_l = "Please try again in a few minutes.";
        field_p = new int[8192];
        field_c = "Restarting level";
    }
}
