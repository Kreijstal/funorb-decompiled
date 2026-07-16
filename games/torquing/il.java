/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends gf {
    static int[][] field_m;
    private boolean field_n;
    static int field_l;
    static int[] field_o;
    private String field_r;
    static int[] field_p;
    static java.awt.Frame field_q;

    public static void c(byte param0) {
        field_p = null;
        if (param0 > -111) {
            Object var2 = null;
            String discarded$0 = il.a((String) null, (la) null, (String) null, (byte) 10);
        }
        field_o = null;
        field_m = null;
        field_q = null;
    }

    final String a(byte param0, String param1) {
        dn var4 = null;
        CharSequence var5 = (CharSequence) (Object) param1;
        String var3 = fd.a(0, var5);
        if (!(var3 == null)) {
            return var3;
        }
        if (param0 != -121) {
            ((il) this).field_r = null;
        }
        if (!param1.equals((Object) (Object) ((il) this).field_r)) {
            var4 = he.a(1, param1);
            if (var4 == null) {
                return null;
            }
            if (var4.field_e != null) {
                return null;
            }
            ((il) this).field_n = var4.field_b;
            ((il) this).field_r = param1;
        }
        if (!(((il) this).field_n)) {
            return s.field_u;
        }
        return rk.field_d;
    }

    final void e(int param0) {
        ((il) this).field_r = null;
        if (param0 >= -38) {
            il.a((byte) 36, 103);
        }
    }

    final static void a(byte param0, int param1) {
        ip.field_c = hc.field_d[param1];
        if (param0 != 52) {
            Object var3 = null;
            String discarded$0 = il.a((String) null, (la) null, (String) null, (byte) -45);
        }
        Torquing.field_w = in.field_a[param1];
        md.field_b = oc.field_a[param1];
    }

    il(tk param0) {
        super(param0);
        ((il) this).field_n = false;
    }

    final static String a(String param0, la param1, String param2, byte param3) {
        int var4 = 17 % ((-22 - param3) / 48);
        if (!(param1.a(-12749))) {
            return param0;
        }
        return param2 + " - " + param1.a((byte) -32) + "%";
    }

    final static void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        bm var4_ref_bm = null;
        long var4 = 0L;
        int var5 = 0;
        wc var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
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
        df var27 = null;
        L0: {
          var26 = Torquing.field_u;
          if (param0 == -30593) {
            break L0;
          } else {
            field_l = -4;
            break L0;
          }
        }
        L1: {
          var27 = kj.field_d;
          var2 = var27.i((byte) -101);
          if (0 != var2) {
            if (1 == var2) {
              var3 = var27.i(param0 + 37681);
              var4 = var27.b(68);
              var6 = (wc) (Object) so.field_t.b(0);
              L2: while (true) {
                L3: {
                  if (var6 == null) {
                    break L3;
                  } else {
                    if (var3 != var6.field_q) {
                      var6 = (wc) (Object) so.field_t.f(param0 + 6534);
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var6 != null) {
                  var6.field_l = var4;
                  var6.f(0);
                  break L1;
                } else {
                  ih.b(true);
                  return;
                }
              }
            } else {
              nn.a("HS1: " + me.a(-1), (Throwable) null, param0 ^ 20837);
              ih.b(true);
              break L1;
            }
          } else {
            var3 = var27.i(7088);
            var4_ref_bm = (bm) (Object) gl.field_d.b(0);
            L4: while (true) {
              L5: {
                if (var4_ref_bm == null) {
                  break L5;
                } else {
                  if (var4_ref_bm.field_s != var3) {
                    var4_ref_bm = (bm) (Object) gl.field_d.f(-24059);
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (var4_ref_bm != null) {
                L6: {
                  var5 = var27.i((byte) -101);
                  if (var5 == 0) {
                    break L6;
                  } else {
                    var6_int = var4_ref_bm.field_q;
                    cb.field_m[0].field_c = null;
                    cb.field_m[0].field_e = false;
                    cb.field_m[0].field_d = re.field_e;
                    var7 = var4_ref_bm.field_o;
                    var8_int = 1;
                    L7: while (true) {
                      if (var8_int >= var5) {
                        String[][] dupTemp$6 = new String[3][var6_int];
                        var4_ref_bm.field_p = dupTemp$6;
                        var8 = dupTemp$6;
                        var9 = new String[3][var6_int];
                        long[][] dupTemp$7 = new long[3][var6_int];
                        var4_ref_bm.field_m = dupTemp$7;
                        var10 = dupTemp$7;
                        int[][] dupTemp$8 = new int[3][var6_int * var7];
                        var4_ref_bm.field_n = dupTemp$8;
                        var11 = dupTemp$8;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var27.i((byte) -101);
                        if ((var18 ^ -1) < -1) {
                          var19 = 0;
                          L8: while (true) {
                            if (var19 >= var18) {
                              break L6;
                            } else {
                              L9: {
                                var20 = var27.i((byte) -101);
                                var21 = cb.field_m[var20].field_d;
                                var22 = var27.b(67);
                                var24 = var27.field_n;
                                if (var19 < var6_int) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = cb.field_m[var20].field_c;
                                  var10[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var25 >= var7) {
                                      break L9;
                                    } else {
                                      int incrementValue$9 = var15;
                                      var15++;
                                      var11[0][incrementValue$9] = var27.c((byte) -33);
                                      var25++;
                                      continue L10;
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              L11: {
                                if (var21 == null) {
                                  break L11;
                                } else {
                                  if (!bn.a(var21, -17310)) {
                                    break L11;
                                  } else {
                                    var8[1][var13] = re.field_e;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var27.field_n = var24;
                                    var13++;
                                    var25 = 0;
                                    L12: while (true) {
                                      if (var7 <= var25) {
                                        break L11;
                                      } else {
                                        int incrementValue$10 = var16;
                                        var16++;
                                        var11[1][incrementValue$10] = var27.c((byte) -76);
                                        var25++;
                                        continue L12;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var6_int > var14) {
                                if (!cb.field_m[var20].field_e) {
                                  cb.field_m[var20].field_e = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = cb.field_m[var20].field_c;
                                  var10[2][var14] = var22;
                                  var14++;
                                  var27.field_n = var24;
                                  var25 = 0;
                                  L13: while (true) {
                                    if (var7 > var25) {
                                      int incrementValue$11 = var17;
                                      var17++;
                                      var11[2][incrementValue$11] = var27.c((byte) -55);
                                      var25++;
                                      continue L13;
                                    } else {
                                      var19++;
                                      continue L8;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L8;
                                }
                              } else {
                                var19++;
                                continue L8;
                              }
                            }
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        cb.field_m[var8_int].field_d = var27.h((byte) 124);
                        cb.field_m[var8_int].field_e = false;
                        if ((var27.i((byte) -101) ^ -1) != -2) {
                          cb.field_m[var8_int].field_c = null;
                          var8_int++;
                          continue L7;
                        } else {
                          cb.field_m[var8_int].field_c = var27.h((byte) 123);
                          var8_int++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                var4_ref_bm.field_k = true;
                var4_ref_bm.f(param0 ^ -30593);
                break L1;
              } else {
                ih.b(true);
                return;
              }
            }
          }
        }
    }

    final cd a(int param0, String param1) {
        dn var3 = null;
        CharSequence var4 = null;
        cd stackIn_15_0 = null;
        cd stackOut_14_0 = null;
        cd stackOut_13_0 = null;
        var4 = (CharSequence) (Object) param1;
        if (!va.a(-21369, var4)) {
          return so.field_u;
        } else {
          if (param0 > 62) {
            L0: {
              if (!param1.equals((Object) (Object) ((il) this).field_r)) {
                L1: {
                  var3 = he.a(1, param1);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (null != var3.field_e) {
                      break L1;
                    } else {
                      ((il) this).field_n = var3.field_b;
                      ((il) this).field_r = param1;
                      break L0;
                    }
                  }
                }
                return gn.field_h;
              } else {
                break L0;
              }
            }
            L2: {
              if (((il) this).field_n) {
                stackOut_14_0 = so.field_s;
                stackIn_15_0 = stackOut_14_0;
                break L2;
              } else {
                stackOut_13_0 = so.field_u;
                stackIn_15_0 = stackOut_13_0;
                break L2;
              }
            }
            return stackIn_15_0;
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[][]{new int[3], new int[3]};
        field_l = -1;
        field_p = new int[3];
    }
}
