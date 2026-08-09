/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    private ad field_h;
    static int field_b;
    static int field_a;
    private ad field_c;
    static int field_d;
    private cg field_g;
    static String[] field_e;
    private cg field_f;

    final td a(int param0, int param1, int param2) {
        if (param0 != -18480) {
          this.field_f = (cg) null;
          return this.a((byte) -108, param2, (int[]) null, param1);
        } else {
          return this.a((byte) -108, param2, (int[]) null, param1);
        }
    }

    public static void b(int param0) {
        if (param0 > -58) {
            return;
        }
        field_e = null;
    }

    private final td a(int param0, int[] param1, String param2) {
        td discarded$1 = null;
        RuntimeException var4 = null;
        String var5 = null;
        td stackIn_3_0 = null;
        td stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_c.b("", (byte) 8)) {
              stackIn_3_0 = this.a(1620678500, "", param1, param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 24002) {
                  break L1;
                } else {
                  var5 = (String) null;
                  discarded$1 = this.a(-78, (int[]) null, (String) null);
                  break L1;
                }
              }
              stackIn_7_0 = this.a(1620678500, param2, param1, "");
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ud.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    private final td a(byte param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        td var8 = null;
        g var9 = null;
        int var10 = 0;
        td var11 = null;
        td stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        td stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = (param3 >>> 1610302188 | param3 << 1620678500 & 65528) ^ param1;
            var5_int = var5_int | param3 << 849676080;
            var6 = (long)var5_int;
            var8 = (td) ((Object) this.field_f.a((byte) 125, var6));
            if (var8 != null) {
              stackIn_3_0 = (td) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if (0 < param2[0]) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var9 = g.a(this.field_c, param3, param1);
              if (var9 != null) {
                L2: {
                  var11 = var9.b();
                  var8 = var11;
                  this.field_f.a(var8, var6, (byte) -36);
                  if (param2 == null) {
                    break L2;
                  } else {
                    param2[0] = param2[0] - var11.field_j.length;
                    break L2;
                  }
                }
                var10 = 23 % ((-33 - param0) / 40);
                stackIn_14_0 = (td) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_10_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("ud.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (td) ((Object) stackIn_10_0);
          } else {
            return stackIn_14_0;
          }
        }
    }

    final td a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        td stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 127 / ((param1 - 41) / 53);
            stackIn_1_0 = this.a(24002, (int[]) null, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ud.A(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final td a(int param0, int param1, boolean param2) {
        if (!param2) {
          this.a(-109, -44, false);
          return this.a((int[]) null, 34, param0, param1);
        } else {
          return this.a((int[]) null, 34, param0, param1);
        }
    }

    final static void a(int param0) {
        ff.a(true, -125, ac.field_c, v.field_b);
        ja.field_F = true;
        if (param0 < 42) {
            field_a = 104;
        }
    }

    private final td a(int[] param0, int param1, int param2, int param3) {
        td stackIn_2_0 = null;
        td stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        td var8 = null;
        sf var9 = null;
        try {
          L0: {
            var5_int = (param3 << 262288804 & 65526 | param3 >>> 2131861996) ^ param2;
            var5_int = var5_int | param3 << 199220784;
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (td) ((Object) this.field_f.a((byte) 114, var6));
            if (var8 == null) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (0 < param0[0]) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              L2: {
                if (param1 > 7) {
                  break L2;
                } else {
                  this.field_c = (ad) null;
                  break L2;
                }
              }
              L3: {
                var9 = (sf) ((Object) this.field_g.a((byte) 127, var6));
                if (var9 == null) {
                  var9 = sf.a(this.field_h, param3, param2);
                  if (var9 != null) {
                    this.field_g.a(var9, var6, (byte) -36);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8 = var9.a(param0);
              if (var8 != null) {
                var9.c(-19822);
                this.field_f.a(var8, var6, (byte) -36);
                stackIn_19_0 = (td) (var8);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (td) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("ud.H(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_19_0;
        }
    }

    private final td a(int param0, String param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        td stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = this.field_c.c(param1, (byte) -105);
            if (-1 >= (var5_int ^ -1)) {
              var6 = this.field_c.a(param3, var5_int, -28459);
              if (-1 >= (var6 ^ -1)) {
                L1: {
                  if (param0 == 1620678500) {
                    break L1;
                  } else {
                    this.field_f = (cg) null;
                    break L1;
                  }
                }
                stackIn_9_0 = this.a((byte) 13, var6, param2, var5_int);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ud.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (td) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (td) ((Object) stackIn_5_0);
          } else {
            return stackIn_9_0;
          }
        }
    }

    ud(ad param0, ad param1) {
        this.field_g = new cg(256);
        this.field_f = new cg(256);
        try {
            this.field_h = param1;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = 500;
    }
}
