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
            var3 = (tbb) (Object) param1;
            var3.field_b = dob.a(var3.field_b, (byte) -124, var3.field_b);
            var3.field_f = dob.a(var3.field_f, (byte) -105, var3.field_f);
            var3.field_e = dob.a(var3.field_e, (byte) -29, var3.field_e);
            var3.field_d = dob.a(var3.field_d, (byte) -103, var3.field_d);
            if (param0 <= 54) {
                ((tbb) this).field_b = null;
            }
            var3.field_a = var3.field_a;
            var3.field_g = var3.field_g;
            var3.field_c = var3.field_c;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "tbb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -109) {
                break L1;
              } else {
                ((tbb) this).field_g = -81;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("tbb.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        Object var3 = null;
        ((tbb) this).field_a = ((tbb) this).field_a - 8;
        ((tbb) this).field_g = ((tbb) this).field_g + 1;
        if (!(((tbb) this).field_a >= 0)) {
            ((tbb) this).field_a = 0;
        }
        if (((tbb) this).field_g > 4) {
            ((tbb) this).field_c = (1 + ((tbb) this).field_c) % 64;
            ((tbb) this).field_d[((tbb) this).field_c] = 0;
            ((tbb) this).field_g = 0;
            if (param0 < -123) {
                return;
            }
            var3 = null;
            ((tbb) this).b((byte) -29, (tv) null);
            return;
        }
        if (param0 < -123) {
            return;
        }
        var3 = null;
        ((tbb) this).b((byte) -29, (tv) null);
    }

    final void a(byte param0, int param1) {
        Object var4 = null;
        ((tbb) this).field_a = ((tbb) this).field_a + param1;
        if (((tbb) this).field_a <= 255) {
          if (param0 > 93) {
            return;
          } else {
            var4 = null;
            ((tbb) this).a((tv) null, 104);
            return;
          }
        } else {
          ((tbb) this).field_a = 255;
          if (param0 > 93) {
            return;
          } else {
            var4 = null;
            ((tbb) this).a((tv) null, 104);
            return;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        if (param2 >= -104) {
          ((tbb) this).field_b = null;
          var8 = ((tbb) this).field_c << 1;
          ((tbb) this).field_b[var8] = param4;
          ((tbb) this).field_b[1 + var8] = param6;
          ((tbb) this).field_f[var8] = param1;
          ((tbb) this).field_f[1 + var8] = param0;
          ((tbb) this).field_e[var8] = param3;
          ((tbb) this).field_e[var8 + 1] = param5;
          ((tbb) this).field_d[((tbb) this).field_c] = ((tbb) this).field_a;
          return;
        } else {
          var8 = ((tbb) this).field_c << 1;
          ((tbb) this).field_b[var8] = param4;
          ((tbb) this).field_b[1 + var8] = param6;
          ((tbb) this).field_f[var8] = param1;
          ((tbb) this).field_f[1 + var8] = param0;
          ((tbb) this).field_e[var8] = param3;
          ((tbb) this).field_e[var8 + 1] = param5;
          ((tbb) this).field_d[((tbb) this).field_c] = ((tbb) this).field_a;
          return;
        }
    }

    final void a(lta param0, int param1, int param2) {
        try {
            if (param1 != 1325107016) {
                ((tbb) this).field_f = null;
            }
            fsb.a(param0, ((tbb) this).field_f, 6407, ((tbb) this).field_g, ((tbb) this).field_b, ((tbb) this).field_e, ((tbb) this).field_c, ((tbb) this).field_d, param2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "tbb.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static pgb a(int param0, boolean param1) {
        faa var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        faa var8 = null;
        pi var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_22_0 = null;
        L0: {
          var7 = VoidHunters.field_G;
          var8 = qga.field_b;
          var2 = var8;
          var3 = var8.e((byte) -121);
          wja.field_a = 127 & var3;
          if ((128 & var3) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          dab.field_e = stackIn_3_0 != 0;
          bl.field_A = var8.e((byte) -106);
          sga.field_q = var8.k(255);
          if (wja.field_a == 2) {
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
          if (var8.e((byte) -106) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
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
          if (wja.field_a == 1) {
            psb.field_a = var8.e(1869);
            pva.field_f = var8.a(-1);
            break L4;
          } else {
            if (wja.field_a != 4) {
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
                if (uja.field_a.equals((Object) (Object) kca.field_a)) {
                  stackOut_23_0 = null;
                  stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                  break L6;
                } else {
                  stackOut_22_0 = var9.field_n;
                  stackIn_24_0 = stackOut_22_0;
                  break L6;
                }
              }
              un.field_h = stackIn_24_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            gna.a((Throwable) (Object) var6, "CC1", 0);
            un.field_h = null;
            jh.field_p = null;
            return new pgb(param1);
          }
          return new pgb(param1);
        } else {
          int discarded$1 = 112;
          jh.field_p = sib.a(80, (ds) (Object) var8);
          un.field_h = null;
          return new pgb(param1);
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((tbb) this).field_e = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("tbb.H(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        var2 = 0;
        L0: while (true) {
          if (((tbb) this).field_b.length <= var2) {
            var2 = 0;
            L1: while (true) {
              if (((tbb) this).field_d.length <= var2) {
                var2 = 104 / ((37 - param0) / 55);
                ((tbb) this).field_c = 0;
                ((tbb) this).field_a = 0;
                ((tbb) this).field_g = 0;
                return;
              } else {
                ((tbb) this).field_d[var2] = 0;
                var2++;
                continue L1;
              }
            }
          } else {
            ((tbb) this).field_b[var2] = 0;
            ((tbb) this).field_f[var2] = 0;
            ((tbb) this).field_f[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(no param0, int param1, toa param2, String param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L1: while (true) {
              if (param3.length() <= var7) {
                break L0;
              } else {
                L2: {
                  var8 = param3.charAt(var7);
                  if (var8 != 60) {
                    break L2;
                  } else {
                    var6 = (var5_int >> 8) - (-param2.field_c[0] + -param0.b(param3.substring(0, var7)));
                    break L2;
                  }
                }
                L3: {
                  if (-1 != var6) {
                    param2.field_c[var7] = var6;
                    break L3;
                  } else {
                    L4: {
                      if (32 != var8) {
                        break L4;
                      } else {
                        var5_int = var5_int + param1;
                        break L4;
                      }
                    }
                    param2.field_c[var7] = param2.field_c[0] + ((var5_int >> 8) + (param0.b(param3.substring(0, 1 + var7)) + -param0.a((char) var8)));
                    break L3;
                  }
                }
                L5: {
                  if (var8 != 62) {
                    var7++;
                    break L5;
                  } else {
                    var6 = -1;
                    var7++;
                    break L5;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("tbb.K(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + 18126 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
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
            var3_int = 74 / ((22 - param0) / 59);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("tbb.C(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    public final void a(tv param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -19) {
                break L1;
              } else {
                ((tbb) this).a(-95, 21, (byte) 84, 30, -19, 64, 55);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("tbb.F(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    tbb() {
        ((tbb) this).field_d = new int[64];
        ((tbb) this).field_c = 0;
        ((tbb) this).field_f = new int[128];
        ((tbb) this).field_b = new int[128];
        ((tbb) this).field_a = 0;
        ((tbb) this).field_g = 0;
        ((tbb) this).field_e = new int[128];
    }

    static {
    }
}
