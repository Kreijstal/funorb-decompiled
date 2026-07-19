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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        kf stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ck stackIn_7_2 = null;
        kf stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ck stackIn_8_2 = null;
        kf stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ck stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ck stackOut_6_2 = null;
        kf stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ck stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        kf stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ck stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
                          stackOut_6_0 = this.field_m;
                          stackOut_6_1 = 2;
                          stackOut_6_2 = (ck) (param0);
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_8_2 = stackOut_6_2;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          stackIn_7_2 = stackOut_6_2;
                          if (param0.field_o.field_q[param0.field_u] >= 0) {
                            stackOut_8_0 = (kf) ((Object) stackIn_8_0);
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (ck) ((Object) stackIn_8_2);
                            stackOut_8_3 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            stackIn_9_3 = stackOut_8_3;
                            break L3;
                          } else {
                            stackOut_7_0 = (kf) ((Object) stackIn_7_0);
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (ck) ((Object) stackIn_7_2);
                            stackOut_7_3 = 1;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            stackIn_9_3 = stackOut_7_3;
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
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("bl.D(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
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
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            af var4 = null;
            DataInputStream var5_ref_DataInputStream = null;
            int var5 = 0;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            ib stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            ib stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            ib stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            String stackIn_14_5 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ib stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            ib stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            String stackOut_13_5 = null;
            ib stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            var6 = HoldTheLine.field_D;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 == null) {
                    break L1;
                  } else {
                    var3_ref = ih.a(param0, -12895);
                    break L1;
                  }
                }
                L2: {
                  if (param2 != null) {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                cd.a(12, var3_ref);
                var7 = vn.a("%3a", ":", -104, var3_ref);
                var8 = vn.a("%40", "@", -102, var7);
                var9 = vn.a("%26", "&", -102, var8);
                var10 = vn.a("%23", "#", -67, var9);
                if (null == rd.field_d) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    stackOut_11_0 = te.field_d;
                    stackOut_11_1 = null;
                    stackOut_11_2 = null;
                    stackOut_11_3 = rd.field_d.getCodeBase();
                    stackOut_11_4 = new StringBuilder().append("clienterror.ws?c=").append(im.field_a).append("&u=");
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_13_4 = stackOut_11_4;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    if (null != am.field_f) {
                      stackOut_13_0 = (ib) ((Object) stackIn_13_0);
                      stackOut_13_1 = null;
                      stackOut_13_2 = null;
                      stackOut_13_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackOut_13_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackOut_13_5 = am.field_f;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      stackIn_14_3 = stackOut_13_3;
                      stackIn_14_4 = stackOut_13_4;
                      stackIn_14_5 = stackOut_13_5;
                      break L4;
                    } else {
                      stackOut_12_0 = (ib) ((Object) stackIn_12_0);
                      stackOut_12_1 = null;
                      stackOut_12_2 = null;
                      stackOut_12_3 = (java.net.URL) ((Object) stackIn_12_3);
                      stackOut_12_4 = (StringBuilder) ((Object) stackIn_12_4);
                      stackOut_12_5 = "" + ul.field_e;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      stackIn_14_5 = stackOut_12_5;
                      break L4;
                    }
                  }
                  var4 = ((ib) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + ib.field_p + "&v2=" + ib.field_j + "&e=" + var10), 0);
                  L5: while (true) {
                    if (-1 != (var4.field_d ^ -1)) {
                      L6: {
                        if ((var4.field_d ^ -1) == -2) {
                          var5_ref_DataInputStream = (DataInputStream) (var4.field_b);
                          discarded$1 = var5_ref_DataInputStream.read();
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
                var3 = (Exception) (Object) decompiledCaughtException;
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
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
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
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        db var11 = null;
        int var12 = 0;
        kf stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ck stackIn_13_2 = null;
        kf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ck stackIn_14_2 = null;
        kf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ck stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ck stackOut_12_2 = null;
        kf stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ck stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        kf stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ck stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
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
                            stackOut_12_0 = this.field_m;
                            stackOut_12_1 = param2 ^ -21;
                            stackOut_12_2 = (ck) (param0);
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            if (0 <= param0.field_o.field_q[param0.field_u]) {
                              stackOut_14_0 = (kf) ((Object) stackIn_14_0);
                              stackOut_14_1 = stackIn_14_1;
                              stackOut_14_2 = (ck) ((Object) stackIn_14_2);
                              stackOut_14_3 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              stackIn_15_2 = stackOut_14_2;
                              stackIn_15_3 = stackOut_14_3;
                              break L6;
                            } else {
                              stackOut_13_0 = (kf) ((Object) stackIn_13_0);
                              stackOut_13_1 = stackIn_13_1;
                              stackOut_13_2 = (ck) ((Object) stackIn_13_2);
                              stackOut_13_3 = 1;
                              stackIn_15_0 = stackOut_13_0;
                              stackIn_15_1 = stackOut_13_1;
                              stackIn_15_2 = stackOut_13_2;
                              stackIn_15_3 = stackOut_13_3;
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
            stackOut_25_0 = (RuntimeException) (var7);
            stackOut_25_1 = new StringBuilder().append("bl.C(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final tj b() {
        ck var1 = null;
        int var2 = 0;
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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ck var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            this.field_p.b(param0, param1, param2);
            var6 = (ck) ((Object) this.field_q.b((byte) 101));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (this.field_m.a(true, var6)) {
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
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("bl.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
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
