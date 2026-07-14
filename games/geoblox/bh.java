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
            return (param1 ^ -1) > -2049 ? ai.field_l[param1] : ai.field_l[4096 - param1];
        }
        return param1 >= 6144 ? -ai.field_l[-param1 + 8192] : -ai.field_l[param1 + -4096];
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        int var1 = -120 % ((-5 - param0) / 51);
    }

    public final void update(java.awt.Graphics param0) {
        ((bh) this).field_b.update(param0);
    }

    final static void a(int param0) {
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
        var12 = Geoblox.field_C;
        var15 = eh.field_d;
        if (param0 == 2) {
          var2 = var15.c((byte) 34);
          var3 = (re) (Object) nj.field_f.g(0);
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (var2 != var3.field_k) {
                  var3 = (re) (Object) nj.field_f.d(1);
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            if (var3 == null) {
              jl.a((byte) -122);
              return;
            } else {
              L2: {
                var4 = var15.c((byte) 34);
                if (var4 == 0) {
                  break L2;
                } else {
                  oi.field_a[0] = wd.field_f;
                  var5 = var3.field_g;
                  var6_int = 1;
                  L3: while (true) {
                    if (var4 <= var6_int) {
                      nf.a(2147483647, var5, var4);
                      var6_int = 0;
                      L4: while (true) {
                        if (var4 <= var6_int) {
                          kc.a(var5, (byte) -98);
                          var6 = new String[2][var5];
                          var19 = new int[2][4 * var5];
                          var8 = md.field_c;
                          var9 = 0;
                          var10 = 0;
                          L5: while (true) {
                            if (var9 >= var8) {
                              var13 = 0;
                              var9 = var13;
                              var14 = 0;
                              var10 = var14;
                              L6: while (true) {
                                if (var13 >= var8) {
                                  break L2;
                                } else {
                                  var11 = qi.field_i[var13 + var5];
                                  var6[1][var14] = oi.field_a[var11];
                                  var19[1][4 * var14] = hg.field_a[var11];
                                  var19[1][1 + 4 * var14] = fb.field_m[var11];
                                  var19[1][var14 * 4 + 2] = k.field_i[var11];
                                  var19[1][var14 * 4 - -3] = cj.field_b[var11];
                                  if (ge.a(oi.field_a[var11], (byte) 12)) {
                                    if (cj.field_b[var11] + k.field_i[var11] + fb.field_m[var11] == 0) {
                                      var6[1][var14] = null;
                                      var14--;
                                      var14++;
                                      var13++;
                                      continue L6;
                                    } else {
                                      var14++;
                                      var13++;
                                      continue L6;
                                    }
                                  } else {
                                    var14++;
                                    var13++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              var11 = qi.field_i[var9];
                              var6[0][var10] = oi.field_a[var11];
                              var19[0][4 * var10] = hg.field_a[var11];
                              var19[0][4 * var10 - -1] = fb.field_m[var11];
                              var19[0][4 * var10 - -2] = k.field_i[var11];
                              var19[0][4 * var10 + 3] = cj.field_b[var11];
                              if (ge.a(oi.field_a[var11], (byte) 12)) {
                                if (-1 == (cj.field_b[var11] + (fb.field_m[var11] + k.field_i[var11]) ^ -1)) {
                                  var6[0][var10] = null;
                                  var10--;
                                  var9++;
                                  var10++;
                                  continue L5;
                                } else {
                                  var9++;
                                  var10++;
                                  continue L5;
                                }
                              } else {
                                var9++;
                                var10++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          me.a(116, (qc) (Object) var15);
                          if (var6_int != 0) {
                            nd.a(fe.field_g, var6_int, (byte) 123, rd.field_v, h.field_b, lc.field_b);
                            var6_int++;
                            continue L4;
                          } else {
                            nd.a(fe.field_g, var6_int, (byte) -97, rd.field_v, h.field_b, lc.field_b);
                            var6_int++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      oi.field_a[var6_int] = var15.e((byte) 120);
                      var6_int++;
                      continue L3;
                    }
                  }
                }
              }
              var3.a(false);
              return;
            }
          }
        } else {
          return;
        }
    }

    public final void paint(java.awt.Graphics param0) {
        ((bh) this).field_b.paint(param0);
    }

    final static void a(boolean param0, ja param1, int param2, ja param3, boolean param4) {
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
        var13 = Geoblox.field_C;
        var14 = new wd();
        var15 = var14;
        var6 = new wd();
        var15.a(-45, (rc) (Object) param3);
        var7 = param1.field_M;
        var8 = param1.field_z;
        var9 = param1.field_C;
        L0: while (true) {
          var10 = (ja) (Object) var15.a(true);
          if (null == (ja) (Object) var15.a(true)) {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                bh.a((byte) -40);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (param4) {
                var10.a(param2 + 319, var10.field_C, var7, 0);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0) {
                L4: {
                  if ((var10.field_z ^ -1) == -3) {
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
                continue L0;
              } else {
                L6: {
                  L7: {
                    if ((var10.field_n[var11].field_z ^ -1) != -2) {
                      break L7;
                    } else {
                      if (param4) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (2 == var10.field_n[var11].field_z) {
                    if (param0) {
                      break L6;
                    } else {
                      var11++;
                      continue L5;
                    }
                  } else {
                    var11++;
                    continue L5;
                  }
                }
                var12 = (ja) (Object) var6.c((byte) 121);
                L8: while (true) {
                  if (var12 == null) {
                    L9: {
                      if (!param4) {
                        break L9;
                      } else {
                        var10.field_m = var10.field_m + 1;
                        var10.field_n[var11].field_m = var10.field_n[var11].field_m + 1;
                        break L9;
                      }
                    }
                    L10: {
                      if (!param0) {
                        break L10;
                      } else {
                        var10.field_u = param1.field_u;
                        var10.field_N = var10.field_N + 1;
                        var10.field_n[var11].field_N = var10.field_n[var11].field_N + 1;
                        break L10;
                      }
                    }
                    var14.a((rc) (Object) var10.field_n[var11], false);
                    var11++;
                    continue L5;
                  } else {
                    if (var10 != var12) {
                      var12 = (ja) (Object) var6.a(param2 + -60);
                      continue L8;
                    } else {
                      var11++;
                      continue L5;
                    }
                  }
                }
              }
            }
          }
        }
    }

    bh(java.awt.Component param0) {
        ((bh) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new tf();
        field_d = new Random();
    }
}
