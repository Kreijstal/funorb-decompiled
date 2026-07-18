/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cm extends cj {
    private long field_e;
    static String field_h;
    private long field_i;
    private int field_g;
    private long[] field_f;
    private int field_d;
    static int[] field_j;
    private long field_c;

    final static void c() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        mg var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        pk var28 = null;
        Object var29 = null;
        ai var29_ref = null;
        long[][] var33 = null;
        RuntimeException decompiledCaughtException = null;
        var29 = null;
        var27 = null;
        var26 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var28 = eh.field_d;
              var2 = var28.c((byte) 34);
              if (var2 == 0) {
                var3 = var28.b(true);
                var4 = (mg) (Object) rh.field_d.g(0);
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var4.field_i == var3) {
                        break L3;
                      } else {
                        var4 = (mg) (Object) rh.field_d.d(1);
                        continue L2;
                      }
                    }
                  }
                  if (var4 != null) {
                    L4: {
                      var5 = var28.c((byte) 34);
                      if (var5 == 0) {
                        break L4;
                      } else {
                        var6 = var4.field_f;
                        var7 = var4.field_l;
                        id.field_b[0].field_c = false;
                        id.field_b[0].field_d = wd.field_f;
                        id.field_b[0].field_a = null;
                        var8_int = 1;
                        L5: while (true) {
                          if (var5 <= var8_int) {
                            String[][] dupTemp$7 = new String[3][var6];
                            var4.field_k = dupTemp$7;
                            var8 = dupTemp$7;
                            var9 = new String[3][var6];
                            var33 = new long[3][var6];
                            int[][] dupTemp$8 = new int[3][var6 * var7];
                            var4.field_h = dupTemp$8;
                            var11 = dupTemp$8;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.c((byte) 34);
                            if (0 >= var18) {
                              break L4;
                            } else {
                              var19 = 0;
                              L6: while (true) {
                                if (var19 >= var18) {
                                  break L4;
                                } else {
                                  L7: {
                                    var20 = var28.c((byte) 34);
                                    var21 = id.field_b[var20].field_d;
                                    var22 = var28.b(2901);
                                    var24 = var28.field_f;
                                    if (var6 > var19) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = id.field_b[var20].field_a;
                                      var33[0][var12] = var22;
                                      var25 = 0;
                                      L8: while (true) {
                                        if (var25 >= var7) {
                                          var12++;
                                          break L7;
                                        } else {
                                          int incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var28.a((byte) -76);
                                          var25++;
                                          continue L8;
                                        }
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L9: {
                                    if (var21 == null) {
                                      break L9;
                                    } else {
                                      int discarded$10 = 12;
                                      if (ge.a(var21)) {
                                        var8[1][var13] = wd.field_f;
                                        var9[1][var13] = null;
                                        var33[1][var13] = var22;
                                        var13++;
                                        var28.field_f = var24;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (var25 >= var7) {
                                            break L9;
                                          } else {
                                            int incrementValue$11 = var16;
                                            var16++;
                                            var11[1][incrementValue$11] = var28.a((byte) -122);
                                            var25++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var14 >= var6) {
                                      break L11;
                                    } else {
                                      if (!id.field_b[var20].field_c) {
                                        id.field_b[var20].field_c = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = id.field_b[var20].field_a;
                                        var33[2][var14] = var22;
                                        var14++;
                                        var28.field_f = var24;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var7 <= var25) {
                                            break L11;
                                          } else {
                                            int incrementValue$12 = var17;
                                            var17++;
                                            var11[2][incrementValue$12] = var28.a((byte) -101);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            L13: {
                              id.field_b[var8_int].field_d = var28.e((byte) 104);
                              id.field_b[var8_int].field_c = false;
                              if (var28.c((byte) 34) == 1) {
                                id.field_b[var8_int].field_a = var28.e((byte) 122);
                                break L13;
                              } else {
                                id.field_b[var8_int].field_a = null;
                                break L13;
                              }
                            }
                            var8_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                    var4.field_j = true;
                    var4.a(false);
                    break L1;
                  } else {
                    jl.a((byte) -115);
                    return;
                  }
                }
              } else {
                if (1 == var2) {
                  var3 = var28.b(true);
                  var29_ref = (ai) (Object) nf.field_j.g(0);
                  L14: while (true) {
                    L15: {
                      if (var29_ref == null) {
                        break L15;
                      } else {
                        if (var3 != var29_ref.field_q) {
                          var27 = (Object) (Object) (ai) (Object) nf.field_j.d(1);
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (var27 != null) {
                      ((ai) var27).a(false);
                      break L1;
                    } else {
                      jl.a((byte) -117);
                      return;
                    }
                  }
                } else {
                  int discarded$13 = 125;
                  gi.a((Throwable) null, "HS1: " + og.e(55));
                  jl.a((byte) -117);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "cm.F(" + -24839 + ')');
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        if (param0) {
            cm.a(false);
        }
        field_h = null;
    }

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == oc.field_e) {
                break L0;
              } else {
                L1: {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (pk.field_l != eh.field_b) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (0 != fj.field_q.field_f) {
                    break L2;
                  } else {
                    if (~oa.a(-12520) < ~(10000L + v.field_r)) {
                      fj.field_q.a(param1, (byte) -76);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (fj.field_q.field_f <= 0) {
                    break L3;
                  } else {
                    {
                      L4: {
                        oc.field_e.a(100, 0, fj.field_q.field_f, fj.field_q.field_j);
                        v.field_r = oa.a(-12520);
                        break L4;
                      }
                    }
                    fj.field_q.field_f = 0;
                    break L3;
                  }
                }
                return;
              }
            }
            fj.field_q.field_f = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        if (~((cm) this).field_e > ~((cm) this).field_c) {
            ((cm) this).field_e = ((cm) this).field_e + (((cm) this).field_c + -((cm) this).field_e);
        }
        if (param0 < 60) {
            return;
        }
        ((cm) this).field_i = 0L;
    }

    final int a(boolean param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Geoblox.field_C;
          if (param0) {
            break L0;
          } else {
            cm.a(true);
            break L0;
          }
        }
        if (((cm) this).field_c <= ((cm) this).field_e) {
          var4 = 0;
          L1: while (true) {
            L2: {
              var4++;
              ((cm) this).field_c = ((cm) this).field_c + param1;
              if (var4 >= 10) {
                break L2;
              } else {
                if (~((cm) this).field_c > ~((cm) this).field_e) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((cm) this).field_e <= ((cm) this).field_c) {
                break L3;
              } else {
                ((cm) this).field_c = ((cm) this).field_e;
                break L3;
              }
            }
            return var4;
          }
        } else {
          ((cm) this).field_i = ((cm) this).field_i + (-((cm) this).field_e + ((cm) this).field_c);
          ((cm) this).field_e = ((cm) this).field_e + (-((cm) this).field_e + ((cm) this).field_c);
          ((cm) this).field_c = ((cm) this).field_c + param1;
          return 1;
        }
    }

    private final long d() {
        int var8 = 0;
        int var9 = Geoblox.field_C;
        long var2 = System.nanoTime();
        long var4 = -((cm) this).field_i + var2;
        ((cm) this).field_i = var2;
        if (-5000000000L < var4) {
            if (!(5000000000L <= var4)) {
                ((cm) this).field_f[((cm) this).field_d] = var4;
                if (((cm) this).field_g < 1) {
                    ((cm) this).field_g = ((cm) this).field_g + 1;
                }
                ((cm) this).field_d = (((cm) this).field_d - -1) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((cm) this).field_g; var8++) {
            var6 = var6 + ((cm) this).field_f[(-var8 + (((cm) this).field_d + 10)) % 10];
        }
        return var6 / (long)((cm) this).field_g;
    }

    final long a(byte param0) {
        int discarded$0 = 0;
        ((cm) this).field_e = ((cm) this).field_e + this.d();
        if (param0 != -49) {
            int discarded$1 = ((cm) this).a(false, 97L);
        }
        if (~((cm) this).field_c < ~((cm) this).field_e) {
            return (((cm) this).field_c + -((cm) this).field_e) / 1000000L;
        }
        return 0L;
    }

    cm() {
        ((cm) this).field_g = 1;
        ((cm) this).field_f = new long[10];
        ((cm) this).field_d = 0;
        ((cm) this).field_i = 0L;
        ((cm) this).field_e = 0L;
        ((cm) this).field_c = 0L;
        ((cm) this).field_e = System.nanoTime();
        ((cm) this).field_c = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Checking";
    }
}
