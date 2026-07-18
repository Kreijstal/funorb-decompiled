/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bh extends java.awt.Canvas {
    static tf field_c;
    static Random field_d;
    private java.awt.Component field_b;
    static ob field_a;

    final static int a(byte param0, int param1) {
        if (param0 <= 7) {
            return -8;
        }
        param1 = param1 & 8191;
        if (param1 < 4096) {
            return param1 < 2048 ? ai.field_l[param1] : ai.field_l[4096 - param1];
        }
        return param1 >= 6144 ? -ai.field_l[-param1 + 8192] : -ai.field_l[param1 + -4096];
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        int var1 = 0;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((bh) this).field_b.update(param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "bh.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        re var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pk var15 = null;
        int[][] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Geoblox.field_C;
        try {
          L0: {
            var15 = eh.field_d;
            var2 = var15.c((byte) 34);
            var3 = (re) (Object) nj.field_f.g(0);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 != var3.field_k) {
                    var3 = (re) (Object) nj.field_f.d(1);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                jl.a((byte) -122);
                return;
              } else {
                L3: {
                  var4 = var15.c((byte) 34);
                  if (var4 != 0) {
                    oi.field_a[0] = wd.field_f;
                    var5 = var3.field_g;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        nf.a(2147483647, var5, var4);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            kc.a(var5, (byte) -98);
                            var6 = new String[2][var5];
                            var19 = new int[2][4 * var5];
                            var8 = md.field_c;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var9 >= var8) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var13 >= var8) {
                                    var3.a(false);
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = qi.field_i[var13 + var5];
                                      var6[1][var14] = oi.field_a[var11];
                                      var19[1][4 * var14] = hg.field_a[var11];
                                      var19[1][1 + 4 * var14] = fb.field_m[var11];
                                      var19[1][var14 * 4 + 2] = k.field_i[var11];
                                      var19[1][var14 * 4 - -3] = cj.field_b[var11];
                                      if (ge.a(oi.field_a[var11], (byte) 12)) {
                                        if (cj.field_b[var11] + k.field_i[var11] + fb.field_m[var11] != 0) {
                                          break L8;
                                        } else {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var14++;
                                    var13++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = qi.field_i[var9];
                                  var6[0][var10] = oi.field_a[var11];
                                  var19[0][4 * var10] = hg.field_a[var11];
                                  var19[0][4 * var10 - -1] = fb.field_m[var11];
                                  var19[0][4 * var10 - -2] = k.field_i[var11];
                                  var19[0][4 * var10 + 3] = cj.field_b[var11];
                                  if (!ge.a(oi.field_a[var11], (byte) 12)) {
                                    break L9;
                                  } else {
                                    if (cj.field_b[var11] + (fb.field_m[var11] + k.field_i[var11]) != 0) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              me.a(116, (qc) (Object) var15);
                              if (var6_int != 0) {
                                nd.a(fe.field_g, var6_int, (byte) 123, rd.field_v, h.field_b, lc.field_b);
                                break L10;
                              } else {
                                nd.a(fe.field_g, var6_int, (byte) -97, rd.field_v, h.field_b, lc.field_b);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        oi.field_a[var6_int] = var15.e((byte) 120);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.a(false);
                    break L3;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "bh.B(" + 2 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((bh) this).field_b.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "bh.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, ja param1, int param2, ja param3, boolean param4) {
        RuntimeException var5 = null;
        wd var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ja var10 = null;
        int var11 = 0;
        ja var12 = null;
        int var13 = 0;
        wd var14 = null;
        wd var15 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var13 = Geoblox.field_C;
        try {
          L0: {
            var14 = new wd();
            var15 = var14;
            var6 = new wd();
            var15.a(-45, (rc) (Object) param3);
            var7 = param1.field_M;
            var8 = param1.field_z;
            var9 = param1.field_C;
            L1: while (true) {
              ja dupTemp$1 = (ja) (Object) var15.a(true);
              var10 = dupTemp$1;
              if (null == dupTemp$1) {
                break L0;
              } else {
                L2: {
                  if (param4) {
                    var10.a(320, var10.field_C, var7, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param0) {
                    L4: {
                      if (var10.field_z == 2) {
                        var10.field_B = true;
                        var10.field_K = ji.field_r;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var10.a(320, var9, var10.field_M, var8);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var11 = 0;
                L5: while (true) {
                  if (var11 >= var10.field_L) {
                    var6.a((rc) (Object) var10, false);
                    continue L1;
                  } else {
                    L6: {
                      if (var10.field_n[var11].field_z != 1) {
                        break L6;
                      } else {
                        if (param4) {
                          var12 = (ja) (Object) var6.c((byte) 121);
                          if (var12 == null) {
                            L7: {
                              if (!param4) {
                                break L7;
                              } else {
                                var10.field_m = var10.field_m + 1;
                                var10.field_n[var11].field_m = var10.field_n[var11].field_m + 1;
                                break L7;
                              }
                            }
                            L8: {
                              if (!param0) {
                                break L8;
                              } else {
                                var10.field_u = param1.field_u;
                                var10.field_N = var10.field_N + 1;
                                var10.field_n[var11].field_N = var10.field_n[var11].field_N + 1;
                                break L8;
                              }
                            }
                            var14.a((rc) (Object) var10.field_n[var11], false);
                            var11++;
                            continue L5;
                          } else {
                            L9: {
                              if (var10 == var12) {
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var11++;
                            continue L5;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    L10: {
                      if (2 != var10.field_n[var11].field_z) {
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var11++;
                    continue L5;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var5;
            stackOut_33_1 = new StringBuilder().append("bh.D(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          L12: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(1).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L12;
            }
          }
          throw t.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + param4 + ')');
        }
    }

    bh(java.awt.Component param0) {
        try {
            ((bh) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "bh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new tf();
        field_d = new Random();
    }
}
