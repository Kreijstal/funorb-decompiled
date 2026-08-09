/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends kh {
    static String[] field_t;
    private boolean field_n;
    static qb[] field_j;
    static int field_r;
    private int field_l;
    private int field_s;
    static String field_m;
    private dj field_i;
    private int field_o;
    static String field_k;
    private String field_q;
    private int field_p;
    private int field_h;

    final void a(String param0, int param1, int param2, byte param3, dj param4) {
        vd discarded$0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        String var8 = null;
        vd var9 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param4 != this.field_i) {
                  break L1;
                } else {
                  if (!this.field_n) {
                    break L1;
                  } else {
                    if (1 != this.field_h) {
                      break L1;
                    } else {
                      if (null == this.field_q) {
                        break L1;
                      } else {
                        if (!this.field_q.equals(param0)) {
                          break L1;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                this.field_i = param4;
                this.field_n = true;
                if (param3 == -18) {
                  break L2;
                } else {
                  var8 = (String) null;
                  discarded$0 = this.a((dj) null, 47, 36, (String) null);
                  break L2;
                }
              }
              this.field_h = 1;
              var9 = this.a(param4, 0, param2, param0);
              var7 = param4.b(param0);
              var9.field_f[0] = -(var7 >> 1021473505) + param1;
              var9.field_f[param0.length()] = param1 - -(var7 >> 476414817);
              be.a(0, var9, param0, param4, (byte) 35);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_f = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("re.S(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
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

    final void a(int param0, byte param1, dj param2, int param3, String param4) {
        vd var9 = null;
        vd var10 = null;
        if (param4 == null) {
            this.field_f = null;
            return;
        }
        if (param2 == this.field_i && this.field_n && 2 == this.field_h && null != this.field_q) {
            if (!(!this.field_q.equals(param4))) {
                return;
            }
        }
        try {
            this.field_n = true;
            this.field_i = param2;
            this.field_h = 2;
            this.field_q = param4;
            var9 = this.a(param2, 0, param3, param4);
            var10 = var9;
            var10.field_f[0] = -param2.b(param4) + param0;
            var10.field_f[param4.length()] = param0;
            be.a(0, var10, param4, param2, (byte) 35);
            int var7 = -84 / ((-47 - param1) / 49);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "re.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final vd a(dj param0, int param1, int param2, String param3) {
        vd var5 = null;
        RuntimeException var5_ref = null;
        vd var6 = null;
        vd stackIn_2_0 = null;
        vd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new vd(param2 - param0.field_C, param2 - -param0.field_m, param3.length());
            var5 = var6;
            if (param1 == 0) {
              this.field_f = new vd[]{var6};
              stackIn_4_0 = (vd) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (vd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("re.P(");

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            java.applet.Applet var8 = null;
            String var9 = null;
            int stackIn_3_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_18_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var7 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: {
                if (!cb.field_a) {
                  try {
                    L1: {
                      L2: {
                        var9 = "tuhstatbut";
                        var3 = (String) (ei.a(param1, param0 + 171, "getcookies"));
                        var4 = eh.a(false, ';', var3);
                        if (param0 == -68) {
                          break L2;
                        } else {
                          var8 = (java.applet.Applet) null;
                          re.a((byte) 30, (java.applet.Applet) null);
                          break L2;
                        }
                      }
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4.length) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                              break L4;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(var9)) {
                                break L4;
                              } else {
                                stackIn_11_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L6: {
                      if (null == param1.getParameter("tuhstatbut")) {
                        stackIn_18_0 = 0;
                        break L6;
                      } else {
                        stackIn_18_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_21_0 = (RuntimeException) (var2_ref);

                stackIn_21_1 = new StringBuilder().append("re.R(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "null";
                  break L7;
                } else {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "{...}";
                  break L7;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_11_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, dj param1, int param2, int param3, int param4, int param5, String param6, int param7) {
        vd stackIn_37_0;
        vd stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        vd stackIn_38_0 = null;
        vd stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        vd var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 == (param3 ^ -1)) {
                param3 = param1.field_H;
                break L1;
              } else {
                break L1;
              }
            }
            if (param6 != null) {
              L2: {
                if (this.field_i != param1) {
                  break L2;
                } else {
                  if (this.field_n) {
                    break L2;
                  } else {
                    if (param4 != this.field_h) {
                      break L2;
                    } else {
                      if (param5 != this.field_s) {
                        break L2;
                      } else {
                        if (this.field_o != param3) {
                          break L2;
                        } else {
                          if (param2 != this.field_l) {
                            break L2;
                          } else {
                            if (this.field_p != param7) {
                              break L2;
                            } else {
                              if (this.field_q == null) {
                                break L2;
                              } else {
                                if (this.field_q.equals(param6)) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              this.field_p = param7;
              this.field_s = param5;
              this.field_h = param4;
              this.field_o = param3;
              this.field_i = param1;
              this.field_n = false;
              this.field_l = param2;
              this.field_q = param6;
              if (param0 > 118) {
                L3: {
                  var16 = new String[param1.a(param6, param7) - -1];
                  var17 = var16;
                  var10 = Math.max(1, param1.a(param6, new int[]{param7}, var17));
                  if (-4 != (this.field_s ^ -1)) {
                    break L3;
                  } else {
                    if (1 == var10) {
                      this.field_s = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  this.field_f = new vd[var10];
                  if (-1 == (this.field_s ^ -1)) {
                    var11 = param1.field_C;
                    break L4;
                  } else {
                    if (-2 == (this.field_s ^ -1)) {
                      var11 = (-(var10 * this.field_o) + this.field_l >> -287870367) + param1.field_C;
                      break L4;
                    } else {
                      if (this.field_s == 2) {
                        var11 = this.field_l + -param1.field_m - var10 * this.field_o;
                        break L4;
                      } else {
                        L5: {
                          var12 = (-(var10 * this.field_o) + this.field_l) / (var10 - -1);
                          if (0 <= var12) {
                            break L5;
                          } else {
                            var12 = 0;
                            break L5;
                          }
                        }
                        var11 = param1.field_C - -var12;
                        this.field_o = this.field_o + var12;
                        break L4;
                      }
                    }
                  }
                }
                var12 = 0;
                L6: while (true) {
                  if (var10 <= var12) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L7: {
                      var13 = var16[var12];
                      stackIn_37_0 = null;

                      stackIn_37_1 = null;

                      stackIn_37_2 = -param1.field_C + var11;

                      stackIn_37_3 = var11 - -param1.field_m;

                      if (var13 == null) {
                        stackIn_38_0 = null;
                        stackIn_38_1 = null;
                        stackIn_38_2 = stackIn_37_2;
                        stackIn_38_3 = stackIn_37_3;
                        stackIn_38_4 = 0;
                        break L7;
                      } else {
                        stackIn_38_0 = null;
                        stackIn_38_1 = null;
                        stackIn_38_2 = stackIn_37_2;
                        stackIn_38_3 = stackIn_37_3;
                        stackIn_38_4 = var13.length();
                        break L7;
                      }
                    }
                    L8: {
                      var14 = new vd(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                      var14.field_f[0] = 0;
                      if (var13 != null) {
                        L9: {
                          var14.field_f[var13.length()] = param1.b(var13);
                          if (-4 != (param4 ^ -1)) {
                            stackIn_43_0 = 0;
                            break L9;
                          } else {
                            stackIn_43_0 = this.a(var13, false, param7, param1.b(var13));
                            break L9;
                          }
                        }
                        be.a(stackIn_43_0, var14, var13, param1, (byte) 35);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var11 = var11 + param3;
                    this.field_f[var12] = var14;
                    var12++;
                    continue L6;
                  }
                }
              } else {
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_f = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackIn_48_0 = (RuntimeException) (var9);

            stackIn_48_1 = new StringBuilder().append("re.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L10;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L11;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L11;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_49_0), stackIn_52_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(String param0, byte param1, dj param2, int param3, int param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        String var7 = null;
        vd var8 = null;
        vd var9 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -109) {
                break L1;
              } else {
                var7 = (String) null;
                this.a((byte) 70, (dj) null, -111, -15, -72, 7, (String) null, -64);
                break L1;
              }
            }
            if (param0 == null) {
              this.field_f = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (this.field_i != param2) {
                  break L2;
                } else {
                  if (!this.field_n) {
                    break L2;
                  } else {
                    if (0 != this.field_h) {
                      break L2;
                    } else {
                      if (null == this.field_q) {
                        break L2;
                      } else {
                        if (!this.field_q.equals(param0)) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              this.field_n = true;
              this.field_q = param0;
              this.field_h = 0;
              this.field_i = param2;
              var8 = this.a(param2, 0, param3, param0);
              var9 = var8;
              var8.field_f[0] = param4;
              var9.field_f[param0.length()] = param2.b(param0) + param4;
              be.a(0, var9, param0, param2, (byte) 35);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("re.M(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ',' + param4 + ')');
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

    public static void b(int param0) {
        field_t = null;
        field_k = null;
        field_j = null;
        if (param0 != 0) {
            return;
        }
        field_m = null;
    }

    public re() {
    }

    static {
        field_m = "Well done for mastering Fire Ball. Now you will practise with another basic spell.";
        field_k = "You have 1 unread message!";
        field_t = new String[]{"Showing by rating", "Showing by win percentage"};
        field_r = 0;
    }
}
