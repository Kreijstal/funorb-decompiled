/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et implements ntb {
    int field_a;
    static aba field_c;
    int field_b;

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        et var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = (et) ((Object) param0);
              var4 = 0;
              if (param1 < -19) {
                break L1;
              } else {
                var5 = (faa) null;
                this.a((faa) null, true);
                break L1;
              }
            }
            L2: {
              if (this.field_a == var6.field_a) {
                break L2;
              } else {
                System.out.println("int value has changed. before=" + var6.field_a + ", now=" + this.field_a);
                var4 = 1;
                break L2;
              }
            }
            L3: {
              if (this.field_b != var6.field_b) {
                System.out.println("int label has changed. before=" + var6.field_b + ", now=" + this.field_b);
                var4 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            if (var4 != 0) {
              System.out.println("This instance of MissionVariable has changed");
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("et.F(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final static short[] a(faa param0, int param1, int param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] var9 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 == 24) {
                break L1;
              } else {
                var9 = (short[]) null;
                et.a((faa) null, 91, -12, (short[]) null);
                break L1;
              }
            }
            var4_int = param0.i(0, param1);
            if (var4_int != 0) {
              L2: {
                L3: {
                  if (param3 == null) {
                    break L3;
                  } else {
                    if (param3.length == var4_int) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param3 = new short[var4_int];
                break L2;
              }
              L4: {
                var5 = param0.i(param2 + -24, 4);
                var6 = (short)param0.i(0, 16);
                if (0 < var5) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param3[var7] = (short)(var6 + param0.i(0, var5));
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param3[var7] = (short)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (short[]) (param3);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("et.G(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    public static void a(byte param0) {
        int var1 = 109 % ((param0 - 66) / 57);
        field_c = null;
    }

    public final void b(faa param0, int param1) {
        try {
            param0.a(-632, this.field_a, 32);
            param0.a(-632, this.field_b, 32);
            if (param1 > -109) {
                asb var4 = (asb) null;
                et.a((asb) null, (asb) null, -60, false);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "et.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        et var6 = null;
        et var7 = null;
        try {
            var6 = (et) ((Object) param1);
            var7 = var6;
            if (param0 < 54) {
                faa var4 = (faa) null;
                this.b((faa) null, 104);
            }
            var7.field_a = this.field_a;
            var7.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "et.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(asb param0, asb param1, int param2, boolean param3) {
        try {
            qu.a(qc.field_q, 0, cwa.field_c, ef.field_y, mla.field_q, pva.field_d, iga.field_o, param3, vlb.field_a, gjb.field_p, asb.field_a, cab.field_o);
            pmb.field_o = wjb.a(param0, true, "lobby", "chatfilter");
            fqb.field_o[2] = gpa.field_f;
            fqb.field_o[0] = iv.field_p;
            fqb.field_o[1] = pp.field_q;
            bj.a((byte) -35, param1, rh.field_o);
            if (param2 != 2874) {
                et.a((byte) -66);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "et.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            this.field_a = param0.i(0, 32);
            this.field_b = param0.i(0, 32);
            if (param1) {
                this.field_b = -94;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "et.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        et var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -51 % ((22 - param0) / 59);
                var4 = (et) ((Object) param1);
                if (this.field_a != var4.field_a) {
                  break L2;
                } else {
                  if (var4.field_b == this.field_b) {
                    stackIn_5_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("et.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
        field_c = new aba();
    }
}
