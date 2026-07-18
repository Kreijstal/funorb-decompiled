/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String field_a;
    static int[] field_d;
    static int field_b;
    static hj field_c;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        L0: {
          var42 = OrbDefence.field_D ? 1 : 0;
          if (param12 < 0) {
            break L0;
          } else {
            if (~wi.field_a >= ~param14) {
              break L0;
            } else {
              L1: {
                if (0 <= param6) {
                  break L1;
                } else {
                  if (param0 >= 0) {
                    break L1;
                  } else {
                    if (param1 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (wi.field_c > param6) {
                  break L2;
                } else {
                  if (~param0 > ~wi.field_c) {
                    break L2;
                  } else {
                    if (param1 < wi.field_c) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                var34 = -param14 + param12;
                if (~param14 == ~param2) {
                  L4: {
                    if (param12 != param14) {
                      var35 = -param2 + param12;
                      if (~param0 < ~param6) {
                        var22 = param15 << 16;
                        var17_int = param6 << 16;
                        var23 = (-param10 + param11 << 16) / var34;
                        var19 = (-param6 + param1 << 16) / var34;
                        var21 = param10 << 16;
                        var32 = (-param8 + param4 << 16) / var35;
                        var28 = (param3 - param13 << 16) / var35;
                        var31 = (param4 - param5 << 16) / var34;
                        var18 = param0 << 16;
                        var27 = (-param7 + param3 << 16) / var34;
                        var29 = param5 << 16;
                        var26 = param13 << 16;
                        var30 = param8 << 16;
                        var20 = (-param0 + param1 << 16) / var35;
                        var25 = param7 << 16;
                        var24 = (-param15 + param11 << 16) / var35;
                        break L4;
                      } else {
                        var17_int = param0 << 16;
                        var31 = (param4 - param8 << 16) / var35;
                        var32 = (-param5 + param4 << 16) / var34;
                        var24 = (param11 - param10 << 16) / var34;
                        var19 = (param1 - param0 << 16) / var35;
                        var30 = param5 << 16;
                        var20 = (-param6 + param1 << 16) / var34;
                        var27 = (param3 - param13 << 16) / var35;
                        var22 = param10 << 16;
                        var25 = param13 << 16;
                        var21 = param15 << 16;
                        var29 = param8 << 16;
                        var28 = (param3 + -param7 << 16) / var34;
                        var26 = param7 << 16;
                        var18 = param6 << 16;
                        var23 = (-param15 + param11 << 16) / var35;
                        break L4;
                      }
                    } else {
                      var26 = param13;
                      var18 = param0 << 16;
                      var21 = param10;
                      var25 = param7;
                      var27 = 0;
                      var19 = 0;
                      var24 = 0;
                      var32 = 0;
                      var22 = param15;
                      var23 = 0;
                      var28 = 0;
                      var31 = 0;
                      var20 = 0;
                      var17_int = param6 << 16;
                      var29 = param5;
                      var30 = param8;
                      break L4;
                    }
                  }
                  var33 = 0;
                  if (param14 >= 0) {
                    break L3;
                  } else {
                    param14 = Math.min(-param14, param2 - param14);
                    var17_int = var17_int + param14 * var19;
                    var25 = var25 + param14 * var27;
                    var30 = var30 + var32 * param14;
                    var21 = var21 + var23 * param14;
                    var22 = var22 + param14 * var24;
                    var18 = var18 + var20 * param14;
                    var26 = var26 + param14 * var28;
                    var29 = var29 + param14 * var31;
                    param14 = 0;
                    break L3;
                  }
                } else {
                  L5: {
                    var22 = param10 << 16;
                    var21 = param10 << 16;
                    var26 = param7 << 16;
                    var25 = param7 << 16;
                    var18 = param6 << 16;
                    var17_int = param6 << 16;
                    var30 = param5 << 16;
                    var29 = param5 << 16;
                    var35 = param2 - param14;
                    var19 = (-param6 + param0 << 16) / var35;
                    var20 = (param1 + -param6 << 16) / var34;
                    if (var19 < var20) {
                      var24 = (-param10 + param11 << 16) / var34;
                      var28 = (param3 - param7 << 16) / var34;
                      var23 = (param15 - param10 << 16) / var35;
                      var33 = 0;
                      var32 = (-param5 + param4 << 16) / var34;
                      var31 = (-param5 + param8 << 16) / var35;
                      var27 = (-param7 + param13 << 16) / var35;
                      break L5;
                    } else {
                      var31 = (param4 + -param5 << 16) / var34;
                      var28 = (-param7 + param13 << 16) / var35;
                      var32 = (param8 + -param5 << 16) / var35;
                      var23 = (-param10 + param11 << 16) / var34;
                      var24 = (param15 - param10 << 16) / var35;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var27 = (-param7 + param3 << 16) / var34;
                      var33 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (0 > param14) {
                        if (param2 < 0) {
                          param14 = param2 + -param14;
                          var26 = var26 + var28 * param14;
                          var22 = var22 + param14 * var24;
                          var30 = var30 + var32 * param14;
                          var25 = var25 + var27 * param14;
                          var29 = var29 + param14 * var31;
                          var18 = var18 + param14 * var20;
                          var21 = var21 + var23 * param14;
                          var17_int = var17_int + param14 * var19;
                          param14 = param2;
                          break L6;
                        } else {
                          param14 = -param14;
                          var18 = var18 + param14 * var20;
                          var21 = var21 + var23 * param14;
                          var25 = var25 + param14 * var27;
                          var26 = var26 + var28 * param14;
                          var30 = var30 + var32 * param14;
                          var22 = var22 + var24 * param14;
                          var29 = var29 + var31 * param14;
                          var17_int = var17_int + var19 * param14;
                          param14 = 0;
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var36 = wi.field_i[param14];
                    L8: while (true) {
                      if (param14 >= param2) {
                        break L6;
                      } else {
                        L9: {
                          var37 = var17_int >> 16;
                          if (~wi.field_c < ~var37) {
                            var38 = (var18 >> 16) - (var17_int >> 16);
                            if (var38 != 0) {
                              L10: {
                                var39 = (-var21 + var22) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (~wi.field_c < ~(var38 + var37)) {
                                  break L10;
                                } else {
                                  var38 = wi.field_c + -var37 + -1;
                                  break L10;
                                }
                              }
                              if (0 > var37) {
                                ik.a(var37 + var38, var36, -(var40 * var37) + var25, var40, -73, var39, var21 - var37 * var39, param9, -(var41 * var37) + var29, var41);
                                break L9;
                              } else {
                                ik.a(var38, var37 - -var36, var25, var40, -91, var39, var21, param9, var29, var41);
                                break L9;
                              }
                            } else {
                              if (var37 < 0) {
                                break L9;
                              } else {
                                if (~wi.field_c >= ~var37) {
                                  break L9;
                                } else {
                                  ik.a(var38, var36 + var37, var25, 0, -84, 0, var21, param9, var29, 0);
                                  break L9;
                                }
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                        param14++;
                        if (~param14 <= ~wi.field_a) {
                          return;
                        } else {
                          var22 = var22 + var24;
                          var18 = var18 + var20;
                          var21 = var21 + var23;
                          var36 = var36 + ul.field_f;
                          var26 = var26 + var28;
                          var25 = var25 + var27;
                          var30 = var30 + var32;
                          var17_int = var17_int + var19;
                          var29 = var29 + var31;
                          continue L8;
                        }
                      }
                    }
                  }
                  var36 = param12 - param2;
                  if (0 != var36) {
                    L11: {
                      var37 = param1 << 16;
                      var38 = param11 << 16;
                      var39 = param3 << 16;
                      if (var33 != 0) {
                        var30 = param8 << 16;
                        var26 = param13 << 16;
                        var18 = param0 << 16;
                        var22 = param15 << 16;
                        break L11;
                      } else {
                        var25 = param13 << 16;
                        var21 = param15 << 16;
                        var29 = param8 << 16;
                        var17_int = param0 << 16;
                        break L11;
                      }
                    }
                    var40 = param4 << 16;
                    var24 = (var38 - var22) / var36;
                    var19 = (var37 + -var17_int) / var36;
                    var20 = (var37 + -var18) / var36;
                    var28 = (var39 - var26) / var36;
                    var32 = (-var30 + var40) / var36;
                    var27 = (-var25 + var39) / var36;
                    var23 = (-var21 + var38) / var36;
                    var31 = (-var29 + var40) / var36;
                    break L3;
                  } else {
                    var19 = 0;
                    var32 = 0;
                    var27 = 0;
                    var20 = 0;
                    var24 = 0;
                    var28 = 0;
                    var23 = 0;
                    var31 = 0;
                    break L3;
                  }
                }
              }
              L12: {
                if (0 <= param14) {
                  break L12;
                } else {
                  param14 = -param14;
                  var30 = var30 + param14 * var32;
                  var21 = var21 + var23 * param14;
                  var17_int = var17_int + var19 * param14;
                  var22 = var22 + var24 * param14;
                  var26 = var26 + param14 * var28;
                  var18 = var18 + var20 * param14;
                  var29 = var29 + param14 * var31;
                  var25 = var25 + var27 * param14;
                  param14 = 0;
                  break L12;
                }
              }
              var35 = wi.field_i[param14];
              L13: while (true) {
                if (param14 >= param12) {
                  return;
                } else {
                  L14: {
                    var36 = var17_int >> 16;
                    if (var36 >= wi.field_c) {
                      break L14;
                    } else {
                      var37 = -(var17_int >> 16) + (var18 >> 16);
                      if (var37 != 0) {
                        L15: {
                          var38 = (var22 - var21) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (var30 - var29) / var37;
                          if (~wi.field_c >= ~(var37 + var36)) {
                            var37 = -var36 + (wi.field_c + -1);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        if (var36 >= 0) {
                          ik.a(var37, var36 - -var35, var25, var39, -62, var38, var21, param9, var29, var40);
                          break L14;
                        } else {
                          ik.a(var36 + var37, var35, var25 + -(var39 * var36), var39, -73, var38, var21 - var36 * var38, param9, -(var40 * var36) + var29, var40);
                          break L14;
                        }
                      } else {
                        if (var36 < 0) {
                          break L14;
                        } else {
                          if (~wi.field_c < ~var36) {
                            ik.a(var37, var36 + var35, var25, 0, -58, 0, var21, param9, var29, 0);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                  }
                  param14++;
                  if (~wi.field_a >= ~param14) {
                    return;
                  } else {
                    var18 = var18 + var20;
                    var25 = var25 + var27;
                    var35 = var35 + ul.field_f;
                    var22 = var22 + var24;
                    var17_int = var17_int + var19;
                    var29 = var29 + var31;
                    var26 = var26 + var28;
                    var30 = var30 + var32;
                    var21 = var21 + var23;
                    continue L13;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2, String param3, long param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var8 = param2.getParameter("cookiehost");
                      var7 = var8;
                      var7 = var8;
                      var9 = param1 + "=" + param3 + "; version=1; path=/; domain=" + var8;
                      var7 = var9;
                      var7 = var9;
                      if (param4 >= 0L) {
                        var7 = var9 + "; Expires=" + dh.a(-15591, ji.b(105) + 1000L * param4) + "; Max-Age=" + param4;
                        break L2;
                      } else {
                        var7 = var9 + "; Discard;";
                        break L2;
                      }
                    }
                    gm.a((byte) -17, "document.cookie=\"" + var7 + "\"", param2);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var6 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var6_ref;
                stackOut_7_1 = new StringBuilder().append("ke.E(").append(849743536).append(',');
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param1 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L4;
                }
              }
              L5: {
                stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param2 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L5;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L5;
                }
              }
              L6: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param3 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L6;
                }
              }
              throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, boolean param1, byte param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            try {
              L0: {
                L1: {
                  if (be.field_c.startsWith("win")) {
                    if (!tk.a(true, param0)) {
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
                try {
                  L2: {
                    L3: {
                      param3.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
                      if (param2 <= -33) {
                        break L3;
                      } else {
                        field_a = null;
                        break L3;
                      }
                    }
                    break L2;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    pe.a((byte) -13, (Throwable) null, "MGR1: " + param0);
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var4_ref;
                stackOut_9_1 = new StringBuilder().append("ke.B(");
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              L6: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param3 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L6;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L6;
                }
              }
              throw dd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var1 = 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "SCORE: <%0>";
    }
}
