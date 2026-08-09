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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.c(81)) {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_b.a(-20075, na.a(1048576, var4));
              if (param1 == -89) {
                if (!this.b(var3_int, 127)) {
                  stackIn_10_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                stackIn_6_0 = -87;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("sh.V(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_9_0 = var4_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("sh.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
                sh.d((String) (this.field_j[7]), (byte) -115);
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = this.b((byte) -113, var3_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("sh.N(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        boolean discarded$0 = false;
        Object stackIn_4_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int[] var7 = null;
        byte[] var8 = null;
        try {
          L0: {
            L1: {
              if (param1 == 101) {
                break L1;
              } else {
                var7 = (int[]) null;
                discarded$0 = this.a(69, ((int[]) (this.field_j[2]))[7], (int[]) null, 35);
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
                stackIn_30_0 = var5;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_33_0 = var5;

            stackIn_33_1 = new StringBuilder().append("sh.W(");

            if (param0 == null) {
              stackIn_34_0 = stackIn_33_0;
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_34_0 = stackIn_33_0;
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.c(param1 ^ 10842)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_b.a(-20075, na.a(param1 ^ 1059338, var4));
              if (param1 == 10762) {
                stackIn_8_0 = this.c(5, var3_int);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("sh.B(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
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
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int stackIn_8_0 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (!this.c(121)) {
          return false;
        } else {
          var2 = 1;
          var3 = 39 % ((-47 - param0) / 62);
          var4 = 0;
          L0: while (true) {
            if (var4 < this.field_g.field_f.length) {
              stackIn_8_0 = this.field_g.field_f[var4];

              if (var6 == 0) {
                L1: {
                  var5 = stackIn_8_0;
                  if (this.field_j[var5] == null) {
                    this.a(var5, true);
                    if (null == this.field_j[var5]) {
                      var2 = 0;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                var4++;
                if (var6 == 0) {
                  continue L0;
                } else {
                  return var2 != 0;
                }
              } else {
                return stackIn_8_0 != 0;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_9_0 = this.a(var4_int, -27493, var5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_7_0 = null;
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
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("sh.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
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
        int var2;
        int var3;
        int var4;
        int var5;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
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
                break L2;
              } else {
                stackIn_9_0 = -1;

                stackIn_9_1 = this.field_g.field_m[var4] ^ -1;

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
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                } else {
                  var4 = stackIn_9_0 / stackIn_9_1;
                  return var4;
                }
              }
            }
            if (var2 == 0) {
              return 100;
            } else {
              var4 = 100 * var3 / var2;
              return var4;
            }
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.c(-118)) {
              stackIn_3_0 = 0;
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
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = (CharSequence) ((Object) param0);
                var5 = this.field_g.field_c[var4_int].a(-20075, na.a(1048576, var7));
                stackIn_11_0 = this.a(var4_int, (byte) 78, var5);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("sh.J(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
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
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -113) {
                break L1;
              } else {
                this.c(71, ((int[]) (this.field_j[23]))[0]);
                break L1;
              }
            }
            if (!this.c(85)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_g.field_b.a(-20075, na.a(1048576, var4));
              if ((var3_int ^ -1) <= -1) {
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("sh.S(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
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
        Object[] array$0 = null;
        byte[] array$1 = null;
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
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        byte[] var10 = null;
        int var11 = 0;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        int[] var15_ref_int__ = null;
        int var15 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var23 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!this.b(param0, 126)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (null != this.field_j[param0]) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var5_int = this.field_g.field_m[param0];
                        var35 = this.field_g.field_n[param0];
                        var25 = var35;
                        var6 = var25;
                        if (this.field_b[param0] != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        array$0 = new Object[this.field_g.field_a[param0]];
                        this.field_b[param0] = array$0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7 = this.field_b[param0];
                        var8 = -4 % ((param1 - 17) / 39);
                        var9 = 1;
                        var10_int = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var5_int <= var10_int) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var23 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 == null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var11 = var35[var10_int];
                        if (var23 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var11 = var10_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7[var11] != null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = 0;
                        if (var23 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var10_int++;
                        if (var23 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var9 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0 != 0;
                }
                case 24: {
                    try {
                        if (param2 == null) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (0 != param2[0]) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param2[1] != 0) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param2[2] != 0) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param2[3] != 0) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10 = nl.a(this.field_j[param0], (byte) -74, false);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var36 = nl.a(this.field_j[param0], (byte) -74, true);
                        var26 = var36;
                        var10 = var26;
                        var27 = new wf(var36);
                        var27.a(4, var27.field_j.length, 5, param2);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var37 = qk.a(65, var10);
                        var28 = var37;
                        var24 = var28;
                        var44 = var24;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var12_ref_RuntimeException = (RuntimeException) ((Object) caughtException);
                        stackIn_36_0 = (RuntimeException) (var12_ref_RuntimeException);
                        stackIn_35_0 = stackIn_36_0;
                        stackIn_36_1 = new StringBuilder();
                        stackIn_35_1 = stackIn_36_1;
                        if (param2 == null) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_37_0 = (RuntimeException) ((Object) stackIn_35_0);
                        stackIn_37_1 = (StringBuilder) ((Object) stackIn_35_1);
                        stackIn_37_2 = 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                        stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                        stackIn_37_2 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw ld.a((Throwable) ((Object) stackIn_37_0), (stackIn_37_2 != 0) + " " + param0 + " " + param2.length + " " + oe.a(88, var10, param2.length) + " " + oe.a(-91, var10, -2 + param2.length) + " " + this.field_g.field_r[param0] + " " + this.field_g.field_i);
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (this.field_i) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_j[param0] = null;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (1 < var5_int) {
                            statePc = 50;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var6 != null) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var12 = 0;
                        if (var23 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var12 = var35[0];
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (this.field_c != 0) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var7[var12] = ri.a(136, var37, false);
                        if (var23 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7[var12] = var37;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var23 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (this.field_c == 2) {
                            statePc = 91;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
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
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var13 <= var16) {
                            statePc = 61;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var17 = 0;
                        stackIn_62_0 = 0;
                        stackIn_54_0 = stackIn_62_0;
                        if (var23 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var18 = stackIn_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var18 >= var5_int) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var17 = var17 + var30.d((byte) 19);
                        var15_ref_int__[var18] = var15_ref_int__[var18] + var17;
                        var18++;
                        if (var23 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var23 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var16++;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var23 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_62_0 = var5_int;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var40 = new byte[stackIn_62_0][];
                        var32 = var40;
                        var16_ref_byte____ = var32;
                        var17 = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var5_int <= var17) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        array$1 = new byte[var39[var17]];
                        var16_ref_byte____[var17] = array$1;
                        var39[var17] = 0;
                        var17++;
                        if (var23 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var23 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var30.field_h = var12;
                        var17 = 0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var18 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var18 >= var13) {
                            statePc = 78;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var19 = 0;
                        stackIn_79_0 = 0;
                        stackIn_71_0 = stackIn_79_0;
                        if (var23 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var20 = stackIn_71_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var5_int <= var20) {
                            statePc = 76;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var19 = var19 + var30.d((byte) 19);
                        o.a(var37, var17, var40[var20], var39[var20], var19);
                        var17 = var17 + var19;
                        var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                        var20++;
                        if (var23 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var23 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var18++;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var23 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackIn_79_0 = 0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var18 = stackIn_79_0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var18 >= var5_int) {
                            statePc = 90;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (var23 != 0) {
                            statePc = 126;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var6 != null) {
                            statePc = 84;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var19 = var18;
                        if (var23 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var19 = var35[var18];
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (this.field_c == 0) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var7[var19] = var40[var18];
                        if (var23 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var7[var19] = ri.a(136, var40[var18], false);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var18++;
                        if (var23 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var23 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var12 = var37.length;
                        var12--;
                        var13 = var24[var12] & 255;
                        var12 = var12 - var5_int * var13 * 4;
                        var33 = new wf(var44);
                        var15 = 0;
                        var16 = 0;
                        var33.field_h = var12;
                        var17 = 0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var13 <= var17) {
                            statePc = 106;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var18 = 0;
                        stackIn_107_0 = 0;
                        stackIn_94_0 = stackIn_107_0;
                        if (var23 != 0) {
                            statePc = 107;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var19 = stackIn_94_0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var5_int <= var19) {
                            statePc = 104;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var18 = var18 + var33.d((byte) 19);
                        if (var23 != 0) {
                            statePc = 105;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var6 == null) {
                            statePc = 99;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var20 = var35[var19];
                        if (var23 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var20 = var19;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (var20 == param3) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var16 = var20;
                        var15 = var15 + var18;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var19++;
                        if (var23 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var17++;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (var23 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackIn_107_0 = var15;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (stackIn_107_0 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackIn_110_0 = 1;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 110: {
                    return stackIn_110_0 != 0;
                }
                case 111: {
                    try {
                        var45 = new byte[var15];
                        var15 = 0;
                        var33.field_h = var12;
                        var18 = 0;
                        var19 = 0;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var19 >= var13) {
                            statePc = 125;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var20 = 0;
                        stackIn_127_0 = 0;
                        stackIn_114_0 = stackIn_127_0;
                        if (var23 != 0) {
                            statePc = 127;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var21 = stackIn_114_0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (var21 >= var5_int) {
                            statePc = 123;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var20 = var20 + var33.d((byte) 19);
                        if (var23 != 0) {
                            statePc = 124;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var6 != null) {
                            statePc = 119;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var22 = var21;
                        if (var23 == 0) {
                            statePc = 120;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var22 = var35[var21];
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (param3 != var22) {
                            statePc = 122;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        o.a(var44, var18, var45, var15, var20);
                        var15 = var15 + var20;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var18 = var18 + var20;
                        var21++;
                        if (var23 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var19++;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (var23 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var7[var16] = var45;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackIn_127_0 = 1;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 127: {
                    return stackIn_127_0 != 0;
                }
                case 128: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_130_0 = (RuntimeException) (var5);
                    stackIn_129_0 = stackIn_130_0;
                    stackIn_130_1 = new StringBuilder().append("sh.A(").append(param0).append(',').append(param1).append(',');
                    stackIn_129_1 = stackIn_130_1;
                    if (param2 == null) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackIn_131_0 = (RuntimeException) ((Object) stackIn_129_0);
                    stackIn_131_1 = (StringBuilder) ((Object) stackIn_129_1);
                    stackIn_131_2 = "{...}";
                    statePc = 131;
                    continue stateLoop;
                }
                case 130: {
                    stackIn_131_0 = (RuntimeException) ((Object) stackIn_130_0);
                    stackIn_131_1 = (StringBuilder) ((Object) stackIn_130_1);
                    stackIn_131_2 = "null";
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    throw ld.a((Throwable) ((Object) stackIn_131_0), stackIn_131_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    sh(hf param0, boolean param1, int param2) {
        this.field_g = null;
        try {
            if (-1 < (param2 ^ -1) || (param2 ^ -1) < -3) {
                throw new IllegalArgumentException("");
            }
            this.field_i = param1 ? true : false;
            this.field_c = param2;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0;
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
                            stackIn_9_0 = 1;
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
                stackIn_12_0 = 0;
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
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("sh.O(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
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
        int var3;
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
