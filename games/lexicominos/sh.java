/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static nj[] field_d;
    private e field_g;
    private hf field_h;
    static int field_a;
    private boolean field_i;
    static int field_e;
    static int field_f;
    private int field_c;
    private Object[][] field_b;
    private Object[] field_j;

    final int c(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!this.c(81)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_b.a(-20075, na.a(1048576, var4));
              if (param1 == -89) {
                if (!this.b(var3_int, 127)) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                stackOut_5_0 = -87;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("sh.V(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -27493) {
            field_e = -77;
        }
        return this.a((int[]) null, (byte) 101, param0, param2);
    }

    final synchronized boolean c(int param0) {
        if (!(null != this.field_g)) {
            this.field_g = this.field_h.a(false);
            if (!(this.field_g != null)) {
                return false;
            }
            this.field_j = new Object[this.field_g.field_d];
            this.field_b = new Object[this.field_g.field_d][];
        }
        int var2 = -54 % ((21 - param0) / 52);
        return true;
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.b(param2, 127)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == -27964) {
                  break L1;
                } else {
                  this.field_c = 26;
                  break L1;
                }
              }
              var5 = (CharSequence) ((Object) param0);
              var4_int = this.field_g.field_c[param2].a(-20075, na.a(param1 ^ -1076540, var5));
              if (this.a(true, param2, var4_int)) {
                stackOut_8_0 = var4_int;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("sh.D(");
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
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        boolean discarded$2 = false;
        if (!this.a(true, param0, param2)) {
          return false;
        } else {
          L0: {
            if (null == this.field_b[param0]) {
              break L0;
            } else {
              if (null == this.field_b[param0][param2]) {
                break L0;
              } else {
                return true;
              }
            }
          }
          if (null != this.field_j[param0]) {
            return true;
          } else {
            this.a(param0, true);
            if (null == this.field_j[param0]) {
              if (param1 != 78) {
                discarded$2 = sh.d((String) (this.field_j[7]), (byte) -115);
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final int b(int param0) {
        if (!(this.c(-54))) {
            return -1;
        }
        int var2 = 30 % ((-72 - param0) / 54);
        return this.field_g.field_a.length;
    }

    final int b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 109) {
                break L1;
              } else {
                this.field_i = false;
                break L1;
              }
            }
            if (this.c(-41)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_b.a(-20075, na.a(1048576, var4));
              stackOut_5_0 = this.b((byte) -113, var3_int);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("sh.N(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 1) {
            field_d = (nj[]) null;
        }
    }

    private final synchronized byte[] a(int[] param0, byte param1, int param2, int param3) {
        boolean discarded$1 = false;
        Object var5 = null;
        int[] var7 = null;
        byte[] var8 = null;
        Object stackIn_4_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_29_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 101) {
                break L1;
              } else {
                var7 = (int[]) null;
                discarded$1 = this.a(69, ((int[]) (this.field_j[2]))[7], (int[]) null, 35);
                break L1;
              }
            }
            if (this.a(true, param2, param3)) {
              L2: {
                L3: {
                  var5 = null;
                  if (null == this.field_b[param2]) {
                    break L3;
                  } else {
                    if (null != this.field_b[param2][param3]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.a(param2, 80, param0, param3)) {
                  this.a(param2, true);
                  if (this.a(param2, 124, param0, param3)) {
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (null == this.field_b[param2]) {
                throw new RuntimeException("");
              } else {
                L4: {
                  if (this.field_b[param2][param3] != null) {
                    var8 = nl.a(this.field_b[param2][param3], (byte) -74, false);
                    var5 = var8;
                    if (var8 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var5 != null) {
                    L6: {
                      if (1 != this.field_c) {
                        break L6;
                      } else {
                        this.field_b[param2][param3] = null;
                        if (-2 != (this.field_g.field_a[param2] ^ -1)) {
                          break L5;
                        } else {
                          this.field_b[param2] = null;
                          if (!Lexicominos.field_L) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (-3 != (this.field_c ^ -1)) {
                      break L5;
                    } else {
                      this.field_b[param2] = null;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                stackOut_29_0 = var5;
                stackIn_30_0 = stackOut_29_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = var5;
            stackOut_31_1 = new StringBuilder().append("sh.W(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_32_0 = stackIn_32_0;
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_4_0);
        } else {
          return (byte[]) ((Object) stackIn_30_0);
        }
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.b(param1, 126)) {
          return false;
        } else {
          if (null != this.field_j[param1]) {
            return true;
          } else {
            this.a(param1, true);
            if (null != this.field_j[param1]) {
              return true;
            } else {
              if (param0 != 5) {
                return ((boolean[]) (this.field_j[4]))[1];
              } else {
                return false;
              }
            }
          }
        }
    }

    private final synchronized void a(int param0, boolean param1) {
        L0: {
          L1: {
            if (!this.field_i) {
              break L1;
            } else {
              this.field_j[param0] = this.field_h.a(param0, param1);
              if (!Lexicominos.field_L) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_j[param0] = ri.a(136, this.field_h.a(param0, param1), false);
          break L0;
        }
        L2: {
          if (param1) {
            break L2;
          } else {
            field_f = ((int[]) (((Object[]) (this.field_j[13]))[1]))[8];
            break L2;
          }
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (!this.c(param1 ^ 10842)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_b.a(-20075, na.a(param1 ^ 1059338, var4));
              if (param1 == 10762) {
                stackOut_7_0 = this.c(5, var3_int);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("sh.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final synchronized int b(byte param0, int param1) {
        if (this.b(param1, 126)) {
          if (param0 <= -79) {
            if (null != this.field_j[param1]) {
              return 100;
            } else {
              return this.field_h.a(param1, 1215);
            }
          } else {
            return ((int[]) (this.field_j[0]))[9];
          }
        } else {
          return 0;
        }
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (!this.c(121)) {
          return false;
        } else {
          var2 = 1;
          var3 = 39 % ((-47 - param0) / 62);
          var4 = 0;
          L0: while (true) {
            if (var4 < this.field_g.field_f.length) {
              stackOut_6_0 = this.field_g.field_f[var4];
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (var6 == 0) {
                var5 = stackIn_8_0;
                if (this.field_j[var5] == null) {
                  L1: {
                    this.a(var5, true);
                    if (null == this.field_j[var5]) {
                      var2 = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return stackIn_7_0 != 0;
              }
            } else {
              return var2 != 0;
            }
          }
        }
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (this.c(param0 + -250)) {
              L1: {
                param2 = param2.toLowerCase();
                if (param0 == 127) {
                  break L1;
                } else {
                  ((long[]) (this.field_j[9]))[2] = ((long[]) (this.field_j[0]))[1];
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var6 = (CharSequence) ((Object) param2);
              var4_int = this.field_g.field_b.a(-20075, na.a(param0 ^ 1048703, var6));
              if (this.b(var4_int, 127)) {
                var7 = (CharSequence) ((Object) param1);
                var5 = this.field_g.field_c[var4_int].a(-20075, na.a(param0 + 1048449, var7));
                stackOut_8_0 = this.a(var4_int, -27493, var5);
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("sh.R(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!this.c(125)) {
            return null;
        }
        if (-2 == (this.field_g.field_a.length ^ -1)) {
            return this.a(0, -27493, param0);
        }
        if (!this.b(param0, 127)) {
            return null;
        }
        if (!((this.field_g.field_a[param0] ^ -1) != -2)) {
            return this.a(param0, -27493, 0);
        }
        int var3 = 81 / ((param1 - -44) / 43);
        throw new RuntimeException();
    }

    final synchronized int a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (!this.c(-98)) {
          return 0;
        } else {
          L0: {
            var2 = 0;
            if (!param0) {
              break L0;
            } else {
              this.field_j[1] = (Object) null;
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            L2: {
              if (this.field_j.length <= var4) {
                if (var2 == 0) {
                  return 100;
                } else {
                  var4 = 100 * var3 / var2;
                  break L2;
                }
              } else {
                stackOut_7_0 = -1;
                stackOut_7_1 = this.field_g.field_m[var4] ^ -1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (var5 == 0) {
                  L3: {
                    if (stackIn_9_0 > stackIn_9_1) {
                      var3 = var3 + this.b((byte) -98, var4);
                      var2 += 100;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4++;
                  continue L1;
                } else {
                  var4 = stackIn_8_0 / stackIn_8_1;
                  break L2;
                }
              }
            }
            return var4;
          }
        }
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!this.c(-118)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param2 == -1) {
                  break L1;
                } else {
                  field_a = ((int[]) (((Object[]) (this.field_j[2]))[2]))[0];
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var6 = (CharSequence) ((Object) param1);
              var4_int = this.field_g.field_b.a(-20075, na.a(param2 ^ -1048577, var6));
              if (!this.b(var4_int, 126)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_g.field_c[var4_int].a(-20075, na.a(1048576, var7));
                stackOut_10_0 = this.a(var4_int, (byte) 78, var5);
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("sh.J(");
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
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final boolean a(String param0, byte param1) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -113) {
                break L1;
              } else {
                discarded$2 = this.c(71, ((int[]) (this.field_j[23]))[0]);
                break L1;
              }
            }
            if (!this.c(85)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_b.a(-20075, na.a(1048576, var4));
              if ((var3_int ^ -1) <= -1) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("sh.S(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    private final synchronized boolean b(int param0, int param1) {
        if (!this.c(101)) {
          return false;
        } else {
          L0: {
            if (-1 < (param0 ^ -1)) {
              break L0;
            } else {
              if (this.field_g.field_a.length <= param0) {
                break L0;
              } else {
                if (this.field_g.field_a[param0] == 0) {
                  break L0;
                } else {
                  if (param1 < 125) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
          if (oc.field_b) {
            throw new IllegalArgumentException(Integer.toString(param0));
          } else {
            return false;
          }
        }
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!this.c(-94)) {
          return false;
        } else {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (0 > param2) {
                break L0;
              } else {
                if (this.field_g.field_a.length <= param1) {
                  break L0;
                } else {
                  if (this.field_g.field_a[param1] <= param2) {
                    break L0;
                  } else {
                    if (!param0) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
          }
          if (!oc.field_b) {
            return false;
          } else {
            throw new IllegalArgumentException(param1 + " " + param2);
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        Object[] array$2 = null;
        byte[] array$3 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var10_int = 0;
        byte[] var10_array = null;
        int var11 = 0;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        wf var27 = null;
        byte[] var28 = null;
        wf var30 = null;
        int[] var31 = null;
        byte[][] var32 = null;
        wf var33 = null;
        int[] var35 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_54_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_127_0 = 0;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_131_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_61_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        var23 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.b(param0, 126)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null != this.field_j[param0]) {
                L1: {
                  var5_int = this.field_g.field_m[param0];
                  var35 = this.field_g.field_n[param0];
                  var25 = var35;
                  var6 = var25;
                  if (this.field_b[param0] != null) {
                    break L1;
                  } else {
                    array$2 = new Object[this.field_g.field_a[param0]];
                    this.field_b[param0] = array$2;
                    break L1;
                  }
                }
                var7 = this.field_b[param0];
                var8 = -4 % ((param1 - 17) / 39);
                var9 = 1;
                var10_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var5_int <= var10_int) {
                        break L4;
                      } else {
                        if (var23 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (var6 == null) {
                                break L6;
                              } else {
                                var11 = var35[var10_int];
                                if (var23 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var11 = var10_int;
                            break L5;
                          }
                          L7: {
                            if (var7[var11] != null) {
                              break L7;
                            } else {
                              var9 = 0;
                              if (var23 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var10_int++;
                          continue L2;
                        }
                      }
                    }
                    if (var9 != 0) {
                      break L3;
                    } else {
                      L8: {
                        L9: {
                          if (param2 == null) {
                            break L9;
                          } else {
                            L10: {
                              if (0 != param2[0]) {
                                break L10;
                              } else {
                                if (param2[1] != 0) {
                                  break L10;
                                } else {
                                  if (param2[2] != 0) {
                                    break L10;
                                  } else {
                                    if (param2[3] != 0) {
                                      break L10;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                            var36 = nl.a(this.field_j[param0], (byte) -74, true);
                            var26 = var36;
                            var10_array = var26;
                            var27 = new wf(var36);
                            var27.a(4, var27.field_j.length, 5, param2);
                            break L8;
                          }
                        }
                        var10_array = nl.a(this.field_j[param0], (byte) -74, false);
                        break L8;
                      }
                      try {
                        L11: {
                          var37 = qk.a(65, var10_array);
                          var28 = var37;
                          var24 = var28;
                          var44 = var24;
                          break L11;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L12: {
                          var12_ref_RuntimeException = decompiledCaughtException;
                          stackOut_34_0 = (RuntimeException) (var12_ref_RuntimeException);
                          stackOut_34_1 = new StringBuilder();
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          if (param2 == null) {
                            stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                            stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
                            stackOut_36_2 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            stackIn_37_1 = stackOut_36_1;
                            stackIn_37_2 = stackOut_36_2;
                            break L12;
                          } else {
                            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
                            stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                            stackOut_35_2 = 1;
                            stackIn_37_0 = stackOut_35_0;
                            stackIn_37_1 = stackOut_35_1;
                            stackIn_37_2 = stackOut_35_2;
                            break L12;
                          }
                        }
                        throw ld.a((Throwable) ((Object) stackIn_37_0), (stackIn_37_2 != 0) + " " + param0 + " " + param2.length + " " + oe.a(88, var10_array, param2.length) + " " + oe.a(-91, var10_array, -2 + param2.length) + " " + this.field_g.field_r[param0] + " " + this.field_g.field_i);
                      }
                      L13: {
                        if (this.field_i) {
                          this.field_j[param0] = null;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        L15: {
                          L16: {
                            if (1 < var5_int) {
                              break L16;
                            } else {
                              L17: {
                                L18: {
                                  if (var6 != null) {
                                    break L18;
                                  } else {
                                    var12 = 0;
                                    if (var23 == 0) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                var12 = var35[0];
                                break L17;
                              }
                              L19: {
                                L20: {
                                  if (this.field_c != 0) {
                                    break L20;
                                  } else {
                                    var7[var12] = ri.a(136, var37, false);
                                    if (var23 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                var7[var12] = var37;
                                break L19;
                              }
                              if (var23 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L21: {
                            if (this.field_c == 2) {
                              break L21;
                            } else {
                              var12 = var37.length;
                              var12--;
                              var13 = 255 & var24[var12];
                              var12 = var12 - 4 * (var13 * var5_int);
                              var30 = new wf(var44);
                              var30.field_h = var12;
                              var39 = new int[var5_int];
                              var31 = var39;
                              var15_ref_int__ = var31;
                              var16 = 0;
                              L22: while (true) {
                                L23: {
                                  if (var13 <= var16) {
                                    stackOut_61_0 = var5_int;
                                    stackIn_62_0 = stackOut_61_0;
                                    break L23;
                                  } else {
                                    var17 = 0;
                                    stackOut_53_0 = 0;
                                    stackIn_62_0 = stackOut_53_0;
                                    stackIn_54_0 = stackOut_53_0;
                                    if (var23 != 0) {
                                      break L23;
                                    } else {
                                      var18 = stackIn_54_0;
                                      L24: while (true) {
                                        L25: {
                                          if (var18 >= var5_int) {
                                            var16++;
                                            break L25;
                                          } else {
                                            var17 = var17 + var30.d((byte) 19);
                                            var15_ref_int__[var18] = var15_ref_int__[var18] + var17;
                                            var18++;
                                            if (var23 != 0) {
                                              break L25;
                                            } else {
                                              continue L24;
                                            }
                                          }
                                        }
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                                var40 = new byte[stackIn_62_0][];
                                var32 = var40;
                                var16_ref_byte____ = var32;
                                var17 = 0;
                                L26: while (true) {
                                  L27: {
                                    if (var5_int <= var17) {
                                      var30.field_h = var12;
                                      var17 = 0;
                                      break L27;
                                    } else {
                                      array$3 = new byte[var39[var17]];
                                      var16_ref_byte____[var17] = array$3;
                                      var39[var17] = 0;
                                      var17++;
                                      if (var23 != 0) {
                                        break L27;
                                      } else {
                                        continue L26;
                                      }
                                    }
                                  }
                                  var18 = 0;
                                  L28: while (true) {
                                    L29: {
                                      if (var18 >= var13) {
                                        stackOut_78_0 = 0;
                                        stackIn_79_0 = stackOut_78_0;
                                        break L29;
                                      } else {
                                        var19 = 0;
                                        stackOut_70_0 = 0;
                                        stackIn_79_0 = stackOut_70_0;
                                        stackIn_71_0 = stackOut_70_0;
                                        if (var23 != 0) {
                                          break L29;
                                        } else {
                                          var20 = stackIn_71_0;
                                          L30: while (true) {
                                            L31: {
                                              if (var5_int <= var20) {
                                                var18++;
                                                break L31;
                                              } else {
                                                var19 = var19 + var30.d((byte) 19);
                                                o.a(var37, var17, var40[var20], var39[var20], var19);
                                                var17 = var17 + var19;
                                                var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                                var20++;
                                                if (var23 != 0) {
                                                  break L31;
                                                } else {
                                                  continue L30;
                                                }
                                              }
                                            }
                                            continue L28;
                                          }
                                        }
                                      }
                                    }
                                    var18 = stackIn_79_0;
                                    L32: while (true) {
                                      if (var18 >= var5_int) {
                                        if (var23 == 0) {
                                          break L15;
                                        } else {
                                          break L21;
                                        }
                                      } else {
                                        if (var23 != 0) {
                                          break L15;
                                        } else {
                                          L33: {
                                            L34: {
                                              if (var6 != null) {
                                                break L34;
                                              } else {
                                                var19 = var18;
                                                if (var23 == 0) {
                                                  break L33;
                                                } else {
                                                  break L34;
                                                }
                                              }
                                            }
                                            var19 = var35[var18];
                                            break L33;
                                          }
                                          L35: {
                                            L36: {
                                              if (this.field_c == 0) {
                                                break L36;
                                              } else {
                                                var7[var19] = var40[var18];
                                                if (var23 == 0) {
                                                  break L35;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                            var7[var19] = ri.a(136, var40[var18], false);
                                            break L35;
                                          }
                                          var18++;
                                          continue L32;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = var37.length;
                          var12--;
                          var13 = var24[var12] & 255;
                          var12 = var12 - var5_int * var13 * 4;
                          var33 = new wf(var44);
                          var15 = 0;
                          var16 = 0;
                          var33.field_h = var12;
                          var17 = 0;
                          L37: while (true) {
                            L38: {
                              if (var13 <= var17) {
                                stackOut_106_0 = var15;
                                stackIn_107_0 = stackOut_106_0;
                                break L38;
                              } else {
                                var18 = 0;
                                stackOut_93_0 = 0;
                                stackIn_107_0 = stackOut_93_0;
                                stackIn_94_0 = stackOut_93_0;
                                if (var23 != 0) {
                                  break L38;
                                } else {
                                  var19 = stackIn_94_0;
                                  L39: while (true) {
                                    L40: {
                                      if (var5_int <= var19) {
                                        var17++;
                                        break L40;
                                      } else {
                                        var18 = var18 + var33.d((byte) 19);
                                        if (var23 != 0) {
                                          break L40;
                                        } else {
                                          L41: {
                                            L42: {
                                              if (var6 == null) {
                                                break L42;
                                              } else {
                                                var20 = var35[var19];
                                                if (var23 == 0) {
                                                  break L41;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                            }
                                            var20 = var19;
                                            break L41;
                                          }
                                          L43: {
                                            if (var20 == param3) {
                                              var16 = var20;
                                              var15 = var15 + var18;
                                              break L43;
                                            } else {
                                              break L43;
                                            }
                                          }
                                          var19++;
                                          continue L39;
                                        }
                                      }
                                    }
                                    continue L37;
                                  }
                                }
                              }
                            }
                            if (stackIn_107_0 == 0) {
                              stackOut_109_0 = 1;
                              stackIn_110_0 = stackOut_109_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var45 = new byte[var15];
                              var15 = 0;
                              var33.field_h = var12;
                              var18 = 0;
                              var19 = 0;
                              L44: while (true) {
                                if (var19 >= var13) {
                                  var7[var16] = var45;
                                  break L15;
                                } else {
                                  var20 = 0;
                                  stackOut_113_0 = 0;
                                  stackIn_127_0 = stackOut_113_0;
                                  stackIn_114_0 = stackOut_113_0;
                                  if (var23 != 0) {
                                    break L14;
                                  } else {
                                    var21 = stackIn_114_0;
                                    L45: while (true) {
                                      L46: {
                                        if (var21 >= var5_int) {
                                          var19++;
                                          break L46;
                                        } else {
                                          var20 = var20 + var33.d((byte) 19);
                                          if (var23 != 0) {
                                            break L46;
                                          } else {
                                            L47: {
                                              L48: {
                                                if (var6 != null) {
                                                  break L48;
                                                } else {
                                                  var22 = var21;
                                                  if (var23 == 0) {
                                                    break L47;
                                                  } else {
                                                    break L48;
                                                  }
                                                }
                                              }
                                              var22 = var35[var21];
                                              break L47;
                                            }
                                            L49: {
                                              if (param3 != var22) {
                                                break L49;
                                              } else {
                                                o.a(var44, var18, var45, var15, var20);
                                                var15 = var15 + var20;
                                                break L49;
                                              }
                                            }
                                            var18 = var18 + var20;
                                            var21++;
                                            continue L45;
                                          }
                                        }
                                      }
                                      continue L44;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_126_0 = 1;
                        stackIn_127_0 = stackOut_126_0;
                        break L14;
                      }
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                  stackOut_22_0 = 1;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L50: {
            var5 = decompiledCaughtException;
            stackOut_128_0 = (RuntimeException) (var5);
            stackOut_128_1 = new StringBuilder().append("sh.A(").append(param0).append(',').append(param1).append(',');
            stackIn_130_0 = stackOut_128_0;
            stackIn_130_1 = stackOut_128_1;
            stackIn_129_0 = stackOut_128_0;
            stackIn_129_1 = stackOut_128_1;
            if (param2 == null) {
              stackOut_130_0 = (RuntimeException) ((Object) stackIn_130_0);
              stackOut_130_1 = (StringBuilder) ((Object) stackIn_130_1);
              stackOut_130_2 = "null";
              stackIn_131_0 = stackOut_130_0;
              stackIn_131_1 = stackOut_130_1;
              stackIn_131_2 = stackOut_130_2;
              break L50;
            } else {
              stackOut_129_0 = (RuntimeException) ((Object) stackIn_129_0);
              stackOut_129_1 = (StringBuilder) ((Object) stackIn_129_1);
              stackOut_129_2 = "{...}";
              stackIn_131_0 = stackOut_129_0;
              stackIn_131_1 = stackOut_129_1;
              stackIn_131_2 = stackOut_129_2;
              break L50;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_131_0), stackIn_131_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_110_0 != 0;
              } else {
                return stackIn_127_0 != 0;
              }
            }
          }
        }
    }

    sh(hf param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        this.field_g = null;
        try {
          L0: {
            L1: {
              if (-1 < (param2 ^ -1)) {
                break L1;
              } else {
                if ((param2 ^ -1) >= -3) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((sh) (this)).field_i = stackIn_7_1 != 0;
                  this.field_c = param2;
                  this.field_h = param0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("sh.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean d(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param1 == 50) {
                break L1;
              } else {
                field_a = -22;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= param0.length()) {
                    break L4;
                  } else {
                    var3 = param0.charAt(var2_int);
                    stackOut_4_0 = hi.a(18670, (char) var3);
                    stackIn_12_0 = stackOut_4_0 ? 1 : 0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_5_0) {
                          break L5;
                        } else {
                          if (!ne.a((byte) 94, (char) var3)) {
                            stackOut_8_0 = 1;
                            stackIn_9_0 = stackOut_8_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("sh.O(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        var3 = 92 % ((70 - param0) / 40);
        if (!this.b(param1, 126)) {
          return 0;
        } else {
          return this.field_g.field_a[param1];
        }
    }

    static {
        field_f = 0;
        field_e = 0;
    }
}
