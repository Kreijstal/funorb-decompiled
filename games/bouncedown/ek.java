/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends ji {
    static long field_f;

    ek(long param0, String param1) {
        super(param0, param1);
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, boolean param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = Bounce.field_N;
          if (param12 < 0) {
            break L0;
          } else {
            if (~param13 <= ~qk.field_g) {
              break L0;
            } else {
              L1: {
                if (param11 >= 0) {
                  break L1;
                } else {
                  if (param10 >= 0) {
                    break L1;
                  } else {
                    if (param3 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param11 < qk.field_a) {
                  break L2;
                } else {
                  if (~qk.field_a < ~param10) {
                    break L2;
                  } else {
                    if (qk.field_a <= param3) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var34 = -param13 + param12;
              if (!param9) {
                L3: {
                  if (param13 != param7) {
                    L4: {
                      var30 = param8 << 16;
                      var29 = param8 << 16;
                      var26 = param6 << 16;
                      var25 = param6 << 16;
                      var22 = param4 << 16;
                      var21 = param4 << 16;
                      var18 = param11 << 16;
                      var17_int = param11 << 16;
                      var35 = param7 + -param13;
                      var19 = (param10 - param11 << 16) / var35;
                      var20 = (-param11 + param3 << 16) / var34;
                      if (~var20 >= ~var19) {
                        var23 = (param15 - param4 << 16) / var34;
                        var32 = (param16 + -param8 << 16) / var35;
                        var33 = 1;
                        var28 = (param2 + -param6 << 16) / var35;
                        var27 = (param14 + -param6 << 16) / var34;
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var31 = (param5 + -param8 << 16) / var34;
                        var24 = (param0 - param4 << 16) / var35;
                        break L4;
                      } else {
                        var24 = (-param4 + param15 << 16) / var34;
                        var23 = (-param4 + param0 << 16) / var35;
                        var33 = 0;
                        var28 = (param14 + -param6 << 16) / var34;
                        var31 = (param16 - param8 << 16) / var35;
                        var27 = (-param6 + param2 << 16) / var35;
                        var32 = (-param8 + param5 << 16) / var34;
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        if (param13 >= 0) {
                          break L6;
                        } else {
                          if (param7 < 0) {
                            param13 = -param13 + param7;
                            var26 = var26 + var28 * param13;
                            var21 = var21 + param13 * var23;
                            var30 = var30 + var32 * param13;
                            var25 = var25 + var27 * param13;
                            var22 = var22 + var24 * param13;
                            var18 = var18 + param13 * var20;
                            var17_int = var17_int + var19 * param13;
                            var29 = var29 + param13 * var31;
                            param13 = param7;
                            break L5;
                          } else {
                            param13 = -param13;
                            var21 = var21 + param13 * var23;
                            var17_int = var17_int + var19 * param13;
                            var26 = var26 + var28 * param13;
                            var30 = var30 + var32 * param13;
                            var25 = var25 + param13 * var27;
                            var18 = var18 + param13 * var20;
                            var29 = var29 + var31 * param13;
                            var22 = var22 + param13 * var24;
                            param13 = 0;
                            break L6;
                          }
                        }
                      }
                      var36 = qk.field_b[param13];
                      L7: while (true) {
                        if (param7 <= param13) {
                          break L5;
                        } else {
                          L8: {
                            var37 = var17_int >> 16;
                            if (~qk.field_a < ~var37) {
                              var38 = (var18 >> 16) + -(var17_int >> 16);
                              if (var38 == 0) {
                                if (var37 < 0) {
                                  break L8;
                                } else {
                                  if (~qk.field_a >= ~var37) {
                                    break L8;
                                  } else {
                                    tk.a(var38, var36 + var37, var21, (byte) -72, 0, param1, 0, var29, var25, 0);
                                    break L8;
                                  }
                                }
                              } else {
                                L9: {
                                  var39 = (-var21 + var22) / var38;
                                  var40 = (var26 - var25) / var38;
                                  var41 = (var30 - var29) / var38;
                                  if (var37 - -var38 < qk.field_a) {
                                    break L9;
                                  } else {
                                    var38 = -var37 + (qk.field_a - 1);
                                    break L9;
                                  }
                                }
                                if (var37 < 0) {
                                  tk.a(var38 + var37, var36, -(var37 * var39) + var21, (byte) -72, var39, param1, var41, -(var41 * var37) + var29, var25 - var37 * var40, var40);
                                  break L8;
                                } else {
                                  tk.a(var38, var36 + var37, var21, (byte) -72, var39, param1, var41, var29, var25, var40);
                                  break L8;
                                }
                              }
                            } else {
                              break L8;
                            }
                          }
                          param13++;
                          if (param13 >= qk.field_g) {
                            return;
                          } else {
                            var17_int = var17_int + var19;
                            var21 = var21 + var23;
                            var36 = var36 + na.field_e;
                            var30 = var30 + var32;
                            var22 = var22 + var24;
                            var26 = var26 + var28;
                            var29 = var29 + var31;
                            var25 = var25 + var27;
                            var18 = var18 + var20;
                            continue L7;
                          }
                        }
                      }
                    }
                    var36 = param12 - param7;
                    if (var36 != 0) {
                      L10: {
                        var37 = param3 << 16;
                        var38 = param15 << 16;
                        var39 = param14 << 16;
                        if (var33 == 0) {
                          var29 = param16 << 16;
                          var17_int = param10 << 16;
                          var21 = param0 << 16;
                          var25 = param2 << 16;
                          break L10;
                        } else {
                          var18 = param10 << 16;
                          var30 = param16 << 16;
                          var22 = param0 << 16;
                          var26 = param2 << 16;
                          break L10;
                        }
                      }
                      var40 = param5 << 16;
                      var20 = (var37 + -var18) / var36;
                      var19 = (-var17_int + var37) / var36;
                      var23 = (-var21 + var38) / var36;
                      var27 = (-var25 + var39) / var36;
                      var31 = (-var29 + var40) / var36;
                      var28 = (var39 + -var26) / var36;
                      var32 = (var40 - var30) / var36;
                      var24 = (-var22 + var38) / var36;
                      break L3;
                    } else {
                      var20 = 0;
                      var31 = 0;
                      var24 = 0;
                      var27 = 0;
                      var28 = 0;
                      var19 = 0;
                      var32 = 0;
                      var23 = 0;
                      break L3;
                    }
                  } else {
                    L11: {
                      if (~param13 == ~param12) {
                        var21 = param4;
                        var20 = 0;
                        var25 = param6;
                        var27 = 0;
                        var28 = 0;
                        var22 = param0;
                        var29 = param8;
                        var17_int = param11 << 16;
                        var23 = 0;
                        var32 = 0;
                        var18 = param10 << 16;
                        var26 = param2;
                        var30 = param16;
                        var19 = 0;
                        var24 = 0;
                        var31 = 0;
                        break L11;
                      } else {
                        var35 = param12 - param7;
                        if (param10 <= param11) {
                          var27 = (-param2 + param14 << 16) / var35;
                          var17_int = param10 << 16;
                          var26 = param6 << 16;
                          var22 = param4 << 16;
                          var29 = param16 << 16;
                          var18 = param11 << 16;
                          var23 = (-param0 + param15 << 16) / var35;
                          var28 = (-param6 + param14 << 16) / var34;
                          var24 = (param15 - param4 << 16) / var34;
                          var32 = (param5 + -param8 << 16) / var34;
                          var21 = param0 << 16;
                          var19 = (param3 + -param10 << 16) / var35;
                          var30 = param8 << 16;
                          var20 = (-param11 + param3 << 16) / var34;
                          var31 = (-param16 + param5 << 16) / var35;
                          var25 = param2 << 16;
                          break L11;
                        } else {
                          var21 = param4 << 16;
                          var25 = param6 << 16;
                          var19 = (param3 - param11 << 16) / var34;
                          var32 = (param5 + -param16 << 16) / var35;
                          var23 = (param15 - param4 << 16) / var34;
                          var22 = param0 << 16;
                          var28 = (param14 - param2 << 16) / var35;
                          var24 = (-param0 + param15 << 16) / var35;
                          var18 = param10 << 16;
                          var29 = param8 << 16;
                          var30 = param16 << 16;
                          var20 = (-param10 + param3 << 16) / var35;
                          var31 = (param5 + -param8 << 16) / var34;
                          var26 = param2 << 16;
                          var27 = (param14 - param6 << 16) / var34;
                          var17_int = param11 << 16;
                          break L11;
                        }
                      }
                    }
                    var33 = 0;
                    if (param13 < 0) {
                      param13 = Math.min(-param13, param7 - param13);
                      var17_int = var17_int + var19 * param13;
                      var29 = var29 + param13 * var31;
                      var30 = var30 + var32 * param13;
                      var21 = var21 + var23 * param13;
                      var25 = var25 + var27 * param13;
                      var18 = var18 + var20 * param13;
                      var26 = var26 + var28 * param13;
                      var22 = var22 + var24 * param13;
                      param13 = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L12: {
                  if (param13 < 0) {
                    param13 = -param13;
                    var22 = var22 + var24 * param13;
                    var21 = var21 + param13 * var23;
                    var25 = var25 + var27 * param13;
                    var26 = var26 + var28 * param13;
                    var29 = var29 + param13 * var31;
                    var18 = var18 + var20 * param13;
                    var17_int = var17_int + var19 * param13;
                    var30 = var30 + param13 * var32;
                    param13 = 0;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var35 = qk.field_b[param13];
                L13: while (true) {
                  if (param13 >= param12) {
                    return;
                  } else {
                    L14: {
                      var36 = var17_int >> 16;
                      if (var36 >= qk.field_a) {
                        break L14;
                      } else {
                        var37 = -(var17_int >> 16) + (var18 >> 16);
                        if (var37 == 0) {
                          if (var36 < 0) {
                            break L14;
                          } else {
                            if (var36 >= qk.field_a) {
                              break L14;
                            } else {
                              tk.a(var37, var36 + var35, var21, (byte) -72, 0, param1, 0, var29, var25, 0);
                              break L14;
                            }
                          }
                        } else {
                          L15: {
                            var38 = (var22 - var21) / var37;
                            var39 = (var26 - var25) / var37;
                            var40 = (-var29 + var30) / var37;
                            if (qk.field_a > var37 + var36) {
                              break L15;
                            } else {
                              var37 = -var36 + qk.field_a - 1;
                              break L15;
                            }
                          }
                          if (var36 < 0) {
                            tk.a(var37 + var36, var35, -(var36 * var38) + var21, (byte) -72, var38, param1, var40, var29 + -(var36 * var40), -(var39 * var36) + var25, var39);
                            break L14;
                          } else {
                            tk.a(var37, var35 + var36, var21, (byte) -72, var38, param1, var40, var29, var25, var39);
                            break L14;
                          }
                        }
                      }
                    }
                    param13++;
                    if (~qk.field_g < ~param13) {
                      var30 = var30 + var32;
                      var18 = var18 + var20;
                      var17_int = var17_int + var19;
                      var22 = var22 + var24;
                      var35 = var35 + na.field_e;
                      var25 = var25 + var27;
                      var29 = var29 + var31;
                      var26 = var26 + var28;
                      var21 = var21 + var23;
                      continue L13;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final sb b(byte param0) {
        if (param0 > -57) {
            sb discarded$0 = ((ek) this).b((byte) 46);
        }
        return og.field_b;
    }

    final static kf c(int param0) {
        try {
            Throwable var1 = null;
            kf stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            kf stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 0) {
                    break L1;
                  } else {
                    kf discarded$2 = ek.c(25);
                    break L1;
                  }
                }
                stackOut_2_0 = (kf) Class.forName("af").newInstance();
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
