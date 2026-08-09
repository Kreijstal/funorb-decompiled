/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uha extends wda {
    private int field_r;
    private boolean field_p;
    private boolean field_t;
    private int field_o;
    private int field_q;
    static String field_s;

    final int a(int param0, int param1) {
        if (param0 != 0) {
            return -79;
        }
        param1 = fs.a((byte) 54, param1, this.field_o);
        param1 = fs.a((byte) 100, param1, this.field_q);
        param1 = fs.a((byte) 107, param1, this.field_r);
        return param1;
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          L1: {
            var2 = this.d((byte) -112);
            var3 = this.a(false);
            if (this.field_p) {
              break L1;
            } else {
              if (this.field_t) {
                break L1;
              } else {
                var4 = (cr.a(true, this.field_q >> 879418690) >> -49443032) * (this.field_o >> -1429435608) + var2;
                var5 = var3 - -((pla.b(35, this.field_q >> -549244414) >> 1163626504) * (this.field_o >> -1403643896));
                break L0;
              }
            }
          }
          var4 = this.field_n.s(25745);
          var5 = this.field_n.e(false);
          this.field_p = false;
          break L0;
        }
        this.field_q = this.field_q - this.field_r;
        this.field_q = dfa.a(this.field_q, 32768, 78);
        var7 = 49 % ((param0 - -69) / 42);
        var6 = var2 + (cr.a(true, this.field_q >> -2117313726) >> 511069128) * (this.field_o >> 1439269544);
        var8 = var3 - -((pla.b(102, this.field_q >> 641018146) >> -1004938040) * (this.field_o >> -90355640));
        this.field_n.a((byte) -94, -var4 + var6, var8 + -var5);
    }

    final static boolean a(int param0, kh param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 5907) {
              L1: {
                if (param1.b((byte) 44, 1) != 1) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("uha.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final void a(int param0, fsa param1) {
        try {
            super.a(85, param1);
            this.field_p = true;
            if (param0 < 35) {
                this.field_r = -34;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uha.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            this.a(116, 3);
        }
    }

    final void c(byte param0) {
        if (param0 > -116) {
            this.field_t = false;
        }
        super.c((byte) -120);
        this.field_q = -this.field_q;
        this.field_r = -this.field_r;
    }

    final static int e(byte param0) {
        if (param0 < 47) {
            field_s = (String) null;
        }
        return 256;
    }

    final void a(kh param0, byte param1) {
        jea var4 = null;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
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
              super.a(param0, (byte) -122);
              param0.a((byte) -44, this.field_o >> -2102342032, 10);
              param0.a((byte) 90, dqa.a(true, this.field_r, 12), 12);
              param0.a((byte) -126, cn.a((byte) 74, this.field_q, 32768, 4), 4);
              stackIn_2_0 = (kh) (param0);

              stackIn_2_1 = -128;

              if (!this.field_t) {
                stackIn_3_0 = (kh) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 0;
                break L1;
              } else {
                stackIn_3_0 = (kh) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 1;
                break L1;
              }
            }
            L2: {
              ((kh) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, 1);
              if (param1 < -78) {
                break L2;
              } else {
                var4 = (jea) null;
                uha.a((jea) null, -46, (byte) 104, (jea) null, -72, 112, (byte[]) null, -67, (jea) null, 84);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("uha.R(");

            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    uha(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_p = false;
        this.field_t = true;
        try {
          L0: {
            L1: {
              this.field_o = param1.b((byte) 44, 10) << -1984330448;
              this.field_r = bla.a(true, 12, param1.b((byte) 44, 12));
              if (param0.field_E < 10) {
                this.field_q = oo.a(3, 32768, 0, param1.b((byte) 44, 3));
                this.field_t = true;
                break L1;
              } else {
                L2: {
                  this.field_q = oo.a(4, 32768, 0, param1.b((byte) 44, 4));
                  stackIn_4_0 = this;

                  if (1 != param1.b((byte) 44, 1)) {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 1;
                    break L2;
                  }
                }
                ((uha) (this)).field_t = stackIn_5_1 != 0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("uha.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    final static void a(jea param0, int param1, byte param2, jea param3, int param4, int param5, byte[] param6, int param7, jea param8, int param9) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            um.field_m = param6;
            hpa.field_g = param5;
            rb.field_r = -1L;
            fk.field_b = param6.length;
            uu.field_a = null;
            ifa.field_n = null;
            qa.field_o = false;
            vk.field_b = new byte[(7 + hpa.field_g) / 8];
            if (param2 == -51) {
              var10_int = 0;
              var11 = 0;
              L1: while (true) {
                if (var11 >= um.field_m.length) {
                  L2: {
                    var10_int = (var10_int - -7) / 8;
                    tqa.field_e = new byte[var10_int];
                    if (null == param8.field_J) {
                      param8.field_J = new vna();
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    uma.field_b = param8.field_J;
                    uma.field_b.d(param2 ^ -59);
                    fua.field_a = new af(param4);
                    rda.field_o = 0;
                    so.field_K = 0;
                    bha.field_z = -1;
                    qb.field_f = -1;
                    if (param3.field_J == null) {
                      param3.field_J = new vna();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    asa.field_j = param3.field_J;
                    asa.field_j.d(8);
                    jb.field_K = new af(param7);
                    if (param0.field_J != null) {
                      break L4;
                    } else {
                      param0.field_J = new vna();
                      break L4;
                    }
                  }
                  qha.field_g = param0.field_J;
                  qha.field_g.d(8);
                  tc.field_d = new af(param1);
                  qsa.field_a = param9;
                  uq.field_d = 0L;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var10_int = var10_int + (um.field_m[var11] & 255);
                  var11++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var10);

            stackIn_18_1 = new StringBuilder().append("uha.N(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_28_2 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void e(int param0) {
        int var1 = -111 % ((-80 - param0) / 46);
        field_s = null;
    }

    final int c(int param0) {
        if (param0 != 1) {
            this.field_r = 5;
        }
        return 9;
    }

    static {
        field_s = "Bags";
    }
}
