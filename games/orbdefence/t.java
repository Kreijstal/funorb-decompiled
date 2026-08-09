/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends di {
    private boolean field_o;
    private fj field_w;
    private fj field_l;
    private int field_n;
    static im field_q;
    private fj field_z;
    private int field_m;
    private lj field_t;
    private int[] field_y;
    static String field_k;
    private lj field_s;
    private boolean field_p;
    private int[] field_u;
    private int field_x;
    private int field_r;
    static hj field_j;
    private lj field_v;

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 15136) {
                break L1;
              } else {
                field_j = (hj) null;
                break L1;
              }
            }
            stackIn_3_0 = ak.field_y.a(param1, 1, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("t.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(int param0, String[] param1, String param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_0 = 0;
        boolean stackIn_31_0 = false;
        String stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        boolean stackOut_30_0;
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
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var3_int = param2.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param2.indexOf("<%", var5);
              stackIn_3_0 = var6_int ^ -1;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (stackIn_3_0 <= -1) {
                        break L5;
                      } else {
                        if (var11 != 0) {
                          break L4;
                        } else {
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var5 = var6_int - -2;
                    break L4;
                  }
                  L6: while (true) {
                    L7: {
                      if (var5 >= var3_int) {
                        break L7;
                      } else {
                        stackOut_9_0 = hm.a(-20625, param2.charAt(var5));
                        stackIn_3_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                          continue L2;
                        } else {
                          if (!stackIn_10_0) {
                            break L7;
                          } else {
                            var5++;
                            if (var11 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      var7_ref_String = param2.substring(var6_int + 2, var5);
                      if (tk.a(10, (CharSequence) ((Object) var7_ref_String))) {
                        break L8;
                      } else {
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var3_int <= var5) {
                        break L9;
                      } else {
                        if (param2.charAt(var5) == 62) {
                          var5++;
                          var8 = th.a(116, (CharSequence) ((Object) var7_ref_String));
                          var4 = var4 + (param1[var8].length() - -var6_int - var5);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L10: {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  var7 = 0;
                  if (param0 == -415993727) {
                    break L10;
                  } else {
                    field_k = (String) null;
                    break L10;
                  }
                }
                L11: while (true) {
                  var8 = param2.indexOf("<%", var5);
                  stackIn_24_0 = 0;
                  L12: while (true) {
                    L13: {
                      L14: {
                        if (stackIn_24_0 <= var8) {
                          break L14;
                        } else {
                          if (var11 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      stackIn_28_0 = var8 + 2;
                      L15: while (true) {
                        var5 = stackIn_28_0;
                        L16: while (true) {
                          L17: {
                            if (var3_int <= var5) {
                              break L17;
                            } else {
                              stackOut_30_0 = hm.a(-20625, param2.charAt(var5));
                              stackIn_24_0 = stackOut_30_0 ? 1 : 0;
                              stackIn_31_0 = stackOut_30_0;
                              if (var11 != 0) {
                                continue L12;
                              } else {
                                if (!stackIn_31_0) {
                                  break L17;
                                } else {
                                  var5++;
                                  if (var11 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                          var9 = param2.substring(2 + var8, var5);
                          if (!tk.a(10, (CharSequence) ((Object) var9))) {
                            continue L11;
                          } else {
                            stackIn_27_0 = var5;

                            stackIn_27_1 = var3_int;

                            if (var11 != 0) {
                              stackIn_28_0 = stackIn_27_0 + stackIn_27_1;
                              continue L15;
                            } else {
                              L18: {
                                if (stackIn_27_0 >= stackIn_27_1) {
                                  break L18;
                                } else {
                                  if (param2.charAt(var5) != 62) {
                                    break L18;
                                  } else {
                                    var5++;
                                    var10 = th.a(113, (CharSequence) ((Object) var9));
                                    discarded$0 = var6.append(param2.substring(var7, var8));
                                    discarded$1 = var6.append(param1[var10]);
                                    var7 = var5;
                                    break L18;
                                  }
                                }
                              }
                              if (var11 == 0) {
                                continue L11;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                      }
                    }
                    discarded$2 = var6.append(param2.substring(var7));
                    stackIn_41_0 = var6.toString();
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var3);

            stackIn_44_1 = new StringBuilder().append("t.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L19;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_47_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');

            if (param2 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L20;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L20;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_45_0), stackIn_48_2 + ')');
        }
        return stackIn_41_0;
    }

    public static void c(boolean param0) {
        field_j = null;
        if (!param0) {
            field_j = (hj) null;
        }
        field_k = null;
        field_q = null;
    }

    final synchronized int c() {
        return 2;
    }

    final static hj[] a(String param0, ki param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hj[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param1.a(param0, 0);
              if (param3 <= -59) {
                break L1;
              } else {
                field_q = (im) null;
                break L1;
              }
            }
            var5 = param1.a(param2, 5187, var4_int);
            stackIn_3_0 = ua.a(param1, var4_int, 91, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("t.L(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final di d() {
        return null;
    }

    final di a() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        if (param0 != 0) {
            this.field_u = (int[]) null;
        }
        this.field_n = param1;
    }

    final synchronized void c(int param0) {
        int var3;
        L0: {
          var3 = OrbDefence.field_D ? 1 : 0;
          if (-1 <= (this.field_r ^ -1)) {
            break L0;
          } else {
            if (null == this.field_z) {
              break L0;
            } else {
              this.field_s.c(param0);
              break L0;
            }
          }
        }
        L1: {
          if ((this.field_r ^ -1) <= -1048577) {
            break L1;
          } else {
            if (this.field_l != null) {
              this.field_v.c(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (-1 <= (this.field_m ^ -1)) {
            break L2;
          } else {
            if (this.field_w != null) {
              this.field_t.c(param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (this.field_p) {
            L4: {
              L5: {
                if (0 >= this.field_x) {
                  break L5;
                } else {
                  if (!this.field_s.f(-75)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if (this.field_x >= 0) {
                break L3;
              } else {
                if (!this.field_v.f(-63)) {
                  this.field_p = false;
                  this.field_x = -this.field_x;
                  this.field_l = null;
                  if (var3 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                } else {
                  break L3;
                }
              }
            }
            this.field_x = -this.field_x;
            this.field_p = false;
            this.field_z = null;
            break L3;
          } else {
            break L3;
          }
        }
        L6: {
          if (-1 != (this.field_x ^ -1)) {
            L7: {
              this.field_r = this.field_r + param0 * this.field_x;
              if (1048576 <= this.field_r) {
                break L7;
              } else {
                if ((this.field_r ^ -1) < -1) {
                  break L6;
                } else {
                  this.field_r = 0;
                  if (!this.field_p) {
                    this.field_x = 0;
                    if (!this.field_o) {
                      L8: {
                        if (null != this.field_z) {
                          this.field_s.e(98);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      this.field_z = null;
                      if (var3 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
              }
            }
            this.field_r = 1048576;
            if (!this.field_p) {
              this.field_x = 0;
              if (!this.field_o) {
                L9: {
                  if (null == this.field_l) {
                    break L9;
                  } else {
                    this.field_v.e(70);
                    break L9;
                  }
                }
                this.field_l = null;
                break L6;
              } else {
                break L6;
              }
            } else {
              break L6;
            }
          } else {
            break L6;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int stackIn_34_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((this.field_n ^ -1) >= -1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.c(param2);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        if (!this.field_p) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (0 >= this.field_x) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!this.field_s.f(-49)) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (0 <= this.field_x) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (this.field_v.f(-98)) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_l = null;
                        this.field_p = false;
                        this.field_x = -this.field_x;
                        if (var11 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_x = -this.field_x;
                        this.field_p = false;
                        this.field_z = null;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_int = this.field_n * (this.field_r >> -1832225012) / 256;
                        var5 = -var4_int + this.field_n;
                        if (this.field_x == 0) {
                            statePc = 31;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_r = this.field_r + param2 * this.field_x;
                        if ((this.field_r ^ -1) <= -1048577) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (this.field_r > 0) {
                            statePc = 31;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_r = 0;
                        if (this.field_p) {
                            statePc = 31;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_x = 0;
                        if (!this.field_o) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (this.field_z != null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_s.e(89);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_z = null;
                        if (var11 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_r = 1048576;
                        if (this.field_p) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_x = 0;
                        if (!this.field_o) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (this.field_l != null) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        this.field_v.e(114);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        this.field_l = null;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (la.field_g) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_34_0 = param2;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = param2 << -415993727;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var6 = stackIn_34_0;
                        if (256 > this.field_m) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (this.field_z != null) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null != this.field_l) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((var4_int ^ -1) != -257) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_s.b(param0, param1, param2);
                        if (var11 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var5 ^ -1) != -257) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        this.field_v.b(param0, param1, param2);
                        if (var11 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (null == this.field_y) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var6 <= this.field_y.length) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_u = new int[var6];
                        this.field_y = new int[var6];
                        if (var11 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        mk.a(this.field_y, 0, var6);
                        mk.a(this.field_u, 0, var6);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        this.field_s.b(this.field_y, 0, param2);
                        this.field_v.b(this.field_u, 0, param2);
                        if (!la.field_g) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        param1 = param1 << 1;
                        stackIn_54_0 = param1 << 1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = param1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var7 = stackIn_54_0;
                        var8 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var6 <= var8) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        param0[var7 + var8] = param0[var7 + var8] + (this.field_u[var8] * var5 + this.field_y[var8] * var4_int >> 1062620552);
                        var8++;
                        if (var11 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var11 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (this.field_w == null) {
                            statePc = 80;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (this.field_m != 0) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (this.field_y == null) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (this.field_y.length < var6) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        mk.a(this.field_y, 0, var6);
                        if (var11 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        this.field_y = new int[var6];
                        this.field_u = new int[var6];
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.field_t.b(this.field_y, 0, param2);
                        if (la.field_g) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_70_0 = param1;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        param1 = param1 << 1;
                        stackIn_70_0 = param1 << 1;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var7 = stackIn_70_0;
                        var8 = this.field_m * this.field_n / 256;
                        var9 = this.field_n - var8;
                        var10 = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var6 <= var10) {
                            statePc = 80;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        param0[var10 + var7] = var8 * this.field_y[var10] + param0[var7 + var10] * var9 >> -185286200;
                        var10++;
                        if (var11 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var11 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 76: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_78_0 = (RuntimeException) (var4);
                    stackIn_77_0 = stackIn_78_0;
                    stackIn_78_1 = new StringBuilder().append("t.B(");
                    stackIn_77_1 = stackIn_78_1;
                    if (param0 == null) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_79_2 = "{...}";
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_79_2 = "null";
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    throw dd.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 80: {
                    return;
                }
                case 81: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private t() throws Throwable {
        throw new Error();
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        L0: {
          L1: {
            if (param2) {
              break L1;
            } else {
              ul.d();
              if (!OrbDefence.field_D) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ul.d(0, 0, ul.field_f, ul.field_l, 0, 192);
          break L0;
        }
        L2: {
          m.a(param2, 0);
          if (param1) {
            break L2;
          } else {
            field_q = (im) null;
            break L2;
          }
        }
    }

    static {
        field_k = "Ice";
    }
}
