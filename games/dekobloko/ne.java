/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    private le[] field_h;
    private wl field_a;
    static byte[] field_c;
    private im field_f;
    static String field_b;
    static String field_d;
    private pj field_j;
    private dd field_i;
    private java.math.BigInteger field_g;
    private java.math.BigInteger field_e;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 == 0) {
            return;
        }
        field_c = (byte[]) null;
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        if (param0 != 255) {
            return -17;
        }
        return qm.a((byte) 57);
    }

    final boolean a(boolean param0) {
        int stackIn_25_0 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        wl var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = client.field_A ? 1 : 0;
        if (null != this.field_a) {
          return true;
        } else {
          L0: {
            if (null == this.field_j) {
              if (!this.field_i.a(true)) {
                this.field_j = this.field_i.a(true, (byte) 0, param0, 255, 255);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_j.field_z) {
            var10 = new wl(this.field_j.g((byte) 113));
            var10.field_n = 5;
            var3 = var10.d((byte) -69);
            var10.field_n = var10.field_n + var3 * 72;
            var13 = new byte[-var10.field_n + var10.field_r.length];
            var11 = var13;
            var4 = var11;
            var10.a(var4, 0, (byte) 125, var13.length);
            if (param0) {
              L1: {
                L2: {
                  L3: {
                    if (this.field_e == null) {
                      break L3;
                    } else {
                      if (null != this.field_g) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5 = var4;
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                var12 = new java.math.BigInteger(var13);
                var7_ref_java_math_BigInteger = var12.modPow(this.field_e, this.field_g);
                var5 = var7_ref_java_math_BigInteger.toByteArray();
                break L1;
              }
              if (var5.length != 65) {
                throw new RuntimeException();
              } else {
                var15 = um.a(0, var10.field_r, 5, var10.field_n - (var13.length - -5));
                var7 = 0;
                L4: while (true) {
                  if ((var7 ^ -1) > -65) {
                    stackIn_25_0 = var15[var7] ^ -1;

                    if (var8 == 0) {
                      if (stackIn_25_0 == (var5[var7 - -1] ^ -1)) {
                        var7++;
                        if (var8 == 0) {
                          continue L4;
                        } else {
                          this.field_h = new le[var3];
                          this.field_a = var10;
                          return true;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      return stackIn_25_0 != 0;
                    }
                  } else {
                    this.field_h = new le[var3];
                    this.field_a = var10;
                    return true;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final le a(byte param0, int param1, kh param2, kh param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        le var10 = null;
        byte[] var14 = null;
        le stackIn_9_0 = null;
        le stackIn_11_0 = null;
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
            if (this.field_a != null) {
              L1: {
                if (0 > param1) {
                  break L1;
                } else {
                  if (this.field_h.length > param1) {
                    if (this.field_h[param1] != null) {
                      stackIn_9_0 = this.field_h[param1];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      this.field_a.field_n = param1 * 72 + 6;
                      var7 = 10 / ((-41 - param0) / 42);
                      var6_int = this.field_a.i(7553);
                      var8 = this.field_a.i(7553);
                      var14 = new byte[64];
                      this.field_a.a(var14, 0, (byte) 127, 64);
                      var10 = new le(param1, param2, param3, this.field_i, this.field_f, var6_int, var14, var8, param4);
                      this.field_h[param1] = var10;
                      stackIn_11_0 = (le) (var10);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("ne.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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

            if (param3 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static void e(int param0) {
        wj.q(114);
        if (param0 != -5) {
          field_c = (byte[]) null;
          vb.field_Z = true;
          tj.field_Vb = true;
          ah.field_c.c(true);
          wi.a(false, param0 ^ 49, ak.field_g);
          return;
        } else {
          vb.field_Z = true;
          tj.field_Vb = true;
          ah.field_c.c(true);
          wi.a(false, param0 ^ 49, ak.field_g);
          return;
        }
    }

    final static java.awt.Canvas d(int param0) {
        Object stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        if (param0 > -25) {
          L0: {
            ne.a((byte) 18);
            if (null == cl.field_v) {
              stackIn_8_0 = jh.field_b;
              break L0;
            } else {
              stackIn_8_0 = cl.field_v;
              break L0;
            }
          }
          return (java.awt.Canvas) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (null == cl.field_v) {
              stackIn_4_0 = jh.field_b;
              break L1;
            } else {
              stackIn_4_0 = cl.field_v;
              break L1;
            }
          }
          return (java.awt.Canvas) ((Object) stackIn_4_0);
        }
    }

    ne(dd param0, im param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static boolean b(int param0) {
        if (param0 != -18163) {
            return true;
        }
        if (!(jg.field_i)) {
            return false;
        }
        if (0 != pk.field_r) {
            return false;
        }
        return true;
    }

    final static int b(byte param0) {
        if (param0 != -40) {
            ne.b(-2);
            return pf.field_g;
        }
        return pf.field_g;
    }

    final void a(int param0) {
        int var2;
        int var3;
        le stackIn_41_0 = null;
        var3 = client.field_A ? 1 : 0;
        if (this.field_h == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            L1: {
              if (var2 >= this.field_h.length) {
                break L1;
              } else {
                stackIn_41_0 = this.field_h[var2];

                if (var3 != 0) {
                  L2: while (true) {
                    ((le) (Object) stackIn_41_0).c(true);
                    L3: while (true) {
                      var2++;
                      if (var3 == 0) {
                        if (var2 < this.field_h.length) {
                          if (var3 == 0) {
                            if (null != this.field_h[var2]) {
                              stackIn_41_0 = this.field_h[var2];
                              continue L2;
                            } else {
                              continue L3;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  L4: {
                    if (stackIn_41_0 != null) {
                      this.field_h[var2].b(16322);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var2++;
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var2 = 0;
            if (param0 <= -106) {
              L5: while (true) {
                if (var2 < this.field_h.length) {
                  if (var3 == 0) {
                    L6: {
                      if (null != this.field_h[var2]) {
                        this.field_h[var2].c(true);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2++;
                    if (var3 == 0) {
                      continue L5;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final static void c(int param0) {
        wc.field_n = false;
        wl.field_p = 0 == de.field_V.d((byte) -96) ? true : false;
        if (param0 == 27721) {
            return;
        }
        ne.a((byte) 94);
    }

    private ne(dd param0, im param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_f = param1;
            this.field_e = param2;
            this.field_g = param3;
            this.field_i = param0;
            if (!this.field_i.a(true)) {
              this.field_j = this.field_i.a(true, (byte) 0, true, 255, 255);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("ne.<init>(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
    }

    static {
        field_d = "Waiting for fonts";
        field_b = "Achieved";
    }
}
