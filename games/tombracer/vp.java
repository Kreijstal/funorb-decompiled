/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vp extends qr {
    private boolean field_z;
    private int field_A;
    private int field_D;
    static String field_B;
    private int field_E;
    private boolean field_C;
    private int field_y;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        ae var6 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a((byte) -127, param0, param1, param2)) {
                this.a(1, param2, param1, param0);
                this.a(param1, param0, param2, 0);
                discarded$62 = param2.append(" revert=").append(this.field_C);
                if (-2147483648 == (this.field_y ^ -1)) {
                  break L1;
                } else {
                  if (-2147483648 != (this.field_E ^ -1)) {
                    discarded$63 = param2.append(" to ").append(this.field_y).append(',').append(this.field_E);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 == 0) {
                break L2;
              } else {
                var6 = (ae) null;
                this.a(-39, 47, (ae) null, -72);
                break L2;
              }
            }
            stackIn_9_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("vp.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 70) {
                break L1;
              } else {
                this.field_y = -96;
                break L1;
              }
            }
            L2: {
              var8_int = super.a(109, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L2;
              } else {
                if (this.field_z) {
                  stackIn_14_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (this.a(param6, param1, 18, param3, param2)) {
              L3: {
                if ((param4 ^ -1) == -2) {
                  this.field_D = param3 + -this.field_n - param2;
                  this.field_A = -this.field_i + (param6 - param1);
                  ava.field_f = (vp) (this);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_s = param4;
              stackIn_12_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_7_0 = var8_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8);

            stackIn_17_1 = new StringBuilder().append("vp.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_s = 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vp.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_x instanceof rj)) {
                    break L3;
                  } else {
                    if (!((rj) ((Object) this.field_x)).field_y) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-2 == (this.field_s ^ -1)) {
                  L4: {
                    var5_int = -param0 + jba.field_j + -this.field_A;
                    var6 = -this.field_D + (sta.field_B + -param3);
                    if (this.field_i != var5_int) {
                      break L4;
                    } else {
                      if (var6 == this.field_n) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_i = var5_int;
                  this.field_n = var6;
                  if (!(this.field_h instanceof jka)) {
                    break L1;
                  } else {
                    ((jka) ((Object) this.field_h)).a(param0, (vp) (this), (byte) -49, param3);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_C) {
                break L1;
              } else {
                L5: {
                  if (this.field_y == this.field_i) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = -this.field_i + this.field_y;
                      stackIn_11_0 = this;

                      stackIn_11_1 = this.field_i;

                      if (-3 > (Math.abs(var5_int) ^ -1)) {
                        stackIn_12_0 = this;
                        stackIn_12_1 = stackIn_11_1;
                        stackIn_12_2 = var5_int >> 164054337;
                        break L6;
                      } else {
                        stackIn_10_0 = this;

                        if (0 >= var5_int) {
                          stackIn_12_0 = this;
                          stackIn_12_1 = stackIn_11_1;
                          stackIn_12_2 = -1;
                          break L6;
                        } else {
                          stackIn_12_0 = this;
                          stackIn_12_1 = stackIn_11_1;
                          stackIn_12_2 = 1;
                          break L6;
                        }
                      }
                    }
                    ((vp) (this)).field_i = stackIn_12_1 + stackIn_12_2;
                    break L5;
                  }
                }
                if (this.field_E == this.field_n) {
                  break L1;
                } else {
                  L7: {
                    var5_int = this.field_E - this.field_n;
                    stackIn_18_0 = this;

                    stackIn_18_1 = this.field_n;

                    if (-3 > (Math.abs(var5_int) ^ -1)) {
                      stackIn_19_0 = this;
                      stackIn_19_1 = stackIn_18_1;
                      stackIn_19_2 = var5_int >> -459791199;
                      break L7;
                    } else {
                      stackIn_17_0 = this;

                      if (-1 > (var5_int ^ -1)) {
                        stackIn_19_0 = this;
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = 1;
                        break L7;
                      } else {
                        stackIn_19_0 = this;
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = -1;
                        break L7;
                      }
                    }
                  }
                  ((vp) (this)).field_n = stackIn_19_1 + stackIn_19_2;
                  break L1;
                }
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("vp.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ')');
        }
    }

    public static void e(int param0) {
        field_B = null;
        if (param0 != 63) {
            field_B = (String) null;
        }
    }

    final static void a(int param0, br param1) {
        try {
            param1.field_l = new int[]{param0};
            param1.field_o = new char[]{(char)63};
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vp.MA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    vp(int param0, int param1, int param2, int param3, isa param4, qc param5, ae param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_y = 2147483647;
        this.field_E = 2147483647;
        try {
            this.field_x = param6;
            this.field_z = param8 ? true : false;
            this.field_C = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vp.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void c(int param0) {
        ae var3;
        super.c(95);
        if (param0 < 91) {
          var3 = (ae) null;
          this.a(-99, 92, -20, -84, 98, (ae) null, 112);
          this.field_x.a((byte) -31, this.field_m, this.field_p, 0, 0);
          this.field_E = this.field_n;
          this.field_y = this.field_i;
          return;
        } else {
          this.field_x.a((byte) -31, this.field_m, this.field_p, 0, 0);
          this.field_E = this.field_n;
          this.field_y = this.field_i;
          return;
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        L0: {
          if ((1 & param0) == 0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if ((param0 & 2) == 0) {
            stackIn_6_0 = 0;
            break L1;
          } else {
            stackIn_6_0 = 1;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_6_0;
          if ((4 & param0) == 0) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          if ((8 & param0) == 0) {
            stackIn_12_0 = 0;
            break L3;
          } else {
            stackIn_12_0 = 1;
            break L3;
          }
        }
        L4: {
          var5 = stackIn_12_0;
          if (-1 == (16 & param0 ^ -1)) {
            stackIn_15_0 = 0;
            break L4;
          } else {
            stackIn_15_0 = 1;
            break L4;
          }
        }
        L5: {
          var6 = stackIn_15_0;
          if ((param0 & 32) == 0) {
            stackIn_18_0 = 0;
            break L5;
          } else {
            stackIn_18_0 = 1;
            break L5;
          }
        }
        L6: {
          var7 = stackIn_18_0;
          if (0 == (64 & param0)) {
            stackIn_21_0 = 0;
            break L6;
          } else {
            stackIn_21_0 = 1;
            break L6;
          }
        }
        var8 = stackIn_21_0;
        if (var2 != 0) {
          if (var3 != 0) {
            if (var4 != 0) {
              if (var5 != 0) {
                var16 = var7;
                var11 = 0;
                var10 = 0;
                var15 = var6;
                var9 = 0;
                var14 = 0;
                var13 = 0;
                var17 = 0;
                var12 = 0;
                if (param1 != -6487) {
                  return 12;
                } else {
                  L7: {
                    var18 = 0;
                    if (var11 == 0) {
                      break L7;
                    } else {
                      var18 = var18 | 1;
                      break L7;
                    }
                  }
                  L8: {
                    if (var12 == 0) {
                      break L8;
                    } else {
                      var18 = var18 | 2;
                      break L8;
                    }
                  }
                  L9: {
                    if (var9 == 0) {
                      break L9;
                    } else {
                      var18 = var18 | 4;
                      break L9;
                    }
                  }
                  L10: {
                    if (var10 == 0) {
                      break L10;
                    } else {
                      var18 = var18 | 8;
                      break L10;
                    }
                  }
                  L11: {
                    if (var13 == 0) {
                      break L11;
                    } else {
                      var18 = var18 | 16;
                      break L11;
                    }
                  }
                  L12: {
                    if (var14 != 0) {
                      var18 = var18 | 32;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var15 == 0) {
                      break L13;
                    } else {
                      var18 = var18 | 128;
                      break L13;
                    }
                  }
                  L14: {
                    if (var16 != 0) {
                      var18 = var18 | 256;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var17 == 0) {
                      break L15;
                    } else {
                      var18 = var18 | 64;
                      break L15;
                    }
                  }
                  return var18;
                }
              } else {
                var14 = var7;
                var10 = var5;
                var9 = var4;
                var12 = var3;
                var17 = var8;
                var13 = var6;
                var16 = 0;
                var15 = 0;
                var11 = var2;
                if (param1 != -6487) {
                  return 12;
                } else {
                  L16: {
                    var18 = 0;
                    if (var11 == 0) {
                      break L16;
                    } else {
                      var18 = var18 | 1;
                      break L16;
                    }
                  }
                  L17: {
                    if (var12 == 0) {
                      break L17;
                    } else {
                      var18 = var18 | 2;
                      break L17;
                    }
                  }
                  L18: {
                    if (var9 == 0) {
                      break L18;
                    } else {
                      var18 = var18 | 4;
                      break L18;
                    }
                  }
                  L19: {
                    if (var10 == 0) {
                      break L19;
                    } else {
                      var18 = var18 | 8;
                      break L19;
                    }
                  }
                  L20: {
                    if (var13 == 0) {
                      break L20;
                    } else {
                      var18 = var18 | 16;
                      break L20;
                    }
                  }
                  L21: {
                    if (var14 != 0) {
                      var18 = var18 | 32;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var15 == 0) {
                      break L22;
                    } else {
                      var18 = var18 | 128;
                      break L22;
                    }
                  }
                  L23: {
                    if (var16 != 0) {
                      var18 = var18 | 256;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (var17 == 0) {
                      break L24;
                    } else {
                      var18 = var18 | 64;
                      break L24;
                    }
                  }
                  return var18;
                }
              }
            } else {
              var14 = var7;
              var10 = var5;
              var9 = var4;
              var12 = var3;
              var17 = var8;
              var13 = var6;
              var16 = 0;
              var15 = 0;
              var11 = var2;
              if (param1 != -6487) {
                return 12;
              } else {
                L25: {
                  var18 = 0;
                  if (var11 == 0) {
                    break L25;
                  } else {
                    var18 = var18 | 1;
                    break L25;
                  }
                }
                L26: {
                  if (var12 == 0) {
                    break L26;
                  } else {
                    var18 = var18 | 2;
                    break L26;
                  }
                }
                L27: {
                  if (var9 == 0) {
                    break L27;
                  } else {
                    var18 = var18 | 4;
                    break L27;
                  }
                }
                L28: {
                  if (var10 == 0) {
                    break L28;
                  } else {
                    var18 = var18 | 8;
                    break L28;
                  }
                }
                L29: {
                  if (var13 == 0) {
                    break L29;
                  } else {
                    var18 = var18 | 16;
                    break L29;
                  }
                }
                L30: {
                  if (var14 != 0) {
                    var18 = var18 | 32;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (var15 == 0) {
                    break L31;
                  } else {
                    var18 = var18 | 128;
                    break L31;
                  }
                }
                L32: {
                  if (var16 != 0) {
                    var18 = var18 | 256;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (var17 == 0) {
                    break L33;
                  } else {
                    var18 = var18 | 64;
                    break L33;
                  }
                }
                return var18;
              }
            }
          } else {
            var14 = var7;
            var10 = var5;
            var9 = var4;
            var12 = var3;
            var17 = var8;
            var13 = var6;
            var16 = 0;
            var15 = 0;
            var11 = var2;
            if (param1 != -6487) {
              return 12;
            } else {
              L34: {
                var18 = 0;
                if (var11 == 0) {
                  break L34;
                } else {
                  var18 = var18 | 1;
                  break L34;
                }
              }
              L35: {
                if (var12 == 0) {
                  break L35;
                } else {
                  var18 = var18 | 2;
                  break L35;
                }
              }
              L36: {
                if (var9 == 0) {
                  break L36;
                } else {
                  var18 = var18 | 4;
                  break L36;
                }
              }
              L37: {
                if (var10 == 0) {
                  break L37;
                } else {
                  var18 = var18 | 8;
                  break L37;
                }
              }
              L38: {
                if (var13 == 0) {
                  break L38;
                } else {
                  var18 = var18 | 16;
                  break L38;
                }
              }
              L39: {
                if (var14 != 0) {
                  var18 = var18 | 32;
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (var15 == 0) {
                  break L40;
                } else {
                  var18 = var18 | 128;
                  break L40;
                }
              }
              L41: {
                if (var16 != 0) {
                  var18 = var18 | 256;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if (var17 == 0) {
                  break L42;
                } else {
                  var18 = var18 | 64;
                  break L42;
                }
              }
              return var18;
            }
          }
        } else {
          var14 = var7;
          var10 = var5;
          var9 = var4;
          var12 = var3;
          var17 = var8;
          var13 = var6;
          var16 = 0;
          var15 = 0;
          var11 = var2;
          if (param1 != -6487) {
            return 12;
          } else {
            L43: {
              var18 = 0;
              if (var11 == 0) {
                break L43;
              } else {
                var18 = var18 | 1;
                break L43;
              }
            }
            L44: {
              if (var12 == 0) {
                break L44;
              } else {
                var18 = var18 | 2;
                break L44;
              }
            }
            L45: {
              if (var9 == 0) {
                break L45;
              } else {
                var18 = var18 | 4;
                break L45;
              }
            }
            L46: {
              if (var10 == 0) {
                break L46;
              } else {
                var18 = var18 | 8;
                break L46;
              }
            }
            L47: {
              if (var13 == 0) {
                break L47;
              } else {
                var18 = var18 | 16;
                break L47;
              }
            }
            L48: {
              if (var14 != 0) {
                var18 = var18 | 32;
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              if (var15 == 0) {
                break L49;
              } else {
                var18 = var18 | 128;
                break L49;
              }
            }
            L50: {
              if (var16 != 0) {
                var18 = var18 | 256;
                break L50;
              } else {
                break L50;
              }
            }
            L51: {
              if (var17 == 0) {
                break L51;
              } else {
                var18 = var18 | 64;
                break L51;
              }
            }
            return var18;
          }
        }
    }

    static {
        field_B = "Dartgun";
    }
}
