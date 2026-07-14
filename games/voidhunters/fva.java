/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fva extends rqa {
    static int field_o;
    static boolean field_p;

    fva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int[] param2, int param3, int[] param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20_int = 0;
        long var20 = 0L;
        int var21 = 0;
        int var22 = 0;
        var22 = VoidHunters.field_G;
        var7 = param4[-2 + param4.length];
        var8 = param4[param4.length - 1];
        if (param6 == -1) {
          var9 = 0;
          L0: while (true) {
            if (param4.length > var9) {
              L1: {
                var9++;
                var10 = param4[var9];
                var9++;
                var11 = param4[var9];
                var12 = -var8 + var11 >> param5;
                var13 = -var10 + var7 >> param5;
                if (var12 == -1) {
                  break L1;
                } else {
                  if (-1 != var13) {
                    var18 = 0;
                    var18++;
                    var19 = param4[var18];
                    var18++;
                    var20_int = param4[var18];
                    var14 = var12 * (-param1 + var19 >> param5) - -((-param3 + var20_int >> param5) * var13);
                    var15 = var14;
                    L2: while (true) {
                      if (var18 >= param4.length) {
                        var18 = 0;
                        var18++;
                        var19 = param2[var18];
                        var18++;
                        var20_int = param2[var18];
                        var16 = var12 * (-param1 + var19 >> param5) + var13 * (var20_int + -param3 >> param5);
                        var17 = var16;
                        L3: while (true) {
                          if (var18 >= param2.length) {
                            L4: {
                              if (var15 >= var16) {
                                break L4;
                              } else {
                                if (var14 <= var17) {
                                  break L4;
                                } else {
                                  L5: {
                                    var19 = -var16 + var15;
                                    var20_int = var14 - var17;
                                    if (Math.abs(var19) >= Math.abs(var20_int)) {
                                      var18 = var20_int;
                                      break L5;
                                    } else {
                                      var18 = var19;
                                      break L5;
                                    }
                                  }
                                  var19 = ar.a(var12, (byte) 119, var13);
                                  if (-1 > (var19 ^ -1)) {
                                    var20 = ((long)var18 << param5) / (long)var19;
                                    if ((Math.abs(var20) ^ -1L) > ((long)Math.abs(param0) ^ -1L)) {
                                      param0 = (int)var20;
                                      break L1;
                                    } else {
                                      break L1;
                                    }
                                  } else {
                                    break L1;
                                  }
                                }
                              }
                            }
                            return 2147483647;
                          } else {
                            var18++;
                            var19 = param2[var18];
                            var18++;
                            var20_int = param2[var18];
                            var21 = (-param1 + var19 >> param5) * var12 - -((var20_int + -param3 >> param5) * var13);
                            if (var21 < var17) {
                              var17 = var21;
                              continue L3;
                            } else {
                              if (var21 <= var16) {
                                continue L3;
                              } else {
                                var16 = var21;
                                continue L3;
                              }
                            }
                          }
                        }
                      } else {
                        var18++;
                        var19 = param4[var18];
                        var18++;
                        var20_int = param4[var18];
                        var21 = (-param1 + var19 >> param5) * var12 + (var20_int + -param3 >> param5) * var13;
                        if (var15 <= var21) {
                          if (var14 < var21) {
                            var14 = var21;
                            continue L2;
                          } else {
                            continue L2;
                          }
                        } else {
                          var15 = var21;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              var8 = var11;
              var7 = var10;
              continue L0;
            } else {
              return param0;
            }
          }
        } else {
          field_o = -71;
          var9 = 0;
          L6: while (true) {
            if (param4.length > var9) {
              L7: {
                var9++;
                var10 = param4[var9];
                var9++;
                var11 = param4[var9];
                var12 = -var8 + var11 >> param5;
                var13 = -var10 + var7 >> param5;
                if (var12 == -1) {
                  break L7;
                } else {
                  if (-1 != var13) {
                    var18 = 0;
                    var18++;
                    var19 = param4[var18];
                    var18++;
                    var20_int = param4[var18];
                    var14 = var12 * (-param1 + var19 >> param5) - -((-param3 + var20_int >> param5) * var13);
                    var15 = var14;
                    L8: while (true) {
                      if (var18 >= param4.length) {
                        var18 = 0;
                        var18++;
                        var19 = param2[var18];
                        var18++;
                        var20_int = param2[var18];
                        var16 = var12 * (-param1 + var19 >> param5) + var13 * (var20_int + -param3 >> param5);
                        var17 = var16;
                        L9: while (true) {
                          if (var18 >= param2.length) {
                            L10: {
                              if (var15 >= var16) {
                                break L10;
                              } else {
                                if (var14 <= var17) {
                                  break L10;
                                } else {
                                  L11: {
                                    var19 = -var16 + var15;
                                    var20_int = var14 - var17;
                                    if (Math.abs(var19) >= Math.abs(var20_int)) {
                                      var18 = var20_int;
                                      break L11;
                                    } else {
                                      var18 = var19;
                                      break L11;
                                    }
                                  }
                                  var19 = ar.a(var12, (byte) 119, var13);
                                  if (-1 > (var19 ^ -1)) {
                                    var20 = ((long)var18 << param5) / (long)var19;
                                    if ((Math.abs(var20) ^ -1L) > ((long)Math.abs(param0) ^ -1L)) {
                                      param0 = (int)var20;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            return 2147483647;
                          } else {
                            var18++;
                            var19 = param2[var18];
                            var18++;
                            var20_int = param2[var18];
                            var21 = (-param1 + var19 >> param5) * var12 - -((var20_int + -param3 >> param5) * var13);
                            if (var21 < var17) {
                              var17 = var21;
                              continue L9;
                            } else {
                              if (var21 <= var16) {
                                continue L9;
                              } else {
                                var16 = var21;
                                continue L9;
                              }
                            }
                          }
                        }
                      } else {
                        var18++;
                        var19 = param4[var18];
                        var18++;
                        var20_int = param4[var18];
                        var21 = (-param1 + var19 >> param5) * var12 + (var20_int + -param3 >> param5) * var13;
                        if (var15 <= var21) {
                          if (var14 < var21) {
                            var14 = var21;
                            continue L8;
                          } else {
                            continue L8;
                          }
                        } else {
                          var15 = var21;
                          continue L8;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              var8 = var11;
              var7 = var10;
              continue L6;
            } else {
              return param0;
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(42, 62, param0[0].a(11));
          return new nc((Object) (Object) "void");
        }
    }

    final static String a(int[] param0, boolean param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (param0 != null) {
          var2 = "{";
          var3 = 0;
          L0: while (true) {
            if (param0.length <= var3) {
              if (param1) {
                return null;
              } else {
                return var2 + "}";
              }
            } else {
              var2 = var2 + param0[var3];
              if (var3 < param0.length - 1) {
                var2 = var2 + ",";
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = true;
        field_o = 22;
    }
}
