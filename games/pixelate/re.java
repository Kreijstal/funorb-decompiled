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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)(this.field_j + 1) + (float)param2 / 100.0f;
          var5 = 2 / ((-35 - param0) / 35);
          this.field_f = var4_float * (float)this.field_d / (float)(this.field_i - -1);
          if (-1 != (param2 ^ -1)) {
            this.field_e = param1.field_e + " - " + param2 + "%";
            return;
          } else {
            this.field_e = param1.field_c;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("re.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, oh param1) {
        try {
            kp.field_v = param1;
            if (!param0) {
                byte[] var3 = (byte[]) null;
                re.a(true, (byte[]) null);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "re.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static im a(String param0, int param1) {
        String var2 = null;
        im var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        im stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
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
                          stackIn_19_0 = (im) (var3);
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
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("re.A(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            qb.a(param1, 0, var3, 0, var2_int);
            if (param0) {
              stackIn_4_0 = (byte[]) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("re.G(").append(param0).append(',');

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
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var1 = mc.field_r;
          synchronized (var1) {
            L0: {
              L1: {
                qn.field_p = ln.field_p;
                ia.field_i = ia.field_i + 1;
                if (0 <= ol.field_q) {
                  L2: while (true) {
                    if (ol.field_q == wm.field_c) {
                      break L1;
                    } else {
                      var2 = qp.field_Q[wm.field_c];
                      wm.field_c = 127 & 1 + wm.field_c;
                      if (var2 >= 0) {
                        bc.field_m[var2] = true;
                        continue L2;
                      } else {
                        bc.field_m[var2 ^ -1] = false;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var2 = 0;
                  L3: while (true) {
                    if (-113 >= (var2 ^ -1)) {
                      ol.field_q = wm.field_c;
                      break L1;
                    } else {
                      bc.field_m[var2] = false;
                      var2++;
                      continue L3;
                    }
                  }
                }
              }
              var2 = 37 % ((param0 - -53) / 47);
              ln.field_p = jd.field_s;
              break L0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "re.I(" + param0 + ')');
        }
    }

    final boolean c(int param0) {
        ik var2;
        int var3;
        ik var4;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          if (param0 == 4567) {
            break L0;
          } else {
            this.field_f = 0.011294713243842125f;
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_i > this.field_j) {
            var4 = this.field_a[this.field_j];
            var2 = var4;
            if (var4.field_d.b(-3)) {
              L2: {
                if (0 > var4.field_b) {
                  break L2;
                } else {
                  if (var4.field_d.a(var4.field_b, false)) {
                    break L2;
                  } else {
                    this.a((byte) -96, var2, var4.field_d.a(var4.field_b, (byte) -78));
                    return false;
                  }
                }
              }
              L3: {
                if (var4.field_f == null) {
                  break L3;
                } else {
                  if (var4.field_d.a(var4.field_f, -1)) {
                    break L3;
                  } else {
                    this.a((byte) -93, var2, var4.field_d.c(108, var4.field_f));
                    return false;
                  }
                }
              }
              L4: {
                if (-1 >= (var4.field_b ^ -1)) {
                  break L4;
                } else {
                  if (null != var4.field_f) {
                    break L4;
                  } else {
                    if (var4.field_e == null) {
                      break L4;
                    } else {
                      if (var4.field_d.a((byte) 92)) {
                        break L4;
                      } else {
                        this.a((byte) -102, var2, var4.field_d.c(param0 ^ 4567));
                        return false;
                      }
                    }
                  }
                }
              }
              this.field_j = this.field_j + 1;
              continue L1;
            } else {
              this.a((byte) 58, var4, 0);
              return false;
            }
          } else {
            return true;
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
