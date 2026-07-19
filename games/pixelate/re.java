/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    float field_f;
    static tf field_b;
    private int field_i;
    private int field_j;
    private int field_d;
    String field_e;
    static boolean field_h;
    private ik[] field_a;
    static String field_c;
    static String[] field_k;
    static String field_g;

    private final void a(byte param0, ik param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4_float = (float)(this.field_j + 1) + (float)param2 / 100.0f;
              var5 = 2 / ((-35 - param0) / 35);
              this.field_f = var4_float * (float)this.field_d / (float)(this.field_i - -1);
              if (-1 != (param2 ^ -1)) {
                this.field_e = param1.field_e + " - " + param2 + "%";
                break L1;
              } else {
                this.field_e = param1.field_c;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("re.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, oh param1) {
        byte[] discarded$2 = null;
        RuntimeException runtimeException = null;
        byte[] var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              kp.field_v = param1;
              if (param0) {
                break L1;
              } else {
                var3 = (byte[]) null;
                discarded$2 = re.a(true, (byte[]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("re.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static im a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        im var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        im stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        im stackOut_18_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (vm.field_b != null) {
              if (param0 != null) {
                if (param0.length() != 0) {
                  L1: {
                    if (param1 == -1) {
                      break L1;
                    } else {
                      re.a(true);
                      break L1;
                    }
                  }
                  var6 = (CharSequence) ((Object) param0);
                  var2 = dh.a(var6, (byte) 64);
                  if (var2 != null) {
                    var3 = (im) ((Object) vm.field_b.a(-11434, (long)var2.hashCode()));
                    L2: while (true) {
                      if (var3 != null) {
                        var7 = (CharSequence) ((Object) var3.field_Fb);
                        var4 = dh.a(var7, (byte) 41);
                        if (var4.equals(var2)) {
                          stackOut_18_0 = (im) (var3);
                          stackIn_19_0 = stackOut_18_0;
                          break L0;
                        } else {
                          var3 = (im) ((Object) vm.field_b.b((byte) 47));
                          continue L2;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2_ref);
            stackOut_22_1 = new StringBuilder().append("re.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_19_0;
    }

    final static boolean a(int param0) {
        if (param0 > 105) {
          if (10 <= el.field_b) {
            if ((hf.field_q ^ -1) > -14) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          re.a(true);
          if (10 <= el.field_b) {
            if ((hf.field_q ^ -1) > -14) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void b(int param0) {
        fa.field_b = null;
        if (param0 != 140) {
            return;
        }
        e.field_b = null;
        wo.field_f = (byte[][]) null;
        ge.field_c = null;
        gf.field_g = null;
        fl.field_g = null;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
          re.a((byte) -52);
          field_c = null;
          field_k = null;
          field_g = null;
          return;
        } else {
          field_c = null;
          field_k = null;
          field_g = null;
          return;
        }
    }

    final static byte[] a(boolean param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            qb.a(param1, 0, var3, 0, var2_int);
            if (param0) {
              stackOut_3_0 = (byte[]) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("re.G(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1 = mc.field_r;
            synchronized (var1) {
              L1: {
                L2: {
                  qn.field_p = ln.field_p;
                  ia.field_i = ia.field_i + 1;
                  if (0 <= ol.field_q) {
                    L3: while (true) {
                      if (ol.field_q == wm.field_c) {
                        break L2;
                      } else {
                        var2 = qp.field_Q[wm.field_c];
                        wm.field_c = 127 & 1 + wm.field_c;
                        if (var2 >= 0) {
                          bc.field_m[var2] = true;
                          continue L3;
                        } else {
                          bc.field_m[var2 ^ -1] = false;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (-113 >= (var2 ^ -1)) {
                        ol.field_q = wm.field_c;
                        break L2;
                      } else {
                        bc.field_m[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                var2 = 37 % ((param0 - -53) / 47);
                ln.field_p = jd.field_s;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "re.I(" + param0 + ')');
        }
    }

    final boolean c(int param0) {
        ik var2 = null;
        int var3 = 0;
        ik var4 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != 4567) {
          this.field_f = 0.011294713243842125f;
          L0: while (true) {
            if (this.field_i > this.field_j) {
              var4 = this.field_a[this.field_j];
              var2 = var4;
              if (var4.field_d.b(-3)) {
                L1: {
                  if (0 > var4.field_b) {
                    break L1;
                  } else {
                    if (var4.field_d.a(var4.field_b, false)) {
                      break L1;
                    } else {
                      this.a((byte) -96, var2, var4.field_d.a(var4.field_b, (byte) -78));
                      return false;
                    }
                  }
                }
                L2: {
                  if (var4.field_f == null) {
                    break L2;
                  } else {
                    if (var4.field_d.a(var4.field_f, -1)) {
                      break L2;
                    } else {
                      this.a((byte) -93, var2, var4.field_d.c(108, var4.field_f));
                      return false;
                    }
                  }
                }
                L3: {
                  if (-1 >= (var4.field_b ^ -1)) {
                    break L3;
                  } else {
                    if (null != var4.field_f) {
                      break L3;
                    } else {
                      if (var4.field_e == null) {
                        break L3;
                      } else {
                        if (var4.field_d.a((byte) 92)) {
                          break L3;
                        } else {
                          this.a((byte) -102, var2, var4.field_d.c(param0 ^ 4567));
                          return false;
                        }
                      }
                    }
                  }
                }
                this.field_j = this.field_j + 1;
                continue L0;
              } else {
                this.a((byte) 58, var4, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (this.field_i > this.field_j) {
              var4 = this.field_a[this.field_j];
              var2 = var4;
              if (var4.field_d.b(-3)) {
                L5: {
                  if (0 > var4.field_b) {
                    break L5;
                  } else {
                    if (var4.field_d.a(var4.field_b, false)) {
                      break L5;
                    } else {
                      this.a((byte) -96, var2, var4.field_d.a(var4.field_b, (byte) -78));
                      return false;
                    }
                  }
                }
                L6: {
                  if (var4.field_f == null) {
                    break L6;
                  } else {
                    if (var4.field_d.a(var4.field_f, -1)) {
                      break L6;
                    } else {
                      this.a((byte) -93, var2, var4.field_d.c(108, var4.field_f));
                      return false;
                    }
                  }
                }
                L7: {
                  if (-1 >= (var4.field_b ^ -1)) {
                    break L7;
                  } else {
                    if (null != var4.field_f) {
                      break L7;
                    } else {
                      if (var4.field_e == null) {
                        break L7;
                      } else {
                        if (var4.field_d.a((byte) 92)) {
                          break L7;
                        } else {
                          this.a((byte) -102, var2, var4.field_d.c(param0 ^ 4567));
                          return false;
                        }
                      }
                    }
                  }
                }
                this.field_j = this.field_j + 1;
                continue L4;
              } else {
                this.a((byte) 58, var4, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    private re() throws Throwable {
        throw new Error();
    }

    static {
        field_h = false;
        field_b = new tf(540, 140);
        field_c = "New Game";
        field_g = "Offline";
        field_k = new String[]{"All scores", "My scores", "Best each"};
    }
}
