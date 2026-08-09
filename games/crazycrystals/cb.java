/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb extends pn implements Cloneable {
    static ko field_p;
    int field_v;
    int field_u;
    static int field_w;
    transient boolean field_t;
    static String field_r;
    static am field_n;
    private transient int field_s;
    static String field_q;
    static int field_m;
    int field_o;

    final f a(int param0, f[][] param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = this;

              if (!param2) {
                stackIn_3_0 = this;
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = this;
                stackIn_3_1 = 1;
                break L1;
              }
            }
            ((cb) (this)).field_t = stackIn_3_1 != 0;
            stackIn_4_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("cb.HB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (f) (this);
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        try {
            if (param1 != 0) {
                fq var6 = (fq) null;
                this.a((byte) 80, (f[][]) null, -107, 58, -4, (fq) null, -78);
            }
            this.field_s = (this.field_s + 1) % 48;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "cb.W(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            return -53;
        }
        return this.field_l.a(true, param1);
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            wg.field_P = true;
            var2 = "tuhstatbut";
            if (param0 != 1148) {
                cb.e((byte) -125);
            }
            var3 = "rvnadlm";
            var4 = -1L;
            ab.a(param1, var4, var2, param0 + -1026, var3);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "cb.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        this.field_o = param0;
        if (param1 <= 61) {
            this.field_o = 46;
        }
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        mj var4 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 23525) {
                break L1;
              } else {
                var4 = (mj) null;
                this.a(true, (f[][]) null, (mj) null);
                break L1;
              }
            }
            stackIn_3_0 = ng.a(f.field_f, param1, new cb(new kp(-1), 0, 0), (byte) -83, jh.field_d);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cb.V(").append(param0).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void e(byte param0) {
        rc.a(-25537, 17);
        if (param0 != 125) {
            field_r = (String) null;
        }
    }

    final boolean b(byte param0) {
        if (param0 <= 43) {
            field_r = (String) null;
            return this.field_l.b((byte) 126);
        }
        return this.field_l.b((byte) 126);
    }

    final boolean e(int param0) {
        if (param0 != -4128) {
            return true;
        }
        return !this.field_t ? this.field_l.e(-4128) : false;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        dl[] stackIn_3_0 = null;
        dl[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ef stackIn_10_0 = null;
        ef stackIn_11_0 = null;
        String stackIn_11_1 = null;
        dl[] stackIn_16_0 = null;
        dl[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ef stackIn_21_0 = null;
        ef stackIn_22_0 = null;
        String stackIn_22_1 = null;
        dl[] stackIn_26_0 = null;
        dl[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        ef stackIn_31_0 = null;
        ef stackIn_32_0 = null;
        String stackIn_32_1 = null;
        int var7;
        if (param1 == 24) {
          if ((param2 ^ -1) != -25) {
            L0: {
              stackIn_26_0 = ec.field_j;

              if (param3) {
                stackIn_27_0 = (dl[]) ((Object) stackIn_26_0);
                stackIn_27_1 = 0;
                break L0;
              } else {
                stackIn_27_0 = (dl[]) ((Object) stackIn_26_0);
                stackIn_27_1 = this.field_s >> -2025530142;
                break L0;
              }
            }
            L1: {
              ((dl) (Object) stackIn_27_0[stackIn_27_1]).a(param4, param5, 2 * param1, 2 * param2, 128);
              var7 = -115 % ((param0 - 74) / 41);
              if (param3) {
                L2: {
                  stackIn_31_0 = an.field_q;

                  if (this.field_o != 0) {
                    stackIn_32_0 = (ef) ((Object) stackIn_31_0);
                    stackIn_32_1 = Integer.toString(this.field_o);
                    break L2;
                  } else {
                    stackIn_32_0 = (ef) ((Object) stackIn_31_0);
                    stackIn_32_1 = "U";
                    break L2;
                  }
                }
                ((ef) (Object) stackIn_32_0).c(stackIn_32_1, param1 + param4, 6 + (param5 - -(param2 / 2)), 16760896, -1);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L3: {
              stackIn_16_0 = ec.field_j;

              if (!param3) {
                stackIn_17_0 = (dl[]) ((Object) stackIn_16_0);
                stackIn_17_1 = this.field_s >> 996201186;
                break L3;
              } else {
                stackIn_17_0 = (dl[]) ((Object) stackIn_16_0);
                stackIn_17_1 = 0;
                break L3;
              }
            }
            L4: {
              ((dl) (Object) stackIn_17_0[stackIn_17_1]).d(param4, param5, 128);
              var7 = -115 % ((param0 - 74) / 41);
              if (param3) {
                L5: {
                  stackIn_21_0 = an.field_q;

                  if (this.field_o != 0) {
                    stackIn_22_0 = (ef) ((Object) stackIn_21_0);
                    stackIn_22_1 = Integer.toString(this.field_o);
                    break L5;
                  } else {
                    stackIn_22_0 = (ef) ((Object) stackIn_21_0);
                    stackIn_22_1 = "U";
                    break L5;
                  }
                }
                ((ef) (Object) stackIn_22_0).c(stackIn_22_1, param1 + param4, 6 + (param5 - -(param2 / 2)), 16760896, -1);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          L6: {
            stackIn_3_0 = ec.field_j;

            if (param3) {
              stackIn_4_0 = (dl[]) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L6;
            } else {
              stackIn_4_0 = (dl[]) ((Object) stackIn_3_0);
              stackIn_4_1 = this.field_s >> -2025530142;
              break L6;
            }
          }
          ((dl) (Object) stackIn_4_0[stackIn_4_1]).a(param4, param5, 2 * param1, 2 * param2, 128);
          L7: {
            var7 = -115 % ((param0 - 74) / 41);
            if (param3) {
              L8: {
                stackIn_10_0 = an.field_q;

                if (this.field_o != 0) {
                  stackIn_11_0 = (ef) ((Object) stackIn_10_0);
                  stackIn_11_1 = Integer.toString(this.field_o);
                  break L8;
                } else {
                  stackIn_11_0 = (ef) ((Object) stackIn_10_0);
                  stackIn_11_1 = "U";
                  break L8;
                }
              }
              ((ef) (Object) stackIn_11_0).c(stackIn_11_1, param1 + param4, 6 + (param5 - -(param2 / 2)), 16760896, -1);
              break L7;
            } else {
              break L7;
            }
          }
          return;
        }
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
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
              if (param0 == -21) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = this.field_l.a((byte) -21, param1, param2, param3, param4, param5, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("cb.G(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    cb(f param0, int param1, int param2) {
        super(param0);
        this.field_v = 0;
        this.field_u = 0;
        this.field_t = false;
        this.field_o = 0;
        try {
            this.field_s = ue.a(48, -(param2 * param2) + param1 * param1, 126);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        field_p = null;
        field_r = null;
        field_n = null;
        if (param0 != 996201186) {
            return;
        }
        field_q = null;
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        boolean stackIn_3_0 = false;
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
              if (param0 == 16736352) {
                break L1;
              } else {
                this.c(16, -22, (f[][]) null, 4);
                break L1;
              }
            }
            stackIn_3_0 = this.field_l.a(16736352, param1, param2, param3, param4, param5, param6, param7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var9);

            stackIn_6_1 = new StringBuilder().append("cb.M(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param7 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        RuntimeException var4 = null;
        fq var5 = null;
        boolean stackIn_3_0 = false;
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
              if (!param0) {
                break L1;
              } else {
                var5 = (fq) null;
                this.a((byte) -102, (f[][]) null, -49, 42, 122, (fq) null, 48);
                break L1;
              }
            }
            stackIn_3_0 = this.field_l.a(false, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("cb.A(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_s = ue.a(48, -(param3 * param3) + param2 * param2, 119);
              if (param0 == -35) {
                break L1;
              } else {
                this.field_u = 24;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("cb.KC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, DataInputStream param1, int param2, byte param3, int param4) throws IOException {
        RuntimeException var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_v = param1.readInt();
            this.field_u = param1.readInt();
            if (param3 <= -69) {
              break L0;
            } else {
              field_m = 86;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var6);

            stackIn_5_1 = new StringBuilder().append("cb.JC(").append(param0).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        RuntimeException var7 = null;
        Object stackIn_3_0 = null;
        f stackIn_6_0 = null;
        ig stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 == null) {
              stackIn_3_0 = this;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param5 == -87) {
                dd.field_c.a(32, param2 * 12, 12 * param1, 0, (byte) -111);
                stackIn_8_0 = new ig(param0, param4, (f) (this), false);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = (f) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var7);

            stackIn_11_1 = new StringBuilder().append("cb.H(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (f) (this);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return (f) ((Object) stackIn_8_0);
          }
        }
    }

    static {
        field_q = "Can you combine that trick with the trick at the start to break the logs? Think it through first!";
        field_r = "Invalid password.";
    }
}
