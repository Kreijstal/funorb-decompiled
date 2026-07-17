/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ji {
    wd field_g;
    static tf field_r;
    static String field_l;
    wd field_e;
    static int field_h;
    wd field_p;
    static String field_d;
    static String[] field_a;
    static String field_n;
    wd field_c;
    int field_o;
    long field_k;
    qc field_m;
    volatile int field_b;
    byte field_i;
    volatile int field_q;
    qc field_j;
    sd field_f;

    abstract void h(int param0);

    final static void f(int param0) {
        pk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            var1 = fj.field_q;
            L1: while (true) {
              if (!cf.c((byte) -114)) {
                break L0;
              } else {
                var1.a(8, (byte) -71);
                int fieldTemp$5 = var1.field_f + 1;
                var1.field_f = var1.field_f + 1;
                var2 = fieldTemp$5;
                pf.a(46, var1);
                fj.field_q.f(11700, var1.field_f + -var2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1_ref, "ji.B(" + -102 + 41);
        }
    }

    abstract void a(Object param0, boolean param1, boolean param2);

    final sd a(byte param0, int param1, int param2, int param3, boolean param4) {
        long var6 = 0L;
        sd var8 = null;
        sd stackIn_1_0 = null;
        sd stackIn_2_0 = null;
        sd stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        sd stackOut_0_0 = null;
        sd stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        sd stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var6 = ((long)param1 << 32) - -(long)param3;
          var8 = new sd();
          var8.field_i = var6;
          stackOut_0_0 = (sd) var8;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = (sd) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (sd) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_q = stackIn_3_1 != 0;
          var8.field_E = param0;
          if (param4) {
            if (((ji) this).a(param2 ^ 108) < 20) {
              ((ji) this).field_g.a(param2 ^ -123, (rc) (Object) var8);
              break L1;
            } else {
              throw new RuntimeException();
            }
          } else {
            if (((ji) this).a(false) < 20) {
              ((ji) this).field_p.a(8, (rc) (Object) var8);
              break L1;
            } else {
              throw new RuntimeException();
            }
          }
        }
        if (param2 != -21) {
          ((ji) this).field_g = null;
          return var8;
        } else {
          return var8;
        }
    }

    final int a(int param0) {
        if (param0 >= -39) {
          ji.a(49L, (byte) 33);
          return ((ji) this).field_g.b((byte) 67) + ((ji) this).field_e.b((byte) 67);
        } else {
          return ((ji) this).field_g.b((byte) 67) + ((ji) this).field_e.b((byte) 67);
        }
    }

    final static void a(long param0, byte param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Thread.sleep(param0);
                if (param1 == -33) {
                  break L0;
                } else {
                  field_a = null;
                  return;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean g(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 20) {
          L0: {
            field_l = null;
            if (((ji) this).a(-104) < 20) {
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
            if (((ji) this).a(-104) < 20) {
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

    abstract void e(int param0);

    final int a(boolean param0) {
        if (param0) {
          ((ji) this).field_o = -38;
          return ((ji) this).field_p.b((byte) 67) + ((ji) this).field_c.b((byte) 67);
        } else {
          return ((ji) this).field_p.b((byte) 67) + ((ji) this).field_c.b((byte) 67);
        }
    }

    final static short[] a(short[] param0, int param1, int param2, pk param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_16_0 = null;
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
        short[] stackOut_15_0 = null;
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
        var8 = Geoblox.field_C;
        try {
          L0: {
            var4_int = param3.e((byte) -17, param1);
            if (var4_int != param2) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (var4_int != param0.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param3.e((byte) -17, 4);
                var6 = (short)param3.e((byte) -17, 16);
                if (var5 <= 0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param0[var7] = (short)var6;
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param0[var7] = (short)(var6 + param3.e((byte) -17, var5));
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (short[]) param0;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ji.J(");
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
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param1).append(44).append(param2).append(44);
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
          throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0;
    }

    abstract boolean a(byte param0);

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -21) {
          L0: {
            boolean discarded$10 = ((ji) this).a((byte) 74);
            if (((ji) this).a(false) < 20) {
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
            if (((ji) this).a(false) < 20) {
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

    final static na[] c(int param0) {
        int var2 = 0;
        int var3 = Geoblox.field_C;
        na[] var1 = new na[sb.field_a];
        for (var2 = 0; sb.field_a > var2; var2++) {
            var1[var2] = new na(pg.field_b, dd.field_C, gh.field_m[var2], md.field_e[var2], rc.field_j[var2], hl.field_K[var2], mj.field_a[var2], cm.field_j);
        }
        kj.c(true);
        return var1;
    }

    public static void d(int param0) {
        field_n = null;
        field_r = null;
        field_a = null;
        field_d = null;
        field_l = null;
        int var1 = 78;
    }

    ji() {
        ((ji) this).field_g = new wd();
        ((ji) this).field_e = new wd();
        ((ji) this).field_p = new wd();
        ((ji) this).field_c = new wd();
        ((ji) this).field_m = new qc(6);
        ((ji) this).field_b = 0;
        ((ji) this).field_i = (byte) 0;
        ((ji) this).field_q = 0;
        ((ji) this).field_j = new qc(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_r = new tf();
        field_h = 0;
        field_d = "Passwords must be between 5 and 20 characters long";
        field_n = "Waiting for music";
        field_a = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
