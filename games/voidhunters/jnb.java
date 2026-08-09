/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jnb extends rqa {
    static java.math.BigInteger field_p;
    static int field_o;

    public static void a(int param0) {
        field_p = null;
        int var1 = 24 / ((param0 - -45) / 52);
    }

    final static boolean e(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 >= 9) {
            break L0;
          } else {
            jnb.a(24);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!rnb.a(0)) {
              break L2;
            } else {
              if ((kdb.field_o & 8) != 0) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(eab param0, int param1, ds param2, boolean param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            StringBuilder stackIn_41_1 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            ds var15 = null;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            mv var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            String var22 = null;
            byte[][] var23 = null;
            var14 = VoidHunters.field_G;
            try {
              L0: {
                L1: {
                  if (!param3) {
                    break L1;
                  } else {
                    var15 = (ds) null;
                    jnb.a((eab) null, 59, (ds) null, false);
                    break L1;
                  }
                }
                var19 = new mv();
                var19.field_i = param2.e((byte) -90);
                var19.field_d = param2.h(26);
                var19.field_e = new mob[var19.field_i];
                var19.field_j = new int[var19.field_i];
                var19.field_f = new byte[var19.field_i][][];
                var19.field_g = new mob[var19.field_i];
                var19.field_h = new int[var19.field_i];
                var19.field_k = new int[var19.field_i];
                var5 = 0;
                L2: while (true) {
                  if (var19.field_i <= var5) {
                    tma.field_r.b(-10258, var19);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param2.e((byte) -114);
                            if (0 == var6_int) {
                              break L5;
                            } else {
                              if (var6_int == 1) {
                                break L5;
                              } else {
                                if (var6_int == 2) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (var6_int == 3) {
                                      break L6;
                                    } else {
                                      if ((var6_int ^ -1) == -5) {
                                        break L6;
                                      } else {
                                        var5++;
                                        decompiledRegionSelector0 = 0;
                                        break L3;
                                      }
                                    }
                                  }
                                  var21 = param2.a(-1);
                                  var22 = param2.a(-1);
                                  var9 = param2.e((byte) -92);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L7: while (true) {
                                    if (var11_int >= var9) {
                                      L8: {
                                        var23 = new byte[var9][];
                                        var20 = var23;
                                        var11 = var20;
                                        if ((var6_int ^ -1) != -4) {
                                          break L8;
                                        } else {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var9 <= var12_int) {
                                              break L8;
                                            } else {
                                              var13 = param2.h(62);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param2.a(0, var23[var12_int], (byte) -59, var13);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        }
                                      }
                                      var19.field_h[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var18 = 0;
                                      var13 = var18;
                                      L10: while (true) {
                                        if (var9 <= var18) {
                                          var19.field_e[var5] = param0.a(var12, (byte) 95, beb.a(var21, (byte) 99), var22);
                                          var19.field_f[var5] = var23;
                                          break L4;
                                        } else {
                                          var12[var18] = beb.a(var10[var18], (byte) 99);
                                          var18++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param2.a(-1);
                                      var11_int++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L11: {
                            var17 = param2.a(-1);
                            var16 = param2.a(-1);
                            var9 = 0;
                            if (-2 == (var6_int ^ -1)) {
                              var9 = param2.h(40);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var19.field_h[var5] = var6_int;
                          var19.field_j[var5] = var9;
                          var19.field_g[var5] = param0.a(var16, beb.a(var17, (byte) 99), -6576);
                          break L4;
                        }
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var19.field_k[var5] = -1;
                        decompiledRegionSelector0 = 1;
                        break L12;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var19.field_k[var5] = -2;
                        decompiledRegionSelector0 = 1;
                        break L13;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var19.field_k[var5] = -3;
                        decompiledRegionSelector0 = 1;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var19.field_k[var5] = -4;
                        decompiledRegionSelector0 = 1;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        var19.field_k[var5] = -5;
                        decompiledRegionSelector0 = 1;
                        break L16;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_38_0 = (RuntimeException) (var4);

                stackIn_38_1 = new StringBuilder().append("jnb.D(");

                if (param0 == null) {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "null";
                  break L17;
                } else {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "{...}";
                  break L17;
                }
              }
              L18: {


                stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackIn_42_2 = "null";
                  break L18;
                } else {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackIn_42_2 = "{...}";
                  break L18;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_39_0), stackIn_42_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    jnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              si.a(38, 62, param0[0].a(118));
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jnb.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_o = 1;
    }
}
