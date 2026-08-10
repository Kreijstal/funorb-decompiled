/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tbb implements ntb {
    private int[] field_d;
    private int[] field_f;
    private int field_c;
    private int[] field_b;
    private int field_a;
    private int field_g;
    private int[] field_e;

    public final void b(byte param0, tv param1) {
        tbb var3 = null;
        try {
            var3 = (tbb) ((Object) param1);
            var3.field_b = dob.a(var3.field_b, (byte) -124, this.field_b);
            var3.field_f = dob.a(var3.field_f, (byte) -105, this.field_f);
            var3.field_e = dob.a(var3.field_e, (byte) -29, this.field_e);
            var3.field_d = dob.a(var3.field_d, (byte) -103, this.field_d);
            if (param0 <= 54) {
                this.field_b = (int[]) null;
            }
            var3.field_a = this.field_a;
            var3.field_g = this.field_g;
            var3.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tbb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
            if (param1 >= -109) {
                this.field_g = -81;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tbb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        tv var3;
        L0: {
          this.field_a = this.field_a - 8;
          this.field_g = this.field_g + 1;
          if ((this.field_a ^ -1) > -1) {
            this.field_a = 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (-5 <= (this.field_g ^ -1)) {
          if (param0 < -123) {
            return;
          } else {
            var3 = (tv) null;
            this.b((byte) -29, (tv) null);
            return;
          }
        } else {
          this.field_c = (1 + this.field_c) % 64;
          this.field_d[this.field_c] = 0;
          this.field_g = 0;
          if (param0 < -123) {
            return;
          } else {
            var3 = (tv) null;
            this.b((byte) -29, (tv) null);
            return;
          }
        }
    }

    final void a(byte param0, int param1) {
        tv var4;
        this.field_a = this.field_a + param1;
        if (-256 <= (this.field_a ^ -1)) {
          if (param0 > 93) {
            return;
          } else {
            var4 = (tv) null;
            this.a((tv) null, 104);
            return;
          }
        } else {
          this.field_a = 255;
          if (param0 > 93) {
            return;
          } else {
            var4 = (tv) null;
            this.a((tv) null, 104);
            return;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        int var8;
        if (param2 >= -104) {
          this.field_b = (int[]) null;
          var8 = this.field_c << 171287137;
          this.field_b[var8] = param4;
          this.field_b[1 + var8] = param6;
          this.field_f[var8] = param1;
          this.field_f[1 + var8] = param0;
          this.field_e[var8] = param3;
          this.field_e[var8 + 1] = param5;
          this.field_d[this.field_c] = this.field_a;
          return;
        } else {
          var8 = this.field_c << 171287137;
          this.field_b[var8] = param4;
          this.field_b[1 + var8] = param6;
          this.field_f[var8] = param1;
          this.field_f[1 + var8] = param0;
          this.field_e[var8] = param3;
          this.field_e[var8 + 1] = param5;
          this.field_d[this.field_c] = this.field_a;
          return;
        }
    }

    final void a(lta param0, int param1, int param2) {
        try {
            if (param1 != 1325107016) {
                this.field_f = (int[]) null;
            }
            fsb.a(param0, this.field_f, 6407, this.field_g, this.field_b, this.field_e, this.field_c, this.field_d, param2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tbb.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static pgb a(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_26_0 = null;
        Throwable decompiledCaughtException = null;
        faa var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        faa var8 = null;
        pi var9 = null;
        var7 = VoidHunters.field_G;
        var8 = qga.field_b;
        var2 = var8;
        if (param0 >= 4) {
          L0: {
            var3 = var8.e((byte) -121);
            wja.field_a = 127 & var3;
            if ((128 & var3) == 0) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = 1;
              break L0;
            }
          }
          L1: {
            dab.field_e = stackIn_5_0 != 0;
            bl.field_A = var8.e((byte) -106);
            sga.field_q = var8.k(255);
            if ((wja.field_a ^ -1) == -3) {
              sj.field_o = var8.e(1869);
              jkb.field_b = var8.c((byte) -38);
              break L1;
            } else {
              sj.field_o = 0;
              jkb.field_b = 0;
              break L1;
            }
          }
          L2: {
            if (-2 != (var8.e((byte) -106) ^ -1)) {
              stackIn_11_0 = 0;
              break L2;
            } else {
              stackIn_11_0 = 1;
              break L2;
            }
          }
          L3: {
            var4 = stackIn_11_0;
            ti.field_h = var8.a(-1);
            if (var4 != 0) {
              uja.field_a = var8.a(-1);
              break L3;
            } else {
              uja.field_a = ti.field_h;
              break L3;
            }
          }
          L4: {
            if ((wja.field_a ^ -1) == -2) {
              psb.field_a = var8.e(1869);
              pva.field_f = var8.a(-1);
              break L4;
            } else {
              if (-5 != (wja.field_a ^ -1)) {
                psb.field_a = 0;
                pva.field_f = null;
                break L4;
              } else {
                psb.field_a = var8.e(1869);
                pva.field_f = var8.a(-1);
                break L4;
              }
            }
          }
          if (param1) {
            var5 = var8.e(1869);
            try {
              L5: {
                L6: {
                  var9 = usa.field_o.a(var5, -119);
                  jh.field_p = var9.a(80);
                  if (uja.field_a.equals(kca.field_a)) {
                    stackIn_26_0 = null;
                    break L6;
                  } else {
                    stackIn_26_0 = var9.field_n;
                    break L6;
                  }
                }
                un.field_h = stackIn_26_0;
                break L5;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              gna.a((Throwable) ((Object) var6), "CC1", 0);
              un.field_h = null;
              jh.field_p = null;
              return new pgb(param1);
            }
            return new pgb(param1);
          } else {
            jh.field_p = sib.a(80, var8, (byte) 112);
            un.field_h = null;
            return new pgb(param1);
          }
        } else {
          return (pgb) null;
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                this.field_e = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tbb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        var2 = 0;
        L0: while (true) {
          if (this.field_b.length <= var2) {
            var2 = 0;
            L1: while (true) {
              if (this.field_d.length <= var2) {
                var2 = 104 / ((37 - param0) / 55);
                this.field_c = 0;
                this.field_a = 0;
                this.field_g = 0;
                return;
              } else {
                this.field_d[var2] = 0;
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_b[var2] = 0;
            this.field_f[var2] = 0;
            this.field_f[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(no param0, int param1, toa param2, String param3, int param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param4 == 18126) {
                break L1;
              } else {
                tbb.a(-98, false);
                break L1;
              }
            }
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L2: while (true) {
              if (param3.length() <= var7) {
                break L0;
              } else {
                L3: {
                  var8 = param3.charAt(var7);
                  if (var8 != 60) {
                    break L3;
                  } else {
                    var6 = (var5_int >> 1325107016) - (-param2.field_c[0] + -param0.b(param3.substring(0, var7)));
                    break L3;
                  }
                }
                L4: {
                  if (-1 != var6) {
                    param2.field_c[var7] = var6;
                    break L4;
                  } else {
                    L5: {
                      if (32 != var8) {
                        break L5;
                      } else {
                        var5_int = var5_int + param1;
                        break L5;
                      }
                    }
                    param2.field_c[var7] = param2.field_c[0] + ((var5_int >> 1751524392) + (param0.b(param3.substring(0, 1 + var7)) + -param0.a((char) var8)));
                    break L4;
                  }
                }
                L6: {
                  if (var8 != 62) {
                    break L6;
                  } else {
                    var6 = -1;
                    break L6;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("tbb.K(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ',' + param4 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 74 / ((22 - param0) / 59);
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("tbb.C(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    public final void a(tv param0, int param1) {
        try {
            if (param1 > -19) {
                this.a(-95, 21, (byte) 84, 30, -19, 64, 55);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tbb.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    tbb() {
        this.field_d = new int[64];
        this.field_c = 0;
        this.field_f = new int[128];
        this.field_b = new int[128];
        this.field_a = 0;
        this.field_g = 0;
        this.field_e = new int[128];
    }

    static {
    }
}
