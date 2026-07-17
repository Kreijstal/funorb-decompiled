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
              var4_float = (float)(((re) this).field_j + 1) + (float)param2 / 100.0f;
              var5 = 2 / ((-35 - param0) / 35);
              ((re) this).field_f = var4_float * (float)((re) this).field_d / (float)(((re) this).field_i - -1);
              if (param2 != 0) {
                ((re) this).field_e = param1.field_e + " - " + param2 + "%";
                break L1;
              } else {
                ((re) this).field_e = param1.field_c;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("re.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
    }

    final static void a(boolean param0, oh param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            kp.field_v = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("re.C(").append(1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    final static im a(String param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        im var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        im stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        im stackOut_16_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          if (vm.field_b != null) {
            if (param0 != null) {
              if (param0.length() != 0) {
                var6 = (CharSequence) (Object) param0;
                var2 = dh.a(var6, (byte) 64);
                if (var2 != null) {
                  var3 = (im) (Object) vm.field_b.a(-11434, (long)var2.hashCode());
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_Fb;
                      var4 = dh.a(var7, (byte) 41);
                      if (var4.equals((Object) (Object) var2)) {
                        stackOut_16_0 = (im) var3;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        var3 = (im) (Object) vm.field_b.b((byte) 47);
                        continue L0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2_ref;
            stackOut_20_1 = new StringBuilder().append("re.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L1;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + -1 + 41);
        }
    }

    final static boolean a(int param0) {
        if (param0 > 105) {
          if (10 <= el.field_b) {
            if (hf.field_q < 13) {
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
            if (hf.field_q < 13) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void b() {
        fa.field_b = null;
        e.field_b = null;
        wo.field_f = null;
        ge.field_c = null;
        gf.field_g = null;
        fl.field_g = null;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_c = null;
        field_k = null;
        field_g = null;
    }

    final static byte[] a(boolean param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var2_int = param1.length;
          var3 = new byte[var2_int];
          qb.a(param1, 0, var3, 0, var2_int);
          return var3;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("re.G(").append(1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    final static void a() {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1 = (Object) (Object) mc.field_r;
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
                          bc.field_m[~var2] = false;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 112) {
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
                var2 = 1;
                ln.field_p = jd.field_s;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1_ref, "re.I(" + 85 + 41);
        }
    }

    final boolean c(int param0) {
        ik var2 = null;
        int var3 = 0;
        ik var4 = null;
        ik var5 = null;
        ik var6 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != 4567) {
          ((re) this).field_f = 0.011294713243842125f;
          L0: while (true) {
            if (((re) this).field_i > ((re) this).field_j) {
              var6 = ((re) this).field_a[((re) this).field_j];
              var4 = var6;
              var2 = var4;
              if (var6.field_d.b(-3)) {
                L1: {
                  if (0 > var6.field_b) {
                    break L1;
                  } else {
                    if (var6.field_d.a(var6.field_b, false)) {
                      break L1;
                    } else {
                      this.a((byte) -96, var2, var6.field_d.a(var6.field_b, (byte) -78));
                      return false;
                    }
                  }
                }
                L2: {
                  if (var6.field_f == null) {
                    break L2;
                  } else {
                    if (var6.field_d.a(var6.field_f, -1)) {
                      break L2;
                    } else {
                      this.a((byte) -93, var2, var6.field_d.c(108, var6.field_f));
                      return false;
                    }
                  }
                }
                L3: {
                  if (var6.field_b >= 0) {
                    break L3;
                  } else {
                    if (null != var6.field_f) {
                      break L3;
                    } else {
                      if (var6.field_e == null) {
                        break L3;
                      } else {
                        if (var6.field_d.a((byte) 92)) {
                          break L3;
                        } else {
                          this.a((byte) -102, var2, var6.field_d.c(param0 ^ 4567));
                          return false;
                        }
                      }
                    }
                  }
                }
                ((re) this).field_j = ((re) this).field_j + 1;
                continue L0;
              } else {
                this.a((byte) 58, var6, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((re) this).field_i > ((re) this).field_j) {
              var5 = ((re) this).field_a[((re) this).field_j];
              var4 = var5;
              var2 = var4;
              if (var5.field_d.b(-3)) {
                L5: {
                  if (0 > var5.field_b) {
                    break L5;
                  } else {
                    if (var5.field_d.a(var5.field_b, false)) {
                      break L5;
                    } else {
                      this.a((byte) -96, var2, var5.field_d.a(var5.field_b, (byte) -78));
                      return false;
                    }
                  }
                }
                L6: {
                  if (var5.field_f == null) {
                    break L6;
                  } else {
                    if (var5.field_d.a(var5.field_f, -1)) {
                      break L6;
                    } else {
                      this.a((byte) -93, var2, var5.field_d.c(108, var5.field_f));
                      return false;
                    }
                  }
                }
                L7: {
                  if (var5.field_b >= 0) {
                    break L7;
                  } else {
                    if (null != var5.field_f) {
                      break L7;
                    } else {
                      if (var5.field_e == null) {
                        break L7;
                      } else {
                        if (var5.field_d.a((byte) 92)) {
                          break L7;
                        } else {
                          this.a((byte) -102, var2, var5.field_d.c(param0 ^ 4567));
                          return false;
                        }
                      }
                    }
                  }
                }
                ((re) this).field_j = ((re) this).field_j + 1;
                continue L4;
              } else {
                this.a((byte) 58, var5, 0);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
        field_b = new tf(540, 140);
        field_c = "New Game";
        field_g = "Offline";
        field_k = new String[]{"All scores", "My scores", "Best each"};
    }
}
