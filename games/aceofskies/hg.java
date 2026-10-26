/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hg extends to {
    static String field_z;
    static ca field_y;
    private int field_v;
    private int field_u;
    private int field_A;
    private boolean field_E;
    private boolean field_w;
    private int field_B;
    static ResourceArchive field_x;
    static int field_D;
    static int[] field_C;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a((int) (char)param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_E) {
            return true;
          }
          if (!this.a(param6, param4, -73, param1, param2)) {
            stackIn_6_0 = var8_int;
            return stackIn_6_0 != 0;
          }
          this.field_i = param3;
          if (param3 != 1) {
            return true;
          }
          this.field_A = -param4 + (param6 - this.field_h);
          mm.field_a = this;
          this.field_B = -param1 + (-this.field_p + param2);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("hg.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final static fr a(int param0, String param1) {
        RuntimeException var2 = null;
        fr stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2147483647) {
            hg.j(-34);
          }
          if (nb.field_c == jq.field_fb) {
            return null;
          }
          if (uk.field_j == nb.field_c &&
            param1.equals(ua.field_j)) {
            nb.field_c = dk.field_h;
            stackIn_8_0 = GameAppletShell.field_l;
            return stackIn_8_0;
          }
          GameAppletShell.field_l = null;
          ua.field_j = param1;
          nb.field_c = jq.field_fb;
          stackIn_10_0 = null;
          return (fr) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("hg.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, param2, false, param3)) {
            this.a(param0, 0, param3, param2);
            this.a(param0, param3, (byte) -24, param2);
            discarded$64 = param0.append(" revert=").append(this.field_w);
            if (this.field_u != 2147483647 &&
              2147483647 != this.field_v) {
              discarded$65 = param0.append(" to ").append(this.field_u).append(',').append(this.field_v);
            }
          }
          if (param1 != 32462) {
            this.field_w = false;
          }
          stackIn_8_0 = (StringBuilder) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("hg.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (!param1) {
          return;
        }
        String var4 = (String) null;
        hr.a(param2, (String) null, param0, (byte) -61);
    }

    private hg(int param0, int param1, int param2, int param3, ir param4, no param5, ea param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_u = 2147483647;
        this.field_v = 2147483647;
        try {
          this.field_E = param8 ? true : false;
          this.field_s = param6;
          this.field_w = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "hg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_17_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_s instanceof mi) ||
            ((mi) (this.field_s)).field_u) &&
            this.field_i == 1) {
            var5_int = -param3 + (-this.field_B + ic.field_b);
            var6 = -param2 + cf.field_g - this.field_A;
            if (this.field_p != var5_int ||
              var6 != this.field_h) {
              this.field_h = var6;
              this.field_p = var5_int;
              if (this.field_o instanceof ih) {
                ((ih) (this.field_o)).a(this, param2, param3, (byte) -105);
              }
            }
          } else {
            if (this.field_w) {
              if (this.field_p != this.field_u) {
                var5_int = this.field_u - this.field_p;
                stackIn_11_1 = this.field_p;
                if (Math.abs(var5_int) > 2) {
                  stackIn_12_2 = var5_int >> 1;
                } else {
                  if (var5_int > 0) {
                    stackIn_12_2 = 1;
                  } else {
                    stackIn_12_2 = -1;
                  }
                }
                this.field_p = stackIn_11_1 + stackIn_12_2;
              }
              if (this.field_v != this.field_h) {
                var5_int = -this.field_h + this.field_v;
                stackIn_17_1 = this.field_h;
                if (Math.abs(var5_int) <= 2) {
                  if (0 >= var5_int) {
                    stackIn_20_2 = -1;
                  } else {
                    stackIn_20_2 = 1;
                  }
                } else {
                  stackIn_20_2 = var5_int >> 1;
                }
                this.field_h = stackIn_17_1 + stackIn_20_2;
              }
            }
          }
          super.a((byte) 40, param1, param2, param3);
          if (param0 < 13) {
            this.field_w = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("hg.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_y = null;
        field_C = null;
        field_x = null;
        if (param0 != 65793) {
          field_D = 4;
        }
        field_z = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, wu param7) {
        int stackIn_14_0 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        me stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        me var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        wu var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var45 = param7;
          if (var45.field_x != null &&
            1 < var45.field_f) {
            var61 = var45.field_x;
            nr.a(hs.field_a, false, var61, 0, 0);
          } else {
            pn.a(true);
          }
          var55 = new int[param7.field_q];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param7.field_q];
          var63 = ArchiveProvider.field_b;
          var62 = ql.field_o;
          var64 = dq.field_c;
          for (var13 = 0; var13 < param7.field_q; var13++) {
            var14 = param1 * var62[var13] + var63[var13] * param6 + var64[var13] * param4 >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_14_0 = 128;
            } else {
              if (128 <= var14) {
                stackIn_14_0 = 256;
              } else {
                stackIn_14_0 = 128 + var14;
              }
            }
            var14Lifetime2 = stackIn_14_0;
            var15 = var64[var13] * param0 + var62[var13] * param2 + param3 * var63[var13] >> 8;
            stackIn_16_0 = em.field_b;
            if (var15 < 0) {
              stackIn_17_1 = -var15;
            } else {
              stackIn_17_1 = var15;
            }
            var15Lifetime2 = stackIn_16_0[stackIn_17_1];
            var14Lifetime2 = (256 - var15Lifetime2) * var14Lifetime2 >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          if (param5 != 255) {
            return;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (AircraftDefinition.field_k > var44) {
            var14Lifetime1 = jr.field_n[var44];
            var15Lifetime1 = param7.field_I[var14Lifetime1];
            var16 = param7.field_t[var14Lifetime1];
            var17 = param7.field_m[var14Lifetime1];
            if (ArchiveProvider.field_b.length > param7.field_B[var14Lifetime1]) {
              stackIn_25_0 = param7.field_B[var14Lifetime1];
            } else {
              stackIn_25_0 = -1;
            }
            var18 = stackIn_25_0;
            if (param7.field_g[var14Lifetime1] >= ArchiveProvider.field_b.length) {
              stackIn_28_0 = -1;
            } else {
              stackIn_28_0 = param7.field_g[var14Lifetime1];
            }
            var19 = stackIn_28_0;
            if (ArchiveProvider.field_b.length <= param7.field_D[var14Lifetime1]) {
              stackIn_31_0 = -1;
            } else {
              stackIn_31_0 = param7.field_D[var14Lifetime1];
            }
            var20 = stackIn_31_0;
            if (null != GameCanvas.field_a &&
              null != param7.field_u &&
              var14Lifetime1 < param7.field_u.length &&
              -1 != param7.field_u[var14Lifetime1] &&
              param7.field_u[var14Lifetime1] < GameCanvas.field_a.length) {
              stackIn_38_0 = GameCanvas.field_a[param7.field_u[var14Lifetime1]];
            } else {
              stackIn_38_0 = null;
            }
            var21 = stackIn_38_0;
            var22 = qj.field_t[var15Lifetime1];
            var23 = ro.field_t[var15Lifetime1];
            var24 = qj.field_t[var16];
            var25 = ro.field_t[var16];
            var26 = qj.field_t[var17];
            var27 = ro.field_t[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 != null) {
                stackIn_43_0 = var21.field_c;
              } else {
                stackIn_43_0 = 8355711;
              }
              var30 = stackIn_43_0;
              var31 = var30 & 16711935;
              var32 = 65280 & var30;
              var33 = var32 * var28 >>> 8 & -872349952 | (var31 * var28 & -16711822) >>> 8;
              var33 = var33 + var29 * 65793;
              gq.a((byte) 114, var26, var22, var23, var24, var27, (var33 & 16711422) >> 1, var25);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 != null) {
                stackIn_47_0 = var21.field_c;
              } else {
                stackIn_47_0 = 8355711;
              }
              var34 = stackIn_47_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = (-16711791 & var35 * var28) >>> 8 | 1191247616 & var28 * var36 >>> 8;
              var38 = var29 * var36 >>> 8 & -369033472 | (-16711873 & var29 * var35) >>> 8;
              var37 = var37 + var31 * 65793;
              var39 = (var30 * var36 & 16711894) >>> 8 | (var35 * var30 & -16711830) >>> 8;
              var38 = var38 + 65793 * var32;
              var39 = var39 + 65793 * var33;
              pl.a(var37 & 255, var23, var22, var24, var27, 255 & var37 >> 8, var38 >> 8 & 255, var39 >> 16, var25, var39 & 255, var37 >> 16, 255 & var38, (var39 & 65506) >> 8, var38 >> 16, var26, false);
            }
            var44++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_52_0 = var8_ref;
          stackIn_52_1 = new StringBuilder().append("hg.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_i = 0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "hg.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final void a(byte param0) {
        super.a((byte) -112);
        int var2 = 117 % ((-13 - param0) / 50);
        this.field_s.a(this.field_n, 0, 0, this.field_q, (byte) 127);
        this.field_v = this.field_h;
        this.field_u = this.field_p;
    }

    static {
        field_z = "Retry";
    }
}
