/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static hh field_e;
    boolean field_i;
    private int field_c;
    private dc field_m;
    static int[] field_k;
    private kg field_f;
    int field_j;
    static String field_b;
    int field_n;
    private cn field_h;
    int field_d;
    private boolean field_a;
    private int field_g;
    static String field_l;

    final void b(int param0) {
        Object var2 = null;
        de var2_ref = null;
        int var3 = 0;
        Object var4 = null;
        cc var5 = null;
        var4 = null;
        var2 = null;
        var3 = EscapeVector.field_A;
        if (param0 == 7108) {
          if (!aj.b(-128)) {
            if (((gn) this).field_d == 0) {
              L0: while (true) {
                var5 = (cc) (Object) ((gn) this).field_h.c(-20245);
                if (var5 != null) {
                  oc.a(5, (byte) -107, var5);
                  continue L0;
                } else {
                  if (((gn) this).field_d == 1) {
                    L1: while (true) {
                      var2_ref = (de) (Object) ((gn) this).field_h.c(param0 + -27353);
                      if (var2_ref != null) {
                        ((gn) this).field_f.a(((gn) this).field_c, var2_ref.field_g, param0 ^ -19601);
                        continue L1;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (((gn) this).field_d == 1) {
                L2: while (true) {
                  var2_ref = (de) (Object) ((gn) this).field_h.c(param0 + -27353);
                  if (var2_ref != null) {
                    ((gn) this).field_f.a(((gn) this).field_c, var2_ref.field_g, param0 ^ -19601);
                    continue L2;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          ((gn) this).field_j = 78;
          if (!aj.b(-128)) {
            if (((gn) this).field_d != 0) {
              if (((gn) this).field_d == 1) {
                L3: while (true) {
                  var2_ref = (de) (Object) ((gn) this).field_h.c(param0 + -27353);
                  if (var2_ref != null) {
                    ((gn) this).field_f.a(((gn) this).field_c, var2_ref.field_g, param0 ^ -19601);
                    continue L3;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L4: while (true) {
                var5 = (cc) (Object) ((gn) this).field_h.c(-20245);
                if (var5 != null) {
                  oc.a(5, (byte) -107, var5);
                  continue L4;
                } else {
                  if (((gn) this).field_d == 1) {
                    L5: while (true) {
                      var2_ref = (de) (Object) ((gn) this).field_h.c(param0 + -27353);
                      if (var2_ref != null) {
                        ((gn) this).field_f.a(((gn) this).field_c, var2_ref.field_g, param0 ^ -19601);
                        continue L5;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private final void a(byte param0) {
        int var2 = -9;
    }

    public static void b(boolean param0) {
        field_e = null;
        field_l = null;
        if (param0) {
            return;
        }
        field_k = null;
        field_b = null;
    }

    private final void d(int param0) {
    }

    final static void a(dk[] param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        dk[] var6 = null;
        int var7 = 0;
        dk var8 = null;
        int var9 = 0;
        int[] var10 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 == null) {
              return;
            } else {
              L1: {
                var10 = new int[]{3170352, 8421504, 8421504};
                if (!param1) {
                  var5 = new int[]{6340704, 16777215, 16777215};
                  var4 = new int[]{6340704, 16777215, 16777215};
                  break L1;
                } else {
                  var5 = new int[]{5275728, 16777215, 10551200};
                  var4 = new int[]{5275728, 16777215, 6340704};
                  break L1;
                }
              }
              var6 = param0;
              var7 = 0;
              L2: while (true) {
                if (var6.length <= var7) {
                  break L0;
                } else {
                  L3: {
                    var8 = var6[var7];
                    if (var8 == null) {
                      var7++;
                      break L3;
                    } else {
                      var8.a(var4, var10, (byte) -123, var5);
                      break L3;
                    }
                  }
                  var7++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("gn.N(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + 41 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        int var3 = 0;
        if (param1 < 0) {
          return false;
        } else {
          var3 = je.a(false, ((gn) this).field_j);
          if (var3 > param1) {
            if (param0 != ((gn) this).field_d) {
              if (((gn) this).field_d == 1) {
                return true;
              } else {
                return false;
              }
            } else {
              return this.a(true, param1);
            }
          } else {
            return false;
          }
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        if (((gn) this).field_i) {
          if (param0 >= 0) {
            var3 = je.a(false, ((gn) this).field_j);
            if (param0 < var3) {
              if (0 == ((gn) this).field_d) {
                if (param0 >= ((gn) this).field_n) {
                  if (((gn) this).field_n != param0) {
                    var4 = -109 / ((37 - param1) / 36);
                    if (((gn) this).field_d == 1) {
                      if (!this.a(param0, (byte) 67)) {
                        if (!((gn) this).field_f.a(param0, true, ((gn) this).field_g)) {
                          return -1;
                        } else {
                          return 0;
                        }
                      } else {
                        return 0;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              } else {
                var4 = -109 / ((37 - param1) / 36);
                if (((gn) this).field_d == 1) {
                  if (!this.a(param0, (byte) 67)) {
                    if (!((gn) this).field_f.a(param0, true, ((gn) this).field_g)) {
                      return -1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param0 == 16777215) {
                break L1;
              } else {
                gn.b(true);
                break L1;
              }
            }
            stackOut_2_0 = wk.a(true, 10, param1, 97);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("gn.L(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        de var5 = null;
        cc var5_ref = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (4 != param2.length) {
                  break L1;
                } else {
                  if (param1 < 0) {
                    return;
                  } else {
                    var4_int = je.a(false, ((gn) this).field_j);
                    if (~var4_int < ~param1) {
                      L2: {
                        if (((gn) this).field_d != 0) {
                          break L2;
                        } else {
                          if (!this.a(true, param1)) {
                            return;
                          } else {
                            break L2;
                          }
                        }
                      }
                      L3: {
                        if (null != ((gn) this).field_h) {
                          break L3;
                        } else {
                          ((gn) this).field_h = new cn();
                          break L3;
                        }
                      }
                      L4: {
                        if (0 != ((gn) this).field_d) {
                          break L4;
                        } else {
                          L5: {
                            ((gn) this).field_n = 1 + param1;
                            if (~((gn) this).field_n > ~var4_int) {
                              break L5;
                            } else {
                              ((gn) this).field_n = var4_int + -1;
                              break L5;
                            }
                          }
                          var5_ref = new cc(((gn) this).field_j, param1, param2[0], param2[1], param2[2], param2[3]);
                          ((gn) this).field_h.a(-12328, (hg) (Object) var5_ref);
                          this.d(87);
                          break L4;
                        }
                      }
                      L6: {
                        if (1 == ((gn) this).field_d) {
                          var5 = new de(param1);
                          ((gn) this).field_h.a(param0 + -12313, (hg) (Object) var5);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (param0 == -15) {
                          break L7;
                        } else {
                          boolean discarded$1 = ((gn) this).a(-9, -123);
                          break L7;
                        }
                      }
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("gn.I(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
    }

    final boolean a(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (!param0) {
          if (((gn) this).field_h == null) {
            return false;
          } else {
            L0: {
              if (((gn) this).field_h.a(-100)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            }
            return stackIn_12_0 != 0;
          }
        } else {
          boolean discarded$6 = ((gn) this).a(false);
          if (((gn) this).field_h == null) {
            return false;
          } else {
            L1: {
              if (((gn) this).field_h.a(-100)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    gn(int param0, int param1, int param2, int param3, boolean param4, kg param5) {
        this(param0, param1, param5);
        try {
            ((gn) this).field_a = param4 ? true : false;
            ((gn) this).field_g = param3;
            ((gn) this).field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "gn.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        uk.b(0);
    }

    private final boolean a(boolean param0, int param1) {
        if (param1 != ((gn) this).field_n) {
          if (((gn) this).field_a) {
            if (bj.e((byte) 104)) {
              if (aj.b(-117)) {
                if (-1 == ((gn) this).field_n) {
                  if (0 != param1) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (aj.b(-117)) {
              if (-1 == ((gn) this).field_n) {
                if (0 != param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final boolean a(int param0, byte param1) {
        hg var3 = null;
        de var4 = null;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        if (((gn) this).field_d != 1) {
          return false;
        } else {
          if (((gn) this).field_h == null) {
            return false;
          } else {
            if (((gn) this).field_h.a(-110)) {
              return false;
            } else {
              var3 = ((gn) this).field_h.a(false);
              L0: while (true) {
                if (var3 != null) {
                  var4 = (de) (Object) var3;
                  if (param0 != var4.field_g) {
                    var3 = ((gn) this).field_h.b((byte) 70);
                    continue L0;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            }
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        if (param0 == 5) {
          if (!((gn) this).field_i) {
            if (!((gn) this).field_a) {
              if (((gn) this).field_d == 0) {
                L0: {
                  if (((gn) this).field_m == null) {
                    ((gn) this).field_m = wc.a(((gn) this).field_j, 5, 1, (byte) -51);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                ((gn) this).field_i = ((gn) this).field_m.field_g;
                if (((gn) this).field_i) {
                  var2 = ((gn) this).field_m.field_h[0];
                  if (((gn) this).field_a) {
                    ((gn) this).field_n = var2;
                    ((gn) this).field_m = null;
                    this.a((byte) -7);
                    return;
                  } else {
                    if (var2 > ((gn) this).field_n) {
                      ((gn) this).field_n = var2;
                      ((gn) this).field_m = null;
                      this.a((byte) -7);
                      return;
                    } else {
                      ((gn) this).field_m = null;
                      this.a((byte) -7);
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                if (1 == ((gn) this).field_d) {
                  ((gn) this).field_i = ((gn) this).field_f.e(0);
                  return;
                } else {
                  ((gn) this).field_i = false;
                  return;
                }
              }
            } else {
              if (bj.e((byte) 101)) {
                if (((gn) this).field_d == 0) {
                  L1: {
                    if (((gn) this).field_m == null) {
                      ((gn) this).field_m = wc.a(((gn) this).field_j, 5, 1, (byte) -51);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((gn) this).field_i = ((gn) this).field_m.field_g;
                  if (((gn) this).field_i) {
                    var2 = ((gn) this).field_m.field_h[0];
                    if (((gn) this).field_a) {
                      ((gn) this).field_n = var2;
                      ((gn) this).field_m = null;
                      this.a((byte) -7);
                      return;
                    } else {
                      if (var2 > ((gn) this).field_n) {
                        ((gn) this).field_n = var2;
                        ((gn) this).field_m = null;
                        this.a((byte) -7);
                        return;
                      } else {
                        ((gn) this).field_m = null;
                        this.a((byte) -7);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  if (1 == ((gn) this).field_d) {
                    ((gn) this).field_i = ((gn) this).field_f.e(0);
                    return;
                  } else {
                    ((gn) this).field_i = false;
                    return;
                  }
                }
              } else {
                ((gn) this).field_i = true;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          boolean discarded$1 = ((gn) this).a(true);
          if (!((gn) this).field_i) {
            if (((gn) this).field_a) {
              if (!bj.e((byte) 101)) {
                ((gn) this).field_i = true;
                return;
              } else {
                if (((gn) this).field_d == 0) {
                  L2: {
                    if (((gn) this).field_m == null) {
                      ((gn) this).field_m = wc.a(((gn) this).field_j, 5, 1, (byte) -51);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    ((gn) this).field_i = ((gn) this).field_m.field_g;
                    if (((gn) this).field_i) {
                      var2 = ((gn) this).field_m.field_h[0];
                      if (((gn) this).field_a) {
                        ((gn) this).field_n = var2;
                        ((gn) this).field_m = null;
                        this.a((byte) -7);
                        return;
                      } else {
                        if (var2 > ((gn) this).field_n) {
                          ((gn) this).field_n = var2;
                          ((gn) this).field_m = null;
                          this.a((byte) -7);
                          return;
                        } else {
                          ((gn) this).field_m = null;
                          this.a((byte) -7);
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  return;
                } else {
                  if (1 == ((gn) this).field_d) {
                    ((gn) this).field_i = ((gn) this).field_f.e(0);
                    return;
                  } else {
                    ((gn) this).field_i = false;
                    return;
                  }
                }
              }
            } else {
              if (((gn) this).field_d == 0) {
                L4: {
                  if (((gn) this).field_m == null) {
                    ((gn) this).field_m = wc.a(((gn) this).field_j, 5, 1, (byte) -51);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  ((gn) this).field_i = ((gn) this).field_m.field_g;
                  if (((gn) this).field_i) {
                    var2 = ((gn) this).field_m.field_h[0];
                    if (((gn) this).field_a) {
                      ((gn) this).field_n = var2;
                      ((gn) this).field_m = null;
                      this.a((byte) -7);
                      break L5;
                    } else {
                      if (var2 > ((gn) this).field_n) {
                        ((gn) this).field_n = var2;
                        ((gn) this).field_m = null;
                        this.a((byte) -7);
                        break L5;
                      } else {
                        ((gn) this).field_m = null;
                        this.a((byte) -7);
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                return;
              } else {
                if (1 == ((gn) this).field_d) {
                  ((gn) this).field_i = ((gn) this).field_f.e(0);
                  return;
                } else {
                  ((gn) this).field_i = false;
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private gn(int param0, int param1, kg param2) {
        ((gn) this).field_c = -1;
        ((gn) this).field_g = -1;
        try {
            ((gn) this).field_d = param1;
            ((gn) this).field_j = param0;
            ((gn) this).field_n = -1;
            ((gn) this).field_f = param2;
            ((gn) this).field_i = false;
            if (1 == ((gn) this).field_d) {
                ((gn) this).field_i = ((gn) this).field_f.e(0);
            }
            ((gn) this).field_h = new cn();
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "gn.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Passwords can only contain letters and numbers";
        field_l = "Rock buster";
    }
}
