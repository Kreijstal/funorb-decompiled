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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param2.field_z != this.b(param0, 30554)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("vp.EA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    vp(al param0) {
        super(param0);
    }

    final int[] a(int param0, byte param1) {
        if (param1 != -32) {
            this.b(79);
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

    private final boolean o(int param0) {
        int var2;
        int var3;
        var3 = Pool.field_O;
        var2 = 1;
        L0: while (true) {
          if (this.field_d.field_l.length <= var2) {
            if (param0 == 24812) {
              return true;
            } else {
              return true;
            }
          } else {
            if (var2 != 8) {
              if (this.field_d.field_l[var2].field_s) {
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param0.field_z != this.b(param0.field_n, 30554)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("vp.C(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
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
        return this.o(24812) ? 2 : 0;
    }

    final int a(qe param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -51 % ((-32 - param1) / 40);
            stackIn_1_0 = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("vp.CA(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
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
            qe var3 = (qe) null;
            this.a((qe) null, 33);
        }
        return 16;
    }

    final int h(int param0) {
        if (param0 != -1) {
            this.c(-66);
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
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                kn.field_e = new oq(param9);
                ej.field_j = new oq(param11);
                vj.field_d = param0;
                kh.field_uc = param4;
                nd.field_a = param8;
                if (param2 >= 71) {
                  L1: {
                    cq.field_a = param5;
                    kc.field_c = param12;
                    if (!param6) {
                      stackIn_5_0 = 0;
                      break L1;
                    } else {
                      stackIn_5_0 = 1;
                      break L1;
                    }
                  }
                  L2: {
                    hk.field_s = stackIn_5_0 != 0;
                    kn.field_j = param13;
                    mp.field_S = param7;
                    if (!param3) {
                      stackIn_8_0 = 0;
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    bf.field_g = stackIn_8_0 != 0;
                    lf.field_b = param10;
                    im.field_ec = param1;
                    if (nd.field_a.field_b != null) {
                      try {
                        L4: {
                          nl.field_c = new ir(nd.field_a.field_b, 64, 0);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var15 = (IOException) (Object) decompiledCaughtException;
                        throw new RuntimeException(var15.toString());
                      }
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var15_ref);

                stackIn_16_1 = new StringBuilder().append("vp.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

                if (param7 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L5;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

                if (param8 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L6;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L6;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void p(int param0) {
        field_e = null;
        if (param0 != -9) {
            vp.a(89, 15, (byte) -50, true, -63, 93, true, (String) null, (sj) null, -10, -14, -81, -56, -98L);
        }
    }

    final dd b(qe param0, int param1) {
        RuntimeException var3 = null;
        dd stackIn_2_0 = null;
        dd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 1) {
              L1: {
                if ((param0.field_z ^ -1) != 0) {
                  stackIn_6_0 = dq.field_a.field_e[2];
                  break L1;
                } else {
                  stackIn_6_0 = dq.field_a.field_e[0];
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (dd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("vp.JA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        if (param2 != -111) {
            field_f = 46;
        }
        return param0 == this.b(param1, 30554) ? true : false;
    }

    final byte b(int param0, int param1) {
        if (!(param0 != 0)) {
            return (byte) -1;
        }
        if ((param0 ^ -1) == -9) {
            return (byte) 2;
        }
        if (param1 != 30554) {
            field_f = -105;
            return (byte) 0;
        }
        return (byte) 0;
    }

    final int a(byte param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        aa var7;
        cr var8;
        int var9;
        qe var10;
        qe var11;
        var9 = Pool.field_O;
        var10 = this.field_d.j(90);
        var11 = var10;
        var3 = -60 / ((-37 - param0) / 60);
        if (var11 == null) {
          throw new IllegalStateException("Couldn't get the last shot to examine!");
        } else {
          if ((var11.field_q ^ -1) != -3) {
            throw new IllegalStateException("Shot not finished yet, foo!");
          } else {
            L0: {
              var4 = var11.field_z;
              var5 = 0;
              if (!this.field_d.d((byte) 74)) {
                break L0;
              } else {
                var11.a(3, -14, new int[]{var10.field_L});
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
                  if ((var4 ^ -1) == -3) {
                    break L2;
                  } else {
                    var11.a(2, -14, new int[]{var10.field_L});
                    var5 = var5 | be.field_I;
                    var11.field_w = (byte)(var11.field_w - 1);
                    var11.field_t = true;
                    break L1;
                  }
                }
              }
              if ((var11.field_n ^ -1) == 0) {
                var11.a(7, -14, new int[]{var10.field_L});
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
                  if ((((cr) ((Object) var11.field_m.c((byte) 62))).field_n ^ -1) != -9) {
                    break L3;
                  } else {
                    if (-3 == (var4 ^ -1)) {
                      return ag.field_e;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            var7 = new aa(var11.field_m);
            var8 = (cr) ((Object) var7.b((byte) -92));
            L4: while (true) {
              if (var8 == null) {
                return var5;
              } else {
                if ((var8.field_n ^ -1) == -9) {
                  var11.a(5, -14, new int[]{this.field_d.field_A});
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
                  var8 = (cr) ((Object) var7.b(-101));
                  continue L4;
                }
              }
            }
          }
        }
    }

    static {
        field_e = "<%0>: You have an extra shot!";
    }
}
