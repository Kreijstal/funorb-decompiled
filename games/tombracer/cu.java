/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cu extends nv {
    private int field_r;
    private kpa field_w;
    private int field_s;
    private int field_u;
    private kpa field_A;
    private boolean field_n;
    static String field_x;
    private int field_t;
    private int field_p;
    private int field_z;
    private int field_q;
    private int field_y;
    private int field_v;
    static int[] field_o;

    final kpa j(byte param0) {
        int var2 = -44 / ((-56 - param0) / 45);
        return this.field_w;
    }

    private final fsa b(int param0) {
        int var2 = -100 / ((48 - param0) / 57);
        if (this.field_n) {
            return this.field_g;
        }
        return this.e(6);
    }

    private final void g(byte param0) {
        fsa var2;
        if (param0 <= 54) {
          this.field_q = 119;
          var2 = this.b(123);
          var2.c(2, (byte) 9);
          return;
        } else {
          var2 = this.b(123);
          var2.c(2, (byte) 9);
          return;
        }
    }

    private final int a(int param0, up param1) {
        int var3_int = 0;
        int stackIn_2_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            var3_int = param1.field_j;
            if (param0 > 71) {
              L1: {
                if (0 >= this.field_s) {
                  break L1;
                } else {
                  if (this.a(var3_int, (byte) 10)) {
                    L2: {
                      this.field_s = this.field_s - param1.field_b;
                      if ((this.field_s ^ -1) >= -1) {
                        this.g((byte) 121);
                        break L2;
                      } else {
                        if (this.field_v <= 0) {
                          break L2;
                        } else {
                          if (!this.b(-106).m((byte) -99)) {
                            this.field_v = this.field_v - param1.field_b;
                            if (0 >= this.field_v) {
                              this.d(true);
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    stackIn_15_0 = param1.field_b;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (0 >= this.field_s) {
                  break L3;
                } else {
                  if (!this.a((byte) -94, var3_int)) {
                    break L3;
                  } else {
                    L4: {
                      this.field_s = this.field_s + param1.field_b;
                      if (this.field_s > this.field_z) {
                        this.field_s = this.field_z;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    stackIn_22_0 = param1.field_b;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_24_0 = 0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_2_0 = 13;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("cu.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0;
            } else {
              return stackIn_24_0;
            }
          }
        }
    }

    final void a(boolean param0, fsa param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
            super.a(param0, param1);
            for (var3_int = 0; -7 < (var3_int ^ -1); var3_int++) {
                if (this.field_w.a(0, var3_int) || this.field_A.a(0, var3_int)) {
                    param1.a(26492, true, var3_int);
                }
            }
            this.field_p = this.field_y;
            this.field_v = this.field_r;
            this.field_q = this.field_u;
            this.field_s = this.field_z;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cu.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -123;
        }
        return 24;
    }

    private final boolean a(int param0, byte param1) {
        if (param1 != 10) {
            this.field_v = 0;
            return this.field_w.a(0, param0);
        }
        return this.field_w.a(0, param0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_r = param0;
        this.field_y = param1;
        if (param2 < 29) {
            return;
        }
        this.field_t = param3;
    }

    private final void d(boolean param0) {
        if (!param0) {
            return;
        }
        this.field_v = this.field_r;
        this.b(110).n(this.field_t, -127);
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7_int = -96 / ((param4 - 62) / 52);
            stackIn_1_0 = this.a(94, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("cu.UB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    final static hja a(boolean param0, int param1, cn param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (jna.a(param0, param1, param3, param2)) {
            return sba.d((byte) 120);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("cu.CA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L0;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L0;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
    }

    final void k(int param0) {
        if (-1 > (this.field_p ^ -1)) {
          this.field_p = this.field_p - 1;
          if (-1 == (this.field_p ^ -1)) {
            this.field_v = this.field_v + 1;
            this.field_p = this.field_y;
            if (this.field_r < this.field_v) {
              L0: {
                this.field_v = this.field_r;
                if (-1 <= (this.field_q ^ -1)) {
                  break L0;
                } else {
                  this.field_q = this.field_q - 1;
                  if (-1 != (this.field_q ^ -1)) {
                    break L0;
                  } else {
                    this.field_s = this.field_s + 1;
                    this.field_q = this.field_u;
                    if (this.field_s > this.field_z) {
                      this.field_s = this.field_z;
                      break L0;
                    } else {
                      if (param0 == 5418) {
                        return;
                      } else {
                        this.field_q = -100;
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 == 5418) {
                return;
              } else {
                this.field_q = -100;
                return;
              }
            } else {
              L1: {
                if (-1 <= (this.field_q ^ -1)) {
                  break L1;
                } else {
                  this.field_q = this.field_q - 1;
                  if (-1 != (this.field_q ^ -1)) {
                    break L1;
                  } else {
                    this.field_s = this.field_s + 1;
                    this.field_q = this.field_u;
                    if (this.field_s > this.field_z) {
                      this.field_s = this.field_z;
                      break L1;
                    } else {
                      if (param0 == 5418) {
                        return;
                      } else {
                        this.field_q = -100;
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 == 5418) {
                return;
              } else {
                this.field_q = -100;
                return;
              }
            }
          } else {
            if (-1 > (this.field_q ^ -1)) {
              this.field_q = this.field_q - 1;
              if (-1 == (this.field_q ^ -1)) {
                this.field_s = this.field_s + 1;
                this.field_q = this.field_u;
                if (this.field_s > this.field_z) {
                  this.field_s = this.field_z;
                  if (param0 != 5418) {
                    this.field_q = -100;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param0 != 5418) {
                    this.field_q = -100;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param0 != 5418) {
                  this.field_q = -100;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 != 5418) {
                this.field_q = -100;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (-1 > (this.field_q ^ -1)) {
            this.field_q = this.field_q - 1;
            if (-1 == (this.field_q ^ -1)) {
              this.field_s = this.field_s + 1;
              this.field_q = this.field_u;
              if (this.field_s > this.field_z) {
                this.field_s = this.field_z;
                if (param0 != 5418) {
                  this.field_q = -100;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 != 5418) {
                  this.field_q = -100;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 != 5418) {
                this.field_q = -100;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 5418) {
              this.field_q = -100;
              return;
            } else {
              return;
            }
          }
        }
    }

    final int a(int param0, ep param1, up param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 25940) {
                break L1;
              } else {
                this.field_w = (kpa) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(76, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("cu.BC(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -127, !this.field_n ? 0 : 1, 1);
            param1.a((byte) -29, this.field_r, 8);
            param1.a((byte) -127, this.field_z, 8);
            param1.a((byte) -128, this.field_u, 4);
            param1.a((byte) -126, this.field_y, 4);
            param1.a((byte) 107, this.field_t, 8);
            this.field_w.a(param1, (byte) -120);
            this.field_A.a(param1, (byte) -120);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cu.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    cu(la param0, boolean param1) {
        super(param0, param1);
        try {
            this.field_u = 0;
            this.field_r = 25;
            this.field_t = 25;
            this.field_z = 50;
            this.field_y = 10;
            this.field_n = false;
            this.field_w = new kpa(6);
            this.field_w.a(3, -17075, true);
            this.field_w.a(0, -17075, true);
            this.field_A = new kpa(6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        field_x = null;
        field_o = null;
        if (param0 != -1) {
            field_x = (String) null;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        cn var4;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_14_1 = 0;
        int stackIn_17_0 = 0;
        if (param0 < -67) {
          L0: {
            stackIn_13_0 = er.c(param1, param2, 52);

            if ((param1 & 458752) == 0) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = 0;
              break L0;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = 1;
              break L0;
            }
          }
          if (stackIn_14_0 | stackIn_14_1 == 0) {
            if (uu.a(true, param1, param2)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_17_0 = 1;
            return stackIn_17_0 != 0;
          }
        } else {
          L1: {
            var4 = (cn) null;
            cu.a(true, -98, (cn) null, 106);
            stackIn_3_0 = er.c(param1, param2, 52);

            if ((param1 & 458752) == 0) {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          if (stackIn_4_0 | stackIn_4_1 != 0) {
            return true;
          } else {
            L2: {
              if (!uu.a(true, param1, param2)) {
                stackIn_8_0 = 0;
                break L2;
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            return stackIn_8_0 != 0;
          }
        }
    }

    final int a(int param0, up param1, pc param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -85) {
              stackIn_4_0 = this.a(127, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -55;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("cu.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    cu(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_n = (param1.b((byte) 44, 1) ^ -1) == -2 ? true : false;
            this.field_r = param1.b((byte) 44, 8);
            this.field_z = param1.b((byte) 44, 8);
            this.field_u = param1.b((byte) 44, 4);
            this.field_y = param1.b((byte) 44, 4);
            this.field_t = param1.b((byte) 44, 8);
            this.field_w = new kpa(6, param0.field_E, param1);
            this.field_A = new kpa(6, param0.field_E, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final boolean a(byte param0, int param1) {
        int var3 = -126 / ((19 - param0) / 56);
        return this.field_A.a(0, param1);
    }

    final int a(int param0, int param1) {
        param0 = fs.a((byte) 27, param0, this.field_s);
        if (param1 >= -48) {
          return 119;
        } else {
          param0 = fs.a((byte) 59, param0, this.field_v);
          return param0;
        }
    }

    final void b(byte param0, boolean param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 != 0) {
          L0: {
            this.g((byte) -127);
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
          ((cu) (this)).field_n = stackIn_8_1 != 0;
          return;
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
          ((cu) (this)).field_n = stackIn_4_1 != 0;
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param2 != 0) {
            return;
        }
        this.field_z = param1;
        this.field_u = param0;
    }

    static {
        field_x = "Music: ";
    }
}
