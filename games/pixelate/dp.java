/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends de {
    static String field_p;
    static boolean[] field_o;

    final void c(byte param0) {
        RuntimeException var2 = null;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        try {
          L0: {
            if (param0 <= -13) {
              L1: {
                if (gq.d(127)) {
                  stackOut_5_0 = 12;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              }
              la.a(stackIn_6_0, -1, false, -25528);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "dp.L(" + param0 + ')');
        }
    }

    dp(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, boolean param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        ha var6 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var4_int = param0 * 2;
              if (param0 < 128) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = (param0 - 128) * 2;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_4_0;
              if (!param2) {
                break L2;
              } else {
                var6_int = var4_int;
                var4_int = var5;
                var5 = var6_int;
                break L2;
              }
            }
            L3: {
              if (null == c.field_R) {
                c.field_R = vk.a(480, 2, (java.awt.Component) (Object) new java.awt.Canvas(), 640);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1) {
                break L4;
              } else {
                field_p = null;
                break L4;
              }
            }
            var6 = qa.field_f;
            qa.field_f = c.field_R;
            qa.field_f.a(19692);
            ((dp) this).c(0);
            qa.field_f = var6;
            qa.field_f.a(19692);
            fi.a(c.field_R.field_e, var4_int, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "dp.GA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        try {
          L0: {
            L1: {
              if (((dp) this).field_l == 1) {
                gj.field_W[2].b(0, 45);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 11) {
                break L2;
              } else {
                field_p = null;
                break L2;
              }
            }
            L3: {
              var2_int = 0;
              if (((dp) this).field_l == 1) {
                var2_int = 120;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (2 != ((dp) this).field_l) {
                break L4;
              } else {
                var2_int = 80;
                break L4;
              }
            }
            L5: {
              if (((dp) this).field_l != 4) {
                break L5;
              } else {
                var2_int = 50;
                break L5;
              }
            }
            L6: {
              if (((dp) this).field_g.field_h > 7) {
                stackOut_18_0 = -210 + 30 * ((dp) this).field_g.field_h;
                stackIn_19_0 = stackOut_18_0;
                break L6;
              } else {
                stackOut_16_0 = 0;
                stackIn_19_0 = stackOut_16_0;
                break L6;
              }
            }
            var3 = stackIn_19_0;
            ((dp) this).a(var2_int, (byte) -128, var3);
            ((dp) this).b((byte) -71);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "dp.H(" + param0 + ')');
        }
    }

    final void a(int[] param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (((dp) this).field_k == null) {
                break L1;
              } else {
                var3_int = param0.length - ((dp) this).field_k.length;
                ((dp) this).field_d = ((dp) this).field_d - ((dp) this).field_i * var3_int / 2;
                break L1;
              }
            }
            super.a(param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("dp.MA(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              var4 = 122 % ((-13 - param0) / 37);
              var3_int = 0;
              if (((dp) this).field_l == 2) {
                var3_int = 40;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((dp) this).field_l != 4) {
                break L2;
              } else {
                var3_int = 70;
                break L2;
              }
            }
            stackOut_6_0 = super.b(118, param1) + -var3_int;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "dp.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    public static void e(int param0) {
        field_p = null;
        if (param0 != 2) {
            return;
        }
        try {
            field_o = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "dp.E(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = uf.field_d;
            var3 = bg.field_k;
            var4 = mg.field_h.field_Db.b(param0, 500);
            var5 = mg.field_h.field_Db.a(param0, 500) - -6;
            var6 = 2 + var4 * fq.field_q;
            var7 = ui.a(12, var2_int, var5, (byte) -1);
            var8 = pj.a(var6, var3, 20, (byte) 112);
            t.a(var7, var8, var5, var6, 0);
            t.d(1 + var7, 1 + var8, param1 + var5, var6 - 2, 16777088);
            int discarded$3 = mg.field_h.field_Db.a(param0, 3 + var7, nc.field_d + (1 + (var8 + -mg.field_h.field_Db.field_w)), 500, 1000, 0, -1, 0, 0, fq.field_q);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("dp.B(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void e(byte param0) {
        try {
            super.e((byte) -101);
            if (param0 > -64) {
                ((dp) this).a(125);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "dp.O(" + param0 + ')');
        }
    }

    final void c(int param0) {
        Object var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var2 = null;
                if (((dp) this).field_l == 1) {
                  break L2;
                } else {
                  if (((dp) this).field_l != 2) {
                    if (((dp) this).field_l == 4) {
                      var2 = (Object) (Object) qo.field_r;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var2 = (Object) (Object) ro.field_e;
              break L1;
            }
            if (null != var2) {
              L3: {
                ((ii) var2).a(false, param0 + param0);
                if (((dp) this).field_l != 1) {
                  break L3;
                } else {
                  t.a(0, 0, 640, 480);
                  rh.b((byte) 121);
                  break L3;
                }
              }
              break L0;
            } else {
              super.c(0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw aa.a((Throwable) var2, "dp.EA(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Enter name of player to add to list";
    }
}
