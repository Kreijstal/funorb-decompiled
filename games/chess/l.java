/*
 * Decompiled by CFR-JS 0.4.0.
 */
class l extends o {
    l field_p;
    static int field_o;
    static int[] field_n;
    l field_m;
    static String field_k;
    static ci field_j;
    long field_l;

    final long a(int param0) {
        if (param0 != 0) {
          return -20L;
        }
        return this.field_l;
    }

    final static dm a(boolean param0, String param1, byte param2, String param3, long param4) {
        RuntimeException var6 = null;
        sk stackIn_5_0 = null;
        ec stackIn_7_0 = null;
        ph stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == 0L &&
            param3 != null) {
            stackIn_7_0 = new ec(param3, param1);
            return (dm) ((Object) stackIn_7_0);
          }
          if (param0) {
            stackIn_5_0 = new sk(param4, param1);
            return (dm) ((Object) stackIn_5_0);
          }
          if (param2 <= 32) {
            l.a(true, -31, (byte) -69, false);
          }
          stackIn_11_0 = new ph(param4, param1);
          return (dm) ((Object) stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("l.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final void d(int param0) {
        if (null == this.field_m) {
          return;
        }
        this.field_m.field_p = this.field_p;
        this.field_p.field_m = this.field_m;
        this.field_m = null;
        if (param0 == -1) {
          this.field_p = null;
          return;
        }
    }

    final static void a(boolean param0, int param1, byte param2, boolean param3) {
        int var4;
        int var5;
        int stackIn_14_0 = 0;
        boolean stackIn_15_1 = false;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        boolean stackIn_27_1 = false;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        boolean stackIn_44_1 = false;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        boolean stackIn_63_1 = false;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        boolean stackIn_82_1 = false;
        int stackIn_95_0 = 0;
        int stackIn_99_0 = 0;
        boolean stackIn_100_1 = false;
        int stackIn_112_0 = 0;
        int stackIn_116_0 = 0;
        boolean stackIn_117_1 = false;
        var5 = Chess.field_G;
        if (param1 == -1) {
          ki.a(0, param3);
        } else {
          if (param1 == -2) {
            wb.b();
          } else {
            if (!param0) {
              if (0 > param1) {
                if (param1 == 3) {
                  if (hj.field_i) {
                    stackIn_77_0 = (!kn.field_L) ? 0 : 1;
                  } else {
                    stackIn_77_0 = 0;
                  }
                  var4 = stackIn_77_0;
                  stackIn_81_0 = -7093;
                  stackIn_82_1 = (param3) && (ak.a(true)) && (var4 == 0);
                  jb.a(stackIn_81_0, stackIn_82_1);
                }
              } else {
                if (ae.field_e.length <= param1) {
                  if (param1 == 3) {
                    if (hj.field_i) {
                      stackIn_95_0 = (!kn.field_L) ? 0 : 1;
                    } else {
                      stackIn_95_0 = 0;
                    }
                    var4 = stackIn_95_0;
                    stackIn_99_0 = -7093;
                    stackIn_100_1 = (param3) && (ak.a(true)) && (var4 == 0);
                    jb.a(stackIn_99_0, stackIn_100_1);
                  }
                } else {
                  ae.field_e[param1].d((byte) 59);
                  if (param1 == 3) {
                    if (hj.field_i) {
                      stackIn_112_0 = (!kn.field_L) ? 0 : 1;
                    } else {
                      stackIn_112_0 = 0;
                    }
                    var4 = stackIn_112_0;
                    stackIn_116_0 = -7093;
                    stackIn_117_1 = (param3) && (ak.a(true)) && (var4 == 0);
                    jb.a(stackIn_116_0, stackIn_117_1);
                  }
                }
              }
            } else {
              ki.a(0, false);
              wb.g(0, 0, 640, 480);
              if (0 > param1) {
                if (param1 == 3) {
                  if (!hj.field_i) {
                    var4 = 0;
                    stackIn_14_0 = -7093;
                    stackIn_15_1 = (param3) && (ak.a(true)) && (var4 == 0);
                    jb.a(stackIn_14_0, stackIn_15_1);
                  } else {
                    stackIn_22_0 = (!kn.field_L) ? 0 : 1;
                    var4 = stackIn_22_0;
                    stackIn_26_0 = -7093;
                    stackIn_27_1 = (param3) && (ak.a(true)) && (var4 == 0);
                    jb.a(stackIn_26_0, stackIn_27_1);
                  }
                }
              } else {
                if (ae.field_e.length <= param1) {
                  if (param1 != 3) {
                    if (param2 == -86) {
                      return;
                    }
                    l.a(true, -111, (byte) 19, true);
                    return;
                  }
                  if (hj.field_i) {
                    stackIn_39_0 = (kn.field_L) ? 1 : 0;
                  } else {
                    stackIn_39_0 = 0;
                  }
                  var4 = stackIn_39_0;
                  stackIn_43_0 = -7093;
                  stackIn_44_1 = (param3) && (ak.a(true)) && (var4 == 0);
                  jb.a(stackIn_43_0, stackIn_44_1);
                  if (param2 != -86) {
                    l.a(true, -111, (byte) 19, true);
                  }
                  return;
                }
                ae.field_e[param1].d((byte) 59);
                if (param1 == 3) {
                  if (hj.field_i) {
                    stackIn_58_0 = (!kn.field_L) ? 0 : 1;
                  } else {
                    stackIn_58_0 = 0;
                  }
                  var4 = stackIn_58_0;
                  stackIn_62_0 = -7093;
                  stackIn_63_1 = (param3) && (ak.a(true)) && (var4 == 0);
                  jb.a(stackIn_62_0, stackIn_63_1);
                }
              }
            }
          }
        }
        if (param2 == -86) {
          return;
        }
        l.a(true, -111, (byte) 19, true);
    }

    final void a(long param0, byte param1) {
        if (null != this.field_m) {
          throw new RuntimeException();
        }
        this.field_l = param0;
        if (param1 == 71) {
          return;
        }
        this.field_l = -17L;
    }

    public static void c(byte param0) {
        field_n = null;
        field_j = null;
        if (param0 > -24) {
          l.c((byte) 50);
          field_k = null;
          return;
        }
        field_k = null;
    }

    final boolean e(int param0) {
        if (this.field_m == null) {
          return false;
        }
        if (param0 != -4) {
          return false;
        }
        return true;
    }

    protected l() {
    }

    static {
        field_n = new int[8192];
        field_k = "White in check";
    }
}
