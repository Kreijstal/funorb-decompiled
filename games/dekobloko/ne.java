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
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        wl var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var15 = null;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_23_0 = 0;
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
                    stackOut_23_0 = var15[var7] ^ -1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_24_0 = stackOut_23_0;
                    if (var8 == 0) {
                      if (stackIn_25_0 == (var5[var7 - -1] ^ -1)) {
                        var7++;
                        continue L4;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      return stackIn_24_0 != 0;
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
        le stackOut_8_0 = null;
        le stackOut_10_0 = null;
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
            if (this.field_a != null) {
              L1: {
                if (0 > param1) {
                  break L1;
                } else {
                  if (this.field_h.length > param1) {
                    if (this.field_h[param1] != null) {
                      stackOut_8_0 = this.field_h[param1];
                      stackIn_9_0 = stackOut_8_0;
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
                      stackOut_10_0 = (le) (var10);
                      stackIn_11_0 = stackOut_10_0;
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
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("ne.B(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
            if (param3 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ')');
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
        java.awt.Canvas stackOut_7_0 = null;
        ql stackOut_6_0 = null;
        java.awt.Canvas stackOut_3_0 = null;
        ql stackOut_2_0 = null;
        if (param0 > -25) {
          L0: {
            ne.a((byte) 18);
            if (null == cl.field_v) {
              stackOut_7_0 = jh.field_b;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = cl.field_v;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return (java.awt.Canvas) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (null == cl.field_v) {
              stackOut_3_0 = jh.field_b;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = cl.field_v;
              stackIn_4_0 = stackOut_2_0;
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
        boolean discarded$0 = false;
        if (param0 != -40) {
            discarded$0 = ne.b(-2);
            return pf.field_g;
        }
        return pf.field_g;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        le stackIn_6_0 = null;
        le stackIn_7_0 = null;
        le stackOut_5_0 = null;
        var3 = client.field_A ? 1 : 0;
        if (this.field_h == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_h.length) {
              var2 = 0;
              if (param0 <= -106) {
                L1: while (true) {
                  if (var2 < this.field_h.length) {
                    if (var3 == 0) {
                      L2: {
                        if (null != this.field_h[var2]) {
                          this.field_h[var2].c(true);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var2++;
                      continue L1;
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
            } else {
              stackOut_5_0 = this.field_h[var2];
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var3 == 0) {
                L3: {
                  if (stackIn_7_0 != null) {
                    this.field_h[var2].b(16322);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var2++;
                continue L0;
              } else {
                ((le) (Object) stackIn_6_0).c(true);
                var2++;
                L4: while (true) {
                  if (var2 < this.field_h.length) {
                    if (var3 == 0) {
                      L5: {
                        if (null != this.field_h[var2]) {
                          this.field_h[var2].c(true);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var2++;
                      continue L4;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("ne.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    static {
        field_d = "Waiting for fonts";
        field_b = "Achieved";
    }
}
