/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends hl {
    private int field_Mb;
    private oh[] field_Zb;
    static ei field_bc;
    private int field_Yb;
    static int field_Pb;
    private int[] field_Sb;
    static String field_Kb;
    private int field_Rb;
    private int field_Qb;
    private int field_Tb;
    private hl field_Ob;
    static int field_Nb;
    static int field_Vb;
    private nh[] field_Lb;
    private int field_ac;
    static ve field_Wb;
    private int field_Xb;
    private hl field_Ub;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TetraLink.field_J;
        if (this.field_Rb != 0) {
          var6 = 0;
          var7 = 0;
          L0: while (true) {
            if (this.field_Rb <= var7) {
              var6 = var6 + 2 * this.field_Tb;
              var7 = this.field_Yb + this.field_Yb + this.field_Rb * this.field_Xb;
              var8 = eo.a(var6, (byte) 123, param4, param0);
              var9 = mh.a(param3, param1, var7, -8748);
              this.a((byte) -80, var6, var9, var7, var8);
              var10 = 0;
              if (param2 < -13) {
                L1: while (true) {
                  if (this.field_Rb > var10) {
                    this.field_Lb[var10].b(0, var6 - 2 * this.field_Tb, this.field_Yb + var10 * this.field_Xb, this.field_Qb, this.field_Tb, this.field_Mb, this.field_Xb);
                    var10++;
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              var8 = this.field_Lb[var7].b(-26606, this.field_Qb, this.field_Mb);
              if (var6 < var8) {
                var6 = var8;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          this.field_Lb[this.field_Rb] = new nh(0L, (hl) null, (hl) null, this.field_Ob, (oh) null, field_Kb);
          this.field_Lb[this.field_Rb].field_J = 1;
          this.a((byte) -95, this.field_Lb[this.field_Rb]);
          this.field_Sb[this.field_Rb] = -1;
          this.field_Rb = this.field_Rb + 1;
          var6 = 0;
          var7 = 0;
          L2: while (true) {
            if (this.field_Rb <= var7) {
              var6 = var6 + 2 * this.field_Tb;
              var7 = this.field_Yb + this.field_Yb + this.field_Rb * this.field_Xb;
              var8 = eo.a(var6, (byte) 123, param4, param0);
              var9 = mh.a(param3, param1, var7, -8748);
              this.a((byte) -80, var6, var9, var7, var8);
              var10 = 0;
              if (param2 < -13) {
                L3: while (true) {
                  if (this.field_Rb > var10) {
                    this.field_Lb[var10].b(0, var6 - 2 * this.field_Tb, this.field_Yb + var10 * this.field_Xb, this.field_Qb, this.field_Tb, this.field_Mb, this.field_Xb);
                    var10++;
                    continue L3;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              var8 = this.field_Lb[var7].b(-26606, this.field_Qb, this.field_Mb);
              if (var6 < var8) {
                var6 = var8;
                var7++;
                continue L2;
              } else {
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, oh param1, int param2, String param3) {
        try {
            this.field_Lb[this.field_Rb] = new nh((long)param2, (hl) null, (hl) null, this.field_Ub, param1, param3);
            this.field_Lb[this.field_Rb].field_kb = this.field_Zb;
            this.field_Lb[this.field_Rb].field_Cb = true;
            this.field_Lb[this.field_Rb].field_J = 1;
            this.a((byte) 92, this.field_Lb[this.field_Rb]);
            this.field_Sb[this.field_Rb] = param0;
            this.field_Rb = this.field_Rb + 1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "aa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        try {
            this.field_Lb[this.field_Rb] = new nh(0L, (hl) null, (hl) null, this.field_Ub, (oh) null, param0);
            this.field_Lb[this.field_Rb].field_kb = this.field_Zb;
            this.field_Lb[this.field_Rb].field_Cb = true;
            this.field_Lb[this.field_Rb].field_J = param1;
            this.a((byte) -93, this.field_Lb[this.field_Rb]);
            this.field_Sb[this.field_Rb] = param2;
            this.field_Rb = this.field_Rb + 1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "aa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void h(int param0) {
        if (param0 != -2) {
          field_Pb = 25;
          field_Wb = null;
          field_Kb = null;
          field_bc = null;
          return;
        } else {
          field_Wb = null;
          field_Kb = null;
          field_bc = null;
          return;
        }
    }

    final static void d(byte param0) {
        String discarded$2 = null;
        String var2 = null;
        String var3 = null;
        var3 = (String) null;
        ve.a(-1, (String) null, pl.field_e);
        if (param0 >= 36) {
          return;
        } else {
          var2 = (String) null;
          discarded$2 = aa.a((String) null, -21, -48, (String) null);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = TetraLink.field_J;
        if (param3 <= param0) {
          if (param5 <= param0) {
            if (param3 >= param5) {
              qi.a(param2, param1, (byte) 98, param4, param3, param0, ra.field_b, param5, param6);
              if (param7 > 88) {
                return;
              } else {
                field_Vb = -56;
                return;
              }
            } else {
              qi.a(param2, param4, (byte) 98, param1, param5, param0, ra.field_b, param3, param6);
              if (param7 > 88) {
                return;
              } else {
                field_Vb = -56;
                return;
              }
            }
          } else {
            qi.a(param1, param4, (byte) 98, param2, param0, param5, ra.field_b, param3, param6);
            if (param7 > 88) {
              return;
            } else {
              field_Vb = -56;
              return;
            }
          }
        } else {
          if (param5 <= param3) {
            if (param5 <= param0) {
              qi.a(param4, param1, (byte) 98, param2, param0, param3, ra.field_b, param5, param6);
              if (param7 > 88) {
                return;
              } else {
                field_Vb = -56;
                return;
              }
            } else {
              qi.a(param4, param2, (byte) 98, param1, param5, param3, ra.field_b, param0, param6);
              if (param7 > 88) {
                return;
              } else {
                field_Vb = -56;
                return;
              }
            }
          } else {
            qi.a(param1, param2, (byte) 98, param4, param3, param5, ra.field_b, param0, param6);
            if (param7 > 88) {
              return;
            } else {
              field_Vb = -56;
              return;
            }
          }
        }
    }

    aa(hl param0, oh[] param1, hl param2, hl param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Sb = new int[256];
        this.field_Lb = new nh[256];
        this.field_ac = -2;
        try {
            this.field_Qb = param6;
            this.field_Tb = param4;
            this.field_Mb = param5;
            this.field_Xb = param8;
            this.field_Ub = param3;
            this.field_Yb = param7;
            this.field_Ob = param2;
            this.field_Zb = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "aa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean e(byte param0) {
        if (this.field_ac != -2) {
          return false;
        } else {
          if (dg.field_e != 13) {
            if (param0 != -87) {
              return false;
            } else {
              return true;
            }
          } else {
            this.field_ac = -1;
            if (param0 != -87) {
              return false;
            } else {
              return true;
            }
          }
        }
    }

    final static String a(String param0, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        bc var5 = null;
        int var6 = 0;
        ud var7 = null;
        CharSequence var8 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_10_0 = null;
        String stackOut_8_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var8 = (CharSequence) ((Object) param0);
            if (!gi.a(false, var8)) {
              stackOut_2_0 = uk.field_u;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ji.field_Tb == param2) {
                var7 = fh.a(param2 ^ -32053, param3);
                if (var7 != null) {
                  var7.b(false);
                  var7.e(0);
                  ca.field_c = ca.field_c - 1;
                  var5 = nd.field_Lb;
                  var5.f(param1, (byte) -92);
                  var5.field_t = var5.field_t + 1;
                  var6 = var5.field_t;
                  var5.a(3, false);
                  var5.a(param0, 0);
                  var5.b(-var6 + var5.field_t, param2 + -4);
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = sk.a(new String[]{param3}, am.field_e, 121);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = uf.field_a;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("aa.C(");
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
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return (String) ((Object) stackIn_11_0);
            }
          }
        }
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        this.a(0, param0);
        if (!param0) {
          return -2;
        } else {
          if (param1 <= -90) {
            var3 = 0;
            L0: while (true) {
              if (this.field_Rb <= var3) {
                if (-1 != (tm.field_t ^ -1)) {
                  return -1;
                } else {
                  return this.field_ac;
                }
              } else {
                if (-1 == (this.field_Lb[var3].field_F ^ -1)) {
                  var3++;
                  continue L0;
                } else {
                  return this.field_Sb[var3];
                }
              }
            }
          } else {
            field_Kb = (String) null;
            var3 = 0;
            L1: while (true) {
              if (this.field_Rb <= var3) {
                if (-1 != (tm.field_t ^ -1)) {
                  return -1;
                } else {
                  return this.field_ac;
                }
              } else {
                if (-1 == (this.field_Lb[var3].field_F ^ -1)) {
                  var3++;
                  continue L1;
                } else {
                  return this.field_Sb[var3];
                }
              }
            }
          }
        }
    }

    aa(aa param0) {
        this(param0, param0.field_Zb, param0.field_Ob, param0.field_Ub, param0.field_Tb, param0.field_Mb, param0.field_Qb, param0.field_Yb, param0.field_Xb);
    }

    static {
        field_Kb = "No options available";
        field_Nb = 0;
    }
}
