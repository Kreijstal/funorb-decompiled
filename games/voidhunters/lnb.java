/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lnb extends le {
    private int field_j;
    static jv field_i;
    private int field_k;

    final int[] a(int param0, boolean param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int[] var10;
        int var11;
        L0: {
          var9 = VoidHunters.field_G;
          if (param1) {
            break L0;
          } else {
            this.a(105, -69);
            break L0;
          }
        }
        L1: {
          var10 = this.field_f.a((byte) -112, param0);
          var3 = var10;
          if (this.field_f.field_e) {
            L2: {
              var5 = hob.field_d / this.field_k;
              var6 = noa.field_o / this.field_j;
              if ((var6 ^ -1) >= -1) {
                var4 = this.a(0, 0, 255);
                break L2;
              } else {
                var7 = param0 % var6;
                var4 = this.a(0, noa.field_o * var7 / var6, 255);
                break L2;
              }
            }
            var11 = 0;
            var7 = var11;
            L3: while (true) {
              if (hob.field_d <= var11) {
                break L1;
              } else {
                if ((var5 ^ -1) >= -1) {
                  var10[var11] = var4[0];
                  var11++;
                  continue L3;
                } else {
                  var8 = var11 % var5;
                  var10[var11] = var4[var8 * hob.field_d / var5];
                  var11++;
                  continue L3;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var10;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3;
        int[][] var4;
        int var5;
        int var6;
        int var7_int;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[][] var17;
        int[][] var18;
        int[][] var19;
        var16 = VoidHunters.field_G;
        if (param0 == 255) {
          L0: {
            var19 = this.field_d.a(param1, (byte) -127);
            var18 = var19;
            var17 = var18;
            var3 = var17;
            if (this.field_d.field_g) {
              L1: {
                var5 = hob.field_d / this.field_k;
                var6 = noa.field_o / this.field_j;
                if ((var6 ^ -1) >= -1) {
                  var4 = this.a((byte) 69, 0, 0);
                  break L1;
                } else {
                  var7_int = param1 % var6;
                  var4 = this.a((byte) 82, 0, var7_int * noa.field_o / var6);
                  break L1;
                }
              }
              var7 = var4[0];
              var8 = var4[1];
              var9 = var4[2];
              var10 = var19[0];
              var11 = var19[1];
              var12 = var19[2];
              var13 = 0;
              L2: while (true) {
                if (var13 >= hob.field_d) {
                  break L0;
                } else {
                  L3: {
                    if (0 >= var5) {
                      var14 = 0;
                      break L3;
                    } else {
                      var15 = var13 % var5;
                      var14 = hob.field_d * var15 / var5;
                      break L3;
                    }
                  }
                  var10[var13] = var7[var14];
                  var11[var13] = var8[var14];
                  var12[var13] = var9[var14];
                  var13++;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
          return var17;
        } else {
          return (int[][]) null;
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (var4_int != 0) {
                if (var4_int == 1) {
                  this.field_j = param2.e((byte) -126);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                this.field_k = param2.e((byte) -121);
                break L1;
              }
            }
            L2: {
              if (param1 < -60) {
                break L2;
              } else {
                this.field_k = 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("lnb.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static void b(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == ov.field_o) {
                break L0;
              } else {
                L1: {
                  if ((param0 ^ -1) > -1) {
                    break L1;
                  } else {
                    if (sp.field_o != tc.field_c) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (param1 >= 110) {
                  L2: {
                    if (dpa.field_p.field_e != 0) {
                      break L2;
                    } else {
                      if ((10000L + bgb.field_o ^ -1L) <= (wt.a(false) ^ -1L)) {
                        break L2;
                      } else {
                        dpa.field_p.h(24335, param0);
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (0 >= dpa.field_p.field_e) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          ov.field_o.a(0, dpa.field_p.field_h, dpa.field_p.field_e, 0);
                          bgb.field_o = wt.a(false);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          iOException = (IOException) (Object) decompiledCaughtException;
                          ifb.l(-122);
                          break L5;
                        }
                      }
                      dpa.field_p.field_e = 0;
                      break L3;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
            dpa.field_p.field_e = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public lnb() {
        super(1, false);
        this.field_j = 4;
        this.field_k = 4;
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (param2) {
            field_i = (jv) null;
        }
        return -1 != (1024 & param0 ^ -1) ? true : false;
    }

    final static void d(int param0) {
        if (null != cka.field_o && cka.field_o.field_b != null) {
            cka.field_o.field_b.field_J = false;
        }
        qg.field_a = null;
        cka.field_o = null;
        if (param0 != 0) {
            lnb.e(75);
        }
    }

    public static void e(int param0) {
        field_i = null;
        if (param0 != 1) {
            field_i = (jv) null;
        }
    }

    static {
    }
}
