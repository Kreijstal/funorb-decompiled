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

    final static void c(int param0) {
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
        ai var27_ref = null;
        pk var28 = null;
        Object var29 = null;
        ai var29_ref = null;
        long[][] var33 = null;
        L0: {
          var29 = null;
          var27 = null;
          var26 = Geoblox.field_C;
          if (param0 == -24839) {
            break L0;
          } else {
            cm.a(false);
            break L0;
          }
        }
        L1: {
          var28 = eh.field_d;
          var2 = var28.c((byte) 34);
          if (-1 == (var2 ^ -1)) {
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
                        var4.field_k = new String[3][var6];
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var33 = new long[3][var6];
                        var4.field_h = new int[3][var6 * var7];
                        var11 = new int[3][var6 * var7];
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
                                      var15++;
                                      var11[0][var15] = var28.a((byte) -76);
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
                                  if (ge.a(var21, (byte) 12)) {
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
                                        var16++;
                                        var11[1][var16] = var28.a((byte) -122);
                                        var25++;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if (var14 < var6) {
                                if (!id.field_b[var20].field_c) {
                                  id.field_b[var20].field_c = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = id.field_b[var20].field_a;
                                  var33[2][var14] = var22;
                                  var14++;
                                  var28.field_f = var24;
                                  var25 = 0;
                                  L11: while (true) {
                                    if (var7 > var25) {
                                      var17++;
                                      var11[2][var17] = var28.a((byte) -101);
                                      var25++;
                                      continue L11;
                                    } else {
                                      var19++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L6;
                                }
                              } else {
                                var19++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        id.field_b[var8_int].field_d = var28.e((byte) 104);
                        id.field_b[var8_int].field_c = false;
                        if ((var28.c((byte) 34) ^ -1) == -2) {
                          id.field_b[var8_int].field_a = var28.e((byte) 122);
                          var8_int++;
                          continue L5;
                        } else {
                          id.field_b[var8_int].field_a = null;
                          var8_int++;
                          continue L5;
                        }
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
              L12: while (true) {
                L13: {
                  if (var29_ref == null) {
                    break L13;
                  } else {
                    if (var3 != var29_ref.field_q) {
                      var27_ref = (ai) (Object) nf.field_j.d(1);
                      continue L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (var27_ref != null) {
                  var27_ref.a(false);
                  break L1;
                } else {
                  jl.a((byte) -117);
                  return;
                }
              }
            } else {
              gi.a((Throwable) null, "HS1: " + og.e(param0 + 24894), (byte) 125);
              jl.a((byte) -117);
              break L1;
            }
          }
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
            if (null != oc.field_e) {
                // if_icmpgt L34
                // if_acmpne L26
            } else {
                fj.field_q.field_f = 0;
                return;
            }
            if (0 == fj.field_q.field_f) {
                if (!((oa.a(-12520) ^ -1L) >= (10000L + v.field_r ^ -1L))) {
                    fj.field_q.a(param1, (byte) -76);
                }
            }
            if (param0 > (fj.field_q.field_f ^ -1)) {
                try {
                    oc.field_e.a(100, 0, fj.field_q.field_f, fj.field_q.field_j);
                    v.field_r = oa.a(-12520);
                } catch (IOException iOException) {
                    jl.a((byte) -117);
                }
                fj.field_q.field_f = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        if ((((cm) this).field_e ^ -1L) > (((cm) this).field_c ^ -1L)) {
            ((cm) this).field_e = ((cm) this).field_e + (((cm) this).field_c + -((cm) this).field_e);
        }
        if (param0 < 60) {
            return;
        }
        ((cm) this).field_i = 0L;
    }

    final int a(boolean param0, long param1) {
        int var5 = Geoblox.field_C;
        if (!param0) {
            cm.a(true);
        }
        if (((cm) this).field_c > ((cm) this).field_e) {
            ((cm) this).field_i = ((cm) this).field_i + (-((cm) this).field_e + ((cm) this).field_c);
            ((cm) this).field_e = ((cm) this).field_e + (-((cm) this).field_e + ((cm) this).field_c);
            ((cm) this).field_c = ((cm) this).field_c + param1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            ((cm) this).field_c = ((cm) this).field_c + param1;
            // if_icmple L124
        } while ((((cm) this).field_c ^ -1L) > (((cm) this).field_e ^ -1L));
        if (((cm) this).field_e > ((cm) this).field_c) {
            ((cm) this).field_c = ((cm) this).field_e;
        }
        return var4;
    }

    private final long d(int param0) {
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
        long var6 = (long)param0;
        for (var8 = 1; var8 <= ((cm) this).field_g; var8++) {
            var6 = var6 + ((cm) this).field_f[(-var8 + (((cm) this).field_d + 10)) % 10];
        }
        return var6 / (long)((cm) this).field_g;
    }

    final long a(byte param0) {
        ((cm) this).field_e = ((cm) this).field_e + this.d(0);
        if (param0 != -49) {
            int discarded$0 = ((cm) this).a(false, 97L);
        }
        if ((((cm) this).field_c ^ -1L) < (((cm) this).field_e ^ -1L)) {
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
