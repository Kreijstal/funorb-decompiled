/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static bn[] field_k;
    private int field_d;
    static String field_f;
    static String field_a;
    static int field_i;
    private int field_b;
    private o[] field_e;
    static String field_g;
    static String field_l;
    static int[] field_h;
    private o field_c;
    private o field_j;

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1.equals("B")) {
              if (!param1.equals("I")) {
                if (param1.equals("S")) {
                  stackIn_9_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!param1.equals("J")) {
                    if (param1.equals("Z")) {
                      stackIn_16_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!param1.equals("F")) {
                        if (param1.equals("D")) {
                          stackIn_23_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          L1: {
                            if (param0 == 0) {
                              break L1;
                            } else {
                              field_g = (String) null;
                              break L1;
                            }
                          }
                          if (param1.equals("C")) {
                            stackIn_29_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        }
                      } else {
                        stackIn_19_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_12_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("kl.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L2;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      return stackIn_29_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, long param1, o param2) {
        o var5 = null;
        try {
            if (param2.field_c != null) {
                param2.c(-2193);
            }
            var5 = this.field_e[(int)((long)(-1 + this.field_b) & param1)];
            param2.field_h = var5;
            param2.field_c = var5.field_c;
            param2.field_c.field_h = param2;
            param2.field_e = param1;
            param2.field_h.field_c = param2;
            int var6 = -127 % ((-35 - param0) / 62);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "kl.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final o a(int param0, long param1) {
        o var6 = null;
        int var7 = Chess.field_G;
        o var4 = this.field_e[(int)((long)(this.field_b + -1) & param1)];
        this.field_j = var4.field_h;
        int var5 = 101 / ((-50 - param0) / 58);
        while (this.field_j != var4) {
            if ((param1 ^ -1L) == (this.field_j.field_e ^ -1L)) {
                var6 = this.field_j;
                this.field_j = this.field_j.field_h;
                return var6;
            }
            this.field_j = this.field_j.field_h;
        }
        this.field_j = null;
        return null;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            ol.a((java.awt.Component) ((Object) param0), param1 ^ -102);
            if (param1 == -114) {
              L1: {
                uj.a(param1 + 114, (java.awt.Component) ((Object) param0));
                if (ii.field_L != null) {
                  ii.field_L.a((java.awt.Component) ((Object) param0), param1 + 116);
                  break L1;
                } else {
                  break L1;
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
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("kl.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final o b(byte param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int var3;
        o var4;
        o var5;
        o var8;
        var3 = Chess.field_G;
        if (0 < this.field_d) {
          if (this.field_e[this.field_d + -1] != this.field_c) {
            var8 = this.field_c;
            this.field_c = var8.field_h;
            return var8;
          } else {
            L0: while (true) {
              if (this.field_b <= this.field_d) {
                if (param0 < 64) {
                  return (o) null;
                } else {
                  return null;
                }
              } else {
                fieldTemp$3 = this.field_d;
                this.field_d = this.field_d + 1;
                var5 = this.field_e[fieldTemp$3].field_h;
                if (this.field_e[-1 + this.field_d] != var5) {
                  this.field_c = var5.field_h;
                  return var5;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (this.field_b <= this.field_d) {
              if (param0 < 64) {
                return (o) null;
              } else {
                return null;
              }
            } else {
              fieldTemp$4 = this.field_d;
              this.field_d = this.field_d + 1;
              var4 = this.field_e[fieldTemp$4].field_h;
              if (this.field_e[-1 + this.field_d] != var4) {
                this.field_c = var4.field_h;
                return var4;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_l = null;
        field_h = null;
        field_f = null;
        field_g = null;
        field_a = null;
        if (param0 <= -43) {
            return;
        }
        java.awt.Canvas var2 = (java.awt.Canvas) null;
        kl.a((java.awt.Canvas) null, (byte) 34);
    }

    final o a(boolean param0) {
        this.field_d = 0;
        if (!param0) {
            this.a(-106, 109L);
            return this.b((byte) 88);
        }
        return this.b((byte) 88);
    }

    kl(int param0) {
        o dupTemp$1 = null;
        int var2;
        o var3;
        this.field_d = 0;
        this.field_e = new o[param0];
        this.field_b = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$1 = new o();
            var3 = dupTemp$1;
            this.field_e[var2] = dupTemp$1;
            var3.field_c = var3;
            var3.field_h = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        field_a = "%D";
        field_k = new bn[7];
        field_g = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = "Return to lobby";
        field_h = new int[128];
        field_l = "White wins!";
    }
}
