/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bl extends tj {
    static sg field_r;
    ah field_q;
    static int[] field_n;
    static String field_o;
    static uf field_s;
    private kf field_m;
    fg field_p;

    private final void a(ck param0, int param1, int param2) {
        kf stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ck stackIn_8_2 = null;
        kf stackIn_9_0;
        int stackIn_9_1;
        ck stackIn_9_2;
        int stackIn_9_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              if (0 == (this.field_m.field_o[param0.field_p] & 4)) {
                break L1;
              } else {
                if ((param0.field_z ^ -1) > -1) {
                  var4_int = this.field_m.field_t[param0.field_p] / lo.field_l;
                  var5 = (1048575 - (-var4_int - -param0.field_v)) / var4_int;
                  param0.field_v = var4_int * param2 + param0.field_v & 1048575;
                  if (var5 <= param2) {
                    L2: {
                      if (this.field_m.field_S[param0.field_p] == 0) {
                        param0.field_t = db.b(param0.field_s, param0.field_t.l(), param0.field_t.j(), param0.field_t.k());
                        break L2;
                      } else {
                        L3: {
                          param0.field_t = db.b(param0.field_s, param0.field_t.l(), 0, param0.field_t.k());
                          stackIn_8_0 = this.field_m;

                          stackIn_8_1 = 2;

                          stackIn_8_2 = (ck) (param0);

                          if (param0.field_o.field_q[param0.field_u] >= 0) {
                            stackIn_9_0 = (kf) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (ck) ((Object) stackIn_8_2);
                            stackIn_9_3 = 0;
                            break L3;
                          } else {
                            stackIn_9_0 = (kf) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (ck) ((Object) stackIn_8_2);
                            stackIn_9_3 = 1;
                            break L3;
                          }
                        }
                        ((kf) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0);
                        break L2;
                      }
                    }
                    L4: {
                      if (param0.field_o.field_q[param0.field_u] >= 0) {
                        break L4;
                      } else {
                        param0.field_t.g(-1);
                        break L4;
                      }
                    }
                    param2 = param0.field_v / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L5: {
              if (param1 <= -71) {
                break L5;
              } else {
                this.field_q = (ah) null;
                break L5;
              }
            }
            param0.field_t.a(param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("bl.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final tj a() {
        ck var1 = (ck) ((Object) this.field_q.b((byte) 100));
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_t == null)) {
            return (tj) ((Object) var1.field_t);
        }
        return this.b();
    }

    final static void a(Throwable param0, byte param1, String param2) {
        try {
            ib stackIn_13_0;
            java.net.URL stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            StringBuilder stackIn_13_4;
            ib stackIn_14_0;
            java.net.URL stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            StringBuilder stackIn_14_4;
            String stackIn_14_5;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            af var4 = null;
            DataInputStream var5_ref_DataInputStream = null;
            int var5 = 0;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = HoldTheLine.field_D;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param0 == null) {
                    break L1;
                  } else {
                    var3 = ih.a(param0, -12895);
                    break L1;
                  }
                }
                L2: {
                  if (param2 != null) {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3 = var3 + " | ";
                        break L3;
                      }
                    }
                    var3 = var3 + param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                cd.a(12, var3);
                var7 = vn.a("%3a", ":", -104, var3);
                var8 = vn.a("%40", "@", -102, var7);
                var9 = vn.a("%26", "&", -102, var8);
                var10 = vn.a("%23", "#", -67, var9);
                if (null == rd.field_d) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    stackIn_13_0 = te.field_d;

                    stackIn_13_1 = null;

                    stackIn_13_2 = null;

                    stackIn_13_3 = rd.field_d.getCodeBase();

                    stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(im.field_a).append("&u=");

                    if (null != am.field_f) {
                      stackIn_14_0 = (ib) ((Object) stackIn_13_0);
                      stackIn_14_1 = null;
                      stackIn_14_2 = null;
                      stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackIn_14_5 = am.field_f;
                      break L4;
                    } else {
                      stackIn_14_0 = (ib) ((Object) stackIn_13_0);
                      stackIn_14_1 = null;
                      stackIn_14_2 = null;
                      stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackIn_14_5 = "" + ul.field_e;
                      break L4;
                    }
                  }
                  var4 = ((ib) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + ib.field_p + "&v2=" + ib.field_j + "&e=" + var10), 0);
                  L5: while (true) {
                    if (-1 != (var4.field_d ^ -1)) {
                      L6: {
                        if ((var4.field_d ^ -1) == -2) {
                          var5_ref_DataInputStream = (DataInputStream) (var4.field_b);
                          var5_ref_DataInputStream.read();
                          var5_ref_DataInputStream.close();
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var5 = 44 % ((17 - param1) / 37);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      qe.a(1L, (byte) 45);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L7;
              }
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

    final void a(int param0) {
        int var2;
        ck var3;
        int var4;
        var4 = HoldTheLine.field_D;
        this.field_p.a(param0);
        var3 = (ck) ((Object) this.field_q.b((byte) 120));
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (this.field_m.a(true, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_r >= var2) {
                    this.a(var3, -106, var2);
                    var3.field_r = var3.field_r - var2;
                    break L1;
                  } else {
                    this.a(var3, -121, var3.field_r);
                    var2 = var2 - var3.field_r;
                    if (!this.field_m.a((int[]) null, var3, var2, -104, 0)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (ck) ((Object) this.field_q.c((byte) -120));
            continue L0;
          } else {
            return;
          }
        }
    }

    private final void a(ck param0, int[] param1, byte param2, int param3, int param4, int param5) {
        kf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ck stackIn_14_2 = null;
        kf stackIn_15_0;
        int stackIn_15_1;
        ck stackIn_15_2;
        int stackIn_15_3;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        db var11 = null;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param2 == -23) {
                break L1;
              } else {
                this.field_q = (ah) null;
                break L1;
              }
            }
            L2: {
              if ((4 & this.field_m.field_o[param0.field_p]) == 0) {
                break L2;
              } else {
                if (-1 >= (param0.field_z ^ -1)) {
                  break L2;
                } else {
                  var7_int = this.field_m.field_t[param0.field_p] / lo.field_l;
                  L3: while (true) {
                    var8 = (-param0.field_v + var7_int + 1048575) / var7_int;
                    if (param4 < var8) {
                      param0.field_v = param0.field_v + var7_int * param4;
                      break L2;
                    } else {
                      L4: {
                        param0.field_t.b(param1, param3, var8);
                        param0.field_v = param0.field_v + (-1048576 + var8 * var7_int);
                        param3 = param3 + var8;
                        param4 = param4 - var8;
                        var9 = lo.field_l / 100;
                        var10 = 262144 / var7_int;
                        if (var9 > var10) {
                          var9 = var10;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var11 = param0.field_t;
                        if (0 != this.field_m.field_S[param0.field_p]) {
                          L6: {
                            param0.field_t = db.b(param0.field_s, var11.l(), 0, var11.k());
                            stackIn_14_0 = this.field_m;

                            stackIn_14_1 = param2 ^ -21;

                            stackIn_14_2 = (ck) (param0);

                            if (0 <= param0.field_o.field_q[param0.field_u]) {
                              stackIn_15_0 = (kf) ((Object) stackIn_14_0);
                              stackIn_15_1 = stackIn_14_1;
                              stackIn_15_2 = (ck) ((Object) stackIn_14_2);
                              stackIn_15_3 = 0;
                              break L6;
                            } else {
                              stackIn_15_0 = (kf) ((Object) stackIn_14_0);
                              stackIn_15_1 = stackIn_14_1;
                              stackIn_15_2 = (ck) ((Object) stackIn_14_2);
                              stackIn_15_3 = 1;
                              break L6;
                            }
                          }
                          ((kf) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                          param0.field_t.c(var9, var11.j());
                          break L5;
                        } else {
                          param0.field_t = db.b(param0.field_s, var11.l(), var11.j(), var11.k());
                          break L5;
                        }
                      }
                      L7: {
                        if (0 > param0.field_o.field_q[param0.field_u]) {
                          param0.field_t.g(-1);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var11.f(var9);
                      var11.b(param1, param3, param5 - param3);
                      if (var11.g()) {
                        this.field_p.a(var11);
                        continue L3;
                      } else {
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            param0.field_t.b(param1, param3, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var7);

            stackIn_27_1 = new StringBuilder().append("bl.C(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final tj b() {
        ck var1;
        int var2;
        var2 = HoldTheLine.field_D;
        L0: while (true) {
          var1 = (ck) ((Object) this.field_q.c((byte) -57));
          if (var1 != null) {
            if (var1.field_t != null) {
              return (tj) ((Object) var1.field_t);
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ck var6 = null;
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            this.field_p.b(param0, param1, param2);
            var6 = (ck) ((Object) this.field_q.b((byte) 101));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                stackIn_4_0 = this.field_m.a(true, var6);
                L2: {
                  if (stackIn_4_0) {
                    break L2;
                  } else {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var5 <= var6.field_r) {
                        this.a(var6, param0, (byte) -23, var4_int, var5, var4_int + var5);
                        var6.field_r = var6.field_r - var5;
                        break L2;
                      } else {
                        this.a(var6, param0, (byte) -23, var4_int, var6.field_r, var4_int + var5);
                        var4_int = var4_int + var6.field_r;
                        var5 = var5 - var6.field_r;
                        if (this.field_m.a(param0, var6, var5, -116, var4_int)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (ck) ((Object) this.field_q.c((byte) 102));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("bl.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void e(int param0) {
        field_o = null;
        field_n = null;
        field_r = null;
        if (param0 != 0) {
            field_s = (uf) null;
            field_s = null;
            return;
        }
        field_s = null;
    }

    final int c() {
        return 0;
    }

    bl(kf param0) {
        this.field_q = new ah();
        this.field_p = new fg();
        try {
            this.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new int[]{3, 4, 3};
        field_o = "Deaths";
    }
}
