/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ck implements uh {
    static si field_e;
    static int field_b;
    private long field_d;
    static int field_c;
    static String field_f;
    static int field_a;

    public final String c(byte param0) {
        if (this.b((byte) -127)) {
            return null;
        }
        if (param0 != 66) {
            return (String) null;
        }
        if (350L + this.field_d > fa.a(-96)) {
            return null;
        }
        return this.a(8335);
    }

    public final vf a(byte param0) {
        if (this.b((byte) -62)) {
            return ha.field_l;
        }
        if (param0 < 121) {
            field_c = 111;
        }
        if (!((fa.a(81) ^ -1L) <= (this.field_d - -350L ^ -1L))) {
            return ui.field_o;
        }
        return this.b(-1);
    }

    public static void f(byte param0) {
        field_e = null;
        field_f = null;
        if (param0 != -126) {
            ck.e((byte) -40);
        }
    }

    abstract vf b(int param0);

    abstract String a(int param0);

    public final void d(byte param0) {
        if (param0 <= 32) {
            this.c((byte) 37);
        }
        this.field_d = fa.a(-85);
    }

    final static ng a(String param0, String param1, long param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        qe stackIn_5_0 = null;
        ek stackIn_8_0 = null;
        ji stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 > 77) {
                break L1;
              } else {
                field_e = (si) null;
                break L1;
              }
            }
            L2: {
              if (0L != param2) {
                break L2;
              } else {
                if (param1 == null) {
                  break L2;
                } else {
                  stackIn_5_0 = new qe(param1, param0);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (!param4) {
              stackIn_10_0 = new ji(param2, param0);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_8_0 = new ek(param2, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("ck.V(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ng) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ng) ((Object) stackIn_8_0);
          } else {
            return (ng) ((Object) stackIn_10_0);
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Bounce.field_N;
        try {
          L0: {
            if (param4 == 14677) {
              L1: {
                var5_int = param2 + param0;
                var6 = param3 + param1;
                if (na.field_g < param0) {
                  stackIn_6_0 = param0;
                  break L1;
                } else {
                  stackIn_6_0 = na.field_g;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_6_0;
                if (na.field_i < param3) {
                  stackIn_9_0 = param3;
                  break L2;
                } else {
                  stackIn_9_0 = na.field_i;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_9_0;
                if (na.field_b > var5_int) {
                  stackIn_12_0 = var5_int;
                  break L3;
                } else {
                  stackIn_12_0 = na.field_b;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_12_0;
                if (na.field_f <= var6) {
                  stackIn_15_0 = na.field_f;
                  break L4;
                } else {
                  stackIn_15_0 = var6;
                  break L4;
                }
              }
              L5: {
                var10 = stackIn_15_0;
                if (param0 < na.field_g) {
                  break L5;
                } else {
                  if (param0 < na.field_b) {
                    var11 = var8 * na.field_e + param0;
                    var12 = -var8 + (var10 + 1) >> -1702053183;
                    L6: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L5;
                      } else {
                        na.field_d[var11] = 16777215;
                        var11 = var11 + 2 * na.field_e;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (na.field_i > param3) {
                  break L7;
                } else {
                  if (na.field_f > var6) {
                    var11 = na.field_e * param3 - -var7;
                    var12 = var9 + 1 - var7 >> -914102335;
                    L8: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L7;
                      } else {
                        na.field_d[var11] = 16777215;
                        var11 += 2;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (var5_int < na.field_g) {
                  break L9;
                } else {
                  if (var5_int >= na.field_b) {
                    break L9;
                  } else {
                    var11 = ((-param0 + var5_int & 1) + var8) * na.field_e + var5_int;
                    var12 = -var8 + 1 + var10 >> -737859103;
                    L10: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L9;
                      } else {
                        na.field_d[var11] = 16777215;
                        var11 = var11 + 2 * na.field_e;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L11: {
                if (param3 < na.field_i) {
                  break L11;
                } else {
                  if (var6 >= na.field_f) {
                    break L11;
                  } else {
                    var11 = (var6 + -param3 & 1) + var6 * na.field_e - -var7;
                    var12 = -var7 + var9 + 1 >> -1305427967;
                    L12: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L11;
                      } else {
                        na.field_d[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var5), "ck.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean g(byte param0) {
        int var1 = -62 / ((49 - param0) / 62);
        return !pb.field_k.a(1000) ? true : false;
    }

    final static void e(byte param0) {
        d.a(ej.field_b, true, eb.field_z, 0);
        va.field_f = true;
        int var1 = -3 % ((param0 - 28) / 62);
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
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
        RuntimeException var2 = null;
        var6 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (20 >= var2_int) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            L2: {
              var8 = new char[var2_int];
              var7 = var8;
              var3 = var7;
              if (param0 <= -57) {
                break L2;
              } else {
                ck.a(18, -113, 56, 101, 46);
                break L2;
              }
            }
            var4 = 0;
            L3: while (true) {
              if (var4 >= var2_int) {
                stackIn_21_0 = new String(var8);
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param1.charAt(var4);
                    if (var5 < 65) {
                      break L5;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(-65 + (var5 + 97));
                        break L4;
                      } else {
                        break L5;
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
                        if (var5 <= 57) {
                          break L6;
                        } else {
                          break L8;
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

            stackIn_24_1 = new StringBuilder().append("ck.W(").append(param0).append(',');

            if (param1 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    static {
        field_b = -1;
        field_c = -1;
        field_f = "Play free version";
        field_a = 0;
    }
}
