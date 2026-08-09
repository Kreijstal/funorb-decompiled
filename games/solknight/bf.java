/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bf {
    static int field_e;
    static String field_m;
    static String field_i;
    static int field_a;
    o field_k;
    private int field_g;
    private boolean field_c;
    private int field_l;
    private int field_d;
    o[] field_j;
    static sh[] field_b;
    private int field_h;
    private int field_n;
    static oc field_f;

    public static void a(byte param0) {
        field_m = null;
        field_i = null;
        field_b = null;
        field_f = null;
        if (param0 <= 105) {
            field_f = (oc) null;
        }
    }

    final bf a(int param0, boolean param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 != 0) {
          L0: {
            this.d(-88, 84);
            stackIn_7_0 = this;

            if (!param1) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((bf) (this)).field_c = stackIn_8_1 != 0;
          return (bf) (this);
        } else {
          L1: {
            stackIn_3_0 = this;

            if (!param1) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((bf) (this)).field_c = stackIn_4_1 != 0;
          return (bf) (this);
        }
    }

    final bf b(int param0, int param1) {
        int var3 = 105 % ((param1 - -18) / 45);
        this.field_l = param0;
        return (bf) (this);
    }

    final static boolean c(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            if (te.field_N.field_m < param1) {
              if (lf.field_d == null) {
                return false;
              } else {
                try {
                  L0: {
                    L1: {
                      if (param0 >= 35) {
                        break L1;
                      } else {
                        bf.c(-65, -12);
                        break L1;
                      }
                    }
                    var2_int = lf.field_d.b(-30119);
                    if (-1 <= (var2_int ^ -1)) {
                      if (0 > var2_int) {
                        je.a(false);
                        return false;
                      } else {
                        if (30000L >= dh.b(-1)) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          je.a(false);
                          return false;
                        }
                      }
                    } else {
                      L2: {
                        if (param1 + -te.field_N.field_m < var2_int) {
                          var2_int = param1 - te.field_N.field_m;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      lf.field_d.a((byte) 59, te.field_N.field_m, var2_int, te.field_N.field_l);
                      md.field_y = je.a(1);
                      te.field_N.field_m = te.field_N.field_m + var2_int;
                      if (te.field_N.field_m >= param1) {
                        te.field_N.field_m = 0;
                        stackIn_15_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        stackIn_13_0 = 0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  je.a(false);
                  return false;
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_13_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_15_0 != 0;
                  } else {
                    return false;
                  }
                }
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(bf param0, int param1, rc param2, int param3, int param4, ql param5) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_c) {
                param0.a(90, param4, param1, param5, param2);
                param0.a(36);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == this.field_k) {
                break L2;
              } else {
                param0.field_k = this.field_k;
                break L2;
              }
            }
            L3: {
              if ((this.field_l ^ -1) == 2147483647) {
                break L3;
              } else {
                param0.field_l = this.field_l;
                break L3;
              }
            }
            L4: {
              if (-1 > this.field_d) {
                break L4;
              } else {
                param0.field_d = this.field_d;
                break L4;
              }
            }
            L5: {
              if (param3 == this.field_g) {
                break L5;
              } else {
                param0.field_g = this.field_g;
                break L5;
              }
            }
            L6: {
              if (this.field_n < -1) {
                break L6;
              } else {
                param0.field_n = this.field_n;
                break L6;
              }
            }
            L7: {
              if ((this.field_h ^ -1) != 2147483647) {
                param0.field_h = this.field_h;
                break L7;
              } else {
                break L7;
              }
            }
            if (this.field_j == null) {
              break L0;
            } else {
              param0.field_j = this.field_j;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var7);

            stackIn_21_1 = new StringBuilder().append("bf.C(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ')');
        }
    }

    final bf a(int param0, int param1) {
        this.field_n = param0;
        if (param1 != 256) {
            this.a(-114);
            return (bf) (this);
        }
        return (bf) (this);
    }

    final static int b(byte param0) {
        if (param0 > -34) {
            return -84;
        }
        return -pk.field_ab + dh.field_h;
    }

    final bf d(int param0, int param1) {
        this.field_d = param1;
        if (param0 > -114) {
            bf var4 = (bf) null;
            this.a((bf) null, 56);
            return (bf) (this);
        }
        return (bf) (this);
    }

    final void a(int param0, int param1, int param2, ql param3, rc param4) {
        mg stackIn_18_0 = null;
        String stackIn_18_1 = null;
        mg stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_25_8;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              uj.a(param4.field_t, param4.field_x, param2 + param4.field_m, this.field_j, param1 - -param4.field_j, 2);
              if (null != this.field_k) {
                L2: {
                  var6_int = param2 + (param4.field_m + this.field_l);
                  if (1 != param3.field_g) {
                    break L2;
                  } else {
                    var6_int = var6_int + (param4.field_t - this.field_k.field_q) / 2;
                    break L2;
                  }
                }
                L3: {
                  var7 = param1 - (-param4.field_j + -this.field_h);
                  if (param3.field_b == 1) {
                    var7 = var7 + (-this.field_k.field_r + param4.field_x) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (2 != param3.field_g) {
                    break L4;
                  } else {
                    var6_int = var6_int + (param4.field_t - this.field_k.field_q);
                    break L4;
                  }
                }
                L5: {
                  if (2 != param3.field_b) {
                    break L5;
                  } else {
                    var7 = var7 + (param4.field_x - this.field_k.field_r);
                    break L5;
                  }
                }
                this.field_k.d(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              var6 = param3.b(param4, 0);
              if (var6 == null) {
                break L6;
              } else {
                if (param3.field_l == null) {
                  break L6;
                } else {
                  if (this.field_d >= 0) {
                    L7: {
                      stackIn_18_0 = param3.field_l;

                      stackIn_18_1 = (String) (var6);

                      if (this.field_l == -2147483648) {
                        stackIn_19_0 = (mg) ((Object) stackIn_18_0);
                        stackIn_19_1 = (String) ((Object) stackIn_18_1);
                        stackIn_19_2 = 0;
                        break L7;
                      } else {
                        stackIn_19_0 = (mg) ((Object) stackIn_18_0);
                        stackIn_19_1 = (String) ((Object) stackIn_18_1);
                        stackIn_19_2 = this.field_l;
                        break L7;
                      }
                    }
                    L8: {




                      stackIn_21_2 = stackIn_19_2 + (param3.field_a + param2 + param4.field_m);

                      stackIn_21_3 = param3.field_d;

                      stackIn_21_4 = param4.field_j + param1;

                      if (-2147483648 != this.field_h) {
                        stackIn_19_0 = (mg) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = stackIn_21_3;
                        stackIn_22_4 = stackIn_21_4;
                        stackIn_22_5 = this.field_h;
                        break L8;
                      } else {
                        stackIn_19_0 = (mg) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = stackIn_21_3;
                        stackIn_22_4 = stackIn_21_4;
                        stackIn_22_5 = 0;
                        break L8;
                      }
                    }
                    L9: {






                      stackIn_24_3 = stackIn_22_3 + (stackIn_22_4 + stackIn_22_5);

                      stackIn_24_4 = -param3.field_n + (param4.field_t + -param3.field_a);

                      stackIn_24_5 = -param3.field_j + (-param3.field_d + param4.field_x);

                      stackIn_24_6 = this.field_d;

                      stackIn_24_7 = this.field_n;

                      if ((this.field_g ^ -1) != 2147483647) {
                        stackIn_19_0 = (mg) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);

                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = stackIn_24_5;
                        stackIn_25_6 = stackIn_24_6;
                        stackIn_25_7 = stackIn_24_7;
                        stackIn_25_8 = this.field_g;
                        break L9;
                      } else {
                        stackIn_19_0 = (mg) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);

                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = stackIn_24_5;
                        stackIn_25_6 = stackIn_24_6;
                        stackIn_25_7 = stackIn_24_7;
                        stackIn_25_8 = 256;
                        break L9;
                      }
                    }
                    ((mg) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_22_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, param3.field_g, param3.field_b, param3.field_f);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            if (param0 > 45) {
              break L0;
            } else {
              this.a(-35, 3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var6_ref);

            stackIn_31_1 = new StringBuilder().append("bf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ')');
        }
    }

    final bf a(o[] param0, byte param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_j = param0;
              if (param1 == 119) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("bf.L(");

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (bf) (this);
    }

    final bf a(int param0, byte param1) {
        if (param1 < 59) {
            return (bf) null;
        }
        this.field_h = param0;
        return (bf) (this);
    }

    final void a(int param0) {
        this.field_l = 0;
        this.field_h = 0;
        if (param0 != 36) {
          field_b = (sh[]) null;
          this.field_d = 0;
          this.field_g = 256;
          this.field_k = null;
          this.field_n = -1;
          this.field_j = null;
          return;
        } else {
          this.field_d = 0;
          this.field_g = 256;
          this.field_k = null;
          this.field_n = -1;
          this.field_j = null;
          return;
        }
    }

    bf() {
        this.field_l = -2147483648;
        this.field_k = null;
        this.field_d = -2;
        this.field_h = -2147483648;
        this.field_j = null;
        this.field_n = -2;
        this.field_g = -2147483648;
        this.field_c = false;
    }

    final void a(bf param0, int param1) {
        try {
            param0.field_k = this.field_k;
            param0.field_j = this.field_j;
            param0.field_h = this.field_h;
            param0.field_d = this.field_d;
            if (param1 != 2) {
                rc var4 = (rc) null;
                this.a(-90, 43, 73, (ql) null, (rc) null);
            }
            param0.field_l = this.field_l;
            param0.field_g = this.field_g;
            param0.field_n = this.field_n;
            param0.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "bf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = -1;
        field_b = new sh[36];
        field_m = "You have 1 unread message!";
    }
}
