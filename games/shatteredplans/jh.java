/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends vd implements ok {
    private boolean field_y;
    static String field_v;
    private int field_x;
    private bi field_E;
    private int field_u;
    private String field_G;
    private int field_z;
    static boolean field_D;
    private String field_C;
    static ga field_B;
    private bi field_F;
    private int field_w;

    final void g(int param0) {
        ((jh) this).field_y = true;
        if (param0 < 80) {
            ((jh) this).e((byte) 91);
        }
    }

    public static void d() {
        field_v = null;
        field_B = null;
    }

    final boolean f(int param0) {
        if (param0 != 244874369) {
            ((jh) this).field_G = null;
            return ((jh) this).field_y;
        }
        return ((jh) this).field_y;
    }

    final void a(int param0) {
        int var2 = 0;
        var2 = 122 / ((param0 - 67) / 47);
        if (!((jh) this).field_s) {
          return;
        } else {
          if (!((jh) this).field_y) {
            if (((jh) this).field_w == -1) {
              if (((jh) this).field_E == null) {
                if (null == ((jh) this).field_C) {
                  return;
                } else {
                  rs.field_Cb.c(((jh) this).field_C, ((jh) this).field_m / 2 + (1 + ((jh) this).field_k), rs.field_Cb.field_J / 2 + (((jh) this).field_i / 2 + ((jh) this).field_t), ((jh) this).field_x, -1);
                  return;
                }
              } else {
                L0: {
                  ((jh) this).field_E.f((-((jh) this).field_E.field_z + ((jh) this).field_m) / 2 + ((jh) this).field_k, (((jh) this).field_i - ((jh) this).field_E.field_w) / 2 + ((jh) this).field_t);
                  if (null != ((jh) this).field_C) {
                    rs.field_Cb.c(((jh) this).field_C, ((jh) this).field_m / 2 + (1 + ((jh) this).field_k), rs.field_Cb.field_J / 2 + (((jh) this).field_i / 2 + ((jh) this).field_t), ((jh) this).field_x, -1);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              }
            } else {
              gf.d(((jh) this).field_k, ((jh) this).field_t, ((jh) this).field_m, ((jh) this).field_i, ((jh) this).field_w);
              if (((jh) this).field_E != null) {
                L1: {
                  ((jh) this).field_E.f((-((jh) this).field_E.field_z + ((jh) this).field_m) / 2 + ((jh) this).field_k, (((jh) this).field_i - ((jh) this).field_E.field_w) / 2 + ((jh) this).field_t);
                  if (null != ((jh) this).field_C) {
                    rs.field_Cb.c(((jh) this).field_C, ((jh) this).field_m / 2 + (1 + ((jh) this).field_k), rs.field_Cb.field_J / 2 + (((jh) this).field_i / 2 + ((jh) this).field_t), ((jh) this).field_x, -1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  if (null != ((jh) this).field_C) {
                    rs.field_Cb.c(((jh) this).field_C, ((jh) this).field_m / 2 + (1 + ((jh) this).field_k), rs.field_Cb.field_J / 2 + (((jh) this).field_i / 2 + ((jh) this).field_t), ((jh) this).field_x, -1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            }
          } else {
            if (-1 == ((jh) this).field_z) {
              L3: {
                if (((jh) this).field_F != null) {
                  ((jh) this).field_F.f(((jh) this).field_k + (((jh) this).field_m - ((jh) this).field_F.field_z) / 2, (((jh) this).field_i - ((jh) this).field_F.field_w) / 2 + ((jh) this).field_t);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (((jh) this).field_G != null) {
                rs.field_Cb.c(((jh) this).field_G, ((jh) this).field_m / 2 + 1 + ((jh) this).field_k, rs.field_Cb.field_J / 2 + (((jh) this).field_i / 2 + ((jh) this).field_t), ((jh) this).field_u, -1);
                return;
              } else {
                return;
              }
            } else {
              L4: {
                gf.d(((jh) this).field_k, ((jh) this).field_t, ((jh) this).field_m, ((jh) this).field_i, ((jh) this).field_z);
                if (((jh) this).field_F != null) {
                  ((jh) this).field_F.f(((jh) this).field_k + (((jh) this).field_m - ((jh) this).field_F.field_z) / 2, (((jh) this).field_i - ((jh) this).field_F.field_w) / 2 + ((jh) this).field_t);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (((jh) this).field_G == null) {
                return;
              } else {
                rs.field_Cb.c(((jh) this).field_G, ((jh) this).field_m / 2 + 1 + ((jh) this).field_k, rs.field_Cb.field_J / 2 + (((jh) this).field_i / 2 + ((jh) this).field_t), ((jh) this).field_u, -1);
                return;
              }
            }
          }
        }
    }

    final static void a(qr param0, qr param1, qr param2, qr param3) {
        RuntimeException var5 = null;
        String var5_ref = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (ck.field_a != null) {
              return;
            } else {
              L1: {
                sr.field_h = false;
                if (bg.field_g) {
                  var5_ref = uh.field_d;
                  break L1;
                } else {
                  if (ae.field_b) {
                    var5_ref = pg.field_E;
                    break L1;
                  } else {
                    var5_ref = sl.field_q;
                    break L1;
                  }
                }
              }
              var7 = null;
              cq.a(-114, ho.field_c, (String) null, var5_ref, 0);
              ck.field_a = uq.field_j;
              uq.field_j.field_ab = -(8355711 & ho.field_c >> 1) + (ho.field_c + ((16711422 & bh.field_k.field_ab) >> 1));
              uq.field_j.field_jb = -(8355711 & ho.field_c >> 1) + ho.field_c + ((bh.field_k.field_jb & 16711422) >> 1);
              er.field_j = cg.field_C;
              uq.field_j.field_qb = -(ho.field_c >> 1 & 8355711) + ho.field_c - -(bh.field_k.field_qb >> 1 & 8355711);
              fa.field_X = new qr(0L, param1);
              mb.field_n = new qr(0L, param2);
              fe.field_w = new qr(0L, (qr) null);
              sg.field_Ab = new qr(0L, param3);
              uq.field_j = new qr(0L, param0);
              uq.field_j.field_nb = ho.field_f;
              sg.field_Ab.a(4, uq.field_j);
              cg.field_C = new qr(0L, er.field_j);
              sg.field_Ab.a(4, cg.field_C);
              hd.field_m = new qr(0L, bh.field_k, ld.field_n);
              cb.field_l = new qr(0L, bh.field_k);
              fa.field_X.a(4, mb.field_n);
              fa.field_X.a(4, fe.field_w);
              fe.field_w.a(4, sg.field_Ab);
              fe.field_w.a(4, hd.field_m);
              fe.field_w.a(4, cb.field_l);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("jh.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 0 + ')');
        }
    }

    jh(int param0, int param1, int param2, int param3, int param4, bi param5, String param6, int param7, int param8, bi param9, String param10, int param11) {
        super(param0, param1, param2, param3);
        try {
            ((jh) this).field_y = false;
            ((jh) this).field_u = param11;
            ((jh) this).field_z = param8;
            ((jh) this).field_E = param5;
            ((jh) this).field_G = param10;
            ((jh) this).field_F = param9;
            ((jh) this).field_x = param7;
            ((jh) this).field_w = param4;
            ((jh) this).field_C = param6;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "jh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ')');
        }
    }

    final void e(byte param0) {
        ((jh) this).field_y = !((jh) this).field_y ? true : false;
        if (param0 <= 1) {
            field_B = null;
            return;
        }
    }

    final void d(boolean param0) {
        ((jh) this).field_y = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Loading extra data";
        field_D = false;
    }
}
