/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends a {
    static mf field_E;
    static String field_F;
    private sn field_C;
    private sn[] field_A;
    static int[][] field_D;
    static String field_G;
    static int[] field_J;
    static int[] field_I;
    static int field_B;
    static String field_K;

    private final void a(byte param0, bc param1, boolean param2) {
        sn dupTemp$3 = null;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        sn var5 = null;
        sn var6 = null;
        int var7 = 0;
        sn stackIn_11_0 = null;
        sn stackIn_12_0 = null;
        sn stackIn_13_0 = null;
        sn stackIn_13_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        sn stackOut_10_0 = null;
        sn stackOut_12_0 = null;
        sn stackOut_12_1 = null;
        sn stackOut_11_0 = null;
        sn stackOut_11_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  super.a(-12253, param1);
                  if (param2) {
                    break L3;
                  } else {
                    an.a(this.field_A, 0, param1.field_A, 0, 6);
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var4_int = 0;
                L4: while (true) {
                  if ((var4_int ^ -1) <= -7) {
                    break L2;
                  } else {
                    var5 = this.field_A[var4_int];
                    if (var7 != 0) {
                      break L1;
                    } else {
                      L5: {
                        L6: {
                          if (var5 != null) {
                            break L6;
                          } else {
                            param1.field_A[var4_int] = null;
                            if (var7 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          var6 = param1.field_A[var4_int];
                          stackOut_10_0 = (sn) (var5);
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var6 == null) {
                            dupTemp$3 = new sn();
                            param1.field_A[var4_int] = dupTemp$3;
                            stackOut_12_0 = (sn) ((Object) stackIn_12_0);
                            stackOut_12_1 = (sn) (dupTemp$3);
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            break L7;
                          } else {
                            stackOut_11_0 = (sn) ((Object) stackIn_11_0);
                            stackOut_11_1 = (sn) (var6);
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            break L7;
                          }
                        }
                        ((sn) (Object) stackIn_13_0).a(stackIn_13_1, 1);
                        break L5;
                      }
                      var4_int++;
                      continue L4;
                    }
                  }
                }
              }
              var4_int = -82 % ((-68 - param0) / 44);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (runtimeException);
            stackOut_17_1 = new StringBuilder().append("bc.I(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, ck[] param1, int param2) {
        int var4_int = 0;
        try {
            if (param0 <= 97) {
                ce var5 = (ce) null;
                this.a(true, -54, 87, (byte) -121, (ce) null);
            }
            var4_int = param2;
            if (this.field_A[var4_int] == null) {
                this.field_A[var4_int] = new sn();
            }
            this.field_A[param2].field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bc.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    bc(bc param0, boolean param1) {
        this();
        try {
            param0.a((byte) -117, (bc) (this), param1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public bc() {
        this.field_A = new sn[6];
        this.field_C = new sn();
        sn dupTemp$0 = new sn();
        this.field_A[0] = dupTemp$0;
        sn var1 = dupTemp$0;
        var1.b((byte) 68);
    }

    final sn a(int param0, int param1) {
        sn dupTemp$4 = null;
        sn dupTemp$5 = null;
        if (param1 <= 0) {
          field_E = (mf) null;
          dupTemp$4 = new sn();
          this.field_A[param0] = dupTemp$4;
          return dupTemp$4;
        } else {
          dupTemp$5 = new sn();
          this.field_A[param0] = dupTemp$5;
          return dupTemp$5;
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 65) {
                break L1;
              } else {
                field_K = (String) null;
                break L1;
              }
            }
            L2: {
              var2_int = param0.length();
              if (-21 > (var2_int ^ -1)) {
                var2_int = 20;
                break L2;
              } else {
                break L2;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L3: while (true) {
              L4: {
                if (var4 >= var2_int) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      var5 = param0.charAt(var4);
                      if (65 > var5) {
                        break L6;
                      } else {
                        if (var5 > 90) {
                          break L6;
                        } else {
                          var3[var4] = (char)(-65 + (var5 + 97));
                          if (var6 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      L8: {
                        L9: {
                          if (var5 < 97) {
                            break L9;
                          } else {
                            if (var5 <= 122) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (var5 < 48) {
                          break L7;
                        } else {
                          if (var5 > 57) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var3[var4] = (char)var5;
                      if (var6 == 0) {
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                    var3[var4] = (char)95;
                    break L5;
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_22_0 = new String(var8);
              stackIn_23_0 = stackOut_22_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("bc.E(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        RuntimeException var6 = null;
        sn var7 = null;
        sn var9 = null;
        ce var10 = null;
        ek var11 = null;
        sn var12 = null;
        sn var13 = null;
        sn var14 = null;
        sn var15 = null;
        ce stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof ek) {
                stackOut_2_0 = (ce) (param4);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (ce) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var11 = (ek) ((Object) stackIn_3_0);
              gg.a(param4.field_D + param2, 20763, param4.field_t + param4.field_u + param1, param1 - -param4.field_u, param4.field_D + param2 + param4.field_y);
              if (var11 != null) {
                param0 = param0 & var11.field_I;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = this.field_A[0];
              this.field_C.b((byte) 80);
              var7.a(this.field_C, (bc) (this), 122, param2, param1, param4);
              if (var11 != null) {
                L4: {
                  if (!var11.field_H) {
                    break L4;
                  } else {
                    var12 = this.field_A[1];
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a(this.field_C, (bc) (this), 127, param2, param1, param4);
                      break L4;
                    }
                  }
                }
                if (var11.field_q) {
                  L5: {
                    L6: {
                      var13 = this.field_A[3];
                      if (var11.field_o == 0) {
                        break L6;
                      } else {
                        if (var13 != null) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      var9 = this.field_A[2];
                      if (var9 == null) {
                        break L7;
                      } else {
                        var9.a(this.field_C, (bc) (this), 126, param2, param1, param4);
                        break L7;
                      }
                    }
                    if (!client.field_A) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                  var13.a(this.field_C, (bc) (this), 122, param2, param1, param4);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L8: {
              if (param4.a(true)) {
                var14 = this.field_A[5];
                if (var14 != null) {
                  var14.a(this.field_C, (bc) (this), 126, param2, param1, param4);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L9: {
              if (!param0) {
                var15 = this.field_A[4];
                if (var15 != null) {
                  var15.a(this.field_C, (bc) (this), 124, param2, param1, param4);
                  break L9;
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            this.field_C.a(-2, param4, param1, (bc) (this), param2);
            mk.a((byte) -5);
            if (param3 <= -60) {
              break L0;
            } else {
              var10 = (ce) null;
              this.a(true, -61, 21, (byte) -12, (ce) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var6);
            stackOut_33_1 = new StringBuilder().append("bc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param4 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
    }

    final void a(ck param0, int param1) {
        sn[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = this.field_A;
              var3 = var7;
              if (param1 == 2) {
                break L1;
              } else {
                field_F = (String) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                var5 = var7[var4];
                if (var6 == 0) {
                  L3: {
                    if (var5 != null) {
                      var5.field_b = param0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4++;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("bc.G(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    final void a(ck[] param0, boolean param1) {
        sn[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            var7 = this.field_A;
            var3 = var7;
            var4 = 0;
            if (!param1) {
              L1: while (true) {
                if (var4 >= var7.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = var7[var4];
                  if (var6 == 0) {
                    L2: {
                      if (var5 == null) {
                        break L2;
                      } else {
                        var5.field_a = param0;
                        break L2;
                      }
                    }
                    var4++;
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("bc.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_F = null;
        field_J = null;
        field_D = (int[][]) null;
        field_K = null;
        if (param0 >= -101) {
          field_K = (String) null;
          field_I = null;
          field_G = null;
          field_E = null;
          return;
        } else {
          field_I = null;
          field_G = null;
          field_E = null;
          return;
        }
    }

    static {
        field_F = "No spectators";
        field_I = new int[8192];
        field_G = "Allow spectators?";
        field_K = "To play a multiplayer game, please log in or create a free account.";
    }
}
