/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gm extends q {
    int field_p;
    el field_q;
    int field_l;
    int field_w;
    String field_n;
    uj field_u;
    int field_k;
    static sm[] field_r;
    ca field_t;
    boolean field_s;
    String field_m;
    int field_j;
    int field_v;
    int field_o;

    public static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 13509) {
            field_r = (sm[]) null;
          }
          field_r = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "gm.CA(" + param0 + ')');
        }
    }

    boolean a(gm param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.a(-81, (byte) -120, 14, -75);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gm.JA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(boolean param0, int param1, int param2, boolean param3) {
        boolean stackIn_46_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        aj var6 = null;
        int var7 = 0;
        var7 = Torquing.field_u;
        try {
          if (param3) {
            this.a((byte) -62, -99, -102, -105, -122);
          }
          this.a(-103, this, param2, param1);
          var5_int = this.g(2) ? 1 : 0;
          if (param0) {
            if (0 != da.field_g &&
              var5_int != 0) {
              this.a(da.field_g, param3, param2, n.field_t, this, param1, k.field_e);
            }
            if (0 != ta.field_o) {
              if (!this.a(ta.field_o, param1, param2, re.field_c, wh.field_s, this, (byte) 73)) {
                if (var5_int != 0) {
                  this.c((byte) 91);
                  if (var7 != 0) {
                    param0 = false;
                  }
                }
              } else {
                param0 = false;
              }
            }
            if ((ul.field_d == 0) &&
              (v.field_b != 0)) {
              this.a(param2, param1, n.field_t, (byte) 111, this, k.field_e);
              var6 = lp.field_d;
              if (var6 != null) {
                if (var6.field_t instanceof dm) {
                  ((dm) (var6.field_t)).a(3139, var6, (jd) null);
                }
                lp.field_d = null;
              }
              if ((var7 != 0) && (var5_int != 0 &&
                ta.field_o != 0)) {
                this.c((byte) 113);
              }
            }
          } else {
            if (var5_int != 0 &&
              ta.field_o != 0) {
              this.c((byte) 113);
            }
          }
          v.field_b = ul.field_d;
          dh.a(this.b(0), -1);
          stackIn_46_0 = param0;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var5), "gm.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean g(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 2) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "gm.HA(" + param0 + ')');
        }
    }

    final static void a(boolean param0, double[] param1, int param2, double param3, double[] param4, double param5, boolean param6, double[] param7, double[] param8, boolean param9) {
        int stackIn_20_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_58_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] var12 = null;
        double var12_double = 0.0;
        RuntimeException var12_ref = null;
        double[] var14 = null;
        int var15 = 0;
        double[] var15_ref_double__ = null;
        double[] var16 = null;
        int var16_int = 0;
        int var17_int = 0;
        double var17 = 0.0;
        int var19 = 0;
        double[] var16Lifetime1;
        int var15Lifetime1;
        var19 = Torquing.field_u;
        try {
          ap.a(param7, 6, param7, 10, param8, 6, param5);
          param8[4] = re.field_d[1] + param1[1];
          if (!param6) {
            param8[5] = re.field_d[2] + param1[2];
            param8[3] = re.field_d[0] + param1[0];
          }
          if (param6 ||
            var19 != 0) {
            var12 = param8;
            param8[5] = 0.0;
            var12[3] = 0.0;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          var12_double = param3 * 0.4 * param3;
          param8[10] = param4[0] / var12_double;
          param8[11] = param4[1] / var12_double;
          param8[12] = param4[2] / var12_double;
          ee.a(param0, param1, param7, param3, param5, 93);
          var14 = ll.a(jl.field_O, go.field_w, (byte) 119);
          if (var14 != null) {
            var15 = 0;
            while (!(var15 >= ia.field_i)) {
              stackIn_20_0 = $cfr$dcmpg(5.0 + 1.5 * -go.field_w[var15], var14[var15] * param5);
              if (var19 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_20_0 < 0) {
                var14 = null;
                break;
              }
              var15++;
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameRemainder0 = (var14 == null))) {
            stackIn_20_0 = $cfr$dcmpl(param7[3], 0.0);
          }
          if (decompiledFrameRemainder0) {
            if (stackIn_20_0 != 0 ||
              0.0 != param7[4] ||
              0.0 != param7[5]) {
              var15_ref_double__ = param7;
              param7[5] = 0.0;
              var16 = param7;
              var16[4] = 0.0;
              var15_ref_double__[3] = 0.0;
              ee.a(param0, param1, param7, param3, param5, 74);
              var14 = ll.a(jl.field_O, go.field_w, (byte) 121);
              if (var14 != null) {
                var17_int = 0;
                while (!(ia.field_i <= var17_int)) {
                  stackIn_41_0 = $cfr$dcmpl(var14[var17_int] * param5, 2.0 * -go.field_w[var17_int] + 5.0);
                  if (var19 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_41_0 > 0) {
                    var14 = null;
                    break;
                  }
                  var17_int++;
                }
              }
            }
            if ((decompiledFrameCompleted0) &&
              (null == var14)) {
              return;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_41_0 = 0;
          }
          var15Lifetime1 = stackIn_41_0;
          var16_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var16_int < ia.field_i)))) {
            var17 = var14[var16_int];
            stackIn_58_0 = $cfr$dcmpl(0.0, var17);
            if (var19 == 0) {
              if (stackIn_58_0 != 0) {
                param8[4] = param8[4] + ie.field_a[var16_int][1] * var17;
                if (!param6) {
                  param8[3] = param8[3] + var17 * ie.field_a[var16_int][0];
                  param8[5] = param8[5] + var17 * ie.field_a[var16_int][2];
                }
                param8[10] = param8[10] + var17 * dg.field_f[var16_int][0];
                param8[11] = param8[11] + dg.field_f[var16_int][1] * var17;
                param8[12] = param8[12] + var17 * dg.field_f[var16_int][2];
                if (1 == ee.field_t[var16_int]) {
                  var15Lifetime1++;
                }
                qg.a(bn.field_f[var16_int][4], param7, ee.field_t[var16_int], var17, false);
              }
              var16_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_58_0 = -1;
          }
          if (stackIn_58_0 != ~var15Lifetime1) {
            jb.a(param7, param6, param8, param3, param5, 25152);
          } else {
            param8[1] = param7[4];
            if (!param6) {
              param8[0] = param7[3];
              param8[2] = param7[5];
              if (var19 != 0) {
                param8[2] = 0.0;
                var16Lifetime1 = param8;
                var16Lifetime1[0] = 0.0;
              }
            } else {
              param8[2] = 0.0;
              var16Lifetime1 = param8;
              var16Lifetime1[0] = 0.0;
            }
          }
          if (param2 > -105) {
            return;
          }
          if (param9) {
            param8[12] = -param7[12] / 0.08;
            param8[10] = -param7[10] / 0.08;
            param8[11] = -param7[11] / 0.08;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_75_0 = var12_ref;
          stackIn_75_1 = new StringBuilder().append("gm.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_87_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',');
          if (param8 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(',').append(param9).append(')').toString());
        }
    }

    final static void c(int param0) {
        try {
          ha.field_a = -1;
          int var1_int = -127 % ((param0 - 73) / 47);
          ll.field_i = -1;
          lp.field_b = 0;
          wb.field_t = null;
          jd.field_E = false;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "gm.LA(" + param0 + ')');
        }
    }

    public final String toString() {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = this.a(new StringBuilder(), (byte) 117, new Hashtable(), 0).toString();
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "gm.toString()");
        }
    }

    void a(int param0, gm param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = -42 % ((param0 + 28) / 43);
          var5_int = this.a(k.field_e, n.field_t, param3, param2, 72) ? 1 : 0;
          stackIn_4_0 = (this.field_s) ? 0 : 1;
          if (stackIn_4_0 == var5_int) {
            this.field_s = var5_int != 0;
            if (null != this.field_t &&
              this.field_t instanceof jc) {
              ((jc) (this.field_t)).a(12359, this, var5_int != 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_18_0 = runtimeException;
          stackIn_18_1 = new StringBuilder().append("gm.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(StringBuilder param0, int param1, boolean param2, Hashtable param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Torquing.field_u;
        try {
          discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_w).append(",").append(this.field_k).append(" ").append(this.field_p).append("x").append(this.field_o);
          if (!param2) {
            return;
          }
          if (this.field_m != null) {
            discarded$1 = param0.append(" text=\"").append(this.field_m).append('"');
          }
          if (this.field_s) {
            discarded$2 = param0.append(" mouseover");
          }
          if (this.g(2)) {
            discarded$3 = param0.append(" focused");
          }
          if (null != this.field_q) {
            discarded$4 = param0.append(" renderer=");
            if (this.field_q instanceof gm) {
              param0 = this.a(param0, (byte) 117, param3, 1 + param1);
              if (var6 != 0) {
                discarded$5 = param0.append(this.field_q);
              }
            } else {
              discarded$5 = param0.append(this.field_q);
            }
          }
          if (null != this.field_t) {
            discarded$6 = param0.append(" listener=");
            if (!(this.field_t instanceof gm)) {
              discarded$7 = param0.append(this.field_t);
              if (var6 == 0) {
                return;
              }
            }
            param0 = this.a(param0, (byte) 117, param3, param1 + 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("gm.V(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    boolean a(int param0, boolean param1, int param2, int param3, gm param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("gm.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    StringBuilder a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 117) {
            gm.a(false, (double[]) null, -107, -0.28975176104484157, (double[]) null, 0.9414541521016125, false, (double[]) null, (double[]) null, true);
          }
          if (this.a(-31866, param0, param2, param3)) {
            this.a(param0, param3, true, param2);
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("gm.O(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    gm(String param0, ca param1) {
        this(param0, ah.field_c.field_n, param1);
    }

    int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 28) {
            this.toString();
          }
          stackIn_4_0 = 0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "gm.DA(" + param0 + ')');
        }
    }

    boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -113 / ((param3 + 33) / 57);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_5_0 = var5;
          stackIn_5_1 = new StringBuilder().append("gm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void c(byte param0) {
        try {
          if (param0 <= 89) {
            this.field_k = -96;
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "gm.T(" + param0 + ')');
        }
    }

    final boolean a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -31866) {
            field_r = (sm[]) null;
          }
          if (!param2.containsKey(this)) {
            param2.put(this, this);
            return true;
          }
          discarded$1 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("gm.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(byte param0, int param1, int param2, int param3, int param4) {
        try {
          int var6_int = -104 / ((param0 - 66) / 57);
          this.field_o = param3;
          this.field_k = param2;
          this.field_p = param4;
          this.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "gm.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Torquing.field_u;
        try {
          var4_int = this.d((byte) 28);
          if (param2 != 113) {
            this.field_p = 89;
          }
          var5_int = 0;
          while (var4_int >= var5_int) {
            this.a(var5_int, (byte) -60, param1, param0);
            var5_int++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          var5 = ud.b(0);
          if (null != var5) {
            ah.field_c.a(ha.field_a, var5, ll.field_i, 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "gm.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void e(byte param0) {
        try {
          this.a((byte) 3, this.field_w, this.field_k, this.field_o, this.field_p);
          if (param0 != 88) {
            this.a(-127, (StringBuilder) null, (Hashtable) null, 78);
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "gm.FA(" + param0 + ')');
        }
    }

    final static ao a(boolean param0, int param1, String param2) {
        gj var3 = null;
        RuntimeException var3_ref = null;
        gj stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            gm.a(true, -41, (String) null);
          }
          var3 = new gj();
          ((ao) ((Object) var3)).field_c = param2;
          ((ao) ((Object) var3)).field_e = param1;
          stackIn_4_0 = var3;
          return (ao) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("gm.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        boolean stackIn_12_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.g(param1 ^ 24452) &&
            this.a(param0, this, param2, 36)) {
            return true;
          }
          var4_int = param0;
          if (80 == var4_int) {
            stackIn_12_0 = this.a(this, false);
            return stackIn_12_0;
          }
          if (param1 != 24454) {
            this.a(-88, (gm) null, 'ﾨ', -18);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var4), "gm.EA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param4, param1, param2, 87)) {
            this.field_l = param0;
          }
          if (param6 >= 5) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("gm.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param6).append(')').toString());
        }
    }

    String b(int param0) {
        RuntimeException var2 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_v = -59;
          }
          if (!this.field_s) {
            stackIn_7_0 = null;
          } else {
            stackIn_7_0 = this.field_n;
          }
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "gm.R(" + param0 + ')');
        }
    }

    static int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          stackIn_1_0 = param0 | param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "gm.U(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < 57) {
            return false;
          }
          stackIn_16_0 = ((param2 + this.field_w) <= param1) && (this.field_k + param3 <= param0) && ((this.field_p + (param2 + this.field_w)) > param1) && (param0 < (this.field_o + (param3 + this.field_k)));
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var6), "gm.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 > -7) {
            return;
          }
          if (param0 == 0 &&
            null != this.field_q) {
            this.field_q.a(109, param2, param3, true, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var5), "gm.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param3 <= 109) {
            this.a(20, 14, 103, -123, 72);
          }
          this.field_l = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("gm.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(')').toString());
        }
    }

    protected gm() {
        this.field_j = 0;
        this.field_v = 0;
    }

    gm(String param0, el param1, ca param2) {
        RuntimeException runtimeException = null;
        fe var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_j = 0;
        this.field_v = 0;
        try {
          this.field_q = param1;
          this.field_t = param2;
          this.field_m = param0;
          if (this.field_q instanceof fe) {
            var4 = (fe) ((Object) this.field_q);
            this.field_p = var4.a((byte) 89, this);
            this.field_o = var4.a(this, 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("gm.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    gm(int param0, int param1, int param2, int param3, el param4, ca param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_j = 0;
        this.field_v = 0;
        try {
          this.field_t = param5;
          this.field_k = param1;
          this.field_q = param4;
          this.field_o = param3;
          this.field_p = param2;
          this.field_w = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("gm.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
    }

    private static int $cfr$dcmpl(double left, double right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }

    private static int $cfr$dcmpg(double left, double right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
