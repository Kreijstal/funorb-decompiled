/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qea {
    private int field_a;
    private int field_d;
    private int field_f;
    static int[] field_b;
    private int[] field_g;
    private int[] field_e;
    private int field_c;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    param0.getAppletContext().showDocument(sda.a(param0, -1, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                L3: {
                  if (param1 <= -59) {
                    break L3;
                  } else {
                    qea.a(22);
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("qea.E(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != -3) {
            qea.a(46);
        }
        field_b = null;
    }

    private final void c(int param0) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int fieldTemp$3 = this.field_c + 1;
        this.field_c = this.field_c + 1;
        this.field_a = this.field_a + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                this.a(false);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var3 = this.field_e[var2];
              if ((2 & var2) == 0) {
                if (-1 != (1 & var2 ^ -1)) {
                  this.field_f = this.field_f ^ this.field_f >>> 1925605574;
                  break L2;
                } else {
                  this.field_f = this.field_f ^ this.field_f << -2063145235;
                  break L2;
                }
              } else {
                if (-1 != (1 & var2 ^ -1)) {
                  this.field_f = this.field_f ^ this.field_f >>> 221914288;
                  break L2;
                } else {
                  this.field_f = this.field_f ^ this.field_f << 1727166658;
                  break L2;
                }
              }
            }
            this.field_f = this.field_f + this.field_e[128 + var2 & 255];
            dupTemp$4 = this.field_a + (this.field_f + this.field_e[sea.c(255, var3 >> 999114050)]);
            var4 = dupTemp$4;
            this.field_e[var2] = dupTemp$4;
            dupTemp$5 = this.field_e[sea.c(var4, 261352) >> -1720722680 >> -1754288350] - -var3;
            this.field_a = dupTemp$5;
            this.field_g[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final int b(int param0) {
        int discarded$0 = 0;
        if (param0 < 89) {
            discarded$0 = this.a(89, 120);
        }
        if (this.field_d == 0) {
            this.c(2);
            this.field_d = 256;
        }
        int fieldTemp$1 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        return this.field_g[fieldTemp$1];
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        if (!(param1 < param0)) {
            throw new IllegalArgumentException();
        }
        int var3 = -(int)(4294967296L % (long)param0) + 2147483647;
        while (true) {
            var4 = this.b(107);
            if (var3 >= var4) {
                break;
            }
        }
        return oea.a(var4, param0, -66);
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var5 = -1640531527;
          var3 = -1640531527;
          var6 = -1640531527;
          var4 = -1640531527;
          var8 = -1640531527;
          var9 = -1640531527;
          var7 = -1640531527;
          var10 = -1640531527;
          if (param0) {
            break L0;
          } else {
            this.field_a = -40;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L3: while (true) {
                  if (-257 >= (var2 ^ -1)) {
                    this.c(2);
                    this.field_d = 256;
                    return;
                  } else {
                    var10 = var10 + this.field_e[var2 + 7];
                    var4 = var4 + this.field_e[var2 + 1];
                    var8 = var8 + this.field_e[var2 - -5];
                    var5 = var5 + this.field_e[2 + var2];
                    var7 = var7 + this.field_e[var2 - -4];
                    var9 = var9 + this.field_e[var2 - -6];
                    var3 = var3 + this.field_e[var2];
                    var6 = var6 + this.field_e[var2 - -3];
                    var3 = var3 ^ var4 << -1887768693;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1242304734;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 223870632;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1367135824;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 1278870570;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 507214756;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -322466488;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -550844919;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_e[var2] = var3;
                    this.field_e[var2 + 1] = var4;
                    this.field_e[2 + var2] = var5;
                    this.field_e[3 + var2] = var6;
                    this.field_e[var2 - -4] = var7;
                    this.field_e[var2 + 5] = var8;
                    this.field_e[var2 - -6] = var9;
                    this.field_e[var2 + 7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var3 = var3 + this.field_g[var2];
                var9 = var9 + this.field_g[var2 - -6];
                var8 = var8 + this.field_g[5 + var2];
                var5 = var5 + this.field_g[2 + var2];
                var7 = var7 + this.field_g[var2 - -4];
                var6 = var6 + this.field_g[var2 - -3];
                var4 = var4 + this.field_g[1 + var2];
                var10 = var10 + this.field_g[var2 + 7];
                var3 = var3 ^ var4 << 1645684427;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 1490459554;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 423267272;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1881860816;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 542859242;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> -479240924;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << -1357971352;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -1854619351;
                var3 = var3 + var4;
                var5 = var5 + var10;
                this.field_e[var2] = var3;
                this.field_e[var2 + 1] = var4;
                this.field_e[2 + var2] = var5;
                this.field_e[var2 + 3] = var6;
                this.field_e[var2 - -4] = var7;
                this.field_e[5 + var2] = var8;
                this.field_e[6 + var2] = var9;
                this.field_e[7 + var2] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 396919051;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 1950762274;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -878278552;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -1689469392;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -1673960438;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -1630810268;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -416833112;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -1083722071;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1, fia param2, int param3, String param4, int param5, int param6, int param7, int param8, boolean param9, boolean param10, int param11, int param12, long param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
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
                L1: {
                  vc.field_q = new kh(param6);
                  ql.field_k = new kh(param7);
                  if (!param9) {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  } else {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    break L1;
                  }
                }
                q.field_r = stackIn_3_0 != 0;
                be.field_c = param0;
                csa.field_g = param11;
                nn.field_b = param3;
                du.field_h = param13;
                vh.field_g = param12;
                lr.field_c = param1;
                kqa.field_a = param2;
                rsa.field_x = param4;
                if (param8 == -1367135824) {
                  L2: {
                    uq.field_a = param5;
                    if (!param10) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L2;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L2;
                    }
                  }
                  L3: {
                    ft.field_a = stackIn_8_0 != 0;
                    if (kqa.field_a.field_x != null) {
                      try {
                        L4: {
                          fua.field_b = new ph(kqa.field_a.field_x, 64, 0);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var15 = (IOException) (Object) decompiledCaughtException;
                        throw new RuntimeException(var15.toString());
                      }
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) (var15_ref);
                stackOut_14_1 = new StringBuilder().append("qea.B(").append(param0).append(',').append(param1).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L5;
                }
              }
              L6: {
                stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param4 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L6;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L6;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qea(int[] param0) {
        int var2_int = 0;
        try {
            this.field_g = new int[256];
            this.field_e = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_g[var2_int] = param0[var2_int];
            }
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qea.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
