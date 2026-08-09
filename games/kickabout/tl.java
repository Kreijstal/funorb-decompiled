/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static String field_b;
    static r field_c;
    static String[] field_a;

    public static void c(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 0) {
            field_c = (r) null;
        }
    }

    final static int a(int param0) {
        if (param0 >= -115) {
            return -7;
        }
        return lb.field_M;
    }

    final static void b(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ni var4 = null;
        sm var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
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
        ml var28 = null;
        long[][] var35 = null;
        int[][] var36 = null;
        var26 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var28 = un.field_e;
              var2 = var28.h((byte) -120);
              if (param0 == 2) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              if (var2 == 0) {
                var3 = var28.a((byte) 81);
                var4 = (ni) ((Object) lw.field_g.g(24009));
                L3: while (true) {
                  L4: {
                    if (var4 == null) {
                      break L4;
                    } else {
                      if (var3 == var4.field_o) {
                        break L4;
                      } else {
                        var4 = (ni) ((Object) lw.field_g.c(33));
                        continue L3;
                      }
                    }
                  }
                  if (var4 == null) {
                    lr.b((byte) -116);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var5 = var28.h((byte) -128);
                    if (-1 != (var5 ^ -1)) {
                      var6 = var4.field_g;
                      sc.field_F[0].field_d = null;
                      var7 = var4.field_j;
                      sc.field_F[0].field_b = ow.field_e;
                      sc.field_F[0].field_g = false;
                      var8_int = 1;
                      L5: while (true) {
                        if (var8_int >= var5) {
                          var8 = new String[3][var6];
                          var9 = new String[3][var6];
                          var35 = new long[3][var6];
                          var36 = new int[3][var6 * var7];
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16 = 0;
                          var17 = 0;
                          var18 = var28.h((byte) -106);
                          if (0 < var18) {
                            var19 = 0;
                            L6: while (true) {
                              if (var18 > var19) {
                                L7: {
                                  var20 = var28.h((byte) -118);
                                  var21 = sc.field_F[var20].field_b;
                                  var22 = var28.i((byte) -124);
                                  var24 = var28.field_n;
                                  if (var19 < var6) {
                                    var8[0][var12] = var21;
                                    var9[0][var12] = sc.field_F[var20].field_d;
                                    var35[0][var12] = var22;
                                    var12++;
                                    var25 = 0;
                                    L8: while (true) {
                                      if (var25 >= var7) {
                                        break L7;
                                      } else {
                                        incrementValue$0 = var15;
                                        var15++;
                                        var36[0][incrementValue$0] = var28.k(4);
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
                                    if (!hm.a((byte) 78, var21)) {
                                      break L9;
                                    } else {
                                      var8[1][var13] = ow.field_e;
                                      var9[1][var13] = null;
                                      var35[1][var13] = var22;
                                      var13++;
                                      var28.field_n = var24;
                                      var25 = 0;
                                      L10: while (true) {
                                        if (var25 >= var7) {
                                          break L9;
                                        } else {
                                          incrementValue$1 = var16;
                                          var16++;
                                          var36[1][incrementValue$1] = var28.k(4);
                                          var25++;
                                          continue L10;
                                        }
                                      }
                                    }
                                  }
                                }
                                L11: {
                                  if (var14 >= var6) {
                                    break L11;
                                  } else {
                                    if (sc.field_F[var20].field_g) {
                                      break L11;
                                    } else {
                                      sc.field_F[var20].field_g = true;
                                      var8[2][var14] = var21;
                                      var9[2][var14] = sc.field_F[var20].field_d;
                                      var35[2][var14] = var22;
                                      var28.field_n = var24;
                                      var14++;
                                      var25 = 0;
                                      L12: while (true) {
                                        if (var25 >= var7) {
                                          break L11;
                                        } else {
                                          incrementValue$2 = var17;
                                          var17++;
                                          var36[2][incrementValue$2] = var28.k(4);
                                          var25++;
                                          continue L12;
                                        }
                                      }
                                    }
                                  }
                                }
                                var19++;
                                continue L6;
                              } else {
                                var4.c((byte) -109);
                                break L2;
                              }
                            }
                          } else {
                            var4.c((byte) -109);
                            break L2;
                          }
                        } else {
                          L13: {
                            sc.field_F[var8_int].field_b = var28.a(param0 ^ 34);
                            sc.field_F[var8_int].field_g = false;
                            if (1 == var28.h((byte) -127)) {
                              sc.field_F[var8_int].field_d = var28.a(-108);
                              break L13;
                            } else {
                              sc.field_F[var8_int].field_d = null;
                              break L13;
                            }
                          }
                          var8_int++;
                          continue L5;
                        }
                      }
                    } else {
                      var4.c((byte) -109);
                      break L2;
                    }
                  }
                }
              } else {
                if (var2 == 1) {
                  var3 = var28.a((byte) 81);
                  var28.i((byte) -124);
                  var4_ref = (sm) ((Object) ia.field_d.g(24009));
                  L14: while (true) {
                    L15: {
                      if (var4_ref == null) {
                        break L15;
                      } else {
                        if (var3 != var4_ref.field_k) {
                          var4_ref = (sm) ((Object) ia.field_d.c(param0 + 31));
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (var4_ref == null) {
                      lr.b((byte) -116);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var4_ref.c((byte) -109);
                      break L2;
                    }
                  }
                } else {
                  bd.a("HS1: " + tr.b(0), (Throwable) null, 1);
                  lr.b((byte) -116);
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "tl.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static lk a(sb param0, boolean param1) {
        int fieldTemp$2 = 0;
        StringBuilder discarded$3 = null;
        int var2_int = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        lk stackIn_3_0 = null;
        lk stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            if (!param1) {
              fieldTemp$2 = param0.field_c - 1;
              param0.field_c = param0.field_c - 1;
              var2_int = fieldTemp$2;
              var3 = new StringBuilder();
              L1: while (true) {
                L2: {
                  if (param0.a((byte) 71)) {
                    break L2;
                  } else {
                    L3: {
                      var4 = param0.b(-59);
                      if (Character.isWhitespace((char) var4)) {
                        break L3;
                      } else {
                        if (var4 == 44) {
                          break L3;
                        } else {
                          if (var4 == 40) {
                            break L3;
                          } else {
                            if (var4 != 41) {
                              discarded$3 = var3.append((char) var4);
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    param0.field_c = param0.field_c - 1;
                    break L2;
                  }
                }
                L4: {
                  L5: {
                    var5 = var3.toString();
                    if (var5.equals("true")) {
                      break L5;
                    } else {
                      if (var5.equals("false")) {
                        break L5;
                      } else {
                        L6: {
                          if (var5.charAt(0) == 45) {
                            break L6;
                          } else {
                            if (Character.isDigit(var5.charAt(0))) {
                              break L6;
                            } else {
                              var4 = vu.field_Ab;
                              break L4;
                            }
                          }
                        }
                        var4 = pv.field_H;
                        break L4;
                      }
                    }
                  }
                  var4 = ra.field_N;
                  break L4;
                }
                stackIn_21_0 = new lk(var4, var2_int, var5);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (lk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("tl.B(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_21_0;
        }
    }

    static {
        field_b = "FORMATION";
        field_c = new r();
    }
}
