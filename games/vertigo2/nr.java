/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nr extends tb implements ef {
    static String field_q;
    private r field_j;
    private r field_m;
    private boolean field_k;
    static char[] field_o;
    private int field_l;
    private la field_n;
    static nj field_p;

    final static void a(boolean param0, db param1, int param2, jj param3, int param4, java.awt.Component param5) {
        try {
            jn.a(param2, param4, param5, param2, param0, param4 + 17222, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "nr.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean d(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 > -114) {
          L0: {
            this.a(0.3591744601726532f, 110, 81);
            if (this.e(param1, -1).field_a) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.e(param1, -1).field_a) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final int b(int param0, int param1) {
        if (param0 != 212) {
          this.field_m = (r) null;
          return this.e(param1, -1).field_h;
        } else {
          return this.e(param1, -1).field_h;
        }
    }

    final static void a(int param0, int param1, vi param2) {
        mc.field_i.a(param2, false);
        if (param1 != -22754) {
            return;
        }
        try {
            aj.a(param0, param1 + 22795, param2);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "nr.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final ta a(int param0, byte param1) {
        ta var3;
        byte[] var4;
        var3 = (ta) ((Object) this.field_n.a((long)param0, false));
        if (var3 == null) {
          var4 = this.field_j.a(param0, 0, (byte) -126);
          if (param1 >= 40) {
            if (var4 == null) {
              return null;
            } else {
              var3 = new ta(new ed(var4));
              this.field_n.a(-1, var3, (long)param0);
              return var3;
            }
          } else {
            this.a(1.1444469690322876f, -2, -78);
            if (var4 == null) {
              return null;
            } else {
              var3 = new ta(new ed(var4));
              this.field_n.a(-1, var3, (long)param0);
              return var3;
            }
          }
        } else {
          return var3;
        }
    }

    public final int[] a(float param0, int param1, int param2) {
        ta stackIn_5_0;
        Object stackIn_5_1;
        r stackIn_5_2;
        float stackIn_5_3;
        Object stackIn_6_1;
        ta stackIn_7_0 = null;
        Object stackIn_7_1 = null;
        r stackIn_7_2 = null;
        float stackIn_7_3 = 0.0f;
        int stackIn_7_4 = 0;
        ta stackIn_14_0;
        Object stackIn_14_1;
        r stackIn_14_2;
        float stackIn_14_3;
        Object stackIn_15_1;
        ta stackIn_16_0 = null;
        Object stackIn_16_1 = null;
        r stackIn_16_2 = null;
        float stackIn_16_3 = 0.0f;
        int stackIn_16_4 = 0;
        ta var4;
        if (param2 == 233) {
          var4 = this.a(param1, (byte) 79);
          if (var4 == null) {
            return null;
          } else {
            L0: {
              L1: {
                stackIn_14_0 = (ta) (var4);

                stackIn_14_1 = this;

                stackIn_14_2 = this.field_m;

                stackIn_14_3 = param0;

                if (this.field_k) {
                  break L1;
                } else {


                  stackIn_15_1 = this;

                  if (!this.e(param1, -1).field_c) {
                    stackIn_16_0 = (ta) ((Object) stackIn_14_0);
                    stackIn_16_1 = this;
                    stackIn_16_2 = (r) ((Object) stackIn_14_2);
                    stackIn_16_3 = stackIn_14_3;
                    stackIn_16_4 = 0;
                    break L0;
                  } else {
                    stackIn_14_0 = (ta) ((Object) stackIn_14_0);
                    stackIn_14_1 = this;
                    stackIn_14_2 = (r) ((Object) stackIn_14_2);

                    break L1;
                  }
                }
              }
              stackIn_16_0 = (ta) ((Object) stackIn_14_0);
              stackIn_16_1 = this;
              stackIn_16_2 = (r) ((Object) stackIn_14_2);
              stackIn_16_3 = stackIn_14_3;
              stackIn_16_4 = 1;
              break L0;
            }
            return ((ta) (Object) stackIn_16_0).a((ka) (this), stackIn_16_2, stackIn_16_3, stackIn_16_4 != 0);
          }
        } else {
          field_p = (nj) null;
          var4 = this.a(param1, (byte) 79);
          if (var4 == null) {
            return null;
          } else {
            L2: {
              L3: {
                stackIn_5_0 = (ta) (var4);

                stackIn_5_1 = this;

                stackIn_5_2 = this.field_m;

                stackIn_5_3 = param0;

                if (this.field_k) {
                  break L3;
                } else {


                  stackIn_6_1 = this;

                  if (!this.e(param1, -1).field_c) {
                    stackIn_7_0 = (ta) ((Object) stackIn_5_0);
                    stackIn_7_1 = this;
                    stackIn_7_2 = (r) ((Object) stackIn_5_2);
                    stackIn_7_3 = stackIn_5_3;
                    stackIn_7_4 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = (ta) ((Object) stackIn_5_0);
                    stackIn_5_1 = this;
                    stackIn_5_2 = (r) ((Object) stackIn_5_2);

                    break L3;
                  }
                }
              }
              stackIn_7_0 = (ta) ((Object) stackIn_5_0);
              stackIn_7_1 = this;
              stackIn_7_2 = (r) ((Object) stackIn_5_2);
              stackIn_7_3 = stackIn_5_3;
              stackIn_7_4 = 1;
              break L2;
            }
            return ((ta) (Object) stackIn_7_0).a((ka) (this), stackIn_7_2, stackIn_7_3, stackIn_7_4 != 0);
          }
        }
    }

    public static void b(byte param0) {
        field_o = null;
        field_q = null;
        field_p = null;
        if (param0 <= 113) {
            nr.a((byte) 16, -123, 67, -3);
        }
    }

    public final boolean c(int param0, int param1) {
        ta discarded$1 = null;
        if (!this.field_k) {
          if (!this.e(param1, -1).field_c) {
            if (param0 != 1) {
              discarded$1 = this.a(-80, (byte) 53);
              return false;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final he g(int param0, int param1) {
        ta var3;
        he stackIn_4_0 = null;
        he stackIn_8_0 = null;
        if (param0 != 21922) {
          L0: {
            this.field_l = -110;
            var3 = this.a(param1, (byte) 92);
            if (var3 != null) {
              stackIn_8_0 = var3.field_v;
              break L0;
            } else {
              stackIn_8_0 = null;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            var3 = this.a(param1, (byte) 92);
            if (var3 != null) {
              stackIn_4_0 = var3.field_v;
              break L1;
            } else {
              stackIn_4_0 = null;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static boolean a(ed param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 64) {
              L1: {
                var2_int = param0.h(-11);
                if (-2 != (var2_int ^ -1)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              var3 = stackIn_6_0;
              stackIn_7_0 = var3;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("nr.I(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    public final int a(int param0, int param1) {
        if (param1 != 65535) {
            return 91;
        }
        return this.e(param0, -1).field_f & 65535;
    }

    final static er[] a(int param0, int param1, int param2, int param3, int param4) {
        er dupTemp$2 = null;
        er dupTemp$3 = null;
        er[] var5;
        er[] var6;
        L0: {
          var6 = new er[9];
          var5 = var6;
          dupTemp$2 = ed.a(param3, param1, false);
          var6[6] = dupTemp$2;
          var5[3] = dupTemp$2;
          var5[2] = dupTemp$2;
          var5[1] = dupTemp$2;
          var5[0] = dupTemp$2;
          dupTemp$3 = ed.a(param2, param1, false);
          var6[8] = dupTemp$3;
          var5[7] = dupTemp$3;
          var5[5] = dupTemp$3;
          if (-1 != (param0 ^ -1)) {
            var6[4] = ed.a(param0, 64, false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param4 > -24) {
          field_p = (nj) null;
          return var5;
        } else {
          return var5;
        }
    }

    nr(r param0, r param1, r param2, int param3, boolean param4) {
        super(param1, param0, param2);
        this.field_l = 50;
        this.field_k = false;
        try {
            this.field_k = param4 ? true : false;
            this.field_m = param2;
            this.field_j = param0;
            this.field_l = param3;
            this.field_n = new la(this.field_l);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "nr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var4;
        iq.field_x.field_u = 0;
        iq.field_x.f(12, 105);
        iq.field_x.e(j.field_r.nextInt(), param0 + -115);
        iq.field_x.e(j.field_r.nextInt(), 0);
        if (param0 != 115) {
          nr.a(-111, -84, -8, -110, 72);
          iq.field_x.f(param2, 101);
          iq.field_x.f(param3, -67);
          iq.field_x.d(param1, param0 ^ -1670);
          iq.field_x.a(lp.field_E, jm.field_H, 9157);
          uh.field_Wb.j(18, param0 + 5);
          fieldTemp$2 = uh.field_Wb.field_u + 1;
          uh.field_Wb.field_u = uh.field_Wb.field_u + 1;
          var4 = fieldTemp$2;
          uh.field_Wb.a(0, -10140, iq.field_x.field_p, iq.field_x.field_u);
          uh.field_Wb.b((byte) -95, -var4 + uh.field_Wb.field_u);
          return;
        } else {
          iq.field_x.f(param2, 101);
          iq.field_x.f(param3, -67);
          iq.field_x.d(param1, param0 ^ -1670);
          iq.field_x.a(lp.field_E, jm.field_H, 9157);
          uh.field_Wb.j(18, param0 + 5);
          fieldTemp$3 = uh.field_Wb.field_u + 1;
          uh.field_Wb.field_u = uh.field_Wb.field_u + 1;
          var4 = fieldTemp$3;
          uh.field_Wb.a(0, -10140, iq.field_x.field_p, iq.field_x.field_u);
          uh.field_Wb.b((byte) -95, -var4 + uh.field_Wb.field_u);
          return;
        }
    }

    static {
        field_o = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
