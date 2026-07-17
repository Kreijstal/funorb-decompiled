/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends sq {
    static int[] field_g;
    static vh field_j;
    static int field_h;
    private int field_f;
    static String field_e;
    static String field_i;

    final int h(int param0) {
        qe var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Pool.field_O;
        var2 = ((fj) this).field_d.j(75);
        var2.field_t = true;
        if (param0 == -1) {
          var3 = var2.field_u;
          if (var3 != 2) {
            if (3 != var3) {
              if (var3 != 1) {
                L0: {
                  if (var3 != 0) {
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return this.q(10);
              } else {
                return this.q(10) & ~nr.field_Y | nr.field_R;
              }
            } else {
              return this.q(10) & ~nr.field_Y | nr.field_V;
            }
          } else {
            return this.q(10) & ~nr.field_Y | nr.field_Q;
          }
        } else {
          return -103;
        }
    }

    final void c(int param0) {
        if (param0 > -25) {
            int discarded$0 = this.p(60);
        }
    }

    fj(al param0) {
        super(param0);
        ((fj) this).field_f = 1;
    }

    final int a(qe param0, int param1) {
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
            var3_int = -96 / ((-32 - param1) / 40);
            stackOut_0_0 = 12 - -param0.field_z;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("fj.CA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    final int a(boolean param0) {
        if (param0) {
            ((fj) this).field_f = 76;
            return 1;
        }
        return 1;
    }

    public static void b() {
        field_e = null;
        field_j = null;
        field_g = null;
        field_i = null;
    }

    final static int c(byte param0) {
        if (param0 >= -6) {
            int discarded$0 = fj.c((byte) -21);
        }
        return !pp.a(true) ? -1 + md.field_a.length : md.field_a.length;
    }

    private final int q(int param0) {
        if (param0 != 10) {
            field_j = null;
        }
        return nr.field_Q | ll.field_f;
    }

    final boolean a(int param0, byte param1, qe param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param1 == 9) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            L2: {
              if (param0 <= 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("fj.EA(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final static dd[] a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
            Object var5 = null;
            boolean discarded$0 = fj.a((String) null, (byte) 90);
        }
        return af.a(param0, 64, param2, param1, 1);
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (rg.field_p) {
              L1: {
                if (hn.field_b != 2) {
                  break L1;
                } else {
                  if (di.field_a == null) {
                    break L1;
                  } else {
                    var3 = (CharSequence) (Object) param0;
                    if (di.field_a.equals((Object) (Object) hq.a(91, var3))) {
                      if (param1 == -101) {
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        break L0;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("fj.RA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final int b(int param0) {
        int var2 = 77 / ((param0 - -79) / 38);
        return 1;
    }

    final boolean c(qe param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param1 < -33) {
                break L1;
              } else {
                dd[] discarded$2 = fj.a(67, 8, 86, true);
                break L1;
              }
            }
            L2: {
              if (param0.field_n != param0.field_z) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("fj.C(");
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
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final dd b(qe param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        dd stackIn_5_0 = null;
        dd stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd stackOut_6_0 = null;
        dd stackOut_4_0 = null;
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
            if (param1 == 1) {
              if (param0.field_z != -1) {
                stackOut_6_0 = d.field_a[param0.field_z];
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = mf.field_n;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (dd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fj.JA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final int a(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        if (param0 != -1) {
            Object var4 = null;
            boolean discarded$0 = fj.a((String) null, (byte) 119);
        }
        for (var2 = 1; var2 < 9; var2++) {
            if (!(!((fj) this).field_d.field_l[var2].field_s)) {
                return var2;
            }
        }
        return 9;
    }

    final void n(int param0) {
        ((fj) this).field_f = ((fj) this).a(-1);
        if (param0 != 11828) {
            ((fj) this).n(-102);
        }
    }

    final boolean f(int param0) {
        if (param0 < 113) {
            int discarded$0 = 0;
            fj.b();
        }
        return true;
    }

    final int a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        Object var6 = null;
        cr var6_ref = null;
        int var7 = 0;
        qe var8 = null;
        qe var9 = null;
        aa var10 = null;
        aa var11 = null;
        var6 = null;
        var7 = Pool.field_O;
        var8 = ((fj) this).field_d.j(123);
        var9 = var8;
        if (var9 == null) {
          throw new IllegalStateException("Couldn't get the last shot to examine!");
        } else {
          L0: {
            var3 = 0;
            if (((fj) this).field_d.d((byte) 118)) {
              var9.a(3, -14, new int[1]);
              int discarded$1 = -47;
              var3 = var3 | (this.d() | um.field_c);
              var9.field_t = true;
              var9.field_w = (byte)(var9.field_w - 1);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var9.field_n != -1) {
              if (((fj) this).field_f == var9.field_n) {
                break L1;
              } else {
                var9.a(8, -14, new int[0]);
                var3 = var3 | this.o(0);
                var9.field_w = (byte)(var9.field_w - 1);
                var9.field_t = true;
                break L1;
              }
            } else {
              var9.a(7, -14, new int[1]);
              var9.field_t = true;
              var3 = var3 | this.p(75);
              var9.field_w = (byte)(var9.field_w - 1);
              break L1;
            }
          }
          L2: {
            var4 = 74 % ((-37 - param0) / 60);
            if (var3 != 0) {
              if (var9.field_m.c(0)) {
                break L2;
              } else {
                var11 = new aa(var9.field_m);
                var6_ref = (cr) (Object) var11.b((byte) -92);
                L3: while (true) {
                  if (var6_ref == null) {
                    break L2;
                  } else {
                    if (9 != var6_ref.field_n) {
                      var6_ref = (cr) (Object) var11.b(-86);
                      continue L3;
                    } else {
                      var9.a(9, -14, new int[1]);
                      var9.field_t = true;
                      return hm.field_e;
                    }
                  }
                }
              }
            } else {
              L4: {
                if (!var9.field_m.c(0)) {
                  var10 = new aa(var9.field_m);
                  var6_ref = (cr) (Object) var10.b((byte) -92);
                  L5: while (true) {
                    if (var6_ref == null) {
                      break L4;
                    } else {
                      if (var6_ref.field_n != 9) {
                        var3 = var3 | nd.field_j;
                        var9.field_w = (byte)(var9.field_w + 1);
                        var6_ref = (cr) (Object) var10.b(-126);
                        continue L5;
                      } else {
                        var9.a(10, -14, new int[1]);
                        return ag.field_e;
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              if (((fj) this).field_d.a(false, (byte) 81, var9)) {
                if (((fj) this).a((var9.field_L - -1) % ((fj) this).field_d.field_n, -102)) {
                  var9.field_w = (byte)(var9.field_w + 1);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                if (((fj) this).a(var9.field_L % ((fj) this).field_d.field_n, -41)) {
                  var9.field_w = (byte)(var9.field_w - 1);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
          }
          return var3;
        }
    }

    final static boolean a(String param0, int[] param1, int param2, int param3, long param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var6_int = 94 % ((param2 - -49) / 53);
                if (param1 == null) {
                  break L2;
                } else {
                  L3: {
                    if (2 != param3) {
                      break L3;
                    } else {
                      if (!tq.a(false, param4, param0)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("fj.QA(");
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
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          L5: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_6_0 != 0;
    }

    private final int o(int param0) {
        if (param0 != 0) {
            int discarded$0 = this.o(-69);
        }
        return this.q(param0 + 10);
    }

    final int i(int param0) {
        if (param0 != 26840) {
            field_j = null;
        }
        return 10;
    }

    final int[] a(int param0, byte param1) {
        li var3 = null;
        int var4 = 0;
        int var5 = 0;
        li var6 = null;
        var5 = Pool.field_O;
        var6 = new li(new int[1]);
        var3 = var6;
        var4 = 0;
        L0: while (true) {
          if (var4 >= 7) {
            L1: {
              fd.a(dj.field_a, up.field_M, (byte) -54);
              no.field_s[1] = 1;
              no.field_s[0] = 0;
              no.field_s[3] = up.field_M[1];
              no.field_s[2] = up.field_M[0];
              no.field_s[6] = up.field_M[3];
              no.field_s[4] = up.field_M[2];
              no.field_s[5] = 9;
              no.field_s[7] = -1;
              if (param1 == -32) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            no.field_s[10] = -1;
            no.field_s[12] = -1;
            no.field_s[14] = -1;
            no.field_s[13] = up.field_M[6];
            no.field_s[8] = up.field_M[4];
            no.field_s[9] = up.field_M[5];
            no.field_s[11] = -1;
            no.field_s[15] = -1;
            return no.field_s;
          } else {
            up.field_M[var4] = var4 - -2;
            dj.field_a[var4] = var6.a(23165, 2048);
            var4++;
            continue L0;
          }
        }
    }

    final byte b(int param0, int param1) {
        if (param1 != 30554) {
            int[] discarded$0 = ((fj) this).a(93, (byte) 18);
        }
        return (byte)param0;
    }

    private final int d() {
        int var2 = -94;
        return this.q(10);
    }

    final boolean a(int param0, byte param1, int param2) {
        if (param1 <= 122) {
            return false;
        }
        return param2 > 0 ? true : false;
    }

    private final int p(int param0) {
        if (param0 < 8) {
            int discarded$0 = fj.c((byte) -24);
        }
        return this.q(10);
    }

    final boolean a(int param0, int param1) {
        if (param1 >= -28) {
            return true;
        }
        ((fj) this).field_d.e(12226, 0);
        return !((fj) this).field_d.field_r[((fj) this).a(-1)].field_j ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[8192];
        field_i = "Chat view has been scrolled up. Scroll down to chat.";
        field_e = "Unpacking graphics";
    }
}
