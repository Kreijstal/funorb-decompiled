/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    private int field_i;
    static String field_a;
    private int field_b;
    static String field_f;
    String field_d;
    float field_h;
    static String field_j;
    private int field_g;
    private ad[] field_e;
    static int field_c;

    final static qj a(byte param0) {
        if (qc.field_g != tl.field_h) {
          if (param0 == -20) {
            if (kf.field_d != qc.field_g) {
              return null;
            } else {
              qc.field_g = tl.field_h;
              return tl.field_g;
            }
          } else {
            return null;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void b(int param0) {
        if (param0 <= 123) {
          field_f = null;
          field_j = null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_j = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    final static char a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        if (param0 >= 73) {
          var2 = 255 & param1;
          if (0 != var2) {
            if (var2 <= -129) {
              if (-161 <= var2) {
                return (char)var2;
              } else {
                L0: {
                  var3 = fe.field_a[-128 + var2];
                  if (var3 == 0) {
                    var3 = 63;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        } else {
          var4 = null;
          boolean discarded$1 = l.a(-18, (String) null, (String) null);
          var2 = 255 & param1;
          if (0 != var2) {
            if (var2 <= -129) {
              if (-161 <= var2) {
                return (char)var2;
              } else {
                L1: {
                  var3 = fe.field_a[-128 + var2];
                  if (var3 == 0) {
                    var3 = 63;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
          qj discarded$2 = l.a((byte) 0);
          lf.field_e = param3;
          he.field_C = param1;
          mf.field_c = param2;
          return;
        } else {
          lf.field_e = param3;
          he.field_C = param1;
          mf.field_c = param2;
          return;
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        int var2 = 0;
        var2 = 47 % ((param1 - -27) / 42);
        hf.a(false, (java.awt.Component) (Object) param0);
        gg.a((byte) -56, (java.awt.Component) (Object) param0);
        if (mj.field_i != null) {
          mj.field_i.a((java.awt.Component) (Object) param0, 23678);
          return;
        } else {
          return;
        }
    }

    final boolean a(boolean param0) {
        ad var2 = null;
        int var3 = 0;
        ad var4 = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        L0: while (true) {
          if (((l) this).field_i <= ((l) this).field_b) {
            if (param0) {
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((l) this).field_e[((l) this).field_b];
            var2 = var4;
            if (!var4.field_g.b(-1)) {
              this.a(var4, (byte) 0, 0);
              return false;
            } else {
              L1: {
                if (0 > var4.field_a) {
                  break L1;
                } else {
                  if (!var4.field_g.c((byte) 103, var4.field_a)) {
                    this.a(var2, (byte) 0, var4.field_g.b((byte) -69, var4.field_a));
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (null == var4.field_f) {
                  break L2;
                } else {
                  if (!var4.field_g.b((byte) -128, var4.field_f)) {
                    this.a(var2, (byte) 0, var4.field_g.a((byte) -52, var4.field_f));
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if ((var4.field_a ^ -1) <= -1) {
                  break L3;
                } else {
                  if (null != var4.field_f) {
                    break L3;
                  } else {
                    if (null == var4.field_c) {
                      break L3;
                    } else {
                      if (var4.field_g.c(7715)) {
                        break L3;
                      } else {
                        this.a(var2, (byte) 0, var4.field_g.a(20147));
                        return false;
                      }
                    }
                  }
                }
              }
              ((l) this).field_b = ((l) this).field_b + 1;
              continue L0;
            }
          }
        }
    }

    private final void a(ad param0, byte param1, int param2) {
        float var4 = 0.0f;
        if (param1 == 0) {
          var4 = (float)param2 / 100.0f + (float)(1 + ((l) this).field_b);
          if (-1 == (param2 ^ -1)) {
            ((l) this).field_d = param0.field_d;
            ((l) this).field_h = (float)((l) this).field_g * var4 / (float)(((l) this).field_i - -1);
            return;
          } else {
            ((l) this).field_d = param0.field_c + " - " + param2 + "%";
            ((l) this).field_h = (float)((l) this).field_g * var4 / (float)(((l) this).field_i - -1);
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -1) {
          L0: {
            if (mb.field_b != null) {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            } else {
              if (!we.field_B) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param2 = th.a(param2, 119, '_', "");
        if (param0 > 113) {
          var3 = qc.a(param2, 1);
          if ((param1.indexOf(param2) ^ -1) == 0) {
            if ((param1.indexOf(var3) ^ -1) != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          l.a(-42, 28, 113, 9);
          var3 = qc.a(param2, 1);
          if ((param1.indexOf(param2) ^ -1) != 0) {
            return true;
          } else {
            L0: {
              if ((param1.indexOf(var3) ^ -1) == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    private l() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Play free version";
        field_j = "Sound: ";
    }
}
