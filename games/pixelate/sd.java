/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends ie {
    int field_O;
    static int[] field_Q;
    static String field_J;
    static ak field_P;
    static int field_K;
    static boolean field_N;
    static String field_M;
    static int field_L;
    static boolean field_I;

    public static void a(byte param0) {
        int var1 = 74 % ((param0 - 31) / 58);
        field_Q = null;
        field_M = null;
        field_J = null;
        field_P = null;
    }

    sd(ng param0) {
        super(param0.field_z, param0.field_p, param0.field_E, param0.field_C, (eb) null, (fn) null);
        try {
            param0.a(this.field_E, (byte) 89, 0, 0, this.field_C);
            this.field_O = 256;
            this.field_H = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param1 != 0) {
            return;
        }
        if (!(null != this.field_H)) {
            return;
        }
        if (!(this.field_O != 0)) {
            return;
        }
        if (!(256 != this.field_O)) {
            this.field_H.a(param0 + this.field_p, param1, param2 + this.field_z, (byte) 122);
            return;
        }
        tf var7 = new tf(this.field_H.field_E, this.field_H.field_C);
        h.a(-111, var7);
        int var6 = -5 % ((70 - param3) / 49);
        this.field_H.a(0, param1, 0, (byte) -79);
        ia.a((byte) 92);
        var7.a(this.field_z + param2, this.field_p + param0, this.field_O);
    }

    final static String a(String param0, int param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_6_0 = 0;
        int stackIn_19_0 = 0;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (0 <= var6_int) {
                stackIn_6_0 = 2 + var6_int;
                var5 = stackIn_6_0;
                L2: while (true) {
                  L3: {
                    if (var5 >= var3_int) {
                      break L3;
                    } else {
                      if (!ti.a(121, param0.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int + 2, var5);
                  if (!td.a(-128, (CharSequence) ((Object) var7_ref_String))) {
                    continue L1;
                  } else {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = na.a((CharSequence) ((Object) var7_ref_String), (byte) -33);
                        var4 = var4 + (param2[var8].length() + var6_int + -var5);
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L4: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (0 <= var8) {
                    stackIn_19_0 = 2 + var8;
                    var5 = stackIn_19_0;
                    L5: while (true) {
                      L6: {
                        if (var5 >= var3_int) {
                          break L6;
                        } else {
                          if (!ti.a(112, param0.charAt(var5))) {
                            break L6;
                          } else {
                            var5++;
                            continue L5;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      if (!td.a(-105, (CharSequence) ((Object) var9))) {
                        continue L4;
                      } else {
                        if ((var3_int ^ -1) >= (var5 ^ -1)) {
                          continue L4;
                        } else {
                          if (62 == param0.charAt(var5)) {
                            var5++;
                            var10 = na.a((CharSequence) ((Object) var9), (byte) -33);
                            discarded$0 = var6.append(param0.substring(var7, var8));
                            discarded$1 = var6.append(param2[var10]);
                            var7 = var5;
                            continue L4;
                          } else {
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    discarded$2 = var6.append(param0.substring(var7));
                    if (param1 > 17) {
                      stackIn_32_0 = var6.toString();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_30_0 = (String) null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("sd.C(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L7;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L8;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_36_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_30_0;
        } else {
          return stackIn_32_0;
        }
    }

    final static void a(byte param0, rh param1, int param2) {
        pc var7 = null;
        pc var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        try {
            var7 = aa.field_f;
            var8 = var7;
            var8.g(param2, 15514);
            var8.field_m = var8.field_m + 1;
            var4 = var8.field_m;
            var8.e(160, 1);
            var8.b(1276387944, param1.field_o);
            var8.b(1276387944, param1.field_t);
            var8.b(1276387944, param1.field_p);
            var8.d(param1.field_s, -93);
            var8.d(param1.field_v, -71);
            var8.d(param1.field_l, -40);
            var8.d(param1.field_n, -71);
            var8.e(160, param1.field_k.length);
            for (var5 = 0; param1.field_k.length > var5; var5++) {
                var7.d(param1.field_k[var5], -123);
            }
            if (param0 >= -37) {
                field_I = false;
            }
            var8.b(var4, (byte) 86);
            var8.f(var8.field_m + -var4, -1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "sd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public sd() {
        super(0, 0, 0, 0, (eb) null, (fn) null);
        this.field_O = 256;
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String[] var16 = null;
        we var17 = null;
        we var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var17 = new we(param1);
            var18 = var17;
            var18.field_m = -2 + param1.length;
            im.field_Qb = var18.a((byte) 97);
            gd.field_k = new byte[im.field_Qb][];
            rl.field_m = new boolean[im.field_Qb];
            gf.field_g = new int[im.field_Qb];
            ge.field_c = new int[im.field_Qb];
            fa.field_b = new int[im.field_Qb];
            e.field_b = new int[im.field_Qb];
            wo.field_f = new byte[im.field_Qb][];
            var18.field_m = -7 + (param1.length - 8 * im.field_Qb);
            tj.field_y = var18.a((byte) 38);
            jb.field_a = var18.a((byte) 46);
            var3 = 1 + (var18.f(255) & 255);
            var4 = 0;
            L1: while (true) {
              if (var4 >= im.field_Qb) {
                L2: {
                  if (param0 == -95) {
                    break L2;
                  } else {
                    var16 = (String[]) null;
                    sd.a((String) null, 80, (String[]) null);
                    break L2;
                  }
                }
                var4 = 0;
                L3: while (true) {
                  if (var4 >= im.field_Qb) {
                    var4 = 0;
                    L4: while (true) {
                      if (im.field_Qb <= var4) {
                        var4 = 0;
                        L5: while (true) {
                          if (var4 >= im.field_Qb) {
                            var18.field_m = param1.length - (7 - (-(8 * im.field_Qb) - 3 * (-1 + var3)));
                            fl.field_g = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var3 <= var4) {
                                var18.field_m = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (var4 >= im.field_Qb) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = gf.field_g[var4];
                                      var6 = ge.field_c[var4];
                                      var7 = var5 * var6;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var8 = var19;
                                      wo.field_f[var4] = var21;
                                      var22 = new byte[var7];
                                      var20 = var22;
                                      var9 = var20;
                                      gd.field_k[var4] = var22;
                                      var10 = 0;
                                      var11 = var18.f(255);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var5 <= var12) {
                                            if ((var11 & 2) != 0) {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var12 >= var5) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L11: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L10;
                                                    } else {
                                                      L12: {
                                                        dupTemp$0 = var18.a(0);
                                                        var9[var12 + var13 * var5] = dupTemp$0;
                                                        var14 = dupTemp$0;
                                                        stackIn_47_0 = var10;

                                                        if (var14 == -1) {
                                                          stackIn_48_0 = stackIn_47_0;
                                                          stackIn_48_1 = 0;
                                                          break L12;
                                                        } else {
                                                          stackIn_48_0 = stackIn_47_0;
                                                          stackIn_48_1 = 1;
                                                          break L12;
                                                        }
                                                      }
                                                      var10 = stackIn_48_0 | stackIn_48_1;
                                                      var13++;
                                                      continue L11;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var13 = 0;
                                            L13: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L9;
                                              } else {
                                                var8[var12 + var5 * var13] = var18.a(0);
                                                var13++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L14: while (true) {
                                          if (var7 <= var12) {
                                            if (-1 == (var11 & 2 ^ -1)) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L15: while (true) {
                                                if (var12 >= var7) {
                                                  break L8;
                                                } else {
                                                  L16: {
                                                    dupTemp$1 = var18.a(bn.a((int) param0, -95));
                                                    var9[var12] = dupTemp$1;
                                                    var13 = dupTemp$1;
                                                    stackIn_31_0 = var10;

                                                    if (-1 == var13) {
                                                      stackIn_32_0 = stackIn_31_0;
                                                      stackIn_32_1 = 0;
                                                      break L16;
                                                    } else {
                                                      stackIn_32_0 = stackIn_31_0;
                                                      stackIn_32_1 = 1;
                                                      break L16;
                                                    }
                                                  }
                                                  var10 = stackIn_32_0 | stackIn_32_1;
                                                  var12++;
                                                  continue L15;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var18.a(0);
                                            var12++;
                                            continue L14;
                                          }
                                        }
                                      }
                                    }
                                    rl.field_m[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  fl.field_g[var4] = var18.c((byte) 13);
                                  if (0 != fl.field_g[var4]) {
                                    break L17;
                                  } else {
                                    fl.field_g[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            ge.field_c[var4] = var18.a((byte) -116);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        gf.field_g[var4] = var18.a((byte) -14);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    e.field_b[var4] = var18.a((byte) -122);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                fa.field_b[var4] = var17.a((byte) 88);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var2);

            stackIn_54_1 = new StringBuilder().append("sd.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L18;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L18;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        pc var2 = aa.field_f;
        if (!param0) {
            return;
        }
        var2.g(param1, 15514);
        var2.e(160, 1);
        var2.e(160, 0);
    }

    static {
        int var0 = 0;
        field_Q = new int[64];
        for (var0 = 0; field_Q.length > var0; var0++) {
            field_Q[var0] = 256 / field_Q.length * (65793 * var0);
        }
        field_J = "Show players in <%0>'s game";
        field_M = "Create a free Account";
    }
}
