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
        sn dupTemp$2 = null;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        sn var5 = null;
        sn var6 = null;
        int var7 = 0;
        sn stackIn_9_0 = null;
        sn stackIn_10_0 = null;
        sn stackIn_10_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(-12253, param1);
              if (param2) {
                var4_int = 0;
                L2: while (true) {
                  if ((var4_int ^ -1) <= -7) {
                    break L1;
                  } else {
                    L3: {
                      var5 = this.field_A[var4_int];
                      if (var5 != null) {
                        L4: {
                          var6 = param1.field_A[var4_int];
                          stackIn_9_0 = (sn) (var5);

                          if (var6 == null) {
                            dupTemp$2 = new sn();
                            param1.field_A[var4_int] = dupTemp$2;
                            stackIn_10_0 = (sn) ((Object) stackIn_9_0);
                            stackIn_10_1 = (sn) (dupTemp$2);
                            break L4;
                          } else {
                            stackIn_10_0 = (sn) ((Object) stackIn_9_0);
                            stackIn_10_1 = (sn) (var6);
                            break L4;
                          }
                        }
                        ((sn) (Object) stackIn_10_0).a(stackIn_10_1, 1);
                        break L3;
                      } else {
                        param1.field_A[var4_int] = null;
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                an.a(this.field_A, 0, param1.field_A, 0, 6);
                break L1;
              }
            }
            var4_int = -82 % ((-68 - param0) / 44);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("bc.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
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
        if (param1 <= 0) {
            field_E = (mf) null;
        }
        sn dupTemp$0 = new sn();
        this.field_A[param0] = dupTemp$0;
        return dupTemp$0;
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
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (var4 >= var2_int) {
                stackIn_21_0 = new String(var8);
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param0.charAt(var4);
                    if (65 > var5) {
                      break L5;
                    } else {
                      if (var5 > 90) {
                        break L5;
                      } else {
                        var3[var4] = (char)(-65 + (var5 + 97));
                        break L4;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5 < 97) {
                        break L7;
                      } else {
                        if (var5 <= 122) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var5 < 48) {
                        break L8;
                      } else {
                        if (var5 > 57) {
                          break L8;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L4;
                  }
                  var3[var4] = (char)var5;
                  break L4;
                }
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("bc.E(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        ce stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        sn var7 = null;
        sn var9 = null;
        ce var10 = null;
        ek var11 = null;
        sn var12 = null;
        sn var13 = null;
        sn var14 = null;
        sn var15 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof ek) {
                stackIn_3_0 = (ce) (param4);
                break L1;
              } else {
                stackIn_3_0 = null;
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
                    var13 = this.field_A[3];
                    if (var11.field_o == 0) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a(this.field_C, (bc) (this), 122, param2, param1, param4);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var9 = this.field_A[2];
                  if (var9 == null) {
                    break L3;
                  } else {
                    var9.a(this.field_C, (bc) (this), 126, param2, param1, param4);
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (param4.a(true)) {
                var14 = this.field_A[5];
                if (var14 != null) {
                  var14.a(this.field_C, (bc) (this), 126, param2, param1, param4);
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!param0) {
                var15 = this.field_A[4];
                if (var15 != null) {
                  var15.a(this.field_C, (bc) (this), 124, param2, param1, param4);
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              this.field_C.a(-2, param4, param1, (bc) (this), param2);
              mk.a((byte) -5);
              if (param3 <= -60) {
                break L8;
              } else {
                var10 = (ce) null;
                this.a(true, -61, 21, (byte) -12, (ce) null);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var6);

            stackIn_34_1 = new StringBuilder().append("bc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
    }

    final void a(ck param0, int param1) {
        sn[] var3 = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
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
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_b = param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("bc.G(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void a(ck[] param0, boolean param1) {
        sn[] var3 = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
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
                  L2: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var5.field_a = param0;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
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
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("bc.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
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
        }
        field_I = null;
        field_G = null;
        field_E = null;
    }

    static {
        field_F = "No spectators";
        field_I = new int[8192];
        field_G = "Allow spectators?";
        field_K = "To play a multiplayer game, please log in or create a free account.";
    }
}
