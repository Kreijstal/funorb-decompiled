/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vp extends sq {
    static int field_f;
    static String field_e;

    final boolean f(int param0) {
        if (param0 <= 113) {
            return true;
        }
        return false;
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
                field_f = 88;
                break L1;
              }
            }
            L2: {
              if (param2.field_z != ((vp) this).b(param0, 30554)) {
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
            stackOut_6_1 = new StringBuilder().append("vp.EA(").append(param0).append(',').append(param1).append(',');
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
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    vp(al param0) {
        super(param0);
    }

    final int[] a(int param0, byte param1) {
        if (param1 != -32) {
            int discarded$0 = ((vp) this).b(79);
        }
        return uj.field_a;
    }

    final boolean a(int param0, int param1) {
        if (param1 >= -28) {
            field_f = -107;
            return false;
        }
        return false;
    }

    final int b(int param0) {
        int var2 = -28 % ((-79 - param0) / 38);
        return 1;
    }

    private final boolean o() {
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        var2 = 1;
        L0: while (true) {
          if (((vp) this).field_d.field_l.length <= var2) {
            return true;
          } else {
            if (var2 != 8) {
              if (((vp) this).field_d.field_l[var2].field_s) {
                return false;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
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
              if (param1 <= -33) {
                break L1;
              } else {
                field_f = -113;
                break L1;
              }
            }
            L2: {
              if (param0.field_z != ((vp) this).b(param0.field_n, 30554)) {
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
            stackOut_6_1 = new StringBuilder().append("vp.C(");
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
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final boolean a(int param0, byte param1, int param2) {
        if (param1 < 122) {
            return true;
        }
        return this.a(param0, param2, (byte) -111);
    }

    final int a(int param0) {
        if (param0 != -1) {
            field_f = -63;
        }
        int discarded$0 = 24812;
        return this.o() ? 2 : 0;
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
            var3_int = -51 % ((-32 - param1) / 40);
            stackOut_0_0 = -1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("vp.CA(");
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
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final void c(int param0) {
        if (param0 >= -25) {
            field_f = -12;
        }
    }

    final int i(int param0) {
        if (param0 != 26840) {
            Object var3 = null;
            int discarded$0 = ((vp) this).a((qe) null, 33);
        }
        return 16;
    }

    final int h(int param0) {
        if (param0 != -1) {
            ((vp) this).c(-66);
        }
        return 0;
    }

    final int a(boolean param0) {
        if (param0) {
            field_f = -51;
            return 1;
        }
        return 1;
    }

    final static void a(int param0, int param1, byte param2, boolean param3, int param4, int param5, boolean param6, String param7, sj param8, int param9, int param10, int param11, int param12, long param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
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
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
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
            try {
              L0: {
                kn.field_e = new oq(5000);
                ej.field_j = new oq(5000);
                vj.field_d = param0;
                kh.field_uc = param4;
                nd.field_a = param8;
                L1: {
                  cq.field_a = param5;
                  kc.field_c = param12;
                  if (!param6) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
                L2: {
                  hk.field_s = stackIn_5_0 != 0;
                  kn.field_j = param13;
                  mp.field_S = param7;
                  if (!param3) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                L3: {
                  bf.field_g = stackIn_8_0 != 0;
                  lf.field_b = param10;
                  im.field_ec = param1;
                  if (nd.field_a.field_b != null) {
                    {
                      L4: {
                        nl.field_c = new ir(nd.field_a.field_b, 64, 0);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) var15_ref;
                stackOut_14_1 = new StringBuilder().append("vp.OA(").append(param0).append(',').append(param1).append(',').append(86).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param7 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L5;
                }
              }
              L6: {
                stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param8 == null) {
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
              throw wm.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + 5000 + ',' + param10 + ',' + 5000 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void p() {
        field_e = null;
    }

    final dd b(qe param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        dd stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd stackOut_5_0 = null;
        dd stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1 == 1) {
              L1: {
                if (param0.field_z != -1) {
                  stackOut_5_0 = dq.field_a.field_e[2];
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = dq.field_a.field_e[0];
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (dd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("vp.JA(");
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
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    private final boolean a(int param0, int param1, byte param2) {
        return ~param0 == ~((vp) this).b(param1, 30554);
    }

    final byte b(int param0, int param1) {
        if (!(param0 != 0)) {
            return (byte) -1;
        }
        if (param0 == 8) {
            return (byte) 2;
        }
        if (param1 != 30554) {
            field_f = -105;
            return (byte) 0;
        }
        return (byte) 0;
    }

    final int a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aa var7 = null;
        cr var8 = null;
        int var9 = 0;
        qe var10 = null;
        qe var11 = null;
        var9 = Pool.field_O;
        var10 = ((vp) this).field_d.j(90);
        var11 = var10;
        var3 = -60 / ((-37 - param0) / 60);
        if (var11 == null) {
          throw new IllegalStateException("Couldn't get the last shot to examine!");
        } else {
          if (var11.field_q != 2) {
            throw new IllegalStateException("Shot not finished yet, foo!");
          } else {
            L0: {
              var4 = var11.field_z;
              var5 = 0;
              if (!((vp) this).field_d.d((byte) 74)) {
                break L0;
              } else {
                var11.a(3, -14, new int[1]);
                var11.field_w = (byte)(var11.field_w - 1);
                var11.field_t = true;
                var5 = var5 | (nr.field_R | (um.field_c | be.field_I));
                break L0;
              }
            }
            L1: {
              L2: {
                if (8 != var11.field_n) {
                  break L2;
                } else {
                  if (var4 == 2) {
                    break L2;
                  } else {
                    var11.a(2, -14, new int[1]);
                    var5 = var5 | be.field_I;
                    var11.field_w = (byte)(var11.field_w - 1);
                    var11.field_t = true;
                    break L1;
                  }
                }
              }
              if (var11.field_n == -1) {
                var11.a(7, -14, new int[1]);
                var11.field_t = true;
                var11.field_w = (byte)(var11.field_w - 1);
                var5 = var5 | be.field_I;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              var6 = var11.field_m.a(30);
              if (var5 != 0) {
                break L3;
              } else {
                if (var6 != 1) {
                  break L3;
                } else {
                  if (((cr) (Object) var11.field_m.c((byte) 62)).field_n != 8) {
                    break L3;
                  } else {
                    if (var4 == 2) {
                      return ag.field_e;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            var7 = new aa(var11.field_m);
            var8 = (cr) (Object) var7.b((byte) -92);
            L4: while (true) {
              if (var8 == null) {
                return var5;
              } else {
                if (var8.field_n == 8) {
                  var11.a(5, -14, new int[1]);
                  return hm.field_e;
                } else {
                  L5: {
                    if (0 != var8.field_n) {
                      var11.field_w = (byte)(var11.field_w + 1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var8 = (cr) (Object) var7.b(-101);
                  continue L4;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0>: You have an extra shot!";
    }
}
