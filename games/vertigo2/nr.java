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
            jn.a(22050, 1024, param5, 22050, true, 18246, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "nr.K(" + 1 + 44 + (param1 != null ? "{...}" : "null") + 44 + 22050 + 44 + (param3 != null ? "{...}" : "null") + 44 + 1024 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    public final boolean d(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -114) {
          L0: {
            int[] discarded$14 = ((nr) this).a(0.3591744601726532f, 110, 81);
            if (((nr) this).e(param1, -1).field_a) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((nr) this).e(param1, -1).field_a) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final int b(int param0, int param1) {
        if (param0 != 212) {
          ((nr) this).field_m = null;
          return ((nr) this).e(param1, -1).field_h;
        } else {
          return ((nr) this).e(param1, -1).field_h;
        }
    }

    final static void a(int param0, int param1, vi param2) {
        mc.field_i.a((li) (Object) param2, false);
        try {
            aj.a(3, 41, param2);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "nr.N(" + 3 + 44 + -22754 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final ta a(int param0, byte param1) {
        ta var3 = null;
        byte[] var4 = null;
        var3 = (ta) (Object) ((nr) this).field_n.a((long)param0, false);
        if (var3 == null) {
          var4 = ((nr) this).field_j.a(param0, 0, (byte) -126);
          if (param1 >= 40) {
            if (var4 == null) {
              return null;
            } else {
              var3 = new ta(new ed(var4));
              ((nr) this).field_n.a(-1, (gp) (Object) var3, (long)param0);
              return var3;
            }
          } else {
            int[] discarded$1 = ((nr) this).a(1.1444469690322876f, -2, -78);
            if (var4 == null) {
              return null;
            } else {
              var3 = new ta(new ed(var4));
              ((nr) this).field_n.a(-1, (gp) (Object) var3, (long)param0);
              return var3;
            }
          }
        } else {
          return var3;
        }
    }

    public final int[] a(float param0, int param1, int param2) {
        ta var4 = null;
        ta stackIn_3_0 = null;
        Object stackIn_3_1 = null;
        r stackIn_3_2 = null;
        float stackIn_3_3 = 0.0f;
        ta stackIn_4_0 = null;
        Object stackIn_4_1 = null;
        r stackIn_4_2 = null;
        float stackIn_4_3 = 0.0f;
        ta stackIn_5_0 = null;
        Object stackIn_5_1 = null;
        r stackIn_5_2 = null;
        float stackIn_5_3 = 0.0f;
        ta stackIn_6_0 = null;
        Object stackIn_6_1 = null;
        r stackIn_6_2 = null;
        float stackIn_6_3 = 0.0f;
        ta stackIn_7_0 = null;
        Object stackIn_7_1 = null;
        r stackIn_7_2 = null;
        float stackIn_7_3 = 0.0f;
        int stackIn_7_4 = 0;
        ta stackIn_12_0 = null;
        Object stackIn_12_1 = null;
        r stackIn_12_2 = null;
        float stackIn_12_3 = 0.0f;
        ta stackIn_13_0 = null;
        Object stackIn_13_1 = null;
        r stackIn_13_2 = null;
        float stackIn_13_3 = 0.0f;
        ta stackIn_14_0 = null;
        Object stackIn_14_1 = null;
        r stackIn_14_2 = null;
        float stackIn_14_3 = 0.0f;
        ta stackIn_15_0 = null;
        Object stackIn_15_1 = null;
        r stackIn_15_2 = null;
        float stackIn_15_3 = 0.0f;
        ta stackIn_16_0 = null;
        Object stackIn_16_1 = null;
        r stackIn_16_2 = null;
        float stackIn_16_3 = 0.0f;
        int stackIn_16_4 = 0;
        ta stackOut_11_0 = null;
        Object stackOut_11_1 = null;
        r stackOut_11_2 = null;
        float stackOut_11_3 = 0.0f;
        ta stackOut_12_0 = null;
        Object stackOut_12_1 = null;
        r stackOut_12_2 = null;
        float stackOut_12_3 = 0.0f;
        ta stackOut_15_0 = null;
        Object stackOut_15_1 = null;
        r stackOut_15_2 = null;
        float stackOut_15_3 = 0.0f;
        int stackOut_15_4 = 0;
        ta stackOut_13_0 = null;
        Object stackOut_13_1 = null;
        r stackOut_13_2 = null;
        float stackOut_13_3 = 0.0f;
        ta stackOut_14_0 = null;
        Object stackOut_14_1 = null;
        r stackOut_14_2 = null;
        float stackOut_14_3 = 0.0f;
        int stackOut_14_4 = 0;
        ta stackOut_2_0 = null;
        Object stackOut_2_1 = null;
        r stackOut_2_2 = null;
        float stackOut_2_3 = 0.0f;
        ta stackOut_3_0 = null;
        Object stackOut_3_1 = null;
        r stackOut_3_2 = null;
        float stackOut_3_3 = 0.0f;
        ta stackOut_6_0 = null;
        Object stackOut_6_1 = null;
        r stackOut_6_2 = null;
        float stackOut_6_3 = 0.0f;
        int stackOut_6_4 = 0;
        ta stackOut_4_0 = null;
        Object stackOut_4_1 = null;
        r stackOut_4_2 = null;
        float stackOut_4_3 = 0.0f;
        ta stackOut_5_0 = null;
        Object stackOut_5_1 = null;
        r stackOut_5_2 = null;
        float stackOut_5_3 = 0.0f;
        int stackOut_5_4 = 0;
        if (param2 == 233) {
          var4 = this.a(param1, (byte) 79);
          if (var4 == null) {
            return null;
          } else {
            L0: {
              L1: {
                stackOut_11_0 = (ta) var4;
                stackOut_11_1 = this;
                stackOut_11_2 = ((nr) this).field_m;
                stackOut_11_3 = param0;
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                stackIn_14_2 = stackOut_11_2;
                stackIn_14_3 = stackOut_11_3;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                if (((nr) this).field_k) {
                  break L1;
                } else {
                  stackOut_12_0 = (ta) (Object) stackIn_12_0;
                  stackOut_12_1 = this;
                  stackOut_12_2 = (r) (Object) stackIn_12_2;
                  stackOut_12_3 = stackIn_12_3;
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  stackIn_15_3 = stackOut_12_3;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  stackIn_13_3 = stackOut_12_3;
                  if (!((nr) this).e(param1, -1).field_c) {
                    stackOut_15_0 = (ta) (Object) stackIn_15_0;
                    stackOut_15_1 = this;
                    stackOut_15_2 = (r) (Object) stackIn_15_2;
                    stackOut_15_3 = stackIn_15_3;
                    stackOut_15_4 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    stackIn_16_4 = stackOut_15_4;
                    break L0;
                  } else {
                    stackOut_13_0 = (ta) (Object) stackIn_13_0;
                    stackOut_13_1 = this;
                    stackOut_13_2 = (r) (Object) stackIn_13_2;
                    stackOut_13_3 = stackIn_13_3;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    stackIn_14_3 = stackOut_13_3;
                    break L1;
                  }
                }
              }
              stackOut_14_0 = (ta) (Object) stackIn_14_0;
              stackOut_14_1 = this;
              stackOut_14_2 = (r) (Object) stackIn_14_2;
              stackOut_14_3 = stackIn_14_3;
              stackOut_14_4 = 1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_16_3 = stackOut_14_3;
              stackIn_16_4 = stackOut_14_4;
              break L0;
            }
            return ((ta) (Object) stackIn_16_0).a((ka) this, stackIn_16_2, stackIn_16_3, stackIn_16_4 != 0);
          }
        } else {
          field_p = null;
          var4 = this.a(param1, (byte) 79);
          if (var4 == null) {
            return null;
          } else {
            L2: {
              L3: {
                stackOut_2_0 = (ta) var4;
                stackOut_2_1 = this;
                stackOut_2_2 = ((nr) this).field_m;
                stackOut_2_3 = param0;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                stackIn_5_3 = stackOut_2_3;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                if (((nr) this).field_k) {
                  break L3;
                } else {
                  stackOut_3_0 = (ta) (Object) stackIn_3_0;
                  stackOut_3_1 = this;
                  stackOut_3_2 = (r) (Object) stackIn_3_2;
                  stackOut_3_3 = stackIn_3_3;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_6_1 = stackOut_3_1;
                  stackIn_6_2 = stackOut_3_2;
                  stackIn_6_3 = stackOut_3_3;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  if (!((nr) this).e(param1, -1).field_c) {
                    stackOut_6_0 = (ta) (Object) stackIn_6_0;
                    stackOut_6_1 = this;
                    stackOut_6_2 = (r) (Object) stackIn_6_2;
                    stackOut_6_3 = stackIn_6_3;
                    stackOut_6_4 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    stackIn_7_3 = stackOut_6_3;
                    stackIn_7_4 = stackOut_6_4;
                    break L2;
                  } else {
                    stackOut_4_0 = (ta) (Object) stackIn_4_0;
                    stackOut_4_1 = this;
                    stackOut_4_2 = (r) (Object) stackIn_4_2;
                    stackOut_4_3 = stackIn_4_3;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    break L3;
                  }
                }
              }
              stackOut_5_0 = (ta) (Object) stackIn_5_0;
              stackOut_5_1 = this;
              stackOut_5_2 = (r) (Object) stackIn_5_2;
              stackOut_5_3 = stackIn_5_3;
              stackOut_5_4 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_7_4 = stackOut_5_4;
              break L2;
            }
            return ((ta) (Object) stackIn_7_0).a((ka) this, stackIn_7_2, stackIn_7_3, stackIn_7_4 != 0);
          }
        }
    }

    public static void b() {
        field_o = null;
        field_q = null;
        field_p = null;
    }

    public final boolean c(int param0, int param1) {
        if (!((nr) this).field_k) {
          if (!((nr) this).e(param1, -1).field_c) {
            if (param0 != 1) {
              ta discarded$2 = this.a(-80, (byte) 53);
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
        ta var3 = null;
        he stackIn_4_0 = null;
        he stackIn_8_0 = null;
        he stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        he stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 != 21922) {
          L0: {
            ((nr) this).field_l = -110;
            var3 = this.a(param1, (byte) 92);
            if (var3 != null) {
              stackOut_7_0 = var3.field_v;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (he) (Object) stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            var3 = this.a(param1, (byte) 92);
            if (var3 != null) {
              stackOut_3_0 = var3.field_v;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (he) (Object) stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static boolean a(ed param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param0.h(-11);
              if (var2_int != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var3 = stackIn_5_0;
            stackOut_5_0 = var3;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("nr.I(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + 67 + 41);
        }
        return stackIn_6_0 != 0;
    }

    public final int a(int param0, int param1) {
        if (param1 != 65535) {
            return 91;
        }
        return ((nr) this).e(param0, -1).field_f & 65535;
    }

    final static er[] a(int param0, int param1, int param2, int param3) {
        er[] var6 = new er[9];
        er[] var5 = var6;
        er dupTemp$0 = ed.a(param3, 1, false);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        er dupTemp$1 = ed.a(param2, 1, false);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!(param0 == 0)) {
            var6[4] = ed.a(param0, 64, false);
        }
        return var5;
    }

    nr(r param0, r param1, r param2, int param3, boolean param4) {
        super(param1, param0, param2);
        ((nr) this).field_l = 50;
        ((nr) this).field_k = false;
        try {
            ((nr) this).field_k = param4 ? true : false;
            ((nr) this).field_m = param2;
            ((nr) this).field_j = param0;
            ((nr) this).field_l = param3;
            ((nr) this).field_n = new la(((nr) this).field_l);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "nr.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        iq.field_x.field_u = 0;
        iq.field_x.f(12, 105);
        iq.field_x.e(j.field_r.nextInt(), 0);
        iq.field_x.e(j.field_r.nextInt(), 0);
        iq.field_x.f(param2, 101);
        iq.field_x.f(param3, -67);
        iq.field_x.d(param1, -1783);
        iq.field_x.a(lp.field_E, jm.field_H, 9157);
        uh.field_Wb.j(18, 120);
        int fieldTemp$0 = uh.field_Wb.field_u + 1;
        uh.field_Wb.field_u = uh.field_Wb.field_u + 1;
        int var4 = fieldTemp$0;
        uh.field_Wb.a(0, -10140, iq.field_x.field_p, iq.field_x.field_u);
        uh.field_Wb.b((byte) -95, -var4 + uh.field_Wb.field_u);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
