/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pm extends ana {
    private int field_C;
    private taa field_y;
    private qn field_x;
    static kia field_z;
    private kv field_D;
    private ws field_w;
    static ee[] field_v;
    private int field_B;
    private av field_E;
    private int field_A;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6, String param7, int param8) {
        try {
            ur.field_e[pe.field_m] = (oha) ((Object) new a(param1, param4, param0, param6, param7, param3, param5, param8));
            if (param2 != 12635) {
                pm.f(-58);
            }
            pe.field_m = pe.field_m + 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pm.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    pm(gj param0, av param1) {
        super(param0, param1);
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        try {
          L0: {
            L1: {
              this.field_E = param1;
              this.field_w = dba.field_a;
              this.field_l = 75;
              this.field_D = de.field_F.a();
              var3_int = this.field_q.field_h.field_z;
              var4 = this.field_q.field_h.field_B;
              var5 = kla.a(4, m.field_a, -2147483648);
              if (var5 != 0) {
                if (var5 != 1) {
                  if (-3 == (var5 ^ -1)) {
                    this.field_B = var3_int + 3;
                    this.field_C = -3 + kla.a(6 + var4 + -2, m.field_a, -2147483648) - -1;
                    break L1;
                  } else {
                    this.field_B = kla.a(4 + var3_int, m.field_a, -2147483648) - 3 + 1;
                    this.field_C = -3;
                    break L1;
                  }
                } else {
                  this.field_B = kla.a(5 + var3_int, m.field_a, -2147483648) + -2;
                  this.field_C = 3 + var4;
                  break L1;
                }
              } else {
                this.field_B = -3;
                this.field_C = kla.a(-1 + var4 - -6, m.field_a, -2147483648) - 3;
                break L1;
              }
            }
            this.field_y = this.field_m;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("pm.<init>(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        if (this.field_y.a((byte) -106)) {
          return false;
        } else {
          if (this.field_w != dba.field_a) {
            if (bia.field_i != this.field_w) {
              L0: {
                if ((this.field_l ^ -1) != -66) {
                  break L0;
                } else {
                  if (hba.field_x == this.field_w) {
                    wf.a(30, (byte) 127);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              fieldTemp$0 = this.field_l - 1;
              this.field_l = this.field_l - 1;
              if (0 > fieldTemp$0) {
                if (hba.field_x == this.field_w) {
                  this.field_y = new taa(this.field_q, this.field_E.field_s, this.field_E.field_r);
                  this.a(27799, this.field_y);
                  this.field_l = 30;
                  this.field_w = lw.field_g;
                  return false;
                } else {
                  L1: {
                    if (lw.field_g == this.field_w) {
                      this.field_x.c(-26450);
                      this.field_w = tma.field_w;
                      jja.a(256, -1, 29);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (ov.field_e.length > this.field_A) {
                    fieldTemp$1 = this.field_A;
                    this.field_A = this.field_A + 1;
                    this.a(fieldTemp$1, true);
                    this.field_l = this.field_l + 30;
                    var2 = 89 % ((param0 - 71) / 47);
                    return false;
                  } else {
                    this.d(-73);
                    return true;
                  }
                }
              } else {
                return false;
              }
            } else {
              this.field_y = new taa(this.field_q, this.field_B, this.field_C);
              this.field_y.field_p = false;
              this.a(27799, this.field_y);
              this.field_w = hba.field_x;
              return false;
            }
          } else {
            this.field_x = new qn(this.field_q, this.field_E.field_s, this.field_E.field_r);
            this.field_x.a(0);
            this.field_y = new taa(this.field_q, this.field_E.field_s, this.field_E.field_r);
            this.a(27799, this.field_y);
            this.field_w = bia.field_i;
            return false;
          }
        }
    }

    public static void e(int param0) {
        if (param0 >= -25) {
            return;
        }
        field_v = null;
        field_z = null;
    }

    private final void d(int param0) {
        this.field_E.a(this.field_q.field_h, false);
        if (param0 >= -22) {
            String var3 = (String) null;
            pm.a(20, 100, 70, 26, 13, -84, (String) null, (String) null, -119);
        }
    }

    private final void a(int param0, boolean param1) {
        int stackIn_17_0 = 0;
        int stackIn_20_1 = 0;
        int var4;
        int var5;
        ad var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        Object var13;
        int var14;
        op var15;
        L0: {
          var14 = BachelorFridge.field_y;
          var15 = this.field_q.field_h;
          var4 = var15.field_z;
          if (param1) {
            break L0;
          } else {
            this.field_D = (kv) null;
            break L0;
          }
        }
        var5 = var15.field_B;
        var6 = this.field_E.field_l.a(-27449, this.field_q);
        var7 = vn.field_M[param0];
        var8 = -3;
        L1: while (true) {
          if (var8 > 3) {
            return;
          } else {
            var9 = -3;
            L2: while (true) {
              if (-4 > (var9 ^ -1)) {
                var8++;
                continue L1;
              } else {
                var10 = this.field_E.field_t + var8;
                var11 = this.field_E.field_q + var9;
                if (0 <= var10) {
                  if (var4 > var10) {
                    if (0 <= var11) {
                      if (var5 > var11) {
                        L3: {
                          if (-1 < (var9 ^ -1)) {
                            stackIn_17_0 = -var9;
                            break L3;
                          } else {
                            stackIn_17_0 = var9;
                            break L3;
                          }
                        }
                        L4: {


                          if (var8 >= 0) {

                            stackIn_20_1 = var8;
                            break L4;
                          } else {

                            stackIn_20_1 = -var8;
                            break L4;
                          }
                        }
                        var12 = stackIn_17_0 + stackIn_20_1;
                        if (param0 == var12) {
                          L5: {
                            if (var12 != 0) {
                              var13 = new uea(this.field_q, var10, var11, var7);
                              break L5;
                            } else {
                              var13 = new dw(this.field_q, var10, var11);
                              break L5;
                            }
                          }
                          ((kj) (var13)).a(0);
                          this.a(var10, var11, var6, 0);
                          var9++;
                          continue L2;
                        } else {
                          var9++;
                          continue L2;
                        }
                      } else {
                        var9++;
                        continue L2;
                      }
                    } else {
                      var9++;
                      continue L2;
                    }
                  } else {
                    var9++;
                    continue L2;
                  }
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void c(int param0) {
        aj var7 = null;
        aj var5 = null;
        aj var6 = null;
        int var2 = 0;
        int var4 = BachelorFridge.field_y;
        if (param0 > -10) {
            this.field_C = 66;
        }
        if (bia.field_i == this.field_w) {
            var5 = this.field_q.field_s.a(this.field_C, (byte) -117, this.field_B);
            this.field_D.b(var5.field_c, var5.field_a);
        } else {
            if (hba.field_x == this.field_w) {
                var6 = this.field_q.field_s.a(this.field_C, (byte) 80, this.field_B);
                var2 = (-this.field_l + 75) * (-this.field_l + 75) * 400 / 5625;
                this.field_D.b(var6.field_c, var6.field_a + -var2);
            } else {
                if (lw.field_g == this.field_w) {
                    var7 = this.field_q.field_s.a(this.field_E.field_q, (byte) -126, this.field_E.field_t);
                    var2 = this.field_l * 400 / 30;
                    this.field_D.e(var7.field_c, var7.field_a - (var2 - -this.field_D.field_o) + 60);
                }
            }
        }
    }

    final static void f(int param0) {
        int var1 = (kg.field_b - 640) / 2;
        int var2 = saa.field_b * saa.field_b;
        int var3 = var2 + -(lfa.field_q * lfa.field_q);
        ng.field_e.a(-94 + (-120 + dg.field_c), param0 ^ 31336, 199, -(param0 * var3 / var2) + var1, 90);
        ui.field_r.a(-4 + (dg.field_c + -120), 31407, 438, 438 * var3 / var2 + 202 + var1, 0);
    }

    static {
    }
}
