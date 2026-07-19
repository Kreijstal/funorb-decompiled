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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = ak.field_y.a(param1, 1, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("t.I(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(int param0, String[] param1, String param2) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
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
        int stackIn_3_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_0 = 0;
        boolean stackIn_31_0 = false;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        String stackIn_41_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_23_0 = 0;
        String stackOut_40_0 = null;
        int stackOut_26_0 = 0;
        boolean stackOut_30_0 = false;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var3_int = param2.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param2.indexOf("<%", var5);
              stackOut_2_0 = var6_int ^ -1;
              stackIn_3_0 = stackOut_2_0;
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
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  L12: while (true) {
                    L13: {
                      if (stackIn_24_0 <= var8) {
                        break L13;
                      } else {
                        if (var11 == 0) {
                          discarded$3 = var6.append(param2.substring(var7));
                          stackOut_40_0 = var6.toString();
                          stackIn_41_0 = stackOut_40_0;
                          break L0;
                        } else {
                          break L13;
                        }
                      }
                    }
                    stackOut_26_0 = var8 + 2;
                    stackIn_28_0 = stackOut_26_0;
                    L14: while (true) {
                      var5 = stackIn_28_0;
                      L15: while (true) {
                        L16: {
                          if (var3_int <= var5) {
                            break L16;
                          } else {
                            stackOut_30_0 = hm.a(-20625, param2.charAt(var5));
                            stackIn_24_0 = stackOut_30_0 ? 1 : 0;
                            stackIn_31_0 = stackOut_30_0;
                            if (var11 != 0) {
                              continue L12;
                            } else {
                              if (!stackIn_31_0) {
                                break L16;
                              } else {
                                var5++;
                                continue L15;
                              }
                            }
                          }
                        }
                        var9 = param2.substring(2 + var8, var5);
                        if (!tk.a(10, (CharSequence) ((Object) var9))) {
                          continue L11;
                        } else {
                          stackOut_35_0 = var5;
                          stackOut_35_1 = var3_int;
                          stackIn_27_0 = stackOut_35_0;
                          stackIn_27_1 = stackOut_35_1;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          if (var11 != 0) {
                            stackOut_27_0 = stackIn_27_0 + stackIn_27_1;
                            stackIn_28_0 = stackOut_27_0;
                            continue L14;
                          } else {
                            L17: {
                              if (stackIn_36_0 >= stackIn_36_1) {
                                break L17;
                              } else {
                                if (param2.charAt(var5) != 62) {
                                  break L17;
                                } else {
                                  var5++;
                                  var10 = th.a(113, (CharSequence) ((Object) var9));
                                  discarded$4 = var6.append(param2.substring(var7, var8));
                                  discarded$5 = var6.append(param1[var10]);
                                  var7 = var5;
                                  break L17;
                                }
                              }
                            }
                            continue L11;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var3);
            stackOut_42_1 = new StringBuilder().append("t.M(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L18;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L18;
            }
          }
          L19: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L19;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L19;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        hj[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = ua.a(param1, var4_int, 91, var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("t.L(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
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
        int var3 = 0;
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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if ((this.field_n ^ -1) >= -1) {
              this.c(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_p) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (0 >= this.field_x) {
                        break L3;
                      } else {
                        if (!this.field_s.f(-49)) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (0 <= this.field_x) {
                      break L1;
                    } else {
                      if (this.field_v.f(-98)) {
                        break L1;
                      } else {
                        this.field_l = null;
                        this.field_p = false;
                        this.field_x = -this.field_x;
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  this.field_x = -this.field_x;
                  this.field_p = false;
                  this.field_z = null;
                  break L1;
                }
              }
              L4: {
                var4_int = this.field_n * (this.field_r >> -1832225012) / 256;
                var5 = -var4_int + this.field_n;
                if (this.field_x == 0) {
                  break L4;
                } else {
                  L5: {
                    this.field_r = this.field_r + param2 * this.field_x;
                    if ((this.field_r ^ -1) <= -1048577) {
                      break L5;
                    } else {
                      if (this.field_r > 0) {
                        break L4;
                      } else {
                        this.field_r = 0;
                        if (this.field_p) {
                          break L4;
                        } else {
                          this.field_x = 0;
                          if (!this.field_o) {
                            L6: {
                              if (this.field_z != null) {
                                this.field_s.e(89);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            this.field_z = null;
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  this.field_r = 1048576;
                  if (this.field_p) {
                    break L4;
                  } else {
                    this.field_x = 0;
                    if (!this.field_o) {
                      L7: {
                        if (this.field_l != null) {
                          this.field_v.e(114);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      this.field_l = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L8: {
                if (la.field_g) {
                  stackOut_33_0 = param2 << -415993727;
                  stackIn_34_0 = stackOut_33_0;
                  break L8;
                } else {
                  stackOut_32_0 = param2;
                  stackIn_34_0 = stackOut_32_0;
                  break L8;
                }
              }
              L9: {
                L10: {
                  var6 = stackIn_34_0;
                  if (256 > this.field_m) {
                    L11: {
                      if (this.field_z != null) {
                        break L11;
                      } else {
                        if (null != this.field_l) {
                          break L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L12: {
                      if ((var4_int ^ -1) != -257) {
                        break L12;
                      } else {
                        this.field_s.b(param0, param1, param2);
                        if (var11 == 0) {
                          break L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if ((var5 ^ -1) != -257) {
                        break L13;
                      } else {
                        this.field_v.b(param0, param1, param2);
                        if (var11 == 0) {
                          break L10;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      L15: {
                        L16: {
                          if (null == this.field_y) {
                            break L16;
                          } else {
                            if (var6 <= this.field_y.length) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        this.field_u = new int[var6];
                        this.field_y = new int[var6];
                        if (var11 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                      mk.a(this.field_y, 0, var6);
                      mk.a(this.field_u, 0, var6);
                      break L14;
                    }
                    L17: {
                      this.field_s.b(this.field_y, 0, param2);
                      this.field_v.b(this.field_u, 0, param2);
                      if (!la.field_g) {
                        stackOut_53_0 = param1;
                        stackIn_54_0 = stackOut_53_0;
                        break L17;
                      } else {
                        param1 = param1 << 1;
                        stackOut_52_0 = param1 << 1;
                        stackIn_54_0 = stackOut_52_0;
                        break L17;
                      }
                    }
                    var7 = stackIn_54_0;
                    var8 = 0;
                    L18: while (true) {
                      if (var6 <= var8) {
                        break L10;
                      } else {
                        param0[var7 + var8] = param0[var7 + var8] + (this.field_u[var8] * var5 + this.field_y[var8] * var4_int >> 1062620552);
                        var8++;
                        if (var11 != 0) {
                          break L9;
                        } else {
                          continue L18;
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
                if (this.field_w == null) {
                  break L9;
                } else {
                  if (this.field_m != 0) {
                    L19: {
                      L20: {
                        if (this.field_y == null) {
                          break L20;
                        } else {
                          if (this.field_y.length < var6) {
                            break L20;
                          } else {
                            mk.a(this.field_y, 0, var6);
                            if (var11 == 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      this.field_y = new int[var6];
                      this.field_u = new int[var6];
                      break L19;
                    }
                    L21: {
                      this.field_t.b(this.field_y, 0, param2);
                      if (la.field_g) {
                        param1 = param1 << 1;
                        stackOut_69_0 = param1 << 1;
                        stackIn_70_0 = stackOut_69_0;
                        break L21;
                      } else {
                        stackOut_68_0 = param1;
                        stackIn_70_0 = stackOut_68_0;
                        break L21;
                      }
                    }
                    var7 = stackIn_70_0;
                    var8 = this.field_m * this.field_n / 256;
                    var9 = this.field_n - var8;
                    var10 = 0;
                    L22: while (true) {
                      if (var6 <= var10) {
                        break L9;
                      } else {
                        param0[var10 + var7] = var8 * this.field_y[var10] + param0[var7 + var10] * var9 >> -185286200;
                        var10++;
                        if (var11 != 0) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          continue L22;
                        }
                      }
                    }
                  } else {
                    break L9;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var4 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) (var4);
            stackOut_76_1 = new StringBuilder().append("t.B(");
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param0 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L23;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L23;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param1 + ',' + param2 + ')');
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
