/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dt {
    private boolean field_h;
    private int[] field_j;
    private int field_e;
    hca field_g;
    eha field_i;
    private boolean field_a;
    la[] field_b;
    private int field_l;
    private boolean field_k;
    int field_c;
    static String field_n;
    private boolean field_f;
    private int field_m;
    private int field_d;

    private final la a(byte param0, la param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        la stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        la stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 > 68) {
              var3_int = param1.c(115);
              if (var3_int < ((dt) this).field_b.length + -1) {
                stackOut_5_0 = ((dt) this).field_b[1 + var3_int];
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (la) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("dt.CA(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_6_0;
    }

    private final boolean c(int param0, int param1) {
        return -1 != ((dt) this).field_j[param0];
    }

    final void d(int param0, int param1) {
        int var3 = -110 % ((param0 - 73) / 33);
    }

    final void a(la param0, int param1) {
        eha var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -9774) {
                break L1;
              } else {
                int discarded$3 = ((dt) this).a(false);
                break L1;
              }
            }
            L2: {
              ((dt) this).field_f = false;
              ((dt) this).field_h = true;
              var3 = ((dt) this).m(9262);
              if (var3 != null) {
                var3.a(35, param0);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("dt.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final boolean f(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 == 10915) {
          L0: {
            if (this.c(param0, -1)) {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L0;
            } else {
              if (!((dt) this).field_b[((dt) this).field_g.r(param1 ^ -10957)].b(param0, (byte) -44)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_12_0 != 0;
        } else {
          int discarded$2 = ((dt) this).b(false);
          if (!this.c(param0, -1)) {
            L1: {
              if (!((dt) this).field_b[((dt) this).field_g.r(param1 ^ -10957)].b(param0, (byte) -44)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          } else {
            return true;
          }
        }
    }

    final int a(boolean param0) {
        if (!(!((dt) this).field_a)) {
            return 0;
        }
        if (!param0) {
            return -119;
        }
        return ((dt) this).field_g.f((byte) -88).field_a;
    }

    final int l(int param0) {
        if (param0 > -2) {
            return 8;
        }
        return ((dt) this).field_m;
    }

    final boolean g(int param0) {
        if (param0 < 67) {
            boolean discarded$0 = ((dt) this).j(84);
            return ((dt) this).field_f;
        }
        return ((dt) this).field_f;
    }

    final boolean b(int param0) {
        if (param0 != 0) {
            field_n = null;
            return ((dt) this).field_a;
        }
        return ((dt) this).field_a;
    }

    final boolean i(int param0) {
        if (param0 != -14886) {
            ((dt) this).field_k = true;
            return ((dt) this).field_h;
        }
        return ((dt) this).field_h;
    }

    final void a(int param0, boolean param1) {
        ((dt) this).field_a = param1 ? true : false;
        if (param0 <= 35) {
            ((dt) this).field_l = 58;
        }
    }

    final void a(hca param0, int param1, int param2, int param3) {
        eha var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var5 = ((dt) this).m(9262);
              if (var5 == null) {
                break L1;
              } else {
                var5.a(15, param0, param1, param0.f((byte) -96), ((dt) this).field_c, param3);
                break L1;
              }
            }
            L2: {
              if (param2 == 1) {
                break L2;
              } else {
                ((dt) this).d(18, 84);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("dt.IA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void n(int param0) {
        if (param0 != 0) {
            dt.n(-118);
            field_n = null;
            return;
        }
        field_n = null;
    }

    final boolean e(int param0) {
        if (param0 != -31170) {
            return false;
        }
        return ((dt) this).field_k;
    }

    final boolean j(int param0) {
        if (param0 != 0) {
            ((dt) this).field_m = 36;
            return ((dt) this).field_a;
        }
        return ((dt) this).field_a;
    }

    final int b(boolean param0) {
        if (param0) {
            field_n = null;
            return ((dt) this).field_l;
        }
        return ((dt) this).field_l;
    }

    final boolean d(int param0) {
        if (param0 != 28091) {
            return true;
        }
        return ((dt) this).field_d > 0 ? true : false;
    }

    final void a(int param0, int param1) {
        if (param0 != -1) {
            Object var4 = null;
            la discarded$1 = this.a((byte) -105, (la) null);
            if (((dt) this).field_a) {
                return;
            }
            ((dt) this).field_f = ((dt) this).field_g.d((byte) -95, 3);
            ((dt) this).field_h = false;
            ((dt) this).field_g.f((byte) -64).d(param1, 0);
            if (!(!((dt) this).field_a)) {
                return;
            }
            ((dt) this).field_c = ((dt) this).field_c + 1;
            return;
        }
        if (((dt) this).field_a) {
            return;
        }
        ((dt) this).field_f = ((dt) this).field_g.d((byte) -95, 3);
        ((dt) this).field_h = false;
        ((dt) this).field_g.f((byte) -64).d(param1, 0);
        if (!(!((dt) this).field_a)) {
            return;
        }
        ((dt) this).field_c = ((dt) this).field_c + 1;
    }

    final void a(int param0, int param1, int param2) {
        ((dt) this).field_j[param0] = param1;
        if (param2 >= -28) {
            ((dt) this).field_g = null;
        }
    }

    final void c(int param0) {
        la var2 = null;
        la var3 = null;
        Object var5 = null;
        eha var6 = null;
        eha var7 = null;
        var2 = ((dt) this).a((byte) 123);
        if (param0 == -1) {
          L0: {
            var2.g(58);
            var3 = this.a((byte) 104, var2);
            if (!((dt) this).field_g.l(false)) {
              break L0;
            } else {
              if (var3 != null) {
                break L0;
              } else {
                var3 = ((dt) this).a(param0 + -114);
                break L0;
              }
            }
          }
          var7 = ((dt) this).m(param0 + 9263);
          if (var7 == null) {
            if (var3 == null) {
              ((dt) this).a(89, true);
              return;
            } else {
              var3.i((byte) -98);
              return;
            }
          } else {
            var7.a(((dt) this).field_g, var2, false);
            if (var3 == null) {
              ((dt) this).a(89, true);
              return;
            } else {
              var3.i((byte) -98);
              return;
            }
          }
        } else {
          L1: {
            var5 = null;
            ((dt) this).a((la) null, -52);
            var2.g(58);
            var3 = this.a((byte) 104, var2);
            if (!((dt) this).field_g.l(false)) {
              break L1;
            } else {
              if (var3 != null) {
                break L1;
              } else {
                var3 = ((dt) this).a(param0 + -114);
                break L1;
              }
            }
          }
          var6 = ((dt) this).m(param0 + 9263);
          if (var6 != null) {
            var6.a(((dt) this).field_g, var2, false);
            if (var3 == null) {
              ((dt) this).a(89, true);
              return;
            } else {
              var3.i((byte) -98);
              return;
            }
          } else {
            L2: {
              if (var3 == null) {
                ((dt) this).a(89, true);
                break L2;
              } else {
                var3.i((byte) -98);
                break L2;
              }
            }
            return;
          }
        }
    }

    final void a(iq param0, int param1) {
        la[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        la var5 = null;
        int var6 = 0;
        la[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = ((dt) this).field_b;
              var3 = var7;
              if (param1 == -1) {
                break L1;
              } else {
                int discarded$2 = this.e(41, -81);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.a(param0, param1 ^ -6);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("dt.P(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    final void a(hca param0, int param1) {
        eha var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var3 = ((dt) this).m(9262);
            if (param1 == -1) {
              L1: {
                if (var3 != null) {
                  var3.a(15, param0, 0, param0.f((byte) -118), ((dt) this).field_c, 2);
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("dt.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final void b(byte param0) {
        System.out.println("DUMPING STATE on tick " + ((dt) this).field_c);
        System.out.println("Player: " + ((dt) this).field_g.toString());
        if (param0 != 114) {
            ((dt) this).field_k = false;
            ((dt) this).field_g.f((byte) 65).d(true);
            return;
        }
        ((dt) this).field_g.f((byte) 65).d(true);
    }

    final boolean k(int param0) {
        if (param0 != -19271) {
            return false;
        }
        if (((dt) this).field_a) {
            return false;
        }
        if (((dt) this).field_k) {
            return false;
        }
        return true;
    }

    private final int e(int param0, int param1) {
        if (param1 != 0) {
            boolean discarded$0 = ((dt) this).b(-8);
            return ((dt) this).field_j[param0];
        }
        return ((dt) this).field_j[param0];
    }

    final la a(int param0) {
        if (param0 >= -22) {
            boolean discarded$0 = ((dt) this).b(-15);
            return ((dt) this).field_b[0];
        }
        return ((dt) this).field_b[0];
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -86) {
            Object var6 = null;
            ((dt) this).a((iq) null, 103);
            ((dt) this).field_b[param3].b(false, param1, param0);
            return;
        }
        ((dt) this).field_b[param3].b(false, param1, param0);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -11) {
            ((dt) this).a(96, 125);
            ((dt) this).field_b[param2].c(-22490, param1);
            return;
        }
        ((dt) this).field_b[param2].c(-22490, param1);
    }

    final int b(boolean param0, int param1) {
        if (param0) {
            ((dt) this).a((byte) 29, -34, 71);
            return iia.d(this.e(param1, 0), ((dt) this).field_b[((dt) this).field_g.r(-101)].a(-121, param1), 2);
        }
        return iia.d(this.e(param1, 0), ((dt) this).field_b[((dt) this).field_g.r(-101)].a(-121, param1), 2);
    }

    final boolean h(int param0) {
        if (param0 < 118) {
            ((dt) this).field_h = true;
            return !((dt) this).field_a ? true : false;
        }
        return !((dt) this).field_a ? true : false;
    }

    final la a(byte param0) {
        int var2 = -127 / ((param0 - 64) / 59);
        return ((dt) this).field_b[((dt) this).field_g.r(-108)];
    }

    final int f(int param0) {
        int var2 = -97 % ((34 - param0) / 56);
        return ((dt) this).field_b.length;
    }

    final void a(int param0, int param1, la param2) {
        try {
            param2.a(param1, false);
            if (param0 != -28088) {
                boolean discarded$0 = ((dt) this).d(41);
            }
            ((dt) this).field_b[param1] = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "dt.V(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final eha m(int param0) {
        if (param0 != 9262) {
            boolean discarded$0 = ((dt) this).d(36);
            return ((dt) this).field_i;
        }
        return ((dt) this).field_i;
    }

    final void b(int param0, int param1) {
        ((dt) this).field_j[param0] = param1;
    }

    final la a(boolean param0, int param1) {
        if (!param0) {
            return null;
        }
        return ((dt) this).field_b[param1];
    }

    dt(eha param0, hca param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((dt) this).field_j = new int[9];
        try {
          L0: {
            ((dt) this).field_e = param2;
            ((dt) this).field_g = param1;
            ((dt) this).field_d = param3;
            ((dt) this).field_i = param0;
            ((dt) this).field_m = ((dt) this).field_d + ((dt) this).field_e;
            ((dt) this).field_b = new la[((dt) this).field_m];
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= ((dt) this).field_j.length) {
                break L0;
              } else {
                ((dt) this).field_j[var5_int] = -1;
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("dt.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Please wait...";
    }
}
