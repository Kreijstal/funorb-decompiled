/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends w {
    private int field_Nb;
    private w field_Sb;
    private w field_Vb;
    static long[] field_Ub;
    private w field_Wb;
    static String field_Xb;
    static boolean field_Qb;
    private w field_Rb;
    static String field_Ob;
    static String field_Zb;
    private w field_Pb;
    private w field_Tb;
    static int field_Yb;

    final int a(boolean param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param1 == 88) {
          L0: {
            var5 = 0;
            var6 = -this.field_Tb.field_N + this.field_Pb.field_N;
            if (0 < var6) {
              var7 = this.field_Tb.field_Ib;
              var8 = -param2 + param3;
              var5 = (var7 * var8 - -(var6 / 2)) / var6;
              break L0;
            } else {
              break L0;
            }
          }
          if (!param0) {
            L1: {
              if (var5 > param3 - param2) {
                var5 = param3 + -param2;
                break L1;
              } else {
                break L1;
              }
            }
            if (var5 >= 0) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          } else {
            L2: {
              if (var5 < 0) {
                var5 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            if (var5 <= -param2 + param3) {
              return var5;
            } else {
              var5 = -param2 + param3;
              return var5;
            }
          }
        } else {
          return -14;
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            an.a(param1, 0, var3, 0, var2_int);
            stackOut_0_0 = (byte[]) (var3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("jd.C(").append(0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final boolean i(byte param0) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        if (-1 != this.field_Sb.field_ob) {
          this.field_Nb = 20;
          return true;
        } else {
          if (this.field_Sb.field_gb == 0) {
            if (param0 != 7) {
              discarded$4 = this.g((byte) -98);
              return false;
            } else {
              return false;
            }
          } else {
            L0: {
              if (-1 < this.field_Nb) {
                this.field_Nb = this.field_Nb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_Nb != 0) {
              if (param0 == 7) {
                return false;
              } else {
                discarded$5 = this.g((byte) -98);
                return false;
              }
            } else {
              this.field_Nb = 3;
              return true;
            }
          }
        }
    }

    final boolean g(byte param0) {
        if (param0 < -59) {
          if (this.field_Wb.field_ob != 0) {
            this.field_Nb = 20;
            return true;
          } else {
            if (this.field_Wb.field_gb != 0) {
              if (0 >= this.field_Nb) {
                if (this.field_Nb == 0) {
                  if (this.field_Tb.field_pb - -this.field_Tb.field_Mb > pm.field_f) {
                    this.field_Nb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_Nb = this.field_Nb - 1;
                if (this.field_Nb == 0) {
                  if (this.field_Tb.field_pb - -this.field_Tb.field_Mb > pm.field_f) {
                    this.field_Nb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          this.field_Tb = (w) null;
          if (this.field_Wb.field_ob != 0) {
            this.field_Nb = 20;
            return true;
          } else {
            if (this.field_Wb.field_gb != 0) {
              if (0 < this.field_Nb) {
                this.field_Nb = this.field_Nb - 1;
                if (this.field_Nb == 0) {
                  if (this.field_Tb.field_pb - -this.field_Tb.field_Mb > pm.field_f) {
                    this.field_Nb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (this.field_Nb == 0) {
                  if (this.field_Tb.field_pb - -this.field_Tb.field_Mb <= pm.field_f) {
                    return false;
                  } else {
                    this.field_Nb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_mb = param4;
        this.field_Ib = param7;
        this.field_vb = param0;
        this.field_N = param2;
        int var9 = 91 / ((73 - param1) / 40);
        this.a(param6, param3, -91, param5);
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        tj var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              fj.field_h = false;
              cd.field_m = null;
              g.field_N = null;
              if (null != i.field_b) {
                i.field_b.c(120);
                i.field_b = null;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ob.field_i = null;
              if (null == h.field_b) {
                break L2;
              } else {
                h.field_b.c(118);
                h.field_b = null;
                break L2;
              }
            }
            L3: {
              tg.field_b = null;
              if (oc.field_b != null) {
                oc.field_b.c(113);
                oc.field_b = null;
                break L3;
              } else {
                break L3;
              }
            }
            hn.field_h = null;
            if (ob.field_i != null) {
              var3 = (tj) ((Object) ob.field_i.c(-9443));
              L4: while (true) {
                if (var3 == null) {
                  ob.field_i = null;
                  break L0;
                } else {
                  var3.e((byte) 69);
                  var3 = (tj) ((Object) ob.field_i.b(-123));
                  continue L4;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "jd.K(" + 74 + ')');
        }
    }

    final boolean h(byte param0) {
        if (!(0 == this.field_Vb.field_ob)) {
            this.field_Nb = 20;
            return true;
        }
        if (this.field_Vb.field_gb == 0) {
            if (param0 < 67) {
                this.field_Wb = (w) null;
                return false;
            }
            return false;
        }
        if (!(this.field_Nb <= 0)) {
            this.field_Nb = this.field_Nb - 1;
        }
        if (this.field_Nb != 0) {
            if (param0 < 67) {
                this.field_Wb = (w) null;
                return false;
            }
            return false;
        }
        this.field_Nb = 3;
        return true;
    }

    public static void e(int param0) {
        field_Zb = null;
        field_Ub = null;
        field_Ob = null;
        field_Xb = null;
    }

    jd(long param0, w param1, w param2, w param3, w param4) {
        super(param0, (w) null);
        RuntimeException var7 = null;
        w var9 = null;
        w var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            this.field_Sb = new w(0L, param1);
            this.field_Vb = new w(0L, param2);
            this.a(this.field_Sb, -16834);
            this.a(this.field_Vb, -16834);
            this.field_Pb = new w(0L, (w) null);
            this.a(this.field_Pb, -16834);
            this.field_Wb = new w(0L, param3);
            this.field_Rb = new w(0L, param3);
            var9 = this.field_Wb;
            var10 = var9;
            this.field_Rb.field_Gb = true;
            var10.field_Gb = true;
            this.field_Pb.a(this.field_Wb, -16834);
            this.field_Pb.a(this.field_Rb, -16834);
            this.field_Tb = new w(0L, param4);
            this.field_Tb.field_U = true;
            this.field_Pb.a(this.field_Tb, -16834);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var7);
            stackOut_3_1 = new StringBuilder().append("jd.<init>(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        w var15 = null;
        w var16 = null;
        w var17 = null;
        w var18 = null;
        w var19 = null;
        w var20 = null;
        w stackIn_12_0 = null;
        w stackIn_12_1 = null;
        w stackIn_12_2 = null;
        w stackIn_13_0 = null;
        w stackIn_13_1 = null;
        w stackIn_13_2 = null;
        w stackIn_14_0 = null;
        w stackIn_14_1 = null;
        w stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        w stackIn_18_0 = null;
        w stackIn_18_1 = null;
        w stackIn_18_2 = null;
        w stackIn_19_0 = null;
        w stackIn_19_1 = null;
        w stackIn_19_2 = null;
        w stackIn_20_0 = null;
        w stackIn_20_1 = null;
        w stackIn_20_2 = null;
        int stackIn_20_3 = 0;
        w stackOut_17_0 = null;
        w stackOut_17_1 = null;
        w stackOut_17_2 = null;
        w stackOut_19_0 = null;
        w stackOut_19_1 = null;
        w stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        w stackOut_18_0 = null;
        w stackOut_18_1 = null;
        w stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        w stackOut_11_0 = null;
        w stackOut_11_1 = null;
        w stackOut_11_2 = null;
        w stackOut_13_0 = null;
        w stackOut_13_1 = null;
        w stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        w stackOut_12_0 = null;
        w stackOut_12_1 = null;
        w stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        L0: {
          if (this.field_N < 2 * this.field_mb) {
            var6 = this.field_N / 2;
            var5 = this.field_N / 2;
            break L0;
          } else {
            var6 = -this.field_mb + this.field_N;
            var5 = this.field_mb;
            break L0;
          }
        }
        var7 = var6 - var5;
        var8 = var7;
        if (0 >= param1) {
          L1: {
            var9 = param1 - param0;
            var10 = -var8 + var7;
            var11 = 0;
            if (var9 <= 0) {
              break L1;
            } else {
              var11 = (param3 * var10 + var9 / 2) / var9;
              break L1;
            }
          }
          L2: {
            var12 = var11 - -(var8 / 2);
            var15 = this.field_Sb;
            var15.field_mb = this.field_mb;
            var14 = 103 % ((param2 - -29) / 46);
            var15.field_N = var5;
            var15.field_Ib = 0;
            var15.field_vb = 0;
            var16 = this.field_Vb;
            var16.field_Ib = var6;
            var16.field_mb = this.field_mb;
            var16.field_N = this.field_N - var6;
            var16.field_vb = 0;
            var17 = this.field_Pb;
            var17.field_N = var7;
            var17.field_mb = this.field_mb;
            var17.field_vb = 0;
            var17.field_Ib = var5;
            var18 = this.field_Wb;
            var18.field_vb = 0;
            var18.field_N = var12;
            var18.field_Ib = 0;
            var18.field_mb = this.field_mb;
            var19 = this.field_Rb;
            var19.field_Ib = var12;
            var19.field_vb = 0;
            var19.field_N = -var12 + var7;
            var19.field_mb = this.field_mb;
            var20 = this.field_Tb;
            var20.field_mb = this.field_mb;
            var20.field_N = var8;
            var20.field_Ib = var11;
            stackOut_17_0 = this.field_Sb;
            stackOut_17_1 = this.field_Vb;
            stackOut_17_2 = this.field_Pb;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_19_2 = stackOut_17_2;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            stackIn_18_2 = stackOut_17_2;
            if (param1 <= param0) {
              stackOut_19_0 = (w) ((Object) stackIn_19_0);
              stackOut_19_1 = (w) ((Object) stackIn_19_1);
              stackOut_19_2 = (w) ((Object) stackIn_19_2);
              stackOut_19_3 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              stackIn_20_3 = stackOut_19_3;
              break L2;
            } else {
              stackOut_18_0 = (w) ((Object) stackIn_18_0);
              stackOut_18_1 = (w) ((Object) stackIn_18_1);
              stackOut_18_2 = (w) ((Object) stackIn_18_2);
              stackOut_18_3 = 1;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              stackIn_20_3 = stackOut_18_3;
              break L2;
            }
          }
          stackIn_20_2.field_Hb = stackIn_20_3 != 0;
          stackIn_20_1.field_Hb = stackIn_20_3 != 0;
          stackIn_20_0.field_Hb = stackIn_20_3 != 0;
          var20.field_vb = 0;
          return;
        } else {
          L3: {
            var8 = var8 * param0 / param1;
            if (this.field_mb > var8) {
              var8 = this.field_mb;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var7 >= var8) {
              break L4;
            } else {
              var8 = var7;
              break L4;
            }
          }
          L5: {
            var9 = param1 - param0;
            var10 = -var8 + var7;
            var11 = 0;
            if (var9 <= 0) {
              break L5;
            } else {
              var11 = (param3 * var10 + var9 / 2) / var9;
              break L5;
            }
          }
          L6: {
            var12 = var11 - -(var8 / 2);
            var15 = this.field_Sb;
            var15.field_mb = this.field_mb;
            var14 = 103 % ((param2 - -29) / 46);
            var15.field_N = var5;
            var15.field_Ib = 0;
            var15.field_vb = 0;
            var16 = this.field_Vb;
            var16.field_Ib = var6;
            var16.field_mb = this.field_mb;
            var16.field_N = this.field_N - var6;
            var16.field_vb = 0;
            var17 = this.field_Pb;
            var17.field_N = var7;
            var17.field_mb = this.field_mb;
            var17.field_vb = 0;
            var17.field_Ib = var5;
            var18 = this.field_Wb;
            var18.field_vb = 0;
            var18.field_N = var12;
            var18.field_Ib = 0;
            var18.field_mb = this.field_mb;
            var19 = this.field_Rb;
            var19.field_Ib = var12;
            var19.field_vb = 0;
            var19.field_N = -var12 + var7;
            var19.field_mb = this.field_mb;
            var20 = this.field_Tb;
            var20.field_mb = this.field_mb;
            var20.field_N = var8;
            var20.field_Ib = var11;
            stackOut_11_0 = this.field_Sb;
            stackOut_11_1 = this.field_Vb;
            stackOut_11_2 = this.field_Pb;
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_13_2 = stackOut_11_2;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            if (param1 <= param0) {
              stackOut_13_0 = (w) ((Object) stackIn_13_0);
              stackOut_13_1 = (w) ((Object) stackIn_13_1);
              stackOut_13_2 = (w) ((Object) stackIn_13_2);
              stackOut_13_3 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              stackIn_14_3 = stackOut_13_3;
              break L6;
            } else {
              stackOut_12_0 = (w) ((Object) stackIn_12_0);
              stackOut_12_1 = (w) ((Object) stackIn_12_1);
              stackOut_12_2 = (w) ((Object) stackIn_12_2);
              stackOut_12_3 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              stackIn_14_3 = stackOut_12_3;
              break L6;
            }
          }
          stackIn_14_2.field_Hb = stackIn_14_3 != 0;
          stackIn_14_1.field_Hb = stackIn_14_3 != 0;
          stackIn_14_0.field_Hb = stackIn_14_3 != 0;
          var20.field_vb = 0;
          return;
        }
    }

    jd(long param0, jd param1) {
        this(param0, param1.field_Sb, param1.field_Vb, param1.field_Wb, param1.field_Tb);
    }

    final boolean f(int param0) {
        if (this.field_Rb.field_ob == param0) {
          if (this.field_Rb.field_gb != 0) {
            L0: {
              if (this.field_Nb > 0) {
                this.field_Nb = this.field_Nb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_Nb == 0) {
              if (pm.field_f < this.field_Tb.field_F + (this.field_Tb.field_N + this.field_Tb.field_Mb + this.field_Tb.field_pb)) {
                return false;
              } else {
                this.field_Nb = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          this.field_Nb = 20;
          return true;
        }
    }

    final boolean j(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -2) {
          L0: {
            this.a(58, -105, -107, 34);
            if (-1 == this.field_Tb.field_gb) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == this.field_Tb.field_gb) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_Zb = "Buying or selling an account";
        field_Ub = new long[32];
        field_Xb = "Orb points: ";
        field_Ob = "To Highscores";
    }
}
