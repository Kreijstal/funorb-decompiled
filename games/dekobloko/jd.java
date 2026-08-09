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
        int var5;
        int var6;
        int var7;
        int var8;
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
          L1: {
            if (!param0) {
              break L1;
            } else {
              L2: {
                if (-1 < (var5 ^ -1)) {
                  var5 = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (var5 > -param2 + param3) {
                var5 = -param2 + param3;
                if (client.field_A) {
                  break L1;
                } else {
                  return var5;
                }
              } else {
                return var5;
              }
            }
          }
          L3: {
            if (var5 > param3 - param2) {
              var5 = param3 + -param2;
              break L3;
            } else {
              break L3;
            }
          }
          if (var5 >= 0) {
            return var5;
          } else {
            var5 = 0;
            return var5;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            an.a(param1, 0, var3, param0, var2_int);
            stackIn_1_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("jd.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final boolean i(byte param0) {
        if (-1 != (this.field_Sb.field_ob ^ -1)) {
          this.field_Nb = 20;
          return true;
        } else {
          if (this.field_Sb.field_gb == 0) {
            if (param0 != 7) {
              this.g((byte) -98);
              return false;
            } else {
              return false;
            }
          } else {
            L0: {
              if (-1 > (this.field_Nb ^ -1)) {
                this.field_Nb = this.field_Nb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (-1 != (this.field_Nb ^ -1)) {
              if (param0 == 7) {
                return false;
              } else {
                this.g((byte) -98);
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
                if (-1 == (this.field_Nb ^ -1)) {
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
                if (-1 == (this.field_Nb ^ -1)) {
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
                if (-1 == (this.field_Nb ^ -1)) {
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
                if (-1 == (this.field_Nb ^ -1)) {
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
        RuntimeException runtimeException = null;
        int var2 = 0;
        tj var3 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 > 4) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        fj.field_h = false;
                        cd.field_m = null;
                        g.field_N = null;
                        if (null != i.field_b) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        i.field_b.c(120);
                        i.field_b = null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ob.field_i = null;
                        if (null == h.field_b) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        h.field_b.c(118);
                        h.field_b = null;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        tg.field_b = null;
                        if (oc.field_b != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        oc.field_b.c(113);
                        oc.field_b = null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        hn.field_h = null;
                        if (ob.field_i != null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = (tj) ((Object) ob.field_i.c(-9443));
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var3 == null) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3.e((byte) 69);
                        var3 = (tj) ((Object) ob.field_i.b(-123));
                        if (var2 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var2 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ob.field_i = null;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) runtimeException), "jd.K(" + param0 + ')');
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean h(byte param0) {
        if (0 != this.field_Vb.field_ob) {
          this.field_Nb = 20;
          return true;
        } else {
          if (this.field_Vb.field_gb != 0) {
            L0: {
              if (-1 > (this.field_Nb ^ -1)) {
                this.field_Nb = this.field_Nb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_Nb != 0) {
              if (param0 < 67) {
                this.field_Wb = (w) null;
                return false;
              } else {
                return false;
              }
            } else {
              this.field_Nb = 3;
              return true;
            }
          } else {
            if (param0 < 67) {
              this.field_Wb = (w) null;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    public static void e(int param0) {
        if (param0 != 32) {
            return;
        }
        field_Zb = null;
        field_Ub = null;
        field_Ob = null;
        field_Xb = null;
    }

    jd(long param0, w param1, w param2, w param3, w param4) {
        super(param0, (w) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        w var9 = null;
        w var10 = null;
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
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("jd.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        w var15;
        w var16;
        w var17;
        w var18;
        w var19;
        w var20;
        w stackIn_13_0 = null;
        w stackIn_13_1 = null;
        w stackIn_13_2 = null;
        w stackIn_14_0 = null;
        w stackIn_14_1 = null;
        w stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        w stackIn_19_0 = null;
        w stackIn_19_1 = null;
        w stackIn_19_2 = null;
        w stackIn_20_0 = null;
        w stackIn_20_1 = null;
        w stackIn_20_2 = null;
        int stackIn_20_3 = 0;
        L0: {
          L1: {
            if (this.field_N < 2 * this.field_mb) {
              break L1;
            } else {
              var6 = -this.field_mb + this.field_N;
              var5 = this.field_mb;
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var6 = this.field_N / 2;
          var5 = this.field_N / 2;
          break L0;
        }
        var7 = var6 - var5;
        var8 = var7;
        if (0 >= param1) {
          L2: {
            var9 = param1 - param0;
            var10 = -var8 + var7;
            var11 = 0;
            if (-1 <= (var9 ^ -1)) {
              break L2;
            } else {
              var11 = (param3 * var10 + var9 / 2) / var9;
              break L2;
            }
          }
          L3: {
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
            stackIn_19_0 = this.field_Sb;

            stackIn_19_1 = this.field_Vb;

            stackIn_19_2 = this.field_Pb;

            if (param1 <= param0) {
              stackIn_20_0 = (w) ((Object) stackIn_19_0);
              stackIn_20_1 = (w) ((Object) stackIn_19_1);
              stackIn_20_2 = (w) ((Object) stackIn_19_2);
              stackIn_20_3 = 0;
              break L3;
            } else {
              stackIn_20_0 = (w) ((Object) stackIn_19_0);
              stackIn_20_1 = (w) ((Object) stackIn_19_1);
              stackIn_20_2 = (w) ((Object) stackIn_19_2);
              stackIn_20_3 = 1;
              break L3;
            }
          }
          stackIn_20_2.field_Hb = stackIn_20_3 != 0;
          stackIn_20_1.field_Hb = stackIn_20_3 != 0;
          stackIn_20_0.field_Hb = stackIn_20_3 != 0;
          var20.field_vb = 0;
          return;
        } else {
          L4: {
            var8 = var8 * param0 / param1;
            if (this.field_mb > var8) {
              var8 = this.field_mb;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (var7 >= var8) {
              break L5;
            } else {
              var8 = var7;
              break L5;
            }
          }
          L6: {
            var9 = param1 - param0;
            var10 = -var8 + var7;
            var11 = 0;
            if (-1 <= (var9 ^ -1)) {
              break L6;
            } else {
              var11 = (param3 * var10 + var9 / 2) / var9;
              break L6;
            }
          }
          L7: {
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
            stackIn_13_0 = this.field_Sb;

            stackIn_13_1 = this.field_Vb;

            stackIn_13_2 = this.field_Pb;

            if (param1 <= param0) {
              stackIn_14_0 = (w) ((Object) stackIn_13_0);
              stackIn_14_1 = (w) ((Object) stackIn_13_1);
              stackIn_14_2 = (w) ((Object) stackIn_13_2);
              stackIn_14_3 = 0;
              break L7;
            } else {
              stackIn_14_0 = (w) ((Object) stackIn_13_0);
              stackIn_14_1 = (w) ((Object) stackIn_13_1);
              stackIn_14_2 = (w) ((Object) stackIn_13_2);
              stackIn_14_3 = 1;
              break L7;
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
          if (-1 != (this.field_Rb.field_gb ^ -1)) {
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
        if (param0 != -2) {
          L0: {
            this.a(58, -105, -107, 34);
            if (-1 == (this.field_Tb.field_gb ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (this.field_Tb.field_gb ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
