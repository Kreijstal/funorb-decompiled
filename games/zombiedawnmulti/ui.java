/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends br {
    private int field_m;
    static int[] field_i;
    static ja[] field_k;
    private int field_l;
    static String field_j;
    private int field_h;
    private int field_g;
    static int[] field_f;

    final static void a(int param0, ul param1) {
        RuntimeException runtimeException = null;
        ac var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ac.b(param1.a("headers.packvorbis", "", false));
          if (param0 != 7478) {
            field_k = (ja[]) null;
          }
          var2 = ac.a(param1, "jagex logo2.packvorbis", "");
          var2.c();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ui.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void c(int param0) {
        int discarded$0 = 0;
        try {
          if (param0 != 9307) {
            discarded$0 = this.a(105);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ui.H(" + param0 + ')');
        }
    }

    final static int a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            ui.a(true, false);
          }
          stackIn_3_0 = 16711935 & 15 * (16711935 & param0) >> 4 | (param0 & 65280) * 15 >> 4 & 65280;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ui.C(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4_int = 0;
        boolean stackIn_5_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = -3 % ((-42 - param0) / 33);
          stackIn_5_0 = (Math.abs(param1 - this.field_h) < 30) && (Math.abs(-this.field_m + param2) < 30);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "ui.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_26_0 = 0;
        ja[] stackIn_30_0 = null;
        ef stackIn_33_0;
        String stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        int stackIn_34_4 = 0;
        int stackIn_40_0 = 0;
        boolean stackIn_46_0 = false;
        boolean stackIn_56_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ja[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int[] var13 = null;
        try {
          if (param1) {
            field_k = (ja[]) null;
          }
          if (null != op.field_m &&
            1 < op.field_m.field_t) {
            stackIn_8_0 = (pl.field_I == 10) ? 1 : 0;
            var2_int = stackIn_8_0;
            if (!iq.field_f) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = (var2_int != 0) ? 1 : 0;
            }
            boolean decompiledFrameRemainder0 = true;
            var3 = stackIn_14_0;
            if ((!tj.field_f ||
              !param0) && (!(0 < id.field_D) ||
              !(20 > wf.field_m % 40)) && (var3 == 0 ||
              !(wf.field_m % 40 < 20))) {
              stackIn_26_0 = 0;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_26_0 = 1;
            }
            var4 = stackIn_26_0;
            if (var4 != 0) {
              stackIn_30_0 = rl.field_a;
            } else {
              stackIn_30_0 = oi.field_h;
            }
            var5 = stackIn_30_0;
            var6 = var5[0].field_x + nf.field_d + var5[2].field_x;
            var7 = qp.field_w.field_C + var5[6].field_w + var5[0].field_w;
            s.a(-var7 + dq.field_k.field_qb - 5, 0, var5, -5 - var6 + 640, var7, var6);
            var13 = new int[4];
            oo.a(var13);
            oo.e(-5 - nf.field_d + 640 - var5[0].field_x, dq.field_k.field_qb - var7 + var5[0].field_w - 5, 635 - var5[2].field_x, dq.field_k.field_qb - var5[6].field_w);
            stackIn_33_0 = qp.field_w;
            stackIn_33_1 = pb.field_i;
            stackIn_33_2 = -var5[2].field_x + 635;
            stackIn_33_3 = dq.field_k.field_qb - (var5[6].field_w + 5);
            if (var4 == 0) {
              stackIn_34_4 = 16777215;
            } else {
              stackIn_34_4 = 1;
            }
            ((ef) (Object) stackIn_33_0).a(stackIn_33_1, stackIn_33_2, stackIn_33_3, stackIn_34_4, -1);
            oo.b(var13);
            if (hh.field_b &&
              sq.field_N &&
              !df.field_I) {
              stackIn_40_0 = 1;
            } else {
              stackIn_40_0 = 0;
            }
            var9 = stackIn_40_0;
            stackIn_46_0 = (param0) && (vk.i((byte) -39)) && (var9 == 0);
            dd.a(stackIn_46_0, 0);
            if (re.field_b) {
              if (var9 == 0) {
                return;
              }
              stackIn_56_0 = (param0) && (vk.i((byte) -39));
              kg.a(stackIn_56_0, (byte) 117);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ui.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -29394) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          stackIn_2_0 = -57;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ui.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        try {
          field_f = null;
          field_i = null;
          field_j = null;
          field_k = null;
          if (param0 > -41) {
            field_j = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ui.F(" + param0 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 ||
            mh.field_c == null) {
            io.field_b = false;
          }
          if (!param1) {
            if (null != mh.field_c) {
              if (mh.field_h > 0) {
                mh.field_h = mh.field_h - 1;
              } else {
                if (sq.field_Q > 0) {
                  sq.field_Q = sq.field_Q - 1;
                } else {
                  if (da.field_a >= b.field_d) {
                    var2_int = -72 / ((-39 - param0) / 44);
                    return;
                  }
                  if (da.field_a == 0) {
                    jq.a(false, (byte) -20);
                  }
                  da.field_a = da.field_a + 1;
                }
              }
            } else {
              if (ej.field_n == null) {
                io.field_b = false;
                if (sq.field_Q > 0) {
                  sq.field_Q = sq.field_Q - 1;
                } else {
                  if (da.field_a <= 0) {
                    if (mh.field_h < b.field_d) {
                      if (0 == mh.field_h) {
                        wf.a(6835);
                      }
                      mh.field_h = mh.field_h + 1;
                    }
                  } else {
                    da.field_a = da.field_a - 1;
                  }
                }
              } else {
                if (0 < mh.field_h) {
                  mh.field_h = mh.field_h - 1;
                } else {
                  if (da.field_a <= 0) {
                    if (sq.field_Q < b.field_d) {
                      if (0 == sq.field_Q) {
                        jq.a(true, (byte) 126);
                      }
                      sq.field_Q = sq.field_Q + 1;
                    }
                  } else {
                    da.field_a = da.field_a - 1;
                  }
                }
              }
            }
          } else {
            if (mh.field_h > 0) {
              mh.field_h = mh.field_h - 1;
            } else {
              if (0 >= sq.field_Q) {
                if (da.field_a > 0) {
                  da.field_a = da.field_a - 1;
                }
              } else {
                sq.field_Q = sq.field_Q - 1;
              }
            }
          }
          var2_intLifetime1 = -72 / ((-39 - param0) / 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ui.G(" + param0 + ',' + param1 + ')');
        }
    }

    ui(int param0, int param1, int param2) {
        try {
          this.field_l = param0;
          this.field_g = param1;
          this.field_h = 24 * this.field_l - (-12 - this.a(-29394));
          this.field_m = 12 + (24 * this.field_g + this.a(-29394));
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ui.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_f = new int[]{280, 180, 180, 180, 180, 180};
        field_i = new int[]{3, 3, 2, 3, 3, 4, 3, 3, 2, 2, 2, 4, 3, 3, 3, 3};
    }
}
