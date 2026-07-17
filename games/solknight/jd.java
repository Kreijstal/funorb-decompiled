/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends gb {
    private int field_o;
    static volatile boolean field_p;
    private r field_n;

    final int l(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 27310) {
              int fieldTemp$2 = ((jd) this).field_m;
              ((jd) this).field_m = ((jd) this).field_m + 1;
              stackOut_3_0 = ((jd) this).field_l[fieldTemp$2] + -((jd) this).field_n.a((byte) 7) & 255;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -26;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var2, "jd.F(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0, boolean param1, boolean param2, uh param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
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
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        byte stackOut_44_0 = 0;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var19 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = wi.b(84, 3 * (param0 - param4));
              var6 = param4 * 3;
              var7 = -10 + var5_int;
              we.a(100);
              if (0 >= param3.field_j) {
                break L1;
              } else {
                if (param3.field_k == null) {
                  break L1;
                } else {
                  int discarded$1 = 0;
                  ja.a();
                  break L1;
                }
              }
            }
            cf.field_c = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param3.field_F >= ~var8) {
                    break L4;
                  } else {
                    var9 = param3.field_K[var8];
                    var10 = param3.field_o[var8];
                    var11 = param3.field_w[var8];
                    stackOut_9_0 = 0;
                    stackIn_45_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_10_0 != 0) {
                            var12 = qb.field_ab[var9];
                            var13 = a.field_d[var9];
                            var14 = -var12 + qb.field_ab[var10];
                            var15 = -var12 + qb.field_ab[var11];
                            var16 = a.field_d[var10] + -var13;
                            var17 = a.field_d[var11] - var13;
                            if (-(var15 * var16) + var17 * var14 < 0) {
                              break L6;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        var12 = hl.field_a[var9];
                        if (var12 == -2147483648) {
                          break L5;
                        } else {
                          var13 = hl.field_a[var10];
                          if (-2147483648 == var13) {
                            break L5;
                          } else {
                            var14 = hl.field_a[var11];
                            if (var14 == -2147483648) {
                              break L5;
                            } else {
                              L7: {
                                var15 = -var6 + (var13 + var12) - -var14;
                                stackOut_21_0 = fb.field_b.length + -1;
                                stackIn_24_0 = stackOut_21_0;
                                stackIn_22_0 = stackOut_21_0;
                                if (var7 < 0) {
                                  stackOut_24_0 = stackIn_24_0;
                                  stackOut_24_1 = var15 << -var7;
                                  stackIn_25_0 = stackOut_24_0;
                                  stackIn_25_1 = stackOut_24_1;
                                  break L7;
                                } else {
                                  stackOut_22_0 = stackIn_22_0;
                                  stackOut_22_1 = var15 >> var7;
                                  stackIn_25_0 = stackOut_22_0;
                                  stackIn_25_1 = stackOut_22_1;
                                  break L7;
                                }
                              }
                              var16 = stackIn_25_0 - stackIn_25_1;
                              var17 = fb.field_b[var16];
                              L8: while (true) {
                                L9: {
                                  L10: {
                                    if (var17 >> 4 == 0) {
                                      break L10;
                                    } else {
                                      var16--;
                                      stackOut_27_0 = -1;
                                      stackOut_27_1 = ~var16;
                                      stackIn_36_0 = stackOut_27_0;
                                      stackIn_36_1 = stackOut_27_1;
                                      stackIn_28_0 = stackOut_27_0;
                                      stackIn_28_1 = stackOut_27_1;
                                      if (var19 != 0) {
                                        break L9;
                                      } else {
                                        L11: {
                                          if (stackIn_28_0 >= stackIn_28_1) {
                                            break L11;
                                          } else {
                                            System.err.println("Out of range!");
                                            if (var19 == 0) {
                                              break L5;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        var17 = fb.field_b[var16];
                                        if (var19 == 0) {
                                          continue L8;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_35_0 = var16 << 4;
                                  stackOut_35_1 = var17;
                                  stackIn_36_0 = stackOut_35_0;
                                  stackIn_36_1 = stackOut_35_1;
                                  break L9;
                                }
                                L12: {
                                  var18 = stackIn_36_0 + stackIn_36_1;
                                  he.field_a[var18] = var8;
                                  fb.field_b[var16] = 1 + var17;
                                  if (param3.field_j <= 0) {
                                    break L12;
                                  } else {
                                    if (null == param3.field_k) {
                                      break L12;
                                    } else {
                                      md.field_t[param3.field_k[var8]] = md.field_t[param3.field_k[var8]] + 1;
                                      break L12;
                                    }
                                  }
                                }
                                cf.field_c = cf.field_c + 1;
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_44_0 = param3.field_j;
                stackIn_45_0 = stackOut_44_0;
                break L3;
              }
              L13: {
                L14: {
                  if (stackIn_45_0 <= 0) {
                    break L14;
                  } else {
                    if (param3.field_k == null) {
                      break L14;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L15: while (true) {
                        if (var9 >= md.field_t.length) {
                          break L14;
                        } else {
                          var10 = md.field_t[var9];
                          md.field_t[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L13;
                          } else {
                            if (var19 == 0) {
                              continue L15;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L13;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var5;
            stackOut_59_1 = new StringBuilder().append("jd.B(").append(param0).append(44).append(0).append(44).append(0).append(44);
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param3 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L16;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L16;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param4 + 41);
        }
    }

    final static void a(String param0, long param1, java.applet.Applet param2, int param3, String param4) {
        try {
            String var6 = null;
            Throwable var6_ref = null;
            RuntimeException var6_ref2 = null;
            String var7 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var6 = param2.getParameter("cookiehost");
                      if (param3 == 1000) {
                        break L2;
                      } else {
                        field_p = false;
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        var7 = param0 + "=" + param4 + "; version=1; path=/; domain=" + var6;
                        if (param1 < 0L) {
                          break L4;
                        } else {
                          var7 = var7 + "; Expires=" + hc.a(1000L * param1 + je.a(1), -31289) + "; Max-Age=" + param1;
                          if (!SolKnight.field_L) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var7 = var7 + "; Discard;";
                      break L3;
                    }
                    fd.a(param3 + -921, param2, "document.cookie=\"" + var7 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var6_ref = decompiledCaughtException;
                    break L5;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) var6_ref2;
                stackOut_10_1 = new StringBuilder().append("jd.J(");
                stackIn_13_0 = stackOut_10_0;
                stackIn_13_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param0 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L6;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_14_0 = stackOut_11_0;
                  stackIn_14_1 = stackOut_11_1;
                  stackIn_14_2 = stackOut_11_2;
                  break L6;
                }
              }
              L7: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
                stackIn_17_0 = stackOut_14_0;
                stackIn_17_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L7;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_18_1 = stackOut_15_1;
                  stackIn_18_2 = stackOut_15_2;
                  break L7;
                }
              }
              L8: {
                stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param3).append(44);
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param4 == null) {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L8;
                } else {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "{...}";
                  stackIn_22_0 = stackOut_19_0;
                  stackIn_22_1 = stackOut_19_1;
                  stackIn_22_2 = stackOut_19_2;
                  break L8;
                }
              }
              throw fc.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    jd(int param0) {
        super(param0);
    }

    final void a(int param0, int[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((jd) this).field_n = new r(param1);
              if (param0 == -1) {
                break L1;
              } else {
                ((jd) this).m(0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("jd.I(").append(param0).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 45) {
                break L1;
              } else {
                ((jd) this).field_n = null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param1 <= var5_int) {
                    break L4;
                  } else {
                    int fieldTemp$2 = ((jd) this).field_m;
                    ((jd) this).field_m = ((jd) this).field_m + 1;
                    param3[var5_int - -param2] = (byte)(((jd) this).field_l[fieldTemp$2] + -((jd) this).field_n.a((byte) -78));
                    var5_int++;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("jd.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final void d(byte param0) {
        try {
            ((jd) this).field_o = 8 * ((jd) this).field_m;
            if (param0 >= -78) {
                ((jd) this).m(55);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "jd.G(" + param0 + 41);
        }
    }

    final void m(int param0) {
        try {
            ((jd) this).field_m = (((jd) this).field_o + 7) / 8;
            if (param0 != 0) {
                int discarded$0 = ((jd) this).l(69);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "jd.D(" + param0 + 41);
        }
    }

    final int d(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = ((jd) this).field_o >> 3;
              var4 = 8 + -(((jd) this).field_o & 7);
              if (param0 == 48) {
                break L1;
              } else {
                ((jd) this).d((byte) 5);
                break L1;
              }
            }
            var5 = 0;
            ((jd) this).field_o = ((jd) this).field_o + param1;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (~var4 <= ~param1) {
                      break L5;
                    } else {
                      int incrementValue$2 = var3_int;
                      var3_int++;
                      var5 = var5 + ((sd.field_j[var4] & ((jd) this).field_l[incrementValue$2]) << param1 - var4);
                      param1 = param1 - var4;
                      var4 = 8;
                      if (var6 != 0) {
                        break L4;
                      } else {
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (var4 != param1) {
                    break L4;
                  } else {
                    var5 = var5 + (((jd) this).field_l[var3_int] & sd.field_j[var4]);
                    if (var6 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var5 = var5 + (((jd) this).field_l[var3_int] >> var4 + -param1 & sd.field_j[param1]);
                break L3;
              }
              stackOut_13_0 = var5;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var3, "jd.A(" + param0 + 44 + param1 + 41);
        }
        return stackIn_14_0;
    }

    final static void n() {
        try {
            int var1_int = 0;
            int discarded$0 = -35;
            k.a();
            k.field_b = true;
            ta.field_b = true;
            u.field_b.j(1);
            nf.a(false, kh.field_b, -96);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "jd.E(" + -110 + 41);
        }
    }

    final void e(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -2147483648) {
                break L1;
              } else {
                jd.a((String) null, 29L, (java.applet.Applet) null, -35, (String) null);
                break L1;
              }
            }
            int fieldTemp$2 = ((jd) this).field_m;
            ((jd) this).field_m = ((jd) this).field_m + 1;
            ((jd) this).field_l[fieldTemp$2] = (byte)(((jd) this).field_n.a((byte) 103) + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var3, "jd.C(" + param0 + 44 + param1 + 41);
        }
    }

    jd(byte[] param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = false;
    }
}
