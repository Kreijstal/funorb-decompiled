/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jma implements noa {
    private int field_l;
    private int field_i;
    static ka[] field_a;
    private boolean field_m;
    private int field_c;
    private int field_e;
    static String field_o;
    private boolean field_p;
    static cn field_j;
    private int field_f;
    private int field_n;
    private boolean field_g;
    private koa field_d;
    private int field_k;
    static String field_h;
    private int field_b;

    final void a(ew param0, byte param1, kh param2) {
        try {
            ((jma) this).field_d.a(30489, param0, param2);
            param2.a((byte) -127, ((jma) this).field_e, 8);
            param2.a((byte) -45, ((jma) this).field_k, 8);
            param2.a((byte) -125, ((jma) this).field_i, 8);
            if (param1 <= 65) {
                Object var5 = null;
                ((jma) this).a((ew) null, (byte) 97, (kh) null);
            }
            param2.a((byte) -126, ((jma) this).field_l, 8);
            param2.a((byte) -45, ((jma) this).field_f, 8);
            param2.a((byte) 77, ((jma) this).field_m ? 1 : 0, 1);
            param2.a((byte) -127, ((jma) this).field_p ? 1 : 0, 1);
            param2.a((byte) -126, ((jma) this).field_c, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jma.W(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void c() {
        ((jma) this).field_n = 3;
    }

    final void b(int param0, int param1) {
        if (param1 < 50) {
            return;
        }
        ((jma) this).field_c = param0;
    }

    private final void e(byte param0) {
        if (param0 == -102) {
          if (((jma) this).field_l <= 0) {
            int discarded$4 = 8;
            this.a();
            return;
          } else {
            ((jma) this).field_n = 4;
            ((jma) this).field_b = ((jma) this).field_l;
            return;
          }
        } else {
          ((jma) this).a(-19, 46, -116, 50, -114, 44);
          if (((jma) this).field_l <= 0) {
            int discarded$5 = 8;
            this.a();
            return;
          } else {
            ((jma) this).field_n = 4;
            ((jma) this).field_b = ((jma) this).field_l;
            return;
          }
        }
    }

    public static void e() {
        field_a = null;
        field_h = null;
        field_o = null;
        field_j = null;
    }

    final boolean b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 4) {
          if (((jma) this).field_n != 1) {
            if (((jma) this).field_n != 2) {
              if (((jma) this).field_n == 3) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_j = null;
          if (((jma) this).field_n != 1) {
            if (((jma) this).field_n == 2) {
              return true;
            } else {
              L0: {
                if (((jma) this).field_n != 3) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    jma(int param0) {
        this(param0, new lj[0]);
    }

    private final void a() {
        if (((jma) this).field_k > 0) {
            ((jma) this).field_b = ((jma) this).field_k;
            ((jma) this).field_n = 5;
            return;
        }
        this.a((byte) 63);
    }

    private final void g(int param0) {
        ((jma) this).field_n = 3;
        if (!(!((jma) this).field_m)) {
            this.d((byte) -70);
        }
        if (param0 <= 49) {
            this.f(95);
            return;
        }
    }

    private final void a(byte param0) {
        ((jma) this).field_n = 0;
        ((jma) this).field_b = ((jma) this).field_f;
        int var2 = 101 % ((param0 - -2) / 52);
        if (!(!((jma) this).field_p)) {
            this.d((byte) -70);
        }
    }

    final void a(byte param0, ew param1) {
        try {
            if (param0 != 48) {
                field_j = null;
            }
            ((jma) this).field_d.a(param1, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jma.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final koa h(int param0) {
        if (param0 != 1) {
            this.e((byte) -23);
            return ((jma) this).field_d;
        }
        return ((jma) this).field_d;
    }

    private final boolean b() {
        if (((jma) this).field_b <= 0) {
            return true;
        }
        ((jma) this).field_b = ((jma) this).field_b - 1;
        return false;
    }

    final boolean b(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 70) {
          if (((jma) this).field_n != 3) {
            if (((jma) this).field_n != 4) {
              if (5 == ((jma) this).field_n) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_h = null;
          if (((jma) this).field_n != 3) {
            if (((jma) this).field_n == 4) {
              return true;
            } else {
              L0: {
                if (5 != ((jma) this).field_n) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (((jma) this).field_g) {
          return;
        } else {
          if (param0 == -14) {
            var3 = ((jma) this).field_n;
            if (var3 == 0) {
              int discarded$7 = 1;
              if (this.b()) {
                if (!param1) {
                  return;
                } else {
                  this.f(param0 + -86);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (1 != var3) {
                if (var3 == 2) {
                  int discarded$8 = 1;
                  if (!this.b()) {
                    return;
                  } else {
                    this.g(103);
                    return;
                  }
                } else {
                  if (var3 != 3) {
                    if (4 != var3) {
                      if (5 == var3) {
                        int discarded$9 = 1;
                        if (!this.b()) {
                          return;
                        } else {
                          this.a((byte) 122);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (!param1) {
                        int discarded$10 = 1;
                        if (!this.b()) {
                          return;
                        } else {
                          int discarded$11 = 8;
                          this.a();
                          return;
                        }
                      } else {
                        int discarded$12 = -69;
                        this.c();
                        return;
                      }
                    }
                  } else {
                    if (param1) {
                      return;
                    } else {
                      this.e((byte) -102);
                      return;
                    }
                  }
                }
              } else {
                if (param1) {
                  int discarded$13 = 1;
                  if (!this.b()) {
                    return;
                  } else {
                    this.d(-121);
                    return;
                  }
                } else {
                  this.c(param0 ^ 8182);
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            ((jma) this).field_g = true;
            return ((jma) this).field_p;
        }
        return ((jma) this).field_p;
    }

    final boolean f(byte param0) {
        if (param0 != -56) {
            return true;
        }
        return false;
    }

    private final void f(int param0) {
        int var2 = 0;
        if (((jma) this).field_i <= 0) {
          this.d(-125);
          var2 = 109 % ((param0 - -20) / 61);
          return;
        } else {
          ((jma) this).field_n = 1;
          ((jma) this).field_b = ((jma) this).field_i;
          var2 = 109 % ((param0 - -20) / 61);
          return;
        }
    }

    private final void d(byte param0) {
        lj[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        lj[] var7 = null;
        lj[] var21 = null;
        lj var22 = null;
        lj[] var24 = null;
        lj var27 = null;
        lj[] var29 = null;
        lj var30 = null;
        lj[] var31 = null;
        lj var32 = null;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (((jma) this).field_c <= 0) {
            break L0;
          } else {
            ((jma) this).field_c = ((jma) this).field_c - 1;
            if (((jma) this).field_c == 0) {
              ((jma) this).field_g = true;
              break L0;
            } else {
              if (param0 != -70) {
                field_o = null;
                if (null != ((jma) this).field_d) {
                  var7 = ((jma) this).field_d.c(1);
                  var24 = var7;
                  var3 = var7;
                  var4 = 0;
                  L1: while (true) {
                    if (var24.length > var4) {
                      L2: {
                        var27 = var24[var4];
                        if (var27 != null) {
                          var27.m(119);
                          break L2;
                        } else {
                          var4++;
                          break L2;
                        }
                      }
                      var4++;
                      continue L1;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                if (null != ((jma) this).field_d) {
                  L3: {
                    var7 = ((jma) this).field_d.c(1);
                    var21 = var7;
                    var3 = var7;
                    var4 = 0;
                    if (var21.length <= var4) {
                      break L3;
                    } else {
                      L4: {
                        var22 = var21[var4];
                        if (var22 != null) {
                          var22.m(119);
                          var4++;
                          break L4;
                        } else {
                          var4++;
                          break L4;
                        }
                      }
                      var4++;
                      var4++;
                      var4++;
                      break L3;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
        if (param0 == -70) {
          if (null != ((jma) this).field_d) {
            var7 = ((jma) this).field_d.c(1);
            var31 = var7;
            var4 = 0;
            L5: while (true) {
              if (var31.length <= var4) {
                return;
              } else {
                var32 = var31[var4];
                if (var32 != null) {
                  var32.m(119);
                  var4++;
                  continue L5;
                } else {
                  var4++;
                  var4++;
                  continue L5;
                }
              }
            }
          } else {
            return;
          }
        } else {
          field_o = null;
          if (null != ((jma) this).field_d) {
            var7 = ((jma) this).field_d.c(1);
            var29 = var7;
            var4 = 0;
            L6: while (true) {
              if (var29.length <= var4) {
                return;
              } else {
                L7: {
                  var30 = var29[var4];
                  if (var30 != null) {
                    var30.m(119);
                    break L7;
                  } else {
                    var4++;
                    break L7;
                  }
                }
                var4++;
                continue L6;
              }
            }
          } else {
            return;
          }
        }
    }

    private final void c(int param0) {
        if (param0 != -8188) {
            return;
        }
        ((jma) this).field_n = 0;
    }

    private final void d(int param0) {
        if (param0 <= -119) {
          if (-1 < ((jma) this).field_e) {
            ((jma) this).field_b = ((jma) this).field_e;
            ((jma) this).field_n = 2;
            return;
          } else {
            this.g(69);
            return;
          }
        } else {
          ((jma) this).field_b = -37;
          if (-1 > ((jma) this).field_e) {
            ((jma) this).field_b = ((jma) this).field_e;
            ((jma) this).field_n = 2;
            return;
          } else {
            this.g(69);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((jma) this).field_l = param1;
        if (param4 != 5) {
          this.d((byte) -52);
          ((jma) this).field_f = param2;
          ((jma) this).field_k = param3;
          ((jma) this).field_i = param0;
          ((jma) this).field_e = param5;
          return;
        } else {
          ((jma) this).field_f = param2;
          ((jma) this).field_k = param3;
          ((jma) this).field_i = param0;
          ((jma) this).field_e = param5;
          return;
        }
    }

    private jma(int param0, lj[] param1) {
        ((jma) this).field_p = false;
        ((jma) this).field_m = true;
        try {
            ((jma) this).field_d = new koa(param0, 0);
            ((jma) this).field_d.a(9, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jma.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 85, param1, ((jma) this).field_n);
        if (param0 <= 59) {
          ((jma) this).field_c = 32;
          param1 = fs.a((byte) 93, param1, ((jma) this).field_b);
          return param1;
        } else {
          param1 = fs.a((byte) 93, param1, ((jma) this).field_b);
          return param1;
        }
    }

    jma(int param0, la param1, kh param2) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
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
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
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
        ((jma) this).field_p = false;
        ((jma) this).field_m = true;
        try {
          L0: {
            L1: {
              ((jma) this).field_d = new koa(param0, 0, param1.field_E, param2);
              if (param1.field_E > 9) {
                ((jma) this).field_e = param2.b((byte) 44, 8);
                ((jma) this).field_k = param2.b((byte) 44, 8);
                ((jma) this).field_i = param2.b((byte) 44, 8);
                ((jma) this).field_l = param2.b((byte) 44, 8);
                ((jma) this).field_f = param2.b((byte) 44, 8);
                break L1;
              } else {
                ((jma) this).field_e = param2.b((byte) 44, 8);
                ((jma) this).field_k = param2.b((byte) 44, 8);
                break L1;
              }
            }
            L2: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (1 == param2.b((byte) 44, 1)) {
                stackOut_6_0 = this;
                stackOut_6_1 = 1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((jma) this).field_m = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (param2.b((byte) 44, 1) == 1) {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            ((jma) this).field_p = stackIn_10_1 != 0;
            ((jma) this).field_c = param2.b((byte) 44, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("jma.<init>(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final void a(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != -2) {
          L0: {
            int discarded$6 = 1;
            boolean discarded$7 = this.b();
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((jma) this).field_p = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((jma) this).field_p = stackIn_4_1 != 0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_h = "Create unrated game";
    }
}
