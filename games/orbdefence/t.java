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
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = ak.field_y.a(param1, 1, "");
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("t.I(").append(15136).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static String a(int param0, String[] param1, String param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var3_int = param2.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param2.indexOf("<%", var5);
              if (var6_int >= 0) {
                var5 = var6_int - -2;
                L2: while (true) {
                  L3: {
                    if (var5 >= var3_int) {
                      break L3;
                    } else {
                      if (!hm.a(-20625, param2.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param2.substring(var6_int + 2, var5);
                  if (tk.a(10, (CharSequence) (Object) var7_ref_String)) {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (param2.charAt(var5) == 62) {
                        var5++;
                        var8 = th.a(116, (CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (param1[var8].length() - -var6_int - var5);
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              } else {
                L4: {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  var7 = 0;
                  if (param0 == -415993727) {
                    break L4;
                  } else {
                    field_k = null;
                    break L4;
                  }
                }
                L5: while (true) {
                  var8 = param2.indexOf("<%", var5);
                  if (0 <= var8) {
                    var5 = var8 + 2;
                    L6: while (true) {
                      L7: {
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          if (!hm.a(-20625, param2.charAt(var5))) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param2.substring(2 + var8, var5);
                      if (!tk.a(10, (CharSequence) (Object) var9)) {
                        continue L5;
                      } else {
                        if (var5 >= var3_int) {
                          continue L5;
                        } else {
                          if (param2.charAt(var5) != 62) {
                            continue L5;
                          } else {
                            var5++;
                            var10 = th.a(113, (CharSequence) (Object) var9);
                            StringBuilder discarded$3 = var6.append(param2.substring(var7, var8));
                            StringBuilder discarded$4 = var6.append(param1[var10]);
                            var7 = var5;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    StringBuilder discarded$5 = var6.append(param2.substring(var7));
                    stackOut_26_0 = var6.toString();
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("t.M(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
        return stackIn_27_0;
    }

    public static void c(boolean param0) {
        field_j = null;
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
        hj[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        hj[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param1.a(param0, 0);
            var5 = param1.a(param2, 5187, var4_int);
            stackOut_0_0 = ua.a(param1, var4_int, 91, var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("t.L(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + -69 + ')');
        }
        return stackIn_1_0;
    }

    final di d() {
        return null;
    }

    final di a() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        if (param0 != 0) {
            ((t) this).field_u = null;
        }
        ((t) this).field_n = param1;
    }

    final synchronized void c(int param0) {
        int var3 = 0;
        L0: {
          var3 = OrbDefence.field_D ? 1 : 0;
          if (((t) this).field_r <= 0) {
            break L0;
          } else {
            if (null == ((t) this).field_z) {
              break L0;
            } else {
              ((t) this).field_s.c(param0);
              break L0;
            }
          }
        }
        L1: {
          if (((t) this).field_r >= 1048576) {
            break L1;
          } else {
            if (((t) this).field_l != null) {
              ((t) this).field_v.c(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((t) this).field_m <= 0) {
            break L2;
          } else {
            if (((t) this).field_w != null) {
              ((t) this).field_t.c(param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (((t) this).field_p) {
            L4: {
              if (0 >= ((t) this).field_x) {
                break L4;
              } else {
                if (!((t) this).field_s.f(-75)) {
                  ((t) this).field_x = -((t) this).field_x;
                  ((t) this).field_p = false;
                  ((t) this).field_z = null;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            if (((t) this).field_x >= 0) {
              break L3;
            } else {
              if (!((t) this).field_v.f(-63)) {
                ((t) this).field_p = false;
                ((t) this).field_x = -((t) this).field_x;
                ((t) this).field_l = null;
                break L3;
              } else {
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L5: {
          if (((t) this).field_x != 0) {
            ((t) this).field_r = ((t) this).field_r + param0 * ((t) this).field_x;
            if (1048576 <= ((t) this).field_r) {
              ((t) this).field_r = 1048576;
              if (!((t) this).field_p) {
                ((t) this).field_x = 0;
                if (!((t) this).field_o) {
                  L6: {
                    if (null == ((t) this).field_l) {
                      break L6;
                    } else {
                      ((t) this).field_v.e(70);
                      break L6;
                    }
                  }
                  ((t) this).field_l = null;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            } else {
              if (((t) this).field_r > 0) {
                break L5;
              } else {
                ((t) this).field_r = 0;
                if (!((t) this).field_p) {
                  ((t) this).field_x = 0;
                  if (!((t) this).field_o) {
                    L7: {
                      if (null != ((t) this).field_z) {
                        ((t) this).field_s.e(98);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((t) this).field_z = null;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
          } else {
            break L5;
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
        int stackIn_33_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (((t) this).field_n <= 0) {
              ((t) this).c(param2);
              return;
            } else {
              L1: {
                if (!((t) this).field_p) {
                  break L1;
                } else {
                  L2: {
                    if (0 >= ((t) this).field_x) {
                      break L2;
                    } else {
                      if (!((t) this).field_s.f(-49)) {
                        ((t) this).field_x = -((t) this).field_x;
                        ((t) this).field_p = false;
                        ((t) this).field_z = null;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (0 <= ((t) this).field_x) {
                    break L1;
                  } else {
                    if (((t) this).field_v.f(-98)) {
                      break L1;
                    } else {
                      ((t) this).field_l = null;
                      ((t) this).field_p = false;
                      ((t) this).field_x = -((t) this).field_x;
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = ((t) this).field_n * (((t) this).field_r >> 12) / 256;
                var5 = -var4_int + ((t) this).field_n;
                if (((t) this).field_x == 0) {
                  break L3;
                } else {
                  ((t) this).field_r = ((t) this).field_r + param2 * ((t) this).field_x;
                  if (((t) this).field_r >= 1048576) {
                    ((t) this).field_r = 1048576;
                    if (((t) this).field_p) {
                      break L3;
                    } else {
                      ((t) this).field_x = 0;
                      if (!((t) this).field_o) {
                        L4: {
                          if (((t) this).field_l != null) {
                            ((t) this).field_v.e(114);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        ((t) this).field_l = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (((t) this).field_r > 0) {
                      break L3;
                    } else {
                      ((t) this).field_r = 0;
                      if (((t) this).field_p) {
                        break L3;
                      } else {
                        ((t) this).field_x = 0;
                        if (!((t) this).field_o) {
                          L5: {
                            if (((t) this).field_z != null) {
                              ((t) this).field_s.e(89);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((t) this).field_z = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              L6: {
                if (la.field_g) {
                  stackOut_32_0 = param2 << 1;
                  stackIn_33_0 = stackOut_32_0;
                  break L6;
                } else {
                  stackOut_31_0 = param2;
                  stackIn_33_0 = stackOut_31_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (256 > ((t) this).field_m) {
                  L8: {
                    if (((t) this).field_z != null) {
                      break L8;
                    } else {
                      if (null != ((t) this).field_l) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if (var5 != 256) {
                      L9: {
                        L10: {
                          if (null == ((t) this).field_y) {
                            break L10;
                          } else {
                            if (var6 <= ((t) this).field_y.length) {
                              mk.a(((t) this).field_y, 0, var6);
                              mk.a(((t) this).field_u, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((t) this).field_u = new int[var6];
                        ((t) this).field_y = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((t) this).field_s.b(((t) this).field_y, 0, param2);
                        ((t) this).field_v.b(((t) this).field_u, 0, param2);
                        if (!la.field_g) {
                          stackOut_49_0 = param1;
                          stackIn_50_0 = stackOut_49_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_48_0 = param1 << 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_50_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (((t) this).field_u[var8] * var5 + ((t) this).field_y[var8] * var4_int >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    } else {
                      ((t) this).field_v.b(param0, param1, param2);
                      break L7;
                    }
                  } else {
                    ((t) this).field_s.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                if (((t) this).field_w == null) {
                  break L13;
                } else {
                  if (((t) this).field_m != 0) {
                    L14: {
                      L15: {
                        if (((t) this).field_y == null) {
                          break L15;
                        } else {
                          if (((t) this).field_y.length < var6) {
                            break L15;
                          } else {
                            mk.a(((t) this).field_y, 0, var6);
                            break L14;
                          }
                        }
                      }
                      ((t) this).field_y = new int[var6];
                      ((t) this).field_u = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((t) this).field_t.b(((t) this).field_y, 0, param2);
                      if (la.field_g) {
                        param1 = param1 << 1;
                        stackOut_62_0 = param1 << 1;
                        stackIn_63_0 = stackOut_62_0;
                        break L16;
                      } else {
                        stackOut_61_0 = param1;
                        stackIn_63_0 = stackOut_61_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_63_0;
                    var8 = ((t) this).field_m * ((t) this).field_n / 256;
                    var9 = ((t) this).field_n - var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var10 + var7] = var8 * ((t) this).field_y[var10] + param0[var7 + var10] * var9 >> 8;
                        var10++;
                        continue L17;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var4;
            stackOut_67_1 = new StringBuilder().append("t.B(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L18;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L18;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private t() throws Throwable {
        throw new Error();
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (!param2) {
            ul.d();
        } else {
            ul.d(0, 0, ul.field_f, ul.field_l, 0, 192);
        }
        m.a(param2, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Ice";
    }
}
