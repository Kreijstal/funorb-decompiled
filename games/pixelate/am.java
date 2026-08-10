/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    private we field_d;
    static int[] field_i;
    private gm field_a;
    private java.math.BigInteger field_f;
    private gg[] field_h;
    static boolean field_e;
    static int[] field_b;
    private java.math.BigInteger field_k;
    private rf field_j;
    private rj field_g;
    static int field_c;

    public static void a(byte param0) {
        field_i = null;
        field_b = null;
        if (param0 >= -120) {
            field_c = -67;
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            if (param0 != -7749) {
                field_b = (int[]) null;
            }
            param1.removeKeyListener(mc.field_r);
            param1.removeFocusListener(mc.field_r);
            ol.field_q = -1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "am.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(fm param0, boolean param1, fm param2) {
        pb.field_n = param0;
        if (!param1) {
            return;
        }
        try {
            kf.field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "am.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        int var2;
        ak stackIn_8_0 = null;
        ak stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ak stackIn_12_0 = null;
        ak stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ak stackIn_23_0 = null;
        ak stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        ak stackIn_27_0 = null;
        ak stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        L0: {
          hp.a(t.field_j + -640 >> 1394954977, t.field_d, 640 + t.field_j >> -417321759, (byte) -91, 0);
          if (-1 > (oo.field_b ^ -1)) {
            L1: {
              if (jo.field_j != null) {
                jo.field_j.f(ql.field_n.field_D, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                stackIn_8_0 = ql.field_n;

                if (!param1) {
                  break L3;
                } else {
                  stackIn_8_0 = (ak) ((Object) stackIn_8_0);

                  if (uj.field_Wb) {
                    break L3;
                  } else {
                    stackIn_9_0 = (ak) ((Object) stackIn_8_0);
                    stackIn_9_1 = 1;
                    break L2;
                  }
                }
              }
              stackIn_9_0 = (ak) ((Object) stackIn_8_0);
              stackIn_9_1 = 0;
              break L2;
            }
            L4: {
              L5: {
                ((ak) (Object) stackIn_9_0).a(stackIn_9_1 != 0, 0);
                stackIn_12_0 = ti.field_E;

                if (!param1) {
                  break L5;
                } else {
                  stackIn_12_0 = (ak) ((Object) stackIn_12_0);

                  if (uj.field_Wb) {
                    break L5;
                  } else {
                    stackIn_13_0 = (ak) ((Object) stackIn_12_0);
                    stackIn_13_1 = 1;
                    break L4;
                  }
                }
              }
              stackIn_13_0 = (ak) ((Object) stackIn_12_0);
              stackIn_13_1 = 0;
              break L4;
            }
            ((ak) (Object) stackIn_13_0).a(stackIn_13_1 != 0, 0);
            break L0;
          } else {
            break L0;
          }
        }
        L6: {
          L7: {
            if (-1 > (vn.field_g ^ -1)) {
              break L7;
            } else {
              if (h.field_W > 0) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (jo.field_j != null) {
              jo.field_j.f(ff.field_h.field_D, 0);
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            L10: {
              stackIn_23_0 = ff.field_h;

              if (!param1) {
                break L10;
              } else {
                stackIn_23_0 = (ak) ((Object) stackIn_23_0);

                if (bm.field_o) {
                  break L10;
                } else {
                  stackIn_24_0 = (ak) ((Object) stackIn_23_0);
                  stackIn_24_1 = 1;
                  break L9;
                }
              }
            }
            stackIn_24_0 = (ak) ((Object) stackIn_23_0);
            stackIn_24_1 = 0;
            break L9;
          }
          L11: {
            L12: {
              ((ak) (Object) stackIn_24_0).a(stackIn_24_1 != 0, 0);
              stackIn_27_0 = ai.field_A;

              if (!param1) {
                break L12;
              } else {
                stackIn_27_0 = (ak) ((Object) stackIn_27_0);

                if (bm.field_o) {
                  break L12;
                } else {
                  stackIn_28_0 = (ak) ((Object) stackIn_27_0);
                  stackIn_28_1 = 1;
                  break L11;
                }
              }
            }
            stackIn_28_0 = (ak) ((Object) stackIn_27_0);
            stackIn_28_1 = 0;
            break L11;
          }
          ((ak) (Object) stackIn_28_0).a(stackIn_28_1 != 0, 0);
          break L6;
        }
        var2 = 127 / ((param0 - -31) / 55);
        ia.a((byte) 92);
    }

    final static void b(int param0) {
        if (param0 < 10) {
            field_e = true;
        }
    }

    final gg a(boolean param0, int param1, int param2, rn param3, rn param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        gg var9 = null;
        byte[] var13 = null;
        gg stackIn_10_0 = null;
        gg stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_d == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (param2 < this.field_h.length) {
                    if (null != this.field_h[param2]) {
                      stackIn_10_0 = this.field_h[param2];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      this.field_d.field_m = param1 + 72 * param2;
                      var6_int = this.field_d.k(0);
                      var7 = this.field_d.k(param1 + -6);
                      var13 = new byte[64];
                      this.field_d.a(var13, 0, -86, 64);
                      var9 = new gg(param2, param4, param3, this.field_j, this.field_a, var6_int, var13, var7, param0);
                      this.field_h[param2] = var9;
                      stackIn_12_0 = (gg) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("am.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static String a(int param0) {
        if (!(rj.field_F != tm.field_X)) {
            return pm.field_s;
        }
        if (param0 != -13565) {
            field_i = (int[]) null;
        }
        return kd.field_a;
    }

    am(rf param0, gm param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        var3 = Pixelate.field_H ? 1 : 0;
        if (null == this.field_h) {
          return;
        } else {
          if (param0 == -2) {
            var2 = 0;
            L0: while (true) {
              if (var2 >= this.field_h.length) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (var4 >= this.field_h.length) {
                    return;
                  } else {
                    if (this.field_h[var4] != null) {
                      this.field_h[var4].b(0);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (null != this.field_h[var2]) {
                  this.field_h[var2].f((byte) 29);
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private am(rf param0, gm param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_k = param3;
              this.field_j = param0;
              this.field_a = param1;
              this.field_f = param2;
              if (this.field_j.a(20)) {
                break L1;
              } else {
                this.field_g = this.field_j.a((byte) -31, 255, true, 255, (byte) 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("am.<init>(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    final boolean c(int param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        we var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Pixelate.field_H ? 1 : 0;
        if (this.field_d != null) {
          return true;
        } else {
          L0: {
            if (this.field_g != null) {
              break L0;
            } else {
              if (this.field_j.a(param0 ^ 32047)) {
                return false;
              } else {
                this.field_g = this.field_j.a((byte) -31, 255, true, 255, (byte) 0);
                break L0;
              }
            }
          }
          if (this.field_g.field_v) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new we(this.field_g.h(0));
                var10.field_m = 5;
                var3 = var10.f(255);
                var10.field_m = var10.field_m + 72 * var3;
                var13 = new byte[var10.field_k.length - var10.field_m];
                var11 = var13;
                var4 = var11;
                var10.a(var4, 0, -79, var13.length);
                if (null == this.field_f) {
                  break L2;
                } else {
                  if (this.field_k == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_f, this.field_k);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (var5.length != 65) {
              throw new RuntimeException();
            } else {
              var15 = db.a(var10.field_k, 5, 1761872464, -var13.length + var10.field_m - 5);
              var7 = 0;
              L3: while (true) {
                if (-65 >= (var7 ^ -1)) {
                  if (param0 == 32059) {
                    this.field_d = var10;
                    this.field_h = new gg[var3];
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if (var15[var7] != var5[var7 + 1]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (param2 != 0) {
            break L0;
          } else {
            if (param0 != io.field_e) {
              io.field_e = param0;
              si.field_P = true;
              ro.a(param3, true);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if ((param2 ^ -1) == -2) {
            L2: {
              if (gh.field_v != param0) {
                si.field_P = true;
                gh.field_v = param0;
                ro.a(param3, true);
                break L2;
              } else {
                break L2;
              }
            }
            if (2 != param2) {
              break L1;
            } else {
              if (param0 == ib.field_e) {
                break L1;
              } else {
                si.field_P = true;
                ib.field_e = param0;
                ro.a(param3, true);
                break L1;
              }
            }
          } else {
            if (2 != param2) {
              break L1;
            } else {
              if (param0 == ib.field_e) {
                break L1;
              } else {
                si.field_P = true;
                ib.field_e = param0;
                ro.a(param3, true);
                break L1;
              }
            }
          }
        }
        L3: {
          if (param1 == -26931) {
            break L3;
          } else {
            am.a((byte) -107);
            break L3;
          }
        }
    }

    static {
        ol.e(2071);
        field_c = 50;
    }
}
