/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static String field_a;
    static vd field_e;
    static String field_d;
    static String[][] field_b;
    static ea[] field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int var16 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var17 = null;
        var16 = MinerDisturbance.field_ab;
        if (param5 != 255) {
          return;
        }
        param1--;
        while (param1 >= 0) {
          try {
            var17 = param6;
            var10 = var17;
            var11 = param3;
            var12 = param8;
            var13 = param7;
            var14 = param0;
            var15 = var17[var11] >> 1 & 8355711;
            var10[var11] = var15 + (c.a(16711680, var12 >> 1) + (c.a(65280, var13 >> 9) + c.a(var14 >> 17, 255)));
            param3++;
            param0 = param0 + param4;
            param8 = param8 + param2;
            param7 = param7 + param9;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10_ref = decompiledCaughtException;
            stackIn_10_0 = var10_ref;
            stackIn_10_1 = new StringBuilder().append("nj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
          }
          param1--;
        }
    }

    final static void a(byte param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (null != w.field_W) {
            try {
              w.field_W.a((byte) 115, 0L);
              w.field_W.a(kj.field_a.field_u, 24, kj.field_a.field_o, true);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              if (param0 != 89) {
                return;
              }
              kj.field_a.field_o = kj.field_a.field_o + 24;
              return;
            }
          }
          if (param0 != 89) {
            return;
          }
          kj.field_a.field_o = kj.field_a.field_o + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        int var1;
        int var1Lifetime1;
        if (param0) {
          var1 = 255 * (640 + ui.field_L) / 640;
          if (0 > var1) {
            var1 = 0;
          }
          if (lb.field_q) {
            if (el.field_c) {
              if (var1 >= 255) {
                var1 = 255;
              }
              var1 = 255 + (-255 + var1);
            }
            if (var1 >= 255) {
              mf.field_c.g(0, 0);
            } else {
              if (tb.field_e) {
                mf.field_c.f(0, 0, var1);
              } else {
                if (el.field_c) {
                  mf.field_c.f(0, 0, var1);
                } else {
                  if (oj.field_J <= 11) {
                    mf.field_c.g(0, 0);
                  } else {
                    mf.field_c.f(0, 0, var1);
                  }
                }
              }
            }
          } else {
            if (!el.field_c) {
              ai.a(bj.field_e.field_f, 0, mf.field_c.field_D, 0, 307200);
              mf.field_c.g();
              eh.a(4, 4, 0, 0, 640, 480);
              mf.field_c.g(0, 0, 50);
              bj.field_e.a((byte) -45);
              lb.field_q = true;
            }
            if (el.field_c) {
              if (var1 >= 255) {
                var1 = 255;
              }
              var1 = 255 + (-255 + var1);
            }
            if (var1 >= 255) {
              mf.field_c.g(0, 0);
            } else {
              if (tb.field_e) {
                mf.field_c.f(0, 0, var1);
              } else {
                if (el.field_c) {
                  mf.field_c.f(0, 0, var1);
                } else {
                  if (oj.field_J > 11) {
                    mf.field_c.f(0, 0, var1);
                  } else {
                    mf.field_c.g(0, 0);
                  }
                }
              }
            }
          }
          return;
        }
        field_a = (String) null;
        var1Lifetime1 = 255 * (640 + ui.field_L) / 640;
        if (0 > var1Lifetime1) {
          var1Lifetime1 = 0;
        }
        if (lb.field_q) {
          if (el.field_c) {
            if (var1Lifetime1 >= 255) {
              var1Lifetime1 = 255;
            }
            var1Lifetime1 = 255 + (-255 + var1Lifetime1);
          }
          if (var1Lifetime1 < 255) {
            if (tb.field_e) {
              mf.field_c.f(0, 0, var1Lifetime1);
            } else {
              if (el.field_c) {
                mf.field_c.f(0, 0, var1Lifetime1);
              } else {
                if (oj.field_J > 11) {
                  mf.field_c.f(0, 0, var1Lifetime1);
                } else {
                  mf.field_c.g(0, 0);
                }
              }
            }
          } else {
            mf.field_c.g(0, 0);
          }
        } else {
          if (el.field_c) {
            if (el.field_c) {
              if (var1Lifetime1 >= 255) {
                var1Lifetime1 = 255;
              }
              var1Lifetime1 = 255 + (-255 + var1Lifetime1);
            }
            if (var1Lifetime1 < 255) {
              if (tb.field_e) {
                mf.field_c.f(0, 0, var1Lifetime1);
              } else {
                if (el.field_c) {
                  mf.field_c.f(0, 0, var1Lifetime1);
                } else {
                  if (oj.field_J > 11) {
                    mf.field_c.f(0, 0, var1Lifetime1);
                  } else {
                    mf.field_c.g(0, 0);
                  }
                }
              }
            } else {
              mf.field_c.g(0, 0);
            }
          } else {
            ai.a(bj.field_e.field_f, 0, mf.field_c.field_D, 0, 307200);
            mf.field_c.g();
            eh.a(4, 4, 0, 0, 640, 480);
            mf.field_c.g(0, 0, 50);
            bj.field_e.a((byte) -45);
            lb.field_q = true;
            if (el.field_c) {
              if (var1Lifetime1 >= 255) {
                var1Lifetime1 = 255;
              }
              var1Lifetime1 = 255 + (-255 + var1Lifetime1);
            }
            if (var1Lifetime1 >= 255) {
              mf.field_c.g(0, 0);
            } else {
              if (tb.field_e) {
                mf.field_c.f(0, 0, var1Lifetime1);
              } else {
                if (el.field_c) {
                  mf.field_c.f(0, 0, var1Lifetime1);
                } else {
                  if (oj.field_J <= 11) {
                    mf.field_c.g(0, 0);
                  } else {
                    mf.field_c.f(0, 0, var1Lifetime1);
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        int var1 = 76 / ((param0 - 63) / 46);
        field_c = null;
        field_e = null;
        field_a = null;
        field_b = (String[][]) null;
    }

    final static boolean a(String param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        try {
          if (param1 < 104) {
            nj.a((byte) -21);
          }
          var2_int = param0.charAt(0);
          for (var3 = 1; param0.length() > var3; var3++) {
            if (param0.charAt(var3) != var2_int) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("nj.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = new String[][]{null, new String[]{"Burning Oil: Oh dear! This oil is on fire. Watch out: it will detonate any gas it comes into contact with and burn anything that touches it, including you!"}};
        field_d = "Please wait...";
    }
}
