/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static int field_j;
    static ff field_f;
    private va field_h;
    private ae field_l;
    private java.math.BigInteger field_e;
    static boolean field_d;
    private java.math.BigInteger field_c;
    private gb field_b;
    private ic field_m;
    static String field_g;
    static ng field_i;
    private lg[] field_k;
    static String field_a;

    public static void b(int param0) {
        field_f = null;
        field_g = null;
        if (param0 != 30731) {
          ne.b(-57);
          field_i = null;
          field_a = null;
          return;
        } else {
          field_i = null;
          field_a = null;
          return;
        }
    }

    final boolean a(byte param0) {
        byte stackIn_24_0 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        int var9;
        gb var11;
        byte[] var12;
        java.math.BigInteger var13;
        byte[] var14;
        byte[] var16;
        var9 = SolKnight.field_L ? 1 : 0;
        if (this.field_b != null) {
          return true;
        } else {
          L0: {
            if (null != this.field_m) {
              break L0;
            } else {
              if (this.field_h.b(-21)) {
                return false;
              } else {
                this.field_m = this.field_h.a(255, true, 255, 437409504, (byte) 0);
                break L0;
              }
            }
          }
          if (this.field_m.field_m) {
            return false;
          } else {
            L1: {
              L2: {
                L3: {
                  var11 = new gb(this.field_m.f(0));
                  var11.field_m = 5;
                  var3 = var11.j(255);
                  var11.field_m = var11.field_m + 72 * var3;
                  var14 = new byte[var11.field_l.length - var11.field_m];
                  var12 = var14;
                  var4 = var12;
                  var11.a(var14.length, 0, -118, var14);
                  if (null == this.field_c) {
                    break L3;
                  } else {
                    if (this.field_e != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var5 = var4;
                if (var9 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var13 = new java.math.BigInteger(var14);
              var7_ref_java_math_BigInteger = var13.modPow(this.field_c, this.field_e);
              var5 = var7_ref_java_math_BigInteger.toByteArray();
              break L1;
            }
            if ((var5.length ^ -1) != -66) {
              throw new RuntimeException();
            } else {
              var7 = -39 % ((11 - param0) / 35);
              var16 = q.a(-var14.length + (var11.field_m - 5), 5, 87, var11.field_l);
              var8 = 0;
              L4: while (true) {
                if ((var8 ^ -1) > -65) {
                  stackIn_24_0 = var16[var8];

                  if (var9 == 0) {
                    if (stackIn_24_0 == var5[var8 - -1]) {
                      var8++;
                      if (var9 == 0) {
                        continue L4;
                      } else {
                        this.field_k = new lg[var3];
                        this.field_b = var11;
                        return true;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    return stackIn_24_0 != 0;
                  }
                } else {
                  this.field_k = new lg[var3];
                  this.field_b = var11;
                  return true;
                }
              }
            }
          }
        }
    }

    final lg a(int param0, bi param1, boolean param2, bi param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        lg var9 = null;
        byte[] var13 = null;
        lg stackIn_8_0 = null;
        lg stackIn_11_0 = null;
        lg stackIn_13_0 = null;
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
        try {
          L0: {
            if (this.field_b != null) {
              L1: {
                if (param4 < 0) {
                  break L1;
                } else {
                  if (param4 >= this.field_k.length) {
                    break L1;
                  } else {
                    if (param0 == -65) {
                      if (null == this.field_k[param4]) {
                        this.field_b.field_m = param4 * 72 + 6;
                        var6_int = this.field_b.e(true);
                        var7 = this.field_b.e(true);
                        var13 = new byte[64];
                        this.field_b.a(64, 0, -127, var13);
                        var9 = new lg(param4, param1, param3, this.field_h, this.field_l, var6_int, var13, var7, param2);
                        this.field_k[param4] = var9;
                        stackIn_13_0 = (lg) (var9);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        stackIn_11_0 = this.field_k[param4];
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      stackIn_8_0 = (lg) null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("ne.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final void a(int param0) {
        lg stackIn_15_0 = null;
        lg stackIn_33_0 = null;
        lg stackIn_43_0 = null;
        lg stackIn_54_0 = null;
        int var2;
        int var3;
        String var4;
        var3 = SolKnight.field_L ? 1 : 0;
        if (null != this.field_k) {
          var2 = 0;
          if (param0 != 24561) {
            var4 = (String) null;
            ne.a((String) null, false, (String) null);
            L0: while (true) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      if (var2 >= this.field_k.length) {
                        break L4;
                      } else {
                        stackIn_43_0 = this.field_k[var2];

                        if (var3 != 0) {
                          L5: while (true) {
                            L6: {
                              if (stackIn_43_0 != null) {
                                this.field_k[var2].e(18055);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var2++;
                            if (var3 == 0) {
                              if (var2 < this.field_k.length) {
                                if (var3 == 0) {
                                  stackIn_43_0 = this.field_k[var2];
                                  continue L5;
                                } else {
                                  break L2;
                                }
                              } else {
                                break L3;
                              }
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          L7: {
                            if (stackIn_43_0 != null) {
                              this.field_k[var2].d(-1);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          var2++;
                          if (var3 == 0) {
                            continue L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2 = 0;
                    L8: while (true) {
                      if (var2 < this.field_k.length) {
                        if (var3 == 0) {
                          stackIn_33_0 = this.field_k[var2];
                          L9: {
                            if (stackIn_33_0 != null) {
                              this.field_k[var2].e(18055);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var2++;
                          if (var3 == 0) {
                            continue L8;
                          } else {
                            break L1;
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  return;
                }
                return;
              }
              return;
            }
          } else {
            L10: while (true) {
              L11: {
                L12: {
                  L13: {
                    L14: {
                      if (var2 >= this.field_k.length) {
                        break L14;
                      } else {
                        stackIn_54_0 = this.field_k[var2];

                        if (var3 != 0) {
                          L15: while (true) {
                            L16: {
                              if (stackIn_54_0 != null) {
                                this.field_k[var2].e(18055);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            var2++;
                            if (var3 == 0) {
                              if (var2 < this.field_k.length) {
                                if (var3 == 0) {
                                  stackIn_54_0 = this.field_k[var2];
                                  continue L15;
                                } else {
                                  break L12;
                                }
                              } else {
                                break L13;
                              }
                            } else {
                              break L11;
                            }
                          }
                        } else {
                          L17: {
                            if (stackIn_54_0 != null) {
                              this.field_k[var2].d(-1);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          var2++;
                          if (var3 == 0) {
                            continue L10;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    var2 = 0;
                    L18: while (true) {
                      if (var2 < this.field_k.length) {
                        if (var3 == 0) {
                          stackIn_15_0 = this.field_k[var2];
                          L19: {
                            if (stackIn_15_0 != null) {
                              this.field_k[var2].e(18055);
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          var2++;
                          if (var3 == 0) {
                            continue L18;
                          } else {
                            break L11;
                          }
                        } else {
                          break L12;
                        }
                      } else {
                        break L13;
                      }
                    }
                  }
                  return;
                }
                return;
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(String param0, boolean param1, String param2) {
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = ji.a(21762, param2);
            if (!param1) {
              L1: {
                if (-1 != param0.indexOf(param2)) {
                  break L1;
                } else {
                  if (0 != (param0.indexOf(var3) ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if (param0.startsWith(param2)) {
                          break L3;
                        } else {
                          if (param0.startsWith(var3)) {
                            break L3;
                          } else {
                            if (param0.endsWith(param2)) {
                              break L3;
                            } else {
                              if (!param0.endsWith(var3)) {
                                stackIn_15_0 = 0;
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      stackIn_15_0 = 1;
                      break L2;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("ne.D(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final static pc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String[] var4 = null;
        String[] var5 = null;
        int var6 = 0;
        String var7 = null;
        pc var8 = null;
        int var9 = 0;
        pc stackIn_3_0 = null;
        pc stackIn_7_0 = null;
        pc stackIn_10_0 = null;
        pc stackIn_17_0 = null;
        pc stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (-1 != (var2_int ^ -1)) {
              if (255 < var2_int) {
                stackIn_7_0 = el.field_o;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 63 % ((param1 - 4) / 50);
                var4 = b.a(param0, '.', true);
                if (var4.length >= 2) {
                  var5 = var4;
                  var6 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var6 >= var5.length) {
                          break L3;
                        } else {
                          var7 = var5[var6];
                          var8 = rg.a((byte) 118, var7);
                          stackIn_20_0 = (pc) (var8);

                          if (var9 != 0) {
                            break L2;
                          } else {
                            if (stackIn_20_0 != null) {
                              stackIn_17_0 = (pc) (var8);
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              var6++;
                              if (var9 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      stackIn_20_0 = fh.a(var4[var4.length - 1], (byte) 97);
                      break L2;
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = h.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = h.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("ne.F(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                return stackIn_17_0;
              }
            }
          }
        }
    }

    ne(va param0, ae param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    private ne(va param0, ae param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
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
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_h = param0;
              this.field_l = param1;
              this.field_e = param3;
              this.field_c = param2;
              if (this.field_h.b(-21)) {
                break L1;
              } else {
                this.field_m = this.field_h.a(255, true, 255, 437409504, (byte) 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ne.<init>(");

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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_j = 0;
        field_d = false;
        field_f = new ff(1, 2, 2, 0);
        field_a = "Destroyed";
        field_i = new ng();
    }
}
